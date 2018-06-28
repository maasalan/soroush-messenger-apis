package mobi.mmdt.ott.view.vas.weather;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.p164b.C1940f;
import com.google.p164b.p166b.C1929i;
import com.google.p164b.p170d.C1935a;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.p106a.C7038f;
import com.p085c.p086a.p105g.p107b.C1242b;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import lecho.lib.hellocharts.view.LineChartView;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.bot.api.weather.GetWeatherByCityModelJob;
import mobi.mmdt.ott.logic.bot.api.weather.models.DayWeatherModel;
import mobi.mmdt.ott.logic.bot.api.weather.models.DegreeUnit;
import mobi.mmdt.ott.logic.bot.api.weather.models.LongTimeWeatherModel;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.logic.vas.p374b.C2915a;
import mobi.mmdt.ott.logic.vas.p374b.C2916b;
import mobi.mmdt.ott.logic.vas.p374b.p375a.C2914a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p405e.C6830b;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.p479c.C4501c;
import mobi.mmdt.ott.view.vas.weather.p535a.C6291c;

public final class C7239b extends C6830b {
    private RecyclerView f20905a;
    private TextView ae;
    private TextView af;
    private TextView ag;
    private TextView ah;
    private ImageView ai;
    private ArrayList<DayWeatherModel> aj;
    private TextView al;
    private C6291c f20906b;
    private LineChartView f20907c;
    private int f20908d;
    private View f20909e;
    private String f20910f;
    private TextView f20911g;
    private TextView f20912h;
    private TextView f20913i;

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity k;
        int icon_toolbar_white_color;
        this.f20909e = layoutInflater.inflate(R.layout.fragment_weather, viewGroup, false);
        final LinearLayout linearLayout = (LinearLayout) this.f20909e.findViewById(R.id.weather_main_layout);
        C1212c.m2873a(m8911k()).m10950a(Integer.valueOf(C2914a.m7292a() ? R.drawable.weather_background_dark : R.drawable.weather_background_light)).m3032a(new C7038f<Drawable>(this) {
            final /* synthetic */ C7239b f21522b;

            public final /* synthetic */ void mo3320a(Object obj, C1242b c1242b) {
                Drawable drawable = (Drawable) obj;
                if (VERSION.SDK_INT >= 16) {
                    linearLayout.setBackground(drawable);
                } else {
                    linearLayout.setBackgroundDrawable(drawable);
                }
            }
        });
        this.f20908d = (C2489g.m6754a().m6755a(BallPulseIndicator.SCALE) / 5) - 13;
        this.aj = new ArrayList();
        this.f20906b = new C6291c(this.aj, m8911k(), this.f20908d);
        this.f20905a = (RecyclerView) this.f20909e.findViewById(R.id.weather_horizental_recycler_view);
        this.f20907c = (LineChartView) this.f20909e.findViewById(R.id.weather_chart_view);
        this.f20910f = C2535a.m6888a().m6919b();
        this.f20911g = (TextView) this.f20909e.findViewById(R.id.weather_today_current_temp);
        this.f20912h = (TextView) this.f20909e.findViewById(R.id.weather_today_max_temp);
        this.f20913i = (TextView) this.f20909e.findViewById(R.id.weather_today_min_temp);
        this.ae = (TextView) this.f20909e.findViewById(R.id.weather_today_humidity);
        this.af = (TextView) this.f20909e.findViewById(R.id.weather_today_wind_speed);
        TextView textView = (TextView) this.f20909e.findViewById(R.id.weather_today_current_temp_unit);
        TextView textView2 = (TextView) this.f20909e.findViewById(R.id.weather_today_wind_speed_unit);
        this.ag = (TextView) this.f20909e.findViewById(R.id.weather_city_name);
        this.ah = (TextView) this.f20909e.findViewById(R.id.weather_today_date);
        this.ai = (ImageView) this.f20909e.findViewById(R.id.weather_today_icon);
        TextView textView3 = (TextView) this.f20909e.findViewById(R.id.weather_today_humidity_unit);
        this.al = (TextView) this.f20909e.findViewById(R.id.weather_forecast_text);
        this.ak = (Toolbar) this.f20909e.findViewById(R.id.weather_toolbar);
        textView.setText(m8876a(C2535a.m6888a().am() == 1001 ? R.string.weather_temp_unit_celsius : R.string.weather_temp_unit_fahrenheit));
        textView2.setText(m8876a(C2535a.m6888a().an() == 2001 ? R.string.weather_wind_unit_kmh : R.string.weather_wind_unit_mh));
        if (C2914a.m7292a()) {
            C2491i.m6784a(-1, this.ah, this.ag, this.f20913i, this.f20912h, this.f20911g, this.af, this.ae, textView, textView2, textView3);
        }
        if (this.f20910f.equals("fa")) {
            this.f20911g.setText(C2491i.m6814b(this.f20911g.getText().toString()));
            this.f20912h.setText(C2491i.m6814b(this.f20912h.getText().toString()));
            this.f20913i.setText(C2491i.m6814b(this.f20913i.getText().toString()));
            this.ae.setText(C2491i.m6814b(this.ae.getText().toString()));
            this.af.setText(C2491i.m6814b(this.af.getText().toString()));
            LayoutParams layoutParams = (LayoutParams) this.f20911g.getLayoutParams();
            layoutParams.addRule(1, R.id.weather_today_current_temp_unit);
            this.f20911g.setLayoutParams(layoutParams);
            this.al.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_calendar, 0);
        } else {
            LayoutParams layoutParams2 = (LayoutParams) textView.getLayoutParams();
            layoutParams2.addRule(1, R.id.weather_today_current_temp);
            textView.setLayoutParams(layoutParams2);
            this.al.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_calendar, 0, 0, 0);
        }
        this.ak.setTitle((CharSequence) "");
        m8915p();
        if (C2914a.m7292a()) {
            k = m8911k();
            icon_toolbar_white_color = UIThemeManager.getmInstance().getIcon_toolbar_white_color();
        } else {
            k = m8911k();
            icon_toolbar_white_color = UIThemeManager.getmInstance().getIcon_toolbar_dark_color();
        }
        m17263a(k, icon_toolbar_white_color);
        this.f20905a.setLayoutManager(new LinearLayoutManager(m8911k(), 0, false));
        this.f20905a.setAdapter(this.f20906b);
        mo2533e();
        C2808d.m7148b(new GetWeatherByCityModelJob(C2916b.m7296b(), C2535a.m6888a().am() == 1001 ? DegreeUnit.CELSIUS : DegreeUnit.FAHRENHEIT));
        C4501c.m8189a().m8191a(m8911k(), R.string.please_wait_, true);
        return this.f20909e;
    }

    public final void mo3467a(Menu menu, MenuInflater menuInflater) {
        Drawable icon;
        int icon_toolbar_white_color;
        super.mo3467a(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_weather_toolbar, menu);
        MenuItem findItem = menu.findItem(R.id.menu_weather_toolbar_setting);
        if (C2914a.m7292a()) {
            icon = findItem.getIcon();
            icon_toolbar_white_color = UIThemeManager.getmInstance().getIcon_toolbar_white_color();
        } else {
            icon = findItem.getIcon();
            icon_toolbar_white_color = UIThemeManager.getmInstance().getIcon_toolbar_dark_color();
        }
        C2491i.m6790a(icon, icon_toolbar_white_color);
    }

    public final void mo2533e() {
        Object obj;
        TextView textView;
        CharSequence b;
        C1940f c1940f = new C1940f();
        String string = C2535a.m6888a().f8278a.getString("mobi.mmdt.ott.model.pref.KEY_WEATHER_DATA_MODEL_NEW", "{\"current\":{\"temperature\":25,\"date\":\"Sep 25, 2017 8:30:00 AM\",\"weatherCondition\":\"sunny\"},\"weatherModels\":[{\"day\":\"MON\",\"highTemperature\":33,\"lowTemperature\":19,\"date\":\"Sep 25, 2017 12:00:00 AM\",\"weatherCondition\":\"sunny\"},{\"day\":\"TUE\",\"highTemperature\":30,\"lowTemperature\":17,\"date\":\"Sep 26, 2017 12:00:00 AM\",\"weatherCondition\":\"sunny\"},{\"day\":\"WED\",\"highTemperature\":30,\"lowTemperature\":17,\"date\":\"Sep 27, 2017 12:00:00 AM\",\"weatherCondition\":\"fair_day\"},{\"day\":\"THU\",\"highTemperature\":31,\"lowTemperature\":17,\"date\":\"Sep 28, 2017 12:00:00 AM\",\"weatherCondition\":\"sunny\"},{\"day\":\"FRI\",\"highTemperature\":27,\"lowTemperature\":14,\"date\":\"Sep 29, 2017 12:00:00 AM\",\"weatherCondition\":\"sunny\"},{\"day\":\"SAT\",\"highTemperature\":27,\"lowTemperature\":16,\"date\":\"Sep 30, 2017 12:00:00 AM\",\"weatherCondition\":\"sunny\"},{\"day\":\"SUN\",\"highTemperature\":30,\"lowTemperature\":18,\"date\":\"Oct 1, 2017 12:00:00 AM\",\"weatherCondition\":\"sunny\"},{\"day\":\"MON\",\"highTemperature\":32,\"lowTemperature\":19,\"date\":\"Oct 2, 2017 12:00:00 AM\",\"weatherCondition\":\"sunny\"},{\"day\":\"TUE\",\"highTemperature\":33,\"lowTemperature\":19,\"date\":\"Oct 3, 2017 12:00:00 AM\",\"weatherCondition\":\"sunny\"},{\"day\":\"WED\",\"highTemperature\":31,\"lowTemperature\":16,\"date\":\"Oct 4, 2017 12:00:00 AM\",\"weatherCondition\":\"sunny\"}],\"humidity\":15,\"windSpeed\":11}");
        Class cls = LongTimeWeatherModel.class;
        if (string == null) {
            obj = null;
        } else {
            C1935a a = c1940f.m5345a(new StringReader(string));
            obj = c1940f.m5350a(a, (Type) cls);
            C1940f.m5344a(obj, a);
        }
        LongTimeWeatherModel longTimeWeatherModel = (LongTimeWeatherModel) C1929i.m5280a(cls).cast(obj);
        this.ah.setText(C2914a.m7290a(m8911k(), longTimeWeatherModel.getCurrent().getDate()));
        this.ai.setImageResource(C2915a.m7293a(longTimeWeatherModel.getCurrent().getWeatherCondition()));
        this.ag.setText(C2914a.m7291a(C2916b.m7296b()));
        if (this.f20910f.equals("fa")) {
            this.f20913i.setText(C2491i.m6814b(String.valueOf(((DayWeatherModel) longTimeWeatherModel.getWeatherModels().get(0)).getLowTemperature())));
            this.f20912h.setText(C2491i.m6814b(String.valueOf(((DayWeatherModel) longTimeWeatherModel.getWeatherModels().get(0)).getHighTemperature())));
            this.f20911g.setText(C2491i.m6814b(String.valueOf(longTimeWeatherModel.getCurrent().getTemperature())));
            this.af.setText(C2491i.m6809b(longTimeWeatherModel.getWindSpeed()));
            textView = this.ae;
            b = C2491i.m6809b(longTimeWeatherModel.getHumidity());
        } else {
            this.f20913i.setText(String.valueOf(((DayWeatherModel) longTimeWeatherModel.getWeatherModels().get(0)).getLowTemperature()));
            this.f20912h.setText(String.valueOf(((DayWeatherModel) longTimeWeatherModel.getWeatherModels().get(0)).getHighTemperature()));
            this.f20911g.setText(String.valueOf(longTimeWeatherModel.getCurrent().getTemperature()));
            this.af.setText(String.valueOf(longTimeWeatherModel.getWindSpeed()));
            textView = this.ae;
            b = String.valueOf(longTimeWeatherModel.getHumidity());
        }
        textView.setText(b);
        this.aj.clear();
        Iterator it = longTimeWeatherModel.getWeatherModels().iterator();
        while (it.hasNext()) {
            this.aj.add((DayWeatherModel) it.next());
        }
        this.f20906b.notifyDataSetChanged();
    }
}
