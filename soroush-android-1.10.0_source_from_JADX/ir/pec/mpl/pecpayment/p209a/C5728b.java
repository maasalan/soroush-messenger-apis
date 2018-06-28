package ir.pec.mpl.pecpayment.p209a;

import com.p067a.p070b.C0994p.C0993b;
import org.json.JSONObject;

class C5728b implements C0993b<JSONObject> {
    final /* synthetic */ C2343a f15699a;

    C5728b(C2343a c2343a) {
        this.f15699a = c2343a;
    }

    public void m12790a(org.json.JSONObject r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r1 = new ir.pec.mpl.pecpayment.b.a.o;
        r1.<init>();
        r0 = new ir.pec.mpl.pecpayment.b.a.g;
        r0.<init>();
        r2 = "Message";	 Catch:{ Exception -> 0x010a }
        r2 = r8.getString(r2);	 Catch:{ Exception -> 0x010a }
        r1.m6526b(r2);	 Catch:{ Exception -> 0x010a }
        r2 = "Status";	 Catch:{ Exception -> 0x010a }
        r2 = r8.getInt(r2);	 Catch:{ Exception -> 0x010a }
        r2 = (short) r2;	 Catch:{ Exception -> 0x010a }
        r1.m6524a(r2);	 Catch:{ Exception -> 0x010a }
        r2 = "Data";	 Catch:{ JSONException -> 0x00f3 }
        r8 = r8.getJSONObject(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "Nonce";	 Catch:{ Exception -> 0x002d }
        r2 = r8.getString(r2);	 Catch:{ Exception -> 0x002d }
        ir.pec.mpl.pecpayment.p209a.C2343a.f7705f = r2;	 Catch:{ Exception -> 0x002d }
        goto L_0x0039;
    L_0x002d:
        r2 = "";	 Catch:{ JSONException -> 0x00f3 }
        r0.m6450b(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "QQQQQQQQQQ";	 Catch:{ JSONException -> 0x00f3 }
        r3 = "1";	 Catch:{ JSONException -> 0x00f3 }
        android.util.Log.d(r2, r3);	 Catch:{ JSONException -> 0x00f3 }
    L_0x0039:
        r2 = "MethodName";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6464i(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "RsaPublicKey";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6460g(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "URL";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6462h(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "Amount";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6454d(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = ir.pec.mpl.pecpayment.p212b.p213a.C2357a.m6424a();	 Catch:{ JSONException -> 0x00f3 }
        r3 = "Amount";	 Catch:{ JSONException -> 0x00f3 }
        r3 = r8.getString(r3);	 Catch:{ JSONException -> 0x00f3 }
        r2.m6428d(r3);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "EShopName";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6456e(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = ir.pec.mpl.pecpayment.p212b.p213a.C2357a.m6424a();	 Catch:{ JSONException -> 0x00f3 }
        r3 = "EShopName";	 Catch:{ JSONException -> 0x00f3 }
        r3 = r8.getString(r3);	 Catch:{ JSONException -> 0x00f3 }
        r2.m6425a(r3);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "UtilityTypeId";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6452c(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "Force4Factor";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getBoolean(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6447a(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "LogoURL";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        ir.pec.mpl.pecpayment.p209a.C2343a.f7702b = r2;	 Catch:{ JSONException -> 0x00f3 }
        r2 = new org.json.JSONArray;	 Catch:{ Exception -> 0x00f7 }
        r3 = "CardList";	 Catch:{ Exception -> 0x00f7 }
        r8 = r8.getString(r3);	 Catch:{ Exception -> 0x00f7 }
        r2.<init>(r8);	 Catch:{ Exception -> 0x00f7 }
        r8 = r2.toString();	 Catch:{ Exception -> 0x00f7 }
        r3 = "[]";	 Catch:{ Exception -> 0x00f7 }
        r8 = r8.equals(r3);	 Catch:{ Exception -> 0x00f7 }
        r3 = 0;	 Catch:{ Exception -> 0x00f7 }
        if (r8 != 0) goto L_0x00bb;	 Catch:{ Exception -> 0x00f7 }
    L_0x00b6:
        r8 = r2.length();	 Catch:{ Exception -> 0x00f7 }
        goto L_0x00bc;	 Catch:{ Exception -> 0x00f7 }
    L_0x00bb:
        r8 = r3;	 Catch:{ Exception -> 0x00f7 }
    L_0x00bc:
        if (r3 >= r8) goto L_0x00f7;	 Catch:{ Exception -> 0x00f7 }
    L_0x00be:
        r4 = r2.getJSONObject(r3);	 Catch:{ Exception -> 0x00f7 }
        r5 = "CardNumber";	 Catch:{ Exception -> 0x00f7 }
        r5 = r4.getString(r5);	 Catch:{ Exception -> 0x00f7 }
        r0.m6458f(r5);	 Catch:{ Exception -> 0x00f7 }
        r5 = "CardToken";	 Catch:{ Exception -> 0x00f7 }
        r5 = r4.getString(r5);	 Catch:{ Exception -> 0x00f7 }
        r0.m6448a(r5);	 Catch:{ Exception -> 0x00f7 }
        r5 = new ir.pec.mpl.pecpayment.b.a.b;	 Catch:{ Exception -> 0x00f7 }
        r5.<init>();	 Catch:{ Exception -> 0x00f7 }
        r6 = "CardNumber";	 Catch:{ Exception -> 0x00f7 }
        r6 = r4.getString(r6);	 Catch:{ Exception -> 0x00f7 }
        r5.m6429a(r6);	 Catch:{ Exception -> 0x00f7 }
        r6 = "CardToken";	 Catch:{ Exception -> 0x00f7 }
        r4 = r4.getString(r6);	 Catch:{ Exception -> 0x00f7 }
        r5.m6430b(r4);	 Catch:{ Exception -> 0x00f7 }
        r4 = ir.pec.mpl.pecpayment.p209a.C2354h.f7711b;	 Catch:{ Exception -> 0x00f7 }
        r4.add(r5);	 Catch:{ Exception -> 0x00f7 }
        r3 = r3 + 1;
        goto L_0x00bc;
    L_0x00f3:
        r8 = move-exception;
        r8.printStackTrace();	 Catch:{ Exception -> 0x010a }
    L_0x00f7:
        r1.m6522a(r0);	 Catch:{ Exception -> 0x010a }
        r0 = r7.f15699a;	 Catch:{ Exception -> 0x010a }
        r2 = r1.m6528d();	 Catch:{ Exception -> 0x010a }
        r3 = r1.m6525b();	 Catch:{ Exception -> 0x010a }
        r4 = 0;	 Catch:{ Exception -> 0x010a }
        r5 = -1;	 Catch:{ Exception -> 0x010a }
        r0.m6360a(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x010a }
        return;
    L_0x010a:
        r8 = move-exception;
        r8.printStackTrace();
        r0 = r7.f15699a;
        r1 = 0;
        r2 = 0;
        r3 = -1;
        r4 = 1;
        r5 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r0.m6360a(r1, r2, r3, r4, r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.a.b.a(org.json.JSONObject):void");
    }

    public /* synthetic */ void onResponse(Object obj) {
        m12790a((JSONObject) obj);
    }
}
