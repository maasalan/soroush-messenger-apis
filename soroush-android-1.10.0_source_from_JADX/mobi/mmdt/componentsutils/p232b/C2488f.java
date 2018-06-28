package mobi.mmdt.componentsutils.p232b;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;

public final class C2488f {
    public static String m6752a(Context context, Uri uri) {
        Uri uri2 = null;
        if (VERSION.SDK_INT < 19 || !DocumentsContract.isDocumentUri(context, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return "com.google.android.apps.photos.content".equals(uri.getAuthority()) ? uri.getLastPathSegment() : C2488f.m6753a(context, uri, null, null);
            } else {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
        } else if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            if ("primary".equalsIgnoreCase(split[0])) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Environment.getExternalStorageDirectory());
                stringBuilder.append("/");
                stringBuilder.append(split[1]);
                return stringBuilder.toString();
            }
        } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            return C2488f.m6753a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
        } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            Object obj = DocumentsContract.getDocumentId(uri).split(":")[0];
            if ("image".equals(obj)) {
                uri2 = Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(obj)) {
                uri2 = Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(obj)) {
                uri2 = Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return C2488f.m6753a(context, uri2, "_id=?", new String[]{r6[1]});
        }
        return null;
    }

    private static java.lang.String m6753a(android.content.Context r7, android.net.Uri r8, java.lang.String r9, java.lang.String[] r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = 1;
        r3 = new java.lang.String[r0];
        r0 = "_data";
        r1 = 0;
        r3[r1] = r0;
        r0 = 0;
        r1 = r7.getContentResolver();	 Catch:{ Exception -> 0x0028 }
        r6 = 0;	 Catch:{ Exception -> 0x0028 }
        r2 = r8;	 Catch:{ Exception -> 0x0028 }
        r4 = r9;	 Catch:{ Exception -> 0x0028 }
        r5 = r10;	 Catch:{ Exception -> 0x0028 }
        r7 = r1.query(r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x0028 }
        if (r7 == 0) goto L_0x002e;
    L_0x0017:
        r8 = r7.moveToFirst();	 Catch:{ Exception -> 0x0029 }
        if (r8 == 0) goto L_0x002e;	 Catch:{ Exception -> 0x0029 }
    L_0x001d:
        r8 = "_data";	 Catch:{ Exception -> 0x0029 }
        r8 = r7.getColumnIndexOrThrow(r8);	 Catch:{ Exception -> 0x0029 }
        r8 = r7.getString(r8);	 Catch:{ Exception -> 0x0029 }
        return r8;
    L_0x0028:
        r7 = r0;
    L_0x0029:
        if (r7 == 0) goto L_0x002e;
    L_0x002b:
        r7.close();
    L_0x002e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.f.a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
