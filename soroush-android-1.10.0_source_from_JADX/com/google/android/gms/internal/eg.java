package com.google.android.gms.internal;

public final class eg {
    boolean f5676a = false;
    eh f5677b = null;

    public final <T> T m4767a(ea<T> eaVar) {
        synchronized (this) {
            if (this.f5676a) {
                return eaVar.mo1598a(this.f5677b);
            }
            T t = eaVar.f5672c;
            return t;
        }
    }
}
