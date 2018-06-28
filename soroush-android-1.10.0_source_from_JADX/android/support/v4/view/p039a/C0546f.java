package android.support.v4.view.p039a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

public final class C0546f {
    private static final C0545c f1842b;
    public final AccessibilityRecord f1843a;

    static class C0545c {
        C0545c() {
        }

        public void mo396a(AccessibilityRecord accessibilityRecord, int i) {
        }

        public void mo397b(AccessibilityRecord accessibilityRecord, int i) {
        }
    }

    static class C4833a extends C0545c {
        C4833a() {
        }

        public final void mo396a(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        public final void mo397b(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    static class C6374b extends C4833a {
        C6374b() {
        }
    }

    static {
        C0545c c6374b = VERSION.SDK_INT >= 16 ? new C6374b() : VERSION.SDK_INT >= 15 ? new C4833a() : new C0545c();
        f1842b = c6374b;
    }

    @Deprecated
    private C0546f(Object obj) {
        this.f1843a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static C0546f m1218a() {
        return new C0546f(AccessibilityRecord.obtain());
    }

    public static void m1219a(AccessibilityRecord accessibilityRecord, int i) {
        f1842b.mo396a(accessibilityRecord, i);
    }

    public static void m1220b(AccessibilityRecord accessibilityRecord, int i) {
        f1842b.mo397b(accessibilityRecord, i);
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0546f c0546f = (C0546f) obj;
        if (this.f1843a == null) {
            if (c0546f.f1843a != null) {
                return false;
            }
        } else if (!this.f1843a.equals(c0546f.f1843a)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final int hashCode() {
        return this.f1843a == null ? 0 : this.f1843a.hashCode();
    }
}
