package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class C2656r {
    public static Map<String, String> m7054a(JSONObject jSONObject) {
        Iterator keys = jSONObject.keys();
        Map<String, String> hashMap = new HashMap();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (!(jSONObject.get(str) instanceof JSONObject)) {
                hashMap.put(str, jSONObject.getString(str));
            }
        }
        return hashMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static mobi.mmdt.ott.provider.p384f.C2973m m7055a(java.lang.String r1) {
        /*
        r0 = r1.hashCode();
        switch(r0) {
            case -2029760204: goto L_0x003a;
            case -654356795: goto L_0x0030;
            case 65959: goto L_0x0026;
            case 763157957: goto L_0x001c;
            case 1515720814: goto L_0x0012;
            case 1796630840: goto L_0x0008;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x0044;
    L_0x0008:
        r0 = "GROUP_CHAT";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0044;
    L_0x0010:
        r1 = 1;
        goto L_0x0045;
    L_0x0012:
        r0 = "CHANNEL_REPLY";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0044;
    L_0x001a:
        r1 = 3;
        goto L_0x0045;
    L_0x001c:
        r0 = "SIMPLE_CHAT";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0044;
    L_0x0024:
        r1 = 0;
        goto L_0x0045;
    L_0x0026:
        r0 = "BOT";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0044;
    L_0x002e:
        r1 = 5;
        goto L_0x0045;
    L_0x0030:
        r0 = "CHANNEL_DIRECT";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0044;
    L_0x0038:
        r1 = 4;
        goto L_0x0045;
    L_0x003a:
        r0 = "CHANNEL_CHAT";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0044;
    L_0x0042:
        r1 = 2;
        goto L_0x0045;
    L_0x0044:
        r1 = -1;
    L_0x0045:
        switch(r1) {
            case 0: goto L_0x005a;
            case 1: goto L_0x0057;
            case 2: goto L_0x0054;
            case 3: goto L_0x0051;
            case 4: goto L_0x004e;
            case 5: goto L_0x004b;
            default: goto L_0x0048;
        };
    L_0x0048:
        r1 = mobi.mmdt.ott.provider.p384f.C2973m.SINGLE;
        return r1;
    L_0x004b:
        r1 = mobi.mmdt.ott.provider.p384f.C2973m.BOT;
        return r1;
    L_0x004e:
        r1 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_DIRECT;
        return r1;
    L_0x0051:
        r1 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL_REPLY;
        return r1;
    L_0x0054:
        r1 = mobi.mmdt.ott.provider.p384f.C2973m.CHANNEL;
        return r1;
    L_0x0057:
        r1 = mobi.mmdt.ott.provider.p384f.C2973m.GROUP;
        return r1;
    L_0x005a:
        r1 = mobi.mmdt.ott.provider.p384f.C2973m.SINGLE;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.f.b.r.a(java.lang.String):mobi.mmdt.ott.provider.f.m");
    }
}
