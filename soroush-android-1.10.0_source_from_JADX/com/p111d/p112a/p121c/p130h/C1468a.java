package com.p111d.p112a.p121c.p130h;

import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.p133j.C1480j;
import com.p111d.p112a.p121c.p133j.C7415o;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

@Deprecated
public final class C1468a {
    private final C7415o f4609a;

    public static C6524m m3757a() {
        C6524m c = C1480j.f4616b.m3819c();
        c.m19719a(IjkMediaMeta.IJKM_KEY_TYPE, "any");
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C1468a)) {
            return false;
        }
        C1468a c1468a = (C1468a) obj;
        return this.f4609a == null ? c1468a.f4609a == null : this.f4609a.equals(c1468a.f4609a);
    }

    public final int hashCode() {
        return this.f4609a.hashCode();
    }

    public final String toString() {
        return this.f4609a.toString();
    }
}
