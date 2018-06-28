package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import p000a.p003b.p004a.p014i.C4661l.C0062a;

public class C4662m extends C0061g {
    static final /* synthetic */ boolean f12817e = true;
    public final C0062a f12818a;
    public final byte f12819b;
    public final byte f12820c;
    public final int f12821d;
    private final byte[] f12822f;

    private C4662m(byte b, byte b2, int i, byte[] bArr) {
        if (f12817e || b == b) {
            this.f12819b = b;
            this.f12818a = C0062a.m108a(b);
            this.f12820c = b2;
            this.f12821d = i;
            this.f12822f = bArr;
            return;
        }
        throw new AssertionError();
    }

    private C4662m(byte b, byte b2, int i, byte[] bArr, byte b3) {
        this(b, b2, i, bArr);
    }

    public static C4662m m8498a(DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        byte[] bArr = new byte[readUnsignedByte];
        if (dataInputStream.read(bArr) == readUnsignedByte || readUnsignedByte == 0) {
            return new C4662m(readByte, readByte2, readUnsignedShort, bArr, (byte) 0);
        }
        throw new IOException();
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f12819b);
        dataOutputStream.writeByte(this.f12820c);
        dataOutputStream.writeShort(this.f12821d);
        dataOutputStream.writeByte(this.f12822f.length);
        dataOutputStream.write(this.f12822f);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12818a);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12820c);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12821d);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12822f.length == 0 ? "-" : new BigInteger(1, this.f12822f).toString(16).toUpperCase());
        return stringBuilder.toString();
    }
}
