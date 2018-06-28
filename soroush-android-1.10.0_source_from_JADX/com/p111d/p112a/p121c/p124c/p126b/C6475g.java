package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p124c.C6488s;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public abstract class C6475g<T> extends C5320x<T> {
    protected C6475g(C5354j c5354j) {
        super(c5354j);
    }

    protected static void m15453a(Throwable th, Object obj, String str) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (!(th instanceof IOException) || (th instanceof C5364l)) {
            throw C5364l.m11580a(th, obj, str);
        } else {
            throw ((IOException) th);
        }
    }

    public final C6488s mo1310a(String str) {
        C1507k f = mo3344f();
        if (f != null) {
            return f.mo1310a(str);
        }
        StringBuilder stringBuilder = new StringBuilder("Can not handle managed/back reference '");
        stringBuilder.append(str);
        stringBuilder.append("': type: container deserializer of type ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" returned null for 'getContentDeserializer()'");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public abstract C1507k<Object> mo3344f();
}
