package com.example.kalimbaapp.screen.songTraining.util

object Notes {
    const val C0 = 16.35f
    const val C1 = 32.7f
    const val C2 = 65.41f
    const val C3 = 130.81f
    const val C4 = 261.63f
    const val C5 = 523.25f
    const val C6 = 1046.5f
    const val C7 = 2093f
    const val C8 = 4186f
    const val C0_SHARP = 17.32f
    const val C1_SHARP = 34.65f
    const val C2_SHARP = 69.3f
    const val C3_SHARP = 138.59f
    const val C4_SHARP = 277.18f
    const val C5_SHARP = 554.37f
    const val C6_SHARP = 1108.73f
    const val C7_SHARP = 2217.46f
    const val C8_SHARP = 4434.92f
    const val D0 = 18.35f
    const val D1 = 36.71f
    const val D2 = 73.42f
    const val D3 = 146.83f
    const val D4 = 293.66f
    const val D5 = 587.33f
    const val D6 = 1174.66f
    const val D7 = 2349.32f
    const val D8 = 4698.63f
    const val D0_SHARP = 19.45f
    const val D1_SHARP = 38.89f
    const val D2_SHARP = 77.78f
    const val D3_SHARP = 155.56f
    const val D4_SHARP = 311.13f
    const val D5_SHARP = 622.25f
    const val D6_SHARP = 1244.51f
    const val D7_SHARP = 2489f
    const val D8_SHARP = 4978f
    const val E0 = 20.6f
    const val E1 = 41.2f
    const val E2 = 82.41f
    const val E3 = 164.81f
    const val E4 = 329.63f
    const val E5 = 659.25f
    const val E6 = 1318.51f
    const val E7 = 2637f
    const val E8 = 5274f
    const val F0 = 21.83f
    const val F1 = 43.65f
    const val F2 = 87.31f
    const val F3 = 174.61f
    const val F4 = 349.23f
    const val F5 = 698.46f
    const val F6 = 1396.91f
    const val F7 = 2793.83f
    const val F8 = 5587.65f
    const val F0_SHARP = 23.12f
    const val F1_SHARP = 46.25f
    const val F2_SHARP = 92.5f
    const val F3_SHARP = 185f
    const val F4_SHARP = 369.99f
    const val F5_SHARP = 739.99f
    const val F6_SHARP = 1479.98f
    const val F7_SHARP = 2959.96f
    const val F8_SHARP = 5919.91f
    const val G0 = 24.5f
    const val G1 = 49f
    const val G2 = 98f
    const val G3 = 196f
    const val G4 = 392f
    const val G5 = 783.99f
    const val G6 = 1567.98f
    const val G7 = 3135.96f
    const val G8 = 6271.93f
    const val G0_SHARP = 25.96f
    const val G1_SHARP = 51.91f
    const val G2_SHARP = 103.83f
    const val G3_SHARP = 207.65f
    const val G4_SHARP = 415.3f
    const val G5_SHARP = 830.61f
    const val G6_SHARP = 1661.22f
    const val G7_SHARP = 3322.44f
    const val G8_SHARP = 6644.88f
    const val A0 = 27.5f
    const val A1 = 55f
    const val A2 = 110f
    const val A3 = 220f
    const val A4 = 440f
    const val A5 = 880f
    const val A6 = 1760f
    const val A7 = 3520f
    const val A8 = 7040f
    const val A0_SHARP = 29.14f
    const val A1_SHARP = 58.27f
    const val A2_SHARP = 116.54f
    const val A3_SHARP = 233.08f
    const val A4_SHARP = 466.16f
    const val A5_SHARP = 932.33f
    const val A6_SHARP = 1864.66f
    const val A7_SHARP = 3729.31f
    const val A8_SHARP = 7458.62f
    const val B0 = 30.87f
    const val B1 = 61.74f
    const val B2 = 123.47f
    const val B3 = 246.94f
    const val B4 = 493.88f
    const val B5 = 987.77f
    const val B6 = 1975.53f
    const val B7 = 3951f
    const val B8 = 7902.13f
}

enum class Note(val noteName: String, val range: OpenEndRange<Float>) {

    NONE("NaN", 0f.rangeUntil(1f)),

    C0("C0", 16.35f.rangeUntil(17.32f)),

    C1("C1", 32.7f.rangeUntil(34.65f)),

    C2("C2", 65.41f.rangeUntil(69.3f)),

    C3("C3", 130.81f.rangeUntil(138.59f)),

    C4("C4", 261.63f.rangeUntil(277.18f)),

    C5("C5", 523.25f.rangeUntil(554.37f)),

    C6("C6", 1046.5f.rangeUntil(1108.73f)),

    C7("C7", 2093f.rangeUntil(2217.46f)),

    C8("C8", 4186f.rangeUntil(4434.92f)),

    C0_SHARP("C0#", 17.32f.rangeUntil(18.35f)),

    C1_SHARP("C1#", 34.65f.rangeUntil(36.71f)),

    C2_SHARP("C2#", 69.3f.rangeUntil(73.42f)),

    C3_SHARP("C3#", 138.59f.rangeUntil(146.83f)),

    C4_SHARP("C4#", 277.18f.rangeUntil(293.66f)),

    C5_SHARP("C5#", 554.37f.rangeUntil(587.33f)),

    C6_SHARP("C6#", 1108.73f.rangeUntil(1174.66f)),

    C7_SHARP("C7#", 2217.46f.rangeUntil(2349.32f)),

    C8_SHARP("C8#", 4434.92f.rangeUntil(4698.63f)),

    D0("D0", 18.35f.rangeUntil(19.45f)),

    D1("D1", 36.71f.rangeUntil(38.89f)),

    D2("D2", 73.42f.rangeUntil(77.78f)),

    D3("D3", 146.83f.rangeUntil(155.56f)),

    D4("D4", 293.66f.rangeUntil(311.13f)),

    D5("D5", 587.33f.rangeUntil(622.25f)),

    D6("D6", 1174.66f.rangeUntil(1244.51f)),

    D7("D7", 2349.32f.rangeUntil(2489f)),

    D8("D8", 4698.63f.rangeUntil(4978f)),

    D0_SHARP("D0#", 19.45f.rangeUntil(20.6f)),

    D1_SHARP("D1#", 38.89f.rangeUntil(41.2f)),

    D2_SHARP("D2#", 77.78f.rangeUntil(82.41f)),

    D3_SHARP("D3#", 155.56f.rangeUntil(164.81f)),

    D4_SHARP("D4#", 311.13f.rangeUntil(329.63f)),

    D5_SHARP("D5#", 622.25f.rangeUntil(659.25f)),

    D6_SHARP("D6#", 1244.51f.rangeUntil(1318.51f)),

    D7_SHARP("D7#", 2489f.rangeUntil(2637f)),

    D8_SHARP("D8#", 4978f.rangeUntil(5274f)),

    E0("E0", 20.6f.rangeUntil(21.83f)),

    E1("E1", 41.2f.rangeUntil(43.65f)),

    E2("E2", 82.41f.rangeUntil(87.31f)),

    E3("E3", 164.81f.rangeUntil(174.61f)),

    E4("E4", 329.63f.rangeUntil(349.23f)),

    E5("E5", 659.25f.rangeUntil(698.46f)),

    E6("E6", 1318.51f.rangeUntil(1396.91f)),

    E7("E7", 2637f.rangeUntil(2793.83f)),

    E8("E8", 5274f.rangeUntil(5587.65f)),

    F0("F0", 21.83f.rangeUntil(23.12f)),

    F1("F1", 43.65f.rangeUntil(46.25f)),

    F2("F2", 87.31f.rangeUntil(92.5f)),

    F3("F3", 174.61f.rangeUntil(185f)),

    F4("F4", 349.23f.rangeUntil(369.99f)),

    F5("F5", 698.46f.rangeUntil(739.99f)),

    F6("F6", 1396.91f.rangeUntil(1479.98f)),

    F7("F7", 2793.83f.rangeUntil(2959.96f)),

    F8("F8", 5587.65f.rangeUntil(5919.91f)),

    F0_SHARP("F0#", 23.12f.rangeUntil(24.5f)),

    F1_SHARP("F1#", 46.25f.rangeUntil(49f)),

    F2_SHARP("F2#", 92.5f.rangeUntil(98f)),

    F3_SHARP("F3#", 185f.rangeUntil(196f)),

    F4_SHARP("F4#", 369.99f.rangeUntil(392f)),

    F5_SHARP("F5#", 739.99f.rangeUntil(783.99f)),

    F6_SHARP("F6#", 1479.98f.rangeUntil(1567.98f)),

    F7_SHARP("F7#", 2959.96f.rangeUntil(3135.96f)),

    F8_SHARP("F8#", 5919.91f.rangeUntil(6271.93f)),

    G0("G0", 24.5f.rangeUntil(25.96f)),

    G1("G1", 49f.rangeUntil(51.91f)),

    G2("G2", 98f.rangeUntil(103.83f)),

    G3("G3", 196f.rangeUntil(207.65f)),

    G4("G4", 392f.rangeUntil(415.3f)),

    G5("G5", 783.99f.rangeUntil(830.61f)),

    G6("G6", 1567.98f.rangeUntil(1661.22f)),

    G7("G7", 3135.96f.rangeUntil(3322.44f)),

    G8("G8", 6271.93f.rangeUntil(6644.88f)),

    G0_SHARP("G0#", 25.96f.rangeUntil(27.5f)),

    G1_SHARP("G1#", 51.91f.rangeUntil(55f)),

    G2_SHARP("G2#", 103.83f.rangeUntil(110f)),

    G3_SHARP("G3#", 207.65f.rangeUntil(220f)),

    G4_SHARP("G4#", 415.3f.rangeUntil(440f)),

    G5_SHARP("G5#", 830.61f.rangeUntil(880f)),

    G6_SHARP("G6#", 1661.22f.rangeUntil(1760f)),

    G7_SHARP("G7#", 3322.44f.rangeUntil(3520f)),

    G8_SHARP("G8#", 6644.88f.rangeUntil(7040f)),

    A0("A0", 27.5f.rangeUntil(29.14f)),

    A1("A1", 55f.rangeUntil(58.27f)),

    A2("A2", 110f.rangeUntil(116.54f)),

    A3("A3", 220f.rangeUntil(233.08f)),

    A4("A4", 440f.rangeUntil(466.16f)),

    A5("A5", 880f.rangeUntil(932.33f)),

    A6("A6", 1760f.rangeUntil(1864.66f)),

    A7("A7", 3520f.rangeUntil(3729.31f)),

    A8("A8", 7040f.rangeUntil(7458.62f)),

    A0_SHARP("A0#", 29.14f.rangeUntil(30.87f)),

    A1_SHARP("A1#", 58.27f.rangeUntil(61.74f)),

    A2_SHARP("A2#", 116.54f.rangeUntil(123.47f)),

    A3_SHARP("A3#", 233.08f.rangeUntil(246.94f)),

    A4_SHARP("A4#", 466.16f.rangeUntil(493.88f)),

    A5_SHARP("A5#", 932.33f.rangeUntil(987.77f)),

    A6_SHARP("A6#", 1864.66f.rangeUntil(1975.53f)),

    A7_SHARP("A7#", 3729.31f.rangeUntil(3951f)),

    A8_SHARP("A8#", 7458.62f.rangeUntil(7902.13f)),

    B0("B0", 30.87f.rangeUntil(32.7f)),

    B1("B1", 61.74f.rangeUntil(65.41f)),

    B2("B2", 123.47f.rangeUntil(130.81f)),

    B3("B3", 246.94f.rangeUntil(261.63f)),

    B4("B4", 493.88f.rangeUntil(523.25f)),

    B5("B5", 987.77f.rangeUntil(1046.5f)),

    B6("B6", 1975.53f.rangeUntil(2093f)),

    B7("B7", 3951f.rangeUntil(4186f)),

    B8("B8", 7902.13f.rangeUntil(8400.00f));
}