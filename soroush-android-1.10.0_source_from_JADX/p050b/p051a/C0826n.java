package p050b.p051a;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

abstract class C0826n {
    int f2478b;

    public C0826n(int i) {
        this.f2478b = i;
    }

    public abstract int mo830a();

    public abstract int mo831a(C0827p c0827p, C0827p c0827p2, Map map);

    public abstract void mo832a(DataOutputStream dataOutputStream);

    public abstract void mo833a(PrintWriter printWriter);

    public String toString() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo833a(new PrintWriter(byteArrayOutputStream));
        return byteArrayOutputStream.toString();
    }
}
