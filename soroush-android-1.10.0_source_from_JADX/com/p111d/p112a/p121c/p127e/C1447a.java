package com.p111d.p112a.p121c.p127e;

import java.io.Serializable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public final class C1447a implements Serializable {
    public static final Class<?> f4544a = Node.class;
    public static final Class<?> f4545b = Document.class;
    public static final Class<?> f4546c;
    public static final C1447a f4547d = new C1447a();

    static {
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
        r0 = org.w3c.dom.Node.class;
        r1 = org.w3c.dom.Document.class;
        f4544a = r0;
        f4545b = r1;
        r0 = "java.nio.file.Path";	 Catch:{ Exception -> 0x000f }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x000f }
        goto L_0x0017;
    L_0x000f:
        r0 = java.lang.System.err;
        r1 = "WARNING: could not load Java7 Path class";
        r0.println(r1);
        r0 = 0;
    L_0x0017:
        f4546c = r0;
        r0 = new com.d.a.c.e.a;
        r0.<init>();
        f4547d = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.e.a.<clinit>():void");
    }

    protected C1447a() {
    }

    public static java.lang.Object m3646a(java.lang.String r0) {
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
        r0 = java.lang.Class.forName(r0);	 Catch:{ LinkageError -> 0x0009, LinkageError -> 0x0009 }
        r0 = r0.newInstance();	 Catch:{ LinkageError -> 0x0009, LinkageError -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.e.a.a(java.lang.String):java.lang.Object");
    }

    public static boolean m3647a(Class<?> cls, String str) {
        Class superclass;
        do {
            superclass = superclass.getSuperclass();
            if (superclass == null || superclass == Object.class) {
                return false;
            }
        } while (!superclass.getName().startsWith(str));
        return true;
    }
}
