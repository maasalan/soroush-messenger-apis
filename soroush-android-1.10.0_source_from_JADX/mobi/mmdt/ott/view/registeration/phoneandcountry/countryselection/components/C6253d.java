package mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import mobi.mmdt.ott.C2540d.C2534a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4337e.C4336a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b;
import org.msgpack.util.TemplatePrecompiler;

public final class C6253d extends C4339h {
    public static int f17006a = 2;
    private final Context f17007c;
    private int f17008d = 0;
    private int f17009e = 0;
    private int f17010f;
    private boolean f17011g;

    public static class C6947a extends C6250b {
        int f19834a;
        int f19835b;

        private C6947a() {
        }

        public C6947a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2534a.superslim_GridSLM);
            this.f19834a = obtainStyledAttributes.getInt(1, -1);
            this.f19835b = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
        }

        @Deprecated
        private C6947a(LayoutParams layoutParams) {
            super(layoutParams);
            m17985c(layoutParams);
        }

        @Deprecated
        private C6947a(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            m17985c(marginLayoutParams);
        }

        public static C6947a m17984a(LayoutParams layoutParams) {
            if (layoutParams != null) {
                return layoutParams instanceof MarginLayoutParams ? new C6947a((MarginLayoutParams) layoutParams) : new C6947a(layoutParams);
            } else {
                Log.w("SuperSLiM", "Null value passed in call to GridSLM.LayoutParams.from().");
                return new C6947a();
            }
        }

        private void m17985c(LayoutParams layoutParams) {
            int i;
            if (layoutParams instanceof C6947a) {
                C6947a c6947a = (C6947a) layoutParams;
                this.f19834a = c6947a.f19834a;
                i = c6947a.f19835b;
            } else {
                i = -1;
                this.f19834a = -1;
            }
            this.f19835b = i;
        }
    }

    public C6253d(LayoutManager layoutManager, Context context) {
        super(layoutManager);
        this.f17007c = context;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m14560a(int r19, int r20, int r21, boolean r22, mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4338g r23, mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4337e r24) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r21;
        r2 = r23;
        r3 = r24;
        r4 = r0.f17009e;
        r4 = new mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4337e.C4336a[r4];
        r5 = 0;
        r6 = r5;
        r7 = r6;
    L_0x000f:
        r8 = r0.f17009e;
        if (r6 >= r8) goto L_0x004d;
    L_0x0013:
        r8 = r20 + r6;
        r9 = r3.f12174b;
        r9 = r9.getItemCount();
        if (r8 >= r9) goto L_0x004d;
    L_0x001d:
        r9 = r3.m8095c(r8);
        r10 = r9.m8091a();
        r10 = r10.m14533a();
        r11 = r2.f12177a;
        if (r10 == r11) goto L_0x0033;
    L_0x002d:
        r6 = r9.f12171a;
        r3.m8093a(r8, r6);
        goto L_0x004d;
    L_0x0033:
        if (r22 == 0) goto L_0x0039;
    L_0x0035:
        r0.m14561a(r9, r2);
        goto L_0x003c;
    L_0x0039:
        r3.m8092a(r8);
    L_0x003c:
        r8 = r0.b;
        r11 = r9.f12171a;
        r8 = r8.getDecoratedMeasuredHeight(r11);
        r7 = java.lang.Math.max(r7, r8);
        r4[r6] = r9;
        r6 = r6 + 1;
        goto L_0x000f;
    L_0x004d:
        r6 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12155a;
        r8 = 1;
        if (r1 != r6) goto L_0x0054;
    L_0x0052:
        r6 = r8;
        goto L_0x0055;
    L_0x0054:
        r6 = r5;
    L_0x0055:
        if (r6 == 0) goto L_0x005a;
    L_0x0057:
        r9 = r19 - r7;
        goto L_0x005c;
    L_0x005a:
        r9 = r19;
    L_0x005c:
        r10 = r0.f17009e;
        if (r5 >= r10) goto L_0x00d5;
    L_0x0060:
        if (r6 == 0) goto L_0x0069;
    L_0x0062:
        r10 = r0.f17009e;
        r10 = r10 - r5;
        r10 = r10 - r8;
        r16 = r10;
        goto L_0x006b;
    L_0x0069:
        r16 = r5;
    L_0x006b:
        r10 = r3.f12176d;
        if (r10 == 0) goto L_0x0078;
    L_0x006f:
        if (r6 == 0) goto L_0x0076;
    L_0x0071:
        r10 = r0.f17009e;
        r10 = r10 - r5;
        r10 = r10 - r8;
        goto L_0x007b;
    L_0x0076:
        r10 = r5;
        goto L_0x007b;
    L_0x0078:
        if (r6 == 0) goto L_0x0071;
    L_0x007a:
        goto L_0x0076;
    L_0x007b:
        r11 = r4[r16];
        if (r11 == 0) goto L_0x00d1;
    L_0x007f:
        r11 = r4[r16];
        r12 = r11.m8091a();
        r12 = r12.height;
        r13 = -1;
        if (r12 == r13) goto L_0x0093;
    L_0x008a:
        r12 = r0.b;
        r13 = r11.f12171a;
        r12 = r12.getDecoratedMeasuredHeight(r13);
        goto L_0x0094;
    L_0x0093:
        r12 = r7;
    L_0x0094:
        r13 = r0.f17009e;
        r13 = r13 - r8;
        if (r10 != r13) goto L_0x00a2;
    L_0x0099:
        r13 = r0.b;
        r14 = r11.f12171a;
        r13 = r13.getDecoratedMeasuredWidth(r14);
        goto L_0x00b0;
    L_0x00a2:
        r13 = r0.f17010f;
        r14 = r0.b;
        r8 = r11.f12171a;
        r8 = r14.getDecoratedMeasuredWidth(r8);
        r13 = java.lang.Math.min(r13, r8);
    L_0x00b0:
        r15 = r9 + r12;
        r8 = r3.f12176d;
        if (r8 == 0) goto L_0x00b9;
    L_0x00b6:
        r8 = r2.f12185i;
        goto L_0x00bb;
    L_0x00b9:
        r8 = r2.f12184h;
    L_0x00bb:
        r12 = r0.f17010f;
        r10 = r10 * r12;
        r12 = r8 + r10;
        r14 = r12 + r13;
        r10 = r0.b;
        r11 = r11.f12171a;
        r13 = r9;
        r10.layoutDecorated(r11, r12, r13, r14, r15);
        r8 = r4[r16];
        r10 = r16 + r20;
        r0.m8104a(r8, r10, r1, r3);
    L_0x00d1:
        r5 = r5 + 1;
        r8 = 1;
        goto L_0x005c;
    L_0x00d5:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.d.a(int, int, int, boolean, mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.g, mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.e):int");
    }

    private void m14561a(C4336a c4336a, C4338g c4338g) {
        this.b.measureChildWithMargins(c4336a.f12171a, (c4338g.f12186j + c4338g.f12187k) + ((this.f17009e - 1) * this.f17010f), 0);
    }

    public final int mo2417a(int i, int i2, int i3) {
        int width = this.b.getWidth();
        int i4 = 0;
        int i5 = 0;
        while (i2 >= 0) {
            View childAt = this.b.getChildAt(i2);
            C6250b c6250b = (C6250b) childAt.getLayoutParams();
            if (c6250b.m14533a() != i) {
                break;
            }
            if (!c6250b.f16983c) {
                if (childAt.getLeft() >= width) {
                    break;
                }
                width = childAt.getLeft();
                i5 = 1;
                i4 = Math.max(i4, this.b.getDecoratedBottom(childAt));
            }
            i2--;
        }
        return i5 != 0 ? i4 : i3;
    }

    public final int mo2418a(int i, int i2, int i3, C4338g c4338g, C4337e c4337e) {
        C6253d c6253d = this;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        C4338g c4338g2 = c4338g;
        C4337e c4337e2 = c4337e;
        if (i5 >= i4) {
            return i5;
        }
        int itemCount = c4337e2.f12174b.getItemCount();
        if (i6 >= itemCount) {
            return i5;
        }
        C4336a c = c4337e2.m8095c(i6);
        c4337e2.m8093a(i6, c.f12171a);
        if (c.m8091a().m14533a() != c4338g2.f12177a) {
            return i5;
        }
        int i7 = (i6 - (c4338g2.f12178b ? c4338g2.f12177a + 1 : c4338g2.f12177a)) % c6253d.f17009e;
        int i8 = i5;
        for (i5 = 1; i5 <= i7; i5++) {
            int i9 = 1;
            while (i9 <= c6253d.b.getChildCount()) {
                View childAt = c6253d.b.getChildAt(c6253d.b.getChildCount() - i9);
                if (c6253d.b.getPosition(childAt) != i6 - i5) {
                    if (((C6250b) childAt.getLayoutParams()).m14533a() != c4338g2.f12177a) {
                        break;
                    }
                    i9++;
                } else {
                    i8 = c6253d.b.getDecoratedTop(childAt);
                    c6253d.b.detachAndScrapViewAt(i9, c4337e2.f12173a);
                    break;
                }
            }
        }
        int i10 = i8;
        for (int i11 = i6 - i7; i11 < itemCount && i10 <= i4; i11 += c6253d.f17009e) {
            C4336a c2 = c4337e2.m8095c(i11);
            if (c2.m8091a().m14533a() != c4338g2.f12177a) {
                c4337e2.m8093a(i11, c2.f12171a);
                return i10;
            }
            i10 += m14560a(i10, i11, C4329a.f12156b, true, c4338g2, c4337e2);
        }
        return i10;
    }

    public final int mo2419a(int i, View view, C4338g c4338g, C4337e c4337e) {
        return mo2418a(i, mo2417a(c4338g.f12177a, this.b.getChildCount() - 1, this.b.getDecoratedBottom(view)), this.b.getPosition(view) + 1, c4338g, c4337e);
    }

    public final int mo2420a(int i, C4338g c4338g, C4337e c4337e) {
        int itemCount = c4337e.f12174b.getItemCount();
        int i2 = c4338g.f12177a + 1;
        int i3 = 0;
        while (i3 < c4338g.f12183g && i2 < i) {
            int i4 = 0;
            int i5 = i4;
            while (i4 < this.f17009e) {
                int i6 = i2 + i4;
                if (i6 >= itemCount) {
                    break;
                }
                C4336a c = c4337e.m8095c(i6);
                m14561a(c, c4338g);
                i5 = Math.max(i5, this.b.getDecoratedMeasuredHeight(c.f12171a));
                c4337e.m8093a(i6, c.f12171a);
                i4++;
            }
            i3 += i5;
            i2 += this.f17009e;
        }
        return i3 == c4338g.f12183g ? 0 : i3 > c4338g.f12183g ? 1 : -i3;
    }

    public final C6250b mo2421a(Context context, AttributeSet attributeSet) {
        return new C6947a(context, attributeSet);
    }

    public final C6250b mo2422a(C6250b c6250b) {
        return C6947a.m17984a(c6250b);
    }

    public final /* synthetic */ C4339h mo2423a(C4338g c4338g) {
        int i;
        super.mo2423a(c4338g);
        if (c4338g.f12188l instanceof C6947a) {
            C6947a c6947a = (C6947a) c4338g.f12188l;
            int i2 = c6947a.f19835b;
            i = c6947a.f19834a;
            if (i2 < 0 && i < 0) {
                i = 1;
            }
            if (i == -1) {
                this.f17008d = i2;
                this.f17011g = false;
            } else {
                this.f17009e = i;
                this.f17008d = 0;
                this.f17011g = true;
            }
        }
        i = (this.b.getWidth() - c4338g.f12185i) - c4338g.f12184h;
        if (!this.f17011g) {
            if (this.f17008d <= 0) {
                this.f17008d = (int) TypedValue.applyDimension(1, 48.0f, this.f17007c.getResources().getDisplayMetrics());
            }
            this.f17009e = i / Math.abs(this.f17008d);
        }
        if (this.f17009e <= 0) {
            this.f17009e = 1;
        }
        this.f17010f = i / this.f17009e;
        if (this.f17010f == 0) {
            StringBuilder stringBuilder = new StringBuilder("Too many columns (");
            stringBuilder.append(this.f17009e);
            stringBuilder.append(") for available width");
            stringBuilder.append(i);
            stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
            Log.e("GridSection", stringBuilder.toString());
        }
        return this;
    }

    public final int mo2424b(int i, int i2, int i3, C4338g c4338g, C4337e c4337e) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        C6253d c6253d = this;
        int i10 = i3;
        C4338g c4338g2 = c4338g;
        C4337e c4337e2 = c4337e;
        int i11 = c4338g2.f12178b ? c4338g2.f12177a + 1 : c4338g2.f12177a;
        int i12 = 0;
        while (i12 < c6253d.b.getChildCount()) {
            C6250b c6250b = (C6250b) c6253d.b.getChildAt(0).getLayoutParams();
            if (c6250b.m14533a() != c4338g2.f12177a) {
                i4 = 1;
                break;
            } else if (!c6250b.f16983c) {
                break;
            } else {
                i12++;
            }
        }
        i4 = 0;
        i11 = (i10 - i11) % c6253d.f17009e;
        for (i12 = 1; i12 < c6253d.f17009e - i11; i12++) {
            i5 = 0;
            while (i5 < c6253d.b.getChildCount()) {
                View childAt = c6253d.b.getChildAt(i5);
                if (((C6250b) childAt.getLayoutParams()).m14533a() != c4338g2.f12177a) {
                    break;
                } else if (c6253d.b.getPosition(childAt) == i10 + i12) {
                    c6253d.b.detachAndScrapViewAt(i5, c4337e2.f12173a);
                    break;
                } else {
                    i5++;
                }
            }
        }
        i11 = i10 - i11;
        i12 = -1;
        if (i4 != 0) {
            int i13 = -1;
            i5 = 0;
            i12 = i11;
            while (i12 >= 0) {
                C4336a c = c4337e2.m8095c(i12);
                c4337e2.m8093a(i12, c.f12171a);
                if (c.m8091a().m14533a() != c4338g2.f12177a) {
                    break;
                }
                i13 = 0;
                int i14 = i13;
                while (i13 < c6253d.f17009e) {
                    int i15 = i12 + i13;
                    if (i15 > i10) {
                        break;
                    }
                    C4336a c2 = c4337e2.m8095c(i15);
                    c4337e2.m8093a(i15, c2.f12171a);
                    C6250b a = c2.m8091a();
                    if (a.m14533a() != c4338g2.f12177a) {
                        break;
                    }
                    if (!a.f16983c) {
                        m14561a(c2, c4338g2);
                        i14 = Math.max(i14, c6253d.b.getDecoratedMeasuredHeight(c2.f12171a));
                    }
                    i13++;
                }
                i5 += i14;
                if (i5 >= c4338g2.f12179c) {
                    break;
                }
                i13 = i12;
                i12 -= c6253d.f17009e;
            }
            i12 = i13;
            if (i5 < c4338g2.f12179c) {
                i10 = i5 - c4338g2.f12179c;
                i5 = i2 + i10;
                i6 = i10;
                i7 = i12;
                i8 = i5;
                for (i9 = i11; i9 >= 0 && i8 - r14 > i; i9 -= c6253d.f17009e) {
                    C4336a c3 = c4337e2.m8095c(i9);
                    c4337e2.m8093a(i9, c3.f12171a);
                    C6250b a2 = c3.m8091a();
                    if (a2.f16983c || a2.m14533a() != c4338g2.f12177a) {
                        break;
                    }
                    if (i4 != 0) {
                        if (i9 < i7) {
                            z = false;
                            i8 -= m14560a(i8, i9, C4329a.f12155a, z, c4338g2, c4337e2);
                        }
                    }
                    z = true;
                    i8 -= m14560a(i8, i9, C4329a.f12155a, z, c4338g2, c4337e2);
                }
                return i8;
            }
        }
        i5 = i2;
        i7 = i12;
        i6 = 0;
        i8 = i5;
        for (i9 = i11; i9 >= 0; i9 -= c6253d.f17009e) {
            C4336a c32 = c4337e2.m8095c(i9);
            c4337e2.m8093a(i9, c32.f12171a);
            C6250b a22 = c32.m8091a();
            if (i4 != 0) {
                if (i9 < i7) {
                    z = false;
                    i8 -= m14560a(i8, i9, C4329a.f12155a, z, c4338g2, c4337e2);
                }
            }
            z = true;
            i8 -= m14560a(i8, i9, C4329a.f12155a, z, c4338g2, c4337e2);
        }
        return i8;
    }

    public final int mo2425b(int i, View view, C4338g c4338g, C4337e c4337e) {
        return mo2424b(i, this.b.getDecoratedTop(view), this.b.getPosition(view) - 1, c4338g, c4337e);
    }
}
