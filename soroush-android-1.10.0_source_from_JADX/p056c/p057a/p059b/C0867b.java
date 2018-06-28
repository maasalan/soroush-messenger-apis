package p056c.p057a.p059b;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p056c.C0936k;

public final class C0867b {
    final List<C0936k> f2590a;
    int f2591b = 0;
    boolean f2592c;
    boolean f2593d;

    public C0867b(List<C0936k> list) {
        this.f2590a = list;
    }

    final boolean m2040a(SSLSocket sSLSocket) {
        for (int i = this.f2591b; i < this.f2590a.size(); i++) {
            if (((C0936k) this.f2590a.get(i)).m2298a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
