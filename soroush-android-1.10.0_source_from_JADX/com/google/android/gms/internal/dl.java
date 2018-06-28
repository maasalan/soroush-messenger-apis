package com.google.android.gms.internal;

import android.os.Parcel;

public final class dl extends RuntimeException {
    public dl(String str, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        int dataSize = parcel.dataSize();
        StringBuilder stringBuilder = new StringBuilder(41 + String.valueOf(str).length());
        stringBuilder.append(str);
        stringBuilder.append(" Parcel: pos=");
        stringBuilder.append(dataPosition);
        stringBuilder.append(" size=");
        stringBuilder.append(dataSize);
        super(stringBuilder.toString());
    }
}
