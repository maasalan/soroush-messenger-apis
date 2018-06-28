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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7625e;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7490e extends C7350b {
    private final int f22350e;
    private final int f22351f;
    private ImageView f22352g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22353h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private TextView f22354i = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private ProgressWheel f22355j = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22356k;
    private C3283d f22357l;
    private GifImageView f22358m = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f22359n;
    private View f22360o = this.itemView.findViewById(R.id.bottom_gradient_view);
    private LinearLayout f22361p = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C37311 implements OnClickListener {
        final /* synthetic */ C7490e f11022a;

        C37311(C7490e c7490e) {
            this.f11022a = c7490e;
        }

        public final void onClick(View view) {
            C7625e c7625e = (C7625e) this.f11022a.f16244a;
            switch (c7625e.f23456V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7625e.ab == null || c7625e.ab.isEmpty()) {
                        this.f11022a.f22356k.mo2307a(c7625e.f23095W, false);
                        return;
                    } else {
                        this.f11022a.f22356k.mo2307a(c7625e.f23095W, true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11022a.f22356k.mo2305a(c7625e.f23095W);
                    return;
                case CANCEL:
                    if (c7625e.ab == null || c7625e.ab.isEmpty()) {
                        this.f11022a.f22356k.mo2307a(c7625e.f23095W, false);
                        return;
                    } else {
                        this.f11022a.f22356k.mo2307a(c7625e.f23095W, true);
                        return;
                    }
                case ERROR:
                    if (c7625e.ab == null || c7625e.ab.isEmpty()) {
                        this.f11022a.f22356k.mo2307a(c7625e.f23095W, false);
                        return;
                    } else {
                        this.f11022a.f22356k.mo2307a(c7625e.f23095W, true);
                        return;
                    }
                case FINISHED:
                    this.f11022a.f22357l.mo2319b(c7625e.f23453S, c7625e.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C37322 implements OnClickListener {
        final /* synthetic */ C7490e f11023a;

        C37322(C7490e c7490e) {
            this.f11023a = c7490e;
        }

        public final void onClick(View view) {
            C7625e c7625e = (C7625e) this.f11023a.f16244a;
            if (c7625e.ab != null && !c7625e.ab.isEmpty()) {
                if (c7625e.f23456V == C2987i.FINISHED) {
                }
            } else if (C37333.f11024a[c7625e.f23456V.ordinal()] != 6) {
                return;
            }
            this.f11023a.f22357l.mo2319b(c7625e.f23453S, c7625e.f21334t);
        }
    }

    public C7490e(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3280a c3280a, C3286g c3286g) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22350e = i3;
        this.f22351f = i4;
        this.f22356k = c3284e;
        this.f22357l = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22358m.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f22360o.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f22353h.setOnClickListener(new C37311(this));
        this.f22358m.setOnClickListener(new C37322(this));
    }

    private void m20192a(C7625e c7625e, C2971k c2971k) {
        boolean z = ((c7625e.ab == null || c7625e.ab.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22353h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7625e c7625e = (C7625e) c6829g;
        Uri a = C2613o.m7045a(c7625e.f23456V, c7625e.aa, c7625e.f23453S, c7625e.f23454T, c7625e.f21300A);
        if (a != null) {
            try {
                this.f22359n = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22359n != null) {
            this.f22358m.setImageDrawable(this.f22359n);
            if (this.f22359n != null) {
                this.f22359n.stop();
            }
        } else if (a != null) {
            C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22358m);
        }
        if (c7625e.f23450P > 0 && c7625e.f23451Q > 0) {
            Point b = C2491i.m6807b(this.f22350e, c7625e.f23450P, c7625e.f23451Q);
            LayoutParams layoutParams = (LayoutParams) this.f22358m.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22360o.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        switch (c7625e.f21337w) {
            case ERROR:
                imageView = this.f22352g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22352g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22352g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22352g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7625e.f23456V) {
            case DELETED:
            case NOT_STARTED:
                this.f22355j.setVisibility(8);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22355j.setVisibility(0);
                this.f22353h.setVisibility(0);
                this.f22353h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22354i.setVisibility(0);
                this.f22354i.setText(c7625e.f23452R);
                if (c7625e.f23455U > 0) {
                    progressWheel = this.f22355j;
                    f = ((float) c7625e.f23455U) * 0.01f;
                } else {
                    progressWheel = this.f22355j;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case CANCEL:
            case ERROR:
                break;
            case FINISHED:
                this.f22355j.setVisibility(8);
                this.f22353h.setVisibility(0);
                this.f22353h.setImageResource(R.drawable.ic_gif_white_32dp);
                this.f22354i.setVisibility(8);
                break;
            default:
                break;
        }
        this.f22355j.setVisibility(8);
        this.f22353h.setVisibility(0);
        this.f22354i.setVisibility(8);
        m20192a(c7625e, c7625e.f21337w);
        m19051a((C7358a) c7625e, this.f22361p, true);
    }
}
