package mobi.mmdt.ott.view.components.imageslider.p408b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1274i;
import com.p085c.p086a.p105g.C1247e;
import com.p085c.p086a.p105g.C1248f;
import java.io.File;
import mobi.mmdt.ott.R;

public abstract class C3188a {
    protected Context f9912a;
    protected C3186b f9913b;
    public boolean f9914c;
    public C3185a f9915d;
    public String f9916e;
    public int f9917f = C3187c.f9909c;
    private String f9918g;
    private File f9919h;
    private int f9920i;

    public interface C3185a {
        void mo2271a(C3188a c3188a);
    }

    public interface C3186b {
        void mo2431a();
    }

    public enum C3187c {
        ;
        
        public static final int f9907a = 1;
        public static final int f9908b = 2;
        public static final int f9909c = 3;
        public static final int f9910d = 4;

        static {
            f9911e = new int[]{f9907a, f9908b, f9909c, f9910d};
        }
    }

    protected C3188a(Context context) {
        this.f9912a = context;
    }

    public final Context m7687a() {
        return this.f9912a;
    }

    public final C3188a m7688a(String str) {
        if (this.f9919h == null) {
            if (this.f9920i == 0) {
                this.f9918g = str;
                return this;
            }
        }
        throw new IllegalStateException("Call multi image function,you only have permission to call it once");
    }

    public final C3188a m7689a(C3186b c3186b) {
        this.f9913b = c3186b;
        return this;
    }

    protected final void m7690a(final View view, ImageView imageView) {
        C1247e c60951 = new C1247e<Drawable>(this) {
            final /* synthetic */ C3188a f16357c;

            public final boolean mo2229a() {
                if (this.f16357c.f9915d != null) {
                    this.f16357c.f9915d.mo2271a(this);
                }
                if (view.findViewById(R.id.loading_bar) != null) {
                    view.findViewById(R.id.loading_bar).setVisibility(8);
                }
                return false;
            }

            public final /* synthetic */ boolean mo2230b() {
                if (view.findViewById(R.id.loading_bar) != null) {
                    view.findViewById(R.id.loading_bar).setVisibility(8);
                }
                return false;
            }
        };
        view.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C3188a f9906b;

            public final void onClick(View view) {
                if (this.f9906b.f9913b != null) {
                    this.f9906b.f9913b.mo2431a();
                }
            }
        });
        if (imageView != null) {
            C1274i a;
            C1248f c1248f;
            if (this.f9918g != null) {
                a = C1212c.m2875b(this.f9912a).m10950a(this.f9918g);
                a.f3986c = c60951;
                c1248f = new C1248f();
            } else if (this.f9919h != null) {
                a = C1212c.m2875b(this.f9912a).m10950a(this.f9919h.getAbsolutePath());
                a.f3986c = c60951;
                c1248f = new C1248f();
            } else if (this.f9920i != 0) {
                return;
            } else {
                return;
            }
            a.m3034a(c1248f.m2960f()).m3033a().m3031a(imageView);
        }
    }

    public abstract View mo2273b();
}
