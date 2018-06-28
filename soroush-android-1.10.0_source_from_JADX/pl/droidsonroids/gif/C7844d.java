package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import pl.droidsonroids.gif.C7848g.C7847a;

final class C7844d {
    static final List<String> f24932a = Arrays.asList(new String[]{"raw", "drawable", "mipmap"});

    static class C7843a {
        final int f24929a;
        final int f24930b;
        final boolean f24931c;

        C7843a(int i, int i2, boolean z) {
            this.f24929a = i;
            this.f24930b = i2;
            this.f24931c = z;
        }
    }

    static float m22130a(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        i = typedValue.density;
        if (i == 0) {
            i = 160;
        } else if (i == InBandBytestreamManager.MAXIMUM_BLOCK_SIZE) {
            i = 0;
        }
        int i2 = resources.getDisplayMetrics().densityDpi;
        return (i <= 0 || i2 <= 0) ? BallPulseIndicator.SCALE : ((float) i2) / ((float) i);
    }

    private static int m22131a(ImageView imageView, AttributeSet attributeSet, boolean z) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z ? "src" : "background", 0);
        if (attributeResourceValue > 0) {
            return (!f24932a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) || C7844d.m22134a(imageView, z, attributeResourceValue)) ? 0 : attributeResourceValue;
        }
    }

    static C7843a m22132a(ImageView imageView, AttributeSet attributeSet, int i, int i2) {
        if (attributeSet == null || imageView.isInEditMode()) {
            return new C7843a(0, 0, false);
        }
        int a = C7844d.m22131a(imageView, attributeSet, true);
        int a2 = C7844d.m22131a(imageView, attributeSet, false);
        TypedArray obtainStyledAttributes = imageView.getContext().obtainStyledAttributes(attributeSet, C7847a.GifView, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C7847a.GifView_freezesAnimation, false);
        obtainStyledAttributes.recycle();
        return new C7843a(a, a2, z);
    }

    static boolean m22133a(android.widget.ImageView r2, android.net.Uri r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r3 == 0) goto L_0x0014;
    L_0x0002:
        r0 = new pl.droidsonroids.gif.a;	 Catch:{ IOException -> 0x0014 }
        r1 = r2.getContext();	 Catch:{ IOException -> 0x0014 }
        r1 = r1.getContentResolver();	 Catch:{ IOException -> 0x0014 }
        r0.<init>(r1, r3);	 Catch:{ IOException -> 0x0014 }
        r2.setImageDrawable(r0);	 Catch:{ IOException -> 0x0014 }
        r2 = 1;
        return r2;
    L_0x0014:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.d.a(android.widget.ImageView, android.net.Uri):boolean");
    }

    static boolean m22134a(android.widget.ImageView r2, boolean r3, int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r2.getResources();
        if (r0 == 0) goto L_0x0020;
    L_0x0006:
        r1 = new pl.droidsonroids.gif.a;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        r1.<init>(r0, r4);	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        if (r3 == 0) goto L_0x0011;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
    L_0x000d:
        r2.setImageDrawable(r1);	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        goto L_0x001e;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
    L_0x0011:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        r4 = 16;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        if (r3 < r4) goto L_0x001b;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
    L_0x0017:
        r2.setBackground(r1);	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
        goto L_0x001e;	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
    L_0x001b:
        r2.setBackgroundDrawable(r1);	 Catch:{ IOException -> 0x0020, IOException -> 0x0020 }
    L_0x001e:
        r2 = 1;
        return r2;
    L_0x0020:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.d.a(android.widget.ImageView, boolean, int):boolean");
    }
}
