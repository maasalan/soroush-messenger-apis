package mobi.mmdt.ott.view.conversation.p432e.p433a.p440g;

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
import mobi.mmdt.ott.view.conversation.p418a.C3288i;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p606g.C7644k;

public final class C7509k extends C7351b {
    private ImageView f22566d = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private ProgressWheel f22567e = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private int f22568f;
    private TextView f22569g = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private C1247e<Drawable> f22570h = new C61781(this);

    class C61781 implements C1247e<Drawable> {
        final /* synthetic */ C7509k f16703a;

        C61781(C7509k c7509k) {
            this.f16703a = c7509k;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16703a.f22567e.setVisibility(8);
            return false;
        }
    }

    public C7509k(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3288i c3288i, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_sticker_social_input_list_item, c3288i, c3286g, c3284e);
        this.f22568f = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7644k c7644k = (C7644k) c6829g;
        int i = c7644k.aa != 0 ? this.f22568f * c7644k.aa : this.f22568f;
        int i2 = c7644k.f23565U != 0 ? this.f22568f * c7644k.f23565U : this.f22568f;
        if (c7644k.ab != 0) {
            i *= c7644k.ab;
        }
        if (c7644k.ab != 0) {
            i2 *= c7644k.ab;
        }
        LayoutParams layoutParams = this.f22566d.getLayoutParams();
        layoutParams.height = (int) (((double) (i * 2)) * 0.7d);
        layoutParams.width = (int) (((double) (i2 * 2)) * 0.7d);
        this.f22566d.setImageBitmap(null);
        if (c7644k.ac == C3013f.f9461e) {
            C1274i a = C1212c.m2872a(this.c).m10950a(c7644k.f23563S);
            a.f3986c = this.f22570h;
            a.m3034a(new C1248f().m2954b(i2, i)).m3033a().m3031a(this.f22566d);
        } else {
            C2808d.m7148b(new C6652c(c7644k.f23564T, c7644k.f23560P));
        }
        m19052b(c7644k, this.f22569g, false);
    }
}
