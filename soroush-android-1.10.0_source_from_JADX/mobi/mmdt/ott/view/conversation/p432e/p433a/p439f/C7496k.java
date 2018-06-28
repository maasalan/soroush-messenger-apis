package mobi.mmdt.ott.view.conversation.p432e.p433a.p439f;

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
import mobi.mmdt.ott.view.conversation.p573f.p597a.p605f.C7631k;

public final class C7496k extends C7350b {
    private ImageView f22417e = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private TextView f22418f = ((TextView) this.itemView.findViewById(R.id.sender_textView));
    private ImageView f22419g = ((ImageView) this.itemView.findViewById(R.id.status_imageView));
    private ProgressWheel f22420h = ((ProgressWheel) this.itemView.findViewById(R.id.progress_wheel));
    private int f22421i;
    private C1247e<Drawable> f22422j = new C61711(this);

    class C61711 implements C1247e<Drawable> {
        final /* synthetic */ C7496k f16688a;

        C61711(C7496k c7496k) {
            this.f16688a = c7496k;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16688a.f22420h.setVisibility(8);
            return false;
        }
    }

    public C7496k(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, int i, C3280a c3280a, C3286g c3286g, C3284e c3284e) {
        super(activity, layoutInflater, viewGroup, R.layout.chat_sticker_channel_output_list_item, c3280a, c3286g, c3284e);
        this.f22421i = i;
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a;
        ImageView imageView;
        super.mo3180a(c6829g);
        C7631k c7631k = (C7631k) c6829g;
        int i = c7631k.f23492U != 0 ? this.f22421i * c7631k.f23492U : this.f22421i;
        int i2 = c7631k.f23491T != 0 ? this.f22421i * c7631k.f23491T : this.f22421i;
        if (c7631k.f23493V != 0) {
            i *= c7631k.f23493V;
        }
        if (c7631k.f23493V != 0) {
            i2 *= c7631k.f23493V;
        }
        LayoutParams layoutParams = this.f22417e.getLayoutParams();
        layoutParams.height = (int) (((double) (i * 2)) * 0.7d);
        layoutParams.width = (int) (((double) (i2 * 2)) * 0.7d);
        this.f22417e.setImageBitmap(null);
        if (c7631k.aa == C3013f.f9461e) {
            a = C1212c.m2872a(this.c).m10950a(c7631k.f23490S);
            a.f3986c = this.f22422j;
            a.m3034a(new C1248f().m2954b(i2, i)).m3033a().m3031a(this.f22417e);
        } else {
            C2808d.m7149c(new C6652c(C2535a.m6888a().m6928d(), c7631k.f23487P));
        }
        this.f22417e.setImageBitmap(null);
        a = C1212c.m2872a(this.c).m10950a(c7631k.f23490S);
        a.f3986c = this.f22422j;
        a.m3034a(new C1248f().m2954b(i2, i)).m3033a().m3031a(this.f22417e);
        switch (c7631k.f21337w) {
            case ERROR:
                imageView = this.f22419g;
                i2 = R.drawable.ic_message_error;
                break;
            case SENDING:
                imageView = this.f22419g;
                i2 = R.drawable.ic_message_schedule_white;
                break;
            case PENDING:
            case PENDING_RETRANSMIT:
            case NOT_SEEN:
            case DELIVERED:
                imageView = this.f22419g;
                i2 = R.drawable.ic_message_tick_white;
                break;
            case SEEN:
                imageView = this.f22419g;
                i2 = R.drawable.ic_message_tick_double_seen;
                break;
            default:
                break;
        }
        imageView.setImageResource(i2);
        m19052b(c7631k, this.f22418f, true);
    }
}
