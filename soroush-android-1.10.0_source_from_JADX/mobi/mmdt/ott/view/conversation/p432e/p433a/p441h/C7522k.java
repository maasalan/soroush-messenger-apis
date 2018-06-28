package mobi.mmdt.ott.view.conversation.p432e.p433a.p441h;

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
import mobi.mmdt.ott.provider.p393o.C3011a;
import mobi.mmdt.ott.provider.p393o.C3013f;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p418a.C3286g;
import mobi.mmdt.ott.view.conversation.p573f.p597a.p607h.C7657k;

public final class C7522k extends C7352b {
    private ImageView f22719d = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private ImageView f22720e = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private TextView f22721f = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private ProgressWheel f22722g = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private int f22723h;
    private C1247e<Drawable> f22724i = new C61851(this);

    class C61851 implements C1247e<Drawable> {
        final /* synthetic */ C7522k f16718a;

        C61851(C7522k c7522k) {
            this.f16718a = c7522k;
        }

        public final boolean mo2229a() {
            C7657k c7657k = (C7657k) this.f16718a.f16244a;
            if (c7657k.f23661Y != C3013f.f9457a) {
                C3011a.m7519a(this.f16718a.c, c7657k.f23654P, C3013f.f9457a);
            }
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16718a.f22722g.setVisibility(8);
            return false;
        }
    }

    public C7522k(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_sticker_output_list_item, c3286g, c3284e);
        this.f22723h = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        super.mo3180a(c6829g);
        C7657k c7657k = (C7657k) c6829g;
        int i = c7657k.f23659U != 0 ? this.f22723h * c7657k.f23659U : this.f22723h;
        int i2 = c7657k.f23658T != 0 ? this.f22723h * c7657k.f23658T : this.f22723h;
        if (c7657k.f23660V != 0) {
            i *= c7657k.f23660V;
        }
        if (c7657k.f23660V != 0) {
            i2 *= c7657k.f23660V;
        }
        LayoutParams layoutParams = this.f22719d.getLayoutParams();
        layoutParams.height = (int) (((double) (i * 2)) * 0.7d);
        layoutParams.width = (int) (((double) (i2 * 2)) * 0.7d);
        this.f22719d.setImageBitmap(null);
        if (c7657k.f23661Y == C3013f.f9461e) {
            C1274i a = C1212c.m2872a(this.c).m10950a(c7657k.f23657S);
            a.f3986c = this.f22724i;
            a.m3034a(new C1248f().m2954b(i2, i)).m3031a(this.f22719d);
        } else {
            C2808d.m7149c(new C6652c(C2535a.m6888a().m6928d(), c7657k.f23654P));
        }
        switch (c7657k.f21337w) {
            case ERROR:
                imageView = this.f22720e;
                i2 = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22720e;
                i2 = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22720e;
                i2 = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22720e;
                i2 = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i2);
        m19052b(c7657k, this.f22721f, true);
    }
}
