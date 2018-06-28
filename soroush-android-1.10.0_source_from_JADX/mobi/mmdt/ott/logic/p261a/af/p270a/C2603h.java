package mobi.mmdt.ott.logic.p261a.af.p270a;

import org.jivesoftware.smack.roster.packet.RosterPacket.Item;
import org.jivesoftware.smackx.carbons.packet.CarbonExtension.Private;

public final class C2603h {
    public static final int f8490a = 1;
    public static final int f8491b = 2;
    public static final int f8492c = 3;
    public static final int f8493d = 4;
    private static final /* synthetic */ int[] f8494e = new int[]{f8490a, f8491b, f8492c, f8493d};

    static /* synthetic */ class C26021 {
        static final /* synthetic */ int[] f8489a = new int[C2603h.m7038a().length];

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
            r0 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.m7038a();
            r0 = r0.length;
            r0 = new int[r0];
            f8489a = r0;
            r0 = 1;
            r1 = f8489a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.f8490a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f8489a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.f8491b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f8489a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.f8492c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f8489a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = mobi.mmdt.ott.logic.p261a.af.p270a.C2603h.f8493d;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.af.a.h.1.<clinit>():void");
        }
    }

    public static String m7037a(int i) {
        switch (C26021.f8489a[i - 1]) {
            case 1:
                return Item.GROUP;
            case 2:
                return Private.ELEMENT;
            case 3:
                return "channel";
            case 4:
                return "avatar";
            default:
                return Private.ELEMENT;
        }
    }

    public static int[] m7038a() {
        return (int[]) f8494e.clone();
    }
}
