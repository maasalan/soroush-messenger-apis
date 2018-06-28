package com.google.p164b.p166b;

import java.lang.reflect.Modifier;

public abstract class C1931k {

    static class C55814 extends C1931k {
        C55814() {
        }

        public final <T> T mo1749a(Class<T> cls) {
            StringBuilder stringBuilder = new StringBuilder("Cannot allocate ");
            stringBuilder.append(cls);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    public static com.google.p164b.p166b.C1931k m5285a() {
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
        r0 = 0;
        r1 = 0;
        r2 = 1;
        r3 = "sun.misc.Unsafe";	 Catch:{ Exception -> 0x0028 }
        r3 = java.lang.Class.forName(r3);	 Catch:{ Exception -> 0x0028 }
        r4 = "theUnsafe";	 Catch:{ Exception -> 0x0028 }
        r4 = r3.getDeclaredField(r4);	 Catch:{ Exception -> 0x0028 }
        r4.setAccessible(r2);	 Catch:{ Exception -> 0x0028 }
        r4 = r4.get(r0);	 Catch:{ Exception -> 0x0028 }
        r5 = "allocateInstance";	 Catch:{ Exception -> 0x0028 }
        r6 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0028 }
        r7 = java.lang.Class.class;	 Catch:{ Exception -> 0x0028 }
        r6[r1] = r7;	 Catch:{ Exception -> 0x0028 }
        r3 = r3.getMethod(r5, r6);	 Catch:{ Exception -> 0x0028 }
        r5 = new com.google.b.b.k$1;	 Catch:{ Exception -> 0x0028 }
        r5.<init>(r3, r4);	 Catch:{ Exception -> 0x0028 }
        return r5;
    L_0x0028:
        r3 = 2;
        r4 = java.io.ObjectStreamClass.class;	 Catch:{ Exception -> 0x0065 }
        r5 = "getConstructorId";	 Catch:{ Exception -> 0x0065 }
        r6 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0065 }
        r7 = java.lang.Class.class;	 Catch:{ Exception -> 0x0065 }
        r6[r1] = r7;	 Catch:{ Exception -> 0x0065 }
        r4 = r4.getDeclaredMethod(r5, r6);	 Catch:{ Exception -> 0x0065 }
        r4.setAccessible(r2);	 Catch:{ Exception -> 0x0065 }
        r5 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0065 }
        r6 = java.lang.Object.class;	 Catch:{ Exception -> 0x0065 }
        r5[r1] = r6;	 Catch:{ Exception -> 0x0065 }
        r0 = r4.invoke(r0, r5);	 Catch:{ Exception -> 0x0065 }
        r0 = (java.lang.Integer) r0;	 Catch:{ Exception -> 0x0065 }
        r0 = r0.intValue();	 Catch:{ Exception -> 0x0065 }
        r4 = java.io.ObjectStreamClass.class;	 Catch:{ Exception -> 0x0065 }
        r5 = "newInstance";	 Catch:{ Exception -> 0x0065 }
        r6 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0065 }
        r7 = java.lang.Class.class;	 Catch:{ Exception -> 0x0065 }
        r6[r1] = r7;	 Catch:{ Exception -> 0x0065 }
        r7 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0065 }
        r6[r2] = r7;	 Catch:{ Exception -> 0x0065 }
        r4 = r4.getDeclaredMethod(r5, r6);	 Catch:{ Exception -> 0x0065 }
        r4.setAccessible(r2);	 Catch:{ Exception -> 0x0065 }
        r5 = new com.google.b.b.k$2;	 Catch:{ Exception -> 0x0065 }
        r5.<init>(r4, r0);	 Catch:{ Exception -> 0x0065 }
        return r5;
    L_0x0065:
        r0 = java.io.ObjectInputStream.class;	 Catch:{ Exception -> 0x0080 }
        r4 = "newInstance";	 Catch:{ Exception -> 0x0080 }
        r3 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0080 }
        r5 = java.lang.Class.class;	 Catch:{ Exception -> 0x0080 }
        r3[r1] = r5;	 Catch:{ Exception -> 0x0080 }
        r1 = java.lang.Class.class;	 Catch:{ Exception -> 0x0080 }
        r3[r2] = r1;	 Catch:{ Exception -> 0x0080 }
        r0 = r0.getDeclaredMethod(r4, r3);	 Catch:{ Exception -> 0x0080 }
        r0.setAccessible(r2);	 Catch:{ Exception -> 0x0080 }
        r1 = new com.google.b.b.k$3;	 Catch:{ Exception -> 0x0080 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x0080 }
        return r1;
    L_0x0080:
        r0 = new com.google.b.b.k$4;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.b.k.a():com.google.b.b.k");
    }

    static void m5286b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        StringBuilder stringBuilder;
        if (Modifier.isInterface(modifiers)) {
            stringBuilder = new StringBuilder("Interface can't be instantiated! Interface name: ");
            stringBuilder.append(cls.getName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            stringBuilder = new StringBuilder("Abstract class can't be instantiated! Class name: ");
            stringBuilder.append(cls.getName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    public abstract <T> T mo1749a(Class<T> cls);
}
