package com.p111d.p112a.p113a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface C1310e {

    public enum C1309a {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean m3098a(java.lang.reflect.Member r4) {
            /*
            r3 = this;
            r0 = com.p111d.p112a.p113a.C1310e.C13081.f4106a;
            r1 = r3.ordinal();
            r0 = r0[r1];
            r1 = 1;
            r2 = 0;
            switch(r0) {
                case 1: goto L_0x002e;
                case 2: goto L_0x002d;
                case 3: goto L_0x0022;
                case 4: goto L_0x000e;
                case 5: goto L_0x0019;
                default: goto L_0x000d;
            };
        L_0x000d:
            return r2;
        L_0x000e:
            r0 = r4.getModifiers();
            r0 = java.lang.reflect.Modifier.isProtected(r0);
            if (r0 == 0) goto L_0x0019;
        L_0x0018:
            return r1;
        L_0x0019:
            r4 = r4.getModifiers();
            r4 = java.lang.reflect.Modifier.isPublic(r4);
            return r4;
        L_0x0022:
            r4 = r4.getModifiers();
            r4 = java.lang.reflect.Modifier.isPrivate(r4);
            if (r4 != 0) goto L_0x002d;
        L_0x002c:
            return r1;
        L_0x002d:
            return r2;
        L_0x002e:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.d.a.a.e.a.a(java.lang.reflect.Member):boolean");
        }
    }

    C1309a m3099a() default C1309a.DEFAULT;

    C1309a m3100b() default C1309a.DEFAULT;

    C1309a m3101c() default C1309a.DEFAULT;

    C1309a m3102d() default C1309a.DEFAULT;

    C1309a m3103e() default C1309a.DEFAULT;
}
