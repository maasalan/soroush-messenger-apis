package mobi.mmdt.ott.p561a;

import android.databinding.C0130f;
import android.databinding.C0131g;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0120b;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import mobi.mmdt.ott.R;

public final class C7166j extends ViewDataBinding {
    private static final C0120b f20596e = null;
    private static final SparseIntArray f20597f = null;
    public final FrameLayout f20598d;
    private long f20599g = -1;

    public C7166j(C0130f c0130f, View view) {
        super(c0130f, view, 0);
        this.f20598d = (FrameLayout) ViewDataBinding.m14831a(c0130f, view, 1, f20596e, f20597f)[0];
        this.f20598d.setTag(null);
        m14840a(view);
        synchronized (this) {
            this.f20599g = 1;
        }
        m14846e();
    }

    public static C7166j m18947a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (C7166j) C0131g.m206a(layoutInflater, R.layout.slider_banner_layout_item_list, viewGroup, C0131g.m208a());
    }

    protected final boolean mo3441a(int i, int i2) {
        return false;
    }

    protected final void mo3442c() {
        synchronized (this) {
            this.f20599g = 0;
        }
    }

    public final boolean mo3443d() {
        synchronized (this) {
            if (this.f20599g != 0) {
                return true;
            }
            return false;
        }
    }
}
