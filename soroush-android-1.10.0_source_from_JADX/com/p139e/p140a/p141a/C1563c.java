package com.p139e.p140a.p141a;

import com.p139e.p140a.C1575c.C1573a;
import com.p139e.p140a.p142b.C1568c;
import com.p139e.p140a.p142b.C6531d;
import com.p139e.p140a.p142b.C6532e;

public final class C1563c {

    static /* synthetic */ class C15621 {
        static final /* synthetic */ int[] f4863a = new int[C1573a.m4088a().length];

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
            r0 = com.p139e.p140a.C1575c.C1573a.m4088a();
            r0 = r0.length;
            r0 = new int[r0];
            f4863a = r0;
            r0 = 1;
            r1 = f4863a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = com.p139e.p140a.C1575c.C1573a.f4884b;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f4863a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = com.p139e.p140a.C1575c.C1573a.f4883a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.e.a.a.c.1.<clinit>():void");
        }
    }

    public static C1568c m4072a(int i) {
        switch (C15621.f4863a[i - 1]) {
            case 1:
                return new C6532e();
            case 2:
                return new C6531d();
            default:
                throw new IllegalArgumentException("wrong WHEEL_TYPE");
        }
    }
}
