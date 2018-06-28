package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1888p implements Creator<PointOfInterest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = str;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    latLng = (LatLng) dk.m4695a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 4:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new PointOfInterest(latLng, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PointOfInterest[i];
    }
}
