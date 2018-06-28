package android.support.v4.p038g;

import android.os.Build.VERSION;
import java.util.Objects;

public final class C0477i {
    private static final C0476b f1638a = (VERSION.SDK_INT >= 19 ? new C4815a() : new C0476b());

    private static class C0476b {
        private C0476b() {
        }

        public boolean mo307a(Object obj, Object obj2) {
            if (obj != obj2) {
                if (obj == null || !obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    private static class C4815a extends C0476b {
        private C4815a() {
            super();
        }

        public final boolean mo307a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    public static boolean m1005a(Object obj, Object obj2) {
        return f1638a.mo307a(obj, obj2);
    }
}
