package com.p085c.p086a.p089c.p098d.p099a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.p085c.p086a.p089c.p092b.C1157p;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p109i.C1271h;
import com.p085c.p086a.p109i.C1273i;

public final class C5229o implements C1157p, C1159s<BitmapDrawable> {
    private final Bitmap f14551a;
    private final Resources f14552b;
    private final C1106e f14553c;

    private C5229o(Resources resources, C1106e c1106e, Bitmap bitmap) {
        this.f14552b = (Resources) C1271h.m3012a((Object) resources, "Argument must not be null");
        this.f14553c = (C1106e) C1271h.m3012a((Object) c1106e, "Argument must not be null");
        this.f14551a = (Bitmap) C1271h.m3012a((Object) bitmap, "Argument must not be null");
    }

    public static C5229o m10812a(Resources resources, C1106e c1106e, Bitmap bitmap) {
        return new C5229o(resources, c1106e, bitmap);
    }

    public final Class<BitmapDrawable> mo1179a() {
        return BitmapDrawable.class;
    }

    public final /* synthetic */ Object mo1180b() {
        return new BitmapDrawable(this.f14552b, this.f14551a);
    }

    public final int mo1181c() {
        return C1273i.m3017a(this.f14551a);
    }

    public final void mo1182d() {
        this.f14553c.mo1138a(this.f14551a);
    }

    public final void mo1201e() {
        this.f14551a.prepareToDraw();
    }
}
