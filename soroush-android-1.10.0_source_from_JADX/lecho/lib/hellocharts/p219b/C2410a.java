package lecho.lib.hellocharts.p219b;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.p222e.C2424d;
import lecho.lib.hellocharts.p222e.C5748b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C2410a {
    protected float f7953a = 20.0f;
    protected int f7954b;
    protected int f7955c;
    protected Rect f7956d = new Rect();
    protected Rect f7957e = new Rect();
    protected Rect f7958f = new Rect();
    protected Viewport f7959g = new Viewport();
    protected Viewport f7960h = new Viewport();
    protected float f7961i;
    protected float f7962j;
    protected C2424d f7963k = new C5748b();

    private void m6575b(float f, float f2, float f3, float f4) {
        if (f3 - f < this.f7961i) {
            f3 = this.f7961i + f;
            if (f < this.f7960h.f8050a) {
                f = this.f7960h.f8050a;
                f3 = this.f7961i + f;
            } else if (f3 > this.f7960h.f8052c) {
                f3 = this.f7960h.f8052c;
                f = f3 - this.f7961i;
            }
        }
        if (f2 - f4 < this.f7962j) {
            f4 = f2 - this.f7962j;
            if (f2 > this.f7960h.f8051b) {
                f2 = this.f7960h.f8051b;
                f4 = f2 - this.f7962j;
            } else if (f4 < this.f7960h.f8053d) {
                f4 = this.f7960h.f8053d;
                f2 = this.f7962j + f4;
            }
        }
        this.f7959g.f8050a = Math.max(this.f7960h.f8050a, f);
        this.f7959g.f8051b = Math.min(this.f7960h.f8051b, f2);
        this.f7959g.f8052c = Math.min(this.f7960h.f8052c, f3);
        this.f7959g.f8053d = Math.max(this.f7960h.f8053d, f4);
    }

    private void m6576j() {
        this.f7961i = this.f7960h.m6645a() / this.f7953a;
        this.f7962j = this.f7960h.m6648b() / this.f7953a;
    }

    public final float m6577a(float f) {
        return ((float) this.f7956d.left) + ((f - this.f7959g.f8050a) * (((float) this.f7956d.width()) / this.f7959g.m6645a()));
    }

    public final void m6578a() {
        this.f7957e.set(this.f7958f);
        this.f7956d.set(this.f7958f);
    }

    public final void m6579a(float f, float f2) {
        float a = this.f7959g.m6645a();
        float b = this.f7959g.m6648b();
        f = Math.max(this.f7960h.f8050a, Math.min(f, this.f7960h.f8052c - a));
        f2 = Math.max(this.f7960h.f8053d + b, Math.min(f2, this.f7960h.f8051b));
        m6575b(f, f2, a + f, f2 - b);
    }

    public final void m6580a(float f, float f2, float f3, float f4) {
        m6575b(f, f2, f3, f4);
    }

    public final void m6581a(int i, int i2, int i3, int i4) {
        this.f7957e.left += i;
        this.f7957e.top += i2;
        this.f7957e.right -= i3;
        this.f7957e.bottom -= i4;
        m6590b(i, i2, i3, i4);
    }

    public final void m6582a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f7954b = i;
        this.f7955c = i2;
        this.f7958f.set(i3, i4, i - i5, i2 - i6);
        this.f7957e.set(this.f7958f);
        this.f7956d.set(this.f7958f);
    }

    public final void m6583a(Point point) {
        point.set((int) ((this.f7960h.m6645a() * ((float) this.f7956d.width())) / this.f7959g.m6645a()), (int) ((this.f7960h.m6648b() * ((float) this.f7956d.height())) / this.f7959g.m6648b()));
    }

    public final void m6584a(C2424d c2424d) {
        if (c2424d == null) {
            this.f7963k = new C5748b();
        } else {
            this.f7963k = c2424d;
        }
    }

    public final void m6585a(Viewport viewport) {
        m6575b(viewport.f8050a, viewport.f8051b, viewport.f8052c, viewport.f8053d);
    }

    public final boolean m6586a(float f, float f2, float f3) {
        return f >= ((float) this.f7956d.left) - f3 && f <= ((float) this.f7956d.right) + f3 && f2 <= ((float) this.f7956d.bottom) + f3 && f2 >= ((float) this.f7956d.top) - f3;
    }

    public final boolean m6587a(float f, float f2, PointF pointF) {
        if (!this.f7956d.contains((int) f, (int) f2)) {
            return false;
        }
        pointF.set(this.f7959g.f8050a + (((f - ((float) this.f7956d.left)) * this.f7959g.m6645a()) / ((float) this.f7956d.width())), this.f7959g.f8053d + (((f2 - ((float) this.f7956d.bottom)) * this.f7959g.m6648b()) / ((float) (-this.f7956d.height()))));
        return true;
    }

    public final float m6588b(float f) {
        return ((float) this.f7956d.bottom) - ((f - this.f7959g.f8053d) * (((float) this.f7956d.height()) / this.f7959g.m6648b()));
    }

    public final Rect m6589b() {
        return this.f7956d;
    }

    public final void m6590b(int i, int i2, int i3, int i4) {
        this.f7956d.left += i;
        this.f7956d.top += i2;
        this.f7956d.right -= i3;
        this.f7956d.bottom -= i4;
    }

    public final void m6591b(Viewport viewport) {
        this.f7960h.m6646a(viewport.f8050a, viewport.f8051b, viewport.f8052c, viewport.f8053d);
        m6576j();
    }

    public final Rect m6592c() {
        return this.f7957e;
    }

    public final void m6593c(float f) {
        if (f < BallPulseIndicator.SCALE) {
            f = BallPulseIndicator.SCALE;
        }
        this.f7953a = f;
        m6576j();
        m6585a(this.f7959g);
    }

    public final Viewport m6594d() {
        return this.f7959g;
    }

    public final Viewport m6595e() {
        return this.f7960h;
    }

    public final Viewport m6596f() {
        return this.f7959g;
    }

    public final int m6597g() {
        return this.f7954b;
    }

    public final int m6598h() {
        return this.f7955c;
    }

    public final float m6599i() {
        return this.f7953a;
    }
}
