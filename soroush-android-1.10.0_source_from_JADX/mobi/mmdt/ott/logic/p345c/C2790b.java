package mobi.mmdt.ott.logic.p345c;

import mobi.mmdt.ott.logic.p360l.p361a.C2841c;
import mobi.mmdt.ott.logic.p360l.p361a.C5990d;
import mobi.mmdt.ott.logic.p360l.p361a.C5991e;
import mobi.mmdt.ott.logic.p360l.p361a.C5992f;
import mobi.mmdt.ott.logic.p360l.p361a.C5993g;
import mobi.mmdt.ott.logic.p360l.p361a.C5994h;
import mobi.mmdt.ott.logic.p360l.p361a.C5995i;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;

public final class C2790b {

    static /* synthetic */ class C27891 {
        static final /* synthetic */ int[] f8813b = new int[C2972l.values().length];

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
            r0 = mobi.mmdt.ott.provider.p384f.C2972l.values();
            r0 = r0.length;
            r0 = new int[r0];
            f8813b = r0;
            r0 = 1;
            r1 = f8813b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = mobi.mmdt.ott.provider.p384f.C2972l.IMAGE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f8813b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = mobi.mmdt.ott.provider.p384f.C2972l.GIF;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f8813b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = mobi.mmdt.ott.provider.p384f.C2972l.VIDEO;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = f8813b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = mobi.mmdt.ott.provider.p384f.C2972l.PUSH_TO_TALK;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = f8813b;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = mobi.mmdt.ott.provider.p384f.C2972l.AUDIO;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = f8813b;	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = mobi.mmdt.ott.provider.p384f.C2972l.FILE;	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5[r6] = r7;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r5 = mobi.mmdt.ott.provider.p384f.C2973m.values();
            r5 = r5.length;
            r5 = new int[r5];
            f8812a = r5;
            r5 = f8812a;	 Catch:{ NoSuchFieldError -> 0x005e }
            r6 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;	 Catch:{ NoSuchFieldError -> 0x005e }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x005e }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x005e }
        L_0x005e:
            r0 = f8812a;	 Catch:{ NoSuchFieldError -> 0x0068 }
            r5 = mobi.mmdt.ott.provider.p384f.C2973m.GROUP;	 Catch:{ NoSuchFieldError -> 0x0068 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0068 }
            r0[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x0068 }
        L_0x0068:
            r0 = f8812a;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = mobi.mmdt.ott.provider.p384f.C2973m.SINGLE;	 Catch:{ NoSuchFieldError -> 0x0072 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0072 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0072 }
        L_0x0072:
            r0 = f8812a;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_DIRECT;	 Catch:{ NoSuchFieldError -> 0x007c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007c }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x007c }
        L_0x007c:
            r0 = f8812a;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r1 = mobi.mmdt.ott.provider.p384f.C2973m.BOT;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.c.b.1.<clinit>():void");
        }
    }

    public static C2841c m7108a(C2973m c2973m, boolean z) {
        switch (c2973m) {
            case CHANNEL:
                return z ? C5990d.m13201a() : C5992f.m13220a();
            case GROUP:
                return C5994h.m13240a();
            case SINGLE:
                return C5995i.m13250a();
            case CHANNEL_DIRECT:
                return C5993g.m13230a();
            case BOT:
                if (C5991e.f16136a == null) {
                    C5991e.f16136a = new C5991e();
                }
                return C5991e.f16136a;
            default:
                return null;
        }
    }
}
