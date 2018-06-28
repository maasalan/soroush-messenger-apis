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
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.af.C2613o;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7626f;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7491f extends C7350b {
    private ImageView f22362e;
    private TextView f22363f;
    private TextView f22364g;
    private ImageView f22365h;
    private ImageButton f22366i;
    private ProgressWheel f22367j;
    private C3284e f22368k;
    private C3283d f22369l;
    private int f22370m;
    private RelativeLayout f22371n;
    private int f22372o;
    private float f22373p;
    private boolean f22374q;
    private C1247e<Drawable> f22375r;

    class C37342 implements OnClickListener {
        final /* synthetic */ C7491f f11026a;

        C37342(C7491f c7491f) {
            this.f11026a = c7491f;
        }

        public final void onClick(View view) {
            C7626f c7626f = (C7626f) this.f11026a.f16244a;
            switch (c7626f.aa) {
                case DELETED:
                case NOT_STARTED:
                    if (c7626f.ad == null || c7626f.ad.isEmpty()) {
                        this.f11026a.f22368k.mo2307a(c7626f.f23095W, false);
                        return;
                    } else {
                        this.f11026a.f22368k.mo2307a(c7626f.f23095W, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11026a.f22368k.mo2305a(c7626f.f23095W);
                    return;
                case CANCEL:
                    if (c7626f.ad == null || c7626f.ad.isEmpty()) {
                        this.f11026a.f22368k.mo2307a(c7626f.f23095W, false);
                        return;
                    } else {
                        this.f11026a.f22368k.mo2307a(c7626f.f23095W, true);
                        return;
                    }
                case ERROR:
                    if (c7626f.ad == null || c7626f.ad.isEmpty()) {
                        this.f11026a.f22368k.mo2307a(c7626f.f23095W, false);
                        return;
                    } else {
                        this.f11026a.f22368k.mo2307a(c7626f.f23095W, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C37353 implements OnClickListener {
        final /* synthetic */ C7491f f11027a;

        C37353(C7491f c7491f) {
            this.f11027a = c7491f;
        }

        public final void onClick(View view) {
            C7626f c7626f = (C7626f) this.f11027a.f16244a;
            if (c7626f.ad == null || c7626f.ad.isEmpty()) {
                int[] iArr = C37364.f11028a;
                c7626f.aa.ordinal();
                this.f11027a.f22369l.mo2325c(c7626f.f23460S, c7626f.f21334t);
            } else if (c7626f.aa == C2987i.FINISHED) {
                this.f11027a.f22369l.mo2325c(c7626f.f23460S, c7626f.f21334t);
            }
        }
    }

    class C61671 implements C1247e<Drawable> {
        final /* synthetic */ C7491f f16676a;

        C61671(C7491f c7491f) {
            this.f16676a = c7491f;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7626f c7626f = (C7626f) this.f16676a.f16244a;
            C7491f.m20196a(this.f16676a, c7626f.f23458Q, c7626f.f23459R);
            return false;
        }
    }

    public C7491f(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, float f, int i3, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        C7350b c7350b = this;
        int i4 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_captioned_channel_output_list_item : R.layout.chat_image_captioned_channel_output_list_item_old, c3280a, c3286g, c3284e);
        c7350b.f22374q = C2535a.m6888a().au() ^ 1;
        c7350b.f22375r = new C61671(c7350b);
        c7350b.f22368k = c3284e;
        c7350b.f22369l = c3283d;
        c7350b.f22370m = i4;
        c7350b.f22373p = f;
        c7350b.f22372o = i3;
        c7350b.f22362e = (ImageView) c7350b.itemView.findViewById(R.id.content_imageView);
        c7350b.f22363f = (TextView) c7350b.itemView.findViewById(R.id.caption_textView);
        c7350b.f22365h = (ImageView) c7350b.itemView.findViewById(R.id.status_imageView);
        c7350b.f22366i = (ImageButton) c7350b.itemView.findViewById(R.id.action_imageView);
        c7350b.f22364g = (TextView) c7350b.itemView.findViewById(R.id.progress_text_action_view);
        c7350b.f22367j = (ProgressWheel) c7350b.itemView.findViewById(R.id.progress_wheel);
        c7350b.f22371n = (RelativeLayout) c7350b.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) c7350b.f22362e.getLayoutParams();
        layoutParams.height = i2;
        if (c7350b.f22374q) {
            layoutParams.width = i4;
        }
        c7350b.f22366i.setOnClickListener(new C37342(c7350b));
        c7350b.f22362e.setOnClickListener(new C37353(c7350b));
    }

    static /* synthetic */ void m20196a(C7491f c7491f, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7491f.f22362e.getLayoutParams();
            if (c7491f.f22374q) {
                Point b = C2491i.m6807b(c7491f.f22370m, i, i2);
                int i3 = i < c7491f.f22370m ? c7491f.f22370m : b.x;
                i = b.y;
                layoutParams.width = i3;
            } else {
                float f = (float) i;
                float f2 = c7491f.f22373p / f;
                if (f <= c7491f.f22373p) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                i = i2 > c7491f.f22372o ? c7491f.f22372o : i2;
            }
            layoutParams.height = i;
        }
    }

    private void m20197a(C7626f c7626f, C2971k c2971k) {
        boolean z = ((c7626f.ad == null || c7626f.ad.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22366i, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7626f c7626f = (C7626f) c6829g;
        Object a2 = C2613o.m7045a(c7626f.aa, c7626f.ab, c7626f.f23460S, c7626f.f23461T, c7626f.f21300A);
        C1247e c1247e = null;
        this.f22362e.setImageBitmap(null);
        if (c7626f.f23458Q <= 0 || c7626f.f23459R <= 0) {
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f22370m, this.f22370m));
            a.f3986c = this.f22375r;
        } else {
            Point a3 = this.f22374q ? C2491i.m6763a(this.f22370m, c7626f.f23458Q, c7626f.f23459R) : null;
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f22374q ? a3.x : this.f22370m, this.f22374q ? a3.y : this.f22370m));
            if (!this.f22374q) {
                c1247e = this.f22375r;
            }
            a.f3986c = c1247e;
        }
        a.m3031a(this.f22362e);
        if (c7626f.f23462U == null || c7626f.f23462U.isEmpty()) {
            this.f22363f.setVisibility(8);
        } else {
            this.f22363f.setText(c7626f.f23462U);
            this.f22363f.setVisibility(0);
            this.f22363f.setTextSize((float) c7626f.ac);
            C4520n.m8234a(this.f22363f);
        }
        switch (c7626f.f21337w) {
            case ERROR:
                imageView = this.f22365h;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22365h;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22365h;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22365h;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7626f.aa) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22367j.setVisibility(8);
                this.f22366i.setVisibility(0);
                this.f22364g.setVisibility(8);
                m20197a(c7626f, c7626f.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22367j.setVisibility(0);
                this.f22366i.setVisibility(0);
                this.f22366i.setImageResource(R.drawable.ic_file_stop_download);
                this.f22364g.setVisibility(0);
                this.f22364g.setText(c7626f.f23457P);
                if (c7626f.f23463V > 0) {
                    progressWheel = this.f22367j;
                    f = ((float) c7626f.f23463V) * 0.01f;
                } else {
                    progressWheel = this.f22367j;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22367j.setVisibility(8);
                this.f22366i.setVisibility(8);
                this.f22364g.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7626f, this.f22371n, true);
    }
}
