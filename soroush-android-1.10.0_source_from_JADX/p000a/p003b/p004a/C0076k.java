package p000a.p003b.p004a;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.linphone.core.Privacy;
import p000a.p003b.p004a.p014i.C0061g;
import p000a.p003b.p004a.p014i.C4655c;
import p000a.p003b.p004a.p014i.C4656e;
import p000a.p003b.p004a.p014i.C4657f;
import p000a.p003b.p004a.p014i.C4659i;
import p000a.p003b.p004a.p014i.C4660k;
import p000a.p003b.p004a.p014i.C4661l;
import p000a.p003b.p004a.p014i.C4662m;
import p000a.p003b.p004a.p014i.C4663n;
import p000a.p003b.p004a.p014i.C4664o;
import p000a.p003b.p004a.p014i.C4665q;
import p000a.p003b.p004a.p014i.C4666r;
import p000a.p003b.p004a.p014i.C4667s;
import p000a.p003b.p004a.p014i.C4668t;
import p000a.p003b.p004a.p014i.C4669u;
import p000a.p003b.p004a.p014i.C6325a;
import p000a.p003b.p004a.p014i.C6326b;
import p000a.p003b.p004a.p014i.C6327d;
import p000a.p003b.p004a.p014i.C6328j;
import p000a.p003b.p004a.p014i.C6329p;

public final class C0076k<D extends C0061g> {
    public final C0044e f340a;
    public final C0070b f341b;
    public final C0069a f342c;
    public final int f343d;
    public final long f344e;
    public final D f345f;
    protected final boolean f346g;
    private byte[] f347h;
    private transient Integer f348i;

    public enum C0069a {
        IN(1),
        CH(3),
        HS(4),
        NONE(254),
        ANY(255);
        
        private static final HashMap<Integer, C0069a> f282g = null;
        final int f284f;

        static {
            f282g = new HashMap();
            C0069a[] values = C0069a.values();
            int length = values.length;
            int i;
            while (i < length) {
                C0069a c0069a = values[i];
                f282g.put(Integer.valueOf(c0069a.f284f), c0069a);
                i++;
            }
        }

        private C0069a(int i) {
            this.f284f = i;
        }

        public static C0069a m112a(int i) {
            return (C0069a) f282g.get(Integer.valueOf(i));
        }
    }

    public enum C0070b {
        UNKNOWN(-1),
        A(1, C6325a.class),
        NS(2, C6328j.class),
        MD(3),
        MF(4),
        CNAME(5, C4655c.class),
        SOA(6, C4666r.class),
        MB(7),
        MG(8),
        MR(9),
        NULL(10),
        WKS(11),
        PTR(12, C6329p.class),
        HINFO(13),
        MINFO(14),
        MX(15, C4659i.class),
        TXT(16, C4669u.class),
        RP(17),
        AFSDB(18),
        X25(19),
        ISDN(20),
        RT(21),
        NSAP(22),
        NSAP_PTR(23),
        SIG(24),
        KEY(25),
        PX(26),
        GPOS(27),
        AAAA(28, C6326b.class),
        LOC(29),
        NXT(30),
        EID(31),
        NIMLOC(32),
        SRV(33, C4667s.class),
        ATMA(34),
        NAPTR(35),
        KX(36),
        CERT(37),
        A6(38),
        DNAME(39),
        SINK(40),
        OPT(41, C4664o.class),
        APL(42),
        DS(43, C4657f.class),
        SSHFP(44),
        IPSECKEY(45),
        RRSIG(46, C4665q.class),
        NSEC(47, C4660k.class),
        DNSKEY(48, C4656e.class),
        DHCID(49),
        NSEC3(50, C4661l.class),
        NSEC3PARAM(51, C4662m.class),
        TLSA(52, C4668t.class),
        HIP(55),
        NINFO(56),
        RKEY(57),
        TALINK(58),
        CDS(59),
        CDNSKEY(60),
        OPENPGPKEY(61, C4663n.class),
        CSYNC(62),
        SPF(99),
        UINFO(100),
        UID(101),
        GID(102),
        UNSPEC(103),
        NID(104),
        L32(105),
        L64(106),
        LP(107),
        EUI48(108),
        EUI64(109),
        TKEY(249),
        TSIG(Callback.DEFAULT_SWIPE_ANIMATION_DURATION),
        IXFR(251),
        AXFR(252),
        MAILB(253),
        MAILA(254),
        ANY(255),
        URI(256),
        CAA(257),
        TA(Privacy.DEFAULT),
        DLV(32769, C6327d.class);
        
        private static final Map<Integer, C0070b> aH = null;
        private static final Map<Class<?>, C0070b> aI = null;
        public final int aF;
        private final Class<?> aG;

        static {
            aH = new HashMap();
            aI = new HashMap();
            C0070b[] values = C0070b.values();
            int length = values.length;
            int i;
            while (i < length) {
                C0070b c0070b = values[i];
                aH.put(Integer.valueOf(c0070b.aF), c0070b);
                if (c0070b.aG != null) {
                    aI.put(c0070b.aG, c0070b);
                }
                i++;
            }
        }

        private C0070b(int i) {
            this(r2, r3, i, null);
        }

        private <D extends C0061g> C0070b(int i, Class<D> cls) {
            this.aF = i;
            this.aG = cls;
        }

        public static C0070b m113a(int i) {
            C0070b c0070b = (C0070b) aH.get(Integer.valueOf(i));
            return c0070b == null ? UNKNOWN : c0070b;
        }

        public static <D extends C0061g> C0070b m114a(Class<D> cls) {
            return (C0070b) aI.get(cls);
        }
    }

    public C0076k(C0044e c0044e, C0070b c0070b, int i, long j, D d) {
        this(c0044e, c0070b, C0069a.NONE, i, j, d, false);
    }

    private C0076k(C0044e c0044e, C0070b c0070b, C0069a c0069a, int i, long j, D d, boolean z) {
        this.f340a = c0044e;
        this.f341b = c0070b;
        this.f342c = c0069a;
        this.f343d = i;
        this.f344e = j;
        this.f345f = d;
        this.f346g = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000a.p003b.p004a.C0076k<p000a.p003b.p004a.p014i.C0061g> m125a(java.io.DataInputStream r23, byte[] r24) {
        /*
        r0 = r23;
        r1 = p000a.p003b.p004a.C0044e.m71a(r23, r24);
        r2 = r23.readUnsignedShort();
        r2 = p000a.p003b.p004a.C0076k.C0070b.m113a(r2);
        r4 = r23.readUnsignedShort();
        r3 = r4 & 32767;
        r3 = p000a.p003b.p004a.C0076k.C0069a.m112a(r3);
        r5 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r5 = r5 & r4;
        if (r5 <= 0) goto L_0x0021;
    L_0x001e:
        r5 = 1;
    L_0x001f:
        r8 = r5;
        goto L_0x0023;
    L_0x0021:
        r5 = 0;
        goto L_0x001f;
    L_0x0023:
        r5 = r23.readUnsignedShort();
        r5 = (long) r5;
        r7 = 16;
        r5 = r5 << r7;
        r7 = r23.readUnsignedShort();
        r9 = (long) r7;
        r11 = r5 + r9;
        r5 = r23.readUnsignedShort();
        r6 = p000a.p003b.p004a.C0076k.C00661.f276a;
        r7 = r2.ordinal();
        r6 = r6[r7];
        switch(r6) {
            case 1: goto L_0x0119;
            case 2: goto L_0x0112;
            case 3: goto L_0x0101;
            case 4: goto L_0x00fc;
            case 5: goto L_0x00f7;
            case 6: goto L_0x00e8;
            case 7: goto L_0x00e1;
            case 8: goto L_0x00d3;
            case 9: goto L_0x00c7;
            case 10: goto L_0x00c1;
            case 11: goto L_0x00bb;
            case 12: goto L_0x00b3;
            case 13: goto L_0x00ad;
            case 14: goto L_0x008b;
            case 15: goto L_0x0085;
            case 16: goto L_0x007f;
            case 17: goto L_0x005b;
            case 18: goto L_0x004f;
            case 19: goto L_0x0049;
            default: goto L_0x0041;
        };
    L_0x0041:
        r6 = new a.b.a.i.v;
        r6.<init>(r0, r5, r2);
    L_0x0046:
        r7 = r6;
        goto L_0x0149;
    L_0x0049:
        r0 = p000a.p003b.p004a.p014i.C6327d.m14808a(r0, r5);
        goto L_0x0148;
    L_0x004f:
        r5 = new byte[r5];
        r0.readFully(r5);
        r0 = new a.b.a.i.n;
        r0.<init>(r5);
        goto L_0x0148;
    L_0x005b:
        r6 = r23.readByte();
        r7 = r23.readByte();
        r9 = r23.readByte();
        r5 = r5 + -3;
        r5 = new byte[r5];
        r0 = r0.read(r5);
        r10 = r5.length;
        if (r0 == r10) goto L_0x0078;
    L_0x0072:
        r0 = new java.io.IOException;
        r0.<init>();
        throw r0;
    L_0x0078:
        r0 = new a.b.a.i.t;
        r0.<init>(r6, r7, r9, r5);
        goto L_0x0148;
    L_0x007f:
        r0 = p000a.p003b.p004a.p014i.C4662m.m8498a(r23);
        goto L_0x0148;
    L_0x0085:
        r0 = p000a.p003b.p004a.p014i.C4661l.m8495a(r0, r5);
        goto L_0x0148;
    L_0x008b:
        r6 = p000a.p003b.p004a.C0044e.m71a(r23, r24);
        r7 = r6.m81b();
        r5 = r5 - r7;
        r5 = new byte[r5];
        r0 = r0.read(r5);
        r7 = r5.length;
        if (r0 == r7) goto L_0x00a3;
    L_0x009d:
        r0 = new java.io.IOException;
        r0.<init>();
        throw r0;
    L_0x00a3:
        r0 = p000a.p003b.p004a.p014i.C4660k.m8493a(r5);
        r5 = new a.b.a.i.k;
        r5.<init>(r6, r0);
        goto L_0x00f5;
    L_0x00ad:
        r0 = p000a.p003b.p004a.p014i.C4657f.m8484b(r0, r5);
        goto L_0x0148;
    L_0x00b3:
        r6 = r24;
        r0 = p000a.p003b.p004a.p014i.C4665q.m8503a(r0, r6, r5);
        goto L_0x0148;
    L_0x00bb:
        r0 = p000a.p003b.p004a.p014i.C4656e.m8480a(r0, r5);
        goto L_0x0148;
    L_0x00c1:
        r0 = p000a.p003b.p004a.p014i.C4664o.m8501a(r0, r5);
        goto L_0x0148;
    L_0x00c7:
        r5 = new byte[r5];
        r0.readFully(r5);
        r0 = new a.b.a.i.u;
        r0.<init>(r5);
        goto L_0x0148;
    L_0x00d3:
        r6 = r24;
        r0 = p000a.p003b.p004a.p014i.C4655c.m8478a(r23, r24);
        r5 = new a.b.a.i.p;
        r0 = r0.f12785a;
        r5.<init>(r0);
        goto L_0x00f5;
    L_0x00e1:
        r6 = r24;
        r0 = p000a.p003b.p004a.p014i.C4655c.m8478a(r23, r24);
        goto L_0x0148;
    L_0x00e8:
        r6 = r24;
        r0 = p000a.p003b.p004a.p014i.C4655c.m8478a(r23, r24);
        r5 = new a.b.a.i.j;
        r0 = r0.f12785a;
        r5.<init>(r0);
    L_0x00f5:
        r7 = r5;
        goto L_0x0149;
    L_0x00f7:
        r0 = p000a.p003b.p004a.p014i.C6325a.m14806a(r23);
        goto L_0x0148;
    L_0x00fc:
        r0 = p000a.p003b.p004a.p014i.C6326b.m14807a(r23);
        goto L_0x0148;
    L_0x0101:
        r6 = r24;
        r5 = r23.readUnsignedShort();
        r0 = p000a.p003b.p004a.C0044e.m71a(r23, r24);
        r6 = new a.b.a.i.i;
        r6.<init>(r5, r0);
        goto L_0x0046;
    L_0x0112:
        r6 = r24;
        r0 = p000a.p003b.p004a.p014i.C4667s.m8507a(r23, r24);
        goto L_0x0148;
    L_0x0119:
        r6 = r24;
        r14 = p000a.p003b.p004a.C0044e.m71a(r23, r24);
        r15 = p000a.p003b.p004a.C0044e.m71a(r23, r24);
        r5 = r23.readInt();
        r5 = (long) r5;
        r9 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r16 = r5 & r9;
        r18 = r23.readInt();
        r19 = r23.readInt();
        r20 = r23.readInt();
        r0 = r23.readInt();
        r5 = (long) r0;
        r21 = r5 & r9;
        r0 = new a.b.a.i.r;
        r13 = r0;
        r13.<init>(r14, r15, r16, r18, r19, r20, r21);
    L_0x0148:
        r7 = r0;
    L_0x0149:
        r9 = new a.b.a.k;
        r0 = r9;
        r5 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r7, r8);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.a.k.a(java.io.DataInputStream, byte[]):a.b.a.k<a.b.a.i.g>");
    }

    public static <E extends C0061g> void m126a(Collection<C0076k<E>> collection, Class<E> cls, Collection<C0076k<? extends C0061g>> collection2) {
        for (C0076k a : collection2) {
            C0076k a2 = a2.m127a((Class) cls);
            if (a2 != null) {
                collection.add(a2);
            }
        }
    }

    public final <E extends C0061g> C0076k<E> m127a(Class<E> cls) {
        return this.f341b.aG == cls ? this : null;
    }

    public final boolean m128a(C0065j c0065j) {
        return (c0065j.f272b == this.f341b || c0065j.f272b == C0070b.ANY) && ((c0065j.f273c == this.f342c || c0065j.f273c == C0069a.ANY) && c0065j.f271a.equals(this.f340a));
    }

    public final byte[] m129a() {
        if (this.f347h == null) {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.f340a.m81b() + 8) + this.f345f.m106d());
            OutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                if (this.f345f == null) {
                    throw new IllegalStateException("Empty Record has no byte representation");
                }
                this.f340a.m79a(dataOutputStream);
                dataOutputStream.writeShort(this.f341b.aF);
                dataOutputStream.writeShort(this.f343d);
                dataOutputStream.writeInt((int) this.f344e);
                dataOutputStream.writeShort(this.f345f.m106d());
                C0061g c0061g = this.f345f;
                c0061g.m105c();
                dataOutputStream.write(c0061g.f262h);
                this.f347h = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        return (byte[]) this.f347h.clone();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0076k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0076k c0076k = (C0076k) obj;
        return this.f340a.equals(c0076k.f340a) && this.f341b == c0076k.f341b && this.f342c == c0076k.f342c && this.f345f.equals(c0076k.f345f);
    }

    public final int hashCode() {
        if (this.f348i == null) {
            this.f348i = Integer.valueOf((37 * (((((this.f340a.hashCode() + 37) * 37) + this.f341b.hashCode()) * 37) + this.f342c.hashCode())) + this.f345f.hashCode());
        }
        return this.f348i.intValue();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f340a);
        stringBuilder.append(".\t");
        stringBuilder.append(this.f344e);
        stringBuilder.append('\t');
        stringBuilder.append(this.f342c);
        stringBuilder.append('\t');
        stringBuilder.append(this.f341b);
        stringBuilder.append('\t');
        stringBuilder.append(this.f345f);
        return stringBuilder.toString();
    }
}
