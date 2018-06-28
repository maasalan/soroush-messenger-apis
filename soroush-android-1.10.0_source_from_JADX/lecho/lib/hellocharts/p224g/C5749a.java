package lecho.lib.hellocharts.p224g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import lecho.lib.hellocharts.model.C2434d;
import lecho.lib.hellocharts.model.C2438h;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.p219b.C2410a;
import lecho.lib.hellocharts.p225h.C2429b;
import lecho.lib.hellocharts.view.C2440b;

public abstract class C5749a implements C2427c {
    public int f15803a = 4;
    protected C2440b f15804b;
    protected C2410a f15805c;
    protected Paint f15806d = new Paint();
    protected Paint f15807e = new Paint();
    protected RectF f15808f = new RectF();
    protected FontMetricsInt f15809g = new FontMetricsInt();
    protected boolean f15810h = true;
    protected float f15811i;
    protected float f15812j;
    protected C2438h f15813k = new C2438h();
    protected char[] f15814l = new char[64];
    protected int f15815m;
    protected int f15816n;
    protected boolean f15817o;
    protected boolean f15818p;

    public C5749a(Context context, C2440b c2440b) {
        this.f15811i = context.getResources().getDisplayMetrics().density;
        this.f15812j = context.getResources().getDisplayMetrics().scaledDensity;
        this.f15804b = c2440b;
        this.f15805c = c2440b.getChartComputator();
        this.f15816n = C2429b.m6640a(this.f15811i, this.f15803a);
        this.f15815m = this.f15816n;
        this.f15806d.setAntiAlias(true);
        this.f15806d.setStyle(Style.FILL);
        this.f15806d.setTextAlign(Align.LEFT);
        this.f15806d.setTypeface(Typeface.defaultFromStyle(1));
        this.f15806d.setColor(-1);
        this.f15807e.setAntiAlias(true);
        this.f15807e.setStyle(Style.FILL);
    }

    public final void mo2097a() {
        this.f15805c = this.f15804b.getChartComputator();
    }

    protected final void m12870a(Canvas canvas, char[] cArr, int i, int i2, int i3) {
        float f;
        float f2;
        if (this.f15817o) {
            if (this.f15818p) {
                this.f15807e.setColor(i3);
            }
            canvas.drawRect(this.f15808f, this.f15807e);
            f = this.f15808f.left + ((float) this.f15816n);
            f2 = this.f15808f.bottom - ((float) this.f15816n);
        } else {
            f = this.f15808f.left;
            f2 = this.f15808f.bottom;
        }
        canvas.drawText(cArr, i, i2, f, f2, this.f15806d);
    }

    public final void mo2098a(Viewport viewport) {
        if (viewport != null) {
            this.f15805c.m6591b(viewport);
        }
    }

    public final void mo2099a(boolean z) {
        this.f15810h = z;
    }

    public void mo2100b() {
        C2434d chartData = this.f15804b.getChartData();
        Typeface g = this.f15804b.getChartData().mo2113g();
        if (g != null) {
            this.f15806d.setTypeface(g);
        }
        this.f15806d.setColor(chartData.mo2111e());
        this.f15806d.setTextSize((float) C2429b.m6642b(this.f15812j, chartData.mo2112f()));
        this.f15806d.getFontMetricsInt(this.f15809g);
        this.f15817o = chartData.mo2114h();
        this.f15818p = chartData.mo2115i();
        this.f15807e.setColor(chartData.mo2116j());
        this.f15813k.m6662a();
    }

    public final void mo2101b(Viewport viewport) {
        if (viewport != null) {
            this.f15805c.m6585a(viewport);
        }
    }

    public final boolean mo2102c() {
        return this.f15813k.m6665b();
    }

    public final void mo2103d() {
        this.f15813k.m6662a();
    }

    public final Viewport mo2104e() {
        return this.f15805c.m6595e();
    }

    public final Viewport mo2105f() {
        return this.f15805c.m6594d();
    }

    public final C2438h mo2106g() {
        return this.f15813k;
    }
}
