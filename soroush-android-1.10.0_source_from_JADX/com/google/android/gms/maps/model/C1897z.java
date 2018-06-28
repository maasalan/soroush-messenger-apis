package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1897z implements Creator<VisibleRegion> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        LatLng latLng = null;
        LatLng latLng2 = latLng;
        LatLng latLng3 = latLng2;
        LatLng latLng4 = latLng3;
        LatLngBounds latLngBounds = latLng4;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    latLng = (LatLng) dk.m4695a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    latLng2 = (LatLng) dk.m4695a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    latLng3 = (LatLng) dk.m4695a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    latLng4 = (LatLng) dk.m4695a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) dk.m4695a(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
