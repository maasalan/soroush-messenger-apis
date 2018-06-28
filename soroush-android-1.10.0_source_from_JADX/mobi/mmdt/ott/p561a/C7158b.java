package mobi.mmdt.ott.p561a;

import android.databinding.C0130f;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0120b;
import android.support.v7.widget.Toolbar;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;

public final class C7158b extends ViewDataBinding {
    private static final C0120b f20502m = null;
    private static final SparseIntArray f20503n;
    public final Button f20504d;
    public final LinearLayout f20505e;
    public final Button f20506f;
    public final TextView f20507g;
    public final TextView f20508h;
    public final TextView f20509i;
    public final TextView f20510j;
    public final Toolbar f20511k;
    public final LinearLayout f20512l;
    private final FrameLayout f20513o;
    private long f20514p = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20503n = sparseIntArray;
        sparseIntArray.put(R.id.top_root_layout, 1);
        f20503n.put(R.id.text1, 2);
        f20503n.put(R.id.text2, 3);
        f20503n.put(R.id.text3, 4);
        f20503n.put(R.id.bottom_root_layout, 5);
        f20503n.put(R.id.text4, 6);
        f20503n.put(R.id.buy_charge, 7);
        f20503n.put(R.id.apply_charge, 8);
        f20503n.put(R.id.toolbar, 9);
    }

    public C7158b(C0130f c0130f, View view) {
        super(c0130f, view, 0);
        Object[] a = ViewDataBinding.m14831a(c0130f, view, 10, f20502m, f20503n);
        this.f20504d = (Button) a[8];
        this.f20505e = (LinearLayout) a[5];
        this.f20506f = (Button) a[7];
        this.f20513o = (FrameLayout) a[0];
        this.f20513o.setTag(null);
        this.f20507g = (TextView) a[2];
        this.f20508h = (TextView) a[3];
        this.f20509i = (TextView) a[4];
        this.f20510j = (TextView) a[6];
        this.f20511k = (Toolbar) a[9];
        this.f20512l = (LinearLayout) a[1];
        m14840a(view);
        synchronized (this) {
            this.f20514p = 1;
        }
        m14846e();
    }

    protected final boolean mo3441a(int i, int i2) {
        return false;
    }

    protected final void mo3442c() {
        synchronized (this) {
            this.f20514p = 0;
        }
    }

    public final boolean mo3443d() {
        synchronized (this) {
            if (this.f20514p != 0) {
                return true;
            }
            return false;
        }
    }
}
