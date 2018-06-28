package mobi.mmdt.ott.view.conversation.p432e.p433a.p443j;

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
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7680h;

public final class C7545h extends C7354b {
    private ImageView f22993d;
    private ImageView f22994e;
    private View f22995f;
    private ImageButton f22996g;
    private ProgressWheel f22997h;
    private C3283d f22998i;
    private int f22999j;
    private LinearLayout f23000k;
    private C1247e<Drawable> f23001l = new C61971(this);

    class C39472 implements OnClickListener {
        final /* synthetic */ C7545h f11407a;

        C39472(C7545h c7545h) {
            this.f11407a = c7545h;
        }

        public final void onClick(View view) {
            C7680h c7680h = (C7680h) this.f11407a.f16244a;
            this.f11407a.f22998i.mo2332e(c7680h.f23823P, c7680h.f23824Q);
        }
    }

    class C61971 implements C1247e<Drawable> {
        final /* synthetic */ C7545h f16738a;

        C61971(C7545h c7545h) {
            this.f16738a = c7545h;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7680h c7680h = (C7680h) this.f16738a.f16244a;
            this.f16738a.f22997h.setVisibility(8);
            this.f16738a.f22996g.setVisibility(8);
            if (c7680h.f23825R > 0 && c7680h.f23826S > 0) {
                Point b = C2491i.m6807b(this.f16738a.f22999j, c7680h.f23825R, c7680h.f23826S);
                LayoutParams layoutParams = (LayoutParams) this.f16738a.f22993d.getLayoutParams();
                layoutParams.height = b.y;
                layoutParams.width = b.x;
                LayoutParams layoutParams2 = (LayoutParams) this.f16738a.f22995f.getLayoutParams();
                layoutParams2.height = (int) this.f16738a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams2.width = b.x;
            }
            return false;
        }
    }

    public C7545h(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_location_output_list_item, c3286g, c3284e);
        this.f22998i = c3283d;
        this.f22999j = i;
        this.f22993d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22994e = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22995f = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22996g = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22997h = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f23000k = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f22993d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22995f.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22993d.setOnClickListener(new C39472(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7680h c7680h = (C7680h) c6829g;
        this.f22993d.setImageBitmap(null);
        if (c7680h.f23825R > 0 && c7680h.f23826S > 0) {
            Point a = C2491i.m6763a(this.f22999j, c7680h.f23825R, c7680h.f23826S);
            C1274i a2 = C1212c.m2872a(this.c).m10950a(c7680h.f23827T).m3033a().m3034a(new C1248f().m2954b(a.x, a.y));
            a2.f3986c = this.f23001l;
            a2.m3031a(this.f22993d);
        }
        switch (c7680h.f21337w) {
            case ERROR:
                imageView = this.f22994e;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22994e;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22994e;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22994e;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19051a((C7358a) c7680h, this.f23000k, true);
    }
}
