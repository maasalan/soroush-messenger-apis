package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C1747g implements Creator<DataHolder> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = strArr;
        Bundle bundle = cursorWindowArr;
        int i2 = 0;
        int i3 = i2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i4 = InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt;
            if (i4 != IjkMediaCodecInfo.RANK_MAX) {
                switch (i4) {
                    case 1:
                        strArr = dk.m4717s(parcel, readInt);
                        break;
                    case 2:
                        cursorWindowArr = (CursorWindow[]) dk.m4699b(parcel, readInt, CursorWindow.CREATOR);
                        break;
                    case 3:
                        i3 = dk.m4703e(parcel, readInt);
                        break;
                    case 4:
                        bundle = dk.m4712n(parcel, readInt);
                        break;
                    default:
                        dk.m4697b(parcel, readInt);
                        break;
                }
            }
            i2 = dk.m4703e(parcel, readInt);
        }
        dk.m4722x(parcel, a);
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i3, bundle);
        dataHolder.f18011b = new Bundle();
        for (a = 0; a < dataHolder.f18010a.length; a++) {
            dataHolder.f18011b.putInt(dataHolder.f18010a[a], a);
        }
        dataHolder.f18013d = new int[dataHolder.f18012c.length];
        a = 0;
        while (i < dataHolder.f18012c.length) {
            dataHolder.f18013d[i] = a;
            a += dataHolder.f18012c[i].getNumRows() - (a - dataHolder.f18012c[i].getStartPosition());
            i++;
        }
        dataHolder.f18014e = a;
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
