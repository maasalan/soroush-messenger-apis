package mobi.mmdt.ott.view.conversation.p432e.p433a.p443j;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7676d;
import mobi.mmdt.ott.view.tools.C4520n;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7541d extends C7354b {
    private final int f22946d;
    private final int f22947e;
    private TextView f22948f = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private TextView f22949g = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private ImageView f22950h = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22951i = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22952j = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22953k;
    private C3283d f22954l;
    private GifImageView f22955m = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f22956n;
    private View f22957o = this.itemView.findViewById(R.id.bottom_gradient_view);
    private RelativeLayout f22958p = ((RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C39351 implements OnClickListener {
        final /* synthetic */ C7541d f11391a;

        C39351(C7541d c7541d) {
            this.f11391a = c7541d;
        }

        public final void onClick(View view) {
            C7676d c7676d = (C7676d) this.f11391a.f16244a;
            switch (c7676d.f23793V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7676d.aa == null || c7676d.aa.isEmpty()) {
                        this.f11391a.f22953k.mo2307a(c7676d.mo3604b(), false);
                        return;
                    } else {
                        this.f11391a.f22953k.mo2307a(c7676d.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11391a.f22953k.mo2305a(c7676d.mo3604b());
                    return;
                case CANCEL:
                    if (c7676d.aa == null || c7676d.aa.isEmpty()) {
                        this.f11391a.f22953k.mo2307a(c7676d.mo3604b(), false);
                        return;
                    } else {
                        this.f11391a.f22953k.mo2307a(c7676d.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7676d.aa == null || c7676d.aa.isEmpty()) {
                        this.f11391a.f22953k.mo2307a(c7676d.mo3604b(), false);
                        return;
                    } else {
                        this.f11391a.f22953k.mo2307a(c7676d.mo3604b(), true);
                        return;
                    }
                case FINISHED:
                    this.f11391a.f22954l.mo2319b(c7676d.f23789R, c7676d.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C39362 implements OnClickListener {
        final /* synthetic */ C7541d f11392a;

        C39362(C7541d c7541d) {
            this.f11392a = c7541d;
        }

        public final void onClick(View view) {
            C7676d c7676d = (C7676d) this.f11392a.f16244a;
            if (c7676d.aa != null && !c7676d.aa.isEmpty()) {
                if (c7676d.f23793V == C2987i.FINISHED) {
                }
            } else if (C39373.f11393a[c7676d.f23793V.ordinal()] != 6) {
                return;
            }
            this.f11392a.f22954l.mo2319b(c7676d.f23789R, c7676d.f21334t);
        }
    }

    public C7541d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_captioned_output_list_item, c3286g, c3284e);
        this.f22946d = i2;
        this.f22947e = i;
        this.f22953k = c3284e;
        this.f22954l = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22955m.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22957o.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22951i.setOnClickListener(new C39351(this));
        this.f22955m.setOnClickListener(new C39362(this));
    }

    private void m20565a(C7676d c7676d, C2971k c2971k) {
        boolean z = ((c7676d.aa == null || c7676d.aa.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22951i, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7676d c7676d = (C7676d) c6829g;
        Uri a = C2613o.m7045a(c7676d.f23793V, c7676d.f23794Y, c7676d.f23789R, c7676d.f23790S, c7676d.f21300A);
        if (a != null) {
            try {
                this.f22956n = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22956n != null) {
            this.f22955m.setImageDrawable(this.f22956n);
            if (this.f22956n != null) {
                this.f22956n.stop();
            }
        } else if (a != null) {
            C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22955m);
        }
        if (c7676d.f23787P > 0 && c7676d.f23788Q > 0) {
            Point b = C2491i.m6807b(this.f22947e, c7676d.f23787P, c7676d.f23788Q);
            LayoutParams layoutParams = (LayoutParams) this.f22955m.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22957o.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        if (c7676d.f23791T == null || c7676d.f23791T.isEmpty()) {
            this.f22949g.setVisibility(8);
        } else {
            this.f22949g.setText(c7676d.f23791T);
            this.f22949g.setVisibility(0);
            this.f22949g.setTextSize((float) (((double) c7676d.f23795Z) * 0.85d));
            C4520n.m8234a(this.f22949g);
        }
        switch (c7676d.f21337w) {
            case ERROR:
                imageView = this.f22950h;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22950h;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22950h;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22950h;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7676d.f23793V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22952j.setVisibility(8);
                this.f22951i.setVisibility(0);
                this.f22948f.setVisibility(8);
                m20565a(c7676d, c7676d.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22952j.setVisibility(0);
                this.f22951i.setVisibility(0);
                this.f22951i.setImageResource(R.drawable.ic_file_stop_download);
                this.f22948f.setVisibility(0);
                this.f22948f.setText(c7676d.ab);
                if (c7676d.f23792U > 0) {
                    progressWheel = this.f22952j;
                    f = ((float) c7676d.f23792U) * 0.01f;
                } else {
                    progressWheel = this.f22952j;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22952j.setVisibility(8);
                this.f22951i.setVisibility(0);
                this.f22951i.setImageResource(R.drawable.ic_gif_white_32dp);
                this.f22948f.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7676d, this.f22958p, true);
    }
}
