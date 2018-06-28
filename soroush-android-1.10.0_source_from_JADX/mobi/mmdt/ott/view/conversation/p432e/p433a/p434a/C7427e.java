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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7701e;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7427e extends C7345b {
    private final int f21580d;
    private GifImageView f21581e;
    private ImageButton f21582f;
    private ProgressWheel f21583g;
    private C3284e f21584h;
    private C3283d f21585i;
    private a f21586j;
    private RelativeLayout f21587k;
    private TextView f21588l;
    private boolean f21589m;
    private View f21590n;

    class C34921 implements OnClickListener {
        final /* synthetic */ C7427e f10638a;

        C34921(C7427e c7427e) {
            this.f10638a = c7427e;
        }

        public final void onClick(View view) {
            C7701e c7701e = (C7701e) this.f10638a.f16244a;
            switch (c7701e.f24149V) {
                case DELETED:
                case NOT_STARTED:
                    this.f10638a.f21584h.mo2307a(c7701e.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10638a.f21584h.mo2305a(c7701e.ac);
                    return;
                case CANCEL:
                    this.f10638a.f21584h.mo2307a(c7701e.ac, true);
                    return;
                case ERROR:
                    this.f10638a.f21584h.mo2307a(c7701e.ac, true);
                    return;
                case FINISHED:
                    this.f10638a.f21585i.mo2319b(c7701e.f24146S, c7701e.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C34932 implements OnClickListener {
        final /* synthetic */ C7427e f10639a;

        C34932(C7427e c7427e) {
            this.f10639a = c7427e;
        }

        public final void onClick(View view) {
            C7701e c7701e = (C7701e) this.f10639a.f16244a;
            if (C34943.f10640a[c7701e.f24149V.ordinal()] == 6) {
                this.f10639a.f21585i.mo2319b(c7701e.f24146S, c7701e.f21334t);
            }
        }
    }

    public C7427e(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        C7345b c7345b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_gif_channel_direct_input_list_item : R.layout.chat_gif_channel_direct_input_list_item_old, c3288i, c3286g, c3284e);
        c7345b.f21589m = C2535a.m6888a().au() ^ 1;
        c7345b.f21580d = i3;
        c7345b.f21584h = c3284e;
        c7345b.f21585i = c3283d;
        c7345b.f21581e = (GifImageView) c7345b.itemView.findViewById(R.id.content_gifView);
        c7345b.f21582f = (ImageButton) c7345b.itemView.findViewById(R.id.action_imageView);
        c7345b.f21583g = (ProgressWheel) c7345b.itemView.findViewById(R.id.progress_wheel);
        c7345b.f21587k = (RelativeLayout) c7345b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7345b.f21588l = (TextView) c7345b.itemView.findViewById(R.id.progress_text_action_view);
        c7345b.f21590n = c7345b.itemView.findViewById(R.id.bottom_gradient_view);
        LayoutParams layoutParams = (LayoutParams) c7345b.f21581e.getLayoutParams();
        layoutParams.height = i2;
        if (c7345b.f21589m) {
            layoutParams.width = i3;
            m19765a(i3);
        }
        c7345b.f21582f.setOnClickListener(new C34921(c7345b));
        c7345b.f21581e.setOnClickListener(new C34932(c7345b));
    }

    private void m19765a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f21590n.getLayoutParams();
        layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageButton imageButton;
        super.mo3180a(c6829g);
        C7701e c7701e = (C7701e) c6829g;
        Uri a = C2613o.m7045a(c7701e.f24149V, c7701e.f24150W, c7701e.f24146S, c7701e.f24147T, c7701e.f21300A);
        if (a != null) {
            try {
                this.f21586j = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f21581e != null) {
            if (this.f21586j != null) {
                this.f21581e.setImageDrawable(this.f21586j);
                if (this.f21586j != null) {
                    this.f21586j.stop();
                }
            } else if (a != null) {
                C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f21581e);
            }
        }
        if (c7701e.f24143P > 0 && c7701e.f24144Q > 0) {
            Point b = C2491i.m6807b(this.f21580d, c7701e.f24143P, c7701e.f24144Q);
            LayoutParams layoutParams = (LayoutParams) this.f21581e.getLayoutParams();
            layoutParams.height = b.y;
            if (this.f21589m) {
                layoutParams.width = b.x;
                m19765a(b.x);
            }
        }
        int i = C34943.f10640a[c7701e.f24149V.ordinal()];
        int i2 = R.drawable.ic_file_start_download;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.f21583g.setVisibility(8);
                this.f21582f.setVisibility(0);
                imageButton = this.f21582f;
                break;
            case 3:
                ProgressWheel progressWheel;
                float f;
                this.f21583g.setVisibility(0);
                this.f21582f.setVisibility(0);
                this.f21582f.setImageResource(R.drawable.ic_file_stop_download);
                this.f21588l.setVisibility(0);
                this.f21588l.setText(c7701e.f24145R);
                if (c7701e.f24148U > 0) {
                    progressWheel = this.f21583g;
                    f = ((float) c7701e.f24148U) * 0.01f;
                } else {
                    progressWheel = this.f21583g;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case 6:
                this.f21583g.setVisibility(8);
                this.f21582f.setVisibility(0);
                imageButton = this.f21582f;
                i2 = R.drawable.ic_gif_white_32dp;
                break;
            default:
                break;
        }
        imageButton.setImageResource(i2);
        this.f21588l.setVisibility(8);
        m19051a((C7358a) c7701e, this.f21587k, false);
    }
}
