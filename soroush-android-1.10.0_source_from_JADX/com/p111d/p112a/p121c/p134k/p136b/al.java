package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1320j.C1316a;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p129g.C1465a;
import com.p111d.p112a.p121c.p129g.C1467e;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p130h.C1470c;
import com.p111d.p112a.p121c.p133j.C1480j;
import com.p111d.p112a.p121c.p133j.C7415o;
import com.p111d.p112a.p121c.p134k.C1495c;
import com.p111d.p112a.p121c.p134k.C1499l;
import com.p111d.p112a.p121c.p134k.C1502n;
import com.p111d.p112a.p121c.p134k.p135a.C5361m.C53601;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1529i;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public abstract class al<T> extends C1545o<T> implements C1470c, Serializable {
    private static final Object CONVERTING_CONTENT_CONVERTER_LOCK = new Object();
    private static final long serialVersionUID = 1;
    protected final Class<T> _handledType;

    protected al(C5354j c5354j) {
        this._handledType = c5354j.m11531e();
    }

    protected al(al<?> alVar) {
        this._handledType = alVar._handledType;
    }

    protected al(Class<T> cls) {
        this._handledType = cls;
    }

    protected al(Class<?> cls, boolean z) {
        this._handledType = cls;
    }

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
    }

    protected C7415o createObjectNode() {
        return C1480j.f4616b.m3819c();
    }

    protected C7415o createSchemaNode(String str) {
        C7415o createObjectNode = createObjectNode();
        createObjectNode.m19719a(IjkMediaMeta.IJKM_KEY_TYPE, str);
        return createObjectNode;
    }

    protected C7415o createSchemaNode(String str, boolean z) {
        C7415o createSchemaNode = createSchemaNode(str);
        if (!z) {
            createSchemaNode.m19720a("required", z ^ 1);
        }
        return createSchemaNode;
    }

    protected C1545o<?> findConvertingContentSerializer(aa aaVar, C1446d c1446d, C1545o<?> c1545o) {
        if (aaVar.m11052b(CONVERTING_CONTENT_CONVERTER_LOCK) != null) {
            return c1545o;
        }
        Object d = aaVar.m11059d();
        if (!(d == null || c1446d == null)) {
            C5328e c = c1446d.mo1354c();
            if (c != null) {
                aaVar.m11033a(CONVERTING_CONTENT_CONVERTER_LOCK, Boolean.TRUE);
                try {
                    d = d.findSerializationContentConverter(c);
                    if (d != null) {
                        C1545o a;
                        c1446d.mo1354c();
                        C1529i a2 = aaVar.m3652a(d);
                        aaVar.mo1297b();
                        C5354j c2 = a2.m3992c();
                        if (c1545o == null && !c2.m11543q()) {
                            a = aaVar.m11036a(c2);
                        }
                        return new ag(a2, c2, a);
                    }
                } finally {
                    Object obj = CONVERTING_CONTENT_CONVERTER_LOCK;
                    aaVar.m11033a(obj, null);
                }
            }
        }
        return c1545o;
    }

    protected Boolean findFormatFeature(aa aaVar, C1446d c1446d, Class<?> cls, C1316a c1316a) {
        C1319d findFormatOverrides = findFormatOverrides(aaVar, c1446d, cls);
        return findFormatOverrides != null ? findFormatOverrides.m3114a(c1316a) : null;
    }

    protected C1319d findFormatOverrides(aa aaVar, C1446d c1446d, Class<?> cls) {
        return c1446d != null ? c1446d.mo1349a(aaVar.m11058c()) : aaVar.m11062g();
    }

    protected C1502n findPropertyFilter(aa aaVar, Object obj, Object obj2) {
        C1499l j = aaVar.m11065j();
        if (j == null) {
            StringBuilder stringBuilder = new StringBuilder("Can not resolve PropertyFilter with id '");
            stringBuilder.append(obj);
            stringBuilder.append("'; no FilterProvider configured");
            throw C5364l.m11576a(stringBuilder.toString());
        }
        C1495c a = j.m3862a();
        return a == null ? null : new C53601(a);
    }

    public C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("string");
    }

    public C6524m getSchema(aa aaVar, Type type, boolean z) {
        C7415o c7415o = (C7415o) getSchema(aaVar, type);
        if (!z) {
            c7415o.m19720a("required", z ^ 1);
        }
        return c7415o;
    }

    public Class<T> handledType() {
        return this._handledType;
    }

    protected boolean isDefaultSerializer(C1545o<?> c1545o) {
        return C1527g.m3962a((Object) c1545o);
    }

    public abstract void serialize(T t, C5301g c5301g, aa aaVar);

    protected void visitArrayFormat(C5345c c5345c, C5354j c5354j, C1465a c1465a) {
    }

    protected void visitArrayFormat(C5345c c5345c, C5354j c5354j, C1545o<?> c1545o, C5354j c5354j2) {
    }

    protected void visitFloatFormat(C5345c c5345c, C5354j c5354j, C1377b c1377b) {
    }

    protected void visitIntFormat(C5345c c5345c, C5354j c5354j, C1377b c1377b) {
    }

    protected void visitIntFormat(C5345c c5345c, C5354j c5354j, C1377b c1377b, C1467e c1467e) {
    }

    protected void visitStringFormat(C5345c c5345c, C5354j c5354j) {
    }

    protected void visitStringFormat(C5345c c5345c, C5354j c5354j, C1467e c1467e) {
    }

    public void wrapAndThrow(aa aaVar, Throwable th, Object obj, int i) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        Object obj2;
        if (aaVar != null) {
            if (!aaVar.m11046a(C5387z.WRAP_EXCEPTIONS)) {
                obj2 = null;
                if (th instanceof IOException) {
                    if (obj2 == null && (th instanceof RuntimeException)) {
                        throw ((RuntimeException) th);
                    }
                } else if (obj2 == null || !(th instanceof C5364l)) {
                    throw ((IOException) th);
                }
                throw C5364l.m11579a(th, obj, i);
            }
        }
        obj2 = 1;
        if (th instanceof IOException) {
            throw ((RuntimeException) th);
        }
        throw ((IOException) th);
        throw C5364l.m11579a(th, obj, i);
    }

    public void wrapAndThrow(aa aaVar, Throwable th, Object obj, String str) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        Object obj2;
        if (aaVar != null) {
            if (!aaVar.m11046a(C5387z.WRAP_EXCEPTIONS)) {
                obj2 = null;
                if (th instanceof IOException) {
                    if (obj2 == null && (th instanceof RuntimeException)) {
                        throw ((RuntimeException) th);
                    }
                } else if (obj2 == null || !(th instanceof C5364l)) {
                    throw ((IOException) th);
                }
                throw C5364l.m11580a(th, obj, str);
            }
        }
        obj2 = 1;
        if (th instanceof IOException) {
            throw ((RuntimeException) th);
        }
        throw ((IOException) th);
        throw C5364l.m11580a(th, obj, str);
    }
}
