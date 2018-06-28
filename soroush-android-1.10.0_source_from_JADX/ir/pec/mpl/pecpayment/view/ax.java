package ir.pec.mpl.pecpayment.view;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import java.util.List;

class ax implements OnItemClickListener {
    final /* synthetic */ List f7890a;
    final /* synthetic */ ImageView f7891b;
    final /* synthetic */ C5740v f7892c;

    ax(C5740v c5740v, List list, ImageView imageView) {
        this.f7892c = c5740v;
        this.f7890a = list;
        this.f7891b = imageView;
    }

    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
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
        r0 = this;
        r1 = r0.f7890a;
        r1 = r1.get(r3);
        r1 = (ir.pec.mpl.pecpayment.p212b.p213a.C2360d) r1;
        r1 = r1.m6431a();
        r2 = r0.f7892c;
        r2 = r2.f15734D;
        r2 = r2.get(r3);
        r2 = (java.lang.String) r2;
        ir.pec.mpl.pecpayment.view.C5740v.f15730d = r2;
        r2 = 1;
        ir.pec.mpl.pecpayment.view.C5740v.f15729c = r2;
        r4 = new java.lang.StringBuilder;
        r5 = "**** **** ";
        r4.<init>(r5);
        r4.append(r1);
        r1 = r4.toString();
        r4 = r0.f7892c;
        r4 = r4.f15770w;
        r4.setText(r1);
        r1 = r0.f7891b;
        r4 = 0;
        r1.setVisibility(r4);
        r1 = r0.f7891b;	 Catch:{ Exception -> 0x004c }
        r4 = r0.f7890a;	 Catch:{ Exception -> 0x004c }
        r4 = r4.get(r3);	 Catch:{ Exception -> 0x004c }
        r4 = (ir.pec.mpl.pecpayment.p212b.p213a.C2360d) r4;	 Catch:{ Exception -> 0x004c }
        r4 = r4.m6438d();	 Catch:{ Exception -> 0x004c }
        r1.setImageResource(r4);	 Catch:{ Exception -> 0x004c }
        goto L_0x0053;
    L_0x004c:
        r1 = r0.f7891b;
        r4 = ir.pec.mpl.pecpayment.C2338R.drawable.default_bank_pec;
        r1.setImageResource(r4);
    L_0x0053:
        r1 = r0.f7892c;
        r1.f15746P = r3;
        ir.pec.mpl.pecpayment.view.C5740v.f15729c = r2;
        r1 = r0.f7892c;
        r1 = r1.f15769v;
        r1.requestFocus();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.view.ax.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
