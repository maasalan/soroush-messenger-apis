package mobi.mmdt.ott.view.vas.weather.p535a;

import android.app.Activity;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.bot.api.weather.models.DayWeatherModel;
import mobi.mmdt.ott.logic.vas.p374b.C2915a;
import mobi.mmdt.ott.logic.vas.p374b.p375a.C2914a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.vas.weather.p537c.C6293b;

public final class C6291c extends Adapter<C6293b> {
    private List<DayWeatherModel> f17203a = new ArrayList();
    private int f17204b;
    private Activity f17205c;

    public C6291c(List<DayWeatherModel> list, Activity activity, int i) {
        this.f17203a = list;
        this.f17205c = activity;
        this.f17204b = i;
    }

    public final int getItemCount() {
        return this.f17203a.size();
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        TextView textView;
        CharSequence b;
        C6293b c6293b = (C6293b) viewHolder;
        c6293b.f17207a.setLayoutParams(new LayoutParams(this.f17204b, -1));
        c6293b.f17210d.setImageResource(C2915a.m7293a(((DayWeatherModel) this.f17203a.get(i)).getWeatherCondition()));
        c6293b.f17208b.setText(((DayWeatherModel) this.f17203a.get(i)).getDay().getString());
        c6293b.f17209c.setText(C2914a.m7290a(this.f17205c, ((DayWeatherModel) this.f17203a.get(i)).getDate()));
        if (C2535a.m6888a().m6919b().equals("fa")) {
            c6293b.f17211e.setText(C2491i.m6814b(String.valueOf(((DayWeatherModel) this.f17203a.get(i)).getHighTemperature())));
            textView = c6293b.f17212f;
            b = C2491i.m6814b(String.valueOf(((DayWeatherModel) this.f17203a.get(i)).getLowTemperature()));
        } else {
            c6293b.f17211e.setText(String.valueOf(String.valueOf(((DayWeatherModel) this.f17203a.get(i)).getHighTemperature())));
            textView = c6293b.f17212f;
            b = String.valueOf(String.valueOf(((DayWeatherModel) this.f17203a.get(i)).getLowTemperature()));
        }
        textView.setText(b);
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6293b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.weather_vertical_forecast_card, viewGroup, false));
    }
}
