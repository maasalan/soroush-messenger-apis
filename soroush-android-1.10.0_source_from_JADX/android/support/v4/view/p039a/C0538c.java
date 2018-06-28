package android.support.v4.view.p039a;

import android.os.Build.VERSION;
import android.support.v4.view.p039a.C0541d.C05391;
import android.support.v4.view.p039a.C0541d.C0540a;
import android.support.v4.view.p039a.C0544e.C05421;
import android.support.v4.view.p039a.C0544e.C0543a;
import java.util.List;

public final class C0538c {
    private static final C0537a f1838b;
    public final Object f1839a;

    interface C0537a {
        Object mo395a(C0538c c0538c);
    }

    static class C4832d implements C0537a {
        C4832d() {
        }

        public Object mo395a(C0538c c0538c) {
            return null;
        }
    }

    private static class C6372b extends C4832d {
        C6372b() {
        }

        public final Object mo395a(final C0538c c0538c) {
            return new C05391(new C0540a(this) {
                final /* synthetic */ C6372b f13411b;

                public final boolean mo388a() {
                    return C0538c.m1206b();
                }

                public final List<Object> mo389b() {
                    C0538c.m1207c();
                    return null;
                }

                public final Object mo390c() {
                    C0538c.m1205a();
                    return null;
                }
            });
        }
    }

    private static class C6373c extends C4832d {
        C6373c() {
        }

        public final Object mo395a(final C0538c c0538c) {
            return new C05421(new C0543a(this) {
                final /* synthetic */ C6373c f13413b;

                public final boolean mo391a() {
                    return C0538c.m1206b();
                }

                public final List<Object> mo392b() {
                    C0538c.m1207c();
                    return null;
                }

                public final Object mo393c() {
                    C0538c.m1205a();
                    return null;
                }

                public final Object mo394d() {
                    C0538c.m1208d();
                    return null;
                }
            });
        }
    }

    static {
        C0537a c6373c = VERSION.SDK_INT >= 19 ? new C6373c() : VERSION.SDK_INT >= 16 ? new C6372b() : new C4832d();
        f1838b = c6373c;
    }

    public C0538c() {
        this.f1839a = f1838b.mo395a(this);
    }

    public C0538c(Object obj) {
        this.f1839a = obj;
    }

    public static C0536b m1205a() {
        return null;
    }

    public static boolean m1206b() {
        return false;
    }

    public static List<C0536b> m1207c() {
        return null;
    }

    public static C0536b m1208d() {
        return null;
    }
}
