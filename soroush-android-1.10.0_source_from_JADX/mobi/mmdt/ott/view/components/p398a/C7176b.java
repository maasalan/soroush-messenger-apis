package mobi.mmdt.ott.view.components.p398a;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.C6358f;

public final class C7176b extends C6358f {
    private static C3102a ae;

    public interface C3102a {
        Dialog mo2398a(Bundle bundle);
    }

    public static C7176b m18967a(Bundle bundle, C3102a c3102a) {
        ae = c3102a;
        C7176b c7176b = new C7176b();
        c7176b.mo3059e(bundle);
        return c7176b;
    }

    public static C7176b m18968a(C3102a c3102a) {
        ae = c3102a;
        return new C7176b();
    }

    public final Dialog mo2533e() {
        return ae.mo2398a(this.f13204p);
    }
}
