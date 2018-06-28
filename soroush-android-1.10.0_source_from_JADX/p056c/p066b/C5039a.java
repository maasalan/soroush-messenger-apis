package p056c.p066b;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import org.jivesoftware.smack.util.StringUtils;
import p056c.C0932i;
import p056c.C0946s;
import p056c.C0951u;
import p056c.C0951u.C0950a;
import p056c.C0952v;
import p056c.aa;
import p056c.ab;
import p056c.ac;
import p056c.ad;
import p056c.p057a.p060c.C0880e;
import p056c.p057a.p063g.C0909f;
import p206d.C2278s;
import p206d.C5683e;
import p206d.C5687j;
import p206d.C6623c;

public final class C5039a implements C0951u {
    private static final Charset f14057b = Charset.forName(StringUtils.UTF8);
    public volatile int f14058a;
    private final C0919b f14059c;

    public enum C0918a {
        ;
        
        public static final int f2847a = 1;
        public static final int f2848b = 2;
        public static final int f2849c = 3;
        public static final int f2850d = 4;

        static {
            f2851e = new int[]{f2847a, f2848b, f2849c, f2850d};
        }
    }

    public interface C0919b {
        public static final C0919b f2852a = new C50381();

        class C50381 implements C0919b {
            C50381() {
            }

            public final void mo1002a(String str) {
                C0909f.m2216c().mo990a(4, str, null);
            }
        }

        void mo1002a(String str);
    }

    public C5039a() {
        this(C0919b.f2852a);
    }

    private C5039a(C0919b c0919b) {
        this.f14058a = C0918a.f2847a;
        this.f14059c = c0919b;
    }

    private static boolean m10210a(C0946s c0946s) {
        String a = c0946s.m2346a("Content-Encoding");
        return (a == null || a.equalsIgnoreCase("identity") || a.equalsIgnoreCase("gzip")) ? false : true;
    }

    private static boolean m10211a(p206d.C6623c r14) {
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
        r0 = 0;
        r7 = new d.c;	 Catch:{ EOFException -> 0x00e5 }
        r7.<init>();	 Catch:{ EOFException -> 0x00e5 }
        r1 = r14.f18884b;	 Catch:{ EOFException -> 0x00e5 }
        r3 = 64;	 Catch:{ EOFException -> 0x00e5 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ EOFException -> 0x00e5 }
        if (r5 >= 0) goto L_0x0012;	 Catch:{ EOFException -> 0x00e5 }
    L_0x000e:
        r1 = r14.f18884b;	 Catch:{ EOFException -> 0x00e5 }
        r5 = r1;	 Catch:{ EOFException -> 0x00e5 }
        goto L_0x0013;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0012:
        r5 = r3;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0013:
        r3 = 0;	 Catch:{ EOFException -> 0x00e5 }
        r1 = r14;	 Catch:{ EOFException -> 0x00e5 }
        r2 = r7;	 Catch:{ EOFException -> 0x00e5 }
        r1.m17024a(r2, r3, r5);	 Catch:{ EOFException -> 0x00e5 }
        r14 = r0;	 Catch:{ EOFException -> 0x00e5 }
    L_0x001b:
        r1 = 16;	 Catch:{ EOFException -> 0x00e5 }
        r2 = 1;	 Catch:{ EOFException -> 0x00e5 }
        if (r14 >= r1) goto L_0x00e4;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0020:
        r1 = r7.mo3131c();	 Catch:{ EOFException -> 0x00e5 }
        if (r1 != 0) goto L_0x00e4;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0026:
        r3 = r7.f18884b;	 Catch:{ EOFException -> 0x00e5 }
        r5 = 0;	 Catch:{ EOFException -> 0x00e5 }
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));	 Catch:{ EOFException -> 0x00e5 }
        if (r1 != 0) goto L_0x0034;	 Catch:{ EOFException -> 0x00e5 }
    L_0x002e:
        r14 = new java.io.EOFException;	 Catch:{ EOFException -> 0x00e5 }
        r14.<init>();	 Catch:{ EOFException -> 0x00e5 }
        throw r14;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0034:
        r1 = r7.m17039c(r5);	 Catch:{ EOFException -> 0x00e5 }
        r3 = r1 & 128;	 Catch:{ EOFException -> 0x00e5 }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ EOFException -> 0x00e5 }
        r5 = 65533; // 0xfffd float:9.1831E-41 double:3.23776E-319;	 Catch:{ EOFException -> 0x00e5 }
        if (r3 != 0) goto L_0x0046;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0041:
        r3 = r1 & 127;	 Catch:{ EOFException -> 0x00e5 }
        r8 = r0;	 Catch:{ EOFException -> 0x00e5 }
        r6 = r2;	 Catch:{ EOFException -> 0x00e5 }
        goto L_0x0068;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0046:
        r3 = r1 & 224;	 Catch:{ EOFException -> 0x00e5 }
        r6 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ EOFException -> 0x00e5 }
        if (r3 != r6) goto L_0x0051;	 Catch:{ EOFException -> 0x00e5 }
    L_0x004c:
        r3 = r1 & 31;	 Catch:{ EOFException -> 0x00e5 }
        r6 = 2;	 Catch:{ EOFException -> 0x00e5 }
        r8 = r4;	 Catch:{ EOFException -> 0x00e5 }
        goto L_0x0068;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0051:
        r3 = r1 & 240;	 Catch:{ EOFException -> 0x00e5 }
        r6 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;	 Catch:{ EOFException -> 0x00e5 }
        if (r3 != r6) goto L_0x005d;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0057:
        r3 = r1 & 15;	 Catch:{ EOFException -> 0x00e5 }
        r6 = 3;	 Catch:{ EOFException -> 0x00e5 }
        r8 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;	 Catch:{ EOFException -> 0x00e5 }
        goto L_0x0068;	 Catch:{ EOFException -> 0x00e5 }
    L_0x005d:
        r3 = r1 & 248;	 Catch:{ EOFException -> 0x00e5 }
        r6 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;	 Catch:{ EOFException -> 0x00e5 }
        if (r3 != r6) goto L_0x00ce;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0063:
        r3 = r1 & 7;	 Catch:{ EOFException -> 0x00e5 }
        r6 = 4;	 Catch:{ EOFException -> 0x00e5 }
        r8 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;	 Catch:{ EOFException -> 0x00e5 }
    L_0x0068:
        r9 = r7.f18884b;	 Catch:{ EOFException -> 0x00e5 }
        r11 = (long) r6;	 Catch:{ EOFException -> 0x00e5 }
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));	 Catch:{ EOFException -> 0x00e5 }
        if (r13 >= 0) goto L_0x009e;	 Catch:{ EOFException -> 0x00e5 }
    L_0x006f:
        r14 = new java.io.EOFException;	 Catch:{ EOFException -> 0x00e5 }
        r2 = new java.lang.StringBuilder;	 Catch:{ EOFException -> 0x00e5 }
        r3 = "size < ";	 Catch:{ EOFException -> 0x00e5 }
        r2.<init>(r3);	 Catch:{ EOFException -> 0x00e5 }
        r2.append(r6);	 Catch:{ EOFException -> 0x00e5 }
        r3 = ": ";	 Catch:{ EOFException -> 0x00e5 }
        r2.append(r3);	 Catch:{ EOFException -> 0x00e5 }
        r3 = r7.f18884b;	 Catch:{ EOFException -> 0x00e5 }
        r2.append(r3);	 Catch:{ EOFException -> 0x00e5 }
        r3 = " (to read code point prefixed 0x";	 Catch:{ EOFException -> 0x00e5 }
        r2.append(r3);	 Catch:{ EOFException -> 0x00e5 }
        r1 = java.lang.Integer.toHexString(r1);	 Catch:{ EOFException -> 0x00e5 }
        r2.append(r1);	 Catch:{ EOFException -> 0x00e5 }
        r1 = ")";	 Catch:{ EOFException -> 0x00e5 }
        r2.append(r1);	 Catch:{ EOFException -> 0x00e5 }
        r1 = r2.toString();	 Catch:{ EOFException -> 0x00e5 }
        r14.<init>(r1);	 Catch:{ EOFException -> 0x00e5 }
        throw r14;	 Catch:{ EOFException -> 0x00e5 }
    L_0x009e:
        if (r2 >= r6) goto L_0x00b5;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00a0:
        r9 = (long) r2;	 Catch:{ EOFException -> 0x00e5 }
        r1 = r7.m17039c(r9);	 Catch:{ EOFException -> 0x00e5 }
        r13 = r1 & 192;	 Catch:{ EOFException -> 0x00e5 }
        if (r13 != r4) goto L_0x00b1;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00a9:
        r3 = r3 << 6;	 Catch:{ EOFException -> 0x00e5 }
        r1 = r1 & 63;	 Catch:{ EOFException -> 0x00e5 }
        r3 = r3 | r1;	 Catch:{ EOFException -> 0x00e5 }
        r2 = r2 + 1;	 Catch:{ EOFException -> 0x00e5 }
        goto L_0x009e;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00b1:
        r7.mo3142h(r9);	 Catch:{ EOFException -> 0x00e5 }
        goto L_0x00d3;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00b5:
        r7.mo3142h(r11);	 Catch:{ EOFException -> 0x00e5 }
        r1 = 1114111; // 0x10ffff float:1.561202E-39 double:5.50444E-318;	 Catch:{ EOFException -> 0x00e5 }
        if (r3 <= r1) goto L_0x00be;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00bd:
        goto L_0x00d3;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00be:
        r1 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;	 Catch:{ EOFException -> 0x00e5 }
        if (r3 < r1) goto L_0x00c9;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00c3:
        r1 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;	 Catch:{ EOFException -> 0x00e5 }
        if (r3 > r1) goto L_0x00c9;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00c8:
        goto L_0x00d3;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00c9:
        if (r3 >= r8) goto L_0x00cc;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00cb:
        goto L_0x00d3;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00cc:
        r5 = r3;	 Catch:{ EOFException -> 0x00e5 }
        goto L_0x00d3;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00ce:
        r1 = 1;	 Catch:{ EOFException -> 0x00e5 }
        r7.mo3142h(r1);	 Catch:{ EOFException -> 0x00e5 }
    L_0x00d3:
        r1 = java.lang.Character.isISOControl(r5);	 Catch:{ EOFException -> 0x00e5 }
        if (r1 == 0) goto L_0x00e0;	 Catch:{ EOFException -> 0x00e5 }
    L_0x00d9:
        r1 = java.lang.Character.isWhitespace(r5);	 Catch:{ EOFException -> 0x00e5 }
        if (r1 != 0) goto L_0x00e0;
    L_0x00df:
        return r0;
    L_0x00e0:
        r14 = r14 + 1;
        goto L_0x001b;
    L_0x00e4:
        return r2;
    L_0x00e5:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.a(d.c):boolean");
    }

    public final ac mo947a(C0950a c0950a) {
        Throwable th;
        C0950a c0950a2 = c0950a;
        int i = this.f14058a;
        aa a = c0950a.mo951a();
        if (i == C0918a.f2847a) {
            return c0950a2.mo952a(a);
        }
        Object obj;
        ab abVar;
        C0932i b;
        StringBuilder stringBuilder;
        String stringBuilder2;
        C0919b c0919b;
        StringBuilder stringBuilder3;
        C0946s c0946s;
        int length;
        int i2;
        String a2;
        C0919b c0919b2;
        Charset charset;
        C0952v a3;
        StringBuilder stringBuilder4;
        String str;
        long nanoTime;
        ac a4;
        ad adVar;
        long b2;
        String stringBuilder5;
        StringBuilder stringBuilder6;
        String stringBuilder7;
        C0946s c0946s2;
        int length2;
        int i3;
        C6623c b3;
        C2278s c5687j;
        Charset charset2;
        C0952v a5;
        C0919b c0919b3;
        StringBuilder stringBuilder8;
        String stringBuilder9;
        Object obj2 = 1;
        Object obj3 = i == C0918a.f2850d ? 1 : null;
        if (obj3 == null) {
            if (i != C0918a.f2849c) {
                obj = null;
                abVar = a.f2804d;
                if (abVar != null) {
                    obj2 = null;
                }
                b = c0950a.mo953b();
                stringBuilder = new StringBuilder("--> ");
                stringBuilder.append(a.f2802b);
                stringBuilder.append(' ');
                stringBuilder.append(a.f2801a);
                if (b == null) {
                    StringBuilder stringBuilder10 = new StringBuilder(" ");
                    stringBuilder10.append(b.mo948a());
                    stringBuilder2 = stringBuilder10.toString();
                } else {
                    stringBuilder2 = "";
                }
                stringBuilder.append(stringBuilder2);
                stringBuilder2 = stringBuilder.toString();
                if (obj == null && obj2 != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(stringBuilder2);
                    stringBuilder.append(" (");
                    stringBuilder.append(abVar.mo1000b());
                    stringBuilder.append("-byte body)");
                    stringBuilder2 = stringBuilder.toString();
                }
                r1.f14059c.mo1002a(stringBuilder2);
                if (obj != null) {
                    if (obj2 != null) {
                        if (abVar.mo998a() != null) {
                            c0919b = r1.f14059c;
                            stringBuilder3 = new StringBuilder("Content-Type: ");
                            stringBuilder3.append(abVar.mo998a());
                            c0919b.mo1002a(stringBuilder3.toString());
                        }
                        if (abVar.mo1000b() != -1) {
                            c0919b = r1.f14059c;
                            stringBuilder3 = new StringBuilder("Content-Length: ");
                            stringBuilder3.append(abVar.mo1000b());
                            c0919b.mo1002a(stringBuilder3.toString());
                        }
                    }
                    c0946s = a.f2803c;
                    length = c0946s.f2991a.length / 2;
                    for (i2 = 0; i2 < length; i2++) {
                        a2 = c0946s.m2345a(i2);
                        if (!("Content-Type".equalsIgnoreCase(a2) || "Content-Length".equalsIgnoreCase(a2))) {
                            c0919b2 = r1.f14059c;
                            StringBuilder stringBuilder11 = new StringBuilder();
                            stringBuilder11.append(a2);
                            stringBuilder11.append(": ");
                            stringBuilder11.append(c0946s.m2347b(i2));
                            c0919b2.mo1002a(stringBuilder11.toString());
                        }
                    }
                    if (obj3 != null) {
                        if (obj2 == null) {
                            if (C5039a.m10210a(a.f2803c)) {
                                C6623c c6623c;
                                c6623c = new C6623c();
                                abVar.mo999a(c6623c);
                                charset = f14057b;
                                a3 = abVar.mo998a();
                                if (a3 != null) {
                                    charset = a3.m2386a(f14057b);
                                }
                                r1.f14059c.mo1002a("");
                                if (C5039a.m10211a(c6623c)) {
                                    c0919b2 = r1.f14059c;
                                    stringBuilder4 = new StringBuilder("--> END ");
                                    stringBuilder4.append(a.f2802b);
                                    stringBuilder4.append(" (binary ");
                                    stringBuilder4.append(abVar.mo1000b());
                                    str = "-byte body omitted)";
                                } else {
                                    r1.f14059c.mo1002a(c6623c.mo3121a(charset));
                                    c0919b2 = r1.f14059c;
                                    stringBuilder4 = new StringBuilder("--> END ");
                                    stringBuilder4.append(a.f2802b);
                                    stringBuilder4.append(" (");
                                    stringBuilder4.append(abVar.mo1000b());
                                    str = "-byte body)";
                                }
                            } else {
                                c0919b2 = r1.f14059c;
                                stringBuilder4 = new StringBuilder("--> END ");
                                stringBuilder4.append(a.f2802b);
                                str = " (encoded body omitted)";
                            }
                            stringBuilder4.append(str);
                            c0919b2.mo1002a(stringBuilder4.toString());
                        }
                    }
                    c0919b2 = r1.f14059c;
                    stringBuilder4 = new StringBuilder("--> END ");
                    str = a.f2802b;
                    stringBuilder4.append(str);
                    c0919b2.mo1002a(stringBuilder4.toString());
                }
                nanoTime = System.nanoTime();
                a4 = c0950a2.mo952a(a);
                nanoTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                adVar = a4.f2825g;
                b2 = adVar.mo958b();
                if (b2 == -1) {
                    StringBuilder stringBuilder12 = new StringBuilder();
                    stringBuilder12.append(b2);
                    stringBuilder12.append("-byte");
                    str = stringBuilder12.toString();
                } else {
                    str = "unknown-length";
                }
                C0919b c0919b4 = r1.f14059c;
                stringBuilder = new StringBuilder("<-- ");
                stringBuilder.append(a4.f2821c);
                if (a4.f2822d.isEmpty()) {
                    stringBuilder3 = new StringBuilder(" ");
                    stringBuilder3.append(a4.f2822d);
                    stringBuilder5 = stringBuilder3.toString();
                } else {
                    stringBuilder5 = "";
                }
                stringBuilder.append(stringBuilder5);
                stringBuilder.append(' ');
                stringBuilder.append(a4.f2819a.f2801a);
                stringBuilder.append(" (");
                stringBuilder.append(nanoTime);
                stringBuilder.append("ms");
                if (obj != null) {
                    stringBuilder6 = new StringBuilder(", ");
                    stringBuilder6.append(str);
                    stringBuilder6.append(" body");
                    stringBuilder7 = stringBuilder6.toString();
                } else {
                    stringBuilder7 = "";
                }
                stringBuilder.append(stringBuilder7);
                stringBuilder.append(')');
                c0919b4.mo1002a(stringBuilder.toString());
                if (obj != null) {
                    c0946s2 = a4.f2824f;
                    length2 = c0946s2.f2991a.length / 2;
                    for (i3 = 0; i3 < length2; i3++) {
                        C0919b c0919b5 = r1.f14059c;
                        StringBuilder stringBuilder13 = new StringBuilder();
                        stringBuilder13.append(c0946s2.m2345a(i3));
                        stringBuilder13.append(": ");
                        stringBuilder13.append(c0946s2.m2347b(i3));
                        c0919b5.mo1002a(stringBuilder13.toString());
                    }
                    if (obj3 != null) {
                        if (!C0880e.m2079b(a4)) {
                            if (C5039a.m10210a(a4.f2824f)) {
                                C5683e d = adVar.mo959d();
                                d.mo3126b(Long.MAX_VALUE);
                                b3 = d.mo3124b();
                                C5687j c5687j2 = null;
                                if ("gzip".equalsIgnoreCase(c0946s2.m2346a("Content-Encoding"))) {
                                    obj = null;
                                } else {
                                    obj = Long.valueOf(b3.f18884b);
                                    try {
                                        c5687j = new C5687j(b3.m17073r());
                                        try {
                                            b3 = new C6623c();
                                            b3.m17022a(c5687j);
                                            c5687j.close();
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c5687j2 = c5687j;
                                            if (c5687j2 != null) {
                                                c5687j2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th22) {
                                        th = th22;
                                        if (c5687j2 != null) {
                                            c5687j2.close();
                                        }
                                        throw th;
                                    }
                                }
                                charset2 = f14057b;
                                a5 = adVar.mo957a();
                                if (a5 != null) {
                                    charset2 = a5.m2386a(f14057b);
                                }
                                if (C5039a.m10211a(b3)) {
                                    r1.f14059c.mo1002a("");
                                    c0919b3 = r1.f14059c;
                                    stringBuilder8 = new StringBuilder("<-- END HTTP (binary ");
                                    stringBuilder8.append(b3.f18884b);
                                    stringBuilder8.append("-byte body omitted)");
                                    c0919b3.mo1002a(stringBuilder8.toString());
                                    return a4;
                                }
                                if (b2 != 0) {
                                    r1.f14059c.mo1002a("");
                                    r1.f14059c.mo1002a(b3.m17073r().mo3121a(charset2));
                                }
                                if (obj == null) {
                                    C0919b c0919b6 = r1.f14059c;
                                    stringBuilder6 = new StringBuilder("<-- END HTTP (");
                                    stringBuilder6.append(b3.f18884b);
                                    stringBuilder6.append("-byte, ");
                                    stringBuilder6.append(obj);
                                    stringBuilder6.append("-gzipped-byte body)");
                                    c0919b6.mo1002a(stringBuilder6.toString());
                                    return a4;
                                }
                                c0919b3 = r1.f14059c;
                                stringBuilder8 = new StringBuilder("<-- END HTTP (");
                                stringBuilder8.append(b3.f18884b);
                                stringBuilder8.append("-byte body)");
                                stringBuilder9 = stringBuilder8.toString();
                            } else {
                                c0919b3 = r1.f14059c;
                                stringBuilder9 = "<-- END HTTP (encoded body omitted)";
                            }
                            c0919b3.mo1002a(stringBuilder9);
                        }
                    }
                    c0919b3 = r1.f14059c;
                    stringBuilder9 = "<-- END HTTP";
                    c0919b3.mo1002a(stringBuilder9);
                }
                return a4;
            }
        }
        obj = 1;
        abVar = a.f2804d;
        if (abVar != null) {
            obj2 = null;
        }
        b = c0950a.mo953b();
        stringBuilder = new StringBuilder("--> ");
        stringBuilder.append(a.f2802b);
        stringBuilder.append(' ');
        stringBuilder.append(a.f2801a);
        if (b == null) {
            stringBuilder2 = "";
        } else {
            StringBuilder stringBuilder102 = new StringBuilder(" ");
            stringBuilder102.append(b.mo948a());
            stringBuilder2 = stringBuilder102.toString();
        }
        stringBuilder.append(stringBuilder2);
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(" (");
        stringBuilder.append(abVar.mo1000b());
        stringBuilder.append("-byte body)");
        stringBuilder2 = stringBuilder.toString();
        r1.f14059c.mo1002a(stringBuilder2);
        if (obj != null) {
            if (obj2 != null) {
                if (abVar.mo998a() != null) {
                    c0919b = r1.f14059c;
                    stringBuilder3 = new StringBuilder("Content-Type: ");
                    stringBuilder3.append(abVar.mo998a());
                    c0919b.mo1002a(stringBuilder3.toString());
                }
                if (abVar.mo1000b() != -1) {
                    c0919b = r1.f14059c;
                    stringBuilder3 = new StringBuilder("Content-Length: ");
                    stringBuilder3.append(abVar.mo1000b());
                    c0919b.mo1002a(stringBuilder3.toString());
                }
            }
            c0946s = a.f2803c;
            length = c0946s.f2991a.length / 2;
            for (i2 = 0; i2 < length; i2++) {
                a2 = c0946s.m2345a(i2);
                c0919b2 = r1.f14059c;
                StringBuilder stringBuilder112 = new StringBuilder();
                stringBuilder112.append(a2);
                stringBuilder112.append(": ");
                stringBuilder112.append(c0946s.m2347b(i2));
                c0919b2.mo1002a(stringBuilder112.toString());
            }
            if (obj3 != null) {
                if (obj2 == null) {
                    if (C5039a.m10210a(a.f2803c)) {
                        c6623c = new C6623c();
                        abVar.mo999a(c6623c);
                        charset = f14057b;
                        a3 = abVar.mo998a();
                        if (a3 != null) {
                            charset = a3.m2386a(f14057b);
                        }
                        r1.f14059c.mo1002a("");
                        if (C5039a.m10211a(c6623c)) {
                            c0919b2 = r1.f14059c;
                            stringBuilder4 = new StringBuilder("--> END ");
                            stringBuilder4.append(a.f2802b);
                            stringBuilder4.append(" (binary ");
                            stringBuilder4.append(abVar.mo1000b());
                            str = "-byte body omitted)";
                        } else {
                            r1.f14059c.mo1002a(c6623c.mo3121a(charset));
                            c0919b2 = r1.f14059c;
                            stringBuilder4 = new StringBuilder("--> END ");
                            stringBuilder4.append(a.f2802b);
                            stringBuilder4.append(" (");
                            stringBuilder4.append(abVar.mo1000b());
                            str = "-byte body)";
                        }
                    } else {
                        c0919b2 = r1.f14059c;
                        stringBuilder4 = new StringBuilder("--> END ");
                        stringBuilder4.append(a.f2802b);
                        str = " (encoded body omitted)";
                    }
                    stringBuilder4.append(str);
                    c0919b2.mo1002a(stringBuilder4.toString());
                }
            }
            c0919b2 = r1.f14059c;
            stringBuilder4 = new StringBuilder("--> END ");
            str = a.f2802b;
            stringBuilder4.append(str);
            c0919b2.mo1002a(stringBuilder4.toString());
        }
        nanoTime = System.nanoTime();
        try {
            a4 = c0950a2.mo952a(a);
            nanoTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            adVar = a4.f2825g;
            b2 = adVar.mo958b();
            if (b2 == -1) {
                str = "unknown-length";
            } else {
                StringBuilder stringBuilder122 = new StringBuilder();
                stringBuilder122.append(b2);
                stringBuilder122.append("-byte");
                str = stringBuilder122.toString();
            }
            C0919b c0919b42 = r1.f14059c;
            stringBuilder = new StringBuilder("<-- ");
            stringBuilder.append(a4.f2821c);
            if (a4.f2822d.isEmpty()) {
                stringBuilder3 = new StringBuilder(" ");
                stringBuilder3.append(a4.f2822d);
                stringBuilder5 = stringBuilder3.toString();
            } else {
                stringBuilder5 = "";
            }
            stringBuilder.append(stringBuilder5);
            stringBuilder.append(' ');
            stringBuilder.append(a4.f2819a.f2801a);
            stringBuilder.append(" (");
            stringBuilder.append(nanoTime);
            stringBuilder.append("ms");
            if (obj != null) {
                stringBuilder7 = "";
            } else {
                stringBuilder6 = new StringBuilder(", ");
                stringBuilder6.append(str);
                stringBuilder6.append(" body");
                stringBuilder7 = stringBuilder6.toString();
            }
            stringBuilder.append(stringBuilder7);
            stringBuilder.append(')');
            c0919b42.mo1002a(stringBuilder.toString());
            if (obj != null) {
                c0946s2 = a4.f2824f;
                length2 = c0946s2.f2991a.length / 2;
                for (i3 = 0; i3 < length2; i3++) {
                    C0919b c0919b52 = r1.f14059c;
                    StringBuilder stringBuilder132 = new StringBuilder();
                    stringBuilder132.append(c0946s2.m2345a(i3));
                    stringBuilder132.append(": ");
                    stringBuilder132.append(c0946s2.m2347b(i3));
                    c0919b52.mo1002a(stringBuilder132.toString());
                }
                if (obj3 != null) {
                    if (!C0880e.m2079b(a4)) {
                        if (C5039a.m10210a(a4.f2824f)) {
                            C5683e d2 = adVar.mo959d();
                            d2.mo3126b(Long.MAX_VALUE);
                            b3 = d2.mo3124b();
                            C5687j c5687j22 = null;
                            if ("gzip".equalsIgnoreCase(c0946s2.m2346a("Content-Encoding"))) {
                                obj = null;
                            } else {
                                obj = Long.valueOf(b3.f18884b);
                                c5687j = new C5687j(b3.m17073r());
                                b3 = new C6623c();
                                b3.m17022a(c5687j);
                                c5687j.close();
                            }
                            charset2 = f14057b;
                            a5 = adVar.mo957a();
                            if (a5 != null) {
                                charset2 = a5.m2386a(f14057b);
                            }
                            if (C5039a.m10211a(b3)) {
                                if (b2 != 0) {
                                    r1.f14059c.mo1002a("");
                                    r1.f14059c.mo1002a(b3.m17073r().mo3121a(charset2));
                                }
                                if (obj == null) {
                                    c0919b3 = r1.f14059c;
                                    stringBuilder8 = new StringBuilder("<-- END HTTP (");
                                    stringBuilder8.append(b3.f18884b);
                                    stringBuilder8.append("-byte body)");
                                    stringBuilder9 = stringBuilder8.toString();
                                } else {
                                    C0919b c0919b62 = r1.f14059c;
                                    stringBuilder6 = new StringBuilder("<-- END HTTP (");
                                    stringBuilder6.append(b3.f18884b);
                                    stringBuilder6.append("-byte, ");
                                    stringBuilder6.append(obj);
                                    stringBuilder6.append("-gzipped-byte body)");
                                    c0919b62.mo1002a(stringBuilder6.toString());
                                    return a4;
                                }
                            }
                            r1.f14059c.mo1002a("");
                            c0919b3 = r1.f14059c;
                            stringBuilder8 = new StringBuilder("<-- END HTTP (binary ");
                            stringBuilder8.append(b3.f18884b);
                            stringBuilder8.append("-byte body omitted)");
                            c0919b3.mo1002a(stringBuilder8.toString());
                            return a4;
                        }
                        c0919b3 = r1.f14059c;
                        stringBuilder9 = "<-- END HTTP (encoded body omitted)";
                        c0919b3.mo1002a(stringBuilder9);
                    }
                }
                c0919b3 = r1.f14059c;
                stringBuilder9 = "<-- END HTTP";
                c0919b3.mo1002a(stringBuilder9);
            }
            return a4;
        } catch (Exception e) {
            C0919b c0919b7 = r1.f14059c;
            StringBuilder stringBuilder14 = new StringBuilder("<-- HTTP FAILED: ");
            stringBuilder14.append(e);
            c0919b7.mo1002a(stringBuilder14.toString());
            throw e;
        }
    }
}
