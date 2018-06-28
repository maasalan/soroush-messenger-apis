package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1320j.C1318c;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p129g.C1467e;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p134k.C1498j;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public abstract class C7109l<T> extends ak<T> implements C1498j {
    protected final Boolean f20238b;
    protected final DateFormat f20239c;

    protected C7109l(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this.f20238b = bool;
        this.f20239c = dateFormat;
    }

    protected abstract long mo3545a(T t);

    public abstract C7109l<T> mo3546a(Boolean bool, DateFormat dateFormat);

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        if (c1446d != null) {
            C1319d findFormat = aaVar.m11059d().findFormat(c1446d.mo1354c());
            if (findFormat != null) {
                if (findFormat.f4140b.m3110a()) {
                    return mo3546a(Boolean.TRUE, null);
                }
                if (findFormat.f4140b == C1318c.STRING) {
                    TimeZone b = findFormat.m3115b();
                    DateFormat simpleDateFormat = new SimpleDateFormat(findFormat.m3116c() ? findFormat.f4139a : "yyyy-MM-dd'T'HH:mm:ss.SSSZ", findFormat.m3117d() ? findFormat.f4141c : aaVar.m11063h());
                    if (b == null) {
                        b = aaVar.m11064i();
                    }
                    simpleDateFormat.setTimeZone(b);
                    return mo3546a(Boolean.FALSE, simpleDateFormat);
                }
            }
        }
        return this;
    }

    protected final void m18586a(C5345c c5345c, C5354j c5354j, boolean z) {
        if (z) {
            visitIntFormat(c5345c, c5354j, C1377b.LONG, C1467e.UTC_MILLISEC);
        } else {
            visitStringFormat(c5345c, c5354j, C1467e.DATE_TIME);
        }
    }

    protected final boolean m18587a(aa aaVar) {
        if (this.f20238b != null) {
            return this.f20238b.booleanValue();
        }
        if (this.f20239c != null) {
            return false;
        }
        if (aaVar != null) {
            return aaVar.m11046a(C5387z.WRITE_DATES_AS_TIMESTAMPS);
        }
        StringBuilder stringBuilder = new StringBuilder("Null SerializerProvider passed for ");
        stringBuilder.append(handledType().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        m18586a(c5345c, c5354j, m18587a(c5345c.mo2892a()));
    }

    public C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode(m18587a(aaVar) ? "number" : "string", true);
    }

    public boolean isEmpty(aa aaVar, T t) {
        if (t != null) {
            if (mo3545a((Object) t) != 0) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public boolean isEmpty(T t) {
        if (t != null) {
            if (mo3545a((Object) t) != 0) {
                return false;
            }
        }
        return true;
    }
}
