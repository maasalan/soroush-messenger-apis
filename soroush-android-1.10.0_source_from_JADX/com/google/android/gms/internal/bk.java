package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class bk {
    final Map<String, String> f5587a;
    final List<zzapm> f5588b;
    final long f5589c;
    final long f5590d;
    final int f5591e;
    final boolean f5592f;
    private final String f5593g;

    public bk(C1825u c1825u, Map<String, String> map, long j, boolean z) {
        this(c1825u, map, j, z, 0, 0, null);
    }

    public bk(C1825u c1825u, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(c1825u, map, j, z, j2, i, null);
    }

    public bk(C1825u c1825u, Map<String, String> map, long j, boolean z, long j2, int i, List<zzapm> list) {
        ac.m4376a((Object) c1825u);
        ac.m4376a((Object) map);
        this.f5590d = j;
        this.f5592f = z;
        this.f5589c = j2;
        this.f5591e = i;
        this.f5588b = list != null ? list : Collections.emptyList();
        this.f5593g = m4612a((List) list);
        Map hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            if (m4613a(entry.getKey())) {
                String a = m4611a(c1825u, entry.getKey());
                if (a != null) {
                    hashMap.put(a, m4614b(c1825u, entry.getValue()));
                }
            }
        }
        for (Entry entry2 : map.entrySet()) {
            if (!m4613a(entry2.getKey())) {
                String a2 = m4611a(c1825u, entry2.getKey());
                if (a2 != null) {
                    hashMap.put(a2, m4614b(c1825u, entry2.getValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(this.f5593g)) {
            ce.m4647a(hashMap, "_v", this.f5593g);
            if (this.f5593g.equals("ma4.0.0") || this.f5593g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.f5587a = Collections.unmodifiableMap(hashMap);
    }

    private static String m4611a(C1825u c1825u, Object obj) {
        if (obj == null) {
            return null;
        }
        obj = obj.toString();
        if (obj.startsWith("&")) {
            obj = obj.substring(1);
        }
        int length = obj.length();
        if (length > 256) {
            obj = obj.substring(0, 256);
            c1825u.m5149c("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj);
        }
        return TextUtils.isEmpty(obj) ? null : obj;
    }

    private static String m4612a(List<zzapm> list) {
        Object obj;
        if (list != null) {
            for (zzapm com_google_android_gms_internal_zzapm : list) {
                if ("appendVersion".equals(com_google_android_gms_internal_zzapm.f6301a)) {
                    obj = com_google_android_gms_internal_zzapm.f6302b;
                    break;
                }
            }
        }
        obj = null;
        return TextUtils.isEmpty(obj) ? null : obj;
    }

    private static boolean m4613a(Object obj) {
        return obj == null ? false : obj.toString().startsWith("&");
    }

    private static String m4614b(C1825u c1825u, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        obj2 = obj2.substring(0, 8192);
        c1825u.m5149c("Hit param value is too long and will be trimmed", Integer.valueOf(length), obj2);
        return obj2;
    }

    final String m4615a(String str, String str2) {
        ac.m4378a(str);
        ac.m4386b(str.startsWith("&") ^ 1, "Short param name required");
        str = (String) this.f5587a.get(str);
        return str != null ? str : str2;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ht=");
        stringBuffer.append(this.f5590d);
        if (this.f5589c != 0) {
            stringBuffer.append(", dbId=");
            stringBuffer.append(this.f5589c);
        }
        if (this.f5591e != 0) {
            stringBuffer.append(", appUID=");
            stringBuffer.append(this.f5591e);
        }
        List arrayList = new ArrayList(this.f5587a.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) obj;
            stringBuffer.append(", ");
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append((String) this.f5587a.get(str));
        }
        return stringBuffer.toString();
    }
}
