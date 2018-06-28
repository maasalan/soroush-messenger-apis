package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class em implements Creator<zzceu> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) != 1) {
                dk.m4697b(parcel, readInt);
            } else {
                str = dk.m4710l(parcel, readInt);
            }
        }
        dk.m4722x(parcel, a);
        return new zzceu(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzceu[i];
    }
}
