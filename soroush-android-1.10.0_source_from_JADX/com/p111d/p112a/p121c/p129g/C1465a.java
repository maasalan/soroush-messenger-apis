package com.p111d.p112a.p121c.p129g;

import java.util.HashMap;
import java.util.Map;

public enum C1465a {
    STRING,
    NUMBER,
    INTEGER,
    BOOLEAN,
    OBJECT,
    ARRAY,
    NULL,
    ANY;
    
    private static final Map<String, C1465a> f4592i = null;

    static {
        f4592i = new HashMap();
        C1465a[] values = C1465a.values();
        int length = values.length;
        int i;
        while (i < length) {
            C1465a c1465a = values[i];
            f4592i.put(c1465a.name().toLowerCase(), c1465a);
            i++;
        }
    }
}
