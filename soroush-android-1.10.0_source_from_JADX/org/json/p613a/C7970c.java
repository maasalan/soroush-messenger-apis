package org.json.p613a;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class C7970c extends HashMap implements Map, C7814b {
    public static String m22182a(Map map) {
        if (map == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Object obj = 1;
        stringBuffer.append('{');
        for (Entry entry : map.entrySet()) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuffer.append(',');
            }
            String valueOf = String.valueOf(entry.getKey());
            Object value = entry.getValue();
            stringBuffer.append('\"');
            if (valueOf == null) {
                stringBuffer.append("null");
            } else {
                C7815d.m22091a(valueOf, stringBuffer);
            }
            stringBuffer.append('\"');
            stringBuffer.append(':');
            stringBuffer.append(C7815d.m22090a(value));
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public final String mo3933a() {
        return C7970c.m22182a(this);
    }

    public final String toString() {
        return C7970c.m22182a(this);
    }
}
