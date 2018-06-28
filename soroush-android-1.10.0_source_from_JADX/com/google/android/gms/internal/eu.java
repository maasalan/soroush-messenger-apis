package com.google.android.gms.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.support.v4.p038g.C4813a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ac;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

final class eu extends hq {
    eu(gr grVar) {
        super(grVar);
    }

    private static java.lang.Boolean m16029a(double r1, com.google.android.gms.internal.jy r3) {
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
        r0 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x000e }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x000e }
        r1 = java.lang.Math.ulp(r1);	 Catch:{ NumberFormatException -> 0x000e }
        r1 = m16036a(r0, r3, r1);	 Catch:{ NumberFormatException -> 0x000e }
        return r1;
    L_0x000e:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.eu.a(double, com.google.android.gms.internal.jy):java.lang.Boolean");
    }

    private static java.lang.Boolean m16030a(long r1, com.google.android.gms.internal.jy r3) {
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
        r0 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x000c }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x000c }
        r1 = 0;	 Catch:{ NumberFormatException -> 0x000c }
        r1 = m16036a(r0, r3, r1);	 Catch:{ NumberFormatException -> 0x000c }
        return r1;
    L_0x000c:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.eu.a(long, com.google.android.gms.internal.jy):java.lang.Boolean");
    }

    private final Boolean m16031a(jw jwVar, kf kfVar, long j) {
        if (jwVar.f18230d != null) {
            Boolean a = m16030a(j, jwVar.f18230d);
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return Boolean.valueOf(false);
            }
        }
        Set hashSet = new HashSet();
        for (jx jxVar : jwVar.f18229c) {
            if (TextUtils.isEmpty(jxVar.f18236d)) {
                mo1623t().f18136c.m4847a("null or empty param name in filter. event", mo1618o().m16194a(kfVar.f18271b));
                return null;
            }
            hashSet.add(jxVar.f18236d);
        }
        Map c4813a = new C4813a();
        for (kg kgVar : kfVar.f18270a) {
            if (hashSet.contains(kgVar.f18276a)) {
                Object obj;
                Object obj2;
                if (kgVar.f18278c != null) {
                    obj = kgVar.f18276a;
                    obj2 = kgVar.f18278c;
                } else if (kgVar.f18279d != null) {
                    obj = kgVar.f18276a;
                    obj2 = kgVar.f18279d;
                } else if (kgVar.f18277b != null) {
                    obj = kgVar.f18276a;
                    obj2 = kgVar.f18277b;
                } else {
                    mo1623t().f18136c.m4848a("Unknown value for param. event, param", mo1618o().m16194a(kfVar.f18271b), mo1618o().m16196b(kgVar.f18276a));
                    return null;
                }
                c4813a.put(obj, obj2);
            }
        }
        for (jx jxVar2 : jwVar.f18229c) {
            boolean equals = Boolean.TRUE.equals(jxVar2.f18235c);
            String str = jxVar2.f18236d;
            if (TextUtils.isEmpty(str)) {
                mo1623t().f18136c.m4847a("Event has empty param name. event", mo1618o().m16194a(kfVar.f18271b));
                return null;
            }
            Object obj3 = c4813a.get(str);
            Boolean a2;
            if (obj3 instanceof Long) {
                if (jxVar2.f18234b == null) {
                    mo1623t().f18136c.m4848a("No number filter for long param. event, param", mo1618o().m16194a(kfVar.f18271b), mo1618o().m16196b(str));
                    return null;
                }
                a2 = m16030a(((Long) obj3).longValue(), jxVar2.f18234b);
                if (a2 == null) {
                    return null;
                }
                if (((1 ^ a2.booleanValue()) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj3 instanceof Double) {
                if (jxVar2.f18234b == null) {
                    mo1623t().f18136c.m4848a("No number filter for double param. event, param", mo1618o().m16194a(kfVar.f18271b), mo1618o().m16196b(str));
                    return null;
                }
                a2 = m16029a(((Double) obj3).doubleValue(), jxVar2.f18234b);
                if (a2 == null) {
                    return null;
                }
                if (((1 ^ a2.booleanValue()) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj3 instanceof String) {
                if (jxVar2.f18233a != null) {
                    a2 = m16035a((String) obj3, jxVar2.f18233a);
                } else if (jxVar2.f18234b != null) {
                    String str2 = (String) obj3;
                    if (ju.m16585j(str2)) {
                        a2 = m16034a(str2, jxVar2.f18234b);
                    } else {
                        mo1623t().f18136c.m4848a("Invalid param value for number filter. event, param", mo1618o().m16194a(kfVar.f18271b), mo1618o().m16196b(str));
                        return null;
                    }
                } else {
                    mo1623t().f18136c.m4848a("No filter for String param. event, param", mo1618o().m16194a(kfVar.f18271b), mo1618o().m16196b(str));
                    return null;
                }
                if (a2 == null) {
                    return null;
                }
                if (((1 ^ a2.booleanValue()) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj3 == null) {
                mo1623t().f18140g.m4848a("Missing param for filter. event, param", mo1618o().m16194a(kfVar.f18271b), mo1618o().m16196b(str));
                return Boolean.valueOf(false);
            } else {
                mo1623t().f18136c.m4848a("Unknown param type. event, param", mo1618o().m16194a(kfVar.f18271b), mo1618o().m16196b(str));
                return null;
            }
        }
        return Boolean.valueOf(true);
    }

    private static Boolean m16032a(Boolean bool, boolean z) {
        return bool == null ? null : Boolean.valueOf(bool.booleanValue() ^ z);
    }

    private final java.lang.Boolean m16033a(java.lang.String r3, int r4, boolean r5, java.lang.String r6, java.util.List<java.lang.String> r7, java.lang.String r8) {
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
        r2 = this;
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 6;
        if (r4 != r1) goto L_0x0010;
    L_0x0007:
        if (r7 == 0) goto L_0x000f;
    L_0x0009:
        r1 = r7.size();
        if (r1 != 0) goto L_0x0013;
    L_0x000f:
        return r0;
    L_0x0010:
        if (r6 != 0) goto L_0x0013;
    L_0x0012:
        return r0;
    L_0x0013:
        if (r5 != 0) goto L_0x001f;
    L_0x0015:
        r1 = 1;
        if (r4 != r1) goto L_0x0019;
    L_0x0018:
        goto L_0x001f;
    L_0x0019:
        r1 = java.util.Locale.ENGLISH;
        r3 = r3.toUpperCase(r1);
    L_0x001f:
        switch(r4) {
            case 1: goto L_0x0040;
            case 2: goto L_0x003b;
            case 3: goto L_0x0036;
            case 4: goto L_0x0031;
            case 5: goto L_0x002c;
            case 6: goto L_0x0023;
            default: goto L_0x0022;
        };
    L_0x0022:
        return r0;
    L_0x0023:
        r3 = r7.contains(r3);
    L_0x0027:
        r3 = java.lang.Boolean.valueOf(r3);
        return r3;
    L_0x002c:
        r3 = r3.equals(r6);
        goto L_0x0027;
    L_0x0031:
        r3 = r3.contains(r6);
        goto L_0x0027;
    L_0x0036:
        r3 = r3.endsWith(r6);
        goto L_0x0027;
    L_0x003b:
        r3 = r3.startsWith(r6);
        goto L_0x0027;
    L_0x0040:
        if (r5 == 0) goto L_0x0044;
    L_0x0042:
        r4 = 0;
        goto L_0x0046;
    L_0x0044:
        r4 = 66;
    L_0x0046:
        r4 = java.util.regex.Pattern.compile(r8, r4);	 Catch:{ PatternSyntaxException -> 0x0057 }
        r3 = r4.matcher(r3);	 Catch:{ PatternSyntaxException -> 0x0057 }
        r3 = r3.matches();	 Catch:{ PatternSyntaxException -> 0x0057 }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ PatternSyntaxException -> 0x0057 }
        return r3;
    L_0x0057:
        r3 = r2.mo1623t();
        r3 = r3.f18136c;
        r4 = "Invalid regular expression in REGEXP audience filter. expression";
        r3.m4847a(r4, r8);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.eu.a(java.lang.String, int, boolean, java.lang.String, java.util.List, java.lang.String):java.lang.Boolean");
    }

    private static java.lang.Boolean m16034a(java.lang.String r4, com.google.android.gms.internal.jy r5) {
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
        r0 = com.google.android.gms.internal.ju.m16585j(r4);
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0014 }
        r0.<init>(r4);	 Catch:{ NumberFormatException -> 0x0014 }
        r2 = 0;	 Catch:{ NumberFormatException -> 0x0014 }
        r4 = m16036a(r0, r5, r2);	 Catch:{ NumberFormatException -> 0x0014 }
        return r4;
    L_0x0014:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.eu.a(java.lang.String, com.google.android.gms.internal.jy):java.lang.Boolean");
    }

    private final Boolean m16035a(String str, ka kaVar) {
        ac.m4376a((Object) kaVar);
        if (str == null || kaVar.f18246a == null || kaVar.f18246a.intValue() == 0) {
            return null;
        }
        String toUpperCase;
        String str2;
        List list;
        String[] strArr;
        List arrayList;
        int length;
        if (kaVar.f18246a.intValue() == 6) {
            if (kaVar.f18249d == null || kaVar.f18249d.length == 0) {
                return null;
            }
        } else if (kaVar.f18247b == null) {
            return null;
        }
        int intValue = kaVar.f18246a.intValue();
        int i = 0;
        boolean z = kaVar.f18248c != null && kaVar.f18248c.booleanValue();
        if (!(z || intValue == 1)) {
            if (intValue != 6) {
                toUpperCase = kaVar.f18247b.toUpperCase(Locale.ENGLISH);
                str2 = toUpperCase;
                if (kaVar.f18249d != null) {
                    list = null;
                } else {
                    strArr = kaVar.f18249d;
                    if (z) {
                        arrayList = new ArrayList();
                        length = strArr.length;
                        while (i < length) {
                            arrayList.add(strArr[i].toUpperCase(Locale.ENGLISH));
                            i++;
                        }
                        list = arrayList;
                    } else {
                        list = Arrays.asList(strArr);
                    }
                }
                return m16033a(str, intValue, z, str2, list, intValue != 1 ? str2 : null);
            }
        }
        toUpperCase = kaVar.f18247b;
        str2 = toUpperCase;
        if (kaVar.f18249d != null) {
            strArr = kaVar.f18249d;
            if (z) {
                arrayList = new ArrayList();
                length = strArr.length;
                while (i < length) {
                    arrayList.add(strArr[i].toUpperCase(Locale.ENGLISH));
                    i++;
                }
                list = arrayList;
            } else {
                list = Arrays.asList(strArr);
            }
        } else {
            list = null;
        }
        if (intValue != 1) {
        }
        return m16033a(str, intValue, z, str2, list, intValue != 1 ? str2 : null);
    }

    private static java.lang.Boolean m16036a(java.math.BigDecimal r7, com.google.android.gms.internal.jy r8, double r9) {
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
        com.google.android.gms.common.internal.ac.m4376a(r8);
        r0 = r8.f18237a;
        r1 = 0;
        if (r0 == 0) goto L_0x00ec;
    L_0x0008:
        r0 = r8.f18237a;
        r0 = r0.intValue();
        if (r0 != 0) goto L_0x0011;
    L_0x0010:
        return r1;
    L_0x0011:
        r0 = r8.f18237a;
        r0 = r0.intValue();
        r2 = 4;
        if (r0 != r2) goto L_0x0023;
    L_0x001a:
        r0 = r8.f18240d;
        if (r0 == 0) goto L_0x0022;
    L_0x001e:
        r0 = r8.f18241e;
        if (r0 != 0) goto L_0x0028;
    L_0x0022:
        return r1;
    L_0x0023:
        r0 = r8.f18239c;
        if (r0 != 0) goto L_0x0028;
    L_0x0027:
        return r1;
    L_0x0028:
        r0 = r8.f18237a;
        r0 = r0.intValue();
        r3 = r8.f18237a;
        r3 = r3.intValue();
        if (r3 != r2) goto L_0x0059;
    L_0x0036:
        r3 = r8.f18240d;
        r3 = com.google.android.gms.internal.ju.m16585j(r3);
        if (r3 == 0) goto L_0x0058;
    L_0x003e:
        r3 = r8.f18241e;
        r3 = com.google.android.gms.internal.ju.m16585j(r3);
        if (r3 != 0) goto L_0x0047;
    L_0x0046:
        return r1;
    L_0x0047:
        r3 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0058 }
        r4 = r8.f18240d;	 Catch:{ NumberFormatException -> 0x0058 }
        r3.<init>(r4);	 Catch:{ NumberFormatException -> 0x0058 }
        r4 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0058 }
        r8 = r8.f18241e;	 Catch:{ NumberFormatException -> 0x0058 }
        r4.<init>(r8);	 Catch:{ NumberFormatException -> 0x0058 }
        r8 = r3;
        r3 = r1;
        goto L_0x006b;
    L_0x0058:
        return r1;
    L_0x0059:
        r3 = r8.f18239c;
        r3 = com.google.android.gms.internal.ju.m16585j(r3);
        if (r3 != 0) goto L_0x0062;
    L_0x0061:
        return r1;
    L_0x0062:
        r3 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x00ec }
        r8 = r8.f18239c;	 Catch:{ NumberFormatException -> 0x00ec }
        r3.<init>(r8);	 Catch:{ NumberFormatException -> 0x00ec }
        r8 = r1;
        r4 = r8;
    L_0x006b:
        if (r0 != r2) goto L_0x0070;
    L_0x006d:
        if (r8 != 0) goto L_0x0072;
    L_0x006f:
        return r1;
    L_0x0070:
        if (r3 == 0) goto L_0x00ec;
    L_0x0072:
        r2 = -1;
        r5 = 0;
        r6 = 1;
        switch(r0) {
            case 1: goto L_0x00e0;
            case 2: goto L_0x00d4;
            case 3: goto L_0x008b;
            case 4: goto L_0x0079;
            default: goto L_0x0078;
        };
    L_0x0078:
        return r1;
    L_0x0079:
        r8 = r7.compareTo(r8);
        if (r8 == r2) goto L_0x0086;
    L_0x007f:
        r7 = r7.compareTo(r4);
        if (r7 == r6) goto L_0x0086;
    L_0x0085:
        r5 = r6;
    L_0x0086:
        r7 = java.lang.Boolean.valueOf(r5);
        return r7;
    L_0x008b:
        r0 = 0;
        r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r8 == 0) goto L_0x00c8;
    L_0x0091:
        r8 = new java.math.BigDecimal;
        r8.<init>(r9);
        r0 = new java.math.BigDecimal;
        r1 = 2;
        r0.<init>(r1);
        r8 = r8.multiply(r0);
        r8 = r3.subtract(r8);
        r8 = r7.compareTo(r8);
        if (r8 != r6) goto L_0x00c3;
    L_0x00aa:
        r8 = new java.math.BigDecimal;
        r8.<init>(r9);
        r9 = new java.math.BigDecimal;
        r9.<init>(r1);
        r8 = r8.multiply(r9);
        r8 = r3.add(r8);
        r7 = r7.compareTo(r8);
        if (r7 != r2) goto L_0x00c3;
    L_0x00c2:
        r5 = r6;
    L_0x00c3:
        r7 = java.lang.Boolean.valueOf(r5);
        return r7;
    L_0x00c8:
        r7 = r7.compareTo(r3);
        if (r7 != 0) goto L_0x00cf;
    L_0x00ce:
        r5 = r6;
    L_0x00cf:
        r7 = java.lang.Boolean.valueOf(r5);
        return r7;
    L_0x00d4:
        r7 = r7.compareTo(r3);
        if (r7 != r6) goto L_0x00db;
    L_0x00da:
        r5 = r6;
    L_0x00db:
        r7 = java.lang.Boolean.valueOf(r5);
        return r7;
    L_0x00e0:
        r7 = r7.compareTo(r3);
        if (r7 != r2) goto L_0x00e7;
    L_0x00e6:
        r5 = r6;
    L_0x00e7:
        r7 = java.lang.Boolean.valueOf(r5);
        return r7;
    L_0x00ec:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.eu.a(java.math.BigDecimal, com.google.android.gms.internal.jy, double):java.lang.Boolean");
    }

    final ke[] m16037a(String str, kf[] kfVarArr, kk[] kkVarArr) {
        int intValue;
        int i;
        Map map;
        Map map2;
        int length;
        int i2;
        int intValue2;
        Map map3;
        Map map4;
        Map map5;
        String str2;
        int length2;
        Map map6;
        Map map7;
        SQLiteException e;
        Object obj;
        fv fvVar;
        String str3;
        eu euVar = this;
        String str4 = str;
        kf[] kfVarArr2 = kfVarArr;
        kk[] kkVarArr2 = kkVarArr;
        ac.m4378a(str);
        Set hashSet = new HashSet();
        Map c4813a = new C4813a();
        Map c4813a2 = new C4813a();
        Map c4813a3 = new C4813a();
        Map e2 = mo1617n().m16087e(str4);
        if (e2 != null) {
            Iterator it = e2.keySet().iterator();
            while (it.hasNext()) {
                Iterator it2;
                intValue = ((Integer) it.next()).intValue();
                kj kjVar = (kj) e2.get(Integer.valueOf(intValue));
                BitSet bitSet = (BitSet) c4813a2.get(Integer.valueOf(intValue));
                BitSet bitSet2 = (BitSet) c4813a3.get(Integer.valueOf(intValue));
                if (bitSet == null) {
                    bitSet = new BitSet();
                    c4813a2.put(Integer.valueOf(intValue), bitSet);
                    bitSet2 = new BitSet();
                    c4813a3.put(Integer.valueOf(intValue), bitSet2);
                }
                Map map8 = e2;
                i = 0;
                while (i < (kjVar.f18318a.length << 6)) {
                    if (ju.m16572a(kjVar.f18318a, i)) {
                        it2 = it;
                        map = c4813a2;
                        map2 = c4813a3;
                        mo1623t().f18140g.m4848a("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i));
                        bitSet2.set(i);
                        if (ju.m16572a(kjVar.f18319b, i)) {
                            bitSet.set(i);
                        }
                    } else {
                        it2 = it;
                        map = c4813a2;
                        map2 = c4813a3;
                    }
                    i++;
                    it = it2;
                    c4813a2 = map;
                    c4813a3 = map2;
                }
                it2 = it;
                map = c4813a2;
                map2 = c4813a3;
                ke keVar = new ke();
                c4813a.put(Integer.valueOf(intValue), keVar);
                keVar.f18268d = Boolean.valueOf(false);
                keVar.f18267c = kjVar;
                keVar.f18266b = new kj();
                keVar.f18266b.f18319b = ju.m16574a(bitSet);
                keVar.f18266b.f18318a = ju.m16574a(bitSet2);
                e2 = map8;
                it = it2;
            }
        }
        map = c4813a2;
        map2 = c4813a3;
        i = 0;
        if (kfVarArr2 != null) {
            C4813a c4813a4 = new C4813a();
            length = kfVarArr2.length;
            intValue = 0;
            while (intValue < length) {
                int i3;
                int i4;
                C4813a c4813a5;
                kf kfVar;
                Map map9;
                Map map10;
                Set set;
                Map map11;
                String str5;
                Map map12;
                kf kfVar2 = kfVarArr2[intValue];
                ff a = mo1617n().m16065a(str4, kfVar2.f18271b);
                if (a == null) {
                    mo1623t().f18136c.m4848a("Event aggregate wasn't created during raw event logging. appId, event", ft.m16220a(str), mo1618o().m16194a(kfVar2.f18271b));
                    i3 = intValue;
                    i4 = length;
                    i2 = 0;
                    c4813a5 = c4813a4;
                    kfVar = kfVar2;
                    map9 = map;
                    map10 = map2;
                    set = hashSet;
                    map11 = c4813a;
                    a = new ff(str4, kfVar2.f18271b, 1, 1, kfVar2.f18272c.longValue(), 0, null, null, null);
                } else {
                    kfVar = kfVar2;
                    i3 = intValue;
                    c4813a5 = c4813a4;
                    i4 = length;
                    set = hashSet;
                    map11 = c4813a;
                    map9 = map;
                    map10 = map2;
                    i2 = 0;
                    a = a.m4821a();
                }
                mo1617n().m16071a(a);
                long j = a.f5736c;
                kf kfVar3 = kfVar;
                Map map13 = c4813a5;
                Map map14 = (Map) map13.get(kfVar3.f18271b);
                if (map14 == null) {
                    str5 = str;
                    map14 = mo1617n().m16088f(str5, kfVar3.f18271b);
                    if (map14 == null) {
                        map14 = new C4813a();
                    }
                    map13.put(kfVar3.f18271b, map14);
                } else {
                    str5 = str;
                }
                Iterator it3 = map14.keySet().iterator();
                while (it3.hasNext()) {
                    intValue2 = ((Integer) it3.next()).intValue();
                    hashSet = set;
                    if (hashSet.contains(Integer.valueOf(intValue2))) {
                        mo1623t().f18140g.m4847a("Skipping failed audience ID", Integer.valueOf(intValue2));
                        set = hashSet;
                    } else {
                        Iterator it4;
                        c4813a = map11;
                        Map map15 = map9;
                        BitSet bitSet3 = (BitSet) map15.get(Integer.valueOf(intValue2));
                        map12 = map13;
                        map13 = map10;
                        BitSet bitSet4 = (BitSet) map13.get(Integer.valueOf(intValue2));
                        if (((ke) c4813a.get(Integer.valueOf(intValue2))) == null) {
                            ke keVar2 = new ke();
                            c4813a.put(Integer.valueOf(intValue2), keVar2);
                            keVar2.f18268d = Boolean.valueOf(true);
                            BitSet bitSet5 = new BitSet();
                            map15.put(Integer.valueOf(intValue2), bitSet5);
                            bitSet4 = new BitSet();
                            map13.put(Integer.valueOf(intValue2), bitSet4);
                            bitSet3 = bitSet5;
                        }
                        Iterator it5 = ((List) map14.get(Integer.valueOf(intValue2))).iterator();
                        while (it5.hasNext()) {
                            Map map16 = map14;
                            jw jwVar = (jw) it5.next();
                            it4 = it3;
                            Iterator it6 = it5;
                            if (mo1623t().m16227a(2)) {
                                map3 = map13;
                                map4 = map15;
                                map5 = c4813a;
                                mo1623t().f18140g.m4849a("Evaluating filter. audience, filter, event", Integer.valueOf(intValue2), jwVar.f18227a, mo1618o().m16194a(jwVar.f18228b));
                                mo1623t().f18140g.m4847a("Filter definition", mo1618o().m16190a(jwVar));
                            } else {
                                map3 = map13;
                                map5 = c4813a;
                                map4 = map15;
                            }
                            if (jwVar.f18227a != null) {
                                if (jwVar.f18227a.intValue() <= 256) {
                                    if (bitSet3.get(jwVar.f18227a.intValue())) {
                                        mo1623t().f18140g.m4848a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue2), jwVar.f18227a);
                                    } else {
                                        Boolean a2 = m16031a(jwVar, kfVar3, j);
                                        mo1623t().f18140g.m4847a("Event filter result", a2 == null ? "null" : a2);
                                        if (a2 == null) {
                                            hashSet.add(Integer.valueOf(intValue2));
                                        } else {
                                            bitSet4.set(jwVar.f18227a.intValue());
                                            if (a2.booleanValue()) {
                                                bitSet3.set(jwVar.f18227a.intValue());
                                            }
                                        }
                                    }
                                    map14 = map16;
                                    it3 = it4;
                                    it5 = it6;
                                    map13 = map3;
                                    map15 = map4;
                                    c4813a = map5;
                                    str5 = str;
                                }
                            }
                            str2 = str;
                            mo1623t().f18136c.m4848a("Invalid event filter ID. appId, id", ft.m16220a(str), String.valueOf(jwVar.f18227a));
                            str5 = str2;
                            map14 = map16;
                            it3 = it4;
                            it5 = it6;
                            map13 = map3;
                            map15 = map4;
                            c4813a = map5;
                        }
                        it4 = it3;
                        map10 = map13;
                        set = hashSet;
                        map11 = c4813a;
                        map9 = map15;
                        map13 = map12;
                    }
                }
                map12 = map13;
                hashSet = set;
                intValue = i3 + 1;
                kfVarArr2 = kfVarArr;
                str4 = str5;
                i = i2;
                length = i4;
                map14 = map12;
                map2 = map10;
                map = map9;
                c4813a = map11;
                kkVarArr2 = kkVarArr;
            }
        }
        i2 = i;
        map5 = c4813a;
        str2 = str4;
        map4 = map;
        map3 = map2;
        kk[] kkVarArr3 = kkVarArr;
        if (kkVarArr3 != null) {
            Map c4813a6 = new C4813a();
            length2 = kkVarArr3.length;
            length = i2;
            while (length < length2) {
                Map map17;
                int i5;
                Map map18;
                kk kkVar = kkVarArr3[length];
                c4813a2 = (Map) c4813a6.get(kkVar.f18322b);
                if (c4813a2 == null) {
                    c4813a2 = mo1617n().m16089g(str2, kkVar.f18322b);
                    if (c4813a2 == null) {
                        c4813a2 = new C4813a();
                    }
                    c4813a6.put(kkVar.f18322b, c4813a2);
                }
                Iterator it7 = c4813a2.keySet().iterator();
                while (it7.hasNext()) {
                    int intValue3 = ((Integer) it7.next()).intValue();
                    if (hashSet.contains(Integer.valueOf(intValue3))) {
                        mo1623t().f18140g.m4847a("Skipping failed audience ID", Integer.valueOf(intValue3));
                    } else {
                        BitSet bitSet6;
                        Map map19 = map5;
                        Map map20 = map4;
                        BitSet bitSet7 = (BitSet) map20.get(Integer.valueOf(intValue3));
                        Map map21 = map3;
                        BitSet bitSet8 = (BitSet) map21.get(Integer.valueOf(intValue3));
                        if (((ke) map19.get(Integer.valueOf(intValue3))) == null) {
                            keVar = new ke();
                            map19.put(Integer.valueOf(intValue3), keVar);
                            map17 = c4813a6;
                            keVar.f18268d = Boolean.valueOf(true);
                            bitSet8 = new BitSet();
                            map20.put(Integer.valueOf(intValue3), bitSet8);
                            bitSet6 = new BitSet();
                            map21.put(Integer.valueOf(intValue3), bitSet6);
                        } else {
                            map17 = c4813a6;
                            bitSet6 = bitSet8;
                            bitSet8 = bitSet7;
                        }
                        Iterator it8 = ((List) c4813a2.get(Integer.valueOf(intValue3))).iterator();
                        while (it8.hasNext()) {
                            Iterator it9;
                            i5 = length2;
                            jz jzVar = (jz) it8.next();
                            Map map22 = c4813a2;
                            Iterator it10 = it7;
                            if (mo1623t().m16227a(2)) {
                                it9 = it8;
                                map6 = map21;
                                map7 = map19;
                                map18 = map20;
                                mo1623t().f18140g.m4849a("Evaluating filter. audience, filter, property", Integer.valueOf(intValue3), jzVar.f18243a, mo1618o().m16198c(jzVar.f18244b));
                                mo1623t().f18140g.m4847a("Filter definition", mo1618o().m16191a(jzVar));
                            } else {
                                map6 = map21;
                                map18 = map20;
                                it9 = it8;
                                map7 = map19;
                            }
                            if (jzVar.f18243a != null) {
                                if (jzVar.f18243a.intValue() <= 256) {
                                    if (bitSet8.get(jzVar.f18243a.intValue())) {
                                        mo1623t().f18140g.m4848a("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue3), jzVar.f18243a);
                                    } else {
                                        fv fvVar2;
                                        String str6;
                                        Boolean a3;
                                        jx jxVar = jzVar.f18245c;
                                        if (jxVar == null) {
                                            fvVar2 = mo1623t().f18136c;
                                            str6 = "Missing property filter. property";
                                        } else {
                                            boolean equals = Boolean.TRUE.equals(jxVar.f18235c);
                                            if (kkVar.f18324d != null) {
                                                if (jxVar.f18234b == null) {
                                                    fvVar2 = mo1623t().f18136c;
                                                    str6 = "No number filter for long property. property";
                                                } else {
                                                    a3 = m16030a(kkVar.f18324d.longValue(), jxVar.f18234b);
                                                }
                                            } else if (kkVar.f18325e != null) {
                                                if (jxVar.f18234b == null) {
                                                    fvVar2 = mo1623t().f18136c;
                                                    str6 = "No number filter for double property. property";
                                                } else {
                                                    a3 = m16029a(kkVar.f18325e.doubleValue(), jxVar.f18234b);
                                                }
                                            } else if (kkVar.f18323c == null) {
                                                fvVar2 = mo1623t().f18136c;
                                                str6 = "User property has no value, property";
                                            } else if (jxVar.f18233a != null) {
                                                a3 = m16035a(kkVar.f18323c, jxVar.f18233a);
                                            } else if (jxVar.f18234b == null) {
                                                fvVar2 = mo1623t().f18136c;
                                                str6 = "No string or number filter defined. property";
                                            } else if (ju.m16585j(kkVar.f18323c)) {
                                                a3 = m16034a(kkVar.f18323c, jxVar.f18234b);
                                            } else {
                                                mo1623t().f18136c.m4848a("Invalid user property value for Numeric number filter. property, value", mo1618o().m16198c(kkVar.f18322b), kkVar.f18323c);
                                                a3 = null;
                                                mo1623t().f18140g.m4847a("Property filter result", a3 == null ? "null" : a3);
                                                if (a3 == null) {
                                                    hashSet.add(Integer.valueOf(intValue3));
                                                } else {
                                                    bitSet6.set(jzVar.f18243a.intValue());
                                                    if (!a3.booleanValue()) {
                                                        bitSet8.set(jzVar.f18243a.intValue());
                                                    }
                                                }
                                            }
                                            a3 = m16032a(a3, equals);
                                            if (a3 == null) {
                                            }
                                            mo1623t().f18140g.m4847a("Property filter result", a3 == null ? "null" : a3);
                                            if (a3 == null) {
                                                bitSet6.set(jzVar.f18243a.intValue());
                                                if (!a3.booleanValue()) {
                                                    bitSet8.set(jzVar.f18243a.intValue());
                                                }
                                            } else {
                                                hashSet.add(Integer.valueOf(intValue3));
                                            }
                                        }
                                        fvVar2.m4847a(str6, mo1618o().m16198c(kkVar.f18322b));
                                        a3 = null;
                                        if (a3 == null) {
                                        }
                                        mo1623t().f18140g.m4847a("Property filter result", a3 == null ? "null" : a3);
                                        if (a3 == null) {
                                            hashSet.add(Integer.valueOf(intValue3));
                                        } else {
                                            bitSet6.set(jzVar.f18243a.intValue());
                                            if (!a3.booleanValue()) {
                                                bitSet8.set(jzVar.f18243a.intValue());
                                            }
                                        }
                                    }
                                    length2 = i5;
                                    c4813a2 = map22;
                                    it7 = it10;
                                    it8 = it9;
                                    map21 = map6;
                                    map19 = map7;
                                    map20 = map18;
                                }
                            }
                            mo1623t().f18136c.m4848a("Invalid property filter ID. appId, id", ft.m16220a(str), String.valueOf(jzVar.f18243a));
                            hashSet.add(Integer.valueOf(intValue3));
                            c4813a6 = map17;
                            length2 = i5;
                            c4813a2 = map22;
                            it7 = it10;
                            map3 = map6;
                            map5 = map7;
                            map4 = map18;
                            kkVarArr3 = kkVarArr;
                        }
                        map3 = map21;
                        map5 = map19;
                        c4813a6 = map17;
                        map4 = map20;
                        kkVarArr3 = kkVarArr;
                    }
                }
                map17 = c4813a6;
                i5 = length2;
                map6 = map3;
                map18 = map4;
                map7 = map5;
                length++;
                kkVarArr3 = kkVarArr;
            }
        }
        map6 = map3;
        map7 = map5;
        e2 = map4;
        ke[] keVarArr = new ke[e2.size()];
        i = i2;
        for (Integer intValue4 : e2.keySet()) {
            length2 = intValue4.intValue();
            if (!hashSet.contains(Integer.valueOf(length2))) {
                Map map23 = map7;
                ke keVar3 = (ke) map23.get(Integer.valueOf(length2));
                if (keVar3 == null) {
                    keVar3 = new ke();
                }
                intValue2 = i + 1;
                keVarArr[i] = keVar3;
                keVar3.f18265a = Integer.valueOf(length2);
                keVar3.f18266b = new kj();
                keVar3.f18266b.f18319b = ju.m16574a((BitSet) e2.get(Integer.valueOf(length2)));
                Map map24 = map6;
                keVar3.f18266b.f18318a = ju.m16574a((BitSet) map24.get(Integer.valueOf(length2)));
                hp n = mo1617n();
                Object obj2 = keVar3.f18266b;
                n.m11975L();
                n.mo1606c();
                ac.m4378a(str);
                ac.m4376a(obj2);
                try {
                    byte[] bArr = new byte[obj2.m5129f()];
                    oa a4 = oa.m5073a(bArr, bArr.length);
                    obj2.mo1667a(a4);
                    a4.m5085a();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str2);
                    contentValues.put("audience_id", Integer.valueOf(length2));
                    contentValues.put("current_results", bArr);
                    try {
                    } catch (SQLiteException e3) {
                        e = e3;
                        obj = e;
                        fvVar = n.mo1623t().f18134a;
                        str3 = "Error storing filter results. appId";
                        fvVar.m4848a(str3, ft.m16220a(str), obj);
                        map7 = map23;
                        i = intValue2;
                        map6 = map24;
                    }
                    try {
                        if (n.m16057A().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                            n.mo1623t().f18134a.m4847a("Failed to insert filter results (got -1). appId", ft.m16220a(str));
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        obj = e;
                        fvVar = n.mo1623t().f18134a;
                        str3 = "Error storing filter results. appId";
                        fvVar.m4848a(str3, ft.m16220a(str), obj);
                        map7 = map23;
                        i = intValue2;
                        map6 = map24;
                    }
                } catch (IOException e5) {
                    obj = e5;
                    fvVar = n.mo1623t().f18134a;
                    str3 = "Configuration loss. Failed to serialize filter results. appId";
                    fvVar.m4848a(str3, ft.m16220a(str), obj);
                    map7 = map23;
                    i = intValue2;
                    map6 = map24;
                }
                map7 = map23;
                i = intValue2;
                map6 = map24;
            }
        }
        return (ke[]) Arrays.copyOf(keVarArr, i);
    }

    protected final boolean mo3036w() {
        return false;
    }
}
