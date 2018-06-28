package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.dk;
import java.util.List;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1683a implements Creator<GoogleSignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = dk.m4693a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        Uri uri = str4;
        String str5 = uri;
        String str6 = str5;
        List list = str6;
        String str7 = list;
        String str8 = str7;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel2, readInt);
                    break;
                case 2:
                    str = dk.m4710l(parcel2, readInt);
                    break;
                case 3:
                    str2 = dk.m4710l(parcel2, readInt);
                    break;
                case 4:
                    str3 = dk.m4710l(parcel2, readInt);
                    break;
                case 5:
                    str4 = dk.m4710l(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) dk.m4695a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = dk.m4710l(parcel2, readInt);
                    break;
                case 8:
                    j = dk.m4704f(parcel2, readInt);
                    break;
                case 9:
                    str6 = dk.m4710l(parcel2, readInt);
                    break;
                case 10:
                    list = dk.m4700c(parcel2, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = dk.m4710l(parcel2, readInt);
                    break;
                case 12:
                    str8 = dk.m4710l(parcel2, readInt);
                    break;
                default:
                    dk.m4697b(parcel2, readInt);
                    break;
            }
        }
        dk.m4722x(parcel2, a);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
