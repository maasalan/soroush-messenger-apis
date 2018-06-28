package com.p111d.p112a.p121c;

import java.io.Serializable;

public class C1550w implements Serializable {
    public static final C1550w f4840a = new C6529d();
    public static final C1550w f4841b = new C6530e();
    public static final C1550w f4842c = new C1550w();
    public static final C1550w f4843d = new C6528b();
    public static final C1550w f4844e = new C6527a();
    @Deprecated
    public static final C1550w f4845f = f4840a;
    @Deprecated
    public static final C1550w f4846g = f4841b;

    public static abstract class C5386c extends C1550w {
        public final String mo1486a(String str) {
            return mo2983e(str);
        }

        public final String mo1487b(String str) {
            return mo2983e(str);
        }

        public final String mo1488c(String str) {
            return mo2983e(str);
        }

        public final String mo1489d(String str) {
            return mo2983e(str);
        }

        public abstract String mo2983e(String str);
    }

    public static class C6527a extends C5386c {
        public final String mo2983e(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            if (length == 0) {
                return str;
            }
            StringBuilder stringBuilder = new StringBuilder((length >> 1) + length);
            int i = 0;
            int i2 = i;
            while (i < length) {
                char charAt = str.charAt(i);
                char toLowerCase = Character.toLowerCase(charAt);
                if (toLowerCase == charAt) {
                    if (i2 > 1) {
                        stringBuilder.insert(stringBuilder.length() - 1, '-');
                    }
                    i2 = 0;
                } else {
                    if (i2 == 0 && i > 0) {
                        stringBuilder.append('-');
                    }
                    i2++;
                }
                stringBuilder.append(toLowerCase);
                i++;
            }
            return stringBuilder.toString();
        }
    }

    public static class C6528b extends C5386c {
        public final String mo2983e(String str) {
            return str.toLowerCase();
        }
    }

    public static class C6529d extends C5386c {
        public final String mo2983e(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder stringBuilder = new StringBuilder(length * 2);
            int i = 0;
            int i2 = i;
            int i3 = i2;
            while (i < length) {
                char charAt = str.charAt(i);
                if (i > 0 || charAt != '_') {
                    if (Character.isUpperCase(charAt)) {
                        if (i3 == 0 && i2 > 0 && stringBuilder.charAt(i2 - 1) != '_') {
                            stringBuilder.append('_');
                            i2++;
                        }
                        charAt = Character.toLowerCase(charAt);
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    stringBuilder.append(charAt);
                    i2++;
                }
                i++;
            }
            if (i2 > 0) {
                str = stringBuilder.toString();
            }
            return str;
        }
    }

    public static class C6530e extends C5386c {
        public final String mo2983e(String str) {
            if (str != null) {
                if (str.length() == 0) {
                    return str;
                }
                char charAt = str.charAt(0);
                char toUpperCase = Character.toUpperCase(charAt);
                if (charAt == toUpperCase) {
                    return str;
                }
                StringBuilder stringBuilder = new StringBuilder(str);
                stringBuilder.setCharAt(0, toUpperCase);
                str = stringBuilder.toString();
            }
            return str;
        }
    }

    public String mo1486a(String str) {
        return str;
    }

    public String mo1487b(String str) {
        return str;
    }

    public String mo1488c(String str) {
        return str;
    }

    public String mo1489d(String str) {
        return str;
    }
}
