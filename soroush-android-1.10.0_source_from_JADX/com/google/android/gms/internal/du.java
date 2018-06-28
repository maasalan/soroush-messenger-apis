package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class du implements Creator<zzbfq> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        ArrayList arrayList = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    arrayList = dk.m4700c(parcel, readInt, zzbfr.CREATOR);
                    break;
                case 3:
                    str = dk.m4710l(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbfq(i, arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfq[i];
    }
}
