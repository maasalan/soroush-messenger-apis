package lecho.lib.hellocharts.p221d;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.ViewParent;
import lecho.lib.hellocharts.model.C2438h;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.p219b.C2410a;
import lecho.lib.hellocharts.p221d.C2415a.C2414a;
import lecho.lib.hellocharts.p224g.C2427c;
import lecho.lib.hellocharts.view.C2440b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C2418b {
    protected GestureDetector f7976a;
    protected ScaleGestureDetector f7977b;
    protected C2415a f7978c;
    protected C2419c f7979d;
    protected C2440b f7980e;
    protected C2410a f7981f;
    protected C2427c f7982g;
    protected boolean f7983h = true;
    protected boolean f7984i = true;
    protected boolean f7985j = true;
    protected boolean f7986k = false;
    protected C2438h f7987l = new C2438h();
    protected C2438h f7988m = new C2438h();
    protected C2438h f7989n = new C2438h();
    protected ViewParent f7990o;
    protected int f7991p;

    protected class C2416a extends SimpleOnGestureListener {
        protected C2414a f7973a = new C2414a();
        final /* synthetic */ C2418b f7974b;

        protected C2416a(C2418b c2418b) {
            this.f7974b = c2418b;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (!this.f7974b.f7983h) {
                return false;
            }
            C2419c c2419c = this.f7974b.f7979d;
            C2410a c2410a = this.f7974b.f7981f;
            c2419c.f7992a.f8006c = true;
            c2419c.f7996e.m6647a(c2410a.m6594d());
            if (!c2410a.m6587a(motionEvent.getX(), motionEvent.getY(), c2419c.f7994c)) {
                return false;
            }
            C2422f c2422f = c2419c.f7992a;
            c2422f.f8008e = SystemClock.elapsedRealtime();
            c2422f.f8009f = 0.25f;
            c2422f.f8006c = false;
            c2422f.f8007d = BallPulseIndicator.SCALE;
            return true;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            if (!this.f7974b.f7984i) {
                return false;
            }
            this.f7974b.m6606d();
            C2415a c2415a = this.f7974b.f7978c;
            C2410a c2410a = this.f7974b.f7981f;
            c2415a.f7972c.f2053a.abortAnimation();
            c2415a.f7970a.m6647a(c2410a.m6594d());
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!this.f7974b.f7984i) {
                return false;
            }
            C2415a c2415a = this.f7974b.f7978c;
            int i = (int) (-f);
            int i2 = (int) (-f2);
            C2410a c2410a = this.f7974b.f7981f;
            c2410a.m6583a(c2415a.f7971b);
            c2415a.f7970a.m6647a(c2410a.m6594d());
            int a = (int) ((((float) c2415a.f7971b.x) * (c2415a.f7970a.f8050a - c2410a.m6595e().f8050a)) / c2410a.m6595e().m6645a());
            int b = (int) ((((float) c2415a.f7971b.y) * (c2410a.m6595e().f8051b - c2415a.f7970a.f8051b)) / c2410a.m6595e().m6648b());
            c2415a.f7972c.f2053a.abortAnimation();
            int width = c2410a.m6589b().width();
            int height = c2410a.m6589b().height();
            int i3 = (c2415a.f7971b.x - width) + 1;
            int i4 = (c2415a.f7971b.y - height) + 1;
            c2415a.f7972c.f2053a.fling(a, b, i, i2, 0, i3, 0, i4);
            return true;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z = false;
            if (this.f7974b.f7984i) {
                C2415a c2415a = this.f7974b.f7978c;
                C2410a c2410a = this.f7974b.f7981f;
                C2414a c2414a = this.f7973a;
                Viewport e = c2410a.m6595e();
                Viewport f3 = c2410a.m6596f();
                Viewport d = c2410a.m6594d();
                Rect b = c2410a.m6589b();
                boolean z2 = d.f8050a > e.f8050a;
                boolean z3 = d.f8052c < e.f8052c;
                boolean z4 = d.f8051b < e.f8051b;
                boolean z5 = d.f8053d > e.f8053d;
                if (!z2 || f > 0.0f) {
                    if (!z3 || f < 0.0f) {
                        z2 = false;
                        if (!z4 || f2 > 0.0f) {
                            if (z5 || f2 < 0.0f) {
                                z5 = false;
                                if (z2 || z5) {
                                    c2410a.m6583a(c2415a.f7971b);
                                    c2410a.m6579a(d.f8050a + ((f * f3.m6645a()) / ((float) b.width())), d.f8051b + (((-f2) * f3.m6648b()) / ((float) b.height())));
                                }
                                c2414a.f7968a = z2;
                                c2414a.f7969b = z5;
                                if (z2 || z5) {
                                    z = true;
                                }
                                C2418b.m6604a(this.f7974b, this.f7973a);
                            }
                        }
                        z5 = true;
                        c2410a.m6583a(c2415a.f7971b);
                        c2410a.m6579a(d.f8050a + ((f * f3.m6645a()) / ((float) b.width())), d.f8051b + (((-f2) * f3.m6648b()) / ((float) b.height())));
                        c2414a.f7968a = z2;
                        c2414a.f7969b = z5;
                        z = true;
                        C2418b.m6604a(this.f7974b, this.f7973a);
                    }
                }
                z2 = true;
                if (z5) {
                }
                z5 = false;
                c2410a.m6583a(c2415a.f7971b);
                c2410a.m6579a(d.f8050a + ((f * f3.m6645a()) / ((float) b.width())), d.f8051b + (((-f2) * f3.m6648b()) / ((float) b.height())));
                c2414a.f7968a = z2;
                c2414a.f7969b = z5;
                z = true;
                C2418b.m6604a(this.f7974b, this.f7973a);
            }
            return z;
        }
    }

    protected class C2417b extends SimpleOnScaleGestureListener {
        final /* synthetic */ C2418b f7975a;

        protected C2417b(C2418b c2418b) {
            this.f7975a = c2418b;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (!this.f7975a.f7983h) {
                return false;
            }
            float scaleFactor = 2.0f - scaleGestureDetector.getScaleFactor();
            if (Float.isInfinite(scaleFactor)) {
                scaleFactor = BallPulseIndicator.SCALE;
            }
            C2419c c2419c = this.f7975a.f7979d;
            C2410a c2410a = this.f7975a.f7981f;
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float a = c2410a.m6594d().m6645a() * scaleFactor;
            scaleFactor *= c2410a.m6594d().m6648b();
            if (!c2410a.m6587a(focusX, focusY, c2419c.f7995d)) {
                return false;
            }
            float width = c2419c.f7995d.x - ((focusX - ((float) c2410a.m6589b().left)) * (a / ((float) c2410a.m6589b().width())));
            float height = c2419c.f7995d.y + ((focusY - ((float) c2410a.m6589b().top)) * (scaleFactor / ((float) c2410a.m6589b().height())));
            c2419c.m6617a(c2410a, width, height, width + a, height - scaleFactor);
            return true;
        }
    }

    public C2418b(Context context, C2440b c2440b) {
        this.f7980e = c2440b;
        this.f7981f = c2440b.getChartComputator();
        this.f7982g = c2440b.getChartRenderer();
        this.f7976a = new GestureDetector(context, new C2416a(this));
        this.f7977b = new ScaleGestureDetector(context, new C2417b(this));
        this.f7978c = new C2415a(context);
        this.f7979d = new C2419c(C2421e.HORIZONTAL_AND_VERTICAL);
    }

    static /* synthetic */ void m6604a(C2418b c2418b, C2414a c2414a) {
        if (c2418b.f7990o != null) {
            if (C2420d.f7997a == c2418b.f7991p && !c2414a.f7968a && !c2418b.f7977b.isInProgress()) {
                c2418b.f7990o.requestDisallowInterceptTouchEvent(false);
            } else if (!(C2420d.f7998b != c2418b.f7991p || c2414a.f7969b || c2418b.f7977b.isInProgress())) {
                c2418b.f7990o.requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    private boolean m6605a(float f, float f2) {
        this.f7989n.m6664a(this.f7988m);
        this.f7988m.m6662a();
        if (this.f7982g.mo3158a(f, f2)) {
            this.f7988m.m6664a(this.f7982g.mo2106g());
        }
        return (this.f7989n.m6665b() && this.f7988m.m6665b() && !this.f7989n.equals(this.f7988m)) ? false : this.f7982g.mo2102c();
    }

    private void m6606d() {
        if (this.f7990o != null) {
            this.f7990o.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void m6607a() {
        this.f7981f = this.f7980e.getChartComputator();
        this.f7982g = this.f7980e.getChartRenderer();
    }

    public final void m6608a(C2421e c2421e) {
        this.f7979d.f7993b = c2421e;
    }

    public final void m6609a(boolean z) {
        this.f7983h = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m6610a(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = r5.f7976a;
        r0 = r0.onTouchEvent(r6);
        r1 = r5.f7977b;
        r1 = r1.onTouchEvent(r6);
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x0015;
    L_0x0010:
        if (r0 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r0 = r2;
        goto L_0x0016;
    L_0x0015:
        r0 = r3;
    L_0x0016:
        r1 = r5.f7983h;
        if (r1 == 0) goto L_0x0025;
    L_0x001a:
        r1 = r5.f7977b;
        r1 = r1.isInProgress();
        if (r1 == 0) goto L_0x0025;
    L_0x0022:
        r5.m6606d();
    L_0x0025:
        r1 = r5.f7985j;
        if (r1 == 0) goto L_0x00c2;
    L_0x0029:
        r1 = r6.getAction();
        switch(r1) {
            case 0: goto L_0x008f;
            case 1: goto L_0x0058;
            case 2: goto L_0x0041;
            case 3: goto L_0x0032;
            default: goto L_0x0030;
        };
    L_0x0030:
        goto L_0x00b9;
    L_0x0032:
        r6 = r5.f7982g;
        r6 = r6.mo2102c();
        if (r6 == 0) goto L_0x00b9;
    L_0x003a:
        r6 = r5.f7982g;
        r6.mo2103d();
        goto L_0x00b7;
    L_0x0041:
        r1 = r5.f7982g;
        r1 = r1.mo2102c();
        if (r1 == 0) goto L_0x00b9;
    L_0x0049:
        r1 = r6.getX();
        r6 = r6.getY();
        r6 = r5.m6605a(r1, r6);
        if (r6 != 0) goto L_0x00b9;
    L_0x0057:
        goto L_0x003a;
    L_0x0058:
        r1 = r5.f7982g;
        r1 = r1.mo2102c();
        if (r1 == 0) goto L_0x00b9;
    L_0x0060:
        r1 = r6.getX();
        r6 = r6.getY();
        r6 = r5.m6605a(r1, r6);
        if (r6 == 0) goto L_0x003a;
    L_0x006e:
        r6 = r5.f7986k;
        if (r6 == 0) goto L_0x0089;
    L_0x0072:
        r6 = r5.f7987l;
        r1 = r5.f7988m;
        r6 = r6.equals(r1);
        if (r6 != 0) goto L_0x00b7;
    L_0x007c:
        r6 = r5.f7987l;
        r1 = r5.f7988m;
        r6.m6664a(r1);
    L_0x0083:
        r6 = r5.f7980e;
        r6.mo3164c();
        goto L_0x00b7;
    L_0x0089:
        r6 = r5.f7980e;
        r6.mo3164c();
        goto L_0x003a;
    L_0x008f:
        r1 = r5.f7982g;
        r1 = r1.mo2102c();
        r4 = r6.getX();
        r6 = r6.getY();
        r6 = r5.m6605a(r4, r6);
        if (r1 == r6) goto L_0x00b9;
    L_0x00a3:
        r6 = r5.f7986k;
        if (r6 == 0) goto L_0x00b7;
    L_0x00a7:
        r6 = r5.f7987l;
        r6.m6662a();
        if (r1 == 0) goto L_0x00b7;
    L_0x00ae:
        r6 = r5.f7982g;
        r6 = r6.mo2102c();
        if (r6 != 0) goto L_0x00b7;
    L_0x00b6:
        goto L_0x0083;
    L_0x00b7:
        r6 = r3;
        goto L_0x00ba;
    L_0x00b9:
        r6 = r2;
    L_0x00ba:
        if (r6 != 0) goto L_0x00c1;
    L_0x00bc:
        if (r0 == 0) goto L_0x00bf;
    L_0x00be:
        goto L_0x00c1;
    L_0x00bf:
        r0 = r2;
        return r0;
    L_0x00c1:
        r0 = r3;
    L_0x00c2:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: lecho.lib.hellocharts.d.b.a(android.view.MotionEvent):boolean");
    }

    public final boolean m6611a(MotionEvent motionEvent, ViewParent viewParent, int i) {
        this.f7990o = viewParent;
        this.f7991p = i;
        return m6610a(motionEvent);
    }

    public final void m6612b(boolean z) {
        this.f7984i = z;
    }

    public final boolean m6613b() {
        boolean z;
        C2419c c2419c;
        C2410a c2410a;
        C2422f c2422f;
        long elapsedRealtime;
        boolean z2;
        float a;
        float b;
        float a2;
        float b2;
        boolean z3 = false;
        if (this.f7984i) {
            C2415a c2415a = this.f7978c;
            C2410a c2410a2 = this.f7981f;
            if (c2415a.f7972c.f2053a.computeScrollOffset()) {
                Viewport e = c2410a2.m6595e();
                c2410a2.m6583a(c2415a.f7971b);
                c2410a2.m6579a(e.f8050a + ((e.m6645a() * ((float) c2415a.f7972c.f2053a.getCurrX())) / ((float) c2415a.f7971b.x)), e.f8051b - ((e.m6648b() * ((float) c2415a.f7972c.f2053a.getCurrY())) / ((float) c2415a.f7971b.y)));
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z = true;
                if (this.f7983h) {
                    return z;
                }
                c2419c = this.f7979d;
                c2410a = this.f7981f;
                c2422f = c2419c.f7992a;
                if (!c2422f.f8006c) {
                    elapsedRealtime = SystemClock.elapsedRealtime() - c2422f.f8008e;
                    if (elapsedRealtime < c2422f.f8005b) {
                        c2422f.f8006c = true;
                        c2422f.f8007d = c2422f.f8009f;
                    } else {
                        c2422f.f8007d = c2422f.f8009f * c2422f.f8004a.getInterpolation((((float) elapsedRealtime) * BallPulseIndicator.SCALE) / ((float) c2422f.f8005b));
                        z2 = true;
                        if (z2) {
                            a = (BallPulseIndicator.SCALE - c2419c.f7992a.f8007d) * c2419c.f7996e.m6645a();
                            b = (BallPulseIndicator.SCALE - c2419c.f7992a.f8007d) * c2419c.f7996e.m6648b();
                            a2 = (c2419c.f7994c.x - c2419c.f7996e.f8050a) / c2419c.f7996e.m6645a();
                            b2 = (c2419c.f7994c.y - c2419c.f7996e.f8053d) / c2419c.f7996e.m6648b();
                            c2419c.m6617a(c2410a, c2419c.f7994c.x - (a * a2), c2419c.f7994c.y + ((BallPulseIndicator.SCALE - b2) * b), (a * (BallPulseIndicator.SCALE - a2)) + c2419c.f7994c.x, c2419c.f7994c.y - (b * b2));
                            z3 = true;
                        }
                        return z3 ? true : z;
                    }
                }
                z2 = false;
                if (z2) {
                    a = (BallPulseIndicator.SCALE - c2419c.f7992a.f8007d) * c2419c.f7996e.m6645a();
                    b = (BallPulseIndicator.SCALE - c2419c.f7992a.f8007d) * c2419c.f7996e.m6648b();
                    a2 = (c2419c.f7994c.x - c2419c.f7996e.f8050a) / c2419c.f7996e.m6645a();
                    b2 = (c2419c.f7994c.y - c2419c.f7996e.f8053d) / c2419c.f7996e.m6648b();
                    c2419c.m6617a(c2410a, c2419c.f7994c.x - (a * a2), c2419c.f7994c.y + ((BallPulseIndicator.SCALE - b2) * b), (a * (BallPulseIndicator.SCALE - a2)) + c2419c.f7994c.x, c2419c.f7994c.y - (b * b2));
                    z3 = true;
                }
                if (z3) {
                }
            }
        }
        z = false;
        if (this.f7983h) {
            return z;
        }
        c2419c = this.f7979d;
        c2410a = this.f7981f;
        c2422f = c2419c.f7992a;
        if (c2422f.f8006c) {
            elapsedRealtime = SystemClock.elapsedRealtime() - c2422f.f8008e;
            if (elapsedRealtime < c2422f.f8005b) {
                c2422f.f8007d = c2422f.f8009f * c2422f.f8004a.getInterpolation((((float) elapsedRealtime) * BallPulseIndicator.SCALE) / ((float) c2422f.f8005b));
                z2 = true;
                if (z2) {
                    a = (BallPulseIndicator.SCALE - c2419c.f7992a.f8007d) * c2419c.f7996e.m6645a();
                    b = (BallPulseIndicator.SCALE - c2419c.f7992a.f8007d) * c2419c.f7996e.m6648b();
                    a2 = (c2419c.f7994c.x - c2419c.f7996e.f8050a) / c2419c.f7996e.m6645a();
                    b2 = (c2419c.f7994c.y - c2419c.f7996e.f8053d) / c2419c.f7996e.m6648b();
                    c2419c.m6617a(c2410a, c2419c.f7994c.x - (a * a2), c2419c.f7994c.y + ((BallPulseIndicator.SCALE - b2) * b), (a * (BallPulseIndicator.SCALE - a2)) + c2419c.f7994c.x, c2419c.f7994c.y - (b * b2));
                    z3 = true;
                }
                if (z3) {
                }
            }
            c2422f.f8006c = true;
            c2422f.f8007d = c2422f.f8009f;
        }
        z2 = false;
        if (z2) {
            a = (BallPulseIndicator.SCALE - c2419c.f7992a.f8007d) * c2419c.f7996e.m6645a();
            b = (BallPulseIndicator.SCALE - c2419c.f7992a.f8007d) * c2419c.f7996e.m6648b();
            a2 = (c2419c.f7994c.x - c2419c.f7996e.f8050a) / c2419c.f7996e.m6645a();
            b2 = (c2419c.f7994c.y - c2419c.f7996e.f8053d) / c2419c.f7996e.m6648b();
            c2419c.m6617a(c2410a, c2419c.f7994c.x - (a * a2), c2419c.f7994c.y + ((BallPulseIndicator.SCALE - b2) * b), (a * (BallPulseIndicator.SCALE - a2)) + c2419c.f7994c.x, c2419c.f7994c.y - (b * b2));
            z3 = true;
        }
        if (z3) {
        }
    }

    public final C2421e m6614c() {
        return this.f7979d.f7993b;
    }

    public final void m6615c(boolean z) {
        this.f7985j = z;
    }

    public final void m6616d(boolean z) {
        this.f7986k = z;
    }
}
