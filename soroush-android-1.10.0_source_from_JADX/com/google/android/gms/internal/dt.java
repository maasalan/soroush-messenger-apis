package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class dt implements Creator<zzbfs> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        int i = 0;
        zzbfl com_google_android_gms_internal_zzbfl = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 3:
                    com_google_android_gms_internal_zzbfl = (zzbfl) dk.m4695a(parcel, readInt, zzbfl.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbfs(i, str, com_google_android_gms_internal_zzbfl);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfs[i];
    }
}
