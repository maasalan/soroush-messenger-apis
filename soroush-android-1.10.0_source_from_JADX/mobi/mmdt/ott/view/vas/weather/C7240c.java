package mobi.mmdt.ott.view.vas.weather;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.C6389b.C0663a;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.bot.api.p342a.C2780b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.logic.vas.p374b.C2916b;
import mobi.mmdt.ott.logic.vas.p374b.p375a.C2914a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p405e.C6830b;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.vas.weather.p535a.C6998a;
import mobi.mmdt.ott.view.vas.weather.p536b.C6292a;
import mobi.mmdt.ott.view.vas.weather.p601d.C7400a;

public final class C7240c extends C6830b implements OnClickListener, C3101a, C3126i {
    private View f20914a;
    private LinearLayout ae;
    private TextView af;
    private TextView ag;
    private RecyclerView f20915b;
    private C6998a f20916c;
    private RadioButton f20917d;
    private RadioButton f20918e;
    private RadioButton f20919f;
    private RadioButton f20920g;
    private TextView f20921h;
    private boolean f20922i = false;

    class C45861 implements OnClickListener {
        final /* synthetic */ C7240c f12606a;

        C45861(C7240c c7240c) {
            this.f12606a = c7240c;
        }

        public final void onClick(View view) {
            C7240c.m19127a(this.f12606a);
        }
    }

    static /* synthetic */ void m19127a(C7240c c7240c) {
        if (c7240c.f20922i) {
            c7240c.f20922i = false;
            c7240c.f20921h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_action_delete, 0, 0, 0);
            c7240c.f20921h.setText("");
            return;
        }
        c7240c.f20922i = true;
        c7240c.f20921h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        c7240c.f20921h.setText(c7240c.m8876a((int) R.string.cancel));
    }

    private void m19129e() {
        List arrayList = new ArrayList();
        if (C2916b.m7294a() != null) {
            int i = 0;
            while (i < C2916b.m7294a().size()) {
                arrayList.add(new C7400a((C2780b) C2916b.m7294a().get(i), i, this.f20922i, C2535a.m6888a().ap() == i));
                i++;
            }
        }
        this.f20916c.m13673a(arrayList);
    }

    public final Dialog mo2299a(Bundle bundle) {
        if (bundle.getInt("WEATHER_DIALOG_TYPE_KEY") != 1001) {
            return null;
        }
        final int i = bundle.getInt("WEATHER_DELETED_CITY_ID");
        C0663a c0663a = new C0663a(m8909j(), R.style.AppCompatAlertDialogStyle);
        c0663a.m1613b(String.format(C4522p.m8236a(R.string.delete_city_dialog), new Object[]{C2914a.m7291a((C2780b) C2916b.m7294a().get(i))}));
        c0663a.m1614b(m8876a((int) R.string.cancel), null);
        c0663a.m1609a(m8876a((int) R.string.action_delete), new DialogInterface.OnClickListener(this) {
            final /* synthetic */ C7240c f12608b;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (C2916b.m7294a() == null || C2916b.m7294a().size() == 1) {
                    Snackbar.m8770a(this.f12608b.m8911k().findViewById(16908290), C4522p.m8236a(R.string.delete_last_city_warning), 0).m572a();
                    C7240c.m19127a(this.f12608b);
                    return;
                }
                int ap = C2535a.m6888a().ap();
                if (ap == i) {
                    C2535a.m6888a().m6934e(0);
                } else if (ap > i) {
                    C2535a.m6888a().m6934e(ap - 1);
                }
                ArrayList arrayList = (ArrayList) C2916b.m7294a().clone();
                arrayList.remove(i);
                C2535a.m6888a().m6946h("");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C2916b.m7295a((C2780b) it.next());
                }
                C7240c.m19127a(this.f12608b);
                this.f12608b.m19129e();
            }
        });
        return c0663a.m1612a();
    }

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RadioButton radioButton;
        this.f20914a = layoutInflater.inflate(R.layout.fragment_weather_setting, viewGroup, false);
        this.f20916c = new C6998a(m8911k(), this);
        this.f20915b = (RecyclerView) this.f20914a.findViewById(R.id.weather_setting_selected_cities_recycler);
        this.ak = (Toolbar) this.f20914a.findViewById(R.id.weather_setting_toolbar);
        this.f20917d = (RadioButton) this.f20914a.findViewById(R.id.weather_setting_celsius_unit_radio);
        this.f20918e = (RadioButton) this.f20914a.findViewById(R.id.weather_setting_fahrenheit_unit_radio);
        this.f20919f = (RadioButton) this.f20914a.findViewById(R.id.weather_setting_kmph_unit_radio);
        this.f20920g = (RadioButton) this.f20914a.findViewById(R.id.weather_setting_mph_unit_radio);
        this.af = (TextView) this.f20914a.findViewById(R.id.weather_setting_temp_unit_header);
        this.ag = (TextView) this.f20914a.findViewById(R.id.weather_setting_city_list_title);
        this.f20921h = (TextView) this.f20914a.findViewById(R.id.weather_setting_delete_city_icon);
        this.ae = (LinearLayout) this.f20914a.findViewById(R.id.weather_setting_add_city_button);
        this.ae.setOnClickListener(this);
        ((GradientDrawable) this.ae.getBackground()).setColor(UIThemeManager.getmInstance().getAccent_color());
        this.f20921h.setOnClickListener(new C45861(this));
        if (C2535a.m6888a().m6919b().equals("fa")) {
            this.af.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_temp, 0);
            this.ag.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_location, 0);
        } else {
            this.af.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_temp, 0, 0, 0);
            this.ag.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_location, 0, 0, 0);
            LayoutParams layoutParams = (LayoutParams) this.f20921h.getLayoutParams();
            layoutParams.addRule(11);
            this.f20921h.setLayoutParams(layoutParams);
        }
        this.ak.setTitle(m8876a((int) R.string.settings));
        m8915p();
        m17263a(m8911k(), UIThemeManager.getmInstance().getIcon_toolbar_dark_color());
        m19129e();
        m19129e();
        int am = C2535a.m6888a().am();
        int an = C2535a.m6888a().an();
        switch (am) {
            case 1001:
                radioButton = this.f20917d;
                break;
            case 1002:
                radioButton = this.f20918e;
                break;
            default:
                break;
        }
        radioButton.setChecked(true);
        switch (an) {
            case 2001:
                radioButton = this.f20919f;
                break;
            case 2002:
                radioButton = this.f20920g;
                break;
            default:
                break;
        }
        radioButton.setChecked(true);
        this.f20915b.setLayoutManager(new LinearLayoutManager(m8911k(), 1, false));
        this.f20915b.addItemDecoration(new C6292a(m8911k()));
        this.f20915b.setAdapter(this.f20916c);
        return this.f20914a;
    }

    public final void mo3467a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_weather_setting_toolbar, menu);
        C2491i.m6790a(menu.findItem(R.id.menu_weather_setting_toolbar_ok).getIcon(), UIThemeManager.getmInstance().getIcon_toolbar_dark_color());
        super.mo3467a(menu, menuInflater);
    }

    public final boolean mo3468a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.home) {
            m8911k().onBackPressed();
        } else if (itemId == R.id.menu_weather_setting_toolbar_ok) {
            C2535a a;
            int i;
            WeatherActivity weatherActivity;
            if (this.f20917d.isChecked()) {
                a = C2535a.m6888a();
                i = 1001;
            } else {
                if (this.f20918e.isChecked()) {
                    a = C2535a.m6888a();
                    i = 1002;
                }
                if (this.f20919f.isChecked()) {
                    if (this.f20920g.isChecked()) {
                        a = C2535a.m6888a();
                        i = 2002;
                    }
                    Toast.makeText(m8911k(), m8876a((int) R.string.weather_setting_save_changes_alert), 0).show();
                    weatherActivity = (WeatherActivity) m8911k();
                    weatherActivity.m21519a(weatherActivity.f24555m, "WEATHER_FRAGMENT");
                } else {
                    a = C2535a.m6888a();
                    i = 2001;
                }
                a.m6929d(i);
                Toast.makeText(m8911k(), m8876a((int) R.string.weather_setting_save_changes_alert), 0).show();
                weatherActivity = (WeatherActivity) m8911k();
                weatherActivity.m21519a(weatherActivity.f24555m, "WEATHER_FRAGMENT");
            }
            a.m6925c(i);
            if (this.f20919f.isChecked()) {
                if (this.f20920g.isChecked()) {
                    a = C2535a.m6888a();
                    i = 2002;
                }
                Toast.makeText(m8911k(), m8876a((int) R.string.weather_setting_save_changes_alert), 0).show();
                weatherActivity = (WeatherActivity) m8911k();
                weatherActivity.m21519a(weatherActivity.f24555m, "WEATHER_FRAGMENT");
            } else {
                a = C2535a.m6888a();
                i = 2001;
            }
            a.m6929d(i);
            Toast.makeText(m8911k(), m8876a((int) R.string.weather_setting_save_changes_alert), 0).show();
            weatherActivity = (WeatherActivity) m8911k();
            weatherActivity.m21519a(weatherActivity.f24555m, "WEATHER_FRAGMENT");
        }
        return super.mo3468a(menuItem);
    }

    public final void mo2234c(int i) {
        if (this.f20922i) {
            Bundle bundle = new Bundle();
            bundle.putInt("WEATHER_DIALOG_TYPE_KEY", 1001);
            bundle.putInt("WEATHER_DELETED_CITY_ID", i);
            mo2299a(bundle).show();
            return;
        }
        C2535a.m6888a().m6934e(i);
        m19129e();
    }

    public final void mo2235d(int i) {
    }

    public final void onClick(View view) {
        if (view.getId() == this.ae.getId()) {
            this.f20922i = false;
            ((WeatherActivity) m8911k()).m21519a(new C7238a(), "SEARCH_CITY_FRAGMENT");
        }
    }
}
