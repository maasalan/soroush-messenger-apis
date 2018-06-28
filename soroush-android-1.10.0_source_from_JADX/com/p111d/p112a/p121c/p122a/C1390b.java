package com.p111d.p112a.p121c.p122a;

import com.p111d.p112a.p113a.C1329q.C1327a;
import com.p111d.p112a.p121c.p134k.C7304t;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1390b {

    public @interface C1388a {
        String m3375a();

        String m3376b() default "";

        String m3377c() default "";

        C1327a m3378d() default C1327a.NON_NULL;

        boolean m3379e() default false;
    }

    public @interface C1389b {
        Class<? extends C7304t> m3380a();

        String m3381b() default "";

        String m3382c() default "";

        C1327a m3383d() default C1327a.NON_NULL;

        boolean m3384e() default false;

        Class<?> m3385f() default Object.class;
    }

    C1388a[] m3386a() default {};

    C1389b[] m3387b() default {};

    boolean m3388c() default false;
}
