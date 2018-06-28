package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.p138m.C1517a;
import java.lang.annotation.Annotation;
import java.util.HashMap;

public final class C5329k implements C1517a {
    protected HashMap<Class<?>, Annotation> f14811a;

    private C5329k(HashMap<Class<?>, Annotation> hashMap) {
        this.f14811a = hashMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p111d.p112a.p121c.p128f.C5329k m11288a(com.p111d.p112a.p121c.p128f.C5329k r3, com.p111d.p112a.p121c.p128f.C5329k r4) {
        /*
        if (r3 == 0) goto L_0x0065;
    L_0x0002:
        r0 = r3.f14811a;
        if (r0 == 0) goto L_0x0065;
    L_0x0006:
        r0 = r3.f14811a;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        return r4;
    L_0x000f:
        if (r4 == 0) goto L_0x0064;
    L_0x0011:
        r0 = r4.f14811a;
        if (r0 == 0) goto L_0x0064;
    L_0x0015:
        r0 = r4.f14811a;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x001e;
    L_0x001d:
        return r3;
    L_0x001e:
        r0 = new java.util.HashMap;
        r0.<init>();
        r4 = r4.f14811a;
        r4 = r4.values();
        r4 = r4.iterator();
    L_0x002d:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x0041;
    L_0x0033:
        r1 = r4.next();
        r1 = (java.lang.annotation.Annotation) r1;
        r2 = r1.annotationType();
        r0.put(r2, r1);
        goto L_0x002d;
    L_0x0041:
        r3 = r3.f14811a;
        r3 = r3.values();
        r3 = r3.iterator();
    L_0x004b:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x005f;
    L_0x0051:
        r4 = r3.next();
        r4 = (java.lang.annotation.Annotation) r4;
        r1 = r4.annotationType();
        r0.put(r1, r4);
        goto L_0x004b;
    L_0x005f:
        r3 = new com.d.a.c.f.k;
        r3.<init>(r0);
    L_0x0064:
        return r3;
    L_0x0065:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.f.k.a(com.d.a.c.f.k, com.d.a.c.f.k):com.d.a.c.f.k");
    }

    private boolean m11289c(Annotation annotation) {
        if (this.f14811a == null) {
            this.f14811a = new HashMap();
        }
        Annotation annotation2 = (Annotation) this.f14811a.put(annotation.annotationType(), annotation);
        if (annotation2 != null) {
            if (annotation2.equals(annotation)) {
                return false;
            }
        }
        return true;
    }

    public final int m11290a() {
        return this.f14811a == null ? 0 : this.f14811a.size();
    }

    public final <A extends Annotation> A m11291a(Class<A> cls) {
        return this.f14811a == null ? null : (Annotation) this.f14811a.get(cls);
    }

    public final boolean m11292a(Annotation annotation) {
        if (this.f14811a != null) {
            if (this.f14811a.containsKey(annotation.annotationType())) {
                return false;
            }
        }
        m11289c(annotation);
        return true;
    }

    public final boolean m11293a(Class<? extends Annotation>[] clsArr) {
        if (this.f14811a != null) {
            for (Object containsKey : clsArr) {
                if (this.f14811a.containsKey(containsKey)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean m11294b(Class<?> cls) {
        return this.f14811a == null ? false : this.f14811a.containsKey(cls);
    }

    public final boolean m11295b(Annotation annotation) {
        return m11289c(annotation);
    }

    public final String toString() {
        return this.f14811a == null ? "[null]" : this.f14811a.toString();
    }
}
