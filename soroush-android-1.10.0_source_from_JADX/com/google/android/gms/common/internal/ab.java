package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

public final class ab {
    private final List<String> f5339a;
    private final Object f5340b;

    private ab(Object obj) {
        this.f5340b = ac.m4376a(obj);
        this.f5339a = new ArrayList();
    }

    public final ab m4375a(String str, Object obj) {
        List list = this.f5339a;
        str = (String) ac.m4376a((Object) str);
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((1 + String.valueOf(str).length()) + String.valueOf(valueOf).length());
        stringBuilder.append(str);
        stringBuilder.append("=");
        stringBuilder.append(valueOf);
        list.add(stringBuilder.toString());
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(this.f5340b.getClass().getSimpleName());
        stringBuilder.append('{');
        int size = this.f5339a.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append((String) this.f5339a.get(i));
            if (i < size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
