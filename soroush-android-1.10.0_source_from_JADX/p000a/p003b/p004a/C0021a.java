package p000a.p003b.p004a;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import p000a.p003b.p004a.C0041d.C4642a;
import p000a.p003b.p004a.C0076k.C0070b;
import p000a.p003b.p004a.p005a.C4626a;
import p000a.p003b.p004a.p014i.C0061g;
import p000a.p003b.p004a.p014i.C6325a;
import p000a.p003b.p004a.p014i.C6326b;
import p000a.p003b.p004a.p014i.C6328j;
import p000a.p003b.p004a.p015j.C0064a;

public abstract class C0021a {
    protected static final C4626a f80a = new C4626a((byte) 0);
    protected static final Logger f81b = Logger.getLogger(C0021a.class.getName());
    protected static int f82g = C4626a.f75c;
    protected final Random f83c;
    protected final Random f84d;
    protected final C0025b f85e;
    protected C0064a f86f;

    public enum C4626a {
        ;
        
        public static final int f73a = 1;
        public static final int f74b = 2;
        public static final int f75c = 3;
        public static final int f76d = 4;

        static {
            f77e = new int[]{f73a, f74b, f75c, f76d};
        }

        public static int[] m18a() {
            return (int[]) f77e.clone();
        }
    }

    protected C0021a() {
        this(f80a);
    }

    protected C0021a(p000a.p003b.p004a.C0025b r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r1.<init>();
        r0 = new java.util.Random;
        r0.<init>();
        r1.f84d = r0;
        r0 = new a.b.a.j.b;
        r0.<init>();
        r1.f86f = r0;
        r0 = "SHA1PRNG";	 Catch:{ NoSuchAlgorithmException -> 0x0018 }
        r0 = java.security.SecureRandom.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0018 }
        goto L_0x001d;
    L_0x0018:
        r0 = new java.security.SecureRandom;
        r0.<init>();
    L_0x001d:
        r1.f83c = r0;
        r1.f85e = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.a.a.<init>(a.b.a.b):void");
    }

    private <D extends C0061g> Set<D> m20a(C0044e c0044e, C0070b c0070b) {
        C0065j c0065j = new C0065j(c0044e, c0070b);
        C0041d a = this.f85e.m38a(m31b(c0065j));
        return a == null ? Collections.emptySet() : a.m58a(c0065j);
    }

    private <D extends C0061g> Set<D> m21b(C0044e c0044e, C0070b c0070b) {
        Set<C6328j> a = m20a(c0044e, C0070b.NS);
        if (a.isEmpty()) {
            return Collections.emptySet();
        }
        Set<D> hashSet = new HashSet(3 * a.size());
        for (C6328j c6328j : a) {
            Collection c;
            switch (c0070b) {
                case A:
                    c = m23c(c6328j.a);
                    break;
                case AAAA:
                    c = m24d(c6328j.a);
                    break;
                default:
                    throw new AssertionError();
            }
            hashSet.addAll(c);
        }
        return hashSet;
    }

    private C4642a mo2471c(C0065j c0065j) {
        C4642a f = C0041d.m57f();
        f.f116l = new ArrayList(1);
        f.f116l.add(c0065j);
        f.f105a = this.f83c.nextInt() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
        return mo7b(f);
    }

    private Set<C6325a> m23c(C0044e c0044e) {
        return m20a(c0044e, C0070b.A);
    }

    private Set<C6326b> m24d(C0044e c0044e) {
        return m20a(c0044e, C0070b.AAAA);
    }

    public abstract C0041d mo6a(C4642a c4642a);

    protected final C0041d m26a(C0041d c0041d, InetAddress inetAddress) {
        C0041d a = this.f85e == null ? null : this.f85e.m38a(c0041d);
        if (a != null) {
            return a;
        }
        C0065j b = c0041d.m60b();
        Level level = Level.FINE;
        f81b.log(level, "Asking {0} on {1} for {2} with:\n{3}", new Object[]{inetAddress, Integer.valueOf(53), b, c0041d});
        try {
            C0041d a2 = this.f86f.mo19a(c0041d, inetAddress);
            if (a2 != null) {
                f81b.log(level, "Response from {0} on {1} for {2}:\n{3}", new Object[]{inetAddress, Integer.valueOf(53), b, a2});
            } else {
                Logger logger = f81b;
                Level level2 = Level.SEVERE;
                StringBuilder stringBuilder = new StringBuilder("NULL response from ");
                stringBuilder.append(inetAddress);
                stringBuilder.append(" on 53 for ");
                stringBuilder.append(b);
                logger.log(level2, stringBuilder.toString());
            }
            if (a2 == null) {
                return null;
            }
            if (this.f85e != null && mo17a(b, a2)) {
                this.f85e.mo1a(c0041d.m63e().m63e(), a2);
            }
            return a2;
        } catch (IOException e) {
            f81b.log(level, "IOException {0} on {1} while resolving {2}: {3}", new Object[]{inetAddress, Integer.valueOf(53), b, e});
            throw e;
        }
    }

    public C0041d mo2469a(C0065j c0065j) {
        return mo6a(mo2471c(c0065j));
    }

    public final Set<C6325a> m28a(C0044e c0044e) {
        return m21b(c0044e, C0070b.A);
    }

    public boolean mo17a(C0065j c0065j, C0041d c0041d) {
        for (C0076k a : c0041d.f164l) {
            if (a.m128a(c0065j)) {
                return true;
            }
        }
        return false;
    }

    public abstract C4642a mo7b(C4642a c4642a);

    protected final C0041d m31b(C0065j c0065j) {
        return mo2471c(c0065j).m49b();
    }

    public final Set<C6326b> m32b(C0044e c0044e) {
        return m21b(c0044e, C0070b.AAAA);
    }
}
