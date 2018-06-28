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
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p105g.C1248f;
import mobi.mmdt.componentsutils.view.roundavatarimageview.RoundAvatarImageView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4224d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.p580a.C7217a;
import mobi.mmdt.ott.view.tools.C4511h;

public final class C7162f extends ViewDataBinding implements C0125a {
    private static final C0120b f20555i = null;
    private static final SparseIntArray f20556j = null;
    public final TextView f20557d;
    public final TextView f20558e;
    public final RoundAvatarImageView f20559f;
    public final RelativeLayout f20560g;
    public final TextView f20561h;
    private C4224d f20562k;
    private C7217a f20563l;
    private final OnClickListener f20564m;
    private final OnClickListener f20565n;
    private long f20566o = -1;

    public C7162f(C0130f c0130f, View view) {
        super(c0130f, view, 1);
        Object[] a = ViewDataBinding.m14831a(c0130f, view, 5, f20555i, f20556j);
        this.f20557d = (TextView) a[3];
        this.f20557d.setTag(null);
        this.f20558e = (TextView) a[4];
        this.f20558e.setTag(null);
        this.f20559f = (RoundAvatarImageView) a[1];
        this.f20559f.setTag(null);
        this.f20560g = (RelativeLayout) a[0];
        this.f20560g.setTag(null);
        this.f20561h = (TextView) a[2];
        this.f20561h.setTag(null);
        m14840a(view);
        this.f20564m = new C0126b(this, 2);
        this.f20565n = new C0126b(this, 1);
        synchronized (this) {
            this.f20566o = 4;
        }
        m14846e();
    }

    public static C7162f m18917a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return (C7162f) C0131g.m206a(layoutInflater, R.layout.list_item_new_design_inner_suggest_channel, viewGroup, C0131g.m208a());
    }

    private boolean m18918b(int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.f20566o |= 1;
        }
        return true;
    }

    public final void mo3444a(int i) {
        Object obj = null;
        C6829g c6829g;
        C4224d c4224d;
        switch (i) {
            case 1:
                c6829g = this.f20563l;
                c4224d = this.f20562k;
                if (c4224d != null) {
                    obj = 1;
                }
                if (obj != null) {
                    c4224d.mo3252d(c6829g);
                    break;
                }
                break;
            case 2:
                c6829g = this.f20563l;
                c4224d = this.f20562k;
                if (c4224d != null) {
                    obj = 1;
                }
                if (obj != null) {
                    c4224d.mo3249a(c6829g);
                    return;
                }
                break;
            default:
                return;
        }
    }

    public final void m18920a(C7217a c7217a) {
        m14842a((C0133h) c7217a);
        this.f20563l = c7217a;
        synchronized (this) {
            this.f20566o |= 1;
        }
        b_(31);
        super.m14846e();
    }

    public final void m18921a(C4224d c4224d) {
        this.f20562k = c4224d;
        synchronized (this) {
            this.f20566o |= 2;
        }
        b_(28);
        super.m14846e();
    }

    protected final boolean mo3441a(int i, int i2) {
        return i != 0 ? false : m18918b(i2);
    }

    protected final void mo3442c() {
        long j;
        String str;
        String str2;
        Object obj;
        synchronized (this) {
            j = this.f20566o;
            this.f20566o = 0;
        }
        C7217a c7217a = this.f20563l;
        long j2 = j & 5;
        String str3 = null;
        if (j2 == 0 || c7217a == null) {
            str = null;
            str2 = str;
            obj = str2;
        } else {
            str3 = c7217a.f20839f;
            str2 = c7217a.f20841h;
            obj = c7217a.f20842i;
            str = c7217a.f20840g;
        }
        if (j2 != 0) {
            C4511h.m8224a(this.f20557d, str);
            C4511h.m8226b(this.f20557d, str);
            C4511h.m8224a(this.f20558e, str3);
            C4511h.m8226b(this.f20558e, str3);
            ImageView imageView = this.f20559f;
            C1212c.m2875b(imageView.getContext()).m10950a(obj).m3034a(C1248f.m2945b()).m3033a().m3031a(imageView);
            C4511h.m8224a(this.f20561h, str2);
        }
        if ((j & 4) != 0) {
            this.f20558e.setOnClickListener(this.f20564m);
            this.f20560g.setOnClickListener(this.f20565n);
        }
    }

    public final boolean mo3443d() {
        synchronized (this) {
            if (this.f20566o != 0) {
                return true;
            }
            return false;
        }
    }
}
