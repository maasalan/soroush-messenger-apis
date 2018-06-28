package mobi.mmdt.ott.view.registeration.phoneandcountry;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.p072b.p073a.p074a.C1063i;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.ott.C2499a;
import mobi.mmdt.ott.C2529c;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C2770c;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C2772g;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C5973d;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p337a.C5975h;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b.C6794b;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p338b.C6795c;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.registeration.activationcode.ActivationCodeActivity;
import mobi.mmdt.ott.view.registeration.phoneandcountry.PhoneAndCountryFragment.C4325a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.CountrySelectionActivity;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4335b;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class PhoneAndCountryActivity extends C7576b implements C3101a, C4325a {
    private PhoneAndCountryFragment f24426m;

    class C43186 implements OnClickListener {
        final /* synthetic */ PhoneAndCountryActivity f12142a;

        C43186(PhoneAndCountryActivity phoneAndCountryActivity) {
            this.f12142a = phoneAndCountryActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f12142a.m21367h();
        }
    }

    class C43197 implements OnClickListener {
        final /* synthetic */ PhoneAndCountryActivity f12143a;

        C43197(PhoneAndCountryActivity phoneAndCountryActivity) {
            this.f12143a = phoneAndCountryActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4488b.m8184a(PhoneAndCountryActivity.m21366f(this.f12143a));
        }
    }

    static /* synthetic */ C7406c m21361a(PhoneAndCountryActivity phoneAndCountryActivity) {
        return phoneAndCountryActivity;
    }

    static /* synthetic */ C7406c m21363c(PhoneAndCountryActivity phoneAndCountryActivity) {
        return phoneAndCountryActivity;
    }

    static /* synthetic */ C7406c m21364d(PhoneAndCountryActivity phoneAndCountryActivity) {
        return phoneAndCountryActivity;
    }

    static /* synthetic */ C7406c m21366f(PhoneAndCountryActivity phoneAndCountryActivity) {
        return phoneAndCountryActivity;
    }

    private void m21367h() {
        if (this.f24426m.m14523d() != null && this.f24426m.m14524e() != null) {
            final C1063i c6795c = new C6795c(this.f24426m.m14523d().substring(1), this.f24426m.m14524e());
            C2808d.m7147a(c6795c);
            runOnUiThread(new Runnable(this) {
                final /* synthetic */ PhoneAndCountryActivity f12131b;

                public final void run() {
                    C4501c.m8189a().m8192a(PhoneAndCountryActivity.m21361a(this.f12131b), c6795c);
                }
            });
        }
    }

    public final Dialog mo2299a(Bundle bundle) {
        if (bundle.getInt("dialog_id") != 10) {
            return null;
        }
        return C4488b.m8182a(this, C4522p.m8236a(R.string.sms_permission), C4522p.m8236a(R.string.soroush_needs_sms_permission_to_auto_capture_activation_code), C4522p.m8236a(R.string.ok_cap), new C43186(this), C4522p.m8236a(R.string.settings), new C43197(this));
    }

    public final void mo3643g() {
        startActivityForResult(new Intent(getApplicationContext(), CountrySelectionActivity.class), 114);
        overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 114 && i2 == -1) {
            this.f24426m.m14520a(intent.getStringExtra("KEY_COUNTRY_NAME_SELECTED"), intent.getStringExtra("KEY_COUNTRY_CODE_SELECTED"));
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_phone_and_country);
        C2475a.m6720a(getWindow(), (int) UIThemeManager.color_primary_dark_default_theme);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(false, UIThemeManager.getmInstance().getIcon_toolbar_dark_color());
        C2475a.m6719a((Activity) this, C4522p.m8236a(R.string.phone_and_country));
        this.y = findViewById(R.id.shadow_line_top);
        this.f24426m = (PhoneAndCountryFragment) getFragmentManager().findFragmentById(R.id.phone_and_country_fragment);
        if (!(this.f24426m == null || this.f24426m.isDetached())) {
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.detach(this.f24426m);
            beginTransaction.commit();
        }
        if (getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().containsKey("KEY_COUNTRY_NAME") && getIntent().getExtras().containsKey("KEY_COUNTRY_CODE") && getIntent().getExtras().containsKey("KEY_PHONE_NUMBER")) {
            String string = getIntent().getExtras().getString("KEY_COUNTRY_NAME");
            String string2 = getIntent().getExtras().getString("KEY_COUNTRY_CODE");
            CharSequence string3 = getIntent().getExtras().getString("KEY_PHONE_NUMBER");
            if (!(string == null || string.isEmpty() || string2 == null || string2.isEmpty() || string3 == null || string3.isEmpty())) {
                this.f24426m.m14520a(string, string2);
                PhoneAndCountryFragment phoneAndCountryFragment = this.f24426m;
                if (phoneAndCountryFragment.f16961c) {
                    string3 = C2491i.m6814b((String) string3);
                }
                phoneAndCountryFragment.f16960b.setText(string3);
            }
        } else if (C2499a.f8179a == C2529c.f8225b) {
            C2808d.m7147a(new C6794b());
        } else {
            this.f24426m.m14520a(C4335b.m8090a("+98"), "+98");
        }
        m20724b(-1, UIThemeManager.color_toolbar_sub_title_default_theme);
        m20726u();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_dark, menu);
        C2491i.m6790a(menu.findItem(R.id.action_done).getIcon(), -1);
        return super.onCreateOptionsMenu(menu);
    }

    public void onEvent(C2770c c2770c) {
        StringBuilder stringBuilder = new StringBuilder("+");
        stringBuilder.append(c2770c.f8734a.getCountryPrefix());
        final String stringBuilder2 = stringBuilder.toString();
        final String a = C4335b.m8090a(stringBuilder2);
        if (this.f24426m != null) {
            runOnUiThread(new Runnable(this) {
                final /* synthetic */ PhoneAndCountryActivity f12139c;

                public final void run() {
                    Object obj;
                    PhoneAndCountryFragment b = this.f12139c.f24426m;
                    if (b.f16959a != null) {
                        String b2 = b.m14522b();
                        if (!(b2.isEmpty() || b2.equals(C4522p.m8236a(R.string.look_for_country)))) {
                            obj = 1;
                            if (obj == null) {
                                this.f12139c.f24426m.m14520a(a, stringBuilder2);
                            }
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        this.f12139c.f24426m.m14520a(a, stringBuilder2);
                    }
                }
            });
        }
    }

    public void onEvent(final C5973d c5973d) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ PhoneAndCountryActivity f12141b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(PhoneAndCountryActivity.m21364d(this.f12141b), c5973d.f8890a);
            }
        });
    }

    public void onEvent(final C2772g c2772g) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ PhoneAndCountryActivity f12134b;

            class C43131 implements Runnable {
                final /* synthetic */ C43142 f12132a;

                C43131(C43142 c43142) {
                    this.f12132a = c43142;
                }

                public final void run() {
                    String substring = C2535a.m6889c(this.f12132a.f12134b.f24426m.m14524e()).substring(1);
                    Intent intent = new Intent(this.f12132a.f12134b.getApplicationContext(), ActivationCodeActivity.class);
                    String str = "KEY_COUNTRY_NAME";
                    PhoneAndCountryFragment b = this.f12132a.f12134b.f24426m;
                    intent.putExtra(str, b.m14521a() ? b.m14522b() : null);
                    intent.putExtra("KEY_COUNTRY_CODE", this.f12132a.f12134b.f24426m.m14523d());
                    intent.putExtra("KEY_PHONE_NUMBER", substring);
                    intent.putExtra("KEY_ACTIVATION_DATA", c2772g.f8735a);
                    this.f12132a.f12134b.startActivity(intent);
                    this.f12132a.f12134b.finish();
                    this.f12132a.f12134b.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                }
            }

            public final void run() {
                C4501c.m8189a().m8193b();
                new Handler().postDelayed(new C43131(this), 100);
            }
        });
    }

    public void onEvent(final C5975h c5975h) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ PhoneAndCountryActivity f12136b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(PhoneAndCountryActivity.m21363c(this.f12136b), c5975h.f8890a);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (!C4516l.m8232a() || C2837a.m7170a("android.permission.RECEIVE_SMS")) {
                m21367h();
                return true;
            }
            C2837a.m7167a(this, "android.permission.RECEIVE_SMS", 112);
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 112 && iArr.length > 0) {
            if (iArr[0] == -1) {
                Bundle bundle = new Bundle();
                bundle.putInt("dialog_id", 10);
                b_(bundle);
                return;
            }
            m21367h();
        }
    }
}
