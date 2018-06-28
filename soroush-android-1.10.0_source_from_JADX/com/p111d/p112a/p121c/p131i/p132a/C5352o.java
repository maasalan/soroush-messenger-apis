package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p121c.C1448e;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p137l.C1513m;

public abstract class C5352o implements C1476d {
    protected final C1513m f14908c;
    protected final C5354j f14909d;

    protected C5352o() {
        this(null, null);
    }

    protected C5352o(C5354j c5354j, C1513m c1513m) {
        this.f14909d = c5354j;
        this.f14908c = c1513m;
    }

    public C5354j mo1455a(C1448e c1448e, String str) {
        StringBuilder stringBuilder = new StringBuilder("Sub-class ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" MUST implement `typeFromId(DatabindContext,String)");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final String mo1456a() {
        return mo2914a(null, this.f14909d.m11531e());
    }

    public String mo2915b() {
        return null;
    }
}
