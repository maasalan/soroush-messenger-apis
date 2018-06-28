package p000a.p003b.p004a;

import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smack.util.StringUtils;

public final class C0049f {
    private static final Map<Byte, C4647b> f223a = new HashMap();
    private static final Map<Byte, C4646a> f224b = new HashMap();

    public enum C4646a {
        SHA1(1, StringUtils.SHA1),
        SHA256(2, "SHA-256"),
        GOST(3, "GOST R 34.11-94"),
        SHA384(4, "SHA-384");
        
        public final byte f196e;
        public final String f197f;

        private C4646a(int i, String str) {
            if (i >= 0) {
                if (i <= 255) {
                    this.f196e = (byte) i;
                    this.f197f = str;
                    C0049f.f224b.put(Byte.valueOf(this.f196e), this);
                    return;
                }
            }
            throw new IllegalArgumentException();
        }

        public static C4646a m85a(byte b) {
            return (C4646a) C0049f.f224b.get(Byte.valueOf(b));
        }
    }

    public enum C4647b {
        RSAMD5(1, "RSA/MD5"),
        DH(2, "Diffie-Hellman"),
        DSA(3, "DSA/SHA1"),
        RSASHA1(5, "RSA/SHA-1"),
        DSA_NSEC3_SHA1(6, "DSA_NSEC3-SHA1"),
        RSASHA1_NSEC3_SHA1(7, "RSASHA1-NSEC3-SHA1"),
        RSASHA256(8, "RSA/SHA-256"),
        RSASHA512(10, "RSA/SHA-512"),
        ECC_GOST(12, "GOST R 34.10-2001"),
        ECDSAP256SHA256(13, "ECDSA Curve P-256 with SHA-256"),
        ECDSAP384SHA384(14, "ECDSA Curve P-384 with SHA-384"),
        INDIRECT(252, "Reserved for Indirect Keys"),
        PRIVATEDNS(253, "private algorithm"),
        PRIVATEOID(254, "private algorithm oid");
        
        public final byte f213o;
        public final String f214p;

        private C4647b(int i, String str) {
            if (i >= 0) {
                if (i <= 255) {
                    this.f213o = (byte) i;
                    this.f214p = str;
                    C0049f.f223a.put(Byte.valueOf(this.f213o), this);
                    return;
                }
            }
            throw new IllegalArgumentException();
        }

        public static C4647b m86a(byte b) {
            return (C4647b) C0049f.f223a.get(Byte.valueOf(b));
        }
    }
}
