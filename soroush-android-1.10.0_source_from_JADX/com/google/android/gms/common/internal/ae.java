package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class ae implements Creator<zzbt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = iBinder;
        int i = 0;
        boolean z = i;
        boolean z2 = z;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    iBinder = dk.m4711m(parcel, readInt);
                    break;
                case 3:
                    connectionResult = (ConnectionResult) dk.m4695a(parcel, readInt, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z = dk.m4701c(parcel, readInt);
                    break;
                case 5:
                    z2 = dk.m4701c(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbt(i, iBinder, connectionResult, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbt[i];
    }
}
