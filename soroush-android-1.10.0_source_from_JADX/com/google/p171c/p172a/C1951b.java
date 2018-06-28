package com.google.p171c.p172a;

enum C1951b {
    PRIVATE(':', ','),
    ICANN('!', '?');
    
    private final char f6502c;
    private final char f6503d;

    private C1951b(char c, char c2) {
        this.f6502c = c;
        this.f6503d = c2;
    }

    static C1951b m5367a(char c) {
        for (C1951b c1951b : C1951b.values()) {
            if (c1951b.f6502c == c || c1951b.f6503d == c) {
                return c1951b;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("No enum corresponding to given code: ");
        stringBuilder.append(c);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
