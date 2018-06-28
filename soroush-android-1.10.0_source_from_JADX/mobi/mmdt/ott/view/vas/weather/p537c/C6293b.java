package mobi.mmdt.ott.view.vas.weather.p537c;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;

public final class C6293b extends ViewHolder {
    public RelativeLayout f17207a;
    public TextView f17208b;
    public TextView f17209c;
    public ImageView f17210d;
    public TextView f17211e;
    public TextView f17212f;

    public C6293b(View view) {
        super(view);
        this.f17207a = (RelativeLayout) view.findViewById(R.id.weather_card_view);
        this.f17208b = (TextView) view.findViewById(R.id.weather_forecast_card_day);
        this.f17209c = (TextView) view.findViewById(R.id.weather_forecast_card_date);
        this.f17210d = (ImageView) view.findViewById(R.id.weather_forecast_card_icon);
        this.f17211e = (TextView) view.findViewById(R.id.weather_forecast_card_max_temp);
        this.f17212f = (TextView) view.findViewById(R.id.weather_forecast_card_min_temp);
    }
}
