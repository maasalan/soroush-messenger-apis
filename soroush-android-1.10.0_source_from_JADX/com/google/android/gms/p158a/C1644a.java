package com.google.android.gms.p158a;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.mo;

public interface C1644a extends IInterface {

    public static abstract class C5425a extends mo implements C1644a {
        public C5425a() {
            attachInterface(this, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static C1644a m11702a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C1644a ? (C1644a) queryLocalInterface : new C5432l(iBinder);
        }
    }
}
