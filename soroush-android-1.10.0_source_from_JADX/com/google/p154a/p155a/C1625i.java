package com.google.p154a.p155a;

public final class C1625i {
    public static int m4180a(int i, int i2) {
        String a;
        String str = "index";
        if (i >= 0) {
            if (i < i2) {
                return i;
            }
        }
        if (i < 0) {
            a = C1625i.m4183a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            a = C1625i.m4183a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public static <T> T m4181a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    private static String m4182a(int i, int i2, String str) {
        if (i < 0) {
            return C1625i.m4183a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            return C1625i.m4183a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    private static String m4183a(String str, Object... objArr) {
        CharSequence valueOf = String.valueOf(str);
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + (16 * objArr.length));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(valueOf, i2, indexOf);
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            i = i2;
            i2 = indexOf + 2;
        }
        stringBuilder.append(valueOf, i2, valueOf.length());
        if (i < objArr.length) {
            stringBuilder.append(" [");
            int i3 = i + 1;
            stringBuilder.append(objArr[i]);
            while (i3 < objArr.length) {
                stringBuilder.append(", ");
                i2 = i3 + 1;
                stringBuilder.append(objArr[i3]);
                i3 = i2;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    public static void m4184a(int i, int i2, int i3) {
        String a;
        if (i >= 0 && i2 >= i) {
            if (i2 <= i3) {
                return;
            }
        }
        if (i >= 0) {
            if (i <= i3) {
                if (i2 >= 0) {
                    if (i2 <= i3) {
                        a = C1625i.m4183a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                        throw new IndexOutOfBoundsException(a);
                    }
                }
                a = C1625i.m4182a(i2, i3, "end index");
                throw new IndexOutOfBoundsException(a);
            }
        }
        a = C1625i.m4182a(i, i3, "start index");
        throw new IndexOutOfBoundsException(a);
    }

    public static void m4185a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m4186a(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C1625i.m4183a(str, obj));
        }
    }

    public static int m4187b(int i, int i2) {
        String str = "index";
        if (i >= 0) {
            if (i <= i2) {
                return i;
            }
        }
        throw new IndexOutOfBoundsException(C1625i.m4182a(i, i2, str));
    }
}
