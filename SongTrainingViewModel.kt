package com.example.kalimbaapp.screen.songTraining

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import be.tarsos.dsp.filters.BandPass
import be.tarsos.dsp.io.android.AudioDispatcherFactory
import be.tarsos.dsp.pitch.PitchDetectionHandler
import be.tarsos.dsp.pitch.PitchProcessor
import com.example.kalimbaapp.screen.songTraining.util.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue

class SongTrainingViewModel : ViewModel() {

    companion object {
        private const val sampleRate = 44100
        private const val bufferSize = 2048
    }


    val allProcessedSamples = mutableStateListOf(250f)

    val allPlayedNotes = mutableStateListOf(200f)

    private val usableSamples = mutableListOf<Float>()

    private val samples = mutableListOf<Float>()

    val isPlaying = MutableSharedFlow<String>()

    val fakePlayedNote = mutableStateOf(NoteState())

    val playedNote = mutableStateOf(Note.NONE)

    private val playedNotes = mutableStateListOf<String>()

    private val dispatcher = getDispatcher()

    private val audioProcessing = viewModelScope.launch(Dispatchers.Default) { dispatcher.run() }

    val currentAverage = mutableStateOf(0f)

    fun startAudioProcessing() = audioProcessing.start()

    fun stopAudioProcessing() = audioProcessing.cancel()


    private fun isVeryDifferent(pitch: Float) {
        if (allPlayedNotes.size == 300) allPlayedNotes.removeFirst()
        playedNote.value = if (pitch != -1.0f) {
            val pitchDifference = (currentAverage.value - pitch).absoluteValue
            val playedNoteRangeSize = with(playedNote.value.range) { endExclusive - start }
            if (pitchDifference > playedNoteRangeSize) {
                currentAverage.value = pitch
            } else currentAverage.value = (currentAverage.value + pitch) / 2
            Note.entries.find { currentAverage.value in it.range } ?: Note.NONE
        } else Note.NONE
        if (playedNote.value != Note.NONE) allPlayedNotes.add(playedNote.value.range.start)
    }

    private fun getDispatcher() =
        AudioDispatcherFactory.fromDefaultMicrophone(sampleRate, bufferSize, 0).apply {

            fun getPitchHandler() = PitchDetectionHandler { pitchDetectionResult, _ ->
                with(pitchDetectionResult) {
                    fakePlayedNote.value = fakePlayedNote.value.copy(
                        pitch = if (pitch == -1f) 0f else pitch,
                        noteName = Note.entries.find { pitch in it.range }?.noteName ?: "NaN"
                    )

                    isVeryDifferent(pitch)

                    if (samples.size == 5) {
                        usableSamples.clear()
                        usableSamples.addAll(samples)
                        samples.clear()
                        viewModelScope.launch { isPlaying.emit(getNote()) }
                    }

                    if (pitch in 240f..1400f) {
                        println(pitch)
                        samples.add(pitch)
                    } else {
                        usableSamples.clear()
                        samples.clear()
                    }
                }
            }

            fun getPitchEstimator() = PitchProcessor(
                PitchProcessor.PitchEstimationAlgorithm.YIN,
                sampleRate.toFloat(),
                bufferSize,
                getPitchHandler()
            )

            fun getBandPass() = BandPass(800f, 600f, sampleRate.toFloat())

            addAudioProcessor(getBandPass())
            addAudioProcessor(getPitchEstimator())
        }

    private fun normalizeSample() = with(usableSamples) {
        if (isNotEmpty()) {
            fill(sorted().elementAt(size / 2))

            if (allProcessedSamples.size >= 290) allProcessedSamples.removeRange(0, 5)
            allProcessedSamples.addAll(this)
        }
    }

    private fun getNote(): String {
        normalizeSample()
        val noteName =
            Note.entries.find { usableSamples.average().toFloat() in it.range }?.noteName ?: ""
        playedNotes.add(noteName)
        return noteName
    }

}