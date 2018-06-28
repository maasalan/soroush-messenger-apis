package mobi.mmdt.ott.view.settings.mainsettings.messages.cachesetting;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.C6807d;
import mobi.mmdt.ott.logic.p351h.p352a.p353a.C6808e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.p583b.C7380e;
import mobi.mmdt.ott.view.settings.p583b.C7387l;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6976a extends C6260b {
    List<C6829g> f19924b;
    String f19925c = "";
    String f19926e = "";

    protected final void mo3261a(List<C6829g> list) {
        if (this.f19925c.isEmpty()) {
            this.f19925c = C4522p.m8236a(R.string.calculating);
        }
        if (this.f19926e.isEmpty()) {
            this.f19926e = C4522p.m8236a(R.string.calculating);
        }
        list.clear();
        list.add(new C7387l(C4522p.m8236a(R.string.clear_cache), this.f19926e, false, 8001, 0));
        list.add(new C7380e(C4522p.m8236a(R.string.local_database), C4522p.m8236a(R.string.sub_title_local_database_cache_setting), this.f19925c));
        this.f19924b = list;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2808d.m7148b(new C6807d());
        C2808d.m7148b(new C6808e());
    }
}
