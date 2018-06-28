package mobi.mmdt.ott.view.conversation.createpoll;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.ViewGroup;
import com.p072b.p073a.p074a.C1063i;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p298k.C6740e;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2700j;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5941g;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.createpoll.C6133a.C6881a;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class CreatePollActivity extends C7576b implements C6881a {
    private ViewGroup f24115m;
    private C6133a f24116n;
    private String f24117o;
    private boolean f24118p = false;

    class C34592 implements Runnable {
        final /* synthetic */ CreatePollActivity f10584a;

        C34592(CreatePollActivity createPollActivity) {
            this.f10584a = createPollActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            this.f10584a.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            this.f10584a.finish();
        }
    }

    static /* synthetic */ C7406c m21208a(CreatePollActivity createPollActivity) {
        return createPollActivity;
    }

    static /* synthetic */ C7406c m21210c(CreatePollActivity createPollActivity) {
        return createPollActivity;
    }

    public final void mo3666a(String str, PollType pollType, ArrayList<String> arrayList, boolean z) {
        final C1063i c6740e = new C6740e(this.f24117o, str, pollType, arrayList, z);
        C2808d.m7147a(c6740e);
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CreatePollActivity f10583b;

            public final void run() {
                C4501c.m8189a().m8192a(CreatePollActivity.m21208a(this.f10583b), c6740e);
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_create_poll);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.create_poll));
        this.f24115m = (ViewGroup) findViewById(R.id.root_relativeLayout);
        this.y = findViewById(R.id.shadow_line_top);
        if (!(getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().containsKey("key_channel_id"))) {
            this.f24117o = getIntent().getExtras().getString("key_channel_id");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("KEY_FRAGMENT_STATE_BUNDLE")) {
            bundle2 = bundle.getBundle("KEY_FRAGMENT_STATE_BUNDLE");
        }
        if (this.f24116n == null) {
            this.f24116n = new C6133a();
            if (bundle2 != null) {
                this.f24116n.setArguments(bundle2);
            }
        }
        if (!this.f24116n.isDetached()) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame, this.f24116n);
            beginTransaction.setTransition(4099);
            beginTransaction.commit();
        }
        m20721a(UIThemeManager.getmInstance().getPrimary_color(), UIThemeManager.getmInstance().getText_primary_new_design_color(), UIThemeManager.getmInstance().getText_primary_new_design_color());
        m20726u();
        m20725t();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_dark, menu);
        C2491i.m6790a(menu.findItem(R.id.action_done).getIcon(), UIThemeManager.getmInstance().getIcon_not_selected_color());
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(final C5941g c5941g) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CreatePollActivity f10586b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f10586b.f24118p = false;
                C4513i.m8228a(CreatePollActivity.m21210c(this.f10586b), c5941g.f8890a);
            }
        });
    }

    public void onEvent(C2700j c2700j) {
        runOnUiThread(new C34592(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r8) {
        /*
        r7 = this;
        r0 = r8.getItemId();
        r1 = 1;
        r2 = 16908332; // 0x102002c float:2.3877352E-38 double:8.353826E-317;
        if (r0 != r2) goto L_0x000e;
    L_0x000a:
        r7.onBackPressed();
        return r1;
    L_0x000e:
        r2 = 2131296336; // 0x7f090050 float:1.8210586E38 double:1.0530003007E-314;
        if (r0 != r2) goto L_0x0130;
    L_0x0013:
        r8 = r7.f24118p;
        if (r8 != 0) goto L_0x012f;
    L_0x0017:
        r8 = r7.f24116n;
        r0 = r8.f16613k;
        r2 = mobi.mmdt.ott.view.conversation.createpoll.C3470c.f10596a;
        r3 = 0;
        if (r0 == r2) goto L_0x0026;
    L_0x0020:
        r0 = r8.f16613k;
        r2 = mobi.mmdt.ott.view.conversation.createpoll.C3470c.f10597b;
        if (r0 != r2) goto L_0x0054;
    L_0x0026:
        r0 = r8.f16612j;
        r0 = r0.getItemCount();
        r2 = 2;
        if (r0 >= r2) goto L_0x0054;
    L_0x002f:
        r0 = r8.f16611i;
        r0.setErrorEnabled(r1);
        r0 = r8.f16611i;
        r4 = 2131690315; // 0x7f0f034b float:1.900967E38 double:1.053194952E-314;
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r4);
        r0.setError(r4);
        r0 = 3;
        r0 = new android.view.View[r0];
        r4 = r8.f16611i;
        r0[r3] = r4;
        r4 = r8.f16605b;
        r0[r1] = r4;
        r4 = r8.f16607e;
        r0[r2] = r4;
        mobi.mmdt.ott.view.main.C4144a.m8005a(r0);
        r0 = r3;
        goto L_0x005a;
    L_0x0054:
        r0 = r8.f16611i;
        r0.setErrorEnabled(r3);
        r0 = r1;
    L_0x005a:
        r2 = r8.f16609g;
        r2 = r2.getText();
        r2 = r2.toString();
        r2 = r2.trim();
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0074;
    L_0x006e:
        r2 = r8.f16610h;
        r2.setErrorEnabled(r3);
        goto L_0x008f;
    L_0x0074:
        r0 = r8.f16610h;
        r0.setErrorEnabled(r1);
        r0 = r8.f16610h;
        r2 = 2131690313; // 0x7f0f0349 float:1.9009666E38 double:1.053194951E-314;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
        r0.setError(r2);
        r0 = new android.view.View[r1];
        r2 = r8.f16611i;
        r0[r3] = r2;
        mobi.mmdt.ott.view.main.C4144a.m8005a(r0);
        r0 = r3;
    L_0x008f:
        r2 = r3;
        r4 = r2;
    L_0x0091:
        r5 = r8.f16612j;
        r5 = r5.getItemCount();
        if (r2 >= r5) goto L_0x00ec;
    L_0x0099:
        r5 = mobi.mmdt.ott.view.conversation.createpoll.C6133a.C34633.f10589a;
        r6 = r8.f16613k;
        r6 = r6 - r1;
        r5 = r5[r6];
        switch(r5) {
            case 1: goto L_0x00d2;
            case 2: goto L_0x00bb;
            case 3: goto L_0x00a4;
            default: goto L_0x00a3;
        };
    L_0x00a3:
        goto L_0x00e9;
    L_0x00a4:
        r5 = r8.f16612j;
        r5 = r5.m13671a(r2);
        r5 = (mobi.mmdt.ott.view.conversation.createpoll.p571b.C7343c) r5;
        r6 = r5.f21211b;
        r5.f21212c = r3;
        r6 = r6.isEmpty();
        if (r6 == 0) goto L_0x00e9;
    L_0x00b6:
        r4 = mobi.mmdt.ott.view.conversation.createpayment.C3457c.f10578c;
        r5.f21212c = r4;
        goto L_0x00e8;
    L_0x00bb:
        r5 = r8.f16612j;
        r5 = r5.m13671a(r2);
        r5 = (mobi.mmdt.ott.view.conversation.createpoll.p571b.C7344d) r5;
        r6 = r5.f21213b;
        r5.f21214c = r3;
        r6 = r6.isEmpty();
        if (r6 == 0) goto L_0x00e9;
    L_0x00cd:
        r4 = mobi.mmdt.ott.view.conversation.createpayment.C3457c.f10578c;
        r5.f21214c = r4;
        goto L_0x00e8;
    L_0x00d2:
        r5 = r8.f16612j;
        r5 = r5.m13671a(r2);
        r5 = (mobi.mmdt.ott.view.conversation.createpoll.p571b.C7342b) r5;
        r6 = r5.f21209b;
        r5.f21210c = r3;
        r6 = r6.isEmpty();
        if (r6 == 0) goto L_0x00e9;
    L_0x00e4:
        r4 = mobi.mmdt.ott.view.conversation.createpayment.C3457c.f10578c;
        r5.f21210c = r4;
    L_0x00e8:
        r4 = r1;
    L_0x00e9:
        r2 = r2 + 1;
        goto L_0x0091;
    L_0x00ec:
        if (r4 == 0) goto L_0x00fd;
    L_0x00ee:
        r0 = new android.view.View[r1];
        r2 = r8.f16606c;
        r0[r3] = r2;
        mobi.mmdt.ott.view.main.C4144a.m8005a(r0);
        r0 = r8.f16612j;
        r0.notifyDataSetChanged();
        r0 = r3;
    L_0x00fd:
        if (r0 == 0) goto L_0x012d;
    L_0x00ff:
        r2 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType.checkbox;
        r3 = mobi.mmdt.ott.view.conversation.createpoll.C6133a.C34633.f10589a;
        r4 = r8.f16613k;
        r4 = r4 - r1;
        r3 = r3[r4];
        switch(r3) {
            case 1: goto L_0x0112;
            case 2: goto L_0x010f;
            case 3: goto L_0x010c;
            default: goto L_0x010b;
        };
    L_0x010b:
        goto L_0x0114;
    L_0x010c:
        r2 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType.commentbox;
        goto L_0x0114;
    L_0x010f:
        r2 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType.radio;
        goto L_0x0114;
    L_0x0112:
        r2 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType.checkbox;
    L_0x0114:
        r3 = r8.f16608f;
        r3 = r3.isChecked();
        r4 = r8.f16604a;
        r5 = r8.f16609g;
        r5 = r5.getText();
        r5 = r5.toString();
        r8 = r8.m14123a();
        r4.mo3666a(r5, r2, r8, r3);
    L_0x012d:
        r7.f24118p = r0;
    L_0x012f:
        return r1;
    L_0x0130:
        r8 = super.onOptionsItemSelected(r8);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.createpoll.CreatePollActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C6133a c6133a = this.f24116n;
        ArrayList a = c6133a.m14123a();
        int selectedItemPosition = c6133a.f16605b.getSelectedItemPosition();
        boolean isChecked = c6133a.f16608f.isChecked();
        String obj = c6133a.f16609g.getText().toString();
        Bundle bundle2 = new Bundle();
        bundle2.putString("KEY_QUESTION_STRING", obj);
        bundle2.putBoolean("KEY_HAS_ELSE_OPTION_BOOLEAN", isChecked);
        bundle2.putInt("KEY_POLL_ITEMS_TYPE_INTEGER", selectedItemPosition);
        bundle2.putStringArrayList("KEY_OPTION_TITLES_STRING_ARRAY_LIST", a);
        bundle.putBundle("KEY_FRAGMENT_STATE_BUNDLE", bundle2);
    }
}
