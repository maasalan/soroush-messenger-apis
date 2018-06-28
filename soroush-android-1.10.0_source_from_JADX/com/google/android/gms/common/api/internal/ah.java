package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.p160b.C1693e;

public final class ah extends C5453f<Boolean> {
    private C1734x<?> f17986b;

    public ah(C1734x<?> c1734x, C1693e<Boolean> c1693e) {
        super(c1693e);
        this.f17986b = c1734x;
    }

    public final /* bridge */ /* synthetic */ void mo1549a(Status status) {
        super.mo1549a(status);
    }

    public final /* bridge */ /* synthetic */ void mo1550a(C1722b c1722b, boolean z) {
    }

    public final void mo3009b(C6575i<?> c6575i) {
        aa aaVar = (aa) c6575i.f17993d.remove(this.f17986b);
        if (aaVar != null) {
            aaVar.f5233a.f5294a.f5288a = null;
            return;
        }
        C1693e c1693e = this.a;
        c1693e.f5195a.m11748b(Boolean.valueOf(false));
    }
}
