package mobi.mmdt.ott.view.conversation.p432e.p433a.p435b;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7716h;

public final class C7442h extends C7346b {
    private ImageView f21769e;
    private ImageView f21770f;
    private View f21771g;
    private ImageButton f21772h;
    private ProgressWheel f21773i;
    private C3284e f21774j;
    private C3283d f21775k;
    private int f21776l;
    private LinearLayout f21777m;
    private C1247e<Drawable> f21778n = new C61421(this);

    class C35392 implements OnClickListener {
        final /* synthetic */ C7442h f10695a;

        C35392(C7442h c7442h) {
            this.f10695a = c7442h;
        }

        public final void onClick(View view) {
            C7716h c7716h = (C7716h) this.f10695a.f16244a;
            this.f10695a.f21775k.mo2332e(c7716h.f24280P, c7716h.f24281Q);
        }
    }

    class C61421 implements C1247e<Drawable> {
        final /* synthetic */ C7442h f16627a;

        C61421(C7442h c7442h) {
            this.f16627a = c7442h;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7716h c7716h = (C7716h) this.f16627a.f16244a;
            this.f16627a.f21773i.setVisibility(8);
            this.f16627a.f21772h.setVisibility(8);
            if (c7716h.f24282R > 0 && c7716h.f24283S > 0) {
                Point b = C2491i.m6807b(this.f16627a.f21776l, c7716h.f24282R, c7716h.f24283S);
                LayoutParams layoutParams = (LayoutParams) this.f16627a.f21769e.getLayoutParams();
                layoutParams.height = b.y;
                layoutParams.width = b.x;
                LayoutParams layoutParams2 = (LayoutParams) this.f16627a.f21771g.getLayoutParams();
                layoutParams2.height = (int) this.f16627a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams2.width = b.x;
            }
            return false;
        }
    }

    public C7442h(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        int i3 = i;
        super(activity, layoutInflater, viewGroup, R.layout.chat_location_channel_direct_output_list_item, c3280a, c3286g, c3284e);
        this.f21774j = c3284e;
        this.f21775k = c3283d;
        this.f21776l = i3;
        this.f21769e = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f21770f = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f21771g = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f21772h = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f21773i = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f21777m = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f21769e.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f21771g.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f21769e.setOnClickListener(new C35392(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7716h c7716h = (C7716h) c6829g;
        this.f21769e.setImageBitmap(null);
        if (c7716h.f24282R > 0 && c7716h.f24283S > 0) {
            Point a = C2491i.m6763a(this.f21776l, c7716h.f24282R, c7716h.f24283S);
            C1274i a2 = C1212c.m2872a(this.c).m10950a(c7716h.f24284T).m3033a().m3034a(new C1248f().m2954b(a.x, a.y));
            a2.f3986c = this.f21778n;
            a2.m3031a(this.f21769e);
        }
        switch (c7716h.f21337w) {
            case ERROR:
                imageView = this.f21770f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21770f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21770f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21770f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19051a((C7358a) c7716h, this.f21777m, true);
    }
}
