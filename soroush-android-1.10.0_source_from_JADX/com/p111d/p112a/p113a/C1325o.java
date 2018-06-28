package com.p111d.p112a.p113a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1325o {
    String[] m3131a() default {};

    boolean m3132b() default false;

    boolean m3133c() default false;

    boolean m3134d() default false;
}
