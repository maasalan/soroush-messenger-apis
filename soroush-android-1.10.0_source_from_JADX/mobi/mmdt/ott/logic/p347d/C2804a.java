package mobi.mmdt.ott.logic.p347d;

import java.util.HashMap;
import mobi.mmdt.ott.p240c.C2524c.C2522a;
import p000a.p001a.p002a.C0005c;

public final class C2804a {
    private static C2804a f8867c;
    public HashMap<String, C2522a> f8868a = new HashMap();
    public HashMap<String, HashMap<String, C2522a>> f8869b = new HashMap();

    static /* synthetic */ class C28031 {
        public static final /* synthetic */ int[] f8866a = new int[C2522a.values().length];

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
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = mobi.mmdt.ott.p240c.C2524c.C2522a.values();
            r0 = r0.length;
            r0 = new int[r0];
            f8866a = r0;
            r0 = f8866a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = mobi.mmdt.ott.p240c.C2524c.C2522a.COMPOSING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.d.a.1.<clinit>():void");
        }
    }

    public static C2804a m7145a() {
        if (f8867c == null) {
            f8867c = new C2804a();
        }
        return f8867c;
    }

    public final void m7146b() {
        this.f8868a.clear();
        this.f8869b.clear();
        C0005c.m0a().m9d(new C2805b());
    }
}
