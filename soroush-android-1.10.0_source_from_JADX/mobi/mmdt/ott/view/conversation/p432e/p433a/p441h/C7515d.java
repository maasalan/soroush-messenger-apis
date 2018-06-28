package mobi.mmdt.ott.view.conversation.p432e.p433a.p441h;

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
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7650d;
import mobi.mmdt.ott.view.tools.C4520n;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7515d extends C7352b {
    private final int f22644d;
    private final int f22645e;
    private TextView f22646f = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private TextView f22647g = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private ImageView f22648h = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22649i = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22650j = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22651k;
    private C3283d f22652l;
    private GifImageView f22653m = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f22654n;
    private View f22655o = this.itemView.findViewById(R.id.bottom_gradient_view);
    private RelativeLayout f22656p = ((RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C38321 implements OnClickListener {
        final /* synthetic */ C7515d f11206a;

        C38321(C7515d c7515d) {
            this.f11206a = c7515d;
        }

        public final void onClick(View view) {
            C7650d c7650d = (C7650d) this.f11206a.f16244a;
            switch (c7650d.f23604V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7650d.aa == null || c7650d.aa.isEmpty()) {
                        this.f11206a.f22651k.mo2307a(c7650d.mo3604b(), false);
                        return;
                    } else {
                        this.f11206a.f22651k.mo2307a(c7650d.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11206a.f22651k.mo2305a(c7650d.mo3604b());
                    return;
                case CANCEL:
                    if (c7650d.aa == null || c7650d.aa.isEmpty()) {
                        this.f11206a.f22651k.mo2307a(c7650d.mo3604b(), false);
                        return;
                    } else {
                        this.f11206a.f22651k.mo2307a(c7650d.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7650d.aa == null || c7650d.aa.isEmpty()) {
                        this.f11206a.f22651k.mo2307a(c7650d.mo3604b(), false);
                        return;
                    } else {
                        this.f11206a.f22651k.mo2307a(c7650d.mo3604b(), true);
                        return;
                    }
                case FINISHED:
                    this.f11206a.f22652l.mo2319b(c7650d.f23600R, c7650d.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C38332 implements OnClickListener {
        final /* synthetic */ C7515d f11207a;

        C38332(C7515d c7515d) {
            this.f11207a = c7515d;
        }

        public final void onClick(View view) {
            C7650d c7650d = (C7650d) this.f11207a.f16244a;
            if (c7650d.aa != null && !c7650d.aa.isEmpty()) {
                if (c7650d.f23604V == C2987i.FINISHED) {
                }
            } else if (C38343.f11208a[c7650d.f23604V.ordinal()] != 6) {
                return;
            }
            this.f11207a.f22652l.mo2319b(c7650d.f23600R, c7650d.f21334t);
        }
    }

    public C7515d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_captioned_output_list_item, c3286g, c3284e);
        this.f22644d = i2;
        this.f22645e = i;
        this.f22651k = c3284e;
        this.f22652l = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22653m.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22655o.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22649i.setOnClickListener(new C38321(this));
        this.f22653m.setOnClickListener(new C38332(this));
    }

    private void m20371a(C7650d c7650d, C2971k c2971k) {
        boolean z = ((c7650d.aa == null || c7650d.aa.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22649i, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7650d c7650d = (C7650d) c6829g;
        Uri a = C2613o.m7045a(c7650d.f23604V, c7650d.f23605Y, c7650d.f23600R, c7650d.f23601S, c7650d.f21300A);
        if (a != null) {
            try {
                this.f22654n = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22654n != null) {
            this.f22653m.setImageDrawable(this.f22654n);
            if (this.f22654n != null) {
                this.f22654n.stop();
            }
        } else if (a != null) {
            C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22653m);
        }
        if (c7650d.f23598P > 0 && c7650d.f23599Q > 0) {
            Point b = C2491i.m6807b(this.f22645e, c7650d.f23598P, c7650d.f23599Q);
            LayoutParams layoutParams = (LayoutParams) this.f22653m.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22655o.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        if (c7650d.f23602T == null || c7650d.f23602T.isEmpty()) {
            this.f22647g.setVisibility(8);
        } else {
            this.f22647g.setText(c7650d.f23602T);
            this.f22647g.setVisibility(0);
            this.f22647g.setTextSize((float) (((double) c7650d.f23606Z) * 0.85d));
            C4520n.m8234a(this.f22647g);
        }
        switch (c7650d.f21337w) {
            case ERROR:
                imageView = this.f22648h;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22648h;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22648h;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22648h;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7650d.f23604V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22650j.setVisibility(8);
                this.f22649i.setVisibility(0);
                this.f22646f.setVisibility(8);
                m20371a(c7650d, c7650d.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22650j.setVisibility(0);
                this.f22649i.setVisibility(0);
                this.f22649i.setImageResource(R.drawable.ic_file_stop_download);
                this.f22646f.setVisibility(0);
                this.f22646f.setText(c7650d.ab);
                if (c7650d.f23603U > 0) {
                    progressWheel = this.f22650j;
                    f = ((float) c7650d.f23603U) * 0.01f;
                } else {
                    progressWheel = this.f22650j;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22650j.setVisibility(8);
                this.f22649i.setVisibility(0);
                this.f22649i.setImageResource(R.drawable.ic_gif_white_32dp);
                this.f22646f.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7650d, this.f22656p, true);
    }
}
