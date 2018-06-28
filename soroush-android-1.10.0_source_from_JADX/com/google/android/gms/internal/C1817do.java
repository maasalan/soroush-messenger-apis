package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1817do implements Creator<zzbfg> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    arrayList = dk.m4700c(parcel, readInt, zzbfh.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbfg(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfg[i];
    }
}
