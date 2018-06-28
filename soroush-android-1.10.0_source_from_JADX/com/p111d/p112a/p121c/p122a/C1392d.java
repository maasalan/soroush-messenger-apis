package com.p111d.p112a.p121c.p122a;

import com.p111d.p112a.p121c.C1550w;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1392d {
    Class<? extends C1550w> m3398a() default C1550w.class;
}
