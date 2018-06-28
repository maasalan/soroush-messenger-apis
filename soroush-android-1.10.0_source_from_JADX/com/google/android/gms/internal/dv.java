package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class dv implements Creator<zzbfr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        int i = 0;
        ArrayList arrayList = null;
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
                    arrayList = dk.m4700c(parcel, readInt, zzbfs.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbfr(i, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfr[i];
    }
}
