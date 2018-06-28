package com.google.p164b.p166b.p167a;

import com.google.p164b.C1939e;
import com.google.p164b.C1940f;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.C5595r;
import com.google.p164b.p165a.C1903b;
import com.google.p164b.p165a.C1904c;
import com.google.p164b.p166b.C1918b;
import com.google.p164b.p166b.C1919c;
import com.google.p164b.p166b.C1928h;
import com.google.p164b.p166b.C1929i;
import com.google.p164b.p166b.C5575d;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class C5546i implements C1949u {
    private final C1919c f15360a;
    private final C1939e f15361b;
    private final C5575d f15362c;
    private final C5537d f15363d;

    static abstract class C1911b {
        final String f6330h;
        final boolean f6331i;
        final boolean f6332j;

        protected C1911b(String str, boolean z, boolean z2) {
            this.f6330h = str;
            this.f6331i = z;
            this.f6332j = z2;
        }

        abstract void mo1745a(C1935a c1935a, Object obj);

        abstract void mo1746a(C1937c c1937c, Object obj);

        abstract boolean mo1747a(Object obj);
    }

    public static final class C5545a<T> extends C1948t<T> {
        private final C1928h<T> f15358a;
        private final Map<String, C1911b> f15359b;

        C5545a(C1928h<T> c1928h, Map<String, C1911b> map) {
            this.f15358a = c1928h;
            this.f15359b = map;
        }

        public final T mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            Object a = this.f15358a.mo1748a();
            try {
                c1935a.mo1716c();
                while (c1935a.mo1719e()) {
                    C1911b c1911b = (C1911b) this.f15359b.get(c1935a.mo1722h());
                    if (c1911b != null) {
                        if (c1911b.f6332j) {
                            c1911b.mo1745a(c1935a, a);
                        }
                    }
                    c1935a.mo1729o();
                }
                c1935a.mo1718d();
                return a;
            } catch (Throwable e) {
                throw new C5595r(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final void mo1712a(C1937c c1937c, T t) {
            if (t == null) {
                c1937c.mo1743e();
                return;
            }
            c1937c.mo1740c();
            try {
                for (C1911b c1911b : this.f15359b.values()) {
                    if (c1911b.mo1747a(t)) {
                        c1937c.mo1736a(c1911b.f6330h);
                        c1911b.mo1746a(c1937c, (Object) t);
                    }
                }
                c1937c.mo1742d();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C5546i(C1919c c1919c, C1939e c1939e, C5575d c5575d, C5537d c5537d) {
        this.f15360a = c1919c;
        this.f15361b = c1939e;
        this.f15362c = c5575d;
        this.f15363d = c5537d;
    }

    private List<String> m12156a(Field field) {
        C1904c c1904c = (C1904c) field.getAnnotation(C1904c.class);
        if (c1904c == null) {
            return Collections.singletonList(this.f15361b.mo3063a(field));
        }
        String a = c1904c.m5236a();
        String[] b = c1904c.m5237b();
        if (b.length == 0) {
            return Collections.singletonList(a);
        }
        List<String> arrayList = new ArrayList(b.length + 1);
        arrayList.add(a);
        for (Object add : b) {
            arrayList.add(add);
        }
        return arrayList;
    }

    private Map<String, C1911b> m12157a(C1940f c1940f, C1933a<?> c1933a, Class<?> cls) {
        C5546i c5546i = this;
        C1940f c1940f2 = c1940f;
        Map<String, C1911b> linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        C1933a<?> c1933a2 = c1933a;
        Type type = c1933a2.f6423b;
        Class cls2 = cls;
        C1933a c1933a3 = c1933a2;
        while (cls2 != Object.class) {
            Type type2;
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z = false;
            int length = declaredFields.length;
            int i = 0;
            while (i < length) {
                int i2;
                int i3;
                boolean z2;
                Field[] fieldArr;
                C1933a c1933a4;
                Class cls3;
                Type type3;
                Field field = declaredFields[i];
                boolean a = c5546i.m12158a(field, true);
                boolean a2 = c5546i.m12158a(field, z);
                if (!a) {
                    if (!a2) {
                        i2 = i;
                        i3 = length;
                        z2 = z;
                        fieldArr = declaredFields;
                        c1933a4 = c1933a3;
                        type2 = type;
                        cls3 = cls2;
                        i = i2 + 1;
                        type = type2;
                        c1933a3 = c1933a4;
                        cls2 = cls3;
                        declaredFields = fieldArr;
                        z = z2;
                        length = i3;
                        c5546i = this;
                        c1940f2 = c1940f;
                    }
                }
                field.setAccessible(true);
                Type a3 = C1918b.m5256a(c1933a3.f6423b, cls2, field.getGenericType());
                List a4 = c5546i.m12156a(field);
                int size = a4.size();
                boolean z3 = a;
                int i4 = z;
                cls3 = cls2;
                C1911b c1911b = null;
                while (i4 < size) {
                    type3 = type;
                    String str = (String) a4.get(i4);
                    if (i4 != 0) {
                        z3 = z;
                    }
                    fieldArr = declaredFields;
                    final C1933a a5 = C1933a.m5291a(a3);
                    boolean a6 = C1929i.m5282a(a5.f6422a);
                    C1903b c1903b = (C1903b) field.getAnnotation(C1903b.class);
                    C1948t a7 = c1903b != null ? C5537d.m12110a(c5546i.f15360a, c1940f2, a5, c1903b) : null;
                    z = a7 != null;
                    if (a7 == null) {
                        a7 = c1940f2.m5347a(a5);
                    }
                    int i5 = i4;
                    int i6 = size;
                    List list = a4;
                    Type type4 = a3;
                    C55441 c55441 = r0;
                    Field field2 = field;
                    i2 = i;
                    final boolean z4 = z;
                    i3 = length;
                    final C1948t c1948t = a7;
                    final C1940f c1940f3 = c1940f2;
                    c1933a4 = c1933a3;
                    final boolean z5 = a6;
                    C55441 c554412 = new C1911b(c5546i, str, z3, a2) {
                        final /* synthetic */ C5546i f15357g;

                        final void mo1745a(C1935a c1935a, Object obj) {
                            Object a = c1948t.mo1711a(c1935a);
                            if (a != null || !z5) {
                                field.set(obj, a);
                            }
                        }

                        final void mo1746a(C1937c c1937c, Object obj) {
                            (z4 ? c1948t : new C5552m(c1940f3, c1948t, a5.f6423b)).mo1712a(c1937c, field.get(obj));
                        }

                        public final boolean mo1747a(Object obj) {
                            return this.i && field.get(obj) != obj;
                        }
                    };
                    C1911b c1911b2 = (C1911b) linkedHashMap.put(str, c55441);
                    if (c1911b == null) {
                        c1911b = c1911b2;
                    }
                    i4 = i5 + 1;
                    c1933a3 = c1933a4;
                    type = type3;
                    declaredFields = fieldArr;
                    int i7 = 1;
                    z = false;
                    size = i6;
                    a4 = list;
                    a3 = type4;
                    field = field2;
                    i = i2;
                    length = i3;
                    c5546i = this;
                    c1940f2 = c1940f;
                }
                i2 = i;
                i3 = length;
                z2 = z;
                fieldArr = declaredFields;
                c1933a4 = c1933a3;
                type3 = type;
                if (c1911b != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(type3);
                    stringBuilder.append(" declares multiple JSON fields named ");
                    stringBuilder.append(c1911b.f6330h);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                type2 = type3;
                i = i2 + 1;
                type = type2;
                c1933a3 = c1933a4;
                cls2 = cls3;
                declaredFields = fieldArr;
                z = z2;
                length = i3;
                c5546i = this;
                c1940f2 = c1940f;
            }
            type2 = type;
            Class cls4 = cls2;
            c1933a3 = C1933a.m5291a(C1918b.m5256a(c1933a3.f6423b, cls4, cls4.getGenericSuperclass()));
            cls2 = c1933a3.f6422a;
            c5546i = this;
            c1940f2 = c1940f;
        }
        return linkedHashMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m12158a(java.lang.reflect.Field r9, boolean r10) {
        /*
        r8 = this;
        r0 = r8.f15362c;
        r1 = r9.getType();
        r1 = r0.m12277a(r1, r10);
        r2 = 0;
        if (r1 != 0) goto L_0x00a6;
    L_0x000d:
        r1 = r0.f15425c;
        r3 = r9.getModifiers();
        r1 = r1 & r3;
        r3 = 1;
        if (r1 == 0) goto L_0x001a;
    L_0x0017:
        r9 = r3;
        goto L_0x00a3;
    L_0x001a:
        r4 = r0.f15424b;
        r6 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 == 0) goto L_0x0039;
    L_0x0022:
        r1 = com.google.p164b.p165a.C1905d.class;
        r1 = r9.getAnnotation(r1);
        r1 = (com.google.p164b.p165a.C1905d) r1;
        r4 = com.google.p164b.p165a.C1906e.class;
        r4 = r9.getAnnotation(r4);
        r4 = (com.google.p164b.p165a.C1906e) r4;
        r1 = r0.m12276a(r1, r4);
        if (r1 != 0) goto L_0x0039;
    L_0x0038:
        goto L_0x0017;
    L_0x0039:
        r1 = r9.isSynthetic();
        if (r1 == 0) goto L_0x0040;
    L_0x003f:
        goto L_0x0017;
    L_0x0040:
        r1 = r0.f15427e;
        if (r1 == 0) goto L_0x005e;
    L_0x0044:
        r1 = com.google.p164b.p165a.C1902a.class;
        r1 = r9.getAnnotation(r1);
        r1 = (com.google.p164b.p165a.C1902a) r1;
        if (r1 == 0) goto L_0x0017;
    L_0x004e:
        if (r10 == 0) goto L_0x0057;
    L_0x0050:
        r1 = r1.m5232a();
        if (r1 != 0) goto L_0x005e;
    L_0x0056:
        goto L_0x005d;
    L_0x0057:
        r1 = r1.m5233b();
        if (r1 != 0) goto L_0x005e;
    L_0x005d:
        goto L_0x0017;
    L_0x005e:
        r1 = r0.f15426d;
        if (r1 != 0) goto L_0x006d;
    L_0x0062:
        r1 = r9.getType();
        r1 = com.google.p164b.p166b.C5575d.m12274b(r1);
        if (r1 == 0) goto L_0x006d;
    L_0x006c:
        goto L_0x0017;
    L_0x006d:
        r1 = r9.getType();
        r1 = com.google.p164b.p166b.C5575d.m12273a(r1);
        if (r1 == 0) goto L_0x0078;
    L_0x0077:
        goto L_0x0017;
    L_0x0078:
        if (r10 == 0) goto L_0x007d;
    L_0x007a:
        r10 = r0.f15428f;
        goto L_0x007f;
    L_0x007d:
        r10 = r0.f15429g;
    L_0x007f:
        r0 = r10.isEmpty();
        if (r0 != 0) goto L_0x00a2;
    L_0x0085:
        r0 = new com.google.b.c;
        r0.<init>(r9);
        r9 = r10.iterator();
    L_0x008e:
        r10 = r9.hasNext();
        if (r10 == 0) goto L_0x00a2;
    L_0x0094:
        r10 = r9.next();
        r10 = (com.google.p164b.C1932b) r10;
        r10 = r10.m5288a();
        if (r10 == 0) goto L_0x008e;
    L_0x00a0:
        goto L_0x0017;
    L_0x00a2:
        r9 = r2;
    L_0x00a3:
        if (r9 != 0) goto L_0x00a6;
    L_0x00a5:
        return r3;
    L_0x00a6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.b.a.i.a(java.lang.reflect.Field, boolean):boolean");
    }

    public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
        Class cls = c1933a.f6422a;
        return !Object.class.isAssignableFrom(cls) ? null : new C5545a(this.f15360a.m5267a((C1933a) c1933a), m12157a(c1940f, c1933a, cls));
    }
}
