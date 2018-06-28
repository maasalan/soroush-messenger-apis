package mobi.mmdt.componentsutils.p231a;

import android.content.Context;
import mobi.mmdt.componentsutils.C2493b.C2474a;
import mobi.mmdt.componentsutils.p232b.C2491i;

public final class C5761e extends C2463a {
    private static String[] f15865b;
    private int f15866c;
    private int f15867d;
    private int f15868e;

    public C5761e(Context context, int i, int i2, int i3) {
        super(context);
        if (f15865b == null) {
            f15865b = context.getResources().getStringArray(C2474a.persianMonths);
        }
        if (i == 0) {
            throw new C2467f("Year 0 is invalid!");
        }
        this.f15866c = i;
        this.f15868e = 1;
        if (i2 > 0) {
            if (i2 <= 12) {
                m12935a(this.f15868e);
                this.f15867d = i2;
                m12935a(i3);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("month ");
        stringBuilder.append(i2);
        stringBuilder.append(" is out of range!");
        throw new C2466d(stringBuilder.toString());
    }

    private void m12935a(int i) {
        StringBuilder stringBuilder;
        if (i <= 0) {
            stringBuilder = new StringBuilder("day ");
            stringBuilder.append(i);
            stringBuilder.append(" is out of range!");
            throw new C2465c(stringBuilder.toString());
        } else if (this.f15867d <= 6 && i > 31) {
            stringBuilder = new StringBuilder("day ");
            stringBuilder.append(i);
            stringBuilder.append(" is out of range!");
            throw new C2465c(stringBuilder.toString());
        } else if (this.f15867d <= 6 || this.f15867d > 12 || i <= 30) {
            if (this.f15867d == 12 && i > 29) {
                int i2 = this.f15866c % 33;
                Object obj = 1;
                if (!(i2 == 1 || i2 == 5 || i2 == 9 || i2 == 13 || i2 == 17 || i2 == 22 || i2 == 26)) {
                    if (i2 != 30) {
                        obj = null;
                    }
                }
                if (obj == null) {
                    i = 29;
                }
            }
            this.f15868e = i;
        } else {
            stringBuilder = new StringBuilder("day ");
            stringBuilder.append(i);
            stringBuilder.append(" is out of range!");
            throw new C2465c(stringBuilder.toString());
        }
    }

    private String m12936c() {
        return f15865b[this.f15867d - 1];
    }

    public final String m12937a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(C2491i.m6809b(this.f15868e));
        String stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(" ");
        stringBuilder.append(m12936c());
        return stringBuilder.toString();
    }

    public final String m12938b() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(C2491i.m6809b(this.f15868e));
        String stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(" ");
        stringBuilder.append(m12936c());
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(" ,");
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(C2491i.m6809b(this.f15866c));
        return stringBuilder.toString();
    }
}
