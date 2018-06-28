package com.p111d.p112a.p114b.p117d;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5303j;
import java.util.HashSet;

public final class C1358b {
    protected final Object f4248a;
    protected String f4249b;
    protected String f4250c;
    protected HashSet<String> f4251d;

    private C1358b(Object obj) {
        this.f4248a = obj;
    }

    public static C1358b m3264a(C5301g c5301g) {
        return new C1358b(c5301g);
    }

    public static C1358b m3265a(C5303j c5303j) {
        return new C1358b(c5303j);
    }

    public final C1358b m3266a() {
        return new C1358b(this.f4248a);
    }

    public final boolean m3267a(String str) {
        if (this.f4249b == null) {
            this.f4249b = str;
            return false;
        } else if (str.equals(this.f4249b)) {
            return true;
        } else {
            if (this.f4250c == null) {
                this.f4250c = str;
                return false;
            } else if (str.equals(this.f4250c)) {
                return true;
            } else {
                if (this.f4251d == null) {
                    this.f4251d = new HashSet(16);
                    this.f4251d.add(this.f4249b);
                    this.f4251d.add(this.f4250c);
                }
                return !this.f4251d.add(str);
            }
        }
    }

    public final void m3268b() {
        this.f4249b = null;
        this.f4250c = null;
        this.f4251d = null;
    }

    public final Object m3269c() {
        return this.f4248a;
    }
}
