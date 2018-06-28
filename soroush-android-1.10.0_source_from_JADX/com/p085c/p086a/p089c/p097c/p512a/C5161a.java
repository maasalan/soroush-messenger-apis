package com.p085c.p086a.p089c.p097c.p512a;

import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C1210i;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C5109h;
import com.p085c.p086a.p089c.p097c.C1171l;
import com.p085c.p086a.p089c.p097c.C1171l.C1170a;
import com.p085c.p086a.p089c.p097c.C1173m;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p089c.p097c.C1174n;
import com.p085c.p086a.p089c.p097c.C1180q;
import com.p085c.p086a.p089c.p097c.C5190g;
import java.io.InputStream;
import org.jivesoftware.smack.tcp.XMPPTCPConnection.PacketWriter;

public final class C5161a implements C1173m<C5190g, InputStream> {
    public static final C1210i<Integer> f14475a = C1210i.m2867a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
    private final C1171l<C5190g, C5190g> f14476b;

    public static class C5160a implements C1174n<C5190g, InputStream> {
        private final C1171l<C5190g, C5190g> f14474a = new C1171l(PacketWriter.QUEUE_SIZE);

        public final C1173m<C5190g, InputStream> mo1184a(C1180q c1180q) {
            return new C5161a(this.f14474a);
        }
    }

    public C5161a() {
        this(null);
    }

    public C5161a(C1171l<C5190g, C5190g> c1171l) {
        this.f14476b = c1171l;
    }

    public final /* synthetic */ C1172a mo1185a(Object obj, int i, int i2, C5253j c5253j) {
        C1208h c1208h = (C5190g) obj;
        if (this.f14476b != null) {
            C5190g c5190g = (C5190g) this.f14476b.m2794a(c1208h);
            if (c5190g == null) {
                C1171l c1171l = this.f14476b;
                c1171l.f3735a.m3006b(C1170a.m2792a(c1208h), c1208h);
            } else {
                c1208h = c5190g;
            }
        }
        return new C1172a(c1208h, new C5109h(c1208h, ((Integer) c5253j.m10873a(f14475a)).intValue()));
    }

    public final /* bridge */ /* synthetic */ boolean mo1186a(Object obj) {
        return true;
    }
}
