package com.google.android.gms.internal;

public enum at {
    NONE,
    GZIP;

    public static at m4580a(String str) {
        return "GZIP".equalsIgnoreCase(str) ? GZIP : NONE;
    }
}
