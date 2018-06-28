package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1881i implements Creator<CircleOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        float f = 0.0f;
        float f2 = f;
        LatLng latLng = null;
        List list = latLng;
        int i = 0;
        int i2 = i;
        boolean z = i2;
        boolean z2 = z;
        double d = 0.0d;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    latLng = (LatLng) dk.m4695a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    d = dk.m4708j(parcel2, readInt);
                    break;
                case 4:
                    f = dk.m4706h(parcel2, readInt);
                    break;
                case 5:
                    i = dk.m4703e(parcel2, readInt);
                    break;
                case 6:
                    i2 = dk.m4703e(parcel2, readInt);
                    break;
                case 7:
                    f2 = dk.m4706h(parcel2, readInt);
                    break;
                case 8:
                    z = dk.m4701c(parcel2, readInt);
                    break;
                case 9:
                    z2 = dk.m4701c(parcel2, readInt);
                    break;
                case 10:
                    list = dk.m4700c(parcel2, readInt, PatternItem.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new CircleOptions(latLng, d, f, i, i2, f2, z, z2, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}
