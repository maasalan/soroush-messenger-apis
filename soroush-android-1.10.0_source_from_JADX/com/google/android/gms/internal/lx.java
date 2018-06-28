package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzbt;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class lx implements Creator<zzcwo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        zzbt com_google_android_gms_common_internal_zzbt = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    connectionResult = (ConnectionResult) dk.m4695a(parcel, readInt, ConnectionResult.CREATOR);
                    break;
                case 3:
                    com_google_android_gms_common_internal_zzbt = (zzbt) dk.m4695a(parcel, readInt, zzbt.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzcwo(i, connectionResult, com_google_android_gms_common_internal_zzbt);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcwo[i];
    }
}
