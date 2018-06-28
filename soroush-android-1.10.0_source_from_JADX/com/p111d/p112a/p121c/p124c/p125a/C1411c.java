package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class C1411c implements Serializable, Iterable<C6488s> {
    protected final boolean f4449a;
    public int f4450b;
    public C6488s[] f4451c;
    private int f4452d;
    private int f4453e;
    private Object[] f4454f;

    private C1411c(boolean z, Collection<C6488s> collection) {
        this.f4449a = z;
        this.f4451c = (C6488s[]) collection.toArray(new C6488s[collection.size()]);
        m3456a((Collection) collection);
    }

    public static C1411c m3454a(Collection<C6488s> collection, boolean z) {
        return new C1411c(z, collection);
    }

    private final C6488s m3455a(String str, int i, Object obj) {
        if (obj == null) {
            return null;
        }
        Object obj2;
        int i2 = this.f4452d + 1;
        i = ((i >> 1) + i2) << 1;
        Object obj3 = this.f4454f[i];
        if (str.equals(obj3)) {
            obj2 = this.f4454f[i + 1];
        } else {
            if (obj3 != null) {
                i = (i2 + (i2 >> 1)) << 1;
                i2 = this.f4453e + i;
                while (i < i2) {
                    String str2 = this.f4454f[i];
                    if (str2 != str) {
                        if (!str.equals(str2)) {
                            i += 2;
                        }
                    }
                    obj2 = this.f4454f[i + 1];
                }
            }
            return null;
        }
        return (C6488s) obj2;
    }

    private void m3456a(Collection<C6488s> collection) {
        int i;
        this.f4450b = collection.size();
        int i2 = this.f4450b;
        if (i2 <= 5) {
            i2 = 8;
        } else if (i2 <= 12) {
            i2 = 16;
        } else {
            i = 32;
            while (i < i2 + (i2 >> 2)) {
                i += i;
            }
            i2 = i;
        }
        this.f4452d = i2 - 1;
        i = (i2 >> 1) + i2;
        Object[] objArr = new Object[(i * 2)];
        int i3 = 0;
        for (C6488s c6488s : collection) {
            if (c6488s != null) {
                String d = m3458d(c6488s);
                int b = m3457b(d);
                int i4 = b << 1;
                if (objArr[i4] != null) {
                    i4 = ((b >> 1) + i2) << 1;
                    if (objArr[i4] != null) {
                        i4 = (i << 1) + i3;
                        i3 += 2;
                        if (i4 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i4] = d;
                objArr[i4 + 1] = c6488s;
            }
        }
        this.f4454f = objArr;
        this.f4453e = i3;
    }

    private final int m3457b(String str) {
        return str.hashCode() & this.f4452d;
    }

    private String m3458d(C6488s c6488s) {
        return this.f4449a ? c6488s.m15554f().toLowerCase() : c6488s.m15554f();
    }

    private final int m3459e(C6488s c6488s) {
        int length = this.f4451c.length;
        for (int i = 0; i < length; i++) {
            if (this.f4451c[i] == c6488s) {
                return i;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Illegal state: property '");
        stringBuilder.append(c6488s.m15554f());
        stringBuilder.append("' missing from _propsInOrder");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final C1411c m3460a() {
        int i = 0;
        int length = this.f4454f.length;
        for (int i2 = 1; i2 < length; i2 += 2) {
            C6488s c6488s = (C6488s) this.f4454f[i2];
            if (c6488s != null) {
                int i3 = i + 1;
                c6488s.m15539a(i);
                i = i3;
            }
        }
        return this;
    }

    public final C1411c m3461a(C6488s c6488s) {
        String d = m3458d(c6488s);
        int length = this.f4454f.length;
        int i = 1;
        while (i < length) {
            C6488s c6488s2 = (C6488s) this.f4454f[i];
            if (c6488s2 == null || !c6488s2.m15554f().equals(d)) {
                i += 2;
            } else {
                this.f4454f[i] = c6488s;
                this.f4451c[m3459e(c6488s2)] = c6488s;
                return this;
            }
        }
        length = m3457b(d);
        i = this.f4452d + 1;
        int i2 = length << 1;
        if (this.f4454f[i2] != null) {
            i2 = ((length >> 1) + i) << 1;
            if (this.f4454f[i2] != null) {
                i2 = ((i + (i >> 1)) << 1) + this.f4453e;
                this.f4453e += 2;
                if (i2 >= this.f4454f.length) {
                    this.f4454f = Arrays.copyOf(this.f4454f, this.f4454f.length + 4);
                }
            }
        }
        this.f4454f[i2] = d;
        this.f4454f[i2 + 1] = c6488s;
        int length2 = this.f4451c.length;
        this.f4451c = (C6488s[]) Arrays.copyOf(this.f4451c, length2 + 1);
        this.f4451c[length2] = c6488s;
        return this;
    }

    public final C1411c m3462a(C1534n c1534n) {
        if (c1534n == null || c1534n == C1534n.f4779a) {
            return this;
        }
        Collection arrayList = new ArrayList(r0);
        for (Object obj : this.f4451c) {
            Object obj2;
            if (!(obj2 == null || obj2 == null)) {
                obj2 = obj2.m15536a(c1534n.mo1482a(obj2.m15554f()));
                C1507k m = obj2.m15561m();
                if (m != null) {
                    C1507k a = m.mo2806a(c1534n);
                    if (a != m) {
                        obj2 = obj2.mo3333a(a);
                    }
                }
            }
            arrayList.add(obj2);
        }
        return new C1411c(this.f4449a, arrayList);
    }

    public final C6488s m3463a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Can not pass null property name");
        }
        if (this.f4449a) {
            str = str.toLowerCase();
        }
        int hashCode = str.hashCode() & this.f4452d;
        int i = hashCode << 1;
        String str2 = this.f4454f[i];
        if (str2 != str) {
            if (!str.equals(str2)) {
                return m3455a(str, hashCode, str2);
            }
        }
        return (C6488s) this.f4454f[i + 1];
    }

    public final void m3464b(C6488s c6488s) {
        String d = m3458d(c6488s);
        int b = m3457b(d);
        int i = b << 1;
        if (!d.equals(this.f4454f[i])) {
            i = this.f4452d + 1;
            b = ((b >> 1) + i) << 1;
            if (!d.equals(this.f4454f[b])) {
                b = (i + (i >> 1)) << 1;
                i = this.f4453e + b;
                while (b < i) {
                    if (!d.equals(this.f4454f[b])) {
                        b += 2;
                    }
                }
                i = -1;
            }
            i = b + 1;
            break;
        }
        i++;
        if (i >= 0) {
            C6488s c6488s2 = (C6488s) this.f4454f[i];
            this.f4454f[i] = c6488s;
            this.f4451c[m3459e(c6488s2)] = c6488s;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("No entry '");
        stringBuilder.append(d);
        stringBuilder.append("' found, can't replace");
        throw new NoSuchElementException(stringBuilder.toString());
    }

    public final void m3465c(C6488s c6488s) {
        Collection arrayList = new ArrayList(this.f4450b);
        String d = m3458d(c6488s);
        boolean z = false;
        int length = this.f4454f.length;
        for (int i = 1; i < length; i += 2) {
            C6488s c6488s2 = (C6488s) this.f4454f[i];
            if (c6488s2 != null) {
                if (!z) {
                    z = d.equals(c6488s2.m15554f());
                    if (z) {
                        this.f4451c[m3459e(c6488s2)] = null;
                    }
                }
                arrayList.add(c6488s2);
            }
        }
        if (z) {
            m3456a(arrayList);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("No entry '");
        stringBuilder.append(c6488s.m15554f());
        stringBuilder.append("' found, can't remove");
        throw new NoSuchElementException(stringBuilder.toString());
    }

    public final Iterator<C6488s> iterator() {
        List arrayList = new ArrayList(this.f4450b);
        int length = this.f4454f.length;
        for (int i = 1; i < length; i += 2) {
            C6488s c6488s = (C6488s) this.f4454f[i];
            if (c6488s != null) {
                arrayList.add(c6488s);
            }
        }
        return arrayList.iterator();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Properties=[");
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            C6488s c6488s = (C6488s) it.next();
            int i2 = i + 1;
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(c6488s.m15554f());
            stringBuilder.append('(');
            stringBuilder.append(c6488s.mo1350a());
            stringBuilder.append(')');
            i = i2;
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
