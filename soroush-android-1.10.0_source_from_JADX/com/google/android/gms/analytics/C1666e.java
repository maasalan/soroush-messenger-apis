package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.p159a.C1657a;
import com.google.android.gms.analytics.p159a.C1658b;
import com.google.android.gms.analytics.p159a.C1659c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C1666e {

    public static class C1665b<T extends C1665b> {
        private Map<String, String> f5141a = new HashMap();
        private C1658b f5142b;
        private Map<String, List<C1657a>> f5143c = new HashMap();
        private List<C1659c> f5144d = new ArrayList();
        private List<C1657a> f5145e = new ArrayList();

        protected C1665b() {
        }

        public final T m4255a(String str, String str2) {
            this.f5141a.put(str, str2);
            return this;
        }

        public final Map<String, String> m4256a() {
            Map<String, String> hashMap = new HashMap(this.f5141a);
            if (this.f5142b != null) {
                hashMap.putAll(this.f5142b.m4249a());
            }
            int i = 1;
            for (C1659c a : this.f5144d) {
                hashMap.putAll(a.m4250a(C1669l.m4258a("&promo", i)));
                i++;
            }
            i = 1;
            for (C1657a a2 : this.f5145e) {
                hashMap.putAll(a2.m4248a(C1669l.m4258a("&pr", i)));
                i++;
            }
            i = 1;
            for (Entry entry : this.f5143c.entrySet()) {
                List<C1657a> list = (List) entry.getValue();
                String a3 = C1669l.m4258a("&il", i);
                int i2 = 1;
                for (C1657a c1657a : list) {
                    String valueOf = String.valueOf(a3);
                    String valueOf2 = String.valueOf(C1669l.m4258a("pi", i2));
                    hashMap.putAll(c1657a.m4248a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i2++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String valueOf3 = String.valueOf(a3);
                    a3 = String.valueOf("nm");
                    hashMap.put(a3.length() != 0 ? valueOf3.concat(a3) : new String(valueOf3), (String) entry.getKey());
                }
                i++;
            }
            return hashMap;
        }
    }

    public static class C5433a extends C1665b<C5433a> {
        public C5433a() {
            m4255a("&t", "exception");
        }
    }

    public static class C5434c extends C1665b<C5434c> {
        public C5434c() {
            m4255a("&t", "screenview");
        }
    }
}
