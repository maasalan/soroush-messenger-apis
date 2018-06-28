package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1841b implements Creator<zzaf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        List list = null;
        String str = list;
        Uri uri = str;
        float f = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    list = dk.m4718t(parcel, readInt);
                    break;
                case 2:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 3:
                    uri = (Uri) dk.m4695a(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    f = dk.m4706h(parcel, readInt);
                    break;
                case 5:
                    i = dk.m4703e(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzaf(list, str, uri, f, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaf[i];
    }
}
