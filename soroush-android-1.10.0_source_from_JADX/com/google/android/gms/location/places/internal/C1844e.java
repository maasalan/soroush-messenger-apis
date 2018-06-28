package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1844e implements Creator<zzam> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        List list = null;
        List list2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    list = dk.m4700c(parcel, readInt, zzan.CREATOR);
                    break;
                case 2:
                    list2 = dk.m4700c(parcel, readInt, zzao.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzam(list, list2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzam[i];
    }
}
