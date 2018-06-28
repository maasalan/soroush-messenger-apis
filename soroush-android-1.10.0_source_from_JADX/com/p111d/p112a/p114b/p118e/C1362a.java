package com.p111d.p112a.p114b.p118e;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.p111d.p112a.p114b.p120g.C1372f;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.jivesoftware.smack.roster.Roster;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C1362a {
    protected final C1362a f4274a;
    protected final AtomicReference<C1361a> f4275b;
    protected boolean f4276c;
    protected final boolean f4277d;
    protected int[] f4278e;
    protected int f4279f;
    protected int f4280g;
    protected int f4281h;
    protected int f4282i;
    protected int f4283j;
    protected String[] f4284k;
    protected int f4285l;
    protected int f4286m;
    private final int f4287n;
    private transient boolean f4288o;
    private boolean f4289p;

    private static final class C1361a {
        public final int f4267a;
        public final int f4268b;
        public final int f4269c;
        public final int[] f4270d;
        public final String[] f4271e;
        public final int f4272f;
        public final int f4273g;

        private C1361a(int i, int[] iArr, String[] strArr) {
            this.f4267a = 64;
            this.f4268b = 0;
            this.f4269c = i;
            this.f4270d = iArr;
            this.f4271e = strArr;
            this.f4272f = 448;
            this.f4273g = IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        }

        public C1361a(C1362a c1362a) {
            this.f4267a = c1362a.f4279f;
            this.f4268b = c1362a.f4283j;
            this.f4269c = c1362a.f4282i;
            this.f4270d = c1362a.f4278e;
            this.f4271e = c1362a.f4284k;
            this.f4272f = c1362a.f4285l;
            this.f4273g = c1362a.f4286m;
        }

        public static C1361a m3275a() {
            return new C1361a(C1362a.m3282c(64), new int[IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED], new String[128]);
        }
    }

    private C1362a(int i) {
        this.f4274a = null;
        this.f4287n = i;
        this.f4276c = true;
        this.f4277d = true;
        this.f4275b = new AtomicReference(C1361a.m3275a());
    }

    private C1362a(C1362a c1362a, boolean z, int i, boolean z2, C1361a c1361a) {
        this.f4274a = c1362a;
        this.f4287n = i;
        this.f4276c = z;
        this.f4277d = z2;
        this.f4275b = null;
        this.f4283j = c1361a.f4268b;
        this.f4279f = c1361a.f4267a;
        this.f4280g = this.f4279f << 2;
        this.f4281h = this.f4280g + (this.f4280g >> 1);
        this.f4282i = c1361a.f4269c;
        this.f4278e = c1361a.f4270d;
        this.f4284k = c1361a.f4271e;
        this.f4285l = c1361a.f4272f;
        this.f4286m = c1361a.f4273g;
        this.f4288o = false;
        this.f4289p = true;
    }

    public static C1362a m3276a() {
        long currentTimeMillis = System.currentTimeMillis();
        return new C1362a((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    private void m3277a(boolean z) {
        this.f4283j = 0;
        this.f4285l = m3284d();
        this.f4286m = this.f4279f << 3;
        if (z) {
            Arrays.fill(this.f4278e, 0);
            Arrays.fill(this.f4284k, null);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3278a(int[] r7, int r8, int r9) {
        /*
        r6 = this;
        r0 = r6.f4278e;
        r1 = 0;
        r2 = 1;
        switch(r8) {
            case 4: goto L_0x0041;
            case 5: goto L_0x0033;
            case 6: goto L_0x0025;
            case 7: goto L_0x0017;
            case 8: goto L_0x000b;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = r9;
        r9 = r1;
        goto L_0x006b;
    L_0x000b:
        r8 = r7[r1];
        r3 = r9 + 1;
        r9 = r0[r9];
        if (r8 == r9) goto L_0x0014;
    L_0x0013:
        return r1;
    L_0x0014:
        r8 = r2;
        r9 = r3;
        goto L_0x0018;
    L_0x0017:
        r8 = r1;
    L_0x0018:
        r3 = r8 + 1;
        r8 = r7[r8];
        r4 = r9 + 1;
        r9 = r0[r9];
        if (r8 == r9) goto L_0x0023;
    L_0x0022:
        return r1;
    L_0x0023:
        r9 = r4;
        goto L_0x0026;
    L_0x0025:
        r3 = r1;
    L_0x0026:
        r8 = r3 + 1;
        r3 = r7[r3];
        r4 = r9 + 1;
        r9 = r0[r9];
        if (r3 == r9) goto L_0x0031;
    L_0x0030:
        return r1;
    L_0x0031:
        r9 = r4;
        goto L_0x0034;
    L_0x0033:
        r8 = r1;
    L_0x0034:
        r3 = r8 + 1;
        r8 = r7[r8];
        r4 = r9 + 1;
        r9 = r0[r9];
        if (r8 == r9) goto L_0x003f;
    L_0x003e:
        return r1;
    L_0x003f:
        r9 = r4;
        goto L_0x0042;
    L_0x0041:
        r3 = r1;
    L_0x0042:
        r8 = r3 + 1;
        r3 = r7[r3];
        r4 = r9 + 1;
        r9 = r0[r9];
        if (r3 == r9) goto L_0x004d;
    L_0x004c:
        return r1;
    L_0x004d:
        r9 = r8 + 1;
        r8 = r7[r8];
        r3 = r4 + 1;
        r4 = r0[r4];
        if (r8 == r4) goto L_0x0058;
    L_0x0057:
        return r1;
    L_0x0058:
        r8 = r9 + 1;
        r9 = r7[r9];
        r4 = r3 + 1;
        r3 = r0[r3];
        if (r9 == r3) goto L_0x0063;
    L_0x0062:
        return r1;
    L_0x0063:
        r7 = r7[r8];
        r8 = r0[r4];
        if (r7 == r8) goto L_0x006a;
    L_0x0069:
        return r1;
    L_0x006a:
        return r2;
    L_0x006b:
        r3 = r9 + 1;
        r9 = r7[r9];
        r4 = r6.f4278e;
        r5 = r0 + 1;
        r0 = r4[r0];
        if (r9 == r0) goto L_0x0078;
    L_0x0077:
        return r1;
    L_0x0078:
        if (r3 < r8) goto L_0x007b;
    L_0x007a:
        return r2;
    L_0x007b:
        r9 = r3;
        r0 = r5;
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.b.e.a.a(int[], int, int):boolean");
    }

    private int m3279b(int i, int i2) {
        i += i >>> 15;
        i = ((i ^ (i >>> 9)) + (i2 * 33)) ^ this.f4287n;
        i += i >>> 16;
        i ^= i >>> 4;
        return i + (i << 3);
    }

    private int m3280b(int i, int i2, int i3) {
        i ^= this.f4287n;
        i = (((i + (i >>> 9)) * 31) + i2) * 33;
        i = (i + (i >>> 15)) ^ i3;
        i += i >>> 4;
        i += i >>> 15;
        return i ^ (i << 9);
    }

    private int m3281b(int[] iArr, int i) {
        if (i < 4) {
            throw new IllegalArgumentException();
        }
        int i2 = iArr[0] ^ this.f4287n;
        i2 = (i2 + (i2 >>> 9)) + iArr[1];
        i2 = ((i2 + (i2 >>> 15)) * 33) ^ iArr[2];
        i2 += i2 >>> 4;
        for (int i3 = 3; i3 < i; i3++) {
            int i4 = iArr[i3];
            i2 += i4 ^ (i4 >> 21);
        }
        i2 *= 65599;
        i2 += i2 >>> 19;
        return (i2 << 5) ^ i2;
    }

    static int m3282c(int i) {
        i >>= 2;
        return i < 64 ? 4 : i <= 256 ? 5 : i <= Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE ? 6 : 7;
    }

    private void m3283c() {
        if (this.f4283j <= (this.f4279f >> 1)) {
            return;
        }
        if (((this.f4285l - m3284d()) >> 2) > ((this.f4283j + 1) >> 7) || ((double) this.f4283j) > ((double) this.f4279f) * 0.8d) {
            this.f4288o = true;
        }
    }

    private final int m3284d() {
        int i = this.f4279f;
        return (i << 3) - i;
    }

    private final int m3285d(int i) {
        return (i & (this.f4279f - 1)) << 2;
    }

    private int m3286e(int i) {
        i = m3285d(i);
        int[] iArr = this.f4278e;
        if (iArr[i + 3] == 0) {
            return i;
        }
        int i2 = this.f4280g + ((i >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        i2 = this.f4281h + ((i >> (this.f4282i + 2)) << this.f4282i);
        i = (1 << this.f4282i) + i2;
        while (i2 < i) {
            if (iArr[i2 + 3] == 0) {
                return i2;
            }
            i2 += 4;
        }
        i = this.f4285l;
        this.f4285l += 4;
        if (this.f4285l >= (this.f4279f << 3)) {
            if (!this.f4277d || this.f4279f <= Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) {
                this.f4288o = true;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Spill-over slots in symbol table with ");
                stringBuilder.append(this.f4283j);
                stringBuilder.append(" entries, hash area of ");
                stringBuilder.append(this.f4279f);
                stringBuilder.append(" slots is now full (all ");
                stringBuilder.append(this.f4279f >> 3);
                stringBuilder.append(" slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return i;
    }

    private int m3287f(int i) {
        i ^= this.f4287n;
        i += i >>> 16;
        i ^= i << 3;
        return i + (i >>> 12);
    }

    public final C1362a m3288a(int i) {
        return new C1362a(this, com.p111d.p112a.p114b.C5297e.C1362a.INTERN_FIELD_NAMES.m3274a(i), this.f4287n, com.p111d.p112a.p114b.C5297e.C1362a.FAIL_ON_SYMBOL_HASH_OVERFLOW.m3274a(i), (C1361a) this.f4275b.get());
    }

    public final String m3289a(int i, int i2) {
        int d = m3285d(m3279b(i, i2));
        int[] iArr = this.f4278e;
        int i3 = iArr[d + 3];
        if (i3 == 2) {
            if (i == iArr[d] && i2 == iArr[d + 1]) {
                return this.f4284k[d >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        i3 = this.f4280g + ((d >> 3) << 2);
        int i4 = iArr[i3 + 3];
        if (i4 == 2) {
            if (i == iArr[i3] && i2 == iArr[i3 + 1]) {
                return this.f4284k[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.f4281h + ((d >> (this.f4282i + 2)) << this.f4282i);
        int[] iArr2 = this.f4278e;
        i3 = (1 << this.f4282i) + i5;
        while (i5 < i3) {
            i4 = iArr2[i5 + 3];
            if (i != iArr2[i5] || i2 != iArr2[i5 + 1] || 2 != i4) {
                if (i4 == 0) {
                    break;
                }
                i5 += 4;
            } else {
                return this.f4284k[i5 >> 2];
            }
        }
        i5 = m3284d();
        while (i5 < this.f4285l) {
            if (i == iArr2[i5] && i2 == iArr2[i5 + 1] && 2 == iArr2[i5 + 3]) {
                return this.f4284k[i5 >> 2];
            }
            i5 += 4;
        }
        return null;
    }

    public final String m3290a(int i, int i2, int i3) {
        int d = m3285d(m3280b(i, i2, i3));
        int[] iArr = this.f4278e;
        int i4 = iArr[d + 3];
        if (i4 == 3) {
            if (i == iArr[d] && iArr[d + 1] == i2 && iArr[d + 2] == i3) {
                return this.f4284k[d >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        i4 = this.f4280g + ((d >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 3) {
            if (i == iArr[i4] && iArr[i4 + 1] == i2 && iArr[i4 + 2] == i3) {
                return this.f4284k[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = this.f4281h + ((d >> (this.f4282i + 2)) << this.f4282i);
        int[] iArr2 = this.f4278e;
        i4 = (1 << this.f4282i) + i6;
        while (i6 < i4) {
            i5 = iArr2[i6 + 3];
            if (i != iArr2[i6] || i2 != iArr2[i6 + 1] || i3 != iArr2[i6 + 2] || 3 != i5) {
                if (i5 == 0) {
                    break;
                }
                i6 += 4;
            } else {
                return this.f4284k[i6 >> 2];
            }
        }
        i6 = m3284d();
        while (i6 < this.f4285l) {
            if (i == iArr2[i6] && i2 == iArr2[i6 + 1] && i3 == iArr2[i6 + 2] && 3 == iArr2[i6 + 3]) {
                return this.f4284k[i6 >> 2];
            }
            i6 += 4;
        }
        return null;
    }

    public final String m3291a(String str, int[] iArr, int i) {
        int i2;
        int[] iArr2 = iArr;
        int i3 = i;
        if (this.f4289p) {
            r0.f4278e = Arrays.copyOf(r0.f4278e, r0.f4278e.length);
            r0.f4284k = (String[]) Arrays.copyOf(r0.f4284k, r0.f4284k.length);
            r0.f4289p = false;
            m3283c();
        }
        int i4 = 3;
        if (r0.f4288o) {
            r0.f4288o = false;
            r0.f4289p = false;
            Object obj = r0.f4278e;
            String[] strArr = r0.f4284k;
            i2 = r0.f4279f;
            int i5 = r0.f4283j;
            int i6 = i2 + i2;
            int i7 = r0.f4285l;
            if (i6 > 65536) {
                m3277a(true);
            } else {
                r0.f4278e = new int[(obj.length + (i2 << 3))];
                r0.f4279f = i6;
                r0.f4280g = i6 << 2;
                r0.f4281h = r0.f4280g + (r0.f4280g >> 1);
                r0.f4282i = C1362a.m3282c(i6);
                r0.f4284k = new String[(strArr.length << 1)];
                m3277a(false);
                i6 = 0;
                int[] iArr3 = new int[16];
                i2 = i6;
                while (i2 < i7) {
                    int i8 = obj[i2 + 3];
                    if (i8 != 0) {
                        i6++;
                        String str2 = strArr[i2 >> 2];
                        switch (i8) {
                            case 1:
                                iArr3[0] = obj[i2];
                                m3291a(str2, iArr3, 1);
                                break;
                            case 2:
                                iArr3[0] = obj[i2];
                                iArr3[1] = obj[i2 + 1];
                                m3291a(str2, iArr3, 2);
                                break;
                            case 3:
                                iArr3[0] = obj[i2];
                                iArr3[1] = obj[i2 + 1];
                                iArr3[2] = obj[i2 + 2];
                                m3291a(str2, iArr3, i4);
                                break;
                            default:
                                if (i8 > iArr3.length) {
                                    iArr3 = new int[i8];
                                }
                                System.arraycopy(obj, obj[i2 + 1], iArr3, 0, i8);
                                m3291a(str2, iArr3, i8);
                                break;
                        }
                    }
                    i2 += 4;
                    i4 = 3;
                }
                if (i6 != i5) {
                    StringBuilder stringBuilder = new StringBuilder("Failed rehash(): old count=");
                    stringBuilder.append(i5);
                    stringBuilder.append(", copyCount=");
                    stringBuilder.append(i6);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        }
        String a = r0.f4276c ? C1372f.f4330a.m3329a(str) : str;
        switch (i3) {
            case 1:
                i3 = m3286e(m3287f(iArr2[0]));
                r0.f4278e[i3] = iArr2[0];
                r0.f4278e[i3 + 3] = 1;
                break;
            case 2:
                i3 = m3286e(m3279b(iArr2[0], iArr2[1]));
                r0.f4278e[i3] = iArr2[0];
                r0.f4278e[i3 + 1] = iArr2[1];
                r0.f4278e[i3 + 3] = 2;
                break;
            case 3:
                i3 = m3286e(m3280b(iArr2[0], iArr2[1], iArr2[2]));
                r0.f4278e[i3] = iArr2[0];
                r0.f4278e[i3 + 1] = iArr2[1];
                r0.f4278e[i3 + 2] = iArr2[2];
                r0.f4278e[i3 + 3] = 3;
                break;
            default:
                i4 = m3281b(iArr2, i3);
                int e = m3286e(i4);
                r0.f4278e[e] = i4;
                i4 = r0.f4286m;
                i2 = i4 + i3;
                if (i2 > r0.f4278e.length) {
                    r0.f4278e = Arrays.copyOf(r0.f4278e, r0.f4278e.length + Math.max(i2 - r0.f4278e.length, Math.min(ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, r0.f4279f)));
                }
                System.arraycopy(iArr2, 0, r0.f4278e, i4, i3);
                r0.f4286m += i3;
                r0.f4278e[e + 1] = i4;
                r0.f4278e[e + 3] = i3;
                i3 = e;
                break;
        }
        r0.f4284k[i3 >> 2] = a;
        r0.f4283j++;
        m3283c();
        return a;
    }

    public final String m3292a(int[] iArr, int i) {
        if (i < 4) {
            return i == 3 ? m3290a(iArr[0], iArr[1], iArr[2]) : i == 2 ? m3289a(iArr[0], iArr[1]) : m3293b(iArr[0]);
        } else {
            int b = m3281b(iArr, i);
            int d = m3285d(b);
            int[] iArr2 = this.f4278e;
            int i2 = iArr2[d + 3];
            if (b == iArr2[d] && i2 == i && m3278a(iArr, i, iArr2[d + 1])) {
                return this.f4284k[d >> 2];
            }
            if (i2 == 0) {
                return null;
            }
            int i3 = this.f4280g + ((d >> 3) << 2);
            int i4 = iArr2[i3 + 3];
            if (b == iArr2[i3] && i4 == i && m3278a(iArr, i, iArr2[i3 + 1])) {
                return this.f4284k[i3 >> 2];
            }
            if (i2 == 0) {
                return null;
            }
            int i5 = this.f4281h + ((d >> (this.f4282i + 2)) << this.f4282i);
            int[] iArr3 = this.f4278e;
            int i6 = (1 << this.f4282i) + i5;
            while (i5 < i6) {
                i2 = iArr3[i5 + 3];
                if (b != iArr3[i5] || i != i2 || !m3278a(iArr, i, iArr3[i5 + 1])) {
                    if (i2 == 0) {
                        break;
                    }
                    i5 += 4;
                } else {
                    return this.f4284k[i5 >> 2];
                }
            }
            i6 = m3284d();
            while (i6 < this.f4285l) {
                if (b == iArr3[i6] && i == iArr3[i6 + 3] && m3278a(iArr, i, iArr3[i6 + 1])) {
                    return this.f4284k[i6 >> 2];
                }
                i6 += 4;
            }
            return null;
        }
    }

    public final String m3293b(int i) {
        int d = m3285d(m3287f(i));
        int[] iArr = this.f4278e;
        int i2 = iArr[d + 3];
        if (i2 == 1) {
            if (iArr[d] == i) {
                return this.f4284k[d >> 2];
            }
        } else if (i2 == 0) {
            return null;
        }
        i2 = this.f4280g + ((d >> 3) << 2);
        int i3 = iArr[i2 + 3];
        if (i3 == 1) {
            if (iArr[i2] == i) {
                return this.f4284k[i2 >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.f4281h + ((d >> (this.f4282i + 2)) << this.f4282i);
        int[] iArr2 = this.f4278e;
        i2 = (1 << this.f4282i) + i4;
        while (i4 < i2) {
            i3 = iArr2[i4 + 3];
            if (i != iArr2[i4] || 1 != i3) {
                if (i3 == 0) {
                    break;
                }
                i4 += 4;
            } else {
                return this.f4284k[i4 >> 2];
            }
        }
        i4 = m3284d();
        while (i4 < this.f4285l) {
            if (i == iArr2[i4] && 1 == iArr2[i4 + 3]) {
                return this.f4284k[i4 >> 2];
            }
            i4 += 4;
        }
        return null;
    }

    public final void m3294b() {
        if (this.f4274a != null && (this.f4289p ^ 1) != 0) {
            C1362a c1362a = this.f4274a;
            Object c1361a = new C1361a(this);
            int i = c1361a.f4268b;
            C1361a c1361a2 = (C1361a) c1362a.f4275b.get();
            if (i != c1361a2.f4268b) {
                if (i > 6000) {
                    c1361a = C1361a.m3275a();
                }
                c1362a.f4275b.compareAndSet(c1361a2, c1361a);
            }
            this.f4289p = true;
        }
    }

    public final String toString() {
        int i;
        int i2 = this.f4280g;
        int i3 = 0;
        for (i = 3; i < i2; i += 4) {
            if (this.f4278e[i] != 0) {
                i3++;
            }
        }
        i = this.f4281h;
        int i4 = 0;
        for (i2 = this.f4280g + 3; i2 < i; i2 += 4) {
            if (this.f4278e[i2] != 0) {
                i4++;
            }
        }
        i2 = this.f4281h + 3;
        i = this.f4279f + i2;
        int i5 = 0;
        while (i2 < i) {
            if (this.f4278e[i2] != 0) {
                i5++;
            }
            i2 += 4;
        }
        i2 = (this.f4285l - m3284d()) >> 2;
        int i6 = this.f4279f << 3;
        int i7 = 0;
        for (int i8 = 3; i8 < i6; i8 += 4) {
            if (this.f4278e[i8] != 0) {
                i7++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[]{getClass().getName(), Integer.valueOf(this.f4283j), Integer.valueOf(this.f4279f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(i7), Integer.valueOf(((i3 + i4) + i5) + i2), Integer.valueOf(i7)});
    }
}
