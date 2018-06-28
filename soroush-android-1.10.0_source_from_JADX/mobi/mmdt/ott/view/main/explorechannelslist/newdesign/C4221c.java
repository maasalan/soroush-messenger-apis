package mobi.mmdt.ott.view.main.explorechannelslist.newdesign;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p462a.C6929b;

public final class C4221c {
    public View f11985a;
    public C6929b f11986b;

    public C4221c(Activity activity, C4224d c4224d) {
        this.f11985a = activity.getLayoutInflater().inflate(R.layout.recycler_view_layout_item_list, null, false);
        this.f11986b = new C6929b(activity, c4224d);
        RecyclerView recyclerView = (RecyclerView) this.f11985a.findViewById(R.id.inner_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f11986b);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity, 0, true));
    }
}
