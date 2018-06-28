package mobi.mmdt.ott.view.components.mediaviewer.p414a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p089c.p092b.C1144h;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.mediaviewer.C3231a;
import mobi.mmdt.ott.view.components.mediaviewer.p568b.C7335c;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import uk.co.a.a.d;

public final class C7186c extends C6867a {
    private Activity f20671b;
    private ImageView f20672c = ((ImageView) this.itemView.findViewById(R.id.content_imageView));
    private d f20673d;
    private C3231a f20674e;

    class C61161 implements C1247e<Bitmap> {
        final /* synthetic */ C7186c f16422a;

        class C61151 implements d.d {
            final /* synthetic */ C61161 f16421a;

            C61151(C61161 c61161) {
                this.f16421a = c61161;
            }

            public final void m13854a() {
                this.f16421a.f16422a.f20674e.k_();
            }

            public final void m13855b() {
                this.f16421a.f16422a.f20674e.k_();
            }
        }

        C61161(C7186c c7186c) {
            this.f16422a = c7186c;
        }

        public final boolean mo2229a() {
            return false;
        }

        public final /* synthetic */ boolean mo2230b() {
            this.f16422a.f20673d = new d(this.f16422a.f20672c);
            this.f16422a.f20673d.d();
            this.f16422a.f20673d.g = new C61151(this);
            return false;
        }
    }

    public C7186c(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, C3231a c3231a) {
        super(layoutInflater, viewGroup, R.layout.media_viewer_photo_list_item);
        this.f20671b = activity;
        this.f20674e = c3231a;
    }

    protected final void mo3180a(C6829g c6829g) {
        C1274i a = C1212c.m2872a(this.f20671b).m10958e().m3037a(((C7335c) c6829g).f20678a).m3034a(C1248f.m2938a(C1144h.f3692d));
        a.f3986c = new C61161(this);
        a.m3031a(this.f20672c);
    }
}
