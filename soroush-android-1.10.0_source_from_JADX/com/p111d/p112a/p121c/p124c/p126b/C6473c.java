package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p131i.C1475c;
import java.util.concurrent.atomic.AtomicReference;

public final class C6473c extends C5320x<AtomicReference<?>> implements C1434i {
    protected final C5354j f17653a;
    protected final C1475c f17654b;
    protected final C1507k<?> f17655c;

    public C6473c(C5354j c5354j, C1475c c1475c, C1507k<?> c1507k) {
        super(AtomicReference.class);
        this.f17653a = c5354j;
        this.f17655c = c1507k;
        this.f17654b = c1475c;
    }

    private AtomicReference<?> m15440c(C5303j c5303j, C5347g c5347g) {
        return new AtomicReference(this.f17654b == null ? this.f17655c.mo1304a(c5303j, c5347g) : this.f17655c.mo1308a(c5303j, c5347g, this.f17654b));
    }

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        C1507k c1507k = this.f17655c;
        C1475c c1475c = this.f17654b;
        C1507k a = c1507k == null ? c5347g.m11437a(this.f17653a, c1446d) : c5347g.m11455b(c1507k, c1446d, this.f17653a);
        if (c1475c != null) {
            c1475c = c1475c.mo2895a(c1446d);
        }
        return (a == this.f17655c && c1475c == this.f17654b) ? this : new C6473c(this.f17653a, c1475c, a);
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return m15440c(c5303j, c5347g);
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        C1380m currentToken = c5303j.getCurrentToken();
        return currentToken == C1380m.VALUE_NULL ? new AtomicReference() : (currentToken == null || !currentToken.f4397v) ? c1475c.mo2899d(c5303j, c5347g) : m15440c(c5303j, c5347g);
    }

    public final /* synthetic */ Object mo2803a(C5347g c5347g) {
        return new AtomicReference();
    }

    public final /* synthetic */ Object mo2804e() {
        return new AtomicReference();
    }
}
