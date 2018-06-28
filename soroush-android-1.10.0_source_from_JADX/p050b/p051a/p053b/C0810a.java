package p050b.p051a.p053b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p050b.p051a.C0815e;
import p050b.p051a.C0829w;
import p050b.p051a.C4956l;
import p050b.p051a.C4961m;
import p050b.p051a.an;

public class C0810a {
    protected int f2429a;
    protected int f2430b = 0;
    protected int f2431c = 0;
    protected C0810a[] f2432d;
    protected boolean f2433e;
    protected C0807a f2434f;

    public static class C0807a {
        public C0807a f2420a;
        public C0810a f2421b;
        public int f2422c;

        C0807a(C0810a c0810a, int i, C0807a c0807a) {
            this.f2421b = c0810a;
            this.f2422c = i;
            this.f2420a = c0807a;
        }
    }

    public static class C0808c {
        private C0809d m1777a(HashMap hashMap, int i) {
            return m1778a(hashMap, i, true, true);
        }

        private C0809d m1778a(HashMap hashMap, int i, boolean z, boolean z2) {
            Integer num = new Integer(i);
            C0809d c0809d = (C0809d) hashMap.get(num);
            if (c0809d == null) {
                c0809d = new C0809d(i);
                hashMap.put(num, c0809d);
            }
            if (z) {
                if (c0809d.f2424b == null) {
                    c0809d.f2424b = mo857a(i);
                }
                if (z2) {
                    C0810a c0810a = c0809d.f2424b;
                    c0810a.f2431c++;
                }
            }
            return c0809d;
        }

        private C0809d m1779a(HashMap hashMap, int i, C0810a[] c0810aArr, int i2, boolean z) {
            C0809d a = m1778a(hashMap, i, false, false);
            a.f2425c = c0810aArr;
            a.f2427e = i2;
            a.f2426d = z;
            return a;
        }

        private static C0810a m1780a(C0809d c0809d) {
            C0810a c0810a = c0809d.f2424b;
            if (c0810a != null && c0809d.f2427e > 0) {
                c0810a.f2432d = c0809d.f2425c;
                c0810a.f2430b = c0809d.f2427e;
                c0810a.f2433e = c0809d.f2426d;
            }
            return c0810a;
        }

        private void m1781a(HashMap hashMap, int i, int i2, int i3) {
            m1779a(hashMap, i, m1783a(m1777a(hashMap, i2).f2424b), i3, true);
        }

        private static void m1782a(p050b.p051a.p053b.C0810a[] r9, p050b.p051a.C0829w r10) {
            /* JADX: method processing error */
/*
Error: java.lang.IndexOutOfBoundsException: bitIndex < 0: -1
	at java.util.BitSet.get(BitSet.java:623)
	at jadx.core.dex.visitors.CodeShrinker$ArgsInfo.usedArgAssign(CodeShrinker.java:138)
	at jadx.core.dex.visitors.CodeShrinker$ArgsInfo.access$300(CodeShrinker.java:43)
	at jadx.core.dex.visitors.CodeShrinker.canMoveBetweenBlocks(CodeShrinker.java:270)
	at jadx.core.dex.visitors.CodeShrinker.shrinkBlock(CodeShrinker.java:230)
	at jadx.core.dex.visitors.CodeShrinker.shrinkMethod(CodeShrinker.java:38)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:196)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:119)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:65)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            if (r10 != 0) goto L_0x0003;
        L_0x0002:
            return;
        L_0x0003:
            r0 = r10.f2485b;
            r0 = r0.size();
        L_0x0009:
            r0 = r0 + -1;
            if (r0 < 0) goto L_0x0051;
        L_0x000d:
            r1 = r10.m1911b(r0);
            r1 = p050b.p051a.p053b.C0810a.m1788a(r9, r1);
            r2 = r10.m1908a(r0);
            r3 = r10.f2485b;
            r3 = r3.get(r0);
            r3 = (p050b.p051a.C0830x) r3;
            r3 = r3.f2487b;
            r4 = r10.f2485b;
            r4 = r4.get(r0);
            r4 = (p050b.p051a.C0830x) r4;
            r4 = r4.f2489d;
            r5 = r1.f2431c;
            r5 = r5 + -1;
            r1.f2431c = r5;
            r5 = 0;
        L_0x0034:
            r6 = r9.length;
            if (r5 >= r6) goto L_0x0009;
        L_0x0037:
            r6 = r9[r5];
            r7 = r6.f2429a;
            if (r2 > r7) goto L_0x004e;
        L_0x003d:
            if (r7 >= r3) goto L_0x004e;
        L_0x003f:
            r7 = new b.a.b.a$a;
            r8 = r6.f2434f;
            r7.<init>(r1, r4, r8);
            r6.f2434f = r7;
            r6 = r1.f2431c;
            r6 = r6 + 1;
            r1.f2431c = r6;
        L_0x004e:
            r5 = r5 + 1;
            goto L_0x0034;
        L_0x0051:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.b.a.c.a(b.a.b.a[], b.a.w):void");
        }

        private C0810a[] m1783a(C0810a c0810a) {
            C0810a[] b = mo858b(1);
            b[0] = c0810a;
            return b;
        }

        private C0810a[] m1784a(HashMap hashMap) {
            int i;
            C0810a a;
            C0809d[] c0809dArr = (C0809d[]) hashMap.values().toArray(new C0809d[hashMap.size()]);
            Arrays.sort(c0809dArr);
            ArrayList arrayList = new ArrayList();
            if (c0809dArr.length <= 0 || c0809dArr[0].f2423a != 0 || c0809dArr[0].f2424b == null) {
                i = 0;
                a = mo857a(0);
            } else {
                a = C0808c.m1780a(c0809dArr[0]);
                i = 1;
            }
            arrayList.add(a);
            while (i < c0809dArr.length) {
                int i2 = i + 1;
                C0809d c0809d = c0809dArr[i];
                C0810a a2 = C0808c.m1780a(c0809d);
                if (a2 == null) {
                    if (a.f2430b > 0) {
                        a = mo857a(a.f2429a + a.f2430b);
                        arrayList.add(a);
                    }
                    a.f2430b = (c0809d.f2423a + c0809d.f2427e) - a.f2429a;
                    a.f2432d = c0809d.f2425c;
                    a.f2433e = c0809d.f2426d;
                    i = i2;
                } else {
                    if (a.f2430b == 0) {
                        a.f2430b = c0809d.f2423a - a.f2429a;
                        a2.f2431c++;
                    } else {
                        if (a.f2429a + a.f2430b < c0809d.f2423a) {
                            a = mo857a(a.f2429a + a.f2430b);
                            arrayList.add(a);
                            a.f2430b = c0809d.f2423a - a.f2429a;
                        }
                        arrayList.add(a2);
                        i = i2;
                        a = a2;
                    }
                    a.f2432d = m1783a(a2);
                    arrayList.add(a2);
                    i = i2;
                    a = a2;
                }
            }
            return (C0810a[]) arrayList.toArray(mo858b(arrayList.size()));
        }

        protected C0810a mo857a(int i) {
            return new C0810a(i);
        }

        public final C0810a[] m1786a(an anVar) {
            C4956l f = anVar.m1752f();
            if (f == null) {
                return null;
            }
            C4961m e = f.m9760e();
            int c = e.m9791c();
            C0829w c0829w = f.f13800f;
            e.m9787a();
            e.m9790b();
            HashMap hashMap = new HashMap();
            while (true) {
                int i = true;
                if (e.m9794d()) {
                    int e2 = e.m9795e();
                    if (e2 < c) {
                        int c2;
                        C0810a[] b;
                        boolean z;
                        C0808c c0808c;
                        HashMap hashMap2;
                        C0810a[] c0810aArr;
                        int a = e.m9785a(e2);
                        if ((153 > a || a > 166) && a != 198) {
                            if (a != 199) {
                                C0810a[] c0810aArr2;
                                int i2;
                                int i3;
                                if (167 <= a && a <= 171) {
                                    switch (a) {
                                        case 167:
                                            a = e.m9789b(e2 + 1) + e2;
                                            i3 = 3;
                                            break;
                                        case 168:
                                            e.m9789b(e2 + 1);
                                            throw new C4942b();
                                        case 169:
                                            c0810aArr2 = null;
                                            i2 = 2;
                                            break;
                                        case 170:
                                            a = (e2 & -4) + 4;
                                            i2 = (e.m9792c(a + 8) - e.m9792c(a + 4)) + 1;
                                            c0810aArr2 = mo858b(i2 + 1);
                                            c0810aArr2[0] = m1777a(hashMap, e.m9792c(a) + e2).f2424b;
                                            a += 12;
                                            i2 = (i2 * 4) + a;
                                            while (a < i2) {
                                                i3 = i + 1;
                                                c0810aArr2[i] = m1777a(hashMap, e.m9792c(a) + e2).f2424b;
                                                a += 4;
                                                i = i3;
                                            }
                                            i2 -= e2;
                                            break;
                                        case 171:
                                            a = (e2 & -4) + 4;
                                            c2 = e.m9792c(a + 4);
                                            b = mo858b(c2 + 1);
                                            b[0] = m1777a(hashMap, e.m9792c(a) + e2).f2424b;
                                            a = (a + 8) + 4;
                                            c2 = ((c2 * 8) + a) - 4;
                                            while (a < c2) {
                                                i3 = i + 1;
                                                b[i] = m1777a(hashMap, e.m9792c(a) + e2).f2424b;
                                                a += 8;
                                                i = i3;
                                            }
                                            c2 -= e2;
                                            z = true;
                                            break;
                                        default:
                                            break;
                                    }
                                } else if ((172 <= a && a <= 177) || a == 191) {
                                    c0810aArr2 = null;
                                    i2 = 1;
                                } else if (a == 200) {
                                    a = e.m9792c(e2 + 1) + e2;
                                    i3 = 5;
                                    m1781a(hashMap, e2, a, i3);
                                } else if (a == 201) {
                                    e.m9792c(e2 + 1);
                                    throw new C4942b();
                                } else if (a == 196 && e.m9785a(e2 + 1) == 169) {
                                    c0810aArr2 = null;
                                    i2 = 4;
                                }
                                z = true;
                                c0808c = this;
                                hashMap2 = hashMap;
                                i = e2;
                                c0810aArr = c0810aArr2;
                                c2 = i2;
                                c0808c.m1779a(hashMap2, i, c0810aArr, c2, z);
                            }
                        }
                        C0809d a2 = m1777a(hashMap, e.m9789b(e2 + 1) + e2);
                        C0809d a3 = m1777a(hashMap, e2 + 3);
                        C0810a c0810a = a2.f2424b;
                        C0810a c0810a2 = a3.f2424b;
                        b = mo858b(2);
                        b[0] = c0810a;
                        b[1] = c0810a2;
                        c2 = 3;
                        z = false;
                        c0808c = this;
                        hashMap2 = hashMap;
                        i = e2;
                        c0810aArr = b;
                        c0808c.m1779a(hashMap2, i, c0810aArr, c2, z);
                    }
                }
                if (c0829w != null) {
                    int size = c0829w.f2485b.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            m1778a(hashMap, c0829w.m1908a(size), true, false);
                            m1777a(hashMap, c0829w.m1911b(size));
                        }
                    }
                }
                C0810a[] a4 = m1784a(hashMap);
                C0808c.m1782a(a4, c0829w);
                return a4;
            }
        }

        protected C0810a[] mo858b(int i) {
            return new C0810a[i];
        }
    }

    static class C0809d implements Comparable {
        int f2423a;
        C0810a f2424b = null;
        C0810a[] f2425c = null;
        boolean f2426d = false;
        int f2427e = 0;
        C0807a f2428f = null;

        C0809d(int i) {
            this.f2423a = i;
        }

        public final int compareTo(Object obj) {
            if (!(obj instanceof C0809d)) {
                return -1;
            }
            return this.f2423a - ((C0809d) obj).f2423a;
        }
    }

    static class C4942b extends C0815e {
        C4942b() {
            super("JSR");
        }
    }

    protected C0810a(int i) {
        this.f2429a = i;
    }

    public static C0810a m1788a(C0810a[] c0810aArr, int i) {
        int i2 = 0;
        while (i2 < c0810aArr.length) {
            int i3 = c0810aArr[i2].f2429a;
            if (i3 <= i && i < i3 + c0810aArr[i2].f2430b) {
                return c0810aArr[i2];
            }
            i2++;
        }
        StringBuilder stringBuilder = new StringBuilder("no basic block at ");
        stringBuilder.append(i);
        throw new C0815e(stringBuilder.toString());
    }

    protected void mo859a(StringBuffer stringBuffer) {
        stringBuffer.append("pos=");
        stringBuffer.append(this.f2429a);
        stringBuffer.append(", len=");
        stringBuffer.append(this.f2430b);
        stringBuffer.append(", in=");
        stringBuffer.append(this.f2431c);
        stringBuffer.append(", exit{");
        if (this.f2432d != null) {
            for (C0810a c0810a : this.f2432d) {
                stringBuffer.append(c0810a.f2429a);
                stringBuffer.append(",");
            }
        }
        stringBuffer.append("}, {");
        for (C0807a c0807a = this.f2434f; c0807a != null; c0807a = c0807a.f2420a) {
            stringBuffer.append("(");
            stringBuffer.append(c0807a.f2421b.f2429a);
            stringBuffer.append(", ");
            stringBuffer.append(c0807a.f2422c);
            stringBuffer.append("), ");
        }
        stringBuffer.append("}");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        stringBuffer.append(name);
        stringBuffer.append("[");
        mo859a(stringBuffer);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
