package mobi.mmdt.ott.view.block;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C7406c;
import android.view.Menu;
import android.view.MenuItem;
import com.p072b.p073a.p074a.C1063i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a;
import mobi.mmdt.ott.logic.p261a.p276b.C2622a.C2621a;
import mobi.mmdt.ott.logic.p261a.p276b.C2624e;
import mobi.mmdt.ott.logic.p261a.p276b.C5908d;
import mobi.mmdt.ott.logic.p261a.p276b.C6679b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.contact.p415a.C7696b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class AddParticipantsBlockContactSelectionListActivity extends C7696b {
    private boolean f24577o;

    class C30312 implements Runnable {
        final /* synthetic */ AddParticipantsBlockContactSelectionListActivity f9509a;

        class C30301 implements Runnable {
            final /* synthetic */ C30312 f9508a;

            C30301(C30312 c30312) {
                this.f9508a = c30312;
            }

            public final void run() {
                this.f9508a.f9509a.mo3643g();
                this.f9508a.f9509a.finish();
                this.f9508a.f9509a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        }

        C30312(AddParticipantsBlockContactSelectionListActivity addParticipantsBlockContactSelectionListActivity) {
            this.f9509a = addParticipantsBlockContactSelectionListActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            this.f9509a.f24577o = false;
            new Handler().postDelayed(new C30301(this), 100);
        }
    }

    static /* synthetic */ C7406c m21542a(AddParticipantsBlockContactSelectionListActivity addParticipantsBlockContactSelectionListActivity) {
        return addParticipantsBlockContactSelectionListActivity;
    }

    static /* synthetic */ C7406c m21545d(AddParticipantsBlockContactSelectionListActivity addParticipantsBlockContactSelectionListActivity) {
        return addParticipantsBlockContactSelectionListActivity;
    }

    public void onCreate(Bundle bundle) {
        if (getIntent() != null && getIntent().getExtras() != null && MyApplication.m12950a().f15912r.isEmpty() && getIntent().getExtras().containsKey("KEY_CHECKED_USERNAME_ARRAYLIST")) {
            ArrayList stringArrayList = getIntent().getExtras().getStringArrayList("KEY_CHECKED_USERNAME_ARRAYLIST");
            if (stringArrayList != null) {
                this.n = true;
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    MyApplication.m12950a().f15912r.put((String) it.next(), Boolean.valueOf(false));
                }
            }
        }
        super.onCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_dark, menu);
        C2491i.m6790a(menu.findItem(R.id.action_done).getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(final C5908d c5908d) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ AddParticipantsBlockContactSelectionListActivity f9511b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f9511b.f24577o = false;
                C4513i.m8228a(AddParticipantsBlockContactSelectionListActivity.m21545d(this.f9511b), c5908d.f8890a);
            }
        });
    }

    public void onEvent(C2624e c2624e) {
        runOnUiThread(new C30312(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (!this.f24577o) {
            this.f24577o = true;
            ArrayList arrayList = new ArrayList();
            for (Entry entry : MyApplication.m12950a().f15912r.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    arrayList.add(new C2622a((String) entry.getKey(), C2621a.f8519a));
                }
            }
            final C1063i c6679b = new C6679b(arrayList);
            C2808d.m7148b(c6679b);
            runOnUiThread(new Runnable(this) {
                final /* synthetic */ AddParticipantsBlockContactSelectionListActivity f9507b;

                public final void run() {
                    C4501c.m8189a().m8192a(AddParticipantsBlockContactSelectionListActivity.m21542a(this.f9507b), c6679b);
                }
            });
        }
        return true;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.action_add_participants_block));
    }
}
