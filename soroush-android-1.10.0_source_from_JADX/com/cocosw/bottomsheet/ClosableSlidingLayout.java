package com.cocosw.bottomsheet;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.C0571r;
import android.support.v4.widget.C0634p;
import android.support.v4.widget.C0634p.C0633a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;

public class ClosableSlidingLayout extends FrameLayout {
    View f4002a;
    boolean f4003b;
    private final float f4004c;
    private C0634p f4005d;
    private C1278a f4006e;
    private int f4007f;
    private int f4008g;
    private int f4009h;
    private boolean f4010i;
    private float f4011j;
    private boolean f4012k;
    private float f4013l;

    interface C1278a {
        void mo1250a();

        void mo1251b();
    }

    private class C5285b extends C0633a {
        final /* synthetic */ ClosableSlidingLayout f14658a;

        private C5285b(ClosableSlidingLayout closableSlidingLayout) {
            this.f14658a = closableSlidingLayout;
        }

        public final void mo143a(View view, float f, float f2) {
            if (f2 <= this.f14658a.f4004c) {
                if (view.getTop() < this.f14658a.f4008g + (this.f14658a.f4007f / 2)) {
                    this.f14658a.f4005d.m1565a(view, 0, this.f14658a.f4008g);
                    C0571r.m1361e(this.f14658a);
                }
            }
            ClosableSlidingLayout.m3045a(this.f14658a, view);
            C0571r.m1361e(this.f14658a);
        }

        public final void mo144a(View view, int i, int i2) {
            if (VERSION.SDK_INT < 11) {
                this.f14658a.invalidate();
            }
            if (this.f14658a.f4007f - i2 <= 0 && this.f14658a.f4006e != null) {
                this.f14658a.f4006e.mo1250a();
            }
        }

        public final boolean mo145a(View view, int i) {
            return true;
        }

        public final int mo146b(View view, int i) {
            return Math.max(i, this.f14658a.f4008g);
        }
    }

    public ClosableSlidingLayout(Context context) {
        this(context, null);
    }

    public ClosableSlidingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @TargetApi(11)
    public ClosableSlidingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4012k = false;
        this.f4003b = true;
        this.f4005d = C0634p.m1545a((ViewGroup) this, 0.8f, new C5285b());
        this.f4004c = getResources().getDisplayMetrics().density * 400.0f;
    }

    private static float m3043a(MotionEvent motionEvent, int i) {
        i = motionEvent.findPointerIndex(i);
        return i < 0 ? -1.0f : motionEvent.getY(i);
    }

    static /* synthetic */ void m3045a(ClosableSlidingLayout closableSlidingLayout, View view) {
        closableSlidingLayout.f4005d.m1565a(view, 0, closableSlidingLayout.f4008g + closableSlidingLayout.f4007f);
        closableSlidingLayout.f4005d.m1560a();
        C0571r.m1361e(closableSlidingLayout);
    }

    private boolean m3046a() {
        if (VERSION.SDK_INT >= 14) {
            return C0571r.m1347a(this.f4002a);
        }
        if (!(this.f4002a instanceof AbsListView)) {
            return this.f4002a.getScrollY() > 0;
        } else {
            AbsListView absListView = (AbsListView) this.f4002a;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        }
    }

    public void computeScroll() {
        if (this.f4005d.m1570c()) {
            C0571r.m1361e(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m3046a()) {
            return false;
        }
        if (actionMasked != 3) {
            if (actionMasked != 1) {
                float a;
                if (actionMasked == 0) {
                    this.f4007f = getChildAt(0).getHeight();
                    this.f4008g = getChildAt(0).getTop();
                    this.f4009h = motionEvent.getPointerId(0);
                    this.f4010i = false;
                    a = m3043a(motionEvent, this.f4009h);
                    if (a == -1.0f) {
                        return false;
                    }
                    this.f4011j = a;
                    this.f4013l = 0.0f;
                } else if (actionMasked == 2) {
                    if (this.f4009h == -1) {
                        return false;
                    }
                    a = m3043a(motionEvent, this.f4009h);
                    if (a == -1.0f) {
                        return false;
                    }
                    this.f4013l = a - this.f4011j;
                    if (this.f4003b && this.f4013l > ((float) this.f4005d.f2062b) && !this.f4010i) {
                        this.f4010i = true;
                        this.f4005d.m1561a(getChildAt(0), 0);
                    }
                }
                this.f4005d.m1564a(motionEvent);
                return this.f4010i;
            }
        }
        this.f4009h = -1;
        this.f4010i = false;
        if (this.f4012k && (-this.f4013l) > ((float) this.f4005d.f2062b)) {
            View view = this.f4005d.f2070j;
            if (this.f4006e != null) {
                this.f4006e.mo1251b();
            }
        }
        this.f4005d.m1560a();
        return false;
    }

    public boolean onTouchEvent(android.view.MotionEvent r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = r1.isEnabled();
        if (r0 == 0) goto L_0x0018;
    L_0x0006:
        r0 = r1.m3046a();
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0018;
    L_0x000d:
        r0 = r1.f4003b;	 Catch:{ Exception -> 0x0016 }
        if (r0 == 0) goto L_0x0016;	 Catch:{ Exception -> 0x0016 }
    L_0x0011:
        r0 = r1.f4005d;	 Catch:{ Exception -> 0x0016 }
        r0.m1569b(r2);	 Catch:{ Exception -> 0x0016 }
    L_0x0016:
        r2 = 1;
        return r2;
    L_0x0018:
        r2 = super.onTouchEvent(r2);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cocosw.bottomsheet.ClosableSlidingLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    void setCollapsible(boolean z) {
        this.f4012k = z;
    }

    public void setSlideListener(C1278a c1278a) {
        this.f4006e = c1278a;
    }
}
