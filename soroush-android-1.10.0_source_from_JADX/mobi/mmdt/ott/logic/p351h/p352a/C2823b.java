package mobi.mmdt.ott.logic.p351h.p352a;

import android.app.IntentService;
import android.content.Intent;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public class C2823b extends IntentService {

    static /* synthetic */ class C28221 {
        static final /* synthetic */ int[] f8894a = new int[C2824c.m7162a().length];

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
            r0 = mobi.mmdt.ott.logic.p351h.p352a.C2824c.m7162a();
            r0 = r0.length;
            r0 = new int[r0];
            f8894a = r0;
            r0 = 1;
            r1 = f8894a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.logic.p351h.p352a.C2824c.f8897c;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f8894a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.logic.p351h.p352a.C2824c.f8895a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f8894a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.logic.p351h.p352a.C2824c.f8896b;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.h.a.b.1.<clinit>():void");
        }
    }

    public C2823b() {
        super(C2823b.class.getName());
    }

    protected void onHandleIntent(Intent intent) {
        long j;
        switch (C28221.f8894a[C2824c.m7162a()[C2535a.m6888a().f8278a.getInt("mobi.mmdt.ott.model.pref.KEY_KEEP_MEDIA", C2824c.f8897c - 1)] - 1]) {
            case 1:
                return;
            case 2:
                j = 604800000;
                break;
            case 3:
                j = -1702967296;
                break;
            default:
                j = 0;
                break;
        }
        C2821a.m7157a(j);
    }
}
