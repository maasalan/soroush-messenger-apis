package p000a.p003b.p004a.p007c.p008a;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jivesoftware.smack.util.StringUtils;
import p000a.p003b.p004a.C0049f.C4646a;
import p000a.p003b.p004a.C0049f.C4647b;
import p000a.p003b.p004a.p007c.C0031d;
import p000a.p003b.p004a.p007c.C0032e;
import p000a.p003b.p004a.p007c.C0033f;
import p000a.p003b.p004a.p007c.p008a.C6314c.C7007a;
import p000a.p003b.p004a.p007c.p008a.C6314c.C7008b;
import p000a.p003b.p004a.p014i.C4661l.C0062a;

public class C0029a {
    public static final C0029a f98a = new C0029a();
    public final Map<C4646a, C0032e> f99b = new HashMap();
    public final Map<C4647b, C0033f> f100c = new HashMap();
    public final Map<C0062a, C0032e> f101d = new HashMap();
    private Logger f102e = Logger.getLogger(C0029a.class.getName());

    private C0029a() {
        try {
            this.f99b.put(C4646a.SHA1, new C4629e(StringUtils.SHA1));
            this.f101d.put(C0062a.SHA1, new C4629e(StringUtils.SHA1));
            try {
                this.f99b.put(C4646a.SHA256, new C4629e("SHA-256"));
                try {
                    this.f100c.put(C4647b.RSAMD5, new C6316g("MD5withRSA"));
                } catch (Throwable e) {
                    this.f102e.log(Level.FINER, "Platform does not support RSA/MD5", e);
                }
                try {
                    C6313b c6313b = new C6313b("SHA1withDSA");
                    this.f100c.put(C4647b.DSA, c6313b);
                    this.f100c.put(C4647b.DSA_NSEC3_SHA1, c6313b);
                } catch (Throwable e2) {
                    this.f102e.log(Level.FINE, "Platform does not support DSA/SHA-1", e2);
                }
                try {
                    C6316g c6316g = new C6316g("SHA1withRSA");
                    this.f100c.put(C4647b.RSASHA1, c6316g);
                    this.f100c.put(C4647b.RSASHA1_NSEC3_SHA1, c6316g);
                    try {
                        this.f100c.put(C4647b.RSASHA256, new C6316g("SHA256withRSA"));
                    } catch (Throwable e22) {
                        this.f102e.log(Level.INFO, "Platform does not support RSA/SHA-256", e22);
                    }
                    try {
                        this.f100c.put(C4647b.RSASHA512, new C6316g("SHA512withRSA"));
                    } catch (Throwable e222) {
                        this.f102e.log(Level.INFO, "Platform does not support RSA/SHA-512", e222);
                    }
                    try {
                        this.f100c.put(C4647b.ECC_GOST, new C6315d());
                    } catch (Throwable e2222) {
                        this.f102e.log(Level.FINE, "Platform does not support GOST R 34.10-2001", e2222);
                    }
                    try {
                        this.f100c.put(C4647b.ECDSAP256SHA256, new C7007a());
                    } catch (Throwable e22222) {
                        this.f102e.log(Level.INFO, "Platform does not support ECDSA/SHA-256", e22222);
                    }
                    try {
                        this.f100c.put(C4647b.ECDSAP384SHA384, new C7008b());
                    } catch (Throwable e222222) {
                        this.f102e.log(Level.INFO, "Platform does not support ECDSA/SHA-384", e222222);
                    }
                } catch (Throwable e2222222) {
                    throw new C0031d("Platform does not support RSA/SHA-1", e2222222);
                }
            } catch (Throwable e22222222) {
                throw new C0031d("SHA-256 is mandatory", e22222222);
            }
        } catch (Throwable e222222222) {
            throw new C0031d("SHA-1 is mandatory", e222222222);
        }
    }
}
