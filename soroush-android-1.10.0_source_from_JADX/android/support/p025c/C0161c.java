package android.support.p025c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import org.jivesoftware.smack.sm.packet.StreamManagement.Failed;
import org.jivesoftware.smackx.iot.data.element.TimestampElement;

final class C0161c {

    private static class C0160a extends File {
        public long f486a = -1;

        public C0160a(File file, String str) {
            super(file, str);
        }
    }

    private static long m251a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static SharedPreferences m252a(Context context) {
        return context.getSharedPreferences("multidex.version", VERSION.SDK_INT < 11 ? 0 : 4);
    }

    static java.util.List<? extends java.io.File> m253a(android.content.Context r19, java.io.File r20, java.io.File r21, java.lang.String r22) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = r22;
        r1 = "MultiDex";
        r3 = new java.lang.StringBuilder;
        r4 = "MultiDexExtractor.load(";
        r3.<init>(r4);
        r4 = r20.getPath();
        r3.append(r4);
        r4 = ", false, ";
        r3.append(r4);
        r3.append(r2);
        r4 = ")";
        r3.append(r4);
        r3 = r3.toString();
        android.util.Log.i(r1, r3);
        r5 = android.support.p025c.C0161c.m259b(r20);
        r8 = new java.io.File;
        r1 = "MultiDex.lock";
        r3 = r21;
        r8.<init>(r3, r1);
        r9 = new java.io.RandomAccessFile;
        r1 = "rw";
        r9.<init>(r8, r1);
        r10 = 0;
        r11 = r9.getChannel();	 Catch:{ all -> 0x0131 }
        r1 = "MultiDex";	 Catch:{ all -> 0x012d }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012d }
        r7 = "Blocking on lock ";	 Catch:{ all -> 0x012d }
        r4.<init>(r7);	 Catch:{ all -> 0x012d }
        r7 = r8.getPath();	 Catch:{ all -> 0x012d }
        r4.append(r7);	 Catch:{ all -> 0x012d }
        r4 = r4.toString();	 Catch:{ all -> 0x012d }
        android.util.Log.i(r1, r4);	 Catch:{ all -> 0x012d }
        r12 = r11.lock();	 Catch:{ all -> 0x012d }
        r1 = "MultiDex";	 Catch:{ all -> 0x012a }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012a }
        r4.<init>();	 Catch:{ all -> 0x012a }
        r7 = r8.getPath();	 Catch:{ all -> 0x012a }
        r4.append(r7);	 Catch:{ all -> 0x012a }
        r7 = " locked";	 Catch:{ all -> 0x012a }
        r4.append(r7);	 Catch:{ all -> 0x012a }
        r4 = r4.toString();	 Catch:{ all -> 0x012a }
        android.util.Log.i(r1, r4);	 Catch:{ all -> 0x012a }
        r1 = android.support.p025c.C0161c.m252a(r19);	 Catch:{ all -> 0x012a }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012a }
        r4.<init>();	 Catch:{ all -> 0x012a }
        r4.append(r2);	 Catch:{ all -> 0x012a }
        r7 = "timestamp";	 Catch:{ all -> 0x012a }
        r4.append(r7);	 Catch:{ all -> 0x012a }
        r4 = r4.toString();	 Catch:{ all -> 0x012a }
        r13 = -1;	 Catch:{ all -> 0x012a }
        r15 = r1.getLong(r4, r13);	 Catch:{ all -> 0x012a }
        r17 = android.support.p025c.C0161c.m251a(r20);	 Catch:{ all -> 0x012a }
        r4 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1));	 Catch:{ all -> 0x012a }
        if (r4 != 0) goto L_0x00b3;	 Catch:{ all -> 0x012a }
    L_0x0097:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012a }
        r4.<init>();	 Catch:{ all -> 0x012a }
        r4.append(r2);	 Catch:{ all -> 0x012a }
        r7 = "crc";	 Catch:{ all -> 0x012a }
        r4.append(r7);	 Catch:{ all -> 0x012a }
        r4 = r4.toString();	 Catch:{ all -> 0x012a }
        r13 = r1.getLong(r4, r13);	 Catch:{ all -> 0x012a }
        r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1));
        if (r1 == 0) goto L_0x00b1;
    L_0x00b0:
        goto L_0x00b3;
    L_0x00b1:
        r1 = 0;
        goto L_0x00b4;
    L_0x00b3:
        r1 = 1;
    L_0x00b4:
        if (r1 != 0) goto L_0x00d3;
    L_0x00b6:
        r1 = android.support.p025c.C0161c.m260b(r19, r20, r21, r22);	 Catch:{ IOException -> 0x00bc }
        r13 = r1;
        goto L_0x00e3;
    L_0x00bc:
        r0 = move-exception;
        r1 = "MultiDex";	 Catch:{ all -> 0x012a }
        r4 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction";	 Catch:{ all -> 0x012a }
        android.util.Log.w(r1, r4, r0);	 Catch:{ all -> 0x012a }
        r13 = android.support.p025c.C0161c.m254a(r20, r21);	 Catch:{ all -> 0x012a }
        r3 = android.support.p025c.C0161c.m251a(r20);	 Catch:{ all -> 0x012a }
    L_0x00cc:
        r1 = r19;	 Catch:{ all -> 0x012a }
        r7 = r13;	 Catch:{ all -> 0x012a }
        android.support.p025c.C0161c.m255a(r1, r2, r3, r5, r7);	 Catch:{ all -> 0x012a }
        goto L_0x00e3;	 Catch:{ all -> 0x012a }
    L_0x00d3:
        r1 = "MultiDex";	 Catch:{ all -> 0x012a }
        r4 = "Detected that extraction must be performed.";	 Catch:{ all -> 0x012a }
        android.util.Log.i(r1, r4);	 Catch:{ all -> 0x012a }
        r13 = android.support.p025c.C0161c.m254a(r20, r21);	 Catch:{ all -> 0x012a }
        r3 = android.support.p025c.C0161c.m251a(r20);	 Catch:{ all -> 0x012a }
        goto L_0x00cc;
    L_0x00e3:
        if (r12 == 0) goto L_0x0102;
    L_0x00e5:
        r12.release();	 Catch:{ IOException -> 0x00e9 }
        goto L_0x0102;
    L_0x00e9:
        r0 = move-exception;
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;
        r3 = "Failed to release lock on ";
        r2.<init>(r3);
        r3 = r8.getPath();
        r2.append(r3);
        r2 = r2.toString();
        android.util.Log.e(r1, r2);
        r10 = r0;
    L_0x0102:
        if (r11 == 0) goto L_0x0107;
    L_0x0104:
        android.support.p025c.C0161c.m256a(r11);
    L_0x0107:
        android.support.p025c.C0161c.m256a(r9);
        if (r10 == 0) goto L_0x010d;
    L_0x010c:
        throw r10;
    L_0x010d:
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;
        r3 = "load found ";
        r2.<init>(r3);
        r3 = r13.size();
        r2.append(r3);
        r3 = " secondary dex files";
        r2.append(r3);
        r2 = r2.toString();
        android.util.Log.i(r1, r2);
        return r13;
    L_0x012a:
        r0 = move-exception;
        r1 = r0;
        goto L_0x0135;
    L_0x012d:
        r0 = move-exception;
        r1 = r0;
        r12 = r10;
        goto L_0x0135;
    L_0x0131:
        r0 = move-exception;
        r1 = r0;
        r11 = r10;
        r12 = r11;
    L_0x0135:
        if (r12 == 0) goto L_0x0152;
    L_0x0137:
        r12.release();	 Catch:{ IOException -> 0x013b }
        goto L_0x0152;
    L_0x013b:
        r2 = "MultiDex";
        r3 = new java.lang.StringBuilder;
        r4 = "Failed to release lock on ";
        r3.<init>(r4);
        r4 = r8.getPath();
        r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
    L_0x0152:
        if (r11 == 0) goto L_0x0157;
    L_0x0154:
        android.support.p025c.C0161c.m256a(r11);
    L_0x0157:
        android.support.p025c.C0161c.m256a(r9);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.c.c.a(android.content.Context, java.io.File, java.io.File, java.lang.String):java.util.List<? extends java.io.File>");
    }

    private static List<C0160a> m254a(File file, File file2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getName());
        stringBuilder.append(".classes");
        String stringBuilder2 = stringBuilder.toString();
        C0161c.m257a(file2, stringBuilder2);
        List<C0160a> arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        int i = 2;
        File c0160a;
        int i2;
        StringBuilder stringBuilder3;
        try {
            String str = "classes2.dex";
            while (true) {
                ZipEntry entry = zipFile.getEntry(str);
                if (entry != null) {
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(stringBuilder2);
                    stringBuilder4.append(i);
                    stringBuilder4.append(".zip");
                    c0160a = new C0160a(file2, stringBuilder4.toString());
                    arrayList.add(c0160a);
                    StringBuilder stringBuilder5 = new StringBuilder("Extraction is needed for file ");
                    stringBuilder5.append(c0160a);
                    Log.i("MultiDex", stringBuilder5.toString());
                    int i3 = 0;
                    i2 = i3;
                    while (i3 < 3 && i2 == 0) {
                        i3++;
                        C0161c.m258a(zipFile, entry, c0160a, stringBuilder2);
                        c0160a.f486a = C0161c.m259b(c0160a);
                        i2 = 1;
                        String str2 = "MultiDex";
                        stringBuilder3 = new StringBuilder("Extraction ");
                        stringBuilder3.append(i2 != 0 ? "succeeded" : Failed.ELEMENT);
                        stringBuilder3.append(" - length ");
                        stringBuilder3.append(c0160a.getAbsolutePath());
                        stringBuilder3.append(": ");
                        stringBuilder3.append(c0160a.length());
                        stringBuilder3.append(" - crc: ");
                        stringBuilder3.append(c0160a.f486a);
                        Log.i(str2, stringBuilder3.toString());
                        if (i2 == 0) {
                            c0160a.delete();
                            if (c0160a.exists()) {
                                stringBuilder3 = new StringBuilder("Failed to delete corrupted secondary dex '");
                                stringBuilder3.append(c0160a.getPath());
                                stringBuilder3.append("'");
                                Log.w("MultiDex", stringBuilder3.toString());
                            }
                        }
                    }
                    if (i2 == 0) {
                        stringBuilder = new StringBuilder("Could not create zip file ");
                        stringBuilder.append(c0160a.getAbsolutePath());
                        stringBuilder.append(" for secondary dex (");
                        stringBuilder.append(i);
                        stringBuilder.append(")");
                        throw new IOException(stringBuilder.toString());
                    }
                    i++;
                    StringBuilder stringBuilder6 = new StringBuilder("classes");
                    stringBuilder6.append(i);
                    stringBuilder6.append(".dex");
                    str = stringBuilder6.toString();
                } else {
                    try {
                        zipFile.close();
                        return arrayList;
                    } catch (Throwable e) {
                        Log.w("MultiDex", "Failed to close resource", e);
                        return arrayList;
                    }
                }
            }
        } catch (Throwable e2) {
            stringBuilder3 = new StringBuilder("Failed to read crc from ");
            stringBuilder3.append(c0160a.getAbsolutePath());
            Log.w("MultiDex", stringBuilder3.toString(), e2);
            i2 = 0;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (Throwable e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
        }
    }

    private static void m255a(Context context, String str, long j, long j2, List<C0160a> list) {
        Editor edit = C0161c.m252a(context).edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(TimestampElement.ELEMENT);
        edit.putLong(stringBuilder.toString(), j);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("crc");
        edit.putLong(stringBuilder2.toString(), j2);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append("dex.number");
        edit.putInt(stringBuilder2.toString(), list.size() + 1);
        int i = 2;
        for (C0160a c0160a : list) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append("dex.crc.");
            stringBuilder3.append(i);
            edit.putLong(stringBuilder3.toString(), c0160a.f486a);
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append("dex.time.");
            stringBuilder3.append(i);
            edit.putLong(stringBuilder3.toString(), c0160a.lastModified());
            i++;
        }
        edit.commit();
    }

    private static void m256a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    private static void m257a(File file, final String str) {
        File[] listFiles = file.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                String name = file.getName();
                return (name.startsWith(str) || name.equals("MultiDex.lock")) ? false : true;
            }
        });
        if (listFiles == null) {
            StringBuilder stringBuilder = new StringBuilder("Failed to list secondary dex dir content (");
            stringBuilder.append(file.getPath());
            stringBuilder.append(").");
            Log.w("MultiDex", stringBuilder.toString());
            return;
        }
        for (File file2 : listFiles) {
            StringBuilder stringBuilder2 = new StringBuilder("Trying to delete old file ");
            stringBuilder2.append(file2.getPath());
            stringBuilder2.append(" of size ");
            stringBuilder2.append(file2.length());
            Log.i("MultiDex", stringBuilder2.toString());
            if (file2.delete()) {
                stringBuilder2 = new StringBuilder("Deleted old file ");
                stringBuilder2.append(file2.getPath());
                Log.i("MultiDex", stringBuilder2.toString());
            } else {
                stringBuilder2 = new StringBuilder("Failed to delete old file ");
                stringBuilder2.append(file2.getPath());
                Log.w("MultiDex", stringBuilder2.toString());
            }
        }
    }

    private static void m258a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        Closeable inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder stringBuilder = new StringBuilder("tmp-");
        stringBuilder.append(str);
        File createTempFile = File.createTempFile(stringBuilder.toString(), ".zip", file.getParentFile());
        StringBuilder stringBuilder2 = new StringBuilder("Extracting ");
        stringBuilder2.append(createTempFile.getPath());
        Log.i("MultiDex", stringBuilder2.toString());
        ZipOutputStream zipOutputStream;
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                stringBuilder = new StringBuilder("Renaming to ");
                stringBuilder.append(file.getPath());
                Log.i("MultiDex", stringBuilder.toString());
                if (createTempFile.renameTo(file)) {
                    C0161c.m256a(inputStream);
                    createTempFile.delete();
                    return;
                }
                stringBuilder = new StringBuilder("Failed to rename \"");
                stringBuilder.append(createTempFile.getAbsolutePath());
                stringBuilder.append("\" to \"");
                stringBuilder.append(file.getAbsolutePath());
                stringBuilder.append("\"");
                throw new IOException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder("Failed to mark readonly \"");
            stringBuilder.append(createTempFile.getAbsolutePath());
            stringBuilder.append("\" (tmp of \"");
            stringBuilder.append(file.getAbsolutePath());
            stringBuilder.append("\")");
            throw new IOException(stringBuilder.toString());
        } catch (Throwable th) {
            C0161c.m256a(inputStream);
            createTempFile.delete();
        }
    }

    private static long m259b(File file) {
        long a = C0163d.m261a(file);
        return a == -1 ? a - 1 : a;
    }

    private static List<C0160a> m260b(Context context, File file, File file2, String str) {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getName());
        stringBuilder.append(".classes");
        String stringBuilder2 = stringBuilder.toString();
        SharedPreferences a = C0161c.m252a(context);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append("dex.number");
        int i = a.getInt(stringBuilder3.toString(), 1);
        List<C0160a> arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder2);
            stringBuilder4.append(i2);
            stringBuilder4.append(".zip");
            File c0160a = new C0160a(file2, stringBuilder4.toString());
            if (c0160a.isFile()) {
                c0160a.f486a = C0161c.m259b(c0160a);
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append("dex.crc.");
                stringBuilder4.append(i2);
                long j = a.getLong(stringBuilder4.toString(), -1);
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append(str2);
                stringBuilder4.append("dex.time.");
                stringBuilder4.append(i2);
                long j2 = a.getLong(stringBuilder4.toString(), -1);
                long lastModified = c0160a.lastModified();
                if (j2 == lastModified) {
                    String str3 = stringBuilder2;
                    SharedPreferences sharedPreferences = a;
                    if (j == c0160a.f486a) {
                        arrayList.add(c0160a);
                        i2++;
                        stringBuilder2 = str3;
                        a = sharedPreferences;
                    }
                }
                StringBuilder stringBuilder5 = new StringBuilder("Invalid extracted dex: ");
                stringBuilder5.append(c0160a);
                stringBuilder5.append(" (key \"");
                stringBuilder5.append(str2);
                stringBuilder5.append("\"), expected modification time: ");
                stringBuilder5.append(j2);
                stringBuilder5.append(", modification time: ");
                stringBuilder5.append(lastModified);
                stringBuilder5.append(", expected crc: ");
                stringBuilder5.append(j);
                stringBuilder5.append(", file crc: ");
                stringBuilder5.append(c0160a.f486a);
                throw new IOException(stringBuilder5.toString());
            }
            stringBuilder = new StringBuilder("Missing extracted secondary dex file '");
            stringBuilder.append(c0160a.getPath());
            stringBuilder.append("'");
            throw new IOException(stringBuilder.toString());
        }
        return arrayList;
    }
}
