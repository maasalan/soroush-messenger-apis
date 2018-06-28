package org.p501b.p502a.p505c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.p501b.p502a.C4614i;
import org.p501b.p502a.p503a.C4611d;
import org.p501b.p506b.C4617c;

public final class C4613a {
    public static List<String> m8369a(Collection<? extends C4614i> collection) {
        Object arrayList = new ArrayList(collection.size());
        C4613a.m8371b(collection, arrayList);
        return arrayList;
    }

    public static void m8370a(Collection<? extends CharSequence> collection, Collection<? super C4614i> collection2) {
        for (CharSequence a : collection) {
            try {
                collection2.add(C4611d.m8362a(a));
            } catch (C4617c e) {
                throw new AssertionError(e);
            }
        }
    }

    private static void m8371b(Collection<? extends C4614i> collection, Collection<? super String> collection2) {
        for (C4614i c4614i : collection) {
            collection2.add(c4614i.toString());
        }
    }
}
