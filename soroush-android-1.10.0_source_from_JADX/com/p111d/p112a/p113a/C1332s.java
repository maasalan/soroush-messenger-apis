package com.p111d.p112a.p113a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1332s {

    public enum C1331a {
        AUTO,
        READ_ONLY,
        WRITE_ONLY,
        READ_WRITE
    }

    String m3144a() default "";

    boolean m3145b() default false;

    int m3146c() default -1;

    String m3147d() default "";

    C1331a m3148e() default C1331a.AUTO;
}
