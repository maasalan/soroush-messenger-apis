package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.C0571r;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;

public abstract class C0607a implements OnTouchListener {
    private static final int f1984r = ViewConfiguration.getTapTimeout();
    final C0605a f1985a = new C0605a();
    final View f1986b;
    boolean f1987c;
    boolean f1988d;
    boolean f1989e;
    private final Interpolator f1990f = new AccelerateInterpolator();
    private Runnable f1991g;
    private float[] f1992h = new float[]{0.0f, 0.0f};
    private float[] f1993i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private int f1994j;
    private int f1995k;
    private float[] f1996l = new float[]{0.0f, 0.0f};
    private float[] f1997m = new float[]{0.0f, 0.0f};
    private float[] f1998n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean f1999o;
    private boolean f2000p;
    private boolean f2001q;

    private static class C0605a {
        int f1972a;
        int f1973b;
        float f1974c;
        float f1975d;
        long f1976e = Long.MIN_VALUE;
        long f1977f = 0;
        int f1978g = 0;
        int f1979h = 0;
        long f1980i = -1;
        float f1981j;
        int f1982k;

        C0605a() {
        }

        final float m1463a(long j) {
            if (j < this.f1976e) {
                return 0.0f;
            }
            if (this.f1980i >= 0) {
                if (j >= this.f1980i) {
                    return (BallPulseIndicator.SCALE - this.f1981j) + (this.f1981j * C0607a.m1465a(((float) (j - this.f1980i)) / ((float) this.f1982k), 0.0f, BallPulseIndicator.SCALE));
                }
            }
            return 0.5f * C0607a.m1465a(((float) (j - this.f1976e)) / ((float) this.f1972a), 0.0f, BallPulseIndicator.SCALE);
        }
    }

    private class C0606b implements Runnable {
        final /* synthetic */ C0607a f1983a;

        C0606b(C0607a c0607a) {
            this.f1983a = c0607a;
        }

        public final void run() {
            if (this.f1983a.f1989e) {
                C0605a c0605a;
                if (this.f1983a.f1987c) {
                    this.f1983a.f1987c = false;
                    c0605a = this.f1983a.f1985a;
                    c0605a.f1976e = AnimationUtils.currentAnimationTimeMillis();
                    c0605a.f1980i = -1;
                    c0605a.f1977f = c0605a.f1976e;
                    c0605a.f1981j = 0.5f;
                    c0605a.f1978g = 0;
                    c0605a.f1979h = 0;
                }
                c0605a = this.f1983a.f1985a;
                boolean z = c0605a.f1980i > 0 && AnimationUtils.currentAnimationTimeMillis() > c0605a.f1980i + ((long) c0605a.f1982k);
                if (!z) {
                    if (this.f1983a.m1470a()) {
                        if (this.f1983a.f1988d) {
                            this.f1983a.f1988d = false;
                            C0607a c0607a = this.f1983a;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            c0607a.f1986b.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (c0605a.f1977f == 0) {
                            throw new RuntimeException("Cannot compute scroll delta before calling start()");
                        }
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        float a = c0605a.m1463a(currentAnimationTimeMillis);
                        float f = ((-4.0f * a) * a) + (4.0f * a);
                        long j = currentAnimationTimeMillis - c0605a.f1977f;
                        c0605a.f1977f = currentAnimationTimeMillis;
                        float f2 = ((float) j) * f;
                        c0605a.f1978g = (int) (c0605a.f1974c * f2);
                        c0605a.f1979h = (int) (f2 * c0605a.f1975d);
                        this.f1983a.mo436a(c0605a.f1979h);
                        C0571r.m1343a(this.f1983a.f1986b, (Runnable) this);
                        return;
                    }
                }
                this.f1983a.f1989e = false;
            }
        }
    }

    public C0607a(View view) {
        this.f1986b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((315.0f * displayMetrics.density) + 0.5f);
        float f = ((float) i) / 1000.0f;
        this.f1998n[0] = f;
        this.f1998n[1] = f;
        float f2 = ((float) i2) / 1000.0f;
        this.f1997m[0] = f2;
        this.f1997m[1] = f2;
        this.f1994j = 1;
        this.f1993i[0] = Float.MAX_VALUE;
        this.f1993i[1] = Float.MAX_VALUE;
        this.f1992h[0] = 0.2f;
        this.f1992h[1] = 0.2f;
        this.f1996l[0] = 0.001f;
        this.f1996l[1] = 0.001f;
        this.f1995k = f1984r;
        this.f1985a.f1972a = PacketWriter.QUEUE_SIZE;
        this.f1985a.f1973b = PacketWriter.QUEUE_SIZE;
    }

    private float m1464a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f1994j) {
            case 0:
            case 1:
                if (f < f2) {
                    return f >= 0.0f ? BallPulseIndicator.SCALE - (f / f2) : (this.f1989e && this.f1994j == 1) ? BallPulseIndicator.SCALE : 0.0f;
                }
                break;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                break;
            default:
                return 0.0f;
        }
    }

    static float m1465a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    private float m1466a(int i, float f, float f2, float f3) {
        float a = C0607a.m1465a(this.f1992h[i] * f2, 0.0f, this.f1993i[i]);
        f = m1464a(f2 - f, a) - m1464a(f, a);
        if (f < 0.0f) {
            f = -this.f1990f.getInterpolation(-f);
        } else if (f > 0.0f) {
            f = this.f1990f.getInterpolation(f);
        } else {
            f = 0.0f;
            if (f == 0.0f) {
                return 0.0f;
            }
            f2 = this.f1996l[i];
            a = this.f1997m[i];
            float f4 = this.f1998n[i];
            f2 *= f3;
            return f <= 0.0f ? C0607a.m1465a(f * f2, a, f4) : -C0607a.m1465a((-f) * f2, a, f4);
        }
        f = C0607a.m1465a(f, -1.0f, BallPulseIndicator.SCALE);
        if (f == 0.0f) {
            return 0.0f;
        }
        f2 = this.f1996l[i];
        a = this.f1997m[i];
        float f42 = this.f1998n[i];
        f2 *= f3;
        if (f <= 0.0f) {
        }
    }

    private void m1467b() {
        int i = 0;
        if (this.f1987c) {
            this.f1989e = false;
            return;
        }
        C0605a c0605a = this.f1985a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - c0605a.f1976e);
        int i3 = c0605a.f1973b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0605a.f1982k = i;
        c0605a.f1981j = c0605a.m1463a(currentAnimationTimeMillis);
        c0605a.f1980i = currentAnimationTimeMillis;
    }

    public final C0607a m1468a(boolean z) {
        if (this.f2000p && !z) {
            m1467b();
        }
        this.f2000p = z;
        return this;
    }

    public abstract void mo436a(int i);

    final boolean m1470a() {
        C0605a c0605a = this.f1985a;
        int abs = (int) (c0605a.f1975d / Math.abs(c0605a.f1975d));
        int abs2 = (int) (c0605a.f1974c / Math.abs(c0605a.f1974c));
        if (abs != 0) {
            if (mo437b(abs)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean mo437b(int i);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f2000p) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f1988d = true;
                this.f1999o = false;
                break;
            case 1:
            case 3:
                m1467b();
                break;
            case 2:
                break;
            default:
                break;
        }
        float a = m1466a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f1986b.getWidth());
        float a2 = m1466a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f1986b.getHeight());
        C0605a c0605a = this.f1985a;
        c0605a.f1974c = a;
        c0605a.f1975d = a2;
        if (!this.f1989e && m1470a()) {
            if (this.f1991g == null) {
                this.f1991g = new C0606b(this);
            }
            this.f1989e = true;
            this.f1987c = true;
            if (this.f1999o || this.f1995k <= 0) {
                this.f1991g.run();
            } else {
                C0571r.m1344a(this.f1986b, this.f1991g, (long) this.f1995k);
            }
            this.f1999o = true;
        }
        return this.f2001q && this.f1989e;
    }
}
