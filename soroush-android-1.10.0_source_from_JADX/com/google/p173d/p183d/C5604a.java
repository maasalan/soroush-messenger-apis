package com.google.p173d.p183d;

import com.google.p173d.C1958a;
import com.google.p173d.C1987c;
import com.google.p173d.C2007e;
import com.google.p173d.C2045l;
import com.google.p173d.C2047n;
import com.google.p173d.C2048o;
import com.google.p173d.C2049p;
import com.google.p173d.C5615f;
import com.google.p173d.C5629j;
import com.google.p173d.p177b.C1966b;
import com.google.p173d.p177b.C1969e;
import com.google.p173d.p183d.p184a.C1988a;
import com.google.p173d.p183d.p184a.C1989b;
import com.google.p173d.p183d.p184a.C1990c;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C5604a implements C2045l {
    private static final C2049p[] f15462a = new C2049p[0];
    private final C1990c f15463b = new C1990c();

    public final C2047n mo1757a(C1987c c1987c, Map<C2007e, ?> map) {
        Map<C2007e, ?> map2 = map;
        if (map2 == null || !map2.containsKey(C2007e.PURE_BARCODE)) {
            C5604a c5604a = this;
            throw C5629j.m12369a();
        }
        int i;
        int i2;
        int[] iArr;
        C1966b c1966b;
        int i3;
        int i4;
        C1990c c1990c;
        Object obj;
        int[] iArr2;
        C1990c c1990c2;
        Object obj2;
        int i5;
        C2047n c2047n;
        String str;
        C1966b b = c1987c.m5457b();
        int i6 = b.f6573a;
        int i7 = -1;
        int i8 = b.f6574b;
        int i9 = -1;
        int i10 = i6;
        i6 = 0;
        while (i6 < b.f6574b) {
            int i11 = i8;
            i8 = i10;
            for (i10 = 0; i10 < b.f6575c; i10++) {
                int i12;
                int i13 = b.f6576d[(b.f6575c * i6) + i10];
                if (i13 != 0) {
                    if (i6 < i11) {
                        i11 = i6;
                    }
                    if (i6 > i9) {
                        i9 = i6;
                    }
                    i12 = i10 << 5;
                    i = 31;
                    if (i12 < i8) {
                        i2 = 0;
                        while ((i13 << (31 - i2)) == 0) {
                            i2++;
                        }
                        i2 += i12;
                        if (i2 < i8) {
                            i8 = i2;
                        }
                    }
                    if (i12 + 31 > i7) {
                        while ((i13 >>> i) == 0) {
                            i--;
                        }
                        i13 = i12 + i;
                        if (i13 > i7) {
                            i7 = i13;
                        }
                    }
                }
            }
            i6++;
            i10 = i8;
            i8 = i11;
        }
        if (i7 >= i10) {
            if (i9 >= i8) {
                iArr = new int[]{i10, i8, (i7 - i10) + 1, (i9 - i8) + 1};
                if (iArr != null) {
                    throw C5629j.m12369a();
                }
                i10 = iArr[0];
                i7 = iArr[1];
                i9 = iArr[2];
                i6 = iArr[3];
                c1966b = new C1966b(30, 33);
                for (i2 = 0; i2 < 33; i2++) {
                    i3 = (((i2 * i6) + (i6 / 2)) / 33) + i7;
                    for (i4 = 0; i4 < 30; i4++) {
                        if (b.m5416a(((((i4 * i9) + (i9 / 2)) + (((i2 & 1) * i9) / 2)) / 30) + i10, i3)) {
                            c1966b.m5418b(i4, i2);
                        }
                    }
                }
                c1990c = this.f15463b;
                C1988a c1988a = new C1988a(c1966b);
                obj = new byte[IjkMediaMeta.FF_PROFILE_H264_HIGH_444];
                i7 = c1988a.f6677b.f6574b;
                i9 = c1988a.f6677b.f6573a;
                i8 = 0;
                while (i8 < i7) {
                    iArr2 = C1988a.f6676a[i8];
                    i12 = 0;
                    while (i12 < i9) {
                        i = iArr2[i12];
                        if (i >= 0 && c1988a.f6677b.m5416a(i12, i8)) {
                            i3 = i / 6;
                            obj[i3] = (byte) (((byte) (1 << (5 - (i % 6)))) | obj[i3]);
                        }
                        i12++;
                    }
                    i8++;
                }
                c1990c.m5461a(obj, 0, 10, 10, 0);
                i6 = obj[0] & 15;
                switch (i6) {
                    case 2:
                    case 3:
                    case 4:
                        c1990c2 = c1990c;
                        obj2 = obj;
                        c1990c2.m5461a(obj2, 20, 84, 40, 1);
                        c1990c2.m5461a(obj2, 20, 84, 40, 2);
                        i5 = 94;
                        break;
                    case 5:
                        c1990c2 = c1990c;
                        obj2 = obj;
                        c1990c2.m5461a(obj2, 20, 68, 56, 1);
                        c1990c2.m5461a(obj2, 20, 68, 56, 2);
                        i5 = 78;
                        break;
                    default:
                        throw C5615f.m12347a();
                }
                byte[] bArr = new byte[i5];
                System.arraycopy(obj, 0, bArr, 0, 10);
                System.arraycopy(obj, 20, bArr, 10, bArr.length - 10);
                C1969e a = C1989b.m5459a(bArr, i6);
                c2047n = new C2047n(a.f6614c, a.f6612a, f15462a, C1958a.MAXICODE);
                str = a.f6616e;
                if (str != null) {
                    c2047n.m5581a(C2048o.ERROR_CORRECTION_LEVEL, str);
                }
                return c2047n;
            }
        }
        iArr = null;
        if (iArr != null) {
            i10 = iArr[0];
            i7 = iArr[1];
            i9 = iArr[2];
            i6 = iArr[3];
            c1966b = new C1966b(30, 33);
            for (i2 = 0; i2 < 33; i2++) {
                i3 = (((i2 * i6) + (i6 / 2)) / 33) + i7;
                for (i4 = 0; i4 < 30; i4++) {
                    if (b.m5416a(((((i4 * i9) + (i9 / 2)) + (((i2 & 1) * i9) / 2)) / 30) + i10, i3)) {
                        c1966b.m5418b(i4, i2);
                    }
                }
            }
            c1990c = this.f15463b;
            C1988a c1988a2 = new C1988a(c1966b);
            obj = new byte[IjkMediaMeta.FF_PROFILE_H264_HIGH_444];
            i7 = c1988a2.f6677b.f6574b;
            i9 = c1988a2.f6677b.f6573a;
            i8 = 0;
            while (i8 < i7) {
                iArr2 = C1988a.f6676a[i8];
                i12 = 0;
                while (i12 < i9) {
                    i = iArr2[i12];
                    i3 = i / 6;
                    obj[i3] = (byte) (((byte) (1 << (5 - (i % 6)))) | obj[i3]);
                    i12++;
                }
                i8++;
            }
            c1990c.m5461a(obj, 0, 10, 10, 0);
            i6 = obj[0] & 15;
            switch (i6) {
                case 2:
                case 3:
                case 4:
                    c1990c2 = c1990c;
                    obj2 = obj;
                    c1990c2.m5461a(obj2, 20, 84, 40, 1);
                    c1990c2.m5461a(obj2, 20, 84, 40, 2);
                    i5 = 94;
                    break;
                case 5:
                    c1990c2 = c1990c;
                    obj2 = obj;
                    c1990c2.m5461a(obj2, 20, 68, 56, 1);
                    c1990c2.m5461a(obj2, 20, 68, 56, 2);
                    i5 = 78;
                    break;
                default:
                    throw C5615f.m12347a();
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(obj, 0, bArr2, 0, 10);
            System.arraycopy(obj, 20, bArr2, 10, bArr2.length - 10);
            C1969e a2 = C1989b.m5459a(bArr2, i6);
            c2047n = new C2047n(a2.f6614c, a2.f6612a, f15462a, C1958a.MAXICODE);
            str = a2.f6616e;
            if (str != null) {
                c2047n.m5581a(C2048o.ERROR_CORRECTION_LEVEL, str);
            }
            return c2047n;
        }
        throw C5629j.m12369a();
    }

    public final void mo1758a() {
    }
}
