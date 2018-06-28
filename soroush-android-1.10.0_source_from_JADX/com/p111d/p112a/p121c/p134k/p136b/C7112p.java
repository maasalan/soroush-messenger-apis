package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.net.InetAddress;

public final class C7112p extends ak<InetAddress> {
    public C7112p() {
        super(InetAddress.class);
    }

    private static void m18592a(InetAddress inetAddress, C5301g c5301g) {
        String trim = inetAddress.toString().trim();
        int indexOf = trim.indexOf(47);
        if (indexOf >= 0) {
            trim = indexOf == 0 ? trim.substring(1) : trim.substring(0, indexOf);
        }
        c5301g.writeString(trim);
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        C7112p.m18592a((InetAddress) obj, c5301g);
    }

    public final /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        obj = (InetAddress) obj;
        c1478f.mo2904a(obj, c5301g, InetAddress.class);
        C7112p.m18592a(obj, c5301g);
        c1478f.mo2910d(obj, c5301g);
    }
}
