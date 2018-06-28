package com.p111d.p112a.p113a;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1320j {

    public enum C1316a {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES
    }

    public static class C1317b {
        private static final C1317b f4125c = new C1317b(0, 0);
        final int f4126a;
        final int f4127b;

        C1317b(int i, int i2) {
            this.f4126a = i;
            this.f4127b = i2;
        }

        public static C1317b m3108a() {
            return f4125c;
        }

        public static C1317b m3109a(C1320j c1320j) {
            C1316a[] e = c1320j.m3122e();
            C1316a[] f = c1320j.m3123f();
            int i = 0;
            int i2 = 0;
            int i3 = i2;
            while (i2 < e.length) {
                i3 |= 1 << e[i2].ordinal();
                i2++;
            }
            int i4 = 0;
            while (i < f.length) {
                i4 |= 1 << f[i].ordinal();
                i++;
            }
            return new C1317b(i3, i4);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C1317b c1317b = (C1317b) obj;
            return c1317b.f4126a == this.f4126a && c1317b.f4127b == this.f4127b;
        }

        public final int hashCode() {
            return this.f4127b + this.f4126a;
        }
    }

    public enum C1318c {
        ANY,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN;

        public final boolean m3110a() {
            if (!(this == NUMBER || this == NUMBER_INT)) {
                if (this != NUMBER_FLOAT) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class C1319d implements Serializable {
        private static final C1319d f4138g = new C1319d();
        public final String f4139a;
        public final C1318c f4140b;
        public final Locale f4141c;
        public final String f4142d;
        public final C1317b f4143e;
        public transient TimeZone f4144f;

        public C1319d() {
            this("", C1318c.ANY, "", "", C1317b.m3108a());
        }

        public C1319d(C1320j c1320j) {
            this(c1320j.m3118a(), c1320j.m3119b(), c1320j.m3120c(), c1320j.m3121d(), C1317b.m3109a(c1320j));
        }

        private C1319d(String str, C1318c c1318c, String str2, String str3, C1317b c1317b) {
            Locale locale;
            String str4;
            if (!(str2 == null || str2.length() == 0)) {
                if (!"##default".equals(str2)) {
                    locale = new Locale(str2);
                    if (!(str3 == null || str3.length() == 0)) {
                        if ("##default".equals(str3)) {
                            str4 = str3;
                            this(str, c1318c, locale, str4, null, c1317b);
                        }
                    }
                    str4 = null;
                    this(str, c1318c, locale, str4, null, c1317b);
                }
            }
            locale = null;
            if ("##default".equals(str3)) {
                str4 = str3;
                this(str, c1318c, locale, str4, null, c1317b);
            }
            str4 = null;
            this(str, c1318c, locale, str4, null, c1317b);
        }

        public C1319d(String str, C1318c c1318c, Locale locale, String str2, TimeZone timeZone, C1317b c1317b) {
            this.f4139a = str;
            if (c1318c == null) {
                c1318c = C1318c.ANY;
            }
            this.f4140b = c1318c;
            this.f4141c = locale;
            this.f4144f = timeZone;
            this.f4142d = str2;
            if (c1317b == null) {
                c1317b = C1317b.m3108a();
            }
            this.f4143e = c1317b;
        }

        public static final C1319d m3111a() {
            return f4138g;
        }

        private static <T> boolean m3112a(T t, T t2) {
            return t == null ? t2 == null : t2 == null ? false : t.equals(t2);
        }

        public final C1319d m3113a(C1319d c1319d) {
            if (c1319d == null || c1319d == f4138g) {
                return this;
            }
            if (this == f4138g) {
                return c1319d;
            }
            String str;
            C1318c c1318c;
            C1318c c1318c2;
            Locale locale;
            Locale locale2;
            C1317b c1317b;
            C1317b c1317b2;
            int i;
            int i2;
            int i3;
            C1317b c1317b3;
            TimeZone timeZone;
            String str2;
            String str3 = c1319d.f4139a;
            if (str3 != null) {
                if (str3.isEmpty()) {
                }
                str = str3;
                c1318c = c1319d.f4140b;
                if (c1318c == C1318c.ANY) {
                    c1318c = this.f4140b;
                }
                c1318c2 = c1318c;
                locale = c1319d.f4141c;
                if (locale == null) {
                    locale = this.f4141c;
                }
                locale2 = locale;
                c1317b = this.f4143e;
                if (c1317b != null) {
                    c1317b = c1319d.f4143e;
                } else {
                    c1317b2 = c1319d.f4143e;
                    if (c1317b2 == null) {
                        i = c1317b2.f4127b;
                        i2 = c1317b2.f4126a;
                        if (i == 0 || i2 != 0) {
                            if (c1317b.f4126a == 0 || c1317b.f4127b != 0) {
                                i3 = (c1317b.f4126a & (i ^ -1)) | i2;
                                i |= (i2 ^ -1) & c1317b.f4127b;
                                if (!(i3 == c1317b.f4126a && i == c1317b.f4127b)) {
                                    c1317b = new C1317b(i3, i);
                                }
                            } else {
                                c1317b3 = c1317b2;
                                str3 = c1319d.f4142d;
                                if (str3 != null) {
                                    if (str3.isEmpty()) {
                                        timeZone = c1319d.f4144f;
                                        str2 = str3;
                                        return new C1319d(str, c1318c2, locale2, str2, timeZone, c1317b3);
                                    }
                                }
                                str2 = this.f4142d;
                                timeZone = this.f4144f;
                                return new C1319d(str, c1318c2, locale2, str2, timeZone, c1317b3);
                            }
                        }
                    }
                }
                c1317b3 = c1317b;
                str3 = c1319d.f4142d;
                if (str3 != null) {
                    if (str3.isEmpty()) {
                        timeZone = c1319d.f4144f;
                        str2 = str3;
                        return new C1319d(str, c1318c2, locale2, str2, timeZone, c1317b3);
                    }
                }
                str2 = this.f4142d;
                timeZone = this.f4144f;
                return new C1319d(str, c1318c2, locale2, str2, timeZone, c1317b3);
            }
            str3 = this.f4139a;
            str = str3;
            c1318c = c1319d.f4140b;
            if (c1318c == C1318c.ANY) {
                c1318c = this.f4140b;
            }
            c1318c2 = c1318c;
            locale = c1319d.f4141c;
            if (locale == null) {
                locale = this.f4141c;
            }
            locale2 = locale;
            c1317b = this.f4143e;
            if (c1317b != null) {
                c1317b2 = c1319d.f4143e;
                if (c1317b2 == null) {
                    i = c1317b2.f4127b;
                    i2 = c1317b2.f4126a;
                    if (i == 0) {
                    }
                    if (c1317b.f4126a == 0) {
                    }
                    i3 = (c1317b.f4126a & (i ^ -1)) | i2;
                    i |= (i2 ^ -1) & c1317b.f4127b;
                    c1317b = new C1317b(i3, i);
                }
            } else {
                c1317b = c1319d.f4143e;
            }
            c1317b3 = c1317b;
            str3 = c1319d.f4142d;
            if (str3 != null) {
                if (str3.isEmpty()) {
                    timeZone = c1319d.f4144f;
                    str2 = str3;
                    return new C1319d(str, c1318c2, locale2, str2, timeZone, c1317b3);
                }
            }
            str2 = this.f4142d;
            timeZone = this.f4144f;
            return new C1319d(str, c1318c2, locale2, str2, timeZone, c1317b3);
        }

        public final Boolean m3114a(C1316a c1316a) {
            C1317b c1317b = this.f4143e;
            int ordinal = 1 << c1316a.ordinal();
            return (c1317b.f4127b & ordinal) != 0 ? Boolean.FALSE : (ordinal & c1317b.f4126a) != 0 ? Boolean.TRUE : null;
        }

        public final TimeZone m3115b() {
            TimeZone timeZone = this.f4144f;
            if (timeZone == null) {
                if (this.f4142d == null) {
                    return null;
                }
                timeZone = TimeZone.getTimeZone(this.f4142d);
                this.f4144f = timeZone;
            }
            return timeZone;
        }

        public final boolean m3116c() {
            return this.f4139a != null && this.f4139a.length() > 0;
        }

        public final boolean m3117d() {
            return this.f4141c != null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C1319d c1319d = (C1319d) obj;
            return this.f4140b == c1319d.f4140b && this.f4143e.equals(c1319d.f4143e) && C1319d.m3112a(this.f4142d, c1319d.f4142d) && C1319d.m3112a(this.f4139a, c1319d.f4139a) && C1319d.m3112a(this.f4144f, c1319d.f4144f) && C1319d.m3112a(this.f4141c, c1319d.f4141c);
        }

        public final int hashCode() {
            int hashCode = this.f4142d == null ? 1 : this.f4142d.hashCode();
            if (this.f4139a != null) {
                hashCode ^= this.f4139a.hashCode();
            }
            hashCode += this.f4140b.hashCode();
            if (this.f4141c != null) {
                hashCode ^= this.f4141c.hashCode();
            }
            return hashCode + this.f4143e.hashCode();
        }

        public final String toString() {
            return String.format("[pattern=%s,shape=%s,locale=%s,timezone=%s]", new Object[]{this.f4139a, this.f4140b, this.f4141c, this.f4142d});
        }
    }

    String m3118a() default "";

    C1318c m3119b() default C1318c.ANY;

    String m3120c() default "##default";

    String m3121d() default "##default";

    C1316a[] m3122e() default {};

    C1316a[] m3123f() default {};
}
