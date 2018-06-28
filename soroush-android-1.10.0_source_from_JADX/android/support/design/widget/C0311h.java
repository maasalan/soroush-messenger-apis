package android.support.design.widget;

import android.support.v4.p038g.C0480k.C0479a;
import android.support.v4.p038g.C0480k.C4816b;
import android.support.v4.p038g.C0482m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

final class C0311h<T> {
    final C0479a<ArrayList<T>> f1212a = new C4816b(10);
    final C0482m<T, ArrayList<T>> f1213b = new C0482m();
    private final ArrayList<T> f1214c = new ArrayList();
    private final HashSet<T> f1215d = new HashSet();

    C0311h() {
    }

    private void m608a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (hashSet.contains(t)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(t);
            ArrayList arrayList2 = (ArrayList) this.f1213b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m608a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
        }
    }

    final ArrayList<T> m609a() {
        this.f1214c.clear();
        this.f1215d.clear();
        int size = this.f1213b.size();
        for (int i = 0; i < size; i++) {
            m608a(this.f1213b.m1019b(i), this.f1214c, this.f1215d);
        }
        return this.f1214c;
    }

    final void m610a(T t) {
        if (!this.f1213b.containsKey(t)) {
            this.f1213b.put(t, null);
        }
    }

    final List m611b(T t) {
        return (List) this.f1213b.get(t);
    }
}
