package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

final class ao extends C0826n {
    int f13744a;

    private ao(int i, int i2) {
        super(i2);
        this.f13744a = i;
    }

    public ao(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13744a = dataInputStream.readUnsignedShort();
    }

    public final int mo830a() {
        return 16;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return c0827p2.m1871a(new ao(c0827p2.m1883c(C0828s.m1898a(c0827p.m1892j(this.f13744a), map)), c0827p2.f2481b));
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(16);
        dataOutputStream.writeShort(this.f13744a);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("MethodType #");
        printWriter.println(this.f13744a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ao) && ((ao) obj).f13744a == this.f13744a;
    }

    public final int hashCode() {
        return this.f13744a;
    }
}
