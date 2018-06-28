package org.json.p613a;

import java.util.ArrayList;
import java.util.List;

public final class C7969a extends ArrayList implements List, C7814b {
    public static String m22180a(List list) {
        if (list == null) {
            return "null";
        }
        Object obj = 1;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        for (Object next : list) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuffer.append(',');
            }
            stringBuffer.append(next == null ? "null" : C7815d.m22090a(next));
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public final String mo3933a() {
        return C7969a.m22180a(this);
    }

    public final String toString() {
        return C7969a.m22180a(this);
    }
}
