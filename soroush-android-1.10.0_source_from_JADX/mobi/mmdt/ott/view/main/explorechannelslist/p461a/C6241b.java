package mobi.mmdt.ott.view.main.explorechannelslist.p461a;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import mobi.mmdt.ott.view.main.explorechannelslist.p461a.C7216a.C4196c;

public final class C6241b<T extends ViewHolder> extends Adapter<T> implements C4196c {
    private final C4201b<T> f16894a;
    private final C4200a<T> f16895b = null;
    private long f16896c = -1;

    public interface C4200a<T extends ViewHolder> {
    }

    public interface C4201b<T extends ViewHolder> {
        T mo2403a();
    }

    static class C6240c extends ViewHolder {
        public C6240c(View view) {
            super(view);
        }
    }

    private C6241b(C4201b<T> c4201b) {
        this.f16894a = c4201b;
    }

    public static C6241b m14443a(final View view) {
        return new C6241b(new C4201b<C6240c>() {
            public final /* synthetic */ ViewHolder mo2403a() {
                return new C6240c(view);
            }
        });
    }

    public final String mo2404a() {
        return this.f16894a.getClass().toString();
    }

    public final int getItemCount() {
        return 1;
    }

    public final long getItemId(int i) {
        return this.f16896c;
    }

    public final void onBindViewHolder(T t, int i) {
        if (this.f16895b != null) {
        }
    }

    public final T onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f16894a.mo2403a();
    }
}
