package com.google.android.gms.common.api.internal;

public final class C1734x<L> {
    private final L f5289a;
    private final String f5290b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1734x)) {
            return false;
        }
        C1734x c1734x = (C1734x) obj;
        return this.f5289a == c1734x.f5289a && this.f5290b.equals(c1734x.f5290b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f5289a) * 31) + this.f5290b.hashCode();
    }
}
