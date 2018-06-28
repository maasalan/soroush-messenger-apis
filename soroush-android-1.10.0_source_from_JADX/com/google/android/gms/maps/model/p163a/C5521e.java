package com.google.android.gms.maps.model.p163a;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mn;
import com.google.android.gms.internal.mp;
import com.google.android.gms.p158a.C1644a;
import com.google.android.gms.p158a.C1644a.C5425a;

public final class C5521e extends mn implements C1869a {
    C5521e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public final C1644a mo1698a() {
        Parcel f_ = f_();
        f_.writeFloat(0.0f);
        f_ = m5000a(5, f_);
        C1644a a = C5425a.m11702a(f_.readStrongBinder());
        f_.recycle();
        return a;
    }

    public final C1644a mo1699a(Bitmap bitmap) {
        Parcel f_ = f_();
        mp.m5006a(f_, (Parcelable) bitmap);
        Parcel a = m5000a(6, f_);
        C1644a a2 = C5425a.m11702a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
