package uk.co.p616a.p617a.p618a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class C7995a implements C7862d {
    protected C7863e f24969a;
    float f24970b;
    float f24971c;
    final float f24972d;
    final float f24973e;
    private VelocityTracker f24974f;
    private boolean f24975g;

    public C7995a(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f24973e = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f24972d = (float) viewConfiguration.getScaledTouchSlop();
    }

    float mo5009a(MotionEvent motionEvent) {
        return motionEvent.getX();
    }

    public final void mo4866a(C7863e c7863e) {
        this.f24969a = c7863e;
    }

    public boolean mo4867a() {
        return false;
    }

    float mo5010b(MotionEvent motionEvent) {
        return motionEvent.getY();
    }

    public final boolean mo4868b() {
        return this.f24975g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4869c(android.view.MotionEvent r12) {
        /*
        r11 = this;
        r0 = r12.getAction();
        r1 = 0;
        r2 = 1;
        r3 = 0;
        switch(r0) {
            case 0: goto L_0x00a5;
            case 1: goto L_0x0056;
            case 2: goto L_0x0017;
            case 3: goto L_0x000b;
            default: goto L_0x000a;
        };
    L_0x000a:
        return r2;
    L_0x000b:
        r12 = r11.f24974f;
        if (r12 == 0) goto L_0x00ce;
    L_0x000f:
        r12 = r11.f24974f;
        r12.recycle();
        r11.f24974f = r3;
        return r2;
    L_0x0017:
        r0 = r11.mo5009a(r12);
        r3 = r11.mo5010b(r12);
        r4 = r11.f24970b;
        r4 = r0 - r4;
        r5 = r11.f24971c;
        r5 = r3 - r5;
        r6 = r11.f24975g;
        if (r6 != 0) goto L_0x003f;
    L_0x002b:
        r6 = r4 * r4;
        r7 = r5 * r5;
        r6 = r6 + r7;
        r6 = (double) r6;
        r6 = java.lang.Math.sqrt(r6);
        r8 = r11.f24972d;
        r8 = (double) r8;
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 < 0) goto L_0x003d;
    L_0x003c:
        r1 = r2;
    L_0x003d:
        r11.f24975g = r1;
    L_0x003f:
        r1 = r11.f24975g;
        if (r1 == 0) goto L_0x00ce;
    L_0x0043:
        r1 = r11.f24969a;
        r1.mo4878a(r4, r5);
        r11.f24970b = r0;
        r11.f24971c = r3;
        r0 = r11.f24974f;
        if (r0 == 0) goto L_0x00ce;
    L_0x0050:
        r0 = r11.f24974f;
        r0.addMovement(r12);
        return r2;
    L_0x0056:
        r0 = r11.f24975g;
        if (r0 == 0) goto L_0x009f;
    L_0x005a:
        r0 = r11.f24974f;
        if (r0 == 0) goto L_0x009f;
    L_0x005e:
        r0 = r11.mo5009a(r12);
        r11.f24970b = r0;
        r0 = r11.mo5010b(r12);
        r11.f24971c = r0;
        r0 = r11.f24974f;
        r0.addMovement(r12);
        r12 = r11.f24974f;
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12.computeCurrentVelocity(r0);
        r12 = r11.f24974f;
        r12 = r12.getXVelocity();
        r0 = r11.f24974f;
        r0 = r0.getYVelocity();
        r1 = java.lang.Math.abs(r12);
        r4 = java.lang.Math.abs(r0);
        r1 = java.lang.Math.max(r1, r4);
        r4 = r11.f24973e;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 < 0) goto L_0x009f;
    L_0x0094:
        r1 = r11.f24969a;
        r4 = r11.f24970b;
        r5 = r11.f24971c;
        r12 = -r12;
        r0 = -r0;
        r1.mo4880a(r4, r5, r12, r0);
    L_0x009f:
        r12 = r11.f24974f;
        if (r12 == 0) goto L_0x00ce;
    L_0x00a3:
        goto L_0x000f;
    L_0x00a5:
        r0 = android.view.VelocityTracker.obtain();
        r11.f24974f = r0;
        r0 = r11.f24974f;
        if (r0 == 0) goto L_0x00b5;
    L_0x00af:
        r0 = r11.f24974f;
        r0.addMovement(r12);
        goto L_0x00c0;
    L_0x00b5:
        r0 = uk.co.p616a.p617a.p619b.C7865a.m22164a();
        r3 = "CupcakeGestureDetector";
        r4 = "Velocity tracker is null";
        r0.mo4871b(r3, r4);
    L_0x00c0:
        r0 = r11.mo5009a(r12);
        r11.f24970b = r0;
        r12 = r11.mo5010b(r12);
        r11.f24971c = r12;
        r11.f24975g = r1;
    L_0x00ce:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.a.a.a.a.c(android.view.MotionEvent):boolean");
    }
}
