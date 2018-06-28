package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public abstract class C1754a {
    final C1755b f5335a;
    protected int f5336b;

    protected abstract void mo1562a();

    final void m4371a(Context context) {
        if (this.f5336b != 0) {
            context.getResources().getDrawable(this.f5336b);
        }
        mo1562a();
    }

    final void m4372a(Context context, Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("null reference");
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        mo1562a();
    }
}
