package com.p085c.p086a.p089c.p098d.p099a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.p085c.p086a.p089c.C1182c;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.C5254l;
import com.p085c.p086a.p089c.p092b.C1159s;
import com.p085c.p086a.p089c.p092b.p093a.C1106e;
import java.io.File;

public final class C6449b implements C5254l<BitmapDrawable> {
    private final C1106e f17606a;
    private final C5254l<Bitmap> f17607b;

    public C6449b(C1106e c1106e, C5254l<Bitmap> c5254l) {
        this.f17606a = c1106e;
        this.f17607b = c5254l;
    }

    public final C1182c mo2694a(C5253j c5253j) {
        return this.f17607b.mo2694a(c5253j);
    }

    public final /* synthetic */ boolean mo1189a(Object obj, File file, C5253j c5253j) {
        return this.f17607b.mo1189a(new C5217e(((BitmapDrawable) ((C1159s) obj).mo1180b()).getBitmap(), this.f17606a), file, c5253j);
    }
}
