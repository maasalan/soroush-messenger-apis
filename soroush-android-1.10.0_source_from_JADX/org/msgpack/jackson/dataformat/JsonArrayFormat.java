package org.msgpack.jackson.dataformat;

import com.d.a.a.j.c;
import com.d.a.a.j.d;
import com.d.a.c.f.a;
import com.d.a.c.f.b;
import com.d.a.c.f.q;

public class JsonArrayFormat extends q {
    private static final d ARRAY_FORMAT;

    static {
        d dVar = new d();
        ARRAY_FORMAT = new d(dVar.a, c.c, dVar.c, dVar.d, dVar.f, dVar.e);
    }

    public d findFormat(a aVar) {
        d findFormat = super.findFormat(aVar);
        return findFormat != null ? findFormat : ARRAY_FORMAT;
    }

    public Boolean findIgnoreUnknownProperties(b bVar) {
        Boolean findIgnoreUnknownProperties = super.findIgnoreUnknownProperties(bVar);
        return findIgnoreUnknownProperties != null ? findIgnoreUnknownProperties : Boolean.valueOf(true);
    }
}
