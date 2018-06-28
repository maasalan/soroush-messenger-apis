package p050b.p054b;

import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.WeakHashMap;
import p050b.C0848e;
import p050b.C0851i;
import p050b.C0858w;
import p050b.C4990l;
import p050b.p051a.an;
import p050b.p054b.p055a.C4969a;
import p050b.p054b.p055a.C4975t;
import p050b.p054b.p055a.C6422i;

public class C4981j implements C0844q {
    private static WeakHashMap f13861b = new WeakHashMap();
    C0848e f13862a;
    private Hashtable f13863c = null;

    public static class C0840a {
        public C0851i f2507a;
        public an f2508b;
        public int f2509c;

        public C0840a(C0851i c0851i, an anVar, int i) {
            this.f2507a = c0851i;
            this.f2508b = anVar;
            this.f2509c = i;
        }

        public final boolean m1951a() {
            return (this.f2508b.f2405b & 8) != 0;
        }
    }

    public C4981j(C0848e c0848e) {
        this.f13862a = c0848e;
    }

    public static int m9927a(char c) {
        switch (c) {
            case 'B':
                return 303;
            case 'C':
                return 306;
            case 'D':
                return 312;
            case 'F':
                return 317;
            case 'I':
                return 324;
            case 'J':
                return 326;
            case 'L':
            case '[':
                return 307;
            case 'S':
                return 334;
            case 'V':
                return 344;
            case 'Z':
                return 301;
            default:
                C4981j.m9932a();
                return 344;
        }
    }

    private int m9928a(java.lang.String r17, int[] r18, int[] r19, java.lang.String[] r20) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r2 = r18;
        r3 = -1;
        r4 = r2.length;
        r5 = p050b.p051a.C0828s.m1904c(r17);
        if (r4 == r5) goto L_0x000f;
    L_0x000e:
        return r3;
    L_0x000f:
        r5 = r17.length();
        r8 = 1;
        r9 = 0;
        r10 = 0;
    L_0x0016:
        if (r8 >= r5) goto L_0x00cd;
    L_0x0018:
        r11 = r8 + 1;
        r8 = r1.charAt(r8);
        r12 = 41;
        if (r8 != r12) goto L_0x0026;
    L_0x0022:
        if (r9 != r4) goto L_0x0025;
    L_0x0024:
        return r10;
    L_0x0025:
        return r3;
    L_0x0026:
        if (r9 < r4) goto L_0x0029;
    L_0x0028:
        return r3;
    L_0x0029:
        r12 = r11;
        r11 = 0;
    L_0x002b:
        r13 = 91;
        if (r8 != r13) goto L_0x003b;
    L_0x002f:
        r11 = r11 + 1;
        r8 = r12 + 1;
        r12 = r1.charAt(r12);
        r15 = r12;
        r12 = r8;
        r8 = r15;
        goto L_0x002b;
    L_0x003b:
        r13 = r2[r9];
        r14 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        r6 = 59;
        r7 = 76;
        if (r13 != r14) goto L_0x0059;
    L_0x0045:
        if (r11 != 0) goto L_0x004a;
    L_0x0047:
        if (r8 == r7) goto L_0x004a;
    L_0x0049:
        return r3;
    L_0x004a:
        if (r8 != r7) goto L_0x0056;
    L_0x004c:
        r6 = r1.indexOf(r6, r12);
        r7 = 1;
        r6 = r6 + r7;
        r8 = r6;
        r11 = r7;
        goto L_0x00c9;
    L_0x0056:
        r11 = 1;
        goto L_0x00c8;
    L_0x0059:
        r14 = r19[r9];
        if (r14 == r11) goto L_0x0078;
    L_0x005d:
        if (r11 != 0) goto L_0x0077;
    L_0x005f:
        if (r8 != r7) goto L_0x0077;
    L_0x0061:
        r7 = "java/lang/Object;";
        r7 = r1.startsWith(r7, r12);
        if (r7 != 0) goto L_0x006a;
    L_0x0069:
        return r3;
    L_0x006a:
        r6 = r1.indexOf(r6, r12);
        r11 = 1;
        r6 = r6 + r11;
        r10 = r10 + 1;
        if (r6 > 0) goto L_0x0075;
    L_0x0074:
        return r3;
    L_0x0075:
        r8 = r6;
        goto L_0x00c9;
    L_0x0077:
        return r3;
    L_0x0078:
        r11 = 1;
        if (r8 != r7) goto L_0x00ac;
    L_0x007b:
        r6 = r1.indexOf(r6, r12);
        if (r6 < 0) goto L_0x00ab;
    L_0x0081:
        r7 = r2[r9];
        r8 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        if (r7 == r8) goto L_0x0088;
    L_0x0087:
        return r3;
    L_0x0088:
        r7 = r1.substring(r12, r6);
        r8 = r20[r9];
        r8 = r7.equals(r8);
        if (r8 != 0) goto L_0x00a8;
    L_0x0094:
        r8 = r20[r9];
        r8 = r0.m9941a(r8);
        r7 = r0.m9941a(r7);	 Catch:{ w -> 0x00a6 }
        r7 = r8.mo912a(r7);	 Catch:{ w -> 0x00a6 }
        if (r7 == 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00a6;
    L_0x00a5:
        return r3;
    L_0x00a6:
        r10 = r10 + 1;
    L_0x00a8:
        r6 = r6 + 1;
        goto L_0x0075;
    L_0x00ab:
        return r3;
    L_0x00ac:
        r6 = p050b.p054b.C4981j.m9927a(r8);
        r7 = r2[r9];
        if (r6 == r7) goto L_0x00c8;
    L_0x00b4:
        r8 = 324; // 0x144 float:4.54E-43 double:1.6E-321;
        if (r6 != r8) goto L_0x00c7;
    L_0x00b8:
        r6 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        if (r7 == r6) goto L_0x00c4;
    L_0x00bc:
        r6 = 303; // 0x12f float:4.25E-43 double:1.497E-321;
        if (r7 == r6) goto L_0x00c4;
    L_0x00c0:
        r6 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        if (r7 != r6) goto L_0x00c7;
    L_0x00c4:
        r10 = r10 + 1;
        goto L_0x00c8;
    L_0x00c7:
        return r3;
    L_0x00c8:
        r8 = r12;
    L_0x00c9:
        r9 = r9 + 1;
        goto L_0x0016;
    L_0x00cd:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.j.a(java.lang.String, int[], int[], java.lang.String[]):int");
    }

    private p050b.p054b.C4981j.C0840a m9929a(p050b.C0851i r17, java.lang.String r18, int[] r19, int[] r20, java.lang.String[] r21, boolean r22) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r16 = this;
        r0 = r17.mo930h();
        r1 = 0;
        r2 = 0;
        if (r0 == 0) goto L_0x0066;
    L_0x0008:
        r0 = r0.f2457i;
        r3 = r0.size();
        r5 = r1;
        r4 = r2;
    L_0x0010:
        if (r4 >= r3) goto L_0x0059;
    L_0x0012:
        r6 = r0.get(r4);
        r6 = (p050b.p051a.an) r6;
        r7 = r6.m1744a();
        r15 = r18;
        r7 = r7.equals(r15);
        if (r7 == 0) goto L_0x004c;
    L_0x0024:
        r7 = r6.m1750d();
        r14 = r16;
        r13 = r19;
        r12 = r20;
        r11 = r21;
        r7 = r14.m9928a(r7, r13, r12, r11);
        r8 = -1;
        if (r7 == r8) goto L_0x0049;
    L_0x0037:
        r8 = new b.b.j$a;
        r10 = r17;
        r8.<init>(r10, r6, r7);
        if (r7 != 0) goto L_0x0041;
    L_0x0040:
        return r8;
    L_0x0041:
        if (r5 == 0) goto L_0x0047;
    L_0x0043:
        r6 = r5.f2509c;
        if (r6 <= r7) goto L_0x0056;
    L_0x0047:
        r5 = r8;
        goto L_0x0056;
    L_0x0049:
        r10 = r17;
        goto L_0x0056;
    L_0x004c:
        r14 = r16;
        r10 = r17;
        r13 = r19;
        r12 = r20;
        r11 = r21;
    L_0x0056:
        r4 = r4 + 1;
        goto L_0x0010;
    L_0x0059:
        r14 = r16;
        r10 = r17;
        r15 = r18;
        r13 = r19;
        r12 = r20;
        r11 = r21;
        goto L_0x0073;
    L_0x0066:
        r14 = r16;
        r10 = r17;
        r15 = r18;
        r13 = r19;
        r12 = r20;
        r11 = r21;
        r5 = r1;
    L_0x0073:
        r0 = 1;
        if (r22 == 0) goto L_0x007a;
    L_0x0076:
        r5 = r1;
        r1 = r22;
        goto L_0x007f;
    L_0x007a:
        if (r5 == 0) goto L_0x007e;
    L_0x007c:
        r1 = r0;
        goto L_0x007f;
    L_0x007e:
        r1 = r2;
    L_0x007f:
        r3 = r17.mo914c();
        r4 = p050b.C0857v.m2018b(r3);
        if (r4 != 0) goto L_0x009e;
    L_0x0089:
        r9 = r17.mo917f();	 Catch:{ w -> 0x009e }
        if (r9 == 0) goto L_0x009e;	 Catch:{ w -> 0x009e }
    L_0x008f:
        r8 = r14;	 Catch:{ w -> 0x009e }
        r10 = r15;	 Catch:{ w -> 0x009e }
        r11 = r13;	 Catch:{ w -> 0x009e }
        r12 = r20;	 Catch:{ w -> 0x009e }
        r13 = r21;	 Catch:{ w -> 0x009e }
        r14 = r1;	 Catch:{ w -> 0x009e }
        r6 = r8.m9929a(r9, r10, r11, r12, r13, r14);	 Catch:{ w -> 0x009e }
        if (r6 == 0) goto L_0x009e;
    L_0x009d:
        return r6;
    L_0x009e:
        if (r4 != 0) goto L_0x00a8;
    L_0x00a0:
        r3 = r3 & 1024;
        if (r3 == 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00a6;
    L_0x00a5:
        r0 = r2;
    L_0x00a6:
        if (r0 == 0) goto L_0x00de;
    L_0x00a8:
        r0 = r17.mo915d();	 Catch:{ w -> 0x00de }
        r3 = r0.length;	 Catch:{ w -> 0x00de }
    L_0x00ad:
        if (r2 >= r3) goto L_0x00c5;	 Catch:{ w -> 0x00de }
    L_0x00af:
        r9 = r0[r2];	 Catch:{ w -> 0x00de }
        r8 = r16;	 Catch:{ w -> 0x00de }
        r10 = r15;	 Catch:{ w -> 0x00de }
        r11 = r19;	 Catch:{ w -> 0x00de }
        r12 = r20;	 Catch:{ w -> 0x00de }
        r13 = r21;	 Catch:{ w -> 0x00de }
        r14 = r1;	 Catch:{ w -> 0x00de }
        r6 = r8.m9929a(r9, r10, r11, r12, r13, r14);	 Catch:{ w -> 0x00de }
        if (r6 == 0) goto L_0x00c2;	 Catch:{ w -> 0x00de }
    L_0x00c1:
        return r6;	 Catch:{ w -> 0x00de }
    L_0x00c2:
        r2 = r2 + 1;	 Catch:{ w -> 0x00de }
        goto L_0x00ad;	 Catch:{ w -> 0x00de }
    L_0x00c5:
        if (r4 == 0) goto L_0x00de;	 Catch:{ w -> 0x00de }
    L_0x00c7:
        r9 = r17.mo917f();	 Catch:{ w -> 0x00de }
        if (r9 == 0) goto L_0x00de;	 Catch:{ w -> 0x00de }
    L_0x00cd:
        r8 = r16;	 Catch:{ w -> 0x00de }
        r10 = r15;	 Catch:{ w -> 0x00de }
        r11 = r19;	 Catch:{ w -> 0x00de }
        r12 = r20;	 Catch:{ w -> 0x00de }
        r13 = r21;	 Catch:{ w -> 0x00de }
        r14 = r1;	 Catch:{ w -> 0x00de }
        r0 = r8.m9929a(r9, r10, r11, r12, r13, r14);	 Catch:{ w -> 0x00de }
        if (r0 == 0) goto L_0x00de;
    L_0x00dd:
        return r0;
    L_0x00de:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.j.a(b.i, java.lang.String, int[], int[], java.lang.String[], boolean):b.b.j$a");
    }

    public static p050b.C0851i m9930a(p050b.C0851i r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r3.mo917f();	 Catch:{ w -> 0x0007 }
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return r0;
    L_0x0007:
        r0 = new b.b.c;
        r1 = new java.lang.StringBuilder;
        r2 = "cannot find the super class of ";
        r1.<init>(r2);
        r3 = r3.m1999m();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.j.a(b.i):b.i");
    }

    static String m9931a(int i) {
        String str = "";
        if (i == 301) {
            return "boolean";
        }
        if (i == 303) {
            return "byte";
        }
        if (i == 306) {
            return "char";
        }
        if (i == 312) {
            return "double";
        }
        if (i == 317) {
            return "float";
        }
        if (i == 324) {
            return "int";
        }
        if (i == 326) {
            return "long";
        }
        if (i == 334) {
            return "short";
        }
        if (i == 344) {
            return "void";
        }
        C4981j.m9932a();
        return str;
    }

    private static void m9932a() {
        throw new C0837c("fatal");
    }

    private C0851i m9933b(String str, boolean z) {
        C0851i c0851i = null;
        do {
            try {
                c0851i = this.f13862a.m1965a(str);
                continue;
            } catch (C0858w e) {
                int lastIndexOf = str.lastIndexOf(46);
                if (!z) {
                    if (lastIndexOf >= 0) {
                        StringBuffer stringBuffer = new StringBuffer(str);
                        stringBuffer.setCharAt(lastIndexOf, '$');
                        str = stringBuffer.toString();
                        continue;
                    }
                }
                throw e;
            }
        } while (c0851i == null);
        return c0851i;
    }

    public static String m9934b(String str) {
        return str.replace('.', '/');
    }

    private Hashtable m9935b() {
        Hashtable hashtable = this.f13863c;
        if (hashtable != null) {
            return hashtable;
        }
        synchronized (C4981j.class) {
            WeakReference weakReference = (WeakReference) f13861b.get(this.f13862a);
            if (weakReference != null) {
                hashtable = (Hashtable) weakReference.get();
            }
            if (hashtable == null) {
                hashtable = new Hashtable();
                f13861b.put(this.f13862a, new WeakReference(hashtable));
            }
        }
        this.f13863c = hashtable;
        return hashtable;
    }

    public static String m9936c(String str) {
        return str.replace('/', '.');
    }

    private p050b.C0851i m9937d(java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = 46;
        r1 = r6.indexOf(r0);
        if (r1 >= 0) goto L_0x0050;
    L_0x0008:
        r1 = r5.f13862a;
        r1 = r1.f2530h;
        r1 = r1.iterator();
    L_0x0010:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0050;
    L_0x0016:
        r2 = r1.next();
        r2 = (java.lang.String) r2;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r2);
        r3.append(r0);
        r3.append(r6);
        r3 = r3.toString();
        r4 = r5.f13862a;	 Catch:{ w -> 0x0035 }
        r3 = r4.m1965a(r3);	 Catch:{ w -> 0x0035 }
        return r3;
    L_0x0035:
        r3 = new java.lang.StringBuilder;	 Catch:{ w -> 0x0010 }
        r4 = ".";	 Catch:{ w -> 0x0010 }
        r3.<init>(r4);	 Catch:{ w -> 0x0010 }
        r3.append(r6);	 Catch:{ w -> 0x0010 }
        r3 = r3.toString();	 Catch:{ w -> 0x0010 }
        r3 = r2.endsWith(r3);	 Catch:{ w -> 0x0010 }
        if (r3 == 0) goto L_0x0010;	 Catch:{ w -> 0x0010 }
    L_0x0049:
        r3 = r5.f13862a;	 Catch:{ w -> 0x0010 }
        r2 = r3.m1965a(r2);	 Catch:{ w -> 0x0010 }
        return r2;
    L_0x0050:
        r0 = r5.m9935b();
        r1 = "<invalid>";
        r0.put(r6, r1);
        r0 = new b.b.c;
        r1 = new java.lang.StringBuilder;
        r2 = "no such class: ";
        r1.<init>(r2);
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.j.d(java.lang.String):b.i");
    }

    public final C0840a m9938a(C0851i c0851i, C0851i c0851i2, an anVar, String str, int[] iArr, int[] iArr2, String[] strArr) {
        C0840a c0840a;
        C0840a a;
        if (anVar != null && c0851i == c0851i2 && anVar.m1744a().equals(str)) {
            int a2 = m9928a(anVar.m1750d(), iArr, iArr2, strArr);
            if (a2 != -1) {
                c0840a = new C0840a(c0851i, anVar, a2);
                if (a2 == 0) {
                    return c0840a;
                }
                a = m9929a(c0851i, str, iArr, iArr2, strArr, c0840a == null);
                return a == null ? a : c0840a;
            }
        }
        c0840a = null;
        if (c0840a == null) {
        }
        a = m9929a(c0851i, str, iArr, iArr2, strArr, c0840a == null);
        if (a == null) {
        }
    }

    public final C0851i m9939a(int i, int i2, String str) {
        String m;
        if (i == 307) {
            C0851i a = m9941a(str);
            if (i2 <= 0) {
                return a;
            }
            m = a.m1999m();
        } else {
            m = C4981j.m9931a(i);
        }
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return m9942a(m, false);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(m);
            stringBuilder.append("[]");
            m = stringBuilder.toString();
            i2 = i3;
        }
    }

    public final C0851i m9940a(C4969a c4969a) {
        return m9942a(C6422i.m15261a(c4969a, '.'), false);
    }

    public final C0851i m9941a(String str) {
        return m9942a(C4981j.m9936c(str), false);
    }

    public final p050b.C0851i m9942a(java.lang.String r4, boolean r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.m9935b();
        r1 = r0.get(r4);
        r2 = "<invalid>";
        if (r1 != r2) goto L_0x0020;
    L_0x000c:
        r5 = new b.b.c;
        r0 = new java.lang.StringBuilder;
        r1 = "no such class: ";
        r0.<init>(r1);
        r0.append(r4);
        r4 = r0.toString();
        r5.<init>(r4);
        throw r5;
    L_0x0020:
        if (r1 == 0) goto L_0x002b;
    L_0x0022:
        r2 = r3.f13862a;	 Catch:{ w -> 0x002b }
        r1 = (java.lang.String) r1;	 Catch:{ w -> 0x002b }
        r1 = r2.m1965a(r1);	 Catch:{ w -> 0x002b }
        return r1;
    L_0x002b:
        r5 = r3.m9933b(r4, r5);	 Catch:{ w -> 0x0030 }
        goto L_0x0034;
    L_0x0030:
        r5 = r3.m9937d(r4);
    L_0x0034:
        r1 = r5.m1999m();
        r0.put(r4, r1);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.j.a(java.lang.String, boolean):b.i");
    }

    public final C4990l m9943a(String str, C4975t c4975t) {
        return m9945b(C4981j.m9936c(str), c4975t);
    }

    public final p050b.C4990l m9944a(java.lang.String r3, p050b.p054b.p055a.C4975t r4, p050b.p054b.p055a.C0833b r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r4 = r4.m9844d();
        r0 = p050b.p054b.C4981j.m9936c(r3);	 Catch:{ c -> 0x0034 }
        r1 = 1;	 Catch:{ c -> 0x0034 }
        r0 = r2.m9942a(r0, r1);	 Catch:{ c -> 0x0034 }
        r3 = r0.mo921a(r4);	 Catch:{ w -> 0x0012 }
        return r3;
    L_0x0012:
        r3 = r0.m1999m();
        r3 = p050b.p054b.C4981j.m9934b(r3);
        r0 = new b.b.k;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r3);
        r3 = "$";
        r1.append(r3);
        r1.append(r4);
        r3 = r1.toString();
        r0.<init>(r3, r5);
        throw r0;
    L_0x0034:
        r0 = new b.b.k;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r3);
        r3 = "/";
        r1.append(r3);
        r1.append(r4);
        r3 = r1.toString();
        r0.<init>(r3, r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.j.a(java.lang.String, b.b.a.t, b.b.a.b):b.l");
    }

    public final p050b.C4990l m9945b(java.lang.String r3, p050b.p054b.p055a.C4975t r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 0;
        r3 = r2.m9942a(r3, r0);
        r0 = r4.m9844d();	 Catch:{ w -> 0x000e }
        r3 = r3.mo921a(r0);	 Catch:{ w -> 0x000e }
        return r3;
    L_0x000e:
        r3 = new b.b.c;
        r0 = new java.lang.StringBuilder;
        r1 = "no such field: ";
        r0.<init>(r1);
        r4 = r4.m9844d();
        r0.append(r4);
        r4 = r0.toString();
        r3.<init>(r4);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.j.b(java.lang.String, b.b.a.t):b.l");
    }

    public final String m9946b(C4969a c4969a) {
        return c4969a == null ? null : C4981j.m9934b(m9940a(c4969a).m1999m());
    }
}
