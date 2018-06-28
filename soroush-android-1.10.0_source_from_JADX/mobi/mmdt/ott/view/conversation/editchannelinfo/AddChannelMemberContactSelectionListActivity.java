package mobi.mmdt.ott.view.conversation.editchannelinfo;

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
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberRole;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C2645g;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5918f;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6700i;
import mobi.mmdt.ott.logic.p261a.p298k.C6736a;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2696b;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5938a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.contact.p415a.C7696b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class AddChannelMemberContactSelectionListActivity extends C7696b {
    private boolean f24673o;
    private String f24674p;
    private boolean f24675q = false;

    class C39882 implements Runnable {
        final /* synthetic */ AddChannelMemberContactSelectionListActivity f11488a;

        class C39871 implements Runnable {
            final /* synthetic */ C39882 f11487a;

            C39871(C39882 c39882) {
                this.f11487a = c39882;
            }

            public final void run() {
                this.f11487a.f11488a.f24673o = false;
                this.f11487a.f11488a.mo3643g();
                final C1063i c6700i = new C6700i(this.f11487a.f11488a.f24674p);
                C2808d.m7148b(c6700i);
                this.f11487a.f11488a.runOnUiThread(new Runnable(this) {
                    final /* synthetic */ C39871 f11486b;

                    public final void run() {
                        C4501c.m8189a().m8192a(AddChannelMemberContactSelectionListActivity.m21758e(this.f11486b.f11487a.f11488a), c6700i);
                    }
                });
            }
        }

        C39882(AddChannelMemberContactSelectionListActivity addChannelMemberContactSelectionListActivity) {
            this.f11488a = addChannelMemberContactSelectionListActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            this.f11488a.f24673o = false;
            new Handler().postDelayed(new C39871(this), 100);
        }
    }

    class C39914 implements Runnable {
        final /* synthetic */ AddChannelMemberContactSelectionListActivity f11492a;

        class C39901 implements Runnable {
            final /* synthetic */ C39914 f11491a;

            C39901(C39914 c39914) {
                this.f11491a = c39914;
            }

            public final void run() {
                this.f11491a.f11492a.finish();
                this.f11491a.f11492a.overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
            }
        }

        C39914(AddChannelMemberContactSelectionListActivity addChannelMemberContactSelectionListActivity) {
            this.f11492a = addChannelMemberContactSelectionListActivity;
        }

        public final void run() {
            this.f11492a.f24673o = false;
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C39901(this), 100);
        }
    }

    static /* synthetic */ C7406c m21754a(AddChannelMemberContactSelectionListActivity addChannelMemberContactSelectionListActivity) {
        return addChannelMemberContactSelectionListActivity;
    }

    static /* synthetic */ C7406c m21758e(AddChannelMemberContactSelectionListActivity addChannelMemberContactSelectionListActivity) {
        return addChannelMemberContactSelectionListActivity;
    }

    static /* synthetic */ C7406c m21759f(AddChannelMemberContactSelectionListActivity addChannelMemberContactSelectionListActivity) {
        return addChannelMemberContactSelectionListActivity;
    }

    static /* synthetic */ C7406c m21760g(AddChannelMemberContactSelectionListActivity addChannelMemberContactSelectionListActivity) {
        return addChannelMemberContactSelectionListActivity;
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
            if (getIntent().getExtras().containsKey("KEY_CHANNEL_ID")) {
                this.f24674p = getIntent().getExtras().getString("KEY_CHANNEL_ID");
            }
            if (getIntent().getExtras().containsKey("KEY_IS_ADD_ADMINISTRATOR_MODE")) {
                this.f24675q = getIntent().getExtras().getBoolean("KEY_IS_ADD_ADMINISTRATOR_MODE", false);
            }
        }
        super.onCreate(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_dark, menu);
        C2491i.m6790a(menu.findItem(R.id.action_done).getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(final C5918f c5918f) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ AddChannelMemberContactSelectionListActivity f11494b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f11494b.f24673o = false;
                C4513i.m8228a(AddChannelMemberContactSelectionListActivity.m21760g(this.f11494b), c5918f.f8890a);
            }
        });
    }

    public void onEvent(C2645g c2645g) {
        runOnUiThread(new C39914(this));
    }

    public void onEvent(final C5938a c5938a) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ AddChannelMemberContactSelectionListActivity f11490b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f11490b.f24673o = false;
                C4513i.m8228a(AddChannelMemberContactSelectionListActivity.m21759f(this.f11490b), c5938a.f8890a);
            }
        });
    }

    public void onEvent(C2696b c2696b) {
        runOnUiThread(new C39882(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (!this.f24673o) {
            this.f24673o = true;
            ArrayList arrayList = new ArrayList();
            for (Entry entry : MyApplication.m12950a().f15912r.entrySet()) {
                if (((Boolean) entry.getValue()).booleanValue()) {
                    arrayList.add(this.f24675q ? new ChannelMemberRole((String) entry.getKey(), Role.ADMIN) : new ChannelMemberRole((String) entry.getKey(), Role.MEMBER));
                }
            }
            ChannelMemberRole[] channelMemberRoleArr = new ChannelMemberRole[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                channelMemberRoleArr[i] = (ChannelMemberRole) arrayList.get(i);
            }
            if (channelMemberRoleArr.length == 0) {
                onBackPressed();
                return true;
            }
            final C1063i c6736a = new C6736a(this.f24674p, channelMemberRoleArr);
            C2808d.m7148b(c6736a);
            runOnUiThread(new Runnable(this) {
                final /* synthetic */ AddChannelMemberContactSelectionListActivity f11484b;

                public final void run() {
                    C4501c.m8189a().m8192a(AddChannelMemberContactSelectionListActivity.m21754a(this.f11484b), c6736a);
                }
            });
        }
        return true;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C2475a.m6719a((Activity) this, C4522p.m8236a(getIntent().getExtras().containsKey("KEY_IS_ADD_ADMINISTRATOR_MODE") ? R.string.action_add_administrator : R.string.action_add_follower));
    }
}
