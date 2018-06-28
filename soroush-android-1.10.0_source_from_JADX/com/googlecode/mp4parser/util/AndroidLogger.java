package com.googlecode.mp4parser.util;

import android.util.Log;

public class AndroidLogger extends Logger {
    private static final String TAG = "isoparser";
    String name;

    public AndroidLogger(String str) {
        this.name = str;
    }

    public void logDebug(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(this.name));
        stringBuilder.append(":");
        stringBuilder.append(str);
        Log.d(str2, stringBuilder.toString());
    }

    public void logError(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(this.name));
        stringBuilder.append(":");
        stringBuilder.append(str);
        Log.e(str2, stringBuilder.toString());
    }

    public void logWarn(String str) {
        String str2 = TAG;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(this.name));
        stringBuilder.append(":");
        stringBuilder.append(str);
        Log.w(str2, stringBuilder.toString());
    }
}
