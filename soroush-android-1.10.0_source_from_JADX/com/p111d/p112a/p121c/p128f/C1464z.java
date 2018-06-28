package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p113a.C1310e;
import com.p111d.p112a.p113a.C1310e.C1309a;
import java.io.Serializable;

public interface C1464z<T extends C1464z<T>> {

    @C1310e(a = C1309a.PUBLIC_ONLY, b = C1309a.PUBLIC_ONLY, c = C1309a.ANY, d = C1309a.ANY, e = C1309a.PUBLIC_ONLY)
    public static class C5344a implements C1464z<C5344a>, Serializable {
        protected static final C5344a f14848a = new C5344a((C1310e) C5344a.class.getAnnotation(C1310e.class));
        protected final C1309a f14849b;
        protected final C1309a f14850c;
        protected final C1309a f14851d;
        protected final C1309a f14852e;
        protected final C1309a f14853f;

        private C5344a(C1309a c1309a, C1309a c1309a2, C1309a c1309a3, C1309a c1309a4, C1309a c1309a5) {
            this.f14849b = c1309a;
            this.f14850c = c1309a2;
            this.f14851d = c1309a3;
            this.f14852e = c1309a4;
            this.f14853f = c1309a5;
        }

        private C5344a(C1310e c1310e) {
            this.f14849b = c1310e.m3099a();
            this.f14850c = c1310e.m3100b();
            this.f14851d = c1310e.m3101c();
            this.f14852e = c1310e.m3102d();
            this.f14853f = c1310e.m3103e();
        }

        public static C5344a m11412a() {
            return f14848a;
        }

        private C5344a m11413f(C1309a c1309a) {
            if (c1309a == C1309a.DEFAULT) {
                c1309a = f14848a.f14849b;
            }
            C1309a c1309a2 = c1309a;
            return this.f14849b == c1309a2 ? this : new C5344a(c1309a2, this.f14850c, this.f14851d, this.f14852e, this.f14853f);
        }

        private C5344a m11414g(C1309a c1309a) {
            if (c1309a == C1309a.DEFAULT) {
                c1309a = f14848a.f14850c;
            }
            C1309a c1309a2 = c1309a;
            return this.f14850c == c1309a2 ? this : new C5344a(this.f14849b, c1309a2, this.f14851d, this.f14852e, this.f14853f);
        }

        private C5344a m11415h(C1309a c1309a) {
            if (c1309a == C1309a.DEFAULT) {
                c1309a = f14848a.f14851d;
            }
            C1309a c1309a2 = c1309a;
            return this.f14851d == c1309a2 ? this : new C5344a(this.f14849b, this.f14850c, c1309a2, this.f14852e, this.f14853f);
        }

        private C5344a m11416i(C1309a c1309a) {
            if (c1309a == C1309a.DEFAULT) {
                c1309a = f14848a.f14852e;
            }
            C1309a c1309a2 = c1309a;
            return this.f14852e == c1309a2 ? this : new C5344a(this.f14849b, this.f14850c, this.f14851d, c1309a2, this.f14853f);
        }

        private C5344a m11417j(C1309a c1309a) {
            if (c1309a == C1309a.DEFAULT) {
                c1309a = f14848a.f14853f;
            }
            C1309a c1309a2 = c1309a;
            return this.f14853f == c1309a2 ? this : new C5344a(this.f14849b, this.f14850c, this.f14851d, this.f14852e, c1309a2);
        }

        public final /* synthetic */ C1464z mo1425a(C1309a c1309a) {
            return m11413f(c1309a);
        }

        public final /* synthetic */ C1464z mo1426a(C1310e c1310e) {
            return c1310e != null ? m11413f(c1310e.m3099a()).m11414g(c1310e.m3100b()).m11415h(c1310e.m3101c()).m11416i(c1310e.m3102d()).m11417j(c1310e.m3103e()) : this;
        }

        public final boolean mo1427a(C6492d c6492d) {
            return this.f14853f.m3098a(c6492d.m15573f());
        }

        public final boolean mo1428a(C5328e c5328e) {
            return this.f14852e.m3098a(c5328e.mo2819k());
        }

        public final boolean mo1429a(C7087f c7087f) {
            return this.f14849b.m3098a(c7087f.m18494f());
        }

        public final /* synthetic */ C1464z mo1430b(C1309a c1309a) {
            return m11414g(c1309a);
        }

        public final boolean mo1431b(C7087f c7087f) {
            return this.f14850c.m3098a(c7087f.m18494f());
        }

        public final /* synthetic */ C1464z mo1432c(C1309a c1309a) {
            return m11415h(c1309a);
        }

        public final boolean mo1433c(C7087f c7087f) {
            return this.f14851d.m3098a(c7087f.m18494f());
        }

        public final /* synthetic */ C1464z mo1434d(C1309a c1309a) {
            return m11416i(c1309a);
        }

        public final /* synthetic */ C1464z mo1435e(C1309a c1309a) {
            return m11417j(c1309a);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("[Visibility: getter: ");
            stringBuilder.append(this.f14849b);
            stringBuilder.append(", isGetter: ");
            stringBuilder.append(this.f14850c);
            stringBuilder.append(", setter: ");
            stringBuilder.append(this.f14851d);
            stringBuilder.append(", creator: ");
            stringBuilder.append(this.f14852e);
            stringBuilder.append(", field: ");
            stringBuilder.append(this.f14853f);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    T mo1425a(C1309a c1309a);

    T mo1426a(C1310e c1310e);

    boolean mo1427a(C6492d c6492d);

    boolean mo1428a(C5328e c5328e);

    boolean mo1429a(C7087f c7087f);

    T mo1430b(C1309a c1309a);

    boolean mo1431b(C7087f c7087f);

    T mo1432c(C1309a c1309a);

    boolean mo1433c(C7087f c7087f);

    T mo1434d(C1309a c1309a);

    T mo1435e(C1309a c1309a);
}
