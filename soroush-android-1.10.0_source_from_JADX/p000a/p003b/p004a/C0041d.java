package p000a.p003b.p004a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.linphone.core.Privacy;
import p000a.p003b.p004a.C0054g.C4648a;
import p000a.p003b.p004a.C0076k.C0070b;
import p000a.p003b.p004a.p014i.C0061g;
import p000a.p003b.p004a.p014i.C4664o;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class C0041d {
    private static final Logger f152r = Logger.getLogger(C0041d.class.getName());
    public final int f153a;
    public final C6318b f154b;
    public final C6319c f155c;
    public final boolean f156d;
    public final boolean f157e;
    public final boolean f158f;
    public final boolean f159g;
    public final boolean f160h;
    public final boolean f161i;
    public final boolean f162j;
    public final List<C0065j> f163k;
    public final List<C0076k<? extends C0061g>> f164l;
    public final List<C0076k<? extends C0061g>> f165m;
    public final List<C0076k<? extends C0061g>> f166n;
    public final int f167o;
    public C0054g f168p;
    public final long f169q;
    private byte[] f170s;
    private String f171t;
    private C0041d f172u;
    private transient Integer f173v;

    public static class C4642a {
        int f105a;
        C6318b f106b;
        C6319c f107c;
        boolean f108d;
        boolean f109e;
        boolean f110f;
        public boolean f111g;
        boolean f112h;
        public boolean f113i;
        public boolean f114j;
        long f115k;
        List<C0065j> f116l;
        public List<C0076k<? extends C0061g>> f117m;
        public List<C0076k<? extends C0061g>> f118n;
        public List<C0076k<? extends C0061g>> f119o;
        C4648a f120p;

        private C4642a() {
            this.f106b = C6318b.QUERY;
            this.f107c = C6319c.NO_ERROR;
            this.f115k = -1;
        }

        private C4642a(C0041d c0041d) {
            this.f106b = C6318b.QUERY;
            this.f107c = C6319c.NO_ERROR;
            this.f115k = -1;
            this.f105a = c0041d.f153a;
            this.f106b = c0041d.f154b;
            this.f107c = c0041d.f155c;
            this.f108d = c0041d.f156d;
            this.f109e = c0041d.f157e;
            this.f110f = c0041d.f158f;
            this.f111g = c0041d.f159g;
            this.f112h = c0041d.f160h;
            this.f113i = c0041d.f161i;
            this.f114j = c0041d.f162j;
            this.f115k = c0041d.f169q;
            this.f116l = new ArrayList(c0041d.f163k.size());
            this.f116l.addAll(c0041d.f163k);
            this.f117m = new ArrayList(c0041d.f164l.size());
            this.f117m.addAll(c0041d.f164l);
            this.f118n = new ArrayList(c0041d.f165m.size());
            this.f118n.addAll(c0041d.f165m);
            this.f119o = new ArrayList(c0041d.f166n.size());
            this.f119o.addAll(c0041d.f166n);
        }

        public final C4648a m48a() {
            if (this.f120p == null) {
                this.f120p = C0054g.m100a();
            }
            return this.f120p;
        }

        public final C0041d m49b() {
            return new C0041d(this);
        }
    }

    public enum C6318b {
        QUERY,
        INVERSE_QUERY,
        STATUS,
        UNASSIGNED3,
        NOTIFY,
        UPDATE;
        
        private static final C6318b[] f127h = null;
        final byte f129g;

        static {
            f127h = new C6318b[C6318b.values().length];
            C6318b[] values = C6318b.values();
            int length = values.length;
            int i;
            while (i < length) {
                C6318b c6318b = values[i];
                if (f127h[c6318b.f129g] != null) {
                    throw new IllegalStateException();
                }
                f127h[c6318b.f129g] = c6318b;
                i++;
            }
        }

        public static C6318b m50a(int i) {
            if (i >= 0) {
                if (i <= 15) {
                    return i >= f127h.length ? null : f127h[i];
                }
            }
            throw new IllegalArgumentException();
        }
    }

    public enum C6319c {
        NO_ERROR(0),
        FORMAT_ERR(1),
        SERVER_FAIL(2),
        NX_DOMAIN(3),
        NO_IMP(4),
        REFUSED(5),
        YXDOMAIN(6),
        YXRRSET(7),
        NXRRSET(8),
        NOT_AUTH(9),
        NOT_ZONE(10),
        BADVERS_BADSIG(16),
        BADKEY(17),
        BADTIME(18),
        BADMODE(19),
        BADNAME(20),
        BADALG(21),
        BADTRUNC(22),
        BADCOOKIE(23);
        
        private static final Map<Integer, C6319c> f149u = null;
        final byte f151t;

        static {
            f149u = new HashMap(C6319c.values().length);
            C6319c[] values = C6319c.values();
            int length = values.length;
            int i;
            while (i < length) {
                C6319c c6319c = values[i];
                f149u.put(Integer.valueOf(c6319c.f151t), c6319c);
                i++;
            }
        }

        private C6319c(int i) {
            this.f151t = (byte) i;
        }

        public static C6319c m51a(int i) {
            if (i >= 0) {
                if (i <= InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
                    return (C6319c) f149u.get(Integer.valueOf(i));
                }
            }
            throw new IllegalArgumentException();
        }
    }

    protected C0041d(C4642a c4642a) {
        List emptyList;
        List emptyList2;
        C4642a c4642a2 = c4642a;
        this.f153a = c4642a2.f105a;
        this.f154b = c4642a2.f106b;
        this.f155c = c4642a2.f107c;
        this.f169q = c4642a2.f115k;
        this.f156d = c4642a2.f108d;
        this.f157e = c4642a2.f109e;
        this.f158f = c4642a2.f110f;
        this.f159g = c4642a2.f111g;
        this.f160h = c4642a2.f112h;
        this.f161i = c4642a2.f113i;
        this.f162j = c4642a2.f114j;
        if (c4642a2.f116l == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = new ArrayList(c4642a2.f116l.size());
            emptyList.addAll(c4642a2.f116l);
            emptyList = Collections.unmodifiableList(emptyList);
        }
        r0.f163k = emptyList;
        if (c4642a2.f117m == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = new ArrayList(c4642a2.f117m.size());
            emptyList.addAll(c4642a2.f117m);
            emptyList = Collections.unmodifiableList(emptyList);
        }
        r0.f164l = emptyList;
        if (c4642a2.f118n == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = new ArrayList(c4642a2.f118n.size());
            emptyList.addAll(c4642a2.f118n);
            emptyList = Collections.unmodifiableList(emptyList);
        }
        r0.f165m = emptyList;
        if (c4642a2.f119o == null && c4642a2.f120p == null) {
            emptyList2 = Collections.emptyList();
        } else {
            int i = 0;
            if (c4642a2.f119o != null) {
                i = 0 + c4642a2.f119o.size();
            }
            if (c4642a2.f120p != null) {
                i++;
            }
            emptyList = new ArrayList(i);
            if (c4642a2.f119o != null) {
                emptyList.addAll(c4642a2.f119o);
            }
            if (c4642a2.f120p != null) {
                C0054g c0054g = new C0054g(c4642a2.f120p);
                r0.f168p = c0054g;
                if (c0054g.f244g == null) {
                    c0054g.f244g = new C0076k(C0044e.f180a, C0070b.OPT, c0054g.f238a, (((long) c0054g.f241d) | ((long) (c0054g.f239b << 8))) | ((long) (c0054g.f240c << 16)), new C4664o(c0054g.f242e));
                }
                emptyList.add(c0054g.f244g);
            }
            emptyList2 = Collections.unmodifiableList(emptyList);
        }
        r0.f166n = emptyList2;
        r0.f167o = C0041d.m56a(r0.f166n);
        if (r0.f167o != -1) {
            int i2 = r0.f167o;
            do {
                i2++;
                if (i2 >= r0.f166n.size()) {
                    return;
                }
            } while (((C0076k) r0.f166n.get(i2)).f341b != C0070b.OPT);
            throw new IllegalArgumentException("There must be only one OPT pseudo RR in the additional section");
        }
    }

    private C0041d(C0041d c0041d) {
        this.f153a = 0;
        this.f156d = c0041d.f156d;
        this.f154b = c0041d.f154b;
        this.f157e = c0041d.f157e;
        this.f158f = c0041d.f158f;
        this.f159g = c0041d.f159g;
        this.f160h = c0041d.f160h;
        this.f161i = c0041d.f161i;
        this.f162j = c0041d.f162j;
        this.f155c = c0041d.f155c;
        this.f169q = c0041d.f169q;
        this.f163k = c0041d.f163k;
        this.f164l = c0041d.f164l;
        this.f165m = c0041d.f165m;
        this.f166n = c0041d.f166n;
        this.f167o = c0041d.f167o;
    }

    public C0041d(byte[] bArr) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f153a = dataInputStream.readUnsignedShort();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        boolean z = true;
        int i = 0;
        this.f156d = ((readUnsignedShort >> 15) & 1) == 1;
        this.f154b = C6318b.m50a((readUnsignedShort >> 11) & 15);
        this.f157e = ((readUnsignedShort >> 10) & 1) == 1;
        this.f158f = ((readUnsignedShort >> 9) & 1) == 1;
        this.f159g = ((readUnsignedShort >> 8) & 1) == 1;
        this.f160h = ((readUnsignedShort >> 7) & 1) == 1;
        this.f161i = ((readUnsignedShort >> 5) & 1) == 1;
        if (((readUnsignedShort >> 4) & 1) != 1) {
            z = false;
        }
        this.f162j = z;
        this.f155c = C6319c.m51a(readUnsignedShort & 15);
        this.f169q = System.currentTimeMillis();
        readUnsignedShort = dataInputStream.readUnsignedShort();
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        int readUnsignedShort4 = dataInputStream.readUnsignedShort();
        this.f163k = new ArrayList(readUnsignedShort);
        for (int i2 = 0; i2 < readUnsignedShort; i2++) {
            this.f163k.add(new C0065j(dataInputStream, bArr));
        }
        this.f164l = new ArrayList(readUnsignedShort2);
        for (readUnsignedShort = 0; readUnsignedShort < readUnsignedShort2; readUnsignedShort++) {
            this.f164l.add(C0076k.m125a(dataInputStream, bArr));
        }
        this.f165m = new ArrayList(readUnsignedShort3);
        for (readUnsignedShort = 0; readUnsignedShort < readUnsignedShort3; readUnsignedShort++) {
            this.f165m.add(C0076k.m125a(dataInputStream, bArr));
        }
        this.f166n = new ArrayList(readUnsignedShort4);
        while (i < readUnsignedShort4) {
            this.f166n.add(C0076k.m125a(dataInputStream, bArr));
            i++;
        }
        this.f167o = C0041d.m56a(this.f166n);
    }

    private static int m56a(List<C0076k<? extends C0061g>> list) {
        for (int i = 0; i < list.size(); i++) {
            if (((C0076k) list.get(i)).f341b == C0070b.OPT) {
                return i;
            }
        }
        return -1;
    }

    public static C4642a m57f() {
        return new C4642a();
    }

    public final <D extends C0061g> Set<D> m58a(C0065j c0065j) {
        if (this.f155c != C6319c.NO_ERROR) {
            return null;
        }
        Set<D> hashSet = new HashSet(this.f164l.size());
        for (C0076k c0076k : this.f164l) {
            if (c0076k.m128a(c0065j) && !hashSet.add(c0076k.f345f)) {
                Logger logger = f152r;
                Level level = Level.WARNING;
                StringBuilder stringBuilder = new StringBuilder("DNSMessage contains duplicate answers. Record: ");
                stringBuilder.append(c0076k);
                stringBuilder.append("; DNSMessage: ");
                stringBuilder.append(this);
                logger.log(level, stringBuilder.toString());
            }
        }
        return hashSet;
    }

    public final byte[] m59a() {
        if (this.f170s != null) {
            return this.f170s;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream(IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int i = this.f156d ? Privacy.DEFAULT : 0;
        if (this.f154b != null) {
            i += this.f154b.f129g << 11;
        }
        if (this.f157e) {
            i += Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
        }
        if (this.f158f) {
            i += IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        }
        if (this.f159g) {
            i += 256;
        }
        if (this.f160h) {
            i += 128;
        }
        if (this.f161i) {
            i += 32;
        }
        if (this.f162j) {
            i += 16;
        }
        if (this.f155c != null) {
            i += this.f155c.f151t;
        }
        try {
            dataOutputStream.writeShort((short) this.f153a);
            dataOutputStream.writeShort((short) i);
            if (this.f163k == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) this.f163k.size());
            }
            if (this.f164l == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) this.f164l.size());
            }
            if (this.f165m == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) this.f165m.size());
            }
            if (this.f166n == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) this.f166n.size());
            }
            if (this.f163k != null) {
                for (C0065j a : this.f163k) {
                    dataOutputStream.write(a.m111a());
                }
            }
            if (this.f164l != null) {
                for (C0076k a2 : this.f164l) {
                    dataOutputStream.write(a2.m129a());
                }
            }
            if (this.f165m != null) {
                for (C0076k a22 : this.f165m) {
                    dataOutputStream.write(a22.m129a());
                }
            }
            if (this.f166n != null) {
                for (C0076k a222 : this.f166n) {
                    dataOutputStream.write(a222.m129a());
                }
            }
            dataOutputStream.flush();
            this.f170s = byteArrayOutputStream.toByteArray();
            return this.f170s;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final C0065j m60b() {
        return (C0065j) this.f163k.get(0);
    }

    public final List<C0076k<? extends C0061g>> m61c() {
        List<C0076k<? extends C0061g>> arrayList = new ArrayList(this.f165m.size());
        arrayList.addAll(this.f165m);
        return arrayList;
    }

    public final C4642a m62d() {
        return new C4642a();
    }

    public final C0041d m63e() {
        if (this.f172u == null) {
            this.f172u = new C0041d(this);
        }
        return this.f172u;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0041d)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Arrays.equals(m59a(), ((C0041d) obj).m59a());
    }

    public int hashCode() {
        if (this.f173v == null) {
            this.f173v = Integer.valueOf(Arrays.hashCode(m59a()));
        }
        return this.f173v.intValue();
    }

    public String toString() {
        if (this.f171t != null) {
            return this.f171t;
        }
        StringBuilder stringBuilder = new StringBuilder("DNSMessage(");
        stringBuilder.append(this.f153a);
        stringBuilder.append(' ');
        stringBuilder.append(this.f154b);
        stringBuilder.append(' ');
        stringBuilder.append(this.f155c);
        stringBuilder.append(' ');
        stringBuilder.append(this.f156d ? "resp[qr=1]" : "query[qr=0]");
        if (this.f157e) {
            stringBuilder.append(" aa");
        }
        if (this.f158f) {
            stringBuilder.append(" tr");
        }
        if (this.f159g) {
            stringBuilder.append(" rd");
        }
        if (this.f160h) {
            stringBuilder.append(" ra");
        }
        if (this.f161i) {
            stringBuilder.append(" ad");
        }
        if (this.f162j) {
            stringBuilder.append(" cd");
        }
        stringBuilder.append(")\n");
        if (this.f163k != null) {
            for (C0065j c0065j : this.f163k) {
                stringBuilder.append("[Q: ");
                stringBuilder.append(c0065j);
                stringBuilder.append("]\n");
            }
        }
        if (this.f164l != null) {
            for (C0076k c0076k : this.f164l) {
                stringBuilder.append("[A: ");
                stringBuilder.append(c0076k);
                stringBuilder.append("]\n");
            }
        }
        if (this.f165m != null) {
            for (C0076k c0076k2 : this.f165m) {
                stringBuilder.append("[N: ");
                stringBuilder.append(c0076k2);
                stringBuilder.append("]\n");
            }
        }
        if (this.f166n != null) {
            for (C0076k c0076k22 : this.f166n) {
                stringBuilder.append("[X: ");
                C0054g a = C0054g.m101a(c0076k22);
                if (a != null) {
                    stringBuilder.append(a.toString());
                } else {
                    stringBuilder.append(c0076k22);
                }
                stringBuilder.append("]\n");
            }
        }
        if (stringBuilder.charAt(stringBuilder.length() - 1) == '\n') {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        this.f171t = stringBuilder.toString();
        return this.f171t;
    }
}
