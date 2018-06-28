package mobi.mmdt.ott.view.main.explorechannelslist.p461a;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public final class C7216a extends Adapter<ViewHolder> {
    private final List<C4195a> f16884a = new ArrayList(3);
    private final Map<Adapter, C4195a> f16885b = new HashMap(3);
    private final NavigableMap<Integer, C4195a> f16886c = new TreeMap();
    private final Map<String, C4197d> f16887d = new HashMap();
    private final SparseArray<C4197d> f16888e = new SparseArray();
    private int f16889f = 0;
    private boolean f16890g = false;
    private C4198e f16891h = new C4198e(this);
    private AdapterDataObserver f16892i = new C62361(this);

    class C4195a {
        final Adapter f11940a;
        final String f11941b;
        C6237b f11942c;
        int f11943d = -1;
        int f11944e = -1;
        final /* synthetic */ C7216a f11945f;

        C4195a(C7216a c7216a, Adapter adapter, String str) {
            this.f11945f = c7216a;
            this.f11940a = adapter;
            this.f11941b = str;
        }

        final void m8041a() {
            if (this.f11942c == null) {
                this.f11942c = new C6237b(this.f11945f, this);
                this.f11940a.registerAdapterDataObserver(this.f11942c);
                if (this.f11940a instanceof C7216a) {
                    for (C4195a a : ((C7216a) this.f11940a).f16884a) {
                        a.m8041a();
                    }
                }
            }
        }

        final void m8042b() {
            if (this.f11942c != null) {
                this.f11940a.unregisterAdapterDataObserver(this.f11942c);
                this.f11942c = null;
                if (this.f11940a instanceof C7216a) {
                    for (C4195a b : ((C7216a) this.f11940a).f16884a) {
                        b.m8042b();
                    }
                }
            }
        }
    }

    public interface C4196c {
        String mo2404a();
    }

    class C4197d {
        final Set<Adapter> f11946a = Collections.newSetFromMap(new WeakHashMap(2));
        final C4199f f11947b = new C4199f(this.f11949d);
        final C4198e f11948c;
        final /* synthetic */ C7216a f11949d;

        C4197d(C7216a c7216a, C4198e c4198e) {
            this.f11949d = c7216a;
            this.f11948c = c4198e;
        }
    }

    private class C4198e {
        int f11950a = 1;
        final /* synthetic */ C7216a f11951b;

        C4198e(C7216a c7216a) {
            this.f11951b = c7216a;
        }
    }

    class C4199f {
        SparseIntArray f11952a = new SparseIntArray();
        SparseIntArray f11953b = new SparseIntArray();
        final /* synthetic */ C7216a f11954c;

        C4199f(C7216a c7216a) {
            this.f11954c = c7216a;
        }
    }

    class C62361 extends AdapterDataObserver {
        final /* synthetic */ C7216a f16881a;

        C62361(C7216a c7216a) {
            this.f16881a = c7216a;
        }

        public final void onChanged() {
            this.f16881a.m14437a();
        }

        public final void onItemRangeChanged(int i, int i2) {
            this.f16881a.m14437a();
        }

        public final void onItemRangeChanged(int i, int i2, Object obj) {
            this.f16881a.m14437a();
        }

        public final void onItemRangeInserted(int i, int i2) {
            this.f16881a.m14437a();
        }

        public final void onItemRangeMoved(int i, int i2, int i3) {
            this.f16881a.m14437a();
        }

        public final void onItemRangeRemoved(int i, int i2) {
            this.f16881a.m14437a();
        }
    }

    class C6237b extends AdapterDataObserver {
        final C4195a f16882a;
        final /* synthetic */ C7216a f16883b;

        C6237b(C7216a c7216a, C4195a c4195a) {
            this.f16883b = c7216a;
            this.f16882a = c4195a;
        }

        public final void onChanged() {
            this.f16883b.m14437a();
            this.f16883b.notifyDataSetChanged();
        }

        public final void onItemRangeChanged(int i, int i2) {
            this.f16883b.m14437a();
            this.f16883b.notifyItemRangeChanged(i + this.f16882a.f11943d, i2);
        }

        public final void onItemRangeChanged(int i, int i2, Object obj) {
            this.f16883b.m14437a();
            this.f16883b.notifyItemRangeChanged(i + this.f16882a.f11943d, i2, obj);
        }

        public final void onItemRangeInserted(int i, int i2) {
            this.f16883b.m14437a();
            this.f16883b.notifyItemRangeInserted(i + this.f16882a.f11943d, i2);
        }

        public final void onItemRangeMoved(int i, int i2, int i3) {
            this.f16883b.m14437a();
            i += this.f16882a.f11943d;
            for (int i4 = 0; i4 < i3; i4++) {
                this.f16883b.notifyItemMoved(i + i4, i2 + i4);
            }
        }

        public final void onItemRangeRemoved(int i, int i2) {
            this.f16883b.m14437a();
            this.f16883b.notifyItemRangeRemoved(i + this.f16882a.f11943d, i2);
        }
    }

    private C4195a m14436a(int i) {
        return (C4195a) this.f16886c.floorEntry(Integer.valueOf(i)).getValue();
    }

    private void m14437a() {
        this.f16886c.clear();
        int i = 0;
        for (C4195a c4195a : this.f16884a) {
            this.f16886c.put(Integer.valueOf(i), c4195a);
            c4195a.f11943d = i;
            c4195a.f11944e = c4195a.f11940a.getItemCount();
            i += c4195a.f11944e;
        }
        this.f16889f = i;
    }

    private void m14439a(C7216a c7216a, boolean z) {
        c7216a.f16890g = z;
        for (C4195a c4195a : c7216a.f16884a) {
            if (z) {
                c4195a.m8041a();
            } else {
                c4195a.m8042b();
            }
            if (c4195a.f11940a instanceof C7216a) {
                m14439a((C7216a) c4195a.f11940a, z);
            }
        }
    }

    public final void m14441a(Adapter adapter) {
        String a;
        C4195a c4195a;
        int size = this.f16884a.size();
        if (adapter instanceof C4196c) {
            a = ((C4196c) adapter).mo2404a();
            if (a != null) {
                c4195a = new C4195a(this, adapter, a);
                if (this.f16885b.containsKey(adapter)) {
                    this.f16884a.add(size, c4195a);
                    this.f16885b.put(adapter, c4195a);
                    if (adapter instanceof C7216a) {
                        ((C7216a) adapter).f16890g = this.f16890g;
                    }
                    if (this.f16890g) {
                        m14437a();
                        c4195a.m8041a();
                        notifyItemRangeInserted(c4195a.f11943d, c4195a.f11944e);
                        return;
                    }
                    return;
                }
                throw new InvalidParameterException("The adapter is already present in the CompoundAdapter");
            }
        }
        a = adapter.getClass().toString();
        c4195a = new C4195a(this, adapter, a);
        if (this.f16885b.containsKey(adapter)) {
            this.f16884a.add(size, c4195a);
            this.f16885b.put(adapter, c4195a);
            if (adapter instanceof C7216a) {
                ((C7216a) adapter).f16890g = this.f16890g;
            }
            if (this.f16890g) {
                m14437a();
                c4195a.m8041a();
                notifyItemRangeInserted(c4195a.f11943d, c4195a.f11944e);
                return;
            }
            return;
        }
        throw new InvalidParameterException("The adapter is already present in the CompoundAdapter");
    }

    public final int getItemCount() {
        m14437a();
        return this.f16889f;
    }

    public final long getItemId(int i) {
        C4195a a = m14436a(i);
        return a.f11940a.getItemId(i - a.f11943d);
    }

    public final int getItemViewType(int i) {
        C4195a a;
        Map map = this.f16887d;
        SparseArray sparseArray = this.f16888e;
        C4198e c4198e = this.f16891h;
        int i2 = i;
        C7216a c7216a = this;
        while (true) {
            a = c7216a.m14436a(i2);
            i2 -= a.f11943d;
            if (!(a.f11940a instanceof C7216a)) {
                break;
            }
            c7216a = (C7216a) a.f11940a;
        }
        i2 = a.f11940a.getItemViewType(i2);
        C4197d c4197d = (C4197d) map.get(a.f11941b);
        if (c4197d == null) {
            c4197d = new C4197d(c7216a, c4198e);
            map.put(a.f11941b, c4197d);
        }
        if (!c4197d.f11946a.contains(a.f11940a)) {
            c4197d.f11946a.add(a.f11940a);
        }
        i = c4197d.f11947b.f11952a.get(i2, 0);
        if (i == 0) {
            C4198e c4198e2 = c4197d.f11948c;
            int i3 = c4198e2.f11950a;
            c4198e2.f11950a = i3 + 1;
            c4197d.f11947b.f11952a.put(i2, i3);
            c4197d.f11947b.f11953b.put(i3, i2);
            i = i3;
        }
        sparseArray.put(i, c4197d);
        return i;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        m14439a(this, true);
        registerAdapterDataObserver(this.f16892i);
    }

    public final void onBindViewHolder(ViewHolder viewHolder, int i) {
        C4195a a = m14436a(i);
        a.f11940a.onBindViewHolder(viewHolder, i - a.f11943d);
    }

    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C4197d c4197d = (C4197d) this.f16888e.get(i);
        return ((Adapter) c4197d.f11946a.iterator().next()).onCreateViewHolder(viewGroup, c4197d.f11947b.f11953b.get(i));
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        m14439a(this, false);
        unregisterAdapterDataObserver(this.f16892i);
    }
}
