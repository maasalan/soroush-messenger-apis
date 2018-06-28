package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1889q implements Creator<PolygonOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        List arrayList = new ArrayList();
        List list = null;
        float f = 0.0f;
        List list2 = null;
        int i = 0;
        int i2 = i;
        boolean z = i2;
        boolean z2 = z;
        boolean z3 = z2;
        int i3 = z3;
        float f2 = f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    list = dk.m4700c(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    ClassLoader classLoader = getClass().getClassLoader();
                    readInt = dk.m4694a(parcel2, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (readInt == 0) {
                        break;
                    }
                    parcel2.readList(arrayList, classLoader);
                    parcel2.setDataPosition(dataPosition + readInt);
                    break;
                case 4:
                    f2 = dk.m4706h(parcel2, readInt);
                    break;
                case 5:
                    i = dk.m4703e(parcel2, readInt);
                    break;
                case 6:
                    i2 = dk.m4703e(parcel2, readInt);
                    break;
                case 7:
                    f = dk.m4706h(parcel2, readInt);
                    break;
                case 8:
                    z = dk.m4701c(parcel2, readInt);
                    break;
                case 9:
                    z2 = dk.m4701c(parcel2, readInt);
                    break;
                case 10:
                    z3 = dk.m4701c(parcel2, readInt);
                    break;
                case 11:
                    i3 = dk.m4703e(parcel2, readInt);
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
        return new PolygonOptions(list, arrayList, f2, i, i2, f, z, z2, z3, i3, list2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
