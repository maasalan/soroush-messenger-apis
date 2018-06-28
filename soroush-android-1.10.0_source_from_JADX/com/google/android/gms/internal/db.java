package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class db implements Creator<zzbdt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        int i2 = i;
        boolean z = i2;
        int i3 = z;
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        boolean z2 = true;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 3:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 4:
                    i2 = dk.m4703e(parcel, readInt);
                    break;
                case 5:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                case 6:
                    str3 = dk.m4710l(parcel, readInt);
                    break;
                case 7:
                    z2 = dk.m4701c(parcel, readInt);
                    break;
                case 8:
                    str4 = dk.m4710l(parcel, readInt);
                    break;
                case 9:
                    z = dk.m4701c(parcel, readInt);
                    break;
                case 10:
                    i3 = dk.m4703e(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbdt(str, i, i2, str2, str3, z2, str4, z, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbdt[i];
    }
}
