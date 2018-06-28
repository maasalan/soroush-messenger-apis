package android.support.v4.view.p039a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import org.jivesoftware.smack.roster.Roster;
import org.linphone.core.Privacy;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C0536b {
    public static final C0533j f1835a;
    public final AccessibilityNodeInfo f1836b;
    public int f1837c = -1;

    public static class C0532a {
        public static final C0532a f1802A = new C0532a(C0536b.f1835a.mo3635d());
        public static final C0532a f1803B = new C0532a(C0536b.f1835a.mo3637f());
        public static final C0532a f1804C = new C0532a(C0536b.f1835a.mo3638g());
        public static final C0532a f1805D = new C0532a(C0536b.f1835a.mo3692h());
        public static final C0532a f1806a = new C0532a(1);
        public static final C0532a f1807b = new C0532a(2);
        public static final C0532a f1808c = new C0532a(4);
        public static final C0532a f1809d = new C0532a(8);
        public static final C0532a f1810e = new C0532a(16);
        public static final C0532a f1811f = new C0532a(32);
        public static final C0532a f1812g = new C0532a(64);
        public static final C0532a f1813h = new C0532a(128);
        public static final C0532a f1814i = new C0532a(256);
        public static final C0532a f1815j = new C0532a((int) IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        public static final C0532a f1816k = new C0532a((int) Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
        public static final C0532a f1817l = new C0532a(2048);
        public static final C0532a f1818m = new C0532a((int) ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
        public static final C0532a f1819n = new C0532a(8192);
        public static final C0532a f1820o = new C0532a(16384);
        public static final C0532a f1821p = new C0532a((int) Privacy.DEFAULT);
        public static final C0532a f1822q = new C0532a(65536);
        public static final C0532a f1823r = new C0532a(131072);
        public static final C0532a f1824s = new C0532a(262144);
        public static final C0532a f1825t = new C0532a(524288);
        public static final C0532a f1826u = new C0532a(1048576);
        public static final C0532a f1827v = new C0532a(2097152);
        public static final C0532a f1828w = new C0532a(C0536b.f1835a.mo3633b());
        public static final C0532a f1829x = new C0532a(C0536b.f1835a.mo3632a());
        public static final C0532a f1830y = new C0532a(C0536b.f1835a.mo3634c());
        public static final C0532a f1831z = new C0532a(C0536b.f1835a.mo3636e());
        final Object f1832E;

        private C0532a(int i) {
            this(C0536b.f1835a.mo3582a(i));
        }

        private C0532a(Object obj) {
            this.f1832E = obj;
        }
    }

    static class C0533j {
        C0533j() {
        }

        public Object mo3632a() {
            return null;
        }

        public Object mo3582a(int i) {
            return null;
        }

        public Object mo3493a(int i, int i2, int i3, int i4, boolean z) {
            return null;
        }

        public Object mo3494a(int i, int i2, boolean z, int i3) {
            return null;
        }

        public void mo2552a(AccessibilityNodeInfo accessibilityNodeInfo, View view) {
        }

        public void mo3583a(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        }

        public void mo3495a(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        }

        public void mo384a(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        }

        public boolean mo385a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return false;
        }

        public Object mo3633b() {
            return null;
        }

        public void mo3496b(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        }

        public void mo386b(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        }

        public boolean mo387b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return false;
        }

        public Object mo3634c() {
            return null;
        }

        public String mo3293c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return null;
        }

        public void mo3497c(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        }

        public boolean mo3584c(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            return false;
        }

        public Object mo3635d() {
            return null;
        }

        public void mo3498d(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public Object mo3636e() {
            return null;
        }

        public void mo3499e(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public Object mo3637f() {
            return null;
        }

        public Object mo3638g() {
            return null;
        }

        public Object mo3692h() {
            return null;
        }
    }

    public static class C0534k {
        public final Object f1833a;

        public C0534k(Object obj) {
            this.f1833a = obj;
        }
    }

    public static class C0535l {
        final Object f1834a;

        private C0535l(Object obj) {
            this.f1834a = obj;
        }

        public static C0535l m1189a(int i, int i2, int i3, int i4, boolean z) {
            return new C0535l(C0536b.f1835a.mo3493a(i, i2, i3, i4, z));
        }
    }

    static class C4829b extends C0533j {
        C4829b() {
        }

        public final void mo384a(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setVisibleToUser(z);
        }

        public final boolean mo385a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isVisibleToUser();
        }

        public final void mo386b(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityFocused(z);
        }

        public final boolean mo387b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityFocused();
        }
    }

    static class C6371c extends C4829b {
        C6371c() {
        }

        public final void mo2552a(AccessibilityNodeInfo accessibilityNodeInfo, View view) {
            accessibilityNodeInfo.setLabelFor(view);
        }
    }

    static class C7018d extends C6371c {
        C7018d() {
        }

        public final String mo3293c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getViewIdResourceName();
        }
    }

    static class C7252e extends C7018d {
        C7252e() {
        }

        public Object mo3493a(int i, int i2, int i3, int i4, boolean z) {
            return CollectionItemInfo.obtain(i, i2, i3, i4, z);
        }

        public Object mo3494a(int i, int i2, boolean z, int i3) {
            return CollectionInfo.obtain(i, i2, z);
        }

        public final void mo3495a(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            accessibilityNodeInfo.setCollectionInfo((CollectionInfo) obj);
        }

        public final void mo3496b(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            accessibilityNodeInfo.setCollectionItemInfo((CollectionItemInfo) obj);
        }

        public final void mo3497c(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setDismissable(z);
        }

        public final void mo3498d(AccessibilityNodeInfo accessibilityNodeInfo) {
            accessibilityNodeInfo.setContentInvalid(true);
        }

        public final void mo3499e(AccessibilityNodeInfo accessibilityNodeInfo) {
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    static class C7403f extends C7252e {
        C7403f() {
        }

        public final Object mo3582a(int i) {
            return new AccessibilityAction(i, null);
        }

        public final Object mo3493a(int i, int i2, int i3, int i4, boolean z) {
            return CollectionItemInfo.obtain(i, i2, i3, i4, z, false);
        }

        public final Object mo3494a(int i, int i2, boolean z, int i3) {
            return CollectionInfo.obtain(i, i2, z, i3);
        }

        public final void mo3583a(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setError(charSequence);
        }

        public final boolean mo3584c(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
            return accessibilityNodeInfo.removeAction((AccessibilityAction) obj);
        }
    }

    static class C7566g extends C7403f {
        C7566g() {
        }
    }

    static class C7693h extends C7566g {
        C7693h() {
        }

        public final Object mo3632a() {
            return AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        }

        public final Object mo3633b() {
            return AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        }

        public final Object mo3634c() {
            return AccessibilityAction.ACTION_SCROLL_UP;
        }

        public final Object mo3635d() {
            return AccessibilityAction.ACTION_SCROLL_DOWN;
        }

        public final Object mo3636e() {
            return AccessibilityAction.ACTION_SCROLL_LEFT;
        }

        public final Object mo3637f() {
            return AccessibilityAction.ACTION_SCROLL_RIGHT;
        }

        public final Object mo3638g() {
            return AccessibilityAction.ACTION_CONTEXT_CLICK;
        }
    }

    static class C7724i extends C7693h {
        C7724i() {
        }

        public final Object mo3692h() {
            return AccessibilityAction.ACTION_SET_PROGRESS;
        }
    }

    static {
        C0533j c7724i = VERSION.SDK_INT >= 24 ? new C7724i() : VERSION.SDK_INT >= 23 ? new C7693h() : VERSION.SDK_INT >= 22 ? new C7566g() : VERSION.SDK_INT >= 21 ? new C7403f() : VERSION.SDK_INT >= 19 ? new C7252e() : VERSION.SDK_INT >= 18 ? new C7018d() : VERSION.SDK_INT >= 17 ? new C6371c() : VERSION.SDK_INT >= 16 ? new C4829b() : new C0533j();
        f1835a = c7724i;
    }

    private C0536b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1836b = accessibilityNodeInfo;
    }

    public static C0536b m1190a(C0536b c0536b) {
        return C0536b.m1191a(AccessibilityNodeInfo.obtain(c0536b.f1836b));
    }

    public static C0536b m1191a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0536b(accessibilityNodeInfo);
    }

    public final void m1192a(int i) {
        this.f1836b.addAction(i);
    }

    public final void m1193a(Rect rect) {
        this.f1836b.getBoundsInParent(rect);
    }

    public final void m1194a(View view) {
        this.f1836b.setParent(view);
    }

    public final void m1195a(CharSequence charSequence) {
        this.f1836b.setClassName(charSequence);
    }

    public final void m1196a(Object obj) {
        f1835a.mo3496b(this.f1836b, ((C0535l) obj).f1834a);
    }

    public final void m1197a(boolean z) {
        this.f1836b.setCheckable(z);
    }

    public final boolean m1198a(C0532a c0532a) {
        return f1835a.mo3584c(this.f1836b, c0532a.f1832E);
    }

    public final void m1199b(Rect rect) {
        this.f1836b.getBoundsInScreen(rect);
    }

    public final void m1200b(boolean z) {
        this.f1836b.setFocusable(z);
    }

    public final void m1201c(boolean z) {
        this.f1836b.setFocused(z);
    }

    public final void m1202d(boolean z) {
        this.f1836b.setScrollable(z);
    }

    public final void m1203e(boolean z) {
        f1835a.mo3497c(this.f1836b, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0536b c0536b = (C0536b) obj;
        if (this.f1836b == null) {
            if (c0536b.f1836b != null) {
                return false;
            }
        } else if (!this.f1836b.equals(c0536b.f1836b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1836b == null ? 0 : this.f1836b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m1193a(rect);
        StringBuilder stringBuilder2 = new StringBuilder("; boundsInParent: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        m1199b(rect);
        stringBuilder2 = new StringBuilder("; boundsInScreen: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.f1836b.getPackageName());
        stringBuilder.append("; className: ");
        stringBuilder.append(this.f1836b.getClassName());
        stringBuilder.append("; text: ");
        stringBuilder.append(this.f1836b.getText());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(this.f1836b.getContentDescription());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(f1835a.mo3293c(this.f1836b));
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.f1836b.isCheckable());
        stringBuilder.append("; checked: ");
        stringBuilder.append(this.f1836b.isChecked());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(this.f1836b.isFocusable());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.f1836b.isFocused());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.f1836b.isSelected());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.f1836b.isClickable());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.f1836b.isLongClickable());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(this.f1836b.isEnabled());
        stringBuilder.append("; password: ");
        stringBuilder.append(this.f1836b.isPassword());
        StringBuilder stringBuilder3 = new StringBuilder("; scrollable: ");
        stringBuilder3.append(this.f1836b.isScrollable());
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("; [");
        int actions = this.f1836b.getActions();
        while (actions != 0) {
            String str;
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            actions &= numberOfTrailingZeros ^ -1;
            switch (numberOfTrailingZeros) {
                case 1:
                    str = "ACTION_FOCUS";
                    break;
                case 2:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str = "ACTION_SELECT";
                    break;
                case 8:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str = "ACTION_CLICK";
                    break;
                case 32:
                    str = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED /*512*/:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE /*1024*/:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT /*4096*/:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case Privacy.DEFAULT /*32768*/:
                    str = "ACTION_PASTE";
                    break;
                case 65536:
                    str = "ACTION_CUT";
                    break;
                case 131072:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            stringBuilder.append(str);
            if (actions != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
