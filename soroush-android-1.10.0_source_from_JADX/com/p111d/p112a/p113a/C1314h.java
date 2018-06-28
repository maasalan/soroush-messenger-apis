package com.p111d.p112a.p113a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1314h {

    public enum C1313a {
        DEFAULT,
        DELEGATING,
        PROPERTIES,
        DISABLED
    }

    C1313a m3106a() default C1313a.DEFAULT;
}
