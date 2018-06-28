package mobi.mmdt.ott.logic.p261a.p326w.p327a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C2760f {
    private static final Pattern f8715a = Pattern.compile("(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.){0,1}(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)+[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)", 42);

    public static String m7087a(String str) {
        Matcher matcher = f8715a.matcher(str);
        while (matcher.find()) {
            String trim = matcher.group().trim();
            if (!trim.endsWith("...")) {
                return trim;
            }
        }
        return null;
    }
}
