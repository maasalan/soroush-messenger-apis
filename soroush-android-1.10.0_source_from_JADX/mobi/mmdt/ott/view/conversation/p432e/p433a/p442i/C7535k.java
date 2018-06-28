package mobi.mmdt.ott.view.conversation.p432e.p433a.p442i;

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
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p608i.C7670k;

public final class C7535k extends C7353b {
    private TextView f22868d = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private ImageView f22869e = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private ProgressWheel f22870f = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private int f22871g;
    private C1247e<Drawable> f22872h = new C61921(this);

    class C61921 implements C1247e<Drawable> {
        final /* synthetic */ C7535k f16733a;

        C61921(C7535k c7535k) {
            this.f16733a = c7535k;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16733a.f22870f.setVisibility(8);
            return false;
        }
    }

    public C7535k(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_sticker_input_list_item, c3286g, c3284e);
        this.f22871g = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7670k c7670k = (C7670k) c6829g;
        int i = c7670k.f23749Y != 0 ? this.f22871g * c7670k.f23749Y : this.f22871g;
        int i2 = c7670k.f23748U != 0 ? this.f22871g * c7670k.f23748U : this.f22871g;
        if (c7670k.f23750Z != 0) {
            i *= c7670k.f23750Z;
        }
        if (c7670k.f23750Z != 0) {
            i2 *= c7670k.f23750Z;
        }
        LayoutParams layoutParams = this.f22869e.getLayoutParams();
        layoutParams.height = (int) (((double) (i * 2)) * 0.7d);
        layoutParams.width = (int) (((double) (i2 * 2)) * 0.7d);
        this.f22869e.setImageBitmap(null);
        if (c7670k.aa == C3013f.f9461e) {
            C1274i a = C1212c.m2872a(this.c).m10950a(c7670k.f23746S);
            a.f3986c = this.f22872h;
            a.m3034a(new C1248f().m2954b(i2, i)).m3033a().m3031a(this.f22869e);
        } else {
            C2808d.m7148b(new C6652c(c7670k.f23747T, c7670k.f23743P));
        }
        m19052b(c7670k, this.f22868d, false);
    }
}
