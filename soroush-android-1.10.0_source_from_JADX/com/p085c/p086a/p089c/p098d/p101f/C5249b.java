package com.p085c.p086a.p089c.p098d.p101f;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p089c.p098d.p099a.C5229o;
import com.p085c.p086a.p109i.C1271h;

public final class C5249b implements C1200d<Bitmap, BitmapDrawable> {
    private final Resources f14598a;
    private final C1106e f14599b;

    public C5249b(Resources resources, C1106e c1106e) {
        this.f14598a = (Resources) C1271h.m3012a((Object) resources, "Argument must not be null");
        this.f14599b = (C1106e) C1271h.m3012a((Object) c1106e, "Argument must not be null");
    }

    public final C1159s<BitmapDrawable> mo1222a(C1159s<Bitmap> c1159s) {
        return C5229o.m10812a(this.f14598a, this.f14599b, (Bitmap) c1159s.mo1180b());
    }
}
