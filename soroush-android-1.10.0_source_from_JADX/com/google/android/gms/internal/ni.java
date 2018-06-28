package com.google.android.gms.internal;

public enum ni {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");
    
    private String f6226g;

    private ni(String str) {
        this.f6226g = str;
    }

    public final String toString() {
        return this.f6226g;
    }
}
