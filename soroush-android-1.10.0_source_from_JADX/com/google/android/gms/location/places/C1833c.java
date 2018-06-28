package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1833c implements Creator<AddPlaceRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        LatLng latLng = str;
        String str2 = latLng;
        List list = str2;
        String str3 = list;
        Uri uri = str3;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 2:
                    latLng = (LatLng) dk.m4695a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                case 4:
                    list = dk.m4718t(parcel, readInt);
                    break;
                case 5:
                    str3 = dk.m4710l(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) dk.m4695a(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new AddPlaceRequest(str, latLng, str2, list, str3, uri);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AddPlaceRequest[i];
    }
}
