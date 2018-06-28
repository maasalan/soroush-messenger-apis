package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class kt implements Creator<zzcsv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        byte[] bArr = str;
        byte[][] bArr2 = bArr;
        byte[][] bArr3 = bArr2;
        byte[][] bArr4 = bArr3;
        byte[][] bArr5 = bArr4;
        int[] iArr = bArr5;
        byte[][] bArr6 = iArr;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 3:
                    bArr = dk.m4713o(parcel, readInt);
                    break;
                case 4:
                    bArr2 = dk.m4714p(parcel, readInt);
                    break;
                case 5:
                    bArr3 = dk.m4714p(parcel, readInt);
                    break;
                case 6:
                    bArr4 = dk.m4714p(parcel, readInt);
                    break;
                case 7:
                    bArr5 = dk.m4714p(parcel, readInt);
                    break;
                case 8:
                    iArr = dk.m4715q(parcel, readInt);
                    break;
                case 9:
                    bArr6 = dk.m4714p(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzcsv(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcsv[i];
    }
}
