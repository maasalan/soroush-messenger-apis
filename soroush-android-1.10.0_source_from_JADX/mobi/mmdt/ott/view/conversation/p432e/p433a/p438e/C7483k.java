package mobi.mmdt.ott.view.conversation.p432e.p433a.p438e;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p604e.C7618k;

public final class C7483k extends C7349b {
    private ImageView f22258e = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private TextView f22259f = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private ProgressWheel f22260g = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private int f22261h;
    private C1247e<Drawable> f22262i = new C61641(this);

    class C61641 implements C1247e<Drawable> {
        final /* synthetic */ C7483k f16673a;

        C61641(C7483k c7483k) {
            this.f16673a = c7483k;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16673a.f22260g.setVisibility(8);
            return false;
        }
    }

    public C7483k(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_sticker_channel_input_list_item, c3280a, c3286g, c3284e);
        this.f22261h = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7618k c7618k = (C7618k) c6829g;
        int i = c7618k.ac != 0 ? this.f22261h * c7618k.ac : this.f22261h;
        int i2 = c7618k.f23414U != 0 ? this.f22261h * c7618k.f23414U : this.f22261h;
        if (c7618k.ad != 0) {
            i *= c7618k.ad;
        }
        if (c7618k.ad != 0) {
            i2 *= c7618k.ad;
        }
        LayoutParams layoutParams = this.f22258e.getLayoutParams();
        layoutParams.height = (int) (((double) (i * 2)) * 0.7d);
        layoutParams.width = (int) (((double) (i2 * 2)) * 0.7d);
        this.f22258e.setImageBitmap(null);
        if (c7618k.ae == C3013f.f9461e) {
            C1274i a = C1212c.m2872a(this.c).m10950a(c7618k.f23412S).m3034a(new C1248f().m2954b(i2, i));
            a.f3986c = this.f22262i;
            a.m3033a().m3031a(this.f22258e);
        } else {
            C2808d.m7149c(new C6652c(c7618k.f23413T, c7618k.f23409P));
        }
        m19052b(c7618k, this.f22259f, false);
    }
}
