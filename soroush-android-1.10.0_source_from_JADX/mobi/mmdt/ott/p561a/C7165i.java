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
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.p459d.C4186a;
import mobi.mmdt.ott.view.main.p459d.p554b.p579b.C7369b;
import mobi.mmdt.ott.view.tools.C4511h;

public final class C7165i extends ViewDataBinding implements C0125a {
    private static final C0120b f20587g = null;
    private static final SparseIntArray f20588h = null;
    public final RoundAvatarImageView f20589d;
    public final RelativeLayout f20590e;
    public final TextView f20591f;
    private C4186a f20592i;
    private C7369b f20593j;
    private final OnClickListener f20594k;
    private long f20595l = -1;

    public C7165i(C0130f c0130f, View view) {
        super(c0130f, view, 1);
        Object[] a = ViewDataBinding.m14831a(c0130f, view, 3, f20587g, f20588h);
        this.f20589d = (RoundAvatarImageView) a[1];
        this.f20589d.setTag(null);
        this.f20590e = (RelativeLayout) a[0];
        this.f20590e.setTag(null);
        this.f20591f = (TextView) a[2];
        this.f20591f.setTag(null);
        m14840a(view);
        this.f20594k = new C0126b(this, 1);
        synchronized (this) {
            this.f20595l = 4;
        }
        m14846e();
    }

    public static C7165i m18939a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (C7165i) C0131g.m206a(layoutInflater, R.layout.list_item_suggest_contact, viewGroup, C0131g.m208a());
    }

    private boolean m18940b(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f20595l |= 1;
        }
        return true;
    }

    public final void mo3444a(int i) {
        C4186a c4186a = this.f20592i;
        C6829g c6829g = this.f20593j;
        if ((c4186a != null ? 1 : null) != null) {
            c4186a.mo3244c(c6829g);
        }
    }

    public final void m18942a(C4186a c4186a) {
        this.f20592i = c4186a;
        synchronized (this) {
            this.f20595l |= 2;
        }
        b_(29);
        super.m14846e();
    }

    public final void m18943a(C7369b c7369b) {
        m14842a((C0133h) c7369b);
        this.f20593j = c7369b;
        synchronized (this) {
            this.f20595l |= 1;
        }
        b_(30);
        super.m14846e();
    }

    protected final boolean mo3441a(int i, int i2) {
        return i != 0 ? false : m18940b(i2);
    }

    protected final void mo3442c() {
        long j;
        C7165i c7165i = this;
        synchronized (this) {
            try {
                j = c7165i.f20595l;
                long j2 = 0;
                c7165i.f20595l = 0;
            } finally {
                j = r0;
            }
        }
        C7369b c7369b = c7165i.f20593j;
        long j3 = j & 5;
        long j4 = 16;
        int i;
        String str;
        int i2;
        String str2;
        Object obj;
        String str3;
        if (j3 != 0) {
            if (c7369b != null) {
                i = c7369b.f21436g;
                String str4 = c7369b.f21434e;
                str = c7369b.f21432c;
                String str5 = str4;
                i2 = c7369b.f21431b;
                str2 = str;
            } else {
                str2 = null;
                i = 0;
                i2 = 0;
                str = null;
            }
            obj = str == null ? 1 : null;
            if (j3 != j2) {
                j = obj != null ? j | j4 : j | 8;
            }
            str3 = ((j & j4) != j2 || c7369b == null) ? null : c7369b.f21435f;
            j4 = j & 5;
            if (j4 != j2) {
                str = null;
            } else if (obj != null) {
                str = str3;
            }
            if (j4 != j2) {
                c7165i.f20589d.setBackgroundColor(i);
                C4511h.m8225a(c7165i.f20589d, str, i2);
                C4511h.m8224a(c7165i.f20591f, str2);
            }
            if ((j & 4) != j2) {
                c7165i.f20590e.setOnClickListener(c7165i.f20594k);
            }
        }
        str2 = null;
        i = 0;
        i2 = 0;
        str = null;
        obj = null;
        if ((j & j4) != j2) {
        }
        j4 = j & 5;
        if (j4 != j2) {
            str = null;
        } else if (obj != null) {
            str = str3;
        }
        if (j4 != j2) {
            c7165i.f20589d.setBackgroundColor(i);
            C4511h.m8225a(c7165i.f20589d, str, i2);
            C4511h.m8224a(c7165i.f20591f, str2);
        }
        if ((j & 4) != j2) {
            c7165i.f20590e.setOnClickListener(c7165i.f20594k);
        }
    }

    public final boolean mo3443d() {
        synchronized (this) {
            if (this.f20595l != 0) {
                return true;
            }
            return false;
        }
    }
}
