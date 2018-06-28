package p000a.p003b.p004a.p014i;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import org.msgpack.util.TemplatePrecompiler;
import p000a.p003b.p004a.C0044e;

public class C4667s extends C0061g {
    public final int f12845a;
    public final int f12846b;
    public final int f12847c;
    public final C0044e f12848d;

    private C4667s(int i, int i2, int i3, C0044e c0044e) {
        this.f12845a = i;
        this.f12846b = i2;
        this.f12847c = i3;
        this.f12848d = c0044e;
    }

    public static C4667s m8507a(DataInputStream dataInputStream, byte[] bArr) {
        return new C4667s(dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), dataInputStream.readUnsignedShort(), C0044e.m71a(dataInputStream, bArr));
    }

    public final void mo18a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.f12845a);
        dataOutputStream.writeShort(this.f12846b);
        dataOutputStream.writeShort(this.f12847c);
        this.f12848d.m79a((OutputStream) dataOutputStream);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12845a);
        stringBuilder.append(" ");
        stringBuilder.append(this.f12846b);
        stringBuilder.append(" ");
        stringBuilder.append(this.f12847c);
        stringBuilder.append(" ");
        stringBuilder.append(this.f12848d);
        stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
        return stringBuilder.toString();
    }
}
