package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class of implements Cloneable {
    List<ok> f6248a = new ArrayList();
    private od<?, ?> f6249b;
    private Object f6250c;

    of() {
    }

    private final byte[] m5105b() {
        byte[] bArr = new byte[m5107a()];
        m5108a(oa.m5073a(bArr, bArr.length));
        return bArr;
    }

    private of m5106c() {
        of ofVar = new of();
        try {
            ofVar.f6249b = this.f6249b;
            if (this.f6248a == null) {
                ofVar.f6248a = null;
            } else {
                ofVar.f6248a.addAll(this.f6248a);
            }
            if (this.f6250c != null) {
                Object obj;
                if (this.f6250c instanceof oi) {
                    obj = (oi) ((oi) this.f6250c).clone();
                } else if (this.f6250c instanceof byte[]) {
                    obj = ((byte[]) this.f6250c).clone();
                } else {
                    int i = 0;
                    Object obj2;
                    if (this.f6250c instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f6250c;
                        obj2 = new byte[bArr.length][];
                        ofVar.f6250c = obj2;
                        while (i < bArr.length) {
                            obj2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f6250c instanceof boolean[]) {
                        obj = ((boolean[]) this.f6250c).clone();
                    } else if (this.f6250c instanceof int[]) {
                        obj = ((int[]) this.f6250c).clone();
                    } else if (this.f6250c instanceof long[]) {
                        obj = ((long[]) this.f6250c).clone();
                    } else if (this.f6250c instanceof float[]) {
                        obj = ((float[]) this.f6250c).clone();
                    } else if (this.f6250c instanceof double[]) {
                        obj = ((double[]) this.f6250c).clone();
                    } else if (this.f6250c instanceof oi[]) {
                        oi[] oiVarArr = (oi[]) this.f6250c;
                        obj2 = new oi[oiVarArr.length];
                        ofVar.f6250c = obj2;
                        while (i < oiVarArr.length) {
                            obj2[i] = (oi) oiVarArr[i].clone();
                            i++;
                        }
                    }
                }
                ofVar.f6250c = obj;
                return ofVar;
            }
            return ofVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    final int m5107a() {
        int i;
        int i2 = 0;
        if (this.f6250c != null) {
            od odVar = this.f6249b;
            Object obj = this.f6250c;
            if (!odVar.f6241c) {
                return odVar.m5100a(obj);
            }
            int length = Array.getLength(obj);
            i = 0;
            while (i2 < length) {
                if (Array.get(obj, i2) != null) {
                    i += odVar.m5100a(Array.get(obj, i2));
                }
                i2++;
            }
        } else {
            i = 0;
            for (ok okVar : this.f6248a) {
                i += (oa.m5081c(okVar.f6255a) + 0) + okVar.f6256b.length;
            }
        }
        return i;
    }

    final void m5108a(oa oaVar) {
        if (this.f6250c != null) {
            od odVar = this.f6249b;
            Object obj = this.f6250c;
            if (odVar.f6241c) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        odVar.m5101a(obj2, oaVar);
                    }
                }
                return;
            }
            odVar.m5101a(obj, oaVar);
            return;
        }
        for (ok okVar : this.f6248a) {
            oaVar.m5096b(okVar.f6255a);
            oaVar.m5098b(okVar.f6256b);
        }
    }

    public final /* synthetic */ Object clone() {
        return m5106c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof of)) {
            return false;
        }
        of ofVar = (of) obj;
        if (this.f6250c != null && ofVar.f6250c != null) {
            return this.f6249b != ofVar.f6249b ? false : !this.f6249b.f6239a.isArray() ? this.f6250c.equals(ofVar.f6250c) : this.f6250c instanceof byte[] ? Arrays.equals((byte[]) this.f6250c, (byte[]) ofVar.f6250c) : this.f6250c instanceof int[] ? Arrays.equals((int[]) this.f6250c, (int[]) ofVar.f6250c) : this.f6250c instanceof long[] ? Arrays.equals((long[]) this.f6250c, (long[]) ofVar.f6250c) : this.f6250c instanceof float[] ? Arrays.equals((float[]) this.f6250c, (float[]) ofVar.f6250c) : this.f6250c instanceof double[] ? Arrays.equals((double[]) this.f6250c, (double[]) ofVar.f6250c) : this.f6250c instanceof boolean[] ? Arrays.equals((boolean[]) this.f6250c, (boolean[]) ofVar.f6250c) : Arrays.deepEquals((Object[]) this.f6250c, (Object[]) ofVar.f6250c);
        } else {
            if (this.f6248a != null && ofVar.f6248a != null) {
                return this.f6248a.equals(ofVar.f6248a);
            }
            try {
                return Arrays.equals(m5105b(), ofVar.m5105b());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final int hashCode() {
        try {
            return 527 + Arrays.hashCode(m5105b());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
