package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public final class C7113q extends ak<InetSocketAddress> {
    public C7113q() {
        super(InetSocketAddress.class);
    }

    private static void m18593a(InetSocketAddress inetSocketAddress, C5301g c5301g) {
        StringBuilder stringBuilder;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int indexOf = hostName.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                String stringBuilder2;
                if (address instanceof Inet6Address) {
                    stringBuilder = new StringBuilder("[");
                    stringBuilder.append(hostName.substring(1));
                    stringBuilder.append("]");
                    stringBuilder2 = stringBuilder.toString();
                } else {
                    stringBuilder2 = hostName.substring(1);
                }
                hostName = stringBuilder2;
            } else {
                hostName = hostName.substring(0, indexOf);
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(hostName);
        stringBuilder.append(":");
        stringBuilder.append(inetSocketAddress.getPort());
        c5301g.writeString(stringBuilder.toString());
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        C7113q.m18593a((InetSocketAddress) obj, c5301g);
    }

    public final /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        obj = (InetSocketAddress) obj;
        c1478f.mo2904a(obj, c5301g, InetSocketAddress.class);
        C7113q.m18593a(obj, c5301g);
        c1478f.mo2910d(obj, c5301g);
    }
}
