package com.p085c.p086a.p089c.p098d.p100e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p088b.C1087a;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p089c.p098d.p100e.C1199g.C1197b;
import com.p085c.p086a.p109i.C1271h;
import java.nio.ByteBuffer;

public class C5244c extends Drawable implements Animatable, C1197b {
    final C1196a f14580a;
    boolean f14581b;
    private boolean f14582c;
    private boolean f14583d;
    private boolean f14584e;
    private int f14585f;
    private int f14586g;
    private boolean f14587h;
    private Paint f14588i;
    private Rect f14589j;

    static class C1196a extends ConstantState {
        final C1106e f3790a;
        final C1199g f3791b;

        public C1196a(C1106e c1106e, C1199g c1199g) {
            this.f3790a = c1106e;
            this.f3791b = c1199g;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new C5244c(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public C5244c(Context context, C1087a c1087a, C1106e c1106e, C5255m<Bitmap> c5255m, int i, int i2, Bitmap bitmap) {
        this(new C1196a(c1106e, new C1199g(C1212c.m2871a(context), c1087a, i, i2, (C5255m) c5255m, bitmap)));
    }

    C5244c(C1196a c1196a) {
        this.f14584e = true;
        this.f14586g = -1;
        this.f14580a = (C1196a) C1271h.m3012a((Object) c1196a, "Argument must not be null");
    }

    private void m10854d() {
        C1271h.m3015a(this.f14581b ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f14580a.f3791b.m2848a() != 1) {
            if (!this.f14582c) {
                this.f14582c = true;
                C1199g c1199g = this.f14580a.f3791b;
                if (c1199g.f3800h) {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                }
                boolean isEmpty = c1199g.f3795c.isEmpty();
                if (c1199g.f3795c.contains(this)) {
                    throw new IllegalStateException("Cannot subscribe twice in a row");
                }
                c1199g.f3795c.add(this);
                if (isEmpty && !c1199g.f3797e) {
                    c1199g.f3797e = true;
                    c1199g.f3800h = false;
                    c1199g.m2851c();
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    private void m10855e() {
        this.f14582c = false;
        C1199g c1199g = this.f14580a.f3791b;
        c1199g.f3795c.remove(this);
        if (c1199g.f3795c.isEmpty()) {
            c1199g.f3797e = false;
        }
    }

    private Rect m10856f() {
        if (this.f14589j == null) {
            this.f14589j = new Rect();
        }
        return this.f14589j;
    }

    private Paint m10857g() {
        if (this.f14588i == null) {
            this.f14588i = new Paint(2);
        }
        return this.f14588i;
    }

    public final Bitmap m10858a() {
        return this.f14580a.f3791b.f3802j;
    }

    public final ByteBuffer m10859b() {
        return this.f14580a.f3791b.f3793a.mo1098a().asReadOnlyBuffer();
    }

    public final void mo1221c() {
        if (getCallback() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        C1199g c1199g = this.f14580a.f3791b;
        if ((c1199g.f3799g != null ? c1199g.f3799g.f20952a : -1) == this.f14580a.f3791b.m2848a() - 1) {
            this.f14585f++;
        }
        if (this.f14586g != -1 && this.f14585f >= this.f14586g) {
            stop();
        }
    }

    public void draw(Canvas canvas) {
        if (!this.f14581b) {
            if (this.f14587h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m10856f());
                this.f14587h = false;
            }
            canvas.drawBitmap(this.f14580a.f3791b.m2850b(), null, m10856f(), m10857g());
        }
    }

    public ConstantState getConstantState() {
        return this.f14580a;
    }

    public int getIntrinsicHeight() {
        return this.f14580a.f3791b.m2850b().getHeight();
    }

    public int getIntrinsicWidth() {
        return this.f14580a.f3791b.m2850b().getWidth();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.f14582c;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f14587h = true;
    }

    public void setAlpha(int i) {
        m10857g().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        m10857g().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        C1271h.m3015a(this.f14581b ^ 1, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f14584e = z;
        if (!z) {
            m10855e();
        } else if (this.f14583d) {
            m10854d();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f14583d = true;
        this.f14585f = 0;
        if (this.f14584e) {
            m10854d();
        }
    }

    public void stop() {
        this.f14583d = false;
        m10855e();
    }
}
