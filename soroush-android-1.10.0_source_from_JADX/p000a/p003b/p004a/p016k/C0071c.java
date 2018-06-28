package p000a.p003b.p004a.p016k;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public final class C0071c {
    public static <T> T m118a(Set<T> set, Random random) {
        int nextInt = random.nextInt(set.size());
        Iterator it = set.iterator();
        for (int i = 0; i < nextInt && it.hasNext(); i++) {
            it.next();
        }
        return it.next();
    }
}
