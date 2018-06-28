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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7651e;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7516e extends C7352b {
    private final int f22657d;
    private final int f22658e;
    private TextView f22659f = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private ImageView f22660g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ImageButton f22661h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22662i = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22663j;
    private C3283d f22664k;
    private GifImageView f22665l = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f22666m;
    private View f22667n = this.itemView.findViewById(R.id.bottom_gradient_view);
    private LinearLayout f22668o = ((LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C38351 implements OnClickListener {
        final /* synthetic */ C7516e f11210a;

        C38351(C7516e c7516e) {
            this.f11210a = c7516e;
        }

        public final void onClick(View view) {
            C7651e c7651e = (C7651e) this.f11210a.f16244a;
            switch (c7651e.f23613V) {
                case DELETED:
                case NOT_STARTED:
                    if (c7651e.f23615Z == null || c7651e.f23615Z.isEmpty()) {
                        this.f11210a.f22663j.mo2307a(c7651e.mo3604b(), false);
                        return;
                    } else {
                        this.f11210a.f22663j.mo2307a(c7651e.mo3604b(), true);
                        return;
                    }
                case TRANSMITTING:
                    this.f11210a.f22663j.mo2305a(c7651e.mo3604b());
                    return;
                case CANCEL:
                    if (c7651e.f23615Z == null || c7651e.f23615Z.isEmpty()) {
                        this.f11210a.f22663j.mo2307a(c7651e.mo3604b(), false);
                        return;
                    } else {
                        this.f11210a.f22663j.mo2307a(c7651e.mo3604b(), true);
                        return;
                    }
                case ERROR:
                    if (c7651e.f23615Z == null || c7651e.f23615Z.isEmpty()) {
                        this.f11210a.f22663j.mo2307a(c7651e.mo3604b(), false);
                        return;
                    } else {
                        this.f11210a.f22663j.mo2307a(c7651e.mo3604b(), true);
                        return;
                    }
                case FINISHED:
                    this.f11210a.f22664k.mo2319b(c7651e.f23610S, c7651e.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C38362 implements OnClickListener {
        final /* synthetic */ C7516e f11211a;

        C38362(C7516e c7516e) {
            this.f11211a = c7516e;
        }

        public final void onClick(View view) {
            C7651e c7651e = (C7651e) this.f11211a.f16244a;
            if (c7651e.f23615Z != null && !c7651e.f23615Z.isEmpty()) {
                if (c7651e.f23613V == C2987i.FINISHED) {
                }
            } else if (C38373.f11212a[c7651e.f23613V.ordinal()] != 6) {
                return;
            }
            this.f11211a.f22664k.mo2319b(c7651e.f23610S, c7651e.f21334t);
        }
    }

    public C7516e(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_output_list_item, c3286g, c3284e);
        this.f22657d = i2;
        this.f22658e = i;
        this.f22663j = c3284e;
        this.f22664k = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22665l.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22667n.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22661h.setOnClickListener(new C38351(this));
        this.f22665l.setOnClickListener(new C38362(this));
    }

    private void m20375a(C7651e c7651e, C2971k c2971k) {
        boolean z = ((c7651e.f23615Z == null || c7651e.f23615Z.isEmpty()) && (c2971k.equals(C2971k.SENDING) || c2971k.equals(C2971k.ERROR))) ? false : true;
        C7194a.m19032a(this.f22661h, z);
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        int i;
        super.mo3180a(c6829g);
        C7651e c7651e = (C7651e) c6829g;
        Uri a = C2613o.m7045a(c7651e.f23613V, c7651e.f23614Y, c7651e.f23610S, c7651e.f23611T, c7651e.f21300A);
        if (a != null) {
            try {
                this.f22666m = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22666m != null) {
            this.f22665l.setImageDrawable(this.f22666m);
            if (this.f22666m != null) {
                this.f22666m.stop();
            }
        } else if (a != null) {
            C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22665l);
        }
        if (c7651e.f23607P > 0 && c7651e.f23608Q > 0) {
            Point b = C2491i.m6807b(this.f22658e, c7651e.f23607P, c7651e.f23608Q);
            LayoutParams layoutParams = (LayoutParams) this.f22665l.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22667n.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        switch (c7651e.f21337w) {
            case ERROR:
                imageView = this.f22660g;
                i = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22660g;
                i = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22660g;
                i = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22660g;
                i = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i);
        switch (c7651e.f23613V) {
            case DELETED:
            case NOT_STARTED:
            case CANCEL:
            case ERROR:
                this.f22662i.setVisibility(8);
                this.f22661h.setVisibility(0);
                this.f22659f.setVisibility(8);
                m20375a(c7651e, c7651e.f21337w);
                break;
            case TRANSMITTING:
                ProgressWheel progressWheel;
                float f;
                this.f22662i.setVisibility(0);
                this.f22661h.setVisibility(0);
                this.f22661h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22659f.setVisibility(0);
                this.f22659f.setText(c7651e.f23609R);
                if (c7651e.f23612U > 0) {
                    progressWheel = this.f22662i;
                    f = ((float) c7651e.f23612U) * 0.01f;
                } else {
                    progressWheel = this.f22662i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case FINISHED:
                this.f22662i.setVisibility(8);
                this.f22661h.setVisibility(0);
                this.f22661h.setImageResource(R.drawable.ic_gif_white_32dp);
                this.f22659f.setVisibility(8);
                break;
            default:
                break;
        }
        m19051a((C7358a) c7651e, this.f22668o, true);
    }
}
