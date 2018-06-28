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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7601g;

public final class C7466g extends C7348b {
    private ImageView f22062e;
    private ImageView f22063f;
    private TextView f22064g;
    private ImageButton f22065h;
    private ProgressWheel f22066i;
    private C3284e f22067j;
    private C3283d f22068k;
    private int f22069l;
    private int f22070m;
    private float f22071n;
    private View f22072o;
    private View f22073p;
    private boolean f22074q;
    private C1247e<Drawable> f22075r;

    class C36312 implements OnClickListener {
        final /* synthetic */ C7466g f10839a;

        C36312(C7466g c7466g) {
            this.f10839a = c7466g;
        }

        public final void onClick(View view) {
            C7601g c7601g = (C7601g) this.f10839a.f16244a;
            switch (c7601g.f23298V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7601g.f23300X == null || c7601g.f23300X.isEmpty()) {
                        this.f10839a.f22067j.mo2307a(c7601g.ac, false);
                        return;
                    } else {
                        this.f10839a.f22067j.mo2307a(c7601g.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10839a.f22067j.mo2305a(c7601g.ac);
                    return;
                case CANCEL:
                    if (c7601g.f23300X == null || c7601g.f23300X.isEmpty()) {
                        this.f10839a.f22067j.mo2307a(c7601g.ac, false);
                        return;
                    } else {
                        this.f10839a.f22067j.mo2307a(c7601g.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7601g.f23300X == null || c7601g.f23300X.isEmpty()) {
                        this.f10839a.f22067j.mo2307a(c7601g.ac, false);
                        return;
                    } else {
                        this.f10839a.f22067j.mo2307a(c7601g.ac, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C36323 implements OnClickListener {
        final /* synthetic */ C7466g f10840a;

        C36323(C7466g c7466g) {
            this.f10840a = c7466g;
        }

        public final void onClick(View view) {
            C7601g c7601g = (C7601g) this.f10840a.f16244a;
            if (c7601g.f23300X == null || c7601g.f23300X.isEmpty()) {
                int[] iArr = C36334.f10841a;
                c7601g.f23298V.ordinal();
                this.f10840a.f22068k.mo2325c(c7601g.f23295S, c7601g.f21334t);
            } else if (c7601g.f23298V == C2987i.FINISHED) {
                this.f10840a.f22068k.mo2325c(c7601g.f23295S, c7601g.f21334t);
            }
        }
    }

    class C61541 implements C1247e<Drawable> {
        final /* synthetic */ C7466g f16647a;

        C61541(C7466g c7466g) {
            this.f16647a = c7466g;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7601g c7601g = (C7601g) this.f16647a.f16244a;
            C7466g.m20025a(this.f16647a, c7601g.f23293Q, c7601g.f23294R);
            return false;
        }
    }

    public C7466g(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, float f, int i3, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        C7348b c7348b = this;
        int i4 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_channel_output_list_item : R.layout.chat_image_channel_output_list_item_old, c3280a, c3286g, c3284e);
        c7348b.f22074q = C2535a.m6888a().au() ^ 1;
        c7348b.f22075r = new C61541(c7348b);
        c7348b.f22067j = c3284e;
        c7348b.f22068k = c3283d;
        c7348b.f22069l = i4;
        c7348b.f22071n = f;
        c7348b.f22070m = i3;
        c7348b.f22062e = (ImageView) c7348b.itemView.findViewById(R.id.content_imageView);
        c7348b.f22063f = (ImageView) c7348b.itemView.findViewById(R.id.status_imageView);
        c7348b.f22064g = (TextView) c7348b.itemView.findViewById(R.id.progress_text_action_view);
        c7348b.f22065h = (ImageButton) c7348b.itemView.findViewById(R.id.action_imageView);
        c7348b.f22066i = (ProgressWheel) c7348b.itemView.findViewById(R.id.progress_wheel);
        c7348b.f22072o = c7348b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7348b.f22073p = c7348b.itemView.findViewById(R.id.bottom_gradient_view);
        LayoutParams layoutParams = (LayoutParams) c7348b.f22062e.getLayoutParams();
        layoutParams.height = i2;
        if (c7348b.f22074q) {
            layoutParams.width = i4;
            m20024a(i4);
        }
        c7348b.f22065h.setOnClickListener(new C36312(c7348b));
        c7348b.f22062e.setOnClickListener(new C36323(c7348b));
    }

    private void m20024a(int i) {
        if (this.f22073p != null) {
            int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            LayoutParams layoutParams = (LayoutParams) this.f22073p.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = dimension;
        }
    }

    static /* synthetic */ void m20025a(C7466g c7466g, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7466g.f22062e.getLayoutParams();
            if (c7466g.f22074q) {
                Point b = C2491i.m6807b(c7466g.f22069l, i, i2);
                i = i < c7466g.f22069l ? c7466g.f22069l : b.x;
                i2 = b.y;
                layoutParams.width = i;
                c7466g.m20024a(i);
            } else {
                float f = (float) i;
                float f2 = c7466g.f22071n / f;
                if (f <= c7466g.f22071n) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                if (i2 > c7466g.f22070m) {
                    i2 = c7466g.f22070m;
                }
            }
            layoutParams.height = i2;
        }
    }

    private void m20026a(C7601g c7601g, C2971k c2971k) {
        boolean z = ((c7601g.f23300X == null || c7601g.f23300X.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22065h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7601g c7601g = (C7601g) c6829g;
        Object a2 = C2613o.m7045a(c7601g.f23298V, c7601g.f23299W, c7601g.f23295S, c7601g.f23296T, c7601g.f21300A);
        C1247e c1247e = null;
        this.f22062e.setImageBitmap(null);
        if (c7601g.f23293Q <= 0 || c7601g.f23294R <= 0) {
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f22069l, this.f22069l));
            a.f3986c = this.f22075r;
        } else {
            Point a3 = this.f22074q ? C2491i.m6763a(this.f22069l, c7601g.f23293Q, c7601g.f23294R) : null;
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f22074q ? a3.x : this.f22069l, this.f22074q ? a3.y : this.f22069l));
            if (!this.f22074q) {
                c1247e = this.f22075r;
            }
            a.f3986c = c1247e;
        }
        a.m3031a(this.f22062e);
        switch (c7601g.f21337w) {
            case ERROR:
                imageView = this.f22063f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22063f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22063f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22063f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7601g.f23298V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22066i.setVisibility(8);
                this.f22065h.setVisibility(0);
                this.f22064g.setVisibility(8);
                m20026a(c7601g, c7601g.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22066i.setVisibility(0);
                this.f22065h.setVisibility(0);
                this.f22065h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22064g.setVisibility(0);
                this.f22064g.setText(c7601g.f23292P);
                if (c7601g.f23297U > 0) {
                    progressWheel = this.f22066i;
                    f = ((float) c7601g.f23297U) * 0.01f;
                } else {
                    progressWheel = this.f22066i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22066i.setVisibility(8);
                this.f22065h.setVisibility(8);
                this.f22064g.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7601g, this.f22072o, true);
    }
}
