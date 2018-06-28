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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7627g;

public final class C7492g extends C7350b {
    private ImageView f22376e;
    private ImageView f22377f;
    private View f22378g;
    private TextView f22379h;
    private ImageButton f22380i;
    private ProgressWheel f22381j;
    private C3284e f22382k;
    private C3283d f22383l;
    private int f22384m;
    private View f22385n;
    private int f22386o;
    private float f22387p;
    private boolean f22388q;
    private C1247e<Drawable> f22389r;

    class C37372 implements OnClickListener {
        final /* synthetic */ C7492g f11030a;

        C37372(C7492g c7492g) {
            this.f11030a = c7492g;
        }

        public final void onClick(View view) {
            C7627g c7627g = (C7627g) this.f11030a.f16244a;
            switch (c7627g.f23470V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7627g.ab == null || c7627g.ab.isEmpty()) {
                        this.f11030a.f22382k.mo2307a(c7627g.f23095W, false);
                        return;
                    } else {
                        this.f11030a.f22382k.mo2307a(c7627g.f23095W, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11030a.f22382k.mo2305a(c7627g.f23095W);
                    return;
                case CANCEL:
                    if (c7627g.ab == null || c7627g.ab.isEmpty()) {
                        this.f11030a.f22382k.mo2307a(c7627g.f23095W, false);
                        return;
                    } else {
                        this.f11030a.f22382k.mo2307a(c7627g.f23095W, true);
                        return;
                    }
                case ERROR:
                    if (c7627g.ab == null || c7627g.ab.isEmpty()) {
                        this.f11030a.f22382k.mo2307a(c7627g.f23095W, false);
                        return;
                    } else {
                        this.f11030a.f22382k.mo2307a(c7627g.f23095W, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C37383 implements OnClickListener {
        final /* synthetic */ C7492g f11031a;

        C37383(C7492g c7492g) {
            this.f11031a = c7492g;
        }

        public final void onClick(View view) {
            C7627g c7627g = (C7627g) this.f11031a.f16244a;
            if (c7627g.ab == null || c7627g.ab.isEmpty()) {
                int[] iArr = C37394.f11032a;
                c7627g.f23470V.ordinal();
                this.f11031a.f22383l.mo2325c(c7627g.f23467S, c7627g.f21334t);
            } else if (c7627g.f23470V == C2987i.FINISHED) {
                this.f11031a.f22383l.mo2325c(c7627g.f23467S, c7627g.f21334t);
            }
        }
    }

    class C61681 implements C1247e<Drawable> {
        final /* synthetic */ C7492g f16677a;

        C61681(C7492g c7492g) {
            this.f16677a = c7492g;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7627g c7627g = (C7627g) this.f16677a.f16244a;
            C7492g.m20202a(this.f16677a, c7627g.f23465Q, c7627g.f23466R);
            return false;
        }
    }

    public C7492g(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, float f, int i3, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        C7350b c7350b = this;
        int i4 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_channel_output_list_item : R.layout.chat_image_channel_output_list_item_old, c3280a, c3286g, c3284e);
        c7350b.f22388q = C2535a.m6888a().au() ^ 1;
        c7350b.f22389r = new C61681(c7350b);
        c7350b.f22382k = c3284e;
        c7350b.f22383l = c3283d;
        c7350b.f22384m = i4;
        c7350b.f22387p = f;
        c7350b.f22386o = i3;
        c7350b.f22376e = (ImageView) c7350b.itemView.findViewById(R.id.content_imageView);
        c7350b.f22377f = (ImageView) c7350b.itemView.findViewById(R.id.status_imageView);
        c7350b.f22378g = c7350b.itemView.findViewById(R.id.bottom_gradient_view);
        c7350b.f22379h = (TextView) c7350b.itemView.findViewById(R.id.progress_text_action_view);
        c7350b.f22380i = (ImageButton) c7350b.itemView.findViewById(R.id.action_imageView);
        c7350b.f22381j = (ProgressWheel) c7350b.itemView.findViewById(R.id.progress_wheel);
        c7350b.f22385n = c7350b.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) c7350b.f22376e.getLayoutParams();
        layoutParams.height = i2;
        if (c7350b.f22388q) {
            layoutParams.width = i4;
            m20201a(i4);
        }
        c7350b.f22380i.setOnClickListener(new C37372(c7350b));
        c7350b.f22376e.setOnClickListener(new C37383(c7350b));
    }

    private void m20201a(int i) {
        if (this.f22378g != null) {
            int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            LayoutParams layoutParams = (LayoutParams) this.f22378g.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = dimension;
        }
    }

    static /* synthetic */ void m20202a(C7492g c7492g, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7492g.f22376e.getLayoutParams();
            if (c7492g.f22388q) {
                Point b = C2491i.m6807b(c7492g.f22384m, i, i2);
                i = i < c7492g.f22384m ? c7492g.f22384m : b.x;
                i2 = b.y;
                layoutParams.width = i;
                c7492g.m20201a(i);
            } else {
                float f = (float) i;
                float f2 = c7492g.f22387p / f;
                if (f <= c7492g.f22387p) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                if (i2 > c7492g.f22386o) {
                    i2 = c7492g.f22386o;
                }
            }
            layoutParams.height = i2;
        }
    }

    private void m20203a(C7627g c7627g, C2971k c2971k) {
        boolean z = ((c7627g.ab == null || c7627g.ab.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22380i, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7627g c7627g = (C7627g) c6829g;
        Object a2 = C2613o.m7045a(c7627g.f23470V, c7627g.aa, c7627g.f23467S, c7627g.f23468T, c7627g.f21300A);
        C1247e c1247e = null;
        this.f22376e.setImageBitmap(null);
        if (c7627g.f23465Q <= 0 || c7627g.f23466R <= 0) {
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f22384m, this.f22384m));
            a.f3986c = this.f22389r;
        } else {
            Point a3 = this.f22388q ? C2491i.m6763a(this.f22384m, c7627g.f23465Q, c7627g.f23466R) : null;
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f22388q ? a3.x : this.f22384m, this.f22388q ? a3.y : this.f22384m));
            if (!this.f22388q) {
                c1247e = this.f22389r;
            }
            a.f3986c = c1247e;
        }
        a.m3031a(this.f22376e);
        switch (c7627g.f21337w) {
            case ERROR:
                imageView = this.f22377f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22377f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22377f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22377f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7627g.f23470V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22381j.setVisibility(8);
                this.f22380i.setVisibility(0);
                this.f22379h.setVisibility(8);
                m20203a(c7627g, c7627g.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22381j.setVisibility(0);
                this.f22380i.setVisibility(0);
                this.f22380i.setImageResource(R.drawable.ic_file_stop_download);
                this.f22379h.setVisibility(0);
                this.f22379h.setText(c7627g.f23464P);
                if (c7627g.f23469U > 0) {
                    progressWheel = this.f22381j;
                    f = ((float) c7627g.f23469U) * 0.01f;
                } else {
                    progressWheel = this.f22381j;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22381j.setVisibility(8);
                this.f22380i.setVisibility(8);
                this.f22379h.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7627g, this.f22385n, true);
    }
}
