package ir.pec.mpl.pecpayment.p209a;

import com.p067a.p070b.C0994p.C0993b;
import org.json.JSONObject;

class C5730e implements C0993b<JSONObject> {
    final /* synthetic */ C2343a f15701a;

    C5730e(C2343a c2343a) {
        this.f15701a = c2343a;
    }

    public void m12791a(org.json.JSONObject r8) {
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
        r2 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0152 }
        r3 = r8.toString();	 Catch:{ Exception -> 0x0152 }
        android.util.Log.d(r2, r3);	 Catch:{ Exception -> 0x0152 }
        r2 = "Message";	 Catch:{ Exception -> 0x001d }
        r2 = r8.getString(r2);	 Catch:{ Exception -> 0x001d }
        r1.m6526b(r2);	 Catch:{ Exception -> 0x001d }
        goto L_0x0029;
    L_0x001d:
        r2 = "Message Null";	 Catch:{ Exception -> 0x0152 }
        r1.m6526b(r2);	 Catch:{ Exception -> 0x0152 }
        r2 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0152 }
        r3 = "1";	 Catch:{ Exception -> 0x0152 }
        android.util.Log.d(r2, r3);	 Catch:{ Exception -> 0x0152 }
    L_0x0029:
        r2 = "Status";	 Catch:{ Exception -> 0x0034 }
        r2 = r8.getInt(r2);	 Catch:{ Exception -> 0x0034 }
        r2 = (short) r2;	 Catch:{ Exception -> 0x0034 }
        r1.m6524a(r2);	 Catch:{ Exception -> 0x0034 }
        goto L_0x003f;
    L_0x0034:
        r2 = -1;
        r1.m6524a(r2);	 Catch:{ Exception -> 0x0152 }
        r2 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0152 }
        r3 = "2";	 Catch:{ Exception -> 0x0152 }
        android.util.Log.d(r2, r3);	 Catch:{ Exception -> 0x0152 }
    L_0x003f:
        r2 = "Data";	 Catch:{ Exception -> 0x0049 }
        r8 = r8.getString(r2);	 Catch:{ Exception -> 0x0049 }
        r1.m6523a(r8);	 Catch:{ Exception -> 0x0049 }
        goto L_0x0050;
    L_0x0049:
        r8 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0152 }
        r2 = "3";	 Catch:{ Exception -> 0x0152 }
        android.util.Log.d(r8, r2);	 Catch:{ Exception -> 0x0152 }
    L_0x0050:
        r1.m6522a(r0);	 Catch:{ Exception -> 0x0152 }
        r8 = r1.m6527c();	 Catch:{ Exception -> 0x0152 }
        r8 = (ir.pec.mpl.pecpayment.p212b.p213a.C2370n) r8;	 Catch:{ Exception -> 0x0152 }
        r8.m6520a();	 Catch:{ Exception -> 0x0152 }
        r8 = r1.m6528d();	 Catch:{ Exception -> 0x0152 }
        r0 = r1.m6525b();	 Catch:{ Exception -> 0x0132 }
        if (r0 != 0) goto L_0x0112;	 Catch:{ Exception -> 0x0132 }
    L_0x0066:
        r0 = r7.f15701a;	 Catch:{ Exception -> 0x0132 }
        r0 = r0.f7706c;	 Catch:{ Exception -> 0x0132 }
        r0.clear();	 Catch:{ Exception -> 0x0132 }
        r0 = new org.json.JSONArray;	 Catch:{ Exception -> 0x00d7 }
        r0.<init>(r8);	 Catch:{ Exception -> 0x00d7 }
        r2 = 0;	 Catch:{ Exception -> 0x00d7 }
    L_0x0073:
        r3 = r0.length();	 Catch:{ Exception -> 0x00d7 }
        if (r2 >= r3) goto L_0x0139;	 Catch:{ Exception -> 0x00d7 }
    L_0x0079:
        r3 = r0.getJSONObject(r2);	 Catch:{ Exception -> 0x00d7 }
        r4 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x00d7 }
        r4.<init>();	 Catch:{ Exception -> 0x00d7 }
        r5 = "key";	 Catch:{ Exception -> 0x00d7 }
        r5 = r3.getString(r5);	 Catch:{ Exception -> 0x00d7 }
        r4.m6440a(r5);	 Catch:{ Exception -> 0x00d7 }
        r5 = "value";	 Catch:{ Exception -> 0x00d7 }
        r5 = r3.getString(r5);	 Catch:{ Exception -> 0x00d7 }
        r4.m6442b(r5);	 Catch:{ Exception -> 0x00d7 }
        r5 = "key";	 Catch:{ Exception -> 0x00b7 }
        r5 = r3.getString(r5);	 Catch:{ Exception -> 0x00b7 }
        r6 = "نتیجه";	 Catch:{ Exception -> 0x00b7 }
        r5 = r5.equals(r6);	 Catch:{ Exception -> 0x00b7 }
        if (r5 == 0) goto L_0x00a9;	 Catch:{ Exception -> 0x00b7 }
    L_0x00a2:
        r5 = "value";	 Catch:{ Exception -> 0x00b7 }
        r3 = r3.getString(r5);	 Catch:{ Exception -> 0x00b7 }
        r8 = r3;	 Catch:{ Exception -> 0x00b7 }
    L_0x00a9:
        if (r8 != 0) goto L_0x00cd;	 Catch:{ Exception -> 0x00b7 }
    L_0x00ab:
        r3 = r1.m6525b();	 Catch:{ Exception -> 0x00b7 }
        if (r3 != 0) goto L_0x00b4;	 Catch:{ Exception -> 0x00b7 }
    L_0x00b1:
        r3 = "تراکنش موفق";	 Catch:{ Exception -> 0x00b7 }
        goto L_0x00c8;	 Catch:{ Exception -> 0x00b7 }
    L_0x00b4:
        r3 = " خطایی رخ داده";	 Catch:{ Exception -> 0x00b7 }
        goto L_0x00c8;
    L_0x00b7:
        r3 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x00d7 }
        r5 = "4";	 Catch:{ Exception -> 0x00d7 }
        android.util.Log.d(r3, r5);	 Catch:{ Exception -> 0x00d7 }
        if (r8 != 0) goto L_0x00cd;	 Catch:{ Exception -> 0x00d7 }
    L_0x00c0:
        r3 = r1.m6525b();	 Catch:{ Exception -> 0x00d7 }
        if (r3 != 0) goto L_0x00ca;	 Catch:{ Exception -> 0x00d7 }
    L_0x00c6:
        r3 = "تراکنش موفق";	 Catch:{ Exception -> 0x00d7 }
    L_0x00c8:
        r8 = r3;	 Catch:{ Exception -> 0x00d7 }
        goto L_0x00cd;	 Catch:{ Exception -> 0x00d7 }
    L_0x00ca:
        r3 = " خطایی رخ داده";	 Catch:{ Exception -> 0x00d7 }
        goto L_0x00c8;	 Catch:{ Exception -> 0x00d7 }
    L_0x00cd:
        r3 = r7.f15701a;	 Catch:{ Exception -> 0x00d7 }
        r3 = r3.f7706c;	 Catch:{ Exception -> 0x00d7 }
        r3.add(r4);	 Catch:{ Exception -> 0x00d7 }
        r2 = r2 + 1;
        goto L_0x0073;
    L_0x00d7:
        r0 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0132 }
        r2 = "5";	 Catch:{ Exception -> 0x0132 }
        android.util.Log.d(r0, r2);	 Catch:{ Exception -> 0x0132 }
        r0 = r1.m6525b();	 Catch:{ Exception -> 0x0132 }
        if (r0 != 0) goto L_0x00fe;	 Catch:{ Exception -> 0x0132 }
    L_0x00e4:
        r0 = "تراکنش موفق";	 Catch:{ Exception -> 0x0132 }
        r8 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x00fc }
        r8.<init>();	 Catch:{ Exception -> 0x00fc }
        r2 = "نتیجه";	 Catch:{ Exception -> 0x00fc }
        r8.m6440a(r2);	 Catch:{ Exception -> 0x00fc }
        r8.m6442b(r0);	 Catch:{ Exception -> 0x00fc }
        r2 = r7.f15701a;	 Catch:{ Exception -> 0x00fc }
        r2 = r2.f7706c;	 Catch:{ Exception -> 0x00fc }
    L_0x00f7:
        r2.add(r8);	 Catch:{ Exception -> 0x00fc }
        r2 = r0;
        goto L_0x013a;
    L_0x00fc:
        r8 = r0;
        goto L_0x0132;
    L_0x00fe:
        r0 = "خطایی رخ داده";	 Catch:{ Exception -> 0x0132 }
        r8 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x00fc }
        r8.<init>();	 Catch:{ Exception -> 0x00fc }
        r2 = "نتیجه";	 Catch:{ Exception -> 0x00fc }
        r8.m6440a(r2);	 Catch:{ Exception -> 0x00fc }
        r8.m6442b(r0);	 Catch:{ Exception -> 0x00fc }
        r2 = r7.f15701a;	 Catch:{ Exception -> 0x00fc }
        r2 = r2.f7706c;	 Catch:{ Exception -> 0x00fc }
        goto L_0x00f7;
    L_0x0112:
        r0 = r7.f15701a;	 Catch:{ Exception -> 0x0132 }
        r0 = r0.f7706c;	 Catch:{ Exception -> 0x0132 }
        r0.clear();	 Catch:{ Exception -> 0x0132 }
        r0 = new ir.pec.mpl.pecpayment.b.a.e;	 Catch:{ Exception -> 0x0132 }
        r0.<init>();	 Catch:{ Exception -> 0x0132 }
        r2 = "نتیجه";	 Catch:{ Exception -> 0x0132 }
        r0.m6440a(r2);	 Catch:{ Exception -> 0x0132 }
        r2 = r1.m6528d();	 Catch:{ Exception -> 0x0132 }
        r0.m6442b(r2);	 Catch:{ Exception -> 0x0132 }
        r2 = r7.f15701a;	 Catch:{ Exception -> 0x0132 }
        r2 = r2.f7706c;	 Catch:{ Exception -> 0x0132 }
        r2.add(r0);	 Catch:{ Exception -> 0x0132 }
        goto L_0x0139;
    L_0x0132:
        r0 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0152 }
        r2 = "6";	 Catch:{ Exception -> 0x0152 }
        android.util.Log.d(r0, r2);	 Catch:{ Exception -> 0x0152 }
    L_0x0139:
        r2 = r8;
    L_0x013a:
        r0 = r7.f15701a;	 Catch:{ Exception -> 0x014a }
        r3 = r1.m6525b();	 Catch:{ Exception -> 0x014a }
        r4 = 0;	 Catch:{ Exception -> 0x014a }
        r5 = -1;	 Catch:{ Exception -> 0x014a }
        r8 = r7.f15701a;	 Catch:{ Exception -> 0x014a }
        r6 = r8.f7706c;	 Catch:{ Exception -> 0x014a }
        r0.m6361a(r1, r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x014a }
        return;
    L_0x014a:
        r8 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0152 }
        r0 = "7";	 Catch:{ Exception -> 0x0152 }
        android.util.Log.d(r8, r0);	 Catch:{ Exception -> 0x0152 }
        return;
    L_0x0152:
        r8 = move-exception;
        r8.printStackTrace();
        r0 = r7.f15701a;
        r1 = 0;
        r2 = 0;
        r3 = -1;
        r4 = 1;
        r5 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r8 = r7.f15701a;
        r6 = r8.f7706c;
        r0.m6361a(r1, r2, r3, r4, r5, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.a.e.a(org.json.JSONObject):void");
    }

    public /* synthetic */ void onResponse(Object obj) {
        m12791a((JSONObject) obj);
    }
}
