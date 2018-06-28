package mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b;

import java.util.Map;

public final class C2668c {
    private static String m7059a(Map<String, String> map, String str) {
        return (map.get(str) == null || ((String) map.get(str)).isEmpty()) ? null : (String) map.get(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static mobi.mmdt.ott.p246d.p247a.C2531b m7060a(java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.util.Map<java.lang.String, java.lang.String> r40, mobi.mmdt.ott.provider.p384f.C2971k r41, boolean r42, mobi.mmdt.ott.provider.p384f.C2970j r43) {
        /*
        r1 = r40;
        r3 = "MINOR_TYPE";
        r3 = r1.get(r3);
        r3 = (java.lang.String) r3;
        r4 = r3.hashCode();
        r5 = 5;
        r6 = 2;
        r7 = 3;
        r8 = 4;
        r11 = 1;
        switch(r4) {
            case -1611296843: goto L_0x0049;
            case -1172269795: goto L_0x003f;
            case 2060894: goto L_0x0035;
            case 2157948: goto L_0x002b;
            case 2461631: goto L_0x0021;
            case 2571565: goto L_0x0017;
            default: goto L_0x0016;
        };
    L_0x0016:
        goto L_0x0053;
    L_0x0017:
        r4 = "TEXT";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0053;
    L_0x001f:
        r3 = 0;
        goto L_0x0054;
    L_0x0021:
        r4 = "POLL";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0053;
    L_0x0029:
        r3 = r5;
        goto L_0x0054;
    L_0x002b:
        r4 = "FILE";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0053;
    L_0x0033:
        r3 = r8;
        goto L_0x0054;
    L_0x0035:
        r4 = "CALL";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0053;
    L_0x003d:
        r3 = r11;
        goto L_0x0054;
    L_0x003f:
        r4 = "STICKER";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0053;
    L_0x0047:
        r3 = r7;
        goto L_0x0054;
    L_0x0049:
        r4 = "LOCATION";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0053;
    L_0x0051:
        r3 = r6;
        goto L_0x0054;
    L_0x0053:
        r3 = -1;
    L_0x0054:
        r12 = -1;
        switch(r3) {
            case 0: goto L_0x0112;
            case 1: goto L_0x00de;
            case 2: goto L_0x00db;
            case 3: goto L_0x00d8;
            case 4: goto L_0x007e;
            case 5: goto L_0x007a;
            default: goto L_0x0059;
        };
    L_0x0059:
        r2 = new java.lang.StringBuilder;
        r3 = "Undefined type ";
        r2.<init>(r3);
        r3 = "MINOR_TYPE";
        r1 = r1.get(r3);
        r1 = (java.lang.String) r1;
        r2.append(r1);
        r1 = r2.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6736b(r1);
        r1 = new java.lang.Exception;
        r2 = "Undefined type in PrepareMessageModel";
        r1.<init>(r2);
        throw r1;
    L_0x007a:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.VOTE;
        goto L_0x0114;
    L_0x007e:
        r3 = "FILE_TYPE";
        r3 = r1.get(r3);
        r3 = (java.lang.String) r3;
        r4 = r3.hashCode();
        switch(r4) {
            case -2131014526: goto L_0x00b6;
            case 327328941: goto L_0x00ac;
            case 796404377: goto L_0x00a2;
            case 802160718: goto L_0x0098;
            case 808293817: goto L_0x008e;
            default: goto L_0x008d;
        };
    L_0x008d:
        goto L_0x00c0;
    L_0x008e:
        r4 = "FILE_TYPE_VIDEO";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c0;
    L_0x0096:
        r3 = r6;
        goto L_0x00c1;
    L_0x0098:
        r4 = "FILE_TYPE_OTHER";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c0;
    L_0x00a0:
        r3 = r8;
        goto L_0x00c1;
    L_0x00a2:
        r4 = "FILE_TYPE_IMAGE";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c0;
    L_0x00aa:
        r3 = 0;
        goto L_0x00c1;
    L_0x00ac:
        r4 = "FILE_TYPE_PUSH_TO_TALK";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c0;
    L_0x00b4:
        r3 = r7;
        goto L_0x00c1;
    L_0x00b6:
        r4 = "FILE_TYPE_GIF";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c0;
    L_0x00be:
        r3 = r11;
        goto L_0x00c1;
    L_0x00c0:
        r3 = -1;
    L_0x00c1:
        switch(r3) {
            case 0: goto L_0x00d5;
            case 1: goto L_0x00d2;
            case 2: goto L_0x00cf;
            case 3: goto L_0x00cc;
            case 4: goto L_0x00c9;
            default: goto L_0x00c4;
        };
    L_0x00c4:
        r3 = "Undefined file type";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6736b(r3);
    L_0x00c9:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.FILE;
        goto L_0x0114;
    L_0x00cc:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.PUSH_TO_TALK;
        goto L_0x0114;
    L_0x00cf:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.VIDEO;
        goto L_0x0114;
    L_0x00d2:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.GIF;
        goto L_0x0114;
    L_0x00d5:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.IMAGE;
        goto L_0x0114;
    L_0x00d8:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.STICKER;
        goto L_0x0114;
    L_0x00db:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.LOCATION;
        goto L_0x0114;
    L_0x00de:
        r3 = "CALLEE";
        r3 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c.m7059a(r1, r3);
        r4 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r4 = r4.m6928d();
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x010f;
    L_0x00f2:
        r3 = "DURATION";
        r3 = r1.containsKey(r3);
        if (r3 == 0) goto L_0x0107;
    L_0x00fa:
        r3 = "DURATION";
        r3 = r1.get(r3);
        r3 = (java.lang.String) r3;
        r3 = java.lang.Long.parseLong(r3);
        goto L_0x0108;
    L_0x0107:
        r3 = r12;
    L_0x0108:
        r14 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1));
        if (r14 != 0) goto L_0x010f;
    L_0x010c:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.MISSED_CALL;
        goto L_0x0114;
    L_0x010f:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.CALL;
        goto L_0x0114;
    L_0x0112:
        r3 = mobi.mmdt.ott.provider.p384f.C2972l.TEXT;
    L_0x0114:
        r16 = r3;
        r3 = "SEND_TIME_IN_GMT";
        r3 = r1.get(r3);
        r3 = (java.lang.String) r3;
        r3 = java.lang.Long.parseLong(r3);
        r14 = "MINOR_TYPE";
        r14 = r1.get(r14);
        r14 = (java.lang.String) r14;
        r15 = r14.hashCode();
        switch(r15) {
            case -1611296843: goto L_0x0164;
            case -1172269795: goto L_0x015a;
            case 2060894: goto L_0x0150;
            case 2157948: goto L_0x0146;
            case 2461631: goto L_0x013c;
            case 2571565: goto L_0x0132;
            default: goto L_0x0131;
        };
    L_0x0131:
        goto L_0x016d;
    L_0x0132:
        r5 = "TEXT";
        r5 = r14.equals(r5);
        if (r5 == 0) goto L_0x016d;
    L_0x013a:
        r6 = 0;
        goto L_0x016e;
    L_0x013c:
        r6 = "POLL";
        r6 = r14.equals(r6);
        if (r6 == 0) goto L_0x016d;
    L_0x0144:
        r6 = r5;
        goto L_0x016e;
    L_0x0146:
        r5 = "FILE";
        r5 = r14.equals(r5);
        if (r5 == 0) goto L_0x016d;
    L_0x014e:
        r6 = r8;
        goto L_0x016e;
    L_0x0150:
        r5 = "CALL";
        r5 = r14.equals(r5);
        if (r5 == 0) goto L_0x016d;
    L_0x0158:
        r6 = r11;
        goto L_0x016e;
    L_0x015a:
        r5 = "STICKER";
        r5 = r14.equals(r5);
        if (r5 == 0) goto L_0x016d;
    L_0x0162:
        r6 = r7;
        goto L_0x016e;
    L_0x0164:
        r5 = "LOCATION";
        r5 = r14.equals(r5);
        if (r5 == 0) goto L_0x016d;
    L_0x016c:
        goto L_0x016e;
    L_0x016d:
        r6 = -1;
    L_0x016e:
        r5 = 0;
        switch(r6) {
            case 0: goto L_0x030f;
            case 1: goto L_0x026d;
            case 2: goto L_0x0241;
            case 3: goto L_0x01ed;
            case 4: goto L_0x01cc;
            case 5: goto L_0x0193;
            default: goto L_0x0172;
        };
    L_0x0172:
        r2 = new java.lang.StringBuilder;
        r3 = "Undefined type ";
        r2.<init>(r3);
        r3 = "MINOR_TYPE";
        r1 = r1.get(r3);
        r1 = (java.lang.String) r1;
        r2.append(r1);
        r1 = r2.toString();
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6736b(r1);
        r1 = new java.lang.Exception;
        r2 = "Undefined type in PrepareMessageModel";
        r1.<init>(r2);
        throw r1;
    L_0x0193:
        r6 = "POLL_ID";
        r6 = r1.get(r6);
        r6 = (java.lang.String) r6;
        r7 = "POLL_DATA";
        r7 = r1.get(r7);
        r7 = (java.lang.String) r7;
        if (r6 == 0) goto L_0x030f;
    L_0x01a5:
        if (r7 == 0) goto L_0x030f;
    L_0x01a7:
        r8 = r6.isEmpty();
        if (r8 != 0) goto L_0x030f;
    L_0x01ad:
        r8 = r7.isEmpty();
        if (r8 != 0) goto L_0x030f;
    L_0x01b3:
        r8 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x01c3 }
        r8.<init>(r7);	 Catch:{ JSONException -> 0x01c3 }
        r7 = "PollID";
        r8.put(r7, r6);	 Catch:{ JSONException -> 0x01c3 }
        r6 = r8.toString();	 Catch:{ JSONException -> 0x01c3 }
        goto L_0x0308;
    L_0x01c3:
        r0 = move-exception;
        r6 = r0;
        r7 = "Error in polls ";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r7, r6);
        goto L_0x030f;
    L_0x01cc:
        r6 = new mobi.mmdt.ott.logic.a.q.a;
        r6.<init>(r1);
        r6 = r6.f8675a;
        r6 = java.lang.Long.valueOf(r6);
        r7 = " ";
        r8 = r38;
        r7 = r8.equals(r7);
        if (r7 == 0) goto L_0x01e4;
    L_0x01e1:
        r7 = "";
        goto L_0x01e5;
    L_0x01e4:
        r7 = r8;
    L_0x01e5:
        r28 = r5;
        r27 = r6;
        r17 = r7;
        goto L_0x0317;
    L_0x01ed:
        r8 = r38;
        r6 = "STICKER_ID";
        r6 = r1.get(r6);
        r6 = (java.lang.String) r6;
        r7 = "STICKER_PACKAGE_ID";
        r7 = r1.get(r7);
        r7 = (java.lang.String) r7;
        r12 = "STICKER_VERSION";
        r12 = r1.get(r12);
        r12 = (java.lang.String) r12;
        if (r12 == 0) goto L_0x0311;
    L_0x0209:
        if (r6 == 0) goto L_0x0311;
    L_0x020b:
        if (r7 == 0) goto L_0x0311;
    L_0x020d:
        r13 = r12.isEmpty();
        if (r13 != 0) goto L_0x0311;
    L_0x0213:
        r13 = r6.isEmpty();
        if (r13 != 0) goto L_0x0311;
    L_0x0219:
        r13 = r7.isEmpty();
        if (r13 != 0) goto L_0x0311;
    L_0x021f:
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r13.append(r12);
        r12 = "_";
        r13.append(r12);
        r13.append(r7);
        r7 = "_";
        r13.append(r7);
        r13.append(r6);
        r6 = r13.toString();
        r27 = r5;
        r28 = r6;
        goto L_0x0315;
    L_0x0241:
        r8 = r38;
        r6 = new org.json.JSONObject;
        r6.<init>();
        r7 = "LOCATION_LATITUDE";
        r12 = "LOCATION_LATITUDE";
        r12 = r1.get(r12);	 Catch:{ JSONException -> 0x0264 }
        r6.put(r7, r12);	 Catch:{ JSONException -> 0x0264 }
        r7 = "LOCATION_LONGITUDE";
        r12 = "LOCATION_LONGITUDE";
        r12 = r1.get(r12);	 Catch:{ JSONException -> 0x0264 }
        r6.put(r7, r12);	 Catch:{ JSONException -> 0x0264 }
        r6 = r6.toString();	 Catch:{ JSONException -> 0x0264 }
        goto L_0x0308;
    L_0x0264:
        r0 = move-exception;
        r6 = r0;
        r7 = "Exception in parse location json";
        mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6737b(r7, r6);
        goto L_0x0311;
    L_0x026d:
        r6 = "DURATION";
        r6 = r1.containsKey(r6);
        if (r6 == 0) goto L_0x0282;
    L_0x0275:
        r6 = "DURATION";
        r6 = r1.get(r6);
        r6 = (java.lang.String) r6;
        r6 = java.lang.Long.parseLong(r6);
        goto L_0x0283;
    L_0x0282:
        r6 = r12;
    L_0x0283:
        r8 = "CALLEE";
        r8 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c.m7059a(r1, r8);
        r14 = "CALLER";
        r18 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c.m7059a(r1, r14);
        if (r8 == 0) goto L_0x02d9;
    L_0x0291:
        r14 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r14 = r14.m6928d();
        r14 = r8.equals(r14);
        if (r14 == 0) goto L_0x02d9;
    L_0x029f:
        r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r14 != 0) goto L_0x02a7;
    L_0x02a3:
        r14 = 2131690157; // 0x7f0f02ad float:1.900935E38 double:1.053194874E-314;
        goto L_0x02aa;
    L_0x02a7:
        r14 = 2131690047; // 0x7f0f023f float:1.9009127E38 double:1.05319482E-314;
    L_0x02aa:
        r14 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r14);
        r19 = 0;
        r15 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1));
        if (r15 <= 0) goto L_0x02e0;
    L_0x02b4:
        r19 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r9 = r3 - r19;
        r9 = java.lang.Math.abs(r9);
        r19 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r15 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1));
        if (r15 >= 0) goto L_0x02e0;
    L_0x02c4:
        r9 = p000a.p001a.p002a.C0005c.m0a();
        r10 = new mobi.mmdt.ott.logic.a.e.a.b;
        r17 = r10;
        r19 = r8;
        r20 = r3;
        r22 = r6;
        r17.<init>(r18, r19, r20, r22);
        r9.m9d(r10);
        goto L_0x02e0;
    L_0x02d9:
        r8 = 2131690224; // 0x7f0f02f0 float:1.9009486E38 double:1.0531949073E-314;
        r14 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
    L_0x02e0:
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r8.append(r14);
        r9 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r9 != 0) goto L_0x02ef;
    L_0x02ec:
        r6 = "";
        goto L_0x0301;
    L_0x02ef:
        r9 = new java.lang.StringBuilder;
        r10 = " , ";
        r9.<init>(r10);
        r6 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6716e.m17181a(r6);
        r9.append(r6);
        r6 = r9.toString();
    L_0x0301:
        r8.append(r6);
        r6 = r8.toString();
    L_0x0308:
        r27 = r5;
        r28 = r27;
        r17 = r6;
        goto L_0x0317;
    L_0x030f:
        r8 = r38;
    L_0x0311:
        r27 = r5;
        r28 = r27;
    L_0x0315:
        r17 = r8;
    L_0x0317:
        r20 = mobi.mmdt.ott.logic.C2778b.m7093a();
        r6 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r6 = r6.m6928d();
        r7 = r36;
        r6 = r7.equals(r6);
        if (r6 == 0) goto L_0x032e;
    L_0x032b:
        r6 = mobi.mmdt.ott.provider.p384f.C2970j.OUT;
        goto L_0x0330;
    L_0x032e:
        r6 = r43;
    L_0x0330:
        r8 = "REPLY_ON_MESSAGE_ID";
        r29 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c.m7059a(r1, r8);
        r8 = "FORWARD_USER_ID";
        r31 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c.m7059a(r1, r8);
        r8 = "FORWARD_MESSAGE_ID";
        r33 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c.m7059a(r1, r8);
        r8 = "FORWARD_GROUP_TYPE";
        r8 = r1.get(r8);
        r8 = (java.lang.String) r8;
        if (r8 == 0) goto L_0x0382;
    L_0x034c:
        r9 = r8.isEmpty();
        if (r9 != 0) goto L_0x0382;
    L_0x0352:
        r9 = r8.hashCode();
        r10 = 2614219; // 0x27e3cb float:3.663301E-39 double:1.291596E-317;
        if (r9 == r10) goto L_0x036c;
    L_0x035b:
        r10 = 1456933091; // 0x56d708e3 float:1.18216584E14 double:7.198205886E-315;
        if (r9 == r10) goto L_0x0361;
    L_0x0360:
        goto L_0x0377;
    L_0x0361:
        r9 = "CHANNEL";
        r8 = r8.equals(r9);
        if (r8 == 0) goto L_0x0377;
    L_0x0369:
        r34 = r11;
        goto L_0x0379;
    L_0x036c:
        r9 = "USER";
        r8 = r8.equals(r9);
        if (r8 == 0) goto L_0x0377;
    L_0x0374:
        r34 = 0;
        goto L_0x0379;
    L_0x0377:
        r34 = -1;
    L_0x0379:
        switch(r34) {
            case 0: goto L_0x0380;
            case 1: goto L_0x037d;
            default: goto L_0x037c;
        };
    L_0x037c:
        goto L_0x0382;
    L_0x037d:
        r5 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;
        goto L_0x0382;
    L_0x0380:
        r5 = mobi.mmdt.ott.provider.p384f.C2973m.SINGLE;
    L_0x0382:
        r32 = r5;
        r5 = "MAJOR_TYPE";
        r5 = r1.get(r5);
        r5 = (java.lang.String) r5;
        r5 = mobi.mmdt.ott.logic.p261a.p284f.p286b.C2656r.m7055a(r5);
        r8 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c.C26671.f8593a;
        r9 = r5.ordinal();
        r8 = r8[r9];
        switch(r8) {
            case 1: goto L_0x03fc;
            case 2: goto L_0x03f1;
            case 3: goto L_0x039d;
            case 4: goto L_0x039d;
            case 5: goto L_0x039d;
            default: goto L_0x039b;
        };
    L_0x039b:
        goto L_0x0411;
    L_0x039d:
        r8 = "CHANNEL_ID";
        r8 = r1.containsKey(r8);
        if (r8 == 0) goto L_0x03ae;
    L_0x03a5:
        r8 = "CHANNEL_ID";
        r8 = r1.get(r8);
        r8 = (java.lang.String) r8;
        goto L_0x03b0;
    L_0x03ae:
        r8 = r37;
    L_0x03b0:
        r9 = "USER_ID";
        r9 = r1.containsKey(r9);
        if (r9 == 0) goto L_0x03d3;
    L_0x03b8:
        r7 = "USER_ID";
        r1 = r1.get(r7);
        r1 = (java.lang.String) r1;
        r7 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r7 = r7.m6928d();
        r7 = r1.equals(r7);
        if (r7 == 0) goto L_0x03d4;
    L_0x03ce:
        r6 = mobi.mmdt.ott.provider.p384f.C2970j.OUT;
        r7 = mobi.mmdt.ott.provider.p384f.C2971k.SEEN;
        goto L_0x03d6;
    L_0x03d3:
        r1 = r7;
    L_0x03d4:
        r7 = r41;
    L_0x03d6:
        if (r42 == 0) goto L_0x03e6;
    L_0x03d8:
        r9 = mobi.mmdt.ott.provider.p385g.C2980g.m7433a(r8);
        if (r9 == 0) goto L_0x03e6;
    L_0x03de:
        r2 = r9.f9292l;
        r2 = r2 ^ r11;
        r26 = r1;
        r30 = r2;
        goto L_0x03ea;
    L_0x03e6:
        r30 = r42;
        r26 = r1;
    L_0x03ea:
        r22 = r6;
        r23 = r7;
        r24 = r8;
        goto L_0x041b;
    L_0x03f1:
        if (r42 == 0) goto L_0x0411;
    L_0x03f3:
        r1 = mobi.mmdt.ott.provider.p385g.C2980g.m7433a(r37);
        if (r1 == 0) goto L_0x0408;
    L_0x03f9:
        r1 = r1.f9292l;
        goto L_0x0406;
    L_0x03fc:
        if (r42 == 0) goto L_0x0411;
    L_0x03fe:
        r1 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r37);
        if (r1 == 0) goto L_0x0408;
    L_0x0404:
        r1 = r1.f9435u;
    L_0x0406:
        r1 = r1 ^ r11;
        goto L_0x040a;
    L_0x0408:
        r1 = r42;
    L_0x040a:
        r24 = r37;
        r23 = r41;
        r30 = r1;
        goto L_0x0417;
    L_0x0411:
        r24 = r37;
        r23 = r41;
        r30 = r42;
    L_0x0417:
        r22 = r6;
        r26 = r7;
    L_0x041b:
        r1 = new mobi.mmdt.ott.d.a.b;
        r14 = r1;
        r15 = r39;
        r18 = r3;
        r25 = r5;
        r14.<init>(r15, r16, r17, r18, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.g.a.b.c.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, mobi.mmdt.ott.provider.f.k, boolean, mobi.mmdt.ott.provider.f.j):mobi.mmdt.ott.d.a.b");
    }
}
