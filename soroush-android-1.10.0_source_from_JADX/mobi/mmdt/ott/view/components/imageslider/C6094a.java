package mobi.mmdt.ott.view.components.imageslider;

import android.support.v4.view.C0565n;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.ott.view.components.imageslider.p408b.C3188a;
import mobi.mmdt.ott.view.components.imageslider.p408b.C3188a.C3185a;

public final class C6094a extends C0565n implements C3185a {
    public ArrayList<C3188a> f16354a = new ArrayList();

    public final Object mo208a(ViewGroup viewGroup, int i) {
        View b = ((C3188a) this.f16354a.get(i)).mo2273b();
        viewGroup.addView(b);
        return b;
    }

    public final void mo211a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final void mo2271a(C3188a c3188a) {
        if (c3188a.f9914c) {
            Iterator it = this.f16354a.iterator();
            while (it.hasNext()) {
                if (((C3188a) it.next()).equals(c3188a)) {
                    if (this.f16354a.contains(c3188a)) {
                        this.f16354a.remove(c3188a);
                        m1270d();
                    }
                }
            }
        }
    }

    public final boolean mo213a(View view, Object obj) {
        return view == obj;
    }

    public final int mo2270b() {
        return this.f16354a.size();
    }

    public final int mo2272c() {
        return -2;
    }
}
