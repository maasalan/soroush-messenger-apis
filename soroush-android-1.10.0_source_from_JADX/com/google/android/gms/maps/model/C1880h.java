package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1880h implements Creator<Cap> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        IBinder iBinder = null;
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 3:
                    iBinder = dk.m4711m(parcel, readInt);
                    break;
                case 4:
                    f = dk.m4707i(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new Cap(i, iBinder, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Cap[i];
    }
}
