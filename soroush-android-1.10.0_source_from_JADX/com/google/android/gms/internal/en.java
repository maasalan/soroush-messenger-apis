package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class en implements Creator<zzcew> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        String str2 = null;
        List list = str2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt;
            if (i != 6) {
                switch (i) {
                    case 1:
                        str = dk.m4710l(parcel, readInt);
                        break;
                    case 2:
                        str2 = dk.m4710l(parcel, readInt);
                        break;
                    default:
                        dk.m4697b(parcel, readInt);
                        break;
                }
            }
            list = dk.m4700c(parcel, readInt, zzceu.CREATOR);
        }
        dk.m4722x(parcel, a);
        return new zzcew(str, str2, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcew[i];
    }
}
