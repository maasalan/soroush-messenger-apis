package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.concurrent.TimeUnit;

public class zzevc implements Parcelable {
    public static final Creator<zzevc> CREATOR = new nj();
    public long f6304a;
    private long f6305b;

    public zzevc() {
        this.f6304a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f6305b = System.nanoTime();
    }

    private zzevc(Parcel parcel) {
        this.f6304a = parcel.readLong();
        this.f6305b = parcel.readLong();
    }

    public final long m5168a(zzevc com_google_android_gms_internal_zzevc) {
        return TimeUnit.NANOSECONDS.toMicros(com_google_android_gms_internal_zzevc.f6305b - this.f6305b);
    }

    public final void m5169a() {
        this.f6304a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f6305b = System.nanoTime();
    }

    public final long m5170b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.f6305b);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6304a);
        parcel.writeLong(this.f6305b);
    }
}
