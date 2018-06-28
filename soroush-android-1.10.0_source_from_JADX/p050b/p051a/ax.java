package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

public final class ax extends C0826n {
    public int f13766a;

    public ax(int i, int i2) {
        super(i2);
        this.f13766a = i;
    }

    public ax(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13766a = dataInputStream.readUnsignedShort();
    }

    public final int mo830a() {
        return 8;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return c0827p2.m1881b(c0827p.m1892j(this.f13766a));
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(8);
        dataOutputStream.writeShort(this.f13766a);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("String #");
        printWriter.println(this.f13766a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ax) && ((ax) obj).f13766a == this.f13766a;
    }

    public final int hashCode() {
        return this.f13766a;
    }
}
