package p050b.p051a.p053b;

import java.util.ArrayList;
import java.util.HashSet;
import p050b.C0848e;
import p050b.C0851i;
import p050b.p051a.C0815e;
import p050b.p051a.C0827p;

public abstract class C0811d {

    public static abstract class C4944a extends C0811d {
        public int mo849a() {
            return 7;
        }

        public int mo850a(C0827p c0827p) {
            return c0827p.m1873a(mo856g());
        }

        public boolean mo851a(C0811d c0811d) {
            return mo856g().equals(c0811d.mo856g());
        }

        public abstract void mo2664b(C0811d c0811d);
    }

    protected static class C4945d extends C0811d {
        private String f13774a;
        private int f13775b;

        public C4945d(String str, int i) {
            this.f13774a = str;
            this.f13775b = i;
        }

        public final int mo849a() {
            return this.f13775b;
        }

        public final int mo850a(C0827p c0827p) {
            return 0;
        }

        public final void mo852a(String str, C0848e c0848e) {
            StringBuilder stringBuilder = new StringBuilder("conflict: ");
            stringBuilder.append(this.f13774a);
            stringBuilder.append(" and ");
            stringBuilder.append(str);
            throw new C0815e(stringBuilder.toString());
        }

        public final boolean mo851a(C0811d c0811d) {
            return this == c0811d;
        }

        public final C0811d mo853b() {
            return this == C0812e.f2435g ? this : super.mo853b();
        }

        public final C4945d mo854c() {
            return this;
        }

        public final boolean mo855d() {
            if (this.f13775b != 4) {
                if (this.f13775b != 3) {
                    return false;
                }
            }
            return true;
        }

        public final String mo856g() {
            return this.f13774a;
        }

        public final String toString() {
            return this.f13774a;
        }
    }

    public static class C4946e extends C0811d {
        private String f13776a;

        public C4946e(String str) {
            this.f13776a = str;
        }

        public int mo849a() {
            return 7;
        }

        public int mo850a(C0827p c0827p) {
            return c0827p.m1873a(this.f13776a);
        }

        public final void mo852a(String str, C0848e c0848e) {
        }

        public boolean mo851a(C0811d c0811d) {
            return this.f13776a.equals(c0811d.mo856g());
        }

        public final C4945d mo854c() {
            return null;
        }

        public final boolean mo855d() {
            return false;
        }

        public final String mo856g() {
            return this.f13776a;
        }
    }

    public static class C6409b extends C4944a {
        C4944a f17557a;

        private C6409b(C4944a c4944a) {
            this.f17557a = c4944a;
        }

        static String m15189a(String str) {
            if (str.length() > 1 && str.charAt(0) == '[') {
                char charAt = str.charAt(1);
                if (charAt == 'L') {
                    return str.substring(2, str.length() - 1).replace('/', '.');
                }
                if (charAt == '[') {
                    return str.substring(1);
                }
            }
            return "java.lang.Object";
        }

        public static C0811d m15190c(C0811d c0811d) {
            if (c0811d instanceof C6410c) {
                return ((C6410c) c0811d).f17558a;
            }
            if (c0811d instanceof C4944a) {
                return new C6409b((C4944a) c0811d);
            }
            if ((c0811d instanceof C4946e) && !c0811d.mo2666e()) {
                return new C4946e(C6409b.m15189a(c0811d.mo856g()));
            }
            StringBuilder stringBuilder = new StringBuilder("bad AASTORE: ");
            stringBuilder.append(c0811d);
            throw new C0815e(stringBuilder.toString());
        }

        public final int mo2663a(ArrayList arrayList, int i, C0848e c0848e) {
            return this.f17557a.mo2663a(arrayList, i, c0848e);
        }

        public final void mo852a(String str, C0848e c0848e) {
            this.f17557a.mo852a(C6410c.m15198a(str), c0848e);
        }

        public final void mo2664b(C0811d c0811d) {
            try {
                if (!c0811d.mo2666e()) {
                    this.f17557a.mo2664b(C6410c.m15199c(c0811d));
                }
            } catch (C0815e e) {
                StringBuilder stringBuilder = new StringBuilder("fatal: ");
                stringBuilder.append(e);
                throw new RuntimeException(stringBuilder.toString());
            }
        }

        public final C4945d mo854c() {
            return null;
        }

        public final boolean mo855d() {
            return false;
        }

        public final String mo856g() {
            return C6409b.m15189a(this.f17557a.mo856g());
        }

        protected final C6412g mo2665h() {
            return this.f17557a.mo2665h();
        }
    }

    public static class C6410c extends C4944a {
        C4944a f17558a;

        private C6410c(C4944a c4944a) {
            this.f17558a = c4944a;
        }

        public static String m15198a(String str) {
            StringBuilder stringBuilder;
            if (str.charAt(0) == '[') {
                stringBuilder = new StringBuilder("[");
            } else {
                stringBuilder = new StringBuilder("[L");
                stringBuilder.append(str.replace('.', '/'));
                str = ";";
            }
            stringBuilder.append(str);
            return stringBuilder.toString();
        }

        static C0811d m15199c(C0811d c0811d) {
            if (c0811d instanceof C6409b) {
                return ((C6409b) c0811d).f17557a;
            }
            if (c0811d instanceof C4944a) {
                return new C6410c((C4944a) c0811d);
            }
            if ((c0811d instanceof C4946e) && !c0811d.mo2666e()) {
                return new C4946e(C6410c.m15198a(c0811d.mo856g()));
            }
            StringBuilder stringBuilder = new StringBuilder("bad AASTORE: ");
            stringBuilder.append(c0811d);
            throw new C0815e(stringBuilder.toString());
        }

        public final int mo2663a(ArrayList arrayList, int i, C0848e c0848e) {
            return this.f17558a.mo2663a(arrayList, i, c0848e);
        }

        public final void mo852a(String str, C0848e c0848e) {
            this.f17558a.mo852a(C6409b.m15189a(str), c0848e);
        }

        public final void mo2664b(C0811d c0811d) {
            try {
                if (!c0811d.mo2666e()) {
                    this.f17558a.mo2664b(C6409b.m15190c(c0811d));
                }
            } catch (C0815e e) {
                StringBuilder stringBuilder = new StringBuilder("fatal: ");
                stringBuilder.append(e);
                throw new RuntimeException(stringBuilder.toString());
            }
        }

        public final C4945d mo854c() {
            return null;
        }

        public final boolean mo855d() {
            return false;
        }

        public final String mo856g() {
            return C6410c.m15198a(this.f17558a.mo856g());
        }

        protected final C6412g mo2665h() {
            return this.f17558a.mo2665h();
        }
    }

    public static class C6411f extends C4946e {
        public C6411f() {
            super("null-type");
        }

        public final int mo849a() {
            return 5;
        }

        public final int mo850a(C0827p c0827p) {
            return 0;
        }

        public final boolean mo2666e() {
            return true;
        }
    }

    public static class C6412g extends C4944a {
        protected ArrayList f17559a = new ArrayList(2);
        protected ArrayList f17560b = new ArrayList(2);
        protected ArrayList f17561c = null;
        protected String f17562d;
        private boolean f17563e;
        private int f17564f = 0;
        private int f17565g = 0;
        private boolean f17566h = false;

        public C6412g(C0811d c0811d) {
            mo2664b(c0811d);
            this.f17562d = null;
            this.f17563e = c0811d.mo855d();
        }

        private C0851i m15210a(ArrayList arrayList, C0848e c0848e, HashSet hashSet, C0851i c0851i) {
            if (arrayList == null) {
                return c0851i;
            }
            int size = arrayList.size();
            C0851i c0851i2 = c0851i;
            for (int i = 0; i < size; i++) {
                C6412g c6412g = (C6412g) arrayList.get(i);
                if (!hashSet.add(c6412g)) {
                    return c0851i2;
                }
                if (c6412g.f17561c != null) {
                    int size2 = c6412g.f17561c.size();
                    C0851i c0851i3 = c0851i2;
                    for (int i2 = 0; i2 < size2; i2++) {
                        C0851i a = c0848e.m1965a((String) c6412g.f17561c.get(i2));
                        if (a.mo912a(c0851i3)) {
                            c0851i3 = a;
                        }
                    }
                    c0851i2 = c0851i3;
                }
                c0851i2 = m15210a(c6412g.f17560b, c0848e, hashSet, c0851i2);
            }
            return c0851i2;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String m15211a(java.util.ArrayList r4, java.util.HashSet r5, p050b.C0848e r6) {
            /*
            r3 = this;
            r0 = r5.iterator();
            r1 = r5.size();
            if (r1 != 0) goto L_0x000c;
        L_0x000a:
            r4 = 0;
            return r4;
        L_0x000c:
            r5 = r5.size();
            r1 = 1;
            if (r5 != r1) goto L_0x001a;
        L_0x0013:
            r4 = r0.next();
            r4 = (java.lang.String) r4;
            return r4;
        L_0x001a:
            r5 = r0.next();
            r5 = (java.lang.String) r5;
            r5 = r6.m1965a(r5);
        L_0x0024:
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x0039;
        L_0x002a:
            r2 = r0.next();
            r2 = (java.lang.String) r2;
            r2 = r6.m1965a(r2);
            r5 = p050b.p051a.p053b.C0811d.m1790a(r5, r2);
            goto L_0x0024;
        L_0x0039:
            r0 = r5.mo917f();
            if (r0 == 0) goto L_0x0053;
        L_0x003f:
            r0 = r5.mo913b();
            if (r0 == 0) goto L_0x0050;
        L_0x0045:
            r0 = r5.mo916e();
            r0 = r0.mo917f();
            if (r0 != 0) goto L_0x0050;
        L_0x004f:
            goto L_0x0051;
        L_0x0050:
            r1 = 0;
        L_0x0051:
            if (r1 == 0) goto L_0x005c;
        L_0x0053:
            r0 = new java.util.HashSet;
            r0.<init>();
            r5 = r3.m15210a(r4, r6, r0, r5);
        L_0x005c:
            r4 = r5.mo913b();
            if (r4 == 0) goto L_0x0067;
        L_0x0062:
            r4 = p050b.p051a.C0828s.m1895a(r5);
            return r4;
        L_0x0067:
            r4 = r5.m1999m();
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.b.d.g.a(java.util.ArrayList, java.util.HashSet, b.e):java.lang.String");
        }

        private void m15212a(ArrayList arrayList, C0848e c0848e) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            C0811d c0811d = null;
            for (int i3 = i2; i3 < size; i3++) {
                ArrayList arrayList2 = ((C6412g) arrayList.get(i3)).f17559a;
                int size2 = arrayList2.size();
                int i4 = i2;
                for (i2 = 0; i2 < size2; i2++) {
                    C0811d c0811d2 = (C0811d) arrayList2.get(i2);
                    C0811d c = c0811d2.mo854c();
                    if (c0811d != null) {
                        if ((c == null && i4 != 0) || !(c == null || c0811d == c)) {
                            c0811d = C0812e.f2435g;
                            i2 = 1;
                            break;
                        }
                    } else if (c != null) {
                        i4 = 1;
                        c0811d = c;
                    } else if (c0811d2.mo2667f()) {
                        i2 = 0;
                        c0811d = c0811d2;
                        break;
                    } else {
                        i4 = 0;
                        c0811d = c0811d2;
                    }
                    if (c == null && !c0811d2.mo2666e()) {
                        hashSet.add(c0811d2.mo856g());
                    }
                }
                i2 = i4;
            }
            if (i2 != 0) {
                while (i < size) {
                    C6412g c6412g = (C6412g) arrayList.get(i);
                    c6412g.f17559a.clear();
                    c6412g.f17559a.add(c0811d);
                    this.f17563e = c0811d.mo855d();
                    i++;
                }
                return;
            }
            String a = m15211a(arrayList, hashSet, c0848e);
            while (i < size) {
                ((C6412g) arrayList.get(i)).f17562d = a;
                i++;
            }
        }

        public final int mo849a() {
            return this.f17562d == null ? ((C0811d) this.f17559a.get(0)).mo849a() : super.mo849a();
        }

        public final int mo850a(C0827p c0827p) {
            return this.f17562d == null ? ((C0811d) this.f17559a.get(0)).mo850a(c0827p) : super.mo850a(c0827p);
        }

        public final int mo2663a(ArrayList arrayList, int i, C0848e c0848e) {
            if (this.f17564f > 0) {
                return i;
            }
            i++;
            this.f17565g = i;
            this.f17564f = i;
            arrayList.add(this);
            this.f17566h = true;
            int size = this.f17559a.size();
            int i2 = i;
            for (i = 0; i < size; i++) {
                C6412g h = ((C0811d) this.f17559a.get(i)).mo2665h();
                if (h != null) {
                    int i3;
                    if (h.f17564f == 0) {
                        i2 = h.mo2663a(arrayList, i2, c0848e);
                        if (h.f17565g < this.f17565g) {
                            i3 = h.f17565g;
                        }
                    } else if (h.f17566h && h.f17564f < this.f17565g) {
                        i3 = h.f17564f;
                    }
                    this.f17565g = i3;
                }
            }
            if (this.f17564f == this.f17565g) {
                ArrayList arrayList2 = new ArrayList();
                C6412g c6412g;
                do {
                    c6412g = (C6412g) arrayList.remove(arrayList.size() - 1);
                    c6412g.f17566h = false;
                    arrayList2.add(c6412g);
                } while (c6412g != this);
                m15212a(arrayList2, c0848e);
            }
            return i2;
        }

        public final void mo852a(String str, C0848e c0848e) {
            if (this.f17561c == null) {
                this.f17561c = new ArrayList();
            }
            this.f17561c.add(str);
        }

        public final void mo2664b(C0811d c0811d) {
            this.f17559a.add(c0811d);
            if (c0811d instanceof C6412g) {
                ((C6412g) c0811d).f17560b.add(this);
            }
        }

        public final C4945d mo854c() {
            return this.f17562d == null ? ((C0811d) this.f17559a.get(0)).mo854c() : null;
        }

        public final boolean mo855d() {
            return this.f17562d == null ? this.f17563e : false;
        }

        public final boolean mo2666e() {
            return this.f17562d == null ? ((C0811d) this.f17559a.get(0)).mo2666e() : false;
        }

        public final boolean mo2667f() {
            return this.f17562d == null ? ((C0811d) this.f17559a.get(0)).mo2667f() : false;
        }

        public final String mo856g() {
            return this.f17562d == null ? ((C0811d) this.f17559a.get(0)).mo856g() : this.f17562d;
        }

        protected final C6412g mo2665h() {
            return this;
        }
    }

    public static class C6413h extends C4946e {
        int f17567a;
        boolean f17568b = false;

        C6413h(int i, String str) {
            super(str);
            this.f17567a = i;
        }

        public int mo849a() {
            return 8;
        }

        public int mo850a(C0827p c0827p) {
            return this.f17567a;
        }

        public final boolean mo851a(C0811d c0811d) {
            if (c0811d instanceof C6413h) {
                C6413h c6413h = (C6413h) c0811d;
                if (this.f17567a == c6413h.f17567a && mo856g().equals(c6413h.mo856g())) {
                    return true;
                }
            }
            return false;
        }

        public final C0811d mo853b() {
            return this.f17568b ? new C6412g(new C4946e(mo856g())) : new C6414j(mo3312i());
        }

        public final void mo2668b(int i) {
            if (i == this.f17567a) {
                this.f17568b = true;
            }
        }

        public final boolean mo2667f() {
            return true;
        }

        public C6413h mo3312i() {
            return new C6413h(this.f17567a, mo856g());
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("uninit:");
            stringBuilder.append(mo856g());
            stringBuilder.append("@");
            stringBuilder.append(this.f17567a);
            return stringBuilder.toString();
        }
    }

    public static class C6414j extends C4944a {
        protected C0811d f17569a;

        public C6414j(C6413h c6413h) {
            this.f17569a = c6413h;
        }

        public final int mo849a() {
            return this.f17569a.mo849a();
        }

        public final int mo850a(C0827p c0827p) {
            return this.f17569a.mo850a(c0827p);
        }

        public final void mo852a(String str, C0848e c0848e) {
            this.f17569a.mo852a(str, c0848e);
        }

        public final boolean mo851a(C0811d c0811d) {
            return this.f17569a.mo851a(c0811d);
        }

        public final C0811d mo853b() {
            return this.f17569a.mo853b();
        }

        public final void mo2668b(int i) {
            this.f17569a.mo2668b(i);
        }

        public final void mo2664b(C0811d c0811d) {
            if (!c0811d.mo851a(this.f17569a)) {
                this.f17569a = C0812e.f2435g;
            }
        }

        public final C4945d mo854c() {
            return this.f17569a.mo854c();
        }

        public final boolean mo855d() {
            return this.f17569a.mo855d();
        }

        public final boolean mo2667f() {
            return this.f17569a.mo2667f();
        }

        public final String mo856g() {
            return this.f17569a.mo856g();
        }

        protected final C6412g mo2665h() {
            return null;
        }

        public final int m15243i() {
            if (this.f17569a instanceof C6413h) {
                return ((C6413h) this.f17569a).f17567a;
            }
            throw new RuntimeException("not available");
        }
    }

    public static class C7028i extends C6413h {
        C7028i(String str) {
            super(-1, str);
        }

        public final int mo849a() {
            return 6;
        }

        public final int mo850a(C0827p c0827p) {
            return 0;
        }

        public final C6413h mo3312i() {
            return new C7028i(mo856g());
        }

        public final String toString() {
            return "uninit:this";
        }
    }

    protected C0811d() {
    }

    public static C0851i m1790a(C0851i c0851i, C0851i c0851i2) {
        if (c0851i == c0851i2) {
            return c0851i;
        }
        if (c0851i.mo913b() && c0851i2.mo913b()) {
            C0851i e = c0851i.mo916e();
            C0851i e2 = c0851i2.mo916e();
            C0851i a = C0811d.m1790a(e, e2);
            if (a == e) {
                return c0851i;
            }
            if (a == e2) {
                return c0851i2;
            }
            String str;
            C0848e a2 = c0851i.mo911a();
            if (a == null) {
                str = "java.lang.Object";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a.m1999m());
                stringBuilder.append("[]");
                str = stringBuilder.toString();
            }
            return a2.m1965a(str);
        }
        if (!c0851i.mo943l()) {
            if (!c0851i2.mo943l()) {
                if (!c0851i.mo913b()) {
                    if (!c0851i2.mo913b()) {
                        return C0811d.m1792b(c0851i, c0851i2);
                    }
                }
                return c0851i.mo911a().m1965a("java.lang.Object");
            }
        }
        return null;
    }

    public static C0811d[] m1791a(int i) {
        C0811d[] c0811dArr = new C0811d[i];
        for (int i2 = 0; i2 < i; i2++) {
            c0811dArr[i2] = C0812e.f2435g;
        }
        return c0811dArr;
    }

    private static C0851i m1792b(C0851i c0851i, C0851i c0851i2) {
        C0851i c0851i3 = c0851i;
        C0851i c0851i4 = c0851i2;
        while (true) {
            if (C0811d.m1793c(c0851i3, c0851i4) && c0851i3.mo917f() != null) {
                return c0851i3;
            }
            C0851i f = c0851i3.mo917f();
            C0851i f2 = c0851i4.mo917f();
            if (f2 == null) {
                break;
            } else if (f == null) {
                break;
            } else {
                c0851i3 = f;
                c0851i4 = f2;
            }
            while (true) {
                c0851i3 = c0851i3.mo917f();
                if (c0851i3 != null) {
                    break;
                }
                c0851i = c0851i.mo917f();
            }
            while (!C0811d.m1793c(c0851i, c0851i2)) {
                c0851i = c0851i.mo917f();
                c0851i2 = c0851i2.mo917f();
            }
            return c0851i;
        }
        c0851i3 = c0851i4;
        C0851i c0851i5 = c0851i2;
        c0851i2 = c0851i;
        c0851i = c0851i5;
        while (true) {
            c0851i3 = c0851i3.mo917f();
            if (c0851i3 != null) {
                break;
            }
            c0851i = c0851i.mo917f();
        }
        while (!C0811d.m1793c(c0851i, c0851i2)) {
            c0851i = c0851i.mo917f();
            c0851i2 = c0851i2.mo917f();
        }
        return c0851i;
    }

    private static boolean m1793c(C0851i c0851i, C0851i c0851i2) {
        if (c0851i != c0851i2) {
            if (c0851i == null || c0851i2 == null || !c0851i.m1999m().equals(c0851i2.m1999m())) {
                return false;
            }
        }
        return true;
    }

    public abstract int mo849a();

    public abstract int mo850a(C0827p c0827p);

    public int mo2663a(ArrayList arrayList, int i, C0848e c0848e) {
        return i;
    }

    public abstract void mo852a(String str, C0848e c0848e);

    public abstract boolean mo851a(C0811d c0811d);

    public C0811d mo853b() {
        return new C6412g(this);
    }

    public void mo2668b(int i) {
    }

    public abstract C4945d mo854c();

    public abstract boolean mo855d();

    public boolean mo2666e() {
        return false;
    }

    public boolean mo2667f() {
        return false;
    }

    public abstract String mo856g();

    protected C6412g mo2665h() {
        return null;
    }
}
