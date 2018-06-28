package com.p085c.p086a.p089c.p098d.p099a;

import android.graphics.Bitmap;
import com.p085c.p086a.p089c.p092b.C1157p;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p109i.C1271h;
import com.p085c.p086a.p109i.C1273i;

public final class C5217e implements C1157p, C1159s<Bitmap> {
    private final Bitmap f14544a;
    private final C1106e f14545b;

    public C5217e(Bitmap bitmap, C1106e c1106e) {
        this.f14544a = (Bitmap) C1271h.m3012a((Object) bitmap, "Bitmap must not be null");
        this.f14545b = (C1106e) C1271h.m3012a((Object) c1106e, "BitmapPool must not be null");
    }

    public static C5217e m10772a(Bitmap bitmap, C1106e c1106e) {
        return bitmap == null ? null : new C5217e(bitmap, c1106e);
    }

    public final Class<Bitmap> mo1179a() {
        return Bitmap.class;
    }

    public final /* bridge */ /* synthetic */ Object mo1180b() {
        return this.f14544a;
    }

    public final int mo1181c() {
        return C1273i.m3017a(this.f14544a);
    }

    public final void mo1182d() {
        this.f14545b.mo1138a(this.f14544a);
    }

    public final void mo1201e() {
        this.f14544a.prepareToDraw();
    }
}
