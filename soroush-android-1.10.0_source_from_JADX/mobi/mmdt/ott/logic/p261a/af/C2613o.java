package mobi.mmdt.ott.logic.p261a.af;

import android.net.Uri;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.provider.p386h.C2987i;

public final class C2613o {
    public static Uri m7045a(C2987i c2987i, C2987i c2987i2, String str, String str2, long j) {
        Uri parse;
        if (c2987i != C2987i.FINISHED || str == null) {
            if (str2 != null) {
                if (c2987i2 == C2987i.FINISHED) {
                    parse = Uri.parse(str2);
                } else {
                    C2808d.m7149c(new C6672n(j));
                }
            }
            parse = null;
        } else {
            parse = Uri.parse(str);
        }
        return (parse != null || str == null) ? parse : Uri.parse(str);
    }
}
