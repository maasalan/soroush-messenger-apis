package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

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
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7637d;
import mobi.mmdt.ott.view.tools.C4520n;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7502d extends C7351b {
    private final int f22497d;
    private final int f22498e;
    private TextView f22499f = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private ImageButton f22500g = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22501h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22502i;
    private C3283d f22503j;
    private GifImageView f22504k = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f22505l;
    private View f22506m = this.itemView.findViewById(R.id.bottom_gradient_view);
    private RelativeLayout f22507n = ((RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private TextView f22508o = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C37831 implements OnClickListener {
        final /* synthetic */ C7502d f11120a;

        C37831(C7502d c7502d) {
            this.f11120a = c7502d;
        }

        public final void onClick(View view) {
            C7637d c7637d = (C7637d) this.f11120a.f16244a;
            switch (c7637d.ab) {
                case DELETED:
                case NOT_STARTED:
                    this.f11120a.f22502i.mo2307a(c7637d.f23101W, true);
                    return;
                case TRANSMITTING:
                    this.f11120a.f22502i.mo2305a(c7637d.f23101W);
                    return;
                case CANCEL:
                    this.f11120a.f22502i.mo2307a(c7637d.f23101W, true);
                    return;
                case ERROR:
                    this.f11120a.f22502i.mo2307a(c7637d.f23101W, true);
                    return;
                case FINISHED:
                    this.f11120a.f22503j.mo2319b(c7637d.f23525S, c7637d.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C37842 implements OnClickListener {
        final /* synthetic */ C7502d f11121a;

        C37842(C7502d c7502d) {
            this.f11121a = c7502d;
        }

        public final void onClick(View view) {
            C7637d c7637d = (C7637d) this.f11121a.f16244a;
            if (C37853.f11122a[c7637d.ab.ordinal()] == 6) {
                this.f11121a.f22503j.mo2319b(c7637d.f23525S, c7637d.f21334t);
            }
        }
    }

    public C7502d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_captioned_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22497d = i4;
        this.f22498e = i3;
        this.f22502i = c3284e;
        this.f22503j = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22504k.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f22506m.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f22500g.setOnClickListener(new C37831(this));
        this.f22504k.setOnClickListener(new C37842(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageButton imageButton;
        super.mo3180a(c6829g);
        C7637d c7637d = (C7637d) c6829g;
        Uri a = C2613o.m7045a(c7637d.ab, c7637d.ac, c7637d.f23525S, c7637d.f23526T, c7637d.f21300A);
        if (a != null) {
            try {
                this.f22505l = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22504k != null) {
            if (this.f22505l != null) {
                this.f22504k.setImageDrawable(this.f22505l);
                if (this.f22505l != null) {
                    this.f22505l.stop();
                }
            } else if (a != null) {
                C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22504k);
            }
        }
        if (c7637d.f23522P > 0 && c7637d.f23523Q > 0) {
            Point b = C2491i.m6807b(this.f22498e, c7637d.f23522P, c7637d.f23523Q);
            LayoutParams layoutParams = (LayoutParams) this.f22504k.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22506m.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        if (c7637d.f23527U == null || c7637d.f23527U.isEmpty()) {
            this.f22499f.setVisibility(8);
        } else {
            this.f22499f.setText(c7637d.f23527U);
            this.f22499f.setVisibility(0);
            this.f22499f.setTextSize((float) (((double) c7637d.ad) * 0.85d));
            C4520n.m8234a(this.f22499f);
        }
        int i = C37853.f11122a[c7637d.ab.ordinal()];
        int i2 = R.drawable.ic_file_start_download;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.f22501h.setVisibility(8);
                this.f22500g.setVisibility(0);
                imageButton = this.f22500g;
                break;
            case 3:
                ProgressWheel progressWheel;
                float f;
                this.f22501h.setVisibility(0);
                this.f22500g.setVisibility(0);
                this.f22500g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22508o.setVisibility(0);
                this.f22508o.setText(c7637d.f23524R);
                if (c7637d.aa > 0) {
                    progressWheel = this.f22501h;
                    f = ((float) c7637d.aa) * 0.01f;
                } else {
                    progressWheel = this.f22501h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case 6:
                this.f22501h.setVisibility(8);
                this.f22500g.setVisibility(0);
                imageButton = this.f22500g;
                i2 = R.drawable.ic_gif_white_32dp;
                break;
            default:
                break;
        }
        imageButton.setImageResource(i2);
        this.f22508o.setVisibility(8);
        m19051a((C7358a) c7637d, this.f22507n, false);
    }
}
