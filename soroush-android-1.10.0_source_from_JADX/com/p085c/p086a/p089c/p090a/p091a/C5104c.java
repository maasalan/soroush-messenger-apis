package com.p085c.p086a.p089c.p090a.p091a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.util.Log;
import com.p085c.p086a.C1212c;
import com.p085c.p086a.C1251g;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.p090a.C1096b;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p090a.C1100e;
import java.io.InputStream;

public final class C5104c implements C1096b<InputStream> {
    private final Uri f14276a;
    private final C1094e f14277b;
    private InputStream f14278c;

    static class C5102a implements C1093d {
        private static final String[] f14272b = new String[]{"_data"};
        private final ContentResolver f14273a;

        public C5102a(ContentResolver contentResolver) {
            this.f14273a = contentResolver;
        }

        public final Cursor mo1107a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f14273a.query(Thumbnails.EXTERNAL_CONTENT_URI, f14272b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    static class C5103b implements C1093d {
        private static final String[] f14274b = new String[]{"_data"};
        private final ContentResolver f14275a;

        public C5103b(ContentResolver contentResolver) {
            this.f14275a = contentResolver;
        }

        public final Cursor mo1107a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f14275a.query(Video.Thumbnails.EXTERNAL_CONTENT_URI, f14274b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    private C5104c(Uri uri, C1094e c1094e) {
        this.f14276a = uri;
        this.f14277b = c1094e;
    }

    public static C5104c m10453a(Context context, Uri uri, C1093d c1093d) {
        return new C5104c(uri, new C1094e(C1212c.m2871a(context).f3833d.m2976a(), c1093d, C1212c.m2871a(context).f3834e, context.getContentResolver()));
    }

    public final void mo1108a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f14278c;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r1.f14278c;	 Catch:{ IOException -> 0x0009 }
        r0.close();	 Catch:{ IOException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.a.a.c.a():void");
    }

    public final void mo1109a(C1251g c1251g, C1095a<? super InputStream> c1095a) {
        try {
            InputStream b = this.f14277b.m2660b(this.f14276a);
            int a = b != null ? this.f14277b.m2659a(this.f14276a) : -1;
            if (a != -1) {
                b = new C1100e(b, a);
            }
            this.f14278c = b;
            c1095a.mo1141a(this.f14278c);
        } catch (Exception e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            c1095a.mo1140a(e);
        }
    }

    public final void mo1110b() {
    }

    public final C1102a mo1111c() {
        return C1102a.LOCAL;
    }

    public final Class<InputStream> mo1112d() {
        return InputStream.class;
    }
}
