package com.google.android.gms.common.api;

public final class C1709b extends Exception {
    protected final Status f5216a;

    public C1709b(Status status) {
        int i = status.f17982g;
        String str = status.f17983h != null ? status.f17983h : "";
        StringBuilder stringBuilder = new StringBuilder(13 + String.valueOf(str).length());
        stringBuilder.append(i);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        super(stringBuilder.toString());
        this.f5216a = status;
    }
}
