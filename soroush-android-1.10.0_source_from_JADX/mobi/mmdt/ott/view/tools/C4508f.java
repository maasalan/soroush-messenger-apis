package mobi.mmdt.ott.view.tools;

public final class C4508f {
    public static String m8220a(String str) {
        return (str == null || str.isEmpty()) ? "" : str;
    }

    public static String m8221a(String str, String str2) {
        return (str == null || str.isEmpty()) ? str2 : str;
    }

    public static String m8222a(boolean z, String str, String str2, String str3) {
        return (!z || str == null) ? C4508f.m8220a(str2) : C4508f.m8221a(str, str3);
    }
}
