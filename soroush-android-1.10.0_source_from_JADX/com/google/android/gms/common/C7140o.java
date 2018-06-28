package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class C7140o extends C6580m {
    private static final WeakReference<byte[]> f20372b = new WeakReference(null);
    private WeakReference<byte[]> f20373a = f20372b;

    C7140o(byte[] bArr) {
        super(bArr);
    }

    final byte[] mo3406c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f20373a.get();
            if (bArr == null) {
                bArr = mo3565d();
                this.f20373a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    protected abstract byte[] mo3565d();
}
