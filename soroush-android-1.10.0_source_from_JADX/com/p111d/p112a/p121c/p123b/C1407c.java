package com.p111d.p112a.p121c.p123b;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class C1407c {

    public static class C5305a extends C1407c implements Serializable {
        protected static final C5305a f14721a = new C5305a(Collections.emptyMap());
        protected static final Object f14722b = new Object();
        protected final Map<?, ?> f14723c;
        protected transient Map<Object, Object> f14724d;

        private C5305a(Map<?, ?> map) {
            this.f14723c = map;
            this.f14724d = null;
        }

        private C5305a(Map<?, ?> map, Map<Object, Object> map2) {
            this.f14723c = map;
            this.f14724d = map2;
        }

        public static C1407c m11069a() {
            return f14721a;
        }

        public final C1407c mo1298a(Object obj, Object obj2) {
            if (obj2 == null) {
                if (!this.f14723c.containsKey(obj)) {
                    return this;
                }
                obj2 = f14722b;
            }
            if (this.f14724d == null) {
                Map hashMap = new HashMap();
                if (obj2 == null) {
                    obj2 = f14722b;
                }
                hashMap.put(obj, obj2);
                return new C5305a(this.f14723c, hashMap);
            }
            this.f14724d.put(obj, obj2);
            return this;
        }

        public final Object mo1299a(Object obj) {
            if (this.f14724d != null) {
                Object obj2 = this.f14724d.get(obj);
                if (obj2 != null) {
                    return obj2 == f14722b ? null : obj2;
                }
            }
            return this.f14723c.get(obj);
        }
    }

    public abstract C1407c mo1298a(Object obj, Object obj2);

    public abstract Object mo1299a(Object obj);
}
