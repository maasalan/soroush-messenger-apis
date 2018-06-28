package com.p111d.p112a.p113a;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1329q {

    public enum C1327a {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        USE_DEFAULTS
    }

    public static class C1328b implements Serializable {
        protected static final C1328b f4152a = new C1328b(C1327a.USE_DEFAULTS, C1327a.USE_DEFAULTS);
        protected final C1327a f4153b;
        protected final C1327a f4154c;

        private C1328b(C1327a c1327a, C1327a c1327a2) {
            if (c1327a == null) {
                c1327a = C1327a.USE_DEFAULTS;
            }
            this.f4153b = c1327a;
            if (c1327a2 == null) {
                c1327a2 = C1327a.USE_DEFAULTS;
            }
            this.f4154c = c1327a2;
        }

        public static C1328b m3136a() {
            return f4152a;
        }

        public static C1328b m3137a(C1327a c1327a, C1327a c1327a2) {
            if (c1327a == C1327a.USE_DEFAULTS || c1327a == null) {
                if (c1327a2 != C1327a.USE_DEFAULTS) {
                    if (c1327a2 == null) {
                    }
                }
                return f4152a;
            }
            return new C1328b(c1327a, c1327a2);
        }

        public final C1328b m3138a(C1328b c1328b) {
            if (c1328b == null || c1328b == f4152a) {
                return this;
            }
            C1327a c1327a = c1328b.f4153b;
            C1327a c1327a2 = c1328b.f4154c;
            Object obj = null;
            Object obj2 = (c1327a == this.f4153b || c1327a == C1327a.USE_DEFAULTS) ? null : 1;
            if (!(c1327a2 == this.f4154c || c1327a2 == C1327a.USE_DEFAULTS)) {
                obj = 1;
            }
            if (obj2 != null) {
                return obj != null ? new C1328b(c1327a, c1327a2) : new C1328b(c1327a, this.f4154c);
            } else {
                if (obj != null) {
                    return new C1328b(this.f4153b, c1327a2);
                }
                return this;
            }
        }

        public final C1327a m3139b() {
            return this.f4153b;
        }

        public final C1327a m3140c() {
            return this.f4154c;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C1328b c1328b = (C1328b) obj;
            return c1328b.f4153b == this.f4153b && c1328b.f4154c == this.f4154c;
        }

        public final int hashCode() {
            return (this.f4153b.hashCode() << 2) + this.f4154c.hashCode();
        }

        public final String toString() {
            return String.format("[value=%s,content=%s]", new Object[]{this.f4153b, this.f4154c});
        }
    }

    C1327a m3141a() default C1327a.ALWAYS;

    C1327a m3142b() default C1327a.ALWAYS;
}
