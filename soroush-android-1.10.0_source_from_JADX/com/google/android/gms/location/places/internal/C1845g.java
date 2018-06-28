package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1845g implements Creator<zzat> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        int i2 = i;
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 2:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                case 3:
                    str3 = dk.m4710l(parcel, readInt);
                    break;
                case 4:
                    str4 = dk.m4710l(parcel, readInt);
                    break;
                case 6:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 7:
                    i2 = dk.m4703e(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzat(str, str2, str3, str4, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzat[i];
    }
}
