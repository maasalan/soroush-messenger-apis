package android.support.v13.app;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Parcelable;
import android.support.v4.view.C0565n;
import android.view.View;
import android.view.ViewGroup;

public abstract class C4760b extends C0565n {
    private final FragmentManager f13153a;
    private FragmentTransaction f13154b = null;
    private Fragment f13155c = null;

    public C4760b(FragmentManager fragmentManager) {
        this.f13153a = fragmentManager;
    }

    private static String m8826a(int i, long j) {
        StringBuilder stringBuilder = new StringBuilder("android:switcher:");
        stringBuilder.append(i);
        stringBuilder.append(":");
        stringBuilder.append(j);
        return stringBuilder.toString();
    }

    public abstract Fragment mo3253a(int i);

    public final Parcelable mo207a() {
        return null;
    }

    public final Object mo208a(ViewGroup viewGroup, int i) {
        if (this.f13154b == null) {
            this.f13154b = this.f13153a.beginTransaction();
        }
        long j = (long) i;
        Fragment findFragmentByTag = this.f13153a.findFragmentByTag(C4760b.m8826a(viewGroup.getId(), j));
        if (findFragmentByTag != null) {
            this.f13154b.attach(findFragmentByTag);
        } else {
            findFragmentByTag = mo3253a(i);
            this.f13154b.add(viewGroup.getId(), findFragmentByTag, C4760b.m8826a(viewGroup.getId(), j));
        }
        if (findFragmentByTag != this.f13155c) {
            findFragmentByTag.setMenuVisibility(false);
            C0339a.m663a(findFragmentByTag, false);
        }
        return findFragmentByTag;
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
        if (this.f13154b == null) {
            this.f13154b = this.f13153a.beginTransaction();
        }
        this.f13154b.detach((Fragment) obj);
    }

    public final void mo212a(Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f13155c) {
            if (this.f13155c != null) {
                this.f13155c.setMenuVisibility(false);
                C0339a.m663a(this.f13155c, false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                C0339a.m663a(fragment, true);
            }
            this.f13155c = fragment;
        }
    }

    public final boolean mo213a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public final void mo214b(ViewGroup viewGroup) {
        if (this.f13154b != null) {
            this.f13154b.commitAllowingStateLoss();
            this.f13154b = null;
            this.f13153a.executePendingTransactions();
        }
    }
}
