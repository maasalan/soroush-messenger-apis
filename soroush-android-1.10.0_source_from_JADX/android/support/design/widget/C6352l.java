package android.support.design.widget;

import android.content.Context;
import android.support.v4.p035d.C0443a;
import android.support.v4.view.C0571r;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

abstract class C6352l<V extends View> extends C4758v<V> {
    OverScroller f17380a;
    private Runnable f17381b;
    private boolean f17382c;
    private int f17383d = -1;
    private int f17384e;
    private int f17385f = -1;
    private VelocityTracker f17386g;

    private class C0320a implements Runnable {
        final /* synthetic */ C6352l f1249a;
        private final CoordinatorLayout f1250b;
        private final V f1251c;

        C0320a(C6352l c6352l, CoordinatorLayout coordinatorLayout, V v) {
            this.f1249a = c6352l;
            this.f1250b = coordinatorLayout;
            this.f1251c = v;
        }

        public final void run() {
            if (!(this.f1251c == null || this.f1249a.f17380a == null)) {
                if (this.f1249a.f17380a.computeScrollOffset()) {
                    this.f1249a.a_(this.f1250b, this.f1251c, this.f1249a.f17380a.getCurrY());
                    C0571r.m1343a(this.f1251c, (Runnable) this);
                    return;
                }
                this.f1249a.mo3268a(this.f1250b, this.f1251c);
            }
        }
    }

    public C6352l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void m14924d() {
        if (this.f17386g == null) {
            this.f17386g = VelocityTracker.obtain();
        }
    }

    int mo3265a() {
        return mo3276c();
    }

    int mo3266a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int c = mo3276c();
        if (i2 != 0 && c >= i2 && c <= i3) {
            int a = C0443a.m943a(i, i2, i3);
            if (c != a) {
                a_(a);
                return c - a;
            }
        }
        return 0;
    }

    int mo3267a(V v) {
        return v.getHeight();
    }

    void mo3268a(CoordinatorLayout coordinatorLayout, V v) {
    }

    public final boolean mo153a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f17385f < 0) {
            this.f17385f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.f17382c) {
            return true;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f17382c = false;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (mo3275b() && coordinatorLayout.m14916a((View) v, x, y)) {
                    this.f17384e = y;
                    this.f17383d = motionEvent.getPointerId(0);
                    m14924d();
                    break;
                }
            case 1:
            case 3:
                this.f17382c = false;
                this.f17383d = -1;
                if (this.f17386g != null) {
                    this.f17386g.recycle();
                    this.f17386g = null;
                    break;
                }
                break;
            case 2:
                int i = this.f17383d;
                if (i != -1) {
                    i = motionEvent.findPointerIndex(i);
                    if (i != -1) {
                        i = (int) motionEvent.getY(i);
                        if (Math.abs(i - this.f17384e) > this.f17385f) {
                            this.f17382c = true;
                            this.f17384e = i;
                            break;
                        }
                    }
                }
                break;
            default:
                break;
        }
        if (this.f17386g != null) {
            this.f17386g.addMovement(motionEvent);
        }
        return this.f17382c;
    }

    final int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo3266a(coordinatorLayout, v, i, Integer.MIN_VALUE, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    final int m14930b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo3266a(coordinatorLayout, v, mo3265a() - i, i2, i3);
    }

    int mo3274b(V v) {
        return -v.getHeight();
    }

    boolean mo3275b() {
        return false;
    }

    public final boolean mo156b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        View view = v;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f17385f < 0) {
            r6.f17385f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                y = (int) motionEvent.getY();
                if (coordinatorLayout2.m14916a(view, (int) motionEvent.getX(), y) && mo3275b()) {
                    r6.f17384e = y;
                    r6.f17383d = motionEvent2.getPointerId(0);
                    m14924d();
                    break;
                }
                return false;
                break;
            case 1:
                if (r6.f17386g != null) {
                    r6.f17386g.addMovement(motionEvent2);
                    r6.f17386g.computeCurrentVelocity(IjkMediaCodecInfo.RANK_MAX);
                    float yVelocity = r6.f17386g.getYVelocity(r6.f17383d);
                    int i = -mo3267a(view);
                    if (r6.f17381b != null) {
                        view.removeCallbacks(r6.f17381b);
                        r6.f17381b = null;
                    }
                    if (r6.f17380a == null) {
                        r6.f17380a = new OverScroller(v.getContext());
                    }
                    r6.f17380a.fling(0, mo3276c(), 0, Math.round(yVelocity), 0, 0, i, 0);
                    if (!r6.f17380a.computeScrollOffset()) {
                        mo3268a(coordinatorLayout, v);
                        break;
                    }
                    r6.f17381b = new C0320a(r6, coordinatorLayout2, view);
                    C0571r.m1343a(view, r6.f17381b);
                    break;
                }
                break;
            case 2:
                int findPointerIndex = motionEvent2.findPointerIndex(r6.f17383d);
                if (findPointerIndex != -1) {
                    findPointerIndex = (int) motionEvent2.getY(findPointerIndex);
                    y = r6.f17384e - findPointerIndex;
                    if (!r6.f17382c && Math.abs(y) > r6.f17385f) {
                        r6.f17382c = true;
                        y = y > 0 ? y - r6.f17385f : y + r6.f17385f;
                    }
                    if (r6.f17382c) {
                        r6.f17384e = findPointerIndex;
                        m14930b(coordinatorLayout2, view, y, mo3274b(view), 0);
                        break;
                    }
                }
                return false;
                break;
            case 3:
                break;
            default:
                break;
        }
        r6.f17382c = false;
        r6.f17383d = -1;
        if (r6.f17386g != null) {
            r6.f17386g.recycle();
            r6.f17386g = null;
        }
        if (r6.f17386g != null) {
            r6.f17386g.addMovement(motionEvent2);
        }
        return true;
    }
}
