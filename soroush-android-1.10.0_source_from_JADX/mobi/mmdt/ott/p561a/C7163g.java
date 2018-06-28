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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4224d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.C7370c;
import mobi.mmdt.ott.view.tools.C4511h;

public final class C7163g extends ViewDataBinding implements C0125a {
    private static final C0120b f20567k = null;
    private static final SparseIntArray f20568l;
    public final View f20569d;
    public final FrameLayout f20570e;
    public final RelativeLayout f20571f;
    public final TextView f20572g;
    public final ImageView f20573h;
    public final TextView f20574i;
    public final LinearLayout f20575j;
    private C4224d f20576m;
    private C7370c f20577n;
    private final OnClickListener f20578o;
    private long f20579p = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20568l = sparseIntArray;
        sparseIntArray.put(R.id.more_icon, 4);
        f20568l.put(R.id.load_more_text, 5);
        f20568l.put(R.id.frame_container, 6);
    }

    public C7163g(C0130f c0130f, View view) {
        super(c0130f, view, 1);
        Object[] a = ViewDataBinding.m14831a(c0130f, view, 7, f20567k, f20568l);
        this.f20569d = (View) a[3];
        this.f20569d.setTag(null);
        this.f20570e = (FrameLayout) a[6];
        this.f20571f = (RelativeLayout) a[0];
        this.f20571f.setTag(null);
        this.f20572g = (TextView) a[5];
        this.f20573h = (ImageView) a[4];
        this.f20574i = (TextView) a[1];
        this.f20574i.setTag(null);
        this.f20575j = (LinearLayout) a[2];
        this.f20575j.setTag(null);
        m14840a(view);
        this.f20578o = new C0126b(this, 1);
        synchronized (this) {
            this.f20579p = 4;
        }
        m14846e();
    }

    public static C7163g m18925a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (C7163g) C0131g.m206a(layoutInflater, R.layout.list_item_new_design_suggest_category_with_recycler_view, viewGroup, C0131g.m208a());
    }

    private boolean m18926b(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f20579p |= 1;
        }
        return true;
    }

    public final void mo3444a(int i) {
        C6829g c6829g = this.f20577n;
        C4224d c4224d = this.f20576m;
        if ((c4224d != null ? 1 : null) != null) {
            c4224d.mo3251c(c6829g);
        }
    }

    public final void m18928a(C7370c c7370c) {
        m14842a((C0133h) c7370c);
        this.f20577n = c7370c;
        synchronized (this) {
            this.f20579p |= 1;
        }
        b_(27);
        super.m14846e();
    }

    public final void m18929a(C4224d c4224d) {
        this.f20576m = c4224d;
        synchronized (this) {
            this.f20579p |= 2;
        }
        b_(28);
        super.m14846e();
    }

    protected final boolean mo3441a(int i, int i2) {
        return i != 0 ? false : m18926b(i2);
    }

    protected final void mo3442c() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.f20579p;
            this.f20579p = 0;
        }
        String str = null;
        C7370c c7370c = this.f20577n;
        long j2 = j & 5;
        boolean z2 = false;
        if (j2 == 0 || c7370c == null) {
            z = false;
        } else {
            str = c7370c.f21442d;
            z2 = c7370c.f21441c;
            z = c7370c.f21444f;
        }
        if (j2 != 0) {
            C4511h.m8223a(this.f20569d, z);
            C4511h.m8224a(this.f20574i, str);
            C4511h.m8223a(this.f20575j, z2);
        }
        if ((j & 4) != 0) {
            this.f20575j.setOnClickListener(this.f20578o);
        }
    }

    public final boolean mo3443d() {
        synchronized (this) {
            if (this.f20579p != 0) {
                return true;
            }
            return false;
        }
    }
}
