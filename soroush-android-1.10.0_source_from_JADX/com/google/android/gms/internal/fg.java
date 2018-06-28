package com.google.android.gms.internal;

import java.util.Iterator;

final class fg implements Iterator<String> {
    private Iterator<String> f5743a = this.f5744b.f18544a.keySet().iterator();
    private /* synthetic */ zzcfu f5744b;

    fg(zzcfu com_google_android_gms_internal_zzcfu) {
        this.f5744b = com_google_android_gms_internal_zzcfu;
    }

    public final boolean hasNext() {
        return this.f5743a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f5743a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
