package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;

final class aj extends C0826n {
    long f13739a;

    public aj(long j, int i) {
        super(i);
        this.f13739a = j;
    }

    public aj(DataInputStream dataInputStream, int i) {
        super(i);
        this.f13739a = dataInputStream.readLong();
    }

    public final int mo830a() {
        return 5;
    }

    public final int mo831a(C0827p c0827p, C0827p c0827p2, Map map) {
        return c0827p2.m1870a(this.f13739a);
    }

    public final void mo832a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(5);
        dataOutputStream.writeLong(this.f13739a);
    }

    public final void mo833a(PrintWriter printWriter) {
        printWriter.print("Long ");
        printWriter.println(this.f13739a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aj) && ((aj) obj).f13739a == this.f13739a;
    }

    public final int hashCode() {
        return (int) (this.f13739a ^ (this.f13739a >>> 32));
    }
}
