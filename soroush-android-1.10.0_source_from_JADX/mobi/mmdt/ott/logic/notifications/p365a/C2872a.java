package mobi.mmdt.ott.logic.notifications.p365a;

import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.app.C0425x.C0421d;
import android.support.v4.app.C0425x.C0424o;
import android.support.v4.app.C0425x.C4791c;
import android.support.v7.app.C4872n.C4871a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;

public final class C2872a {

    static /* synthetic */ class C28701 {
        static final /* synthetic */ int[] f8968a = new int[C2871a.m7221a().length];

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
            r0 = mobi.mmdt.ott.logic.notifications.p365a.C2872a.C2871a.m7221a();
            r0 = r0.length;
            r0 = new int[r0];
            f8968a = r0;
            r0 = 1;
            r1 = f8968a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.logic.notifications.p365a.C2872a.C2871a.f8969a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f8968a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.logic.notifications.p365a.C2872a.C2871a.f8971c;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f8968a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.logic.notifications.p365a.C2872a.C2871a.f8970b;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.notifications.a.a.1.<clinit>():void");
        }
    }

    private enum C2871a {
        ;
        
        public static final int f8969a = 1;
        public static final int f8970b = 2;
        public static final int f8971c = 3;

        static {
            f8972d = new int[]{f8969a, f8970b, f8971c};
        }

        public static int[] m7221a() {
            return (int[]) f8972d.clone();
        }
    }

    public static C4871a m7222a(String str, String str2, Bitmap bitmap) {
        C0421d c4871a = new C4871a(MyApplication.m12952b());
        C0424o c4791c = new C4791c();
        c4791c.m9137a((CharSequence) str).m9140c(str2);
        C0421d b = c4871a.m852a(c4791c).m849a((int) R.drawable.ic_action_call).m853a((CharSequence) str).m855b((CharSequence) str2);
        b.f1511g = bitmap;
        b.m857c(str2).m856b(2);
        if (VERSION.SDK_INT >= 16) {
            c4871a.f1514j = 2;
        }
        return c4871a;
    }

    public static void m7223a() {
        ((NotificationManager) MyApplication.m12952b().getSystemService("notification")).cancel(120);
    }

    public static void m7224a(java.lang.String r5, int r6, android.support.v7.app.C4872n.C4871a r7) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x004e in {2, 4, 5, 7, 8} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = mobi.mmdt.ott.view.conversation.C3290a.f10056a;
        r1 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r0 = mobi.mmdt.ott.view.tools.C4478a.m8136a(r1, r5, r0);
        r7.f1508d = r0;
        r0 = mobi.mmdt.ott.view.conversation.C3290a.f10058c;
        r1 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r0 = mobi.mmdt.ott.view.tools.C4478a.m8136a(r1, r5, r0);
        r1 = mobi.mmdt.ott.logic.notifications.p365a.C2872a.C28701.f8968a;
        r6 = r6 + -1;
        r6 = r1[r6];
        r1 = 2131231837; // 0x7f08045d float:1.8079766E38 double:1.052968434E-314;
        switch(r6) {
            case 1: goto L_0x0035;
            case 2: goto L_0x002a;
            case 3: goto L_0x001f;
            default: goto L_0x001e;
        };
    L_0x001e:
        return;
    L_0x001f:
        r5 = 2131689917; // 0x7f0f01bd float:1.9008863E38 double:1.0531947556E-314;
        r5 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r5);
        r7.m850a(r1, r5, r0);
        return;
    L_0x002a:
        r5 = 2131690037; // 0x7f0f0235 float:1.9009106E38 double:1.053194815E-314;
    L_0x002d:
        r5 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r5);
        r7.m850a(r1, r5, r0);
        return;
    L_0x0035:
        r6 = 2131231838; // 0x7f08045e float:1.8079768E38 double:1.0529684345E-314;
        r2 = 2131689625; // 0x7f0f0099 float:1.900827E38 double:1.0531946113E-314;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
        r3 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r4 = mobi.mmdt.ott.view.conversation.C3290a.f10057b;
        r5 = mobi.mmdt.ott.view.tools.C4478a.m8136a(r3, r5, r4);
        r7.m850a(r6, r2, r5);
        r5 = 2131690329; // 0x7f0f0359 float:1.9009699E38 double:1.053194959E-314;
        goto L_0x002d;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.notifications.a.a.a(java.lang.String, int, android.support.v7.app.n$a):void");
    }
}
