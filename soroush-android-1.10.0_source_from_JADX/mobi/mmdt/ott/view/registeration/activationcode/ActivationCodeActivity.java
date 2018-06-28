package mobi.mmdt.ott.view.registeration.activationcode;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.firebase.perf.C2096a;
import com.google.firebase.perf.metrics.Trace;
import com.p072b.p073a.p074a.C1063i;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2775a;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C2578d;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C5893c;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C2769a;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C2771f;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C5972b;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C5974e;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b.C6796d;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b.C6797e;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.main.C4144a;
import mobi.mmdt.ott.view.newdesign.mainpage.MainActivity;
import mobi.mmdt.ott.view.registeration.activationcode.ActivationCodeFragment.C42996;
import mobi.mmdt.ott.view.registeration.activationcode.ActivationCodeFragment.C4301a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.PhoneAndCountryActivity;
import mobi.mmdt.ott.view.registeration.profileinfo.ProfileInfoActivity;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class ActivationCodeActivity extends C7576b implements C4301a, C4302a {
    private String f24405m;
    private String f24406n;
    private String f24407o;
    private String f24408p;
    private ActivationCodeFragment f24409q;
    private ViewGroup f24410r;
    private boolean f24411s;
    private boolean f24412t = false;
    private Trace f24413u;
    private BroadcastReceiver f24414v = new C4303b(this);

    class C42841 implements Runnable {
        final /* synthetic */ ActivationCodeActivity f12101a;

        C42841(ActivationCodeActivity activationCodeActivity) {
            this.f12101a = activationCodeActivity;
        }

        public final void run() {
            String obj;
            ActivationCodeFragment a = this.f12101a.f24409q;
            if (!(a.f16935a == null || a.f16935a.getText() == null)) {
                if (!a.f16935a.getText().toString().isEmpty()) {
                    obj = a.f16935a.getText().toString();
                    if (obj != null || obj.isEmpty()) {
                        C4144a.m8005a(this.f12101a.f24409q.f16935a);
                        Snackbar.m8770a(this.f12101a.f24410r, C4522p.m8236a(R.string.the_activation_code_must_not_empty), -1).m572a();
                    }
                    C1063i c6796d = new C6796d(obj, this.f12101a.f24408p);
                    C2808d.m7147a(c6796d);
                    C4501c.m8189a().m8192a(ActivationCodeActivity.m21331c(this.f12101a), c6796d);
                    return;
                }
            }
            obj = null;
            if (obj != null) {
            }
            C4144a.m8005a(this.f12101a.f24409q.f16935a);
            Snackbar.m8770a(this.f12101a.f24410r, C4522p.m8236a(R.string.the_activation_code_must_not_empty), -1).m572a();
        }
    }

    class C42863 implements Runnable {
        final /* synthetic */ ActivationCodeActivity f12104a;

        C42863(ActivationCodeActivity activationCodeActivity) {
            this.f12104a = activationCodeActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C42996(this.f12104a.f24409q), 600);
        }
    }

    class C42885 implements Runnable {
        final /* synthetic */ ActivationCodeActivity f12107a;

        C42885(ActivationCodeActivity activationCodeActivity) {
            this.f12107a = activationCodeActivity;
        }

        public final void run() {
            if (!this.f12107a.f24411s) {
                C2808d.m7147a(new C6643b(new String[]{C2535a.m6888a().m6928d()}, true, false));
            }
        }
    }

    class C42906 implements Runnable {
        final /* synthetic */ ActivationCodeActivity f12109a;

        class C42891 implements Runnable {
            final /* synthetic */ C42906 f12108a;

            C42891(C42906 c42906) {
                this.f12108a = c42906;
            }

            public final void run() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C2535a.m6888a().m6928d());
                stringBuilder.append("ooooo");
                C2480b.m6740d(stringBuilder.toString());
                String str = C2999a.m7500a(C2535a.m6888a().m6928d()).f9416b;
                if (str != null) {
                    if (!str.isEmpty()) {
                        ActivationCodeActivity.m21339j(this.f12108a.f12109a);
                        return;
                    }
                }
                ActivationCodeActivity.m21337i(this.f12108a.f12109a);
            }
        }

        C42906(ActivationCodeActivity activationCodeActivity) {
            this.f12109a = activationCodeActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            if (this.f12109a.f24412t) {
                new Handler().postDelayed(new C42891(this), 100);
            }
        }
    }

    static /* synthetic */ C7406c m21331c(ActivationCodeActivity activationCodeActivity) {
        return activationCodeActivity;
    }

    static /* synthetic */ C7406c m21333e(ActivationCodeActivity activationCodeActivity) {
        return activationCodeActivity;
    }

    static /* synthetic */ C7406c m21334f(ActivationCodeActivity activationCodeActivity) {
        return activationCodeActivity;
    }

    static /* synthetic */ void m21337i(ActivationCodeActivity activationCodeActivity) {
        activationCodeActivity.startActivity(new Intent(activationCodeActivity.getApplicationContext(), ProfileInfoActivity.class));
        activationCodeActivity.finish();
        activationCodeActivity.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    static /* synthetic */ void m21339j(ActivationCodeActivity activationCodeActivity) {
        C2535a.m6888a().m6900L();
        activationCodeActivity.startActivity(new Intent(activationCodeActivity.getApplicationContext(), MainActivity.class));
        activationCodeActivity.finish();
        activationCodeActivity.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    static /* synthetic */ C7406c m21340k(ActivationCodeActivity activationCodeActivity) {
        return activationCodeActivity;
    }

    static /* synthetic */ C7406c m21341l(ActivationCodeActivity activationCodeActivity) {
        return activationCodeActivity;
    }

    public final void mo3675a(final String str) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ActivationCodeActivity f12115b;

            public final void run() {
                ActivationCodeFragment a = this.f12115b.f24409q;
                CharSequence charSequence = str;
                if (a.f16935a != null && charSequence != null && !charSequence.isEmpty()) {
                    a.f16935a.setText(charSequence);
                    a.f16935a.requestFocus();
                }
            }
        });
    }

    public final void mo3643g() {
        Intent intent = new Intent(getApplicationContext(), PhoneAndCountryActivity.class);
        intent.putExtra("KEY_COUNTRY_NAME", this.f24405m);
        intent.putExtra("KEY_COUNTRY_CODE", this.f24406n);
        intent.putExtra("KEY_PHONE_NUMBER", this.f24407o);
        startActivity(intent);
        finish();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public final void mo3676h() {
        final C1063i c6797e = new C6797e();
        C2808d.m7147a(c6797e);
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ActivationCodeActivity f12103b;

            public final void run() {
                C4501c.m8189a().m8191a(ActivationCodeActivity.m21333e(this.f12103b), R.string.try_to_make_call, false);
            }
        });
    }

    final void m21345i() {
        this.f24413u.stop();
        runOnUiThread(new C42841(this));
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2096a.m5726a();
        this.f24413u = C2096a.m5727a("activationDelay");
        this.f24413u.start();
        setContentView((int) R.layout.activity_activation_code);
        C2475a.m6720a(getWindow(), (int) UIThemeManager.color_primary_dark_default_theme);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        this.f24412t = true;
        m20723a(false, UIThemeManager.getmInstance().getIcon_not_selected_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.activation_code));
        this.f24410r = (ViewGroup) findViewById(R.id.root_layout);
        this.y = findViewById(R.id.shadow_line_top);
        this.f24409q = (ActivationCodeFragment) getFragmentManager().findFragmentById(R.id.activation_code_fragment);
        if (!(this.f24409q == null || this.f24409q.isDetached())) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.detach(this.f24409q);
            beginTransaction.commit();
        }
        if (getIntent() != null && getIntent().getExtras().containsKey("KEY_COUNTRY_CODE") && getIntent().getExtras().containsKey("KEY_PHONE_NUMBER") && getIntent().getExtras().containsKey("KEY_ACTIVATION_DATA")) {
            this.f24405m = getIntent().getExtras().getString("KEY_COUNTRY_NAME");
            this.f24406n = getIntent().getExtras().getString("KEY_COUNTRY_CODE");
            this.f24407o = getIntent().getExtras().getString("KEY_PHONE_NUMBER");
            this.f24408p = getIntent().getExtras().getString("KEY_ACTIVATION_DATA");
            if (!(this.f24406n == null || this.f24406n.isEmpty() || this.f24407o == null || this.f24407o.isEmpty())) {
                ActivationCodeFragment activationCodeFragment = this.f24409q;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.f24406n);
                stringBuilder.append(this.f24407o);
                String stringBuilder2 = stringBuilder.toString();
                activationCodeFragment.f16939f = stringBuilder2;
                if (!(activationCodeFragment.f16938e == null || stringBuilder2 == null || stringBuilder2.isEmpty())) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(C4522p.m8236a(R.string.send_code_to_number));
                    stringBuilder3.append(" ");
                    stringBuilder3.append(stringBuilder2);
                    CharSequence stringBuilder4 = stringBuilder3.toString();
                    if (activationCodeFragment.f16937c) {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append(C4522p.m8236a(R.string.send_code_to_number));
                        stringBuilder3.append(" ");
                        stringBuilder3.append(C2491i.m6814b(stringBuilder2));
                        stringBuilder4 = stringBuilder3.toString();
                    }
                    activationCodeFragment.f16938e.setText(stringBuilder4);
                }
            }
        }
        m20724b(-1, UIThemeManager.color_toolbar_sub_title_default_theme);
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_dark, menu);
        C2491i.m6790a(menu.findItem(R.id.action_done).getIcon(), -1);
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(final C5893c c5893c) {
        this.f24411s = false;
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ActivationCodeActivity f12111b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(ActivationCodeActivity.m21340k(this.f12111b), c5893c.f8890a);
                ActivationCodeActivity.m21337i(this.f12111b);
            }
        });
    }

    public void onEvent(C2578d c2578d) {
        this.f24411s = true;
        runOnUiThread(new C42906(this));
    }

    public void onEvent(C2769a c2769a) {
        runOnUiThread(new C42885(this));
    }

    public void onEvent(final C5972b c5972b) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ActivationCodeActivity f12113b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(ActivationCodeActivity.m21341l(this.f12113b), c5972b.f8890a);
            }
        });
    }

    public void onEvent(final C5974e c5974e) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ActivationCodeActivity f12106b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C2775a c2775a = c5974e.f8890a;
                if (c2775a != null) {
                    int a = C4513i.m8227a(c2775a);
                    if (a == -1) {
                        a = R.string.ivr_error;
                    }
                    Toast.makeText(ActivationCodeActivity.m21334f(this.f12106b), C4522p.m8236a(a), 0).show();
                }
                this.f12106b.f24409q.f16936b = false;
            }
        });
    }

    public void onEvent(C2771f c2771f) {
        runOnUiThread(new C42863(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            m21345i();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        this.f24412t = false;
        if (this.f24414v != null) {
            unregisterReceiver(this.f24414v);
        }
    }

    public void onResume() {
        super.onResume();
        this.f24412t = true;
        if (C2837a.m7170a("android.permission.RECEIVE_SMS")) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
            intentFilter.setPriority(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            registerReceiver(this.f24414v, intentFilter);
            return;
        }
        this.f24414v = null;
    }

    protected void onStop() {
        super.onStop();
        this.f24412t = false;
    }
}
