package mobi.mmdt.ott.view.channel.p396a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.channel.C3077a;
import mobi.mmdt.ott.view.channel.p564b.C7321b;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4515k;

public final class C6820a extends C6073e {
    private TextView f19456b;
    private FrameLayout f19457c;
    private String f19458d;
    private Activity f19459e;
    private RoundAvatarImageView f19460f;
    private CardView f19461g;
    private TextView f19462h;
    private ProgressWheel f19463i;
    private C1247e<Drawable> f19464j = new C60551(this);

    class C60551 implements C1247e<Drawable> {
        final /* synthetic */ C6820a f16208a;

        C60551(C6820a c6820a) {
            this.f16208a = c6820a;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16208a.f19463i.setVisibility(8);
            return false;
        }
    }

    public C6820a(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, final C3077a c3077a) {
        super(layoutInflater, viewGroup, R.layout.channel_categories_list_item, null);
        this.f19459e = activity;
        this.f19460f = (RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1);
        this.f19462h = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19456b = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19457c = (FrameLayout) this.itemView.findViewById(R.id.frameLayout);
        this.f19463i = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f19461g = (CardView) this.itemView.findViewById(R.id.cardView);
        this.f19458d = C2535a.m6888a().m6919b();
        this.f19461g.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6820a f9591b;

            public final void onClick(View view) {
                C7321b c7321b = (C7321b) this.f9591b.f16244a;
                if (!c7321b.f21074a) {
                    C3077a c3077a = c3077a;
                    int i = c7321b.f21075b;
                    i = c7321b.f21075b;
                    String str = c7321b.f21076c;
                    c3077a.mo3245a(i);
                }
            }
        });
        UIThemeManager.getmInstance().getRecycler_view_background_color();
        UIThemeManager.getmInstance().getRecycler_view_background_color();
        new View[1][0] = this.itemView;
    }

    protected final void mo3180a(C6829g c6829g) {
        float f;
        int i;
        int i2;
        TextView textView;
        CharSequence b;
        C7321b c7321b = (C7321b) c6829g;
        if (c7321b.f21074a) {
            this.f19456b.setVisibility(0);
            f = 0.5f;
            i = -1;
            i2 = UIThemeManager.disable_color;
        } else {
            i2 = UIThemeManager.getmInstance().getExplore_channel_item_background_color();
            i = UIThemeManager.getmInstance().getText_primary_color();
            f = BallPulseIndicator.SCALE;
            this.f19456b.setVisibility(8);
        }
        C2491i.m6793a(this.f19461g, i2);
        C2491i.m6802a(this.f19462h, i);
        C2491i.m6802a(this.f19456b, i);
        this.f19457c.setAlpha(f);
        if (this.f19458d.equals("fa")) {
            textView = this.f19462h;
            b = C2491i.m6814b(c7321b.f21076c);
        } else {
            textView = this.f19462h;
            b = c7321b.f21076c;
        }
        textView.setText(b);
        if (c7321b.m19586b() >= 0) {
            C1212c.m2872a(this.f19459e).m10950a(Integer.valueOf(c7321b.m19586b())).m3034a(C1248f.m2945b()).m3033a().m3031a(this.f19460f);
            this.f19463i.setVisibility(8);
        } else {
            C1274i a = C1212c.m2872a(this.f19459e).m10950a(C4515k.m8231a(C2556b.m6998a(c7321b.f21077d))).m3034a(C1248f.m2945b());
            a.f3986c = this.f19464j;
            a.m3033a().m3031a(this.f19460f);
        }
        if (c7321b.f21074a) {
            this.f19460f.setBackgroundColor(UIThemeManager.disable_color);
        } else {
            this.f19460f.setBackgroundColor(-1);
        }
    }
}
