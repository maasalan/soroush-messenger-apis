package com.p111d.p112a.p121c.p122a;

import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1507k.C5355a;
import com.p111d.p112a.p121c.C1546p;
import com.p111d.p112a.p121c.C1546p.C5384a;
import com.p111d.p112a.p121c.p138m.C1529i;
import com.p111d.p112a.p121c.p138m.C1529i.C5372a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1391c {
    Class<? extends C1507k> m3389a() default C5355a.class;

    Class<? extends C1507k> m3390b() default C5355a.class;

    Class<? extends C1546p> m3391c() default C5384a.class;

    Class<?> m3392d() default Void.class;

    Class<? extends C1529i> m3393e() default C5372a.class;

    Class<? extends C1529i> m3394f() default C5372a.class;

    Class<?> m3395g() default Void.class;

    Class<?> m3396h() default Void.class;

    Class<?> m3397i() default Void.class;
}
