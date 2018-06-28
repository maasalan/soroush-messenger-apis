package android.support.constraint.p026a.p027a;

import java.util.HashSet;
import java.util.Iterator;

public class C0178l {
    HashSet<C0178l> f651h = new HashSet(2);
    public int f652i = 0;

    public void mo57a() {
    }

    public final void m328a(C0178l c0178l) {
        this.f651h.add(c0178l);
    }

    public void mo58b() {
        this.f652i = 0;
        this.f651h.clear();
    }

    public final void m330c() {
        this.f652i = 0;
        Iterator it = this.f651h.iterator();
        while (it.hasNext()) {
            ((C0178l) it.next()).m330c();
        }
    }

    public final void m331d() {
        this.f652i = 1;
        Iterator it = this.f651h.iterator();
        while (it.hasNext()) {
            ((C0178l) it.next()).mo57a();
        }
    }

    public final boolean m332e() {
        return this.f652i == 1;
    }
}
