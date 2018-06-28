package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class js implements Creator<zzckk> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        String str = null;
        Long l = str;
        Float f = l;
        String str2 = f;
        String str3 = str2;
        Double d = str3;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel2, readInt);
                    break;
                case 2:
                    str = dk.m4710l(parcel2, readInt);
                    break;
                case 3:
                    j = dk.m4704f(parcel2, readInt);
                    break;
                case 4:
                    readInt = dk.m4694a(parcel2, readInt);
                    if (readInt != 0) {
                        dk.m4696a(parcel2, readInt, 8);
                        l = Long.valueOf(parcel.readLong());
                        break;
                    }
                    l = null;
                    break;
                case 5:
                    f = dk.m4707i(parcel2, readInt);
                    break;
                case 6:
                    str2 = dk.m4710l(parcel2, readInt);
                    break;
                case 7:
                    str3 = dk.m4710l(parcel2, readInt);
                    break;
                case 8:
                    readInt = dk.m4694a(parcel2, readInt);
                    if (readInt != 0) {
                        dk.m4696a(parcel2, readInt, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    }
                    d = null;
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new zzckk(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzckk[i];
    }
}
