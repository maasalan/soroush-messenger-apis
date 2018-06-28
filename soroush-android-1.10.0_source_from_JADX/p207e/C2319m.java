package p207e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.msgpack.util.TemplatePrecompiler;
import p056c.C0925e.C0924a;
import p056c.C0946s;
import p056c.C0946s.C0945a;
import p056c.C0949t;
import p056c.C0949t.C0948a;
import p056c.C0952v;
import p056c.C5044q;
import p056c.C5044q.C0943a;
import p056c.C5045w;
import p056c.C5045w.C0953a;
import p056c.C5045w.C0954b;
import p056c.aa;
import p056c.ab;
import p056c.ad;
import p207e.C2307c.C2306a;
import p207e.C2309d.C2308a;
import p207e.C2310h.C5712a;
import p207e.C2310h.C5713b;
import p207e.C2310h.C5714c;
import p207e.C2310h.C5715d;
import p207e.C2310h.C5716e;
import p207e.C2310h.C5717f;
import p207e.C2310h.C5718g;
import p207e.C2310h.C5719h;
import p207e.C2310h.C5720i;
import p207e.C2310h.C5721j;
import p207e.C2310h.C5722k;
import p207e.C2310h.C5723l;
import p207e.C2310h.C5724m;
import p207e.C2313j.C5727a;
import p207e.p208b.C2281a;
import p207e.p208b.C2283c;
import p207e.p208b.C2284d;
import p207e.p208b.C2289i;
import p207e.p208b.C2290j;
import p207e.p208b.C2297q;
import p207e.p208b.C2298r;
import p207e.p208b.C2299s;
import p207e.p208b.C2300t;
import p207e.p208b.C2301u;
import p207e.p208b.C2302v;
import p207e.p208b.C2304x;

final class C2319m<R, T> {
    static final Pattern f7633a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    static final Pattern f7634b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    final C0924a f7635c;
    final C2307c<R, T> f7636d;
    final C0949t f7637e;
    final C2309d<ad, R> f7638f;
    final String f7639g;
    final String f7640h;
    final C0946s f7641i;
    final C0952v f7642j;
    final boolean f7643k;
    final boolean f7644l;
    final boolean f7645m;
    final C2310h<?>[] f7646n;

    static final class C2318a<T, R> {
        final C2317l f7610a;
        final Method f7611b;
        final Annotation[] f7612c;
        final Annotation[][] f7613d;
        final Type[] f7614e;
        Type f7615f;
        boolean f7616g;
        boolean f7617h;
        boolean f7618i;
        boolean f7619j;
        boolean f7620k;
        boolean f7621l;
        String f7622m;
        boolean f7623n;
        boolean f7624o;
        boolean f7625p;
        String f7626q;
        C0946s f7627r;
        C0952v f7628s;
        Set<String> f7629t;
        C2310h<?>[] f7630u;
        C2309d<ad, T> f7631v;
        C2307c<T, R> f7632w;

        C2318a(C2317l c2317l, Method method) {
            this.f7610a = c2317l;
            this.f7611b = method;
            this.f7612c = method.getAnnotations();
            this.f7614e = method.getGenericParameterTypes();
            this.f7613d = method.getParameterAnnotations();
        }

        private C2310h<?> m6294a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof C2304x) {
                if (this.f7621l) {
                    throw m6298a(i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f7619j) {
                    throw m6298a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f7620k) {
                    throw m6298a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.f7626q != null) {
                    throw m6298a(i, "@Url cannot be used with @%s URL", this.f7622m);
                } else {
                    this.f7621l = true;
                    if (!(type == C0949t.class || type == String.class || type == URI.class)) {
                        if (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName())) {
                            throw m6298a(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                        }
                    }
                    return new C5724m();
                }
            } else if (annotation instanceof C2299s) {
                if (this.f7620k) {
                    throw m6298a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f7621l) {
                    throw m6298a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f7626q == null) {
                    throw m6298a(i, "@Path can only be used with relative url on @%s", this.f7622m);
                } else {
                    this.f7619j = true;
                    C2299s c2299s = (C2299s) annotation;
                    Object a = c2299s.m6256a();
                    if (!C2319m.f7634b.matcher(a).matches()) {
                        throw m6298a(i, "@Path parameter name must match %s. Found: %s", C2319m.f7633a.pattern(), a);
                    } else if (this.f7629t.contains(a)) {
                        return new C5719h(a, this.f7610a.m6290a(type, annotationArr), c2299s.m6257b());
                    } else {
                        throw m6298a(i, "URL \"%s\" does not contain \"{%s}\".", this.f7626q, a);
                    }
                }
            } else if (annotation instanceof C2300t) {
                C2300t c2300t = (C2300t) annotation;
                r0 = c2300t.m6258a();
                r12 = c2300t.m6259b();
                Class a2 = C2323n.m6307a(type);
                this.f7620k = true;
                if (Iterable.class.isAssignableFrom(a2)) {
                    if (type instanceof ParameterizedType) {
                        return new C5720i(r0, this.f7610a.m6290a(C2323n.m6309a(0, (ParameterizedType) type), annotationArr), r12).m6270a();
                    }
                    r10 = new StringBuilder();
                    r10.append(a2.getSimpleName());
                    r10.append(" must include generic type (e.g., ");
                    r10.append(a2.getSimpleName());
                    r10.append("<String>)");
                    throw m6298a(i, r10.toString(), new Object[0]);
                } else if (!a2.isArray()) {
                    return new C5720i(r0, this.f7610a.m6290a(type, annotationArr), r12);
                } else {
                    return new C5720i(r0, this.f7610a.m6290a(C2319m.m6302a(a2.getComponentType()), annotationArr), r12).m6272b();
                }
            } else if (annotation instanceof C2302v) {
                r12 = ((C2302v) annotation).m6261a();
                r0 = C2323n.m6307a(type);
                this.f7620k = true;
                if (Iterable.class.isAssignableFrom(r0)) {
                    if (type instanceof ParameterizedType) {
                        return new C5722k(this.f7610a.m6290a(C2323n.m6309a(0, (ParameterizedType) type), annotationArr), r12).m6270a();
                    }
                    r10 = new StringBuilder();
                    r10.append(r0.getSimpleName());
                    r10.append(" must include generic type (e.g., ");
                    r10.append(r0.getSimpleName());
                    r10.append("<String>)");
                    throw m6298a(i, r10.toString(), new Object[0]);
                } else if (!r0.isArray()) {
                    return new C5722k(this.f7610a.m6290a(type, annotationArr), r12);
                } else {
                    return new C5722k(this.f7610a.m6290a(C2319m.m6302a(r0.getComponentType()), annotationArr), r12).m6272b();
                }
            } else if (annotation instanceof C2301u) {
                r0 = C2323n.m6307a(type);
                if (Map.class.isAssignableFrom(r0)) {
                    type = C2323n.m6310a(type, r0, Map.class);
                    if (type instanceof ParameterizedType) {
                        r10 = (ParameterizedType) type;
                        r0 = C2323n.m6309a(0, r10);
                        if (String.class != r0) {
                            r10 = new StringBuilder("@QueryMap keys must be of type String: ");
                            r10.append(r0);
                            throw m6298a(i, r10.toString(), new Object[0]);
                        }
                        return new C5721j(this.f7610a.m6290a(C2323n.m6309a(1, r10), annotationArr), ((C2301u) annotation).m6260a());
                    }
                    throw m6298a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m6298a(i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C2289i) {
                String a3 = ((C2289i) annotation).m6247a();
                r0 = C2323n.m6307a(type);
                if (Iterable.class.isAssignableFrom(r0)) {
                    if (type instanceof ParameterizedType) {
                        return new C5715d(a3, this.f7610a.m6290a(C2323n.m6309a(0, (ParameterizedType) type), annotationArr)).m6270a();
                    }
                    r10 = new StringBuilder();
                    r10.append(r0.getSimpleName());
                    r10.append(" must include generic type (e.g., ");
                    r10.append(r0.getSimpleName());
                    r10.append("<String>)");
                    throw m6298a(i, r10.toString(), new Object[0]);
                } else if (!r0.isArray()) {
                    return new C5715d(a3, this.f7610a.m6290a(type, annotationArr));
                } else {
                    return new C5715d(a3, this.f7610a.m6290a(C2319m.m6302a(r0.getComponentType()), annotationArr)).m6272b();
                }
            } else if (annotation instanceof C2290j) {
                Class a4 = C2323n.m6307a(type);
                if (Map.class.isAssignableFrom(a4)) {
                    type = C2323n.m6310a(type, a4, Map.class);
                    if (type instanceof ParameterizedType) {
                        r10 = (ParameterizedType) type;
                        a4 = C2323n.m6309a(0, r10);
                        if (String.class != a4) {
                            r10 = new StringBuilder("@HeaderMap keys must be of type String: ");
                            r10.append(a4);
                            throw m6298a(i, r10.toString(), new Object[0]);
                        }
                        return new C5716e(this.f7610a.m6290a(C2323n.m6309a(1, r10), annotationArr));
                    }
                    throw m6298a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw m6298a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof C2283c) {
                if (this.f7624o) {
                    C2283c c2283c = (C2283c) annotation;
                    r0 = c2283c.m6239a();
                    r12 = c2283c.m6240b();
                    this.f7616g = true;
                    Class a5 = C2323n.m6307a(type);
                    if (Iterable.class.isAssignableFrom(a5)) {
                        if (type instanceof ParameterizedType) {
                            return new C5713b(r0, this.f7610a.m6290a(C2323n.m6309a(0, (ParameterizedType) type), annotationArr), r12).m6270a();
                        }
                        r10 = new StringBuilder();
                        r10.append(a5.getSimpleName());
                        r10.append(" must include generic type (e.g., ");
                        r10.append(a5.getSimpleName());
                        r10.append("<String>)");
                        throw m6298a(i, r10.toString(), new Object[0]);
                    } else if (!a5.isArray()) {
                        return new C5713b(r0, this.f7610a.m6290a(type, annotationArr), r12);
                    } else {
                        return new C5713b(r0, this.f7610a.m6290a(C2319m.m6302a(a5.getComponentType()), annotationArr), r12).m6272b();
                    }
                }
                throw m6298a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C2284d) {
                if (this.f7624o) {
                    r0 = C2323n.m6307a(type);
                    if (Map.class.isAssignableFrom(r0)) {
                        type = C2323n.m6310a(type, r0, Map.class);
                        if (type instanceof ParameterizedType) {
                            r10 = (ParameterizedType) type;
                            r0 = C2323n.m6309a(0, r10);
                            if (String.class != r0) {
                                r10 = new StringBuilder("@FieldMap keys must be of type String: ");
                                r10.append(r0);
                                throw m6298a(i, r10.toString(), new Object[0]);
                            }
                            C2309d a6 = this.f7610a.m6290a(C2323n.m6309a(1, r10), annotationArr);
                            this.f7616g = true;
                            return new C5714c(a6, ((C2284d) annotation).m6241a());
                        }
                        throw m6298a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m6298a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw m6298a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof C2297q) {
                if (this.f7625p) {
                    C2297q c2297q = (C2297q) annotation;
                    this.f7617h = true;
                    r0 = c2297q.m6253a();
                    Class a7 = C2323n.m6307a(type);
                    if (!r0.isEmpty()) {
                        String[] strArr = new String[4];
                        strArr[0] = "Content-Disposition";
                        StringBuilder stringBuilder = new StringBuilder("form-data; name=\"");
                        stringBuilder.append(r0);
                        stringBuilder.append("\"");
                        strArr[1] = stringBuilder.toString();
                        strArr[2] = "Content-Transfer-Encoding";
                        strArr[3] = c2297q.m6254b();
                        C0946s a8 = C0946s.m2343a(strArr);
                        if (Iterable.class.isAssignableFrom(a7)) {
                            if (type instanceof ParameterizedType) {
                                type = C2323n.m6309a(0, (ParameterizedType) type);
                                if (!C0954b.class.isAssignableFrom(C2323n.m6307a(type))) {
                                    return new C5717f(a8, this.f7610a.m6291a(type, annotationArr, this.f7612c)).m6270a();
                                }
                                throw m6298a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            r10 = new StringBuilder();
                            r10.append(a7.getSimpleName());
                            r10.append(" must include generic type (e.g., ");
                            r10.append(a7.getSimpleName());
                            r10.append("<String>)");
                            throw m6298a(i, r10.toString(), new Object[0]);
                        } else if (a7.isArray()) {
                            type = C2319m.m6302a(a7.getComponentType());
                            if (!C0954b.class.isAssignableFrom(type)) {
                                return new C5717f(a8, this.f7610a.m6291a(type, annotationArr, this.f7612c)).m6272b();
                            }
                            throw m6298a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!C0954b.class.isAssignableFrom(a7)) {
                            return new C5717f(a8, this.f7610a.m6291a(type, annotationArr, this.f7612c));
                        } else {
                            throw m6298a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(a7)) {
                        if (!(type instanceof ParameterizedType)) {
                            r10 = new StringBuilder();
                            r10.append(a7.getSimpleName());
                            r10.append(" must include generic type (e.g., ");
                            r10.append(a7.getSimpleName());
                            r10.append("<String>)");
                            throw m6298a(i, r10.toString(), new Object[0]);
                        } else if (C0954b.class.isAssignableFrom(C2323n.m6307a(C2323n.m6309a(0, (ParameterizedType) type)))) {
                            return C5723l.f15696a.m6270a();
                        } else {
                            throw m6298a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (a7.isArray()) {
                        if (C0954b.class.isAssignableFrom(a7.getComponentType())) {
                            return C5723l.f15696a.m6272b();
                        }
                        throw m6298a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (C0954b.class.isAssignableFrom(a7)) {
                        return C5723l.f15696a;
                    } else {
                        throw m6298a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                }
                throw m6298a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof C2298r) {
                if (this.f7625p) {
                    this.f7617h = true;
                    r0 = C2323n.m6307a(type);
                    if (Map.class.isAssignableFrom(r0)) {
                        type = C2323n.m6310a(type, r0, Map.class);
                        if (type instanceof ParameterizedType) {
                            r10 = (ParameterizedType) type;
                            r0 = C2323n.m6309a(0, r10);
                            if (String.class != r0) {
                                r10 = new StringBuilder("@PartMap keys must be of type String: ");
                                r10.append(r0);
                                throw m6298a(i, r10.toString(), new Object[0]);
                            }
                            type = C2323n.m6309a(1, r10);
                            if (!C0954b.class.isAssignableFrom(C2323n.m6307a(type))) {
                                return new C5718g(this.f7610a.m6291a(type, annotationArr, this.f7612c), ((C2298r) annotation).m6255a());
                            }
                            throw m6298a(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        throw m6298a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw m6298a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw m6298a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof C2281a)) {
                return null;
            } else {
                if (!this.f7624o) {
                    if (!this.f7625p) {
                        if (this.f7618i) {
                            throw m6298a(i, "Multiple @Body method annotations found.", new Object[0]);
                        }
                        try {
                            C2309d a9 = this.f7610a.m6291a(type, annotationArr, this.f7612c);
                            this.f7618i = true;
                            return new C5712a(a9);
                        } catch (Throwable e) {
                            Object[] objArr = new Object[]{type};
                            r10 = new StringBuilder();
                            r10.append("Unable to create @Body converter for %s");
                            r10.append(" (parameter #");
                            r10.append(i + 1);
                            r10.append(")");
                            throw m6299a(e, r10.toString(), objArr);
                        }
                    }
                }
                throw m6298a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            }
        }

        final C0946s m6295a(String[] strArr) {
            C0945a c0945a = new C0945a();
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                int indexOf = str.indexOf(58);
                if (!(indexOf == -1 || indexOf == 0)) {
                    if (indexOf != str.length() - 1) {
                        String substring = str.substring(0, indexOf);
                        str = str.substring(indexOf + 1).trim();
                        if ("Content-Type".equalsIgnoreCase(substring)) {
                            C0952v a = C0952v.m2385a(str);
                            if (a == null) {
                                throw m6299a(null, "Malformed content type: %s", str);
                            }
                            this.f7628s = a;
                        } else {
                            c0945a.m2340a(substring, str);
                        }
                        i++;
                    }
                }
                throw m6299a(null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
            }
            return c0945a.m2341a();
        }

        final C2307c<T, R> m6296a() {
            Object genericReturnType = this.f7611b.getGenericReturnType();
            if (C2323n.m6318d(genericReturnType)) {
                throw m6299a(null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType == Void.TYPE) {
                throw m6299a(null, "Service methods cannot return void.", new Object[0]);
            } else {
                Object annotations = this.f7611b.getAnnotations();
                try {
                    int i;
                    C2317l c2317l = this.f7610a;
                    C2323n.m6308a(genericReturnType, "returnType == null");
                    C2323n.m6308a(annotations, "annotations == null");
                    int indexOf = c2317l.f7606d.indexOf(null) + 1;
                    int size = c2317l.f7606d.size();
                    for (i = indexOf; i < size; i++) {
                        C2307c<T, R> a = ((C2306a) c2317l.f7606d.get(i)).mo2059a(genericReturnType);
                        if (a != null) {
                            return a;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder("Could not locate call adapter for ");
                    stringBuilder.append(genericReturnType);
                    stringBuilder.append(".\n");
                    stringBuilder.append("  Tried:");
                    i = c2317l.f7606d.size();
                    while (indexOf < i) {
                        stringBuilder.append("\n   * ");
                        stringBuilder.append(((C2306a) c2317l.f7606d.get(indexOf)).getClass().getName());
                        indexOf++;
                    }
                    throw new IllegalArgumentException(stringBuilder.toString());
                } catch (Throwable e) {
                    throw m6299a(e, "Unable to create call adapter for %s", genericReturnType);
                }
            }
        }

        final C2310h<?> m6297a(int i, Type type, Annotation[] annotationArr) {
            C2310h<?> c2310h = null;
            for (Annotation a : annotationArr) {
                C2310h<?> a2 = m6294a(i, type, annotationArr, a);
                if (a2 != null) {
                    if (c2310h != null) {
                        throw m6298a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                    c2310h = a2;
                }
            }
            if (c2310h != null) {
                return c2310h;
            }
            throw m6298a(i, "No Retrofit annotation found.", new Object[0]);
        }

        final RuntimeException m6298a(int i, String str, Object... objArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" (parameter #");
            stringBuilder.append(i + 1);
            stringBuilder.append(")");
            return m6299a(null, stringBuilder.toString(), objArr);
        }

        final RuntimeException m6299a(Throwable th, String str, Object... objArr) {
            str = String.format(str, objArr);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("\n    for method ");
            stringBuilder.append(this.f7611b.getDeclaringClass().getSimpleName());
            stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
            stringBuilder.append(this.f7611b.getName());
            return new IllegalArgumentException(stringBuilder.toString(), th);
        }

        final void m6300a(String str, String str2, boolean z) {
            if (this.f7622m != null) {
                throw m6299a(null, "Only one HTTP method is allowed. Found: %s and %s.", this.f7622m, str);
            }
            this.f7622m = str;
            this.f7623n = z;
            if (!str2.isEmpty()) {
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    if (C2319m.f7633a.matcher(str2.substring(indexOf + 1)).find()) {
                        throw m6299a(null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", str2.substring(indexOf + 1));
                    }
                }
                this.f7626q = str2;
                this.f7629t = C2319m.m6303a(str2);
            }
        }

        final C2309d<ad, T> m6301b() {
            Object annotations = this.f7611b.getAnnotations();
            try {
                C2317l c2317l = this.f7610a;
                Object obj = this.f7615f;
                C2323n.m6308a(obj, "type == null");
                C2323n.m6308a(annotations, "annotations == null");
                int indexOf = c2317l.f7605c.indexOf(null) + 1;
                int size = c2317l.f7605c.size();
                for (int i = indexOf; i < size; i++) {
                    C2309d<ad, T> a = ((C2308a) c2317l.f7605c.get(i)).mo2056a(obj, annotations);
                    if (a != null) {
                        return a;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("Could not locate ResponseBody converter for ");
                stringBuilder.append(obj);
                stringBuilder.append(".\n");
                stringBuilder.append("  Tried:");
                int size2 = c2317l.f7605c.size();
                while (indexOf < size2) {
                    stringBuilder.append("\n   * ");
                    stringBuilder.append(((C2308a) c2317l.f7605c.get(indexOf)).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(stringBuilder.toString());
            } catch (Throwable e) {
                throw m6299a(e, "Unable to create converter for %s", this.f7615f);
            }
        }
    }

    C2319m(C2318a<R, T> c2318a) {
        this.f7635c = c2318a.f7610a.f7603a;
        this.f7636d = c2318a.f7632w;
        this.f7637e = c2318a.f7610a.f7604b;
        this.f7638f = c2318a.f7631v;
        this.f7639g = c2318a.f7622m;
        this.f7640h = c2318a.f7626q;
        this.f7641i = c2318a.f7627r;
        this.f7642j = c2318a.f7628s;
        this.f7643k = c2318a.f7623n;
        this.f7644l = c2318a.f7624o;
        this.f7645m = c2318a.f7625p;
        this.f7646n = c2318a.f7630u;
    }

    static Class<?> m6302a(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            cls = Short.class;
        }
        return cls;
    }

    static Set<String> m6303a(String str) {
        Matcher matcher = f7633a.matcher(str);
        Set<String> linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    final aa m6304a(Object... objArr) {
        C2313j c2313j = new C2313j(this.f7639g, this.f7637e, this.f7640h, this.f7641i, this.f7642j, this.f7643k, this.f7644l, this.f7645m);
        C2310h[] c2310hArr = this.f7646n;
        int length = objArr != null ? objArr.length : 0;
        if (length != c2310hArr.length) {
            StringBuilder stringBuilder = new StringBuilder("Argument count (");
            stringBuilder.append(length);
            stringBuilder.append(") doesn't match expected count (");
            stringBuilder.append(c2310hArr.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        C0949t b;
        for (int i = 0; i < length; i++) {
            c2310hArr[i].mo2063a(c2313j, objArr[i]);
        }
        C0948a c0948a = c2313j.f7583d;
        if (c0948a != null) {
            b = c0948a.m2355b();
        } else {
            b = c2313j.f7581b.m2370c(c2313j.f7582c);
            if (b == null) {
                StringBuilder stringBuilder2 = new StringBuilder("Malformed URL. Base: ");
                stringBuilder2.append(c2313j.f7581b);
                stringBuilder2.append(", Relative: ");
                stringBuilder2.append(c2313j.f7582c);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
        ab abVar = c2313j.f7589j;
        if (abVar == null) {
            ab c5044q;
            if (c2313j.f7588i != null) {
                C0943a c0943a = c2313j.f7588i;
                c5044q = new C5044q(c0943a.f2983a, c0943a.f2984b);
            } else if (c2313j.f7587h != null) {
                C0953a c0953a = c2313j.f7587h;
                if (c0953a.f3024c.isEmpty()) {
                    throw new IllegalStateException("Multipart body must have at least one part.");
                }
                c5044q = new C5045w(c0953a.f3022a, c0953a.f3023b, c0953a.f3024c);
            } else if (c2313j.f7586g) {
                abVar = ab.m2250a(null, new byte[0]);
            }
            abVar = c5044q;
        }
        C0952v c0952v = c2313j.f7585f;
        if (c0952v != null) {
            if (abVar != null) {
                abVar = new C5727a(abVar, c0952v);
            } else {
                c2313j.f7584e.m2244b("Content-Type", c0952v.toString());
            }
        }
        return c2313j.f7584e.m2238a(b).m2240a(c2313j.f7580a, abVar).m2242a();
    }
}
