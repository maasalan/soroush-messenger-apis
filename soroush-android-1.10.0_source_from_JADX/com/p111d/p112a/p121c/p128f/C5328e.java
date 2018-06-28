package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.p138m.C1527g;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;

public abstract class C5328e extends C1449a implements Serializable {
    protected final transient C1463x f14809b;
    protected final transient C5329k f14810c;

    protected C5328e(C1463x c1463x, C5329k c5329k) {
        this.f14809b = c1463x;
        this.f14810c = c5329k;
    }

    public final <A extends Annotation> A mo1357a(Class<A> cls) {
        return this.f14810c == null ? null : this.f14810c.m11291a((Class) cls);
    }

    public abstract void mo2816a(Object obj, Object obj2);

    public final void m11278a(boolean z) {
        C1527g.m3961a(mo2819k(), z);
    }

    public final boolean m11279a(Annotation annotation) {
        return this.f14810c.m11295b(annotation);
    }

    public final boolean mo1359a(Class<? extends Annotation>[] clsArr) {
        return this.f14810c == null ? false : this.f14810c.m11293a((Class[]) clsArr);
    }

    public abstract Object mo2817b(Object obj);

    public final boolean mo1361b(Class<?> cls) {
        return this.f14810c == null ? false : this.f14810c.m11294b((Class) cls);
    }

    public final boolean m11283b(Annotation annotation) {
        return this.f14810c.m11292a(annotation);
    }

    protected final C5329k mo1364e() {
        return this.f14810c;
    }

    public abstract Class<?> mo2818j();

    public abstract Member mo2819k();

    public final C1463x m11287l() {
        return this.f14809b;
    }
}
