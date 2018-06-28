package android.support.v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class af implements OnAttachStateChangeListener, OnPreDrawListener {
    private final View f1401a;
    private ViewTreeObserver f1402b;
    private final Runnable f1403c;

    private af(View view, Runnable runnable) {
        this.f1401a = view;
        this.f1402b = view.getViewTreeObserver();
        this.f1403c = runnable;
    }

    public static af m738a(View view, Runnable runnable) {
        af afVar = new af(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(afVar);
        view.addOnAttachStateChangeListener(afVar);
        return afVar;
    }

    private void m739a() {
        (this.f1402b.isAlive() ? this.f1402b : this.f1401a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1401a.removeOnAttachStateChangeListener(this);
    }

    public final boolean onPreDraw() {
        m739a();
        this.f1403c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f1402b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        m739a();
    }
}
