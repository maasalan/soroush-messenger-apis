package mobi.mmdt.ott.view.tools.p479c;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p481e.C4505a;

public final class C4493a {
    public static String m8186a(Activity activity, Cursor cursor) {
        String a = C4505a.m8203a(cursor, "conversations_event");
        if (a != null) {
            return C4493a.m8187a(activity, a, cursor);
        }
        if (C2978e.values()[cursor.getInt(cursor.getColumnIndex("dialog_type"))].equals(C2978e.SINGLE)) {
            String a2 = C4505a.m8203a(cursor, "members_last_online");
            if (a2 == null) {
                return "";
            }
            long parseLong = Long.parseLong(a2);
            return (parseLong == -1 || parseLong == 0) ? "" : C2491i.m6772a((Context) activity, C2778b.m7093a(), parseLong);
        } else {
            String a3 = C4522p.m8236a(R.string.member);
            a = C4522p.m8236a(R.string.members);
            int parseInt = Integer.parseInt(C4505a.m8203a(cursor, "dialog_members_count"));
            if (parseInt > 1) {
                a3 = a;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(parseInt);
            stringBuilder.append(" ");
            stringBuilder.append(a3);
            return stringBuilder.toString();
        }
    }

    private static java.lang.String m8187a(android.app.Activity r5, java.lang.String r6, android.database.Cursor r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "conversations_event_type";
        r0 = r7.getColumnIndex(r0);
        r0 = r7.getInt(r0);
        r1 = mobi.mmdt.ott.view.tools.p479c.C4493a.C44921.f12439a;
        r2 = mobi.mmdt.ott.provider.p384f.C2972l.values();
        r0 = r2[r0];
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 1;
        r2 = 0;
        switch(r0) {
            case 1: goto L_0x00b8;
            case 2: goto L_0x00b0;
            case 3: goto L_0x00ac;
            case 4: goto L_0x00a8;
            case 5: goto L_0x009c;
            case 6: goto L_0x0090;
            case 7: goto L_0x008c;
            case 8: goto L_0x0088;
            case 9: goto L_0x00ee;
            case 10: goto L_0x0084;
            case 11: goto L_0x0070;
            case 12: goto L_0x006d;
            case 13: goto L_0x001e;
            default: goto L_0x001d;
        };
    L_0x001d:
        return r6;
    L_0x001e:
        r0 = mobi.mmdt.ott.provider.p385g.C2978e.values();
        r3 = "dialog_type";
        r3 = r7.getColumnIndex(r3);
        r3 = r7.getInt(r3);
        r0 = r0[r3];
        r3 = "conversations_peer_user_id";
        r3 = mobi.mmdt.ott.view.tools.p481e.C4505a.m8203a(r7, r3);
        r4 = "members_is_local_user";
        r4 = r7.getColumnIndex(r4);
        r4 = r7.getInt(r4);
        if (r4 == 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0042;
    L_0x0041:
        r1 = r2;
    L_0x0042:
        if (r1 == 0) goto L_0x0055;
    L_0x0044:
        r1 = "members_local_name";
        r1 = mobi.mmdt.ott.view.tools.p481e.C4505a.m8203a(r7, r1);
        r2 = "members_local_phone_number";
        r7 = mobi.mmdt.ott.view.tools.p481e.C4505a.m8203a(r7, r2);
        r7 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r1, r7);
        goto L_0x0064;
    L_0x0055:
        r1 = "members_user_id";
        mobi.mmdt.ott.view.tools.p481e.C4505a.m8203a(r7, r1);
        r1 = "members_nick_name";
        r7 = mobi.mmdt.ott.view.tools.p481e.C4505a.m8203a(r7, r1);
        r7 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r7);
    L_0x0064:
        r5 = r5.getApplicationContext();
        r6 = mobi.mmdt.ott.view.tools.C4532q.m8242a(r5, r6, r0, r3, r7);
        return r6;
    L_0x006d:
        r6 = "";
        return r6;
    L_0x0070:
        r5 = 0;
        r7 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x007b }
        r7.<init>(r6);	 Catch:{ JSONException -> 0x007b }
        r6 = mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.PollUtils.PollDataParser(r7);	 Catch:{ JSONException -> 0x007b }
        r5 = r6;
    L_0x007b:
        if (r5 == 0) goto L_0x0080;
    L_0x007d:
        r6 = r5.f8400b;
        return r6;
    L_0x0080:
        r5 = 2131690386; // 0x7f0f0392 float:1.9009814E38 double:1.0531949873E-314;
        goto L_0x00b3;
    L_0x0084:
        r5 = 2131690384; // 0x7f0f0390 float:1.900981E38 double:1.0531949863E-314;
        goto L_0x00b3;
    L_0x0088:
        r5 = 2131690388; // 0x7f0f0394 float:1.9009818E38 double:1.0531949883E-314;
        goto L_0x00b3;
    L_0x008c:
        r5 = 2131690157; // 0x7f0f02ad float:1.900935E38 double:1.053194874E-314;
        goto L_0x00b3;
    L_0x0090:
        if (r6 == 0) goto L_0x0098;
    L_0x0092:
        r5 = r6.isEmpty();
        if (r5 == 0) goto L_0x00ee;
    L_0x0098:
        r5 = 2131690389; // 0x7f0f0395 float:1.900982E38 double:1.053194989E-314;
        goto L_0x00b3;
    L_0x009c:
        if (r6 == 0) goto L_0x00a4;
    L_0x009e:
        r5 = r6.isEmpty();
        if (r5 == 0) goto L_0x00ee;
    L_0x00a4:
        r5 = 2131690385; // 0x7f0f0391 float:1.9009812E38 double:1.053194987E-314;
        goto L_0x00b3;
    L_0x00a8:
        r5 = 2131689664; // 0x7f0f00c0 float:1.900835E38 double:1.0531946306E-314;
        goto L_0x00b3;
    L_0x00ac:
        r5 = 2131690546; // 0x7f0f0432 float:1.9010139E38 double:1.0531950663E-314;
        goto L_0x00b3;
    L_0x00b0:
        r5 = 2131690382; // 0x7f0f038e float:1.9009806E38 double:1.0531949853E-314;
    L_0x00b3:
        r6 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r5);
        return r6;
    L_0x00b8:
        if (r6 == 0) goto L_0x00ea;
    L_0x00ba:
        r5 = ",";
        r5 = r6.split(r5);
        r7 = r5.length;
        r0 = 2;
        if (r7 != r0) goto L_0x00ee;
    L_0x00c4:
        r7 = r5[r2];
        r7 = r7.trim();
        r7 = r7.charAt(r2);
        r7 = java.lang.Character.isDigit(r7);
        if (r7 == 0) goto L_0x00d7;
    L_0x00d4:
        r6 = r5[r1];
        return r6;
    L_0x00d7:
        r7 = r5[r1];
        r7 = r7.trim();
        r7 = r7.charAt(r2);
        r7 = java.lang.Character.isDigit(r7);
        if (r7 == 0) goto L_0x00ee;
    L_0x00e7:
        r6 = r5[r2];
        return r6;
    L_0x00ea:
        r5 = 2131689711; // 0x7f0f00ef float:1.9008445E38 double:1.053194654E-314;
        goto L_0x00b3;
    L_0x00ee:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.c.a.a(android.app.Activity, java.lang.String, android.database.Cursor):java.lang.String");
    }
}
