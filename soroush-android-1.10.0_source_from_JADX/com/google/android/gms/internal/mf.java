package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class mf implements Creator<zzdxr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 3:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzdxr(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdxr[i];
    }
}
