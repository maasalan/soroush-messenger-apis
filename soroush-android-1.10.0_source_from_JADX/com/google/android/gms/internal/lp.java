package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class lp implements Creator<zzcwe> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    i2 = dk.m4703e(parcel, readInt);
                    break;
                case 3:
                    intent = (Intent) dk.m4695a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzcwe(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcwe[i];
    }
}
