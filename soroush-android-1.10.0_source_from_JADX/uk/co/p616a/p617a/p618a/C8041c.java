package uk.co.p616a.p617a.p618a;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;

@TargetApi(8)
public final class C8041c extends C8035b {
    protected final ScaleGestureDetector f25012f;

    class C78611 implements OnScaleGestureListener {
        final /* synthetic */ C8041c f24937a;

        C78611(C8041c c8041c) {
            this.f24937a = c8041c;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (!Float.isNaN(scaleFactor)) {
                if (!Float.isInfinite(scaleFactor)) {
                    this.f24937a.a.mo4879a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    return true;
                }
            }
            return false;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C8041c(Context context) {
        super(context);
        this.f25012f = new ScaleGestureDetector(context, new C78611(this));
    }

    public final boolean mo4867a() {
        return this.f25012f.isInProgress();
    }

    public final boolean mo4869c(android.view.MotionEvent r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f25012f;	 Catch:{ IllegalArgumentException -> 0x000a }
        r0.onTouchEvent(r2);	 Catch:{ IllegalArgumentException -> 0x000a }
        r2 = super.mo4869c(r2);	 Catch:{ IllegalArgumentException -> 0x000a }
        return r2;
    L_0x000a:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.a.a.a.c.c(android.view.MotionEvent):boolean");
    }
}
