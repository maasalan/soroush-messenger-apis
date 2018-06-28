package android.support.v4.view.p039a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class C0541d {

    static class C05391 extends AccessibilityNodeProvider {
        final /* synthetic */ C0540a f1840a;

        C05391(C0540a c0540a) {
            this.f1840a = c0540a;
        }

        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            this.f1840a.mo390c();
            return null;
        }

        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            return this.f1840a.mo389b();
        }

        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1840a.mo388a();
        }
    }

    interface C0540a {
        boolean mo388a();

        List<Object> mo389b();

        Object mo390c();
    }
}
