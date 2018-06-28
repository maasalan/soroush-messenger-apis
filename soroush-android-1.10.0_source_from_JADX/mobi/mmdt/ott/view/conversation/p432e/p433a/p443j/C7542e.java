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
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p432e.p433a.C7194a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7677e;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7542e extends C7354b {
    private final int f22959d;
    private final int f22960e;
    private TextView f22961f = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private ImageView f22962g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22963h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22964i = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22965j;
    private C3283d f22966k;
    private GifImageView f22967l = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f22968m;
    private View f22969n = this.itemView.findViewById(R.id.bottom_gradient_view);
    private LinearLayout f22970o = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C39381 implements OnClickListener {
        final /* synthetic */ C7542e f11395a;

        C39381(C7542e c7542e) {
            this.f11395a = c7542e;
        }

        public final void onClick(View view) {
            C7677e c7677e = (C7677e) this.f11395a.f16244a;
            switch (c7677e.f23802V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7677e.f23804Z == null || c7677e.f23804Z.isEmpty()) {
                        this.f11395a.f22965j.mo2307a(c7677e.mo3604b(), false);
                        return;
                    } else {
                        this.f11395a.f22965j.mo2307a(c7677e.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11395a.f22965j.mo2305a(c7677e.mo3604b());
                    return;
                case CANCEL:
                    if (c7677e.f23804Z == null || c7677e.f23804Z.isEmpty()) {
                        this.f11395a.f22965j.mo2307a(c7677e.mo3604b(), false);
                        return;
                    } else {
                        this.f11395a.f22965j.mo2307a(c7677e.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7677e.f23804Z == null || c7677e.f23804Z.isEmpty()) {
                        this.f11395a.f22965j.mo2307a(c7677e.mo3604b(), false);
                        return;
                    } else {
                        this.f11395a.f22965j.mo2307a(c7677e.mo3604b(), true);
                        return;
                    }
                case FINISHED:
                    this.f11395a.f22966k.mo2319b(c7677e.f23799S, c7677e.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C39392 implements OnClickListener {
        final /* synthetic */ C7542e f11396a;

        C39392(C7542e c7542e) {
            this.f11396a = c7542e;
        }

        public final void onClick(View view) {
            C7677e c7677e = (C7677e) this.f11396a.f16244a;
            if (c7677e.f23804Z != null && !c7677e.f23804Z.isEmpty()) {
                if (c7677e.f23802V == C2987i.FINISHED) {
                }
            } else if (C39403.f11397a[c7677e.f23802V.ordinal()] != 6) {
                return;
            }
            this.f11396a.f22966k.mo2319b(c7677e.f23799S, c7677e.f21334t);
        }
    }

    public C7542e(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_output_list_item, c3286g, c3284e);
        this.f22959d = i2;
        this.f22960e = i;
        this.f22965j = c3284e;
        this.f22966k = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22967l.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22969n.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22963h.setOnClickListener(new C39381(this));
        this.f22967l.setOnClickListener(new C39392(this));
    }

    private void m20569a(C7677e c7677e, C2971k c2971k) {
        boolean z = ((c7677e.f23804Z == null || c7677e.f23804Z.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22963h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7677e c7677e = (C7677e) c6829g;
        Uri a = C2613o.m7045a(c7677e.f23802V, c7677e.f23803Y, c7677e.f23799S, c7677e.f23800T, c7677e.f21300A);
        if (a != null) {
            try {
                this.f22968m = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22968m != null) {
            this.f22967l.setImageDrawable(this.f22968m);
            if (this.f22968m != null) {
                this.f22968m.stop();
            }
        } else if (a != null) {
            C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22967l);
        }
        if (c7677e.f23796P > 0 && c7677e.f23797Q > 0) {
            Point b = C2491i.m6807b(this.f22960e, c7677e.f23796P, c7677e.f23797Q);
            LayoutParams layoutParams = (LayoutParams) this.f22967l.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22969n.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        switch (c7677e.f21337w) {
            case ERROR:
                imageView = this.f22962g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22962g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22962g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22962g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7677e.f23802V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22964i.setVisibility(8);
                this.f22963h.setVisibility(0);
                this.f22961f.setVisibility(8);
                m20569a(c7677e, c7677e.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22964i.setVisibility(0);
                this.f22963h.setVisibility(0);
                this.f22963h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22961f.setVisibility(0);
                this.f22961f.setText(c7677e.f23798R);
                if (c7677e.f23801U > 0) {
                    progressWheel = this.f22964i;
                    f = ((float) c7677e.f23801U) * 0.01f;
                } else {
                    progressWheel = this.f22964i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22964i.setVisibility(8);
                this.f22963h.setVisibility(0);
                this.f22963h.setImageResource(R.drawable.ic_gif_white_32dp);
                this.f22961f.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7677e, this.f22970o, true);
    }
}
