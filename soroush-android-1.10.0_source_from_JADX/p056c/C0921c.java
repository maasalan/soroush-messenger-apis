package p056c;

import java.io.Closeable;
import java.io.Flushable;
import p056c.p057a.p058a.C0864d;
import p056c.p057a.p058a.C0865e;

public final class C0921c implements Closeable, Flushable {
    final C0865e f2854a;
    final C0864d f2855b;

    public final void close() {
        this.f2855b.close();
    }

    public final void flush() {
        this.f2855b.flush();
    }
}
