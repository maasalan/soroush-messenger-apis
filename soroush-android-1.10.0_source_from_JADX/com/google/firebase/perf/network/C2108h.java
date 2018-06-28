package com.google.firebase.perf.network;

import com.google.android.gms.internal.ms;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

public final class C2108h {
    public static java.lang.Long m5791a(org.apache.http.HttpMessage r2) {
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
        r0 = "content-length";	 Catch:{ NumberFormatException -> 0x0015 }
        r2 = r2.getFirstHeader(r0);	 Catch:{ NumberFormatException -> 0x0015 }
        if (r2 == 0) goto L_0x001c;	 Catch:{ NumberFormatException -> 0x0015 }
    L_0x0008:
        r2 = r2.getValue();	 Catch:{ NumberFormatException -> 0x0015 }
        r0 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x0015 }
        r2 = java.lang.Long.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0015 }
        return r2;
    L_0x0015:
        r2 = "FirebasePerformance";
        r0 = "The content-length value is not a valid number";
        android.util.Log.d(r2, r0);
    L_0x001c:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.network.h.a(org.apache.http.HttpMessage):java.lang.Long");
    }

    public static String m5792a(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    public static void m5793a(ms msVar) {
        if (msVar.f18329c == null) {
            msVar.f18328b = Integer.valueOf(1);
        }
        msVar.m16713a();
    }
}
