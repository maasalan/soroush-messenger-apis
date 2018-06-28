package com.google.p173d.p189f.p190a;

import com.google.p173d.p189f.C2022a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class C2012b {
    private final Map<Integer, Integer> f6748a = new HashMap();

    C2012b() {
    }

    final void m5499a(int i) {
        Integer num = (Integer) this.f6748a.get(Integer.valueOf(i));
        if (num == null) {
            num = Integer.valueOf(0);
        }
        this.f6748a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }

    final int[] m5500a() {
        Collection arrayList = new ArrayList();
        int i = -1;
        for (Entry entry : this.f6748a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i) {
                i = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) entry.getValue()).intValue() == i) {
            }
            arrayList.add(entry.getKey());
        }
        return C2022a.m5529a(arrayList);
    }
}
