package mobi.mmdt.ott.logic.p261a.af.p270a;

import mobi.mmdt.ott.lib_webservicescomponent.p250a.p251a.C2547a;

public final class C5898k extends C2547a {
    public C5898k(String str, String str2, String str3, long j, String str4, int i, boolean z, String str5, long j2, String str6, String str7) {
        put("Username", str);
        put("Type", str4);
        put("category", C2603h.m7037a(i));
        put("FileName", str2);
        put("FileHash", str3);
        put("FileSize", j);
        put("HasThumbnail", z ? "1" : "0");
        put("ThumbFileName", str5);
        put("ThumbFileSize", j2);
        put("HashMethod", str6);
        put("AuthValue", "");
        str = C2547a.m6987a(this, str7);
        remove("AuthValue");
        put("AuthValue", str);
    }
}
