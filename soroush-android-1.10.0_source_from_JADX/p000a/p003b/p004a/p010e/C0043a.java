package p000a.p003b.p004a.p010e;

import java.io.DataOutputStream;
import p000a.p003b.p004a.C0054g.C0052b;

public abstract class C0043a {
    public final int f175a;
    public final int f176b;
    protected final byte[] f177c;
    private String f178d;
    private String f179e;

    static /* synthetic */ class C00421 {
        static final /* synthetic */ int[] f174a = new int[C0052b.values().length];

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
            r0 = p000a.p003b.p004a.C0054g.C0052b.values();
            r0 = r0.length;
            r0 = new int[r0];
            f174a = r0;
            r0 = f174a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = p000a.p003b.p004a.C0054g.C0052b.NSID;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.a.e.a.1.<clinit>():void");
        }
    }

    protected C0043a(int i, byte[] bArr) {
        this.f175a = i;
        this.f176b = bArr.length;
        this.f177c = bArr;
    }

    protected C0043a(byte[] bArr) {
        this.f175a = mo10a().f234c;
        this.f176b = bArr.length;
        this.f177c = bArr;
    }

    public static C0043a m64a(int i, byte[] bArr) {
        return C00421.f174a[C0052b.m95a(i).ordinal()] != 1 ? new C4644c(i, bArr) : new C4643b(bArr);
    }

    public abstract C0052b mo10a();

    public final void m66a(DataOutputStream dataOutputStream) {
        dataOutputStream.writeShort(this.f175a);
        dataOutputStream.writeShort(this.f176b);
        dataOutputStream.write(this.f177c);
    }

    protected abstract CharSequence mo11b();

    public final String m68c() {
        if (this.f179e == null) {
            this.f179e = mo12d().toString();
        }
        return this.f179e;
    }

    protected abstract CharSequence mo12d();

    public final String toString() {
        if (this.f178d == null) {
            this.f178d = mo11b().toString();
        }
        return this.f178d;
    }
}
