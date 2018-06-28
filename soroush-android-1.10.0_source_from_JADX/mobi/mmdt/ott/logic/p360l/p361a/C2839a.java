package mobi.mmdt.ott.logic.p360l.p361a;

import java.util.Map;
import mobi.mmdt.ott.logic.core.C2802d;
import mobi.mmdt.ott.logic.p360l.C2846c;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p389k.C2999a;

public abstract class C2839a {
    protected C2839a() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m7172a(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.Long r20, java.lang.String r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30) {
        /*
        r8 = r16;
        r9 = r17;
        r10 = r23;
        r11 = mobi.mmdt.ott.logic.p360l.C2846c.m7209a();
        r12 = r20.longValue();
        r0 = r22.intValue();
        r14 = (long) r0;
        r1 = "FILE";
        r2 = java.lang.String.valueOf(r25);
        r0 = r10;
        r3 = r24;
        r4 = r8;
        r5 = r28;
        r6 = r29;
        r7 = r30;
        r0 = mobi.mmdt.ott.logic.p360l.C2846c.m7208a(r0, r1, r2, r3, r4, r5, r6, r7);
        r1 = "FILE_TYPE";
        r2 = "FILE_TYPE_PUSH_TO_TALK";
        r0.put(r1, r2);
        r1 = "FILE_NAME";
        r2 = r21;
        r0.put(r1, r2);
        r1 = "FILE_SIZE";
        r2 = java.lang.String.valueOf(r12);
        r0.put(r1, r2);
        r1 = "FILE_URL";
        r2 = r19;
        r0.put(r1, r2);
        r1 = "FILE_ID";
        r2 = r18;
        r0.put(r1, r2);
        r1 = "FILE_TYPE_PUSH_TO_TALK_DURATION";
        r2 = java.lang.String.valueOf(r14);
        r0.put(r1, r2);
        r1 = r23.hashCode();
        switch(r1) {
            case -2029760204: goto L_0x0085;
            case -654356795: goto L_0x007b;
            case 65959: goto L_0x0071;
            case 763157957: goto L_0x0067;
            case 1796630840: goto L_0x005d;
            default: goto L_0x005c;
        };
    L_0x005c:
        goto L_0x008f;
    L_0x005d:
        r1 = "GROUP_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x008f;
    L_0x0065:
        r1 = 1;
        goto L_0x0090;
    L_0x0067:
        r1 = "SIMPLE_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x008f;
    L_0x006f:
        r1 = 0;
        goto L_0x0090;
    L_0x0071:
        r1 = "BOT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x008f;
    L_0x0079:
        r1 = 4;
        goto L_0x0090;
    L_0x007b:
        r1 = "CHANNEL_DIRECT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x008f;
    L_0x0083:
        r1 = 3;
        goto L_0x0090;
    L_0x0085:
        r1 = "CHANNEL_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x008f;
    L_0x008d:
        r1 = 2;
        goto L_0x0090;
    L_0x008f:
        r1 = -1;
    L_0x0090:
        switch(r1) {
            case 0: goto L_0x00fa;
            case 1: goto L_0x00f0;
            case 2: goto L_0x00c3;
            case 3: goto L_0x009e;
            case 4: goto L_0x0094;
            default: goto L_0x0093;
        };
    L_0x0093:
        goto L_0x0103;
    L_0x0094:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7106b(r8, r2, r9, r0);
        goto L_0x0103;
    L_0x009e:
        r1 = "MAJOR_TYPE";
        r2 = "CHANNEL_DIRECT";
        r0.put(r1, r2);
        r1 = "USER_ID";
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = r2.m6928d();
        r0.put(r1, r2);
        r1 = "CHANNEL_ID";
        r0.put(r1, r8);
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r3 = r27;
        r1.m7102a(r3, r2, r9, r0);
        goto L_0x0103;
    L_0x00c3:
        r1 = mobi.mmdt.ott.provider.p385g.C2980g.m7451l(r16);
        r2 = "MAJOR_TYPE";
        r3 = "CHANNEL_REPLY";
        r0.put(r2, r3);
        r2 = "REPLY_ON_THREAD_ID";
        r0.put(r2, r8);
        r2 = "SENDER_NICKNAME";
        r3 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r3 = r3.m6928d();
        r3 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r3);
        r3 = r3.f9416b;
        r0.put(r2, r3);
        r2 = r11.f8932a;
        r2 = r2.f16147a;
        r3 = " ";
        r2.m7102a(r1, r3, r9, r0);
        goto L_0x0103;
    L_0x00f0:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7107c(r8, r2, r9, r0);
        goto L_0x0103;
    L_0x00fa:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7102a(r8, r2, r9, r0);
    L_0x0103:
        r0 = mobi.mmdt.ott.logic.core.C2802d.m7142a();
        r0.m7143a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.l.a.a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m7173a(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
        r8 = r12;
        r9 = r13;
        r10 = r14;
        r11 = mobi.mmdt.ott.logic.p360l.C2846c.m7209a();
        r1 = "LOCATION";
        r2 = java.lang.String.valueOf(r17);
        r0 = r10;
        r3 = r19;
        r4 = r8;
        r5 = r21;
        r6 = r22;
        r7 = r23;
        r0 = mobi.mmdt.ott.logic.p360l.C2846c.m7208a(r0, r1, r2, r3, r4, r5, r6, r7);
        r1 = "LOCATION_LATITUDE";
        r2 = r15;
        r0.put(r1, r2);
        r1 = "LOCATION_LONGITUDE";
        r2 = r16;
        r0.put(r1, r2);
        r1 = r10.hashCode();
        switch(r1) {
            case -2029760204: goto L_0x0058;
            case -654356795: goto L_0x004e;
            case 65959: goto L_0x0044;
            case 763157957: goto L_0x003a;
            case 1796630840: goto L_0x0030;
            default: goto L_0x002f;
        };
    L_0x002f:
        goto L_0x0062;
    L_0x0030:
        r1 = "GROUP_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x0038:
        r1 = 1;
        goto L_0x0063;
    L_0x003a:
        r1 = "SIMPLE_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x0042:
        r1 = 0;
        goto L_0x0063;
    L_0x0044:
        r1 = "BOT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x004c:
        r1 = 4;
        goto L_0x0063;
    L_0x004e:
        r1 = "CHANNEL_DIRECT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x0056:
        r1 = 3;
        goto L_0x0063;
    L_0x0058:
        r1 = "CHANNEL_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x0060:
        r1 = 2;
        goto L_0x0063;
    L_0x0062:
        r1 = -1;
    L_0x0063:
        switch(r1) {
            case 0: goto L_0x00cd;
            case 1: goto L_0x00c3;
            case 2: goto L_0x0096;
            case 3: goto L_0x0071;
            case 4: goto L_0x0067;
            default: goto L_0x0066;
        };
    L_0x0066:
        goto L_0x00d6;
    L_0x0067:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7106b(r8, r2, r9, r0);
        goto L_0x00d6;
    L_0x0071:
        r1 = "MAJOR_TYPE";
        r2 = "CHANNEL_DIRECT";
        r0.put(r1, r2);
        r1 = "USER_ID";
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = r2.m6928d();
        r0.put(r1, r2);
        r1 = "CHANNEL_ID";
        r0.put(r1, r8);
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r3 = r20;
        r1.m7102a(r3, r2, r9, r0);
        goto L_0x00d6;
    L_0x0096:
        r1 = mobi.mmdt.ott.provider.p385g.C2980g.m7451l(r8);
        r2 = "MAJOR_TYPE";
        r3 = "CHANNEL_REPLY";
        r0.put(r2, r3);
        r2 = "REPLY_ON_THREAD_ID";
        r0.put(r2, r8);
        r2 = "SENDER_NICKNAME";
        r3 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r3 = r3.m6928d();
        r3 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r3);
        r3 = r3.f9416b;
        r0.put(r2, r3);
        r2 = r11.f8932a;
        r2 = r2.f16147a;
        r3 = " ";
        r2.m7102a(r1, r3, r9, r0);
        goto L_0x00d6;
    L_0x00c3:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7107c(r8, r2, r9, r0);
        goto L_0x00d6;
    L_0x00cd:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7102a(r8, r2, r9, r0);
    L_0x00d6:
        r0 = mobi.mmdt.ott.logic.core.C2802d.m7142a();
        r0.m7143a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.l.a.a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    protected static void m7174a(String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, long j, String str9, String str10, String str11, String str12) {
        String str13 = str;
        String str14 = str2;
        String str15 = str7;
        C2846c a = C2846c.m7209a();
        long longValue = l.longValue();
        Map a2 = C2846c.m7208a(str15, "FILE", String.valueOf(j), str8, str13, str10, str11, str12);
        a2.put("FILE_TYPE", "FILE_TYPE_OTHER");
        a2.put("FILE_NAME", str6);
        a2.put("FILE_SIZE", String.valueOf(longValue));
        a2.put("FILE_ID", str4);
        a2.put("FILE_URL", str5);
        String str16 = str3.isEmpty() ? " " : str3;
        Object obj = -1;
        switch (str7.hashCode()) {
            case -2029760204:
                if (str15.equals("CHANNEL_CHAT")) {
                    obj = 2;
                    break;
                }
                break;
            case -654356795:
                if (str15.equals("CHANNEL_DIRECT")) {
                    obj = 3;
                    break;
                }
                break;
            case 65959:
                if (str15.equals("BOT")) {
                    obj = 4;
                    break;
                }
                break;
            case 763157957:
                if (str15.equals("SIMPLE_CHAT")) {
                    obj = null;
                    break;
                }
                break;
            case 1796630840:
                if (str15.equals("GROUP_CHAT")) {
                    obj = 1;
                    break;
                }
                break;
            default:
                break;
        }
        switch (obj) {
            case null:
                a.f8932a.f16147a.m7102a(str13, str16, str14, a2);
                break;
            case 1:
                a.f8932a.f16147a.m7107c(str13, str16, str14, a2);
                break;
            case 2:
                String l2 = C2980g.m7451l(str13);
                a2.put("MAJOR_TYPE", "CHANNEL_REPLY");
                a2.put("REPLY_ON_THREAD_ID", str13);
                a2.put("SENDER_NICKNAME", C2999a.m7500a(C2535a.m6888a().m6928d()).f9416b);
                a.f8932a.f16147a.m7102a(l2, str16, str14, a2);
                break;
            case 3:
                a2.put("MAJOR_TYPE", "CHANNEL_DIRECT");
                a2.put("USER_ID", C2535a.m6888a().m6928d());
                a2.put("CHANNEL_ID", str13);
                a.f8932a.f16147a.m7102a(str9, str16, str14, a2);
                break;
            case 4:
                a.f8932a.f16147a.m7106b(str13, str16, str14, a2);
                break;
            default:
                break;
        }
        C2802d.m7142a().m7143a(str14);
    }

    protected static void m7175a(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, Integer num, String str8, String str9, long j, String str10, int i, int i2, String str11, String str12, String str13) {
        String str14 = str;
        String str15 = str2;
        String str16 = str8;
        C2846c a = C2846c.m7209a();
        long longValue = l.longValue();
        long intValue = (long) num.intValue();
        Map a2 = C2846c.m7208a(str16, "FILE", String.valueOf(j), str9, str14, str11, str12, str13);
        a2.put("FILE_URL", str5);
        a2.put("FILE_THUMBNAIL_URL", str6);
        a2.put("FILE_SIZE", String.valueOf(longValue));
        a2.put("FILE_ID", str4);
        a2.put("FILE_TYPE", "FILE_TYPE_VIDEO");
        a2.put("FILE_NAME", str7);
        a2.put("FILE_IMAGE_WIDTH", String.valueOf(i));
        a2.put("FILE_IMAGE_HEIGHT", String.valueOf(i2));
        a2.put("FILE_TYPE_VIDEO_DURATION", String.valueOf(intValue));
        String str17 = str3.isEmpty() ? " " : str3;
        Object obj = -1;
        switch (str8.hashCode()) {
            case -2029760204:
                if (str16.equals("CHANNEL_CHAT")) {
                    obj = 2;
                    break;
                }
                break;
            case -654356795:
                if (str16.equals("CHANNEL_DIRECT")) {
                    obj = 3;
                    break;
                }
                break;
            case 65959:
                if (str16.equals("BOT")) {
                    obj = 4;
                    break;
                }
                break;
            case 763157957:
                if (str16.equals("SIMPLE_CHAT")) {
                    obj = null;
                    break;
                }
                break;
            case 1796630840:
                if (str16.equals("GROUP_CHAT")) {
                    obj = 1;
                    break;
                }
                break;
            default:
                break;
        }
        switch (obj) {
            case null:
                a.f8932a.f16147a.m7102a(str14, str17, str15, a2);
                break;
            case 1:
                a.f8932a.f16147a.m7107c(str14, str17, str15, a2);
                break;
            case 2:
                String l2 = C2980g.m7451l(str);
                a2.put("MAJOR_TYPE", "CHANNEL_REPLY");
                a2.put("REPLY_ON_THREAD_ID", str14);
                a2.put("SENDER_NICKNAME", C2999a.m7500a(C2535a.m6888a().m6928d()).f9416b);
                a.f8932a.f16147a.m7102a(l2, str17, str15, a2);
                break;
            case 3:
                a2.put("MAJOR_TYPE", "CHANNEL_DIRECT");
                a2.put("USER_ID", C2535a.m6888a().m6928d());
                a2.put("CHANNEL_ID", str14);
                a.f8932a.f16147a.m7102a(str10, str17, str15, a2);
                break;
            case 4:
                a.f8932a.f16147a.m7106b(str14, str17, str15, a2);
                break;
            default:
                break;
        }
        C2802d.m7142a().m7143a(str15);
    }

    protected static void m7176a(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, String str9, long j, String str10, int i, int i2, String str11, String str12, String str13) {
        String str14 = str;
        String str15 = str2;
        String str16 = str8;
        C2846c a = C2846c.m7209a();
        long longValue = l.longValue();
        Map a2 = C2846c.m7208a(str16, "FILE", String.valueOf(j), str9, str14, str11, str12, str13);
        a2.put("FILE_TYPE", "FILE_TYPE_IMAGE");
        a2.put("FILE_NAME", str7);
        a2.put("FILE_SIZE", String.valueOf(longValue));
        a2.put("FILE_ID", str4);
        a2.put("FILE_URL", str5);
        a2.put("FILE_THUMBNAIL_URL", str6);
        a2.put("FILE_IMAGE_WIDTH", String.valueOf(i));
        a2.put("FILE_IMAGE_HEIGHT", String.valueOf(i2));
        String str17 = str3.isEmpty() ? " " : str3;
        Object obj = -1;
        switch (str8.hashCode()) {
            case -2029760204:
                if (str16.equals("CHANNEL_CHAT")) {
                    obj = 2;
                    break;
                }
                break;
            case -654356795:
                if (str16.equals("CHANNEL_DIRECT")) {
                    obj = 3;
                    break;
                }
                break;
            case 65959:
                if (str16.equals("BOT")) {
                    obj = 4;
                    break;
                }
                break;
            case 763157957:
                if (str16.equals("SIMPLE_CHAT")) {
                    obj = null;
                    break;
                }
                break;
            case 1796630840:
                if (str16.equals("GROUP_CHAT")) {
                    obj = 1;
                    break;
                }
                break;
            default:
                break;
        }
        switch (obj) {
            case null:
                a.f8932a.f16147a.m7102a(str14, str17, str15, a2);
                break;
            case 1:
                a.f8932a.f16147a.m7107c(str14, str17, str15, a2);
                break;
            case 2:
                String l2 = C2980g.m7451l(str14);
                a2.put("MAJOR_TYPE", "CHANNEL_REPLY");
                a2.put("REPLY_ON_THREAD_ID", str14);
                a2.put("SENDER_NICKNAME", C2999a.m7500a(C2535a.m6888a().m6928d()).f9416b);
                a.f8932a.f16147a.m7102a(l2, str17, str15, a2);
                break;
            case 3:
                a2.put("MAJOR_TYPE", "CHANNEL_DIRECT");
                a2.put("USER_ID", C2535a.m6888a().m6928d());
                a2.put("CHANNEL_ID", str14);
                a.f8932a.f16147a.m7102a(str10, str17, str15, a2);
                break;
            case 4:
                a.f8932a.f16147a.m7106b(str14, str17, str15, a2);
                break;
            default:
                break;
        }
        C2802d.m7142a().m7143a(str15);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m7177a(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
        r8 = r12;
        r9 = r13;
        r10 = r17;
        r11 = mobi.mmdt.ott.logic.p360l.C2846c.m7209a();
        r1 = "STICKER";
        r2 = java.lang.String.valueOf(r19);
        r0 = r10;
        r3 = r18;
        r4 = r8;
        r5 = r22;
        r6 = r23;
        r7 = r24;
        r0 = mobi.mmdt.ott.logic.p360l.C2846c.m7208a(r0, r1, r2, r3, r4, r5, r6, r7);
        r1 = "STICKER_VERSION";
        r2 = r14;
        r0.put(r1, r2);
        r1 = "STICKER_PACKAGE_ID";
        r2 = r15;
        r0.put(r1, r2);
        r1 = "STICKER_ID";
        r2 = r16;
        r0.put(r1, r2);
        r1 = r17.hashCode();
        switch(r1) {
            case -2029760204: goto L_0x005f;
            case -654356795: goto L_0x0055;
            case 65959: goto L_0x004b;
            case 763157957: goto L_0x0041;
            case 1796630840: goto L_0x0037;
            default: goto L_0x0036;
        };
    L_0x0036:
        goto L_0x0069;
    L_0x0037:
        r1 = "GROUP_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0069;
    L_0x003f:
        r1 = 1;
        goto L_0x006a;
    L_0x0041:
        r1 = "SIMPLE_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0069;
    L_0x0049:
        r1 = 0;
        goto L_0x006a;
    L_0x004b:
        r1 = "BOT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0069;
    L_0x0053:
        r1 = 4;
        goto L_0x006a;
    L_0x0055:
        r1 = "CHANNEL_DIRECT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0069;
    L_0x005d:
        r1 = 3;
        goto L_0x006a;
    L_0x005f:
        r1 = "CHANNEL_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0069;
    L_0x0067:
        r1 = 2;
        goto L_0x006a;
    L_0x0069:
        r1 = -1;
    L_0x006a:
        switch(r1) {
            case 0: goto L_0x00da;
            case 1: goto L_0x00d0;
            case 2: goto L_0x009e;
            case 3: goto L_0x0079;
            case 4: goto L_0x006f;
            default: goto L_0x006d;
        };
    L_0x006d:
        goto L_0x00e3;
    L_0x006f:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7106b(r8, r2, r9, r0);
        goto L_0x00e3;
    L_0x0079:
        r1 = "MAJOR_TYPE";
        r2 = "CHANNEL_DIRECT";
        r0.put(r1, r2);
        r1 = "USER_ID";
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = r2.m6928d();
        r0.put(r1, r2);
        r1 = "CHANNEL_ID";
        r0.put(r1, r8);
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r3 = r21;
        r1.m7102a(r3, r2, r9, r0);
        goto L_0x00e3;
    L_0x009e:
        r1 = mobi.mmdt.ott.provider.p385g.C2980g.m7451l(r8);
        r2 = "REPLY_ON_MESSAGE_ID";
        r0.remove(r2);
        r2 = "MAJOR_TYPE";
        r3 = "CHANNEL_REPLY";
        r0.put(r2, r3);
        r2 = "REPLY_ON_THREAD_ID";
        r0.put(r2, r8);
        r2 = "SENDER_NICKNAME";
        r3 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r3 = r3.m6928d();
        r3 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r3);
        r3 = r3.f9416b;
        r0.put(r2, r3);
        r2 = r11.f8932a;
        r2 = r2.f16147a;
        r3 = " ";
        r2.m7102a(r1, r3, r9, r0);
        goto L_0x00e3;
    L_0x00d0:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7107c(r8, r2, r9, r0);
        goto L_0x00e3;
    L_0x00da:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7102a(r8, r2, r9, r0);
    L_0x00e3:
        r0 = mobi.mmdt.ott.logic.core.C2802d.m7142a();
        r0.m7143a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.l.a.a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void a_(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
        r8 = r13;
        r9 = r14;
        r10 = r15;
        r11 = r16;
        r12 = mobi.mmdt.ott.logic.p360l.C2846c.m7209a();
        r1 = "TEXT";
        r2 = java.lang.String.valueOf(r18);
        r0 = r11;
        r3 = r17;
        r4 = r8;
        r5 = r21;
        r6 = r22;
        r7 = r23;
        r0 = mobi.mmdt.ott.logic.p360l.C2846c.m7208a(r0, r1, r2, r3, r4, r5, r6, r7);
        r1 = r16.hashCode();
        switch(r1) {
            case -2029760204: goto L_0x004d;
            case -654356795: goto L_0x0043;
            case 65959: goto L_0x0039;
            case 763157957: goto L_0x002f;
            case 1796630840: goto L_0x0025;
            default: goto L_0x0024;
        };
    L_0x0024:
        goto L_0x0057;
    L_0x0025:
        r1 = "GROUP_CHAT";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x0057;
    L_0x002d:
        r1 = 1;
        goto L_0x0058;
    L_0x002f:
        r1 = "SIMPLE_CHAT";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x0057;
    L_0x0037:
        r1 = 0;
        goto L_0x0058;
    L_0x0039:
        r1 = "BOT";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x0057;
    L_0x0041:
        r1 = 4;
        goto L_0x0058;
    L_0x0043:
        r1 = "CHANNEL_DIRECT";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x0057;
    L_0x004b:
        r1 = 3;
        goto L_0x0058;
    L_0x004d:
        r1 = "CHANNEL_CHAT";
        r1 = r11.equals(r1);
        if (r1 == 0) goto L_0x0057;
    L_0x0055:
        r1 = 2;
        goto L_0x0058;
    L_0x0057:
        r1 = -1;
    L_0x0058:
        switch(r1) {
            case 0: goto L_0x00ba;
            case 1: goto L_0x00b2;
            case 2: goto L_0x0087;
            case 3: goto L_0x0064;
            case 4: goto L_0x005c;
            default: goto L_0x005b;
        };
    L_0x005b:
        goto L_0x00c1;
    L_0x005c:
        r1 = r12.f8932a;
        r1 = r1.f16147a;
        r1.m7106b(r8, r9, r10, r0);
        goto L_0x00c1;
    L_0x0064:
        r1 = "MAJOR_TYPE";
        r2 = "CHANNEL_DIRECT";
        r0.put(r1, r2);
        r1 = "USER_ID";
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = r2.m6928d();
        r0.put(r1, r2);
        r1 = "CHANNEL_ID";
        r0.put(r1, r8);
        r1 = r12.f8932a;
        r1 = r1.f16147a;
        r2 = r20;
        r1.m7102a(r2, r9, r10, r0);
        goto L_0x00c1;
    L_0x0087:
        r1 = mobi.mmdt.ott.provider.p385g.C2980g.m7451l(r8);
        r2 = "MAJOR_TYPE";
        r3 = "CHANNEL_REPLY";
        r0.put(r2, r3);
        r2 = "REPLY_ON_THREAD_ID";
        r0.put(r2, r8);
        r2 = "SENDER_NICKNAME";
        r3 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r3 = r3.m6928d();
        r3 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r3);
        r3 = r3.f9416b;
        r0.put(r2, r3);
        r2 = r12.f8932a;
        r2 = r2.f16147a;
        r2.m7102a(r1, r9, r10, r0);
        goto L_0x00c1;
    L_0x00b2:
        r1 = r12.f8932a;
        r1 = r1.f16147a;
        r1.m7107c(r8, r9, r10, r0);
        goto L_0x00c1;
    L_0x00ba:
        r1 = r12.f8932a;
        r1 = r1.f16147a;
        r1.m7102a(r8, r9, r10, r0);
    L_0x00c1:
        r0 = mobi.mmdt.ott.logic.core.C2802d.m7142a();
        r0.m7143a(r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.l.a.a.a_(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m7178b(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
        r8 = r12;
        r9 = r13;
        r10 = r14;
        r11 = mobi.mmdt.ott.logic.p360l.C2846c.m7209a();
        r1 = "POLL";
        r2 = java.lang.String.valueOf(r17);
        r0 = r10;
        r3 = r19;
        r4 = r8;
        r5 = r21;
        r6 = r22;
        r7 = r23;
        r0 = mobi.mmdt.ott.logic.p360l.C2846c.m7208a(r0, r1, r2, r3, r4, r5, r6, r7);
        r1 = "POLL_ID";
        r2 = r15;
        r0.put(r1, r2);
        r1 = "POLL_DATA";
        r2 = r16;
        r0.put(r1, r2);
        r1 = r10.hashCode();
        switch(r1) {
            case -2029760204: goto L_0x0058;
            case -654356795: goto L_0x004e;
            case 65959: goto L_0x0044;
            case 763157957: goto L_0x003a;
            case 1796630840: goto L_0x0030;
            default: goto L_0x002f;
        };
    L_0x002f:
        goto L_0x0062;
    L_0x0030:
        r1 = "GROUP_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x0038:
        r1 = 1;
        goto L_0x0063;
    L_0x003a:
        r1 = "SIMPLE_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x0042:
        r1 = 0;
        goto L_0x0063;
    L_0x0044:
        r1 = "BOT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x004c:
        r1 = 4;
        goto L_0x0063;
    L_0x004e:
        r1 = "CHANNEL_DIRECT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x0056:
        r1 = 3;
        goto L_0x0063;
    L_0x0058:
        r1 = "CHANNEL_CHAT";
        r1 = r10.equals(r1);
        if (r1 == 0) goto L_0x0062;
    L_0x0060:
        r1 = 2;
        goto L_0x0063;
    L_0x0062:
        r1 = -1;
    L_0x0063:
        switch(r1) {
            case 0: goto L_0x00cd;
            case 1: goto L_0x00c3;
            case 2: goto L_0x0096;
            case 3: goto L_0x0071;
            case 4: goto L_0x0067;
            default: goto L_0x0066;
        };
    L_0x0066:
        goto L_0x00d6;
    L_0x0067:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7106b(r8, r2, r9, r0);
        goto L_0x00d6;
    L_0x0071:
        r1 = "MAJOR_TYPE";
        r2 = "CHANNEL_DIRECT";
        r0.put(r1, r2);
        r1 = "USER_ID";
        r2 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r2 = r2.m6928d();
        r0.put(r1, r2);
        r1 = "CHANNEL_ID";
        r0.put(r1, r8);
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r3 = r20;
        r1.m7102a(r3, r2, r9, r0);
        goto L_0x00d6;
    L_0x0096:
        r1 = mobi.mmdt.ott.provider.p385g.C2980g.m7451l(r8);
        r2 = "MAJOR_TYPE";
        r3 = "CHANNEL_REPLY";
        r0.put(r2, r3);
        r2 = "REPLY_ON_THREAD_ID";
        r0.put(r2, r8);
        r2 = "SENDER_NICKNAME";
        r3 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();
        r3 = r3.m6928d();
        r3 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r3);
        r3 = r3.f9416b;
        r0.put(r2, r3);
        r2 = r11.f8932a;
        r2 = r2.f16147a;
        r3 = " ";
        r2.m7102a(r1, r3, r9, r0);
        goto L_0x00d6;
    L_0x00c3:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7107c(r8, r2, r9, r0);
        goto L_0x00d6;
    L_0x00cd:
        r1 = r11.f8932a;
        r1 = r1.f16147a;
        r2 = " ";
        r1.m7102a(r8, r2, r9, r0);
    L_0x00d6:
        r0 = mobi.mmdt.ott.logic.core.C2802d.m7142a();
        r0.m7143a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.l.a.a.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    protected static void m7179b(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, String str9, long j, String str10, int i, int i2, String str11, String str12, String str13) {
        String str14 = str;
        String str15 = str2;
        String str16 = str8;
        C2846c a = C2846c.m7209a();
        long longValue = l.longValue();
        Map a2 = C2846c.m7208a(str16, "FILE", String.valueOf(j), str9, str14, str11, str12, str13);
        a2.put("FILE_TYPE", "FILE_TYPE_GIF");
        a2.put("FILE_NAME", str7);
        a2.put("FILE_SIZE", String.valueOf(longValue));
        a2.put("FILE_ID", str4);
        a2.put("FILE_URL", str5);
        a2.put("FILE_THUMBNAIL_URL", str6);
        a2.put("FILE_IMAGE_WIDTH", String.valueOf(i));
        a2.put("FILE_IMAGE_HEIGHT", String.valueOf(i2));
        String str17 = str3.isEmpty() ? " " : str3;
        Object obj = -1;
        switch (str8.hashCode()) {
            case -2029760204:
                if (str16.equals("CHANNEL_CHAT")) {
                    obj = 2;
                    break;
                }
                break;
            case -654356795:
                if (str16.equals("CHANNEL_DIRECT")) {
                    obj = 3;
                    break;
                }
                break;
            case 65959:
                if (str16.equals("BOT")) {
                    obj = 4;
                    break;
                }
                break;
            case 763157957:
                if (str16.equals("SIMPLE_CHAT")) {
                    obj = null;
                    break;
                }
                break;
            case 1796630840:
                if (str16.equals("GROUP_CHAT")) {
                    obj = 1;
                    break;
                }
                break;
            default:
                break;
        }
        switch (obj) {
            case null:
                a.f8932a.f16147a.m7102a(str14, str17, str15, a2);
                break;
            case 1:
                a.f8932a.f16147a.m7107c(str14, str17, str15, a2);
                break;
            case 2:
                String l2 = C2980g.m7451l(str14);
                a2.put("MAJOR_TYPE", "CHANNEL_REPLY");
                a2.put("REPLY_ON_THREAD_ID", str14);
                a2.put("SENDER_NICKNAME", C2999a.m7500a(C2535a.m6888a().m6928d()).f9416b);
                a.f8932a.f16147a.m7102a(l2, str17, str15, a2);
                break;
            case 3:
                a2.put("MAJOR_TYPE", "CHANNEL_DIRECT");
                a2.put("USER_ID", C2535a.m6888a().m6928d());
                a2.put("CHANNEL_ID", str14);
                a.f8932a.f16147a.m7102a(str10, str17, str15, a2);
                break;
            case 4:
                a.f8932a.f16147a.m7106b(str14, str17, str15, a2);
                break;
            default:
                break;
        }
        C2802d.m7142a().m7143a(str15);
    }
}
