package mobi.mmdt.ott.view.components.p402d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.C0401p;
import android.support.v4.app.Fragment;
import android.support.v4.p029a.C0346c;
import android.support.v4.p029a.p030a.C0343b;
import android.support.v7.app.C0662a;
import android.support.v7.app.C7406c;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.Locale;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.MyApplication.C24952;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.core.C2800c;
import mobi.mmdt.ott.logic.core.C2800c.C2799a;
import mobi.mmdt.ott.logic.p261a.p301l.p302a.C2718c;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p240c.p241a.C5770a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.browser.C3112a;
import mobi.mmdt.ott.view.components.p398a.C7175a;
import mobi.mmdt.ott.view.passcode.PassCodeActivity;
import mobi.mmdt.ott.view.settings.mainsettings.localpasscode.C4400b;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import p000a.p001a.p002a.C0005c;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public abstract class C7576b extends C7406c {
    private Locale f23133m = null;
    protected Toolbar f23134x;
    protected View f23135y;

    protected static int m20717a(C4400b c4400b) {
        switch (c4400b) {
            case fifteen_min:
                return 900000;
            case five_hour:
                return 18000000;
            case five_min:
                return 300000;
            case one_min:
                return 60000;
            case immediately:
                return 2000;
            default:
                return 0;
        }
    }

    protected static boolean m20718v() {
        return C2535a.m6888a().m6972t() && !MyApplication.m12950a().f15902Q;
    }

    protected static C4400b m20719w() {
        return C4400b.values()[C2535a.m6888a().m6979x()];
    }

    public static Context m20720x() {
        return MyApplication.m12952b();
    }

    public final void m20721a(int i, int i2, int i3) {
        C2491i.m6796a(this.f23134x, i);
        m20724b(i2, i3);
    }

    public final void m20722a(Toolbar toolbar, boolean z) {
        this.f23134x = toolbar;
        m19694f().mo2585a(toolbar);
        if (this.f23134x != null) {
            this.f23134x.setOverflowIcon(C0343b.m671a(getResources(), z ? R.drawable.ic_option : R.drawable.ic_action_option_white, getTheme()));
            if (z) {
                if (this.f23134x.getOverflowIcon() != null) {
                    C2491i.m6790a(this.f23134x.getOverflowIcon(), -12040120);
                }
            } else if (this.f23134x.getOverflowIcon() != null) {
                C2491i.m6790a(this.f23134x.getOverflowIcon(), -1);
            }
        }
        C0662a a = m19694f().mo457a();
        if (a != null) {
            a.mo471a(true);
            a.mo476b(true);
            Drawable a2 = C0346c.m682a((Context) this, (int) R.drawable.ic_back_dark);
            if (z) {
                a.mo469a(C2491i.m6808b(a2, -12040120));
                return;
            }
            a.mo469a(C2491i.m6808b(a2, -1));
        }
    }

    public final void m20723a(boolean z, int i) {
        m19694f().mo2585a(this.f23134x);
        if (this.f23134x != null) {
            this.f23134x.setOverflowIcon(C0343b.m671a(getResources(), R.drawable.ic_option, getTheme()));
            if (this.f23134x.getOverflowIcon() != null) {
                C2491i.m6790a(this.f23134x.getOverflowIcon(), i);
            }
        }
        C0662a a = m19694f().mo457a();
        if (a != null && z) {
            a.mo471a(true);
            a.mo476b(true);
            a.mo469a(C2491i.m6808b(C0346c.m682a((Context) this, (int) R.drawable.ic_back_dark), i));
        }
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(context));
    }

    public final void m20724b(int i, int i2) {
        C2491i.m6795a(this.f23134x, i);
        C2491i.m6817b(this.f23134x, i2);
    }

    public void b_(Bundle bundle) {
        Fragment k = C7175a.m18964k(bundle);
        C0401p a = m19188c().mo254a();
        a.mo237a(k, "tag");
        a.mo244d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Resources resources = getBaseContext().getResources();
        if (this.f23133m != null) {
            Locale locale = new Locale(C2535a.m6888a().m6919b());
            Locale.setDefault(locale);
            Configuration configuration2 = new Configuration(configuration);
            configuration2.locale = locale;
            resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2489g a = C2489g.m6754a();
        Display defaultDisplay = ((WindowManager) getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        a.f8167a = point;
        C2475a.m6720a(getWindow(), UIThemeManager.getmInstance().getPrimary_dark_color());
        C3134c.m7581a((Context) this).mo2242a((Activity) this);
    }

    public void onDestroy() {
        super.onDestroy();
        C3134c.m7581a((Context) this).mo2246b((Activity) this);
        C4501c.m8189a().m8193b();
        onTrimMemory(80);
        Runtime.getRuntime().gc();
    }

    public void onEvent(C3130a c3130a) {
        finish();
    }

    public void onPause() {
        super.onPause();
        C0005c.m0a().m8c(this);
        MyApplication a = MyApplication.m12950a();
        a.f15907m--;
        new Handler().postDelayed(new C24952(a), 1000);
        if (C2535a.m6888a().m6972t() && !MyApplication.m12950a().f15902Q && !C2535a.m6888a().m6974u()) {
            MyApplication.m12950a().f15901P = System.currentTimeMillis();
        }
    }

    public void onResume() {
        super.onResume();
        C0005c.m0a().m6a((Object) this);
        Resources resources = getBaseContext().getResources();
        Configuration configuration = resources.getConfiguration();
        String b = C2535a.m6888a().m6919b();
        if (!("".equals(b) || configuration.locale.getLanguage().equals(b))) {
            this.f23133m = new Locale(b);
            Locale.setDefault(this.f23133m);
            configuration.locale = this.f23133m;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
        MyApplication a = MyApplication.m12950a();
        boolean z = true;
        a.f15907m++;
        if (!C5996e.m13260a().f16147a.m7105a(false)) {
            C2800c.m7135a().m7139b(C2799a.f8849a);
        }
        if (a.f15907m == 1 && !a.f15898M) {
            C5770a.m12970c().m12994b(false);
            a.f15898M = true;
        }
        if (!C7576b.m20718v() || System.currentTimeMillis() - MyApplication.m12950a().f15901P <= ((long) C7576b.m20717a(C7576b.m20719w()))) {
            z = false;
        } else {
            C2535a.m6888a().m6961o(true);
            if (this != null) {
                Intent intent = new Intent(this, PassCodeActivity.class);
                intent.setFlags(268435456);
                intent.putExtra("FROM_SETTING", false);
                intent.putExtra("KEY_ENTER_WITH_TIMER", true);
                startActivity(intent);
            }
        }
        if (!(z || MyApplication.m12950a().f15902Q)) {
            MyApplication.m12950a().f15901P = System.currentTimeMillis();
        }
        C3134c.m7581a((Context) this).mo2249c(this);
    }

    public void startActivity(Intent intent) {
        C2480b.m6742f("link TypefaceAppCompatActivity startActivity");
        if (intent == null || intent.getAction() == null || !TextUtils.equals(intent.getAction(), "android.intent.action.VIEW")) {
            super.startActivity(intent);
            return;
        }
        Uri data = intent.getData();
        if (data != null && data.toString().startsWith("#")) {
            C0005c.m0a().m9d(new C2718c(data.toString()));
        } else if (data == null || (!(data.toString().startsWith("http://") || data.toString().startsWith("https://")) || intent.getExtras().containsKey(C3112a.f9688a))) {
            super.startActivity(intent);
        } else if (C3112a.m7568a(data) && data.getPathSegments().size() == 0) {
            C3112a.m7567a((Activity) this, data.toString());
        } else {
            C3112a.m7566a((Activity) this, Uri.parse(data.toString()));
        }
    }

    public final void m20725t() {
        if (getWindow() != null && getWindow().getDecorView() != null) {
            getWindow().getDecorView().setBackgroundColor(UIThemeManager.getmInstance().getRecycler_view_background_color());
        }
    }

    public final void m20726u() {
        C2491i.m6797a(this.f23135y, UIThemeManager.getmInstance().getShadow_toolbar_start_gradient_color(), UIThemeManager.getmInstance().getShadow_toolbar_end_gradient_color());
    }
}
