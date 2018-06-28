package android.support.v4.p038g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class C0475h<K, V> {
    C0471b f1635b;
    C0472c f1636c;
    C0474e f1637d;

    final class C0470a<T> implements Iterator<T> {
        final int f1623a;
        int f1624b;
        int f1625c;
        boolean f1626d = false;
        final /* synthetic */ C0475h f1627e;

        C0470a(C0475h c0475h, int i) {
            this.f1627e = c0475h;
            this.f1623a = i;
            this.f1624b = c0475h.mo298a();
        }

        public final boolean hasNext() {
            return this.f1625c < this.f1624b;
        }

        public final T next() {
            if (hasNext()) {
                T a = this.f1627e.mo300a(this.f1625c, this.f1623a);
                this.f1625c++;
                this.f1626d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f1626d) {
                this.f1625c--;
                this.f1624b--;
                this.f1626d = false;
                this.f1627e.mo302a(this.f1625c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class C0471b implements Set<Entry<K, V>> {
        final /* synthetic */ C0475h f1628a;

        C0471b(C0475h c0475h) {
            this.f1628a = c0475h;
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = this.f1628a.mo298a();
            for (Entry entry : collection) {
                this.f1628a.mo303a(entry.getKey(), entry.getValue());
            }
            return a != this.f1628a.mo298a();
        }

        public final void clear() {
            this.f1628a.mo306c();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = this.f1628a.mo299a(entry.getKey());
            return a < 0 ? false : C0465c.m977a(this.f1628a.mo300a(a, 1), entry.getValue());
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return C0475h.m991a((Set) this, obj);
        }

        public final int hashCode() {
            int i = 0;
            for (int a = this.f1628a.mo298a() - 1; a >= 0; a--) {
                Object a2 = this.f1628a.mo300a(a, 0);
                Object a3 = this.f1628a.mo300a(a, 1);
                i += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public final boolean isEmpty() {
            return this.f1628a.mo298a() == 0;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C0473d(this.f1628a);
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return this.f1628a.mo298a();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class C0472c implements Set<K> {
        final /* synthetic */ C0475h f1629a;

        C0472c(C0475h c0475h) {
            this.f1629a = c0475h;
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            this.f1629a.mo306c();
        }

        public final boolean contains(Object obj) {
            return this.f1629a.mo299a(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map b = this.f1629a.mo305b();
            for (Object containsKey : collection) {
                if (!b.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return C0475h.m991a((Set) this, obj);
        }

        public final int hashCode() {
            int i = 0;
            for (int a = this.f1629a.mo298a() - 1; a >= 0; a--) {
                Object a2 = this.f1629a.mo300a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public final boolean isEmpty() {
            return this.f1629a.mo298a() == 0;
        }

        public final Iterator<K> iterator() {
            return new C0470a(this.f1629a, 0);
        }

        public final boolean remove(Object obj) {
            int a = this.f1629a.mo299a(obj);
            if (a < 0) {
                return false;
            }
            this.f1629a.mo302a(a);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map b = this.f1629a.mo305b();
            int size = b.size();
            for (Object remove : collection) {
                b.remove(remove);
            }
            return size != b.size();
        }

        public final boolean retainAll(Collection<?> collection) {
            return C0475h.m990a(this.f1629a.mo305b(), (Collection) collection);
        }

        public final int size() {
            return this.f1629a.mo298a();
        }

        public final Object[] toArray() {
            return this.f1629a.m1001b(0);
        }

        public final <T> T[] toArray(T[] tArr) {
            return this.f1629a.m998a((Object[]) tArr, 0);
        }
    }

    final class C0473d implements Iterator<Entry<K, V>>, Entry<K, V> {
        int f1630a;
        int f1631b;
        boolean f1632c = false;
        final /* synthetic */ C0475h f1633d;

        C0473d(C0475h c0475h) {
            this.f1633d = c0475h;
            this.f1630a = c0475h.mo298a() - 1;
            this.f1631b = -1;
        }

        public final boolean equals(Object obj) {
            if (!this.f1632c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                return C0465c.m977a(entry.getKey(), this.f1633d.mo300a(this.f1631b, 0)) && C0465c.m977a(entry.getValue(), this.f1633d.mo300a(this.f1631b, 1));
            }
        }

        public final K getKey() {
            if (this.f1632c) {
                return this.f1633d.mo300a(this.f1631b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f1632c) {
                return this.f1633d.mo300a(this.f1631b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.f1631b < this.f1630a;
        }

        public final int hashCode() {
            if (this.f1632c) {
                int i = 0;
                Object a = this.f1633d.mo300a(this.f1631b, 0);
                Object a2 = this.f1633d.mo300a(this.f1631b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.f1631b++;
                this.f1632c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f1632c) {
                this.f1633d.mo302a(this.f1631b);
                this.f1631b--;
                this.f1630a--;
                this.f1632c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v) {
            if (this.f1632c) {
                return this.f1633d.mo301a(this.f1631b, (Object) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getKey());
            stringBuilder.append("=");
            stringBuilder.append(getValue());
            return stringBuilder.toString();
        }
    }

    final class C0474e implements Collection<V> {
        final /* synthetic */ C0475h f1634a;

        C0474e(C0475h c0475h) {
            this.f1634a = c0475h;
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            this.f1634a.mo306c();
        }

        public final boolean contains(Object obj) {
            return this.f1634a.mo304b(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return this.f1634a.mo298a() == 0;
        }

        public final Iterator<V> iterator() {
            return new C0470a(this.f1634a, 1);
        }

        public final boolean remove(Object obj) {
            int b = this.f1634a.mo304b(obj);
            if (b < 0) {
                return false;
            }
            this.f1634a.mo302a(b);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int a = this.f1634a.mo298a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(this.f1634a.mo300a(i, 1))) {
                    this.f1634a.mo302a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int a = this.f1634a.mo298a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(this.f1634a.mo300a(i, 1))) {
                    this.f1634a.mo302a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final int size() {
            return this.f1634a.mo298a();
        }

        public final Object[] toArray() {
            return this.f1634a.m1001b(1);
        }

        public final <T> T[] toArray(T[] tArr) {
            return this.f1634a.m998a((Object[]) tArr, 1);
        }
    }

    C0475h() {
    }

    public static <K, V> boolean m990a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <T> boolean m991a(java.util.Set<T> r4, java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Set;
        r2 = 0;
        if (r1 == 0) goto L_0x001c;
    L_0x0009:
        r5 = (java.util.Set) r5;
        r1 = r4.size();	 Catch:{ NullPointerException -> 0x001c, NullPointerException -> 0x001c }
        r3 = r5.size();	 Catch:{ NullPointerException -> 0x001c, NullPointerException -> 0x001c }
        if (r1 != r3) goto L_0x001c;	 Catch:{ NullPointerException -> 0x001c, NullPointerException -> 0x001c }
    L_0x0015:
        r4 = r4.containsAll(r5);	 Catch:{ NullPointerException -> 0x001c, NullPointerException -> 0x001c }
        if (r4 == 0) goto L_0x001c;
    L_0x001b:
        return r0;
    L_0x001c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.g.h.a(java.util.Set, java.lang.Object):boolean");
    }

    protected abstract int mo298a();

    protected abstract int mo299a(Object obj);

    protected abstract Object mo300a(int i, int i2);

    protected abstract V mo301a(int i, V v);

    protected abstract void mo302a(int i);

    protected abstract void mo303a(K k, V v);

    public final <T> T[] m998a(T[] tArr, int i) {
        int a = mo298a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = mo300a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }

    protected abstract int mo304b(Object obj);

    protected abstract Map<K, V> mo305b();

    public final Object[] m1001b(int i) {
        int a = mo298a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo300a(i2, i);
        }
        return objArr;
    }

    protected abstract void mo306c();

    public final Set<K> m1003d() {
        if (this.f1636c == null) {
            this.f1636c = new C0472c(this);
        }
        return this.f1636c;
    }
}
