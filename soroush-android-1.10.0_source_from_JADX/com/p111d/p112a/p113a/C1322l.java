package com.p111d.p112a.p113a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1322l {
    String m3125a() default "@id";

    Class<? extends af<?>> m3126b();

    Class<? extends ah> m3127c() default ai.class;

    Class<?> m3128d() default Object.class;
}
