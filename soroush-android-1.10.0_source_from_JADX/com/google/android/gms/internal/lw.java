package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzbr;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class lw implements Creator<zzcwm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        zzbr com_google_android_gms_common_internal_zzbr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    com_google_android_gms_common_internal_zzbr = (zzbr) dk.m4695a(parcel, readInt, zzbr.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzcwm(i, com_google_android_gms_common_internal_zzbr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcwm[i];
    }
}
