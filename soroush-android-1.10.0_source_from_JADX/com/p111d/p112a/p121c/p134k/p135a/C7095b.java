package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C5364l.C7122a;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C7119d;
import com.p111d.p112a.p121c.p134k.p136b.C6514d;
import com.p111d.p112a.p121c.p138m.C1534n;

public final class C7095b extends C6514d {
    protected final C6514d f20212a;

    public C7095b(C6514d c6514d) {
        super(c6514d, null);
        this.f20212a = c6514d;
    }

    private C7095b(C6514d c6514d, C1483i c1483i, Object obj) {
        super(c6514d, c1483i, obj);
        this.f20212a = c6514d;
    }

    private C7095b(C6514d c6514d, String[] strArr) {
        super(c6514d, strArr);
        this.f20212a = c6514d;
    }

    private void m18541c(Object obj, C5301g c5301g, aa aaVar) {
        C7119d[] c7119dArr = (this.e == null || aaVar.m11060e() == null) ? this.d : this.e;
        int i = 0;
        try {
            int length = c7119dArr.length;
            while (i < length) {
                C7119d c7119d = c7119dArr[i];
                if (c7119d == null) {
                    c5301g.writeNull();
                } else {
                    c7119d.mo3538b(obj, c5301g, aaVar);
                }
                i++;
            }
        } catch (Throwable e) {
            wrapAndThrow(aaVar, e, obj, 0 == c7119dArr.length ? "[anySetter]" : c7119dArr[0].m18635e());
        } catch (Throwable e2) {
            C5364l a = C5364l.m11571a(c5301g, "Infinite recursion (StackOverflowError)", e2);
            a.m11583a(new C7122a(obj, 0 == c7119dArr.length ? "[anySetter]" : c7119dArr[0].m18635e()));
            throw a;
        }
    }

    protected final C6514d mo3366a() {
        return this;
    }

    public final C6514d mo3367a(C1483i c1483i) {
        return this.f20212a.mo3367a(c1483i);
    }

    public final C6514d mo3368a(Object obj) {
        return new C7095b(this, this.i, obj);
    }

    protected final /* synthetic */ C6514d mo3369a(String[] strArr) {
        return new C7095b(this, strArr);
    }

    public final boolean isUnwrappingSerializer() {
        return false;
    }

    public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
        if (aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) {
            C7119d[] c7119dArr = (this.e == null || aaVar.m11060e() == null) ? this.d : this.e;
            Object obj2 = 1;
            if (c7119dArr.length != 1) {
                obj2 = null;
            }
            if (obj2 != null) {
                m18541c(obj, c5301g, aaVar);
                return;
            }
        }
        c5301g.writeStartArray();
        c5301g.setCurrentValue(obj);
        m18541c(obj, c5301g, aaVar);
        c5301g.writeEndArray();
    }

    public final void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        if (this.i != null) {
            m15709a(obj, c5301g, aaVar, c1478f);
            return;
        }
        String b = this.h == null ? null : m15711b(obj);
        if (b == null) {
            c1478f.mo2909c(obj, c5301g);
        } else {
            c1478f.mo2906b(c5301g, b);
        }
        m18541c(obj, c5301g, aaVar);
        if (b == null) {
            c1478f.mo2912f(obj, c5301g);
        } else {
            c1478f.mo2908b(obj, c5301g, b);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BeanAsArraySerializer for ");
        stringBuilder.append(handledType().getName());
        return stringBuilder.toString();
    }

    public final C1545o<Object> unwrappingSerializer(C1534n c1534n) {
        return this.f20212a.unwrappingSerializer(c1534n);
    }

    public final /* synthetic */ C1545o withFilterId(Object obj) {
        return mo3368a(obj);
    }
}
