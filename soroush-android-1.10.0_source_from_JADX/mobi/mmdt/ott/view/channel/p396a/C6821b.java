package mobi.mmdt.ott.view.channel.p396a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.C5284j;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6705n;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.channel.C3077a;
import mobi.mmdt.ott.view.channel.p564b.C7322c;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6821b extends C6073e {
    private View f19465b;
    private String f19466c;
    private Activity f19467d;
    private RoundAvatarImageView f19468e;
    private TextView f19469f;
    private TextView f19470g;
    private TextView f19471h;
    private CardView f19472i;
    private AppCompatButton f19473j;
    private AppCompatButton f19474k;
    private ProgressWheel f19475l;
    private C3077a f19476m;
    private C1247e<Drawable> f19477n = new C60561(this);

    class C30742 implements OnClickListener {
        final /* synthetic */ C6821b f9592a;

        C30742(C6821b c6821b) {
            this.f9592a = c6821b;
        }

        public final void onClick(View view) {
            C6821b.m17245b(this.f9592a);
        }
    }

    class C30753 implements OnClickListener {
        final /* synthetic */ C6821b f9593a;

        C30753(C6821b c6821b) {
            this.f9593a = c6821b;
        }

        public final void onClick(View view) {
            C6821b.m17245b(this.f9593a);
        }
    }

    class C30764 implements OnClickListener {
        final /* synthetic */ C6821b f9594a;

        C30764(C6821b c6821b) {
            this.f9594a = c6821b;
        }

        public final void onClick(View view) {
            C2808d.m7147a(new C6705n(((C7322c) this.f9594a.f16244a).f21080b));
        }
    }

    class C60561 implements C1247e<Drawable> {
        final /* synthetic */ C6821b f16209a;

        C60561(C6821b c6821b) {
            this.f16209a = c6821b;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16209a.f19475l.setVisibility(8);
            return false;
        }
    }

    public C6821b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3077a c3077a) {
        super(layoutInflater, viewGroup, R.layout.channels_list_item, null);
        this.f19467d = activity;
        this.f19476m = c3077a;
        this.f19468e = (RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1);
        this.f19469f = (TextView) this.itemView.findViewById(R.id.textView1);
        this.f19470g = (TextView) this.itemView.findViewById(R.id.textView2);
        this.f19471h = (TextView) this.itemView.findViewById(R.id.textView3);
        this.f19471h.setMaxLines(5);
        this.f19473j = (AppCompatButton) this.itemView.findViewById(R.id.visit_button);
        this.f19474k = (AppCompatButton) this.itemView.findViewById(R.id.follow_button);
        this.f19465b = this.itemView.findViewById(R.id.divider_line);
        this.f19475l = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f19472i = (CardView) this.itemView.findViewById(R.id.cardView);
        this.f19466c = C2535a.m6888a().m6919b();
        this.f19472i.setOnClickListener(new C30742(this));
        this.f19473j.setOnClickListener(new C30753(this));
        this.f19474k.setOnClickListener(new C30764(this));
        C2491i.m6802a(this.f19469f, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19471h, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19470g, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6798a(this.f19473j, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6796a(this.f19465b, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6793a(this.f19472i, UIThemeManager.getmInstance().getExplore_channel_item_background_color());
        UIThemeManager.getmInstance().getRecycler_view_background_color();
        UIThemeManager.getmInstance().getRecycler_view_background_color();
        new View[1][0] = this.itemView;
    }

    static /* synthetic */ void m17245b(C6821b c6821b) {
        C7322c c7322c = (C7322c) c6821b.f16244a;
        c6821b.f19476m.mo3246a(c7322c.f21079a, c7322c.f21080b);
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        CharSequence b;
        C7322c c7322c = (C7322c) c6829g;
        this.f19469f.setText(c7322c.f21081c);
        String a = C4522p.m8236a(R.string.follower);
        String a2 = C4522p.m8236a(R.string.followers);
        if (this.f19466c.equals("fa")) {
            textView = this.f19470g;
            b = C2491i.m6814b(C2491i.m6766a(this.f19467d, (float) c7322c.f21084f, a, a2));
        } else {
            textView = this.f19470g;
            b = C2491i.m6766a(this.f19467d, (float) c7322c.f21084f, a, a2);
        }
        textView.setText(b);
        this.f19471h.setText(c7322c.f21083e != null ? Normalizer.normalize(c7322c.f21083e, Form.NFD).replaceAll("[\n][\n]", " ") : "");
        if (c7322c.f21085g) {
            this.f19474k.setText("دنبال شده");
            C2491i.m6798a(this.f19474k, UIThemeManager.getmInstance().getAccent_color());
            this.f19474k.setEnabled(false);
        } else {
            this.f19474k.setText("دنبال کردن");
            C2491i.m6798a(this.f19474k, UIThemeManager.getmInstance().getText_primary_color());
            this.f19474k.setEnabled(true);
        }
        if (c7322c.f21086h) {
            this.f19469f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_official_channel_conversation, 0, 0, 0);
            this.f19469f.setCompoundDrawablePadding((int) C2491i.m6804b(this.f19467d, 4.0f));
        }
        if (c7322c.f21086h && c7322c.f21087i) {
            this.f19469f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_official_channel_conversation, 0, 0, 0);
            this.f19469f.setCompoundDrawablePadding((int) C2491i.m6804b(this.f19467d, 4.0f));
        }
        C2491i.m6828c(this.f19469f, UIThemeManager.getmInstance().getText_primary_color());
        String str = c7322c.f21082d;
        C5284j a3 = C1212c.m2872a(this.f19467d);
        if (str == null) {
            str = "";
        }
        C1274i a4 = a3.m10950a(C4515k.m8231a(C2556b.m6998a(str))).m3034a(C1248f.m2945b());
        a4.f3986c = this.f19477n;
        a4.m3033a().m3031a(this.f19468e);
    }
}
