package com.p085c.p086a.p089c.p092b.p093a;

import android.util.Log;
import com.p085c.p086a.p109i.C1271h;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class C5120i implements C1104b {
    private final C1108g<C5118a, Object> f14304a;
    private final C5119b f14305b;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f14306c;
    private final Map<Class<?>, C1103a<?>> f14307d;
    private final int f14308e;
    private int f14309f;

    private static final class C5118a implements C1111l {
        int f14301a;
        Class<?> f14302b;
        private final C5119b f14303c;

        C5118a(C5119b c5119b) {
            this.f14303c = c5119b;
        }

        public final void mo1118a() {
            this.f14303c.m2684a(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C5118a) {
                C5118a c5118a = (C5118a) obj;
                if (this.f14301a == c5118a.f14301a && this.f14302b == c5118a.f14302b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (31 * this.f14301a) + (this.f14302b != null ? this.f14302b.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Key{size=");
            stringBuilder.append(this.f14301a);
            stringBuilder.append("array=");
            stringBuilder.append(this.f14302b);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    private static final class C5119b extends C1105d<C5118a> {
        C5119b() {
        }

        final C5118a m10505a(int i, Class<?> cls) {
            C5118a c5118a = (C5118a) m2685b();
            c5118a.f14301a = i;
            c5118a.f14302b = cls;
            return c5118a;
        }

        protected final /* synthetic */ C1111l mo1119a() {
            return new C5118a(this);
        }
    }

    public C5120i() {
        this.f14304a = new C1108g();
        this.f14305b = new C5119b();
        this.f14306c = new HashMap();
        this.f14307d = new HashMap();
        this.f14308e = 4194304;
    }

    public C5120i(int i) {
        this.f14304a = new C1108g();
        this.f14305b = new C5119b();
        this.f14306c = new HashMap();
        this.f14307d = new HashMap();
        this.f14308e = i;
    }

    private NavigableMap<Integer, Integer> m10507a(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f14306c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.f14306c.put(cls, treeMap);
        return treeMap;
    }

    private <T> C1103a<T> m10508b(Class<T> cls) {
        C1103a<T> c1103a = (C1103a) this.f14307d.get(cls);
        if (c1103a != null) {
            return c1103a;
        }
        if (cls.equals(int[].class)) {
            c1103a = new C5117h();
        } else if (cls.equals(byte[].class)) {
            c1103a = new C5116f();
        } else {
            StringBuilder stringBuilder = new StringBuilder("No array pool found for: ");
            stringBuilder.append(cls.getSimpleName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f14307d.put(cls, c1103a);
        return c1103a;
    }

    private void m10509b(int i) {
        while (this.f14309f > i) {
            Object a = this.f14304a.m2696a();
            C1271h.m3012a(a, "Argument must not be null");
            C1103a b = m10508b(a.getClass());
            this.f14309f -= b.mo1126a(a) * b.mo1129b();
            m10510b(b.mo1126a(a), a.getClass());
            if (Log.isLoggable(b.mo1128a(), 2)) {
                String a2 = b.mo1128a();
                StringBuilder stringBuilder = new StringBuilder("evicted: ");
                stringBuilder.append(b.mo1126a(a));
                Log.v(a2, stringBuilder.toString());
            }
        }
    }

    private void m10510b(int i, Class<?> cls) {
        NavigableMap a = m10507a((Class) cls);
        Integer num = (Integer) a.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder stringBuilder = new StringBuilder("Tried to decrement empty size, size: ");
            stringBuilder.append(i);
            stringBuilder.append(", this: ");
            stringBuilder.append(this);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num.intValue() == 1) {
            a.remove(Integer.valueOf(i));
        } else {
            a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    public final <T> T mo1130a(int i, Class<T> cls) {
        Object a;
        C1103a b = m10508b((Class) cls);
        synchronized (this) {
            Integer num = (Integer) m10507a((Class) cls).ceilingKey(Integer.valueOf(i));
            Object obj = 1;
            if (num != null) {
                Object obj2;
                if (this.f14309f != 0) {
                    if (this.f14308e / this.f14309f < 2) {
                        obj2 = null;
                        if (obj2 == null) {
                            if (num.intValue() <= 8 * i) {
                            }
                        }
                        a = this.f14304a.m2697a(obj != null ? this.f14305b.m10505a(num.intValue(), cls) : this.f14305b.m10505a(i, cls));
                        if (a != null) {
                            this.f14309f -= b.mo1126a(a) * b.mo1129b();
                            m10510b(b.mo1126a(a), cls);
                        }
                    }
                }
                obj2 = 1;
                if (obj2 == null) {
                    if (num.intValue() <= 8 * i) {
                    }
                }
                if (obj != null) {
                }
                a = this.f14304a.m2697a(obj != null ? this.f14305b.m10505a(num.intValue(), cls) : this.f14305b.m10505a(i, cls));
                if (a != null) {
                    this.f14309f -= b.mo1126a(a) * b.mo1129b();
                    m10510b(b.mo1126a(a), cls);
                }
            }
            obj = null;
            if (obj != null) {
            }
            a = this.f14304a.m2697a(obj != null ? this.f14305b.m10505a(num.intValue(), cls) : this.f14305b.m10505a(i, cls));
            if (a != null) {
                this.f14309f -= b.mo1126a(a) * b.mo1129b();
                m10510b(b.mo1126a(a), cls);
            }
        }
        if (a != null) {
            return a;
        }
        if (Log.isLoggable(b.mo1128a(), 2)) {
            String a2 = b.mo1128a();
            StringBuilder stringBuilder = new StringBuilder("Allocated ");
            stringBuilder.append(i);
            stringBuilder.append(" bytes");
            Log.v(a2, stringBuilder.toString());
        }
        return b.mo1127a(i);
    }

    public final synchronized void mo1131a() {
        m10509b(0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo1132a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = 40;
        if (r2 < r0) goto L_0x000c;
    L_0x0005:
        r1.mo1131a();	 Catch:{ all -> 0x000a }
        monitor-exit(r1);
        return;
    L_0x000a:
        r2 = move-exception;
        goto L_0x0018;
    L_0x000c:
        r0 = 20;
        if (r2 < r0) goto L_0x001a;
    L_0x0010:
        r2 = r1.f14308e;	 Catch:{ all -> 0x000a }
        r2 = r2 / 2;
        r1.m10509b(r2);	 Catch:{ all -> 0x000a }
        goto L_0x001a;
    L_0x0018:
        monitor-exit(r1);
        throw r2;
    L_0x001a:
        monitor-exit(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.b.a.i.a(int):void");
    }

    public final synchronized <T> void mo1133a(T t, Class<T> cls) {
        C1103a b = m10508b((Class) cls);
        int a = b.mo1126a((Object) t);
        int b2 = b.mo1129b() * a;
        int i = 1;
        if ((b2 <= this.f14308e / 2 ? 1 : 0) != 0) {
            C5118a a2 = this.f14305b.m10505a(a, cls);
            this.f14304a.m2698a(a2, t);
            NavigableMap a3 = m10507a((Class) cls);
            Integer num = (Integer) a3.get(Integer.valueOf(a2.f14301a));
            Integer valueOf = Integer.valueOf(a2.f14301a);
            if (num != null) {
                i = 1 + num.intValue();
            }
            a3.put(valueOf, Integer.valueOf(i));
            this.f14309f += b2;
            m10509b(this.f14308e);
        }
    }
}
