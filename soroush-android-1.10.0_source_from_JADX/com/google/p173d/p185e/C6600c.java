package com.google.p173d.p185e;

import com.google.p173d.C1958a;
import com.google.p173d.C2007e;
import com.google.p173d.C2047n;
import com.google.p173d.C2049p;
import com.google.p173d.C5605d;
import com.google.p173d.C5615f;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1961a;
import java.util.Arrays;
import java.util.Map;

public final class C6600c extends C5612k {
    static final int[] f18821a;
    static final int f18822b;
    private final boolean f18823c;
    private final boolean f18824d;
    private final StringBuilder f18825e;
    private final int[] f18826f;

    static {
        int[] iArr = new int[]{52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42};
        f18821a = iArr;
        f18822b = iArr[39];
    }

    public C6600c() {
        this(false);
    }

    public C6600c(boolean z) {
        this(z, (byte) 0);
    }

    private C6600c(boolean z, byte b) {
        this.f18823c = z;
        this.f18824d = false;
        this.f18825e = new StringBuilder(20);
        this.f18826f = new int[9];
    }

    private static int m16909a(int[] iArr) {
        int i;
        int i2 = 0;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 : iArr) {
                if (i5 < i4 && i5 > r2) {
                    i4 = i5;
                }
            }
            i3 = 0;
            int i6 = i3;
            i = i6;
            int i52 = i;
            while (i3 < length) {
                int i7 = iArr[i3];
                if (i7 > i4) {
                    i |= 1 << ((length - 1) - i3);
                    i6++;
                    i52 += i7;
                }
                i3++;
            }
            if (i6 == 3) {
                break;
            } else if (i6 <= 3) {
                return -1;
            } else {
                i3 = i4;
            }
        }
        while (i2 < length && i6 > 0) {
            i3 = iArr[i2];
            if (i3 > i4) {
                i6--;
                if ((i3 << 1) >= i52) {
                    return -1;
                }
            }
            i2++;
        }
        return i;
    }

    public final C2047n mo3064a(int i, C1961a c1961a, Map<C2007e, ?> map) {
        C1961a c1961a2 = c1961a;
        Object obj = this.f18826f;
        Arrays.fill(obj, 0);
        Object obj2 = this.f18825e;
        obj2.setLength(0);
        int i2 = c1961a2.f6554b;
        int c = c1961a2.m5398c(0);
        int length = obj.length;
        int i3 = 0;
        int i4 = i3;
        int i5 = c;
        while (c < i2) {
            int i6;
            if ((c1961a2.m5394a(c) ^ i3) != 0) {
                obj[i4] = obj[i4] + 1;
                i6 = i;
            } else {
                int i7 = length - 1;
                if (i4 != i7) {
                    i6 = i;
                    i4++;
                } else if (C6600c.m16909a(obj) == f18822b && c1961a2.m5395a(Math.max(0, i5 - ((c - i5) / 2)), i5)) {
                    int[] iArr = new int[]{i5, c};
                    c = c1961a2.m5398c(iArr[1]);
                    length = c1961a2.f6554b;
                    while (true) {
                        C5612k.m12335a(c1961a2, c, (int[]) obj);
                        i3 = C6600c.m16909a(obj);
                        if (i3 < 0) {
                            throw C5629j.m12369a();
                        }
                        i4 = 0;
                        while (i4 < f18821a.length) {
                            if (f18821a[i4] == i3) {
                                char charAt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(i4);
                                obj2.append(charAt);
                                i7 = c;
                                for (int i62 : obj) {
                                    i7 += i62;
                                }
                                i4 = c1961a2.m5398c(i7);
                                if (charAt == '*') {
                                    break;
                                }
                                i62 = i;
                                c = i4;
                            } else {
                                i62 = i;
                                i4++;
                            }
                        }
                        throw C5629j.m12369a();
                    }
                    obj2.setLength(obj2.length() - 1);
                    i3 = 0;
                    i5 = i3;
                    while (i3 < obj.length) {
                        i5 += obj[i3];
                        i3++;
                    }
                    int i8 = (i4 - c) - i5;
                    if (i4 == length || (i8 << 1) >= i5) {
                        if (r0.f18823c) {
                            i8 = obj2.length() - 1;
                            length = 0;
                            i3 = length;
                            while (length < i8) {
                                i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(r0.f18825e.charAt(length));
                                length++;
                            }
                            if (obj2.charAt(i8) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i3 % 43)) {
                                throw C5605d.m12328a();
                            }
                            obj2.setLength(i8);
                        }
                        if (obj2.length() == 0) {
                            throw C5629j.m12369a();
                        }
                        String stringBuilder;
                        if (r0.f18824d) {
                            i8 = obj2.length();
                            StringBuilder stringBuilder2 = new StringBuilder(i8);
                            i3 = 0;
                            while (i3 < i8) {
                                char charAt2 = obj2.charAt(i3);
                                if (charAt2 == '+' || charAt2 == '$' || charAt2 == '%' || charAt2 == '/') {
                                    i3++;
                                    char charAt3 = obj2.charAt(i3);
                                    if (charAt2 != '+') {
                                        if (charAt2 != '/') {
                                            switch (charAt2) {
                                                case '$':
                                                    if (charAt3 >= 'A' && charAt3 <= 'Z') {
                                                        i62 = charAt3 - 64;
                                                        break;
                                                    }
                                                    throw C5615f.m12347a();
                                                    break;
                                                case '%':
                                                    if (charAt3 < 'A' || charAt3 > 'E') {
                                                        if (charAt3 >= 'F' && charAt3 <= 'W') {
                                                            i62 = charAt3 - 11;
                                                            break;
                                                        }
                                                        throw C5615f.m12347a();
                                                    }
                                                    i62 = charAt3 - 38;
                                                    break;
                                                    break;
                                                default:
                                                    charAt2 = '\u0000';
                                                    continue;
                                            }
                                        } else if (charAt3 >= 'A' && charAt3 <= 'O') {
                                            i62 = charAt3 - 32;
                                        } else if (charAt3 == 'Z') {
                                            charAt2 = ':';
                                        } else {
                                            throw C5615f.m12347a();
                                        }
                                    } else if (charAt3 < 'A' || charAt3 > 'Z') {
                                        throw C5615f.m12347a();
                                    } else {
                                        i62 = charAt3 + 32;
                                    }
                                    charAt2 = (char) i62;
                                }
                                stringBuilder2.append(charAt2);
                                i3++;
                            }
                            stringBuilder = stringBuilder2.toString();
                        } else {
                            stringBuilder = obj2.toString();
                        }
                        float f = ((float) c) + (((float) i5) / 2.0f);
                        r7 = new C2049p[2];
                        float f2 = (float) i;
                        r7[0] = new C2049p(((float) (iArr[1] + iArr[0])) / 2.0f, f2);
                        r7[1] = new C2049p(f, f2);
                        return new C2047n(stringBuilder, null, r7, C1958a.CODE_39);
                    }
                    throw C5629j.m12369a();
                } else {
                    i62 = i;
                    i5 += obj[0] + obj[1];
                    int i9 = length - 2;
                    System.arraycopy(obj, 2, obj, 0, i9);
                    obj[i9] = null;
                    obj[i7] = null;
                    i4--;
                }
                obj[i4] = 1;
                i3 ^= 1;
            }
            c++;
        }
        throw C5629j.m12369a();
    }
}
