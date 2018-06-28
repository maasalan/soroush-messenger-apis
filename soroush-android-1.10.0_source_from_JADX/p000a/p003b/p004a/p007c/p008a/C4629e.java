package p000a.p003b.p004a.p007c.p008a;

import java.security.MessageDigest;
import p000a.p003b.p004a.p007c.C0032e;

public final class C4629e implements C0032e {
    private MessageDigest f12735a;

    public C4629e(String str) {
        this.f12735a = MessageDigest.getInstance(str);
    }

    public final byte[] mo3a(byte[] bArr) {
        return this.f12735a.digest(bArr);
    }
}
