package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import p000a.p003b.p004a.C0049f.C4647b;
import p000a.p003b.p004a.p016k.C0070b;

public class C4656e extends C0061g {
    static final /* synthetic */ boolean f12786f = true;
    public final short f12787a;
    public final byte f12788b;
    public final C4647b f12789c;
    public final byte f12790d;
    public final byte[] f12791e;
    private Integer f12792g;

    private C4656e(short s, byte b, byte b2, byte[] bArr) {
        this(s, b, C4647b.m86a(b2), bArr);
    }

    private C4656e(short s, byte b, C4647b c4647b, byte b2, byte[] bArr) {
        this.f12787a = s;
        this.f12788b = b;
        if (!f12786f) {
            if (b2 != (c4647b != null ? c4647b.f213o : b2)) {
                throw new AssertionError();
            }
        }
        this.f12790d = b2;
        if (c4647b == null) {
            c4647b = C4647b.m86a(b2);
        }
        this.f12789c = c4647b;
        this.f12791e = bArr;
    }

    private C4656e(short s, byte b, C4647b c4647b, byte[] bArr) {
        this(s, b, c4647b, c4647b.f213o, bArr);
    }

    public static C4656e m8480a(DataInputStream dataInputStream, int i) {
        short readShort = dataInputStream.readShort();
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        byte[] bArr = new byte[(i - 4)];
        dataInputStream.readFully(bArr);
        return new C4656e(readShort, readByte, readByte2, bArr);
    }

    public final int m8481a() {
        if (this.f12792g == null) {
            byte[] e = m107e();
            long j = 0;
            int i = 0;
            while (i < e.length) {
                long j2 = (i & 1) > 0 ? ((long) e[i]) & 255 : (((long) e[i]) & 255) << 8;
                i++;
                j += j2;
            }
            this.f12792g = Integer.valueOf((int) ((j + ((j >> 16) & 65535)) & 65535));
        }
        return this.f12792g.intValue();
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.f12787a);
        dataOutputStream.writeByte(this.f12788b);
        dataOutputStream.writeByte(this.f12789c.f213o);
        dataOutputStream.write(this.f12791e);
    }

    public final byte[] m8483b() {
        return (byte[]) this.f12791e.clone();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12787a);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12788b);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12789c);
        stringBuilder.append(' ');
        stringBuilder.append(C0070b.m117a(this.f12791e));
        return stringBuilder.toString();
    }
}
