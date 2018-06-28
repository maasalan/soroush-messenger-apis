package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

final class am extends C0826n {
    int f13742a;
    int f13743c;

    private am(int i, int i2, int i3) {
        super(i3);
        this.f13742a = i;
        this.f13743c = i2;
    }

    public am(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13742a = dataInputStream.readUnsignedByte();
        this.f13743c = dataInputStream.readUnsignedShort();
    }

    public final int mo830a() {
        return 15;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return c0827p2.m1871a(new am(this.f13742a, c0827p.m1875a(this.f13743c).mo831a(c0827p, c0827p2, map), c0827p2.f2481b));
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(15);
        dataOutputStream.writeByte(this.f13742a);
        dataOutputStream.writeShort(this.f13743c);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("MethodHandle #");
        printWriter.print(this.f13742a);
        printWriter.print(", index #");
        printWriter.println(this.f13743c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof am) {
            am amVar = (am) obj;
            if (amVar.f13742a == this.f13742a && amVar.f13743c == this.f13743c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13742a << 16) ^ this.f13743c;
    }
}
