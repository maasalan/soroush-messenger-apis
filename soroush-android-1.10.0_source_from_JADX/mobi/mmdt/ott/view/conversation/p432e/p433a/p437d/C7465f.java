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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7600f;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7465f extends C7348b {
    private ImageView f22048e;
    private TextView f22049f;
    private TextView f22050g;
    private ImageView f22051h;
    private ImageButton f22052i;
    private ProgressWheel f22053j;
    private C3284e f22054k;
    private C3283d f22055l;
    private int f22056m;
    private RelativeLayout f22057n;
    private int f22058o;
    private float f22059p;
    private boolean f22060q;
    private C1247e<Drawable> f22061r;

    class C36282 implements OnClickListener {
        final /* synthetic */ C7465f f10835a;

        C36282(C7465f c7465f) {
            this.f10835a = c7465f;
        }

        public final void onClick(View view) {
            C7600f c7600f = (C7600f) this.f10835a.f16244a;
            switch (c7600f.f23288W) {
                case DELETED:
                case NOT_STARTED:
                    if (c7600f.f23291Z == null || c7600f.f23291Z.isEmpty()) {
                        this.f10835a.f22054k.mo2307a(c7600f.ac, false);
                        return;
                    } else {
                        this.f10835a.f22054k.mo2307a(c7600f.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10835a.f22054k.mo2305a(c7600f.ac);
                    return;
                case CANCEL:
                    if (c7600f.f23291Z == null || c7600f.f23291Z.isEmpty()) {
                        this.f10835a.f22054k.mo2307a(c7600f.ac, false);
                        return;
                    } else {
                        this.f10835a.f22054k.mo2307a(c7600f.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7600f.f23291Z == null || c7600f.f23291Z.isEmpty()) {
                        this.f10835a.f22054k.mo2307a(c7600f.ac, false);
                        return;
                    } else {
                        this.f10835a.f22054k.mo2307a(c7600f.ac, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C36293 implements OnClickListener {
        final /* synthetic */ C7465f f10836a;

        C36293(C7465f c7465f) {
            this.f10836a = c7465f;
        }

        public final void onClick(View view) {
            C7600f c7600f = (C7600f) this.f10836a.f16244a;
            if (c7600f.f23291Z == null || c7600f.f23291Z.isEmpty()) {
                int[] iArr = C36304.f10837a;
                c7600f.f23288W.ordinal();
                this.f10836a.f22055l.mo2325c(c7600f.f23284S, c7600f.f21334t);
            } else if (c7600f.f23288W == C2987i.FINISHED) {
                this.f10836a.f22055l.mo2325c(c7600f.f23284S, c7600f.f21334t);
            }
        }
    }

    class C61531 implements C1247e<Drawable> {
        final /* synthetic */ C7465f f16646a;

        C61531(C7465f c7465f) {
            this.f16646a = c7465f;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7600f c7600f = (C7600f) this.f16646a.f16244a;
            C7465f.m20019a(this.f16646a, c7600f.f23282Q, c7600f.f23283R);
            return false;
        }
    }

    public C7465f(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, float f, int i3, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        C7348b c7348b = this;
        int i4 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_captioned_channel_output_list_item : R.layout.chat_image_captioned_channel_output_list_item_old, c3280a, c3286g, c3284e);
        c7348b.f22060q = C2535a.m6888a().au() ^ 1;
        c7348b.f22061r = new C61531(c7348b);
        c7348b.f22054k = c3284e;
        c7348b.f22055l = c3283d;
        c7348b.f22056m = i4;
        c7348b.f22059p = f;
        c7348b.f22058o = i3;
        c7348b.f22048e = (ImageView) c7348b.itemView.findViewById(R.id.content_imageView);
        c7348b.f22049f = (TextView) c7348b.itemView.findViewById(R.id.caption_textView);
        c7348b.f22051h = (ImageView) c7348b.itemView.findViewById(R.id.status_imageView);
        c7348b.f22052i = (ImageButton) c7348b.itemView.findViewById(R.id.action_imageView);
        c7348b.f22050g = (TextView) c7348b.itemView.findViewById(R.id.progress_text_action_view);
        c7348b.f22053j = (ProgressWheel) c7348b.itemView.findViewById(R.id.progress_wheel);
        c7348b.f22057n = (RelativeLayout) c7348b.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) c7348b.f22048e.getLayoutParams();
        layoutParams.height = i2;
        if (c7348b.f22060q) {
            layoutParams.width = i4;
        }
        c7348b.f22052i.setOnClickListener(new C36282(c7348b));
        c7348b.f22048e.setOnClickListener(new C36293(c7348b));
    }

    static /* synthetic */ void m20019a(C7465f c7465f, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7465f.f22048e.getLayoutParams();
            if (c7465f.f22060q) {
                Point b = C2491i.m6807b(c7465f.f22056m, i, i2);
                int i3 = i < c7465f.f22056m ? c7465f.f22056m : b.x;
                i = b.y;
                layoutParams.width = i3;
            } else {
                float f = (float) i;
                float f2 = c7465f.f22059p / f;
                if (f <= c7465f.f22059p) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                i = i2 > c7465f.f22058o ? c7465f.f22058o : i2;
            }
            layoutParams.height = i;
        }
    }

    private void m20020a(C7600f c7600f, C2971k c2971k) {
        boolean z = ((c7600f.f23291Z == null || c7600f.f23291Z.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22052i, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7600f c7600f = (C7600f) c6829g;
        Object a2 = C2613o.m7045a(c7600f.f23288W, c7600f.f23289X, c7600f.f23284S, c7600f.f23285T, c7600f.f21300A);
        C1247e c1247e = null;
        this.f22048e.setImageBitmap(null);
        if (c7600f.f23282Q <= 0 || c7600f.f23283R <= 0) {
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f22056m, this.f22056m));
            a.f3986c = this.f22061r;
        } else {
            Point a3 = this.f22060q ? C2491i.m6763a(this.f22056m, c7600f.f23282Q, c7600f.f23283R) : null;
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f22060q ? a3.x : this.f22056m, this.f22060q ? a3.y : this.f22056m));
            if (!this.f22060q) {
                c1247e = this.f22061r;
            }
            a.f3986c = c1247e;
        }
        a.m3031a(this.f22048e);
        if (c7600f.f23286U == null || c7600f.f23286U.isEmpty()) {
            this.f22049f.setVisibility(8);
        } else {
            this.f22049f.setText(c7600f.f23286U);
            this.f22049f.setVisibility(0);
            this.f22049f.setTextSize((float) c7600f.f23290Y);
            C4520n.m8234a(this.f22049f);
        }
        switch (c7600f.f21337w) {
            case ERROR:
                imageView = this.f22051h;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22051h;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22051h;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22051h;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7600f.f23288W) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22053j.setVisibility(8);
                this.f22052i.setVisibility(0);
                this.f22050g.setVisibility(8);
                m20020a(c7600f, c7600f.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22053j.setVisibility(0);
                this.f22052i.setVisibility(0);
                this.f22052i.setImageResource(R.drawable.ic_file_stop_download);
                this.f22050g.setVisibility(0);
                this.f22050g.setText(c7600f.f23281P);
                if (c7600f.f23287V > 0) {
                    progressWheel = this.f22053j;
                    f = ((float) c7600f.f23287V) * 0.01f;
                } else {
                    progressWheel = this.f22053j;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22053j.setVisibility(8);
                this.f22052i.setVisibility(8);
                this.f22050g.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7600f, this.f22057n, true);
    }
}
