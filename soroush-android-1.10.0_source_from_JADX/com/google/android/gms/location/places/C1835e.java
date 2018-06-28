package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1835e implements Creator<PlaceFilter> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        List list = null;
        boolean z = false;
        List list2 = null;
        List list3 = list2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt;
            if (i == 1) {
                list = dk.m4718t(parcel, readInt);
            } else if (i != 6) {
                switch (i) {
                    case 3:
                        z = dk.m4701c(parcel, readInt);
                        break;
                    case 4:
                        list3 = dk.m4700c(parcel, readInt, zzo.CREATOR);
                        break;
                    default:
                        dk.m4697b(parcel, readInt);
                        break;
                }
            } else {
                list2 = dk.m4719u(parcel, readInt);
            }
        }
        dk.m4722x(parcel, a);
        return new PlaceFilter(list, z, list2, list3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlaceFilter[i];
    }
}
