package mobi.mmdt.ott.view.conversation.p432e.p433a.p436c;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.ac.p267b.C6652c;
import mobi.mmdt.ott.provider.p393o.C3013f;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p602c.C7592k;

public final class C7457k extends C7347b {
    private ImageView f21943e = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private TextView f21944f = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private ProgressWheel f21945g = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private int f21946h;
    private C1247e<Drawable> f21947i = new C61501(this);

    class C61501 implements C1247e<Drawable> {
        final /* synthetic */ C7457k f16643a;

        C61501(C7457k c7457k) {
            this.f16643a = c7457k;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16643a.f21945g.setVisibility(8);
            return false;
        }
    }

    public C7457k(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_sticker_channel_input_list_item, c3280a, c3286g, c3284e);
        this.f21946h = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7592k c7592k = (C7592k) c6829g;
        int i = c7592k.f23211V != 0 ? this.f21946h * c7592k.f23211V : this.f21946h;
        int i2 = c7592k.f23210U != 0 ? this.f21946h * c7592k.f23210U : this.f21946h;
        if (c7592k.f23212W != 0) {
            i *= c7592k.f23212W;
        }
        if (c7592k.f23212W != 0) {
            i2 *= c7592k.f23212W;
        }
        LayoutParams layoutParams = this.f21943e.getLayoutParams();
        layoutParams.height = (int) (((double) (i * 2)) * 0.7d);
        layoutParams.width = (int) (((double) (i2 * 2)) * 0.7d);
        this.f21943e.setImageBitmap(null);
        if (c7592k.f23213X == C3013f.f9461e) {
            C1274i a = C1212c.m2872a(this.c).m10950a(c7592k.f23208S);
            a.f3986c = this.f21947i;
            a.m3034a(new C1248f().m2954b(i2, i)).m3033a().m3031a(this.f21943e);
        } else {
            C2808d.m7149c(new C6652c(c7592k.f23209T, c7592k.f23205P));
        }
        m19052b(c7592k, this.f21944f, false);
    }
}
