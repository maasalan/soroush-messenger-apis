package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

final class ab extends C0826n {
    float f13735a;

    public ab(float f, int i) {
        super(i);
        this.f13735a = f;
    }

    public ab(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13735a = dataInputStream.readFloat();
    }

    public final int mo830a() {
        return 4;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return c0827p2.m1866a(this.f13735a);
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(4);
        dataOutputStream.writeFloat(this.f13735a);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("Float ");
        printWriter.println(this.f13735a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ab) && ((ab) obj).f13735a == this.f13735a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13735a);
    }
}
