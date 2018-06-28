package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smack.util.StringUtils;
import p000a.p003b.p004a.C0076k.C0070b;
import p000a.p003b.p004a.p016k.C0069a;

public class C4661l extends C0061g {
    static final /* synthetic */ boolean f12807i = true;
    private static final Map<Byte, C0062a> f12808j = new HashMap();
    public final C0062a f12809a;
    public final byte f12810b;
    public final byte f12811c;
    public final int f12812d;
    public final byte[] f12813e;
    public final byte[] f12814f;
    public final C0070b[] f12815g;
    private final byte[] f12816k;

    public enum C0062a {
        RESERVED(0, "Reserved"),
        SHA1(1, StringUtils.SHA1);
        
        public final byte f266c;
        public final String f267d;

        private C0062a(int i, String str) {
            if (i >= 0) {
                if (i <= 255) {
                    this.f266c = (byte) i;
                    this.f267d = str;
                    C4661l.f12808j.put(Byte.valueOf(this.f266c), this);
                    return;
                }
            }
            throw new IllegalArgumentException();
        }

        public static C0062a m108a(byte b) {
            return (C0062a) C4661l.f12808j.get(Byte.valueOf(b));
        }
    }

    private C4661l(byte b, byte b2, int i, byte[] bArr, byte[] bArr2, C0070b[] c0070bArr) {
        if (f12807i || b == b) {
            this.f12810b = b;
            this.f12809a = C0062a.m108a(b);
            this.f12811c = b2;
            this.f12812d = i;
            this.f12813e = bArr;
            this.f12814f = bArr2;
            this.f12815g = c0070bArr;
            this.f12816k = C4660k.m8492a(c0070bArr);
            return;
        }
        throw new AssertionError();
    }

    private C4661l(byte b, byte b2, int i, byte[] bArr, byte[] bArr2, C0070b[] c0070bArr, byte b3) {
        this(b, b2, i, bArr, bArr2, c0070bArr);
    }

    public static C4661l m8495a(DataInputStream dataInputStream, int i) {
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        byte[] bArr = new byte[readUnsignedByte];
        if (dataInputStream.read(bArr) != readUnsignedByte) {
            throw new IOException();
        }
        int readUnsignedByte2 = dataInputStream.readUnsignedByte();
        byte[] bArr2 = new byte[readUnsignedByte2];
        if (dataInputStream.read(bArr2) != readUnsignedByte2) {
            throw new IOException();
        }
        byte[] bArr3 = new byte[(i - ((6 + readUnsignedByte) + readUnsignedByte2))];
        if (dataInputStream.read(bArr3) == bArr3.length) {
            return new C4661l(readByte, readByte2, readUnsignedShort, bArr, bArr2, C4660k.m8493a(bArr3), (byte) 0);
        }
        throw new IOException();
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(this.f12810b);
        dataOutputStream.writeByte(this.f12811c);
        dataOutputStream.writeShort(this.f12812d);
        dataOutputStream.writeByte(this.f12813e.length);
        dataOutputStream.write(this.f12813e);
        dataOutputStream.writeByte(this.f12814f.length);
        dataOutputStream.write(this.f12814f);
        dataOutputStream.write(this.f12816k);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12809a);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12811c);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12812d);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12813e.length == 0 ? "-" : new BigInteger(1, this.f12813e).toString(16).toUpperCase());
        stringBuilder.append(' ');
        stringBuilder.append(C0069a.m116a(this.f12814f));
        for (Object obj : this.f12815g) {
            stringBuilder.append(' ');
            stringBuilder.append(obj);
        }
        return stringBuilder.toString();
    }
}
