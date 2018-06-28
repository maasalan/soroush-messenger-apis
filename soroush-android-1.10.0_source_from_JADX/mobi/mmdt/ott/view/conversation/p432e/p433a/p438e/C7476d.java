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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7611d;
import mobi.mmdt.ott.view.tools.C4520n;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7476d extends C7349b {
    private final int f22182e;
    private TextView f22183f;
    private ImageButton f22184g;
    private ProgressWheel f22185h;
    private C3284e f22186i;
    private C3283d f22187j;
    private GifImageView f22188k;
    private a f22189l;
    private RelativeLayout f22190m;
    private TextView f22191n;
    private boolean f22192o;
    private View f22193p;

    class C36791 implements OnClickListener {
        final /* synthetic */ C7476d f10932a;

        C36791(C7476d c7476d) {
            this.f10932a = c7476d;
        }

        public final void onClick(View view) {
            C7611d c7611d = (C7611d) this.f10932a.f16244a;
            switch (c7611d.ad) {
                case DELETED:
                case NOT_STARTED:
                    this.f10932a.f22186i.mo2307a(c7611d.f23088W, true);
                    return;
                case TRANSMITTING:
                    this.f10932a.f22186i.mo2305a(c7611d.f23088W);
                    return;
                case CANCEL:
                    this.f10932a.f22186i.mo2307a(c7611d.f23088W, true);
                    return;
                case ERROR:
                    this.f10932a.f22186i.mo2307a(c7611d.f23088W, true);
                    return;
                case FINISHED:
                    this.f10932a.f22187j.mo2319b(c7611d.f23374S, c7611d.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C36802 implements OnClickListener {
        final /* synthetic */ C7476d f10933a;

        C36802(C7476d c7476d) {
            this.f10933a = c7476d;
        }

        public final void onClick(View view) {
            C7611d c7611d = (C7611d) this.f10933a.f16244a;
            if (C36813.f10934a[c7611d.ad.ordinal()] == 6) {
                this.f10933a.f22187j.mo2319b(c7611d.f23374S, c7611d.f21334t);
            }
        }
    }

    public C7476d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7349b c7349b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_gif_captioned_channel_input_list_item : R.layout.chat_gif_captioned_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7349b.f22192o = C2535a.m6888a().au() ^ 1;
        c7349b.f22182e = i3;
        c7349b.f22186i = c3284e;
        c7349b.f22187j = c3283d;
        c7349b.f22183f = (TextView) c7349b.itemView.findViewById(R.id.caption_textView);
        c7349b.f22184g = (ImageButton) c7349b.itemView.findViewById(R.id.action_imageView);
        c7349b.f22185h = (ProgressWheel) c7349b.itemView.findViewById(R.id.progress_wheel);
        c7349b.f22188k = (GifImageView) c7349b.itemView.findViewById(R.id.content_gifView);
        c7349b.f22190m = (RelativeLayout) c7349b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7349b.f22191n = (TextView) c7349b.itemView.findViewById(R.id.progress_text_action_view);
        c7349b.f22193p = c7349b.itemView.findViewById(R.id.bottom_gradient_view);
        LayoutParams layoutParams = (LayoutParams) c7349b.f22188k.getLayoutParams();
        layoutParams.height = i2;
        if (c7349b.f22192o) {
            layoutParams.width = i3;
            m20101a(i3);
        }
        c7349b.f22184g.setOnClickListener(new C36791(c7349b));
        c7349b.f22188k.setOnClickListener(new C36802(c7349b));
    }

    private void m20101a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f22193p.getLayoutParams();
        layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageButton imageButton;
        super.mo3180a(c6829g);
        C7611d c7611d = (C7611d) c6829g;
        Uri a = C2613o.m7045a(c7611d.ad, c7611d.ae, c7611d.f23374S, c7611d.f23375T, c7611d.f21300A);
        if (a != null) {
            try {
                this.f22189l = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22188k != null) {
            if (this.f22189l != null) {
                this.f22188k.setImageDrawable(this.f22189l);
                if (this.f22189l != null) {
                    this.f22189l.stop();
                }
            } else if (a != null) {
                C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22188k);
            }
        }
        if (c7611d.f23371P > 0 && c7611d.f23372Q > 0) {
            Point b = C2491i.m6807b(this.f22182e, c7611d.f23371P, c7611d.f23372Q);
            LayoutParams layoutParams = (LayoutParams) this.f22188k.getLayoutParams();
            layoutParams.height = b.y;
            if (this.f22192o) {
                layoutParams.width = b.x;
                m20101a(b.x);
            }
        }
        if (c7611d.f23376U == null || c7611d.f23376U.isEmpty()) {
            this.f22183f.setVisibility(8);
        } else {
            this.f22183f.setText(c7611d.f23376U);
            this.f22183f.setVisibility(0);
            this.f22183f.setTextSize((float) c7611d.af);
            C4520n.m8234a(this.f22183f);
        }
        int i = C36813.f10934a[c7611d.ad.ordinal()];
        int i2 = R.drawable.ic_file_start_download;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.f22185h.setVisibility(8);
                this.f22184g.setVisibility(0);
                imageButton = this.f22184g;
                break;
            case 3:
                ProgressWheel progressWheel;
                float f;
                this.f22185h.setVisibility(0);
                this.f22184g.setVisibility(0);
                this.f22184g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22191n.setVisibility(0);
                this.f22191n.setText(c7611d.f23373R);
                if (c7611d.ac > 0) {
                    progressWheel = this.f22185h;
                    f = ((float) c7611d.ac) * 0.01f;
                } else {
                    progressWheel = this.f22185h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case 6:
                this.f22185h.setVisibility(8);
                this.f22184g.setVisibility(0);
                imageButton = this.f22184g;
                i2 = R.drawable.ic_gif_white_32dp;
                break;
            default:
                break;
        }
        imageButton.setImageResource(i2);
        this.f22191n.setVisibility(8);
        m19051a((C7358a) c7611d, this.f22190m, false);
    }
}
