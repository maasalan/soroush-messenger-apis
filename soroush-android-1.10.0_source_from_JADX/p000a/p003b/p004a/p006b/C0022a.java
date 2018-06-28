package p000a.p003b.p004a.p006b;

import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.List;
import p000a.p003b.p004a.p014i.C4668t;

public abstract class C0022a extends CertificateException {

    public static class C4627a extends C0022a {
        public final C4668t f12731a;
        public final byte[] f12732b;

        public C4627a(C4668t c4668t, byte[] bArr) {
            super("The TLSA RR does not match the certificate");
            this.f12731a = c4668t;
            this.f12732b = bArr;
        }
    }

    public static class C4628b extends C0022a {
        static final /* synthetic */ boolean f12733b = true;
        public final List<C4627a> f12734a;

        static {
            Class cls = C0022a.class;
        }

        public C4628b(List<C4627a> list) {
            super("There where multiple CertificateMismatch exceptions because none of the TLSA RR does match the certificate");
            if (f12733b || !list.isEmpty()) {
                this.f12734a = Collections.unmodifiableList(list);
                return;
            }
            throw new AssertionError();
        }
    }

    protected C0022a() {
    }

    protected C0022a(String str) {
        super(str);
    }
}
