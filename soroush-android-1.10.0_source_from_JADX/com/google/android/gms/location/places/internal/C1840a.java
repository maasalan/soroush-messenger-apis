package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1840a implements Creator<PlaceEntity> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        boolean z = false;
        int i = z;
        float f = 0.0f;
        float f2 = f;
        String str = null;
        List list = str;
        List list2 = list;
        Bundle bundle = list2;
        String str2 = bundle;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        List list3 = str5;
        LatLng latLng = list3;
        LatLngBounds latLngBounds = latLng;
        String str6 = latLngBounds;
        Uri uri = str6;
        zzak com_google_android_gms_location_places_internal_zzak = uri;
        zzam com_google_android_gms_location_places_internal_zzam = com_google_android_gms_location_places_internal_zzak;
        zzaf com_google_android_gms_location_places_internal_zzaf = com_google_android_gms_location_places_internal_zzam;
        String str7 = com_google_android_gms_location_places_internal_zzaf;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    str = dk.m4710l(parcel2, readInt);
                    break;
                case 2:
                    bundle = dk.m4712n(parcel2, readInt);
                    break;
                case 3:
                    com_google_android_gms_location_places_internal_zzak = (zzak) dk.m4695a(parcel2, readInt, zzak.CREATOR);
                    break;
                case 4:
                    latLng = (LatLng) dk.m4695a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    f = dk.m4706h(parcel2, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) dk.m4695a(parcel2, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    str6 = dk.m4710l(parcel2, readInt);
                    break;
                case 8:
                    uri = (Uri) dk.m4695a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 9:
                    z = dk.m4701c(parcel2, readInt);
                    break;
                case 10:
                    f2 = dk.m4706h(parcel2, readInt);
                    break;
                case 11:
                    i = dk.m4703e(parcel2, readInt);
                    break;
                case 13:
                    list2 = dk.m4718t(parcel2, readInt);
                    break;
                case 14:
                    str3 = dk.m4710l(parcel2, readInt);
                    break;
                case 15:
                    str4 = dk.m4710l(parcel2, readInt);
                    break;
                case 16:
                    str5 = dk.m4710l(parcel2, readInt);
                    break;
                case 17:
                    list3 = dk.m4719u(parcel2, readInt);
                    break;
                case 19:
                    str2 = dk.m4710l(parcel2, readInt);
                    break;
                case 20:
                    list = dk.m4718t(parcel2, readInt);
                    break;
                case 21:
                    com_google_android_gms_location_places_internal_zzam = (zzam) dk.m4695a(parcel2, readInt, zzam.CREATOR);
                    break;
                case 22:
                    com_google_android_gms_location_places_internal_zzaf = (zzaf) dk.m4695a(parcel2, readInt, zzaf.CREATOR);
                    break;
                case 23:
                    str7 = dk.m4710l(parcel2, readInt);
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new PlaceEntity(str, list, list2, bundle, str2, str3, str4, str5, list3, latLng, f, latLngBounds, str6, uri, z, f2, i, com_google_android_gms_location_places_internal_zzak, com_google_android_gms_location_places_internal_zzam, com_google_android_gms_location_places_internal_zzaf, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlaceEntity[i];
    }
}
