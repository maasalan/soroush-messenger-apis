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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7715g;

public final class C7441g extends C7346b {
    private RelativeLayout f21755e;
    private ImageView f21756f;
    private ImageView f21757g;
    private TextView f21758h;
    private ImageButton f21759i;
    private ProgressWheel f21760j;
    private C3284e f21761k;
    private C3283d f21762l;
    private int f21763m;
    private int f21764n;
    private float f21765o;
    private View f21766p;
    private boolean f21767q;
    private C1247e<Drawable> f21768r;

    class C35362 implements OnClickListener {
        final /* synthetic */ C7441g f10691a;

        C35362(C7441g c7441g) {
            this.f10691a = c7441g;
        }

        public final void onClick(View view) {
            C7715g c7715g = (C7715g) this.f10691a.f16244a;
            switch (c7715g.f24275V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7715g.f24277X == null || c7715g.f24277X.isEmpty()) {
                        this.f10691a.f21761k.mo2307a(c7715g.ac, false);
                        return;
                    } else {
                        this.f10691a.f21761k.mo2307a(c7715g.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10691a.f21761k.mo2305a(c7715g.ac);
                    return;
                case CANCEL:
                    if (c7715g.f24277X == null || c7715g.f24277X.isEmpty()) {
                        this.f10691a.f21761k.mo2307a(c7715g.ac, false);
                        return;
                    } else {
                        this.f10691a.f21761k.mo2307a(c7715g.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7715g.f24277X == null || c7715g.f24277X.isEmpty()) {
                        this.f10691a.f21761k.mo2307a(c7715g.ac, false);
                        return;
                    } else {
                        this.f10691a.f21761k.mo2307a(c7715g.ac, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C35373 implements OnClickListener {
        final /* synthetic */ C7441g f10692a;

        C35373(C7441g c7441g) {
            this.f10692a = c7441g;
        }

        public final void onClick(View view) {
            C7715g c7715g = (C7715g) this.f10692a.f16244a;
            if (c7715g.f24277X == null || c7715g.f24277X.isEmpty()) {
                int[] iArr = C35384.f10693a;
                c7715g.f24275V.ordinal();
                this.f10692a.f21762l.mo2325c(c7715g.f24272S, c7715g.f21334t);
            } else if (c7715g.f24275V == C2987i.FINISHED) {
                this.f10692a.f21762l.mo2325c(c7715g.f24272S, c7715g.f21334t);
            }
        }
    }

    class C61411 implements C1247e<Drawable> {
        final /* synthetic */ C7441g f16626a;

        C61411(C7441g c7441g) {
            this.f16626a = c7441g;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7715g c7715g = (C7715g) this.f16626a.f16244a;
            C7441g.m19856a(this.f16626a, c7715g.f24270Q, c7715g.f24271R);
            return false;
        }
    }

    public C7441g(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, float f, int i3, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        C7346b c7346b = this;
        int i4 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_channel_direct_output_list_item : R.layout.chat_image_channel_direct_output_list_item_old, c3280a, c3286g, c3284e);
        c7346b.f21767q = C2535a.m6888a().au() ^ 1;
        c7346b.f21768r = new C61411(c7346b);
        c7346b.f21761k = c3284e;
        c7346b.f21762l = c3283d;
        c7346b.f21763m = i4;
        c7346b.f21765o = f;
        c7346b.f21764n = i3;
        c7346b.f21756f = (ImageView) c7346b.itemView.findViewById(R.id.content_imageView);
        c7346b.f21757g = (ImageView) c7346b.itemView.findViewById(R.id.status_imageView);
        c7346b.f21759i = (ImageButton) c7346b.itemView.findViewById(R.id.action_imageView);
        c7346b.f21758h = (TextView) c7346b.itemView.findViewById(R.id.progress_text_action_view);
        c7346b.f21760j = (ProgressWheel) c7346b.itemView.findViewById(R.id.progress_wheel);
        c7346b.f21755e = (RelativeLayout) c7346b.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) c7346b.f21756f.getLayoutParams();
        layoutParams.height = i2;
        if (c7346b.f21767q) {
            layoutParams.width = i4;
            m19855a(i4);
        }
        c7346b.f21759i.setOnClickListener(new C35362(c7346b));
        c7346b.f21756f.setOnClickListener(new C35373(c7346b));
    }

    private void m19855a(int i) {
        if (this.f21766p != null) {
            int dimension = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            LayoutParams layoutParams = (LayoutParams) this.f21766p.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = dimension;
        }
    }

    static /* synthetic */ void m19856a(C7441g c7441g, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7441g.f21756f.getLayoutParams();
            if (c7441g.f21767q) {
                Point b = C2491i.m6807b(c7441g.f21763m, i, i2);
                i = i < c7441g.f21763m ? c7441g.f21763m : b.x;
                i2 = b.y;
                layoutParams.width = i;
                c7441g.m19855a(i);
            } else {
                float f = (float) i;
                float f2 = c7441g.f21765o / f;
                if (f <= c7441g.f21765o) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                if (i2 > c7441g.f21764n) {
                    i2 = c7441g.f21764n;
                }
            }
            layoutParams.height = i2;
        }
    }

    private void m19857a(C7715g c7715g, C2971k c2971k) {
        boolean z = ((c7715g.f24277X == null || c7715g.f24277X.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f21759i, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7715g c7715g = (C7715g) c6829g;
        Object a2 = C2613o.m7045a(c7715g.f24275V, c7715g.f24276W, c7715g.f24272S, c7715g.f24273T, c7715g.f21300A);
        C1247e c1247e = null;
        this.f21756f.setImageBitmap(null);
        if (c7715g.f24270Q <= 0 || c7715g.f24271R <= 0) {
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f21763m, this.f21763m));
            a.f3986c = this.f21768r;
        } else {
            Point a3 = this.f21767q ? C2491i.m6763a(this.f21763m, c7715g.f24270Q, c7715g.f24271R) : null;
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f21767q ? a3.x : this.f21763m, this.f21767q ? a3.y : this.f21763m));
            if (!this.f21767q) {
                c1247e = this.f21768r;
            }
            a.f3986c = c1247e;
        }
        a.m3031a(this.f21756f);
        switch (c7715g.f21337w) {
            case ERROR:
                imageView = this.f21757g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21757g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21757g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21757g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7715g.f24275V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21760j.setVisibility(8);
                this.f21759i.setVisibility(0);
                this.f21758h.setVisibility(8);
                m19857a(c7715g, c7715g.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21760j.setVisibility(0);
                this.f21759i.setVisibility(0);
                this.f21759i.setImageResource(R.drawable.ic_file_stop_download);
                this.f21758h.setVisibility(0);
                this.f21758h.setText(c7715g.f24269P);
                if (c7715g.f24274U > 0) {
                    progressWheel = this.f21760j;
                    f = ((float) c7715g.f24274U) * 0.01f;
                } else {
                    progressWheel = this.f21760j;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21760j.setVisibility(8);
                this.f21759i.setVisibility(8);
                this.f21758h.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7715g, this.f21755e, true);
    }
}
