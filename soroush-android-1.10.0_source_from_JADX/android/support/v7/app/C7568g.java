package android.support.v7.app;

import android.content.Context;
import android.support.v7.app.C7407j.C7023a;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import android.view.Window.Callback;
import java.util.List;

final class C7568g extends C7407j {

    class C7255a extends C7023a {
        final /* synthetic */ C7568g f20947b;

        C7255a(C7568g c7568g, Callback callback) {
            this.f20947b = c7568g;
            super(c7568g, callback);
        }

        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            PanelFeatureState g = this.f20947b.m15102g(0);
            if (g == null || g.f2201j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, g.f2201j, i);
            }
        }
    }

    C7568g(Context context, Window window, C0664d c0664d) {
        super(context, window, c0664d);
    }

    final Callback mo3504a(Callback callback) {
        return new C7255a(this, callback);
    }
}
