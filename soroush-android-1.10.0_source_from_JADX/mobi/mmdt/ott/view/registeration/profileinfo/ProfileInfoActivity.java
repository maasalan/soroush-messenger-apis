package mobi.mmdt.ott.view.registeration.profileinfo;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TextInputLayout;
import android.support.v4.p029a.C0346c;
import android.support.v7.app.C7406c;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p072b.p073a.p074a.C1063i;
import java.util.Timer;
import java.util.regex.Pattern;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2775a;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.core.StartUpService;
import mobi.mmdt.ott.logic.fcm.C6803a;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C2578d;
import mobi.mmdt.ott.logic.p261a.aa.p265a.C5893c;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p339c.p340a.C2774b;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p339c.p340a.C5976a;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p339c.p340a.C5977c;
import mobi.mmdt.ott.logic.p261a.p332z.p336b.p339c.p524b.C6799a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p389k.C2999a;
import mobi.mmdt.ott.provider.p389k.C3001e;
import mobi.mmdt.ott.view.components.C7695a;
import mobi.mmdt.ott.view.main.C4144a;
import mobi.mmdt.ott.view.newdesign.mainpage.MainActivity;
import mobi.mmdt.ott.view.tools.C4513i;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class ProfileInfoActivity extends C7695a {
    protected boolean f24774A = false;
    protected boolean f24775B = false;
    protected boolean f24776C = false;
    protected boolean f24777D;
    protected boolean f24778E = false;
    protected EditText f24779F;
    protected EditText f24780G;
    protected EditText f24781H;
    protected TextInputLayout f24782I;
    protected EditText f24783J;
    protected boolean f24784K;
    protected TextInputLayout f24785L;
    protected TextInputLayout f24786M;
    private boolean f24787N = false;
    private boolean f24788O = false;
    private String f24789P;
    private String f24790Q;
    private String f24791R;
    private String f24792S;
    private Timer f24793T = null;
    private TextView f24794U;
    private TextInputLayout f24795V;
    private RelativeLayout f24796W;
    private String f24797X;
    protected int f24798z = R.layout.fragment_profile_info;

    class C43434 implements Runnable {
        final /* synthetic */ ProfileInfoActivity f12196a;

        C43434(ProfileInfoActivity profileInfoActivity) {
            this.f12196a = profileInfoActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
        }
    }

    class C43466 implements Runnable {
        final /* synthetic */ ProfileInfoActivity f12200a;

        class C43451 implements Runnable {
            final /* synthetic */ C43466 f12199a;

            C43451(C43466 c43466) {
                this.f12199a = c43466;
            }

            public final void run() {
                if (!this.f12199a.f12200a.f24777D) {
                    C2535a.m6888a().m6900L();
                    StartUpService.m7128c();
                    this.f12199a.f12200a.startActivity(new Intent(this.f12199a.f12200a.getApplicationContext(), MainActivity.class));
                }
                this.f12199a.f12200a.finish();
                this.f12199a.f12200a.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            }
        }

        C43466(ProfileInfoActivity profileInfoActivity) {
            this.f12200a = profileInfoActivity;
        }

        public final void run() {
            C4501c.m8189a().m8193b();
            new Handler().postDelayed(new C43451(this), 100);
        }
    }

    static /* synthetic */ C7406c m21988d(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity;
    }

    private void m21989d(final String str) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ProfileInfoActivity f12191b;

            public final void run() {
                this.f12191b.f24787N = true;
                this.f12191b.f24794U.setVisibility(0);
                this.f12191b.f24794U.setText(str);
                this.f12191b.f24794U.setTextColor(C0346c.m687c(this.f12191b.getApplicationContext(), R.color.colorErrorText));
                C4144a.m8005a(this.f12191b.f24782I, this.f12191b.f24794U);
            }
        });
    }

    static /* synthetic */ C7406c m21990e(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity;
    }

    static /* synthetic */ C7406c m21991f(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity;
    }

    static /* synthetic */ C7406c m21992g(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity;
    }

    static /* synthetic */ C7406c m21993h(ProfileInfoActivity profileInfoActivity) {
        return profileInfoActivity;
    }

    protected final int mo3643g() {
        return R.drawable.ic_place_holder_contact;
    }

    protected final String mo3695h() {
        return null;
    }

    protected final C2973m mo3696i() {
        return C2973m.SINGLE;
    }

    protected final void mo3697j() {
    }

    protected void mo3698k() {
        this.v = 0.75d;
        this.w = 0.5d;
    }

    protected final void mo3699l() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21057e(this.f24798z);
        this.f24789P = "";
        C3001e a = C2999a.m7500a(C2535a.m6888a().m6928d());
        if (a != null) {
            String str = a.f9416b;
            String str2 = a.f9434t;
            String str3 = a.f9426l;
            String str4 = a.f9417c;
            String str5 = a.f9429o;
            this.f24797X = str2;
            this.f24789P = str;
            this.f24790Q = str3;
            this.f24791R = str4;
            this.f24792S = str5;
        }
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null && extras.containsKey("KEY_ENTER_FOR_SETTING")) {
            this.f24784K = extras.getBoolean("KEY_ENTER_FOR_SETTING", false);
        }
        m21053a(C4522p.m8236a(R.string.profile_info), false);
        m21062h(C2491i.m6806b(getApplicationContext(), C2535a.m6888a().m6928d()));
        if (bundle != null) {
            if (bundle.containsKey("KEY_IS_PROFILE_FETCHED")) {
                this.f24778E = bundle.getBoolean("KEY_IS_PROFILE_FETCHED");
            }
            if (bundle.containsKey("KEY_AVATAR_URL")) {
                this.f24791R = bundle.getString("KEY_AVATAR_URL");
            }
            if (bundle.containsKey("KEY_AVATAR_THUMBNAIL_URL")) {
                this.f24792S = bundle.getString("KEY_AVATAR_THUMBNAIL_URL");
            }
            if (bundle.containsKey("KEY_MOTTO")) {
                this.f24790Q = bundle.getString("KEY_MOTTO");
            }
            if (bundle.containsKey("KEY_CONTACT_NAME")) {
                this.f24789P = bundle.getString("KEY_CONTACT_NAME");
            }
            if (bundle.containsKey("KEY_IS_PROFILE_NAME_EDITABLE")) {
                this.f24775B = bundle.getBoolean("KEY_IS_PROFILE_NAME_EDITABLE");
            }
            if (bundle.containsKey("KEY_IS_PROFILE_STATUS_EDITABLE")) {
                this.f24776C = bundle.getBoolean("KEY_IS_PROFILE_STATUS_EDITABLE");
            }
        }
        this.f24785L = (TextInputLayout) findViewById(R.id.profileStatus_textInputLayout);
        this.f24786M = (TextInputLayout) findViewById(R.id.phone_textInputLayout);
        this.f24795V = (TextInputLayout) findViewById(R.id.profileName_textInputLayout);
        this.f24779F = (EditText) findViewById(R.id.profileName_editText);
        this.f24780G = (EditText) findViewById(R.id.profileStatus_editText);
        this.f24782I = (TextInputLayout) findViewById(R.id.userId_textInputLayout);
        this.f24783J = (EditText) findViewById(R.id.userId_editText);
        this.f24783J.setMaxLines(1);
        this.f24783J.setSingleLine(true);
        this.f24794U = (TextView) findViewById(R.id.error_textView2);
        this.f24794U.setVisibility(8);
        if (this.f24780G != null) {
            this.f24780G.setMaxLines(3);
        }
        this.f24781H = (EditText) findViewById(R.id.phone_editText);
        this.f24796W = (RelativeLayout) findViewById(R.id.root_layout);
        this.f24779F.setFilters(new InputFilter[]{new LengthFilter(128)});
        this.f24779F.setMaxLines(1);
        this.f24779F.setSingleLine(true);
        this.f24780G.setFilters(new InputFilter[]{new LengthFilter(140)});
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        if (this.f24796W != null) {
            LayoutParams layoutParams = this.f24796W.getLayoutParams();
            layoutParams.height = (int) (((float) (point.y - (C2491i.m6759a(getApplicationContext()) + C2491i.m6805b(getApplicationContext())))) + C2491i.m6804b(getApplicationContext(), 10.0f));
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.width = (int) (((double) point.x) * 0.75d);
            }
        }
        String d = C2535a.m6888a().m6928d();
        this.f24781H.setText(C2535a.m6888a().m6938f());
        m21062h(C2491i.m6806b(getApplicationContext(), d));
        if (!(this.f24789P == null || this.f24789P.isEmpty() || !this.f24779F.getText().toString().isEmpty())) {
            this.f24779F.setText(this.f24789P);
        }
        if (!(this.f24797X == null || this.f24797X.isEmpty() || !this.f24783J.getText().toString().isEmpty())) {
            this.f24783J.setText(this.f24797X);
            this.f24787N = false;
            this.f24794U.setText("");
            this.f24794U.setVisibility(8);
        }
        if (!(this.f24790Q == null || this.f24790Q.isEmpty() || !this.f24780G.getText().toString().isEmpty())) {
            this.f24780G.setText(this.f24790Q);
        }
        mo3704z();
        if (this.s == null || this.s.isEmpty()) {
            if (this.u || this.f24792S == null || this.f24792S.isEmpty()) {
                m21069o();
                m21070p();
            } else {
                this.s = "";
                m21052a(C4515k.m8231a(C2556b.m6998a(this.f24792S)));
                m21055b(C4515k.m8231a(C2556b.m6998a(this.f24792S)));
            }
        }
        m20725t();
        C2491i.m6779a(UIThemeManager.getmInstance().getText_primary_color(), UIThemeManager.getmInstance().getText_primary_new_design_with_opacity_color(), UIThemeManager.getmInstance().getAccent_color(), this.f24781H, this.f24780G, this.f24779F, this.f24783J);
        C2491i.m6781a(UIThemeManager.getmInstance().getAccent_color(), this.f24795V, this.f24782I, this.f24785L, this.f24786M);
        C2491i.m6796a(this.f24796W, UIThemeManager.getmInstance().getRecycler_view_background_color());
        if (!C2535a.m6888a().m6905Q() && C2535a.m6888a().m6952j() && !C2535a.m6888a().m6902N()) {
            C2808d.m7147a(new C6803a());
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_done_bar_white, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
        getLoaderManager().destroyLoader(21);
    }

    public void onEvent(final C5893c c5893c) {
        this.f24778E = false;
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ProfileInfoActivity f12198b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(ProfileInfoActivity.m21991f(this.f12198b), c5893c.f8890a);
            }
        });
    }

    public void onEvent(C2578d c2578d) {
        this.f24778E = true;
        runOnUiThread(new C43434(this));
    }

    public void onEvent(final C5976a c5976a) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ProfileInfoActivity f12202b;

            public final void run() {
                C4501c.m8189a().m8193b();
                if (c5976a.f8890a.equals(C2775a.SOROUSH_ID_ALREADY_EXIST_EXCEPTION)) {
                    this.f12202b.m21989d(C4522p.m8236a(R.string.this_user_id_already_exist_error_message));
                } else if (c5976a.f8890a.equals(C2775a.INVALID_SOROUSH_ID_EXCEPTION)) {
                    this.f12202b.m21989d(C4522p.m8236a(R.string.sorry_this_user_id_is_invalid));
                } else {
                    this.f12202b.f24794U.setVisibility(8);
                    this.f12202b.f24794U.setText("");
                    C4513i.m8228a(ProfileInfoActivity.m21992g(this.f12202b), c5976a.f8890a);
                }
            }
        });
    }

    public void onEvent(C2774b c2774b) {
        runOnUiThread(new C43466(this));
    }

    public void onEvent(final C5977c c5977c) {
        runOnUiThread(new Runnable(this) {
            final /* synthetic */ ProfileInfoActivity f12204b;

            public final void run() {
                C4501c.m8189a().m8193b();
                C4513i.m8228a(ProfileInfoActivity.m21993h(this.f12204b), c5977c.f8890a);
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        mo3703y();
        return true;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (!this.f24778E) {
            final C1063i c6643b = new C6643b(new String[]{C2535a.m6888a().m6928d()}, true, false);
            C2808d.m7147a(c6643b);
            runOnUiThread(new Runnable(this) {
                final /* synthetic */ ProfileInfoActivity f12193b;

                public final void run() {
                    C4501c.m8189a().m8192a(ProfileInfoActivity.m21988d(this.f12193b), c6643b);
                }
            });
        }
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("KEY_IS_PROFILE_FETCHED", this.f24778E);
        bundle.putString("KEY_AVATAR_URL", this.f24791R);
        bundle.putString("KEY_AVATAR_THUMBNAIL_URL", this.f24792S);
        bundle.putString("KEY_MOTTO", this.f24790Q);
        bundle.putString("KEY_CONTACT_NAME", this.f24789P);
        bundle.putBoolean("KEY_IS_PROFILE_NAME_EDITABLE", this.f24779F.isEnabled());
        bundle.putBoolean("KEY_IS_PROFILE_STATUS_EDITABLE", this.f24780G.isEnabled());
    }

    protected final void mo3703y() {
        boolean z;
        if (!(this.f24784K || this.f24779F == null || this.f24779F.getText() == null)) {
            this.f24779F.getText().toString().trim().isEmpty();
        }
        boolean z2 = this.f24779F != null && (this.f24779F.getText() == null || this.f24779F.getText().toString().trim().isEmpty());
        if (this.f24783J == null || !(this.f24783J.getText() == null || this.f24783J.getText().toString().trim().isEmpty())) {
            String trim;
            String a;
            if (this.f24783J != null) {
                int i;
                Object[] objArr;
                Pattern compile = Pattern.compile("^[a-z0-9_.]+$");
                trim = this.f24783J.getText().toString().trim();
                if (trim.length() < 4) {
                    i = R.string.at_least_count_user_id_error_message;
                    objArr = new Object[]{Integer.valueOf(4)};
                } else if (trim.length() > 64) {
                    i = R.string.max_count_user_id_error_message;
                    objArr = new Object[]{Integer.valueOf(64)};
                } else if (!compile.matcher(trim.toLowerCase()).find()) {
                    a = C4522p.m8236a(R.string.sorry_this_user_id_is_invalid);
                    m21989d(a);
                }
                a = getString(i, objArr);
                m21989d(a);
            }
            z = true;
            if (z2 && this.f24779F != null) {
                this.f24795V.setErrorEnabled(true);
                this.f24795V.setError(C4522p.m8236a(R.string.profile_name_can_t_be_empty_));
                C4144a.m8005a(this.f24795V);
            }
            if (!z && !z2) {
                this.f24795V.setErrorEnabled(false);
                this.f24782I.setErrorEnabled(false);
                this.f24782I.setHint("");
                a = this.s;
                String str = "";
                String str2 = "";
                String str3 = "";
                if (!(this.f24779F == null || this.f24779F.getText() == null || this.f24779F.getText().toString().trim().isEmpty())) {
                    str = this.f24779F.getText().toString().trim();
                }
                trim = str;
                String trim2 = (this.f24780G == null || this.f24780G.getText() == null || this.f24780G.getText().toString().trim().isEmpty()) ? str3 : this.f24780G.getText().toString().trim();
                String toLowerCase = (this.f24783J == null || this.f24783J.getText() == null) ? str2 : this.f24783J.getText().toString().trim().toLowerCase();
                final C1063i c6799a = new C6799a(a, trim, trim2, this.t, toLowerCase);
                C2808d.m7147a(c6799a);
                runOnUiThread(new Runnable(this) {
                    final /* synthetic */ ProfileInfoActivity f12195b;

                    public final void run() {
                        C4501c.m8189a().m8192a(ProfileInfoActivity.m21990e(this.f12195b), c6799a);
                    }
                });
                return;
            }
        }
        z = false;
        this.f24795V.setErrorEnabled(true);
        this.f24795V.setError(C4522p.m8236a(R.string.profile_name_can_t_be_empty_));
        C4144a.m8005a(this.f24795V);
        if (!z) {
        }
    }

    protected void mo3704z() {
    }
}
