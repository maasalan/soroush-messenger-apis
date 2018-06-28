package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

public abstract class al extends C0826n {
    public int f13740a;
    public int f13741c;

    public al(int i, int i2, int i3) {
        super(i3);
        this.f13740a = i;
        this.f13741c = i2;
    }

    public al(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13740a = dataInputStream.readUnsignedShort();
        this.f13741c = dataInputStream.readUnsignedShort();
    }

    protected abstract int mo2657a(C0827p c0827p, int i, int i2);

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return mo2657a(c0827p2, c0827p.m1875a(this.f13740a).mo831a(c0827p, c0827p2, map), c0827p.m1875a(this.f13741c).mo831a(c0827p, c0827p2, map));
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(mo830a());
        dataOutputStream.writeShort(this.f13740a);
        dataOutputStream.writeShort(this.f13741c);
    }

    public final void mo833a(PrintWriter printWriter) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mo2658b());
        stringBuilder.append(" #");
        printWriter.print(stringBuilder.toString());
        printWriter.print(this.f13740a);
        printWriter.print(", name&type #");
        printWriter.println(this.f13741c);
    }

    public abstract String mo2658b();

    public boolean equals(Object obj) {
        if (obj instanceof al) {
            al alVar = (al) obj;
            if (alVar.f13740a == this.f13740a && alVar.f13741c == this.f13741c && alVar.getClass() == getClass()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f13740a << 16) ^ this.f13741c;
    }
}
