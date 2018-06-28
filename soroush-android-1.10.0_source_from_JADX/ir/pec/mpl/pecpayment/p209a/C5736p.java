package ir.pec.mpl.pecpayment.p209a;

import com.p067a.p070b.C0994p.C0993b;
import org.json.JSONObject;

class C5736p implements C0993b<JSONObject> {
    final /* synthetic */ C2355o f15707a;

    C5736p(C2355o c2355o) {
        this.f15707a = c2355o;
    }

    public void m12794a(org.json.JSONObject r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r1 = new ir.pec.mpl.pecpayment.b.a.o;
        r1.<init>();
        r0 = new ir.pec.mpl.pecpayment.b.a.k;
        r0.<init>();
        r2 = "Message";	 Catch:{ Exception -> 0x0112 }
        r2 = r8.getString(r2);	 Catch:{ Exception -> 0x0112 }
        r1.m6526b(r2);	 Catch:{ Exception -> 0x0112 }
        r2 = "Status";	 Catch:{ Exception -> 0x0112 }
        r2 = r8.getInt(r2);	 Catch:{ Exception -> 0x0112 }
        r2 = (short) r2;	 Catch:{ Exception -> 0x0112 }
        r1.m6524a(r2);	 Catch:{ Exception -> 0x0112 }
        r2 = "Data";	 Catch:{ JSONException -> 0x00f3 }
        r8 = r8.getJSONObject(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "Nonce";	 Catch:{ Exception -> 0x002d }
        r2 = r8.getString(r2);	 Catch:{ Exception -> 0x002d }
        ir.pec.mpl.pecpayment.p209a.C2355o.f7730g = r2;	 Catch:{ Exception -> 0x002d }
        goto L_0x0032;
    L_0x002d:
        r2 = "";	 Catch:{ JSONException -> 0x00f3 }
        r0.m6494b(r2);	 Catch:{ JSONException -> 0x00f3 }
    L_0x0032:
        r2 = "MethodName";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6506h(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "RsaPublicKey";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6502f(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "PaymentURL";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6504g(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "Amount";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6496c(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = ir.pec.mpl.pecpayment.p209a.C2355o.f7730g;	 Catch:{ JSONException -> 0x00f3 }
        r0.m6494b(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = ir.pec.mpl.pecpayment.p212b.p213a.C2372p.m6529a();	 Catch:{ JSONException -> 0x00f3 }
        r3 = "Amount";	 Catch:{ JSONException -> 0x00f3 }
        r3 = r8.getString(r3);	 Catch:{ JSONException -> 0x00f3 }
        r2.m6532c(r3);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "EShopName";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6498d(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = ir.pec.mpl.pecpayment.p212b.p213a.C2372p.m6529a();	 Catch:{ JSONException -> 0x00f3 }
        r3 = "EShopName";	 Catch:{ JSONException -> 0x00f3 }
        r3 = r8.getString(r3);	 Catch:{ JSONException -> 0x00f3 }
        r2.m6530a(r3);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "OperatorTypeId";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getInt(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6490a(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "Force4Factor";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getBoolean(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ JSONException -> 0x00f3 }
        r0.m6491a(r2);	 Catch:{ JSONException -> 0x00f3 }
        r2 = "LogoURL";	 Catch:{ JSONException -> 0x00f3 }
        r2 = r8.getString(r2);	 Catch:{ JSONException -> 0x00f3 }
        ir.pec.mpl.pecpayment.p209a.C2355o.f7727b = r2;	 Catch:{ JSONException -> 0x00f3 }
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
        r0.m6500e(r5);	 Catch:{ Exception -> 0x00f7 }
        r5 = "CardToken";	 Catch:{ Exception -> 0x00f7 }
        r5 = r4.getString(r5);	 Catch:{ Exception -> 0x00f7 }
        r0.m6492a(r5);	 Catch:{ Exception -> 0x00f7 }
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
        r8.printStackTrace();	 Catch:{ Exception -> 0x0112 }
    L_0x00f7:
        r1.m6522a(r0);	 Catch:{ Exception -> 0x0112 }
        r0 = r7.f15707a;	 Catch:{ Exception -> 0x010a }
        r2 = r1.m6528d();	 Catch:{ Exception -> 0x010a }
        r3 = r1.m6525b();	 Catch:{ Exception -> 0x010a }
        r4 = 0;	 Catch:{ Exception -> 0x010a }
        r5 = -1;	 Catch:{ Exception -> 0x010a }
        r0.m6420a(r1, r2, r3, r4, r5);	 Catch:{ Exception -> 0x010a }
        return;
    L_0x010a:
        r8 = "QQQQQQQQQQ";	 Catch:{ Exception -> 0x0112 }
        r0 = "7";	 Catch:{ Exception -> 0x0112 }
        android.util.Log.d(r8, r0);	 Catch:{ Exception -> 0x0112 }
        return;
    L_0x0112:
        r8 = move-exception;
        r8.printStackTrace();
        r0 = r7.f15707a;
        r1 = 0;
        r2 = 0;
        r3 = -1;
        r4 = 1;
        r5 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r0.m6420a(r1, r2, r3, r4, r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.pec.mpl.pecpayment.a.p.a(org.json.JSONObject):void");
    }

    public /* synthetic */ void onResponse(Object obj) {
        m12794a((JSONObject) obj);
    }
}
