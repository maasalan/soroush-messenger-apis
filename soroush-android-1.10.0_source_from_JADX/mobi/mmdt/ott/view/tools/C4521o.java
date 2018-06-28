package mobi.mmdt.ott.view.tools;

public final class C4521o {
    private static int f12465a = 17;

    public static String m8235a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder("https://maps.googleapis.com/maps/api/staticmap?center=");
        stringBuilder.append(str);
        stringBuilder.append(",");
        stringBuilder.append(str2);
        stringBuilder.append("&size=600x600&zoom=");
        stringBuilder.append(f12465a);
        stringBuilder.append("&markers=color:red|size:big|");
        stringBuilder.append(str);
        stringBuilder.append(",");
        stringBuilder.append(str2);
        return (str == null || str2 == null) ? null : stringBuilder.toString();
    }
}
