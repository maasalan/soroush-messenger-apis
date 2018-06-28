package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

public final class aq extends C0826n {
    int f13745a;
    public int f13746c;

    public aq(int i, int i2, int i3) {
        super(i3);
        this.f13745a = i;
        this.f13746c = i2;
    }

    public aq(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13745a = dataInputStream.readUnsignedShort();
        this.f13746c = dataInputStream.readUnsignedShort();
    }

    public final int mo830a() {
        return 12;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return c0827p2.m1867a(c0827p2.m1883c(c0827p.m1892j(this.f13745a)), c0827p2.m1883c(C0828s.m1898a(c0827p.m1892j(this.f13746c), map)));
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(12);
        dataOutputStream.writeShort(this.f13745a);
        dataOutputStream.writeShort(this.f13746c);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("NameAndType #");
        printWriter.print(this.f13745a);
        printWriter.print(", type #");
        printWriter.println(this.f13746c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aq) {
            aq aqVar = (aq) obj;
            if (aqVar.f13745a == this.f13745a && aqVar.f13746c == this.f13746c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13745a << 16) ^ this.f13746c;
    }
}
