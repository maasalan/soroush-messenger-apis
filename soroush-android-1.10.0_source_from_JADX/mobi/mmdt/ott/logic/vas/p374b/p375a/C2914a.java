package mobi.mmdt.ott.logic.vas.p374b.p375a;

import java.text.SimpleDateFormat;
import java.util.Date;
import mobi.mmdt.ott.logic.bot.api.p342a.C2780b;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2914a {
    public static java.lang.String m7290a(android.app.Activity r3, java.lang.String r4) {
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
        r0 = new java.text.SimpleDateFormat;	 Catch:{ Exception -> 0x0053 }
        r1 = "MMM d, yyyy HH:mm:ss a";	 Catch:{ Exception -> 0x0053 }
        r2 = java.util.Locale.US;	 Catch:{ Exception -> 0x0053 }
        r0.<init>(r1, r2);	 Catch:{ Exception -> 0x0053 }
        r4 = r0.parse(r4);	 Catch:{ Exception -> 0x0053 }
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x0053 }
        r0 = r0.m6919b();	 Catch:{ Exception -> 0x0053 }
        r1 = r4.getTime();	 Catch:{ Exception -> 0x0053 }
        r3 = mobi.mmdt.componentsutils.p232b.C2491i.m6773a(r3, r1, r0);	 Catch:{ Exception -> 0x0053 }
        r4 = "fa";	 Catch:{ Exception -> 0x0053 }
        r4 = r0.equals(r4);	 Catch:{ Exception -> 0x0053 }
        if (r4 == 0) goto L_0x0026;	 Catch:{ Exception -> 0x0053 }
    L_0x0025:
        return r3;	 Catch:{ Exception -> 0x0053 }
    L_0x0026:
        r4 = "\\s+";	 Catch:{ Exception -> 0x0053 }
        r4 = r3.split(r4);	 Catch:{ Exception -> 0x0053 }
        r0 = r4.length;	 Catch:{ Exception -> 0x0053 }
        r1 = 1;	 Catch:{ Exception -> 0x0053 }
        if (r0 <= r1) goto L_0x0052;	 Catch:{ Exception -> 0x0053 }
    L_0x0030:
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0053 }
        r3.<init>();	 Catch:{ Exception -> 0x0053 }
        r0 = r4[r1];	 Catch:{ Exception -> 0x0053 }
        r3.append(r0);	 Catch:{ Exception -> 0x0053 }
        r0 = " ";	 Catch:{ Exception -> 0x0053 }
        r3.append(r0);	 Catch:{ Exception -> 0x0053 }
        r0 = 0;	 Catch:{ Exception -> 0x0053 }
        r4 = r4[r0];	 Catch:{ Exception -> 0x0053 }
        r1 = 3;	 Catch:{ Exception -> 0x0053 }
        r4 = r4.substring(r0, r1);	 Catch:{ Exception -> 0x0053 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ Exception -> 0x0053 }
        r3.append(r4);	 Catch:{ Exception -> 0x0053 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x0053 }
    L_0x0052:
        return r3;
    L_0x0053:
        r3 = "";
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.vas.b.a.a.a(android.app.Activity, java.lang.String):java.lang.String");
    }

    public static String m7291a(C2780b c2780b) {
        return C2535a.m6888a().m6919b().equals("fa") ? c2780b.f8789a : c2780b.f8790b;
    }

    public static boolean m7292a() {
        int parseInt = Integer.parseInt(new SimpleDateFormat("HH").format(new Date()));
        if (parseInt < 20) {
            if (parseInt > 6) {
                return false;
            }
        }
        return true;
    }
}
