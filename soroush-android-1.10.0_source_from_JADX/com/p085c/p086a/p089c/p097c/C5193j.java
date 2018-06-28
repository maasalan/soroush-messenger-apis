package com.p085c.p086a.p089c.p097c;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C5193j implements C1167h {
    private final Map<String, List<C1168i>> f14512c;
    private volatile Map<String, String> f14513d;

    public static final class C1169a {
        private static final String f3726c = System.getProperty("http.agent");
        private static final Map<String, List<C1168i>> f3727d;
        public Map<String, List<C1168i>> f3728a = f3727d;
        public boolean f3729b = true;
        private boolean f3730e = true;

        static {
            Map hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f3726c)) {
                hashMap.put("User-Agent", Collections.singletonList(new C5192b(f3726c)));
            }
            f3727d = Collections.unmodifiableMap(hashMap);
        }

        public final List<C1168i> m2789a(String str) {
            List<C1168i> list = (List) this.f3728a.get(str);
            if (list != null) {
                return list;
            }
            List arrayList = new ArrayList();
            this.f3728a.put(str, arrayList);
            return arrayList;
        }

        public final void m2790a() {
            if (this.f3730e) {
                this.f3730e = false;
                Map hashMap = new HashMap(this.f3728a.size());
                for (Entry entry : this.f3728a.entrySet()) {
                    hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
                }
                this.f3728a = hashMap;
            }
        }

        public final C5193j m2791b() {
            this.f3730e = true;
            return new C5193j(this.f3728a);
        }
    }

    static final class C5192b implements C1168i {
        private final String f14511a;

        public C5192b(String str) {
            this.f14511a = str;
        }

        public final String mo1197a() {
            return this.f14511a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C5192b)) {
                return false;
            }
            return this.f14511a.equals(((C5192b) obj).f14511a);
        }

        public final int hashCode() {
            return this.f14511a.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("StringHeaderFactory{value='");
            stringBuilder.append(this.f14511a);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    C5193j(Map<String, List<C1168i>> map) {
        this.f14512c = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> mo1196a() {
        if (this.f14513d == null) {
            synchronized (this) {
                if (this.f14513d == null) {
                    Map hashMap = new HashMap();
                    for (Entry entry : this.f14512c.entrySet()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        List list = (List) entry.getValue();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            Object a = ((C1168i) list.get(i)).mo1197a();
                            if (!TextUtils.isEmpty(a)) {
                                stringBuilder.append(a);
                                if (i != list.size() - 1) {
                                    stringBuilder.append(',');
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(stringBuilder.toString())) {
                            hashMap.put(entry.getKey(), stringBuilder.toString());
                        }
                    }
                    this.f14513d = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.f14513d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5193j)) {
            return false;
        }
        return this.f14512c.equals(((C5193j) obj).f14512c);
    }

    public final int hashCode() {
        return this.f14512c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LazyHeaders{headers=");
        stringBuilder.append(this.f14512c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
