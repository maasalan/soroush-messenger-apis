package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class zzapm implements Parcelable {
    @Deprecated
    public static final Creator<zzapm> CREATOR = new as();
    String f6301a;
    String f6302b;
    private String f6303c;

    @Deprecated
    zzapm(Parcel parcel) {
        this.f6301a = parcel.readString();
        this.f6303c = parcel.readString();
        this.f6302b = parcel.readString();
    }

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6301a);
        parcel.writeString(this.f6303c);
        parcel.writeString(this.f6302b);
    }
}
