package mobi.mmdt.ott.view.conversation.forward;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

public final class C4057g {
    public String f11617a;
    public C4058h f11618b;
    public ArrayList<C4059i> f11619c;

    public C4057g(C4058h c4058h, String str) {
        this.f11618b = c4058h;
        this.f11617a = str;
    }

    public C4057g(C4058h c4058h, String str, ArrayList<Uri> arrayList, String str2) {
        this.f11618b = c4058h;
        this.f11617a = str;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C4059i((Uri) it.next(), str2));
        }
        this.f11619c = arrayList2;
    }
}
