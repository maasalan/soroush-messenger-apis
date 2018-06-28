package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1891s implements Creator<StreetViewPanoramaCamera> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = f2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    f = dk.m4706h(parcel, readInt);
                    break;
                case 3:
                    f2 = dk.m4706h(parcel, readInt);
                    break;
                case 4:
                    f3 = dk.m4706h(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new StreetViewPanoramaCamera(f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaCamera[i];
    }
}
