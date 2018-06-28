package uk.co.p616a.p617a;

import android.graphics.RectF;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import uk.co.p616a.p617a.C7999d.C7877f;

public final class C7867b implements OnDoubleTapListener {
    private C7999d f24939a;

    public C7867b(C7999d c7999d) {
        this.f24939a = c7999d;
    }

    public final boolean onDoubleTap(android.view.MotionEvent r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f24939a;
        if (r0 != 0) goto L_0x0006;
    L_0x0004:
        r4 = 0;
        return r4;
    L_0x0006:
        r0 = r3.f24939a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r0 = r0.m22229c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r1 = r4.getX();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r4 = r4.getY();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = r3.f24939a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = r2.f24989e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        if (r2 >= 0) goto L_0x0026;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
    L_0x001c:
        r0 = r3.f24939a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = r3.f24939a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = r2.f24989e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
    L_0x0022:
        r0.m22228b(r2, r1, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        goto L_0x0044;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
    L_0x0026:
        r2 = r3.f24939a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = r2.f24989e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        if (r2 < 0) goto L_0x003d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
    L_0x002e:
        r2 = r3.f24939a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = r2.f24990f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        if (r0 >= 0) goto L_0x003d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
    L_0x0036:
        r0 = r3.f24939a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = r3.f24939a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = r2.f24990f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        goto L_0x0022;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
    L_0x003d:
        r0 = r3.f24939a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = r3.f24939a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        r2 = r2.f24988d;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0044 }
        goto L_0x0022;
    L_0x0044:
        r4 = 1;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.a.a.b.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f24939a == null) {
            return false;
        }
        this.f24939a.m22227b();
        if (this.f24939a.f24991g != null) {
            RectF a = this.f24939a.m22223a();
            if (a != null) {
                if (a.contains(motionEvent.getX(), motionEvent.getY())) {
                    float f = a.left;
                    a.width();
                    f = a.top;
                    a.height();
                    this.f24939a.f24991g.m22173a();
                    return true;
                }
                this.f24939a.f24991g.m22174b();
            }
        }
        if (this.f24939a.f24992h != null) {
            C7877f c7877f = this.f24939a.f24992h;
            motionEvent.getX();
            motionEvent.getY();
            c7877f.m22176a();
        }
        return false;
    }
}
