package mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components;

import android.view.View;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4337e.C4336a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b;

public final class C6254f extends C4339h {
    public static int f17012a = 1;

    public C6254f(LayoutManager layoutManager) {
        super(layoutManager);
    }

    private int m14571a(C4336a c4336a, int i, int i2, C4338g c4338g, C4337e c4337e) {
        int i3;
        int i4;
        int decoratedMeasuredHeight = this.b.getDecoratedMeasuredHeight(c4336a.f12171a);
        int decoratedMeasuredWidth = this.b.getDecoratedMeasuredWidth(c4336a.f12171a);
        int i5 = c4337e.f12176d ? c4338g.f12185i : c4338g.f12184h;
        int i6 = i5 + decoratedMeasuredWidth;
        if (i2 == C4329a.f12156b) {
            i3 = i;
            i4 = i + decoratedMeasuredHeight;
        } else {
            i4 = i;
            i3 = i - decoratedMeasuredHeight;
        }
        this.b.layoutDecorated(c4336a.f12171a, i5, i3, i6, i4);
        return i2 == C4329a.f12156b ? this.b.getDecoratedBottom(c4336a.f12171a) : this.b.getDecoratedTop(c4336a.f12171a);
    }

    private void m14572a(C4336a c4336a, C4338g c4338g) {
        this.b.measureChildWithMargins(c4336a.f12171a, c4338g.f12187k + c4338g.f12186j, 0);
    }

    public final int mo2418a(int i, int i2, int i3, C4338g c4338g, C4337e c4337e) {
        int itemCount = c4337e.f12174b.getItemCount();
        int i4 = i2;
        while (i3 < itemCount && i4 < i) {
            C4336a c = c4337e.m8095c(i3);
            if (c.m8091a().m14533a() != c4338g.f12177a) {
                c4337e.m8093a(i3, c.f12171a);
                return i4;
            }
            m14572a(c, c4338g);
            i4 = m14571a(c, i4, C4329a.f12156b, c4338g, c4337e);
            m8104a(c, i3, C4329a.f12156b, c4337e);
            i3++;
        }
        return i4;
    }

    public final int mo2419a(int i, View view, C4338g c4338g, C4337e c4337e) {
        return mo2418a(i, this.b.getDecoratedBottom(view), this.b.getPosition(view) + 1, c4338g, c4337e);
    }

    public final int mo2420a(int i, C4338g c4338g, C4337e c4337e) {
        int i2 = c4338g.f12177a + 1;
        int i3 = 0;
        while (i3 < c4338g.f12183g && i2 < i) {
            C4336a c = c4337e.m8095c(i2);
            m14572a(c, c4338g);
            i3 += this.b.getDecoratedMeasuredHeight(c.f12171a);
            c4337e.m8093a(i2, c.f12171a);
            i2++;
        }
        return i3 == c4338g.f12183g ? 0 : i3 > c4338g.f12183g ? 1 : -i3;
    }

    public final int mo2424b(int i, int i2, int i3, C4338g c4338g, C4337e c4337e) {
        int i4 = 0;
        int i5 = 0;
        while (i5 < c4337e.f12174b.getItemCount()) {
            View childAt = this.b.getChildAt(0);
            if (childAt == null) {
                break;
            }
            C6250b c6250b = (C6250b) childAt.getLayoutParams();
            if (c6250b.m14533a() != c4338g.f12177a) {
                i5 = 1;
                break;
            } else if (!c6250b.f16983c) {
                break;
            } else {
                i5++;
            }
        }
        i5 = 0;
        int i6 = -1;
        if (i5 != 0) {
            int i7 = 0;
            int i8 = -1;
            i6 = i3;
            while (i6 >= 0) {
                C4336a c = c4337e.m8095c(i6);
                c4337e.m8093a(i6, c.f12171a);
                C6250b a = c.m8091a();
                if (a.m14533a() != c4338g.f12177a) {
                    break;
                }
                if (!a.f16983c) {
                    m14572a(c, c4338g);
                    i7 += this.b.getDecoratedMeasuredHeight(c.f12171a);
                    if (i7 >= c4338g.f12179c) {
                        break;
                    }
                    i8 = i6;
                }
                i6--;
            }
            i6 = i8;
            if (i7 < c4338g.f12179c) {
                i4 = i7 - c4338g.f12179c;
                i2 += i4;
            }
        }
        int i9 = i2;
        while (i3 >= 0 && i9 - r0 > i) {
            C4336a c2 = c4337e.m8095c(i3);
            C6250b a2 = c2.m8091a();
            if (!a2.f16983c) {
                if (a2.m14533a() == c4338g.f12177a) {
                    if (i5 != 0) {
                        if (i3 >= i6) {
                            c4337e.m8092a(i3);
                            i9 = m14571a(c2, i9, C4329a.f12155a, c4338g, c4337e);
                            m8104a(c2, i3, C4329a.f12155a, c4337e);
                            i3--;
                        }
                    }
                    m14572a(c2, c4338g);
                    i9 = m14571a(c2, i9, C4329a.f12155a, c4338g, c4337e);
                    m8104a(c2, i3, C4329a.f12155a, c4337e);
                    i3--;
                }
            }
            c4337e.m8093a(i3, c2.f12171a);
            return i9;
        }
        return i9;
    }

    public final int mo2425b(int i, View view, C4338g c4338g, C4337e c4337e) {
        return mo2424b(i, this.b.getDecoratedTop(view), this.b.getPosition(view) - 1, c4338g, c4337e);
    }
}
