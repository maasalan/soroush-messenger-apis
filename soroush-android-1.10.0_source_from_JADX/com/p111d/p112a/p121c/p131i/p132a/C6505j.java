package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p121c.C1448e;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.util.EnumMap;
import java.util.EnumSet;

public class C6505j extends C5352o {
    public C6505j(C5354j c5354j, C1513m c1513m) {
        super(c5354j, c1513m);
    }

    private String m15671b(Object obj, Class<?> cls) {
        Class superclass;
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            superclass = cls.getSuperclass();
        }
        String name = superclass.getName();
        if (name.startsWith("java.util")) {
            if (obj instanceof EnumSet) {
                return C1513m.m3909a().m3922a(EnumSet.class, C1527g.m3950a((EnumSet) obj)).mo2933c();
            } else if (obj instanceof EnumMap) {
                return C1513m.m3909a().m3924a(EnumMap.class, C1527g.m3949a((EnumMap) obj), Object.class).mo2933c();
            } else {
                String substring = name.substring(9);
                if ((substring.startsWith(".Arrays$") || substring.startsWith(".Collections$")) && name.indexOf("List") >= 0) {
                    return "java.util.ArrayList";
                }
            }
        } else if (name.indexOf(36) >= 0 && C1527g.m3968c(superclass) != null && C1527g.m3968c(this.d.m11531e()) == null) {
            name = this.d.m11531e().getName();
        }
        return name;
    }

    public final C5354j mo1455a(C1448e c1448e, String str) {
        return mo3365a(str, c1448e.mo1297b());
    }

    protected com.p111d.p112a.p121c.C5354j mo3365a(java.lang.String r4, com.p111d.p112a.p121c.p137l.C1513m r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 60;
        r0 = r4.indexOf(r0);
        if (r0 <= 0) goto L_0x000d;
    L_0x0008:
        r4 = r5.m3926b(r4);
        return r4;
    L_0x000d:
        r0 = r5.m3925a(r4);	 Catch:{ ClassNotFoundException -> 0x0039, Exception -> 0x0018 }
        r1 = r3.d;	 Catch:{ ClassNotFoundException -> 0x0039, Exception -> 0x0018 }
        r5 = r5.m3918a(r1, r0);	 Catch:{ ClassNotFoundException -> 0x0039, Exception -> 0x0018 }
        return r5;
    L_0x0018:
        r5 = move-exception;
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "Invalid type id '";
        r1.<init>(r2);
        r1.append(r4);
        r4 = "' (for id type 'Id.class'): ";
        r1.append(r4);
        r4 = r5.getMessage();
        r1.append(r4);
        r4 = r1.toString();
        r0.<init>(r4, r5);
        throw r0;
    L_0x0039:
        r5 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = "Invalid type id '";
        r0.<init>(r1);
        r0.append(r4);
        r4 = "' (for id type 'Id.class'): no such class found";
        r0.append(r4);
        r4 = r0.toString();
        r5.<init>(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.i.a.j.a(java.lang.String, com.d.a.c.l.m):com.d.a.c.j");
    }

    public String mo2913a(Object obj) {
        return m15671b(obj, obj.getClass());
    }

    public final String mo2914a(Object obj, Class<?> cls) {
        return m15671b(obj, cls);
    }

    public final String mo2915b() {
        return "class name used as type id";
    }
}
