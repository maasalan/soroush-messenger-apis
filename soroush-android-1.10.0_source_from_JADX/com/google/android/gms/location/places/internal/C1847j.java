package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1847j implements Creator<zza> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        String str = null;
        List list = str;
        String str2 = list;
        List list2 = str2;
        String str3 = list2;
        List list3 = str3;
        String str4 = list3;
        List list4 = str4;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                case 2:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 3:
                    list = dk.m4718t(parcel, readInt);
                    break;
                case 4:
                    list2 = dk.m4700c(parcel, readInt, zzb.CREATOR);
                    break;
                case 5:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 6:
                    str3 = dk.m4710l(parcel, readInt);
                    break;
                case 7:
                    list3 = dk.m4700c(parcel, readInt, zzb.CREATOR);
                    break;
                case 8:
                    str4 = dk.m4710l(parcel, readInt);
                    break;
                case 9:
                    list4 = dk.m4700c(parcel, readInt, zzb.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zza(str, list, i, str2, list2, str3, list3, str4, list4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
