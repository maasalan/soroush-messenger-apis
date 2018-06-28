package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1842c implements Creator<zzah> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        PlaceEntity placeEntity = null;
        float f = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    placeEntity = (PlaceEntity) dk.m4695a(parcel, readInt, PlaceEntity.CREATOR);
                    break;
                case 2:
                    f = dk.m4706h(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzah(placeEntity, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzah[i];
    }
}
