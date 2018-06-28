package mobi.mmdt.ott.view.conversation.p432e.p433a.p439f;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7628h;

public final class C7493h extends C7350b {
    private ImageView f22390e;
    private ImageView f22391f;
    private View f22392g;
    private ImageButton f22393h;
    private ProgressWheel f22394i;
    private C3284e f22395j;
    private C3283d f22396k;
    private int f22397l;
    private LinearLayout f22398m;
    private C1247e<Drawable> f22399n = new C61691(this);

    class C37402 implements OnClickListener {
        final /* synthetic */ C7493h f11034a;

        C37402(C7493h c7493h) {
            this.f11034a = c7493h;
        }

        public final void onClick(View view) {
            C7628h c7628h = (C7628h) this.f11034a.f16244a;
            this.f11034a.f22396k.mo2332e(c7628h.f23471P, c7628h.f23472Q);
        }
    }

    class C61691 implements C1247e<Drawable> {
        final /* synthetic */ C7493h f16678a;

        C61691(C7493h c7493h) {
            this.f16678a = c7493h;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7628h c7628h = (C7628h) this.f16678a.f16244a;
            this.f16678a.f22394i.setVisibility(8);
            this.f16678a.f22393h.setVisibility(8);
            if (c7628h.f23473R > 0 && c7628h.f23474S > 0) {
                Point b = C2491i.m6807b(this.f16678a.f22397l, c7628h.f23473R, c7628h.f23474S);
                LayoutParams layoutParams = (LayoutParams) this.f16678a.f22390e.getLayoutParams();
                layoutParams.height = b.y;
                layoutParams.width = b.x;
                LayoutParams layoutParams2 = (LayoutParams) this.f16678a.f22392g.getLayoutParams();
                layoutParams2.height = (int) this.f16678a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams2.width = b.x;
            }
            return false;
        }
    }

    public C7493h(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        int i3 = i;
        super(activity, layoutInflater, viewGroup, R.layout.chat_location_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22395j = c3284e;
        this.f22396k = c3283d;
        this.f22397l = i3;
        this.f22390e = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22391f = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22392g = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22393h = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22394i = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22398m = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f22390e.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f22392g.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f22390e.setOnClickListener(new C37402(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7628h c7628h = (C7628h) c6829g;
        this.f22390e.setImageBitmap(null);
        if (c7628h.f23473R > 0 && c7628h.f23474S > 0) {
            Point a = C2491i.m6763a(this.f22397l, c7628h.f23473R, c7628h.f23474S);
            C1274i a2 = C1212c.m2872a(this.c).m10950a(c7628h.f23475T).m3033a().m3034a(new C1248f().m2954b(a.x, a.y));
            a2.f3986c = this.f22399n;
            a2.m3031a(this.f22390e);
        }
        switch (c7628h.f21337w) {
            case ERROR:
                imageView = this.f22391f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22391f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22391f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22391f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19051a((C7358a) c7628h, this.f22398m, true);
    }
}
