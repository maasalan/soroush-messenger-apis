package com.p111d.p112a.p121c.p123b;

import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.p123b.C1407c.C5305a;
import com.p111d.p112a.p121c.p128f.C5342w;
import com.p111d.p112a.p121c.p131i.C1473b;
import com.p111d.p112a.p121c.p138m.C1538r;
import java.io.Serializable;

public abstract class C6469g<CFG extends C1406b, T extends C6469g<CFG, T>> extends C5306f<T> implements Serializable {
    private static final int f17632a = C5306f.m11072a(C5385q.class);
    protected final C5342w f17633o;
    protected final C1473b f17634p;
    protected final C1549v f17635q;
    protected final Class<?> f17636r;
    protected final C1407c f17637s;
    protected final C1538r f17638t;

    protected C6469g(C1405a c1405a, C1473b c1473b, C5342w c5342w, C1538r c1538r) {
        super(c1405a, f17632a);
        this.f17633o = c5342w;
        this.f17634p = c1473b;
        this.f17638t = c1538r;
        this.f17635q = null;
        this.f17636r = null;
        this.f17637s = C5305a.m11069a();
    }

    protected C6469g(C6469g<CFG, T> c6469g, int i) {
        super((C5306f) c6469g, i);
        this.f17633o = c6469g.f17633o;
        this.f17634p = c6469g.f17634p;
        this.f17638t = c6469g.f17638t;
        this.f17635q = c6469g.f17635q;
        this.f17636r = c6469g.f17636r;
        this.f17637s = c6469g.f17637s;
    }

    public final C1549v m15412e(C5354j c5354j) {
        return this.f17635q != null ? this.f17635q : this.f17638t.m4018a(c5354j.m11531e(), this);
    }

    public final C1549v m15413f(Class<?> cls) {
        return this.f17635q != null ? this.f17635q : this.f17638t.m4018a(cls, this);
    }

    public final Class<?> mo1424g(Class<?> cls) {
        return this.f17633o.mo1424g(cls);
    }

    public final C1473b m15415u() {
        return this.f17634p;
    }

    public final C1549v m15416v() {
        return this.f17635q;
    }

    public final Class<?> m15417w() {
        return this.f17636r;
    }

    public final C1407c m15418x() {
        return this.f17637s;
    }
}
