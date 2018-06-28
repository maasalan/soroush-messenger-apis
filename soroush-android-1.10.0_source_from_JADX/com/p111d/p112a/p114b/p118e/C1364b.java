package com.p111d.p112a.p114b.p118e;

import com.p111d.p112a.p114b.C5297e.C1362a;
import com.p111d.p112a.p114b.p120g.C1372f;
import java.util.Arrays;
import java.util.BitSet;
import org.msgpack.util.TemplatePrecompiler;

public final class C1364b {
    static final C1364b f4293a = new C1364b();
    protected C1364b f4294b;
    public final int f4295c;
    protected final int f4296d;
    protected boolean f4297e;
    protected String[] f4298f;
    protected C1363a[] f4299g;
    protected int f4300h;
    protected int f4301i;
    protected int f4302j;
    protected int f4303k;
    protected boolean f4304l;
    protected BitSet f4305m;

    static final class C1363a {
        public final String f4290a;
        public final C1363a f4291b;
        public final int f4292c;

        public C1363a(String str, C1363a c1363a) {
            this.f4290a = str;
            this.f4291b = c1363a;
            int i = 1;
            if (c1363a != null) {
                i = 1 + c1363a.f4292c;
            }
            this.f4292c = i;
        }

        public final String m3295a(char[] cArr, int i, int i2) {
            if (this.f4290a.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.f4290a.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.f4290a;
                }
            }
            return null;
        }
    }

    private C1364b() {
        this.f4297e = true;
        this.f4296d = -1;
        this.f4304l = true;
        this.f4295c = 0;
        this.f4303k = 0;
        m3300b(64);
    }

    private C1364b(C1364b c1364b, int i, String[] strArr, C1363a[] c1363aArr, int i2, int i3, int i4) {
        this.f4294b = c1364b;
        this.f4296d = i;
        this.f4297e = C1362a.CANONICALIZE_FIELD_NAMES.m3274a(i);
        this.f4298f = strArr;
        this.f4299g = c1363aArr;
        this.f4300h = i2;
        this.f4295c = i3;
        i = strArr.length;
        this.f4301i = i - (i >> 2);
        this.f4302j = i - 1;
        this.f4303k = i4;
        this.f4304l = false;
    }

    private int m3296a(String str) {
        int length = str.length();
        int i = this.f4295c;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 33) + str.charAt(i2);
        }
        return i == 0 ? 1 : i;
    }

    private int m3297a(char[] cArr, int i, int i2) {
        int i3 = this.f4295c;
        i2 += i;
        while (i < i2) {
            i3 = (i3 * 33) + cArr[i];
            i++;
        }
        return i3 == 0 ? 1 : i3;
    }

    public static C1364b m3298a() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = (((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1;
        C1364b c1364b = f4293a;
        return new C1364b(null, -1, c1364b.f4298f, c1364b.f4299g, c1364b.f4300h, i, c1364b.f4303k);
    }

    private static String m3299a(char[] cArr, int i, int i2, C1363a c1363a) {
        while (c1363a != null) {
            String a = c1363a.m3295a(cArr, i, i2);
            if (a != null) {
                return a;
            }
            c1363a = c1363a.f4291b;
        }
        return null;
    }

    private void m3300b(int i) {
        this.f4298f = new String[i];
        this.f4299g = new C1363a[(i >> 1)];
        this.f4302j = i - 1;
        this.f4300h = 0;
        this.f4303k = 0;
        this.f4301i = i - (i >> 2);
    }

    private int m3301c(int i) {
        i += i >>> 15;
        i ^= i << 7;
        return (i + (i >>> 3)) & this.f4302j;
    }

    private void m3302c() {
        int i = 0;
        int length = this.f4298f.length;
        int i2 = length + length;
        if (i2 > 65536) {
            this.f4300h = 0;
            this.f4297e = false;
            this.f4298f = new String[64];
            this.f4299g = new C1363a[32];
            this.f4302j = 63;
            this.f4304l = true;
            return;
        }
        String[] strArr = this.f4298f;
        C1363a[] c1363aArr = this.f4299g;
        this.f4298f = new String[i2];
        this.f4299g = new C1363a[(i2 >> 1)];
        this.f4302j = i2 - 1;
        this.f4301i = i2 - (i2 >> 2);
        i2 = 0;
        int i3 = i2;
        int i4 = i3;
        while (i2 < length) {
            String str = strArr[i2];
            if (str != null) {
                i3++;
                int c = m3301c(m3296a(str));
                if (this.f4298f[c] == null) {
                    this.f4298f[c] = str;
                } else {
                    c >>= 1;
                    C1363a c1363a = new C1363a(str, this.f4299g[c]);
                    this.f4299g[c] = c1363a;
                    i4 = Math.max(i4, c1363a.f4292c);
                }
            }
            i2++;
        }
        length >>= 1;
        while (i < length) {
            for (C1363a c1363a2 = c1363aArr[i]; c1363a2 != null; c1363a2 = c1363a2.f4291b) {
                i3++;
                String str2 = c1363a2.f4290a;
                i2 = m3301c(m3296a(str2));
                if (this.f4298f[i2] == null) {
                    this.f4298f[i2] = str2;
                } else {
                    i2 >>= 1;
                    C1363a c1363a3 = new C1363a(str2, this.f4299g[i2]);
                    this.f4299g[i2] = c1363a3;
                    i4 = Math.max(i4, c1363a3.f4292c);
                }
            }
            i++;
        }
        this.f4303k = i4;
        this.f4305m = null;
        if (i3 != this.f4300h) {
            StringBuilder stringBuilder = new StringBuilder("Internal error on SymbolTable.rehash(): had ");
            stringBuilder.append(this.f4300h);
            stringBuilder.append(" entries; now have ");
            stringBuilder.append(i3);
            stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
            throw new Error(stringBuilder.toString());
        }
    }

    public final C1364b m3303a(int i) {
        String[] strArr;
        C1363a[] c1363aArr;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            strArr = this.f4298f;
            c1363aArr = this.f4299g;
            i2 = this.f4300h;
            i3 = this.f4295c;
            i4 = this.f4303k;
        }
        return new C1364b(this, i, strArr, c1363aArr, i2, i3, i4);
    }

    public final String m3304a(char[] cArr, int i, int i2, int i3) {
        if (i2 <= 0) {
            return "";
        }
        if (!this.f4297e) {
            return new String(cArr, i, i2);
        }
        i3 = m3301c(i3);
        String str = this.f4298f[i3];
        if (str != null) {
            if (str.length() == i2) {
                int i4 = 0;
                while (str.charAt(i4) == cArr[i + i4]) {
                    i4++;
                    if (i4 == i2) {
                        return str;
                    }
                }
            }
            C1363a c1363a = this.f4299g[i3 >> 1];
            if (c1363a != null) {
                String a = c1363a.m3295a(cArr, i, i2);
                if (a != null) {
                    return a;
                }
                str = C1364b.m3299a(cArr, i, i2, c1363a.f4291b);
                if (str != null) {
                    return str;
                }
            }
        }
        if (!this.f4304l) {
            String[] strArr = this.f4298f;
            this.f4298f = (String[]) Arrays.copyOf(strArr, strArr.length);
            C1363a[] c1363aArr = this.f4299g;
            this.f4299g = (C1363a[]) Arrays.copyOf(c1363aArr, c1363aArr.length);
            this.f4304l = true;
        } else if (this.f4300h >= this.f4301i) {
            m3302c();
            i3 = m3301c(m3297a(cArr, i, i2));
        }
        str = new String(cArr, i, i2);
        if (C1362a.INTERN_FIELD_NAMES.m3274a(this.f4296d)) {
            str = C1372f.f4330a.m3329a(str);
        }
        this.f4300h++;
        if (this.f4298f[i3] == null) {
            this.f4298f[i3] = str;
            return str;
        }
        int i5 = i3 >> 1;
        C1363a c1363a2 = new C1363a(str, this.f4299g[i5]);
        i2 = c1363a2.f4292c;
        if (i2 > 100) {
            if (this.f4305m == null) {
                this.f4305m = new BitSet();
            } else if (this.f4305m.get(i5)) {
                if (C1362a.FAIL_ON_SYMBOL_HASH_OVERFLOW.m3274a(this.f4296d)) {
                    StringBuilder stringBuilder = new StringBuilder("Longest collision chain in symbol table (of size ");
                    stringBuilder.append(this.f4300h);
                    stringBuilder.append(") now exceeds maximum, 100 -- suspect a DoS attack based on hash collisions");
                    throw new IllegalStateException(stringBuilder.toString());
                }
                this.f4297e = false;
                this.f4298f[i5 + i5] = c1363a2.f4290a;
                this.f4299g[i5] = null;
                this.f4300h -= c1363a2.f4292c;
                i5 = -1;
            }
            this.f4305m.set(i5);
            this.f4298f[i5 + i5] = c1363a2.f4290a;
            this.f4299g[i5] = null;
            this.f4300h -= c1363a2.f4292c;
            i5 = -1;
        } else {
            this.f4299g[i5] = c1363a2;
            i5 = Math.max(i2, this.f4303k);
        }
        this.f4303k = i5;
        return str;
    }

    public final void m3305b() {
        if (this.f4304l && this.f4294b != null && this.f4297e) {
            C1364b c1364b = this.f4294b;
            if (this.f4300h > 12000) {
                synchronized (c1364b) {
                    c1364b.m3300b(256);
                    c1364b.f4304l = false;
                }
            } else if (this.f4300h > c1364b.f4300h) {
                synchronized (c1364b) {
                    c1364b.f4298f = this.f4298f;
                    c1364b.f4299g = this.f4299g;
                    c1364b.f4300h = this.f4300h;
                    c1364b.f4301i = this.f4301i;
                    c1364b.f4302j = this.f4302j;
                    c1364b.f4303k = this.f4303k;
                    c1364b.f4304l = false;
                }
            }
            this.f4304l = false;
        }
    }
}
