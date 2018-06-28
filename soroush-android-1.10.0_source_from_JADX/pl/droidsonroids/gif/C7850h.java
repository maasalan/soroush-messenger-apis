package pl.droidsonroids.gif;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@TargetApi(9)
class C7850h {
    private C7850h() {
    }

    @TargetApi(21)
    private static ZipEntry m22137a(String str, ZipFile zipFile) {
        if (VERSION.SDK_INT >= 21) {
            for (String a : Build.SUPPORTED_ABIS) {
                ZipEntry a2 = C7850h.m22138a(str, zipFile, a);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return C7850h.m22138a(str, zipFile, Build.CPU_ABI);
    }

    private static ZipEntry m22138a(String str, ZipFile zipFile, String str2) {
        StringBuilder stringBuilder = new StringBuilder("lib/");
        stringBuilder.append(str2);
        stringBuilder.append("/");
        stringBuilder.append(str);
        return zipFile.getEntry(stringBuilder.toString());
    }

    private static java.util.zip.ZipFile m22139a(java.io.File r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
    L_0x0001:
        r1 = r0 + 1;
        r2 = 5;
        if (r0 >= r2) goto L_0x000f;
    L_0x0006:
        r0 = new java.util.zip.ZipFile;	 Catch:{ IOException -> 0x000d }
        r2 = 1;	 Catch:{ IOException -> 0x000d }
        r0.<init>(r3, r2);	 Catch:{ IOException -> 0x000d }
        goto L_0x0010;
    L_0x000d:
        r0 = r1;
        goto L_0x0001;
    L_0x000f:
        r0 = 0;
    L_0x0010:
        if (r0 != 0) goto L_0x002a;
    L_0x0012:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Could not open APK file: ";
        r1.<init>(r2);
        r3 = r3.getAbsolutePath();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
    L_0x002a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.h.a(java.io.File):java.util.zip.ZipFile");
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    static void m22140a(Context context, String str) {
        str = System.mapLibraryName(str);
        synchronized (C7850h.class) {
            System.load(C7850h.m22144b(context, str).getAbsolutePath());
        }
    }

    private static void m22141a(java.io.Closeable r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r0 == 0) goto L_0x0006;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0006 }
        return;
    L_0x0006:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.h.a(java.io.Closeable):void");
    }

    private static void m22142a(File file, FilenameFilter filenameFilter) {
        File[] listFiles = file.getParentFile().listFiles(filenameFilter);
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    private static void m22143a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private static java.io.File m22144b(android.content.Context r8, final java.lang.String r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.io.File;
        r1 = "lib";
        r2 = 0;
        r1 = r8.getDir(r1, r2);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r3.append(r9);
        r4 = "1.1.17";
        r3.append(r4);
        r3 = r3.toString();
        r0.<init>(r1, r3);
        r1 = r0.isFile();
        if (r1 == 0) goto L_0x0024;
    L_0x0023:
        return r0;
    L_0x0024:
        r1 = new java.io.File;
        r3 = r8.getCacheDir();
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4.append(r9);
        r5 = "1.1.17";
        r4.append(r5);
        r4 = r4.toString();
        r1.<init>(r3, r4);
        r3 = r1.isFile();
        if (r3 == 0) goto L_0x0045;
    L_0x0044:
        return r1;
    L_0x0045:
        r3 = new pl.droidsonroids.gif.h$1;
        r3.<init>(r9);
        pl.droidsonroids.gif.C7850h.m22142a(r0, r3);
        pl.droidsonroids.gif.C7850h.m22142a(r1, r3);
        r8 = r8.getApplicationInfo();
        r3 = new java.io.File;
        r8 = r8.sourceDir;
        r3.<init>(r8);
        r8 = 0;
        r3 = pl.droidsonroids.gif.C7850h.m22139a(r3);	 Catch:{ all -> 0x00ca }
        r4 = r0;
        r0 = r2;
    L_0x0062:
        r5 = r0 + 1;
        r6 = 5;
        if (r0 >= r6) goto L_0x00c4;
    L_0x0067:
        r0 = pl.droidsonroids.gif.C7850h.m22137a(r9, r3);	 Catch:{ all -> 0x00c2 }
        if (r0 != 0) goto L_0x0086;	 Catch:{ all -> 0x00c2 }
    L_0x006d:
        r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00c2 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c2 }
        r1 = "Library ";	 Catch:{ all -> 0x00c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x00c2 }
        r0.append(r9);	 Catch:{ all -> 0x00c2 }
        r9 = " for supported ABIs not found in APK file";	 Catch:{ all -> 0x00c2 }
        r0.append(r9);	 Catch:{ all -> 0x00c2 }
        r9 = r0.toString();	 Catch:{ all -> 0x00c2 }
        r8.<init>(r9);	 Catch:{ all -> 0x00c2 }
        throw r8;	 Catch:{ all -> 0x00c2 }
    L_0x0086:
        r0 = r3.getInputStream(r0);	 Catch:{ IOException -> 0x00b4, all -> 0x00ab }
        r6 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
        r6.<init>(r4);	 Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
        pl.droidsonroids.gif.C7850h.m22143a(r0, r6);	 Catch:{ IOException -> 0x00b6, all -> 0x00a3 }
        pl.droidsonroids.gif.C7850h.m22141a(r0);	 Catch:{ all -> 0x00c2 }
        pl.droidsonroids.gif.C7850h.m22141a(r6);	 Catch:{ all -> 0x00c2 }
        r8 = 1;	 Catch:{ all -> 0x00c2 }
        r4.setReadable(r8, r2);	 Catch:{ all -> 0x00c2 }
        r4.setExecutable(r8, r2);	 Catch:{ all -> 0x00c2 }
        r4.setWritable(r8);	 Catch:{ all -> 0x00c2 }
        goto L_0x00c4;	 Catch:{ all -> 0x00c2 }
    L_0x00a3:
        r8 = move-exception;	 Catch:{ all -> 0x00c2 }
        r9 = r8;	 Catch:{ all -> 0x00c2 }
        r8 = r6;	 Catch:{ all -> 0x00c2 }
        goto L_0x00ad;	 Catch:{ all -> 0x00c2 }
    L_0x00a7:
        r9 = move-exception;	 Catch:{ all -> 0x00c2 }
        goto L_0x00ad;	 Catch:{ all -> 0x00c2 }
    L_0x00a9:
        r6 = r8;	 Catch:{ all -> 0x00c2 }
        goto L_0x00b6;	 Catch:{ all -> 0x00c2 }
    L_0x00ab:
        r9 = move-exception;	 Catch:{ all -> 0x00c2 }
        r0 = r8;	 Catch:{ all -> 0x00c2 }
    L_0x00ad:
        pl.droidsonroids.gif.C7850h.m22141a(r0);	 Catch:{ all -> 0x00c2 }
        pl.droidsonroids.gif.C7850h.m22141a(r8);	 Catch:{ all -> 0x00c2 }
        throw r9;	 Catch:{ all -> 0x00c2 }
    L_0x00b4:
        r0 = r8;	 Catch:{ all -> 0x00c2 }
        r6 = r0;	 Catch:{ all -> 0x00c2 }
    L_0x00b6:
        r7 = 2;	 Catch:{ all -> 0x00c2 }
        if (r5 <= r7) goto L_0x00ba;	 Catch:{ all -> 0x00c2 }
    L_0x00b9:
        r4 = r1;	 Catch:{ all -> 0x00c2 }
    L_0x00ba:
        pl.droidsonroids.gif.C7850h.m22141a(r0);	 Catch:{ all -> 0x00c2 }
        pl.droidsonroids.gif.C7850h.m22141a(r6);	 Catch:{ all -> 0x00c2 }
        r0 = r5;
        goto L_0x0062;
    L_0x00c2:
        r8 = move-exception;
        goto L_0x00cd;
    L_0x00c4:
        if (r3 == 0) goto L_0x00c9;
    L_0x00c6:
        r3.close();	 Catch:{ IOException -> 0x00c9 }
    L_0x00c9:
        return r4;
    L_0x00ca:
        r9 = move-exception;
        r3 = r8;
        r8 = r9;
    L_0x00cd:
        if (r3 == 0) goto L_0x00d2;
    L_0x00cf:
        r3.close();	 Catch:{ IOException -> 0x00d2 }
    L_0x00d2:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.h.b(android.content.Context, java.lang.String):java.io.File");
    }
}
