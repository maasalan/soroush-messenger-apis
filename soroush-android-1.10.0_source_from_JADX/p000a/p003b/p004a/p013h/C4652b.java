package p000a.p003b.p004a.p013h;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import p000a.p003b.p004a.C0021a;
import p000a.p003b.p004a.C0021a.C4626a;
import p000a.p003b.p004a.C0025b;
import p000a.p003b.p004a.C0041d;
import p000a.p003b.p004a.C0041d.C4642a;
import p000a.p003b.p004a.C0044e;
import p000a.p003b.p004a.C0065j;
import p000a.p003b.p004a.C0076k;
import p000a.p003b.p004a.C0076k.C0070b;
import p000a.p003b.p004a.p013h.C4651a.C6321a;
import p000a.p003b.p004a.p013h.C4651a.C6322b;
import p000a.p003b.p004a.p014i.C4655c;
import p000a.p003b.p004a.p014i.C4658h;
import p000a.p003b.p004a.p014i.C6325a;
import p000a.p003b.p004a.p014i.C6326b;
import p000a.p003b.p004a.p014i.C6328j;
import p000a.p003b.p004a.p016k.C0074f;

public class C4652b extends C0021a {
    protected static final Inet4Address[] f12774h = new Inet4Address[]{C4652b.m8458a('a', 198, 41, 0, 4), C4652b.m8458a('b', 192, 228, 79, 201), C4652b.m8458a('c', 192, 33, 4, 12), C4652b.m8458a('d', 199, 7, 91, 13), C4652b.m8458a('e', 192, 203, 230, 10), C4652b.m8458a('f', 192, 5, 5, 241), C4652b.m8458a('g', 192, 112, 36, 4), C4652b.m8458a('h', 198, 97, 190, 53), C4652b.m8458a('i', 192, 36, 148, 17), C4652b.m8458a('j', 192, 58, 128, 30), C4652b.m8458a('k', 193, 0, 14, 129), C4652b.m8458a('l', 199, 7, 83, 42), C4652b.m8458a('m', 202, 12, 27, 33)};
    protected static final Inet6Address[] f12775i = new Inet6Address[]{C4652b.m8464b('a', 1283, 47678, 2, 48), C4652b.m8464b('b', 1280, 132, 0, 11), C4652b.m8464b('c', 1280, 2, 0, 12), C4652b.m8464b('d', 1280, 45, 0, 13), C4652b.m8464b('f', 1280, 47, 0, 15), C4652b.m8464b('h', 1280, 1, 0, 83), C4652b.m8464b('i', 2046, 0, 0, 83), C4652b.m8464b('j', 1283, 3111, 2, 48), C4652b.m8464b('l', 1280, 3, 0, 66), C4652b.m8464b('m', 3523, 0, 0, 53)};
    private static final Map<Character, InetAddress> f12776k = new HashMap();
    private static final Map<Character, InetAddress> f12777l = new HashMap();
    int f12778j = 128;

    static /* synthetic */ class C00551 {
        static final /* synthetic */ int[] f246a = new int[C4626a.m18a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = p000a.p003b.p004a.C0076k.C0070b.values();
            r0 = r0.length;
            r0 = new int[r0];
            f247b = r0;
            r0 = 1;
            r1 = f247b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = p000a.p003b.p004a.C0076k.C0070b.A;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f247b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = p000a.p003b.p004a.C0076k.C0070b.AAAA;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = p000a.p003b.p004a.C0021a.C4626a.m18a();
            r2 = r2.length;
            r2 = new int[r2];
            f246a = r2;
            r2 = f246a;	 Catch:{ NoSuchFieldError -> 0x002f }
            r3 = p000a.p003b.p004a.C0021a.C4626a.f73a;	 Catch:{ NoSuchFieldError -> 0x002f }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x002f }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x002f }
        L_0x002f:
            r2 = f246a;	 Catch:{ NoSuchFieldError -> 0x0036 }
            r3 = p000a.p003b.p004a.C0021a.C4626a.f74b;	 Catch:{ NoSuchFieldError -> 0x0036 }
            r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0036 }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0036 }
        L_0x0036:
            r1 = f246a;	 Catch:{ NoSuchFieldError -> 0x003e }
            r2 = p000a.p003b.p004a.C0021a.C4626a.f75c;	 Catch:{ NoSuchFieldError -> 0x003e }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x003e }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x003e }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            r1 = f246a;	 Catch:{ NoSuchFieldError -> 0x0046 }
            r2 = p000a.p003b.p004a.C0021a.C4626a.f76d;	 Catch:{ NoSuchFieldError -> 0x0046 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0046 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0046 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0046 }
        L_0x0046:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.a.h.b.1.<clinit>():void");
        }
    }

    private static class C0057a {
        final List<InetAddress> f251a;

        private static class C0056a {
            final List<InetAddress> f248a;
            final List<InetAddress> f249b;
            private final Random f250c;

            private C0056a(Random random) {
                this.f248a = new ArrayList(8);
                this.f249b = new ArrayList(8);
                this.f250c = random;
            }

            public final C0057a m102a() {
                return new C0057a(this.f248a, this.f249b, this.f250c);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C0057a(java.util.List<java.net.InetAddress> r5, java.util.List<java.net.InetAddress> r6, java.util.Random r7) {
            /*
            r4 = this;
            r4.<init>();
            r0 = p000a.p003b.p004a.p013h.C4652b.C00551.f246a;
            r1 = p000a.p003b.p004a.p013h.C4652b.g;
            r2 = 1;
            r1 = r1 - r2;
            r0 = r0[r1];
            switch(r0) {
                case 1: goto L_0x001f;
                case 2: goto L_0x001a;
                default: goto L_0x0010;
            };
        L_0x0010:
            r0 = r5.size();
            r1 = r6.size();
            r0 = r0 + r1;
            goto L_0x0023;
        L_0x001a:
            r0 = r6.size();
            goto L_0x0023;
        L_0x001f:
            r0 = r5.size();
        L_0x0023:
            if (r0 != 0) goto L_0x002c;
        L_0x0025:
            r5 = java.util.Collections.emptyList();
        L_0x0029:
            r4.f251a = r5;
            return;
        L_0x002c:
            r1 = p000a.p003b.p004a.p013h.C4652b.C00551.f246a;
            r3 = p000a.p003b.p004a.p013h.C4652b.g;
            r3 = r3 - r2;
            r1 = r1[r3];
            if (r1 == r2) goto L_0x003b;
        L_0x0037:
            switch(r1) {
                case 3: goto L_0x003b;
                case 4: goto L_0x003b;
                default: goto L_0x003a;
            };
        L_0x003a:
            goto L_0x003e;
        L_0x003b:
            java.util.Collections.shuffle(r5, r7);
        L_0x003e:
            r1 = p000a.p003b.p004a.p013h.C4652b.C00551.f246a;
            r3 = p000a.p003b.p004a.p013h.C4652b.g;
            r3 = r3 - r2;
            r1 = r1[r3];
            switch(r1) {
                case 2: goto L_0x004b;
                case 3: goto L_0x004b;
                case 4: goto L_0x004b;
                default: goto L_0x004a;
            };
        L_0x004a:
            goto L_0x004e;
        L_0x004b:
            java.util.Collections.shuffle(r6, r7);
        L_0x004e:
            r7 = new java.util.ArrayList;
            r7.<init>(r0);
            r0 = p000a.p003b.p004a.p013h.C4652b.C00551.f246a;
            r1 = p000a.p003b.p004a.p013h.C4652b.g;
            r1 = r1 - r2;
            r0 = r0[r1];
            switch(r0) {
                case 1: goto L_0x006b;
                case 2: goto L_0x0067;
                case 3: goto L_0x0064;
                case 4: goto L_0x0060;
                default: goto L_0x005f;
            };
        L_0x005f:
            goto L_0x006e;
        L_0x0060:
            r7.addAll(r6);
            goto L_0x006b;
        L_0x0064:
            r7.addAll(r5);
        L_0x0067:
            r7.addAll(r6);
            goto L_0x006e;
        L_0x006b:
            r7.addAll(r5);
        L_0x006e:
            r5 = java.util.Collections.unmodifiableList(r7);
            goto L_0x0029;
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.a.h.b.a.<init>(java.util.List, java.util.List, java.util.Random):void");
        }
    }

    public C4652b(C0025b c0025b) {
        super(c0025b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p000a.p003b.p004a.C0041d m8454a(p000a.p003b.p004a.p013h.C0059d r7, p000a.p003b.p004a.C0041d r8) {
        /*
        r6 = this;
        r0 = r8.m60b();
        r0 = r0.f271a;
        r1 = r0.m84d();
        r2 = 1;
        if (r1 == 0) goto L_0x0010;
    L_0x000d:
        r0 = p000a.p003b.p004a.C0044e.f180a;
        goto L_0x0019;
    L_0x0010:
        r1 = r0.m83c();
        r1 = r1 - r2;
        r0 = r0.m78a(r1);
    L_0x0019:
        r1 = p000a.p003b.p004a.p013h.C4652b.C00551.f246a;
        r3 = g;
        r3 = r3 - r2;
        r1 = r1[r3];
        r3 = 0;
        r4 = 0;
        switch(r1) {
            case 1: goto L_0x0070;
            case 2: goto L_0x004d;
            case 3: goto L_0x003c;
            case 4: goto L_0x002b;
            default: goto L_0x0025;
        };
    L_0x0025:
        r7 = new java.lang.AssertionError;
        r7.<init>();
        throw r7;
    L_0x002b:
        r1 = r6.m32b(r0);
        r0 = r6.m28a(r0);
        r0 = p000a.p003b.p004a.p013h.C4652b.m8462a(r1, r0);
        r1 = r0[r3];
        r0 = r0[r2];
        goto L_0x0090;
    L_0x003c:
        r1 = r6.m28a(r0);
        r0 = r6.m32b(r0);
        r0 = p000a.p003b.p004a.p013h.C4652b.m8462a(r1, r0);
        r1 = r0[r3];
        r0 = r0[r2];
        goto L_0x0090;
    L_0x004d:
        r0 = r6.m32b(r0);
        r0 = r0.iterator();
        r1 = r4;
    L_0x0056:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x006e;
    L_0x005c:
        r3 = r0.next();
        r3 = (p000a.p003b.p004a.p014i.C6326b) r3;
        if (r1 != 0) goto L_0x0069;
    L_0x0064:
        r1 = r3.m8489b();
        goto L_0x0056;
    L_0x0069:
        r0 = r3.m8489b();
        goto L_0x0090;
    L_0x006e:
        r0 = r4;
        goto L_0x0090;
    L_0x0070:
        r0 = r6.m28a(r0);
        r0 = r0.iterator();
        r1 = r4;
    L_0x0079:
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x006e;
    L_0x007f:
        r3 = r0.next();
        r3 = (p000a.p003b.p004a.p014i.C6325a) r3;
        if (r1 != 0) goto L_0x008c;
    L_0x0087:
        r1 = r3.m8489b();
        goto L_0x0079;
    L_0x008c:
        r0 = r3.m8489b();
    L_0x0090:
        if (r1 != 0) goto L_0x00ba;
    L_0x0092:
        r3 = p000a.p003b.p004a.C0044e.f181b;
        r3 = p000a.p003b.p004a.p013h.C4652b.C00551.f246a;
        r5 = g;
        r5 = r5 - r2;
        r2 = r3[r5];
        switch(r2) {
            case 1: goto L_0x00b6;
            case 2: goto L_0x00b1;
            case 3: goto L_0x00a8;
            case 4: goto L_0x009f;
            default: goto L_0x009e;
        };
    L_0x009e:
        goto L_0x00ba;
    L_0x009f:
        r1 = r6.m8468f();
        r0 = r6.m8467e();
        goto L_0x00ba;
    L_0x00a8:
        r1 = r6.m8467e();
        r0 = r6.m8468f();
        goto L_0x00ba;
    L_0x00b1:
        r1 = r6.m8468f();
        goto L_0x00ba;
    L_0x00b6:
        r1 = r6.m8467e();
    L_0x00ba:
        r2 = new java.util.LinkedList;
        r2.<init>();
        r1 = r6.m8455a(r7, r8, r1);	 Catch:{ IOException -> 0x00c4 }
        return r1;
    L_0x00c4:
        r1 = move-exception;
        p000a.p003b.p004a.p013h.C4652b.m8461a(r1);
        r2.add(r1);
        if (r0 == 0) goto L_0x00d6;
    L_0x00cd:
        r7 = r6.m8455a(r7, r8, r0);	 Catch:{ IOException -> 0x00d2 }
        return r7;
    L_0x00d2:
        r7 = move-exception;
        r2.add(r7);
    L_0x00d6:
        p000a.p003b.p004a.p016k.C0074f.m123a(r2);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.a.h.b.a(a.b.a.h.d, a.b.a.d):a.b.a.d");
    }

    private C0041d m8455a(C0059d c0059d, C0041d c0041d, InetAddress inetAddress) {
        C0065j b = c0041d.m60b();
        if (!c0059d.f258b.containsKey(inetAddress)) {
            c0059d.f258b.put(inetAddress, new HashSet());
        } else if (((Set) c0059d.f258b.get(inetAddress)).contains(b)) {
            throw new C6321a();
        }
        int i = c0059d.f259c + 1;
        c0059d.f259c = i;
        if (i > c0059d.f257a.f12778j) {
            throw new C6322b();
        }
        boolean add = ((Set) c0059d.f258b.get(inetAddress)).add(b);
        if (C0059d.f256d || add) {
            C0041d a = super.m26a(c0041d, inetAddress);
            if (a == null) {
                return null;
            }
            if (a.f157e) {
                return a;
            }
            List<C0076k> c = a.m61c();
            List linkedList = new LinkedList();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                C0076k c0076k = (C0076k) it.next();
                if (c0076k.f341b != C0070b.NS) {
                    it.remove();
                } else {
                    Iterator it2 = m8456a(a, ((C6328j) c0076k.f345f).a).f251a.iterator();
                    while (it2.hasNext()) {
                        try {
                            return m8455a(c0059d, c0041d, (InetAddress) it2.next());
                        } catch (IOException e) {
                            C4652b.m8461a(e);
                            b.log(Level.FINER, "Exception while recursing", e);
                            c0059d.m103a();
                            linkedList.add(e);
                            if (!it2.hasNext()) {
                                it.remove();
                            }
                        }
                    }
                    continue;
                }
            }
            for (C0076k c0076k2 : c) {
                C0065j b2 = c0041d.m60b();
                C0044e c0044e = ((C6328j) c0076k2.f345f).a;
                if (!(b2.f271a.equals(c0044e) && (b2.f272b == C0070b.A || b2.f272b == C0070b.AAAA))) {
                    C0057a a2;
                    try {
                        a2 = m8457a(c0059d, c0044e);
                    } catch (IOException e2) {
                        c0059d.m103a();
                        linkedList.add(e2);
                        a2 = null;
                    }
                    if (a2 != null) {
                        for (InetAddress a3 : a2.f251a) {
                            try {
                                return m8455a(c0059d, c0041d, a3);
                            } catch (IOException e3) {
                                c0059d.m103a();
                                linkedList.add(e3);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
            C0074f.m123a(linkedList);
            return null;
        }
        throw new AssertionError();
    }

    private C0057a m8456a(C0041d c0041d, C0044e c0044e) {
        C0056a g = m8469g();
        for (C0076k c0076k : c0041d.f166n) {
            if (c0076k.f340a.equals(c0044e)) {
                List list;
                Object a;
                switch (c0076k.f341b) {
                    case A:
                        list = g.f248a;
                        a = C4652b.m8459a(c0044e.f184d, (C6325a) c0076k.f345f);
                        break;
                    case AAAA:
                        list = g.f249b;
                        a = C4652b.m8460a(c0044e.f184d, (C6326b) c0076k.f345f);
                        break;
                    default:
                        continue;
                }
                list.add(a);
            }
        }
        return g.m102a();
    }

    private C0057a m8457a(C0059d c0059d, C0044e c0044e) {
        C0056a g;
        loop0:
        while (true) {
            C0065j c0065j;
            C0041d a;
            g = m8469g();
            if (g != C4626a.f74b) {
                c0065j = new C0065j(c0044e, C0070b.A);
                a = m8454a(c0059d, m31b(c0065j));
                if (a != null) {
                    for (C0076k c0076k : a.f164l) {
                        if (!c0076k.m128a(c0065j)) {
                            if (c0076k.f341b == C0070b.CNAME && c0076k.f340a.equals(c0044e)) {
                                break;
                            }
                        }
                        g.f248a.add(C4652b.m8459a(c0044e.f184d, (C6325a) c0076k.f345f));
                    }
                }
            }
            if (g == C4626a.f73a) {
                break;
            }
            c0065j = new C0065j(c0044e, C0070b.AAAA);
            a = m8454a(c0059d, m31b(c0065j));
            if (a == null) {
                break;
            }
            for (C0076k c0076k2 : a.f164l) {
                if (c0076k2.m128a(c0065j)) {
                    g.f249b.add(C4652b.m8460a(c0044e.f184d, (C6326b) c0076k2.f345f));
                } else if (c0076k2.f341b == C0070b.CNAME && c0076k2.f340a.equals(c0044e)) {
                    c0044e = ((C4655c) c0076k2.f345f).f12785a;
                }
            }
            break loop0;
        }
        return g.m102a();
    }

    private static Inet4Address m8458a(char c, int i, int i2, int i3, int i4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append(".root-servers.net");
        try {
            Inet4Address inet4Address = (Inet4Address) InetAddress.getByAddress(stringBuilder.toString(), new byte[]{(byte) i, (byte) i2, (byte) i3, (byte) i4});
            f12776k.put(Character.valueOf(c), inet4Address);
            return inet4Address;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static InetAddress m8459a(String str, C6325a c6325a) {
        try {
            return InetAddress.getByAddress(str, c6325a.m8488a());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static InetAddress m8460a(String str, C6326b c6326b) {
        try {
            return InetAddress.getByAddress(str, c6326b.m8488a());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static void m8461a(IOException iOException) {
        if (iOException instanceof C6321a) {
            throw iOException;
        }
    }

    private static InetAddress[] m8462a(Collection<? extends C4658h> collection, Collection<? extends C4658h> collection2) {
        InetAddress[] inetAddressArr = new InetAddress[2];
        for (C4658h c4658h : collection) {
            if (inetAddressArr[0] == null) {
                inetAddressArr[0] = c4658h.m8489b();
                if (!collection2.isEmpty()) {
                }
            }
            if (inetAddressArr[1] == null) {
                inetAddressArr[1] = c4658h.m8489b();
            }
            for (C4658h c4658h2 : collection2) {
                if (inetAddressArr[0] != null) {
                    inetAddressArr[0] = c4658h2.m8489b();
                } else {
                    if (inetAddressArr[1] == null) {
                        inetAddressArr[1] = c4658h2.m8489b();
                    }
                    return inetAddressArr;
                }
            }
            return inetAddressArr;
        }
        for (C4658h c4658h22 : collection2) {
            if (inetAddressArr[0] != null) {
                if (inetAddressArr[1] == null) {
                    inetAddressArr[1] = c4658h22.m8489b();
                }
                return inetAddressArr;
            }
            inetAddressArr[0] = c4658h22.m8489b();
        }
        return inetAddressArr;
    }

    private static Inet6Address m8464b(char c, int i, int i2, int i3, int i4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append(".root-servers.net");
        try {
            Inet6Address inet6Address = (Inet6Address) InetAddress.getByAddress(stringBuilder.toString(), new byte[]{(byte) 32, (byte) 1, (byte) (i >> 8), (byte) i, (byte) (i2 >> 8), (byte) i2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) (i3 >> 8), (byte) i3, (byte) (i4 >> 8), (byte) i4});
            f12777l.put(Character.valueOf(c), inet6Address);
            return inet6Address;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private Inet4Address m8467e() {
        return f12774h[this.d.nextInt(f12774h.length)];
    }

    private Inet6Address m8468f() {
        return f12775i[this.d.nextInt(f12775i.length)];
    }

    private C0056a m8469g() {
        return new C0056a(this.d);
    }

    protected final C0041d mo6a(C4642a c4642a) {
        return m8454a(new C0059d(this), c4642a.m49b());
    }

    protected boolean mo17a(C0065j c0065j, C0041d c0041d) {
        return c0041d.f157e;
    }

    protected C4642a mo7b(C4642a c4642a) {
        c4642a.f111g = false;
        c4642a.m48a().m94a(this.f.m109a());
        return c4642a;
    }
}
