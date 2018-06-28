package mobi.mmdt.ott.view.settings.mainsettings.changeTab;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.C7406c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.contact.p415a.C3266c;
import mobi.mmdt.ott.view.newdesign.mainpage.C4258b;
import mobi.mmdt.ott.view.newdesign.mainpage.MainActivity;
import mobi.mmdt.ott.view.settings.mainsettings.appearance.AppearanceSettingActivity;
import mobi.mmdt.ott.view.settings.mainsettings.changeTab.p472a.C6967a;
import mobi.mmdt.ott.view.settings.mainsettings.changeTab.p584b.C7224a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4522p;

public class ChangeTabActivity extends C7576b implements C3266c {
    private C6966a f24433m;
    private boolean f24434n;
    private boolean f24435o;
    private boolean f24436p;
    private boolean f24437q;
    private boolean f24438r;

    class C43791 implements OnClickListener {
        final /* synthetic */ ChangeTabActivity f12248a;

        C43791(ChangeTabActivity changeTabActivity) {
            this.f12248a = changeTabActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f12248a.m21381g();
            C4258b.m8066a(ChangeTabActivity.m21378b(this.f12248a));
            this.f12248a.m21383i();
        }
    }

    class C43802 implements OnClickListener {
        final /* synthetic */ ChangeTabActivity f12249a;

        C43802(ChangeTabActivity changeTabActivity) {
            this.f12249a = changeTabActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f12249a.m21382h();
        }
    }

    private class C6966a extends C6074f {
        final /* synthetic */ ChangeTabActivity f19891a;

        C6966a(ChangeTabActivity changeTabActivity, Context context) {
            this.f19891a = changeTabActivity;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            super.mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return i != 0 ? null : new C6967a(this.f16246b, viewGroup, this.f19891a);
        }
    }

    static /* synthetic */ C7406c m21378b(ChangeTabActivity changeTabActivity) {
        return changeTabActivity;
    }

    private void m21381g() {
        C2535a a = C2535a.m6888a();
        a.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_MERGE_TAB_ENABLE", this.f24438r).apply();
        a = C2535a.m6888a();
        a.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_SINGLE_TAB_ENABLE", this.f24437q).apply();
        a = C2535a.m6888a();
        a.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_GROUP_TAB_ENABLE", this.f24436p).apply();
        a = C2535a.m6888a();
        a.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_CHANNEL_TAB_ENABLE", this.f24435o).apply();
        a = C2535a.m6888a();
        a.f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_IS_CONTACT_TAB_ENABLE2", this.f24434n).apply();
    }

    private void m21382h() {
        startActivity(new Intent(this, AppearanceSettingActivity.class));
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
        finish();
    }

    private void m21383i() {
        startActivity(new Intent(this, MainActivity.class));
    }

    public final void mo2290c(int i) {
        C7224a c7224a = (C7224a) this.f24433m.m13671a(i);
        c7224a.f20866d = true;
        switch (c7224a.f20863a) {
            case 0:
                this.f24438r = true;
                return;
            case 1:
                this.f24437q = true;
                return;
            case 2:
                this.f24436p = true;
                return;
            case 3:
                this.f24435o = true;
                return;
            case 4:
                this.f24434n = true;
                return;
            default:
                return;
        }
    }

    public final void mo2291d(int i) {
        C7224a c7224a = (C7224a) this.f24433m.m13671a(i);
        c7224a.f20866d = false;
        switch (c7224a.f20863a) {
            case 0:
                this.f24438r = false;
                return;
            case 1:
                this.f24437q = false;
                return;
            case 2:
                this.f24436p = false;
                return;
            case 3:
                this.f24435o = false;
                return;
            case 4:
                this.f24434n = false;
                return;
            default:
                return;
        }
    }

    public void onBackPressed() {
        if (this.f24438r == C2535a.m6888a().ag().booleanValue() && this.f24437q == C2535a.m6888a().af().booleanValue() && this.f24436p == C2535a.m6888a().ad().booleanValue() && this.f24435o == C2535a.m6888a().ae().booleanValue()) {
            if (this.f24434n == C2535a.m6888a().ah().booleanValue()) {
                m21382h();
                return;
            }
        }
        C4488b.m8182a(this, C4522p.m8236a(R.string.save_changes), C4522p.m8236a(R.string.are_you_sure_to_save), C4522p.m8236a(R.string.save), new C43791(this), C4522p.m8236a(R.string.cancel), new C43802(this));
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_change_tab);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        this.f24433m = new C6966a(this, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.y = findViewById(R.id.shadow_line_top);
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(this.f24433m);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        if (bundle != null) {
            this.f24438r = bundle.getBoolean("KEY_IS_MERGE_CHAT_CHECKED");
            this.f24437q = bundle.getBoolean("KEY_IS_SINGLE_CHAT_CHECKED");
            this.f24436p = bundle.getBoolean("KEY_IS_GROUP_CHAT_CHECKED");
            this.f24435o = bundle.getBoolean("KEY_IS_CHANNEL_CHAT_CHECKED");
            z = bundle.getBoolean("KEY_IS_CONTACT_CHECKED");
        } else {
            this.f24438r = C2535a.m6888a().ag().booleanValue();
            this.f24437q = C2535a.m6888a().af().booleanValue();
            this.f24436p = C2535a.m6888a().ad().booleanValue();
            this.f24435o = C2535a.m6888a().ae().booleanValue();
            z = C2535a.m6888a().ah().booleanValue();
        }
        this.f24434n = z;
        List arrayList = new ArrayList();
        arrayList.add(new C7224a(0, C4522p.m8236a(R.string.change_tab_item_all), true, this.f24438r, 0));
        arrayList.add(new C7224a(1, C4522p.m8236a(R.string.change_tab_item_single), true, this.f24437q, 1));
        arrayList.add(new C7224a(2, C4522p.m8236a(R.string.change_tab_item_groups), true, this.f24436p, 2));
        arrayList.add(new C7224a(3, C4522p.m8236a(R.string.change_tab_item_channels), true, this.f24435o, 3));
        arrayList.add(new C7224a(4, C4522p.m8236a(R.string.change_tab_item_contacts), true, this.f24434n, 4));
        arrayList.add(new C7224a(5, C4522p.m8236a(R.string.change_tab_item_official_channels), false, true, 5));
        this.f24433m.m13673a(arrayList);
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.action_change_tab));
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20725t();
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_dark, menu);
        C2491i.m6790a(menu.findItem(R.id.action_done).getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            m21381g();
            C4258b.m8066a(this);
            m21383i();
            return true;
        }
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_IS_ROTATED", true);
        bundle.putBoolean("KEY_IS_MERGE_CHAT_CHECKED", this.f24438r);
        bundle.putBoolean("KEY_IS_SINGLE_CHAT_CHECKED", this.f24437q);
        bundle.putBoolean("KEY_IS_GROUP_CHAT_CHECKED", this.f24436p);
        bundle.putBoolean("KEY_IS_CHANNEL_CHAT_CHECKED", this.f24435o);
        bundle.putBoolean("KEY_IS_CONTACT_CHECKED", this.f24434n);
    }
}
