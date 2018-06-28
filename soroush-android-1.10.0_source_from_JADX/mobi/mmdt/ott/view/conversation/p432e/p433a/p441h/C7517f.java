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
import android.widget.RelativeLayout;
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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7652f;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7517f extends C7352b {
    private ImageView f22669d;
    private TextView f22670e;
    private TextView f22671f;
    private ImageView f22672g;
    private ImageButton f22673h;
    private ProgressWheel f22674i;
    private C3284e f22675j;
    private C3283d f22676k;
    private int f22677l;
    private RelativeLayout f22678m;
    private C1247e<Drawable> f22679n = new C61811(this);

    class C38382 implements OnClickListener {
        final /* synthetic */ C7517f f11214a;

        C38382(C7517f c7517f) {
            this.f11214a = c7517f;
        }

        public final void onClick(View view) {
            C7652f c7652f = (C7652f) this.f11214a.f16244a;
            switch (c7652f.f23623Y) {
                case DELETED:
                case NOT_STARTED:
                    if (c7652f.ab == null || c7652f.ab.isEmpty()) {
                        this.f11214a.f22675j.mo2307a(c7652f.mo3604b(), false);
                        return;
                    } else {
                        this.f11214a.f22675j.mo2307a(c7652f.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11214a.f22675j.mo2305a(c7652f.mo3604b());
                    return;
                case CANCEL:
                    if (c7652f.ab == null || c7652f.ab.isEmpty()) {
                        this.f11214a.f22675j.mo2307a(c7652f.mo3604b(), false);
                        return;
                    } else {
                        this.f11214a.f22675j.mo2307a(c7652f.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7652f.ab == null || c7652f.ab.isEmpty()) {
                        this.f11214a.f22675j.mo2307a(c7652f.mo3604b(), false);
                        return;
                    } else {
                        this.f11214a.f22675j.mo2307a(c7652f.mo3604b(), true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C38393 implements OnClickListener {
        final /* synthetic */ C7517f f11215a;

        C38393(C7517f c7517f) {
            this.f11215a = c7517f;
        }

        public final void onClick(View view) {
            C7652f c7652f = (C7652f) this.f11215a.f16244a;
            if (c7652f.ab == null || c7652f.ab.isEmpty()) {
                int[] iArr = C38404.f11216a;
                c7652f.f23623Y.ordinal();
                this.f11215a.f22676k.mo2325c(c7652f.f23619S, c7652f.f21334t);
            } else if (c7652f.f23623Y == C2987i.FINISHED) {
                this.f11215a.f22676k.mo2325c(c7652f.f23619S, c7652f.f21334t);
            }
        }
    }

    class C61811 implements C1247e<Drawable> {
        final /* synthetic */ C7517f f16706a;

        C61811(C7517f c7517f) {
            this.f16706a = c7517f;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7652f c7652f = (C7652f) this.f16706a.f16244a;
            int i = c7652f.f23617Q;
            if (i > 0 && c7652f.f23618R > 0) {
                Point b = C2491i.m6807b(this.f16706a.f22677l, i, c7652f.f23618R);
                LayoutParams layoutParams = (LayoutParams) this.f16706a.f22669d.getLayoutParams();
                layoutParams.width = i < this.f16706a.f22677l ? this.f16706a.f22677l : b.x;
                layoutParams.height = b.y;
            }
            return false;
        }
    }

    public C7517f(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_image_captioned_output_list_item, c3286g, c3284e);
        this.f22675j = c3284e;
        this.f22676k = c3283d;
        this.f22677l = i;
        this.f22669d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22670e = (TextView) this.itemView.findViewById(R.id.caption_textView);
        this.f22672g = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22673h = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22671f = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f22674i = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22678m = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f22669d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        this.f22673h.setOnClickListener(new C38382(this));
        this.f22669d.setOnClickListener(new C38393(this));
    }

    private void m20379a(C7652f c7652f, C2971k c2971k) {
        boolean z = ((c7652f.ab == null || c7652f.ab.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22673h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7652f c7652f = (C7652f) c6829g;
        Object a2 = C2613o.m7045a(c7652f.f23623Y, c7652f.f23624Z, c7652f.f23619S, c7652f.f23620T, c7652f.f21300A);
        this.f22669d.setImageBitmap(null);
        if (c7652f.f23617Q <= 0 || c7652f.f23618R <= 0) {
            a = C1212c.m2872a(this.c).m10950a(a2).m3034a(new C1248f().m2959e().m2954b(this.f22677l, this.f22677l)).m3033a();
        } else {
            Point a3 = C2491i.m6763a(this.f22677l, c7652f.f23617Q, c7652f.f23618R);
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(a3.x, a3.y));
        }
        a.f3986c = this.f22679n;
        a.m3031a(this.f22669d);
        if (c7652f.f23621U == null || c7652f.f23621U.isEmpty()) {
            this.f22670e.setVisibility(8);
        } else {
            this.f22670e.setText(c7652f.f23621U);
            this.f22670e.setVisibility(0);
            this.f22670e.setTextSize((float) (((double) c7652f.aa) * 0.85d));
            C4520n.m8234a(this.f22670e);
        }
        switch (c7652f.f21337w) {
            case ERROR:
                imageView = this.f22672g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22672g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22672g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22672g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7652f.f23623Y) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22674i.setVisibility(8);
                this.f22673h.setVisibility(0);
                this.f22671f.setVisibility(8);
                m20379a(c7652f, c7652f.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22674i.setVisibility(0);
                this.f22673h.setVisibility(0);
                this.f22673h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22671f.setVisibility(0);
                this.f22671f.setText(c7652f.f23616P);
                if (c7652f.f23622V > 0) {
                    progressWheel = this.f22674i;
                    f = ((float) c7652f.f23622V) * 0.01f;
                } else {
                    progressWheel = this.f22674i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22674i.setVisibility(8);
                this.f22673h.setVisibility(8);
                this.f22671f.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7652f, this.f22678m, true);
    }
}
