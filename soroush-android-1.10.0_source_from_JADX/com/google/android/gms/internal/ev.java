package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class ev implements Creator<zzcfi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        int i = 0;
        boolean z = i;
        long j = 0;
        long j2 = j;
        long j3 = j2;
        String str = null;
        String str2 = str;
        zzckk com_google_android_gms_internal_zzckk = str2;
        String str3 = com_google_android_gms_internal_zzckk;
        zzcfx com_google_android_gms_internal_zzcfx = str3;
        zzcfx com_google_android_gms_internal_zzcfx2 = com_google_android_gms_internal_zzcfx;
        zzcfx com_google_android_gms_internal_zzcfx3 = com_google_android_gms_internal_zzcfx2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel2, readInt);
                    break;
                case 2:
                    str = dk.m4710l(parcel2, readInt);
                    break;
                case 3:
                    str2 = dk.m4710l(parcel2, readInt);
                    break;
                case 4:
                    com_google_android_gms_internal_zzckk = (zzckk) dk.m4695a(parcel2, readInt, zzckk.CREATOR);
                    break;
                case 5:
                    j = dk.m4704f(parcel2, readInt);
                    break;
                case 6:
                    z = dk.m4701c(parcel2, readInt);
                    break;
                case 7:
                    str3 = dk.m4710l(parcel2, readInt);
                    break;
                case 8:
                    com_google_android_gms_internal_zzcfx = (zzcfx) dk.m4695a(parcel2, readInt, zzcfx.CREATOR);
                    break;
                case 9:
                    j2 = dk.m4704f(parcel2, readInt);
                    break;
                case 10:
                    com_google_android_gms_internal_zzcfx2 = (zzcfx) dk.m4695a(parcel2, readInt, zzcfx.CREATOR);
                    break;
                case 11:
                    j3 = dk.m4704f(parcel2, readInt);
                    break;
                case 12:
                    com_google_android_gms_internal_zzcfx3 = (zzcfx) dk.m4695a(parcel2, readInt, zzcfx.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new zzcfi(i, str, str2, com_google_android_gms_internal_zzckk, j, z, str3, com_google_android_gms_internal_zzcfx, j2, com_google_android_gms_internal_zzcfx2, j3, com_google_android_gms_internal_zzcfx3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfi[i];
    }
}
