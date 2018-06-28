package com.p085c.p086a;

import android.support.v4.p038g.C0480k.C0479a;
import com.p085c.p086a.p089c.C1203d;
import com.p085c.p086a.p089c.C1206f;
import com.p085c.p086a.p089c.C1211k;
import com.p085c.p086a.p089c.C5254l;
import com.p085c.p086a.p089c.p090a.C1098c.C1097a;
import com.p085c.p086a.p089c.p090a.C1099d;
import com.p085c.p086a.p089c.p092b.C1143g;
import com.p085c.p086a.p089c.p092b.C1158q;
import com.p085c.p086a.p089c.p097c.C1173m;
import com.p085c.p086a.p089c.p097c.C1174n;
import com.p085c.p086a.p089c.p097c.C1177o;
import com.p085c.p086a.p089c.p098d.p101f.C1200d;
import com.p085c.p086a.p089c.p098d.p101f.C1202e;
import com.p085c.p086a.p104f.C1229a;
import com.p085c.p086a.p104f.C1230b;
import com.p085c.p086a.p104f.C1231c;
import com.p085c.p086a.p104f.C1232d;
import com.p085c.p086a.p104f.C1234e;
import com.p085c.p086a.p104f.C1236f;
import com.p085c.p086a.p109i.C1270g;
import com.p085c.p086a.p109i.p110a.C1262a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class C1254h {
    public final C1229a f3945a = new C1229a();
    public final C1236f f3946b = new C1236f();
    public final C1099d f3947c = new C1099d();
    final C1230b f3948d = new C1230b();
    private final C1177o f3949e = new C1177o(this.f3954j);
    private final C1234e f3950f = new C1234e();
    private final C1202e f3951g = new C1202e();
    private final C1232d f3952h = new C1232d();
    private final C1231c f3953i = new C1231c();
    private final C0479a<List<Exception>> f3954j = C1262a.m2982a();

    public static class C1253a extends RuntimeException {
        public C1253a(String str) {
            super(str);
        }
    }

    public static final class C5276b extends C1253a {
        public C5276b() {
            super("Failed to find image header parser.");
        }
    }

    public static class C5277c extends C1253a {
        public C5277c(Class<?> cls, Class<?> cls2) {
            StringBuilder stringBuilder = new StringBuilder("Failed to find any ModelLoaders for model: ");
            stringBuilder.append(cls);
            stringBuilder.append(" and data: ");
            stringBuilder.append(cls2);
            super(stringBuilder.toString());
        }

        public C5277c(Object obj) {
            StringBuilder stringBuilder = new StringBuilder("Failed to find any ModelLoaders for model: ");
            stringBuilder.append(obj);
            super(stringBuilder.toString());
        }
    }

    public static class C5274d extends C1253a {
        public C5274d(Class<?> cls) {
            StringBuilder stringBuilder = new StringBuilder("Failed to find result encoder for resource class: ");
            stringBuilder.append(cls);
            super(stringBuilder.toString());
        }
    }

    public static class C5275e extends C1253a {
        public C5275e(Class<?> cls) {
            StringBuilder stringBuilder = new StringBuilder("Failed to find source encoder for data class: ");
            stringBuilder.append(cls);
            super(stringBuilder.toString());
        }
    }

    public final <Data, TResource, Transcode> C1158q<Data, TResource, Transcode> m2969a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        Class<Data> cls4 = cls;
        Class<TResource> cls5 = cls2;
        Class<Transcode> cls6 = cls3;
        C1158q<Data, TResource, Transcode> b = this.f3953i.m2905b(cls4, cls5, cls6);
        if (b != null || r1.f3953i.m2904a(cls4, cls5, cls6)) {
            return b;
        }
        List arrayList = new ArrayList();
        Iterator it = r1.f3950f.m2910b(cls4, cls5).iterator();
        while (it.hasNext()) {
            Class cls7 = (Class) it.next();
            for (Class cls8 : r1.f3951g.m2857b(cls7, cls6)) {
                Iterator it2 = it;
                C1143g c1143g = r2;
                C1143g c1143g2 = new C1143g(cls4, cls7, cls8, r1.f3950f.m2908a(cls4, cls7), r1.f3951g.m2855a(cls7, cls8), r1.f3954j);
                arrayList.add(c1143g);
                it = it2;
            }
        }
        if (arrayList.isEmpty()) {
            b = null;
        } else {
            b = new C1158q(cls4, cls5, cls6, arrayList, r1.f3954j);
        }
        C1231c c1231c = r1.f3953i;
        synchronized (c1231c.f3884a) {
            try {
                c1231c.f3884a.put(new C1270g(cls4, cls5, cls6), b);
            } catch (Throwable th) {
                Throwable th2 = th;
            }
        }
        return b;
    }

    public final C1254h m2970a(C1097a c1097a) {
        this.f3947c.m2673a(c1097a);
        return this;
    }

    public final <Data> C1254h m2971a(Class<Data> cls, C1203d<Data> c1203d) {
        this.f3945a.m2900a(cls, c1203d);
        return this;
    }

    public final <TResource> C1254h m2972a(Class<TResource> cls, C5254l<TResource> c5254l) {
        this.f3946b.m2913a(cls, c5254l);
        return this;
    }

    public final <Model, Data> C1254h m2973a(Class<Model> cls, Class<Data> cls2, C1174n<Model, Data> c1174n) {
        this.f3949e.m2800a(cls, cls2, c1174n);
        return this;
    }

    public final <TResource, Transcode> C1254h m2974a(Class<TResource> cls, Class<Transcode> cls2, C1200d<TResource, Transcode> c1200d) {
        this.f3951g.m2856a(cls, cls2, c1200d);
        return this;
    }

    public final <Data, TResource> C1254h m2975a(Class<Data> cls, Class<TResource> cls2, C1211k<Data, TResource> c1211k) {
        this.f3950f.m2909a(c1211k, cls, cls2);
        return this;
    }

    public final List<C1206f> m2976a() {
        List<C1206f> a = this.f3948d.m2901a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new C5276b();
    }

    public final <Model> List<C1173m<Model, ?>> m2977a(Model model) {
        List<C1173m<Model, ?>> a = this.f3949e.m2799a((Object) model);
        if (!a.isEmpty()) {
            return a;
        }
        throw new C5277c(model);
    }

    public final <Data, TResource> C1254h m2978b(Class<Data> cls, Class<TResource> cls2, C1211k<Data, TResource> c1211k) {
        this.f3950f.m2911b(c1211k, cls, cls2);
        return this;
    }

    public final <Model, TResource, Transcode> List<Class<?>> m2979b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f3952h.m2906a(cls, cls2);
        if (a != null) {
            return a;
        }
        a = new ArrayList();
        for (Class b : this.f3949e.m2798a((Class) cls)) {
            for (Class cls4 : this.f3950f.m2910b(b, cls2)) {
                if (!(this.f3951g.m2857b(cls4, cls3).isEmpty() || a.contains(cls4))) {
                    a.add(cls4);
                }
            }
        }
        C1232d c1232d = this.f3952h;
        List unmodifiableList = Collections.unmodifiableList(a);
        synchronized (c1232d.f3886a) {
            c1232d.f3886a.put(new C1270g(cls, cls2), unmodifiableList);
        }
        return a;
    }
}
