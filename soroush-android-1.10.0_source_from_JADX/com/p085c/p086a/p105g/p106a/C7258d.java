package com.p085c.p086a.p105g.p106a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.p085c.p086a.p105g.p107b.C1242b;

public abstract class C7258d<Z> extends C7039i<ImageView, Z> {
    private Animatable f20956b;

    public C7258d(ImageView imageView) {
        super(imageView);
    }

    private void m19217b(Z z) {
        if (z instanceof Animatable) {
            this.f20956b = (Animatable) z;
            this.f20956b.start();
        } else {
            this.f20956b = null;
        }
        mo3597a((Object) z);
    }

    private void m19218d(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    public final void mo2699a(Drawable drawable) {
        super.mo2699a(drawable);
        m19217b(null);
        m19218d(drawable);
    }

    protected abstract void mo3597a(Z z);

    public void mo3320a(Z z, C1242b<? super Z> c1242b) {
        m19217b((Object) z);
    }

    public final void mo1227b() {
        if (this.f20956b != null) {
            this.f20956b.start();
        }
    }

    public final void mo2701b(Drawable drawable) {
        super.mo2701b(drawable);
        m19217b(null);
        m19218d(drawable);
    }

    public final void mo1228c() {
        if (this.f20956b != null) {
            this.f20956b.stop();
        }
    }

    public final void mo2702c(Drawable drawable) {
        super.mo2702c(drawable);
        m19217b(null);
        m19218d(drawable);
    }
}
