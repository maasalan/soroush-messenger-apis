package com.p085c.p086a.p089c.p092b;

import android.util.Log;
import com.p085c.p086a.C1254h.C5275e;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C1203d;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p092b.C1133d.C1132a;
import com.p085c.p086a.p089c.p092b.p094b.C1115a.C1114b;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p109i.C1267d;
import java.util.Collections;
import java.util.List;

final class C5157w implements C1095a<Object>, C1133d, C1132a {
    private final C1134e<?> f14465a;
    private final C1132a f14466b;
    private int f14467c;
    private C5126a f14468d;
    private Object f14469e;
    private volatile C1172a<?> f14470f;
    private C5135b f14471g;

    public C5157w(C1134e<?> c1134e, C1132a c1132a) {
        this.f14465a = c1134e;
        this.f14466b = c1132a;
    }

    public final void mo1164a(C1208h c1208h, Exception exception, C1096b<?> c1096b, C1102a c1102a) {
        this.f14466b.mo1164a(c1208h, exception, c1096b, this.f14470f.f3738c.mo1111c());
    }

    public final void mo1165a(C1208h c1208h, Object obj, C1096b<?> c1096b, C1102a c1102a, C1208h c1208h2) {
        this.f14466b.mo1165a(c1208h, obj, c1096b, this.f14470f.f3738c.mo1111c(), c1208h);
    }

    public final void mo1140a(Exception exception) {
        this.f14466b.mo1164a(this.f14471g, exception, this.f14470f.f3738c, this.f14470f.f3738c.mo1111c());
    }

    public final void mo1141a(Object obj) {
        C1144h c1144h = this.f14465a.f3663p;
        if (obj == null || !c1144h.mo1168a(this.f14470f.f3738c.mo1111c())) {
            this.f14466b.mo1165a(this.f14470f.f3736a, obj, this.f14470f.f3738c, this.f14470f.f3738c.mo1111c(), this.f14471g);
            return;
        }
        this.f14469e = obj;
        this.f14466b.mo1166c();
    }

    public final boolean mo1142a() {
        if (this.f14469e != null) {
            Object obj = this.f14469e;
            this.f14469e = null;
            long a = C1267d.m2998a();
            try {
                C1203d a2 = this.f14465a.f3650c.f3874b.f3945a.m2899a(obj.getClass());
                if (a2 != null) {
                    C1114b c5138c = new C5138c(a2, obj, this.f14465a.f3656i);
                    this.f14471g = new C5135b(this.f14470f.f3736a, this.f14465a.f3661n);
                    this.f14465a.m2737a().mo1145a(this.f14471g, c5138c);
                    if (Log.isLoggable("SourceGenerator", 2)) {
                        StringBuilder stringBuilder = new StringBuilder("Finished encoding source to cache, key: ");
                        stringBuilder.append(this.f14471g);
                        stringBuilder.append(", data: ");
                        stringBuilder.append(obj);
                        stringBuilder.append(", encoder: ");
                        stringBuilder.append(a2);
                        stringBuilder.append(", duration: ");
                        stringBuilder.append(C1267d.m2997a(a));
                        Log.v("SourceGenerator", stringBuilder.toString());
                    }
                    this.f14470f.f3738c.mo1108a();
                    this.f14468d = new C5126a(Collections.singletonList(this.f14470f.f3736a), this.f14465a, this);
                } else {
                    throw new C5275e(obj.getClass());
                }
            } catch (Throwable th) {
                this.f14470f.f3738c.mo1108a();
            }
        }
        if (this.f14468d != null && this.f14468d.mo1142a()) {
            return true;
        }
        this.f14468d = null;
        this.f14470f = null;
        boolean z = false;
        while (!z) {
            if (!(this.f14467c < this.f14465a.m2741b().size())) {
                break;
            }
            List b = this.f14465a.m2741b();
            int i = this.f14467c;
            this.f14467c = i + 1;
            this.f14470f = (C1172a) b.get(i);
            if (this.f14470f != null && (this.f14465a.f3663p.mo1168a(this.f14470f.f3738c.mo1111c()) || this.f14465a.m2739a(this.f14470f.f3738c.mo1112d()))) {
                this.f14470f.f3738c.mo1109a(this.f14465a.f3662o, this);
                z = true;
            }
        }
        return z;
    }

    public final void mo1143b() {
        C1172a c1172a = this.f14470f;
        if (c1172a != null) {
            c1172a.f3738c.mo1110b();
        }
    }

    public final void mo1166c() {
        throw new UnsupportedOperationException();
    }
}
