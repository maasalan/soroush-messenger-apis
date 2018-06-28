package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1709b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p160b.C1693e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class C1722b {
    final Map<as<?>, Boolean> f5256a = Collections.synchronizedMap(new WeakHashMap());
    final Map<C1693e<?>, Boolean> f5257b = Collections.synchronizedMap(new WeakHashMap());

    final void m4330a(boolean z, Status status) {
        synchronized (this.f5256a) {
            Map hashMap = new HashMap(this.f5256a);
        }
        synchronized (this.f5257b) {
            Map hashMap2 = new HashMap(this.f5257b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((as) entry.getKey()).m11771c(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C1693e) entry2.getKey()).m4298b(new C1709b(status));
            }
        }
    }
}
