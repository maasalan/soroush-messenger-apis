package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;

public class zza implements Parcelable {
    public static final Creator<zza> CREATOR = new C2098a();
    private static final Map<String, zza> f7068c = new HashMap();
    long f7069a;
    private final String f7070b;

    private zza(Parcel parcel) {
        this.f7070b = parcel.readString();
        this.f7069a = parcel.readLong();
    }

    public zza(String str) {
        this.f7070b = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7070b);
        parcel.writeLong(this.f7069a);
    }
}
