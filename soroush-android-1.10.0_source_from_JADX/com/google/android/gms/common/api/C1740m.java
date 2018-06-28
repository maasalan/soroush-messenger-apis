package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C1740m implements Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = str;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt;
            if (i3 != IjkMediaCodecInfo.RANK_MAX) {
                switch (i3) {
                    case 1:
                        i2 = dk.m4703e(parcel, readInt);
                        break;
                    case 2:
                        str = dk.m4710l(parcel, readInt);
                        break;
                    case 3:
                        pendingIntent = (PendingIntent) dk.m4695a(parcel, readInt, PendingIntent.CREATOR);
                        break;
                    default:
                        dk.m4697b(parcel, readInt);
                        break;
                }
            }
            i = dk.m4703e(parcel, readInt);
        }
        dk.m4722x(parcel, a);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
