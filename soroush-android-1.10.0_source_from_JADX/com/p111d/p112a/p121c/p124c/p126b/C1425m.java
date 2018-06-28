package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p121c.C1507k;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C1425m {
    private static final HashSet<String> f4508a = new HashSet();

    static {
        r1 = new Class[4];
        int i = 0;
        r1[0] = UUID.class;
        r1[1] = AtomicBoolean.class;
        r1[2] = StackTraceElement.class;
        r1[3] = ByteBuffer.class;
        for (int i2 = 0; i2 < 4; i2++) {
            f4508a.add(r1[i2].getName());
        }
        Class[] f = C7060l.m18340f();
        while (i < 12) {
            f4508a.add(f[i].getName());
            i++;
        }
    }

    public static C1507k<?> m3521a(Class<?> cls, String str) {
        if (f4508a.contains(str)) {
            C1507k a = C7060l.m18339a(cls);
            if (a != null) {
                return a;
            }
            if (cls == UUID.class) {
                return new ah();
            }
            if (cls == StackTraceElement.class) {
                return new C7079v();
            }
            if (cls == AtomicBoolean.class) {
                return new C7054b();
            }
            if (cls == ByteBuffer.class) {
                return new C7055e();
            }
        }
        return null;
    }
}
