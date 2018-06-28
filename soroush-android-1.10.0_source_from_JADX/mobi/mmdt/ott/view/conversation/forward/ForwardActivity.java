package mobi.mmdt.ott.view.conversation.forward;

import android.app.Activity;
import android.app.Dialog;
import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.design.widget.TabLayout;
import android.support.v4.view.C0565n;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SearchView.OnCloseListener;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.components.fab.UnreadCounterFab;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.main.p451a.C4143a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4522p;

public class ForwardActivity extends C7576b implements C3101a, C4053d {
    HashMap<String, Integer> f24334m = new HashMap();
    private C4143a f24335n;
    private C4143a f24336o;
    private C4143a f24337p;
    private ArrayList<String> f24338q;
    private boolean f24339r;
    private SearchView f24340s;
    private String f24341t = "";
    private UnreadCounterFab f24342u;
    private String f24343v = "";
    private C2978e f24344w;
    private Intent f24345z;

    class C40481 implements OnClickListener {
        final /* synthetic */ ForwardActivity f11611a;

        C40481(ForwardActivity forwardActivity) {
            this.f11611a = forwardActivity;
        }

        public final void onClick(View view) {
            int size = this.f11611a.f24334m.size();
            if (size <= 0) {
                Toast.makeText(this.f11611a, C4522p.m8236a(R.string.no_item_selected), 0).show();
            } else if (size == 1) {
                for (String str : this.f11611a.f24334m.keySet()) {
                    this.f11611a.mo3667a(str, C2978e.values()[((Integer) this.f11611a.f24334m.get(str)).intValue()], false, null, null);
                }
            } else if (this.f11611a.f24339r) {
                Bundle bundle = new Bundle();
                bundle.putInt("dialog_id", 10001);
                this.f11611a.b_(bundle);
            }
        }
    }

    class C40494 implements DialogInterface.OnClickListener {
        final /* synthetic */ ForwardActivity f11612a;

        C40494(ForwardActivity forwardActivity) {
            this.f11612a = forwardActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f11612a.f24344w != null) {
                this.f11612a.mo3667a(this.f11612a.f24343v, this.f11612a.f24344w, true, new ArrayList(this.f11612a.f24334m.keySet()), new ArrayList(this.f11612a.f24334m.values()));
                return;
            }
            this.f11612a.finish();
        }
    }

    class C62132 implements OnCloseListener {
        final /* synthetic */ ForwardActivity f16804a;

        C62132(ForwardActivity forwardActivity) {
            this.f16804a = forwardActivity;
        }

        public final boolean onClose() {
            return false;
        }
    }

    class C62143 implements OnQueryTextListener {
        final /* synthetic */ ForwardActivity f16805a;

        C62143(ForwardActivity forwardActivity) {
            this.f16805a = forwardActivity;
        }

        public final boolean onQueryTextChange(String str) {
            this.f16805a.f24341t = str;
            this.f16805a.f24337p.mo2375a(str);
            this.f16805a.f24336o.mo2375a(str);
            this.f16805a.f24335n.mo2375a(str);
            return false;
        }

        public final boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class C6215a extends C0565n {
        final /* synthetic */ ForwardActivity f16806a;

        public C6215a(ForwardActivity forwardActivity) {
            this.f16806a = forwardActivity;
        }

        public final Object mo208a(ViewGroup viewGroup, int i) {
            C4143a c;
            View c2 = this.f16806a.f24337p.m8003c();
            switch (i) {
                case 0:
                    c = this.f16806a.f24337p;
                    break;
                case 1:
                    c = this.f16806a.f24336o;
                    break;
                case 2:
                    c = this.f16806a.f24335n;
                    break;
                default:
                    return c2;
            }
            c2 = c.m8003c();
            viewGroup.addView(c2, 0);
            return c2;
        }

        public final void mo211a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public final boolean mo213a(View view, Object obj) {
            return obj == view;
        }

        public final int mo2270b() {
            return 3;
        }

        public final CharSequence mo2364b(int i) {
            switch (i) {
                case 0:
                    i = R.string.fw_recent;
                    break;
                case 1:
                    i = R.string.fw_groups_and_channels;
                    break;
                case 2:
                    i = R.string.fw_contacts;
                    break;
                default:
                    return null;
            }
            return C4522p.m8236a(i);
        }
    }

    public final Dialog mo2299a(Bundle bundle) {
        if (bundle.getInt("dialog_id") != 10001) {
            return null;
        }
        return C4488b.m8182a(this, C4522p.m8236a(R.string.forward), C4522p.m8236a(R.string.are_you_sure_send_this_message), C4522p.m8236a(R.string.ok_cap), new C40494(this), C4522p.m8236a(R.string.cancel), null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3667a(java.lang.String r6, mobi.mmdt.ott.provider.p385g.C2978e r7, boolean r8, java.util.ArrayList<java.lang.String> r9, java.util.ArrayList<java.lang.Integer> r10) {
        /*
        r5 = this;
        r0 = r5.f24339r;
        r1 = 18;
        r2 = 1;
        if (r0 == 0) goto L_0x00ae;
    L_0x0007:
        r0 = mobi.mmdt.ott.view.conversation.forward.ForwardActivity.C40505.f11613a;
        r7 = r7.ordinal();
        r7 = r0[r7];
        switch(r7) {
            case 1: goto L_0x007b;
            case 2: goto L_0x004c;
            case 3: goto L_0x0014;
            default: goto L_0x0012;
        };
    L_0x0012:
        goto L_0x00aa;
    L_0x0014:
        r7 = r5.f24338q;
        r0 = new android.content.Intent;
        r3 = mobi.mmdt.ott.view.conversation.activities.ConversationActivity.class;
        r0.<init>(r5, r3);
        r3 = "KEY_START_KIND";
        r4 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10381c;
        r4 = r4 - r2;
        r0.putExtra(r3, r4);
        r3 = "KEY_PARTY";
        r0.putExtra(r3, r6);
        r6 = "key_to_forward_message_id";
        r0.putStringArrayListExtra(r6, r7);
        if (r8 == 0) goto L_0x0040;
    L_0x0031:
        r6 = "KEY_IS_MULTI_USER";
        r0.putExtra(r6, r2);
        r6 = "KEY_TO_FORWARD_ARRAY_LIST_PEER_PARTY";
        r0.putStringArrayListExtra(r6, r9);
        r6 = "KEY_TO_FORWARD_ARRAY_LIST_GROUP_ID";
        r0.putIntegerArrayListExtra(r6, r10);
    L_0x0040:
        if (r5 == 0) goto L_0x00aa;
    L_0x0042:
        r5.finish();
        r5.startActivity(r0);
        mobi.mmdt.ott.view.tools.C4478a.m8165c(r5, r2);
        goto L_0x00aa;
    L_0x004c:
        r7 = r5.f24338q;
        r0 = new android.content.Intent;
        r3 = mobi.mmdt.ott.view.conversation.activities.ConversationActivity.class;
        r0.<init>(r5, r3);
        r3 = "KEY_START_KIND";
        r4 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10380b;
        r4 = r4 - r2;
        r0.putExtra(r3, r4);
        r3 = "KEY_PARTY";
        r0.putExtra(r3, r6);
        if (r8 == 0) goto L_0x0073;
    L_0x0064:
        r6 = "KEY_IS_MULTI_USER";
        r0.putExtra(r6, r2);
        r6 = "KEY_TO_FORWARD_ARRAY_LIST_PEER_PARTY";
        r0.putStringArrayListExtra(r6, r9);
        r6 = "KEY_TO_FORWARD_ARRAY_LIST_GROUP_ID";
        r0.putIntegerArrayListExtra(r6, r10);
    L_0x0073:
        r6 = "key_to_forward_message_id";
        r0.putStringArrayListExtra(r6, r7);
        if (r5 == 0) goto L_0x00aa;
    L_0x007a:
        goto L_0x0042;
    L_0x007b:
        r7 = r5.f24338q;
        r0 = new android.content.Intent;
        r3 = mobi.mmdt.ott.view.conversation.activities.ConversationActivity.class;
        r0.<init>(r5, r3);
        r3 = "KEY_START_KIND";
        r4 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10379a;
        r4 = r4 - r2;
        r0.putExtra(r3, r4);
        r3 = "KEY_PARTY";
        r0.putExtra(r3, r6);
        if (r8 == 0) goto L_0x00a2;
    L_0x0093:
        r6 = "KEY_IS_MULTI_USER";
        r0.putExtra(r6, r2);
        r6 = "KEY_TO_FORWARD_ARRAY_LIST_PEER_PARTY";
        r0.putStringArrayListExtra(r6, r9);
        r6 = "KEY_TO_FORWARD_ARRAY_LIST_GROUP_ID";
        r0.putIntegerArrayListExtra(r6, r10);
    L_0x00a2:
        r6 = "key_to_forward_message_id";
        r0.putStringArrayListExtra(r6, r7);
        if (r5 == 0) goto L_0x00aa;
    L_0x00a9:
        goto L_0x0042;
    L_0x00aa:
        r5.setResult(r1);
        return;
    L_0x00ae:
        if (r8 != 0) goto L_0x00f4;
    L_0x00b0:
        r8 = r5.f24345z;
        if (r8 == 0) goto L_0x00f1;
    L_0x00b4:
        r9 = new android.content.Intent;
        r10 = mobi.mmdt.ott.view.conversation.activities.ConversationActivity.class;
        r9.<init>(r5, r10);
        r10 = "KEY_START_KIND";
        r0 = mobi.mmdt.ott.view.conversation.activities.C3385c.C33841.f10385a;
        r7 = r7.ordinal();
        r7 = r0[r7];
        switch(r7) {
            case 1: goto L_0x00c8;
            case 2: goto L_0x00d1;
            case 3: goto L_0x00ce;
            case 4: goto L_0x00cb;
            default: goto L_0x00c8;
        };
    L_0x00c8:
        r7 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10379a;
        goto L_0x00d3;
    L_0x00cb:
        r7 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10383e;
        goto L_0x00d3;
    L_0x00ce:
        r7 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10381c;
        goto L_0x00d3;
    L_0x00d1:
        r7 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10380b;
    L_0x00d3:
        r7 = r7 - r2;
        r9.putExtra(r10, r7);
        r7 = "KEY_PARTY";
        r9.putExtra(r7, r6);
        r6 = "KEY_SHARE_INTENT";
        r9.putExtra(r6, r8);
        r6 = "key_is_share_mode";
        r9.putExtra(r6, r2);
        if (r5 == 0) goto L_0x00f1;
    L_0x00e8:
        r5.finish();
        r5.startActivity(r9);
        mobi.mmdt.ott.view.tools.C4478a.m8165c(r5, r2);
    L_0x00f1:
        r5.setResult(r1);
    L_0x00f4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.forward.ForwardActivity.a(java.lang.String, mobi.mmdt.ott.provider.g.e, boolean, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void mo3643g() {
        this.f24342u.setCount(this.f24334m.size());
    }

    public final void m21259h() {
        if (this.f24341t != null && this.f24341t.isEmpty() && this.f24340s != null) {
            this.f24340s.setIconified(false);
            this.f24340s.setQuery("", true);
        }
    }

    public final void m21260i() {
        C6218c c6218c = (C6218c) this.f24337p;
        if (c6218c.f16824a != null) {
            c6218c.f16824a.notifyDataSetChanged();
            c6218c.m14348b();
        }
    }

    public final void m21261j() {
        C6217b c6217b = (C6217b) this.f24336o;
        if (c6217b.f16815a != null) {
            c6217b.f16815a.notifyDataSetChanged();
        }
    }

    public final void m21262k() {
        C6216a c6216a = (C6216a) this.f24335n;
        if (c6216a.f16808b != null) {
            c6216a.f16808b.notifyDataSetChanged();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_forward);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        this.f24342u = (UnreadCounterFab) findViewById(R.id.fab);
        this.y = findViewById(R.id.shadow_line_top);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            this.f24339r = getIntent().getExtras().getBoolean("key_is_forward_mode", false);
            if (getIntent().getExtras().containsKey("KEY_PEER_PARTY")) {
                this.f24343v = getIntent().getExtras().getString("KEY_PEER_PARTY");
            }
            if (getIntent().getExtras().containsKey("KEY_GROUP_TYPE")) {
                this.f24344w = C2978e.values()[getIntent().getExtras().getInt("KEY_GROUP_TYPE")];
            }
        }
        if (this.f24339r) {
            C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.forward_to));
            this.f24342u.setVisibility(0);
        } else {
            C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.share_with));
            this.f24342u.setVisibility(8);
            ((C0273d) this.f24342u.getLayoutParams()).m507a(null);
            this.f24345z = getIntent();
        }
        this.f24338q = getIntent().getStringArrayListExtra("key_to_forward_message_id");
        this.f24335n = new C6216a(this, this, this.f24339r);
        this.f24336o = new C6217b(this, this, this.f24339r);
        this.f24337p = new C6218c(this, this, this.f24339r);
        C0565n c6215a = new C6215a(this);
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(3);
            viewPager.setAdapter(c6215a);
        }
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(viewPager);
            C2491i.m6796a((View) tabLayout, UIThemeManager.getmInstance().getPrimary_color());
            C2491i.m6792a(tabLayout, UIThemeManager.getmInstance().getTab_not_selected_gray_color(), UIThemeManager.getmInstance().getTab_selected_color());
            ViewGroup viewGroup = (ViewGroup) tabLayout.getChildAt(0);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i);
                int childCount2 = viewGroup2.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    if (viewGroup2.getChildAt(i2) instanceof TextView) {
                        C2491i.m6803a((TextView) viewGroup2.getChildAt(i2));
                    }
                }
            }
        }
        this.f24342u.setOnClickListener(new C40481(this));
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20725t();
        m20726u();
        C2491i.m6791a(this.f24342u, UIThemeManager.getmInstance().getAccent_color(), UIThemeManager.getmInstance().getFab_ripple_color());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem findItem = menu.findItem(R.id.action_search);
        SearchManager searchManager = (SearchManager) getSystemService("search");
        if (findItem != null) {
            findItem.setTitle(C4522p.m8236a(R.string.action_search));
            this.f24340s = (SearchView) findItem.getActionView();
        }
        if (this.f24340s != null) {
            this.f24340s.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            SearchView searchView = this.f24340s;
            if (searchView != null) {
                ImageView imageView = (ImageView) searchView.findViewById(R.id.search_button);
                imageView.setImageResource(R.drawable.ic_search);
                C2491i.m6801a(imageView, UIThemeManager.getmInstance().getIcon_not_selected_color());
                imageView = (ImageView) searchView.findViewById(R.id.search_close_btn);
                imageView.setImageResource(R.drawable.ic_close_gray);
                C2491i.m6801a(imageView, UIThemeManager.getmInstance().getIcon_not_selected_color());
                View view = (TextView) searchView.findViewById(R.id.search_src_text);
                view.setTextColor(UIThemeManager.getmInstance().getText_primary_new_design_color());
                view.setHintTextColor(UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color());
                C2491i.m6818b(view, UIThemeManager.getmInstance().getAccent_color());
                Display defaultDisplay = getWindowManager().getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                searchView.setMaxWidth(point.x);
            }
        }
        Display defaultDisplay2 = getWindowManager().getDefaultDisplay();
        Point point2 = new Point();
        defaultDisplay2.getSize(point2);
        this.f24340s.setMaxWidth(point2.x);
        this.f24340s.setOnCloseListener(new C62132(this));
        if (!this.f24341t.isEmpty()) {
            this.f24340s.setIconified(false);
            this.f24340s.setQuery(this.f24341t, false);
            this.f24337p.mo2375a(this.f24341t);
            this.f24336o.mo2375a(this.f24341t);
            this.f24335n.mo2375a(this.f24341t);
        }
        this.f24340s.setImeOptions(this.f24340s.getImeOptions() | 268435456);
        this.f24340s.setOnQueryTextListener(new C62143(this));
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
        getLoaderManager().destroyLoader(13);
        getLoaderManager().destroyLoader(11);
        getLoaderManager().destroyLoader(12);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
