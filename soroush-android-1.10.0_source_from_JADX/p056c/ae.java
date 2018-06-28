package p056c;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

public final class ae {
    public final C0914a f2837a;
    public final Proxy f2838b;
    public final InetSocketAddress f2839c;

    public ae(C0914a c0914a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c0914a == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        } else {
            this.f2837a = c0914a;
            this.f2838b = proxy;
            this.f2839c = inetSocketAddress;
        }
    }

    public final boolean m2272a() {
        return this.f2837a.f2793i != null && this.f2838b.type() == Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ae) {
            ae aeVar = (ae) obj;
            if (aeVar.f2837a.equals(this.f2837a) && aeVar.f2838b.equals(this.f2838b) && aeVar.f2839c.equals(this.f2839c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (31 * (((527 + this.f2837a.hashCode()) * 31) + this.f2838b.hashCode())) + this.f2839c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Route{");
        stringBuilder.append(this.f2839c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
