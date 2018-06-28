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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7638e;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7503e extends C7351b {
    private final int f22509d;
    private final int f22510e;
    private GifImageView f22511f = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private ImageButton f22512g = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22513h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22514i;
    private C3283d f22515j;
    private a f22516k;
    private View f22517l = this.itemView.findViewById(R.id.bottom_gradient_view);
    private RelativeLayout f22518m = ((RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));
    private TextView f22519n = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));

    class C37861 implements OnClickListener {
        final /* synthetic */ C7503e f11123a;

        C37861(C7503e c7503e) {
            this.f11123a = c7503e;
        }

        public final void onClick(View view) {
            C7638e c7638e = (C7638e) this.f11123a.f16244a;
            switch (c7638e.aa) {
                case DELETED:
                case NOT_STARTED:
                    this.f11123a.f22514i.mo2307a(c7638e.f23101W, true);
                    return;
                case TRANSMITTING:
                    this.f11123a.f22514i.mo2305a(c7638e.f23101W);
                    return;
                case CANCEL:
                    this.f11123a.f22514i.mo2307a(c7638e.f23101W, true);
                    return;
                case ERROR:
                    this.f11123a.f22514i.mo2307a(c7638e.f23101W, true);
                    return;
                case FINISHED:
                    this.f11123a.f22515j.mo2319b(c7638e.f23531S, c7638e.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C37872 implements OnClickListener {
        final /* synthetic */ C7503e f11124a;

        C37872(C7503e c7503e) {
            this.f11124a = c7503e;
        }

        public final void onClick(View view) {
            C7638e c7638e = (C7638e) this.f11124a.f16244a;
            if (C37883.f11125a[c7638e.aa.ordinal()] == 6) {
                this.f11124a.f22515j.mo2319b(c7638e.f23531S, c7638e.f21334t);
            }
        }
    }

    public C7503e(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3288i c3288i, C3283d c3283d, C3286g c3286g) {
        int i3 = i;
        int i4 = i2;
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22509d = i4;
        this.f22510e = i3;
        this.f22514i = c3284e;
        this.f22515j = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22511f.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i3;
        LayoutParams layoutParams2 = (LayoutParams) this.f22517l.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i3;
        this.f22512g.setOnClickListener(new C37861(this));
        this.f22511f.setOnClickListener(new C37872(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageButton imageButton;
        super.mo3180a(c6829g);
        C7638e c7638e = (C7638e) c6829g;
        Uri a = C2613o.m7045a(c7638e.aa, c7638e.ab, c7638e.f23531S, c7638e.f23532T, c7638e.f21300A);
        if (a != null) {
            try {
                this.f22516k = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22511f != null) {
            if (this.f22516k != null) {
                this.f22511f.setImageDrawable(this.f22516k);
                if (this.f22516k != null) {
                    this.f22516k.stop();
                }
            } else if (a != null) {
                C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22511f);
            }
        }
        if (c7638e.f23528P > 0 && c7638e.f23529Q > 0) {
            Point b = C2491i.m6807b(this.f22510e, c7638e.f23528P, c7638e.f23529Q);
            LayoutParams layoutParams = (LayoutParams) this.f22511f.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22517l.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        int i = C37883.f11125a[c7638e.aa.ordinal()];
        int i2 = R.drawable.ic_file_start_download;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.f22513h.setVisibility(8);
                this.f22512g.setVisibility(0);
                imageButton = this.f22512g;
                break;
            case 3:
                ProgressWheel progressWheel;
                float f;
                this.f22513h.setVisibility(0);
                this.f22512g.setVisibility(0);
                this.f22512g.setImageResource(R.drawable.ic_file_stop_download);
                this.f22519n.setVisibility(0);
                this.f22519n.setText(c7638e.f23530R);
                if (c7638e.f23533U > 0) {
                    progressWheel = this.f22513h;
                    f = ((float) c7638e.f23533U) * 0.01f;
                } else {
                    progressWheel = this.f22513h;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case 6:
                this.f22513h.setVisibility(8);
                this.f22512g.setVisibility(0);
                imageButton = this.f22512g;
                i2 = R.drawable.ic_gif_white_32dp;
                break;
            default:
                break;
        }
        imageButton.setImageResource(i2);
        this.f22519n.setVisibility(8);
        m19051a((C7358a) c7638e, this.f22518m, false);
    }
}
