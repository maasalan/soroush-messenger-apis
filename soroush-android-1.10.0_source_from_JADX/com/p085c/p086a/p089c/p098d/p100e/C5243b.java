package com.p085c.p086a.p089c.p098d.p100e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.p085c.p086a.p088b.C1087a.C1086a;
import com.p085c.p086a.p089c.p092b.p093a.C1104b;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;

public final class C5243b implements C1086a {
    private final C1106e f14578a;
    private final C1104b f14579b;

    public C5243b(C1106e c1106e, C1104b c1104b) {
        this.f14578a = c1106e;
        this.f14579b = c1104b;
    }

    public final Bitmap mo1215a(int i, int i2, Config config) {
        return this.f14578a.mo1139b(i, i2, config);
    }

    public final void mo1216a(Bitmap bitmap) {
        this.f14578a.mo1138a(bitmap);
    }

    public final void mo1217a(byte[] bArr) {
        if (this.f14579b != null) {
            this.f14579b.mo1133a((Object) bArr, byte[].class);
        }
    }

    public final void mo1218a(int[] iArr) {
        if (this.f14579b != null) {
            this.f14579b.mo1133a((Object) iArr, int[].class);
        }
    }

    public final byte[] mo1219a(int i) {
        return this.f14579b == null ? new byte[i] : (byte[]) this.f14579b.mo1130a(i, byte[].class);
    }

    public final int[] mo1220b(int i) {
        return this.f14579b == null ? new int[i] : (int[]) this.f14579b.mo1130a(i, int[].class);
    }
}
