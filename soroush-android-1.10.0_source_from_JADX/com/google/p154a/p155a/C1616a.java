package com.google.p154a.p155a;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class C1616a<T> implements Iterator<T> {
    int f5056a = C1615a.f5052b;
    private T f5057b;

    static /* synthetic */ class C16141 {
        static final /* synthetic */ int[] f5050a = new int[C1615a.m4154a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = com.google.p154a.p155a.C1616a.C1615a.m4154a();
            r0 = r0.length;
            r0 = new int[r0];
            f5050a = r0;
            r0 = 1;
            r1 = f5050a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = com.google.p154a.p155a.C1616a.C1615a.f5051a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f5050a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = com.google.p154a.p155a.C1616a.C1615a.f5053c;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.1.<clinit>():void");
        }
    }

    private enum C1615a {
        ;
        
        public static final int f5051a = 1;
        public static final int f5052b = 2;
        public static final int f5053c = 3;
        public static final int f5054d = 4;

        static {
            f5055e = new int[]{f5051a, f5052b, f5053c, f5054d};
        }

        public static int[] m4154a() {
            return (int[]) f5055e.clone();
        }
    }

    protected C1616a() {
    }

    protected abstract T mo1517a();

    public final boolean hasNext() {
        if (this.f5056a != C1615a.f5054d) {
            switch (C16141.f5050a[this.f5056a - 1]) {
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    this.f5056a = C1615a.f5054d;
                    this.f5057b = mo1517a();
                    if (this.f5056a == C1615a.f5053c) {
                        return false;
                    }
                    this.f5056a = C1615a.f5051a;
                    return true;
            }
        }
        throw new IllegalStateException();
    }

    public final T next() {
        if (hasNext()) {
            this.f5056a = C1615a.f5052b;
            T t = this.f5057b;
            this.f5057b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
