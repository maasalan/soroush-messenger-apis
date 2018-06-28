package p056c.p057a.p061e;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p056c.p057a.p061e.C0891d.C0889a;
import p206d.C2272f;
import p206d.C2278s;
import p206d.C2279t;
import p206d.C5683e;
import p206d.C6623c;

final class C0897h implements Closeable {
    static final Logger f2728a = Logger.getLogger(C0892e.class.getName());
    final C5683e f2729b;
    final boolean f2730c;
    final C0889a f2731d = new C0889a(this.f2732e);
    private final C5021a f2732e = new C5021a(this.f2729b);

    interface C0896b {
        void mo972a(int i, long j);

        void mo973a(int i, C0887b c0887b);

        void mo974a(int i, C2272f c2272f);

        void mo975a(int i, List<C0888c> list);

        void mo976a(C0903m c0903m);

        void mo977a(boolean z, int i, int i2);

        void mo978a(boolean z, int i, C5683e c5683e, int i2);

        void mo979a(boolean z, int i, List<C0888c> list);
    }

    static final class C5021a implements C2278s {
        int f14011a;
        byte f14012b;
        int f14013c;
        int f14014d;
        short f14015e;
        private final C5683e f14016f;

        C5021a(C5683e c5683e) {
            this.f14016f = c5683e;
        }

        public final long mo944a(C6623c c6623c, long j) {
            while (this.f14014d == 0) {
                this.f14016f.mo3142h((long) this.f14015e);
                this.f14015e = (short) 0;
                if ((this.f14012b & 4) != 0) {
                    return -1;
                }
                int i = this.f14013c;
                int a = C0897h.m2163a(this.f14016f);
                this.f14014d = a;
                this.f14011a = a;
                byte f = (byte) (this.f14016f.mo3135f() & 255);
                this.f14012b = (byte) (this.f14016f.mo3135f() & 255);
                if (C0897h.f2728a.isLoggable(Level.FINE)) {
                    C0897h.f2728a.fine(C0892e.m2133a(true, this.f14013c, this.f14011a, f, this.f14012b));
                }
                this.f14013c = this.f14016f.mo3140h() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                if (f != (byte) 9) {
                    throw C0892e.m2134b("%s != TYPE_CONTINUATION", Byte.valueOf(f));
                } else if (this.f14013c != i) {
                    throw C0892e.m2134b("TYPE_CONTINUATION streamId changed", new Object[0]);
                }
            }
            long a2 = this.f14016f.mo944a(c6623c, Math.min(j, (long) this.f14014d));
            if (a2 == -1) {
                return -1;
            }
            this.f14014d = (int) (((long) this.f14014d) - a2);
            return a2;
        }

        public final C2279t mo945a() {
            return this.f14016f.mo945a();
        }

        public final void close() {
        }
    }

    C0897h(C5683e c5683e, boolean z) {
        this.f2729b = c5683e;
        this.f2730c = z;
    }

    private static int m2162a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            short s2 = i - 1;
        }
        if (s <= s2) {
            return (short) (s2 - s);
        }
        throw C0892e.m2134b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(s2));
    }

    static int m2163a(C5683e c5683e) {
        return (c5683e.mo3135f() & 255) | (((c5683e.mo3135f() & 255) << 16) | ((c5683e.mo3135f() & 255) << 8));
    }

    private List<C0888c> m2164a(int i, short s, byte b, int i2) {
        C5021a c5021a = this.f2732e;
        this.f2732e.f14014d = i;
        c5021a.f14011a = i;
        this.f2732e.f14015e = s;
        this.f2732e.f14012b = b;
        this.f2732e.f14013c = i2;
        C0889a c0889a = this.f2731d;
        while (!c0889a.f2674b.mo3131c()) {
            int f = c0889a.f2674b.mo3135f() & 255;
            if (f == 128) {
                throw new IOException("index == 0");
            } else if ((f & 128) == 128) {
                f = c0889a.m2119a(f, 127) - 1;
                if (C0889a.m2115c(f)) {
                    c0889a.f2673a.add(C0891d.f2691a[f]);
                } else {
                    int a = c0889a.m2118a(f - C0891d.f2691a.length);
                    if (a >= 0) {
                        if (a < c0889a.f2677e.length) {
                            c0889a.f2673a.add(c0889a.f2677e[a]);
                        }
                    }
                    r5 = new StringBuilder("Header index too large ");
                    r5.append(f + 1);
                    throw new IOException(r5.toString());
                }
            } else {
                C0888c c0888c;
                if (f == 64) {
                    c0888c = new C0888c(C0891d.m2131a(c0889a.m2122b()), c0889a.m2122b());
                } else if ((f & 64) == 64) {
                    c0888c = new C0888c(c0889a.m2123b(c0889a.m2119a(f, 63) - 1), c0889a.m2122b());
                } else if ((f & 32) == 32) {
                    c0889a.f2676d = c0889a.m2119a(f, 31);
                    if (c0889a.f2676d >= 0) {
                        if (c0889a.f2676d <= c0889a.f2675c) {
                            c0889a.m2120a();
                        }
                    }
                    r5 = new StringBuilder("Invalid dynamic table size update ");
                    r5.append(c0889a.f2676d);
                    throw new IOException(r5.toString());
                } else {
                    C2272f b2;
                    C2272f b3;
                    List list;
                    Object c0888c2;
                    if (f != 16) {
                        if (f != 0) {
                            b2 = c0889a.m2123b(c0889a.m2119a(f, 15) - 1);
                            b3 = c0889a.m2122b();
                            list = c0889a.f2673a;
                            c0888c2 = new C0888c(b2, b3);
                            list.add(c0888c2);
                        }
                    }
                    b2 = C0891d.m2131a(c0889a.m2122b());
                    b3 = c0889a.m2122b();
                    list = c0889a.f2673a;
                    c0888c2 = new C0888c(b2, b3);
                    list.add(c0888c2);
                }
                c0889a.m2121a(c0888c);
            }
        }
        c0889a = this.f2731d;
        List arrayList = new ArrayList(c0889a.f2673a);
        c0889a.f2673a.clear();
        return arrayList;
    }

    private void m2165a() {
        this.f2729b.mo3140h();
        this.f2729b.mo3135f();
    }

    public final boolean m2166a(boolean r12, p056c.p057a.p061e.C0897h.C0896b r13) {
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
        r11 = this;
        r0 = 0;
        r1 = r11.f2729b;	 Catch:{ IOException -> 0x02a8 }
        r2 = 9;	 Catch:{ IOException -> 0x02a8 }
        r1.mo3122a(r2);	 Catch:{ IOException -> 0x02a8 }
        r1 = r11.f2729b;
        r1 = p056c.p057a.p061e.C0897h.m2163a(r1);
        r2 = 1;
        if (r1 < 0) goto L_0x0299;
    L_0x0011:
        r3 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r1 <= r3) goto L_0x0017;
    L_0x0015:
        goto L_0x0299;
    L_0x0017:
        r4 = r11.f2729b;
        r4 = r4.mo3135f();
        r4 = r4 & 255;
        r4 = (byte) r4;
        r5 = 4;
        if (r12 == 0) goto L_0x0034;
    L_0x0023:
        if (r4 == r5) goto L_0x0034;
    L_0x0025:
        r12 = "Expected a SETTINGS frame but was %s";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Byte.valueOf(r4);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0034:
        r12 = r11.f2729b;
        r12 = r12.mo3135f();
        r12 = r12 & 255;
        r12 = (byte) r12;
        r6 = r11.f2729b;
        r6 = r6.mo3140h();
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r6 = r6 & r7;
        r8 = f2728a;
        r9 = java.util.logging.Level.FINE;
        r8 = r8.isLoggable(r9);
        if (r8 == 0) goto L_0x005a;
    L_0x0051:
        r8 = f2728a;
        r9 = p056c.p057a.p061e.C0892e.m2133a(r2, r6, r1, r4, r12);
        r8.fine(r9);
    L_0x005a:
        r8 = 8;
        switch(r4) {
            case 0: goto L_0x0259;
            case 1: goto L_0x0225;
            case 2: goto L_0x0204;
            case 3: goto L_0x01c9;
            case 4: goto L_0x0146;
            case 5: goto L_0x0119;
            case 6: goto L_0x00e9;
            case 7: goto L_0x009c;
            case 8: goto L_0x0066;
            default: goto L_0x005f;
        };
    L_0x005f:
        r12 = r11.f2729b;
        r0 = (long) r1;
    L_0x0062:
        r12.mo3142h(r0);
        return r2;
    L_0x0066:
        if (r1 == r5) goto L_0x0077;
    L_0x0068:
        r12 = "TYPE_WINDOW_UPDATE length !=4: %s";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Integer.valueOf(r1);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0077:
        r12 = r11.f2729b;
        r12 = r12.mo3140h();
        r3 = (long) r12;
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r9 = r3 & r7;
        r3 = 0;
        r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
        if (r12 != 0) goto L_0x0098;
    L_0x0089:
        r12 = "windowSizeIncrement was 0";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Long.valueOf(r9);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0098:
        r13.mo972a(r6, r9);
        return r2;
    L_0x009c:
        if (r1 >= r8) goto L_0x00ad;
    L_0x009e:
        r12 = "TYPE_GOAWAY length < 8: %s";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Integer.valueOf(r1);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x00ad:
        if (r6 == 0) goto L_0x00b8;
    L_0x00af:
        r12 = "TYPE_GOAWAY streamId != 0";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x00b8:
        r12 = r11.f2729b;
        r12 = r12.mo3140h();
        r3 = r11.f2729b;
        r3 = r3.mo3140h();
        r1 = r1 - r8;
        r4 = p056c.p057a.p061e.C0887b.m2113a(r3);
        if (r4 != 0) goto L_0x00da;
    L_0x00cb:
        r12 = "TYPE_GOAWAY unexpected error code: %d";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Integer.valueOf(r3);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x00da:
        r0 = p206d.C2272f.f7557b;
        if (r1 <= 0) goto L_0x00e5;
    L_0x00de:
        r0 = r11.f2729b;
        r3 = (long) r1;
        r0 = r0.mo3132d(r3);
    L_0x00e5:
        r13.mo974a(r12, r0);
        return r2;
    L_0x00e9:
        if (r1 == r8) goto L_0x00fa;
    L_0x00eb:
        r12 = "TYPE_PING length != 8: %s";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Integer.valueOf(r1);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x00fa:
        if (r6 == 0) goto L_0x0105;
    L_0x00fc:
        r12 = "TYPE_PING streamId != 0";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0105:
        r1 = r11.f2729b;
        r1 = r1.mo3140h();
        r3 = r11.f2729b;
        r3 = r3.mo3140h();
        r12 = r12 & r2;
        if (r12 == 0) goto L_0x0115;
    L_0x0114:
        r0 = r2;
    L_0x0115:
        r13.mo977a(r0, r1, r3);
        return r2;
    L_0x0119:
        if (r6 != 0) goto L_0x0124;
    L_0x011b:
        r12 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0124:
        r3 = r12 & 8;
        if (r3 == 0) goto L_0x0131;
    L_0x0128:
        r0 = r11.f2729b;
        r0 = r0.mo3135f();
        r0 = r0 & 255;
        r0 = (short) r0;
    L_0x0131:
        r3 = r11.f2729b;
        r3 = r3.mo3140h();
        r3 = r3 & r7;
        r1 = r1 + -4;
        r1 = p056c.p057a.p061e.C0897h.m2162a(r1, r12, r0);
        r12 = r11.m2164a(r1, r0, r12, r6);
        r13.mo975a(r3, r12);
        return r2;
    L_0x0146:
        if (r6 == 0) goto L_0x0151;
    L_0x0148:
        r12 = "TYPE_SETTINGS streamId != 0";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0151:
        r12 = r12 & r2;
        if (r12 == 0) goto L_0x015f;
    L_0x0154:
        if (r1 == 0) goto L_0x0298;
    L_0x0156:
        r12 = "FRAME_SIZE_ERROR ack frame should be empty!";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x015f:
        r12 = r1 % 6;
        if (r12 == 0) goto L_0x0172;
    L_0x0163:
        r12 = "TYPE_SETTINGS length %% 6 != 0: %s";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Integer.valueOf(r1);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0172:
        r12 = new c.a.e.m;
        r12.<init>();
        r4 = r0;
    L_0x0178:
        if (r4 >= r1) goto L_0x01c5;
    L_0x017a:
        r6 = r11.f2729b;
        r6 = r6.mo3138g();
        r7 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r6 = r6 & r7;
        r7 = r11.f2729b;
        r7 = r7.mo3140h();
        switch(r6) {
            case 1: goto L_0x01bf;
            case 2: goto L_0x01b2;
            case 3: goto L_0x01b0;
            case 4: goto L_0x01a4;
            case 5: goto L_0x018e;
            default: goto L_0x018d;
        };
    L_0x018d:
        goto L_0x01bf;
    L_0x018e:
        if (r7 < r3) goto L_0x0195;
    L_0x0190:
        r8 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        if (r7 <= r8) goto L_0x01bf;
    L_0x0195:
        r12 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Integer.valueOf(r7);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x01a4:
        r6 = 7;
        if (r7 >= 0) goto L_0x01bf;
    L_0x01a7:
        r12 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x01b0:
        r6 = r5;
        goto L_0x01bf;
    L_0x01b2:
        if (r7 == 0) goto L_0x01bf;
    L_0x01b4:
        if (r7 == r2) goto L_0x01bf;
    L_0x01b6:
        r12 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x01bf:
        r12.m2201a(r6, r7);
        r4 = r4 + 6;
        goto L_0x0178;
    L_0x01c5:
        r13.mo976a(r12);
        return r2;
    L_0x01c9:
        if (r1 == r5) goto L_0x01da;
    L_0x01cb:
        r12 = "TYPE_RST_STREAM length: %d != 4";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Integer.valueOf(r1);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x01da:
        if (r6 != 0) goto L_0x01e5;
    L_0x01dc:
        r12 = "TYPE_RST_STREAM streamId == 0";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x01e5:
        r12 = r11.f2729b;
        r12 = r12.mo3140h();
        r1 = p056c.p057a.p061e.C0887b.m2113a(r12);
        if (r1 != 0) goto L_0x0200;
    L_0x01f1:
        r13 = "TYPE_RST_STREAM unexpected error code: %d";
        r1 = new java.lang.Object[r2];
        r12 = java.lang.Integer.valueOf(r12);
        r1[r0] = r12;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r13, r1);
        throw r12;
    L_0x0200:
        r13.mo973a(r6, r1);
        return r2;
    L_0x0204:
        r12 = 5;
        if (r1 == r12) goto L_0x0216;
    L_0x0207:
        r12 = "TYPE_PRIORITY length: %d != 5";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Integer.valueOf(r1);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0216:
        if (r6 != 0) goto L_0x0221;
    L_0x0218:
        r12 = "TYPE_PRIORITY streamId == 0";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0221:
        r11.m2165a();
        return r2;
    L_0x0225:
        if (r6 != 0) goto L_0x0230;
    L_0x0227:
        r12 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0230:
        r3 = r12 & 1;
        if (r3 == 0) goto L_0x0236;
    L_0x0234:
        r3 = r2;
        goto L_0x0237;
    L_0x0236:
        r3 = r0;
    L_0x0237:
        r4 = r12 & 8;
        if (r4 == 0) goto L_0x0244;
    L_0x023b:
        r0 = r11.f2729b;
        r0 = r0.mo3135f();
        r0 = r0 & 255;
        r0 = (short) r0;
    L_0x0244:
        r4 = r12 & 32;
        if (r4 == 0) goto L_0x024d;
    L_0x0248:
        r11.m2165a();
        r1 = r1 + -5;
    L_0x024d:
        r1 = p056c.p057a.p061e.C0897h.m2162a(r1, r12, r0);
        r12 = r11.m2164a(r1, r0, r12, r6);
        r13.mo979a(r3, r6, r12);
        return r2;
    L_0x0259:
        if (r6 != 0) goto L_0x0264;
    L_0x025b:
        r12 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x0264:
        r3 = r12 & 1;
        if (r3 == 0) goto L_0x026a;
    L_0x0268:
        r3 = r2;
        goto L_0x026b;
    L_0x026a:
        r3 = r0;
    L_0x026b:
        r4 = r12 & 32;
        if (r4 == 0) goto L_0x0271;
    L_0x026f:
        r4 = r2;
        goto L_0x0272;
    L_0x0271:
        r4 = r0;
    L_0x0272:
        if (r4 == 0) goto L_0x027d;
    L_0x0274:
        r12 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA";
        r13 = new java.lang.Object[r0];
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x027d:
        r4 = r12 & 8;
        if (r4 == 0) goto L_0x028a;
    L_0x0281:
        r0 = r11.f2729b;
        r0 = r0.mo3135f();
        r0 = r0 & 255;
        r0 = (short) r0;
    L_0x028a:
        r12 = p056c.p057a.p061e.C0897h.m2162a(r1, r12, r0);
        r1 = r11.f2729b;
        r13.mo978a(r3, r6, r1, r12);
        r12 = r11.f2729b;
        r0 = (long) r0;
        goto L_0x0062;
    L_0x0298:
        return r2;
    L_0x0299:
        r12 = "FRAME_SIZE_ERROR: %s";
        r13 = new java.lang.Object[r2];
        r1 = java.lang.Integer.valueOf(r1);
        r13[r0] = r1;
        r12 = p056c.p057a.p061e.C0892e.m2134b(r12, r13);
        throw r12;
    L_0x02a8:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.h.a(boolean, c.a.e.h$b):boolean");
    }

    public final void close() {
        this.f2729b.close();
    }
}
