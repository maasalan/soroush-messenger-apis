package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class C0574t {
    static final C0573c f1875a;

    static class C0573c {
        C0573c() {
        }
    }

    static class C4844a extends C0573c {
        C4844a() {
        }
    }

    static class C6377b extends C4844a {
        C6377b() {
        }
    }

    static {
        C0573c c6377b = VERSION.SDK_INT >= 21 ? new C6377b() : VERSION.SDK_INT >= 18 ? new C4844a() : new C0573c();
        f1875a = c6377b;
    }

    @Deprecated
    public static void m1394a(ViewGroup viewGroup) {
        viewGroup.setMotionEventSplittingEnabled(false);
    }
}
