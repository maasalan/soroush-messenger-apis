package android.support.p028d;

import android.os.Build.VERSION;
import android.view.ViewGroup;

final class ae {
    private static final ah f816a = (VERSION.SDK_INT >= 18 ? new ag() : new af());

    static ad m392a(ViewGroup viewGroup) {
        return f816a.mo72a(viewGroup);
    }

    static void m393a(ViewGroup viewGroup, boolean z) {
        f816a.mo73a(viewGroup, z);
    }
}
