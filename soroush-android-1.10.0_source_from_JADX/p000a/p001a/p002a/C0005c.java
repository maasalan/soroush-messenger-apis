package p000a.p001a.p002a;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

public class C0005c {
    public static String f13a = "Event";
    static volatile C0005c f14b;
    private static final C0006d f15d = new C0006d();
    private static final Map<Class<?>, List<Class<?>>> f16e = new HashMap();
    final ExecutorService f17c;
    private final Map<Class<?>, CopyOnWriteArrayList<C0015m>> f18f;
    private final Map<Object, List<Class<?>>> f19g;
    private final Map<Class<?>, Object> f20h;
    private final ThreadLocal<C0004a> f21i;
    private final C0008f f22j;
    private final C0001b f23k;
    private final C0000a f24l;
    private final C0014l f25m;
    private final boolean f26n;
    private final boolean f27o;
    private final boolean f28p;
    private final boolean f29q;
    private final boolean f30r;
    private final boolean f31s;

    class C00021 extends ThreadLocal<C0004a> {
        final /* synthetic */ C0005c f5a;

        C00021(C0005c c0005c) {
            this.f5a = c0005c;
        }

        protected final /* synthetic */ Object initialValue() {
            return new C0004a();
        }
    }

    static final class C0004a {
        final List<Object> f7a = new ArrayList();
        boolean f8b;
        boolean f9c;
        C0015m f10d;
        Object f11e;
        boolean f12f;

        C0004a() {
        }
    }

    public C0005c() {
        this(f15d);
    }

    private C0005c(C0006d c0006d) {
        this.f21i = new C00021(this);
        this.f18f = new HashMap();
        this.f19g = new HashMap();
        this.f20h = new ConcurrentHashMap();
        this.f22j = new C0008f(this, Looper.getMainLooper());
        this.f23k = new C0001b(this);
        this.f24l = new C0000a(this);
        this.f25m = new C0014l(c0006d.f40h);
        this.f27o = c0006d.f33a;
        this.f28p = c0006d.f34b;
        this.f29q = c0006d.f35c;
        this.f30r = c0006d.f36d;
        this.f26n = c0006d.f37e;
        this.f31s = c0006d.f38f;
        this.f17c = c0006d.f39g;
    }

    public static C0005c m0a() {
        if (f14b == null) {
            synchronized (C0005c.class) {
                if (f14b == null) {
                    f14b = new C0005c();
                }
            }
        }
        return f14b;
    }

    private static List<Class<?>> m1a(Class<?> cls) {
        List<Class<?>> list;
        synchronized (f16e) {
            list = (List) f16e.get(cls);
            if (list == null) {
                list = new ArrayList();
                for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    C0005c.m3a((List) list, cls2.getInterfaces());
                }
                f16e.put(cls, list);
            }
        }
        return list;
    }

    private void m2a(C0015m c0015m, Object obj) {
        try {
            c0015m.f64b.f57a.invoke(c0015m.f63a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            String str;
            StringBuilder stringBuilder;
            if (obj instanceof C0012j) {
                if (this.f27o) {
                    str = f13a;
                    stringBuilder = new StringBuilder("SubscriberExceptionEvent subscriber ");
                    stringBuilder.append(c0015m.f63a.getClass());
                    stringBuilder.append(" threw an exception");
                    Log.e(str, stringBuilder.toString(), cause);
                    C0012j c0012j = (C0012j) obj;
                    String str2 = f13a;
                    StringBuilder stringBuilder2 = new StringBuilder("Initial event ");
                    stringBuilder2.append(c0012j.f55c);
                    stringBuilder2.append(" caused exception in ");
                    stringBuilder2.append(c0012j.f56d);
                    Log.e(str2, stringBuilder2.toString(), c0012j.f54b);
                }
            } else if (this.f26n) {
                throw new C0007e("Invoking subscriber failed", cause);
            } else {
                if (this.f27o) {
                    str = f13a;
                    stringBuilder = new StringBuilder("Could not dispatch event: ");
                    stringBuilder.append(obj.getClass());
                    stringBuilder.append(" to subscribing class ");
                    stringBuilder.append(c0015m.f63a.getClass());
                    Log.e(str, stringBuilder.toString(), cause);
                }
                if (this.f29q) {
                    m9d(new C0012j(this, cause, obj, c0015m.f63a));
                }
            }
        } catch (Throwable e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    private static void m3a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                C0005c.m3a((List) list, cls.getInterfaces());
            }
        }
    }

    private boolean m4a(Object obj, C0004a c0004a, Class<?> cls) {
        synchronized (this) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f18f.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C0015m c0015m = (C0015m) it.next();
            c0004a.f11e = obj;
            c0004a.f10d = c0015m;
            try {
                boolean z = c0004a.f9c;
                C0010h a;
                Runnable runnable;
                switch (c0015m.f64b.f58b) {
                    case PostThread:
                        break;
                    case MainThread:
                        if (!z) {
                            C0008f c0008f = this.f22j;
                            a = C0010h.m10a(c0015m, obj);
                            synchronized (c0008f) {
                                c0008f.f41a.m13a(a);
                                if (!c0008f.f42b) {
                                    c0008f.f42b = true;
                                    if (!c0008f.sendMessage(c0008f.obtainMessage())) {
                                        throw new C0007e("Could not send handler message");
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case BackgroundThread:
                        if (z) {
                            runnable = this.f23k;
                            a = C0010h.m10a(c0015m, obj);
                            synchronized (runnable) {
                                runnable.f2a.m13a(a);
                                if (!runnable.f4c) {
                                    runnable.f4c = true;
                                    runnable.f3b.f17c.execute(runnable);
                                }
                            }
                            break;
                        }
                        break;
                    case Async:
                        runnable = this.f24l;
                        runnable.f0a.m13a(C0010h.m10a(c0015m, obj));
                        runnable.f1b.f17c.execute(runnable);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder("Unknown thread mode: ");
                        stringBuilder.append(c0015m.f64b.f58b);
                        throw new IllegalStateException(stringBuilder.toString());
                }
                m2a(c0015m, obj);
                boolean z2 = c0004a.f12f;
                c0004a.f11e = null;
                c0004a.f10d = null;
                c0004a.f12f = false;
                if (z2) {
                    return true;
                }
            } catch (Throwable th) {
                c0004a.f11e = null;
                c0004a.f10d = null;
                c0004a.f12f = false;
            }
        }
        return true;
    }

    final void m5a(C0010h c0010h) {
        Object obj = c0010h.f48a;
        C0015m c0015m = c0010h.f49b;
        C0010h.m11a(c0010h);
        if (c0015m.f66d) {
            m2a(c0015m, obj);
        }
    }

    public final synchronized void m6a(Object obj) {
        for (C0013k c0013k : this.f25m.m17a(obj.getClass())) {
            Class cls = c0013k.f59c;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f18f.get(cls);
            C0015m c0015m = new C0015m(obj, c0013k);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.f18f.put(cls, copyOnWriteArrayList);
            } else if (copyOnWriteArrayList.contains(c0015m)) {
                StringBuilder stringBuilder = new StringBuilder("Subscriber ");
                stringBuilder.append(obj.getClass());
                stringBuilder.append(" already registered to event ");
                stringBuilder.append(cls);
                throw new C0007e(stringBuilder.toString());
            }
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i <= size) {
                if (i != size) {
                    if (c0015m.f65c <= ((C0015m) copyOnWriteArrayList.get(i)).f65c) {
                        i++;
                    }
                }
                copyOnWriteArrayList.add(i, c0015m);
                break;
            }
            List list = (List) this.f19g.get(obj);
            if (list == null) {
                list = new ArrayList();
                this.f19g.put(obj, list);
            }
            list.add(cls);
        }
    }

    public final synchronized boolean m7b(Object obj) {
        return this.f19g.containsKey(obj);
    }

    public final synchronized void m8c(Object obj) {
        List<Class> list = (List) this.f19g.get(obj);
        if (list != null) {
            for (Class cls : list) {
                List list2 = (List) this.f18f.get(cls);
                if (list2 != null) {
                    int size = list2.size();
                    int i = 0;
                    while (i < size) {
                        C0015m c0015m = (C0015m) list2.get(i);
                        if (c0015m.f63a == obj) {
                            c0015m.f66d = false;
                            list2.remove(i);
                            i--;
                            size--;
                        }
                        i++;
                    }
                }
            }
            this.f19g.remove(obj);
            return;
        }
        String str = f13a;
        StringBuilder stringBuilder = new StringBuilder("Subscriber to unregister was not registered before: ");
        stringBuilder.append(obj.getClass());
        Log.w(str, stringBuilder.toString());
    }

    public final void m9d(Object obj) {
        C0004a c0004a = (C0004a) this.f21i.get();
        List list = c0004a.f7a;
        list.add(obj);
        if (!c0004a.f8b) {
            c0004a.f9c = Looper.getMainLooper() == Looper.myLooper();
            c0004a.f8b = true;
            if (c0004a.f12f) {
                throw new C0007e("Internal error. Abort state was not reset");
            }
            while (!list.isEmpty()) {
                try {
                    int i;
                    obj = list.remove(0);
                    Class cls = obj.getClass();
                    if (this.f31s) {
                        List a = C0005c.m1a(cls);
                        int i2 = 0;
                        i = i2;
                        while (i2 < a.size()) {
                            i |= m4a(obj, c0004a, (Class) a.get(i2));
                            i2++;
                        }
                    } else {
                        i = m4a(obj, c0004a, cls);
                    }
                    if (i == 0) {
                        if (this.f28p) {
                            String str = f13a;
                            StringBuilder stringBuilder = new StringBuilder("No subscribers registered for event ");
                            stringBuilder.append(cls);
                            Log.d(str, stringBuilder.toString());
                        }
                        if (!(!this.f30r || cls == C0009g.class || cls == C0012j.class)) {
                            m9d(new C0009g(this, obj));
                        }
                    }
                } finally {
                    c0004a.f8b = false;
                    c0004a.f9c = false;
                }
            }
        }
    }
}
