package mobi.mmdt.ott.view.conversation.p432e.p433a.p437d;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p603d.C7598d;
import mobi.mmdt.ott.view.tools.C4520n;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7463d extends C7348b {
    private final int f22023e;
    private final int f22024f;
    private TextView f22025g = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private TextView f22026h = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private ImageView f22027i = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22028j = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22029k = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22030l;
    private C3283d f22031m;
    private GifImageView f22032n = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f22033o;
    private View f22034p = this.itemView.findViewById(R.id.bottom_gradient_view);
    private RelativeLayout f22035q = ((RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C36221 implements OnClickListener {
        final /* synthetic */ C7463d f10827a;

        C36221(C7463d c7463d) {
            this.f10827a = c7463d;
        }

        public final void onClick(View view) {
            C7598d c7598d = (C7598d) this.f10827a.f16244a;
            switch (c7598d.f23265V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7598d.f23268Y == null || c7598d.f23268Y.isEmpty()) {
                        this.f10827a.f22030l.mo2307a(c7598d.ac, false);
                        return;
                    } else {
                        this.f10827a.f22030l.mo2307a(c7598d.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10827a.f22030l.mo2305a(c7598d.ac);
                    return;
                case CANCEL:
                    if (c7598d.f23268Y == null || c7598d.f23268Y.isEmpty()) {
                        this.f10827a.f22030l.mo2307a(c7598d.ac, false);
                        return;
                    } else {
                        this.f10827a.f22030l.mo2307a(c7598d.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7598d.f23268Y == null || c7598d.f23268Y.isEmpty()) {
                        this.f10827a.f22030l.mo2307a(c7598d.ac, false);
                        return;
                    } else {
                        this.f10827a.f22030l.mo2307a(c7598d.ac, true);
                        return;
                    }
                case FINISHED:
                    this.f10827a.f22031m.mo2319b(c7598d.f23261R, c7598d.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C36232 implements OnClickListener {
        final /* synthetic */ C7463d f10828a;

        C36232(C7463d c7463d) {
            this.f10828a = c7463d;
        }

        public final void onClick(View view) {
            C7598d c7598d = (C7598d) this.f10828a.f16244a;
            if (c7598d.f23268Y != null && !c7598d.f23268Y.isEmpty()) {
                if (c7598d.f23265V == C2987i.FINISHED) {
                }
            } else if (C36243.f10829a[c7598d.f23265V.ordinal()] != 6) {
                return;
            }
            this.f10828a.f22031m.mo2319b(c7598d.f23261R, c7598d.f21334t);
        }
    }

    public C7463d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_captioned_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22023e = i3;
        this.f22024f = i4;
        this.f22030l = c3284e;
        this.f22031m = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22032n.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f22034p.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f22028j.setOnClickListener(new C36221(this));
        this.f22032n.setOnClickListener(new C36232(this));
    }

    private void m20011a(C7598d c7598d, C2971k c2971k) {
        boolean z = ((c7598d.f23268Y == null || c7598d.f23268Y.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22028j, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7598d c7598d = (C7598d) c6829g;
        Uri a = C2613o.m7045a(c7598d.f23265V, c7598d.f23266W, c7598d.f23261R, c7598d.f23262S, c7598d.f21300A);
        if (a != null) {
            try {
                this.f22033o = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22033o != null) {
            this.f22032n.setImageDrawable(this.f22033o);
            if (this.f22033o != null) {
                this.f22033o.stop();
            }
        } else if (a != null) {
            C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22032n);
        }
        if (c7598d.f23259P > 0 && c7598d.f23260Q > 0) {
            Point b = C2491i.m6807b(this.f22023e, c7598d.f23259P, c7598d.f23260Q);
            LayoutParams layoutParams = (LayoutParams) this.f22032n.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22034p.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        if (c7598d.f23263T == null || c7598d.f23263T.isEmpty()) {
            this.f22025g.setVisibility(8);
        } else {
            this.f22025g.setText(c7598d.f23263T);
            this.f22025g.setVisibility(0);
            this.f22025g.setTextSize((float) c7598d.f23267X);
            C4520n.m8234a(this.f22025g);
        }
        switch (c7598d.f21337w) {
            case ERROR:
                imageView = this.f22027i;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22027i;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22027i;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22027i;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7598d.f23265V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22029k.setVisibility(8);
                this.f22028j.setVisibility(0);
                this.f22026h.setVisibility(8);
                m20011a(c7598d, c7598d.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22029k.setVisibility(0);
                this.f22028j.setVisibility(0);
                this.f22028j.setImageResource(R.drawable.ic_file_stop_download);
                this.f22026h.setVisibility(0);
                this.f22026h.setText(c7598d.f23269Z);
                if (c7598d.f23264U > 0) {
                    progressWheel = this.f22029k;
                    f = ((float) c7598d.f23264U) * 0.01f;
                } else {
                    progressWheel = this.f22029k;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22029k.setVisibility(8);
                this.f22028j.setVisibility(0);
                this.f22028j.setImageResource(R.drawable.ic_gif_white_32dp);
                this.f22026h.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7598d, this.f22035q, true);
    }
}
