package com.google.android.gms.location.places;

import com.google.android.gms.internal.zzbej;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class zza extends zzbej {
    static <E> Set<E> m16850a(List<E> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                return Collections.unmodifiableSet(new HashSet(list));
            }
        }
        return Collections.emptySet();
    }
}
