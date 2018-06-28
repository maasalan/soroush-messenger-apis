package mobi.mmdt.ott.view.conversation.p432e.p433a.p442i;

import android.app.Activity;
import android.graphics.Point;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.LinearLayout;
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
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7664e;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7529e extends C7353b {
    private final int f22809d;
    private final int f22810e;
    private TextView f22811f;
    private GifImageView f22812g;
    private ImageButton f22813h;
    private ProgressWheel f22814i;
    private C3284e f22815j;
    private C3283d f22816k;
    private a f22817l;
    private View f22818m = this.itemView.findViewById(R.id.bottom_gradient_view);
    private LinearLayout f22819n;

    class C38891 implements OnClickListener {
        final /* synthetic */ C7529e f11308a;

        C38891(C7529e c7529e) {
            this.f11308a = c7529e;
        }

        public final void onClick(View view) {
            C7664e c7664e = (C7664e) this.f11308a.f16244a;
            switch (c7664e.f23710Y) {
                case DELETED:
                case NOT_STARTED:
                    this.f11308a.f22815j.mo2307a(c7664e.mo3604b(), true);
                    return;
                case TRANSMITTING:
                    this.f11308a.f22815j.mo2305a(c7664e.mo3604b());
                    return;
                case CANCEL:
                    this.f11308a.f22815j.mo2307a(c7664e.mo3604b(), true);
                    return;
                case ERROR:
                    this.f11308a.f22815j.mo2307a(c7664e.mo3604b(), true);
                    return;
                case FINISHED:
                    this.f11308a.f22816k.mo2319b(c7664e.f23707S, c7664e.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C38902 implements OnClickListener {
        final /* synthetic */ C7529e f11309a;

        C38902(C7529e c7529e) {
            this.f11309a = c7529e;
        }

        public final void onClick(View view) {
            C7664e c7664e = (C7664e) this.f11309a.f16244a;
            if (C38913.f11310a[c7664e.f23710Y.ordinal()] == 6) {
                this.f11309a.f22816k.mo2319b(c7664e.f23707S, c7664e.f21334t);
            }
        }
    }

    public C7529e(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_input_list_item, c3286g, c3284e);
        this.f22809d = i2;
        this.f22810e = i;
        this.f22815j = c3284e;
        this.f22816k = c3283d;
        this.f22812g = (GifImageView) this.itemView.findViewById(R.id.content_gifView);
        this.f22811f = (TextView) this.itemView.findViewById(R.id.progress_text_action_view);
        this.f22813h = (ImageButton) this.itemView.findViewById(R.id.action_imageView);
        this.f22814i = (ProgressWheel) this.itemView.findViewById(R.id.progress_wheel);
        this.f22819n = (LinearLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background);
        LayoutParams layoutParams = (LayoutParams) this.f22812g.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22818m.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22813h.setOnClickListener(new C38891(this));
        this.f22812g.setOnClickListener(new C38902(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageButton imageButton;
        super.mo3180a(c6829g);
        C7664e c7664e = (C7664e) c6829g;
        Uri a = C2613o.m7045a(c7664e.f23710Y, c7664e.f23711Z, c7664e.f23707S, c7664e.f23708T, c7664e.f21300A);
        if (a != null) {
            try {
                this.f22817l = new a(a.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (this.f22812g != null) {
            if (this.f22817l != null) {
                this.f22812g.setImageDrawable(this.f22817l);
                if (this.f22817l != null) {
                    this.f22817l.stop();
                }
            } else if (a != null) {
                C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22812g);
            }
        }
        if (c7664e.f23704P > 0 && c7664e.f23705Q > 0) {
            Point b = C2491i.m6807b(this.f22810e, c7664e.f23704P, c7664e.f23705Q);
            LayoutParams layoutParams = (LayoutParams) this.f22812g.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22818m.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        int i = C38913.f11310a[c7664e.f23710Y.ordinal()];
        int i2 = R.drawable.ic_file_start_download;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.f22814i.setVisibility(8);
                this.f22813h.setVisibility(0);
                imageButton = this.f22813h;
                break;
            case 3:
                ProgressWheel progressWheel;
                float f;
                this.f22814i.setVisibility(0);
                this.f22813h.setVisibility(0);
                this.f22813h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22811f.setVisibility(0);
                this.f22811f.setText(c7664e.f23706R);
                if (c7664e.f23709U > 0) {
                    progressWheel = this.f22814i;
                    f = ((float) c7664e.f23709U) * 0.01f;
                } else {
                    progressWheel = this.f22814i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case 6:
                this.f22814i.setVisibility(8);
                this.f22813h.setVisibility(0);
                imageButton = this.f22813h;
                i2 = R.drawable.ic_gif_white_32dp;
                break;
            default:
                break;
        }
        imageButton.setImageResource(i2);
        this.f22811f.setVisibility(8);
        m19051a((C7358a) c7664e, this.f22819n, false);
    }
}
