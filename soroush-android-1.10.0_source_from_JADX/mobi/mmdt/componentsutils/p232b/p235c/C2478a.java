package mobi.mmdt.componentsutils.p232b.p235c;

public final class C2478a {
    private static final java.lang.Object m6727a(java.lang.String r2) {
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
        r1 = "mobi.mmdt.ott.b";	 Catch:{ ClassNotFoundException -> 0x0015, NoSuchFieldException -> 0x0019, IllegalAccessException -> 0x0010 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0015, NoSuchFieldException -> 0x0019, IllegalAccessException -> 0x0010 }
        r2 = r1.getField(r2);	 Catch:{ ClassNotFoundException -> 0x0015, NoSuchFieldException -> 0x0019, IllegalAccessException -> 0x0010 }
        r2 = r2.get(r0);	 Catch:{ ClassNotFoundException -> 0x0015, NoSuchFieldException -> 0x0019, IllegalAccessException -> 0x0010 }
        return r2;
    L_0x0010:
        r2 = move-exception;
        r2.printStackTrace();
        return r0;
    L_0x0015:
        r2 = move-exception;
        r2.printStackTrace();
    L_0x0019:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.componentsutils.b.c.a.a(java.lang.String):java.lang.Object");
    }

    public static final boolean m6728a() {
        String b = C2478a.m6729b();
        if (b != null) {
            if (!b.equals("debug")) {
                if (!b.equals("debug_version")) {
                    if (b.equals("release")) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    static final String m6729b() {
        Object a = C2478a.m6727a("BUILD_TYPE");
        return a == null ? null : a.toString();
    }
}
