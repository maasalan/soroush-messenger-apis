package mobi.mmdt.ott.view.conversation.p432e.p433a.p439f;

import android.app.Activity;
import android.graphics.Point;
import android.net.Uri;
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
import java.io.IOException;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.af.C2613o;
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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7624d;
import mobi.mmdt.ott.view.tools.C4520n;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7489d extends C7350b {
    private final int f22338e;
    private TextView f22339f = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private TextView f22340g = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private ImageView f22341h = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22342i = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22343j = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22344k;
    private C3283d f22345l;
    private GifImageView f22346m = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f22347n;
    private View f22348o = this.itemView.findViewById(R.id.bottom_gradient_view);
    private RelativeLayout f22349p = ((RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C37281 implements OnClickListener {
        final /* synthetic */ C7489d f11018a;

        C37281(C7489d c7489d) {
            this.f11018a = c7489d;
        }

        public final void onClick(View view) {
            C7624d c7624d = (C7624d) this.f11018a.f16244a;
            switch (c7624d.f23449V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7624d.ac == null || c7624d.ac.isEmpty()) {
                        this.f11018a.f22344k.mo2307a(c7624d.f23095W, false);
                        return;
                    } else {
                        this.f11018a.f22344k.mo2307a(c7624d.f23095W, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11018a.f22344k.mo2305a(c7624d.f23095W);
                    return;
                case CANCEL:
                    if (c7624d.ac == null || c7624d.ac.isEmpty()) {
                        this.f11018a.f22344k.mo2307a(c7624d.f23095W, false);
                        return;
                    } else {
                        this.f11018a.f22344k.mo2307a(c7624d.f23095W, true);
                        return;
                    }
                case ERROR:
                    if (c7624d.ac == null || c7624d.ac.isEmpty()) {
                        this.f11018a.f22344k.mo2307a(c7624d.f23095W, false);
                        return;
                    } else {
                        this.f11018a.f22344k.mo2307a(c7624d.f23095W, true);
                        return;
                    }
                case FINISHED:
                    this.f11018a.f22345l.mo2319b(c7624d.f23445R, c7624d.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C37292 implements OnClickListener {
        final /* synthetic */ C7489d f11019a;

        C37292(C7489d c7489d) {
            this.f11019a = c7489d;
        }

        public final void onClick(View view) {
            C7624d c7624d = (C7624d) this.f11019a.f16244a;
            if (c7624d.ac != null && !c7624d.ac.isEmpty()) {
                if (c7624d.f23449V == C2987i.FINISHED) {
                }
            } else if (C37303.f11020a[c7624d.f23449V.ordinal()] != 6) {
                return;
            }
            this.f11019a.f22345l.mo2319b(c7624d.f23445R, c7624d.f21334t);
        }
    }

    public C7489d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        int i3 = i;
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_captioned_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22338e = i3;
        this.f22344k = c3284e;
        this.f22345l = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22346m.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f22348o.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f22342i.setOnClickListener(new C37281(this));
        this.f22346m.setOnClickListener(new C37292(this));
    }

    private void m20188a(C7624d c7624d, C2971k c2971k) {
        boolean z = ((c7624d.ac == null || c7624d.ac.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22342i, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7624d c7624d = (C7624d) c6829g;
        Uri a = C2613o.m7045a(c7624d.f23449V, c7624d.aa, c7624d.f23445R, c7624d.f23446S, c7624d.f21300A);
        if (a != null) {
            try {
                this.f22347n = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22347n != null) {
            this.f22346m.setImageDrawable(this.f22347n);
            if (this.f22347n != null) {
                this.f22347n.stop();
            }
        } else if (a != null) {
            C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22346m);
        }
        if (c7624d.f23443P > 0 && c7624d.f23444Q > 0) {
            Point b = C2491i.m6807b(this.f22338e, c7624d.f23443P, c7624d.f23444Q);
            LayoutParams layoutParams = (LayoutParams) this.f22346m.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22348o.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        if (c7624d.f23447T == null || c7624d.f23447T.isEmpty()) {
            this.f22339f.setVisibility(8);
        } else {
            this.f22339f.setText(c7624d.f23447T);
            this.f22339f.setVisibility(0);
            this.f22339f.setTextSize((float) c7624d.ab);
            C4520n.m8234a(this.f22339f);
        }
        switch (c7624d.f21337w) {
            case ERROR:
                imageView = this.f22341h;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22341h;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22341h;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22341h;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7624d.f23449V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22343j.setVisibility(8);
                this.f22342i.setVisibility(0);
                this.f22340g.setVisibility(8);
                m20188a(c7624d, c7624d.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22343j.setVisibility(0);
                this.f22342i.setVisibility(0);
                this.f22342i.setImageResource(R.drawable.ic_file_stop_download);
                this.f22340g.setVisibility(0);
                this.f22340g.setText(c7624d.ad);
                if (c7624d.f23448U > 0) {
                    progressWheel = this.f22343j;
                    f = ((float) c7624d.f23448U) * 0.01f;
                } else {
                    progressWheel = this.f22343j;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22343j.setVisibility(8);
                this.f22342i.setVisibility(0);
                this.f22342i.setImageResource(R.drawable.ic_gif_white_32dp);
                this.f22340g.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7624d, this.f22349p, true);
    }
}
