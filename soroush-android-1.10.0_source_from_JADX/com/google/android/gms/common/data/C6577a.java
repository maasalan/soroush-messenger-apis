package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class C6577a<T> implements C5460b<T> {
    protected final DataHolder f18020a;

    protected C6577a(DataHolder dataHolder) {
        this.f18020a = dataHolder;
    }

    public final void mo3016a() {
        if (this.f18020a != null) {
            this.f18020a.close();
        }
    }

    public final int mo3017b() {
        return this.f18020a == null ? 0 : this.f18020a.f18014e;
    }

    public Iterator<T> iterator() {
        return new C1745d(this);
    }
}
