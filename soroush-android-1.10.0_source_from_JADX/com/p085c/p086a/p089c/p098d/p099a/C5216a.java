package com.p085c.p086a.p089c.p098d.p099a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.p085c.p086a.p089c.C1211k;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import com.p085c.p086a.p109i.C1271h;

public final class C5216a<DataType> implements C1211k<DataType, BitmapDrawable> {
    private final C1211k<DataType, Bitmap> f14541a;
    private final Resources f14542b;
    private final C1106e f14543c;

    public C5216a(Resources resources, C1106e c1106e, C1211k<DataType, Bitmap> c1211k) {
        this.f14542b = (Resources) C1271h.m3012a((Object) resources, "Argument must not be null");
        this.f14543c = (C1106e) C1271h.m3012a((Object) c1106e, "Argument must not be null");
        this.f14541a = (C1211k) C1271h.m3012a((Object) c1211k, "Argument must not be null");
    }

    public final C1159s<BitmapDrawable> mo1199a(DataType dataType, int i, int i2, C5253j c5253j) {
        C1159s a = this.f14541a.mo1199a(dataType, i, i2, c5253j);
        return a == null ? null : C5229o.m10812a(this.f14542b, this.f14543c, (Bitmap) a.mo1180b());
    }

    public final boolean mo1200a(DataType dataType, C5253j c5253j) {
        return this.f14541a.mo1200a(dataType, c5253j);
    }
}
