package ir.pec.mpl.pecpayment.p209a;

import com.p067a.p070b.C0994p.C0993b;
import org.json.JSONObject;

class C5734l implements C0993b<JSONObject> {
    final /* synthetic */ C2354h f15705a;

    C5734l(C2354h c2354h) {
        this.f15705a = c2354h;
    }

    public void m12793a(org.json.JSONObject r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r10 = this;
        r0 = new ir.pec.mpl.pecpayment.b.a.o;
        r0.<init>();
        r1 = new ir.pec.mpl.pecpayment.b.a.n;
        r1.<init>();
        r1 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0141 }
        r2 = r11.toString();	 Catch:{ Exception -> 0x0141 }
        android.util.Log.d(r1, r2);	 Catch:{ Exception -> 0x0141 }
        r1 = "Message";	 Catch:{ Exception -> 0x001d }
        r1 = r11.getString(r1);	 Catch:{ Exception -> 0x001d }
        r0.m6526b(r1);	 Catch:{ Exception -> 0x001d }
        goto L_0x0022;
    L_0x001d:
        r1 = "Message Null";	 Catch:{ Exception -> 0x0141 }
        r0.m6526b(r1);	 Catch:{ Exception -> 0x0141 }
    L_0x0022:
        r1 = "Status";	 Catch:{ Exception -> 0x002d }
        r1 = r11.getInt(r1);	 Catch:{ Exception -> 0x002d }
        r1 = (short) r1;	 Catch:{ Exception -> 0x002d }
        r0.m6524a(r1);	 Catch:{ Exception -> 0x002d }
        goto L_0x0031;
    L_0x002d:
        r1 = -1;
        r0.m6524a(r1);	 Catch:{ Exception -> 0x0141 }
    L_0x0031:
        r1 = "Data";	 Catch:{ Exception -> 0x003b }
        r11 = r11.getString(r1);	 Catch:{ Exception -> 0x003b }
        r0.m6523a(r11);	 Catch:{ Exception -> 0x003b }
        goto L_0x0040;
    L_0x003b:
        r11 = "Server Error 1001";	 Catch:{ Exception -> 0x0141 }
        r0.m6523a(r11);	 Catch:{ Exception -> 0x0141 }
    L_0x0040:
        r11 = r0.m6525b();	 Catch:{ Exception -> 0x0141 }
        if (r11 != 0) goto L_0x0102;	 Catch:{ Exception -> 0x0141 }
    L_0x0046:
        r11 = r0.m6528d();	 Catch:{ Exception -> 0x0141 }
        r1 = r10.f15705a;	 Catch:{ Exception -> 0x0141 }
        r1 = r1.f7715c;	 Catch:{ Exception -> 0x0141 }
        r1.clear();	 Catch:{ Exception -> 0x0141 }
        r1 = new org.json.JSONArray;	 Catch:{ Exception -> 0x00b5 }
        r1.<init>(r11);	 Catch:{ Exception -> 0x00b5 }
        r2 = 0;	 Catch:{ Exception -> 0x00b5 }
    L_0x0057:
        r3 = r1.length();	 Catch:{ Exception -> 0x00b5 }
        if (r2 >= r3) goto L_0x00b3;	 Catch:{ Exception -> 0x00b5 }
    L_0x005d:
        r3 = r1.getJSONObject(r2);	 Catch:{ Exception -> 0x00b5 }
        r4 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x00b5 }
        r4.<init>();	 Catch:{ Exception -> 0x00b5 }
        r5 = "key";	 Catch:{ Exception -> 0x00b5 }
        r5 = r3.getString(r5);	 Catch:{ Exception -> 0x00b5 }
        r4.m6440a(r5);	 Catch:{ Exception -> 0x00b5 }
        r5 = "value";	 Catch:{ Exception -> 0x00b5 }
        r5 = r3.getString(r5);	 Catch:{ Exception -> 0x00b5 }
        r4.m6442b(r5);	 Catch:{ Exception -> 0x00b5 }
        r5 = "key";	 Catch:{ Exception -> 0x009c }
        r5 = r3.getString(r5);	 Catch:{ Exception -> 0x009c }
        r6 = "نتیجه";	 Catch:{ Exception -> 0x009c }
        r5 = r5.equals(r6);	 Catch:{ Exception -> 0x009c }
        if (r5 == 0) goto L_0x008d;	 Catch:{ Exception -> 0x009c }
    L_0x0086:
        r5 = "value";	 Catch:{ Exception -> 0x009c }
        r3 = r3.getString(r5);	 Catch:{ Exception -> 0x009c }
        r11 = r3;	 Catch:{ Exception -> 0x009c }
    L_0x008d:
        if (r11 != 0) goto L_0x00a9;	 Catch:{ Exception -> 0x009c }
    L_0x008f:
        r3 = r0.m6525b();	 Catch:{ Exception -> 0x009c }
        if (r3 != 0) goto L_0x0099;	 Catch:{ Exception -> 0x009c }
    L_0x0095:
        r3 = "تراکنش موفق";	 Catch:{ Exception -> 0x009c }
    L_0x0097:
        r11 = r3;	 Catch:{ Exception -> 0x009c }
        goto L_0x00a9;	 Catch:{ Exception -> 0x009c }
    L_0x0099:
        r3 = " خطایی رخ داده";	 Catch:{ Exception -> 0x009c }
        goto L_0x0097;
    L_0x009c:
        if (r11 != 0) goto L_0x00a9;
    L_0x009e:
        r11 = r0.m6525b();	 Catch:{ Exception -> 0x00b5 }
        if (r11 != 0) goto L_0x00a7;	 Catch:{ Exception -> 0x00b5 }
    L_0x00a4:
        r11 = "تراکنش موفق";	 Catch:{ Exception -> 0x00b5 }
        goto L_0x00a9;	 Catch:{ Exception -> 0x00b5 }
    L_0x00a7:
        r11 = " خطایی رخ داده";	 Catch:{ Exception -> 0x00b5 }
    L_0x00a9:
        r3 = r10.f15705a;	 Catch:{ Exception -> 0x00b5 }
        r3 = r3.f7715c;	 Catch:{ Exception -> 0x00b5 }
        r3.add(r4);	 Catch:{ Exception -> 0x00b5 }
        r2 = r2 + 1;
        goto L_0x0057;
    L_0x00b3:
        r5 = r11;
        goto L_0x00e6;
    L_0x00b5:
        r11 = r0.m6525b();	 Catch:{ Exception -> 0x0141 }
        if (r11 != 0) goto L_0x00d2;	 Catch:{ Exception -> 0x0141 }
    L_0x00bb:
        r11 = "تراکنش موفق";	 Catch:{ Exception -> 0x0141 }
        r1 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x0141 }
        r1.<init>();	 Catch:{ Exception -> 0x0141 }
        r2 = "نتیجه";	 Catch:{ Exception -> 0x0141 }
        r1.m6440a(r2);	 Catch:{ Exception -> 0x0141 }
        r1.m6442b(r11);	 Catch:{ Exception -> 0x0141 }
        r2 = r10.f15705a;	 Catch:{ Exception -> 0x0141 }
        r2 = r2.f7715c;	 Catch:{ Exception -> 0x0141 }
    L_0x00ce:
        r2.add(r1);	 Catch:{ Exception -> 0x0141 }
        goto L_0x00b3;	 Catch:{ Exception -> 0x0141 }
    L_0x00d2:
        r11 = "خطایی رخ داده";	 Catch:{ Exception -> 0x0141 }
        r1 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x0141 }
        r1.<init>();	 Catch:{ Exception -> 0x0141 }
        r2 = "نتیجه";	 Catch:{ Exception -> 0x0141 }
        r1.m6440a(r2);	 Catch:{ Exception -> 0x0141 }
        r1.m6442b(r11);	 Catch:{ Exception -> 0x0141 }
        r2 = r10.f15705a;	 Catch:{ Exception -> 0x0141 }
        r2 = r2.f7715c;	 Catch:{ Exception -> 0x0141 }
        goto L_0x00ce;
    L_0x00e6:
        r3 = r10.f15705a;	 Catch:{ Exception -> 0x00fa }
        r4 = r0.m6521a();	 Catch:{ Exception -> 0x00fa }
        r6 = r0.m6525b();	 Catch:{ Exception -> 0x00fa }
        r7 = 0;	 Catch:{ Exception -> 0x00fa }
        r8 = -1;	 Catch:{ Exception -> 0x00fa }
        r11 = r10.f15705a;	 Catch:{ Exception -> 0x00fa }
        r9 = r11.f7715c;	 Catch:{ Exception -> 0x00fa }
        r3.m6401a(r4, r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x00fa }
        return;
    L_0x00fa:
        r11 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0141 }
        r0 = "7";	 Catch:{ Exception -> 0x0141 }
        android.util.Log.d(r11, r0);	 Catch:{ Exception -> 0x0141 }
        return;	 Catch:{ Exception -> 0x0141 }
    L_0x0102:
        r11 = r10.f15705a;	 Catch:{ Exception -> 0x0141 }
        r11 = r11.f7715c;	 Catch:{ Exception -> 0x0141 }
        r11.clear();	 Catch:{ Exception -> 0x0141 }
        r11 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x0141 }
        r11.<init>();	 Catch:{ Exception -> 0x0141 }
        r1 = "نتیجه";	 Catch:{ Exception -> 0x0141 }
        r11.m6440a(r1);	 Catch:{ Exception -> 0x0141 }
        r1 = r0.m6528d();	 Catch:{ Exception -> 0x0141 }
        r11.m6442b(r1);	 Catch:{ Exception -> 0x0141 }
        r1 = r10.f15705a;	 Catch:{ Exception -> 0x0141 }
        r1 = r1.f7715c;	 Catch:{ Exception -> 0x0141 }
        r1.add(r11);	 Catch:{ Exception -> 0x0141 }
        r2 = r10.f15705a;	 Catch:{ Exception -> 0x0139 }
        r3 = r0.m6521a();	 Catch:{ Exception -> 0x0139 }
        r4 = r0.m6528d();	 Catch:{ Exception -> 0x0139 }
        r5 = r0.m6525b();	 Catch:{ Exception -> 0x0139 }
        r6 = 0;	 Catch:{ Exception -> 0x0139 }
        r7 = -1;	 Catch:{ Exception -> 0x0139 }
        r11 = r10.f15705a;	 Catch:{ Exception -> 0x0139 }
        r8 = r11.f7715c;	 Catch:{ Exception -> 0x0139 }
        r2.m6401a(r3, r4, r5, r6, r7, r8);	 Catch:{ Exception -> 0x0139 }
        return;
    L_0x0139:
        r11 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0141 }
        r0 = "8";	 Catch:{ Exception -> 0x0141 }
        android.util.Log.d(r11, r0);	 Catch:{ Exception -> 0x0141 }
        return;
    L_0x0141:
        r11 = move-exception;
        r11.printStackTrace();
        r0 = r10.f15705a;
        r1 = 0;
        r2 = 0;
        r3 = -1;
        r4 = 1;
        r5 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r11 = r10.f15705a;
        r6 = r11.f7715c;
        r0.m6401a(r1, r2, r3, r4, r5, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.a.l.a(org.json.JSONObject):void");
    }

    public /* synthetic */ void onResponse(Object obj) {
        m12793a((JSONObject) obj);
    }
}
