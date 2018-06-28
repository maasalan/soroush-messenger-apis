package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

final class ad extends C0826n {
    int f13736a;

    public ad(int i, int i2) {
        super(i2);
        this.f13736a = i;
    }

    public ad(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13736a = dataInputStream.readInt();
    }

    public final int mo830a() {
        return 3;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return c0827p2.m1893k(this.f13736a);
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeInt(this.f13736a);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("Integer ");
        printWriter.println(this.f13736a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ad) && ((ad) obj).f13736a == this.f13736a;
    }

    public final int hashCode() {
        return this.f13736a;
    }
}
