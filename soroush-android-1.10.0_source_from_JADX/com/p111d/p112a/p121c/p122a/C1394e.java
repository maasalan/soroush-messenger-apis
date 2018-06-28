package com.p111d.p112a.p121c.p122a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1394e {

    public static class C1393a {
        public final String f4405a;
        public final String f4406b;

        public C1393a(C1394e c1394e) {
            this.f4405a = c1394e.m3399a();
            this.f4406b = c1394e.m3400b();
        }
    }

    String m3399a() default "build";

    String m3400b() default "with";
}
