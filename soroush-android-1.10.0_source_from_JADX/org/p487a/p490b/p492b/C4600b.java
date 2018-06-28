package org.p487a.p490b.p492b;

import java.util.Hashtable;
import java.util.StringTokenizer;
import org.p487a.p488a.C4596a;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p488a.C4598d;
import org.p487a.p488a.p489a.C7241c;
import org.p487a.p490b.p492b.C7001c.C6296a;

public final class C4600b {
    static Hashtable f12616e;
    static Class f12617f;
    private static Object[] f12618g = new Object[0];
    Class f12619a;
    ClassLoader f12620b;
    String f12621c;
    int f12622d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        f12616e = hashtable;
        hashtable.put("void", Void.TYPE);
        f12616e.put("boolean", Boolean.TYPE);
        f12616e.put("byte", Byte.TYPE);
        f12616e.put("char", Character.TYPE);
        f12616e.put("short", Short.TYPE);
        f12616e.put("int", Integer.TYPE);
        f12616e.put("long", Long.TYPE);
        f12616e.put("float", Float.TYPE);
        f12616e.put("double", Double.TYPE);
    }

    public C4600b(String str, Class cls) {
        this.f12621c = str;
        this.f12619a = cls;
        this.f12620b = cls.getClassLoader();
    }

    private static Class m8318a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    static java.lang.Class m8319a(java.lang.String r1, java.lang.ClassLoader r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "*";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x000a;
    L_0x0008:
        r1 = 0;
        return r1;
    L_0x000a:
        r0 = f12616e;
        r0 = r0.get(r1);
        r0 = (java.lang.Class) r0;
        if (r0 == 0) goto L_0x0015;
    L_0x0014:
        return r0;
    L_0x0015:
        if (r2 != 0) goto L_0x001c;
    L_0x0017:
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0022 }
        return r1;	 Catch:{ ClassNotFoundException -> 0x0022 }
    L_0x001c:
        r0 = 0;	 Catch:{ ClassNotFoundException -> 0x0022 }
        r1 = java.lang.Class.forName(r1, r0, r2);	 Catch:{ ClassNotFoundException -> 0x0022 }
        return r1;
    L_0x0022:
        r1 = f12617f;
        if (r1 != 0) goto L_0x002f;
    L_0x0026:
        r1 = "java.lang.ClassNotFoundException";
        r1 = org.p487a.p490b.p492b.C4600b.m8318a(r1);
        f12617f = r1;
        return r1;
    L_0x002f:
        r1 = f12617f;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.a.b.b.b.a(java.lang.String, java.lang.ClassLoader):java.lang.Class");
    }

    public static C4596a m8320a(C7000a c7000a, Object obj, Object obj2) {
        return new C7001c(c7000a, obj, obj2, f12618g);
    }

    public static C4596a m8321a(C7000a c7000a, Object obj, Object obj2, Object obj3) {
        return new C7001c(c7000a, obj, obj2, new Object[]{obj3});
    }

    public static C4596a m8322a(C7000a c7000a, Object obj, Object obj2, Object obj3, Object obj4) {
        return new C7001c(c7000a, obj, obj2, new Object[]{obj3, obj4});
    }

    public static C4596a m8323a(C7000a c7000a, Object obj, Object obj2, Object[] objArr) {
        return new C7001c(c7000a, obj, obj2, objArr);
    }

    public final C7000a m8324a(String str, C4598d c4598d, int i) {
        int i2 = this.f12622d;
        this.f12622d = i2 + 1;
        return new C6296a(i2, str, c4598d, new C6299g(this.f12619a, this.f12621c, i));
    }

    public final C7241c m8325a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int parseInt = Integer.parseInt(str, 16);
        Class a = C4600b.m8319a(str3, this.f12620b);
        StringTokenizer stringTokenizer = new StringTokenizer(str4, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        int i = 0;
        for (int i2 = 0; i2 < countTokens; i2++) {
            clsArr[i2] = C4600b.m8319a(stringTokenizer.nextToken(), r0.f12620b);
        }
        stringTokenizer = new StringTokenizer(str5, ":");
        countTokens = stringTokenizer.countTokens();
        String[] strArr = new String[countTokens];
        for (int i3 = 0; i3 < countTokens; i3++) {
            strArr[i3] = stringTokenizer.nextToken();
        }
        stringTokenizer = new StringTokenizer(str6, ":");
        countTokens = stringTokenizer.countTokens();
        Class[] clsArr2 = new Class[countTokens];
        while (i < countTokens) {
            clsArr2[i] = C4600b.m8319a(stringTokenizer.nextToken(), r0.f12620b);
            i++;
        }
        return new C7401e(parseInt, str2, a, clsArr, strArr, clsArr2, C4600b.m8319a(str7, r0.f12620b));
    }
}
