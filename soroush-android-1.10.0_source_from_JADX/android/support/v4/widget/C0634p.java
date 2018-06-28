package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.C0571r;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C0634p {
    private static final Interpolator f2060v = new C06311();
    int f2061a;
    public int f2062b;
    float[] f2063c;
    float[] f2064d;
    float[] f2065e;
    float[] f2066f;
    float f2067g;
    int f2068h;
    int f2069i;
    public View f2070j;
    private int f2071k = -1;
    private int[] f2072l;
    private int[] f2073m;
    private int[] f2074n;
    private int f2075o;
    private VelocityTracker f2076p;
    private float f2077q;
    private OverScroller f2078r;
    private final C0633a f2079s;
    private boolean f2080t;
    private final ViewGroup f2081u;
    private final Runnable f2082w = new C06322(this);

    static class C06311 implements Interpolator {
        C06311() {
        }

        public final float getInterpolation(float f) {
            f -= BallPulseIndicator.SCALE;
            return ((((f * f) * f) * f) * f) + BallPulseIndicator.SCALE;
        }
    }

    class C06322 implements Runnable {
        final /* synthetic */ C0634p f2059a;

        C06322(C0634p c0634p) {
            this.f2059a = c0634p;
        }

        public final void run() {
            this.f2059a.m1568b(0);
        }
    }

    public static abstract class C0633a {
        public int mo141a() {
            return 0;
        }

        public int mo170a(View view) {
            return 0;
        }

        public void mo142a(int i) {
        }

        public void mo413a(int i, int i2) {
        }

        public void mo143a(View view, float f, float f2) {
        }

        public void mo144a(View view, int i, int i2) {
        }

        public abstract boolean mo145a(View view, int i);

        public int mo146b(View view, int i) {
            return 0;
        }

        public int mo147c(View view, int i) {
            return 0;
        }

        public void mo414d() {
        }

        public void mo171d(View view, int i) {
        }
    }

    private C0634p(Context context, ViewGroup viewGroup, C0633a c0633a) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (c0633a == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f2081u = viewGroup;
            this.f2079s = c0633a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f2068h = (int) ((20.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
            this.f2062b = viewConfiguration.getScaledTouchSlop();
            this.f2077q = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f2067g = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f2078r = new OverScroller(context, f2060v);
        }
    }

    private static float m1543a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            if (f > 0.0f) {
                return f3;
            }
            f = -f3;
        }
        return f;
    }

    private int m1544a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f2081u.getWidth();
        float f = (float) (width / 2);
        f += ((float) Math.sin((double) ((Math.min(BallPulseIndicator.SCALE, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f;
        i2 = Math.abs(i2);
        return Math.min(i2 > 0 ? 4 * Math.round(1000.0f * Math.abs(f / ((float) i2))) : (int) (((((float) Math.abs(i)) / ((float) i3)) + BallPulseIndicator.SCALE) * 256.0f), IjkMediaCodecInfo.RANK_LAST_CHANCE);
    }

    public static C0634p m1545a(ViewGroup viewGroup, float f, C0633a c0633a) {
        C0634p a = C0634p.m1546a(viewGroup, c0633a);
        a.f2062b = (int) (((float) a.f2062b) * (BallPulseIndicator.SCALE / f));
        return a;
    }

    public static C0634p m1546a(ViewGroup viewGroup, C0633a c0633a) {
        return new C0634p(viewGroup.getContext(), viewGroup, c0633a);
    }

    private void m1547a(float f, float f2) {
        this.f2080t = true;
        this.f2079s.mo143a(this.f2070j, f, f2);
        this.f2080t = false;
        if (this.f2061a == 1) {
            m1568b(0);
        }
    }

    private void m1548a(float f, float f2, int i) {
        int i2 = 0;
        if (this.f2063c == null || this.f2063c.length <= i) {
            int i3 = i + 1;
            Object obj = new float[i3];
            Object obj2 = new float[i3];
            Object obj3 = new float[i3];
            Object obj4 = new float[i3];
            Object obj5 = new int[i3];
            Object obj6 = new int[i3];
            Object obj7 = new int[i3];
            if (this.f2063c != null) {
                System.arraycopy(this.f2063c, 0, obj, 0, this.f2063c.length);
                System.arraycopy(this.f2064d, 0, obj2, 0, this.f2064d.length);
                System.arraycopy(this.f2065e, 0, obj3, 0, this.f2065e.length);
                System.arraycopy(this.f2066f, 0, obj4, 0, this.f2066f.length);
                System.arraycopy(this.f2072l, 0, obj5, 0, this.f2072l.length);
                System.arraycopy(this.f2073m, 0, obj6, 0, this.f2073m.length);
                System.arraycopy(this.f2074n, 0, obj7, 0, this.f2074n.length);
            }
            this.f2063c = obj;
            this.f2064d = obj2;
            this.f2065e = obj3;
            this.f2066f = obj4;
            this.f2072l = obj5;
            this.f2073m = obj6;
            this.f2074n = obj7;
        }
        float[] fArr = this.f2063c;
        this.f2065e[i] = f;
        fArr[i] = f;
        fArr = this.f2064d;
        this.f2066f[i] = f2;
        fArr[i] = f2;
        int[] iArr = this.f2072l;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f2081u.getLeft() + this.f2068h) {
            i2 = 1;
        }
        if (i5 < this.f2081u.getTop() + this.f2068h) {
            i2 |= 4;
        }
        if (i4 > this.f2081u.getRight() - this.f2068h) {
            i2 |= 2;
        }
        if (i5 > this.f2081u.getBottom() - this.f2068h) {
            i2 |= 8;
        }
        iArr[i] = i2;
        this.f2075o |= 1 << i;
    }

    private boolean m1549a(float f, float f2, int i, int i2) {
        f = Math.abs(f);
        return ((this.f2072l[i] & i2) != i2 || (this.f2069i & i2) == 0 || (this.f2074n[i] & i2) == i2 || (this.f2073m[i] & i2) == i2 || ((f <= ((float) this.f2062b) && Math.abs(f2) <= ((float) this.f2062b)) || (this.f2073m[i] & i2) != 0 || f <= ((float) this.f2062b))) ? false : true;
    }

    private boolean m1550a(int i, int i2, int i3, int i4) {
        int left = this.f2070j.getLeft();
        int top = this.f2070j.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f2078r.abortAnimation();
            m1568b(0);
            return false;
        }
        float f;
        float f2;
        float f3;
        View view = this.f2070j;
        i2 = C0634p.m1552b(i3, (int) this.f2067g, (int) this.f2077q);
        i3 = C0634p.m1552b(i4, (int) this.f2067g, (int) this.f2077q);
        i4 = Math.abs(i5);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i3);
        int i7 = abs2 + abs3;
        int i8 = i4 + abs;
        if (i2 != 0) {
            f = (float) abs2;
            f2 = (float) i7;
        } else {
            f = (float) i4;
            f2 = (float) i8;
        }
        f /= f2;
        if (i3 != 0) {
            f3 = (float) abs3;
            f2 = (float) i7;
        } else {
            f3 = (float) abs;
            f2 = (float) i8;
        }
        f3 /= f2;
        this.f2078r.startScroll(left, top, i5, i6, (int) ((((float) m1544a(i5, i2, this.f2079s.mo170a(view))) * f) + (((float) m1544a(i6, i3, this.f2079s.mo141a())) * f3)));
        m1568b(2);
        return true;
    }

    private boolean m1551a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f2079s.mo170a(view) > 0;
        boolean z2 = this.f2079s.mo141a() > 0;
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.f2062b * this.f2062b)) : z ? Math.abs(f) > ((float) this.f2062b) : z2 && Math.abs(f2) > ((float) this.f2062b);
    }

    private static int m1552b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            if (i > 0) {
                return i3;
            }
            i = -i3;
        }
        return i;
    }

    private void m1553b(float f, float f2, int i) {
        int a = m1549a(f, f2, i, 1);
        if (m1549a(f2, f, i, 4)) {
            a |= 4;
        }
        if (m1549a(f, f2, i, 2)) {
            a |= 2;
        }
        if (m1549a(f2, f, i, 8)) {
            a |= 8;
        }
        if (a != 0) {
            int[] iArr = this.f2073m;
            iArr[i] = iArr[i] | a;
            this.f2079s.mo413a(a, i);
        }
    }

    private boolean m1554b(View view, int i) {
        if (view == this.f2070j && this.f2071k == i) {
            return true;
        }
        if (view == null || !this.f2079s.mo145a(view, i)) {
            return false;
        }
        this.f2071k = i;
        m1561a(view, i);
        return true;
    }

    public static boolean m1555b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    private void m1556c(int i) {
        if (this.f2063c != null && m1562a(i)) {
            this.f2063c[i] = 0.0f;
            this.f2064d[i] = 0.0f;
            this.f2065e[i] = 0.0f;
            this.f2066f[i] = 0.0f;
            this.f2072l[i] = 0;
            this.f2073m[i] = 0;
            this.f2074n[i] = 0;
            this.f2075o = ((1 << i) ^ -1) & this.f2075o;
        }
    }

    private void m1557c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m1559d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2065e[pointerId] = x;
                this.f2066f[pointerId] = y;
            }
        }
    }

    private void m1558d() {
        this.f2076p.computeCurrentVelocity(IjkMediaCodecInfo.RANK_MAX, this.f2077q);
        m1547a(C0634p.m1543a(this.f2076p.getXVelocity(this.f2071k), this.f2067g, this.f2077q), C0634p.m1543a(this.f2076p.getYVelocity(this.f2071k), this.f2067g, this.f2077q));
    }

    private boolean m1559d(int i) {
        if (m1562a(i)) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder("Ignoring pointerId=");
        stringBuilder.append(i);
        stringBuilder.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", stringBuilder.toString());
        return false;
    }

    public final void m1560a() {
        this.f2071k = -1;
        if (this.f2063c != null) {
            Arrays.fill(this.f2063c, 0.0f);
            Arrays.fill(this.f2064d, 0.0f);
            Arrays.fill(this.f2065e, 0.0f);
            Arrays.fill(this.f2066f, 0.0f);
            Arrays.fill(this.f2072l, 0);
            Arrays.fill(this.f2073m, 0);
            Arrays.fill(this.f2074n, 0);
            this.f2075o = 0;
        }
        if (this.f2076p != null) {
            this.f2076p.recycle();
            this.f2076p = null;
        }
    }

    public final void m1561a(View view, int i) {
        if (view.getParent() != this.f2081u) {
            StringBuilder stringBuilder = new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            stringBuilder.append(this.f2081u);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f2070j = view;
        this.f2071k = i;
        this.f2079s.mo171d(view, i);
        m1568b(1);
    }

    public final boolean m1562a(int i) {
        return ((1 << i) & this.f2075o) != 0;
    }

    public final boolean m1563a(int i, int i2) {
        if (this.f2080t) {
            return m1550a(i, i2, (int) this.f2076p.getXVelocity(this.f2071k), (int) this.f2076p.getYVelocity(this.f2071k));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m1564a(android.view.MotionEvent r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r18.getActionMasked();
        r3 = r18.getActionIndex();
        if (r2 != 0) goto L_0x0011;
    L_0x000e:
        r17.m1560a();
    L_0x0011:
        r4 = r0.f2076p;
        if (r4 != 0) goto L_0x001b;
    L_0x0015:
        r4 = android.view.VelocityTracker.obtain();
        r0.f2076p = r4;
    L_0x001b:
        r4 = r0.f2076p;
        r4.addMovement(r1);
        r4 = 2;
        r6 = 1;
        switch(r2) {
            case 0: goto L_0x00eb;
            case 1: goto L_0x00e7;
            case 2: goto L_0x0061;
            case 3: goto L_0x00e7;
            case 4: goto L_0x0025;
            case 5: goto L_0x0030;
            case 6: goto L_0x0027;
            default: goto L_0x0025;
        };
    L_0x0025:
        goto L_0x011a;
    L_0x0027:
        r1 = r1.getPointerId(r3);
        r0.m1556c(r1);
        goto L_0x011a;
    L_0x0030:
        r2 = r1.getPointerId(r3);
        r7 = r1.getX(r3);
        r1 = r1.getY(r3);
        r0.m1548a(r7, r1, r2);
        r3 = r0.f2061a;
        if (r3 != 0) goto L_0x004e;
    L_0x0043:
        r1 = r0.f2072l;
        r1 = r1[r2];
        r2 = r0.f2069i;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x011a;
    L_0x004c:
        goto L_0x0115;
    L_0x004e:
        r3 = r0.f2061a;
        if (r3 != r4) goto L_0x011a;
    L_0x0052:
        r3 = (int) r7;
        r1 = (int) r1;
        r1 = r0.m1566b(r3, r1);
        r3 = r0.f2070j;
        if (r1 != r3) goto L_0x011a;
    L_0x005c:
        r0.m1554b(r1, r2);
        goto L_0x011a;
    L_0x0061:
        r2 = r0.f2063c;
        if (r2 == 0) goto L_0x011a;
    L_0x0065:
        r2 = r0.f2064d;
        if (r2 == 0) goto L_0x011a;
    L_0x0069:
        r2 = r18.getPointerCount();
        r3 = 0;
    L_0x006e:
        if (r3 >= r2) goto L_0x00e3;
    L_0x0070:
        r4 = r1.getPointerId(r3);
        r7 = r0.m1559d(r4);
        if (r7 == 0) goto L_0x00e0;
    L_0x007a:
        r7 = r1.getX(r3);
        r8 = r1.getY(r3);
        r9 = r0.f2063c;
        r9 = r9[r4];
        r9 = r7 - r9;
        r10 = r0.f2064d;
        r10 = r10[r4];
        r10 = r8 - r10;
        r7 = (int) r7;
        r8 = (int) r8;
        r7 = r0.m1566b(r7, r8);
        if (r7 == 0) goto L_0x009e;
    L_0x0096:
        r8 = r0.m1551a(r7, r9, r10);
        if (r8 == 0) goto L_0x009e;
    L_0x009c:
        r8 = r6;
        goto L_0x009f;
    L_0x009e:
        r8 = 0;
    L_0x009f:
        if (r8 == 0) goto L_0x00d1;
    L_0x00a1:
        r11 = r7.getLeft();
        r12 = (int) r9;
        r12 = r12 + r11;
        r13 = r0.f2079s;
        r12 = r13.mo147c(r7, r12);
        r13 = r7.getTop();
        r14 = (int) r10;
        r14 = r14 + r13;
        r15 = r0.f2079s;
        r14 = r15.mo146b(r7, r14);
        r15 = r0.f2079s;
        r15 = r15.mo170a(r7);
        r5 = r0.f2079s;
        r5 = r5.mo141a();
        if (r15 == 0) goto L_0x00cb;
    L_0x00c7:
        if (r15 <= 0) goto L_0x00d1;
    L_0x00c9:
        if (r12 != r11) goto L_0x00d1;
    L_0x00cb:
        if (r5 == 0) goto L_0x00e3;
    L_0x00cd:
        if (r5 <= 0) goto L_0x00d1;
    L_0x00cf:
        if (r14 == r13) goto L_0x00e3;
    L_0x00d1:
        r0.m1553b(r9, r10, r4);
        r5 = r0.f2061a;
        if (r5 == r6) goto L_0x00e3;
    L_0x00d8:
        if (r8 == 0) goto L_0x00e0;
    L_0x00da:
        r4 = r0.m1554b(r7, r4);
        if (r4 != 0) goto L_0x00e3;
    L_0x00e0:
        r3 = r3 + 1;
        goto L_0x006e;
    L_0x00e3:
        r17.m1557c(r18);
        goto L_0x011a;
    L_0x00e7:
        r17.m1560a();
        goto L_0x011a;
    L_0x00eb:
        r2 = r18.getX();
        r3 = r18.getY();
        r5 = 0;
        r1 = r1.getPointerId(r5);
        r0.m1548a(r2, r3, r1);
        r2 = (int) r2;
        r3 = (int) r3;
        r2 = r0.m1566b(r2, r3);
        r3 = r0.f2070j;
        if (r2 != r3) goto L_0x010c;
    L_0x0105:
        r3 = r0.f2061a;
        if (r3 != r4) goto L_0x010c;
    L_0x0109:
        r0.m1554b(r2, r1);
    L_0x010c:
        r2 = r0.f2072l;
        r1 = r2[r1];
        r2 = r0.f2069i;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x011a;
    L_0x0115:
        r1 = r0.f2079s;
        r1.mo414d();
    L_0x011a:
        r1 = r0.f2061a;
        if (r1 != r6) goto L_0x011f;
    L_0x011e:
        return r6;
    L_0x011f:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.p.a(android.view.MotionEvent):boolean");
    }

    public final boolean m1565a(View view, int i, int i2) {
        this.f2070j = view;
        this.f2071k = -1;
        boolean a = m1550a(i, i2, 0, 0);
        if (!(a || this.f2061a != 0 || this.f2070j == null)) {
            this.f2070j = null;
        }
        return a;
    }

    public final View m1566b(int i, int i2) {
        for (int childCount = this.f2081u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2081u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void m1567b() {
        m1560a();
        if (this.f2061a == 2) {
            this.f2078r.getCurrX();
            this.f2078r.getCurrY();
            this.f2078r.abortAnimation();
            this.f2079s.mo144a(this.f2070j, this.f2078r.getCurrX(), this.f2078r.getCurrY());
        }
        m1568b(0);
    }

    final void m1568b(int i) {
        this.f2081u.removeCallbacks(this.f2082w);
        if (this.f2061a != i) {
            this.f2061a = i;
            this.f2079s.mo142a(i);
            if (this.f2061a == 0) {
                this.f2070j = null;
            }
        }
    }

    public final void m1569b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m1560a();
        }
        if (this.f2076p == null) {
            this.f2076p = VelocityTracker.obtain();
        }
        this.f2076p.addMovement(motionEvent);
        int i = 0;
        float y;
        int pointerId;
        int left;
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                y = motionEvent.getY();
                pointerId = motionEvent.getPointerId(0);
                View b = m1566b((int) x, (int) y);
                m1548a(x, y, pointerId);
                m1554b(b, pointerId);
                if ((this.f2072l[pointerId] & this.f2069i) != 0) {
                    this.f2079s.mo414d();
                    break;
                }
                break;
            case 1:
                if (this.f2061a == 1) {
                    m1558d();
                }
                m1560a();
                return;
            case 2:
                if (this.f2061a != 1) {
                    actionMasked = motionEvent.getPointerCount();
                    while (i < actionMasked) {
                        actionIndex = motionEvent.getPointerId(i);
                        if (m1559d(actionIndex)) {
                            float x2 = motionEvent.getX(i);
                            float y2 = motionEvent.getY(i);
                            float f = x2 - this.f2063c[actionIndex];
                            float f2 = y2 - this.f2064d[actionIndex];
                            m1553b(f, f2, actionIndex);
                            if (this.f2061a != 1) {
                                View b2 = m1566b((int) x2, (int) y2);
                                if (m1551a(b2, f, f2) && m1554b(b2, actionIndex)) {
                                }
                            }
                            m1557c(motionEvent);
                            return;
                        }
                        i++;
                    }
                    m1557c(motionEvent);
                    return;
                } else if (m1559d(this.f2071k)) {
                    actionMasked = motionEvent.findPointerIndex(this.f2071k);
                    y = motionEvent.getX(actionMasked);
                    actionIndex = (int) (y - this.f2065e[this.f2071k]);
                    actionMasked = (int) (motionEvent.getY(actionMasked) - this.f2066f[this.f2071k]);
                    i = this.f2070j.getLeft() + actionIndex;
                    int top = this.f2070j.getTop() + actionMasked;
                    left = this.f2070j.getLeft();
                    int top2 = this.f2070j.getTop();
                    if (actionIndex != 0) {
                        i = this.f2079s.mo147c(this.f2070j, i);
                        C0571r.m1363e(this.f2070j, i - left);
                    }
                    if (actionMasked != 0) {
                        top = this.f2079s.mo146b(this.f2070j, top);
                        C0571r.m1359d(this.f2070j, top - top2);
                    }
                    if (!(actionIndex == 0 && actionMasked == 0)) {
                        this.f2079s.mo144a(this.f2070j, i, top);
                    }
                    m1557c(motionEvent);
                    return;
                }
                break;
            case 3:
                if (this.f2061a == 1) {
                    m1547a(0.0f, 0.0f);
                }
                m1560a();
                return;
            case 5:
                actionMasked = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                m1548a(x3, y3, actionMasked);
                if (this.f2061a == 0) {
                    m1554b(m1566b((int) x3, (int) y3), actionMasked);
                    if ((this.f2072l[actionMasked] & this.f2069i) != 0) {
                        this.f2079s.mo414d();
                    }
                    return;
                }
                if (C0634p.m1555b(this.f2070j, (int) x3, (int) y3)) {
                    m1554b(this.f2070j, actionMasked);
                    return;
                }
                break;
            case 6:
                actionMasked = motionEvent.getPointerId(actionIndex);
                if (this.f2061a == 1 && actionMasked == this.f2071k) {
                    actionIndex = motionEvent.getPointerCount();
                    while (i < actionIndex) {
                        left = motionEvent.getPointerId(i);
                        if (left != this.f2071k) {
                            if (m1566b((int) motionEvent.getX(i), (int) motionEvent.getY(i)) == this.f2070j && m1554b(this.f2070j, left)) {
                                pointerId = this.f2071k;
                                if (pointerId == -1) {
                                    m1558d();
                                }
                            }
                        }
                        i++;
                    }
                    pointerId = -1;
                    if (pointerId == -1) {
                        m1558d();
                    }
                }
                m1556c(actionMasked);
                return;
            default:
                return;
        }
    }

    public final boolean m1570c() {
        if (this.f2061a == 2) {
            boolean computeScrollOffset = this.f2078r.computeScrollOffset();
            int currX = this.f2078r.getCurrX();
            int currY = this.f2078r.getCurrY();
            int left = currX - this.f2070j.getLeft();
            int top = currY - this.f2070j.getTop();
            if (left != 0) {
                C0571r.m1363e(this.f2070j, left);
            }
            if (top != 0) {
                C0571r.m1359d(this.f2070j, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f2079s.mo144a(this.f2070j, currX, currY);
            }
            if (computeScrollOffset && currX == this.f2078r.getFinalX() && currY == this.f2078r.getFinalY()) {
                this.f2078r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f2081u.post(this.f2082w);
            }
        }
        return this.f2061a == 2;
    }
}
