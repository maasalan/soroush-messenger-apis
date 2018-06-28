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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.conversation.activities.p419a.p420a.C3315b;
import mobi.mmdt.ott.view.conversation.activities.p419a.p420a.p422b.C7340a;
import mobi.mmdt.ott.view.tools.C4511h;

public final class C7161e extends ViewDataBinding {
    private static final C0120b f20546i = null;
    private static final SparseIntArray f20547j;
    public final RoundAvatarImageView f20548d;
    public final RelativeLayout f20549e;
    public final TextView f20550f;
    public final ImageView f20551g;
    public C3315b f20552h;
    private C7340a f20553k;
    private long f20554l = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20547j = sparseIntArray;
        sparseIntArray.put(R.id.selected_view, 3);
    }

    public C7161e(C0130f c0130f, View view) {
        super(c0130f, view, 1);
        Object[] a = ViewDataBinding.m14831a(c0130f, view, 4, f20546i, f20547j);
        this.f20548d = (RoundAvatarImageView) a[1];
        this.f20548d.setTag(null);
        this.f20549e = (RelativeLayout) a[0];
        this.f20549e.setTag(null);
        this.f20550f = (TextView) a[2];
        this.f20550f.setTag(null);
        this.f20551g = (ImageView) a[3];
        m14840a(view);
        synchronized (this) {
            this.f20554l = 64;
        }
        m14846e();
    }

    public static C7161e m18911a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (C7161e) C0131g.m206a(layoutInflater, R.layout.list_item_floating_forward, viewGroup, C0131g.m208a());
    }

    private boolean m18912b(int i) {
        if (i == 0) {
            synchronized (this) {
                this.f20554l |= 1;
            }
            return true;
        } else if (i == 2) {
            synchronized (this) {
                this.f20554l |= 4;
            }
            return true;
        } else if (i == 18) {
            synchronized (this) {
                this.f20554l |= 8;
            }
            return true;
        } else if (i == 7) {
            synchronized (this) {
                this.f20554l |= 16;
            }
            return true;
        } else if (i != 8) {
            return false;
        } else {
            synchronized (this) {
                this.f20554l |= 32;
            }
            return true;
        }
    }

    public final void m18913a(C7340a c7340a) {
        m14842a((C0133h) c7340a);
        this.f20553k = c7340a;
        synchronized (this) {
            this.f20554l |= 1;
        }
        b_(13);
        super.m14846e();
    }

    protected final boolean mo3441a(int i, int i2) {
        return i != 0 ? false : m18912b(i2);
    }

    protected final void mo3442c() {
        long j;
        C7161e c7161e = this;
        synchronized (this) {
            try {
                j = c7161e.f20554l;
                long j2 = 0;
                c7161e.f20554l = 0;
            } finally {
                j = r0;
            }
        }
        C7340a c7340a = c7161e.f20553k;
        long j3 = 97;
        long j4 = 256;
        long j5 = 77;
        String str = null;
        Object obj = null;
        int i;
        String str2;
        int i2;
        String str3;
        String str4;
        long j6;
        if ((j & 125) != 0) {
            i = ((j & 81) == 0 || c7340a == null) ? 0 : c7340a.f21190f;
            long j7 = j & 77;
            if (j7 != 0) {
                if (c7340a != null) {
                    str2 = c7340a.f21188d;
                    i2 = c7340a.f19503j;
                } else {
                    str2 = null;
                    i2 = 0;
                }
                if (str2 == null) {
                    obj = 1;
                }
                if (j7 != 0) {
                    if (obj != null) {
                        j7 = j | 256;
                    } else {
                        j |= 128;
                    }
                }
            } else {
                str2 = null;
                i2 = 0;
            }
            str3 = ((j & j3) == j2 || c7340a == null) ? str : c7340a.f21187c;
            str4 = ((j & j4) != j2 || c7340a == null) ? str : c7340a.f21189e;
            j6 = j & j5;
            if (j6 != j2) {
                str = obj == null ? str4 : str2;
            }
            str4 = str;
            if ((j & 81) != j2) {
                c7161e.f20548d.setBackgroundColor(i);
            }
            if (j6 != j2) {
                C4511h.m8225a(c7161e.f20548d, str4, i2);
            }
            if ((j & 97) != j2) {
                C4511h.m8224a(c7161e.f20550f, str3);
            }
        }
        str3 = null;
        str2 = str3;
        i = 0;
        i2 = i;
        if ((j & j4) != j2) {
        }
        j6 = j & j5;
        if (j6 != j2) {
            if (obj == null) {
            }
        }
        str4 = str;
        if ((j & 81) != j2) {
            c7161e.f20548d.setBackgroundColor(i);
        }
        if (j6 != j2) {
            C4511h.m8225a(c7161e.f20548d, str4, i2);
        }
        if ((j & 97) != j2) {
            C4511h.m8224a(c7161e.f20550f, str3);
        }
    }

    public final boolean mo3443d() {
        synchronized (this) {
            if (this.f20554l != 0) {
                return true;
            }
            return false;
        }
    }
}
