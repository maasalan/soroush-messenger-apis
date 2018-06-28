package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1865f implements Creator<GoogleMapOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        CameraPosition cameraPosition = null;
        Float f = cameraPosition;
        Float f2 = f;
        LatLngBounds latLngBounds = f2;
        byte b = (byte) -1;
        byte b2 = b;
        byte b3 = b2;
        byte b4 = b3;
        byte b5 = b4;
        byte b6 = b5;
        byte b7 = b6;
        byte b8 = b7;
        byte b9 = b8;
        byte b10 = b9;
        byte b11 = b10;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    b = dk.m4702d(parcel2, readInt);
                    break;
                case 3:
                    b2 = dk.m4702d(parcel2, readInt);
                    break;
                case 4:
                    i = dk.m4703e(parcel2, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) dk.m4695a(parcel2, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = dk.m4702d(parcel2, readInt);
                    break;
                case 7:
                    b4 = dk.m4702d(parcel2, readInt);
                    break;
                case 8:
                    b5 = dk.m4702d(parcel2, readInt);
                    break;
                case 9:
                    b6 = dk.m4702d(parcel2, readInt);
                    break;
                case 10:
                    b7 = dk.m4702d(parcel2, readInt);
                    break;
                case 11:
                    b8 = dk.m4702d(parcel2, readInt);
                    break;
                case 12:
                    b9 = dk.m4702d(parcel2, readInt);
                    break;
                case 14:
                    b10 = dk.m4702d(parcel2, readInt);
                    break;
                case 15:
                    b11 = dk.m4702d(parcel2, readInt);
                    break;
                case 16:
                    f = dk.m4707i(parcel2, readInt);
                    break;
                case 17:
                    f2 = dk.m4707i(parcel2, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) dk.m4695a(parcel2, readInt, LatLngBounds.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
