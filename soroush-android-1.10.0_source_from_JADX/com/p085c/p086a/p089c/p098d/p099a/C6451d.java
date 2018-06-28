package com.p085c.p086a.p089c.p098d.p099a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.p085c.p086a.p089c.C1182c;
import com.p085c.p086a.p089c.C1210i;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.C5254l;

public final class C6451d implements C5254l<Bitmap> {
    public static final C1210i<Integer> f17609a = C1210i.m2867a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));
    public static final C1210i<CompressFormat> f17610b = C1210i.m2866a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    private static boolean m15369a(com.p085c.p086a.p089c.p092b.C1159s<android.graphics.Bitmap> r7, java.io.File r8, com.p085c.p086a.p089c.C5253j r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = r7.mo1180b();
        r7 = (android.graphics.Bitmap) r7;
        r0 = f17610b;
        r0 = r9.m10873a(r0);
        r0 = (android.graphics.Bitmap.CompressFormat) r0;
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        goto L_0x001c;
    L_0x0011:
        r0 = r7.hasAlpha();
        if (r0 == 0) goto L_0x001a;
    L_0x0017:
        r0 = android.graphics.Bitmap.CompressFormat.PNG;
        goto L_0x001c;
    L_0x001a:
        r0 = android.graphics.Bitmap.CompressFormat.JPEG;
    L_0x001c:
        r1 = new java.lang.StringBuilder;
        r2 = "encode: [";
        r1.<init>(r2);
        r2 = r7.getWidth();
        r1.append(r2);
        r2 = "x";
        r1.append(r2);
        r2 = r7.getHeight();
        r1.append(r2);
        r2 = "] ";
        r1.append(r2);
        r1.append(r0);
        r1 = r1.toString();
        android.support.v4.os.C0513f.m1121a(r1);
        r1 = com.p085c.p086a.p109i.C1267d.m2998a();	 Catch:{ all -> 0x00dd }
        r3 = f17609a;	 Catch:{ all -> 0x00dd }
        r3 = r9.m10873a(r3);	 Catch:{ all -> 0x00dd }
        r3 = (java.lang.Integer) r3;	 Catch:{ all -> 0x00dd }
        r3 = r3.intValue();	 Catch:{ all -> 0x00dd }
        r4 = 0;
        r5 = 0;
        r6 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x006f }
        r6.<init>(r8);	 Catch:{ IOException -> 0x006f }
        r7.compress(r0, r3, r6);	 Catch:{ IOException -> 0x006a, all -> 0x0067 }
        r6.close();	 Catch:{ IOException -> 0x006a, all -> 0x0067 }
        r4 = 1;
        r6.close();	 Catch:{ IOException -> 0x0085 }
        goto L_0x0085;
    L_0x0067:
        r7 = move-exception;
        r5 = r6;
        goto L_0x00d7;
    L_0x006a:
        r8 = move-exception;
        r5 = r6;
        goto L_0x0070;
    L_0x006d:
        r7 = move-exception;
        goto L_0x00d7;
    L_0x006f:
        r8 = move-exception;
    L_0x0070:
        r3 = "BitmapEncoder";	 Catch:{ all -> 0x006d }
        r6 = 3;	 Catch:{ all -> 0x006d }
        r3 = android.util.Log.isLoggable(r3, r6);	 Catch:{ all -> 0x006d }
        if (r3 == 0) goto L_0x0080;	 Catch:{ all -> 0x006d }
    L_0x0079:
        r3 = "BitmapEncoder";	 Catch:{ all -> 0x006d }
        r6 = "Failed to encode Bitmap";	 Catch:{ all -> 0x006d }
        android.util.Log.d(r3, r6, r8);	 Catch:{ all -> 0x006d }
    L_0x0080:
        if (r5 == 0) goto L_0x0085;
    L_0x0082:
        r5.close();	 Catch:{ IOException -> 0x0085 }
    L_0x0085:
        r8 = "BitmapEncoder";	 Catch:{ all -> 0x00dd }
        r3 = 2;	 Catch:{ all -> 0x00dd }
        r8 = android.util.Log.isLoggable(r8, r3);	 Catch:{ all -> 0x00dd }
        if (r8 == 0) goto L_0x00d3;	 Catch:{ all -> 0x00dd }
    L_0x008e:
        r8 = "BitmapEncoder";	 Catch:{ all -> 0x00dd }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00dd }
        r5 = "Compressed with type: ";	 Catch:{ all -> 0x00dd }
        r3.<init>(r5);	 Catch:{ all -> 0x00dd }
        r3.append(r0);	 Catch:{ all -> 0x00dd }
        r0 = " of size ";	 Catch:{ all -> 0x00dd }
        r3.append(r0);	 Catch:{ all -> 0x00dd }
        r0 = com.p085c.p086a.p109i.C1273i.m3017a(r7);	 Catch:{ all -> 0x00dd }
        r3.append(r0);	 Catch:{ all -> 0x00dd }
        r0 = " in ";	 Catch:{ all -> 0x00dd }
        r3.append(r0);	 Catch:{ all -> 0x00dd }
        r0 = com.p085c.p086a.p109i.C1267d.m2997a(r1);	 Catch:{ all -> 0x00dd }
        r3.append(r0);	 Catch:{ all -> 0x00dd }
        r0 = ", options format: ";	 Catch:{ all -> 0x00dd }
        r3.append(r0);	 Catch:{ all -> 0x00dd }
        r0 = f17610b;	 Catch:{ all -> 0x00dd }
        r9 = r9.m10873a(r0);	 Catch:{ all -> 0x00dd }
        r3.append(r9);	 Catch:{ all -> 0x00dd }
        r9 = ", hasAlpha: ";	 Catch:{ all -> 0x00dd }
        r3.append(r9);	 Catch:{ all -> 0x00dd }
        r7 = r7.hasAlpha();	 Catch:{ all -> 0x00dd }
        r3.append(r7);	 Catch:{ all -> 0x00dd }
        r7 = r3.toString();	 Catch:{ all -> 0x00dd }
        android.util.Log.v(r8, r7);	 Catch:{ all -> 0x00dd }
    L_0x00d3:
        android.support.v4.os.C0513f.m1120a();
        return r4;
    L_0x00d7:
        if (r5 == 0) goto L_0x00dc;
    L_0x00d9:
        r5.close();	 Catch:{ IOException -> 0x00dc }
    L_0x00dc:
        throw r7;	 Catch:{ all -> 0x00dd }
    L_0x00dd:
        r7 = move-exception;
        android.support.v4.os.C0513f.m1120a();
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.d.a.d.a(com.c.a.c.b.s, java.io.File, com.c.a.c.j):boolean");
    }

    public final C1182c mo2694a(C5253j c5253j) {
        return C1182c.TRANSFORMED;
    }
}
