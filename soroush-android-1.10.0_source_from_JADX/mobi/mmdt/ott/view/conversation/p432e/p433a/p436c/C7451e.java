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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7586e;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7451e extends C7347b {
    private final int f21879e;
    private GifImageView f21880f;
    private ImageButton f21881g;
    private ProgressWheel f21882h;
    private C3284e f21883i;
    private C3283d f21884j;
    private a f21885k;
    private RelativeLayout f21886l;
    private TextView f21887m;
    private boolean f21888n;
    private View f21889o;

    class C35761 implements OnClickListener {
        final /* synthetic */ C7451e f10744a;

        C35761(C7451e c7451e) {
            this.f10744a = c7451e;
        }

        public final void onClick(View view) {
            C7586e c7586e = (C7586e) this.f10744a.f16244a;
            switch (c7586e.f23170V) {
                case DELETED:
                case NOT_STARTED:
                    this.f10744a.f21883i.mo2307a(c7586e.ac, true);
                    return;
                case TRANSMITTING:
                    this.f10744a.f21883i.mo2305a(c7586e.ac);
                    return;
                case CANCEL:
                    this.f10744a.f21883i.mo2307a(c7586e.ac, true);
                    return;
                case ERROR:
                    this.f10744a.f21883i.mo2307a(c7586e.ac, true);
                    return;
                case FINISHED:
                    this.f10744a.f21884j.mo2319b(c7586e.f23167S, c7586e.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C35772 implements OnClickListener {
        final /* synthetic */ C7451e f10745a;

        C35772(C7451e c7451e) {
            this.f10745a = c7451e;
        }

        public final void onClick(View view) {
            C7586e c7586e = (C7586e) this.f10745a.f16244a;
            if (C35783.f10746a[c7586e.f23170V.ordinal()] == 6) {
                this.f10745a.f21884j.mo2319b(c7586e.f23167S, c7586e.f21334t);
            }
        }
    }

    public C7451e(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3280a c3280a, C3283d c3283d, C3286g c3286g) {
        C7347b c7347b = this;
        int i3 = i;
        super(activity, layoutInflater, viewGroup, C2535a.m6888a().au() ? R.layout.chat_gif_channel_input_list_item : R.layout.chat_gif_channel_input_list_item_old, c3280a, c3286g, c3284e);
        c7347b.f21888n = C2535a.m6888a().au() ^ 1;
        c7347b.f21879e = i3;
        c7347b.f21883i = c3284e;
        c7347b.f21884j = c3283d;
        c7347b.f21880f = (GifImageView) c7347b.itemView.findViewById(R.id.content_gifView);
        c7347b.f21881g = (ImageButton) c7347b.itemView.findViewById(R.id.action_imageView);
        c7347b.f21882h = (ProgressWheel) c7347b.itemView.findViewById(R.id.progress_wheel);
        c7347b.f21889o = c7347b.itemView.findViewById(R.id.bottom_gradient_view);
        c7347b.f21886l = (RelativeLayout) c7347b.itemView.findViewById(R.id.layout_balloon_chat_background);
        c7347b.f21887m = (TextView) c7347b.itemView.findViewById(R.id.progress_text_action_view);
        LayoutParams layoutParams = (LayoutParams) c7347b.f21880f.getLayoutParams();
        layoutParams.height = i2;
        if (c7347b.f21888n) {
            layoutParams.width = i3;
            m19928a(i3);
        }
        c7347b.f21881g.setOnClickListener(new C35761(c7347b));
        c7347b.f21880f.setOnClickListener(new C35772(c7347b));
    }

    private void m19928a(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f21889o.getLayoutParams();
        layoutParams.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams.width = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageButton imageButton;
        super.mo3180a(c6829g);
        C7586e c7586e = (C7586e) c6829g;
        Uri a = C2613o.m7045a(c7586e.f23170V, c7586e.f23171W, c7586e.f23167S, c7586e.f23168T, c7586e.f21300A);
        if (a != null) {
            try {
                this.f21885k = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f21880f != null) {
            if (this.f21885k != null) {
                this.f21880f.setImageDrawable(this.f21885k);
                if (this.f21885k != null) {
                    this.f21885k.stop();
                }
            } else if (a != null) {
                C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f21880f);
            }
        }
        if (c7586e.f23164P > 0 && c7586e.f23165Q > 0) {
            Point b = C2491i.m6807b(this.f21879e, c7586e.f23164P, c7586e.f23165Q);
            LayoutParams layoutParams = (LayoutParams) this.f21880f.getLayoutParams();
            layoutParams.height = b.y;
            if (this.f21888n) {
                layoutParams.width = b.x;
                m19928a(b.x);
            }
        }
        int i = C35783.f10746a[c7586e.f23170V.ordinal()];
        int i2 = R.drawable.ic_file_start_download;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.f21882h.setVisibility(8);
                this.f21881g.setVisibility(0);
                imageButton = this.f21881g;
                break;
            case 3:
                ProgressWheel progressWheel;
                float f;
                this.f21882h.setVisibility(0);
                this.f21881g.setVisibility(0);
                this.f21881g.setImageResource(R.drawable.ic_file_stop_download);
                this.f21887m.setVisibility(0);
                this.f21887m.setText(c7586e.f23166R);
                if (c7586e.f23169U > 0) {
                    progressWheel = this.f21882h;
                    f = ((float) c7586e.f23169U) * 0.01f;
                } else {
                    progressWheel = this.f21882h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case 6:
                this.f21882h.setVisibility(8);
                this.f21881g.setVisibility(0);
                imageButton = this.f21881g;
                i2 = R.drawable.ic_gif_white_32dp;
                break;
            default:
                break;
        }
        imageButton.setImageResource(i2);
        this.f21887m.setVisibility(8);
        m19051a((C7358a) c7586e, this.f21886l, false);
    }
}
