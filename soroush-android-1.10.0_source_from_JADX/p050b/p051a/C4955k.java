package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

final class C4955k extends C0826n {
    int f13797a;

    public C4955k(int i, int i2) {
        super(i2);
        this.f13797a = i;
    }

    public C4955k(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13797a = dataInputStream.readUnsignedShort();
    }

    public final int mo830a() {
        return 7;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        String j = c0827p.m1892j(this.f13797a);
        if (map != null) {
            String str = (String) map.get(j);
            if (str != null) {
                j = str;
            }
        }
        return c0827p2.m1873a(j);
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(7);
        dataOutputStream.writeShort(this.f13797a);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("Class #");
        printWriter.println(this.f13797a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4955k) && ((C4955k) obj).f13797a == this.f13797a;
    }

    public final int hashCode() {
        return this.f13797a;
    }
}
