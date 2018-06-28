package com.liulishuo.filedownloader.p198a;

import com.liulishuo.filedownloader.p200c.C2147c.C2146a;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class C2134d {
    public static C2132b m5831a(Map<String, List<String>> map, C2132b c2132b, List<String> list) {
        int e = c2132b.mo1831e();
        String a = c2132b.mo1825a("Location");
        Collection arrayList = new ArrayList();
        int i = 0;
        do {
            int i2;
            if (!(e == 301 || e == 302 || e == 303 || e == IjkMediaCodecInfo.RANK_SECURE || e == 307)) {
                if (e != 308) {
                    i2 = 0;
                    if (i2 != 0) {
                        if (list != null) {
                            list.addAll(arrayList);
                        }
                        return c2132b;
                    } else if (a != null) {
                        throw new IllegalAccessException(C2185f.m5996a("receive %d (redirect) but the location is null with response [%s]", Integer.valueOf(e), c2132b.mo1829c()));
                    } else {
                        if (C2182d.f7249a) {
                            C2182d.m5983c(C2134d.class, "redirect to %s with %d, %s", a, Integer.valueOf(e), arrayList);
                        }
                        c2132b.mo1832f();
                        c2132b = C2134d.m5832a(map, a);
                        arrayList.add(a);
                        c2132b.mo1830d();
                        e = c2132b.mo1831e();
                        a = c2132b.mo1825a("Location");
                        i++;
                    }
                }
            }
            i2 = 1;
            if (i2 != 0) {
                if (list != null) {
                    list.addAll(arrayList);
                }
                return c2132b;
            } else if (a != null) {
                if (C2182d.f7249a) {
                    C2182d.m5983c(C2134d.class, "redirect to %s with %d, %s", a, Integer.valueOf(e), arrayList);
                }
                c2132b.mo1832f();
                c2132b = C2134d.m5832a(map, a);
                arrayList.add(a);
                c2132b.mo1830d();
                e = c2132b.mo1831e();
                a = c2132b.mo1825a("Location");
                i++;
            } else {
                throw new IllegalAccessException(C2185f.m5996a("receive %d (redirect) but the location is null with response [%s]", Integer.valueOf(e), c2132b.mo1829c()));
            }
        } while (i < 10);
        throw new IllegalAccessException(C2185f.m5996a("redirect too many times! %s", arrayList));
    }

    private static C2132b m5832a(Map<String, List<String>> map, String str) {
        C2132b a = C2146a.f7150a.m5894a(str);
        for (Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            List<String> list = (List) entry.getValue();
            if (list != null) {
                for (String a2 : list) {
                    a.mo1826a(str2, a2);
                }
            }
        }
        return a;
    }
}
