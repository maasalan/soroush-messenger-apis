package com.p111d.p112a.p121c.p138m;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C1528h implements Serializable {
    private static final C1528h f4765d = new C1528h(1, 0, new Object[4]);
    public final int f4766a;
    public final int f4767b;
    public final Object[] f4768c;

    private C1528h(int i, int i2, Object[] objArr) {
        this.f4766a = i;
        this.f4767b = i2;
        this.f4768c = objArr;
    }

    public static <T> C1528h m3988a(Map<String, T> map) {
        if (map.isEmpty()) {
            return f4765d;
        }
        int i;
        int size = map.size();
        if (size <= 5) {
            size = 8;
        } else if (size <= 12) {
            size = 16;
        } else {
            i = 32;
            while (i < size + (size >> 2)) {
                i += i;
            }
            size = i;
        }
        i = size - 1;
        int i2 = (size >> 1) + size;
        Object[] objArr = new Object[(i2 * 2)];
        int i3 = 0;
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            int hashCode = str.hashCode() & i;
            int i4 = hashCode + hashCode;
            if (objArr[i4] != null) {
                i4 = ((hashCode >> 1) + size) << 1;
                if (objArr[i4] != null) {
                    i4 = (i2 << 1) + i3;
                    i3 += 2;
                    if (i4 >= objArr.length) {
                        objArr = Arrays.copyOf(objArr, objArr.length + 4);
                    }
                }
            }
            objArr[i4] = str;
            objArr[i4 + 1] = entry.getValue();
        }
        return new C1528h(i, i3, objArr);
    }

    public final List<String> m3989a() {
        int length = this.f4768c.length;
        List<String> arrayList = new ArrayList(length >> 2);
        for (int i = 0; i < length; i += 2) {
            Object obj = this.f4768c[i];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
