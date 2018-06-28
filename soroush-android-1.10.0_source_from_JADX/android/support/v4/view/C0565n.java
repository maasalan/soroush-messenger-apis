package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class C0565n {
    private final DataSetObservable f1859a = new DataSetObservable();
    private DataSetObserver f1860b;

    public Parcelable mo207a() {
        return null;
    }

    public Object mo208a(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public final void m1258a(DataSetObserver dataSetObserver) {
        this.f1859a.registerObserver(dataSetObserver);
    }

    public void mo209a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void mo210a(ViewGroup viewGroup) {
    }

    public void mo211a(ViewGroup viewGroup, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void mo212a(Object obj) {
    }

    public abstract boolean mo213a(View view, Object obj);

    public abstract int mo2270b();

    public CharSequence mo2364b(int i) {
        return null;
    }

    public final void m1266b(DataSetObserver dataSetObserver) {
        this.f1859a.unregisterObserver(dataSetObserver);
    }

    public void mo214b(ViewGroup viewGroup) {
    }

    public int mo2272c() {
        return -1;
    }

    final void m1269c(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f1860b = dataSetObserver;
        }
    }

    public final void m1270d() {
        synchronized (this) {
            if (this.f1860b != null) {
                this.f1860b.onChanged();
            }
        }
        this.f1859a.notifyChanged();
    }
}
