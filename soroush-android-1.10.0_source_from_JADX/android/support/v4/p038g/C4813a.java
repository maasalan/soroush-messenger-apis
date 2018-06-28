package android.support.v4.p038g;

import android.support.v4.p038g.C0475h.C0471b;
import android.support.v4.p038g.C0475h.C0474e;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C4813a<K, V> extends C0482m<K, V> implements Map<K, V> {
    C0475h<K, V> f13394a;

    class C48121 extends C0475h<K, V> {
        final /* synthetic */ C4813a f13393a;

        C48121(C4813a c4813a) {
            this.f13393a = c4813a;
        }

        protected final int mo298a() {
            return this.f13393a.h;
        }

        protected final int mo299a(Object obj) {
            return this.f13393a.m1015a(obj);
        }

        protected final Object mo300a(int i, int i2) {
            return this.f13393a.g[(i << 1) + i2];
        }

        protected final V mo301a(int i, V v) {
            C0482m c0482m = this.f13393a;
            i = (i << 1) + 1;
            V v2 = c0482m.f1646g[i];
            c0482m.f1646g[i] = v;
            return v2;
        }

        protected final void mo302a(int i) {
            this.f13393a.m1021d(i);
        }

        protected final void mo303a(K k, V v) {
            this.f13393a.put(k, v);
        }

        protected final int mo304b(Object obj) {
            return this.f13393a.m1018b(obj);
        }

        protected final Map<K, V> mo305b() {
            return this.f13393a;
        }

        protected final void mo306c() {
            this.f13393a.clear();
        }
    }

    public C4813a(int i) {
        super(i);
    }

    public C4813a(C0482m c0482m) {
        super(c0482m);
    }

    private C0475h<K, V> m9189a() {
        if (this.f13394a == null) {
            this.f13394a = new C48121(this);
        }
        return this.f13394a;
    }

    public Set<Entry<K, V>> entrySet() {
        C0475h a = m9189a();
        if (a.f1635b == null) {
            a.f1635b = new C0471b(a);
        }
        return a.f1635b;
    }

    public Set<K> keySet() {
        return m9189a().m1003d();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m1016a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        C0475h a = m9189a();
        if (a.f1637d == null) {
            a.f1637d = new C0474e(a);
        }
        return a.f1637d;
    }
}
