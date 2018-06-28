package com.p111d.p112a.p121c.p122a;

import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C1545o.C5383a;
import com.p111d.p112a.p121c.p138m.C1529i;
import com.p111d.p112a.p121c.p138m.C1529i.C5372a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1397f {

    @Deprecated
    public enum C1395a {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    public enum C1396b {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }

    Class<? extends C1545o> m3401a() default C5383a.class;

    Class<? extends C1545o> m3402b() default C5383a.class;

    Class<? extends C1545o> m3403c() default C5383a.class;

    Class<? extends C1545o> m3404d() default C5383a.class;

    Class<?> m3405e() default Void.class;

    Class<?> m3406f() default Void.class;

    Class<?> m3407g() default Void.class;

    C1396b m3408h() default C1396b.DEFAULT_TYPING;

    Class<? extends C1529i> m3409i() default C5372a.class;

    Class<? extends C1529i> m3410j() default C5372a.class;

    @Deprecated
    C1395a m3411k() default C1395a.DEFAULT_INCLUSION;
}
