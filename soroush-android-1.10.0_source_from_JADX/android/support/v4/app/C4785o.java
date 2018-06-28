package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.view.C0565n;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class C4785o extends C0565n {
    private final C0390k f13318a;
    private C0401p f13319b = null;
    private ArrayList<SavedState> f13320c = new ArrayList();
    private ArrayList<Fragment> f13321d = new ArrayList();
    private Fragment f13322e = null;

    public C4785o(C0390k c0390k) {
        this.f13318a = c0390k;
    }

    public final Parcelable mo207a() {
        Parcelable bundle;
        if (this.f13320c.size() > 0) {
            bundle = new Bundle();
            Parcelable[] parcelableArr = new SavedState[this.f13320c.size()];
            this.f13320c.toArray(parcelableArr);
            bundle.putParcelableArray("states", parcelableArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f13321d.size(); i++) {
            Fragment fragment = (Fragment) this.f13321d.get(i);
            if (fragment != null && fragment.m8914n()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder stringBuilder = new StringBuilder("f");
                stringBuilder.append(i);
                this.f13318a.mo255a(bundle, stringBuilder.toString(), fragment);
            }
        }
        return bundle;
    }

    public abstract Fragment mo3186a(int i);

    public final Object mo208a(ViewGroup viewGroup, int i) {
        Fragment fragment;
        if (this.f13321d.size() > i) {
            fragment = (Fragment) this.f13321d.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.f13319b == null) {
            this.f13319b = this.f13318a.mo254a();
        }
        fragment = mo3186a(i);
        if (this.f13320c.size() > i) {
            SavedState savedState = (SavedState) this.f13320c.get(i);
            if (savedState != null) {
                if (fragment.f13202n >= 0) {
                    throw new IllegalStateException("Fragment already active");
                }
                Bundle bundle = (savedState == null || savedState.f1345a == null) ? null : savedState.f1345a;
                fragment.f13200l = bundle;
            }
        }
        while (this.f13321d.size() <= i) {
            this.f13321d.add(null);
        }
        fragment.m8893b(false);
        fragment.m8896c(false);
        this.f13321d.set(i, fragment);
        this.f13319b.mo234a(viewGroup.getId(), fragment);
        return fragment;
    }

    public final void mo209a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f13320c.clear();
            this.f13321d.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f13320c.add((SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment a = this.f13318a.mo252a(bundle, str);
                    if (a != null) {
                        while (this.f13321d.size() <= parseInt) {
                            this.f13321d.add(null);
                        }
                        a.m8893b(false);
                        this.f13321d.set(parseInt, a);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Bad fragment at key ");
                        stringBuilder.append(str);
                        Log.w("FragmentStatePagerAdapt", stringBuilder.toString());
                    }
                }
            }
        }
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
        Fragment fragment = (Fragment) obj;
        if (this.f13319b == null) {
            this.f13319b = this.f13318a.mo254a();
        }
        while (this.f13320c.size() <= i) {
            this.f13320c.add(null);
        }
        this.f13320c.set(i, fragment.m8914n() ? this.f13318a.mo250a(fragment) : null);
        this.f13321d.set(i, null);
        this.f13319b.mo236a(fragment);
    }

    public final void mo212a(Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f13322e) {
            if (this.f13322e != null) {
                this.f13322e.m8893b(false);
                this.f13322e.m8896c(false);
            }
            if (fragment != null) {
                fragment.m8893b(true);
                fragment.m8896c(true);
            }
            this.f13322e = fragment;
        }
    }

    public final boolean mo213a(View view, Object obj) {
        return ((Fragment) obj).f13189Q == view;
    }

    public final void mo214b(ViewGroup viewGroup) {
        if (this.f13319b != null) {
            this.f13319b.mo245e();
            this.f13319b = null;
        }
    }
}
