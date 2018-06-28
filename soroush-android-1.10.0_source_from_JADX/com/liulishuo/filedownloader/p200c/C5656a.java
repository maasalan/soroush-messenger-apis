package com.liulishuo.filedownloader.p200c;

import android.text.TextUtils;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.p198a.C2132b;
import com.liulishuo.filedownloader.p198a.C2134d;
import com.liulishuo.filedownloader.p200c.C2147c.C2146a;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2184e;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C5656a {
    final int f7137a;
    final String f7138b;
    final FileDownloadHeader f7139c;
    C2145b f7140d;
    Map<String, List<String>> f7141e;
    List<String> f7142f;
    private String f7143g;

    static class C2142a {
        String f7132a;
        String f7133b;
        FileDownloadHeader f7134c;
        C2145b f7135d;
        private Integer f7136e;

        C2142a() {
        }

        public final C2142a m5888a(int i) {
            this.f7136e = Integer.valueOf(i);
            return this;
        }

        final C5656a m5889a() {
            if (!(this.f7136e == null || this.f7135d == null)) {
                if (this.f7132a != null) {
                    return new C5656a(this.f7135d, this.f7136e.intValue(), this.f7132a, this.f7133b, this.f7134c);
                }
            }
            throw new IllegalArgumentException();
        }
    }

    private C5656a(C2145b c2145b, int i, String str, String str2, FileDownloadHeader fileDownloadHeader) {
        this.f7137a = i;
        this.f7138b = str;
        this.f7143g = str2;
        this.f7139c = fileDownloadHeader;
        this.f7140d = c2145b;
    }

    final C2132b m5890a() {
        C2132b a = C2146a.f7150a.m5894a(this.f7138b);
        if (this.f7139c != null) {
            HashMap hashMap = this.f7139c.f7289a;
            if (hashMap != null) {
                if (C2182d.f7249a) {
                    C2182d.m5985e(this, "%d add outside header: %s", Integer.valueOf(this.f7137a), hashMap);
                }
                for (Entry entry : hashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    List<String> list = (List) entry.getValue();
                    if (list != null) {
                        for (String a2 : list) {
                            a.mo1826a(str, a2);
                        }
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(this.f7143g)) {
            a.mo1826a("If-Match", this.f7143g);
        }
        C2145b c2145b = this.f7140d;
        if (!c2145b.f7148e) {
            String str2;
            Object[] objArr;
            if (c2145b.f7149f && C2184e.m5988a().f7258h) {
                a.mo1828b("HEAD");
            }
            if (c2145b.f7146c == -1) {
                str2 = "bytes=%d-";
                objArr = new Object[]{Long.valueOf(c2145b.f7145b)};
            } else {
                str2 = "bytes=%d-%d";
                objArr = new Object[]{Long.valueOf(c2145b.f7145b), Long.valueOf(c2145b.f7146c)};
            }
            a.mo1826a("Range", C2185f.m5996a(str2, objArr));
        }
        if (this.f7139c == null || this.f7139c.f7289a.get("User-Agent") == null) {
            a.mo1826a("User-Agent", C2185f.m6005b());
        }
        this.f7141e = a.mo1827b();
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "<---- %s request header %s", Integer.valueOf(this.f7137a), this.f7141e);
        }
        a.mo1830d();
        this.f7142f = new ArrayList();
        a = C2134d.m5831a(this.f7141e, a, this.f7142f);
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "----> %s response header %s", Integer.valueOf(this.f7137a), a.mo1829c());
        }
        return a;
    }
}
