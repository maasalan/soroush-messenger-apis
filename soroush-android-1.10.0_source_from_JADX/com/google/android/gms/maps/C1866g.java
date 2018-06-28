package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1866g implements Creator<StreetViewPanoramaOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        byte b = (byte) 0;
        byte b2 = b;
        byte b3 = b2;
        byte b4 = b3;
        byte b5 = b4;
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = streetViewPanoramaCamera;
        LatLng latLng = str;
        Integer num = latLng;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) dk.m4695a(parcel, readInt, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 4:
                    latLng = (LatLng) dk.m4695a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    readInt = dk.m4694a(parcel, readInt);
                    if (readInt != 0) {
                        dk.m4696a(parcel, readInt, 4);
                        num = Integer.valueOf(parcel.readInt());
                        break;
                    }
                    num = null;
                    break;
                case 6:
                    b = dk.m4702d(parcel, readInt);
                    break;
                case 7:
                    b2 = dk.m4702d(parcel, readInt);
                    break;
                case 8:
                    b3 = dk.m4702d(parcel, readInt);
                    break;
                case 9:
                    b4 = dk.m4702d(parcel, readInt);
                    break;
                case 10:
                    b5 = dk.m4702d(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
