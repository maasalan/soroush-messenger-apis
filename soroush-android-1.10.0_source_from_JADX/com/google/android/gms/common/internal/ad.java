package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class ad implements Creator<zzbr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    account = (Account) dk.m4695a(parcel, readInt, Account.CREATOR);
                    break;
                case 3:
                    i2 = dk.m4703e(parcel, readInt);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) dk.m4695a(parcel, readInt, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzbr(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbr[i];
    }
}
