package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class fn extends mn implements fl {
    fn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List<zzckk> mo1626a(zzcff com_google_android_gms_internal_zzcff, boolean z) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcff);
        mp.m5007a(f_, z);
        Parcel a = m5000a(7, f_);
        List createTypedArrayList = a.createTypedArrayList(zzckk.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<zzcfi> mo1627a(String str, String str2, zzcff com_google_android_gms_internal_zzcff) {
        Parcel f_ = f_();
        f_.writeString(str);
        f_.writeString(str2);
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcff);
        Parcel a = m5000a(16, f_);
        List createTypedArrayList = a.createTypedArrayList(zzcfi.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<zzcfi> mo1628a(String str, String str2, String str3) {
        Parcel f_ = f_();
        f_.writeString(str);
        f_.writeString(str2);
        f_.writeString(str3);
        Parcel a = m5000a(17, f_);
        List createTypedArrayList = a.createTypedArrayList(zzcfi.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<zzckk> mo1629a(String str, String str2, String str3, boolean z) {
        Parcel f_ = f_();
        f_.writeString(str);
        f_.writeString(str2);
        f_.writeString(str3);
        mp.m5007a(f_, z);
        Parcel a = m5000a(15, f_);
        List createTypedArrayList = a.createTypedArrayList(zzckk.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<zzckk> mo1630a(String str, String str2, boolean z, zzcff com_google_android_gms_internal_zzcff) {
        Parcel f_ = f_();
        f_.writeString(str);
        f_.writeString(str2);
        mp.m5007a(f_, z);
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcff);
        Parcel a = m5000a(14, f_);
        List createTypedArrayList = a.createTypedArrayList(zzckk.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final void mo1631a(long j, String str, String str2, String str3) {
        Parcel f_ = f_();
        f_.writeLong(j);
        f_.writeString(str);
        f_.writeString(str2);
        f_.writeString(str3);
        m5002b(10, f_);
    }

    public final void mo1632a(zzcff com_google_android_gms_internal_zzcff) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcff);
        m5002b(4, f_);
    }

    public final void mo1633a(zzcfi com_google_android_gms_internal_zzcfi) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcfi);
        m5002b(13, f_);
    }

    public final void mo1634a(zzcfi com_google_android_gms_internal_zzcfi, zzcff com_google_android_gms_internal_zzcff) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcfi);
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcff);
        m5002b(12, f_);
    }

    public final void mo1635a(zzcfx com_google_android_gms_internal_zzcfx, zzcff com_google_android_gms_internal_zzcff) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcfx);
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcff);
        m5002b(1, f_);
    }

    public final void mo1636a(zzcfx com_google_android_gms_internal_zzcfx, String str, String str2) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcfx);
        f_.writeString(str);
        f_.writeString(str2);
        m5002b(5, f_);
    }

    public final void mo1637a(zzckk com_google_android_gms_internal_zzckk, zzcff com_google_android_gms_internal_zzcff) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzckk);
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcff);
        m5002b(2, f_);
    }

    public final byte[] mo1638a(zzcfx com_google_android_gms_internal_zzcfx, String str) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcfx);
        f_.writeString(str);
        Parcel a = m5000a(9, f_);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    public final void mo1639b(zzcff com_google_android_gms_internal_zzcff) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcff);
        m5002b(6, f_);
    }

    public final String mo1640c(zzcff com_google_android_gms_internal_zzcff) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcff);
        Parcel a = m5000a(11, f_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void mo1641d(zzcff com_google_android_gms_internal_zzcff) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) com_google_android_gms_internal_zzcff);
        m5002b(18, f_);
    }
}
