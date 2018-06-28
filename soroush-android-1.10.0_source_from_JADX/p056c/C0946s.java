package p056c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p056c.p057a.C0885c;

public final class C0946s {
    public final String[] f2991a;

    public static final class C0945a {
        final List<String> f2990a = new ArrayList(20);

        static void m2338c(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            } else {
                char charAt;
                int length = str.length();
                int i = 0;
                while (i < length) {
                    charAt = str.charAt(i);
                    if (charAt > ' ') {
                        if (charAt < '') {
                            i++;
                        }
                    }
                    throw new IllegalArgumentException(C0885c.m2092a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
                if (str2 == null) {
                    StringBuilder stringBuilder = new StringBuilder("value for name ");
                    stringBuilder.append(str);
                    stringBuilder.append(" == null");
                    throw new NullPointerException(stringBuilder.toString());
                }
                length = str2.length();
                i = 0;
                while (i < length) {
                    charAt = str2.charAt(i);
                    if ((charAt > '\u001f' || charAt == '\t') && charAt < '') {
                        i++;
                    } else {
                        throw new IllegalArgumentException(C0885c.m2092a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str, str2));
                    }
                }
            }
        }

        public final C0945a m2339a(String str) {
            int i = 0;
            while (i < this.f2990a.size()) {
                if (str.equalsIgnoreCase((String) this.f2990a.get(i))) {
                    this.f2990a.remove(i);
                    this.f2990a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final C0945a m2340a(String str, String str2) {
            C0945a.m2338c(str, str2);
            return m2342b(str, str2);
        }

        public final C0946s m2341a() {
            return new C0946s(this);
        }

        final C0945a m2342b(String str, String str2) {
            this.f2990a.add(str);
            this.f2990a.add(str2.trim());
            return this;
        }
    }

    C0946s(C0945a c0945a) {
        this.f2991a = (String[]) c0945a.f2990a.toArray(new String[c0945a.f2990a.size()]);
    }

    private C0946s(String[] strArr) {
        this.f2991a = strArr;
    }

    public static C0946s m2343a(String... strArr) {
        int i;
        strArr = (String[]) strArr.clone();
        for (i = 0; i < strArr.length; i++) {
            if (strArr[i] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i] = strArr[i].trim();
        }
        i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            if (str.length() != 0 && str.indexOf(0) == -1) {
                if (str2.indexOf(0) == -1) {
                    i += 2;
                }
            }
            StringBuilder stringBuilder = new StringBuilder("Unexpected header: ");
            stringBuilder.append(str);
            stringBuilder.append(": ");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return new C0946s(strArr);
    }

    public final C0945a m2344a() {
        C0945a c0945a = new C0945a();
        Collections.addAll(c0945a.f2990a, this.f2991a);
        return c0945a;
    }

    public final String m2345a(int i) {
        return this.f2991a[i * 2];
    }

    public final String m2346a(String str) {
        String[] strArr = this.f2991a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String m2347b(int i) {
        return this.f2991a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0946s) && Arrays.equals(((C0946s) obj).f2991a, this.f2991a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2991a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int length = this.f2991a.length / 2;
        for (int i = 0; i < length; i++) {
            stringBuilder.append(m2345a(i));
            stringBuilder.append(": ");
            stringBuilder.append(m2347b(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
