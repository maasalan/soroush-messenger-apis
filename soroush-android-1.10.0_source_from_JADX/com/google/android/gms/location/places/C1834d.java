package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C1834d implements Creator<AutocompleteFilter> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        List list = null;
        String str = list;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt;
            if (i2 != IjkMediaCodecInfo.RANK_MAX) {
                switch (i2) {
                    case 1:
                        z = dk.m4701c(parcel, readInt);
                        break;
                    case 2:
                        list = dk.m4718t(parcel, readInt);
                        break;
                    case 3:
                        str = dk.m4710l(parcel, readInt);
                        break;
                    default:
                        dk.m4697b(parcel, readInt);
                        break;
                }
            }
            i = dk.m4703e(parcel, readInt);
        }
        dk.m4722x(parcel, a);
        return new AutocompleteFilter(i, z, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutocompleteFilter[i];
    }
}
