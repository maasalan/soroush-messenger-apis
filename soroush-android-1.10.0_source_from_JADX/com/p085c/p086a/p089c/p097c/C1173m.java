package com.p085c.p086a.p089c.p097c;

import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p109i.C1271h;
import java.util.Collections;
import java.util.List;

public interface C1173m<Model, Data> {

    public static class C1172a<Data> {
        public final C1208h f3736a;
        public final List<C1208h> f3737b;
        public final C1096b<Data> f3738c;

        public C1172a(C1208h c1208h, C1096b<Data> c1096b) {
            this(c1208h, Collections.emptyList(), c1096b);
        }

        private C1172a(C1208h c1208h, List<C1208h> list, C1096b<Data> c1096b) {
            this.f3736a = (C1208h) C1271h.m3012a((Object) c1208h, "Argument must not be null");
            this.f3737b = (List) C1271h.m3012a((Object) list, "Argument must not be null");
            this.f3738c = (C1096b) C1271h.m3012a((Object) c1096b, "Argument must not be null");
        }
    }

    C1172a<Data> mo1185a(Model model, int i, int i2, C5253j c5253j);

    boolean mo1186a(Model model);
}
