package com.p085c.p086a.p087a;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.jivesoftware.smack.util.StringUtils;

final class C1085c {
    static final Charset f3555a = Charset.forName(StringUtils.USASCII);
    static final Charset f3556b = Charset.forName(StringUtils.UTF8);

    static void m2630a(java.io.Closeable r0) {
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
        r0.close();	 Catch:{ RuntimeException -> 0x0004, Exception -> 0x0003 }
    L_0x0003:
        return;
    L_0x0004:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.a.c.a(java.io.Closeable):void");
    }

    static void m2631a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            StringBuilder stringBuilder = new StringBuilder("not a readable directory: ");
            stringBuilder.append(file);
            throw new IOException(stringBuilder.toString());
        }
        int length = listFiles.length;
        int i = 0;
        while (i < length) {
            File file2 = listFiles[i];
            if (file2.isDirectory()) {
                C1085c.m2631a(file2);
            }
            if (file2.delete()) {
                i++;
            } else {
                StringBuilder stringBuilder2 = new StringBuilder("failed to delete file: ");
                stringBuilder2.append(file2);
                throw new IOException(stringBuilder2.toString());
            }
        }
    }
}
