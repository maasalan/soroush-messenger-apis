package mobi.mmdt.ott.view.conversation.p432e.p433a.p434a;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p610a.C7706j;

public final class C7432j extends C7345b {
    private ImageView f21636d = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private TextView f21637e = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private ProgressWheel f21638f = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private int f21639g;
    private C1247e<Drawable> f21640h = new C61371(this);

    class C61371 implements C1247e<Drawable> {
        final /* synthetic */ C7432j f16622a;

        C61371(C7432j c7432j) {
            this.f16622a = c7432j;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16622a.f21638f.setVisibility(8);
            return false;
        }
    }

    public C7432j(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3288i c3288i, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_sticker_channel_direct_input_list_item, c3288i, c3286g, c3284e);
        this.f21639g = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        super.mo3180a(c6829g);
        C7706j c7706j = (C7706j) c6829g;
        int i = c7706j.f24188V != 0 ? this.f21639g * c7706j.f24188V : this.f21639g;
        int i2 = c7706j.f24187U != 0 ? this.f21639g * c7706j.f24187U : this.f21639g;
        if (c7706j.f24189W != 0) {
            i *= c7706j.f24189W;
        }
        if (c7706j.f24189W != 0) {
            i2 *= c7706j.f24189W;
        }
        LayoutParams layoutParams = this.f21636d.getLayoutParams();
        layoutParams.height = (int) (((double) (i * 2)) * 0.7d);
        layoutParams.width = (int) (((double) (i2 * 2)) * 0.7d);
        this.f21636d.setImageBitmap(null);
        if (c7706j.f24190X == C3013f.f9461e) {
            C1274i a = C1212c.m2872a(this.c).m10950a(c7706j.f24185S);
            a.f3986c = this.f21640h;
            a.m3034a(new C1248f().m2954b(i2, i)).m3033a().m3031a(this.f21636d);
        } else {
            C2808d.m7148b(new C6652c(c7706j.f24186T, c7706j.f24182P));
        }
        m19052b(c7706j, this.f21637e, false);
    }
}
