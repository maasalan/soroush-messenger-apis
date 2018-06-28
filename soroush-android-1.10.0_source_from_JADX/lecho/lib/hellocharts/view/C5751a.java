package lecho.lib.hellocharts.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.support.v4.view.C0571r;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import lecho.lib.hellocharts.model.C2432b;
import lecho.lib.hellocharts.model.C2438h;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.p218a.C2405a;
import lecho.lib.hellocharts.p218a.C2406b;
import lecho.lib.hellocharts.p218a.C2408e;
import lecho.lib.hellocharts.p218a.C5741c;
import lecho.lib.hellocharts.p218a.C5742d;
import lecho.lib.hellocharts.p218a.C5743f;
import lecho.lib.hellocharts.p218a.C5744g;
import lecho.lib.hellocharts.p219b.C2410a;
import lecho.lib.hellocharts.p221d.C2418b;
import lecho.lib.hellocharts.p221d.C2421e;
import lecho.lib.hellocharts.p222e.C2424d;
import lecho.lib.hellocharts.p224g.C2426b;
import lecho.lib.hellocharts.p224g.C2427c;
import lecho.lib.hellocharts.p225h.C2429b;

public abstract class C5751a extends View implements C2440b {
    protected C2410a f15829a;
    protected C2426b f15830b;
    protected C2418b f15831c;
    protected C2427c f15832d;
    protected C2406b f15833e;
    protected C2408e f15834f;
    protected boolean f15835g;
    protected boolean f15836h;
    protected int f15837i;

    public C5751a(Context context) {
        this(context, null, 0);
    }

    public C5751a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5751a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15835g = true;
        this.f15836h = false;
        this.f15829a = new C2410a();
        this.f15831c = new C2418b(context, this);
        this.f15830b = new C2426b(context, this);
        if (VERSION.SDK_INT < 14) {
            this.f15833e = new C5742d(this);
            this.f15834f = new C5744g(this);
            return;
        }
        this.f15834f = new C5743f(this);
        this.f15833e = new C5741c(this);
    }

    public final void mo2117a() {
        getChartData().mo3163k();
        this.f15832d.mo3161i();
        C0571r.m1361e(this);
    }

    public final void mo2118a(float f) {
        getChartData().mo3162a(f);
        this.f15832d.mo3161i();
        C0571r.m1361e(this);
    }

    protected final void m12892b() {
        this.f15829a.m6578a();
        this.f15832d.mo2100b();
        this.f15830b.m6621a();
        C0571r.m1361e(this);
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f15835g && this.f15831c.m6613b()) {
            C0571r.m1361e(this);
        }
    }

    public C2426b getAxesRenderer() {
        return this.f15830b;
    }

    public C2410a getChartComputator() {
        return this.f15829a;
    }

    public C2427c getChartRenderer() {
        return this.f15832d;
    }

    public Viewport getCurrentViewport() {
        return getChartRenderer().mo2105f();
    }

    public float getMaxZoom() {
        return this.f15829a.m6599i();
    }

    public Viewport getMaximumViewport() {
        return this.f15832d.mo2104e();
    }

    public C2438h getSelectedValue() {
        return this.f15832d.mo2106g();
    }

    public C2418b getTouchHandler() {
        return this.f15831c;
    }

    public float getZoomLevel() {
        Viewport maximumViewport = getMaximumViewport();
        Viewport currentViewport = getCurrentViewport();
        return Math.max(maximumViewport.m6645a() / currentViewport.m6645a(), maximumViewport.m6648b() / currentViewport.m6648b());
    }

    public C2421e getZoomType() {
        return this.f15831c.m6614c();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isEnabled()) {
            C2426b c2426b = this.f15830b;
            C2432b b = c2426b.f8012a.getChartData().mo2108b();
            if (b != null) {
                c2426b.m6623a(b, 1);
                c2426b.m6622a(canvas, b, 1);
            }
            b = c2426b.f8012a.getChartData().mo2110d();
            if (b != null) {
                c2426b.m6623a(b, 2);
                c2426b.m6622a(canvas, b, 2);
            }
            b = c2426b.f8012a.getChartData().mo2107a();
            if (b != null) {
                c2426b.m6623a(b, 3);
                c2426b.m6622a(canvas, b, 3);
            }
            b = c2426b.f8012a.getChartData().mo2109c();
            if (b != null) {
                c2426b.m6623a(b, 0);
                c2426b.m6622a(canvas, b, 0);
            }
            int save = canvas.save();
            canvas.clipRect(this.f15829a.m6589b());
            this.f15832d.mo3157a(canvas);
            canvas.restoreToCount(save);
            this.f15832d.mo3159b(canvas);
            c2426b = this.f15830b;
            b = c2426b.f8012a.getChartData().mo2108b();
            if (b != null) {
                c2426b.m6624b(canvas, b, 1);
            }
            b = c2426b.f8012a.getChartData().mo2110d();
            if (b != null) {
                c2426b.m6624b(canvas, b, 2);
            }
            b = c2426b.f8012a.getChartData().mo2107a();
            if (b != null) {
                c2426b.m6624b(canvas, b, 3);
            }
            b = c2426b.f8012a.getChartData().mo2109c();
            if (b != null) {
                c2426b.m6624b(canvas, b, 0);
            }
            return;
        }
        canvas.drawColor(C2429b.f8040a);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f15829a.m6582a(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.f15832d.mo3160h();
        this.f15830b.m6621a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (!this.f15835g) {
            return false;
        }
        if (this.f15836h ? this.f15831c.m6611a(motionEvent, getParent(), this.f15837i) : this.f15831c.m6610a(motionEvent)) {
            C0571r.m1361e(this);
        }
        return true;
    }

    public void setChartRenderer(C2427c c2427c) {
        this.f15832d = c2427c;
        this.f15832d.mo2097a();
        C2426b c2426b = this.f15830b;
        c2426b.f8013b = c2426b.f8012a.getChartComputator();
        this.f15831c.m6607a();
        C0571r.m1361e(this);
    }

    public void setCurrentViewport(Viewport viewport) {
        if (viewport != null) {
            this.f15832d.mo2101b(viewport);
        }
        C0571r.m1361e(this);
    }

    public void setCurrentViewportWithAnimation(Viewport viewport) {
        if (viewport != null) {
            this.f15834f.mo2093a();
            this.f15834f.mo2095a(getCurrentViewport(), viewport);
        }
        C0571r.m1361e(this);
    }

    public void setDataAnimationListener(C2405a c2405a) {
        this.f15833e.mo2092a(c2405a);
    }

    public void setInteractive(boolean z) {
        this.f15835g = z;
    }

    public void setMaxZoom(float f) {
        this.f15829a.m6593c(f);
        C0571r.m1361e(this);
    }

    public void setMaximumViewport(Viewport viewport) {
        this.f15832d.mo2098a(viewport);
        C0571r.m1361e(this);
    }

    public void setScrollEnabled(boolean z) {
        this.f15831c.m6612b(z);
    }

    public void setValueSelectionEnabled(boolean z) {
        this.f15831c.m6616d(z);
    }

    public void setValueTouchEnabled(boolean z) {
        this.f15831c.m6615c(z);
    }

    public void setViewportAnimationListener(C2405a c2405a) {
        this.f15834f.mo2094a(c2405a);
    }

    public void setViewportCalculationEnabled(boolean z) {
        this.f15832d.mo2099a(z);
    }

    public void setViewportChangeListener(C2424d c2424d) {
        this.f15829a.m6584a(c2424d);
    }

    public void setZoomEnabled(boolean z) {
        this.f15831c.m6609a(z);
    }

    public void setZoomType(C2421e c2421e) {
        this.f15831c.m6608a(c2421e);
    }
}
