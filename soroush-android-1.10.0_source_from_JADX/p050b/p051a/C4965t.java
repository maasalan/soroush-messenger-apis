package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

final class C4965t extends C0826n {
    double f13817a;

    public C4965t(double d, int i) {
        super(i);
        this.f13817a = d;
    }

    public C4965t(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13817a = dataInputStream.readDouble();
    }

    public final int mo830a() {
        return 6;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return c0827p2.m1865a(this.f13817a);
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(6);
        dataOutputStream.writeDouble(this.f13817a);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("Double ");
        printWriter.println(this.f13817a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4965t) && ((C4965t) obj).f13817a == this.f13817a;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f13817a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
