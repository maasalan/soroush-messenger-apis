package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.view.C0711g;
import android.support.v7.view.C0713i;
import android.support.v7.view.menu.C4890h;
import android.support.v7.widget.TintTypedArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.Thread.UncaughtExceptionHandler;

abstract class C4869f extends C0665e {
    private static boolean f13510p = true;
    private static final boolean f13511q;
    private static final int[] f13512r = new int[]{16842836};
    final Context f13513b;
    final Window f13514c;
    final Callback f13515d = this.f13514c.getCallback();
    final Callback f13516e;
    final C0664d f13517f;
    C0662a f13518g;
    MenuInflater f13519h;
    boolean f13520i;
    boolean f13521j;
    boolean f13522k;
    boolean f13523l;
    boolean f13524m;
    CharSequence f13525n;
    boolean f13526o;
    private boolean f13527s;

    class C4868a extends C0713i {
        final /* synthetic */ C4869f f13509a;

        C4868a(C4869f c4869f, Callback callback) {
            this.f13509a = c4869f;
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!this.f13509a.mo2589a(keyEvent)) {
                if (!super.dispatchKeyEvent(keyEvent)) {
                    return false;
                }
            }
            return true;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent)) {
                if (!this.f13509a.mo2588a(keyEvent.getKeyCode(), keyEvent)) {
                    return false;
                }
            }
            return true;
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            return (i != 0 || (menu instanceof C4890h)) ? super.onCreatePanelMenu(i, menu) : false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            this.f13509a.mo2596e(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            this.f13509a.mo2595d(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C4890h c4890h = menu instanceof C4890h ? (C4890h) menu : null;
            if (i == 0 && c4890h == null) {
                return false;
            }
            if (c4890h != null) {
                c4890h.f13659k = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c4890h != null) {
                c4890h.f13659k = false;
            }
            return onPreparePanel;
        }
    }

    static {
        boolean z = VERSION.SDK_INT < 21;
        f13511q = z;
        if (z && !f13510p) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                public final void uncaughtException(Thread thread, Throwable th) {
                    Object obj = null;
                    if (th instanceof NotFoundException) {
                        String message = th.getMessage();
                        if (message != null && (message.contains("drawable") || message.contains("Drawable"))) {
                            obj = 1;
                        }
                    }
                    if (obj != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(th.getMessage());
                        stringBuilder.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        Throwable notFoundException = new NotFoundException(stringBuilder.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    C4869f(Context context, Window window, C0664d c0664d) {
        this.f13513b = context;
        this.f13514c = window;
        this.f13517f = c0664d;
        if (this.f13515d instanceof C4868a) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f13516e = mo3504a(this.f13515d);
        this.f13514c.setCallback(this.f13516e);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, f13512r);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            this.f13514c.setBackgroundDrawable(drawableIfKnown);
        }
        obtainStyledAttributes.recycle();
    }

    public final C0662a mo457a() {
        mo2600l();
        return this.f13518g;
    }

    Callback mo3504a(Callback callback) {
        return new C4868a(this, callback);
    }

    public final void mo458a(CharSequence charSequence) {
        this.f13525n = charSequence;
        mo2592b(charSequence);
    }

    abstract boolean mo2588a(int i, KeyEvent keyEvent);

    abstract boolean mo2589a(KeyEvent keyEvent);

    public final MenuInflater mo459b() {
        if (this.f13519h == null) {
            mo2600l();
            this.f13519h = new C0711g(this.f13518g != null ? this.f13518g.mo480d() : this.f13513b);
        }
        return this.f13519h;
    }

    public void mo460b(Bundle bundle) {
    }

    abstract void mo2592b(CharSequence charSequence);

    public void mo461d() {
        this.f13527s = true;
    }

    abstract void mo2595d(int i);

    public void mo462e() {
        this.f13527s = false;
    }

    abstract boolean mo2596e(int i);

    public void mo463h() {
        this.f13526o = true;
    }

    public boolean mo464j() {
        return false;
    }

    abstract void mo2600l();

    final Context m9369m() {
        C0662a a = mo457a();
        Context d = a != null ? a.mo480d() : null;
        return d == null ? this.f13513b : d;
    }
}
