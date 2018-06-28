package mobi.mmdt.ott.view.vas.weather;

import android.os.Bundle;
import android.support.v4.app.C0401p;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import com.google.p164b.C1940f;
import java.lang.reflect.Type;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.bot.api.weather.OnGetWeatherEvent;
import mobi.mmdt.ott.logic.bot.api.weather.models.LongTimeWeatherModel;
import mobi.mmdt.ott.logic.vas.p374b.C2916b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public class WeatherActivity extends C7576b {
    public C7239b f24555m;
    public C7240c f24556n;
    public C7238a f24557o;

    class C45831 implements Runnable {
        final /* synthetic */ WeatherActivity f12602a;

        C45831(WeatherActivity weatherActivity) {
            this.f12602a = weatherActivity;
        }

        public final void run() {
            this.f12602a.f24555m.mo2533e();
            C4501c.m8189a().m8193b();
        }
    }

    private boolean m21518g() {
        int d = m19188c().mo262d();
        if (d > 0) {
            if (m19188c().mo260c(d - 1).mo246g().equals("WEATHER_FRAGMENT")) {
                return true;
            }
        }
        return false;
    }

    public final void m21519a(Fragment fragment, String str) {
        C0401p a = m19188c().mo254a();
        a.mo241b(fragment, str);
        a.mo233a();
        a.mo238a(str);
        a.mo242c();
        getFragmentManager().executePendingTransactions();
    }

    public void onBackPressed() {
        if (m21518g()) {
            finish();
        } else {
            super.onBackPressed();
        }
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    protected void onCreate(Bundle bundle) {
        Fragment fragment;
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_weather);
        this.f24555m = new C7239b();
        this.f24556n = new C7240c();
        this.f24557o = new C7238a();
        if (C2916b.m7294a() == null) {
            fragment = this.f24556n;
            str = "WEATHER_SETTING_FRAGMENT";
        } else {
            fragment = this.f24555m;
            str = "WEATHER_FRAGMENT";
        }
        m21519a(fragment, str);
    }

    public void onEvent(OnGetWeatherEvent onGetWeatherEvent) {
        Object model = onGetWeatherEvent.getModel();
        C2535a a = C2535a.m6888a();
        a.f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_WEATHER_DATA_MODEL_NEW", new C1940f().m5351a(model, (Type) LongTimeWeatherModel.class)).apply();
        runOnUiThread(new C45831(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (m21518g()) {
                finish();
            } else {
                super.onBackPressed();
            }
            overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
        } else if (itemId == R.id.menu_weather_toolbar_setting) {
            m21519a(this.f24556n, "WEATHER_SETTING_FRAGMENT");
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
