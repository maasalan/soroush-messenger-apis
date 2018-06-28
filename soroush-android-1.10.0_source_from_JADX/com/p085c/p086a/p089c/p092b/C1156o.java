package com.p085c.p086a.p089c.p092b;

import android.util.Log;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C1208h;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C1156o extends Exception {
    private static final StackTraceElement[] f3709a = new StackTraceElement[0];
    private final List<Exception> f3710b;
    private C1208h f3711c;
    private C1102a f3712d;
    private Class<?> f3713e;

    private static final class C1155a implements Appendable {
        private final Appendable f3707a;
        private boolean f3708b = true;

        C1155a(Appendable appendable) {
            this.f3707a = appendable;
        }

        private static CharSequence m2764a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public final Appendable append(char c) {
            boolean z = false;
            if (this.f3708b) {
                this.f3708b = false;
                this.f3707a.append("  ");
            }
            if (c == '\n') {
                z = true;
            }
            this.f3708b = z;
            this.f3707a.append(c);
            return this;
        }

        public final Appendable append(CharSequence charSequence) {
            charSequence = C1155a.m2764a(charSequence);
            return append(charSequence, 0, charSequence.length());
        }

        public final Appendable append(CharSequence charSequence, int i, int i2) {
            charSequence = C1155a.m2764a(charSequence);
            boolean z = false;
            if (this.f3708b) {
                this.f3708b = false;
                this.f3707a.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f3708b = z;
            this.f3707a.append(charSequence, i, i2);
            return this;
        }
    }

    public C1156o(String str) {
        this(str, Collections.emptyList());
    }

    public C1156o(String str, Exception exception) {
        this(str, Collections.singletonList(exception));
    }

    public C1156o(String str, List<Exception> list) {
        super(str);
        setStackTrace(f3709a);
        this.f3710b = list;
    }

    private void m2765a(Appendable appendable) {
        C1156o.m2766a((Exception) this, appendable);
        List list = this.f3710b;
        Appendable c1155a = new C1155a(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                c1155a.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
                Exception exception = (Exception) list.get(i);
                if (exception instanceof C1156o) {
                    ((C1156o) exception).m2765a(c1155a);
                } else {
                    C1156o.m2766a(exception, c1155a);
                }
                i = i2;
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static void m2766a(java.lang.Exception r1, java.lang.Appendable r2) {
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
        r0 = r1.getClass();	 Catch:{ IOException -> 0x0020 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0020 }
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0020 }
        r0 = ": ";	 Catch:{ IOException -> 0x0020 }
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0020 }
        r0 = r1.getMessage();	 Catch:{ IOException -> 0x0020 }
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0020 }
        r0 = 10;	 Catch:{ IOException -> 0x0020 }
        r2.append(r0);	 Catch:{ IOException -> 0x0020 }
        return;
    L_0x0020:
        r2 = new java.lang.RuntimeException;
        r2.<init>(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.b.o.a(java.lang.Exception, java.lang.Appendable):void");
    }

    private void m2767a(Exception exception, List<Exception> list) {
        if (exception instanceof C1156o) {
            for (Exception a : ((C1156o) exception).f3710b) {
                m2767a(a, (List) list);
            }
            return;
        }
        list.add(exception);
    }

    final void m2768a(C1208h c1208h, C1102a c1102a, Class<?> cls) {
        this.f3711c = c1208h;
        this.f3712d = c1102a;
        this.f3713e = cls;
    }

    public final void m2769a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass());
        stringBuilder.append(": ");
        stringBuilder.append(getMessage());
        Log.e(str, stringBuilder.toString());
        List arrayList = new ArrayList();
        m2767a((Exception) this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder stringBuilder2 = new StringBuilder("Root cause (");
            int i2 = i + 1;
            stringBuilder2.append(i2);
            stringBuilder2.append(" of ");
            stringBuilder2.append(size);
            stringBuilder2.append(")");
            Log.i(str, stringBuilder2.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(super.getMessage());
        if (this.f3713e != null) {
            StringBuilder stringBuilder3 = new StringBuilder(", ");
            stringBuilder3.append(this.f3713e);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        if (this.f3712d != null) {
            stringBuilder3 = new StringBuilder(", ");
            stringBuilder3.append(this.f3712d);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        if (this.f3711c != null) {
            stringBuilder3 = new StringBuilder(", ");
            stringBuilder3.append(this.f3711c);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        return stringBuilder2.toString();
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        m2765a((Appendable) printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        m2765a((Appendable) printWriter);
    }
}
