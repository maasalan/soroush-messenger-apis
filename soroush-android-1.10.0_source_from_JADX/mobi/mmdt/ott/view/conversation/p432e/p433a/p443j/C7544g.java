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
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.af.C2613o;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7679g;

public final class C7544g extends C7354b {
    private ImageView f22982d;
    private ImageView f22983e;
    private View f22984f;
    private TextView f22985g;
    private ImageButton f22986h;
    private ProgressWheel f22987i;
    private C3284e f22988j;
    private C3283d f22989k;
    private int f22990l;
    private LinearLayout f22991m;
    private C1247e<Drawable> f22992n = new C61961(this);

    class C39442 implements OnClickListener {
        final /* synthetic */ C7544g f11403a;

        C39442(C7544g c7544g) {
            this.f11403a = c7544g;
        }

        public final void onClick(View view) {
            C7679g c7679g = (C7679g) this.f11403a.f16244a;
            switch (c7679g.f23820V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7679g.f23822Z == null || c7679g.f23822Z.isEmpty()) {
                        this.f11403a.f22988j.mo2307a(c7679g.mo3604b(), false);
                        return;
                    } else {
                        this.f11403a.f22988j.mo2307a(c7679g.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11403a.f22988j.mo2305a(c7679g.mo3604b());
                    return;
                case CANCEL:
                    if (c7679g.f23822Z == null || c7679g.f23822Z.isEmpty()) {
                        this.f11403a.f22988j.mo2307a(c7679g.mo3604b(), false);
                        return;
                    } else {
                        this.f11403a.f22988j.mo2307a(c7679g.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7679g.f23822Z == null || c7679g.f23822Z.isEmpty()) {
                        this.f11403a.f22988j.mo2307a(c7679g.mo3604b(), false);
                        return;
                    } else {
                        this.f11403a.f22988j.mo2307a(c7679g.mo3604b(), true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C39453 implements OnClickListener {
        final /* synthetic */ C7544g f11404a;

        C39453(C7544g c7544g) {
            this.f11404a = c7544g;
        }

        public final void onClick(View view) {
            C7679g c7679g = (C7679g) this.f11404a.f16244a;
            if (c7679g.f23822Z == null || c7679g.f23822Z.isEmpty()) {
                int[] iArr = C39464.f11405a;
                c7679g.f23820V.ordinal();
                this.f11404a.f22989k.mo2325c(c7679g.f23817S, c7679g.f21334t);
            } else if (c7679g.f23820V == C2987i.FINISHED) {
                this.f11404a.f22989k.mo2325c(c7679g.f23817S, c7679g.f21334t);
            }
        }
    }

    class C61961 implements C1247e<Drawable> {
        final /* synthetic */ C7544g f16737a;

        C61961(C7544g c7544g) {
            this.f16737a = c7544g;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7679g c7679g = (C7679g) this.f16737a.f16244a;
            int i = c7679g.f23815Q;
            if (i > 0 && c7679g.f23816R > 0) {
                Point b = C2491i.m6807b(this.f16737a.f22990l, i, c7679g.f23816R);
                LayoutParams layoutParams = (LayoutParams) this.f16737a.f22982d.getLayoutParams();
                i = i < this.f16737a.f22990l ? this.f16737a.f22990l : b.x;
                layoutParams.width = i;
                layoutParams.height = b.y;
                int dimension = (int) this.f16737a.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
                layoutParams = (LayoutParams) this.f16737a.f22984f.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = dimension;
            }
            return false;
        }
    }

    public C7544g(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_image_output_list_item, c3286g, c3284e);
        this.f22988j = c3284e;
        this.f22989k = c3283d;
        this.f22990l = i;
        this.f22982d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22983e = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22984f = this.itemView.findViewById(R.id.bottom_gradient_view);
        this.f22986h = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22987i = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22991m = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        this.f22985g = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        LayoutParams layoutParams = (LayoutParams) this.f22982d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22984f.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22986h.setOnClickListener(new C39442(this));
        this.f22982d.setOnClickListener(new C39453(this));
    }

    private void m20579a(C7679g c7679g, C2971k c2971k) {
        boolean z = ((c7679g.f23822Z == null || c7679g.f23822Z.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22986h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7679g c7679g = (C7679g) c6829g;
        Object a2 = C2613o.m7045a(c7679g.f23820V, c7679g.f23821Y, c7679g.f23817S, c7679g.f23818T, c7679g.f21300A);
        this.f22982d.setImageBitmap(null);
        if (c7679g.f23815Q <= 0 || c7679g.f23816R <= 0) {
            a = C1212c.m2872a(this.c).m10950a(a2).m3034a(new C1248f().m2959e().m2954b(this.f22990l, this.f22990l)).m3033a();
        } else {
            Point a3 = C2491i.m6763a(this.f22990l, c7679g.f23815Q, c7679g.f23816R);
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(a3.x, a3.y));
        }
        a.f3986c = this.f22992n;
        a.m3031a(this.f22982d);
        switch (c7679g.f21337w) {
            case ERROR:
                imageView = this.f22983e;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22983e;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22983e;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22983e;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7679g.f23820V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22987i.setVisibility(8);
                this.f22986h.setVisibility(0);
                this.f22985g.setVisibility(8);
                m20579a(c7679g, c7679g.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22987i.setVisibility(0);
                this.f22986h.setVisibility(0);
                this.f22986h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22985g.setVisibility(0);
                this.f22985g.setText(c7679g.f23814P);
                if (c7679g.f23819U > 0) {
                    progressWheel = this.f22987i;
                    f = ((float) c7679g.f23819U) * 0.01f;
                } else {
                    progressWheel = this.f22987i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22987i.setVisibility(8);
                this.f22986h.setVisibility(8);
                this.f22985g.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7679g, this.f22991m, true);
    }
}
