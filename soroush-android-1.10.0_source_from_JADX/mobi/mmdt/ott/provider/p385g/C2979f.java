package mobi.mmdt.ott.provider.p385g;

public final class C2979f {
    public static String m7422a(String str) {
        str = str.replace("ی", "[یي]").replace("ک", "[كک]").replace("ا", "[آاأ]");
        StringBuilder stringBuilder = new StringBuilder("*");
        stringBuilder.append(str);
        stringBuilder.append("*");
        return stringBuilder.toString();
    }
}
