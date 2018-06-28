package mobi.mmdt.ott.view.conversation.p432e.p433a.p435b;

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
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p393o.C3013f;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3280a;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p611b.C7718j;

public final class C7444j extends C7346b {
    private ImageView f21787e = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private TextView f21788f = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private ImageView f21789g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ProgressWheel f21790h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private int f21791i;
    private C1247e<Drawable> f21792j = new C61431(this);

    class C61431 implements C1247e<Drawable> {
        final /* synthetic */ C7444j f16628a;

        C61431(C7444j c7444j) {
            this.f16628a = c7444j;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16628a.f21790h.setVisibility(8);
            return false;
        }
    }

    public C7444j(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_sticker_channel_direct_output_list_item, c3280a, c3286g, c3284e);
        this.f21791i = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        super.mo3180a(c6829g);
        C7718j c7718j = (C7718j) c6829g;
        int i = c7718j.f24304U != 0 ? this.f21791i * c7718j.f24304U : this.f21791i;
        int i2 = c7718j.f24303T != 0 ? this.f21791i * c7718j.f24303T : this.f21791i;
        if (c7718j.f24305V != 0) {
            i *= c7718j.f24305V;
        }
        if (c7718j.f24305V != 0) {
            i2 *= c7718j.f24305V;
        }
        LayoutParams layoutParams = this.f21787e.getLayoutParams();
        layoutParams.height = (int) (((double) (i * 2)) * 0.7d);
        layoutParams.width = (int) (((double) (i2 * 2)) * 0.7d);
        this.f21787e.setImageBitmap(null);
        if (c7718j.f24306W == C3013f.f9461e) {
            a = C1212c.m2872a(this.c).m10950a(c7718j.f24302S);
            a.f3986c = this.f21792j;
            a.m3034a(new C1248f().m2954b(i2, i)).m3033a().m3031a(this.f21787e);
        } else {
            C2808d.m7149c(new C6652c(C2535a.m6888a().m6928d(), c7718j.f24299P));
        }
        this.f21787e.setImageBitmap(null);
        a = C1212c.m2872a(this.c).m10950a(c7718j.f24302S);
        a.f3986c = this.f21792j;
        a.m3034a(new C1248f().m2954b(i2, i)).m3033a().m3031a(this.f21787e);
        switch (c7718j.f21337w) {
            case ERROR:
                imageView = this.f21789g;
                i2 = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f21789g;
                i2 = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f21789g;
                i2 = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f21789g;
                i2 = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i2);
        m19052b(c7718j, this.f21788f, true);
    }
}
