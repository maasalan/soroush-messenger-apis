package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class dn implements Creator<zzbfe> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        zzbfg com_google_android_gms_internal_zzbfg = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    com_google_android_gms_internal_zzbfg = (zzbfg) dk.m4695a(parcel, readInt, zzbfg.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbfe(i, com_google_android_gms_internal_zzbfg);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfe[i];
    }
}
