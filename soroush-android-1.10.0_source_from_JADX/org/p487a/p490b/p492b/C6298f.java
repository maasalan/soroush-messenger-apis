package org.p487a.p490b.p492b;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import org.p487a.p488a.C4598d;

abstract class C6298f implements C4598d {
    private static boolean f17232a = true;
    static String[] f17233k = new String[0];
    static Class[] f17234l = new Class[0];
    private String f17235b;
    int f17236e = -1;
    String f17237f;
    String f17238g;
    Class f17239h;
    C4601a f17240i;
    ClassLoader f17241j = null;

    private interface C4601a {
        String mo2441a(int i);

        void mo2442a(int i, String str);
    }

    private static final class C6297b implements C4601a {
        private SoftReference f17231a;

        public C6297b() {
            m14727b();
        }

        private String[] m14726a() {
            return (String[]) this.f17231a.get();
        }

        private String[] m14727b() {
            Object obj = new String[3];
            this.f17231a = new SoftReference(obj);
            return obj;
        }

        public final String mo2441a(int i) {
            String[] a = m14726a();
            return a == null ? null : a[i];
        }

        public final void mo2442a(int i, String str) {
            String[] a = m14726a();
            if (a == null) {
                a = m14727b();
            }
            a[i] = str;
        }
    }

    C6298f(int i, String str, Class cls) {
        this.f17236e = i;
        this.f17237f = str;
        this.f17239h = cls;
    }

    private ClassLoader mo3469a() {
        if (this.f17241j == null) {
            this.f17241j = getClass().getClassLoader();
        }
        return this.f17241j;
    }

    final String m14731a(int i) {
        int indexOf = this.f17235b.indexOf(45);
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                break;
            }
            i2 = indexOf + 1;
            indexOf = this.f17235b.indexOf(45, i2);
            i = i3;
        }
        if (indexOf == -1) {
            indexOf = this.f17235b.length();
        }
        return this.f17235b.substring(i2, indexOf);
    }

    protected abstract String mo3581a(C4602h c4602h);

    final Class m14733b(int i) {
        return C4600b.m8319a(m14731a(i), mo3469a());
    }

    final java.lang.String m14734b(org.p487a.p490b.p492b.C4602h r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = f17232a;
        if (r0 == 0) goto L_0x001d;
    L_0x0004:
        r0 = r2.f17240i;
        if (r0 != 0) goto L_0x0014;
    L_0x0008:
        r0 = new org.a.b.b.f$b;	 Catch:{ Throwable -> 0x0010 }
        r0.<init>();	 Catch:{ Throwable -> 0x0010 }
        r2.f17240i = r0;	 Catch:{ Throwable -> 0x0010 }
        goto L_0x001d;
    L_0x0010:
        r0 = 0;
        f17232a = r0;
        goto L_0x001d;
    L_0x0014:
        r0 = r2.f17240i;
        r1 = r3.f12634i;
        r0 = r0.mo2441a(r1);
        goto L_0x001e;
    L_0x001d:
        r0 = 0;
    L_0x001e:
        if (r0 != 0) goto L_0x0024;
    L_0x0020:
        r0 = r2.mo3581a(r3);
    L_0x0024:
        r1 = f17232a;
        if (r1 == 0) goto L_0x002f;
    L_0x0028:
        r1 = r2.f17240i;
        r3 = r3.f12634i;
        r1.mo2442a(r3, r0);
    L_0x002f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.a.b.b.f.b(org.a.b.b.h):java.lang.String");
    }

    public final Class m14735c() {
        if (this.f17239h == null) {
            this.f17239h = m14733b(2);
        }
        return this.f17239h;
    }

    final Class[] m14736c(int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(m14731a(i), ":");
        i = stringTokenizer.countTokens();
        Class[] clsArr = new Class[i];
        for (int i2 = 0; i2 < i; i2++) {
            clsArr[i2] = C4600b.m8319a(stringTokenizer.nextToken(), mo3469a());
        }
        return clsArr;
    }

    public final String toString() {
        return m14734b(C4602h.f12624k);
    }
}
