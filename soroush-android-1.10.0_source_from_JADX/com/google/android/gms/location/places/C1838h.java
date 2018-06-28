package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1838h implements Creator<PlaceReport> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = str2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 3:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                case 4:
                    str3 = dk.m4710l(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new PlaceReport(i, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlaceReport[i];
    }
}
