package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.dk;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;

public final class C1757b implements Creator<zzz> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = dk.m4693a(parcel);
        int i = 0;
        int i2 = i;
        int i3 = i2;
        String str = null;
        IBinder iBinder = str;
        Scope[] scopeArr = iBinder;
        Bundle bundle = scopeArr;
        Account account = bundle;
        zzc[] com_google_android_gms_common_zzcArr = account;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (InBandBytestreamManager.MAXIMUM_BLOCK_SIZE & readInt) {
                case 1:
                    i = dk.m4703e(parcel, readInt);
                    break;
                case 2:
                    i2 = dk.m4703e(parcel, readInt);
                    break;
                case 3:
                    i3 = dk.m4703e(parcel, readInt);
                    break;
                case 4:
                    str = dk.m4710l(parcel, readInt);
                    break;
                case 5:
                    iBinder = dk.m4711m(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) dk.m4699b(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = dk.m4712n(parcel, readInt);
                    break;
                case 8:
                    account = (Account) dk.m4695a(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    com_google_android_gms_common_zzcArr = (zzc[]) dk.m4699b(parcel, readInt, zzc.CREATOR);
                    break;
                default:
                    dk.m4697b(parcel, readInt);
                    break;
            }
        }
        dk.m4722x(parcel, a);
        return new zzz(i, i2, i3, str, iBinder, scopeArr, bundle, account, com_google_android_gms_common_zzcArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
