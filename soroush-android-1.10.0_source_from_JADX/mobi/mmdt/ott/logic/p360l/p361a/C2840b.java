package mobi.mmdt.ott.logic.p360l.p361a;

import java.util.HashMap;
import java.util.Map;
import mobi.mmdt.componentsutils.p232b.p236d.C2483a;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.C2778b;
import mobi.mmdt.ott.logic.p261a.p303m.C2721a;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C2840b {
    public static String m7180a(String[] strArr) {
        String str = "";
        if (strArr == null) {
            return null;
        }
        for (String str2 : strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            stringBuilder.append(",");
            str = stringBuilder.toString();
        }
        return str;
    }

    public static Map<String, String> m7181a() {
        Map<String, String> hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2778b.m7093a());
        hashMap.put("SEND_TIME_IN_GMT", stringBuilder.toString());
        return hashMap;
    }

    public static void m7182a(String str, String str2, String str3, long j) {
        Map a = C2840b.m7181a();
        a.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a.put("MINOR_TYPE", "EDIT_MESSAGE");
        a.put("MESSAGE_ID", str2);
        a.put("EDITED_TEXT", str3);
        a.put("UPDATE_TIMESTAMP", String.valueOf(j));
        C5996e.m13260a().f16147a.m7102a(str, " ", C2483a.m6744a(MyApplication.m12952b()), a);
    }

    public static void m7183a(String str, String str2, String str3, String str4) {
        Map a = C2840b.m7181a();
        a.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a.put("MINOR_TYPE", "GROUP_LEAVE");
        a.put("JID", str);
        a.put("USER_ID", str3);
        C5996e.m13260a().f16147a.m7107c(str, str2, str4, a);
    }

    public static void m7184a(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        Map a = C2840b.m7181a();
        a.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a.put("MINOR_TYPE", "DRAFT_MESSAGE");
        a.put("CONVERSATION_TYPE", str3);
        a.put("CONVERSATION_ID", str4);
        a.put("DRAFT_MESSAGE", str5);
        a.put("DRAFT_REPLY_MESSAGE_ID", str6);
        a.put("UPDATE_TIMESTAMP", String.valueOf(j));
        C5996e.m13260a().f16147a.m7102a(str2, " ", str, a);
    }

    public static void m7185a(String str, String str2, String str3, C3004f c3004f, C3004f c3004f2) {
        Map a = C2840b.m7181a();
        a.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a.put("MINOR_TYPE", "CHANNEL_MEMBERSHIP_CHANGE_ROLE");
        a.put("CHANNEL_ID", str3);
        a.put("USER_ID", str2);
        a.put("OLD_ROLE", c3004f.name());
        a.put("NEW_ROLE", c3004f2.name());
        C5996e.m13260a().f16147a.m7102a(str2, " ", str, a);
    }

    public static void m7186a(String str, C2973m c2973m, String str2, String str3, String[] strArr, boolean z, long j) {
        Map a = C2840b.m7181a();
        a.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a.put("MINOR_TYPE", "MESSAGE_DELETED");
        a.put("CONVERSATION_TYPE", C2721a.m7067a(c2973m));
        a.put("CONVERSATION_ID", str2);
        a.put("MESSAGE_IDS", C2840b.m7180a(strArr));
        a.put("DELETE_IN_RECEIVER", z ? "TRUE" : "FALSE");
        a.put("DELETE_TIMESTAMP", String.valueOf(j));
        if (c2973m.equals(C2973m.SINGLE)) {
            C5996e.m13260a().f16147a.m7102a(str, " ", str3, a);
        } else {
            C5996e.m13260a().f16147a.m7107c(str, " ", str3, a);
        }
    }

    public static void m7187b(String str, String str2, String str3, String str4) {
        Map a = C2840b.m7181a();
        a.put("MAJOR_TYPE", "CONTROL_MESSAGE");
        a.put("MINOR_TYPE", "CHANNEL_MEMBERSHIP_REMOVE");
        a.put("CHANNEL_ID", str4);
        a.put("USER_ID", str3);
        C5996e.m13260a().f16147a.m7102a(str2, " ", str, a);
    }
}
