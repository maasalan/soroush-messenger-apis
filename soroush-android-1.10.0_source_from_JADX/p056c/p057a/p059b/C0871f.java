package p056c.p057a.p059b;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import p056c.C0914a;
import p056c.C0925e;
import p056c.C0942p;
import p056c.C0949t;
import p056c.ae;
import p056c.p057a.C0885c;

public final class C0871f {
    final C0914a f2599a;
    final C0868d f2600b;
    private final C0925e f2601c;
    private final C0942p f2602d;
    private List<Proxy> f2603e = Collections.emptyList();
    private int f2604f;
    private List<InetSocketAddress> f2605g = Collections.emptyList();
    private final List<ae> f2606h = new ArrayList();

    public static final class C0870a {
        final List<ae> f2597a;
        int f2598b = 0;

        C0870a(List<ae> list) {
            this.f2597a = list;
        }

        public final boolean m2045a() {
            return this.f2598b < this.f2597a.size();
        }
    }

    public C0871f(C0914a c0914a, C0868d c0868d, C0925e c0925e, C0942p c0942p) {
        List singletonList;
        this.f2599a = c0914a;
        this.f2600b = c0868d;
        this.f2601c = c0925e;
        this.f2602d = c0942p;
        C0949t c0949t = c0914a.f2785a;
        Proxy proxy = c0914a.f2792h;
        if (proxy != null) {
            singletonList = Collections.singletonList(proxy);
        } else {
            singletonList = this.f2599a.f2791g.select(c0949t.m2369b());
            if (singletonList == null || singletonList.isEmpty()) {
                singletonList = C0885c.m2095a(Proxy.NO_PROXY);
            } else {
                singletonList = C0885c.m2094a(singletonList);
            }
        }
        this.f2603e = singletonList;
        this.f2604f = 0;
    }

    private void m2046a(Proxy proxy) {
        String hostName;
        int port;
        List a;
        int size;
        int i;
        StringBuilder stringBuilder;
        this.f2605g = new ArrayList();
        if (proxy.type() != Type.DIRECT) {
            if (proxy.type() != Type.SOCKS) {
                SocketAddress address = proxy.address();
                if (address instanceof InetSocketAddress) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    InetAddress address2 = inetSocketAddress.getAddress();
                    hostName = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                    port = inetSocketAddress.getPort();
                    if (port > 0) {
                        if (port > InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
                            if (proxy.type() != Type.SOCKS) {
                                this.f2605g.add(InetSocketAddress.createUnresolved(hostName, port));
                                return;
                            }
                            C0942p.m2318b();
                            a = this.f2599a.f2786b.mo1005a(hostName);
                            if (a.isEmpty()) {
                                C0942p.m2319c();
                                size = a.size();
                                for (i = 0; i < size; i++) {
                                    this.f2605g.add(new InetSocketAddress((InetAddress) a.get(i), port));
                                }
                                return;
                            }
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(this.f2599a.f2786b);
                            stringBuilder2.append(" returned no addresses for ");
                            stringBuilder2.append(hostName);
                            throw new UnknownHostException(stringBuilder2.toString());
                        }
                    }
                    stringBuilder = new StringBuilder("No route to ");
                    stringBuilder.append(hostName);
                    stringBuilder.append(":");
                    stringBuilder.append(port);
                    stringBuilder.append("; port is out of range");
                    throw new SocketException(stringBuilder.toString());
                }
                StringBuilder stringBuilder3 = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                stringBuilder3.append(address.getClass());
                throw new IllegalArgumentException(stringBuilder3.toString());
            }
        }
        hostName = this.f2599a.f2785a.f3008b;
        port = this.f2599a.f2785a.f3009c;
        if (port > 0) {
            if (port > InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
                if (proxy.type() != Type.SOCKS) {
                    C0942p.m2318b();
                    a = this.f2599a.f2786b.mo1005a(hostName);
                    if (a.isEmpty()) {
                        C0942p.m2319c();
                        size = a.size();
                        for (i = 0; i < size; i++) {
                            this.f2605g.add(new InetSocketAddress((InetAddress) a.get(i), port));
                        }
                        return;
                    }
                    StringBuilder stringBuilder22 = new StringBuilder();
                    stringBuilder22.append(this.f2599a.f2786b);
                    stringBuilder22.append(" returned no addresses for ");
                    stringBuilder22.append(hostName);
                    throw new UnknownHostException(stringBuilder22.toString());
                }
                this.f2605g.add(InetSocketAddress.createUnresolved(hostName, port));
                return;
            }
        }
        stringBuilder = new StringBuilder("No route to ");
        stringBuilder.append(hostName);
        stringBuilder.append(":");
        stringBuilder.append(port);
        stringBuilder.append("; port is out of range");
        throw new SocketException(stringBuilder.toString());
    }

    private boolean m2047c() {
        return this.f2604f < this.f2603e.size();
    }

    public final boolean m2048a() {
        if (!m2047c()) {
            if (this.f2606h.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final C0870a m2049b() {
        if (m2048a()) {
            List arrayList = new ArrayList();
            while (m2047c()) {
                if (m2047c()) {
                    List list = this.f2603e;
                    int i = this.f2604f;
                    this.f2604f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    m2046a(proxy);
                    int size = this.f2605g.size();
                    for (i = 0; i < size; i++) {
                        ae aeVar = new ae(this.f2599a, proxy, (InetSocketAddress) this.f2605g.get(i));
                        if (this.f2600b.m2043c(aeVar)) {
                            this.f2606h.add(aeVar);
                        } else {
                            arrayList.add(aeVar);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("No route to ");
                stringBuilder.append(this.f2599a.f2785a.f3008b);
                stringBuilder.append("; exhausted proxy configurations: ");
                stringBuilder.append(this.f2603e);
                throw new SocketException(stringBuilder.toString());
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f2606h);
                this.f2606h.clear();
            }
            return new C0870a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
