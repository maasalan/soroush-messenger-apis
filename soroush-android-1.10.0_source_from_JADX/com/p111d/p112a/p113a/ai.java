package com.p111d.p112a.p113a;

import com.p111d.p112a.p113a.af.C1304a;
import java.util.HashMap;
import java.util.Map;

public class ai implements ah {
    protected Map<C1304a, Object> f14679a;

    public final ah mo1269a() {
        return new ai();
    }

    public final Object mo1270a(C1304a c1304a) {
        return this.f14679a == null ? null : this.f14679a.get(c1304a);
    }

    public final void mo1271a(C1304a c1304a, Object obj) {
        if (this.f14679a == null) {
            this.f14679a = new HashMap();
        } else if (this.f14679a.containsKey(c1304a)) {
            StringBuilder stringBuilder = new StringBuilder("Already had POJO for id (");
            stringBuilder.append(c1304a.f4104c.getClass().getName());
            stringBuilder.append(") [");
            stringBuilder.append(c1304a);
            stringBuilder.append("]");
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f14679a.put(c1304a, obj);
    }

    public final boolean mo1272a(ah ahVar) {
        return ahVar.getClass() == getClass();
    }
}
