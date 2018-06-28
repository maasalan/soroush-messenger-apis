package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1329q.C1327a;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C1551x;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1397f.C1396b;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C1498j;
import com.p111d.p112a.p121c.p134k.p135a.C1486k;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C5357b;
import com.p111d.p112a.p121c.p137l.C7307h;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.util.concurrent.atomic.AtomicReference;

public final class C6513c extends al<AtomicReference<?>> implements C1498j {
    protected final C5354j f17746a;
    protected final C1446d f17747b;
    protected final C1478f f17748c;
    protected final C1545o<Object> f17749d;
    protected final C1534n f17750e;
    protected final C1327a f17751f;
    protected transient C1486k f17752g;

    private C6513c(C6513c c6513c, C1446d c1446d, C1478f c1478f, C1545o<?> c1545o, C1534n c1534n, C1327a c1327a) {
        super((al) c6513c);
        this.f17746a = c6513c.f17746a;
        this.f17752g = c6513c.f17752g;
        this.f17747b = c1446d;
        this.f17748c = c1478f;
        this.f17749d = c1545o;
        this.f17750e = c1534n;
        if (c1327a != C1327a.USE_DEFAULTS) {
            if (c1327a != C1327a.ALWAYS) {
                this.f17751f = c1327a;
                return;
            }
        }
        this.f17751f = null;
    }

    public C6513c(C7307h c7307h, C1478f c1478f, C1545o<Object> c1545o) {
        super((C5354j) c7307h);
        this.f17746a = c7307h.mo3564v();
        this.f17747b = null;
        this.f17748c = c1478f;
        this.f17749d = c1545o;
        this.f17750e = null;
        this.f17751f = null;
        this.f17752g = C5357b.f14921b;
    }

    private C6513c m15696a(C1446d c1446d, C1478f c1478f, C1545o<?> c1545o, C1534n c1534n, C1327a c1327a) {
        return (this.f17747b == c1446d && c1327a == this.f17751f && this.f17748c == c1478f && this.f17749d == c1545o && this.f17750e == c1534n) ? this : new C6513c(this, c1446d, c1478f, c1545o, c1534n, c1327a);
    }

    private final C1545o<Object> m15697a(aa aaVar, Class<?> cls) {
        C1545o<Object> a = this.f17752g.mo1460a(cls);
        if (a != null) {
            return a;
        }
        C1545o<Object> c = aaVar.m11056c((Class) cls, this.f17747b);
        if (this.f17750e != null) {
            c = c.unwrappingSerializer(this.f17750e);
        }
        a = c;
        this.f17752g = this.f17752g.mo1459a(cls, a);
        return a;
    }

    private void m15698a(AtomicReference<?> atomicReference, C5301g c5301g, aa aaVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            if (this.f17750e == null) {
                aaVar.m11043a(c5301g);
            }
            return;
        }
        C1545o c1545o = this.f17749d;
        if (c1545o == null) {
            c1545o = m15697a(aaVar, obj.getClass());
        }
        if (this.f17748c != null) {
            c1545o.serializeWithType(obj, c5301g, aaVar, this.f17748c);
        } else {
            c1545o.serialize(obj, c5301g, aaVar);
        }
    }

    private boolean m15699a(aa aaVar, AtomicReference<?> atomicReference) {
        if (atomicReference == null) {
            return true;
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            return true;
        }
        if (this.f17751f == null) {
            return false;
        }
        C1545o c1545o = this.f17749d;
        if (c1545o == null) {
            try {
                c1545o = m15697a(aaVar, atomicReference.getClass());
            } catch (C5364l e) {
                throw new C1551x(e);
            }
        }
        return c1545o.isEmpty(aaVar, obj);
    }

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        C1327a c1327a;
        C1478f c1478f = this.f17748c;
        if (c1478f != null) {
            c1478f = c1478f.mo2901a(c1446d);
        }
        C1478f c1478f2 = c1478f;
        C1545o c1545o = this.f17749d;
        if (c1545o == null) {
            C5354j c5354j = this.f17746a;
            boolean z = false;
            if (!c5354j.m11543q()) {
                if (!c5354j.m11539m()) {
                    if (!c5354j.m11544r()) {
                        C5308b d = aaVar.m11059d();
                        if (!(d == null || c1446d == null || c1446d.mo1354c() == null)) {
                            C1396b findSerializationTyping = d.findSerializationTyping(c1446d.mo1354c());
                            if (findSerializationTyping != C1396b.STATIC) {
                                if (findSerializationTyping == C1396b.DYNAMIC) {
                                }
                            }
                        }
                        z = aaVar.m11045a(C5385q.USE_STATIC_TYPING);
                    }
                }
                z = true;
            }
            if (z) {
                c1545o = aaVar.m11038a(this.f17746a, true, c1446d);
            }
        } else {
            c1545o = aaVar.m11039a(c1545o, c1446d);
        }
        C1545o c1545o2 = c1545o;
        C1327a c1327a2 = this.f17751f;
        if (c1446d != null) {
            C1327a c = c1446d.mo1352b(aaVar.m11058c()).m3140c();
            if (!(c == c1327a2 || c == C1327a.USE_DEFAULTS)) {
                c1327a = c;
                return m15696a(c1446d, c1478f2, c1545o2, this.f17750e, c1327a);
            }
        }
        c1327a = c1327a2;
        return m15696a(c1446d, c1478f2, c1545o2, this.f17750e, c1327a);
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        C1545o c1545o = this.f17749d;
        if (c1545o == null) {
            c1545o = c5345c.mo2892a().m11038a(this.f17746a, true, this.f17747b);
            if (this.f17750e != null) {
                c1545o = c1545o.unwrappingSerializer(this.f17750e);
            }
        }
        c1545o.acceptJsonFormatVisitor(c5345c, this.f17746a);
    }

    public final /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        return m15699a(aaVar, (AtomicReference) obj);
    }

    public final boolean isUnwrappingSerializer() {
        return this.f17750e != null;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        m15698a((AtomicReference) obj, c5301g, aaVar);
    }

    public final /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        obj = (AtomicReference) obj;
        if (obj.get() == null) {
            if (this.f17750e == null) {
                aaVar.m11043a(c5301g);
            }
            return;
        }
        c1478f.mo2903a(obj, c5301g);
        m15698a(obj, c5301g, aaVar);
        c1478f.mo2910d(obj, c5301g);
    }

    public final C1545o<AtomicReference<?>> unwrappingSerializer(C1534n c1534n) {
        C1545o c1545o = this.f17749d;
        if (c1545o != null) {
            c1545o = c1545o.unwrappingSerializer(c1534n);
        }
        C1545o c1545o2 = c1545o;
        if (this.f17750e != null) {
            c1534n = C1534n.m4002a(c1534n, this.f17750e);
        }
        return m15696a(this.f17747b, this.f17748c, c1545o2, c1534n, this.f17751f);
    }
}
