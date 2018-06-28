package com.p085c.p086a.p089c.p098d.p514c;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.p085c.p086a.p089c.p092b.C1157p;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p098d.p100e.C5244c;
import com.p085c.p086a.p109i.C1271h;

public abstract class C5239a<T extends Drawable> implements C1157p, C1159s<T> {
    protected final T f14568a;

    public C5239a(T t) {
        this.f14568a = (Drawable) C1271h.m3012a((Object) t, "Argument must not be null");
    }

    public final /* synthetic */ Object mo1180b() {
        return this.f14568a.getConstantState().newDrawable();
    }

    public void mo1201e() {
        if (this.f14568a instanceof BitmapDrawable) {
            ((BitmapDrawable) this.f14568a).getBitmap().prepareToDraw();
            return;
        }
        if (this.f14568a instanceof C5244c) {
            ((C5244c) this.f14568a).m10858a().prepareToDraw();
        }
    }
}
