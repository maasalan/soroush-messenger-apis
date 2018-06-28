package p000a.p003b.p004a.p007c.p008a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.DSAPublicKeySpec;
import p000a.p003b.p004a.p007c.C0030c;

final class C6313b extends C4630f {
    public C6313b(String str) {
        super("DSA", str);
    }

    protected final byte[] mo2467a(byte[] bArr) {
        DataInput dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataInputStream.readByte();
            byte[] bArr2 = new byte[20];
            dataInputStream.readFully(bArr2);
            int i = 21;
            int i2 = bArr2[0] < (byte) 0 ? 21 : 20;
            byte[] bArr3 = new byte[20];
            dataInputStream.readFully(bArr3);
            if (bArr3[0] >= (byte) 0) {
                i = 20;
            }
            dataOutputStream.writeByte(48);
            dataOutputStream.writeByte((i2 + i) + 4);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i2);
            if (i2 > 20) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr2);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i);
            if (i > 20) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr3);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            throw new C0030c("Invalid signature!", e);
        }
    }

    protected final PublicKey mo2468b(byte[] bArr) {
        DataInput dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            byte[] bArr2 = new byte[20];
            dataInputStream.readFully(bArr2);
            BigInteger bigInteger = new BigInteger(1, bArr2);
            int i = 64 + (readUnsignedByte * 8);
            bArr = new byte[i];
            dataInputStream.readFully(bArr);
            BigInteger bigInteger2 = new BigInteger(1, bArr);
            bArr = new byte[i];
            dataInputStream.readFully(bArr);
            BigInteger bigInteger3 = new BigInteger(1, bArr);
            bArr = new byte[i];
            dataInputStream.readFully(bArr);
            return this.f12736a.generatePublic(new DSAPublicKeySpec(new BigInteger(1, bArr), bigInteger2, bigInteger, bigInteger3));
        } catch (Throwable e) {
            throw new C0030c("Invalid public key!", e);
        }
    }
}
