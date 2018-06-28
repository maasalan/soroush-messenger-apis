package mobi.mmdt.ott.view.main;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.C7406c;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.p072b.p073a.p074a.C1063i;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C2732b;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p313a.C5956a;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b.C6768b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.contact.p415a.C7696b;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class NewGroupContactSelectionListActivity extends C7696b {
    private boolean f24754o = false;

    static /* synthetic */ C7406c m21960b(NewGroupContactSelectionListActivity newGroupContactSelectionListActivity) {
        return newGroupContactSelectionListActivity;
    }

    static /* synthetic */ C7406c m21962d(NewGroupContactSelectionListActivity newGroupContactSelectionListActivity) {
        return newGroupContactSelectionListActivity;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_dark, menu);
        C2491i.m6790a(menu.findItem(R.id.action_done).getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(final C5956a c5956a) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ NewGroupContactSelectionListActivity f11815b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f11815b.f24754o = false;
                C4513i.m8228a(NewGroupContactSelectionListActivity.m21962d(this.f11815b), c5956a.f8890a);
            }
        });
    }

    public void onEvent(final C2732b c2732b) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ NewGroupContactSelectionListActivity f11813b;

            public final void run() {
                C4501c.m8189a().m8193b();
                String str = c2732b.f8688a;
                this.f11813b.mo3643g();
                C4478a.m8160b(NewGroupContactSelectionListActivity.m21960b(this.f11813b), str, true, null, "");
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (!this.f24754o) {
            ArrayList h = C7696b.m21195h();
            if (h.size() <= 0) {
                Toast.makeText(MyApplication.m12952b(), C4522p.m8236a(R.string.you_must_select_at_least_one_user), 0).show();
                return true;
            }
            C1063i c6768b = new C6768b(getIntent().getExtras().getString("KEY_GROUP_NAME"), getIntent().getExtras().getString("KEY_GROUP_MOTTO"), getIntent().getExtras().getString("KEY_GROUP_IMAGE"), h);
            C2808d.m7147a(c6768b);
            C4501c.m8189a().m8192a(this, c6768b);
            this.f24754o = true;
        }
        return true;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.new_group_chat));
        if (getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().containsKey("KEY_GROUP_NAME")) {
            C2475a.m6721b(this, getIntent().getExtras().getString("KEY_GROUP_NAME"));
        }
    }
}
