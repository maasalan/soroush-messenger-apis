package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1893u implements Creator<StreetViewPanoramaLocation> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String str = latLng;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) dk.m4699b(parcel, readInt, StreetViewPanoramaLink.CREATOR);
                    break;
                case 3:
                    latLng = (LatLng) dk.m4695a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    str = dk.m4710l(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
