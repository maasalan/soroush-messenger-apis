package mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import java.lang.ref.WeakReference;

class C4028b extends DynamicDrawableSpan {
    private final Context f11567a;
    private final int f11568b;
    private final int f11569c;
    private final int f11570d;
    private int f11571e;
    private int f11572f;
    private int f11573g;
    private Drawable f11574h;
    private WeakReference<Drawable> f11575i;

    public C4028b(Context context, int i, int i2, int i3, int i4) {
        super(i3);
        this.f11567a = context;
        this.f11568b = i;
        this.f11569c = i2;
        this.f11571e = i2;
        this.f11572f = i2;
        this.f11570d = i4;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f11575i == null || this.f11575i.get() == null) {
            this.f11575i = new WeakReference(getDrawable());
        }
        Drawable drawable = (Drawable) this.f11575i.get();
        canvas.save();
        i = i5 - drawable.getBounds().bottom;
        if (this.mVerticalAlignment == 1) {
            i = ((i3 + ((i5 - i3) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2)) - this.f11573g;
        }
        canvas.translate(f, (float) i);
        drawable.draw(canvas);
        canvas.restore();
    }

    public android.graphics.drawable.Drawable getDrawable() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r6.f11574h;
        if (r0 != 0) goto L_0x003c;
    L_0x0004:
        r0 = r6.f11567a;	 Catch:{ Exception -> 0x003c }
        r1 = r6.f11568b;	 Catch:{ Exception -> 0x003c }
        r0 = android.support.v4.p029a.C0346c.m682a(r0, r1);	 Catch:{ Exception -> 0x003c }
        r6.f11574h = r0;	 Catch:{ Exception -> 0x003c }
        r0 = r6.f11569c;	 Catch:{ Exception -> 0x003c }
        r6.f11571e = r0;	 Catch:{ Exception -> 0x003c }
        r0 = r6.f11571e;	 Catch:{ Exception -> 0x003c }
        r1 = r6.f11574h;	 Catch:{ Exception -> 0x003c }
        r1 = r1.getIntrinsicWidth();	 Catch:{ Exception -> 0x003c }
        r0 = r0 * r1;	 Catch:{ Exception -> 0x003c }
        r1 = r6.f11574h;	 Catch:{ Exception -> 0x003c }
        r1 = r1.getIntrinsicHeight();	 Catch:{ Exception -> 0x003c }
        r0 = r0 / r1;	 Catch:{ Exception -> 0x003c }
        r6.f11572f = r0;	 Catch:{ Exception -> 0x003c }
        r0 = r6.f11570d;	 Catch:{ Exception -> 0x003c }
        r1 = r6.f11571e;	 Catch:{ Exception -> 0x003c }
        r0 = r0 - r1;	 Catch:{ Exception -> 0x003c }
        r0 = r0 / 2;	 Catch:{ Exception -> 0x003c }
        r6.f11573g = r0;	 Catch:{ Exception -> 0x003c }
        r0 = r6.f11574h;	 Catch:{ Exception -> 0x003c }
        r1 = 0;	 Catch:{ Exception -> 0x003c }
        r2 = r6.f11573g;	 Catch:{ Exception -> 0x003c }
        r3 = r6.f11572f;	 Catch:{ Exception -> 0x003c }
        r4 = r6.f11573g;	 Catch:{ Exception -> 0x003c }
        r5 = r6.f11571e;	 Catch:{ Exception -> 0x003c }
        r4 = r4 + r5;	 Catch:{ Exception -> 0x003c }
        r0.setBounds(r1, r2, r3, r4);	 Catch:{ Exception -> 0x003c }
    L_0x003c:
        r0 = r6.f11574h;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.emojisticker.emoji.emojicon.b.getDrawable():android.graphics.drawable.Drawable");
    }
}
