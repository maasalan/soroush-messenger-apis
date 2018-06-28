package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p124c.C1443v;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p124c.p126b.ab;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C6493h;
import com.p111d.p112a.p121c.p128f.C6494i;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.io.Serializable;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class C1412d {
    protected static final String[] f4455a = new String[]{"default", "String", "int", "long", "double", "boolean", "delegate", "property-based"};
    protected final C1445c f4456b;
    protected final boolean f4457c;
    protected final boolean f4458d;
    protected final C6494i[] f4459e = new C6494i[9];
    protected int f4460f = 0;
    protected boolean f4461g = false;
    protected C6488s[] f4462h;
    protected C6488s[] f4463i;
    protected C6488s[] f4464j;
    protected C6493h f4465k;

    protected static final class C5309a extends C1443v implements Serializable {
        private final int f14730a;

        public C5309a(int i) {
            this.f14730a = i;
        }

        public final Object mo1300a(C5347g c5347g) {
            switch (this.f14730a) {
                case 1:
                    return new ArrayList();
                case 2:
                    return new LinkedHashMap();
                case 3:
                    return new HashMap();
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unknown type ");
                    stringBuilder.append(this.f14730a);
                    throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final String mo1301a() {
            Class cls;
            switch (this.f14730a) {
                case 1:
                    cls = ArrayList.class;
                    break;
                case 2:
                    cls = LinkedHashMap.class;
                    break;
                case 3:
                    cls = HashMap.class;
                    break;
                default:
                    cls = Object.class;
                    break;
            }
            return cls.getName();
        }

        public final boolean mo1302b() {
            return true;
        }

        public final boolean mo1303h() {
            return true;
        }
    }

    public C1412d(C1445c c1445c, C5306f<?> c5306f) {
        this.f4456b = c1445c;
        this.f4457c = c5306f.m11086j();
        this.f4458d = c5306f.m11077a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    private <T extends C5328e> T m3466a(T t) {
        if (t != null && this.f4457c) {
            C1527g.m3961a((Member) t.mo1358a(), this.f4458d);
        }
        return t;
    }

    private C5354j m3467a(C6494i c6494i, C6488s[] c6488sArr) {
        if (this.f4461g) {
            if (c6494i != null) {
                int i = 0;
                if (c6488sArr != null) {
                    int length = c6488sArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (c6488sArr[i2] == null) {
                            i = i2;
                            break;
                        }
                    }
                }
                return c6494i.mo3352a(i);
            }
        }
        return null;
    }

    private void m3468a(C6494i c6494i, int i, boolean z) {
        boolean z2 = true;
        int i2 = 1 << i;
        this.f4461g = true;
        C6494i c6494i2 = this.f4459e[i];
        if (c6494i2 != null) {
            if ((this.f4460f & i2) != 0) {
                if (!z) {
                    return;
                }
            } else if (z) {
                z2 = false;
            }
            if (z2 && c6494i2.getClass() == c6494i.getClass()) {
                Class h = c6494i2.mo3356h();
                Class h2 = c6494i.mo3356h();
                if (h == h2) {
                    StringBuilder stringBuilder = new StringBuilder("Conflicting ");
                    stringBuilder.append(f4455a[i]);
                    stringBuilder.append(" creators: already had explicitly marked ");
                    stringBuilder.append(c6494i2);
                    stringBuilder.append(", encountered ");
                    stringBuilder.append(c6494i);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (h2.isAssignableFrom(h)) {
                    return;
                }
            }
        }
        if (z) {
            this.f4460f |= i2;
        }
        this.f4459e[i] = (C6494i) m3466a((C5328e) c6494i);
    }

    public final C1443v m3469a() {
        C5354j a = m3467a(this.f4459e[6], this.f4462h);
        C5354j a2 = m3467a(this.f4459e[8], this.f4463i);
        C5354j a3 = this.f4456b.m3615a();
        if (!this.f4461g) {
            Class e = a3.m11531e();
            if (!(e == Collection.class || e == List.class)) {
                if (e != ArrayList.class) {
                    if (e != Map.class) {
                        if (e != LinkedHashMap.class) {
                            if (e == HashMap.class) {
                                return new C5309a(3);
                            }
                        }
                    }
                    return new C5309a(2);
                }
            }
            return new C5309a(1);
        }
        C1443v abVar = new ab(a3);
        abVar.m11130a(this.f4459e[0], this.f4459e[6], a, this.f4462h, this.f4459e[7], this.f4464j);
        abVar.m11131a(this.f4459e[8], a2, this.f4463i);
        abVar.m11129a(this.f4459e[1]);
        abVar.m11134b(this.f4459e[2]);
        abVar.m11135c(this.f4459e[3]);
        abVar.m11137d(this.f4459e[4]);
        abVar.m11139e(this.f4459e[5]);
        abVar.m11128a(this.f4465k);
        return abVar;
    }

    public final void m3470a(C6494i c6494i) {
        this.f4459e[0] = (C6494i) m3466a((C5328e) c6494i);
    }

    public final void m3471a(C6494i c6494i, boolean z) {
        m3468a(c6494i, 1, z);
    }

    public final void m3472a(C6494i c6494i, boolean z, C6488s[] c6488sArr) {
        if (c6494i.mo3352a(0).mo3396o()) {
            m3468a(c6494i, 8, z);
            this.f4463i = c6488sArr;
            return;
        }
        m3468a(c6494i, 6, z);
        this.f4462h = c6488sArr;
    }

    public final void m3473b(C6494i c6494i, boolean z) {
        m3468a(c6494i, 2, z);
    }

    public final void m3474b(C6494i c6494i, boolean z, C6488s[] c6488sArr) {
        m3468a(c6494i, 7, z);
        if (c6488sArr.length > 1) {
            HashMap hashMap = new HashMap();
            int i = 0;
            int length = c6488sArr.length;
            while (i < length) {
                String f = c6488sArr[i].m15554f();
                if (f.length() != 0 || c6488sArr[i].mo3349e() == null) {
                    Integer num = (Integer) hashMap.put(f, Integer.valueOf(i));
                    if (num != null) {
                        StringBuilder stringBuilder = new StringBuilder("Duplicate creator property \"");
                        stringBuilder.append(f);
                        stringBuilder.append("\" (index ");
                        stringBuilder.append(num);
                        stringBuilder.append(" vs ");
                        stringBuilder.append(i);
                        stringBuilder.append(")");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                i++;
            }
        }
        this.f4464j = c6488sArr;
    }

    public final boolean m3475b() {
        return this.f4459e[0] != null;
    }

    public final void m3476c(C6494i c6494i, boolean z) {
        m3468a(c6494i, 3, z);
    }

    public final boolean m3477c() {
        return this.f4459e[6] != null;
    }

    public final void m3478d(C6494i c6494i, boolean z) {
        m3468a(c6494i, 4, z);
    }

    public final boolean m3479d() {
        return this.f4459e[7] != null;
    }

    public final void m3480e(C6494i c6494i, boolean z) {
        m3468a(c6494i, 5, z);
    }
}
