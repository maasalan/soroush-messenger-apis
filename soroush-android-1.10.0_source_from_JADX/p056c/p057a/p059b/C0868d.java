package p056c.p057a.p059b;

import java.util.LinkedHashSet;
import java.util.Set;
import p056c.ae;

public final class C0868d {
    private final Set<ae> f2594a = new LinkedHashSet();

    public final synchronized void m2041a(ae aeVar) {
        this.f2594a.add(aeVar);
    }

    public final synchronized void m2042b(ae aeVar) {
        this.f2594a.remove(aeVar);
    }

    public final synchronized boolean m2043c(ae aeVar) {
        return this.f2594a.contains(aeVar);
    }
}
