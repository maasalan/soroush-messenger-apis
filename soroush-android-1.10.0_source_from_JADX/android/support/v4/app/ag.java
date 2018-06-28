package android.support.v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ai.C0378a;
import android.support.v4.app.ai.C0378a.C0377a;
import java.util.Set;

public final class ag extends C0378a {
    public static final C0377a f13228a = new C47721();
    private static final C0376a f13229h;
    private final String f13230b;
    private final CharSequence f13231c;
    private final CharSequence[] f13232d;
    private final boolean f13233e;
    private final Bundle f13234f;
    private final Set<String> f13235g;

    interface C0376a {
    }

    static class C47721 implements C0377a {
        C47721() {
        }
    }

    static class C4773b implements C0376a {
        C4773b() {
        }
    }

    static class C4774c implements C0376a {
        C4774c() {
        }
    }

    static class C4775d implements C0376a {
        C4775d() {
        }
    }

    static {
        C0376a c4773b = VERSION.SDK_INT >= 20 ? new C4773b() : VERSION.SDK_INT >= 16 ? new C4775d() : new C4774c();
        f13229h = c4773b;
    }

    public final String mo227a() {
        return this.f13230b;
    }

    public final CharSequence mo228b() {
        return this.f13231c;
    }

    public final CharSequence[] mo229c() {
        return this.f13232d;
    }

    public final Set<String> mo230d() {
        return this.f13235g;
    }

    public final boolean mo231e() {
        return this.f13233e;
    }

    public final Bundle mo232f() {
        return this.f13234f;
    }
}
