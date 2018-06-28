package com.p085c.p086a.p089c.p097c;

import android.support.v4.p038g.C0480k.C0479a;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p092b.C1156o;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p109i.C1271h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

final class C5199p<Model, Data> implements C1173m<Model, Data> {
    private final List<C1173m<Model, Data>> f14526a;
    private final C0479a<List<Exception>> f14527b;

    static class C5198a<Data> implements C1096b<Data>, C1095a<Data> {
        private final List<C1096b<Data>> f14520a;
        private final C0479a<List<Exception>> f14521b;
        private int f14522c = 0;
        private C1251g f14523d;
        private C1095a<? super Data> f14524e;
        private List<Exception> f14525f;

        C5198a(List<C1096b<Data>> list, C0479a<List<Exception>> c0479a) {
            this.f14521b = c0479a;
            C1271h.m3014a((Collection) list);
            this.f14520a = list;
        }

        private void m10729e() {
            if (this.f14522c < this.f14520a.size() - 1) {
                this.f14522c++;
                mo1109a(this.f14523d, this.f14524e);
                return;
            }
            this.f14524e.mo1140a(new C1156o("Fetch failed", new ArrayList(this.f14525f)));
        }

        public final void mo1108a() {
            if (this.f14525f != null) {
                this.f14521b.mo309a(this.f14525f);
            }
            this.f14525f = null;
            for (C1096b a : this.f14520a) {
                a.mo1108a();
            }
        }

        public final void mo1109a(C1251g c1251g, C1095a<? super Data> c1095a) {
            this.f14523d = c1251g;
            this.f14524e = c1095a;
            this.f14525f = (List) this.f14521b.mo308a();
            ((C1096b) this.f14520a.get(this.f14522c)).mo1109a(c1251g, this);
        }

        public final void mo1140a(Exception exception) {
            this.f14525f.add(exception);
            m10729e();
        }

        public final void mo1141a(Data data) {
            if (data != null) {
                this.f14524e.mo1141a((Object) data);
            } else {
                m10729e();
            }
        }

        public final void mo1110b() {
            for (C1096b b : this.f14520a) {
                b.mo1110b();
            }
        }

        public final C1102a mo1111c() {
            return ((C1096b) this.f14520a.get(0)).mo1111c();
        }

        public final Class<Data> mo1112d() {
            return ((C1096b) this.f14520a.get(0)).mo1112d();
        }
    }

    C5199p(List<C1173m<Model, Data>> list, C0479a<List<Exception>> c0479a) {
        this.f14526a = list;
        this.f14527b = c0479a;
    }

    public final C1172a<Data> mo1185a(Model model, int i, int i2, C5253j c5253j) {
        int size = this.f14526a.size();
        List arrayList = new ArrayList(size);
        C1208h c1208h = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1173m c1173m = (C1173m) this.f14526a.get(i3);
            if (c1173m.mo1186a(model)) {
                C1172a a = c1173m.mo1185a(model, i, i2, c5253j);
                if (a != null) {
                    c1208h = a.f3736a;
                    arrayList.add(a.f3738c);
                }
            }
        }
        return !arrayList.isEmpty() ? new C1172a(c1208h, new C5198a(arrayList, this.f14527b)) : null;
    }

    public final boolean mo1186a(Model model) {
        for (C1173m a : this.f14526a) {
            if (a.mo1186a(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiModelLoader{modelLoaders=");
        stringBuilder.append(Arrays.toString(this.f14526a.toArray(new C1173m[this.f14526a.size()])));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
