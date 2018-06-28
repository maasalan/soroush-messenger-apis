package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1756d implements Creator<WebImage> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = i2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    uri = (Uri) dk.m4695a(parcel, readInt, Uri.CREATOR);
                    break;
                case 3:
                    i2 = dk.m4703e(parcel, readInt);
                    break;
                case 4:
                    i3 = dk.m4703e(parcel, readInt);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new WebImage(i, uri, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WebImage[i];
    }
}
