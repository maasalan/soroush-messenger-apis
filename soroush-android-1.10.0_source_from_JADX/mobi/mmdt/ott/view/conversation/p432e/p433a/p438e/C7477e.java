package mobi.mmdt.ott.view.conversation.p432e.p433a.p438e;

import android.app.Activity;
import android.graphics.Point;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import java.io.IOException;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.af.C2613o;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7612e;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7477e extends C7349b {
    private final int f22194e;
    private GifImageView f22195f;
    private ImageButton f22196g;
    private ProgressWheel f22197h;
    private C3284e f22198i;
    private C3283d f22199j;
    private a f22200k;
    private RelativeLayout f22201l;
    private TextView f22202m;
    private boolean f22203n;
    private View f22204o;

    class C36821 implements OnClickListener {
        final /* synthetic */ C7477e f10935a;

        C36821(C7477e c7477e) {
            this.f10935a = c7477e;
        }

        public final void onClick(View view) {
            C7612e c7612e = (C7612e) this.f10935a.f16244a;
            switch (c7612e.ac) {
                case DELETED:
                case NOT_STARTED:
                    this.f10935a.f22198i.mo2307a(c7612e.f23088W, true);
                    return;
                case TRANSMITTING:
                    this.f10935a.f22198i.mo2305a(c7612e.f23088W);
                    return;
                case CANCEL:
                    this.f10935a.f22198i.mo2307a(c7612e.f23088W, true);
                    return;
                case ERROR:
                    this.f10935a.f22198i.mo2307a(c7612e.f23088W, true);
                    return;
                case FINISHED:
                    this.f10935a.f22199j.mo2319b(c7612e.f23380S, c7612e.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C36832 implements OnClickListener {
        final /* synthetic */ C7477e f10936a;

        C36832(C7477e c7477e) {
            this.f10936a = c7477e;
        }

        public final void onClick(View view) {
            C7612e c7612e = (C7612e) this.f10936a.f16244a;
            if (C36843.f10937a[c7612e.ac.ordinal()] == 6) {
                this.f10936a.f22199j.mo2319b(c7612e.f23380S, c7612e.f21334t);
            }
        }
    }

    public C7477e(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7349b c7349b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_gif_channel_input_list_item : R.layout.chat_gif_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22203n = C2535a.m6888a().au() ^ 1;
        c7349b.f22194e = i3;
        c7349b.f22198i = c3284e;
        c7349b.f22199j = c3283d;
        c7349b.f22195f = (GifImageView) c7349b.itemView.findViewById(R.id.content_gifView);
        c7349b.f22196g = (ImageButton) c7349b.itemView.findViewById(R.id.action_imageView);
        c7349b.f22197h = (ProgressWheel) c7349b.itemView.findViewById(R.id.progress_wheel);
        c7349b.f22201l = (RelativeLayout) c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22202m = (TextView) c7349b.itemView.findViewById(R.id.progress_text_action_view);
        c7349b.f22204o = c7349b.itemView.findViewById(R.id.bottom_gradient_view);
        LayoutParams layoutParams = (LayoutParams) c7349b.f22195f.getLayoutParams();
        layoutParams.height = i2;
        if (c7349b.f22203n) {
            layoutParams.width = i3;
            m20105a(i3);
        }
        c7349b.f22196g.setOnClickListener(new C36821(c7349b));
        c7349b.f22195f.setOnClickListener(new C36832(c7349b));
    }

    private void m20105a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f22204o.getLayoutParams();
        layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageButton imageButton;
        super.mo3180a(c6829g);
        C7612e c7612e = (C7612e) c6829g;
        Uri a = C2613o.m7045a(c7612e.ac, c7612e.ad, c7612e.f23380S, c7612e.f23381T, c7612e.f21300A);
        if (a != null) {
            try {
                this.f22200k = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22195f != null) {
            if (this.f22200k != null) {
                this.f22195f.setImageDrawable(this.f22200k);
                if (this.f22200k != null) {
                    this.f22200k.stop();
                }
            } else if (a != null) {
                C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22195f);
            }
        }
        if (c7612e.f23377P > 0 && c7612e.f23378Q > 0) {
            Point b = C2491i.m6807b(this.f22194e, c7612e.f23377P, c7612e.f23378Q);
            LayoutParams layoutParams = (LayoutParams) this.f22195f.getLayoutParams();
            layoutParams.height = b.y;
            if (this.f22203n) {
                layoutParams.width = b.x;
                m20105a(b.x);
            }
        }
        int i = C36843.f10937a[c7612e.ac.ordinal()];
        int i2 = R.drawable.ic_file_start_download;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.f22197h.setVisibility(8);
                this.f22196g.setVisibility(0);
                imageButton = this.f22196g;
                break;
            case 3:
                ProgressWheel progressWheel;
                float f;
                this.f22197h.setVisibility(0);
                this.f22196g.setVisibility(0);
                this.f22196g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22202m.setVisibility(0);
                this.f22202m.setText(c7612e.f23379R);
                if (c7612e.f23382U > 0) {
                    progressWheel = this.f22197h;
                    f = ((float) c7612e.f23382U) * 0.01f;
                } else {
                    progressWheel = this.f22197h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case 6:
                this.f22197h.setVisibility(8);
                this.f22196g.setVisibility(0);
                imageButton = this.f22196g;
                i2 = R.drawable.ic_gif_white_32dp;
                break;
            default:
                break;
        }
        imageButton.setImageResource(i2);
        this.f22202m.setVisibility(8);
        m19051a((C7358a) c7612e, this.f22201l, false);
    }
}
