package android.support.v4.p031b;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.jivesoftware.smack.roster.Roster;

public final class C0440h {
    public static java.io.File m932a(android.content.Context r5) {
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
        r0 = new java.lang.StringBuilder;
        r1 = ".font";
        r0.<init>(r1);
        r1 = android.os.Process.myPid();
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r1 = android.os.Process.myTid();
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r0 = r0.toString();
        r1 = 0;
    L_0x0024:
        r2 = 100;
        if (r1 >= r2) goto L_0x004a;
    L_0x0028:
        r2 = new java.io.File;
        r3 = r5.getCacheDir();
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4.append(r0);
        r4.append(r1);
        r4 = r4.toString();
        r2.<init>(r3, r4);
        r3 = r2.createNewFile();	 Catch:{ IOException -> 0x0047 }
        if (r3 == 0) goto L_0x0047;
    L_0x0046:
        return r2;
    L_0x0047:
        r1 = r1 + 1;
        goto L_0x0024;
    L_0x004a:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.h.a(android.content.Context):java.io.File");
    }

    public static ByteBuffer m933a(Context context, Resources resources, int i) {
        File a = C0440h.m932a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0440h.m937a(a, resources, i)) {
                return null;
            }
            ByteBuffer a2 = C0440h.m935a(a);
            a.delete();
            return a2;
        } finally {
            a.delete();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m934a(android.content.Context r9, android.net.Uri r10) {
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
        r9 = r9.getContentResolver();
        r0 = 0;
        r1 = "r";	 Catch:{ IOException -> 0x005f }
        r9 = r9.openFileDescriptor(r10, r1, r0);	 Catch:{ IOException -> 0x005f }
        r10 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x0048, all -> 0x0045 }
        r1 = r9.getFileDescriptor();	 Catch:{ Throwable -> 0x0048, all -> 0x0045 }
        r10.<init>(r1);	 Catch:{ Throwable -> 0x0048, all -> 0x0045 }
        r2 = r10.getChannel();	 Catch:{ Throwable -> 0x0030, all -> 0x002d }
        r6 = r2.size();	 Catch:{ Throwable -> 0x0030, all -> 0x002d }
        r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ Throwable -> 0x0030, all -> 0x002d }
        r4 = 0;	 Catch:{ Throwable -> 0x0030, all -> 0x002d }
        r1 = r2.map(r3, r4, r6);	 Catch:{ Throwable -> 0x0030, all -> 0x002d }
        r10.close();	 Catch:{ Throwable -> 0x0048, all -> 0x0045 }
        if (r9 == 0) goto L_0x002c;
    L_0x0029:
        r9.close();	 Catch:{ IOException -> 0x005f }
    L_0x002c:
        return r1;
    L_0x002d:
        r1 = move-exception;
        r2 = r0;
        goto L_0x0036;
    L_0x0030:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r2 = move-exception;
        r8 = r2;
        r2 = r1;
        r1 = r8;
    L_0x0036:
        if (r2 == 0) goto L_0x0041;
    L_0x0038:
        r10.close();	 Catch:{ Throwable -> 0x003c, all -> 0x0045 }
        goto L_0x0044;
    L_0x003c:
        r10 = move-exception;
        r2.addSuppressed(r10);	 Catch:{ Throwable -> 0x0048, all -> 0x0045 }
        goto L_0x0044;	 Catch:{ Throwable -> 0x0048, all -> 0x0045 }
    L_0x0041:
        r10.close();	 Catch:{ Throwable -> 0x0048, all -> 0x0045 }
    L_0x0044:
        throw r1;	 Catch:{ Throwable -> 0x0048, all -> 0x0045 }
    L_0x0045:
        r10 = move-exception;
        r1 = r0;
        goto L_0x004e;
    L_0x0048:
        r10 = move-exception;
        throw r10;	 Catch:{ all -> 0x004a }
    L_0x004a:
        r1 = move-exception;
        r8 = r1;
        r1 = r10;
        r10 = r8;
    L_0x004e:
        if (r9 == 0) goto L_0x005e;
    L_0x0050:
        if (r1 == 0) goto L_0x005b;
    L_0x0052:
        r9.close();	 Catch:{ Throwable -> 0x0056 }
        goto L_0x005e;
    L_0x0056:
        r9 = move-exception;
        r1.addSuppressed(r9);	 Catch:{ IOException -> 0x005f }
        goto L_0x005e;	 Catch:{ IOException -> 0x005f }
    L_0x005b:
        r9.close();	 Catch:{ IOException -> 0x005f }
    L_0x005e:
        throw r10;	 Catch:{ IOException -> 0x005f }
    L_0x005f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.h.a(android.content.Context, android.net.Uri):java.nio.ByteBuffer");
    }

    private static java.nio.ByteBuffer m935a(java.io.File r9) {
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
        r0 = 0;
        r1 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0032 }
        r1.<init>(r9);	 Catch:{ IOException -> 0x0032 }
        r2 = r1.getChannel();	 Catch:{ Throwable -> 0x001d, all -> 0x001a }
        r6 = r2.size();	 Catch:{ Throwable -> 0x001d, all -> 0x001a }
        r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ Throwable -> 0x001d, all -> 0x001a }
        r4 = 0;	 Catch:{ Throwable -> 0x001d, all -> 0x001a }
        r9 = r2.map(r3, r4, r6);	 Catch:{ Throwable -> 0x001d, all -> 0x001a }
        r1.close();	 Catch:{ IOException -> 0x0032 }
        return r9;
    L_0x001a:
        r9 = move-exception;
        r2 = r0;
        goto L_0x0023;
    L_0x001d:
        r9 = move-exception;
        throw r9;	 Catch:{ all -> 0x001f }
    L_0x001f:
        r2 = move-exception;
        r8 = r2;
        r2 = r9;
        r9 = r8;
    L_0x0023:
        if (r2 == 0) goto L_0x002e;
    L_0x0025:
        r1.close();	 Catch:{ Throwable -> 0x0029 }
        goto L_0x0031;
    L_0x0029:
        r1 = move-exception;
        r2.addSuppressed(r1);	 Catch:{ IOException -> 0x0032 }
        goto L_0x0031;	 Catch:{ IOException -> 0x0032 }
    L_0x002e:
        r1.close();	 Catch:{ IOException -> 0x0032 }
    L_0x0031:
        throw r9;	 Catch:{ IOException -> 0x0032 }
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.h.a(java.io.File):java.nio.ByteBuffer");
    }

    public static void m936a(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0005;
    L_0x0002:
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.h.a(java.io.Closeable):void");
    }

    public static boolean m937a(File file, Resources resources, int i) {
        Throwable th;
        Closeable openRawResource;
        try {
            openRawResource = resources.openRawResource(i);
            try {
                boolean a = C0440h.m938a(file, (InputStream) openRawResource);
                C0440h.m936a(openRawResource);
                return a;
            } catch (Throwable th2) {
                th = th2;
                C0440h.m936a(openRawResource);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            openRawResource = null;
            C0440h.m936a(openRawResource);
            throw th;
        }
    }

    public static boolean m938a(File file, InputStream inputStream) {
        IOException e;
        StringBuilder stringBuilder;
        Throwable th;
        Closeable closeable = null;
        try {
            Closeable fileOutputStream = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        C0440h.m936a(fileOutputStream);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                closeable = fileOutputStream;
                try {
                    stringBuilder = new StringBuilder("Error copying resource contents to temp file: ");
                    stringBuilder.append(e.getMessage());
                    Log.e("TypefaceCompatUtil", stringBuilder.toString());
                    C0440h.m936a(closeable);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    C0440h.m936a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = fileOutputStream;
                C0440h.m936a(closeable);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            stringBuilder = new StringBuilder("Error copying resource contents to temp file: ");
            stringBuilder.append(e.getMessage());
            Log.e("TypefaceCompatUtil", stringBuilder.toString());
            C0440h.m936a(closeable);
            return false;
        }
    }
}
