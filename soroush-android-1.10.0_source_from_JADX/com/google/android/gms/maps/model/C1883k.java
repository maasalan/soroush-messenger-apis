package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1883k implements Creator<LatLngBounds> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    latLng = (LatLng) dk.m4695a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    latLng2 = (LatLng) dk.m4695a(parcel, readInt, LatLng.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
