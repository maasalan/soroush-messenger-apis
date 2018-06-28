package com.google.android.gms.internal;

public final class od<M extends oc<M>, T> {
    protected final Class<T> f6239a;
    public final int f6240b;
    protected final boolean f6241c;
    private int f6242d;

    protected final int m5100a(Object obj) {
        int i = this.f6240b >>> 3;
        switch (this.f6242d) {
            case 10:
                return (oa.m5081c(i << 3) << 1) + ((oi) obj).m5129f();
            case 11:
                return oa.m5076b(i, (oi) obj);
            default:
                i = this.f6242d;
                StringBuilder stringBuilder = new StringBuilder(24);
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    protected final void m5101a(Object obj, oa oaVar) {
        try {
            oaVar.m5096b(this.f6240b);
            switch (this.f6242d) {
                case 10:
                    int i = this.f6240b >>> 3;
                    ((oi) obj).mo1667a(oaVar);
                    oaVar.m5099c(i, 4);
                    return;
                case 11:
                    oaVar.m5095a((oi) obj);
                    return;
                default:
                    int i2 = this.f6242d;
                    StringBuilder stringBuilder = new StringBuilder(24);
                    stringBuilder.append("Unknown type ");
                    stringBuilder.append(i2);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        return this.f6242d == odVar.f6242d && this.f6239a == odVar.f6239a && this.f6240b == odVar.f6240b && this.f6241c == odVar.f6241c;
    }

    public final int hashCode() {
        return ((((((1147 + this.f6242d) * 31) + this.f6239a.hashCode()) * 31) + this.f6240b) * 31) + this.f6241c;
    }
}
