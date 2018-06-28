package mobi.mmdt.ott.view.conversation.activities.p419a.p423b;

import android.net.Uri;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.ott.view.conversation.forward.C4057g;
import mobi.mmdt.ott.view.conversation.forward.C4058h;

public final class C3345f {
    public static C4057g m7826a(String str, ArrayList<Uri> arrayList, String str2) {
        if (arrayList == null || arrayList.isEmpty() || str == null) {
            return null;
        }
        C4058h c4058h = str.startsWith("text/plain") ? C4058h.TEXT : str.startsWith("image") ? C4058h.IMAGE : str.startsWith("image/gif") ? C4058h.GIF : str.startsWith("video") ? C4058h.VIDEO : C4058h.FILE;
        return (arrayList.size() == 1 && c4058h == C4058h.VIDEO && !C2468a.m6703a((Uri) arrayList.get(0))) ? new C4057g(C4058h.FILE, "", arrayList, str2) : new C4057g(c4058h, "", arrayList, str2);
    }
}
