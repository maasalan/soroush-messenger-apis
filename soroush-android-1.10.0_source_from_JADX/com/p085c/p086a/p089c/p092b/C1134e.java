package com.p085c.p086a.p089c.p092b;

import com.p085c.p086a.C1227e;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p089c.p092b.C5140f.C1138d;
import com.p085c.p086a.p089c.p092b.p094b.C1115a;
import com.p085c.p086a.p089c.p097c.C1173m;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p089c.p098d.C6453b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class C1134e<Transcode> {
    final List<C1172a<?>> f3648a = new ArrayList();
    final List<C1208h> f3649b = new ArrayList();
    public C1227e f3650c;
    public Object f3651d;
    public int f3652e;
    public int f3653f;
    public Class<?> f3654g;
    public C1138d f3655h;
    public C5253j f3656i;
    public Map<Class<?>, C5255m<?>> f3657j;
    public Class<Transcode> f3658k;
    boolean f3659l;
    boolean f3660m;
    public C1208h f3661n;
    public C1251g f3662o;
    public C1144h f3663p;
    public boolean f3664q;

    C1134e() {
    }

    final C1115a m2737a() {
        return this.f3655h.mo1171a();
    }

    final List<C1173m<File, ?>> m2738a(File file) {
        return this.f3650c.f3874b.m2977a((Object) file);
    }

    final boolean m2739a(Class<?> cls) {
        return m2740b(cls) != null;
    }

    final <Data> C1158q<Data, ?, Transcode> m2740b(Class<Data> cls) {
        return this.f3650c.f3874b.m2969a((Class) cls, this.f3654g, this.f3658k);
    }

    final List<C1172a<?>> m2741b() {
        if (!this.f3659l) {
            this.f3659l = true;
            this.f3648a.clear();
            List a = this.f3650c.f3874b.m2977a(this.f3651d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C1172a a2 = ((C1173m) a.get(i)).mo1185a(this.f3651d, this.f3652e, this.f3653f, this.f3656i);
                if (a2 != null) {
                    this.f3648a.add(a2);
                }
            }
        }
        return this.f3648a;
    }

    final <Z> C5255m<Z> m2742c(Class<Z> cls) {
        C5255m<Z> c5255m = (C5255m) this.f3657j.get(cls);
        if (c5255m != null) {
            return c5255m;
        }
        if (!this.f3657j.isEmpty() || !this.f3664q) {
            return C6453b.m15374a();
        }
        StringBuilder stringBuilder = new StringBuilder("Missing transformation for ");
        stringBuilder.append(cls);
        stringBuilder.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    final List<C1208h> m2743c() {
        if (!this.f3660m) {
            this.f3660m = true;
            this.f3649b.clear();
            List b = m2741b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                C1172a c1172a = (C1172a) b.get(i);
                if (!this.f3649b.contains(c1172a.f3736a)) {
                    this.f3649b.add(c1172a.f3736a);
                }
                for (int i2 = 0; i2 < c1172a.f3737b.size(); i2++) {
                    if (!this.f3649b.contains(c1172a.f3737b.get(i2))) {
                        this.f3649b.add(c1172a.f3737b.get(i2));
                    }
                }
            }
        }
        return this.f3649b;
    }
}
