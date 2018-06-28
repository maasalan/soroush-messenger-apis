package android.arch.p017a.p019b;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class C0082b<K, V> implements Iterable<Entry<K, V>> {
    public C0080c<K, V> f353b;
    public C0080c<K, V> f354c;
    public WeakHashMap<C0081f<K, V>, Boolean> f355d = new WeakHashMap();
    public int f356e = 0;

    static class C0080c<K, V> implements Entry<K, V> {
        final K f349a;
        final V f350b;
        C0080c<K, V> f351c;
        public C0080c<K, V> f352d;

        C0080c(K k, V v) {
            this.f349a = k;
            this.f350b = v;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0080c)) {
                return false;
            }
            C0080c c0080c = (C0080c) obj;
            return this.f349a.equals(c0080c.f349a) && this.f350b.equals(c0080c.f350b);
        }

        public final K getKey() {
            return this.f349a;
        }

        public final V getValue() {
            return this.f350b;
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f349a);
            stringBuilder.append("=");
            stringBuilder.append(this.f350b);
            return stringBuilder.toString();
        }
    }

    interface C0081f<K, V> {
        void a_(C0080c<K, V> c0080c);
    }

    private class C4675d implements C0081f<K, V>, Iterator<Entry<K, V>> {
        final /* synthetic */ C0082b f12867a;
        private C0080c<K, V> f12868b;
        private boolean f12869c;

        private C4675d(C0082b c0082b) {
            this.f12867a = c0082b;
            this.f12869c = true;
        }

        public final void a_(C0080c<K, V> c0080c) {
            if (c0080c == this.f12868b) {
                this.f12868b = this.f12868b.f352d;
                this.f12869c = this.f12868b == null;
            }
        }

        public final boolean hasNext() {
            return this.f12869c ? this.f12867a.f353b != null : (this.f12868b == null || this.f12868b.f351c == null) ? false : true;
        }

        public final /* synthetic */ Object next() {
            C0080c a;
            if (this.f12869c) {
                this.f12869c = false;
                a = this.f12867a.f353b;
            } else {
                a = this.f12868b != null ? this.f12868b.f351c : null;
            }
            this.f12868b = a;
            return this.f12868b;
        }
    }

    private static abstract class C4676e<K, V> implements C0081f<K, V>, Iterator<Entry<K, V>> {
        C0080c<K, V> f12870a;
        C0080c<K, V> f12871b;

        C4676e(C0080c<K, V> c0080c, C0080c<K, V> c0080c2) {
            this.f12870a = c0080c2;
            this.f12871b = c0080c;
        }

        private C0080c<K, V> m8527a() {
            if (this.f12871b != this.f12870a) {
                if (this.f12870a != null) {
                    return mo2474a(this.f12871b);
                }
            }
            return null;
        }

        abstract C0080c<K, V> mo2474a(C0080c<K, V> c0080c);

        public final void a_(C0080c<K, V> c0080c) {
            if (this.f12870a == c0080c && c0080c == this.f12871b) {
                this.f12871b = null;
                this.f12870a = null;
            }
            if (this.f12870a == c0080c) {
                this.f12870a = mo2475b(this.f12870a);
            }
            if (this.f12871b == c0080c) {
                this.f12871b = m8527a();
            }
        }

        abstract C0080c<K, V> mo2475b(C0080c<K, V> c0080c);

        public boolean hasNext() {
            return this.f12871b != null;
        }

        public /* synthetic */ Object next() {
            C0080c c0080c = this.f12871b;
            this.f12871b = m8527a();
            return c0080c;
        }
    }

    static class C6330a<K, V> extends C4676e<K, V> {
        C6330a(C0080c<K, V> c0080c, C0080c<K, V> c0080c2) {
            super(c0080c, c0080c2);
        }

        final C0080c<K, V> mo2474a(C0080c<K, V> c0080c) {
            return c0080c.f351c;
        }

        final C0080c<K, V> mo2475b(C0080c<K, V> c0080c) {
            return c0080c.f352d;
        }
    }

    private static class C6331b<K, V> extends C4676e<K, V> {
        public C6331b(C0080c<K, V> c0080c, C0080c<K, V> c0080c2) {
            super(c0080c, c0080c2);
        }

        final C0080c<K, V> mo2474a(C0080c<K, V> c0080c) {
            return c0080c.f352d;
        }

        final C0080c<K, V> mo2475b(C0080c<K, V> c0080c) {
            return c0080c.f351c;
        }
    }

    protected C0080c<K, V> mo23a(K k) {
        C0080c<K, V> c0080c = this.f353b;
        while (c0080c != null && !c0080c.f349a.equals(k)) {
            c0080c = c0080c.f351c;
        }
        return c0080c;
    }

    public final C4675d m135a() {
        C4675d c4675d = new C4675d();
        this.f355d.put(c4675d, Boolean.valueOf(false));
        return c4675d;
    }

    public V mo24a(K k, V v) {
        C0080c a = mo23a((Object) k);
        if (a != null) {
            return a.f350b;
        }
        m137b(k, v);
        return null;
    }

    protected final C0080c<K, V> m137b(K k, V v) {
        C0080c<K, V> c0080c = new C0080c(k, v);
        this.f356e++;
        if (this.f354c == null) {
            this.f353b = c0080c;
            this.f354c = this.f353b;
            return c0080c;
        }
        this.f354c.f351c = c0080c;
        c0080c.f352d = this.f354c;
        this.f354c = c0080c;
        return c0080c;
    }

    public V mo25b(K k) {
        C0080c a = mo23a((Object) k);
        if (a == null) {
            return null;
        }
        this.f356e--;
        if (!this.f355d.isEmpty()) {
            for (C0081f a_ : this.f355d.keySet()) {
                a_.a_(a);
            }
        }
        if (a.f352d != null) {
            a.f352d.f351c = a.f351c;
        } else {
            this.f353b = a.f351c;
        }
        if (a.f351c != null) {
            a.f351c.f352d = a.f352d;
        } else {
            this.f354c = a.f352d;
        }
        a.f351c = null;
        a.f352d = null;
        return a.f350b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0082b)) {
            return false;
        }
        C0082b c0082b = (C0082b) obj;
        if (this.f356e != c0082b.f356e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0082b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Iterator<Entry<K, V>> iterator() {
        Iterator c6330a = new C6330a(this.f353b, this.f354c);
        this.f355d.put(c6330a, Boolean.valueOf(false));
        return c6330a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
