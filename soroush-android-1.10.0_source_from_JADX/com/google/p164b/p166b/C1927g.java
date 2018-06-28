package com.google.p164b.p166b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class C1927g<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean f6411f = true;
    private static final Comparator<Comparable> f6412g = new C19221();
    Comparator<? super K> f6413a;
    C1926d<K, V> f6414b;
    int f6415c;
    int f6416d;
    final C1926d<K, V> f6417e;
    private C1923a f6418h;
    private C1924b f6419i;

    static class C19221 implements Comparator<Comparable> {
        C19221() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    class C1923a extends AbstractSet<Entry<K, V>> {
        final /* synthetic */ C1927g f6397a;

        class C55761 extends C1925c<Entry<K, V>> {
            final /* synthetic */ C1923a f15430a;

            C55761(C1923a c1923a) {
                this.f15430a = c1923a;
                super(c1923a.f6397a);
            }

            public final /* synthetic */ Object next() {
                return m5269a();
            }
        }

        C1923a(C1927g c1927g) {
            this.f6397a = c1927g;
        }

        public final void clear() {
            this.f6397a.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Entry) && this.f6397a.m5277a((Entry) obj) != null;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new C55761(this);
        }

        public final boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C1926d a = this.f6397a.m5277a((Entry) obj);
            if (a == null) {
                return false;
            }
            this.f6397a.m5278a(a, true);
            return true;
        }

        public final int size() {
            return this.f6397a.f6415c;
        }
    }

    final class C1924b extends AbstractSet<K> {
        final /* synthetic */ C1927g f6398a;

        class C55771 extends C1925c<K> {
            final /* synthetic */ C1924b f15431a;

            C55771(C1924b c1924b) {
                this.f15431a = c1924b;
                super(c1924b.f6398a);
            }

            public final K next() {
                return m5269a().f6408f;
            }
        }

        C1924b(C1927g c1927g) {
            this.f6398a = c1927g;
        }

        public final void clear() {
            this.f6398a.clear();
        }

        public final boolean contains(Object obj) {
            return this.f6398a.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new C55771(this);
        }

        public final boolean remove(Object obj) {
            return this.f6398a.m5276a(obj) != null;
        }

        public final int size() {
            return this.f6398a.f6415c;
        }
    }

    private abstract class C1925c<T> implements Iterator<T> {
        C1926d<K, V> f6399b = this.f6402e.f6417e.f6406d;
        C1926d<K, V> f6400c = null;
        int f6401d = this.f6402e.f6416d;
        final /* synthetic */ C1927g f6402e;

        C1925c(C1927g c1927g) {
            this.f6402e = c1927g;
        }

        final C1926d<K, V> m5269a() {
            C1926d<K, V> c1926d = this.f6399b;
            if (c1926d == this.f6402e.f6417e) {
                throw new NoSuchElementException();
            } else if (this.f6402e.f6416d != this.f6401d) {
                throw new ConcurrentModificationException();
            } else {
                this.f6399b = c1926d.f6406d;
                this.f6400c = c1926d;
                return c1926d;
            }
        }

        public final boolean hasNext() {
            return this.f6399b != this.f6402e.f6417e;
        }

        public final void remove() {
            if (this.f6400c == null) {
                throw new IllegalStateException();
            }
            this.f6402e.m5278a(this.f6400c, true);
            this.f6400c = null;
            this.f6401d = this.f6402e.f6416d;
        }
    }

    static final class C1926d<K, V> implements Entry<K, V> {
        C1926d<K, V> f6403a;
        C1926d<K, V> f6404b;
        C1926d<K, V> f6405c;
        C1926d<K, V> f6406d;
        C1926d<K, V> f6407e;
        final K f6408f;
        V f6409g;
        int f6410h;

        C1926d() {
            this.f6408f = null;
            this.f6407e = this;
            this.f6406d = this;
        }

        C1926d(C1926d<K, V> c1926d, K k, C1926d<K, V> c1926d2, C1926d<K, V> c1926d3) {
            this.f6403a = c1926d;
            this.f6408f = k;
            this.f6410h = 1;
            this.f6406d = c1926d2;
            this.f6407e = c1926d3;
            c1926d3.f6406d = this;
            c1926d2.f6407e = this;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r4) {
            /*
            r3 = this;
            r0 = r4 instanceof java.util.Map.Entry;
            r1 = 0;
            if (r0 == 0) goto L_0x0037;
        L_0x0005:
            r4 = (java.util.Map.Entry) r4;
            r0 = r3.f6408f;
            if (r0 != 0) goto L_0x0012;
        L_0x000b:
            r0 = r4.getKey();
            if (r0 != 0) goto L_0x0037;
        L_0x0011:
            goto L_0x001e;
        L_0x0012:
            r0 = r3.f6408f;
            r2 = r4.getKey();
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0037;
        L_0x001e:
            r0 = r3.f6409g;
            if (r0 != 0) goto L_0x0029;
        L_0x0022:
            r4 = r4.getValue();
            if (r4 != 0) goto L_0x0037;
        L_0x0028:
            goto L_0x0035;
        L_0x0029:
            r0 = r3.f6409g;
            r4 = r4.getValue();
            r4 = r0.equals(r4);
            if (r4 == 0) goto L_0x0037;
        L_0x0035:
            r4 = 1;
            return r4;
        L_0x0037:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.b.b.g.d.equals(java.lang.Object):boolean");
        }

        public final K getKey() {
            return this.f6408f;
        }

        public final V getValue() {
            return this.f6409g;
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = this.f6408f == null ? 0 : this.f6408f.hashCode();
            if (this.f6409g != null) {
                i = this.f6409g.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            V v2 = this.f6409g;
            this.f6409g = v;
            return v2;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f6408f);
            stringBuilder.append("=");
            stringBuilder.append(this.f6409g);
            return stringBuilder.toString();
        }
    }

    public C1927g() {
        this(f6412g);
    }

    private C1927g(Comparator<? super K> comparator) {
        Comparator comparator2;
        this.f6415c = 0;
        this.f6416d = 0;
        this.f6417e = new C1926d();
        if (comparator == null) {
            comparator2 = f6412g;
        }
        this.f6413a = comparator2;
    }

    private C1926d<K, V> m5270a(K k, boolean z) {
        int compareTo;
        Comparator comparator = this.f6413a;
        C1926d c1926d = this.f6414b;
        if (c1926d != null) {
            Comparable comparable = comparator == f6412g ? (Comparable) k : null;
            while (true) {
                compareTo = comparable != null ? comparable.compareTo(c1926d.f6408f) : comparator.compare(k, c1926d.f6408f);
                if (compareTo != 0) {
                    C1926d c1926d2 = compareTo < 0 ? c1926d.f6404b : c1926d.f6405c;
                    if (c1926d2 == null) {
                        break;
                    }
                    c1926d = c1926d2;
                } else {
                    return c1926d;
                }
            }
        }
        compareTo = 0;
        if (!z) {
            return null;
        }
        C1926d<K, V> c1926d3;
        C1926d c1926d4 = this.f6417e;
        if (c1926d != null) {
            c1926d3 = new C1926d(c1926d, k, c1926d4, c1926d4.f6407e);
            if (compareTo < 0) {
                c1926d.f6404b = c1926d3;
            } else {
                c1926d.f6405c = c1926d3;
            }
            m5275b(c1926d, true);
        } else if (comparator != f6412g || (k instanceof Comparable)) {
            c1926d3 = new C1926d(c1926d, k, c1926d4, c1926d4.f6407e);
            this.f6414b = c1926d3;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(k.getClass().getName());
            stringBuilder.append(" is not Comparable");
            throw new ClassCastException(stringBuilder.toString());
        }
        this.f6415c++;
        this.f6416d++;
        return c1926d3;
    }

    private void m5271a(C1926d<K, V> c1926d) {
        C1926d c1926d2 = c1926d.f6404b;
        C1926d c1926d3 = c1926d.f6405c;
        C1926d c1926d4 = c1926d3.f6404b;
        C1926d c1926d5 = c1926d3.f6405c;
        c1926d.f6405c = c1926d4;
        if (c1926d4 != null) {
            c1926d4.f6403a = c1926d;
        }
        m5272a((C1926d) c1926d, c1926d3);
        c1926d3.f6404b = c1926d;
        c1926d.f6403a = c1926d3;
        int i = 0;
        c1926d.f6410h = Math.max(c1926d2 != null ? c1926d2.f6410h : 0, c1926d4 != null ? c1926d4.f6410h : 0) + 1;
        int i2 = c1926d.f6410h;
        if (c1926d5 != null) {
            i = c1926d5.f6410h;
        }
        c1926d3.f6410h = Math.max(i2, i) + 1;
    }

    private void m5272a(C1926d<K, V> c1926d, C1926d<K, V> c1926d2) {
        C1926d c1926d3 = c1926d.f6403a;
        c1926d.f6403a = null;
        if (c1926d2 != null) {
            c1926d2.f6403a = c1926d3;
        }
        if (c1926d3 == null) {
            this.f6414b = c1926d2;
        } else if (c1926d3.f6404b == c1926d) {
            c1926d3.f6404b = c1926d2;
        } else if (f6411f || c1926d3.f6405c == c1926d) {
            c1926d3.f6405c = c1926d2;
        } else {
            throw new AssertionError();
        }
    }

    private com.google.p164b.p166b.C1927g.C1926d<K, V> m5273b(java.lang.Object r3) {
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
        r2 = this;
        r0 = 0;
        if (r3 == 0) goto L_0x0009;
    L_0x0003:
        r1 = 0;
        r3 = r2.m5270a(r3, r1);	 Catch:{ ClassCastException -> 0x0009 }
        return r3;
    L_0x0009:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.b.g.b(java.lang.Object):com.google.b.b.g$d<K, V>");
    }

    private void m5274b(C1926d<K, V> c1926d) {
        C1926d c1926d2 = c1926d.f6404b;
        C1926d c1926d3 = c1926d.f6405c;
        C1926d c1926d4 = c1926d2.f6404b;
        C1926d c1926d5 = c1926d2.f6405c;
        c1926d.f6404b = c1926d5;
        if (c1926d5 != null) {
            c1926d5.f6403a = c1926d;
        }
        m5272a((C1926d) c1926d, c1926d2);
        c1926d2.f6405c = c1926d;
        c1926d.f6403a = c1926d2;
        int i = 0;
        c1926d.f6410h = Math.max(c1926d3 != null ? c1926d3.f6410h : 0, c1926d5 != null ? c1926d5.f6410h : 0) + 1;
        int i2 = c1926d.f6410h;
        if (c1926d4 != null) {
            i = c1926d4.f6410h;
        }
        c1926d2.f6410h = Math.max(i2, i) + 1;
    }

    private void m5275b(C1926d<K, V> c1926d, boolean z) {
        C1926d c1926d2;
        while (c1926d2 != null) {
            C1926d c1926d3 = c1926d2.f6404b;
            C1926d c1926d4 = c1926d2.f6405c;
            int i = 0;
            int i2 = c1926d3 != null ? c1926d3.f6410h : 0;
            int i3 = c1926d4 != null ? c1926d4.f6410h : 0;
            int i4 = i2 - i3;
            C1926d c1926d5;
            if (i4 == -2) {
                c1926d3 = c1926d4.f6404b;
                c1926d5 = c1926d4.f6405c;
                i2 = c1926d5 != null ? c1926d5.f6410h : 0;
                if (c1926d3 != null) {
                    i = c1926d3.f6410h;
                }
                i -= i2;
                if (i != -1) {
                    if (i != 0 || z) {
                        if (f6411f || i == 1) {
                            m5274b(c1926d4);
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
                m5271a(c1926d2);
                if (z) {
                    break;
                }
            } else if (i4 == 2) {
                c1926d4 = c1926d3.f6404b;
                c1926d5 = c1926d3.f6405c;
                i2 = c1926d5 != null ? c1926d5.f6410h : 0;
                if (c1926d4 != null) {
                    i = c1926d4.f6410h;
                }
                i -= i2;
                if (i != 1) {
                    if (i != 0 || z) {
                        if (f6411f || i == -1) {
                            m5271a(c1926d3);
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
                m5274b(c1926d2);
                if (z) {
                    break;
                }
            } else if (i4 == 0) {
                c1926d2.f6410h = i2 + 1;
                if (z) {
                    return;
                }
            } else if (f6411f || i4 == -1 || i4 == 1) {
                c1926d2.f6410h = Math.max(i2, i3) + 1;
                if (!z) {
                    break;
                }
            } else {
                throw new AssertionError();
            }
            c1926d2 = c1926d2.f6403a;
        }
    }

    final C1926d<K, V> m5276a(Object obj) {
        C1926d b = m5273b(obj);
        if (b != null) {
            m5278a(b, true);
        }
        return b;
    }

    final C1926d<K, V> m5277a(Entry<?, ?> entry) {
        C1926d<K, V> b = m5273b(entry.getKey());
        Object obj = 1;
        if (b != null) {
            Object obj2 = b.f6409g;
            Object value = entry.getValue();
            if (obj2 != value) {
                if (obj2 == null || !obj2.equals(value)) {
                    value = null;
                    if (value != null) {
                        return obj != null ? b : null;
                    }
                }
            }
            value = 1;
            if (value != null) {
                if (obj != null) {
                }
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    final void m5278a(C1926d<K, V> c1926d, boolean z) {
        if (z) {
            c1926d.f6407e.f6406d = c1926d.f6406d;
            c1926d.f6406d.f6407e = c1926d.f6407e;
        }
        C1926d c1926d2 = c1926d.f6404b;
        C1926d c1926d3 = c1926d.f6405c;
        C1926d c1926d4 = c1926d.f6403a;
        int i = 0;
        if (c1926d2 == null || c1926d3 == null) {
            if (c1926d2 != null) {
                m5272a((C1926d) c1926d, c1926d2);
                c1926d.f6404b = null;
            } else if (c1926d3 != null) {
                m5272a((C1926d) c1926d, c1926d3);
                c1926d.f6405c = null;
            } else {
                m5272a((C1926d) c1926d, null);
            }
            m5275b(c1926d4, false);
            this.f6415c--;
            this.f6416d++;
            return;
        }
        int i2;
        if (c1926d2.f6410h > c1926d3.f6410h) {
            while (true) {
                c1926d3 = c1926d2;
                c1926d2 = c1926d2.f6405c;
                if (c1926d2 == null) {
                    break;
                }
            }
        } else {
            while (true) {
                c1926d2 = c1926d3.f6404b;
                if (c1926d2 == null) {
                    break;
                }
                c1926d3 = c1926d2;
            }
        }
        m5278a(c1926d3, false);
        c1926d2 = c1926d.f6404b;
        if (c1926d2 != null) {
            i2 = c1926d2.f6410h;
            c1926d3.f6404b = c1926d2;
            c1926d2.f6403a = c1926d3;
            c1926d.f6404b = null;
        } else {
            i2 = 0;
        }
        c1926d2 = c1926d.f6405c;
        if (c1926d2 != null) {
            i = c1926d2.f6410h;
            c1926d3.f6405c = c1926d2;
            c1926d2.f6403a = c1926d3;
            c1926d.f6405c = null;
        }
        c1926d3.f6410h = Math.max(i2, i) + 1;
        m5272a((C1926d) c1926d, c1926d3);
    }

    public final void clear() {
        this.f6414b = null;
        this.f6415c = 0;
        this.f6416d++;
        C1926d c1926d = this.f6417e;
        c1926d.f6407e = c1926d;
        c1926d.f6406d = c1926d;
    }

    public final boolean containsKey(Object obj) {
        return m5273b(obj) != null;
    }

    public final Set<Entry<K, V>> entrySet() {
        Set set = this.f6418h;
        if (set != null) {
            return set;
        }
        set = new C1923a(this);
        this.f6418h = set;
        return set;
    }

    public final V get(Object obj) {
        C1926d b = m5273b(obj);
        return b != null ? b.f6409g : null;
    }

    public final Set<K> keySet() {
        Set set = this.f6419i;
        if (set != null) {
            return set;
        }
        set = new C1924b(this);
        this.f6419i = set;
        return set;
    }

    public final V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        C1926d a = m5270a((Object) k, true);
        V v2 = a.f6409g;
        a.f6409g = v;
        return v2;
    }

    public final V remove(Object obj) {
        C1926d a = m5276a(obj);
        return a != null ? a.f6409g : null;
    }

    public final int size() {
        return this.f6415c;
    }
}
