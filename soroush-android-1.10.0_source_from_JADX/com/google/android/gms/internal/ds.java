package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class ds implements Creator<zzbfl> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        String str2 = str;
        zzbfe com_google_android_gms_internal_zzbfe = str2;
        int i = 0;
        int i2 = i;
        boolean z = i2;
        int i3 = z;
        boolean z2 = i3;
        int i4 = z2;
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
                    z = dk.m4701c(parcel, readInt);
                    break;
                case 4:
                    i3 = dk.m4703e(parcel, readInt);
                    break;
                case 5:
                    z2 = dk.m4701c(parcel, readInt);
                    break;
                case 6:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 7:
                    i4 = dk.m4703e(parcel, readInt);
                    break;
                case 8:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                case 9:
                    com_google_android_gms_internal_zzbfe = (zzbfe) dk.m4695a(parcel, readInt, zzbfe.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbfl(i, i2, z, i3, z2, str, i4, str2, com_google_android_gms_internal_zzbfe);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfl[i];
    }
}
