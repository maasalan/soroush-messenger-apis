package p050b.p054b;

import org.jivesoftware.smackx.carbons.packet.CarbonExtension.Private;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C4978h implements C0844q {
    private static final int[] f13846j = new int[]{350, 0, 0, 0, 351, 352, 0, 0, 0, 353, 354, 0, 355, 0, 356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 357, 358, 359, 0};
    private static final C0839g f13847k;
    C0843p f13848a = new C0843p();
    String f13849b;
    int f13850c;
    int f13851d;
    private int f13852e = -1;
    private StringBuffer f13853f = new StringBuffer();
    private C0843p f13854g = null;
    private int f13855h;

    static {
        C0839g c0839g = new C0839g();
        f13847k = c0839g;
        c0839g.m1950a("abstract", IjkMediaCodecInfo.RANK_SECURE);
        f13847k.m1950a("boolean", 301);
        f13847k.m1950a("break", 302);
        f13847k.m1950a("byte", 303);
        f13847k.m1950a("case", 304);
        f13847k.m1950a("catch", 305);
        f13847k.m1950a("char", 306);
        f13847k.m1950a("class", 307);
        f13847k.m1950a("const", 308);
        f13847k.m1950a("continue", 309);
        f13847k.m1950a("default", 310);
        f13847k.m1950a("do", 311);
        f13847k.m1950a("double", 312);
        f13847k.m1950a("else", 313);
        f13847k.m1950a("extends", 314);
        f13847k.m1950a("false", 411);
        f13847k.m1950a("final", 315);
        f13847k.m1950a("finally", 316);
        f13847k.m1950a("float", 317);
        f13847k.m1950a("for", 318);
        f13847k.m1950a("goto", 319);
        f13847k.m1950a("if", 320);
        f13847k.m1950a("implements", 321);
        f13847k.m1950a("import", 322);
        f13847k.m1950a("instanceof", 323);
        f13847k.m1950a("int", 324);
        f13847k.m1950a("interface", 325);
        f13847k.m1950a("long", 326);
        f13847k.m1950a("native", 327);
        f13847k.m1950a("new", 328);
        f13847k.m1950a("null", 412);
        f13847k.m1950a("package", 329);
        f13847k.m1950a(Private.ELEMENT, 330);
        f13847k.m1950a("protected", 331);
        f13847k.m1950a("public", 332);
        f13847k.m1950a("return", 333);
        f13847k.m1950a("short", 334);
        f13847k.m1950a("static", 335);
        f13847k.m1950a("strictfp", 347);
        f13847k.m1950a("super", 336);
        f13847k.m1950a("switch", 337);
        f13847k.m1950a("synchronized", 338);
        f13847k.m1950a("this", 339);
        f13847k.m1950a("throw", 340);
        f13847k.m1950a("throws", 341);
        f13847k.m1950a("transient", 342);
        f13847k.m1950a("true", 410);
        f13847k.m1950a("try", 343);
        f13847k.m1950a("void", 344);
        f13847k.m1950a("volatile", 345);
        f13847k.m1950a("while", 346);
    }

    public C4978h(String str) {
        this.f13849b = str;
        this.f13850c = 0;
        this.f13851d = str.length();
        this.f13855h = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m9914a(p050b.p054b.C0843p r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
    L_0x0004:
        r2 = r17.m9919d();
        r3 = -1;
        r4 = 47;
        r5 = 10;
        if (r2 != r4) goto L_0x003d;
    L_0x000f:
        r2 = r17.m9919d();
        if (r2 != r4) goto L_0x0022;
    L_0x0015:
        r2 = r17.m9919d();
        if (r2 == r5) goto L_0x003d;
    L_0x001b:
        r4 = 13;
        if (r2 == r4) goto L_0x003d;
    L_0x001f:
        if (r2 != r3) goto L_0x0015;
    L_0x0021:
        goto L_0x003d;
    L_0x0022:
        r6 = 42;
        if (r2 != r6) goto L_0x003a;
    L_0x0026:
        r2 = r17.m9919d();
        if (r2 == r3) goto L_0x003d;
    L_0x002c:
        if (r2 != r6) goto L_0x0026;
    L_0x002e:
        r2 = r17.m9919d();
        if (r2 != r4) goto L_0x0037;
    L_0x0034:
        r2 = 32;
        goto L_0x003d;
    L_0x0037:
        r0.f13852e = r2;
        goto L_0x0026;
    L_0x003a:
        r0.f13852e = r2;
        r2 = r4;
    L_0x003d:
        r4 = p050b.p054b.C4978h.m9918c(r2);
        if (r4 != 0) goto L_0x0004;
    L_0x0043:
        r4 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        r6 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        if (r2 >= 0) goto L_0x004b;
    L_0x0049:
        goto L_0x01f4;
    L_0x004b:
        if (r2 != r5) goto L_0x0056;
    L_0x004d:
        r2 = r0.f13855h;
        r2 = r2 + 1;
        r0.f13855h = r2;
        r2 = r5;
        goto L_0x01f4;
    L_0x0056:
        r7 = 39;
        r8 = 0;
        if (r2 != r7) goto L_0x0080;
    L_0x005b:
        r2 = r17.m9919d();
        r3 = 39;
        if (r2 == r3) goto L_0x0079;
    L_0x0063:
        r3 = 92;
        if (r2 != r3) goto L_0x006c;
    L_0x0067:
        r8 = r17.m9917c();
        goto L_0x005b;
    L_0x006c:
        r3 = 32;
        if (r2 >= r3) goto L_0x0077;
    L_0x0070:
        if (r2 != r5) goto L_0x0073;
    L_0x0072:
        goto L_0x00a2;
    L_0x0073:
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        goto L_0x01f4;
    L_0x0077:
        r8 = r2;
        goto L_0x005b;
    L_0x0079:
        r2 = (long) r8;
        r1.f2513c = r2;
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        goto L_0x01f4;
    L_0x0080:
        r7 = 34;
        if (r2 != r7) goto L_0x00ca;
    L_0x0084:
        r9 = r0.f13853f;
        r9.setLength(r8);
    L_0x0089:
        r2 = r17.m9919d();
        if (r2 == r7) goto L_0x00a9;
    L_0x008f:
        r3 = 92;
        if (r2 != r3) goto L_0x0098;
    L_0x0093:
        r2 = r17.m9917c();
        goto L_0x009d;
    L_0x0098:
        if (r2 == r5) goto L_0x00a2;
    L_0x009a:
        if (r2 >= 0) goto L_0x009d;
    L_0x009c:
        goto L_0x00a2;
    L_0x009d:
        r2 = (char) r2;
        r9.append(r2);
        goto L_0x0089;
    L_0x00a2:
        r2 = r0.f13855h;
        r2 = r2 + 1;
        r0.f13855h = r2;
        goto L_0x0073;
    L_0x00a9:
        r2 = r17.m9919d();
        if (r2 != r5) goto L_0x00b6;
    L_0x00af:
        r2 = r0.f13855h;
        r2 = r2 + 1;
        r0.f13855h = r2;
        goto L_0x00a9;
    L_0x00b6:
        r3 = p050b.p054b.C4978h.m9918c(r2);
        if (r3 != 0) goto L_0x00a9;
    L_0x00bc:
        if (r2 == r7) goto L_0x0089;
    L_0x00be:
        r0.f13852e = r2;
        r2 = r9.toString();
        r1.f2515e = r2;
        r2 = 406; // 0x196 float:5.69E-43 double:2.006E-321;
        goto L_0x01f4;
    L_0x00ca:
        r7 = 46;
        r9 = 57;
        r10 = 48;
        if (r10 > r2) goto L_0x0199;
    L_0x00d2:
        if (r2 > r9) goto L_0x0199;
    L_0x00d4:
        r11 = 0;
        r3 = r17.m9919d();
        r13 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r14 = 76;
        if (r2 != r10) goto L_0x014a;
    L_0x00e0:
        r15 = 88;
        if (r3 == r15) goto L_0x0110;
    L_0x00e4:
        r15 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        if (r3 != r15) goto L_0x00e9;
    L_0x00e8:
        goto L_0x0110;
    L_0x00e9:
        if (r10 > r3) goto L_0x014a;
    L_0x00eb:
        r11 = 55;
        if (r3 > r11) goto L_0x014a;
    L_0x00ef:
        r3 = r3 + -48;
        r2 = (long) r3;
    L_0x00f2:
        r7 = r17.m9919d();
        if (r10 > r7) goto L_0x0106;
    L_0x00f8:
        r8 = 55;
        if (r7 > r8) goto L_0x0106;
    L_0x00fc:
        r8 = 8;
        r2 = r2 * r8;
        r7 = r7 + -48;
        r7 = (long) r7;
        r11 = r2 + r7;
        r2 = r11;
        goto L_0x00f2;
    L_0x0106:
        r1.f2513c = r2;
        if (r7 == r14) goto L_0x0147;
    L_0x010a:
        if (r7 != r13) goto L_0x010d;
    L_0x010c:
        goto L_0x0147;
    L_0x010d:
        r0.f13852e = r7;
        goto L_0x0144;
    L_0x0110:
        r2 = r17.m9919d();
        r7 = 16;
        if (r10 > r2) goto L_0x0122;
    L_0x0118:
        if (r2 > r9) goto L_0x0122;
    L_0x011a:
        r11 = r11 * r7;
        r2 = r2 + -48;
    L_0x011d:
        r2 = (long) r2;
        r7 = r11 + r2;
        r11 = r7;
        goto L_0x0110;
    L_0x0122:
        r3 = 65;
        if (r3 > r2) goto L_0x012f;
    L_0x0126:
        r3 = 70;
        if (r2 > r3) goto L_0x012f;
    L_0x012a:
        r11 = r11 * r7;
        r2 = r2 + -65;
    L_0x012d:
        r2 = r2 + r5;
        goto L_0x011d;
    L_0x012f:
        r3 = 97;
        if (r3 > r2) goto L_0x013b;
    L_0x0133:
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r2 > r3) goto L_0x013b;
    L_0x0137:
        r11 = r11 * r7;
        r2 = r2 + -97;
        goto L_0x012d;
    L_0x013b:
        r1.f2513c = r11;
        if (r2 == r14) goto L_0x0147;
    L_0x013f:
        if (r2 != r13) goto L_0x0142;
    L_0x0141:
        goto L_0x0147;
    L_0x0142:
        r0.f13852e = r2;
    L_0x0144:
        r2 = r6;
        goto L_0x01f4;
    L_0x0147:
        r2 = r4;
        goto L_0x01f4;
    L_0x014a:
        r2 = r2 + -48;
        r11 = (long) r2;
    L_0x014d:
        if (r10 > r3) goto L_0x0160;
    L_0x014f:
        if (r3 > r9) goto L_0x0160;
    L_0x0151:
        r15 = 10;
        r11 = r11 * r15;
        r2 = (long) r3;
        r15 = r11 + r2;
        r2 = 48;
        r11 = r15 - r2;
        r3 = r17.m9919d();
        goto L_0x014d;
    L_0x0160:
        r1.f2513c = r11;
        r2 = 70;
        if (r3 == r2) goto L_0x0193;
    L_0x0166:
        r2 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r3 != r2) goto L_0x016b;
    L_0x016a:
        goto L_0x0193;
    L_0x016b:
        r2 = 69;
        if (r3 == r2) goto L_0x0186;
    L_0x016f:
        r2 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r3 == r2) goto L_0x0186;
    L_0x0173:
        r2 = 68;
        if (r3 == r2) goto L_0x0186;
    L_0x0177:
        r2 = 100;
        if (r3 == r2) goto L_0x0186;
    L_0x017b:
        if (r3 != r7) goto L_0x017e;
    L_0x017d:
        goto L_0x0186;
    L_0x017e:
        if (r3 == r14) goto L_0x0147;
    L_0x0180:
        if (r3 != r13) goto L_0x0183;
    L_0x0182:
        goto L_0x0147;
    L_0x0183:
        r0.f13852e = r3;
        goto L_0x0144;
    L_0x0186:
        r2 = r0.f13853f;
        r2.setLength(r8);
        r2.append(r11);
        r2 = r0.m9915a(r2, r3, r1);
        goto L_0x01f4;
    L_0x0193:
        r2 = (double) r11;
        r1.f2514d = r2;
        r2 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        goto L_0x01f4;
    L_0x0199:
        if (r2 != r7) goto L_0x01b7;
    L_0x019b:
        r2 = r17.m9919d();
        if (r10 > r2) goto L_0x01b0;
    L_0x01a1:
        if (r2 > r9) goto L_0x01b0;
    L_0x01a3:
        r3 = r0.f13853f;
        r3.setLength(r8);
        r3.append(r7);
        r2 = r0.m9915a(r3, r2, r1);
        goto L_0x01f4;
    L_0x01b0:
        r0.f13852e = r2;
        r2 = r0.m9916b(r7);
        goto L_0x01f4;
    L_0x01b7:
        r4 = (char) r2;
        r4 = java.lang.Character.isJavaIdentifierStart(r4);
        if (r4 == 0) goto L_0x01f0;
    L_0x01be:
        r4 = r0.f13853f;
        r4.setLength(r8);
    L_0x01c3:
        r2 = (char) r2;
        r4.append(r2);
        r2 = r17.m9919d();
        r6 = (char) r2;
        r6 = java.lang.Character.isJavaIdentifierPart(r6);
        if (r6 != 0) goto L_0x01c3;
    L_0x01d2:
        r0.f13852e = r2;
        r2 = r4.toString();
        r4 = f13847k;
        r4 = r4.get(r2);
        if (r4 != 0) goto L_0x01e1;
    L_0x01e0:
        goto L_0x01e7;
    L_0x01e1:
        r4 = (java.lang.Integer) r4;
        r3 = r4.intValue();
    L_0x01e7:
        if (r3 < 0) goto L_0x01eb;
    L_0x01e9:
        r2 = r3;
        goto L_0x01f4;
    L_0x01eb:
        r1.f2515e = r2;
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        goto L_0x01f4;
    L_0x01f0:
        r2 = r0.m9916b(r2);
    L_0x01f4:
        if (r2 == r5) goto L_0x0004;
    L_0x01f6:
        r1.f2512b = r2;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.h.a(b.b.p):int");
    }

    private int m9915a(java.lang.StringBuffer r7, int r8, p050b.p054b.C0843p r9) {
        /* JADX: method processing error */
/*
Error: java.lang.OutOfMemoryError: Java heap space
	at java.util.Arrays.copyOf(Arrays.java:3181)
	at java.util.ArrayList.grow(ArrayList.java:261)
	at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235)
	at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227)
	at java.util.ArrayList.add(ArrayList.java:458)
	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:146)
	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:643)
	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:127)
	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:643)
	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:127)
	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
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
        r6 = this;
        r0 = 57;
        r1 = 48;
        r2 = 100;
        r3 = 68;
        r4 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r5 = 69;
        if (r8 == r5) goto L_0x0021;
    L_0x000e:
        if (r8 == r4) goto L_0x0021;
    L_0x0010:
        if (r8 == r3) goto L_0x0021;
    L_0x0012:
        if (r8 == r2) goto L_0x0021;
    L_0x0014:
        r8 = (char) r8;
        r7.append(r8);
        r8 = r6.m9919d();
        if (r1 > r8) goto L_0x0021;
    L_0x001e:
        if (r8 > r0) goto L_0x0021;
    L_0x0020:
        goto L_0x0014;
    L_0x0021:
        if (r8 == r5) goto L_0x0025;
    L_0x0023:
        if (r8 != r4) goto L_0x0042;
    L_0x0025:
        r8 = (char) r8;
        r7.append(r8);
        r8 = r6.m9919d();
        r4 = 43;
        if (r8 == r4) goto L_0x0035;
    L_0x0031:
        r4 = 45;
        if (r8 != r4) goto L_0x003d;
    L_0x0035:
        r8 = (char) r8;
        r7.append(r8);
        r8 = r6.m9919d();
    L_0x003d:
        if (r1 > r8) goto L_0x0042;
    L_0x003f:
        if (r8 > r0) goto L_0x0042;
    L_0x0041:
        goto L_0x0035;
    L_0x0042:
        r7 = r7.toString();	 Catch:{ NumberFormatException -> 0x0061 }
        r0 = java.lang.Double.parseDouble(r7);	 Catch:{ NumberFormatException -> 0x0061 }
        r9.f2514d = r0;	 Catch:{ NumberFormatException -> 0x0061 }
        r7 = 70;
        if (r8 == r7) goto L_0x005e;
    L_0x0050:
        r7 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r8 != r7) goto L_0x0055;
    L_0x0054:
        goto L_0x005e;
    L_0x0055:
        if (r8 == r3) goto L_0x005b;
    L_0x0057:
        if (r8 == r2) goto L_0x005b;
    L_0x0059:
        r6.f13852e = r8;
    L_0x005b:
        r7 = 405; // 0x195 float:5.68E-43 double:2.0E-321;
        return r7;
    L_0x005e:
        r7 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        return r7;
    L_0x0061:
        r7 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.h.a(java.lang.StringBuffer, int, b.b.p):int");
    }

    private int m9916b(int i) {
        int d;
        if (33 <= i && i <= 63) {
            int i2 = f13846j[i - 33];
            if (i2 == 0) {
                return i;
            }
            d = m9919d();
            if (i == d) {
                if (i == 38) {
                    return 369;
                }
                if (i == 43) {
                    return 362;
                }
                if (i != 45) {
                    switch (i) {
                        case 60:
                            i = m9919d();
                            if (i == 61) {
                                return 365;
                            }
                            this.f13852e = i;
                            return 364;
                        case 61:
                            return 358;
                        case 62:
                            i = m9919d();
                            if (i == 61) {
                                return 367;
                            }
                            if (i == 62) {
                                i = m9919d();
                                if (i == 61) {
                                    return 371;
                                }
                                this.f13852e = i;
                                return 370;
                            }
                            this.f13852e = i;
                            return 366;
                        default:
                            break;
                    }
                }
                return 363;
            } else if (d == 61) {
                return i2;
            }
        } else if (i == 94) {
            d = m9919d();
            if (d == 61) {
                return 360;
            }
        } else {
            if (i == 124) {
                d = m9919d();
                if (d == 61) {
                    return 361;
                }
                if (d == 124) {
                    return 368;
                }
            }
            return i;
        }
        this.f13852e = d;
        return i;
    }

    private int m9917c() {
        int d = m9919d();
        if (d == 110) {
            return 10;
        }
        if (d == 116) {
            return 9;
        }
        if (d == 114) {
            return 13;
        }
        if (d == 102) {
            return 12;
        }
        if (d == 10) {
            this.f13855h++;
        }
        return d;
    }

    private static boolean m9918c(int i) {
        if (!(i == 32 || i == 9 || i == 12 || i == 13)) {
            if (i != 10) {
                return false;
            }
        }
        return true;
    }

    private int m9919d() {
        if (this.f13852e >= 0) {
            int i = this.f13852e;
            this.f13852e = -1;
            return i;
        } else if (this.f13850c >= this.f13851d) {
            return -1;
        } else {
            String str = this.f13849b;
            int i2 = this.f13850c;
            this.f13850c = i2 + 1;
            return str.charAt(i2);
        }
    }

    public final int m9920a() {
        if (this.f13854g == null) {
            return m9914a(this.f13848a);
        }
        C0843p c0843p = this.f13854g;
        this.f13848a = c0843p;
        this.f13854g = this.f13854g.f2511a;
        return c0843p.f2512b;
    }

    public final int m9921a(int i) {
        C0843p c0843p = this.f13854g;
        if (c0843p == null) {
            c0843p = this.f13848a;
            this.f13854g = c0843p;
            c0843p.f2511a = null;
            m9914a(c0843p);
        }
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                if (c0843p.f2511a == null) {
                    C0843p c0843p2 = new C0843p();
                    c0843p.f2511a = c0843p2;
                    m9914a(c0843p2);
                }
                c0843p = c0843p.f2511a;
                i = i2;
            } else {
                this.f13848a = c0843p;
                return c0843p.f2512b;
            }
        }
    }

    public final int m9922b() {
        return m9921a(0);
    }
}
