package com.p072b.p073a.p074a.p081h.p082a;

import android.content.Context;
import com.p072b.p073a.p074a.p078e.C1028b;
import java.io.Closeable;
import java.io.File;
import java.util.Set;
import p206d.C2273l;

final class C1049b {
    private final File f3397a;

    C1049b(Context context, String str) {
        File dir = context.getDir("com_birbit_jobqueue_jobs", 0);
        StringBuilder stringBuilder = new StringBuilder("files_");
        stringBuilder.append(str);
        this.f3397a = new File(dir, stringBuilder.toString());
        this.f3397a.mkdirs();
    }

    static void m2536a(java.io.Closeable r0) {
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
        r0.close();	 Catch:{ IOException -> 0x0003 }
    L_0x0003:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.b.a.a.h.a.b.a(java.io.Closeable):void");
    }

    final void m2537a(Set<String> set) {
        for (String str : this.f3397a.list()) {
            if (str.endsWith(".jobs")) {
                if (!set.contains(str.length() < 6 ? null : str.substring(0, str.length() - 5))) {
                    File file = new File(this.f3397a, str);
                    if (!file.delete()) {
                        new StringBuilder("cannot delete unused job toFile ").append(file.getAbsolutePath());
                        C1028b.m2507b();
                    }
                }
            }
        }
    }

    final byte[] m2538a(String str) {
        File b = m2539b(str);
        if (!b.exists() || !b.canRead()) {
            return null;
        }
        Closeable a = C2273l.m6209a(C2273l.m6212a(b));
        try {
            byte[] o = a.mo3149o();
            return o;
        } finally {
            C1049b.m2536a(a);
        }
    }

    final File m2539b(String str) {
        File file = this.f3397a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".jobs");
        return new File(file, stringBuilder.toString());
    }
}
