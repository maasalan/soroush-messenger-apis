package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1882j implements Creator<GroundOverlayOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        boolean z = false;
        boolean z2 = z;
        IBinder iBinder = null;
        LatLng latLng = iBinder;
        LatLngBounds latLngBounds = latLng;
        float f = 0.0f;
        float f2 = f;
        float f3 = f2;
        float f4 = f3;
        float f5 = f4;
        float f6 = f5;
        float f7 = f6;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    iBinder = dk.m4711m(parcel2, readInt);
                    break;
                case 3:
                    latLng = (LatLng) dk.m4695a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    f = dk.m4706h(parcel2, readInt);
                    break;
                case 5:
                    f2 = dk.m4706h(parcel2, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) dk.m4695a(parcel2, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = dk.m4706h(parcel2, readInt);
                    break;
                case 8:
                    f4 = dk.m4706h(parcel2, readInt);
                    break;
                case 9:
                    z = dk.m4701c(parcel2, readInt);
                    break;
                case 10:
                    f5 = dk.m4706h(parcel2, readInt);
                    break;
                case 11:
                    f6 = dk.m4706h(parcel2, readInt);
                    break;
                case 12:
                    f7 = dk.m4706h(parcel2, readInt);
                    break;
                case 13:
                    z2 = dk.m4701c(parcel2, readInt);
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
