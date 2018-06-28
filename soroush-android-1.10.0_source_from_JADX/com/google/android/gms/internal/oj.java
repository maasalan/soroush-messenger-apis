package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;

public final class oj {
    public static <T extends oi> String m5130a(T t) {
        String str;
        String valueOf;
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            m5132a(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            str = "Error printing proto: ";
            valueOf = String.valueOf(e.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (InvocationTargetException e2) {
            str = "Error printing proto: ";
            valueOf = String.valueOf(e2.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
    }

    private static String m5131a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    private static void m5132a(java.lang.String r11, java.lang.Object r12, java.lang.StringBuffer r13, java.lang.StringBuffer r14) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        if (r12 == 0) goto L_0x015f;
    L_0x0002:
        r0 = r12 instanceof com.google.android.gms.internal.oi;
        r1 = 0;
        if (r0 == 0) goto L_0x0108;
    L_0x0007:
        r0 = r13.length();
        if (r11 == 0) goto L_0x0021;
    L_0x000d:
        r14.append(r13);
        r2 = m5131a(r11);
        r14.append(r2);
        r2 = " <\n";
        r14.append(r2);
        r2 = "  ";
        r13.append(r2);
    L_0x0021:
        r2 = r12.getClass();
        r3 = r2.getFields();
        r4 = r3.length;
        r5 = r1;
    L_0x002b:
        if (r5 >= r4) goto L_0x008b;
    L_0x002d:
        r6 = r3[r5];
        r7 = r6.getModifiers();
        r8 = r6.getName();
        r9 = "cachedSize";
        r9 = r9.equals(r8);
        if (r9 != 0) goto L_0x0088;
    L_0x003f:
        r9 = r7 & 1;
        r10 = 1;
        if (r9 != r10) goto L_0x0088;
    L_0x0044:
        r7 = r7 & 8;
        r9 = 8;
        if (r7 == r9) goto L_0x0088;
    L_0x004a:
        r7 = "_";
        r7 = r8.startsWith(r7);
        if (r7 != 0) goto L_0x0088;
    L_0x0052:
        r7 = "_";
        r7 = r8.endsWith(r7);
        if (r7 != 0) goto L_0x0088;
    L_0x005a:
        r7 = r6.getType();
        r6 = r6.get(r12);
        r9 = r7.isArray();
        if (r9 == 0) goto L_0x0085;
    L_0x0068:
        r7 = r7.getComponentType();
        r9 = java.lang.Byte.TYPE;
        if (r7 == r9) goto L_0x0085;
    L_0x0070:
        if (r6 != 0) goto L_0x0074;
    L_0x0072:
        r7 = r1;
        goto L_0x0078;
    L_0x0074:
        r7 = java.lang.reflect.Array.getLength(r6);
    L_0x0078:
        r9 = r1;
    L_0x0079:
        if (r9 >= r7) goto L_0x0088;
    L_0x007b:
        r10 = java.lang.reflect.Array.get(r6, r9);
        m5132a(r8, r10, r13, r14);
        r9 = r9 + 1;
        goto L_0x0079;
    L_0x0085:
        m5132a(r8, r6, r13, r14);
    L_0x0088:
        r5 = r5 + 1;
        goto L_0x002b;
    L_0x008b:
        r3 = r2.getMethods();
        r4 = r3.length;
        r5 = r1;
    L_0x0091:
        if (r5 >= r4) goto L_0x00fa;
    L_0x0093:
        r6 = r3[r5];
        r6 = r6.getName();
        r7 = "set";
        r7 = r6.startsWith(r7);
        if (r7 == 0) goto L_0x00f7;
    L_0x00a1:
        r7 = 3;
        r6 = r6.substring(r7);
        r7 = "has";	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r8 = java.lang.String.valueOf(r6);	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r9 = r8.length();	 Catch:{ NoSuchMethodException -> 0x00f7 }
        if (r9 == 0) goto L_0x00b7;	 Catch:{ NoSuchMethodException -> 0x00f7 }
    L_0x00b2:
        r7 = r7.concat(r8);	 Catch:{ NoSuchMethodException -> 0x00f7 }
        goto L_0x00bd;	 Catch:{ NoSuchMethodException -> 0x00f7 }
    L_0x00b7:
        r8 = new java.lang.String;	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r8.<init>(r7);	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r7 = r8;	 Catch:{ NoSuchMethodException -> 0x00f7 }
    L_0x00bd:
        r8 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r7 = r2.getMethod(r7, r8);	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r8 = new java.lang.Object[r1];
        r7 = r7.invoke(r12, r8);
        r7 = (java.lang.Boolean) r7;
        r7 = r7.booleanValue();
        if (r7 == 0) goto L_0x00f7;
    L_0x00d1:
        r7 = "get";	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r8 = java.lang.String.valueOf(r6);	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r9 = r8.length();	 Catch:{ NoSuchMethodException -> 0x00f7 }
        if (r9 == 0) goto L_0x00e2;	 Catch:{ NoSuchMethodException -> 0x00f7 }
    L_0x00dd:
        r7 = r7.concat(r8);	 Catch:{ NoSuchMethodException -> 0x00f7 }
        goto L_0x00e8;	 Catch:{ NoSuchMethodException -> 0x00f7 }
    L_0x00e2:
        r8 = new java.lang.String;	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r8.<init>(r7);	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r7 = r8;	 Catch:{ NoSuchMethodException -> 0x00f7 }
    L_0x00e8:
        r8 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r7 = r2.getMethod(r7, r8);	 Catch:{ NoSuchMethodException -> 0x00f7 }
        r8 = new java.lang.Object[r1];
        r7 = r7.invoke(r12, r8);
        m5132a(r6, r7, r13, r14);
    L_0x00f7:
        r5 = r5 + 1;
        goto L_0x0091;
    L_0x00fa:
        if (r11 == 0) goto L_0x0107;
    L_0x00fc:
        r13.setLength(r0);
        r14.append(r13);
        r11 = ">\n";
        r14.append(r11);
    L_0x0107:
        return;
    L_0x0108:
        r11 = m5131a(r11);
        r14.append(r13);
        r14.append(r11);
        r11 = ": ";
        r14.append(r11);
        r11 = r12 instanceof java.lang.String;
        if (r11 == 0) goto L_0x014d;
    L_0x011b:
        r12 = (java.lang.String) r12;
        r11 = "http";
        r11 = r12.startsWith(r11);
        if (r11 != 0) goto L_0x013b;
    L_0x0125:
        r11 = r12.length();
        r13 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r11 <= r13) goto L_0x013b;
    L_0x012d:
        r11 = r12.substring(r1, r13);
        r11 = java.lang.String.valueOf(r11);
        r12 = "[...]";
        r12 = r11.concat(r12);
    L_0x013b:
        r11 = m5134b(r12);
        r12 = "\"";
        r14.append(r12);
        r14.append(r11);
        r11 = "\"";
        r14.append(r11);
        goto L_0x015a;
    L_0x014d:
        r11 = r12 instanceof byte[];
        if (r11 == 0) goto L_0x0157;
    L_0x0151:
        r12 = (byte[]) r12;
        m5133a(r12, r14);
        goto L_0x015a;
    L_0x0157:
        r14.append(r12);
    L_0x015a:
        r11 = "\n";
        r14.append(r11);
    L_0x015f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.oj.a(java.lang.String, java.lang.Object, java.lang.StringBuffer, java.lang.StringBuffer):void");
    }

    private static void m5133a(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b : bArr) {
            int i = b & 255;
            if (i != 92) {
                if (i != 34) {
                    if (i < 32 || i >= 127) {
                        stringBuffer.append(String.format("\\%03o", new Object[]{Integer.valueOf(i)}));
                    } else {
                        stringBuffer.append((char) i);
                    }
                }
            }
            stringBuffer.append('\\');
            stringBuffer.append((char) i);
        }
        stringBuffer.append('\"');
    }

    private static String m5134b(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }
}
