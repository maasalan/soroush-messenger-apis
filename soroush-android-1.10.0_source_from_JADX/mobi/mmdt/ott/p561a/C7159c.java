package mobi.mmdt.ott.p561a;

import android.databinding.C0130f;
import android.databinding.C0131g;
import android.databinding.C0133h;
import android.databinding.ViewDataBinding;
import android.databinding.ViewDataBinding.C0120b;
import android.databinding.p020a.p021a.C0126b;
import android.databinding.p020a.p021a.C0126b.C0125a;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4224d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.p580a.C7218b;

public final class C7159c extends ViewDataBinding implements C0125a {
    private static final C0120b f20515e = null;
    private static final SparseIntArray f20516f = null;
    public final ImageView f20517d;
    private C4224d f20518g;
    private C7218b f20519h;
    private final OnClickListener f20520i;
    private long f20521j = -1;

    public C7159c(C0130f c0130f, View view) {
        super(c0130f, view, 1);
        this.f20517d = (ImageView) ViewDataBinding.m14831a(c0130f, view, 1, f20515e, f20516f)[0];
        this.f20517d.setTag(null);
        m14840a(view);
        this.f20520i = new C0126b(this, 1);
        synchronized (this) {
            this.f20521j = 4;
        }
        m14846e();
    }

    public static C7159c m18893a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (C7159c) C0131g.m206a(layoutInflater, R.layout.image_suggest_channel_layout_item_list, viewGroup, C0131g.m208a());
    }

    private boolean m18894b(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f20521j |= 1;
        }
        return true;
    }

    public final void mo3444a(int i) {
        C6829g c6829g = this.f20519h;
        C4224d c4224d = this.f20518g;
        if ((c4224d != null ? 1 : null) != null) {
            c4224d.mo3250b(c6829g);
        }
    }

    public final void m18896a(C7218b c7218b) {
        m14842a((C0133h) c7218b);
        this.f20519h = c7218b;
        synchronized (this) {
            this.f20521j |= 1;
        }
        b_(32);
        super.m14846e();
    }

    public final void m18897a(C4224d c4224d) {
        this.f20518g = c4224d;
        synchronized (this) {
            this.f20521j |= 2;
        }
        b_(28);
        super.m14846e();
    }

    protected final boolean mo3441a(int i, int i2) {
        return i != 0 ? false : m18894b(i2);
    }

    protected final void mo3442c() {
        long j;
        synchronized (this) {
            j = this.f20521j;
            this.f20521j = 0;
        }
        C7218b c7218b = this.f20519h;
        Object obj = null;
        long j2 = j & 5;
        if (!(j2 == 0 || c7218b == null)) {
            obj = c7218b.f20850e;
        }
        if ((j & 4) != 0) {
            this.f20517d.setOnClickListener(this.f20520i);
        }
        if (j2 != 0) {
            ImageView imageView = this.f20517d;
            C1212c.m2875b(imageView.getContext()).m10950a(obj).m3033a().m3031a(imageView);
        }
    }

    public final boolean mo3443d() {
        synchronized (this) {
            if (this.f20521j != 0) {
                return true;
            }
            return false;
        }
    }
}
