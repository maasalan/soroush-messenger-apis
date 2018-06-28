package com.p085c.p086a.p089c.p098d.p099a;

import android.graphics.Bitmap;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import java.security.MessageDigest;

public final class C7034h extends C6452f {
    private static final byte[] f20056b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    protected final Bitmap mo3317a(C1106e c1106e, Bitmap bitmap, int i, int i2) {
        return C1192r.m2838a(c1106e, bitmap, i, i2);
    }

    public final void mo1158a(MessageDigest messageDigest) {
        messageDigest.update(f20056b);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C7034h;
    }

    public final int hashCode() {
        return "com.bumptech.glide.load.resource.bitmap.CenterCrop".hashCode();
    }
}
