package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;

public final class C5491b extends mn implements C1815a {
    C5491b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    public final void mo1584a(Message message) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) message);
        m5001a(f_);
    }
}
