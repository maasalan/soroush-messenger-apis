package p000a.p003b.p004a.p007c.p008a;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import p000a.p003b.p004a.p007c.C0030c;

abstract class C6314c extends C4630f {
    private final ECParameterSpec f17256b;
    private final int f17257c;

    public static class C7007a extends C6314c {
        private static BigInteger[] f20010b = new BigInteger[]{new BigInteger("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF", 16), new BigInteger("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC", 16), new BigInteger("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B", 16), new BigInteger("6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296", 16), new BigInteger("4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5", 16), new BigInteger("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551", 16)};

        public C7007a() {
            super(f20010b, 32, "SHA256withECDSA");
        }
    }

    public static class C7008b extends C6314c {
        private static BigInteger[] f20011b = new BigInteger[]{new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF", 16), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC", 16), new BigInteger("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF", 16), new BigInteger("AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7", 16), new BigInteger("3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F", 16), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973", 16)};

        public C7008b() {
            super(f20011b, 48, "SHA384withECDSA");
        }
    }

    private C6314c(ECParameterSpec eCParameterSpec, int i, String str) {
        super("EC", str);
        this.f17257c = i;
        this.f17256b = eCParameterSpec;
    }

    public C6314c(BigInteger[] bigIntegerArr, int i, String str) {
        this(new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigIntegerArr[0]), bigIntegerArr[1], bigIntegerArr[2]), new ECPoint(bigIntegerArr[3], bigIntegerArr[4]), bigIntegerArr[5], 1), i, str);
    }

    protected final byte[] mo2467a(byte[] bArr) {
        DataInput dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            byte[] bArr2 = new byte[this.f17257c];
            dataInputStream.readFully(bArr2);
            int i = bArr2[0] < (byte) 0 ? this.f17257c + 1 : this.f17257c;
            byte[] bArr3 = new byte[this.f17257c];
            dataInputStream.readFully(bArr3);
            int i2 = bArr3[0] < (byte) 0 ? this.f17257c + 1 : this.f17257c;
            dataOutputStream.writeByte(48);
            dataOutputStream.writeByte((i + i2) + 4);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i);
            if (i > this.f17257c) {
                dataOutputStream.writeByte(0);
            }
            dataOutputStream.write(bArr2);
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(i2);
            if (i2 > this.f17257c) {
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
            bArr = new byte[this.f17257c];
            dataInputStream.readFully(bArr);
            BigInteger bigInteger = new BigInteger(1, bArr);
            bArr = new byte[this.f17257c];
            dataInputStream.readFully(bArr);
            return this.f12736a.generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, new BigInteger(1, bArr)), this.f17256b));
        } catch (Throwable e) {
            throw new C0030c("Invalid public key!", e);
        }
    }
}
