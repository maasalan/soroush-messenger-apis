package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class et implements Creator<zzcff> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        boolean z = false;
        int i = z;
        boolean z2 = i;
        long j = 0;
        long j2 = j;
        long j3 = j2;
        long j4 = j3;
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        boolean z3 = true;
        long j5 = -2147483648L;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    str = dk.m4710l(parcel2, readInt);
                    break;
                case 3:
                    str2 = dk.m4710l(parcel2, readInt);
                    break;
                case 4:
                    str3 = dk.m4710l(parcel2, readInt);
                    break;
                case 5:
                    str4 = dk.m4710l(parcel2, readInt);
                    break;
                case 6:
                    j = dk.m4704f(parcel2, readInt);
                    break;
                case 7:
                    j2 = dk.m4704f(parcel2, readInt);
                    break;
                case 8:
                    str5 = dk.m4710l(parcel2, readInt);
                    break;
                case 9:
                    z3 = dk.m4701c(parcel2, readInt);
                    break;
                case 10:
                    z = dk.m4701c(parcel2, readInt);
                    break;
                case 11:
                    j5 = dk.m4704f(parcel2, readInt);
                    break;
                case 12:
                    str6 = dk.m4710l(parcel2, readInt);
                    break;
                case 13:
                    j3 = dk.m4704f(parcel2, readInt);
                    break;
                case 14:
                    j4 = dk.m4704f(parcel2, readInt);
                    break;
                case 15:
                    i = dk.m4703e(parcel2, readInt);
                    break;
                case 16:
                    z2 = dk.m4701c(parcel2, readInt);
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new zzcff(str, str2, str3, str4, j, j2, str5, z3, z, j5, str6, j3, j4, i, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcff[i];
    }
}
