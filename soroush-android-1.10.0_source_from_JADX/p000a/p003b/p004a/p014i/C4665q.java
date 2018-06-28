package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import p000a.p003b.p004a.C0044e;
import p000a.p003b.p004a.C0049f.C4647b;
import p000a.p003b.p004a.C0076k.C0070b;

public class C4665q extends C0061g {
    static final /* synthetic */ boolean f12827l = true;
    public final C0070b f12828a;
    public final C4647b f12829b;
    public final byte f12830c;
    public final byte f12831d;
    public final long f12832e;
    public final Date f12833f;
    public final Date f12834g;
    public final int f12835i;
    public final C0044e f12836j;
    public final byte[] f12837k;

    private C4665q(C0070b c0070b, byte b, byte b2, long j, Date date, Date date2, int i, C0044e c0044e, byte[] bArr) {
        this.f12828a = c0070b;
        if (f12827l || b == b) {
            this.f12830c = b;
            this.f12829b = C4647b.m86a(b);
            this.f12831d = b2;
            this.f12832e = j;
            this.f12833f = date;
            this.f12834g = date2;
            this.f12835i = i;
            this.f12836j = c0044e;
            this.f12837k = bArr;
            return;
        }
        throw new AssertionError();
    }

    public static C4665q m8503a(DataInputStream dataInputStream, byte[] bArr, int i) {
        C0070b a = C0070b.m113a(dataInputStream.readUnsignedShort());
        byte readByte = dataInputStream.readByte();
        byte readByte2 = dataInputStream.readByte();
        long readInt = ((long) dataInputStream.readInt()) & 4294967295L;
        Date date = new Date((((long) dataInputStream.readInt()) & 4294967295L) * 1000);
        Date date2 = new Date((((long) dataInputStream.readInt()) & 4294967295L) * 1000);
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        C0044e a2 = C0044e.m71a(dataInputStream, bArr);
        byte[] bArr2 = new byte[((i - a2.m81b()) - 18)];
        if (dataInputStream.read(bArr2) == bArr2.length) {
            return new C4665q(a, readByte, readByte2, readInt, date, date2, readUnsignedShort, a2, bArr2);
        }
        throw new IOException();
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        m8505b(dataOutputStream);
        dataOutputStream.write(this.f12837k);
    }

    public final void m8505b(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.f12828a.aF);
        dataOutputStream.writeByte(this.f12830c);
        dataOutputStream.writeByte(this.f12831d);
        dataOutputStream.writeInt((int) this.f12832e);
        dataOutputStream.writeInt((int) (this.f12833f.getTime() / 1000));
        dataOutputStream.writeInt((int) (this.f12834g.getTime() / 1000));
        dataOutputStream.writeShort(this.f12835i);
        this.f12836j.m79a((OutputStream) dataOutputStream);
    }

    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12828a);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12829b);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12831d);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12832e);
        stringBuilder.append(' ');
        stringBuilder.append(simpleDateFormat.format(this.f12833f));
        stringBuilder.append(' ');
        stringBuilder.append(simpleDateFormat.format(this.f12834g));
        stringBuilder.append(' ');
        stringBuilder.append(this.f12835i);
        stringBuilder.append(' ');
        stringBuilder.append(this.f12836j);
        stringBuilder.append(". ");
        stringBuilder.append(p000a.p003b.p004a.p016k.C0070b.m117a(this.f12837k));
        return stringBuilder.toString();
    }
}
