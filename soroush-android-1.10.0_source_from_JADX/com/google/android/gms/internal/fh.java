package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class fh implements Creator<zzcfu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) != 2) {
                dk.m4697b(parcel, readInt);
            } else {
                bundle = dk.m4712n(parcel, readInt);
            }
        }
        dk.m4722x(parcel, a);
        return new zzcfu(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfu[i];
    }
}
