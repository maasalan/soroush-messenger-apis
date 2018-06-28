package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import p000a.p003b.p004a.C0049f.C4646a;
import p000a.p003b.p004a.C0049f.C4647b;

public class C4657f extends C0061g {
    static final /* synthetic */ boolean f12793g = true;
    public final int f12794a;
    public final C4647b f12795b;
    public final byte f12796c;
    public final C4646a f12797d;
    public final byte f12798e;
    protected final byte[] f12799f;

    private C4657f(int i, byte b, byte b2, byte[] bArr) {
        this(i, null, b, null, b2, bArr);
    }

    private C4657f(int i, C4647b c4647b, byte b, C4646a c4646a, byte b2, byte[] bArr) {
        this.f12794a = i;
        if (!f12793g) {
            if (b != (c4647b != null ? c4647b.f213o : b)) {
                throw new AssertionError();
            }
        }
        this.f12796c = b;
        if (c4647b == null) {
            c4647b = C4647b.m86a(b);
        }
        this.f12795b = c4647b;
        if (!f12793g) {
            if (b2 != (c4646a != null ? c4646a.f196e : b2)) {
                throw new AssertionError();
            }
        }
        this.f12798e = b2;
        if (c4646a == null) {
            c4646a = C4646a.m85a(b2);
        }
        this.f12797d = c4646a;
        if (f12793g || bArr != null) {
            this.f12799f = bArr;
            return;
        }
        throw new AssertionError();
    }

    public C4657f(int i, C4647b c4647b, C4646a c4646a, byte[] bArr) {
        this(i, c4647b, c4647b.f213o, c4646a, c4646a.f196e, bArr);
    }

    public static C4657f m8484b(DataInputStream dataInputStream, int i) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte[] bArr = new byte[(i - 4)];
        if (dataInputStream.read(bArr) == bArr.length) {
            return new C4657f(readUnsignedShort, readByte, readByte2, bArr);
        }
        throw new IOException();
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.f12794a);
        dataOutputStream.writeByte(this.f12796c);
        dataOutputStream.writeByte(this.f12798e);
        dataOutputStream.write(this.f12799f);
    }

    public final boolean m8486a(byte[] bArr) {
        return Arrays.equals(this.f12799f, bArr);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12794a);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12795b);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12797d);
        stringBuilder.append(' ');
        stringBuilder.append(new BigInteger(1, this.f12799f).toString(16).toUpperCase());
        return stringBuilder.toString();
    }
}
