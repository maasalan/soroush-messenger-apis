package com.google.android.gms.maps.model;

public final class Dash extends PatternItem {
    public final float f20414a;

    public final String toString() {
        float f = this.f20414a;
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("[Dash: length=");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
