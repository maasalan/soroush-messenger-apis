package mobi.mmdt.ott.logic.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3176a(com.google.firebase.messaging.RemoteMessage r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r0 = r13.m16935a();
        r0 = r0.size();
        r1 = 0;
        if (r0 <= 0) goto L_0x01e7;
    L_0x000b:
        r0 = r13.m16935a();
        r2 = "body";
        r0 = r0.get(r2);
        r0 = (java.lang.String) r0;
        r2 = r13.m16935a();
        r3 = "type";
        r2 = r2.get(r3);
        r2 = (java.lang.String) r2;
        r3 = new java.lang.StringBuilder;
        r4 = "FCM Message data payload: ";
        r3.<init>(r4);
        r4 = r13.m16935a();
        r3.append(r4);
        r4 = " - ";
        r3.append(r4);
        r3.append(r0);
        r0 = " - ";
        r3.append(r0);
        r3.append(r2);
        r0 = " - ";
        r3.append(r0);
        r4 = java.lang.System.currentTimeMillis();
        r3.append(r4);
        r0 = r3.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6732a(r0);
        if (r2 != 0) goto L_0x005c;
    L_0x0056:
        r13 = "type of fcm is null";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6732a(r13);
        return;
    L_0x005c:
        r0 = -1;
        r3 = r2.hashCode();
        r4 = -1944849871; // 0xffffffff8c13f231 float:-1.139735E-31 double:NaN;
        r5 = 1;
        if (r3 == r4) goto L_0x0086;
    L_0x0067:
        r4 = -1388379168; // 0xffffffffad3f03e0 float:-1.0857953E-11 double:NaN;
        if (r3 == r4) goto L_0x007c;
    L_0x006c:
        r4 = 1566000807; // 0x5d5746a7 float:9.6951685E17 double:7.737072E-315;
        if (r3 == r4) goto L_0x0072;
    L_0x0071:
        goto L_0x008f;
    L_0x0072:
        r3 = "DelayNextConnectionTry";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x008f;
    L_0x007a:
        r0 = 2;
        goto L_0x008f;
    L_0x007c:
        r3 = "SingleChat";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x008f;
    L_0x0084:
        r0 = r5;
        goto L_0x008f;
    L_0x0086:
        r3 = "CallRequest";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x008f;
    L_0x008e:
        r0 = r1;
    L_0x008f:
        switch(r0) {
            case 0: goto L_0x01a8;
            case 1: goto L_0x018e;
            case 2: goto L_0x0094;
            default: goto L_0x0092;
        };
    L_0x0092:
        goto L_0x01e7;
    L_0x0094:
        r0 = r13.m16935a();
        r2 = "SendTime";
        r0 = r0.get(r2);
        r0 = (java.lang.String) r0;
        r2 = r13.m16935a();
        r3 = "Timespan";
        r2 = r2.get(r3);
        r2 = (java.lang.String) r2;
        r3 = r13.m16935a();
        r4 = "NextConnectionStartTime";
        r3 = r3.get(r4);
        r3 = (java.lang.String) r3;
        r4 = new java.lang.StringBuilder;
        r5 = "FCM delay for connection < sendtime=";
        r4.<init>(r5);
        r4.append(r0);
        r5 = " - timespan=";
        r4.append(r5);
        r4.append(r2);
        r5 = "nextConnectionStartTime=";
        r4.append(r5);
        r4.append(r3);
        r4 = r4.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6736b(r4);
        r4 = mobi.mmdt.ott.logic.core.C2800c.m7135a();
        r5 = java.lang.Long.parseLong(r0);
        r7 = java.lang.Long.parseLong(r3);
        r0 = java.lang.Integer.parseInt(r2);
        r2 = new java.lang.StringBuilder;
        r3 = "FCM_Delay: sendTime:";
        r2.<init>(r3);
        r2.append(r5);
        r3 = "  NextConnectionStartTime:";
        r2.append(r3);
        r2.append(r7);
        r3 = " Timespan:";
        r2.append(r3);
        r2.append(r0);
        r3 = "  realTime:";
        r2.append(r3);
        r9 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r2.append(r9);
        r2 = r2.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r2);
        r2 = r4.f8858d;
        r9 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r9 < 0) goto L_0x01e7;
    L_0x011c:
        r4.f8858d = r5;
        r2 = new java.util.Random;
        r5 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r2.<init>(r5);
        r0 = r2.nextInt(r0);
        r0 = r0 * 1000;
        r2 = (long) r0;
        r5 = r7 + r2;
        r4.f8857c = r5;
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = r4.f8858d;
        r0 = r0.f8278a;
        r0 = r0.edit();
        r5 = "mobi.mmdt.ott.model.pref.PrefKeys.KEY_FCM_DELAY_SEND_TIME";
        r0 = r0.putLong(r5, r2);
        r0.apply();
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = r4.f8857c;
        r0 = r0.f8278a;
        r0 = r0.edit();
        r5 = "mobi.mmdt.ott.model.pref.PrefKeys.KEY_FCM_DELAY_START_CONNECTION_TIME";
        r0 = r0.putLong(r5, r2);
        r0.apply();
        r0 = r4.m7140b();
        if (r0 == 0) goto L_0x0188;
    L_0x0162:
        mobi.mmdt.ott.logic.core.C2795a.m7133b();
        r0 = mobi.mmdt.ott.MyApplication.m12950a();
        r2 = mobi.mmdt.ott.logic.p360l.C2845b.CONNECTING;
        r0.m12958a(r2);
        r0 = new java.lang.StringBuilder;
        r2 = "TEMPORARILY_UNAVAILABLE.  start_in:";
        r0.<init>(r2);
        r2 = r4.f8857c;
        r0.append(r2);
        r0 = r0.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r0.m6969s(r1);
    L_0x0188:
        r0 = mobi.mmdt.ott.logic.core.C2800c.C2799a.f8850b;
        r4.m7139b(r0);
        goto L_0x01e7;
    L_0x018e:
        r0 = "FCM_CHAT_TRIGGER_SINGLE_CHAT_NEW_MESSAGE raised";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r0.m6926c(r2);
        r0 = mobi.mmdt.ott.logic.core.C2800c.m7135a();
        r2 = mobi.mmdt.ott.logic.core.C2800c.C2799a.f8850b;
    L_0x01a4:
        r0.m7139b(r2);
        goto L_0x01e7;
    L_0x01a8:
        r0 = "FCM_MESSAGE_FOR_CALL_REQUEST";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = r0.m6911X();
        r6 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r8 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r10 = r6 - r8;
        r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r0 >= 0) goto L_0x01e7;
    L_0x01c1:
        r0 = "FCM getLastCallRegisterTime";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r0);
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r0.m6921b(r2);
        r0 = mobi.mmdt.ott.logic.p368p.C6004c.m13279a();	 Catch:{ JSONException -> 0x01d9 }
        r0.m13283b();	 Catch:{ JSONException -> 0x01d9 }
        goto L_0x01e7;
    L_0x01d9:
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r0.m6969s(r5);
        r0 = mobi.mmdt.ott.logic.core.C2800c.m7135a();
        r2 = mobi.mmdt.ott.logic.core.C2800c.C2799a.f8851c;
        goto L_0x01a4;
    L_0x01e7:
        r0 = r13.f18848b;
        if (r0 != 0) goto L_0x01fc;
    L_0x01eb:
        r0 = r13.f18847a;
        r0 = com.google.firebase.messaging.C2091b.m5700a(r0);
        if (r0 == 0) goto L_0x01fc;
    L_0x01f3:
        r0 = new com.google.firebase.messaging.RemoteMessage$a;
        r2 = r13.f18847a;
        r0.<init>(r2);
        r13.f18848b = r0;
    L_0x01fc:
        r13 = r13.f18848b;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.fcm.MyFirebaseMessagingService.a(com.google.firebase.messaging.RemoteMessage):void");
    }
}
