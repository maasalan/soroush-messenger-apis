package com.p111d.p112a.p121c.p130h;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1469b {
    String m3758a() default "";

    String m3759b() default "any";

    @Deprecated
    String m3760c() default "##irrelevant";

    @Deprecated
    String m3761d() default "##irrelevant";
}
