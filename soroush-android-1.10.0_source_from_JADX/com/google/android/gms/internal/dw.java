package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class dw implements Creator<zzbfv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        Parcel parcel2 = null;
        int i = 0;
        zzbfq com_google_android_gms_internal_zzbfq = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    parcel2 = dk.m4720v(parcel, readInt);
                    break;
                case 3:
                    com_google_android_gms_internal_zzbfq = (zzbfq) dk.m4695a(parcel, readInt, zzbfq.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbfv(i, parcel2, com_google_android_gms_internal_zzbfq);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfv[i];
    }
}
