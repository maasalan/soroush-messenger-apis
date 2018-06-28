package mobi.mmdt.ott.view.conversation.p432e.p433a.p436c;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7585d;
import mobi.mmdt.ott.view.tools.C4520n;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7450d extends C7347b {
    private final int f21867e;
    private TextView f21868f;
    private ImageButton f21869g;
    private ProgressWheel f21870h;
    private C3284e f21871i;
    private C3283d f21872j;
    private GifImageView f21873k;
    private a f21874l;
    private RelativeLayout f21875m;
    private TextView f21876n;
    private boolean f21877o;
    private View f21878p;

    class C35731 implements OnClickListener {
        final /* synthetic */ C7450d f10741a;

        C35731(C7450d c7450d) {
            this.f10741a = c7450d;
        }

        public final void onClick(View view) {
            C7585d c7585d = (C7585d) this.f10741a.f16244a;
            switch (c7585d.f23161W) {
                case DELETED:
                case NOT_STARTED:
                    this.f10741a.f21871i.mo2307a(c7585d.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10741a.f21871i.mo2305a(c7585d.ac);
                    return;
                case CANCEL:
                    this.f10741a.f21871i.mo2307a(c7585d.ac, true);
                    return;
                case ERROR:
                    this.f10741a.f21871i.mo2307a(c7585d.ac, true);
                    return;
                case FINISHED:
                    this.f10741a.f21872j.mo2319b(c7585d.f23157S, c7585d.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C35742 implements OnClickListener {
        final /* synthetic */ C7450d f10742a;

        C35742(C7450d c7450d) {
            this.f10742a = c7450d;
        }

        public final void onClick(View view) {
            C7585d c7585d = (C7585d) this.f10742a.f16244a;
            if (C35753.f10743a[c7585d.f23161W.ordinal()] == 6) {
                this.f10742a.f21872j.mo2319b(c7585d.f23157S, c7585d.f21334t);
            }
        }
    }

    public C7450d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7347b c7347b = this;
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_gif_captioned_channel_input_list_item : R.layout.chat_gif_captioned_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21877o = C2535a.m6888a().au() ^ 1;
        c7347b.f21867e = i3;
        c7347b.f21871i = c3284e;
        c7347b.f21872j = c3283d;
        c7347b.f21868f = (TextView) c7347b.itemView.findViewById(R.id.caption_textView);
        c7347b.f21869g = (ImageButton) c7347b.itemView.findViewById(R.id.action_imageView);
        c7347b.f21870h = (ProgressWheel) c7347b.itemView.findViewById(R.id.progress_wheel);
        c7347b.f21873k = (GifImageView) c7347b.itemView.findViewById(R.id.content_gifView);
        c7347b.f21875m = (RelativeLayout) c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7347b.f21876n = (TextView) c7347b.itemView.findViewById(R.id.progress_text_action_view);
        c7347b.f21878p = c7347b.itemView.findViewById(R.id.bottom_gradient_view);
        LayoutParams layoutParams = (LayoutParams) c7347b.f21873k.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.height = i4;
        if (c7347b.f21877o) {
            layoutParams.width = i3;
            m19924a(i3);
        }
        c7347b.f21869g.setOnClickListener(new C35731(c7347b));
        c7347b.f21873k.setOnClickListener(new C35742(c7347b));
    }

    private void m19924a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f21878p.getLayoutParams();
        layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageButton imageButton;
        super.mo3180a(c6829g);
        C7585d c7585d = (C7585d) c6829g;
        Uri a = C2613o.m7045a(c7585d.f23161W, c7585d.f23162X, c7585d.f23157S, c7585d.f23158T, c7585d.f21300A);
        if (a != null) {
            try {
                this.f21874l = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f21873k != null) {
            if (this.f21874l != null) {
                this.f21873k.setImageDrawable(this.f21874l);
                if (this.f21874l != null) {
                    this.f21874l.stop();
                }
            } else if (a != null) {
                C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f21873k);
            }
        }
        if (c7585d.f23154P > 0 && c7585d.f23155Q > 0) {
            Point b = C2491i.m6807b(this.f21867e, c7585d.f23154P, c7585d.f23155Q);
            LayoutParams layoutParams = (LayoutParams) this.f21873k.getLayoutParams();
            layoutParams.height = b.y;
            if (this.f21877o) {
                layoutParams.width = b.x;
                m19924a(b.x);
            }
        }
        if (c7585d.f23159U == null || c7585d.f23159U.isEmpty()) {
            this.f21868f.setVisibility(8);
        } else {
            this.f21868f.setText(c7585d.f23159U);
            this.f21868f.setVisibility(0);
            this.f21868f.setTextSize((float) c7585d.f23163Y);
            C4520n.m8234a(this.f21868f);
        }
        int i = C35753.f10743a[c7585d.f23161W.ordinal()];
        int i2 = R.drawable.ic_file_start_download;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.f21870h.setVisibility(8);
                this.f21869g.setVisibility(0);
                imageButton = this.f21869g;
                break;
            case 3:
                ProgressWheel progressWheel;
                float f;
                this.f21870h.setVisibility(0);
                this.f21869g.setVisibility(0);
                this.f21869g.setImageResource(R.drawable.ic_file_stop_download);
                this.f21876n.setVisibility(0);
                this.f21876n.setText(c7585d.f23156R);
                if (c7585d.f23160V > 0) {
                    progressWheel = this.f21870h;
                    f = ((float) c7585d.f23160V) * 0.01f;
                } else {
                    progressWheel = this.f21870h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case 6:
                this.f21870h.setVisibility(8);
                this.f21869g.setVisibility(0);
                imageButton = this.f21869g;
                i2 = R.drawable.ic_gif_white_32dp;
                break;
            default:
                break;
        }
        imageButton.setImageResource(i2);
        this.f21876n.setVisibility(8);
        m19051a((C7358a) c7585d, this.f21875m, false);
    }
}
