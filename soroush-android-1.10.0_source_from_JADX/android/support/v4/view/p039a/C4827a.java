package android.support.v4.view.p039a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class C4827a {
    private static final C0530c f1801a;

    static class C0530c {
        C0530c() {
        }

        public int mo2550a(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        public void mo2551a(AccessibilityEvent accessibilityEvent, int i) {
        }
    }

    static class C4828a extends C0530c {
        C4828a() {
        }
    }

    static class C6370b extends C4828a {
        C6370b() {
        }

        public final int mo2550a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        public final void mo2551a(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    static {
        C0530c c6370b = VERSION.SDK_INT >= 19 ? new C6370b() : VERSION.SDK_INT >= 16 ? new C4828a() : new C0530c();
        f1801a = c6370b;
    }

    public static int m1163a(AccessibilityEvent accessibilityEvent) {
        return f1801a.mo2550a(accessibilityEvent);
    }

    public static void m1164a(AccessibilityEvent accessibilityEvent, int i) {
        f1801a.mo2551a(accessibilityEvent, i);
    }
}
