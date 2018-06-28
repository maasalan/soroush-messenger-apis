package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1836f implements Creator<PlacePhotoMetadataResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        Status status = null;
        DataHolder dataHolder = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    status = (Status) dk.m4695a(parcel, readInt, Status.CREATOR);
                    break;
                case 2:
                    dataHolder = (DataHolder) dk.m4695a(parcel, readInt, DataHolder.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new PlacePhotoMetadataResult(status, dataHolder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlacePhotoMetadataResult[i];
    }
}
