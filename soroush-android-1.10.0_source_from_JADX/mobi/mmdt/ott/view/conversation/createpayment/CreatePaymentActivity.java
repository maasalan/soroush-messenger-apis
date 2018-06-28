package mobi.mmdt.ott.view.conversation.createpayment;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.p072b.p073a.p074a.C1063i;
import java.util.ArrayList;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.base.PollType;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C2700j;
import mobi.mmdt.ott.logic.p261a.p298k.p299a.C5942i;
import mobi.mmdt.ott.logic.p261a.p329x.C6788a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.createpayment.C6132a.C34522;
import mobi.mmdt.ott.view.conversation.createpayment.C6132a.C6879a;
import mobi.mmdt.ott.view.conversation.createpayment.p570b.C7341b;
import mobi.mmdt.ott.view.main.C4144a;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class CreatePaymentActivity extends C7576b implements C6879a {
    private ViewGroup f24111m;
    private C6132a f24112n;
    private String f24113o;
    private boolean f24114p = false;

    class C34492 implements Runnable {
        final /* synthetic */ CreatePaymentActivity f10566a;

        C34492(CreatePaymentActivity createPaymentActivity) {
            this.f10566a = createPaymentActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            this.f10566a.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            this.f10566a.finish();
        }
    }

    static /* synthetic */ C7406c m21204a(CreatePaymentActivity createPaymentActivity) {
        return createPaymentActivity;
    }

    static /* synthetic */ C7406c m21206c(CreatePaymentActivity createPaymentActivity) {
        return createPaymentActivity;
    }

    public final void mo3665a(String str, ArrayList<String> arrayList) {
        final C1063i c6788a = new C6788a(this.f24113o, str, PollType.radio, arrayList);
        C2808d.m7147a(c6788a);
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CreatePaymentActivity f10565b;

            public final void run() {
                C4501c.m8189a().m8192a(CreatePaymentActivity.m21204a(this.f10565b), c6788a);
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_create_payment);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.y = findViewById(R.id.shadow_line_top);
        m20723a(true, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.create_payment_title));
        this.f24111m = (ViewGroup) findViewById(R.id.root_relativeLayout);
        if (!(getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().containsKey("key_channel_id"))) {
            this.f24113o = getIntent().getExtras().getString("key_channel_id");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("KEY_FRAGMENT_STATE_BUNDLE")) {
            bundle2 = bundle.getBundle("KEY_FRAGMENT_STATE_BUNDLE");
        }
        if (this.f24112n == null) {
            this.f24112n = new C6132a();
            if (bundle2 != null) {
                this.f24112n.setArguments(bundle2);
            }
        }
        if (!this.f24112n.isDetached()) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.replace(R.id.container_frame, this.f24112n);
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

    public void onEvent(final C5942i c5942i) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ CreatePaymentActivity f10568b;

            public final void run() {
                C4501c.m8189a().m8193b();
                this.f10568b.f24114p = false;
                C4513i.m8228a(CreatePaymentActivity.m21206c(this.f10568b), c5942i.f8890a);
            }
        });
    }

    public void onEvent(C2700j c2700j) {
        runOnUiThread(new C34492(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (!this.f24114p) {
                boolean z;
                C6132a c6132a = this.f24112n;
                if (c6132a.f16600h.getItemCount() == 0) {
                    c6132a.f16599g.setErrorEnabled(true);
                    c6132a.f16599g.setError(C4522p.m8236a(R.string.question_options_can_t_be_empty_));
                    C4144a.m8005a(c6132a.f16599g, c6132a.f16596c);
                    z = false;
                } else {
                    c6132a.f16599g.setErrorEnabled(false);
                    z = true;
                }
                if (c6132a.f16597e.getText().toString().trim().isEmpty()) {
                    c6132a.f16598f.setErrorEnabled(true);
                    c6132a.f16598f.setError(C4522p.m8236a(R.string.payment_type_can_t_be_empty_));
                    C4144a.m8005a(c6132a.f16598f);
                    z = false;
                } else {
                    c6132a.f16598f.setErrorEnabled(false);
                }
                int i = 0;
                int i2 = i;
                int i3 = i2;
                int i4 = i3;
                while (i < c6132a.f16600h.getItemCount()) {
                    C7341b c7341b = (C7341b) c6132a.f16600h.m13671a(i);
                    String str = c7341b.f21207b;
                    c7341b.f21208c = 0;
                    if (str.isEmpty()) {
                        c7341b.f21208c = C3457c.f10578c;
                        i2 = true;
                    } else if (!str.isEmpty() && Integer.parseInt(str) < IjkMediaCodecInfo.RANK_MAX) {
                        c7341b.f21208c = C3457c.f10577b;
                        i3 = true;
                    } else if (!str.isEmpty() && Long.parseLong(str) > 2000000) {
                        c7341b.f21208c = C3457c.f10576a;
                        i4 = true;
                    }
                    i++;
                }
                if (!(i2 == 0 && r5 == 0 && r6 == 0)) {
                    c6132a.f16598f.setErrorEnabled(false);
                    c6132a.f16598f.setError("");
                    C4144a.m8005a(c6132a.f16595b);
                    c6132a.f16600h.notifyDataSetChanged();
                    z = false;
                }
                if (z) {
                    if (C34522.f10570a[c6132a.f16601i - 1] == 1) {
                        int i5 = C3456b.f10574a;
                    }
                    c6132a.f16594a.mo3665a(c6132a.f16597e.getText().toString(), c6132a.m14114a());
                }
                this.f24114p = z;
            }
            return true;
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C6132a c6132a = this.f24112n;
        ArrayList a = c6132a.m14114a();
        String obj = c6132a.f16597e.getText().toString();
        Bundle bundle2 = new Bundle();
        bundle2.putString("KEY_QUESTION_STRING", obj);
        bundle2.putStringArrayList("KEY_OPTION_TITLES_STRING_ARRAY_LIST", a);
        bundle.putBundle("KEY_FRAGMENT_STATE_BUNDLE", bundle2);
    }
}
