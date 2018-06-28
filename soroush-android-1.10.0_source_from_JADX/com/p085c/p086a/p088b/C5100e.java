package com.p085c.p086a.p088b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.Log;
import com.p085c.p086a.p088b.C1087a.C1086a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class C5100e implements C1087a {
    private static final String f14249a = "e";
    private int[] f14250b;
    private final int[] f14251c;
    private ByteBuffer f14252d;
    private byte[] f14253e;
    private byte[] f14254f;
    private int f14255g;
    private int f14256h;
    private short[] f14257i;
    private byte[] f14258j;
    private byte[] f14259k;
    private byte[] f14260l;
    private int[] f14261m;
    private int f14262n;
    private C1089c f14263o;
    private C1086a f14264p;
    private Bitmap f14265q;
    private boolean f14266r;
    private int f14267s;
    private int f14268t;
    private int f14269u;
    private int f14270v;
    private boolean f14271w;

    private C5100e(C1086a c1086a) {
        this.f14251c = new int[256];
        this.f14255g = 0;
        this.f14256h = 0;
        this.f14264p = c1086a;
        this.f14263o = new C1089c();
    }

    public C5100e(C1086a c1086a, C1089c c1089c, ByteBuffer byteBuffer, int i) {
        this(c1086a);
        m10437a(c1089c, byteBuffer, i);
    }

    private Bitmap m10436a(C1088b c1088b, C1088b c1088b2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C1088b c1088b3 = c1088b;
        C1088b c1088b4 = c1088b2;
        int[] iArr = this.f14261m;
        short s = (short) 0;
        if (c1088b4 == null) {
            Arrays.fill(iArr, 0);
        }
        int i10 = 3;
        if (c1088b4 != null && c1088b4.f3563g > 0) {
            if (c1088b4.f3563g == 2) {
                if (!c1088b3.f3562f) {
                    i = r0.f14263o.f3579l;
                    if (c1088b3.f3567k != null && r0.f14263o.f3577j == c1088b3.f3564h) {
                    }
                    i2 = c1088b4.f3559c / r0.f14268t;
                    i3 = ((c1088b4.f3558b / r0.f14268t) * r0.f14270v) + (c1088b4.f3557a / r0.f14268t);
                    i4 = ((c1088b4.f3560d / r0.f14268t) * r0.f14270v) + i3;
                    while (i3 < i4) {
                        i5 = i3 + i2;
                        for (i6 = i3; i6 < i5; i6++) {
                            iArr[i6] = i;
                        }
                        i3 += r0.f14270v;
                    }
                } else if (r0.f14262n == 0) {
                    r0.f14271w = true;
                }
                i = 0;
                i2 = c1088b4.f3559c / r0.f14268t;
                i3 = ((c1088b4.f3558b / r0.f14268t) * r0.f14270v) + (c1088b4.f3557a / r0.f14268t);
                i4 = ((c1088b4.f3560d / r0.f14268t) * r0.f14270v) + i3;
                while (i3 < i4) {
                    i5 = i3 + i2;
                    for (i6 = i3; i6 < i5; i6++) {
                        iArr[i6] = i;
                    }
                    i3 += r0.f14270v;
                }
            } else if (c1088b4.f3563g == 3 && r0.f14265q != null) {
                r0.f14265q.getPixels(iArr, 0, r0.f14270v, 0, 0, r0.f14270v, r0.f14269u);
            }
        }
        r0.f14255g = 0;
        r0.f14256h = 0;
        if (c1088b3 != null) {
            r0.f14252d.position(c1088b3.f3566j);
        }
        if (c1088b3 == null) {
            i5 = r0.f14263o.f3573f;
            i = r0.f14263o.f3574g;
        } else {
            i5 = c1088b3.f3559c;
            i = c1088b3.f3560d;
        }
        short s2 = i5 * i;
        if (r0.f14260l == null || r0.f14260l.length < s2) {
            r0.f14260l = r0.f14264p.mo1219a((int) s2);
        }
        if (r0.f14257i == null) {
            r0.f14257i = new short[ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        if (r0.f14258j == null) {
            r0.f14258j = new byte[ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        if (r0.f14259k == null) {
            r0.f14259k = new byte[4097];
        }
        i = m10439k();
        i3 = 1 << i;
        i2 = i3 + 1;
        i6 = i3 + 2;
        i++;
        int i11 = (1 << i) - 1;
        for (i7 = 0; i7 < i3; i7++) {
            r0.f14257i[i7] = (short) 0;
            r0.f14258j[i7] = (byte) i7;
        }
        i7 = -1;
        int i12 = i;
        int i13 = i6;
        int i14 = i11;
        int i15 = -1;
        short s3 = (short) 0;
        int i16 = s3;
        short s4 = i16;
        int i17 = s4;
        int i18 = i17;
        int i19 = i18;
        int i20 = i19;
        short s5 = i20;
        while (s3 < s2) {
            if (i16 == 0) {
                i16 = m10440l();
                if (i16 <= 0) {
                    r0.f14267s = i10;
                    break;
                }
                i19 = s;
            }
            i18 += (r0.f14253e[i19] & 255) << i17;
            i19++;
            i16 += i7;
            i8 = i17 + 8;
            short s6 = s5;
            int i21 = i13;
            i4 = i15;
            i17 = s4;
            int i22 = s3;
            i9 = i12;
            while (i8 >= i9) {
                i7 = i18 & i14;
                i18 >>= i9;
                i8 -= i9;
                if (i7 != i3) {
                    if (i7 > i21) {
                        r0.f14267s = i10;
                    } else if (i7 != i2) {
                        int i23;
                        if (i4 == -1) {
                            i23 = i20 + 1;
                            r0.f14259k[i20] = r0.f14258j[i7];
                            i4 = i7;
                            s6 = i4;
                            i20 = i23;
                        } else {
                            int i24;
                            int i25;
                            if (i7 >= i21) {
                                i23 = i20 + 1;
                                i24 = i;
                                r0.f14259k[i20] = (byte) s6;
                                i = i4;
                                i20 = i23;
                            } else {
                                i24 = i;
                                i = i7;
                            }
                            while (i >= i3) {
                                i23 = i20 + 1;
                                i25 = i3;
                                r0.f14259k[i20] = r0.f14258j[i];
                                i = r0.f14257i[i];
                                i20 = i23;
                                i3 = i25;
                            }
                            i25 = i3;
                            short s7 = r0.f14258j[i] & 255;
                            i10 = i20 + 1;
                            int i26 = i2;
                            byte b = (byte) s7;
                            r0.f14259k[i20] = b;
                            if (i21 < ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) {
                                r0.f14257i[i21] = (short) i4;
                                r0.f14258j[i21] = b;
                                i21++;
                                if ((i21 & i14) == 0) {
                                    if (i21 < ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) {
                                        i9++;
                                        i14 += i21;
                                    }
                                }
                            }
                            i20 = i10;
                            while (i20 > 0) {
                                i2 = i17 + 1;
                                i20--;
                                r0.f14260l[i17] = r0.f14259k[i20];
                                i22++;
                                i17 = i2;
                            }
                            s6 = s7;
                            i4 = i7;
                            i = i24;
                            i3 = i25;
                            i2 = i26;
                        }
                        i7 = -1;
                        i10 = 3;
                    }
                    s5 = s6;
                    i15 = i4;
                    i4 = 4096;
                    i12 = i9;
                    i13 = i21;
                    s3 = i22;
                    s4 = i17;
                    i = i;
                    i3 = i3;
                    i2 = i2;
                    i7 = -1;
                    i10 = 3;
                    break;
                }
                i9 = i;
                i21 = i6;
                i14 = i11;
                i4 = -1;
                i7 = -1;
            }
            s5 = s6;
            i15 = i4;
            i12 = i9;
            i13 = i21;
            s3 = i22;
            s4 = i17;
            i = i;
            i17 = i8;
            s = (short) 0;
        }
        for (s7 = s4; s7 < s2; s7++) {
            r0.f14260l[s7] = (byte) 0;
        }
        i5 = c1088b3.f3560d / r0.f14268t;
        i = c1088b3.f3558b / r0.f14268t;
        i4 = c1088b3.f3559c / r0.f14268t;
        i2 = c1088b3.f3557a / r0.f14268t;
        Object obj = r0.f14262n == 0 ? 1 : null;
        i11 = 0;
        i9 = i11;
        i8 = 8;
        i7 = 1;
        while (i11 < i5) {
            int i27;
            if (c1088b3.f3561e) {
                if (i9 >= i5) {
                    i7++;
                    switch (i7) {
                        case 2:
                            i9 = 4;
                            break;
                        case 3:
                            i8 = 4;
                            i9 = 2;
                            break;
                        case 4:
                            i8 = 2;
                            i9 = 1;
                            break;
                        default:
                            break;
                    }
                }
                i10 = i9 + i8;
            } else {
                i10 = i9;
                i9 = i11;
            }
            i9 += i;
            if (i9 < r0.f14269u) {
                i9 *= r0.f14270v;
                i21 = i9 + i2;
                i16 = i21 + i4;
                if (r0.f14270v + i9 < i16) {
                    i16 = i9 + r0.f14270v;
                }
                i3 = (r0.f14268t * i11) * c1088b3.f3559c;
                i27 = i5;
                i9 = ((i16 - i21) * r0.f14268t) + i3;
                while (i21 < i16) {
                    int i28;
                    int i29;
                    int i30 = i;
                    if (r0.f14268t == 1) {
                        i5 = r0.f14250b[r0.f14260l[i3] & 255];
                        i28 = i4;
                        i29 = i2;
                    } else {
                        i5 = c1088b3.f3559c;
                        i28 = i4;
                        i = i3;
                        i22 = 0;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                        i20 = 0;
                        while (i < r0.f14268t + i3 && i < r0.f14260l.length && i < i9) {
                            i29 = i2;
                            i4 = r0.f14250b[r0.f14260l[i] & 255];
                            if (i4 != 0) {
                                i22 += (i4 >> 24) & 255;
                                i17 += (i4 >> 16) & 255;
                                i18 += (i4 >> 8) & 255;
                                i19 += i4 & 255;
                                i20++;
                            }
                            i++;
                            i2 = i29;
                        }
                        i29 = i2;
                        i5 += i3;
                        i = i5;
                        while (i < r0.f14268t + i5 && i < r0.f14260l.length && i < i9) {
                            i4 = r0.f14250b[r0.f14260l[i] & 255];
                            if (i4 != 0) {
                                i22 += (i4 >> 24) & 255;
                                i17 += (i4 >> 16) & 255;
                                i18 += (i4 >> 8) & 255;
                                i19 += i4 & 255;
                                i20++;
                            }
                            i++;
                        }
                        i5 = i20 == 0 ? 0 : ((((i22 / i20) << 24) | ((i17 / i20) << 16)) | ((i18 / i20) << 8)) | (i19 / i20);
                    }
                    if (i5 != 0) {
                        iArr[i21] = i5;
                    } else if (!(r0.f14271w || obj == null)) {
                        r0.f14271w = true;
                    }
                    i3 += r0.f14268t;
                    i21++;
                    i = i30;
                    i4 = i28;
                    i2 = i29;
                }
            } else {
                i27 = i5;
            }
            i11++;
            i9 = i10;
            i5 = i27;
            i = i;
            i4 = i4;
            i2 = i2;
        }
        if (r0.f14266r && (c1088b3.f3563g == 0 || c1088b3.f3563g == 1)) {
            if (r0.f14265q == null) {
                r0.f14265q = m10441m();
            }
            r0.f14265q.setPixels(iArr, 0, r0.f14270v, 0, 0, r0.f14270v, r0.f14269u);
        }
        Bitmap m = m10441m();
        m.setPixels(iArr, 0, r0.f14270v, 0, 0, r0.f14270v, r0.f14269u);
        return m;
    }

    private synchronized void m10437a(C1089c c1089c, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            StringBuilder stringBuilder = new StringBuilder("Sample size must be >=0, not: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        i = Integer.highestOneBit(i);
        this.f14267s = 0;
        this.f14263o = c1089c;
        this.f14271w = false;
        this.f14262n = -1;
        this.f14252d = byteBuffer.asReadOnlyBuffer();
        this.f14252d.position(0);
        this.f14252d.order(ByteOrder.LITTLE_ENDIAN);
        this.f14266r = false;
        for (C1088b c1088b : c1089c.f3572e) {
            if (c1088b.f3563g == 3) {
                this.f14266r = true;
                break;
            }
        }
        this.f14268t = i;
        this.f14270v = c1089c.f3573f / i;
        this.f14269u = c1089c.f3574g / i;
        this.f14260l = this.f14264p.mo1219a(c1089c.f3573f * c1089c.f3574g);
        this.f14261m = this.f14264p.mo1220b(this.f14270v * this.f14269u);
    }

    private void m10438j() {
        if (this.f14255g <= this.f14256h) {
            if (this.f14254f == null) {
                this.f14254f = this.f14264p.mo1219a(16384);
            }
            this.f14256h = 0;
            this.f14255g = Math.min(this.f14252d.remaining(), 16384);
            this.f14252d.get(this.f14254f, 0, this.f14255g);
        }
    }

    private int m10439k() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r3.m10438j();	 Catch:{ Exception -> 0x0010 }
        r0 = r3.f14254f;	 Catch:{ Exception -> 0x0010 }
        r1 = r3.f14256h;	 Catch:{ Exception -> 0x0010 }
        r2 = r1 + 1;	 Catch:{ Exception -> 0x0010 }
        r3.f14256h = r2;	 Catch:{ Exception -> 0x0010 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0010 }
        r0 = r0 & 255;
        return r0;
    L_0x0010:
        r0 = 1;
        r3.f14267s = r0;
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.b.e.k():int");
    }

    private int m10440l() {
        int k = m10439k();
        if (k > 0) {
            try {
                if (this.f14253e == null) {
                    this.f14253e = this.f14264p.mo1219a(255);
                }
                int i = this.f14255g - this.f14256h;
                if (i >= k) {
                    System.arraycopy(this.f14254f, this.f14256h, this.f14253e, 0, k);
                    this.f14256h += k;
                    return k;
                } else if (this.f14252d.remaining() + i >= k) {
                    System.arraycopy(this.f14254f, this.f14256h, this.f14253e, 0, i);
                    this.f14256h = this.f14255g;
                    m10438j();
                    int i2 = k - i;
                    System.arraycopy(this.f14254f, 0, this.f14253e, i, i2);
                    this.f14256h += i2;
                    return k;
                } else {
                    this.f14267s = 1;
                    return k;
                }
            } catch (Throwable e) {
                Log.w(f14249a, "Error Reading Block", e);
                this.f14267s = 1;
            }
        }
        return k;
    }

    private Bitmap m10441m() {
        Bitmap a = this.f14264p.mo1215a(this.f14270v, this.f14269u, this.f14271w ? Config.ARGB_8888 : Config.RGB_565);
        a.setHasAlpha(true);
        return a;
    }

    public final ByteBuffer mo1098a() {
        return this.f14252d;
    }

    public final void mo1099b() {
        this.f14262n = (this.f14262n + 1) % this.f14263o.f3570c;
    }

    public final int mo1100c() {
        if (this.f14263o.f3570c > 0) {
            if (this.f14262n >= 0) {
                int i = this.f14262n;
                int i2 = -1;
                if (i >= 0 && i < this.f14263o.f3570c) {
                    i2 = ((C1088b) this.f14263o.f3572e.get(i)).f3565i;
                }
                return i2;
            }
        }
        return 0;
    }

    public final int mo1101d() {
        return this.f14263o.f3570c;
    }

    public final int mo1102e() {
        return this.f14262n;
    }

    public final void mo1103f() {
        this.f14262n = -1;
    }

    public final int mo1104g() {
        return (this.f14252d.limit() + this.f14260l.length) + (this.f14261m.length * 4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap mo1105h() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f14263o;	 Catch:{ all -> 0x00d2 }
        r0 = r0.f3570c;	 Catch:{ all -> 0x00d2 }
        r1 = 3;
        r2 = 1;
        if (r0 <= 0) goto L_0x000d;
    L_0x0009:
        r0 = r7.f14262n;	 Catch:{ all -> 0x00d2 }
        if (r0 >= 0) goto L_0x0038;
    L_0x000d:
        r0 = f14249a;	 Catch:{ all -> 0x00d2 }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00d2 }
        if (r0 == 0) goto L_0x0036;
    L_0x0015:
        r0 = f14249a;	 Catch:{ all -> 0x00d2 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d2 }
        r4 = "Unable to decode frame, frameCount=";
        r3.<init>(r4);	 Catch:{ all -> 0x00d2 }
        r4 = r7.f14263o;	 Catch:{ all -> 0x00d2 }
        r4 = r4.f3570c;	 Catch:{ all -> 0x00d2 }
        r3.append(r4);	 Catch:{ all -> 0x00d2 }
        r4 = ", framePointer=";
        r3.append(r4);	 Catch:{ all -> 0x00d2 }
        r4 = r7.f14262n;	 Catch:{ all -> 0x00d2 }
        r3.append(r4);	 Catch:{ all -> 0x00d2 }
        r3 = r3.toString();	 Catch:{ all -> 0x00d2 }
        android.util.Log.d(r0, r3);	 Catch:{ all -> 0x00d2 }
    L_0x0036:
        r7.f14267s = r2;	 Catch:{ all -> 0x00d2 }
    L_0x0038:
        r0 = r7.f14267s;	 Catch:{ all -> 0x00d2 }
        r3 = 0;
        if (r0 == r2) goto L_0x00b3;
    L_0x003d:
        r0 = r7.f14267s;	 Catch:{ all -> 0x00d2 }
        r4 = 2;
        if (r0 != r4) goto L_0x0043;
    L_0x0042:
        goto L_0x00b3;
    L_0x0043:
        r0 = 0;
        r7.f14267s = r0;	 Catch:{ all -> 0x00d2 }
        r4 = r7.f14263o;	 Catch:{ all -> 0x00d2 }
        r4 = r4.f3572e;	 Catch:{ all -> 0x00d2 }
        r5 = r7.f14262n;	 Catch:{ all -> 0x00d2 }
        r4 = r4.get(r5);	 Catch:{ all -> 0x00d2 }
        r4 = (com.p085c.p086a.p088b.C1088b) r4;	 Catch:{ all -> 0x00d2 }
        r5 = r7.f14262n;	 Catch:{ all -> 0x00d2 }
        r5 = r5 - r2;
        if (r5 < 0) goto L_0x0062;
    L_0x0057:
        r6 = r7.f14263o;	 Catch:{ all -> 0x00d2 }
        r6 = r6.f3572e;	 Catch:{ all -> 0x00d2 }
        r5 = r6.get(r5);	 Catch:{ all -> 0x00d2 }
        r5 = (com.p085c.p086a.p088b.C1088b) r5;	 Catch:{ all -> 0x00d2 }
        goto L_0x0063;
    L_0x0062:
        r5 = r3;
    L_0x0063:
        r6 = r4.f3567k;	 Catch:{ all -> 0x00d2 }
        if (r6 == 0) goto L_0x006a;
    L_0x0067:
        r6 = r4.f3567k;	 Catch:{ all -> 0x00d2 }
        goto L_0x006e;
    L_0x006a:
        r6 = r7.f14263o;	 Catch:{ all -> 0x00d2 }
        r6 = r6.f3568a;	 Catch:{ all -> 0x00d2 }
    L_0x006e:
        r7.f14250b = r6;	 Catch:{ all -> 0x00d2 }
        r6 = r7.f14250b;	 Catch:{ all -> 0x00d2 }
        if (r6 != 0) goto L_0x0095;
    L_0x0074:
        r0 = f14249a;	 Catch:{ all -> 0x00d2 }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00d2 }
        if (r0 == 0) goto L_0x0091;
    L_0x007c:
        r0 = f14249a;	 Catch:{ all -> 0x00d2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d2 }
        r4 = "No valid color table found for frame #";
        r1.<init>(r4);	 Catch:{ all -> 0x00d2 }
        r4 = r7.f14262n;	 Catch:{ all -> 0x00d2 }
        r1.append(r4);	 Catch:{ all -> 0x00d2 }
        r1 = r1.toString();	 Catch:{ all -> 0x00d2 }
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x00d2 }
    L_0x0091:
        r7.f14267s = r2;	 Catch:{ all -> 0x00d2 }
        monitor-exit(r7);
        return r3;
    L_0x0095:
        r1 = r4.f3562f;	 Catch:{ all -> 0x00d2 }
        if (r1 == 0) goto L_0x00ad;
    L_0x0099:
        r1 = r7.f14250b;	 Catch:{ all -> 0x00d2 }
        r2 = r7.f14251c;	 Catch:{ all -> 0x00d2 }
        r3 = r7.f14250b;	 Catch:{ all -> 0x00d2 }
        r3 = r3.length;	 Catch:{ all -> 0x00d2 }
        java.lang.System.arraycopy(r1, r0, r2, r0, r3);	 Catch:{ all -> 0x00d2 }
        r1 = r7.f14251c;	 Catch:{ all -> 0x00d2 }
        r7.f14250b = r1;	 Catch:{ all -> 0x00d2 }
        r1 = r7.f14250b;	 Catch:{ all -> 0x00d2 }
        r2 = r4.f3564h;	 Catch:{ all -> 0x00d2 }
        r1[r2] = r0;	 Catch:{ all -> 0x00d2 }
    L_0x00ad:
        r0 = r7.m10436a(r4, r5);	 Catch:{ all -> 0x00d2 }
        monitor-exit(r7);
        return r0;
    L_0x00b3:
        r0 = f14249a;	 Catch:{ all -> 0x00d2 }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00d2 }
        if (r0 == 0) goto L_0x00d0;
    L_0x00bb:
        r0 = f14249a;	 Catch:{ all -> 0x00d2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d2 }
        r2 = "Unable to decode frame, status=";
        r1.<init>(r2);	 Catch:{ all -> 0x00d2 }
        r2 = r7.f14267s;	 Catch:{ all -> 0x00d2 }
        r1.append(r2);	 Catch:{ all -> 0x00d2 }
        r1 = r1.toString();	 Catch:{ all -> 0x00d2 }
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x00d2 }
    L_0x00d0:
        monitor-exit(r7);
        return r3;
    L_0x00d2:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.b.e.h():android.graphics.Bitmap");
    }

    public final void mo1106i() {
        this.f14263o = null;
        if (this.f14260l != null) {
            this.f14264p.mo1217a(this.f14260l);
        }
        if (this.f14261m != null) {
            this.f14264p.mo1218a(this.f14261m);
        }
        if (this.f14265q != null) {
            this.f14264p.mo1216a(this.f14265q);
        }
        this.f14265q = null;
        this.f14252d = null;
        this.f14271w = false;
        if (this.f14253e != null) {
            this.f14264p.mo1217a(this.f14253e);
        }
        if (this.f14254f != null) {
            this.f14264p.mo1217a(this.f14254f);
        }
    }
}
