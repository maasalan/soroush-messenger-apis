package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.aa;
import java.util.Arrays;

public abstract class C1486k {
    protected final boolean f4639a;

    public static final class C1484d {
        public final C1545o<Object> f4635a;
        public final C1486k f4636b;

        public C1484d(C1545o<Object> c1545o, C1486k c1486k) {
            this.f4635a = c1545o;
            this.f4636b = c1486k;
        }
    }

    private static final class C1485f {
        public final Class<?> f4637a;
        public final C1545o<Object> f4638b;

        public C1485f(Class<?> cls, C1545o<Object> c1545o) {
            this.f4637a = cls;
            this.f4638b = c1545o;
        }
    }

    private static final class C5356a extends C1486k {
        private final Class<?> f14917b;
        private final Class<?> f14918c;
        private final C1545o<Object> f14919d;
        private final C1545o<Object> f14920e;

        public C5356a(C1486k c1486k, Class<?> cls, C1545o<Object> c1545o, Class<?> cls2, C1545o<Object> c1545o2) {
            super(c1486k);
            this.f14917b = cls;
            this.f14919d = c1545o;
            this.f14918c = cls2;
            this.f14920e = c1545o2;
        }

        public final C1486k mo1459a(Class<?> cls, C1545o<Object> c1545o) {
            return new C5358c(this, new C1485f[]{new C1485f(this.f14917b, this.f14919d), new C1485f(this.f14918c, this.f14920e), new C1485f(cls, c1545o)});
        }

        public final C1545o<Object> mo1460a(Class<?> cls) {
            return cls == this.f14917b ? this.f14919d : cls == this.f14918c ? this.f14920e : null;
        }
    }

    private static final class C5357b extends C1486k {
        public static final C5357b f14921b = new C5357b(false);
        public static final C5357b f14922c = new C5357b(true);

        private C5357b(boolean z) {
            super(z);
        }

        public final C1486k mo1459a(Class<?> cls, C1545o<Object> c1545o) {
            return new C5359e(this, cls, c1545o);
        }

        public final C1545o<Object> mo1460a(Class<?> cls) {
            return null;
        }
    }

    private static final class C5358c extends C1486k {
        private final C1485f[] f14923b;

        public C5358c(C1486k c1486k, C1485f[] c1485fArr) {
            super(c1486k);
            this.f14923b = c1485fArr;
        }

        public final C1486k mo1459a(Class<?> cls, C1545o<Object> c1545o) {
            int length = this.f14923b.length;
            if (length == 8) {
                return this.a ? new C5359e(this, cls, c1545o) : this;
            } else {
                C1485f[] c1485fArr = (C1485f[]) Arrays.copyOf(this.f14923b, length + 1);
                c1485fArr[length] = new C1485f(cls, c1545o);
                return new C5358c(this, c1485fArr);
            }
        }

        public final C1545o<Object> mo1460a(Class<?> cls) {
            for (C1485f c1485f : this.f14923b) {
                if (c1485f.f4637a == cls) {
                    return c1485f.f4638b;
                }
            }
            return null;
        }
    }

    private static final class C5359e extends C1486k {
        private final Class<?> f14924b;
        private final C1545o<Object> f14925c;

        public C5359e(C1486k c1486k, Class<?> cls, C1545o<Object> c1545o) {
            super(c1486k);
            this.f14924b = cls;
            this.f14925c = c1545o;
        }

        public final C1486k mo1459a(Class<?> cls, C1545o<Object> c1545o) {
            return new C5356a(this, this.f14924b, this.f14925c, cls, c1545o);
        }

        public final C1545o<Object> mo1460a(Class<?> cls) {
            return cls == this.f14924b ? this.f14925c : null;
        }
    }

    protected C1486k(C1486k c1486k) {
        this.f4639a = c1486k.f4639a;
    }

    protected C1486k(boolean z) {
        this.f4639a = z;
    }

    public final C1484d m3822a(C5354j c5354j, aa aaVar, C1446d c1446d) {
        C1545o a = aaVar.m11037a(c5354j, c1446d);
        return new C1484d(a, mo1459a(c5354j.m11531e(), a));
    }

    public final C1484d m3823a(Class<?> cls, aa aaVar, C1446d c1446d) {
        C1545o a = aaVar.m11041a((Class) cls, c1446d);
        return new C1484d(a, mo1459a(cls, a));
    }

    public abstract C1486k mo1459a(Class<?> cls, C1545o<Object> c1545o);

    public abstract C1545o<Object> mo1460a(Class<?> cls);
}
