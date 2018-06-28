package org.apache.p497b.p498a.p499a.p500a;

import java.util.ResourceBundle;

public final class C4609a {
    private static ResourceBundle f12666a;

    public static java.lang.String m8351a(java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = f12666a;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return r2;
    L_0x0005:
        r0 = f12666a;	 Catch:{ MissingResourceException -> 0x000c }
        r0 = r0.getString(r2);	 Catch:{ MissingResourceException -> 0x000c }
        return r0;
    L_0x000c:
        r0 = new java.lang.StringBuilder;
        r1 = "Missing message: ";
        r0.<init>(r1);
        r0.append(r2);
        r2 = r0.toString();
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.b.a.a.a.a.a(java.lang.String):java.lang.String");
    }

    public static String m8352a(String str, Object obj) {
        return C4609a.m8354a(str, new Object[]{obj});
    }

    public static String m8353a(String str, Object obj, Object obj2) {
        return C4609a.m8354a(str, new Object[]{obj, obj2});
    }

    private static java.lang.String m8354a(java.lang.String r8, java.lang.Object[] r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = f12666a;
        if (r0 == 0) goto L_0x000b;
    L_0x0004:
        r0 = f12666a;	 Catch:{ MissingResourceException -> 0x000b }
        r0 = r0.getString(r8);	 Catch:{ MissingResourceException -> 0x000b }
        r8 = r0;
    L_0x000b:
        r0 = new java.lang.StringBuilder;
        r1 = r8.length();
        r2 = 0;
        r3 = r9.length;
        r3 = r3 * 20;
        r1 = r1 + r3;
        r0.<init>(r1);
        r1 = r9.length;
        r1 = new java.lang.String[r1];
        r3 = r2;
    L_0x001d:
        r4 = r9.length;
        if (r3 >= r4) goto L_0x0034;
    L_0x0020:
        r4 = r9[r3];
        if (r4 != 0) goto L_0x0029;
    L_0x0024:
        r4 = "<null>";
        r1[r3] = r4;
        goto L_0x0031;
    L_0x0029:
        r4 = r9[r3];
        r4 = r4.toString();
        r1[r3] = r4;
    L_0x0031:
        r3 = r3 + 1;
        goto L_0x001d;
    L_0x0034:
        r9 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
    L_0x0036:
        r3 = r8.indexOf(r9, r2);
        if (r3 < 0) goto L_0x00aa;
    L_0x003c:
        if (r3 == 0) goto L_0x0059;
    L_0x003e:
        r4 = r3 + -1;
        r5 = r8.charAt(r4);
        r6 = 92;
        if (r5 != r6) goto L_0x0059;
    L_0x0048:
        r5 = 1;
        if (r3 == r5) goto L_0x0052;
    L_0x004b:
        r2 = r8.substring(r2, r4);
        r0.append(r2);
    L_0x0052:
        r0.append(r9);
        r3 = r3 + 1;
    L_0x0057:
        r2 = r3;
        goto L_0x0036;
    L_0x0059:
        r4 = r8.length();
        r4 = r4 + -3;
        if (r3 <= r4) goto L_0x0071;
    L_0x0061:
        r3 = r8.length();
        r2 = r8.substring(r2, r3);
        r0.append(r2);
        r2 = r8.length();
        goto L_0x0036;
    L_0x0071:
        r4 = r3 + 1;
        r5 = r8.charAt(r4);
        r6 = 10;
        r5 = java.lang.Character.digit(r5, r6);
        r5 = (byte) r5;
        if (r5 < 0) goto L_0x00a1;
    L_0x0080:
        r6 = r3 + 2;
        r6 = r8.charAt(r6);
        r7 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        if (r6 == r7) goto L_0x008b;
    L_0x008a:
        goto L_0x00a1;
    L_0x008b:
        r2 = r8.substring(r2, r3);
        r0.append(r2);
        r2 = r1.length;
        if (r5 < r2) goto L_0x009b;
    L_0x0095:
        r2 = "<missing argument>";
    L_0x0097:
        r0.append(r2);
        goto L_0x009e;
    L_0x009b:
        r2 = r1[r5];
        goto L_0x0097;
    L_0x009e:
        r3 = r3 + 3;
        goto L_0x0057;
    L_0x00a1:
        r2 = r8.substring(r2, r4);
        r0.append(r2);
        r2 = r4;
        goto L_0x0036;
    L_0x00aa:
        r9 = r8.length();
        if (r2 >= r9) goto L_0x00bb;
    L_0x00b0:
        r9 = r8.length();
        r8 = r8.substring(r2, r9);
        r0.append(r8);
    L_0x00bb:
        r8 = r0.toString();
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.b.a.a.a.a.a(java.lang.String, java.lang.Object[]):java.lang.String");
    }
}
