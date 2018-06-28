package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1849l implements Creator<zzao> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        int i2 = i;
        int i3 = i2;
        int i4 = i3;
        int i5 = i4;
        int i6 = i5;
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    i2 = dk.m4703e(parcel, readInt);
                    break;
                case 3:
                    i3 = dk.m4703e(parcel, readInt);
                    break;
                case 4:
                    i4 = dk.m4703e(parcel, readInt);
                    break;
                case 5:
                    i5 = dk.m4703e(parcel, readInt);
                    break;
                case 6:
                    i6 = dk.m4703e(parcel, readInt);
                    break;
                case 7:
                    list = dk.m4700c(parcel, readInt, zzan.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzao(i, i2, i3, i4, i5, i6, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzao[i];
    }
}
