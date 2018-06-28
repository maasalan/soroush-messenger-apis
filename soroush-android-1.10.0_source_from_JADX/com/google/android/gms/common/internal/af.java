package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class af implements Creator<zzbv> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        int i2 = 0;
        Scope[] scopeArr = null;
        int i3 = i2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    i3 = dk.m4703e(parcel, readInt);
                    break;
                case 3:
                    i2 = dk.m4703e(parcel, readInt);
                    break;
                case 4:
                    scopeArr = (Scope[]) dk.m4699b(parcel, readInt, Scope.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbv(i, i3, i2, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbv[i];
    }
}
