package android.support.v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class C0705b {
    Object f2314c;
    boolean f2315d;

    public interface C0704a {
        void mo446a(C0705b c0705b);

        boolean mo447a(C0705b c0705b, Menu menu);

        boolean mo448a(C0705b c0705b, MenuItem menuItem);

        boolean mo449b(C0705b c0705b, Menu menu);
    }

    public abstract MenuInflater mo490a();

    public abstract void mo491a(int i);

    public abstract void mo492a(View view);

    public abstract void mo493a(CharSequence charSequence);

    public void mo494a(boolean z) {
        this.f2315d = z;
    }

    public abstract Menu mo495b();

    public abstract void mo496b(int i);

    public abstract void mo497b(CharSequence charSequence);

    public abstract void mo498c();

    public abstract void mo499d();

    public abstract CharSequence mo500f();

    public abstract CharSequence mo501g();

    public boolean mo502h() {
        return false;
    }

    public abstract View mo503i();
}
