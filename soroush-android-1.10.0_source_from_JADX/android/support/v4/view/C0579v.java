package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class C0579v {
    public WeakReference<View> f1883a;
    Runnable f1884b = null;
    Runnable f1885c = null;
    int f1886d = -1;

    static class C4846a implements C0580w {
        C0579v f13442a;
        boolean f13443b;

        C4846a(C0579v c0579v) {
            this.f13442a = c0579v;
        }

        public final void onAnimationCancel(View view) {
            Object tag = view.getTag(2113929216);
            C0580w c0580w = tag instanceof C0580w ? (C0580w) tag : null;
            if (c0580w != null) {
                c0580w.onAnimationCancel(view);
            }
        }

        public final void onAnimationEnd(View view) {
            C0580w c0580w = null;
            if (this.f13442a.f1886d >= 0) {
                view.setLayerType(this.f13442a.f1886d, null);
                this.f13442a.f1886d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f13443b) {
                if (this.f13442a.f1885c != null) {
                    Runnable runnable = this.f13442a.f1885c;
                    this.f13442a.f1885c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C0580w) {
                    c0580w = (C0580w) tag;
                }
                if (c0580w != null) {
                    c0580w.onAnimationEnd(view);
                }
                this.f13443b = true;
            }
        }

        public final void onAnimationStart(View view) {
            this.f13443b = false;
            C0580w c0580w = null;
            if (this.f13442a.f1886d >= 0) {
                view.setLayerType(2, null);
            }
            if (this.f13442a.f1884b != null) {
                Runnable runnable = this.f13442a.f1884b;
                this.f13442a.f1884b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C0580w) {
                c0580w = (C0580w) tag;
            }
            if (c0580w != null) {
                c0580w.onAnimationStart(view);
            }
        }
    }

    C0579v(View view) {
        this.f1883a = new WeakReference(view);
    }

    private void m1409a(final View view, final C0580w c0580w) {
        if (c0580w != null) {
            view.animate().setListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ C0579v f1879c;

                public final void onAnimationCancel(Animator animator) {
                    c0580w.onAnimationCancel(view);
                }

                public final void onAnimationEnd(Animator animator) {
                    c0580w.onAnimationEnd(view);
                }

                public final void onAnimationStart(Animator animator) {
                    c0580w.onAnimationStart(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public final C0579v m1410a(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final C0579v m1411a(long j) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final C0579v m1412a(C0580w c0580w) {
        View view = (View) this.f1883a.get();
        if (view == null) {
            return this;
        }
        if (VERSION.SDK_INT < 16) {
            view.setTag(2113929216, c0580w);
            c0580w = new C4846a(this);
        }
        m1409a(view, c0580w);
        return this;
    }

    public final C0579v m1413a(final C0581y c0581y) {
        final View view = (View) this.f1883a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            AnimatorUpdateListener animatorUpdateListener = null;
            if (c0581y != null) {
                animatorUpdateListener = new AnimatorUpdateListener(this) {
                    final /* synthetic */ C0579v f1882c;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        c0581y.mo489a();
                    }
                };
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }

    public final C0579v m1414a(Interpolator interpolator) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final void m1415a() {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final C0579v m1416b(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public final void m1417b() {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final C0579v m1418c(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final C0579v m1419d(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public final C0579v m1420e(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    public final C0579v m1421f(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public final C0579v m1422g(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }
}
