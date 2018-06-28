package mobi.mmdt.ott.view.conversation.p432e.p433a.p437d;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7602h;

public final class C7467h extends C7348b {
    private ImageView f22076e;
    private ImageView f22077f;
    private View f22078g;
    private ImageButton f22079h;
    private ProgressWheel f22080i;
    private C3283d f22081j;
    private int f22082k;
    private LinearLayout f22083l;
    private C1247e<Drawable> f22084m = new C61551(this);

    class C36342 implements OnClickListener {
        final /* synthetic */ C7467h f10843a;

        C36342(C7467h c7467h) {
            this.f10843a = c7467h;
        }

        public final void onClick(View view) {
            C7602h c7602h = (C7602h) this.f10843a.f16244a;
            this.f10843a.f22081j.mo2332e(c7602h.f23303P, c7602h.f23304Q);
        }
    }

    class C61551 implements C1247e<Drawable> {
        final /* synthetic */ C7467h f16648a;

        C61551(C7467h c7467h) {
            this.f16648a = c7467h;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7602h c7602h = (C7602h) this.f16648a.f16244a;
            this.f16648a.f22080i.setVisibility(8);
            this.f16648a.f22079h.setVisibility(8);
            if (c7602h.f23305R > 0 && c7602h.f23306S > 0) {
                Point b = C2491i.m6807b(this.f16648a.f22082k, c7602h.f23305R, c7602h.f23306S);
                LayoutParams layoutParams = (LayoutParams) this.f16648a.f22076e.getLayoutParams();
                layoutParams.height = b.y;
                layoutParams.width = b.x;
                LayoutParams layoutParams2 = (LayoutParams) this.f16648a.f22078g.getLayoutParams();
                layoutParams2.height = (int) this.f16648a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams2.width = b.x;
            }
            return false;
        }
    }

    public C7467h(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        int i3 = i;
        super(activity, layoutInflater, viewGroup, R.layout.chat_location_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22081j = c3283d;
        this.f22082k = i3;
        this.f22076e = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22077f = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22078g = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22079h = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22080i = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22083l = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f22076e.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f22078g.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f22076e.setOnClickListener(new C36342(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7602h c7602h = (C7602h) c6829g;
        this.f22076e.setImageBitmap(null);
        if (c7602h.f23305R > 0 && c7602h.f23306S > 0) {
            Point a = C2491i.m6763a(this.f22082k, c7602h.f23305R, c7602h.f23306S);
            C1274i a2 = C1212c.m2872a(this.c).m10950a(c7602h.f23307T).m3033a().m3034a(new C1248f().m2954b(a.x, a.y));
            a2.f3986c = this.f22084m;
            a2.m3031a(this.f22076e);
        }
        switch (c7602h.f21337w) {
            case ERROR:
                imageView = this.f22077f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22077f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22077f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22077f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19051a((C7358a) c7602h, this.f22083l, true);
    }
}
