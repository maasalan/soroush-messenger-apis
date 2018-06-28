package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

final class az extends C0826n {
    String f13767a;

    public az(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13767a = dataInputStream.readUTF();
    }

    public az(String str, int i) {
        super(i);
        this.f13767a = str;
    }

    public final int mo830a() {
        return 1;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return c0827p2.m1883c(this.f13767a);
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(1);
        dataOutputStream.writeUTF(this.f13767a);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("UTF8 \"");
        printWriter.print(this.f13767a);
        printWriter.println("\"");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof az) && ((az) obj).f13767a.equals(this.f13767a);
    }

    public final int hashCode() {
        return this.f13767a.hashCode();
    }
}
