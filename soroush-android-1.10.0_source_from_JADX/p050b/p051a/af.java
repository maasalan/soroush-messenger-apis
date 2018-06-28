package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

public final class af extends C0826n {
    int f13737a;
    public int f13738c;

    private af(int i, int i2, int i3) {
        super(i3);
        this.f13737a = i;
        this.f13738c = i2;
    }

    public af(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13737a = dataInputStream.readUnsignedShort();
        this.f13738c = dataInputStream.readUnsignedShort();
    }

    public final int mo830a() {
        return 18;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return c0827p2.m1871a(new af(this.f13737a, c0827p.m1875a(this.f13738c).mo831a(c0827p, c0827p2, map), c0827p2.f2481b));
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(18);
        dataOutputStream.writeShort(this.f13737a);
        dataOutputStream.writeShort(this.f13738c);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("InvokeDynamic #");
        printWriter.print(this.f13737a);
        printWriter.print(", name&type #");
        printWriter.println(this.f13738c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof af) {
            af afVar = (af) obj;
            if (afVar.f13737a == this.f13737a && afVar.f13738c == this.f13738c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13737a << 16) ^ this.f13738c;
    }
}
