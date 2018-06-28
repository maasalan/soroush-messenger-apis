package mobi.mmdt.ott.view.conversation.p432e.p433a.p441h;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7654h;

public final class C7519h extends C7352b {
    private ImageView f22691d;
    private ImageView f22692e;
    private View f22693f;
    private ImageButton f22694g;
    private ProgressWheel f22695h;
    private C3284e f22696i;
    private C3283d f22697j;
    private int f22698k;
    private LinearLayout f22699l;
    private C1247e<Drawable> f22700m = new C61831(this);

    class C38442 implements OnClickListener {
        final /* synthetic */ C7519h f11222a;

        C38442(C7519h c7519h) {
            this.f11222a = c7519h;
        }

        public final void onClick(View view) {
            C7654h c7654h = (C7654h) this.f11222a.f16244a;
            this.f11222a.f22697j.mo2332e(c7654h.f23634P, c7654h.f23635Q);
        }
    }

    class C61831 implements C1247e<Drawable> {
        final /* synthetic */ C7519h f16708a;

        C61831(C7519h c7519h) {
            this.f16708a = c7519h;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7654h c7654h = (C7654h) this.f16708a.f16244a;
            this.f16708a.f22695h.setVisibility(8);
            this.f16708a.f22694g.setVisibility(8);
            if (c7654h.f23636R > 0 && c7654h.f23637S > 0) {
                Point b = C2491i.m6807b(this.f16708a.f22698k, c7654h.f23636R, c7654h.f23637S);
                LayoutParams layoutParams = (LayoutParams) this.f16708a.f22691d.getLayoutParams();
                layoutParams.height = b.y;
                layoutParams.width = b.x;
                LayoutParams layoutParams2 = (LayoutParams) this.f16708a.f22693f.getLayoutParams();
                layoutParams2.height = (int) this.f16708a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams2.width = b.x;
            }
            return false;
        }
    }

    public C7519h(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_location_output_list_item, c3286g, c3284e);
        this.f22696i = c3284e;
        this.f22697j = c3283d;
        this.f22698k = i;
        this.f22691d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22692e = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22693f = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22694g = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22695h = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22699l = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f22691d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22693f.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22691d.setOnClickListener(new C38442(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7654h c7654h = (C7654h) c6829g;
        this.f22691d.setImageBitmap(null);
        if (c7654h.f23636R > 0 && c7654h.f23637S > 0) {
            Point a = C2491i.m6763a(this.f22698k, c7654h.f23636R, c7654h.f23637S);
            C1274i a2 = C1212c.m2872a(this.c).m10950a(c7654h.f23638T).m3033a().m3034a(new C1248f().m2954b(a.x, a.y));
            a2.f3986c = this.f22700m;
            a2.m3031a(this.f22691d);
        }
        switch (c7654h.f21337w) {
            case ERROR:
                imageView = this.f22692e;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22692e;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22692e;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22692e;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        m19051a((C7358a) c7654h, this.f22699l, true);
    }
}
