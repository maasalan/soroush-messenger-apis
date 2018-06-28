package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1778d implements Creator<WakeLockEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        long j = 0;
        long j2 = j;
        long j3 = j2;
        int i = 0;
        int i2 = i;
        int i3 = i2;
        int i4 = i3;
        String str = null;
        List list = str;
        String str2 = list;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        float f = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel2, readInt);
                    break;
                case 2:
                    j = dk.m4704f(parcel2, readInt);
                    break;
                case 4:
                    str = dk.m4710l(parcel2, readInt);
                    break;
                case 5:
                    i3 = dk.m4703e(parcel2, readInt);
                    break;
                case 6:
                    list = dk.m4719u(parcel2, readInt);
                    break;
                case 8:
                    j2 = dk.m4704f(parcel2, readInt);
                    break;
                case 10:
                    str3 = dk.m4710l(parcel2, readInt);
                    break;
                case 11:
                    i2 = dk.m4703e(parcel2, readInt);
                    break;
                case 12:
                    str2 = dk.m4710l(parcel2, readInt);
                    break;
                case 13:
                    str4 = dk.m4710l(parcel2, readInt);
                    break;
                case 14:
                    i4 = dk.m4703e(parcel2, readInt);
                    break;
                case 15:
                    f = dk.m4706h(parcel2, readInt);
                    break;
                case 16:
                    j3 = dk.m4704f(parcel2, readInt);
                    break;
                case 17:
                    str5 = dk.m4710l(parcel2, readInt);
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new WakeLockEvent(i, j, i2, str, i3, list, str2, j2, i4, str3, str4, f, j3, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
