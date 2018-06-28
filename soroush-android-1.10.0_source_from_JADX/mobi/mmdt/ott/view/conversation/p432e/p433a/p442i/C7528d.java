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
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p261a.af.C2613o;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3283d;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7663d;
import mobi.mmdt.ott.view.tools.C4520n;
import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.a;

public final class C7528d extends C7353b {
    private final int f22797d;
    private final int f22798e;
    private TextView f22799f = ((TextView) this.itemView.findViewById(R.id.progress_text_action_view));
    private TextView f22800g = ((TextView) this.itemView.findViewById(R.id.caption_textView));
    private ImageButton f22801h = ((ImageButton) this.itemView.findViewById(R.id.action_imageView));
    private ProgressWheel f22802i = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private C3284e f22803j;
    private C3283d f22804k;
    private GifImageView f22805l = ((GifImageView) this.itemView.findViewById(R.id.content_gifView));
    private a f22806m;
    private View f22807n = this.itemView.findViewById(R.id.bottom_gradient_view);
    private RelativeLayout f22808o = ((RelativeLayout) this.itemView.findViewById(R.id.layout_balloon_chat_background));

    class C38861 implements OnClickListener {
        final /* synthetic */ C7528d f11305a;

        C38861(C7528d c7528d) {
            this.f11305a = c7528d;
        }

        public final void onClick(View view) {
            C7663d c7663d = (C7663d) this.f11305a.f16244a;
            switch (c7663d.f23703Z) {
                case DELETED:
                case NOT_STARTED:
                    this.f11305a.f22803j.mo2307a(c7663d.mo3604b(), true);
                    return;
                case TRANSMITTING:
                    this.f11305a.f22803j.mo2305a(c7663d.mo3604b());
                    return;
                case CANCEL:
                    this.f11305a.f22803j.mo2307a(c7663d.mo3604b(), true);
                    return;
                case ERROR:
                    this.f11305a.f22803j.mo2307a(c7663d.mo3604b(), true);
                    return;
                case FINISHED:
                    this.f11305a.f22804k.mo2319b(c7663d.f23699S, c7663d.f21334t);
                    return;
                default:
                    return;
            }
        }
    }

    class C38872 implements OnClickListener {
        final /* synthetic */ C7528d f11306a;

        C38872(C7528d c7528d) {
            this.f11306a = c7528d;
        }

        public final void onClick(View view) {
            C7663d c7663d = (C7663d) this.f11306a.f16244a;
            if (C38883.f11307a[c7663d.f23703Z.ordinal()] == 6) {
                this.f11306a.f22804k.mo2319b(c7663d.f23699S, c7663d.f21334t);
            }
        }
    }

    public C7528d(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2, C3284e c3284e, C3283d c3283d, C3286g c3286g) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_gif_captioned_input_list_item, c3286g, c3284e);
        this.f22797d = i2;
        this.f22798e = i;
        this.f22803j = c3284e;
        this.f22804k = c3283d;
        LayoutParams layoutParams = (LayoutParams) this.f22805l.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        LayoutParams layoutParams2 = (LayoutParams) this.f22807n.getLayoutParams();
        layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
        layoutParams2.width = i;
        this.f22801h.setOnClickListener(new C38861(this));
        this.f22805l.setOnClickListener(new C38872(this));
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageButton imageButton;
        super.mo3180a(c6829g);
        C7663d c7663d = (C7663d) c6829g;
        Uri a = C2613o.m7045a(c7663d.f23703Z, c7663d.aa, c7663d.f23699S, c7663d.f23700T, c7663d.f21300A);
        if (a != null) {
            try {
                this.f22806m = new a(a.getPath());
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
        if (this.f22805l != null) {
            if (this.f22806m != null) {
                this.f22805l.setImageDrawable(this.f22806m);
                if (this.f22806m != null) {
                    this.f22806m.stop();
                }
            } else if (a != null) {
                C1212c.m2872a(this.c).m10950a(a.getPath()).m3033a().m3031a(this.f22805l);
            }
        }
        if (c7663d.f23696P > 0 && c7663d.f23697Q > 0) {
            Point b = C2491i.m6807b(this.f22798e, c7663d.f23696P, c7663d.f23697Q);
            LayoutParams layoutParams = (LayoutParams) this.f22805l.getLayoutParams();
            layoutParams.height = b.y;
            layoutParams.width = b.x;
            LayoutParams layoutParams2 = (LayoutParams) this.f22807n.getLayoutParams();
            layoutParams2.height = (int) this.c.getResources().getDimension(R.dimen.shadow_chat_image_gradient_height);
            layoutParams2.width = b.x;
        }
        if (c7663d.f23701U == null || c7663d.f23701U.isEmpty()) {
            this.f22800g.setVisibility(8);
        } else {
            this.f22800g.setText(c7663d.f23701U);
            this.f22800g.setVisibility(0);
            this.f22800g.setTextSize((float) (((double) c7663d.ab) * 0.85d));
            C4520n.m8234a(this.f22800g);
        }
        int i = C38883.f11307a[c7663d.f23703Z.ordinal()];
        int i2 = R.drawable.ic_file_start_download;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
                this.f22802i.setVisibility(8);
                this.f22801h.setVisibility(0);
                imageButton = this.f22801h;
                break;
            case 3:
                ProgressWheel progressWheel;
                float f;
                this.f22802i.setVisibility(0);
                this.f22801h.setVisibility(0);
                this.f22801h.setImageResource(R.drawable.ic_file_stop_download);
                this.f22799f.setVisibility(0);
                this.f22799f.setText(c7663d.f23698R);
                if (c7663d.f23702Y > 0) {
                    progressWheel = this.f22802i;
                    f = ((float) c7663d.f23702Y) * 0.01f;
                } else {
                    progressWheel = this.f22802i;
                    f = 0.0f;
                }
                progressWheel.setProgress(f);
                break;
            case 6:
                this.f22802i.setVisibility(8);
                this.f22801h.setVisibility(0);
                imageButton = this.f22801h;
                i2 = R.drawable.ic_gif_white_32dp;
                break;
            default:
                break;
        }
        imageButton.setImageResource(i2);
        this.f22799f.setVisibility(8);
        m19051a((C7358a) c7663d, this.f22808o, false);
    }
}
