package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.dk;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1886n implements Creator<MarkerOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        boolean z = false;
        boolean z2 = z;
        boolean z3 = z2;
        LatLng latLng = null;
        String str = latLng;
        String str2 = str;
        IBinder iBinder = str2;
        float f = 0.0f;
        float f2 = f;
        float f3 = f2;
        float f4 = f3;
        float f5 = f4;
        float f6 = 0.5f;
        float f7 = BallPulseIndicator.SCALE;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 2:
                    latLng = (LatLng) dk.m4695a(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = dk.m4710l(parcel2, readInt);
                    break;
                case 4:
                    str2 = dk.m4710l(parcel2, readInt);
                    break;
                case 5:
                    iBinder = dk.m4711m(parcel2, readInt);
                    break;
                case 6:
                    f = dk.m4706h(parcel2, readInt);
                    break;
                case 7:
                    f2 = dk.m4706h(parcel2, readInt);
                    break;
                case 8:
                    z = dk.m4701c(parcel2, readInt);
                    break;
                case 9:
                    z2 = dk.m4701c(parcel2, readInt);
                    break;
                case 10:
                    z3 = dk.m4701c(parcel2, readInt);
                    break;
                case 11:
                    f3 = dk.m4706h(parcel2, readInt);
                    break;
                case 12:
                    f6 = dk.m4706h(parcel2, readInt);
                    break;
                case 13:
                    f4 = dk.m4706h(parcel2, readInt);
                    break;
                case 14:
                    f7 = dk.m4706h(parcel2, readInt);
                    break;
                case 15:
                    f5 = dk.m4706h(parcel2, readInt);
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f6, f4, f7, f5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
