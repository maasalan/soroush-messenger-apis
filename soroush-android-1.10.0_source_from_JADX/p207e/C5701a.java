package p207e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p056c.ab;
import p056c.ad;
import p207e.C2309d.C2308a;
import p207e.p208b.C2303w;

final class C5701a extends C2308a {

    static final class C5693a implements C2309d<ad, ad> {
        static final C5693a f15641a = new C5693a();

        C5693a() {
        }

        private static ad m12736a(ad adVar) {
            try {
                ad a = C2323n.m6306a(adVar);
                return a;
            } finally {
                adVar.close();
            }
        }
    }

    static final class C5694b implements C2309d<ab, ab> {
        static final C5694b f15642a = new C5694b();

        C5694b() {
        }

        public final /* bridge */ /* synthetic */ Object mo2054a(Object obj) {
            return (ab) obj;
        }
    }

    static final class C5695c implements C2309d<ad, ad> {
        static final C5695c f15643a = new C5695c();

        C5695c() {
        }

        public final /* bridge */ /* synthetic */ Object mo2054a(Object obj) {
            return (ad) obj;
        }
    }

    static final class C5696d implements C2309d<Object, String> {
        static final C5696d f15644a = new C5696d();

        C5696d() {
        }

        public final /* synthetic */ Object mo2054a(Object obj) {
            return obj.toString();
        }
    }

    static final class C5697e implements C2309d<ad, Void> {
        static final C5697e f15645a = new C5697e();

        C5697e() {
        }

        public final /* synthetic */ Object mo2054a(Object obj) {
            ((ad) obj).close();
            return null;
        }
    }

    C5701a() {
    }

    public final C2309d<?, ab> mo2055a(Type type) {
        return ab.class.isAssignableFrom(C2323n.m6307a(type)) ? C5694b.f15642a : null;
    }

    public final C2309d<ad, ?> mo2056a(Type type, Annotation[] annotationArr) {
        return type == ad.class ? C2323n.m6314a(annotationArr, C2303w.class) ? C5695c.f15643a : C5693a.f15641a : type == Void.class ? C5697e.f15645a : null;
    }
}
