package com.liulishuo.filedownloader.p202e;

import com.liulishuo.filedownloader.p205h.C2185f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C2165b extends IOException {
    public final int f7233a;
    private final Map<String, List<String>> f7234b;
    private final Map<String, List<String>> f7235c;

    public C2165b(int i, Map<String, List<String>> map, Map<String, List<String>> map2) {
        super(C2185f.m5996a("response code error: %d, \n request headers: %s \n response headers: %s", Integer.valueOf(i), map, map2));
        this.f7233a = i;
        this.f7234b = C2165b.m5938a(map);
        this.f7235c = C2165b.m5938a(map);
    }

    private static Map<String, List<String>> m5938a(Map<String, List<String>> map) {
        Map<String, List<String>> hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        return hashMap;
    }
}
