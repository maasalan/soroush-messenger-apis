package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.v7.app.C7256i.C6390a;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

class C7407j extends C7256i {
    private final UiModeManager f21533y;

    class C7023a extends C6390a {
        final /* synthetic */ C7407j f20041d;

        C7023a(C7407j c7407j, Callback callback) {
            this.f20041d = c7407j;
            super(c7407j, callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (this.f20041d.f20949p) {
                if (i == 0) {
                    return m15115a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    C7407j(Context context, Window window, C0664d c0664d) {
        super(context, window, c0664d);
        this.f21533y = (UiModeManager) context.getSystemService("uimode");
    }

    Callback mo3504a(Callback callback) {
        return new C7023a(this, callback);
    }

    final int mo3505f(int i) {
        return (i == 0 && this.f21533y.getNightMode() == 0) ? -1 : super.mo3505f(i);
    }
}
