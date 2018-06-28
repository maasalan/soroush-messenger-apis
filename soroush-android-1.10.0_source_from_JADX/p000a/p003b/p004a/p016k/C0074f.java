package p000a.p003b.p004a.p016k;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class C0074f extends IOException {
    static final /* synthetic */ boolean f337a = true;
    private final List<IOException> f338b;

    private C0074f(List<? extends IOException> list) {
        super(C0074f.m122a((Collection) list));
        if (f337a || !list.isEmpty()) {
            this.f338b = Collections.unmodifiableList(list);
            return;
        }
        throw new AssertionError();
    }

    private static String m122a(Collection<? extends Exception> collection) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Exception) it.next()).getMessage());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }

    public static void m123a(List<? extends IOException> list) {
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                throw ((IOException) list.get(0));
            }
            throw new C0074f(list);
        }
    }
}
