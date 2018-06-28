package android.support.v4.view.p039a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class C0544e {

    static class C05421 extends AccessibilityNodeProvider {
        final /* synthetic */ C0543a f1841a;

        C05421(C0543a c0543a) {
            this.f1841a = c0543a;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            this.f1841a.mo393c();
            return null;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return this.f1841a.mo392b();
        }

        public final AccessibilityNodeInfo findFocus(int i) {
            this.f1841a.mo394d();
            return null;
        }

        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1841a.mo391a();
        }
    }

    interface C0543a {
        boolean mo391a();

        List<Object> mo392b();

        Object mo393c();

        Object mo394d();
    }
}
