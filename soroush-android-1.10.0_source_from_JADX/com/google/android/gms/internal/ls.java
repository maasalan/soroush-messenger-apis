package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public abstract class ls extends mo implements lr {
    public ls() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m5003a(i, parcel, parcel2, i2)) {
            return true;
        }
        Creator creator;
        switch (i) {
            case 3:
                mp.m5004a(parcel, ConnectionResult.CREATOR);
                creator = zzcwe.CREATOR;
                break;
            case 4:
            case 6:
                creator = Status.CREATOR;
                break;
            case 7:
                mp.m5004a(parcel, Status.CREATOR);
                creator = GoogleSignInAccount.CREATOR;
                break;
            case 8:
                mo3039a((zzcwo) mp.m5004a(parcel, zzcwo.CREATOR));
                break;
            default:
                return false;
        }
        mp.m5004a(parcel, creator);
        parcel2.writeNoException();
        return true;
    }
}
