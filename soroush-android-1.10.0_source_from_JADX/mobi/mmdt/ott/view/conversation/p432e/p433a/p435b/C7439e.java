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
import android.widget.LinearLayout;
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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7713e;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7439e extends C7346b {
    private final int f21729e;
    private final int f21730f;
    private ImageView f21731g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f21732h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f21733i = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private TextView f21734j = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private C3284e f21735k;
    private C3283d f21736l;
    private GifImageView f21737m = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f21738n;
    private View f21739o = this.itemView.findViewById(R.id.bottom_gradient_view);
    private LinearLayout f21740p = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C35301 implements OnClickListener {
        final /* synthetic */ C7439e f10683a;

        C35301(C7439e c7439e) {
            this.f10683a = c7439e;
        }

        public final void onClick(View view) {
            C7713e c7713e = (C7713e) this.f10683a.f16244a;
            switch (c7713e.f24253V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7713e.f24255X == null || c7713e.f24255X.isEmpty()) {
                        this.f10683a.f21735k.mo2307a(c7713e.ac, false);
                        return;
                    } else {
                        this.f10683a.f21735k.mo2307a(c7713e.ac, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f10683a.f21735k.mo2305a(c7713e.ac);
                    return;
                case CANCEL:
                    if (c7713e.f24255X == null || c7713e.f24255X.isEmpty()) {
                        this.f10683a.f21735k.mo2307a(c7713e.ac, false);
                        return;
                    } else {
                        this.f10683a.f21735k.mo2307a(c7713e.ac, true);
                        return;
                    }
                case ERROR:
                    if (c7713e.f24255X != null && !c7713e.f24255X.isEmpty()) {
                        this.f10683a.f21735k.mo2307a(c7713e.ac, true);
                        break;
                    } else {
                        this.f10683a.f21735k.mo2307a(c7713e.ac, false);
                        break;
                    }
                    break;
                case FINISHED:
                    break;
                default:
                    return;
            }
            this.f10683a.f21736l.mo2319b(c7713e.f24250S, c7713e.f21334t);
        }
    }

    class C35312 implements OnClickListener {
        final /* synthetic */ C7439e f10684a;

        C35312(C7439e c7439e) {
            this.f10684a = c7439e;
        }

        public final void onClick(View view) {
            C7713e c7713e = (C7713e) this.f10684a.f16244a;
            if (c7713e.f24255X == null || c7713e.f24255X.isEmpty()) {
                int[] iArr = C35323.f10685a;
                c7713e.f24253V.ordinal();
                this.f10684a.f21736l.mo2319b(c7713e.f24250S, c7713e.f21334t);
            } else if (c7713e.f24253V == C2987i.FINISHED) {
                this.f10684a.f21736l.mo2319b(c7713e.f24250S, c7713e.f21334t);
            }
        }
    }

    public C7439e(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_channel_direct_output_list_item, c3280a, c3286g, c3284e);
        this.f21729e = i3;
        this.f21730f = i4;
        this.f21735k = c3284e;
        this.f21736l = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f21737m.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f21739o.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f21732h.setOnClickListener(new C35301(this));
        this.f21737m.setOnClickListener(new C35312(this));
    }

    private void m19846a(C7713e c7713e, C2971k c2971k) {
        boolean z = ((c7713e.f24255X == null || c7713e.f24255X.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f21732h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7713e c7713e = (C7713e) c6829g;
        Uri a = C2613o.m7045a(c7713e.f24253V, c7713e.f24254W, c7713e.f24250S, c7713e.f24251T, c7713e.f21300A);
        if (a != null) {
            try {
                this.f21738n = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f21738n != null) {
            this.f21737m.setImageDrawable(this.f21738n);
            if (this.f21738n != null) {
                this.f21738n.stop();
            }
        } else if (a != null) {
            C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f21737m);
        }
        if (c7713e.f24247P > 0 && c7713e.f24248Q > 0) {
            Point b = C2491i.m6807b(this.f21729e, c7713e.f24247P, c7713e.f24248Q);
            LayoutParams layoutParams = (LayoutParams) this.f21737m.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f21739o.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        switch (c7713e.f21337w) {
            case ERROR:
                imageView = this.f21731g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21731g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21731g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21731g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7713e.f24253V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f21733i.setVisibility(8);
                this.f21732h.setVisibility(0);
                this.f21734j.setVisibility(8);
                m19846a(c7713e, c7713e.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f21733i.setVisibility(0);
                this.f21732h.setVisibility(0);
                this.f21732h.setImageResource(R.drawable.ic_file_stop_download);
                this.f21734j.setVisibility(0);
                this.f21734j.setText(c7713e.f24249R);
                if (c7713e.f24252U > 0) {
                    progressWheel = this.f21733i;
                    f = ((float) c7713e.f24252U) * 0.01f;
                } else {
                    progressWheel = this.f21733i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f21733i.setVisibility(8);
                this.f21732h.setVisibility(0);
                this.f21732h.setImageResource(R.drawable.ic_gif_white_32dp);
                this.f21734j.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7713e, this.f21740p, true);
    }
}
