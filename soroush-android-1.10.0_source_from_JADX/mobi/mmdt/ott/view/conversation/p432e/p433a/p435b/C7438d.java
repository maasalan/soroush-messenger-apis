package mobi.mmdt.ott.view.conversation.p432e.p433a.p435b;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7712d;
import mobi.mmdt.ott.view.tools.C4520n;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7438d extends C7346b {
    private final int f21716e;
    private final int f21717f;
    private TextView f21718g = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private TextView f21719h = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private ImageView f21720i = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f21721j = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f21722k = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f21723l;
    private C3283d f21724m;
    private GifImageView f21725n = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f21726o;
    private View f21727p = this.itemView.findViewById(R.id.bottom_gradient_view);
    private RelativeLayout f21728q = ((RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C35271 implements OnClickListener {
        final /* synthetic */ C7438d f10679a;

        C35271(C7438d c7438d) {
            this.f10679a = c7438d;
        }

        public final void onClick(View view) {
            C7712d c7712d = (C7712d) this.f10679a.f16244a;
            switch (c7712d.f24242V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7712d.f24245Y == null || c7712d.f24245Y.isEmpty()) {
                        this.f10679a.f21723l.mo2307a(c7712d.ac, false);
                        return;
                    } else {
                        this.f10679a.f21723l.mo2307a(c7712d.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10679a.f21723l.mo2305a(c7712d.ac);
                    return;
                case CANCEL:
                    if (c7712d.f24245Y == null || c7712d.f24245Y.isEmpty()) {
                        this.f10679a.f21723l.mo2307a(c7712d.ac, false);
                        return;
                    } else {
                        this.f10679a.f21723l.mo2307a(c7712d.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7712d.f24245Y != null && !c7712d.f24245Y.isEmpty()) {
                        this.f10679a.f21723l.mo2307a(c7712d.ac, true);
                        break;
                    } else {
                        this.f10679a.f21723l.mo2307a(c7712d.ac, false);
                        break;
                    }
                    break;
                case FINISHED:
                    break;
                default:
                    return;
            }
            this.f10679a.f21724m.mo2319b(c7712d.f24238R, c7712d.f21334t);
        }
    }

    class C35282 implements OnClickListener {
        final /* synthetic */ C7438d f10680a;

        C35282(C7438d c7438d) {
            this.f10680a = c7438d;
        }

        public final void onClick(View view) {
            C7712d c7712d = (C7712d) this.f10680a.f16244a;
            if (c7712d.f24245Y != null && !c7712d.f24245Y.isEmpty()) {
                if (c7712d.f24242V == C2987i.FINISHED) {
                }
            } else if (C35293.f10681a[c7712d.f24242V.ordinal()] != 6) {
                return;
            }
            this.f10680a.f21724m.mo2319b(c7712d.f24238R, c7712d.f21334t);
        }
    }

    public C7438d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_captioned_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f21716e = i3;
        this.f21717f = i4;
        this.f21723l = c3284e;
        this.f21724m = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f21725n.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f21727p.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f21721j.setOnClickListener(new C35271(this));
        this.f21725n.setOnClickListener(new C35282(this));
    }

    private void m19842a(C7712d c7712d, C2971k c2971k) {
        boolean z = ((c7712d.f24245Y == null || c7712d.f24245Y.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f21721j, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7712d c7712d = (C7712d) c6829g;
        Uri a = C2613o.m7045a(c7712d.f24242V, c7712d.f24243W, c7712d.f24238R, c7712d.f24239S, c7712d.f21300A);
        if (a != null) {
            try {
                this.f21726o = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f21726o != null) {
            this.f21725n.setImageDrawable(this.f21726o);
            if (this.f21726o != null) {
                this.f21726o.stop();
            }
        } else if (a != null) {
            C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f21725n);
        }
        if (c7712d.f24236P > 0 && c7712d.f24237Q > 0) {
            Point b = C2491i.m6807b(this.f21716e, c7712d.f24236P, c7712d.f24237Q);
            LayoutParams layoutParams = (LayoutParams) this.f21725n.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f21727p.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        if (c7712d.f24240T == null || c7712d.f24240T.isEmpty()) {
            this.f21718g.setVisibility(8);
        } else {
            this.f21718g.setText(c7712d.f24240T);
            this.f21718g.setVisibility(0);
            this.f21718g.setTextSize((float) c7712d.f24244X);
            C4520n.m8234a(this.f21718g);
        }
        switch (c7712d.f21337w) {
            case ERROR:
                imageView = this.f21720i;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21720i;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21720i;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21720i;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7712d.f24242V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21722k.setVisibility(8);
                this.f21721j.setVisibility(0);
                this.f21719h.setVisibility(8);
                m19842a(c7712d, c7712d.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21722k.setVisibility(0);
                this.f21721j.setVisibility(0);
                this.f21721j.setImageResource(R.drawable.ic_file_stop_download);
                this.f21719h.setVisibility(0);
                this.f21719h.setText(c7712d.f24246Z);
                if (c7712d.f24241U > 0) {
                    progressWheel = this.f21722k;
                    f = ((float) c7712d.f24241U) * 0.01f;
                } else {
                    progressWheel = this.f21722k;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21722k.setVisibility(8);
                this.f21721j.setVisibility(0);
                this.f21721j.setImageResource(R.drawable.ic_gif_white_32dp);
                this.f21719h.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7712d, this.f21728q, true);
    }
}
