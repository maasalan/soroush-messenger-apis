package com.p111d.p112a.p121c;

import com.p111d.p112a.p114b.C5297e;
import com.p111d.p112a.p114b.C5304n;
import com.p111d.p112a.p114b.p115b.C1342a;
import com.p111d.p112a.p114b.p115b.C1343b;

public class C6525s extends C5297e {
    public C6525s() {
        this(null);
    }

    private C6525s(C5297e c5297e) {
        super(c5297e, null);
        setCodec(new C6526t(this));
    }

    public C6525s(C6526t c6526t) {
        super(c6526t);
        if (c6526t == null) {
            setCodec(new C6526t(this));
        }
    }

    public C5297e copy() {
        _checkInvalidCopy(C6525s.class);
        return new C6525s((C5297e) this);
    }

    public /* bridge */ /* synthetic */ C5304n getCodec() {
        return (C6526t) this._objectCodec;
    }

    public String getFormatName() {
        return C5297e.FORMAT_NAME_JSON;
    }

    public C1343b hasFormat(C1342a c1342a) {
        return getClass() == C6525s.class ? hasJSONFormat(c1342a) : null;
    }
}
