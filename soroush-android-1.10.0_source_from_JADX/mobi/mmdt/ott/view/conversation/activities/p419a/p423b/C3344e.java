package mobi.mmdt.ott.view.conversation.activities.p419a.p423b;

import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;

public final class C3344e {
    public static int m7825a(RelativeLayout relativeLayout) {
        Rect rect = new Rect();
        View rootView = relativeLayout.getRootView();
        relativeLayout.getWindowVisibleDisplayFrame(rect);
        return ((rootView.getHeight() - (rect.top != 0 ? C2491i.m6822c(MyApplication.m12952b()) : 0)) - C2491i.m6760a(rootView)) - (rect.bottom - rect.top);
    }
}
