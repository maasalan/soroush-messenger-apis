package p207e;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p056c.C0925e.C0924a;
import p056c.C0949t;
import p056c.C5047x;
import p056c.ab;
import p056c.ac;
import p207e.C2307c.C2306a;
import p207e.C2309d.C2308a;
import p207e.C2319m.C2318a;
import p207e.C5701a.C5696d;
import p207e.p208b.C2282b;
import p207e.p208b.C2285e;
import p207e.p208b.C2286f;
import p207e.p208b.C2287g;
import p207e.p208b.C2288h;
import p207e.p208b.C2291k;
import p207e.p208b.C2292l;
import p207e.p208b.C2293m;
import p207e.p208b.C2294n;
import p207e.p208b.C2295o;
import p207e.p208b.C2296p;

public final class C2317l {
    final C0924a f7603a;
    final C0949t f7604b;
    final List<C2308a> f7605c;
    final List<C2306a> f7606d;
    final Executor f7607e;
    final boolean f7608f;
    private final Map<Method, C2319m<?, ?>> f7609g = new ConcurrentHashMap();

    public static final class C2316a {
        private final C2312i f7596a;
        private C0924a f7597b;
        private C0949t f7598c;
        private final List<C2308a> f7599d;
        private final List<C2306a> f7600e;
        private Executor f7601f;
        private boolean f7602g;

        public C2316a() {
            this(C2312i.m6273a());
        }

        private C2316a(C2312i c2312i) {
            this.f7599d = new ArrayList();
            this.f7600e = new ArrayList();
            this.f7596a = c2312i;
            this.f7599d.add(new C5701a());
        }

        public final C2316a m6286a(C5047x c5047x) {
            this.f7597b = (C0924a) C2323n.m6308a((C0924a) C2323n.m6308a((Object) c5047x, "client == null"), "factory == null");
            return this;
        }

        public final C2316a m6287a(C2308a c2308a) {
            this.f7599d.add(C2323n.m6308a((Object) c2308a, "factory == null"));
            return this;
        }

        public final C2316a m6288a(String str) {
            C2323n.m6308a((Object) str, "baseUrl == null");
            Object e = C0949t.m2367e(str);
            if (e == null) {
                StringBuilder stringBuilder = new StringBuilder("Illegal URL: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            C2323n.m6308a(e, "baseUrl == null");
            List list = e.f3010d;
            if ("".equals(list.get(list.size() - 1))) {
                this.f7598c = e;
                return this;
            }
            stringBuilder = new StringBuilder("baseUrl must end in /: ");
            stringBuilder.append(e);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final C2317l m6289a() {
            if (this.f7598c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            C0924a c0924a = this.f7597b;
            if (c0924a == null) {
                c0924a = new C5047x();
            }
            C0924a c0924a2 = c0924a;
            Executor executor = this.f7601f;
            if (executor == null) {
                executor = this.f7596a.mo2065b();
            }
            Executor executor2 = executor;
            List arrayList = new ArrayList(this.f7600e);
            arrayList.add(this.f7596a.mo2064a(executor2));
            return new C2317l(c0924a2, this.f7598c, new ArrayList(this.f7599d), arrayList, executor2, this.f7602g);
        }
    }

    C2317l(C0924a c0924a, C0949t c0949t, List<C2308a> list, List<C2306a> list2, Executor executor, boolean z) {
        this.f7603a = c0924a;
        this.f7604b = c0949t;
        this.f7605c = Collections.unmodifiableList(list);
        this.f7606d = Collections.unmodifiableList(list2);
        this.f7607e = executor;
        this.f7608f = z;
    }

    public final <T> C2309d<T, String> m6290a(Type type, Annotation[] annotationArr) {
        C2323n.m6308a((Object) type, "type == null");
        C2323n.m6308a((Object) annotationArr, "annotations == null");
        int size = this.f7605c.size();
        for (int i = 0; i < size; i++) {
            this.f7605c.get(i);
        }
        return C5696d.f15644a;
    }

    public final <T> C2309d<T, ab> m6291a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C2323n.m6308a((Object) type, "type == null");
        C2323n.m6308a((Object) annotationArr, "parameterAnnotations == null");
        C2323n.m6308a((Object) annotationArr2, "methodAnnotations == null");
        int indexOf = this.f7605c.indexOf(null) + 1;
        int size = this.f7605c.size();
        for (int i = indexOf; i < size; i++) {
            C2309d<T, ab> a = ((C2308a) this.f7605c.get(i)).mo2055a(type);
            if (a != null) {
                return a;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Could not locate RequestBody converter for ");
        stringBuilder.append(type);
        stringBuilder.append(".\n");
        stringBuilder.append("  Tried:");
        int size2 = this.f7605c.size();
        while (indexOf < size2) {
            stringBuilder.append("\n   * ");
            stringBuilder.append(((C2308a) this.f7605c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    final C2319m<?, ?> m6292a(Method method) {
        C2319m<?, ?> c2319m = (C2319m) this.f7609g.get(method);
        if (c2319m != null) {
            return c2319m;
        }
        C2319m<?, ?> c2319m2;
        synchronized (this.f7609g) {
            c2319m2 = (C2319m) this.f7609g.get(method);
            if (c2319m2 == null) {
                C2318a c2318a = new C2318a(this, method);
                c2318a.f7632w = c2318a.m6296a();
                c2318a.f7615f = c2318a.f7632w.mo2058a();
                if (c2318a.f7615f != C2314k.class) {
                    if (c2318a.f7615f != ac.class) {
                        int i;
                        c2318a.f7631v = c2318a.m6301b();
                        for (Annotation annotation : c2318a.f7612c) {
                            String str;
                            String a;
                            if (annotation instanceof C2282b) {
                                str = "DELETE";
                                a = ((C2282b) annotation).m6238a();
                            } else if (annotation instanceof C2286f) {
                                str = "GET";
                                a = ((C2286f) annotation).m6242a();
                            } else {
                                if (annotation instanceof C2287g) {
                                    c2318a.m6300a("HEAD", ((C2287g) annotation).m6243a(), false);
                                    if (!Void.class.equals(c2318a.f7615f)) {
                                        throw c2318a.m6299a(null, "HEAD method must use Void as response type.", new Object[0]);
                                    }
                                } else {
                                    String str2;
                                    if (annotation instanceof C2294n) {
                                        str2 = "PATCH";
                                        a = ((C2294n) annotation).m6250a();
                                    } else if (annotation instanceof C2295o) {
                                        str2 = "POST";
                                        a = ((C2295o) annotation).m6251a();
                                    } else if (annotation instanceof C2296p) {
                                        str2 = "PUT";
                                        a = ((C2296p) annotation).m6252a();
                                    } else if (annotation instanceof C2293m) {
                                        str = "OPTIONS";
                                        a = ((C2293m) annotation).m6249a();
                                    } else if (annotation instanceof C2288h) {
                                        C2288h c2288h = (C2288h) annotation;
                                        c2318a.m6300a(c2288h.m6244a(), c2288h.m6245b(), c2288h.m6246c());
                                    } else if (annotation instanceof C2291k) {
                                        String[] a2 = ((C2291k) annotation).m6248a();
                                        if (a2.length == 0) {
                                            throw c2318a.m6299a(null, "@Headers annotation is empty.", new Object[0]);
                                        }
                                        c2318a.f7627r = c2318a.m6295a(a2);
                                    } else if (annotation instanceof C2292l) {
                                        if (c2318a.f7624o) {
                                            throw c2318a.m6299a(null, "Only one encoding annotation is allowed.", new Object[0]);
                                        }
                                        c2318a.f7625p = true;
                                    } else if (!(annotation instanceof C2285e)) {
                                        continue;
                                    } else if (c2318a.f7625p) {
                                        throw c2318a.m6299a(null, "Only one encoding annotation is allowed.", new Object[0]);
                                    } else {
                                        c2318a.f7624o = true;
                                    }
                                    c2318a.m6300a(str2, a, true);
                                }
                            }
                            c2318a.m6300a(str, a, false);
                        }
                        if (c2318a.f7622m == null) {
                            throw c2318a.m6299a(null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                        }
                        if (!c2318a.f7623n) {
                            if (c2318a.f7625p) {
                                throw c2318a.m6299a(null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                            } else if (c2318a.f7624o) {
                                throw c2318a.m6299a(null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                            }
                        }
                        int length = c2318a.f7613d.length;
                        c2318a.f7630u = new C2310h[length];
                        for (i = 0; i < length; i++) {
                            Type type = c2318a.f7614e[i];
                            if (C2323n.m6318d(type)) {
                                throw c2318a.m6298a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                            }
                            Annotation[] annotationArr = c2318a.f7613d[i];
                            if (annotationArr == null) {
                                throw c2318a.m6298a(i, "No Retrofit annotation found.", new Object[0]);
                            }
                            c2318a.f7630u[i] = c2318a.m6297a(i, type, annotationArr);
                        }
                        if (c2318a.f7626q == null && !c2318a.f7621l) {
                            throw c2318a.m6299a(null, "Missing either @%s URL or @Url parameter.", c2318a.f7622m);
                        } else if (!c2318a.f7624o && !c2318a.f7625p && !c2318a.f7623n && c2318a.f7618i) {
                            throw c2318a.m6299a(null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                        } else if (c2318a.f7624o && !c2318a.f7616g) {
                            throw c2318a.m6299a(null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                        } else if (!c2318a.f7625p || c2318a.f7617h) {
                            C2319m<?, ?> c2319m3 = new C2319m(c2318a);
                            this.f7609g.put(method, c2319m3);
                            c2319m2 = c2319m3;
                        } else {
                            throw c2318a.m6299a(null, "Multipart method must contain at least one @Part.", new Object[0]);
                        }
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("'");
                stringBuilder.append(C2323n.m6307a(c2318a.f7615f).getName());
                stringBuilder.append("' is not a valid response body type. Did you mean ResponseBody?");
                throw c2318a.m6299a(null, stringBuilder.toString(), new Object[0]);
            }
        }
        return c2319m2;
    }

    public final <T> T m6293a(final Class<T> cls) {
        C2323n.m6312a((Class) cls);
        if (this.f7608f) {
            C2312i a = C2312i.m6273a();
            for (Method method : cls.getDeclaredMethods()) {
                if (!a.mo2067a(method)) {
                    m6292a(method);
                }
            }
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler(this) {
            final /* synthetic */ C2317l f7594b;
            private final C2312i f7595c = C2312i.m6273a();

            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.f7595c.mo2067a(method)) {
                    return this.f7595c.mo2066a(method, cls, obj, objArr);
                }
                C2319m a = this.f7594b.m6292a(method);
                return a.f7636d.mo2057a(new C5709g(a, objArr));
            }
        });
    }
}
