package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.dk;
import java.util.ArrayList;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1685c implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        boolean z = i;
        boolean z2 = z;
        boolean z3 = z2;
        ArrayList arrayList = null;
        Account account = arrayList;
        String str = account;
        String str2 = str;
        ArrayList arrayList2 = str2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    arrayList = dk.m4700c(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) dk.m4695a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = dk.m4701c(parcel, readInt);
                    break;
                case 5:
                    z2 = dk.m4701c(parcel, readInt);
                    break;
                case 6:
                    z3 = dk.m4701c(parcel, readInt);
                    break;
                case 7:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 8:
                    str2 = dk.m4710l(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = dk.m4700c(parcel, readInt, zzn.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
