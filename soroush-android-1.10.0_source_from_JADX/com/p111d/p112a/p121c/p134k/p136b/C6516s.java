package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p130h.C1468a;
import com.p111d.p112a.p121c.p130h.C1470c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C1498j;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

@C1387a
public final class C6516s extends al<Object> implements C1470c, C1498j {
    protected final Method f17762a;
    protected final C1545o<Object> f17763b;
    protected final C1446d f17764c;
    protected final boolean f17765d;

    private C6516s(C6516s c6516s, C1446d c1446d, C1545o<?> c1545o, boolean z) {
        Class handledType = c6516s.handledType();
        if (handledType == null) {
            handledType = Object.class;
        }
        super(handledType);
        this.f17762a = c6516s.f17762a;
        this.f17763b = c1545o;
        this.f17764c = c1446d;
        this.f17765d = z;
    }

    public C6516s(Method method, C1545o<?> c1545o) {
        super(method.getReturnType(), false);
        this.f17762a = method;
        this.f17763b = c1545o;
        this.f17764c = null;
        this.f17765d = true;
    }

    private C6516s m15713a(C1446d c1446d, C1545o<?> c1545o, boolean z) {
        return (this.f17764c == c1446d && this.f17763b == c1545o && z == this.f17765d) ? this : new C6516s(this, c1446d, c1545o, z);
    }

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        C1545o c1545o = this.f17763b;
        if (c1545o != null) {
            return m15713a(c1446d, aaVar.m11039a(c1545o, c1446d), this.f17765d);
        }
        if (!aaVar.m11045a(C5385q.USE_STATIC_TYPING)) {
            if (!Modifier.isFinal(this.f17762a.getReturnType().getModifiers())) {
                return this;
            }
        }
        C5354j a = aaVar.m3651a(this.f17762a.getGenericReturnType());
        C1545o b = aaVar.m11048b(a, c1446d);
        Class e = a.m11531e();
        boolean z = false;
        if (e.isPrimitive()) {
            if (!(e == Integer.TYPE || e == Boolean.TYPE || e == Double.TYPE)) {
                return m15713a(c1446d, b, z);
            }
        } else if (!(e == String.class || e == Integer.class || e == Boolean.class || e == Double.class)) {
            return m15713a(c1446d, b, z);
        }
        z = isDefaultSerializer(b);
        return m15713a(c1446d, b, z);
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        Class e = c5354j == null ? null : c5354j.m11531e();
        if (e == null) {
            e = this.f17762a.getDeclaringClass();
        }
        if (e == null || !e.isEnum()) {
            C1545o c1545o = this.f17763b;
            if (c1545o == null) {
                if (c5354j == null) {
                    if (this.f17764c != null) {
                        c5354j = this.f17764c.mo1350a();
                    }
                    if (c5354j == null) {
                        c5354j = c5345c.mo2892a().m3651a(this._handledType);
                    }
                }
                c1545o = c5345c.mo2892a().m11038a(c5354j, false, this.f17764c);
                if (c1545o == null) {
                    return;
                }
            }
            c1545o.acceptJsonFormatVisitor(c5345c, null);
        }
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        return this.f17763b instanceof C1470c ? ((C1470c) this.f17763b).getSchema(aaVar, null) : C1468a.m3757a();
    }

    public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
        try {
            Object invoke = this.f17762a.invoke(obj, new Object[0]);
            if (invoke == null) {
                aaVar.m11043a(c5301g);
                return;
            }
            C1545o c1545o = this.f17763b;
            if (c1545o == null) {
                c1545o = aaVar.m11056c(invoke.getClass(), this.f17764c);
            }
            c1545o.serialize(invoke, c5301g, aaVar);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            Throwable e3 = e2;
            while ((e3 instanceof InvocationTargetException) && e3.getCause() != null) {
                e3 = e3.getCause();
            }
            if (e3 instanceof Error) {
                throw ((Error) e3);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f17762a.getName());
            stringBuilder.append("()");
            throw C5364l.m11580a(e3, obj, stringBuilder.toString());
        }
    }

    public final void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        try {
            Object invoke = this.f17762a.invoke(obj, new Object[0]);
            if (invoke == null) {
                aaVar.m11043a(c5301g);
                return;
            }
            C1545o c1545o = this.f17763b;
            if (c1545o == null) {
                c1545o = aaVar.m11041a(invoke.getClass(), this.f17764c);
            } else if (this.f17765d) {
                c1478f.mo2903a(obj, c5301g);
                c1545o.serialize(invoke, c5301g, aaVar);
                c1478f.mo2910d(obj, c5301g);
                return;
            }
            c1545o.serializeWithType(invoke, c5301g, aaVar, c1478f);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            Throwable e3 = e2;
            while ((e3 instanceof InvocationTargetException) && e3.getCause() != null) {
                e3 = e3.getCause();
            }
            if (e3 instanceof Error) {
                throw ((Error) e3);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f17762a.getName());
            stringBuilder.append("()");
            throw C5364l.m11580a(e3, obj, stringBuilder.toString());
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(@JsonValue serializer for method ");
        stringBuilder.append(this.f17762a.getDeclaringClass());
        stringBuilder.append("#");
        stringBuilder.append(this.f17762a.getName());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
