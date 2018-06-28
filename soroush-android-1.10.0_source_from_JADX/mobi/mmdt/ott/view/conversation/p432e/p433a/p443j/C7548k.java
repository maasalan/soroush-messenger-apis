package mobi.mmdt.ott.view.conversation.p432e.p433a.p443j;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p609j.C7683k;

public final class C7548k extends C7354b {
    private ImageView f23020d = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private ImageView f23021e = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private TextView f23022f = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private ProgressWheel f23023g = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private int f23024h;
    private C1247e<Drawable> f23025i = new C61991(this);

    class C61991 implements C1247e<Drawable> {
        final /* synthetic */ C7548k f16748a;

        C61991(C7548k c7548k) {
            this.f16748a = c7548k;
        }

        public final boolean mo2229a() {
            C7683k c7683k = (C7683k) this.f16748a.f16244a;
            if (c7683k.f23850Y != C3013f.f9457a) {
                C3011a.m7519a(this.f16748a.c, c7683k.f23843P, C3013f.f9457a);
            }
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16748a.f23023g.setVisibility(8);
            return false;
        }
    }

    public C7548k(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_sticker_output_list_item, c3286g, c3284e);
        this.f23024h = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        ImageView imageView;
        super.mo3180a(c6829g);
        C7683k c7683k = (C7683k) c6829g;
        int i = c7683k.f23848U != 0 ? this.f23024h * c7683k.f23848U : this.f23024h;
        int i2 = c7683k.f23847T != 0 ? this.f23024h * c7683k.f23847T : this.f23024h;
        if (c7683k.f23849V != 0) {
            i *= c7683k.f23849V;
        }
        if (c7683k.f23849V != 0) {
            i2 *= c7683k.f23849V;
        }
        LayoutParams layoutParams = this.f23020d.getLayoutParams();
        layoutParams.height = (int) (((double) (i * 2)) * 0.7d);
        layoutParams.width = (int) (((double) (i2 * 2)) * 0.7d);
        this.f23020d.setImageBitmap(null);
        if (c7683k.f23850Y == C3013f.f9461e) {
            C1274i a = C1212c.m2872a(this.c).m10950a(c7683k.f23846S);
            a.f3986c = this.f23025i;
            a.m3034a(new C1248f().m2954b(i2, i)).m3031a(this.f23020d);
        } else {
            C2808d.m7149c(new C6652c(C2535a.m6888a().m6928d(), c7683k.f23843P));
        }
        switch (c7683k.f21337w) {
            case ERROR:
                imageView = this.f23021e;
                i2 = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f23021e;
                i2 = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f23021e;
                i2 = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f23021e;
                i2 = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i2);
        m19052b(c7683k, this.f23022f, true);
    }
}
