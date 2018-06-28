package mobi.mmdt.ott.logic.p360l.p362b;

import java.util.HashMap;
import mobi.mmdt.ott.provider.p385g.C2978e;
import p000a.p001a.p002a.C0005c;

public final class C2844b {
    private static HashMap<C2978e, Integer> f8924a;

    public static synchronized int m7200a() {
        int d;
        synchronized (C2844b.class) {
            d = (C2844b.m7205d() + C2844b.m7203b()) + C2844b.m7204c();
        }
        return d;
    }

    private static synchronized int m7201a(C2978e c2978e) {
        synchronized (C2844b.class) {
            if (C2844b.m7206e().containsKey(c2978e)) {
                int intValue = ((Integer) C2844b.m7206e().get(c2978e)).intValue();
                return intValue;
            }
            return 0;
        }
    }

    public static synchronized void m7202a(HashMap<C2978e, Integer> hashMap) {
        synchronized (C2844b.class) {
            f8924a = hashMap;
            C2844b.m7207f();
        }
    }

    public static synchronized int m7203b() {
        int a;
        synchronized (C2844b.class) {
            a = C2844b.m7201a(C2978e.CHANNEL);
        }
        return a;
    }

    public static synchronized int m7204c() {
        int a;
        synchronized (C2844b.class) {
            a = C2844b.m7201a(C2978e.GROUP);
        }
        return a;
    }

    public static synchronized int m7205d() {
        int a;
        synchronized (C2844b.class) {
            a = C2844b.m7201a(C2978e.SINGLE);
        }
        return a;
    }

    private static HashMap<C2978e, Integer> m7206e() {
        if (f8924a == null) {
            f8924a = new HashMap();
        }
        return f8924a;
    }

    private static synchronized void m7207f() {
        synchronized (C2844b.class) {
            C0005c.m0a().m9d(new C2843a());
        }
    }
}
