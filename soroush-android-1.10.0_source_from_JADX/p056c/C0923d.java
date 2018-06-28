package p056c;

import java.util.concurrent.TimeUnit;
import org.jivesoftware.smackx.carbons.packet.CarbonExtension.Private;
import p056c.p057a.p060c.C0880e;

public final class C0923d {
    public static final C0923d f2864a;
    public static final C0923d f2865b;
    public final boolean f2866c;
    public final boolean f2867d;
    public final int f2868e;
    public final boolean f2869f;
    public final boolean f2870g;
    public final boolean f2871h;
    public final int f2872i;
    public final int f2873j;
    public final boolean f2874k;
    public final boolean f2875l;
    String f2876m;
    private final int f2877n;
    private final boolean f2878o;

    public static final class C0922a {
        boolean f2856a;
        boolean f2857b;
        int f2858c = -1;
        int f2859d = -1;
        int f2860e = -1;
        boolean f2861f;
        boolean f2862g;
        boolean f2863h;

        public final C0923d m2277a() {
            return new C0923d(this);
        }
    }

    static {
        C0922a c0922a = new C0922a();
        c0922a.f2856a = true;
        f2864a = c0922a.m2277a();
        c0922a = new C0922a();
        c0922a.f2861f = true;
        long toSeconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        c0922a.f2859d = toSeconds > 2147483647L ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) toSeconds;
        f2865b = c0922a.m2277a();
    }

    C0923d(C0922a c0922a) {
        this.f2866c = c0922a.f2856a;
        this.f2867d = c0922a.f2857b;
        this.f2868e = c0922a.f2858c;
        this.f2877n = -1;
        this.f2869f = false;
        this.f2870g = false;
        this.f2871h = false;
        this.f2872i = c0922a.f2859d;
        this.f2873j = c0922a.f2860e;
        this.f2874k = c0922a.f2861f;
        this.f2878o = c0922a.f2862g;
        this.f2875l = c0922a.f2863h;
    }

    private C0923d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f2866c = z;
        this.f2867d = z2;
        this.f2868e = i;
        this.f2877n = i2;
        this.f2869f = z3;
        this.f2870g = z4;
        this.f2871h = z5;
        this.f2872i = i3;
        this.f2873j = i4;
        this.f2874k = z6;
        this.f2878o = z7;
        this.f2875l = z8;
        this.f2876m = str;
    }

    public static C0923d m2278a(C0946s c0946s) {
        C0946s c0946s2 = c0946s;
        int length = c0946s2.f2991a.length / 2;
        Object obj = 1;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i3 = -1;
        int i4 = -1;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        for (int i5 = 0; i5 < length; i5++) {
            int i6;
            int a;
            String trim;
            int a2;
            boolean z9;
            int a3;
            String trim2;
            String a4 = c0946s2.m2345a(i5);
            String b = c0946s2.m2347b(i5);
            if (a4.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = b;
                    i6 = 0;
                    while (i6 < b.length()) {
                        a = C0880e.m2074a(b, i6, "=,;");
                        trim = b.substring(i6, a).trim();
                        if (!(a == b.length() || b.charAt(a) == ',')) {
                            if (b.charAt(a) == ';') {
                                a2 = C0880e.m2073a(b, a + 1);
                                if (a2 < b.length() || b.charAt(a2) != '\"') {
                                    z9 = true;
                                    a3 = C0880e.m2074a(b, a2, ",;");
                                    trim2 = b.substring(a2, a3).trim();
                                } else {
                                    a2++;
                                    a3 = C0880e.m2074a(b, a2, "\"");
                                    trim2 = b.substring(a2, a3);
                                    z9 = true;
                                    a3++;
                                }
                                if (!"no-cache".equalsIgnoreCase(trim)) {
                                    i6 = a3;
                                    z = z9;
                                } else if ("no-store".equalsIgnoreCase(trim)) {
                                    if (!"max-age".equalsIgnoreCase(trim)) {
                                        i = C0880e.m2078b(trim2, -1);
                                    } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                                        i2 = C0880e.m2078b(trim2, -1);
                                    } else if (!Private.ELEMENT.equalsIgnoreCase(trim)) {
                                        i6 = a3;
                                        z3 = z9;
                                    } else if (!"public".equalsIgnoreCase(trim)) {
                                        i6 = a3;
                                        z4 = z9;
                                    } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                                        i6 = a3;
                                        z5 = z9;
                                    } else if (!"max-stale".equalsIgnoreCase(trim)) {
                                        i3 = C0880e.m2078b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                                    } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                                        i4 = C0880e.m2078b(trim2, -1);
                                    } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                                        i6 = a3;
                                        z6 = z9;
                                    } else if (!"no-transform".equalsIgnoreCase(trim)) {
                                        i6 = a3;
                                        z7 = z9;
                                    } else if ("immutable".equalsIgnoreCase(trim)) {
                                        z8 = z9;
                                    }
                                    i6 = a3;
                                } else {
                                    i6 = a3;
                                    z2 = z9;
                                }
                            }
                        }
                        z9 = true;
                        a3 = a + 1;
                        trim2 = null;
                        if (!"no-cache".equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z = z9;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            if (!"max-age".equalsIgnoreCase(trim)) {
                                i = C0880e.m2078b(trim2, -1);
                            } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                                i2 = C0880e.m2078b(trim2, -1);
                            } else if (!Private.ELEMENT.equalsIgnoreCase(trim)) {
                                i6 = a3;
                                z3 = z9;
                            } else if (!"public".equalsIgnoreCase(trim)) {
                                i6 = a3;
                                z4 = z9;
                            } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                                i6 = a3;
                                z5 = z9;
                            } else if (!"max-stale".equalsIgnoreCase(trim)) {
                                i3 = C0880e.m2078b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                            } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                                i4 = C0880e.m2078b(trim2, -1);
                            } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                                i6 = a3;
                                z6 = z9;
                            } else if (!"no-transform".equalsIgnoreCase(trim)) {
                                i6 = a3;
                                z7 = z9;
                            } else if ("immutable".equalsIgnoreCase(trim)) {
                                z8 = z9;
                            }
                            i6 = a3;
                        } else {
                            i6 = a3;
                            z2 = z9;
                        }
                    }
                }
            } else if (!a4.equalsIgnoreCase("Pragma")) {
            }
            obj = null;
            i6 = 0;
            while (i6 < b.length()) {
                a = C0880e.m2074a(b, i6, "=,;");
                trim = b.substring(i6, a).trim();
                if (b.charAt(a) == ';') {
                    a2 = C0880e.m2073a(b, a + 1);
                    if (a2 < b.length()) {
                    }
                    z9 = true;
                    a3 = C0880e.m2074a(b, a2, ",;");
                    trim2 = b.substring(a2, a3).trim();
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        i6 = a3;
                        z = z9;
                    } else if ("no-store".equalsIgnoreCase(trim)) {
                        i6 = a3;
                        z2 = z9;
                    } else {
                        if (!"max-age".equalsIgnoreCase(trim)) {
                            i = C0880e.m2078b(trim2, -1);
                        } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                            i2 = C0880e.m2078b(trim2, -1);
                        } else if (!Private.ELEMENT.equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z3 = z9;
                        } else if (!"public".equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z4 = z9;
                        } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z5 = z9;
                        } else if (!"max-stale".equalsIgnoreCase(trim)) {
                            i3 = C0880e.m2078b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                        } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                            i4 = C0880e.m2078b(trim2, -1);
                        } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z6 = z9;
                        } else if (!"no-transform".equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z7 = z9;
                        } else if ("immutable".equalsIgnoreCase(trim)) {
                            z8 = z9;
                        }
                        i6 = a3;
                    }
                } else {
                    z9 = true;
                    a3 = a + 1;
                    trim2 = null;
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        i6 = a3;
                        z = z9;
                    } else if ("no-store".equalsIgnoreCase(trim)) {
                        if (!"max-age".equalsIgnoreCase(trim)) {
                            i = C0880e.m2078b(trim2, -1);
                        } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                            i2 = C0880e.m2078b(trim2, -1);
                        } else if (!Private.ELEMENT.equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z3 = z9;
                        } else if (!"public".equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z4 = z9;
                        } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z5 = z9;
                        } else if (!"max-stale".equalsIgnoreCase(trim)) {
                            i3 = C0880e.m2078b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                        } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                            i4 = C0880e.m2078b(trim2, -1);
                        } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z6 = z9;
                        } else if (!"no-transform".equalsIgnoreCase(trim)) {
                            i6 = a3;
                            z7 = z9;
                        } else if ("immutable".equalsIgnoreCase(trim)) {
                            z8 = z9;
                        }
                        i6 = a3;
                    } else {
                        i6 = a3;
                        z2 = z9;
                    }
                }
            }
        }
        return new C0923d(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, obj == null ? null : str);
    }

    public final String toString() {
        String str = this.f2876m;
        if (str != null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f2866c) {
            stringBuilder.append("no-cache, ");
        }
        if (this.f2867d) {
            stringBuilder.append("no-store, ");
        }
        if (this.f2868e != -1) {
            stringBuilder.append("max-age=");
            stringBuilder.append(this.f2868e);
            stringBuilder.append(", ");
        }
        if (this.f2877n != -1) {
            stringBuilder.append("s-maxage=");
            stringBuilder.append(this.f2877n);
            stringBuilder.append(", ");
        }
        if (this.f2869f) {
            stringBuilder.append("private, ");
        }
        if (this.f2870g) {
            stringBuilder.append("public, ");
        }
        if (this.f2871h) {
            stringBuilder.append("must-revalidate, ");
        }
        if (this.f2872i != -1) {
            stringBuilder.append("max-stale=");
            stringBuilder.append(this.f2872i);
            stringBuilder.append(", ");
        }
        if (this.f2873j != -1) {
            stringBuilder.append("min-fresh=");
            stringBuilder.append(this.f2873j);
            stringBuilder.append(", ");
        }
        if (this.f2874k) {
            stringBuilder.append("only-if-cached, ");
        }
        if (this.f2878o) {
            stringBuilder.append("no-transform, ");
        }
        if (this.f2875l) {
            stringBuilder.append("immutable, ");
        }
        if (stringBuilder.length() == 0) {
            str = "";
        } else {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            str = stringBuilder.toString();
        }
        this.f2876m = str;
        return str;
    }
}
