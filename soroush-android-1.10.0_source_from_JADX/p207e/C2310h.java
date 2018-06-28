package p207e;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Map.Entry;
import p056c.C0946s;
import p056c.C5045w.C0954b;
import p056c.ab;

abstract class C2310h<T> {

    class C57101 extends C2310h<Iterable<T>> {
        final /* synthetic */ C2310h f15671a;

        C57101(C2310h c2310h) {
            this.f15671a = c2310h;
        }

        final /* synthetic */ void mo2063a(C2313j c2313j, Object obj) {
            Iterable<Object> iterable = (Iterable) obj;
            if (iterable != null) {
                for (Object a : iterable) {
                    this.f15671a.mo2063a(c2313j, a);
                }
            }
        }
    }

    class C57112 extends C2310h<Object> {
        final /* synthetic */ C2310h f15672a;

        C57112(C2310h c2310h) {
            this.f15672a = c2310h;
        }

        final void mo2063a(C2313j c2313j, Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    this.f15672a.mo2063a(c2313j, Array.get(obj, i));
                }
            }
        }
    }

    static final class C5712a<T> extends C2310h<T> {
        private final C2309d<T, ab> f15673a;

        C5712a(C2309d<T, ab> c2309d) {
            this.f15673a = c2309d;
        }

        final void mo2063a(C2313j c2313j, T t) {
            if (t == null) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
            try {
                c2313j.f7589j = (ab) this.f15673a.mo2054a(t);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("Unable to convert ");
                stringBuilder.append(t);
                stringBuilder.append(" to RequestBody");
                throw new RuntimeException(stringBuilder.toString(), e);
            }
        }
    }

    static final class C5713b<T> extends C2310h<T> {
        private final String f15674a;
        private final C2309d<T, String> f15675b;
        private final boolean f15676c;

        C5713b(String str, C2309d<T, String> c2309d, boolean z) {
            this.f15674a = (String) C2323n.m6308a((Object) str, "name == null");
            this.f15675b = c2309d;
            this.f15676c = z;
        }

        final void mo2063a(C2313j c2313j, T t) {
            if (t != null) {
                String str = (String) this.f15675b.mo2054a(t);
                if (str != null) {
                    c2313j.m6283b(this.f15674a, str, this.f15676c);
                }
            }
        }
    }

    static final class C5714c<T> extends C2310h<Map<String, T>> {
        private final C2309d<T, String> f15677a;
        private final boolean f15678b;

        C5714c(C2309d<T, String> c2309d, boolean z) {
            this.f15677a = c2309d;
            this.f15678b = z;
        }

        final /* synthetic */ void mo2063a(C2313j c2313j, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw new IllegalArgumentException("Field map was null.");
            }
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Field map contained null key.");
                }
                Object value = entry.getValue();
                if (value == null) {
                    StringBuilder stringBuilder = new StringBuilder("Field map contained null value for key '");
                    stringBuilder.append(str);
                    stringBuilder.append("'.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                String str2 = (String) this.f15677a.mo2054a(value);
                if (str2 == null) {
                    stringBuilder = new StringBuilder("Field map value '");
                    stringBuilder.append(value);
                    stringBuilder.append("' converted to null by ");
                    stringBuilder.append(this.f15677a.getClass().getName());
                    stringBuilder.append(" for key '");
                    stringBuilder.append(str);
                    stringBuilder.append("'.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                c2313j.m6283b(str, str2, this.f15678b);
            }
        }
    }

    static final class C5715d<T> extends C2310h<T> {
        private final String f15679a;
        private final C2309d<T, String> f15680b;

        C5715d(String str, C2309d<T, String> c2309d) {
            this.f15679a = (String) C2323n.m6308a((Object) str, "name == null");
            this.f15680b = c2309d;
        }

        final void mo2063a(C2313j c2313j, T t) {
            if (t != null) {
                String str = (String) this.f15680b.mo2054a(t);
                if (str != null) {
                    c2313j.m6281a(this.f15679a, str);
                }
            }
        }
    }

    static final class C5716e<T> extends C2310h<Map<String, T>> {
        private final C2309d<T, String> f15681a;

        C5716e(C2309d<T, String> c2309d) {
            this.f15681a = c2309d;
        }

        final /* synthetic */ void mo2063a(C2313j c2313j, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw new IllegalArgumentException("Header map was null.");
            }
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Header map contained null key.");
                }
                Object value = entry.getValue();
                if (value == null) {
                    StringBuilder stringBuilder = new StringBuilder("Header map contained null value for key '");
                    stringBuilder.append(str);
                    stringBuilder.append("'.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                c2313j.m6281a(str, (String) this.f15681a.mo2054a(value));
            }
        }
    }

    static final class C5717f<T> extends C2310h<T> {
        private final C0946s f15682a;
        private final C2309d<T, ab> f15683b;

        C5717f(C0946s c0946s, C2309d<T, ab> c2309d) {
            this.f15682a = c0946s;
            this.f15683b = c2309d;
        }

        final void mo2063a(C2313j c2313j, T t) {
            if (t != null) {
                try {
                    c2313j.m6280a(this.f15682a, (ab) this.f15683b.mo2054a(t));
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder("Unable to convert ");
                    stringBuilder.append(t);
                    stringBuilder.append(" to RequestBody");
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
            }
        }
    }

    static final class C5718g<T> extends C2310h<Map<String, T>> {
        private final C2309d<T, ab> f15684a;
        private final String f15685b;

        C5718g(C2309d<T, ab> c2309d, String str) {
            this.f15684a = c2309d;
            this.f15685b = str;
        }

        final /* synthetic */ void mo2063a(C2313j c2313j, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw new IllegalArgumentException("Part map was null.");
            }
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Part map contained null key.");
                }
                Object value = entry.getValue();
                if (value == null) {
                    StringBuilder stringBuilder = new StringBuilder("Part map contained null value for key '");
                    stringBuilder.append(str);
                    stringBuilder.append("'.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                String[] strArr = new String[4];
                strArr[0] = "Content-Disposition";
                StringBuilder stringBuilder2 = new StringBuilder("form-data; name=\"");
                stringBuilder2.append(str);
                stringBuilder2.append("\"");
                strArr[1] = stringBuilder2.toString();
                strArr[2] = "Content-Transfer-Encoding";
                strArr[3] = this.f15685b;
                c2313j.m6280a(C0946s.m2343a(strArr), (ab) this.f15684a.mo2054a(value));
            }
        }
    }

    static final class C5719h<T> extends C2310h<T> {
        private final String f15686a;
        private final C2309d<T, String> f15687b;
        private final boolean f15688c;

        C5719h(String str, C2309d<T, String> c2309d, boolean z) {
            this.f15686a = (String) C2323n.m6308a((Object) str, "name == null");
            this.f15687b = c2309d;
            this.f15688c = z;
        }

        final void mo2063a(C2313j c2313j, T t) {
            if (t == null) {
                StringBuilder stringBuilder = new StringBuilder("Path parameter \"");
                stringBuilder.append(this.f15686a);
                stringBuilder.append("\" value must not be null.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            String str = this.f15686a;
            String str2 = (String) this.f15687b.mo2054a(t);
            boolean z = this.f15688c;
            if (c2313j.f7582c == null) {
                throw new AssertionError();
            }
            String str3 = c2313j.f7582c;
            StringBuilder stringBuilder2 = new StringBuilder("{");
            stringBuilder2.append(str);
            stringBuilder2.append("}");
            c2313j.f7582c = str3.replace(stringBuilder2.toString(), C2313j.m6279a(str2, z));
        }
    }

    static final class C5720i<T> extends C2310h<T> {
        private final String f15689a;
        private final C2309d<T, String> f15690b;
        private final boolean f15691c;

        C5720i(String str, C2309d<T, String> c2309d, boolean z) {
            this.f15689a = (String) C2323n.m6308a((Object) str, "name == null");
            this.f15690b = c2309d;
            this.f15691c = z;
        }

        final void mo2063a(C2313j c2313j, T t) {
            if (t != null) {
                String str = (String) this.f15690b.mo2054a(t);
                if (str != null) {
                    c2313j.m6282a(this.f15689a, str, this.f15691c);
                }
            }
        }
    }

    static final class C5721j<T> extends C2310h<Map<String, T>> {
        private final C2309d<T, String> f15692a;
        private final boolean f15693b;

        C5721j(C2309d<T, String> c2309d, boolean z) {
            this.f15692a = c2309d;
            this.f15693b = z;
        }

        final /* synthetic */ void mo2063a(C2313j c2313j, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                throw new IllegalArgumentException("Query map was null.");
            }
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Query map contained null key.");
                }
                Object value = entry.getValue();
                if (value == null) {
                    StringBuilder stringBuilder = new StringBuilder("Query map contained null value for key '");
                    stringBuilder.append(str);
                    stringBuilder.append("'.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                String str2 = (String) this.f15692a.mo2054a(value);
                if (str2 == null) {
                    stringBuilder = new StringBuilder("Query map value '");
                    stringBuilder.append(value);
                    stringBuilder.append("' converted to null by ");
                    stringBuilder.append(this.f15692a.getClass().getName());
                    stringBuilder.append(" for key '");
                    stringBuilder.append(str);
                    stringBuilder.append("'.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                c2313j.m6282a(str, str2, this.f15693b);
            }
        }
    }

    static final class C5722k<T> extends C2310h<T> {
        private final C2309d<T, String> f15694a;
        private final boolean f15695b;

        C5722k(C2309d<T, String> c2309d, boolean z) {
            this.f15694a = c2309d;
            this.f15695b = z;
        }

        final void mo2063a(C2313j c2313j, T t) {
            if (t != null) {
                c2313j.m6282a((String) this.f15694a.mo2054a(t), null, this.f15695b);
            }
        }
    }

    static final class C5723l extends C2310h<C0954b> {
        static final C5723l f15696a = new C5723l();

        private C5723l() {
        }

        final /* bridge */ /* synthetic */ void mo2063a(C2313j c2313j, Object obj) {
            C0954b c0954b = (C0954b) obj;
            if (c0954b != null) {
                c2313j.f7587h.m2387a(c0954b);
            }
        }
    }

    static final class C5724m extends C2310h<Object> {
        C5724m() {
        }

        final void mo2063a(C2313j c2313j, Object obj) {
            C2323n.m6308a(obj, "@Url parameter is null.");
            c2313j.f7582c = obj.toString();
        }
    }

    C2310h() {
    }

    final C2310h<Iterable<T>> m6270a() {
        return new C57101(this);
    }

    abstract void mo2063a(C2313j c2313j, T t);

    final C2310h<Object> m6272b() {
        return new C57112(this);
    }
}
