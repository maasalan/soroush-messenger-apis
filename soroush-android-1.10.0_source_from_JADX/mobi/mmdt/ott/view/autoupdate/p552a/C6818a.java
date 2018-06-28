package mobi.mmdt.ott.view.autoupdate.p552a;

import android.app.Activity;
import android.support.v4.p029a.C0346c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.autoupdate.p562b.C7171a;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6818a extends C6073e {
    private Activity f19446b;
    private View f19447c = this.itemView.findViewById(R.id.line);
    private TextView f19448d = ((TextView) this.itemView.findViewById(R.id.textView1));
    private ImageView f19449e = ((ImageView) this.itemView.findViewById(R.id.tick_image_view));

    public C6818a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.username_update_list_item, null);
        this.f19446b = activity;
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        float f;
        C7171a c7171a = (C7171a) c6829g;
        this.f19448d.setText(c7171a.f20622c);
        if (c7171a.f20621b) {
            C2491i.m6790a(this.f19449e.getBackground(), C0346c.m687c(this.f19446b, R.color.custom_showcase_btn_bg));
            this.f19449e.setImageResource(R.drawable.ic_message_tick_white);
            textView = this.f19448d;
            f = BallPulseIndicator.SCALE;
        } else {
            this.f19449e.setImageResource(0);
            C2491i.m6790a(this.f19449e.getBackground(), C0346c.m687c(this.f19446b, R.color.user_name_update_color));
            textView = this.f19448d;
            f = 0.3f;
        }
        textView.setAlpha(f);
        if (c7171a.f20620a) {
            this.f19447c.setVisibility(8);
        } else {
            this.f19447c.setVisibility(0);
        }
    }
}
