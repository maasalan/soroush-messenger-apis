package com.p085c.p086a.p089c.p097c;

import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p108h.C5277c;

public final class C5210u<Model> implements C1173m<Model, Model> {

    public static class C5208a<Model> implements C1174n<Model, Model> {
        public final C1173m<Model, Model> mo1184a(C1180q c1180q) {
            return new C5210u();
        }
    }

    private static class C5209b<Model> implements C1096b<Model> {
        private final Model f14534a;

        public C5209b(Model model) {
            this.f14534a = model;
        }

        public final void mo1108a() {
        }

        public final void mo1109a(C1251g c1251g, C1095a<? super Model> c1095a) {
            c1095a.mo1141a(this.f14534a);
        }

        public final void mo1110b() {
        }

        public final C1102a mo1111c() {
            return C1102a.LOCAL;
        }

        public final Class<Model> mo1112d() {
            return this.f14534a.getClass();
        }
    }

    public final C1172a<Model> mo1185a(Model model, int i, int i2, C5253j c5253j) {
        return new C1172a(new C5277c(model), new C5209b(model));
    }

    public final boolean mo1186a(Model model) {
        return true;
    }
}
