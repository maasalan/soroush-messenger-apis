package com.google.android.gms.maps.model;

public final class Gap extends PatternItem {
    public final float f20415a;

    public final String toString() {
        float f = this.f20415a;
        StringBuilder stringBuilder = new StringBuilder(29);
        stringBuilder.append("[Gap: length=");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
