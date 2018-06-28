package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1843d implements Creator<zzak> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        List list = str4;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 2:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                case 3:
                    str3 = dk.m4710l(parcel, readInt);
                    break;
                case 4:
                    str4 = dk.m4710l(parcel, readInt);
                    break;
                case 5:
                    list = dk.m4719u(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzak(str, str2, str3, str4, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzak[i];
    }
}
