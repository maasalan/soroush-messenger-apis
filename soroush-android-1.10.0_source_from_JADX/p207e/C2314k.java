package p207e;

import p056c.ac;
import p056c.ad;

public final class C2314k<T> {
    public final T f7590a;
    private final ac f7591b;
    private final ad f7592c;

    private C2314k(ac acVar, T t, ad adVar) {
        this.f7591b = acVar;
        this.f7590a = t;
        this.f7592c = adVar;
    }

    public static <T> C2314k<T> m6284a(ad adVar, ac acVar) {
        C2323n.m6308a((Object) adVar, "body == null");
        C2323n.m6308a((Object) acVar, "rawResponse == null");
        if (!acVar.m2261a()) {
            return new C2314k(acVar, null, adVar);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> C2314k<T> m6285a(T t, ac acVar) {
        C2323n.m6308a((Object) acVar, "rawResponse == null");
        if (acVar.m2261a()) {
            return new C2314k(acVar, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f7591b.toString();
    }
}
