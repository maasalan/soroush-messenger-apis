package ir.pec.mpl.pecpayment.p209a;

import com.p067a.p070b.C0994p.C0993b;
import org.json.JSONObject;

class C5738s implements C0993b<JSONObject> {
    final /* synthetic */ C2355o f15709a;

    C5738s(C2355o c2355o) {
        this.f15709a = c2355o;
    }

    public void m12795a(org.json.JSONObject r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r1 = new ir.pec.mpl.pecpayment.b.a.o;
        r1.<init>();
        r0 = new ir.pec.mpl.pecpayment.b.a.n;
        r0.<init>();
        r2 = "Message";	 Catch:{ Exception -> 0x0014 }
        r2 = r8.getString(r2);	 Catch:{ Exception -> 0x0014 }
        r1.m6526b(r2);	 Catch:{ Exception -> 0x0014 }
        goto L_0x0019;
    L_0x0014:
        r2 = "Message Null";	 Catch:{ Exception -> 0x011d }
        r1.m6526b(r2);	 Catch:{ Exception -> 0x011d }
    L_0x0019:
        r2 = "Status";	 Catch:{ Exception -> 0x0024 }
        r2 = r8.getInt(r2);	 Catch:{ Exception -> 0x0024 }
        r2 = (short) r2;	 Catch:{ Exception -> 0x0024 }
        r1.m6524a(r2);	 Catch:{ Exception -> 0x0024 }
        goto L_0x0028;
    L_0x0024:
        r2 = -1;
        r1.m6524a(r2);	 Catch:{ Exception -> 0x011d }
    L_0x0028:
        r2 = "Data";	 Catch:{ Exception -> 0x0031 }
        r8 = r8.getString(r2);	 Catch:{ Exception -> 0x0031 }
        r1.m6523a(r8);	 Catch:{ Exception -> 0x0031 }
    L_0x0031:
        r1.m6522a(r0);	 Catch:{ Exception -> 0x011d }
        r8 = r1.m6527c();	 Catch:{ Exception -> 0x011d }
        r8 = (ir.pec.mpl.pecpayment.p212b.p213a.C2370n) r8;	 Catch:{ Exception -> 0x011d }
        r8.m6520a();	 Catch:{ Exception -> 0x011d }
        r8 = r1.m6528d();	 Catch:{ Exception -> 0x011d }
        r0 = r1.m6525b();	 Catch:{ Exception -> 0x0104 }
        if (r0 != 0) goto L_0x00e5;	 Catch:{ Exception -> 0x0104 }
    L_0x0047:
        r0 = r7.f15709a;	 Catch:{ Exception -> 0x0104 }
        r0 = r0.f7731c;	 Catch:{ Exception -> 0x0104 }
        r0.clear();	 Catch:{ Exception -> 0x0104 }
        r0 = new org.json.JSONArray;	 Catch:{ Exception -> 0x00b1 }
        r0.<init>(r8);	 Catch:{ Exception -> 0x00b1 }
        r2 = 0;	 Catch:{ Exception -> 0x00b1 }
    L_0x0054:
        r3 = r0.length();	 Catch:{ Exception -> 0x00b1 }
        if (r2 >= r3) goto L_0x0104;	 Catch:{ Exception -> 0x00b1 }
    L_0x005a:
        r3 = r0.getJSONObject(r2);	 Catch:{ Exception -> 0x00b1 }
        r4 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x00b1 }
        r4.<init>();	 Catch:{ Exception -> 0x00b1 }
        r5 = "key";	 Catch:{ Exception -> 0x00b1 }
        r5 = r3.getString(r5);	 Catch:{ Exception -> 0x00b1 }
        r4.m6440a(r5);	 Catch:{ Exception -> 0x00b1 }
        r5 = "value";	 Catch:{ Exception -> 0x00b1 }
        r5 = r3.getString(r5);	 Catch:{ Exception -> 0x00b1 }
        r4.m6442b(r5);	 Catch:{ Exception -> 0x00b1 }
        r5 = "key";	 Catch:{ Exception -> 0x0098 }
        r5 = r3.getString(r5);	 Catch:{ Exception -> 0x0098 }
        r6 = "نتیجه";	 Catch:{ Exception -> 0x0098 }
        r5 = r5.equals(r6);	 Catch:{ Exception -> 0x0098 }
        if (r5 == 0) goto L_0x008a;	 Catch:{ Exception -> 0x0098 }
    L_0x0083:
        r5 = "value";	 Catch:{ Exception -> 0x0098 }
        r3 = r3.getString(r5);	 Catch:{ Exception -> 0x0098 }
        r8 = r3;	 Catch:{ Exception -> 0x0098 }
    L_0x008a:
        if (r8 != 0) goto L_0x00a7;	 Catch:{ Exception -> 0x0098 }
    L_0x008c:
        r3 = r1.m6525b();	 Catch:{ Exception -> 0x0098 }
        if (r3 != 0) goto L_0x0095;	 Catch:{ Exception -> 0x0098 }
    L_0x0092:
        r3 = "تراکنش موفق";	 Catch:{ Exception -> 0x0098 }
        goto L_0x00a2;	 Catch:{ Exception -> 0x0098 }
    L_0x0095:
        r3 = " خطایی رخ داده";	 Catch:{ Exception -> 0x0098 }
        goto L_0x00a2;
    L_0x0098:
        if (r8 != 0) goto L_0x00a7;
    L_0x009a:
        r3 = r1.m6525b();	 Catch:{ Exception -> 0x00b1 }
        if (r3 != 0) goto L_0x00a4;	 Catch:{ Exception -> 0x00b1 }
    L_0x00a0:
        r3 = "تراکنش موفق";	 Catch:{ Exception -> 0x00b1 }
    L_0x00a2:
        r8 = r3;	 Catch:{ Exception -> 0x00b1 }
        goto L_0x00a7;	 Catch:{ Exception -> 0x00b1 }
    L_0x00a4:
        r3 = " خطایی رخ داده";	 Catch:{ Exception -> 0x00b1 }
        goto L_0x00a2;	 Catch:{ Exception -> 0x00b1 }
    L_0x00a7:
        r3 = r7.f15709a;	 Catch:{ Exception -> 0x00b1 }
        r3 = r3.f7731c;	 Catch:{ Exception -> 0x00b1 }
        r3.add(r4);	 Catch:{ Exception -> 0x00b1 }
        r2 = r2 + 1;
        goto L_0x0054;
    L_0x00b1:
        r0 = r1.m6525b();	 Catch:{ Exception -> 0x0104 }
        if (r0 != 0) goto L_0x00d1;	 Catch:{ Exception -> 0x0104 }
    L_0x00b7:
        r0 = "تراکنش موفق";	 Catch:{ Exception -> 0x0104 }
        r8 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x00cf }
        r8.<init>();	 Catch:{ Exception -> 0x00cf }
        r2 = "نتیجه";	 Catch:{ Exception -> 0x00cf }
        r8.m6440a(r2);	 Catch:{ Exception -> 0x00cf }
        r8.m6442b(r0);	 Catch:{ Exception -> 0x00cf }
        r2 = r7.f15709a;	 Catch:{ Exception -> 0x00cf }
        r2 = r2.f7731c;	 Catch:{ Exception -> 0x00cf }
    L_0x00ca:
        r2.add(r8);	 Catch:{ Exception -> 0x00cf }
        r2 = r0;
        goto L_0x0105;
    L_0x00cf:
        r8 = r0;
        goto L_0x0104;
    L_0x00d1:
        r0 = "خطایی رخ داده";	 Catch:{ Exception -> 0x0104 }
        r8 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x00cf }
        r8.<init>();	 Catch:{ Exception -> 0x00cf }
        r2 = "نتیجه";	 Catch:{ Exception -> 0x00cf }
        r8.m6440a(r2);	 Catch:{ Exception -> 0x00cf }
        r8.m6442b(r0);	 Catch:{ Exception -> 0x00cf }
        r2 = r7.f15709a;	 Catch:{ Exception -> 0x00cf }
        r2 = r2.f7731c;	 Catch:{ Exception -> 0x00cf }
        goto L_0x00ca;
    L_0x00e5:
        r0 = r7.f15709a;	 Catch:{ Exception -> 0x0104 }
        r0 = r0.f7731c;	 Catch:{ Exception -> 0x0104 }
        r0.clear();	 Catch:{ Exception -> 0x0104 }
        r0 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x0104 }
        r0.<init>();	 Catch:{ Exception -> 0x0104 }
        r2 = "نتیجه";	 Catch:{ Exception -> 0x0104 }
        r0.m6440a(r2);	 Catch:{ Exception -> 0x0104 }
        r2 = r1.m6528d();	 Catch:{ Exception -> 0x0104 }
        r0.m6442b(r2);	 Catch:{ Exception -> 0x0104 }
        r2 = r7.f15709a;	 Catch:{ Exception -> 0x0104 }
        r2 = r2.f7731c;	 Catch:{ Exception -> 0x0104 }
        r2.add(r0);	 Catch:{ Exception -> 0x0104 }
    L_0x0104:
        r2 = r8;
    L_0x0105:
        r0 = r7.f15709a;	 Catch:{ Exception -> 0x0115 }
        r3 = r1.m6525b();	 Catch:{ Exception -> 0x0115 }
        r4 = 0;	 Catch:{ Exception -> 0x0115 }
        r5 = -1;	 Catch:{ Exception -> 0x0115 }
        r8 = r7.f15709a;	 Catch:{ Exception -> 0x0115 }
        r6 = r8.f7731c;	 Catch:{ Exception -> 0x0115 }
        r0.m6421a(r1, r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x0115 }
        return;
    L_0x0115:
        r8 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x011d }
        r0 = "7";	 Catch:{ Exception -> 0x011d }
        android.util.Log.d(r8, r0);	 Catch:{ Exception -> 0x011d }
        return;
    L_0x011d:
        r8 = move-exception;
        r8.printStackTrace();
        r0 = r7.f15709a;
        r1 = 0;
        r2 = 0;
        r3 = -1;
        r4 = 1;
        r5 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r8 = r7.f15709a;
        r6 = r8.f7731c;
        r0.m6421a(r1, r2, r3, r4, r5, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.a.s.a(org.json.JSONObject):void");
    }

    public /* synthetic */ void onResponse(Object obj) {
        m12795a((JSONObject) obj);
    }
}
