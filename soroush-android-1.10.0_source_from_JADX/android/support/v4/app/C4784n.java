package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.C0565n;
import android.view.View;
import android.view.ViewGroup;

public abstract class C4784n extends C0565n {
    private final C0390k f13315a;
    private C0401p f13316b = null;
    private Fragment f13317c = null;

    public C4784n(C0390k c0390k) {
        this.f13315a = c0390k;
    }

    private static String m9088a(int i, long j) {
        StringBuilder stringBuilder = new StringBuilder("android:switcher:");
        stringBuilder.append(i);
        stringBuilder.append(":");
        stringBuilder.append(j);
        return stringBuilder.toString();
    }

    public final Parcelable mo207a() {
        return null;
    }

    public abstract Fragment mo3187a(int i);

    public final Object mo208a(ViewGroup viewGroup, int i) {
        if (this.f13316b == null) {
            this.f13316b = this.f13315a.mo254a();
        }
        long j = (long) i;
        Fragment a = this.f13315a.mo253a(C4784n.m9088a(viewGroup.getId(), j));
        if (a != null) {
            this.f13316b.mo243c(a);
        } else {
            a = mo3187a(i);
            this.f13316b.mo235a(viewGroup.getId(), a, C4784n.m9088a(viewGroup.getId(), j));
        }
        if (a != this.f13317c) {
            a.m8893b(false);
            a.m8896c(false);
        }
        return a;
    }

    public final void mo209a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public final void mo210a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder stringBuilder = new StringBuilder("ViewPager with adapter ");
            stringBuilder.append(this);
            stringBuilder.append(" requires a view id");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void mo211a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f13316b == null) {
            this.f13316b = this.f13315a.mo254a();
        }
        this.f13316b.mo240b((Fragment) obj);
    }

    public final void mo212a(Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f13317c) {
            if (this.f13317c != null) {
                this.f13317c.m8893b(false);
                this.f13317c.m8896c(false);
            }
            if (fragment != null) {
                fragment.m8893b(true);
                fragment.m8896c(true);
            }
            this.f13317c = fragment;
        }
    }

    public final boolean mo213a(View view, Object obj) {
        return ((Fragment) obj).f13189Q == view;
    }

    public final void mo214b(ViewGroup viewGroup) {
        if (this.f13316b != null) {
            this.f13316b.mo245e();
            this.f13316b = null;
        }
    }
}
