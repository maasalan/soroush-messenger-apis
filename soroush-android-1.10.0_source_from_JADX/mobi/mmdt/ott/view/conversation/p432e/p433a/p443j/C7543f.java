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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7678f;
import mobi.mmdt.ott.view.tools.C4520n;

public final class C7543f extends C7354b {
    private ImageView f22971d;
    private TextView f22972e;
    private ImageView f22973f;
    private ImageButton f22974g;
    private TextView f22975h;
    private ProgressWheel f22976i;
    private C3284e f22977j;
    private C3283d f22978k;
    private int f22979l;
    private RelativeLayout f22980m;
    private C1247e<Drawable> f22981n = new C61951(this);

    class C39412 implements OnClickListener {
        final /* synthetic */ C7543f f11399a;

        C39412(C7543f c7543f) {
            this.f11399a = c7543f;
        }

        public final void onClick(View view) {
            C7678f c7678f = (C7678f) this.f11399a.f16244a;
            switch (c7678f.f23812Y) {
                case DELETED:
                case NOT_STARTED:
                    if (c7678f.ab == null || c7678f.ab.isEmpty()) {
                        this.f11399a.f22977j.mo2307a(c7678f.mo3604b(), false);
                        return;
                    } else {
                        this.f11399a.f22977j.mo2307a(c7678f.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11399a.f22977j.mo2305a(c7678f.mo3604b());
                    return;
                case CANCEL:
                    if (c7678f.ab == null || c7678f.ab.isEmpty()) {
                        this.f11399a.f22977j.mo2307a(c7678f.mo3604b(), false);
                        return;
                    } else {
                        this.f11399a.f22977j.mo2307a(c7678f.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7678f.ab == null || c7678f.ab.isEmpty()) {
                        this.f11399a.f22977j.mo2307a(c7678f.mo3604b(), false);
                        return;
                    } else {
                        this.f11399a.f22977j.mo2307a(c7678f.mo3604b(), true);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    class C39423 implements OnClickListener {
        final /* synthetic */ C7543f f11400a;

        C39423(C7543f c7543f) {
            this.f11400a = c7543f;
        }

        public final void onClick(View view) {
            C7678f c7678f = (C7678f) this.f11400a.f16244a;
            if (c7678f.ab == null || c7678f.ab.isEmpty()) {
                int[] iArr = C39434.f11401a;
                c7678f.f23812Y.ordinal();
                this.f11400a.f22978k.mo2325c(c7678f.f23808S, c7678f.f21334t);
            } else if (c7678f.f23812Y == C2987i.FINISHED) {
                this.f11400a.f22978k.mo2325c(c7678f.f23808S, c7678f.f21334t);
            }
        }
    }

    class C61951 implements C1247e<Drawable> {
        final /* synthetic */ C7543f f16736a;

        C61951(C7543f c7543f) {
            this.f16736a = c7543f;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            C7678f c7678f = (C7678f) this.f16736a.f16244a;
            int i = c7678f.f23806Q;
            if (i > 0 && c7678f.f23807R > 0) {
                Point b = C2491i.m6807b(this.f16736a.f22979l, i, c7678f.f23807R);
                LayoutParams layoutParams = (LayoutParams) this.f16736a.f22971d.getLayoutParams();
                layoutParams.width = i < this.f16736a.f22979l ? this.f16736a.f22979l : b.x;
                layoutParams.height = b.y;
            }
            return false;
        }
    }

    public C7543f(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_image_captioned_output_list_item, c3286g, c3284e);
        this.f22977j = c3284e;
        this.f22978k = c3283d;
        this.f22979l = i;
        this.f22971d = (ImageView) this.itemView.findViewById(R.id.content_imageView);
        this.f22972e = (TextView) this.itemView.findViewById(R.id.caption_textView);
        this.f22973f = (ImageView) this.itemView.findViewById(R.id.status_imageView);
        this.f22975h = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f22974g = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22976i = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22980m = (RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f22971d.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        this.f22974g.setOnClickListener(new C39412(this));
        this.f22971d.setOnClickListener(new C39423(this));
    }

    private void m20573a(C7678f c7678f, C2971k c2971k) {
        boolean z = ((c7678f.ab == null || c7678f.ab.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22974g, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7678f c7678f = (C7678f) c6829g;
        Object a2 = C2613o.m7045a(c7678f.f23812Y, c7678f.f23813Z, c7678f.f23808S, c7678f.f23809T, c7678f.f21300A);
        this.f22971d.setImageBitmap(null);
        int i2 = c7678f.f23806Q;
        if (i2 <= 0 || c7678f.f23807R <= 0) {
            a = C1212c.m2872a(this.c).m10950a(a2).m3034a(new C1248f().m2959e().m2954b(this.f22979l, this.f22979l)).m3033a();
        } else {
            Point a3 = C2491i.m6763a(this.f22979l, i2, c7678f.f23807R);
            a = C1212c.m2872a(this.c).m10950a(a2).m3033a().m3034a(new C1248f().m2954b(i2 < this.f22979l ? this.f22979l : a3.x, a3.y));
        }
        a.f3986c = this.f22981n;
        a.m3031a(this.f22971d);
        if (c7678f.f23810U == null || c7678f.f23810U.isEmpty()) {
            this.f22972e.setVisibility(8);
        } else {
            this.f22972e.setText(c7678f.f23810U);
            this.f22972e.setVisibility(0);
            this.f22972e.setTextSize((float) (((double) c7678f.aa) * 0.85d));
            C4520n.m8234a(this.f22972e);
        }
        switch (c7678f.f21337w) {
            case ERROR:
                imageView = this.f22973f;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22973f;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22973f;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22973f;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7678f.f23812Y) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22976i.setVisibility(8);
                this.f22974g.setVisibility(0);
                this.f22975h.setVisibility(8);
                m20573a(c7678f, c7678f.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22976i.setVisibility(0);
                this.f22974g.setVisibility(0);
                this.f22974g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22975h.setVisibility(0);
                this.f22975h.setText(c7678f.f23805P);
                if (c7678f.f23811V > 0) {
                    progressWheel = this.f22976i;
                    f = ((float) c7678f.f23811V) * 0.01f;
                } else {
                    progressWheel = this.f22976i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22976i.setVisibility(8);
                this.f22974g.setVisibility(8);
                this.f22975h.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7678f, this.f22980m, true);
    }
}
