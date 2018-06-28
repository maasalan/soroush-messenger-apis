package com.p111d.p112a.p113a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface aa {

    public enum C1301a {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    public enum C1302b {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        CUSTOM(null);
        
        public final String f4101f;

        private C1302b(String str) {
            this.f4101f = str;
        }
    }

    @Deprecated
    public static abstract class C1303c {
    }

    C1302b m3076a();

    C1301a m3077b() default C1301a.PROPERTY;

    String m3078c() default "";

    Class<?> m3079d() default C1303c.class;

    boolean m3080e() default false;
}
