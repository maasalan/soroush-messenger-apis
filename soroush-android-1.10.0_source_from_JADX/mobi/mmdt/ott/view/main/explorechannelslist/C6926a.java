package mobi.mmdt.ott.view.main.explorechannelslist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p085c.p086a.C1212c;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.location.ChannelsMapsActivity;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2650p;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2651r;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5922o;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5923q;
import mobi.mmdt.ott.logic.p261a.p306p.C6764b;
import mobi.mmdt.ott.logic.p261a.p306p.p307a.C2724b;
import mobi.mmdt.ott.logic.p261a.p306p.p307a.C5953a;
import mobi.mmdt.ott.logic.p357j.p358a.C2831f;
import mobi.mmdt.ott.logic.p357j.p358a.C2832g;
import mobi.mmdt.ott.logic.p357j.p358a.C2833i;
import mobi.mmdt.ott.logic.p357j.p358a.C2834j;
import mobi.mmdt.ott.logic.p357j.p358a.C5988h;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p385g.C2981h;
import mobi.mmdt.ott.provider.p387i.C2989a;
import mobi.mmdt.ott.provider.p387i.C2993d;
import mobi.mmdt.ott.provider.p388j.C7318h;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.channel.C3077a;
import mobi.mmdt.ott.view.channel.p396a.C6820a;
import mobi.mmdt.ott.view.channel.p396a.C6821b;
import mobi.mmdt.ott.view.channel.p564b.C7322c;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3337b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.main.C6232c;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4220b;
import mobi.mmdt.ott.view.main.explorechannelslist.p461a.C6241b;
import mobi.mmdt.ott.view.main.explorechannelslist.p461a.C7216a;
import mobi.mmdt.ott.view.main.p459d.p460a.C4185a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public final class C6926a extends C6232c implements C0416a<Cursor>, C3077a, C4185a {
    private View f19790a;
    private RecyclerView f19791b;
    private C7216a f19792c;
    private int f19793e = 0;
    private boolean f19794f = false;
    private ProgressWheel f19795g;
    private LinearLayout f19796h;
    private ImageView f19797i;

    class C41881 implements OnClickListener {
        final /* synthetic */ C6926a f11930a;

        C41881(C6926a c6926a) {
            this.f11930a = c6926a;
        }

        public final void onClick(View view) {
            this.f11930a.m17935d();
        }
    }

    class C41903 implements Runnable {
        final /* synthetic */ int f11933a = 8;
        final /* synthetic */ C6926a f11934b;

        C41903(C6926a c6926a) {
            this.f11934b = c6926a;
        }

        public final void run() {
            this.f11934b.f19795g.setVisibility(this.f11933a);
        }
    }

    class C41914 implements Runnable {
        final /* synthetic */ C6926a f11935a;

        C41914(C6926a c6926a) {
            this.f11935a = c6926a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C41925 implements Runnable {
        final /* synthetic */ C6926a f11936a;

        C41925(C6926a c6926a) {
            this.f11936a = c6926a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C41947 implements Runnable {
        final /* synthetic */ C6926a f11939a;

        C41947(C6926a c6926a) {
            this.f11939a = c6926a;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    private class C7216a extends C6827b {
        final /* synthetic */ C6926a f20833a;

        C7216a(C6926a c6926a, Context context) {
            this.f20833a = c6926a;
            super(context);
        }

        public final C6073e mo3449a(ViewGroup viewGroup, int i) {
            switch (i) {
                case 1:
                    return new C6821b(this.f20833a.getActivity(), this.f19501b, viewGroup, this.f20833a);
                case 2:
                    return new C6820a(this.f20833a.getActivity(), this.f19501b, viewGroup, this.f20833a);
                default:
                    return null;
            }
        }

        protected final C6829g mo3450a(Cursor cursor, int i) {
            String string = cursor.getString(cursor.getColumnIndex("row_item_title"));
            String string2 = cursor.getString(cursor.getColumnIndex("row_item_image"));
            String string3 = cursor.getString(cursor.getColumnIndex("row_item_subtitle"));
            int i2 = C2989a.m7468a()[cursor.getInt(cursor.getColumnIndex("row_item_action_type"))];
            String string4 = cursor.getString(cursor.getColumnIndex("row_item_action_data"));
            int i3 = C2989a.m7468a()[cursor.getInt(cursor.getColumnIndex("row_item_button_action_type"))];
            String string5 = cursor.getString(cursor.getColumnIndex("row_item_button_action_data"));
            String string6 = cursor.getString(cursor.getColumnIndex("dialog_my_role"));
            boolean z = (string6 == null || string6.isEmpty() || C3004f.values()[Integer.parseInt(string6)] == C3004f.NONE) ? false : true;
            return new C7322c(i2, string4, i3, string5, string, string2, C2491i.m6814b(string3), z, i);
        }

        public final int getItemViewType(int i) {
            return 1;
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return mo3449a(viewGroup, i);
        }
    }

    private void m17933b(final int i) {
        getActivity().runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6926a f11932b;

            public final void run() {
                this.f11932b.f19796h.setVisibility(i);
            }
        });
    }

    private void m17935d() {
        Bundle bundle = new Bundle();
        bundle.putString("KEY_SEARCH_PATTERN", "");
        this.f19791b.setPadding(0, 0, 0, 0);
        ((C7576b) getActivity()).m19190e().mo270b(51, bundle, this);
        if (!this.f19794f) {
            m17933b(8);
            if (this.f19792c.m13682b() == 0) {
                this.f19795g.setVisibility(0);
            }
            m17937f();
        }
    }

    private void m17936e() {
        getActivity().runOnUiThread(new C41903(this));
    }

    private void m17937f() {
        C2808d.m7148b(new C6764b(this.f19793e));
    }

    public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
        i = this.f19793e;
        StringBuilder stringBuilder = new StringBuilder(" WHERE landing_page_row_items.row_item_landing_page_row_id = '");
        stringBuilder.append(i);
        stringBuilder.append("' ");
        String stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder("SELECT landing_page_row_items._id,row_item_image,row_item_title,row_item_subtitle,row_item_button_text,row_item_display_order,row_item_action_type,row_item_action_data,row_item_landing_page_row_id,row_item_button_action_data,row_item_button_action_type,dialog_party,dialog_my_role,dialog_state,dialog_link,dialog_type FROM landing_page_row_items LEFT JOIN dialogs ON dialogs.dialog_party = row_item_action_data");
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(" ORDER BY row_item_display_order ASC ");
        stringBuilder2 = stringBuilder.toString();
        return new C7318h(C2993d.f9391a, stringBuilder2, C2993d.f9391a, C2981h.f9316a);
    }

    public final void mo2227a() {
        if (this.f19792c != null) {
            this.f19792c.m13684c(null);
        }
    }

    public final void mo3245a(int i) {
        this.f19793e = i;
        if (this.f19793e == -101) {
            C4478a.m8170f(getActivity());
        } else if (this.f19793e == -102) {
            C4478a.m8171g(getActivity());
        } else if (this.f19793e == -103) {
            C4478a.m8172h(getActivity());
        } else if (this.f19793e == -104) {
            C4478a.m8173i(getActivity());
        } else if (this.f19793e == -105) {
            if (C3337b.m7816c(getActivity())) {
                Activity activity = getActivity();
                Intent intent = new Intent(activity, ChannelsMapsActivity.class);
                intent.putExtra("KEY_NEAR_BY", true);
                if (activity != null) {
                    activity.startActivity(intent);
                    C4478a.m8165c(activity, true);
                }
            }
        } else {
            m17935d();
        }
    }

    public final void mo3246a(int i, String str) {
        C4220b.m8045a(getActivity(), i, str, null, null, false);
    }

    public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f19792c != null) {
            this.f19792c.m13684c(cursor);
            if (this.f19792c.m13682b() > 0) {
                m17936e();
            }
        }
    }

    public final void mo3242a(C6829g c6829g) {
    }

    public final void mo3239b() {
        if (this.f19791b != null) {
            this.f19791b.scrollToPosition(0);
        }
    }

    public final void mo3243b(C6829g c6829g) {
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_explore_channel_page, menu);
        C2491i.m6790a(menu.findItem(R.id.action_search).getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19790a = layoutInflater.inflate(R.layout.fragment_explore_channels_list, viewGroup, false);
        return this.f19790a;
    }

    public final void onEvent(final C5922o c5922o) {
        getActivity().runOnUiThread(new Runnable(this) {
            final /* synthetic */ C6926a f11938b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(this.f11938b.getActivity(), c5922o.f8890a);
            }
        });
    }

    public final void onEvent(C2650p c2650p) {
        getActivity().runOnUiThread(new C41947(this));
    }

    public final void onEvent(C5923q c5923q) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C41925(this));
        }
    }

    public final void onEvent(C2651r c2651r) {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new C41914(this));
        }
    }

    public final void onEvent(C5953a c5953a) {
        m17933b(0);
        m17936e();
    }

    public final void onEvent(C2724b c2724b) {
        m17933b(8);
        m17936e();
    }

    public final void onEvent(C2831f c2831f) {
        C4220b.m8046a(getActivity(), c2831f);
    }

    public final void onEvent(C2832g c2832g) {
        C4220b.m8047a(getActivity(), c2832g);
    }

    public final void onEvent(C5988h c5988h) {
        C4220b.m8048a(getActivity(), c5988h);
    }

    public final void onEvent(C2833i c2833i) {
        C4220b.m8049a(getActivity(), c2833i);
    }

    public final void onEvent(C2834j c2834j) {
        C4220b.m8050a(getActivity(), c2834j);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_search) {
            return super.onOptionsItemSelected(menuItem);
        }
        C4478a.m8154a(getActivity(), false);
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence string;
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        bundle = getArguments();
        Object obj = null;
        if (bundle != null) {
            if (bundle.containsKey("KEY_CATEGORY_ID")) {
                this.f19793e = bundle.getInt("KEY_CATEGORY_ID");
            }
            string = bundle.containsKey("KEY_CATEGORY_NAME_ID") ? bundle.getString("KEY_CATEGORY_NAME_ID") : null;
            if (bundle.containsKey("KEY_CATEGORY_IMAGE")) {
                obj = bundle.getString("KEY_CATEGORY_IMAGE");
            }
        } else {
            string = null;
        }
        this.d = (Toolbar) this.f19790a.findViewById(R.id.toolbar);
        this.d.setTitle(string);
        ((C7576b) getActivity()).m20722a(this.d, false);
        m7632a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        C2491i.m6790a(this.d.getNavigationIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        this.f19791b = (RecyclerView) this.f19790a.findViewById(R.id.recycler_view);
        this.f19795g = (ProgressWheel) this.f19790a.findViewById(R.id.progress_wheel);
        this.f19796h = (LinearLayout) this.f19790a.findViewById(R.id.retry_linearLayout);
        Button button = (Button) this.f19790a.findViewById(R.id.retryExploreChannelButton);
        button.setOnClickListener(new C41881(this));
        Adapter c7216a = new C7216a();
        this.f19792c = new C7216a(this, getActivity());
        this.f19797i = new ImageView(getActivity());
        c7216a.m14441a(C6241b.m14443a(this.f19797i));
        c7216a.m14441a(this.f19792c);
        this.f19791b.setHasFixedSize(true);
        this.f19791b.setAdapter(c7216a);
        this.f19791b.setLayoutManager(new LinearLayoutManager(getActivity()));
        if (obj != null) {
            if (!obj.isEmpty()) {
                this.f19797i.setMinimumHeight(C2489g.m6754a().m6755a(0.4f));
                this.f19797i.setMinimumWidth(C2489g.m6754a().m6755a(BallPulseIndicator.SCALE));
                C1212c.m2872a(getActivity()).m10950a(obj).m3033a().m3031a(this.f19797i);
                this.f19797i.setVisibility(0);
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("KEY_SEARCH_PATTERN", "");
        ((C7576b) getActivity()).m19190e().mo268a(51, bundle2, this);
        C2491i.m6819b(button, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6798a(button, UIThemeManager.getmInstance().getButton_text_color());
        m17937f();
    }
}
