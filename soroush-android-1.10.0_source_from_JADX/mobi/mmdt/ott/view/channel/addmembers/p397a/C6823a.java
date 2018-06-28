package mobi.mmdt.ott.view.channel.addmembers.p397a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C5284j;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.channel.addmembers.C3091a;
import mobi.mmdt.ott.view.channel.addmembers.p563b.C7173a;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4515k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6823a extends C6073e {
    private final String f19479b = C2535a.m6888a().m6919b();
    private final FrameLayout f19480c = ((FrameLayout) this.itemView.findViewById(R.id.root_channel_item_layout));
    private Activity f19481d;
    private RoundAvatarImageView f19482e = ((RoundAvatarImageView) this.itemView.findViewById(R.id.imageView1));
    private TextView f19483f = ((TextView) this.itemView.findViewById(R.id.textView1));
    private TextView f19484g = ((TextView) this.itemView.findViewById(R.id.textView2));
    private TextView f19485h = ((TextView) this.itemView.findViewById(R.id.role_textView));
    private View f19486i = this.itemView.findViewById(R.id.divider_line);
    private ProgressWheel f19487j = ((ProgressWheel) this.itemView.findViewById(R.id.load_more_progressWheel));
    private C3091a f19488k;

    class C30881 implements OnClickListener {
        final /* synthetic */ C6823a f9622a;

        C30881(C6823a c6823a) {
            this.f9622a = c6823a;
        }

        public final void onClick(View view) {
            this.f9622a.f19488k.mo3645a((C7173a) this.f9622a.f16244a);
        }
    }

    class C30892 implements OnLongClickListener {
        final /* synthetic */ C6823a f9623a;

        C30892(C6823a c6823a) {
            this.f9623a = c6823a;
        }

        public final boolean onLongClick(View view) {
            this.f9623a.f19488k.mo3646b((C7173a) this.f9623a.f16244a);
            return false;
        }
    }

    public C6823a(Activity activity, C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup, C3091a c3091a) {
        super(layoutInflater, viewGroup, R.layout.channel_member_list_item, c3126i);
        this.f19481d = activity;
        this.f19488k = c3091a;
        this.f19480c.setOnClickListener(new C30881(this));
        this.f19480c.setOnLongClickListener(new C30892(this));
        C2491i.m6796a(this.f19486i, UIThemeManager.getmInstance().getLine_divider_color());
        C2491i.m6802a(this.f19483f, UIThemeManager.getmInstance().getText_primary_color());
        C2491i.m6802a(this.f19484g, UIThemeManager.getmInstance().getText_secondary_color());
        C2491i.m6790a(this.f19485h.getBackground(), UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6802a(this.f19485h, UIThemeManager.getmInstance().getAccent_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        int i;
        C5284j a;
        Object a2;
        C7173a c7173a = (C7173a) c6829g;
        Object a3 = C4508f.m8220a(c7173a.f20627d);
        this.f19483f.setText(a3);
        TextView textView = this.f19484g;
        String a4 = (c7173a.f20628e == null || c7173a.f20628e.isEmpty()) ? C4522p.m8236a(R.string.im_using_soroush) : c7173a.f20628e;
        textView.setText(C2491i.m6814b(a4));
        switch (c7173a.f20631h) {
            case OWNER:
                this.f19485h.setVisibility(0);
                textView = this.f19485h;
                i = R.string.channel_owner;
                break;
            case ADMIN:
                this.f19485h.setVisibility(0);
                textView = this.f19485h;
                i = R.string.channel_admin;
                break;
            case MEMBER:
            case VISITOR:
            case NONE:
                this.f19485h.setVisibility(8);
                break;
            default:
                break;
        }
        textView.setText(C4522p.m8236a(i));
        this.f19482e.setImageBitmap(null);
        this.f19482e.setName(a3);
        this.f19482e.setBackgroundColor(c7173a.f20630g);
        if (c7173a.f20629f != null) {
            a = C1212c.m2872a(this.f19481d);
            a2 = C4515k.m8231a(C2556b.m6998a(c7173a.f20629f));
        } else if (c7173a.f20624a == null || c7173a.f20624a.isEmpty()) {
            C1212c.m2872a(this.f19481d).m10953a(this.f19482e);
            if (c7173a.f20632i) {
                this.f19487j.setVisibility(8);
            } else {
                this.f19487j.setVisibility(0);
            }
            if (c7173a.f19504k != 0) {
                this.f19486i.setVisibility(4);
            } else {
                this.f19486i.setVisibility(0);
            }
        } else {
            a = C1212c.m2872a(this.f19481d);
            a2 = C2556b.m6998a(c7173a.f20624a);
        }
        a.m10950a(a2).m3034a(C1248f.m2945b().m2955b(C1144h.f3689a)).m3031a(this.f19482e);
        if (c7173a.f20632i) {
            this.f19487j.setVisibility(8);
        } else {
            this.f19487j.setVisibility(0);
        }
        if (c7173a.f19504k != 0) {
            this.f19486i.setVisibility(0);
        } else {
            this.f19486i.setVisibility(4);
        }
    }
}
