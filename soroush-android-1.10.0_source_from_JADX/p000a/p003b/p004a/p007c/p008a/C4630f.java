package p000a.p003b.p004a.p007c.p008a;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import p000a.p003b.p004a.p007c.C0033f;

public abstract class C4630f implements C0033f {
    final KeyFactory f12736a;
    private final String f12737b;

    public C4630f(String str, String str2) {
        this.f12736a = KeyFactory.getInstance(str);
        this.f12737b = str2;
        Signature.getInstance(str2);
    }

    public final boolean mo4a(byte[] r2, byte[] r3, byte[] r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r4 = r1.mo2468b(r4);	 Catch:{ NoSuchAlgorithmException -> 0x0022, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019 }
        r0 = r1.f12737b;	 Catch:{ NoSuchAlgorithmException -> 0x0022, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019 }
        r0 = java.security.Signature.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0022, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019 }
        r0.initVerify(r4);	 Catch:{ NoSuchAlgorithmException -> 0x0022, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019 }
        r0.update(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0022, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019 }
        r2 = r1.mo2467a(r3);	 Catch:{ NoSuchAlgorithmException -> 0x0022, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019 }
        r2 = r0.verify(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0022, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019, InvalidKeyException -> 0x0019 }
        return r2;
    L_0x0019:
        r2 = move-exception;
        r3 = new a.b.a.c.c;
        r4 = "Validating signature failed";
        r3.<init>(r4, r2);
        throw r3;
    L_0x0022:
        r2 = new java.lang.IllegalStateException;
        r2.<init>();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.a.c.a.f.a(byte[], byte[], byte[]):boolean");
    }

    protected abstract byte[] mo2467a(byte[] bArr);

    protected abstract PublicKey mo2468b(byte[] bArr);
}
