package mobi.mmdt.ott.view.conversation.groupinfo;

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
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p316a.C2737b;
import mobi.mmdt.ott.logic.p261a.p311r.p315b.p317b.C6773a;
import mobi.mmdt.ott.logic.p350g.C2816a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.contact.p415a.C7696b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class AddParticipantsGroupContactSelectionListActivity extends C7696b {
    private String f24703o;
    private boolean f24704p;

    class C40622 implements Runnable {
        final /* synthetic */ AddParticipantsGroupContactSelectionListActivity f11631a;

        class C40611 implements Runnable {
            final /* synthetic */ C40622 f11630a;

            C40611(C40622 c40622) {
                this.f11630a = c40622;
            }

            public final void run() {
                MyApplication.m12950a().f15912r.clear();
                this.f11630a.f11631a.finish();
                this.f11630a.f11631a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        }

        C40622(AddParticipantsGroupContactSelectionListActivity addParticipantsGroupContactSelectionListActivity) {
            this.f11631a = addParticipantsGroupContactSelectionListActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C40611(this), 100);
        }
    }

    static /* synthetic */ C7406c m21842a(AddParticipantsGroupContactSelectionListActivity addParticipantsGroupContactSelectionListActivity) {
        return addParticipantsGroupContactSelectionListActivity;
    }

    private C5891a m21843a(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
            arrayList3.add(C3004f.MEMBER);
        }
        C1063i c6773a = new C6773a(this.f24703o, arrayList2, arrayList3);
        C2808d.m7148b(c6773a);
        return c6773a;
    }

    static /* synthetic */ C7406c m21845c(AddParticipantsGroupContactSelectionListActivity addParticipantsGroupContactSelectionListActivity) {
        return addParticipantsGroupContactSelectionListActivity;
    }

    public void onCreate(Bundle bundle) {
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            if (MyApplication.m12950a().f15912r.isEmpty() && getIntent().getExtras().containsKey("KEY_CHECKED_USERNAME_ARRAYLIST")) {
                ArrayList stringArrayList = getIntent().getExtras().getStringArrayList("KEY_CHECKED_USERNAME_ARRAYLIST");
                if (stringArrayList != null) {
                    this.n = true;
                    Iterator it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        MyApplication.m12950a().f15912r.put((String) it.next(), Boolean.valueOf(false));
                    }
                }
            }
            if (getIntent().getExtras().containsKey("KEY_GROUP_ID")) {
                this.f24703o = getIntent().getExtras().getString("KEY_GROUP_ID");
            }
        }
        super.onCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_dark, menu);
        C2491i.m6790a(menu.findItem(R.id.action_done).getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(C2737b c2737b) {
        runOnUiThread(new C40622(this));
    }

    public void onEvent(final C2816a c2816a) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ AddParticipantsGroupContactSelectionListActivity f11633b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f11633b.f24704p = false;
                C4513i.m8228a(AddParticipantsGroupContactSelectionListActivity.m21845c(this.f11633b), c2816a.f8890a);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (!this.f24704p) {
            this.f24704p = true;
            ArrayList arrayList = new ArrayList();
            for (Entry entry : MyApplication.m12950a().f15912r.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    arrayList.add(entry.getKey());
                }
            }
            final C5891a a = m21843a(arrayList);
            runOnUiThread(new Runnable(this) {
                final /* synthetic */ AddParticipantsGroupContactSelectionListActivity f11629b;

                public final void run() {
                    C4501c.m8189a().m8192a(AddParticipantsGroupContactSelectionListActivity.m21842a(this.f11629b), a);
                }
            });
        }
        return true;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.action_add_participants));
    }
}
