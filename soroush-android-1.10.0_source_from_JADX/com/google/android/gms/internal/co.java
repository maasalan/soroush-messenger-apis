package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class co implements Creator<zzbde> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        zzbdt com_google_android_gms_internal_zzbdt = null;
        byte[] bArr = com_google_android_gms_internal_zzbdt;
        int[] iArr = bArr;
        String[] strArr = iArr;
        int[] iArr2 = strArr;
        byte[][] bArr2 = iArr2;
        zzcsv[] com_google_android_gms_internal_zzcsvArr = bArr2;
        boolean z = true;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    com_google_android_gms_internal_zzbdt = (zzbdt) dk.m4695a(parcel, readInt, zzbdt.CREATOR);
                    break;
                case 3:
                    bArr = dk.m4713o(parcel, readInt);
                    break;
                case 4:
                    iArr = dk.m4715q(parcel, readInt);
                    break;
                case 5:
                    strArr = dk.m4717s(parcel, readInt);
                    break;
                case 6:
                    iArr2 = dk.m4715q(parcel, readInt);
                    break;
                case 7:
                    bArr2 = dk.m4714p(parcel, readInt);
                    break;
                case 8:
                    z = dk.m4701c(parcel, readInt);
                    break;
                case 9:
                    com_google_android_gms_internal_zzcsvArr = (zzcsv[]) dk.m4699b(parcel, readInt, zzcsv.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbde(com_google_android_gms_internal_zzbdt, bArr, iArr, strArr, iArr2, bArr2, z, com_google_android_gms_internal_zzcsvArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbde[i];
    }
}
