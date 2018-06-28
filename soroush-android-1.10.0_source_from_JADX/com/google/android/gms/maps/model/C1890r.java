package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1890r implements Creator<PolylineOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        float f = 0.0f;
        float f2 = f;
        List list = null;
        Cap cap = list;
        Cap cap2 = cap;
        List list2 = cap2;
        int i = 0;
        boolean z = i;
        boolean z2 = z;
        boolean z3 = z2;
        int i2 = z3;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    list = dk.m4700c(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    f = dk.m4706h(parcel2, readInt);
                    break;
                case 4:
                    i = dk.m4703e(parcel2, readInt);
                    break;
                case 5:
                    f2 = dk.m4706h(parcel2, readInt);
                    break;
                case 6:
                    z = dk.m4701c(parcel2, readInt);
                    break;
                case 7:
                    z2 = dk.m4701c(parcel2, readInt);
                    break;
                case 8:
                    z3 = dk.m4701c(parcel2, readInt);
                    break;
                case 9:
                    cap = (Cap) dk.m4695a(parcel2, readInt, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) dk.m4695a(parcel2, readInt, Cap.CREATOR);
                    break;
                case 11:
                    i2 = dk.m4703e(parcel2, readInt);
                    break;
                case 12:
                    list2 = dk.m4700c(parcel2, readInt, PatternItem.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new PolylineOptions(list, f, i, f2, z, z2, z3, cap, cap2, i2, list2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
