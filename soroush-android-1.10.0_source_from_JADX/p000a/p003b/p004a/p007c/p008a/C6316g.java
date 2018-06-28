package p000a.p003b.p004a.p007c.p008a;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;
import p000a.p003b.p004a.p007c.C0030c;

final class C6316g extends C4630f {
    public C6316g(String str) {
        super("RSA", str);
    }

    protected final byte[] mo2467a(byte[] bArr) {
        return bArr;
    }

    protected final PublicKey mo2468b(byte[] bArr) {
        DataInput dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            int i;
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            if (readUnsignedByte == 0) {
                i = 3;
                readUnsignedByte = dataInputStream.readUnsignedShort();
            } else {
                i = 1;
            }
            byte[] bArr2 = new byte[readUnsignedByte];
            dataInputStream.readFully(bArr2);
            i += readUnsignedByte;
            BigInteger bigInteger = new BigInteger(1, bArr2);
            bArr = new byte[(bArr.length - i)];
            dataInputStream.readFully(bArr);
            return this.f12736a.generatePublic(new RSAPublicKeySpec(new BigInteger(1, bArr), bigInteger));
        } catch (Throwable e) {
            throw new C0030c("Invalid public key!", e);
        }
    }
}
