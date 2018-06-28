package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C1344b;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;
import java.util.Arrays;

public final class C7411d extends C7280r {
    static final C7411d f21535a = new C7411d(new byte[0]);
    protected final byte[] f21536b;

    private C7411d(byte[] bArr) {
        this.f21536b = bArr;
    }

    public static C7411d m19707a(byte[] bArr) {
        return bArr == null ? null : bArr.length == 0 ? f21535a : new C7411d(bArr);
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        c5301g.writeBinary(aaVar.m11058c().m11096t(), this.f21536b, 0, this.f21536b.length);
    }

    public final String mo3532b() {
        return C1344b.m3177a().m3165a(this.f21536b, false);
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : (obj != null && (obj instanceof C7411d)) ? Arrays.equals(((C7411d) obj).f21536b, this.f21536b) : false;
    }

    public final int hashCode() {
        return this.f21536b == null ? -1 : this.f21536b.length;
    }

    public final String toString() {
        return C1344b.m3177a().m3165a(this.f21536b, true);
    }
}
