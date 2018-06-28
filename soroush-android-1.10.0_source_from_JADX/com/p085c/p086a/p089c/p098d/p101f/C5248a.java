package com.p085c.p086a.p089c.p098d.p101f;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p098d.p513b.C5238b;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class C5248a implements C1200d<Bitmap, byte[]> {
    private final CompressFormat f14596a;
    private final int f14597b;

    public C5248a() {
        this(CompressFormat.JPEG);
    }

    private C5248a(CompressFormat compressFormat) {
        this.f14596a = compressFormat;
        this.f14597b = 100;
    }

    public final C1159s<byte[]> mo1222a(C1159s<Bitmap> c1159s) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) c1159s.mo1180b()).compress(this.f14596a, this.f14597b, byteArrayOutputStream);
        c1159s.mo1182d();
        return new C5238b(byteArrayOutputStream.toByteArray());
    }
}
