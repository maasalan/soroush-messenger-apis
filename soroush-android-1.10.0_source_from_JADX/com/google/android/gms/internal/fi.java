package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class fi implements Creator<zzcfx> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        zzcfu com_google_android_gms_internal_zzcfu = str;
        String str2 = com_google_android_gms_internal_zzcfu;
        long j = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 3:
                    com_google_android_gms_internal_zzcfu = (zzcfu) dk.m4695a(parcel, readInt, zzcfu.CREATOR);
                    break;
                case 4:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                case 5:
                    j = dk.m4704f(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzcfx(str, com_google_android_gms_internal_zzcfu, str2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfx[i];
    }
}
