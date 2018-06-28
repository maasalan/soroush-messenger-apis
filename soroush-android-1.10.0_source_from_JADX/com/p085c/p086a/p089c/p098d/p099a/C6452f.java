package com.p085c.p086a.p089c.p098d.p099a;

import android.content.Context;
import android.graphics.Bitmap;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p109i.C1273i;

public abstract class C6452f implements C5255m<Bitmap> {
    protected abstract Bitmap mo3317a(C1106e c1106e, Bitmap bitmap, int i, int i2);

    public final C1159s<Bitmap> mo2695a(Context context, C1159s<Bitmap> c1159s, int i, int i2) {
        if (C1273i.m3022a(i, i2)) {
            C1106e c1106e = C1212c.m2871a(context).f3830a;
            Bitmap bitmap = (Bitmap) c1159s.mo1180b();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = mo3317a(c1106e, bitmap, i, i2);
            return bitmap.equals(a) ? c1159s : C5217e.m10772a(a, c1106e);
        } else {
            StringBuilder stringBuilder = new StringBuilder("Cannot apply transformation on width: ");
            stringBuilder.append(i);
            stringBuilder.append(" or height: ");
            stringBuilder.append(i2);
            stringBuilder.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
