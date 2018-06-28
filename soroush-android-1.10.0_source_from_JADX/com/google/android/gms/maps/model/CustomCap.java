package com.google.android.gms.maps.model;

public final class CustomCap extends Cap {
    public final C1873a f20412a;
    public final float f20413b;

    public final String toString() {
        String valueOf = String.valueOf(this.f20412a);
        float f = this.f20413b;
        StringBuilder stringBuilder = new StringBuilder(55 + String.valueOf(valueOf).length());
        stringBuilder.append("[CustomCap: bitmapDescriptor=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" refWidth=");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
