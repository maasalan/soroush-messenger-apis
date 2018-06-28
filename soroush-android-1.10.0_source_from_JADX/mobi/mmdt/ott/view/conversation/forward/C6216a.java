package mobi.mmdt.ott.view.conversation.forward;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v4.p029a.C6356d;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p389k.C3000b;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.forward.p599b.C7360a;
import mobi.mmdt.ott.view.main.p451a.C4143a;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6216a extends C4143a implements C0416a<Cursor>, C3126i, C4054e {
    boolean f16807a;
    C7198a f16808b;
    private RecyclerView f16809e;
    private C4053d f16810f;
    private TextView f16811g;
    private int f16812h = 0;
    private String f16813i = "";
    private String f16814j = "";

    public class C7198a extends C6827b {
        final /* synthetic */ C6216a f20785a;

        public C7198a(C6216a c6216a, Context context) {
            this.f20785a = c6216a;
            super(context);
        }

        public final C6073e mo3449a(ViewGroup viewGroup, int i) {
            return new mobi.mmdt.ott.view.conversation.forward.p447a.C7198a(this.f20785a.f11833c, this.f19501b, viewGroup, this.f20785a);
        }

        protected final C6829g mo3450a(Cursor cursor, int i) {
            int i2 = cursor.getInt(cursor.getColumnIndex("_id"));
            String string = cursor.getString(cursor.getColumnIndex("members_moto"));
            String string2 = cursor.getString(cursor.getColumnIndex("members_avatar_thumbnail_url"));
            String string3 = cursor.getString(cursor.getColumnIndex("members_local_image_uri"));
            String string4 = cursor.getString(cursor.getColumnIndex("members_user_id"));
            return new C7360a(i2, string4, C4508f.m8221a(cursor.getString(cursor.getColumnIndex("members_local_name")), cursor.getString(cursor.getColumnIndex("members_local_phone_number"))), string, string2, string3, C2491i.m6806b(this.f, string4), cursor.getPosition(), this.f20785a.f16807a ? this.f20785a.m14326b().containsKey(string4) : false, this.f20785a.f16807a);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return mo3449a(viewGroup, i);
        }
    }

    public C6216a(Activity activity, C4053d c4053d, boolean z) {
        super(activity);
        int i = 0;
        this.f16807a = z;
        this.f16810f = c4053d;
        this.d = LayoutInflater.from(activity).inflate(R.layout.fragment_forward_contacts_list, null, false);
        this.f16814j = C2535a.m6888a().m6919b();
        this.f16808b = new C7198a(this, this.f11833c);
        Bundle bundle = new Bundle();
        bundle.putString("searchPattern", "");
        ((C7576b) this.f11833c).m19190e().mo268a(11, bundle, this);
        this.f16809e = (RecyclerView) this.d.findViewById(R.id.recycler_view);
        this.f16811g = (TextView) this.d.findViewById(R.id.divider_textView);
        m14320d();
        this.f16809e.setHasFixedSize(true);
        this.f16809e.setAdapter(this.f16808b);
        RecyclerView recyclerView = this.f16809e;
        if (recyclerView.getLayoutManager() != null) {
            i = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f11833c));
        recyclerView.scrollToPosition(i);
    }

    private void m14320d() {
        TextView textView;
        String a;
        Object[] objArr;
        if (this.f16814j.equals("fa")) {
            textView = this.f16811g;
            a = C4522p.m8236a(R.string.forward_divider_selection);
            objArr = new Object[]{C2491i.m6809b(this.f16812h), C4522p.m8236a(R.string.contacts_selected)};
        } else {
            textView = this.f16811g;
            a = C4522p.m8236a(R.string.forward_divider_selection);
            objArr = new Object[]{Integer.valueOf(this.f16812h), C4522p.m8236a(R.string.contacts_selected)};
        }
        textView.setText(String.format(a, objArr));
    }

    public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
        String string = bundle.getString("searchPattern");
        String[] strArr = new String[]{"_id", "members_avatar_url", "members_avatar_thumbnail_url", "members_local_name", "members_is_local_user", "members_moto", "members_local_image_uri", "members_user_id", "members_local_phone_number", "members_is_pined", "members_is_mute"};
        Context b = MyApplication.m12952b();
        Uri uri = C3000b.f9413a;
        StringBuilder stringBuilder = new StringBuilder("members_is_local_user =? and members_is_deactivated_user =? and members_is_soroush_member =? and (members_local_name LIKE '%");
        stringBuilder.append(string);
        stringBuilder.append("%' OR members_local_phone_number LIKE '%");
        stringBuilder.append(string);
        stringBuilder.append("%')");
        string = stringBuilder.toString();
        String[] strArr2 = new String[]{"1", "0", "1"};
        StringBuilder stringBuilder2 = new StringBuilder("members_is_soroush_member DESC ,  CASE WHEN members_user_id = '");
        stringBuilder2.append(C2535a.m6888a().m6928d());
        stringBuilder2.append("' THEN 1 ELSE 2 END,members_local_name COLLATE UNICODE ASC ");
        return new C6356d(b, uri, strArr, string, strArr2, stringBuilder2.toString());
    }

    public final void mo2227a() {
        if (this.f16808b != null) {
            this.f16808b.m13684c(null);
        }
    }

    public final void mo2374a(int i) {
        C7360a c7360a = (C7360a) this.f16808b.m17257b(i);
        m14326b().put(c7360a.f21348b, Integer.valueOf(C2978e.SINGLE.ordinal()));
        c7360a.f21353g = true;
        this.f16812h++;
        m14320d();
        if (!this.f16813i.isEmpty()) {
            ((ForwardActivity) this.f11833c).m21259h();
        }
        ((ForwardActivity) this.f11833c).m21260i();
        ((ForwardActivity) this.f11833c).mo3643g();
    }

    public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f16808b != null) {
            this.f16808b.m13684c(cursor);
        }
    }

    public final void mo2375a(String str) {
        this.f16813i = str;
        Bundle bundle = new Bundle();
        bundle.putString("searchPattern", str);
        ((C7576b) this.f11833c).m19190e().mo270b(11, bundle, this);
    }

    final HashMap<String, Integer> m14326b() {
        return ((ForwardActivity) this.f11833c).f24334m;
    }

    public final void mo2376b(int i) {
        C7360a c7360a = (C7360a) this.f16808b.m17257b(i);
        if (m14326b().containsKey(c7360a.f21348b)) {
            m14326b().remove(c7360a.f21348b);
            c7360a.f21353g = false;
            this.f16812h--;
            m14320d();
            ((ForwardActivity) this.f11833c).m21260i();
            if (!this.f16813i.isEmpty()) {
                ((ForwardActivity) this.f11833c).m21259h();
            }
        }
        ((ForwardActivity) this.f11833c).mo3643g();
    }

    public final void mo2234c(int i) {
    }

    public final void mo2235d(int i) {
    }

    public final void mo2377e(int i) {
        this.f16810f.mo3667a(((C7360a) this.f16808b.m17257b(i)).f21348b, C2978e.SINGLE, false, null, null);
    }
}
