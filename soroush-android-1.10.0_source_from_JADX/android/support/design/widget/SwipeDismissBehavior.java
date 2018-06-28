package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout.C0270a;
import android.support.v4.view.C0571r;
import android.support.v4.widget.C0634p;
import android.support.v4.widget.C0634p.C0633a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class SwipeDismissBehavior<V extends View> extends C0270a<V> {
    private boolean f13103a;
    C0634p f13104b;
    C0280a f13105c;
    int f13106d = 2;
    float f13107e = 0.5f;
    float f13108f = 0.0f;
    float f13109g = 0.5f;
    private float f13110h = 0.0f;
    private boolean f13111i;
    private final C0633a f13112j = new C47401(this);

    public interface C0280a {
        void mo182a(int i);

        void mo183a(View view);
    }

    private class C0281b implements Runnable {
        final /* synthetic */ SwipeDismissBehavior f1008a;
        private final View f1009b;
        private final boolean f1010c;

        C0281b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
            this.f1008a = swipeDismissBehavior;
            this.f1009b = view;
            this.f1010c = z;
        }

        public final void run() {
            if (this.f1008a.f13104b == null || !this.f1008a.f13104b.m1570c()) {
                if (this.f1010c && this.f1008a.f13105c != null) {
                    this.f1008a.f13105c.mo183a(this.f1009b);
                }
                return;
            }
            C0571r.m1343a(this.f1009b, (Runnable) this);
        }
    }

    class C47401 extends C0633a {
        final /* synthetic */ SwipeDismissBehavior f13100a;
        private int f13101b;
        private int f13102c = -1;

        C47401(SwipeDismissBehavior swipeDismissBehavior) {
            this.f13100a = swipeDismissBehavior;
        }

        public final int mo170a(View view) {
            return view.getWidth();
        }

        public final void mo142a(int i) {
            if (this.f13100a.f13105c != null) {
                this.f13100a.f13105c.mo182a(i);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo143a(android.view.View r7, float r8, float r9) {
            /*
            r6 = this;
            r9 = -1;
            r6.f13102c = r9;
            r9 = r7.getWidth();
            r0 = 0;
            r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            r2 = 0;
            r3 = 1;
            if (r1 == 0) goto L_0x0043;
        L_0x000e:
            r1 = android.support.v4.view.C0571r.m1369h(r7);
            if (r1 != r3) goto L_0x0016;
        L_0x0014:
            r1 = r3;
            goto L_0x0017;
        L_0x0016:
            r1 = r2;
        L_0x0017:
            r4 = r6.f13100a;
            r4 = r4.f13106d;
            r5 = 2;
            if (r4 != r5) goto L_0x001f;
        L_0x001e:
            goto L_0x005e;
        L_0x001f:
            r4 = r6.f13100a;
            r4 = r4.f13106d;
            if (r4 != 0) goto L_0x0031;
        L_0x0025:
            if (r1 == 0) goto L_0x002c;
        L_0x0027:
            r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r8 >= 0) goto L_0x0060;
        L_0x002b:
            goto L_0x005e;
        L_0x002c:
            r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r8 <= 0) goto L_0x0060;
        L_0x0030:
            goto L_0x005e;
        L_0x0031:
            r4 = r6.f13100a;
            r4 = r4.f13106d;
            if (r4 != r3) goto L_0x0060;
        L_0x0037:
            if (r1 == 0) goto L_0x003e;
        L_0x0039:
            r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r8 <= 0) goto L_0x0060;
        L_0x003d:
            goto L_0x005e;
        L_0x003e:
            r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r8 >= 0) goto L_0x0060;
        L_0x0042:
            goto L_0x005e;
        L_0x0043:
            r8 = r7.getLeft();
            r0 = r6.f13101b;
            r8 = r8 - r0;
            r0 = r7.getWidth();
            r0 = (float) r0;
            r1 = r6.f13100a;
            r1 = r1.f13107e;
            r0 = r0 * r1;
            r0 = java.lang.Math.round(r0);
            r8 = java.lang.Math.abs(r8);
            if (r8 < r0) goto L_0x0060;
        L_0x005e:
            r8 = r3;
            goto L_0x0061;
        L_0x0060:
            r8 = r2;
        L_0x0061:
            if (r8 == 0) goto L_0x0074;
        L_0x0063:
            r8 = r7.getLeft();
            r0 = r6.f13101b;
            if (r8 >= r0) goto L_0x006f;
        L_0x006b:
            r8 = r6.f13101b;
            r8 = r8 - r9;
            goto L_0x0072;
        L_0x006f:
            r8 = r6.f13101b;
            r8 = r8 + r9;
        L_0x0072:
            r2 = r3;
            goto L_0x0076;
        L_0x0074:
            r8 = r6.f13101b;
        L_0x0076:
            r9 = r6.f13100a;
            r9 = r9.f13104b;
            r0 = r7.getTop();
            r8 = r9.m1563a(r8, r0);
            if (r8 == 0) goto L_0x008f;
        L_0x0084:
            r8 = new android.support.design.widget.SwipeDismissBehavior$b;
            r9 = r6.f13100a;
            r8.<init>(r9, r7, r2);
            android.support.v4.view.C0571r.m1343a(r7, r8);
            return;
        L_0x008f:
            if (r2 == 0) goto L_0x009e;
        L_0x0091:
            r8 = r6.f13100a;
            r8 = r8.f13105c;
            if (r8 == 0) goto L_0x009e;
        L_0x0097:
            r8 = r6.f13100a;
            r8 = r8.f13105c;
            r8.mo183a(r7);
        L_0x009e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.1.a(android.view.View, float, float):void");
        }

        public final void mo144a(View view, int i, int i2) {
            float width = ((float) this.f13101b) + (((float) view.getWidth()) * this.f13100a.f13108f);
            float width2 = ((float) this.f13101b) + (((float) view.getWidth()) * this.f13100a.f13109g);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(BallPulseIndicator.SCALE);
            } else {
                view.setAlpha(f >= width2 ? 0.0f : SwipeDismissBehavior.m8781a(BallPulseIndicator.SCALE - SwipeDismissBehavior.m8782a(width, width2, f)));
            }
        }

        public final boolean mo145a(View view, int i) {
            return this.f13102c == -1 && this.f13100a.mo2514b(view);
        }

        public final int mo146b(View view, int i) {
            return view.getTop();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo147c(android.view.View r4, int r5) {
            /*
            r3 = this;
            r0 = android.support.v4.view.C0571r.m1369h(r4);
            r1 = 1;
            if (r0 != r1) goto L_0x0009;
        L_0x0007:
            r0 = r1;
            goto L_0x000a;
        L_0x0009:
            r0 = 0;
        L_0x000a:
            r2 = r3.f13100a;
            r2 = r2.f13106d;
            if (r2 != 0) goto L_0x0026;
        L_0x0010:
            if (r0 == 0) goto L_0x001c;
        L_0x0012:
            r0 = r3.f13101b;
            r4 = r4.getWidth();
            r0 = r0 - r4;
            r4 = r3.f13101b;
            goto L_0x0037;
        L_0x001c:
            r0 = r3.f13101b;
        L_0x001e:
            r1 = r3.f13101b;
            r4 = r4.getWidth();
            r4 = r4 + r1;
            goto L_0x0037;
        L_0x0026:
            r2 = r3.f13100a;
            r2 = r2.f13106d;
            if (r2 != r1) goto L_0x002f;
        L_0x002c:
            if (r0 == 0) goto L_0x0012;
        L_0x002e:
            goto L_0x001c;
        L_0x002f:
            r0 = r3.f13101b;
            r1 = r4.getWidth();
            r0 = r0 - r1;
            goto L_0x001e;
        L_0x0037:
            r4 = android.support.design.widget.SwipeDismissBehavior.m8783a(r0, r5, r4);
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.1.c(android.view.View, int):int");
        }

        public final void mo171d(View view, int i) {
            this.f13102c = i;
            this.f13101b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    static float m8781a(float f) {
        return Math.min(Math.max(0.0f, f), BallPulseIndicator.SCALE);
    }

    static float m8782a(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    static int m8783a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public boolean mo153a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f13103a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    this.f13103a = coordinatorLayout.m14916a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                    z = this.f13103a;
                    break;
                case 1:
                    break;
                default:
                    break;
            }
        }
        this.f13103a = false;
        if (!z) {
            return false;
        }
        if (this.f13104b == null) {
            this.f13104b = this.f13111i ? C0634p.m1545a((ViewGroup) coordinatorLayout, this.f13110h, this.f13112j) : C0634p.m1546a((ViewGroup) coordinatorLayout, this.f13112j);
        }
        return this.f13104b.m1564a(motionEvent);
    }

    public final boolean mo156b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f13104b == null) {
            return false;
        }
        this.f13104b.m1569b(motionEvent);
        return true;
    }

    public boolean mo2514b(View view) {
        return true;
    }
}
