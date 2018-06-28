package com.p111d.p112a.p121c;

import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C1378k;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.io.Closeable;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class C5364l extends C1378k {
    protected LinkedList<C7122a> f14929a;
    protected Closeable f14930c;

    public static class C7122a implements Serializable {
        protected Object f4680a;
        protected String f4681b;
        protected int f4682c = -1;

        protected C7122a() {
        }

        public C7122a(Object obj, int i) {
            this.f4680a = obj;
            this.f4682c = i;
        }

        public C7122a(Object obj, String str) {
            this.f4680a = obj;
            if (str == null) {
                throw new NullPointerException("Can not pass null fieldName");
            }
            this.f4681b = str;
        }

        public final String toString() {
            char c;
            StringBuilder stringBuilder = new StringBuilder();
            Class cls = this.f4680a instanceof Class ? (Class) this.f4680a : this.f4680a.getClass();
            String g = C1527g.m3972g(cls);
            if (g != null) {
                stringBuilder.append(g);
                stringBuilder.append('.');
            }
            stringBuilder.append(cls.getSimpleName());
            stringBuilder.append('[');
            if (this.f4681b != null) {
                c = '\"';
                stringBuilder.append('\"');
                stringBuilder.append(this.f4681b);
            } else if (this.f4682c >= 0) {
                stringBuilder.append(this.f4682c);
                stringBuilder.append(']');
                return stringBuilder.toString();
            } else {
                c = '?';
            }
            stringBuilder.append(c);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    public C5364l(Closeable closeable, String str) {
        super(str);
        this.f14930c = closeable;
        if (closeable instanceof C5303j) {
            this.b = ((C5303j) closeable).getTokenLocation();
        }
    }

    public C5364l(Closeable closeable, String str, C1375h c1375h) {
        super(str, c1375h);
        this.f14930c = closeable;
    }

    public C5364l(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this.f14930c = closeable;
        if (closeable instanceof C5303j) {
            this.b = ((C5303j) closeable).getTokenLocation();
        }
    }

    public static C5364l m11570a(C5301g c5301g, String str) {
        return new C5364l((Closeable) c5301g, str, null);
    }

    public static C5364l m11571a(C5301g c5301g, String str, Throwable th) {
        return new C5364l((Closeable) c5301g, str, th);
    }

    public static C5364l m11572a(C5303j c5303j, String str) {
        return new C5364l(c5303j, str);
    }

    public static C5364l m11573a(C5303j c5303j, String str, Throwable th) {
        return new C5364l((Closeable) c5303j, str, th);
    }

    public static C5364l m11574a(C5347g c5347g, String str) {
        return new C5364l(c5347g.m11472k(), str);
    }

    public static C5364l m11575a(C5347g c5347g, String str, Throwable th) {
        return new C5364l(c5347g.m11472k(), str, th);
    }

    public static C5364l m11576a(String str) {
        return new C5364l(null, str);
    }

    public static C5364l m11577a(String str, Throwable th) {
        return new C5364l(null, str, th);
    }

    private static C5364l m11578a(Throwable th, C7122a c7122a) {
        C5364l c5364l;
        if (th instanceof C5364l) {
            c5364l = (C5364l) th;
        } else {
            String message = th.getMessage();
            if (message == null || message.length() == 0) {
                StringBuilder stringBuilder = new StringBuilder("(was ");
                stringBuilder.append(th.getClass().getName());
                stringBuilder.append(")");
                message = stringBuilder.toString();
            }
            Closeable closeable = null;
            if (th instanceof C1378k) {
                Object a = ((C1378k) th).mo1282a();
                if (a instanceof Closeable) {
                    closeable = (Closeable) a;
                }
            }
            c5364l = new C5364l(closeable, message, th);
        }
        c5364l.m11583a(c7122a);
        return c5364l;
    }

    public static C5364l m11579a(Throwable th, Object obj, int i) {
        return C5364l.m11578a(th, new C7122a(obj, i));
    }

    public static C5364l m11580a(Throwable th, Object obj, String str) {
        return C5364l.m11578a(th, new C7122a(obj, str));
    }

    private StringBuilder m11581a(StringBuilder stringBuilder) {
        if (this.f14929a != null) {
            Iterator it = this.f14929a.iterator();
            while (it.hasNext()) {
                stringBuilder.append(((C7122a) it.next()).toString());
                if (it.hasNext()) {
                    stringBuilder.append("->");
                }
            }
        }
        return stringBuilder;
    }

    private String m11582d() {
        String message = super.getMessage();
        if (this.f14929a == null) {
            return message;
        }
        StringBuilder stringBuilder = message == null ? new StringBuilder() : new StringBuilder(message);
        stringBuilder.append(" (through reference chain: ");
        stringBuilder = m11581a(stringBuilder);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void m11583a(C7122a c7122a) {
        if (this.f14929a == null) {
            this.f14929a = new LinkedList();
        }
        if (this.f14929a.size() < IjkMediaCodecInfo.RANK_MAX) {
            this.f14929a.addFirst(c7122a);
        }
    }

    public final void m11584a(Object obj, String str) {
        m11583a(new C7122a(obj, str));
    }

    public String getLocalizedMessage() {
        return m11582d();
    }

    public String getMessage() {
        return m11582d();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(getMessage());
        return stringBuilder.toString();
    }
}
