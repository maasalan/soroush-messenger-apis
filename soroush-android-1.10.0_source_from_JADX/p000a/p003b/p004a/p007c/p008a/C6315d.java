package p000a.p003b.p004a.p007c.p008a;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import p000a.p003b.p004a.p007c.C0030c;

final class C6315d extends C4630f {
    private static final ECParameterSpec f17258b = new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD97", 16)), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFD94", 16), new BigInteger("A6", 16)), new ECPoint(BigInteger.ONE, new BigInteger("8D91E471E0989CDA27DF505A453F2B7635294F2DDF23E3B122ACC99C9E9F1E14", 16)), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF6C611070995AD10045841B09B761B893", 16), 1);

    public C6315d() {
        super("ECGOST3410", "GOST3411withECGOST3410");
    }

    private static void m14778c(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            int i2 = (32 - i) - 1;
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
    }

    protected final byte[] mo2467a(byte[] bArr) {
        return bArr;
    }

    protected final PublicKey mo2468b(byte[] bArr) {
        DataInput dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            byte[] bArr2 = new byte[32];
            dataInputStream.readFully(bArr2);
            C6315d.m14778c(bArr2);
            BigInteger bigInteger = new BigInteger(1, bArr2);
            bArr = new byte[32];
            dataInputStream.readFully(bArr);
            C6315d.m14778c(bArr);
            return this.f12736a.generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, new BigInteger(1, bArr)), f17258b));
        } catch (Throwable e) {
            throw new C0030c("Invalid public key!", e);
        }
    }
}
