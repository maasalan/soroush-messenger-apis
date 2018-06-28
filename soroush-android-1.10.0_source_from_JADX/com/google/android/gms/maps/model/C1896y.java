package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1896y implements Creator<TileOverlayOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        float f = 0.0f;
        float f2 = f;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = true;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    iBinder = dk.m4711m(parcel, readInt);
                    break;
                case 3:
                    z = dk.m4701c(parcel, readInt);
                    break;
                case 4:
                    f = dk.m4706h(parcel, readInt);
                    break;
                case 5:
                    z2 = dk.m4701c(parcel, readInt);
                    break;
                case 6:
                    f2 = dk.m4706h(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new TileOverlayOptions(iBinder, z, f, z2, f2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
