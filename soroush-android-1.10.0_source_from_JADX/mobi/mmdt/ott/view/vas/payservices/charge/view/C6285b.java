package mobi.mmdt.ott.view.vas.payservices.charge.view;

import android.app.Activity;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.p451a.C4143a;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.vas.payservices.charge.p486b.C6993a;
import mobi.mmdt.ott.view.vas.payservices.charge.p593c.C7398a;

public final class C6285b extends C4143a implements LoaderCallbacks<Cursor>, C3126i {
    private RecyclerView f17164a;
    private C7237a f17165b;
    private C4579d f17166e;
    private TextView f17167f;
    private int f17168g = 0;
    private String f17169h = "";

    public class C7237a extends C6827b {
        final /* synthetic */ C6285b f20899a;

        public C7237a(C6285b c6285b, Context context) {
            this.f20899a = c6285b;
            super(context);
        }

        public final C6073e mo3449a(ViewGroup viewGroup, int i) {
            return new C6993a(this.f20899a.f11833c, this.f20899a, this.f19501b, viewGroup);
        }

        protected final C6829g mo3450a(Cursor cursor, int i) {
            int i2 = cursor.getInt(cursor.getColumnIndex("_id"));
            String string = cursor.getString(cursor.getColumnIndex("members_avatar_thumbnail_url"));
            String string2 = cursor.getString(cursor.getColumnIndex("members_local_image_uri"));
            String string3 = cursor.getString(cursor.getColumnIndex("members_user_id"));
            String string4 = cursor.getString(cursor.getColumnIndex("members_standard_phone_number"));
            int b = C2491i.m6806b(this.f, string3);
            String string5 = cursor.getString(cursor.getColumnIndex("members_local_name"));
            String string6 = cursor.getString(cursor.getColumnIndex("members_local_phone_number"));
            return new C7398a(i2, string3, string4, C4508f.m8221a(string5, string6), string6, string, string2, b, cursor.getPosition());
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return mo3449a(viewGroup, i);
        }
    }

    private C6285b(Activity activity, C4579d c4579d) {
        TextView textView;
        String a;
        Object[] objArr;
        super(activity);
        int i = 0;
        this.f17166e = c4579d;
        this.d = LayoutInflater.from(activity).inflate(R.layout.fragment_charge_contacts_list, null, false);
        C2491i.m6796a(this.d, -1);
        this.f17169h = C2535a.m6888a().m6919b();
        this.f17165b = new C7237a(this, this.f11833c);
        Bundle bundle = new Bundle();
        bundle.putString("searchPattern", "");
        this.f11833c.getLoaderManager().initLoader(50, bundle, this);
        this.f17164a = (RecyclerView) this.d.findViewById(R.id.recycler_view);
        this.f17167f = (TextView) this.d.findViewById(R.id.divider_textView);
        if (this.f17169h.equals("fa")) {
            textView = this.f17167f;
            a = C4522p.m8236a(R.string.forward_divider_selection);
            objArr = new Object[]{C2491i.m6809b(this.f17168g), C4522p.m8236a(R.string.contacts_selected)};
        } else {
            textView = this.f17167f;
            a = C4522p.m8236a(R.string.forward_divider_selection);
            objArr = new Object[]{Integer.valueOf(this.f17168g), C4522p.m8236a(R.string.contacts_selected)};
        }
        textView.setText(String.format(a, objArr));
        this.f17164a.setHasFixedSize(true);
        this.f17164a.setAdapter(this.f17165b);
        RecyclerView recyclerView = this.f17164a;
        if (recyclerView.getLayoutManager() != null) {
            i = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f11833c));
        recyclerView.scrollToPosition(i);
    }

    public static C6285b m14679a(Activity activity, C4579d c4579d) {
        return new C6285b(activity, c4579d);
    }

    public final void mo2375a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("searchPattern", str);
        this.f11833c.getLoaderManager().restartLoader(50, bundle, this);
    }

    public final void mo2234c(int i) {
        this.f17166e.mo3691a(((C7398a) this.f17165b.m17257b(i)).f21514b);
    }

    public final void mo2235d(int i) {
    }

    public final Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return C2999a.m7505b(bundle.getString("searchPattern"));
    }

    public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f17165b != null) {
            this.f17165b.m13684c(cursor);
        }
    }

    public final void onLoaderReset(Loader<Cursor> loader) {
        if (this.f17165b != null) {
            this.f17165b.m13684c(null);
        }
    }
}
