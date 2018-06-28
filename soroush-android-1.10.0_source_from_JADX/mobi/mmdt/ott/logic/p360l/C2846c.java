package mobi.mmdt.ott.logic.p360l;

import java.util.HashMap;
import java.util.Map;

public final class C2846c {
    private static C2846c f8931b;
    public C5996e f8932a = C5996e.m13260a();

    private C2846c() {
    }

    public static Map<String, String> m7208a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("MAJOR_TYPE", str);
        hashMap.put("MINOR_TYPE", str2);
        hashMap.put("SEND_TIME_IN_GMT", str3);
        if (!(str4 == null || str4.isEmpty())) {
            hashMap.put("REPLY_ON_MESSAGE_ID", str4);
            hashMap.put("REPLY_ON_THREAD_ID", str5);
        }
        if (!(str6 == null || str6.isEmpty())) {
            hashMap.put("FORWARD_USER_ID", str6);
        }
        if (!(str7 == null || str7.isEmpty())) {
            hashMap.put("FORWARD_GROUP_TYPE", str7);
        }
        if (!(str8 == null || str8.isEmpty())) {
            hashMap.put("FORWARD_MESSAGE_ID", str8);
        }
        return hashMap;
    }

    public static C2846c m7209a() {
        if (f8931b == null) {
            f8931b = new C2846c();
        }
        return f8931b;
    }
}
