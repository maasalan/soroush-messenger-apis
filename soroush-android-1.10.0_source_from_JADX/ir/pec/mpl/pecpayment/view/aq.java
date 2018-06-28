package ir.pec.mpl.pecpayment.view;

import android.view.View.OnClickListener;

class aq implements OnClickListener {
    final /* synthetic */ C5740v f7882a;

    aq(C5740v c5740v) {
        this.f7882a = c5740v;
    }

    public void onClick(android.view.View r5) {
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
        r4 = this;
        r5 = 0;
        r0 = r4.f7882a;	 Catch:{ Exception -> 0x0075 }
        r0 = r0.f15753f;	 Catch:{ Exception -> 0x0075 }
        r1 = "UTF-8";	 Catch:{ Exception -> 0x0075 }
        r0 = r0.getBytes(r1);	 Catch:{ Exception -> 0x0075 }
        r0 = android.util.Base64.encodeToString(r0, r5);	 Catch:{ Exception -> 0x0075 }
        r1 = new ir.pec.mpl.pecpayment.a.v;	 Catch:{ Exception -> 0x0075 }
        r1.<init>();	 Catch:{ Exception -> 0x0075 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0075 }
        r2.<init>();	 Catch:{ Exception -> 0x0075 }
        r1 = r1.f7739d;	 Catch:{ Exception -> 0x0075 }
        r2.append(r1);	 Catch:{ Exception -> 0x0075 }
        r2.append(r0);	 Catch:{ Exception -> 0x0075 }
        r0 = r2.toString();	 Catch:{ Exception -> 0x0075 }
        r1 = new android.content.Intent;	 Catch:{ Exception -> 0x0075 }
        r2 = "android.intent.action.VIEW";	 Catch:{ Exception -> 0x0075 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0075 }
        r0 = android.net.Uri.parse(r0);	 Catch:{ Exception -> 0x0075 }
        r0 = r1.setData(r0);	 Catch:{ Exception -> 0x0075 }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0075 }
        r2 = 11;	 Catch:{ Exception -> 0x0075 }
        if (r1 < r2) goto L_0x006d;	 Catch:{ Exception -> 0x0075 }
    L_0x003c:
        r1 = new android.app.AlertDialog$Builder;	 Catch:{ Exception -> 0x0075 }
        r2 = r4.f7882a;	 Catch:{ Exception -> 0x0075 }
        r2 = r2.f15751a;	 Catch:{ Exception -> 0x0075 }
        r3 = ir.pec.mpl.pecpayment.C2338R.style.AppCompatAlertDialogStyle;	 Catch:{ Exception -> 0x0075 }
        r1.<init>(r2, r3);	 Catch:{ Exception -> 0x0075 }
        r2 = "گواهی اصالت درگاه";	 Catch:{ Exception -> 0x0075 }
        r1 = r1.setTitle(r2);	 Catch:{ Exception -> 0x0075 }
        r2 = "لطفا به آدرس صفحه مرورگر و اطلاعات درج شده در گواهی دقت کنید .";	 Catch:{ Exception -> 0x0075 }
        r1 = r1.setMessage(r2);	 Catch:{ Exception -> 0x0075 }
        r2 = "باشه";	 Catch:{ Exception -> 0x0075 }
        r3 = new ir.pec.mpl.pecpayment.view.as;	 Catch:{ Exception -> 0x0075 }
        r3.<init>(r4, r0);	 Catch:{ Exception -> 0x0075 }
        r0 = r1.setPositiveButton(r2, r3);	 Catch:{ Exception -> 0x0075 }
        r1 = "بی خیال";	 Catch:{ Exception -> 0x0075 }
        r2 = new ir.pec.mpl.pecpayment.view.ar;	 Catch:{ Exception -> 0x0075 }
        r2.<init>(r4);	 Catch:{ Exception -> 0x0075 }
        r0 = r0.setNegativeButton(r1, r2);	 Catch:{ Exception -> 0x0075 }
        r0.show();	 Catch:{ Exception -> 0x0075 }
        return;	 Catch:{ Exception -> 0x0075 }
    L_0x006d:
        r1 = r4.f7882a;	 Catch:{ Exception -> 0x0075 }
        r1 = r1.f15751a;	 Catch:{ Exception -> 0x0075 }
        r1.startActivity(r0);	 Catch:{ Exception -> 0x0075 }
        return;
    L_0x0075:
        r0 = r4.f7882a;
        r0 = r0.f15751a;
        r1 = "خطا";
        r5 = android.widget.Toast.makeText(r0, r1, r5);
        r5.show();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.view.aq.onClick(android.view.View):void");
    }
}
