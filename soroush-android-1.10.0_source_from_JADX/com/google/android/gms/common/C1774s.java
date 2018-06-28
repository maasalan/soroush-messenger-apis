package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1774s implements Creator<zzm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        boolean z = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 2:
                    iBinder = dk.m4711m(parcel, readInt);
                    break;
                case 3:
                    z = dk.m4701c(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzm(str, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzm[i];
    }
}
