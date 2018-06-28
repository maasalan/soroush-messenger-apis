package com.google.p173d.p193g.p194a;

public enum C2033h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    private final int[] f6834k;
    private final int f6835l;

    private C2033h(int[] iArr, int i) {
        this.f6834k = iArr;
        this.f6835l = i;
    }

    public static C2033h m5555a(int i) {
        switch (i) {
            case 0:
                return TERMINATOR;
            case 1:
                return NUMERIC;
            case 2:
                return ALPHANUMERIC;
            case 3:
                return STRUCTURED_APPEND;
            case 4:
                return BYTE;
            case 5:
                return FNC1_FIRST_POSITION;
            case 7:
                return ECI;
            case 8:
                return KANJI;
            case 9:
                return FNC1_SECOND_POSITION;
            case 13:
                return HANZI;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final int m5556a(C2037j c2037j) {
        int i = c2037j.f6843a;
        i = i <= 9 ? 0 : i <= 26 ? 1 : 2;
        return this.f6834k[i];
    }
}
