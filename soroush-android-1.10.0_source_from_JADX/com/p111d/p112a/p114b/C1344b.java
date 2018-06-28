package com.p111d.p112a.p114b;

public final class C1344b {
    public static final C1341a f4173a = new C1341a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
    public static final C1341a f4174b = new C1341a(f4173a, "MIME-NO-LINEFEEDS");
    public static final C1341a f4175c = new C1341a(f4173a, "PEM", true, '=', 64);
    public static final C1341a f4176d;

    static {
        StringBuilder stringBuilder = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        stringBuilder.setCharAt(stringBuilder.indexOf("+"), '-');
        stringBuilder.setCharAt(stringBuilder.indexOf("/"), '_');
        f4176d = new C1341a("MODIFIED-FOR-URL", stringBuilder.toString(), false, '\u0000', (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public static C1341a m3177a() {
        return f4174b;
    }
}
