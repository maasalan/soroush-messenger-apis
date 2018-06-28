package android.support.v7.p045d;

import android.graphics.Color;
import android.support.v4.p031b.C0433a;
import android.support.v7.p045d.C0694b.C0691b;
import android.support.v7.p045d.C0694b.C0693d;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import org.linphone.core.Privacy;

final class C0688a {
    private static final Comparator<C0687a> f2270g = new C06851();
    final int[] f2271a;
    final int[] f2272b;
    final List<C0693d> f2273c;
    final TimingLogger f2274d = null;
    final C0691b[] f2275e;
    private final float[] f2276f = new float[3];

    static class C06851 implements Comparator<C0687a> {
        C06851() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C0687a) obj2).m1662a() - ((C0687a) obj).m1662a();
        }
    }

    private class C0687a {
        int f2260a;
        final /* synthetic */ C0688a f2261b;
        private int f2262c;
        private int f2263d;
        private int f2264e;
        private int f2265f;
        private int f2266g;
        private int f2267h;
        private int f2268i;
        private int f2269j;

        C0687a(C0688a c0688a, int i, int i2) {
            this.f2261b = c0688a;
            this.f2262c = i;
            this.f2260a = i2;
            m1664c();
        }

        final int m1662a() {
            return (((this.f2265f - this.f2264e) + 1) * ((this.f2267h - this.f2266g) + 1)) * ((this.f2269j - this.f2268i) + 1);
        }

        final boolean m1663b() {
            return (this.f2260a + 1) - this.f2262c > 1;
        }

        final void m1664c() {
            int[] iArr = this.f2261b.f2271a;
            int[] iArr2 = this.f2261b.f2272b;
            int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            int i4 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i5 = i4;
            int i6 = Integer.MIN_VALUE;
            int i7 = i6;
            for (int i8 = this.f2262c; i8 <= this.f2260a; i8++) {
                int i9 = iArr[i8];
                i3 += iArr2[i9];
                int a = C0688a.m1667a(i9);
                int b = C0688a.m1673b(i9);
                i9 = C0688a.m1675c(i9);
                if (a > i2) {
                    i2 = a;
                }
                if (a < i) {
                    i = a;
                }
                if (b > i6) {
                    i6 = b;
                }
                if (b < i4) {
                    i4 = b;
                }
                if (i9 > i7) {
                    i7 = i9;
                }
                if (i9 < i5) {
                    i5 = i9;
                }
            }
            this.f2264e = i;
            this.f2265f = i2;
            this.f2266g = i4;
            this.f2267h = i6;
            this.f2268i = i5;
            this.f2269j = i7;
            this.f2263d = i3;
        }

        final int m1665d() {
            int i = this.f2265f - this.f2264e;
            int i2 = this.f2267h - this.f2266g;
            int i3 = this.f2269j - this.f2268i;
            i = (i < i2 || i < i3) ? (i2 < i || i2 < i3) ? -1 : -2 : -3;
            int[] iArr = this.f2261b.f2271a;
            int[] iArr2 = this.f2261b.f2272b;
            C0688a.m1671a(iArr, i, this.f2262c, this.f2260a);
            Arrays.sort(iArr, this.f2262c, this.f2260a + 1);
            C0688a.m1671a(iArr, i, this.f2262c, this.f2260a);
            i = this.f2263d / 2;
            int i4 = 0;
            for (int i5 = this.f2262c; i5 <= this.f2260a; i5++) {
                i4 += iArr2[iArr[i5]];
                if (i4 >= i) {
                    return Math.min(this.f2260a - 1, i5);
                }
            }
            return this.f2262c;
        }

        final C0693d m1666e() {
            int[] iArr = this.f2261b.f2271a;
            int[] iArr2 = this.f2261b.f2272b;
            int i = 0;
            int i2 = 0;
            int i3 = i2;
            int i4 = i3;
            for (int i5 = this.f2262c; i5 <= this.f2260a; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i += i7;
                i2 += C0688a.m1667a(i6) * i7;
                i3 += C0688a.m1673b(i6) * i7;
                i4 += i7 * C0688a.m1675c(i6);
            }
            float f = (float) i;
            return new C0693d(C0688a.m1668a(Math.round(((float) i2) / f), Math.round(((float) i3) / f), Math.round(((float) i4) / f)), i);
        }
    }

    C0688a(int[] iArr, int i, C0691b[] c0691bArr) {
        int i2;
        int i3;
        this.f2275e = c0691bArr;
        int[] iArr2 = new int[Privacy.DEFAULT];
        this.f2272b = iArr2;
        int i4 = 0;
        for (i2 = 0; i2 < iArr.length; i2++) {
            i3 = iArr[i2];
            i3 = C0688a.m1674b(Color.blue(i3), 8, 5) | ((C0688a.m1674b(Color.red(i3), 8, 5) << 10) | (C0688a.m1674b(Color.green(i3), 8, 5) << 5));
            iArr[i2] = i3;
            iArr2[i3] = iArr2[i3] + 1;
        }
        int i5 = 0;
        i2 = i5;
        while (i5 < Privacy.DEFAULT) {
            if (iArr2[i5] > 0) {
                C0433a.m907a(C0688a.m1676d(i5), this.f2276f);
                if (m1672a(this.f2276f)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i2++;
            }
            i5++;
        }
        iArr = new int[i2];
        this.f2271a = iArr;
        i3 = 0;
        int i6 = i3;
        while (i3 < Privacy.DEFAULT) {
            if (iArr2[i3] > 0) {
                int i7 = i6 + 1;
                iArr[i6] = i3;
                i6 = i7;
            }
            i3++;
        }
        if (i2 <= i) {
            this.f2273c = new ArrayList();
            i = iArr.length;
            while (i4 < i) {
                int i8 = iArr[i4];
                this.f2273c.add(new C0693d(C0688a.m1676d(i8), iArr2[i8]));
                i4++;
            }
            return;
        }
        Collection priorityQueue = new PriorityQueue(i, f2270g);
        priorityQueue.offer(new C0687a(this, 0, this.f2271a.length - 1));
        C0688a.m1670a(priorityQueue, i);
        this.f2273c = m1669a(priorityQueue);
    }

    static int m1667a(int i) {
        return (i >> 10) & 31;
    }

    static int m1668a(int i, int i2, int i3) {
        return Color.rgb(C0688a.m1674b(i, 5, 8), C0688a.m1674b(i2, 5, 8), C0688a.m1674b(i3, 5, 8));
    }

    private List<C0693d> m1669a(Collection<C0687a> collection) {
        List arrayList = new ArrayList(collection.size());
        for (C0687a e : collection) {
            C0693d e2 = e.m1666e();
            if (!m1672a(e2.m1683a())) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    private static void m1670a(PriorityQueue<C0687a> priorityQueue, int i) {
        while (priorityQueue.size() < i) {
            C0687a c0687a = (C0687a) priorityQueue.poll();
            if (c0687a != null && c0687a.m1663b()) {
                if (c0687a.m1663b()) {
                    int d = c0687a.m1665d();
                    C0687a c0687a2 = new C0687a(c0687a.f2261b, d + 1, c0687a.f2260a);
                    c0687a.f2260a = d;
                    c0687a.m1664c();
                    priorityQueue.offer(c0687a2);
                    priorityQueue.offer(c0687a);
                } else {
                    throw new IllegalStateException("Can not split a box with only 1 color");
                }
            }
            return;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m1671a(int[] r2, int r3, int r4, int r5) {
        /*
        switch(r3) {
            case -3: goto L_0x0036;
            case -2: goto L_0x001d;
            case -1: goto L_0x0004;
            default: goto L_0x0003;
        };
    L_0x0003:
        return;
    L_0x0004:
        if (r4 > r5) goto L_0x0036;
    L_0x0006:
        r3 = r2[r4];
        r0 = r3 & 31;
        r0 = r0 << 10;
        r1 = r3 >> 5;
        r1 = r1 & 31;
        r1 = r1 << 5;
        r0 = r0 | r1;
        r3 = r3 >> 10;
        r3 = r3 & 31;
        r3 = r3 | r0;
        r2[r4] = r3;
        r4 = r4 + 1;
        goto L_0x0004;
    L_0x001d:
        if (r4 > r5) goto L_0x0036;
    L_0x001f:
        r3 = r2[r4];
        r0 = r3 >> 5;
        r0 = r0 & 31;
        r0 = r0 << 10;
        r1 = r3 >> 10;
        r1 = r1 & 31;
        r1 = r1 << 5;
        r0 = r0 | r1;
        r3 = r3 & 31;
        r3 = r3 | r0;
        r2[r4] = r3;
        r4 = r4 + 1;
        goto L_0x001d;
    L_0x0036:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.d.a.a(int[], int, int, int):void");
    }

    private boolean m1672a(float[] fArr) {
        if (this.f2275e != null && this.f2275e.length > 0) {
            for (C0691b a : this.f2275e) {
                if (!a.mo511a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    static int m1673b(int i) {
        return (i >> 5) & 31;
    }

    private static int m1674b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    static int m1675c(int i) {
        return i & 31;
    }

    private static int m1676d(int i) {
        return C0688a.m1668a((i >> 10) & 31, (i >> 5) & 31, i & 31);
    }
}
