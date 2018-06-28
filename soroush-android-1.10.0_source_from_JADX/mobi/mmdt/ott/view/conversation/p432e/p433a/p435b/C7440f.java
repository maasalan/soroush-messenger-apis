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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7714f;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7440f extends C7346b {
    private ImageView f21741e;
    private TextView f21742f;
    private TextView f21743g;
    private ImageView f21744h;
    private ImageButton f21745i;
    private ProgressWheel f21746j;
    private C3284e f21747k;
    private C3283d f21748l;
    private int f21749m;
    private int f21750n;
    private float f21751o;
    private RelativeLayout f21752p;
    private boolean f21753q;
    private C1247e<Drawable> f21754r;

    class C35332 implements OnClickListener {
        final /* synthetic */ C7440f f10687a;

        C35332(C7440f c7440f) {
            this.f10687a = c7440f;
        }

        public final void onClick(View view) {
            C7714f c7714f = (C7714f) this.f10687a.f16244a;
            switch (c7714f.f24265W) {
                case DELETED:
                case NOT_STARTED:
                    if (c7714f.f24268Z == null || c7714f.f24268Z.isEmpty()) {
                        this.f10687a.f21747k.mo2307a(c7714f.ac, false);
                        return;
                    } else {
                        this.f10687a.f21747k.mo2307a(c7714f.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10687a.f21747k.mo2305a(c7714f.ac);
                    return;
                case CANCEL:
                    if (c7714f.f24268Z == null || c7714f.f24268Z.isEmpty()) {
                        this.f10687a.f21747k.mo2307a(c7714f.ac, false);
                        return;
                    } else {
                        this.f10687a.f21747k.mo2307a(c7714f.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7714f.f24268Z == null || c7714f.f24268Z.isEmpty()) {
                        this.f10687a.f21747k.mo2307a(c7714f.ac, false);
                        return;
                    } else {
                        this.f10687a.f21747k.mo2307a(c7714f.ac, true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C35343 implements OnClickListener {
        final /* synthetic */ C7440f f10688a;

        C35343(C7440f c7440f) {
            this.f10688a = c7440f;
        }

        public final void onClick(View view) {
            C7714f c7714f = (C7714f) this.f10688a.f16244a;
            if (c7714f.f24268Z == null || c7714f.f24268Z.isEmpty()) {
                int[] iArr = C35354.f10689a;
                c7714f.f24265W.ordinal();
                this.f10688a.f21748l.mo2325c(c7714f.f24261S, c7714f.f21334t);
            } else if (c7714f.f24265W == C2987i.FINISHED) {
                this.f10688a.f21748l.mo2325c(c7714f.f24261S, c7714f.f21334t);
            }
        }
    }

    class C61401 implements C1247e<Drawable> {
        final /* synthetic */ C7440f f16625a;

        C61401(C7440f c7440f) {
            this.f16625a = c7440f;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7714f c7714f = (C7714f) this.f16625a.f16244a;
            C7440f.m19850a(this.f16625a, c7714f.f24259Q, c7714f.f24260R);
            return false;
        }
    }

    public C7440f(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, float f, int i3, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        C7346b c7346b = this;
        int i4 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_image_captioned_channel_output_list_item : R.layout.chat_image_captioned_channel_output_list_item_old, c3280a, c3286g, c3284e);
        c7346b.f21753q = C2535a.m6888a().au() ^ 1;
        c7346b.f21754r = new C61401(c7346b);
        c7346b.f21747k = c3284e;
        c7346b.f21748l = c3283d;
        c7346b.f21749m = i4;
        c7346b.f21751o = f;
        c7346b.f21750n = i3;
        c7346b.f21741e = (ImageView) c7346b.itemView.findViewById(R.id.content_imageView);
        c7346b.f21742f = (TextView) c7346b.itemView.findViewById(R.id.caption_textView);
        c7346b.f21744h = (ImageView) c7346b.itemView.findViewById(R.id.status_imageView);
        c7346b.f21743g = (TextView) c7346b.itemView.findViewById(R.id.progress_text_action_view);
        c7346b.f21745i = (ImageButton) c7346b.itemView.findViewById(R.id.action_imageView);
        c7346b.f21746j = (ProgressWheel) c7346b.itemView.findViewById(R.id.progress_wheel);
        c7346b.f21752p = (RelativeLayout) c7346b.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) c7346b.f21741e.getLayoutParams();
        layoutParams.height = i2;
        if (c7346b.f21753q) {
            layoutParams.width = i4;
        }
        c7346b.f21745i.setOnClickListener(new C35332(c7346b));
        c7346b.f21741e.setOnClickListener(new C35343(c7346b));
    }

    static /* synthetic */ void m19850a(C7440f c7440f, int i, int i2) {
        if (i > 0 && i2 > 0) {
            LayoutParams layoutParams = (LayoutParams) c7440f.f21741e.getLayoutParams();
            if (c7440f.f21753q) {
                Point b = C2491i.m6807b(c7440f.f21749m, i, i2);
                int i3 = i < c7440f.f21749m ? c7440f.f21749m : b.x;
                i = b.y;
                layoutParams.width = i3;
            } else {
                float f = (float) i;
                float f2 = c7440f.f21751o / f;
                if (f <= c7440f.f21751o) {
                    f = (float) i2;
                    i2 = (int) (f + (f2 * f));
                }
                i = i2 > c7440f.f21750n ? c7440f.f21750n : i2;
            }
            layoutParams.height = i;
        }
    }

    private void m19851a(C7714f c7714f, C2971k c2971k) {
        boolean z = ((c7714f.f24268Z == null || c7714f.f24268Z.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f21745i, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7714f c7714f = (C7714f) c6829g;
        Object a2 = C2613o.m7045a(c7714f.f24265W, c7714f.f24266X, c7714f.f24261S, c7714f.f24262T, c7714f.f21300A);
        C1247e c1247e = null;
        this.f21741e.setImageBitmap(null);
        if (c7714f.f24259Q <= 0 || c7714f.f24260R <= 0) {
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f21749m, this.f21749m));
            a.f3986c = this.f21754r;
        } else {
            Point a3 = this.f21753q ? C2491i.m6763a(this.f21749m, c7714f.f24259Q, c7714f.f24260R) : null;
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(this.f21753q ? a3.x : this.f21749m, this.f21753q ? a3.y : this.f21749m));
            if (!this.f21753q) {
                c1247e = this.f21754r;
            }
            a.f3986c = c1247e;
        }
        a.m3031a(this.f21741e);
        if (c7714f.f24263U == null || c7714f.f24263U.isEmpty()) {
            this.f21742f.setVisibility(8);
        } else {
            this.f21742f.setText(c7714f.f24263U);
            this.f21742f.setVisibility(0);
            this.f21742f.setTextSize((float) c7714f.f24267Y);
            C4520n.m8234a(this.f21742f);
        }
        switch (c7714f.f21337w) {
            case ERROR:
                imageView = this.f21744h;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21744h;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21744h;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21744h;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7714f.f24265W) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21746j.setVisibility(8);
                this.f21745i.setVisibility(0);
                this.f21743g.setVisibility(8);
                m19851a(c7714f, c7714f.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21746j.setVisibility(0);
                this.f21745i.setVisibility(0);
                this.f21745i.setImageResource(R.drawable.ic_file_stop_download);
                this.f21743g.setVisibility(0);
                this.f21743g.setText(c7714f.f24258P);
                if (c7714f.f24264V > 0) {
                    progressWheel = this.f21746j;
                    f = ((float) c7714f.f24264V) * 0.01f;
                } else {
                    progressWheel = this.f21746j;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21746j.setVisibility(8);
                this.f21745i.setVisibility(8);
                this.f21743g.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7714f, this.f21752p, true);
    }
}
