package mobi.mmdt.ott.view.components.imageslider.Tricks;

import android.os.Parcelable;
import android.support.v4.view.C0565n;
import android.view.View;
import android.view.ViewGroup;
import mobi.mmdt.ott.view.components.imageslider.C6094a;

public final class C6093b extends C0565n {
    public C6094a f16353a;

    public C6093b(C6094a c6094a) {
        this.f16353a = c6094a;
    }

    public final Parcelable mo207a() {
        return this.f16353a.mo207a();
    }

    public final Object mo208a(ViewGroup viewGroup, int i) {
        if (m13785e() == 0) {
            return null;
        }
        return this.f16353a.mo208a(viewGroup, i % m13785e());
    }

    public final void mo209a(Parcelable parcelable, ClassLoader classLoader) {
        this.f16353a.mo209a(parcelable, classLoader);
    }

    public final void mo210a(ViewGroup viewGroup) {
        this.f16353a.mo210a(viewGroup);
    }

    public final void mo211a(ViewGroup viewGroup, int i, Object obj) {
        if (m13785e() != 0) {
            this.f16353a.mo211a(viewGroup, i % m13785e(), obj);
        }
    }

    public final boolean mo213a(View view, Object obj) {
        return this.f16353a.mo213a(view, obj);
    }

    public final int mo2270b() {
        return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public final void mo214b(ViewGroup viewGroup) {
        this.f16353a.mo214b(viewGroup);
    }

    public final int m13785e() {
        return this.f16353a.f16354a.size();
    }
}
