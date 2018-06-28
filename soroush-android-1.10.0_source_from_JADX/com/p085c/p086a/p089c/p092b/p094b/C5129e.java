package com.p085c.p086a.p089c.p092b.p094b;

import android.util.Log;
import com.p085c.p086a.p087a.C1082a;
import com.p085c.p086a.p087a.C1082a.C1079b;
import com.p085c.p086a.p087a.C1082a.C1081d;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.p092b.p094b.C1115a.C1114b;
import com.p085c.p086a.p089c.p092b.p094b.C1118c.C1116a;
import java.io.File;

public final class C5129e implements C1115a {
    private static C5129e f14342a;
    private final C1125j f14343b;
    private final File f14344c;
    private final int f14345d;
    private final C1118c f14346e = new C1118c();
    private C1082a f14347f;

    private C5129e(File file, int i) {
        this.f14344c = file;
        this.f14345d = i;
        this.f14343b = new C1125j();
    }

    private synchronized C1082a m10546a() {
        if (this.f14347f == null) {
            this.f14347f = C1082a.m2607a(this.f14344c, (long) this.f14345d);
        }
        return this.f14347f;
    }

    public static synchronized C1115a m10547a(File file, int i) {
        C1115a c1115a;
        synchronized (C5129e.class) {
            if (f14342a == null) {
                f14342a = new C5129e(file, i);
            }
            c1115a = f14342a;
        }
        return c1115a;
    }

    public final File mo1144a(C1208h c1208h) {
        String a = this.f14343b.m2725a(c1208h);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder stringBuilder = new StringBuilder("Get: Obtained: ");
            stringBuilder.append(a);
            stringBuilder.append(" for for Key: ");
            stringBuilder.append(c1208h);
            Log.v("DiskLruCacheWrapper", stringBuilder.toString());
        }
        try {
            C1081d a2 = m10546a().m2626a(a);
            if (a2 != null) {
                return a2.f3530a[0];
            }
        } catch (Throwable e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            }
        }
        return null;
    }

    public final void mo1145a(C1208h c1208h, C1114b c1114b) {
        C1116a c1116a;
        C1118c c1118c = this.f14346e;
        synchronized (c1118c) {
            c1116a = (C1116a) c1118c.f3615a.get(c1208h);
            if (c1116a == null) {
                c1116a = c1118c.f3616b.m2710a();
                c1118c.f3615a.put(c1208h, c1116a);
            }
            c1116a.f3613b++;
        }
        c1116a.f3612a.lock();
        try {
            String a = this.f14343b.m2725a(c1208h);
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder stringBuilder = new StringBuilder("Put: Obtained: ");
                stringBuilder.append(a);
                stringBuilder.append(" for for Key: ");
                stringBuilder.append(c1208h);
                Log.v("DiskLruCacheWrapper", stringBuilder.toString());
            }
            C1079b b;
            try {
                C1082a a2 = m10546a();
                if (a2.m2626a(a) == null) {
                    b = a2.m2627b(a);
                    if (b == null) {
                        StringBuilder stringBuilder2 = new StringBuilder("Had two simultaneous puts for: ");
                        stringBuilder2.append(a);
                        throw new IllegalStateException(stringBuilder2.toString());
                    }
                    if (c1114b.mo1162a(b.m2601a())) {
                        b.f3521d.m2610a(b, true);
                        b.f3520c = true;
                    }
                    b.m2603c();
                }
            } catch (Throwable e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                b.m2603c();
            }
            this.f14346e.m2711a(c1208h);
        } catch (Throwable th2) {
            this.f14346e.m2711a(c1208h);
        }
    }
}
