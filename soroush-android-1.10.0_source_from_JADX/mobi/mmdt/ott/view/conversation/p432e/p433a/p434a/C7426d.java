package mobi.mmdt.ott.view.conversation.p432e.p433a.p434a;

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
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7700d;
import mobi.mmdt.ott.view.tools.C4520n;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7426d extends C7345b {
    private final int f21568d;
    private TextView f21569e;
    private TextView f21570f;
    private ImageButton f21571g;
    private ProgressWheel f21572h;
    private C3284e f21573i;
    private C3283d f21574j;
    private GifImageView f21575k;
    private a f21576l;
    private RelativeLayout f21577m;
    private boolean f21578n;
    private View f21579o;

    class C34891 implements OnClickListener {
        final /* synthetic */ C7426d f10635a;

        C34891(C7426d c7426d) {
            this.f10635a = c7426d;
        }

        public final void onClick(View view) {
            C7700d c7700d = (C7700d) this.f10635a.f16244a;
            switch (c7700d.f24140W) {
                case DELETED:
                case NOT_STARTED:
                    this.f10635a.f21573i.mo2307a(c7700d.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10635a.f21573i.mo2305a(c7700d.ac);
                    return;
                case CANCEL:
                    this.f10635a.f21573i.mo2307a(c7700d.ac, true);
                    return;
                case ERROR:
                    this.f10635a.f21573i.mo2307a(c7700d.ac, true);
                    return;
                case FINISHED:
                    this.f10635a.f21574j.mo2319b(c7700d.f24136S, c7700d.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C34902 implements OnClickListener {
        final /* synthetic */ C7426d f10636a;

        C34902(C7426d c7426d) {
            this.f10636a = c7426d;
        }

        public final void onClick(View view) {
            C7700d c7700d = (C7700d) this.f10636a.f16244a;
            if (C34913.f10637a[c7700d.f24140W.ordinal()] == 6) {
                this.f10636a.f21574j.mo2319b(c7700d.f24136S, c7700d.f21334t);
            }
        }
    }

    public C7426d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        C7345b c7345b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_gif_captioned_channel_direct_input_list_item : R.layout.chat_gif_captioned_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        c7345b.f21578n = C2535a.m6888a().au() ^ 1;
        c7345b.f21568d = i3;
        c7345b.f21573i = c3284e;
        c7345b.f21574j = c3283d;
        c7345b.f21570f = (TextView) c7345b.itemView.findViewById(R.id.caption_textView);
        c7345b.f21571g = (ImageButton) c7345b.itemView.findViewById(R.id.action_imageView);
        c7345b.f21572h = (ProgressWheel) c7345b.itemView.findViewById(R.id.progress_wheel);
        c7345b.f21575k = (GifImageView) c7345b.itemView.findViewById(R.id.content_gifView);
        c7345b.f21577m = (RelativeLayout) c7345b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7345b.f21569e = (TextView) c7345b.itemView.findViewById(R.id.progress_text_action_view);
        c7345b.f21579o = c7345b.itemView.findViewById(R.id.bottom_gradient_view);
        LayoutParams layoutParams = (LayoutParams) c7345b.f21575k.getLayoutParams();
        layoutParams.height = i2;
        if (c7345b.f21578n) {
            layoutParams.width = i3;
            m19761a(i3);
        }
        c7345b.f21571g.setOnClickListener(new C34891(c7345b));
        c7345b.f21575k.setOnClickListener(new C34902(c7345b));
    }

    private void m19761a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f21579o.getLayoutParams();
        layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageButton imageButton;
        super.mo3180a(c6829g);
        C7700d c7700d = (C7700d) c6829g;
        Uri a = C2613o.m7045a(c7700d.f24140W, c7700d.f24141X, c7700d.f24136S, c7700d.f24137T, c7700d.f21300A);
        if (a != null) {
            try {
                this.f21576l = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f21575k != null) {
            if (this.f21576l != null) {
                this.f21575k.setImageDrawable(this.f21576l);
                if (this.f21576l != null) {
                    this.f21576l.stop();
                }
            } else if (a != null) {
                C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f21575k);
            }
        }
        if (c7700d.f24133P > 0 && c7700d.f24134Q > 0) {
            Point b = C2491i.m6807b(this.f21568d, c7700d.f24133P, c7700d.f24134Q);
            LayoutParams layoutParams = (LayoutParams) this.f21575k.getLayoutParams();
            layoutParams.height = b.y;
            if (this.f21578n) {
                layoutParams.width = b.x;
                m19761a(b.x);
            }
        }
        if (c7700d.f24138U == null || c7700d.f24138U.isEmpty()) {
            this.f21570f.setVisibility(8);
        } else {
            this.f21570f.setText(c7700d.f24138U);
            this.f21570f.setVisibility(0);
            this.f21570f.setTextSize((float) c7700d.f24142Y);
            C4520n.m8234a(this.f21570f);
        }
        int i = C34913.f10637a[c7700d.f24140W.ordinal()];
        int i2 = R.drawable.ic_file_start_download;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.f21572h.setVisibility(8);
                this.f21571g.setVisibility(0);
                imageButton = this.f21571g;
                break;
            case 3:
                ProgressWheel progressWheel;
                float f;
                this.f21572h.setVisibility(0);
                this.f21571g.setVisibility(0);
                this.f21571g.setImageResource(R.drawable.ic_file_stop_download);
                this.f21569e.setVisibility(0);
                this.f21569e.setText(c7700d.f24135R);
                if (c7700d.f24139V > 0) {
                    progressWheel = this.f21572h;
                    f = ((float) c7700d.f24139V) * 0.01f;
                } else {
                    progressWheel = this.f21572h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case 6:
                this.f21572h.setVisibility(8);
                this.f21571g.setVisibility(0);
                imageButton = this.f21571g;
                i2 = R.drawable.ic_gif_white_32dp;
                break;
            default:
                break;
        }
        imageButton.setImageResource(i2);
        this.f21569e.setVisibility(8);
        m19051a((C7358a) c7700d, this.f21577m, false);
    }
}
