package mobi.mmdt.ott.p561a;

import android.databinding.C0130f;
import android.databinding.C0131g;
import android.databinding.C0133h;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0120b;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.C7371d;

public final class C7164h extends ViewDataBinding {
    private static final C0120b f20580g = null;
    private static final SparseIntArray f20581h;
    public final View f20582d;
    public final FrameLayout f20583e;
    public final RelativeLayout f20584f;
    private C7371d f20585i;
    private long f20586j = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20581h = sparseIntArray;
        sparseIntArray.put(R.id.frame_container, 2);
    }

    public C7164h(C0130f c0130f, View view) {
        super(c0130f, view, 1);
        Object[] a = ViewDataBinding.m14831a(c0130f, view, 3, f20580g, f20581h);
        this.f20582d = (View) a[1];
        this.f20582d.setTag(null);
        this.f20583e = (FrameLayout) a[2];
        this.f20584f = (RelativeLayout) a[0];
        this.f20584f.setTag(null);
        m14840a(view);
        synchronized (this) {
            this.f20586j = 2;
        }
        m14846e();
    }

    public static C7164h m18933a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (C7164h) C0131g.m206a(layoutInflater, R.layout.list_item_new_design_suggest_slide_show_with_recycler_view, viewGroup, C0131g.m208a());
    }

    private boolean m18934b(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f20586j |= 1;
        }
        return true;
    }

    public final void m18935a(C7371d c7371d) {
        m14842a((C0133h) c7371d);
        this.f20585i = c7371d;
        synchronized (this) {
            this.f20586j |= 1;
        }
        b_(33);
        super.m14846e();
    }

    protected final boolean mo3441a(int i, int i2) {
        return i != 0 ? false : m18934b(i2);
    }

    protected final void mo3442c() {
        long j;
        synchronized (this) {
            j = this.f20586j;
            this.f20586j = 0;
        }
        C6829g c6829g = this.f20585i;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            int i2 = (c6829g != null ? c6829g.f19504k : 0) == 0 ? 1 : 0;
            if (j2 != 0) {
                j |= i2 != 0 ? 8 : 4;
            }
            if (i2 != 0) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.f20582d.setVisibility(i);
        }
    }

    public final boolean mo3443d() {
        synchronized (this) {
            if (this.f20586j != 0) {
                return true;
            }
            return false;
        }
    }
}
