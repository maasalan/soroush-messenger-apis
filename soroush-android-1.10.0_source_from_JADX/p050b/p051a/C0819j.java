package p050b.p051a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public final class C0819j {
    public static int f2448n = 47;
    public int f2449a;
    int f2450b;
    public C0827p f2451c;
    int f2452d;
    public int f2453e;
    public int f2454f;
    public int[] f2455g;
    public ArrayList f2456h;
    public ArrayList f2457i;
    ArrayList f2458j;
    public String f2459k;
    public String[] f2460l;
    public String f2461m;

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
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = "java.lang.StringBuilder";	 Catch:{ Throwable -> 0x001b }
        java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x001b }
        r0 = 49;	 Catch:{ Throwable -> 0x001b }
        f2448n = r0;	 Catch:{ Throwable -> 0x001b }
        r0 = "java.util.zip.DeflaterInputStream";	 Catch:{ Throwable -> 0x001b }
        java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x001b }
        r0 = 50;	 Catch:{ Throwable -> 0x001b }
        f2448n = r0;	 Catch:{ Throwable -> 0x001b }
        r0 = "java.lang.invoke.CallSite";	 Catch:{ Throwable -> 0x001b }
        java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x001b }
        r0 = 51;	 Catch:{ Throwable -> 0x001b }
        f2448n = r0;	 Catch:{ Throwable -> 0x001b }
    L_0x001b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.j.<clinit>():void");
    }

    public C0819j(DataInputStream dataInputStream) {
        m1841a(dataInputStream);
    }

    public C0819j(String str) {
        this.f2449a = f2448n;
        this.f2450b = 0;
        this.f2451c = new C0827p(str);
        this.f2452d = this.f2451c.f2482c;
        this.f2453e = 32;
        this.f2454f = this.f2451c.m1873a("java.lang.Object");
        this.f2461m = "java.lang.Object";
        this.f2455g = null;
        this.f2456h = new ArrayList();
        this.f2457i = new ArrayList();
        this.f2459k = str;
        this.f2458j = new ArrayList();
        ArrayList arrayList = this.f2458j;
        C0827p c0827p = this.f2451c;
        String str2 = this.f2459k;
        int lastIndexOf = str2.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(".java");
        arrayList.add(new au(c0827p, stringBuilder.toString()));
    }

    private void m1841a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        if (readInt != -889275714) {
            StringBuilder stringBuilder = new StringBuilder("bad magic number: ");
            stringBuilder.append(Integer.toHexString(readInt));
            throw new IOException(stringBuilder.toString());
        }
        int i;
        int i2;
        this.f2450b = dataInputStream.readUnsignedShort();
        this.f2449a = dataInputStream.readUnsignedShort();
        this.f2451c = new C0827p(dataInputStream);
        this.f2453e = dataInputStream.readUnsignedShort();
        this.f2452d = dataInputStream.readUnsignedShort();
        this.f2451c.f2482c = this.f2452d;
        this.f2454f = dataInputStream.readUnsignedShort();
        readInt = dataInputStream.readUnsignedShort();
        int i3 = 0;
        if (readInt == 0) {
            this.f2455g = null;
        } else {
            this.f2455g = new int[readInt];
            for (i = 0; i < readInt; i++) {
                this.f2455g[i] = dataInputStream.readUnsignedShort();
            }
        }
        C0827p c0827p = this.f2451c;
        i = dataInputStream.readUnsignedShort();
        this.f2456h = new ArrayList();
        for (i2 = 0; i2 < i; i2++) {
            this.f2456h.add(new C0831z(c0827p, dataInputStream));
        }
        i = dataInputStream.readUnsignedShort();
        this.f2457i = new ArrayList();
        for (i2 = 0; i2 < i; i2++) {
            this.f2457i.add(new an(c0827p, dataInputStream));
        }
        this.f2458j = new ArrayList();
        i = dataInputStream.readUnsignedShort();
        while (i3 < i) {
            C0814d a = C0814d.m1820a(c0827p, dataInputStream);
            C0814d.m1824b(this.f2458j, a.m1826a());
            this.f2458j.add(a);
            i3++;
        }
        this.f2459k = this.f2451c.m1884c(this.f2452d);
    }

    private C0827p m1842f() {
        C0827p c0827p = new C0827p(this.f2459k);
        this.f2452d = c0827p.f2482c;
        if (m1850d() != null) {
            this.f2454f = c0827p.m1873a(m1850d());
        }
        if (this.f2455g != null) {
            int length = this.f2455g.length;
            for (int i = 0; i < length; i++) {
                this.f2455g[i] = c0827p.m1873a(this.f2451c.m1884c(this.f2455g[i]));
            }
        }
        return c0827p;
    }

    public final an m1843a(String str) {
        ArrayList arrayList = this.f2457i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            an anVar = (an) arrayList.get(i);
            if (anVar.m1744a().equals(str)) {
                return anVar;
            }
        }
        return null;
    }

    public final void m1844a() {
        C0827p f = m1842f();
        ArrayList arrayList = this.f2457i;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            an anVar = (an) arrayList.get(i2);
            anVar.f2406c = f.m1883c(anVar.m1744a());
            anVar.f2408e = f.m1883c(anVar.m1750d());
            anVar.f2409f = C0814d.m1822a(anVar.f2409f, f);
            anVar.f2404a = f;
        }
        arrayList = this.f2456h;
        size = arrayList.size();
        while (i < size) {
            C0831z c0831z = (C0831z) arrayList.get(i);
            c0831z.f2492c = f.m1883c(c0831z.m1913a());
            c0831z.f2494e = f.m1883c(c0831z.m1914b());
            c0831z.f2495f = C0814d.m1822a(c0831z.f2495f, f);
            c0831z.f2490a = f;
            i++;
        }
        this.f2458j = C0814d.m1822a(this.f2458j, f);
        this.f2451c = f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1845a(p050b.p051a.an r11) {
        /*
        r10 = this;
        r0 = r11.m1744a();
        r1 = r11.m1750d();
        r2 = r10.f2457i;
        r3 = 0;
        r2 = r2.listIterator(r3);
    L_0x000f:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x0081;
    L_0x0015:
        r4 = r2.next();
        r4 = (p050b.p051a.an) r4;
        r5 = r4.m1744a();
        r5 = r5.equals(r0);
        r6 = 1;
        if (r5 == 0) goto L_0x0060;
    L_0x0026:
        r5 = r4.m1750d();
        r7 = r5.charAt(r3);
        r8 = 40;
        if (r7 == r8) goto L_0x0034;
    L_0x0032:
        r7 = r3;
        goto L_0x0045;
    L_0x0034:
        r7 = r3;
    L_0x0035:
        r8 = r5.charAt(r7);
        r9 = r1.charAt(r7);
        if (r8 == r9) goto L_0x0040;
    L_0x003f:
        goto L_0x0032;
    L_0x0040:
        r9 = 41;
        if (r8 != r9) goto L_0x005d;
    L_0x0044:
        r7 = r6;
    L_0x0045:
        if (r7 == 0) goto L_0x0060;
    L_0x0047:
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x0060;
    L_0x004d:
        r4 = r4.f2405b;
        r4 = r4 & 64;
        if (r4 != 0) goto L_0x0055;
    L_0x0053:
        r4 = r6;
        goto L_0x0056;
    L_0x0055:
        r4 = r3;
    L_0x0056:
        if (r4 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x0061;
    L_0x0059:
        r2.remove();
        goto L_0x0060;
    L_0x005d:
        r7 = r7 + 1;
        goto L_0x0035;
    L_0x0060:
        r6 = r3;
    L_0x0061:
        if (r6 == 0) goto L_0x000f;
    L_0x0063:
        r11 = new b.a.u;
        r1 = new java.lang.StringBuilder;
        r2 = "duplicate method: ";
        r1.<init>(r2);
        r1.append(r0);
        r0 = " in ";
        r1.append(r0);
        r0 = r10.f2459k;
        r1.append(r0);
        r0 = r1.toString();
        r11.<init>(r0);
        throw r11;
    L_0x0081:
        r0 = r10.f2457i;
        r0.add(r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.j.a(b.a.an):void");
    }

    public final void m1846a(DataOutputStream dataOutputStream) {
        int i;
        int i2;
        dataOutputStream.writeInt(-889275714);
        dataOutputStream.writeShort(this.f2450b);
        dataOutputStream.writeShort(this.f2449a);
        C0827p c0827p = this.f2451c;
        dataOutputStream.writeShort(c0827p.f2481b);
        ak akVar = c0827p.f2480a;
        int i3 = c0827p.f2481b;
        for (i = 1; i < i3; i++) {
            akVar.m1741a(i).mo832a(dataOutputStream);
        }
        dataOutputStream.writeShort(this.f2453e);
        dataOutputStream.writeShort(this.f2452d);
        dataOutputStream.writeShort(this.f2454f);
        i3 = this.f2455g == null ? 0 : this.f2455g.length;
        dataOutputStream.writeShort(i3);
        for (i = 0; i < i3; i++) {
            dataOutputStream.writeShort(this.f2455g[i]);
        }
        ArrayList arrayList = this.f2456h;
        i = arrayList.size();
        dataOutputStream.writeShort(i);
        for (i2 = 0; i2 < i; i2++) {
            C0831z c0831z = (C0831z) arrayList.get(i2);
            dataOutputStream.writeShort(c0831z.f2491b);
            dataOutputStream.writeShort(c0831z.f2492c);
            dataOutputStream.writeShort(c0831z.f2494e);
            if (c0831z.f2495f == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort(c0831z.f2495f.size());
                C0814d.m1823a(c0831z.f2495f, dataOutputStream);
            }
        }
        arrayList = this.f2457i;
        i = arrayList.size();
        dataOutputStream.writeShort(i);
        for (i2 = 0; i2 < i; i2++) {
            an anVar = (an) arrayList.get(i2);
            dataOutputStream.writeShort(anVar.f2405b);
            dataOutputStream.writeShort(anVar.f2406c);
            dataOutputStream.writeShort(anVar.f2408e);
            if (anVar.f2409f == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort(anVar.f2409f.size());
                C0814d.m1823a(anVar.f2409f, dataOutputStream);
            }
        }
        dataOutputStream.writeShort(this.f2458j.size());
        C0814d.m1823a(this.f2458j, dataOutputStream);
    }

    public final C0814d m1847b(String str) {
        ArrayList arrayList = this.f2458j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0814d c0814d = (C0814d) arrayList.get(i);
            if (c0814d.m1826a().equals(str)) {
                return c0814d;
            }
        }
        return null;
    }

    public final void m1848b() {
        C0827p f = m1842f();
        ArrayList arrayList = new ArrayList();
        C0814d b = m1847b("RuntimeInvisibleAnnotations");
        if (b != null) {
            arrayList.add(b.mo834a(f, null));
        }
        b = m1847b("RuntimeVisibleAnnotations");
        if (b != null) {
            arrayList.add(b.mo834a(f, null));
        }
        b = m1847b("Signature");
        if (b != null) {
            arrayList.add(b.mo834a(f, null));
        }
        ArrayList arrayList2 = this.f2457i;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            an anVar = (an) arrayList2.get(i2);
            ArrayList arrayList3 = new ArrayList();
            C0814d a = anVar.m1743a("RuntimeInvisibleAnnotations");
            if (a != null) {
                arrayList3.add(a.mo834a(f, null));
            }
            a = anVar.m1743a("RuntimeVisibleAnnotations");
            if (a != null) {
                arrayList3.add(a.mo834a(f, null));
            }
            a = anVar.m1743a("RuntimeInvisibleParameterAnnotations");
            if (a != null) {
                arrayList3.add(a.mo834a(f, null));
            }
            a = anVar.m1743a("RuntimeVisibleParameterAnnotations");
            if (a != null) {
                arrayList3.add(a.mo834a(f, null));
            }
            C4949b c4949b = (C4949b) anVar.m1743a("AnnotationDefault");
            if (c4949b != null) {
                arrayList3.add(c4949b);
            }
            C4968y e = anVar.m1751e();
            if (e != null) {
                arrayList3.add(e);
            }
            a = anVar.m1743a("Signature");
            if (a != null) {
                arrayList3.add(a.mo834a(f, null));
            }
            anVar.f2409f = arrayList3;
            anVar.f2406c = f.m1883c(anVar.m1744a());
            anVar.f2408e = f.m1883c(anVar.m1750d());
            anVar.f2404a = f;
        }
        arrayList2 = this.f2456h;
        size = arrayList2.size();
        while (i < size) {
            C0831z c0831z = (C0831z) arrayList2.get(i);
            ArrayList arrayList4 = new ArrayList();
            C0814d a2 = c0831z.m1912a("RuntimeInvisibleAnnotations");
            if (a2 != null) {
                arrayList4.add(a2.mo834a(f, null));
            }
            a2 = c0831z.m1912a("RuntimeVisibleAnnotations");
            if (a2 != null) {
                arrayList4.add(a2.mo834a(f, null));
            }
            a2 = c0831z.m1912a("Signature");
            if (a2 != null) {
                arrayList4.add(a2.mo834a(f, null));
            }
            int c = c0831z.m1915c();
            if (c != 0) {
                arrayList4.add(new C4963q(f, c0831z.f2490a.m1868a(c, f, null)));
            }
            c0831z.f2495f = arrayList4;
            c0831z.f2492c = f.m1883c(c0831z.m1913a());
            c0831z.f2494e = f.m1883c(c0831z.m1914b());
            c0831z.f2490a = f;
            i++;
        }
        this.f2458j = arrayList;
        this.f2451c = f;
    }

    public final int m1849c() {
        ac acVar = (ac) m1847b("InnerClasses");
        if (acVar == null) {
            return -1;
        }
        String str = this.f2459k;
        int e = acVar.m9541e();
        for (int i = 0; i < e; i++) {
            if (str.equals(acVar.m9539a(i))) {
                return C0817g.m1832a(acVar.mo877d(), (i * 8) + 8);
            }
        }
        return -1;
    }

    public final String m1850d() {
        if (this.f2461m == null) {
            this.f2461m = this.f2451c.m1884c(this.f2454f);
        }
        return this.f2461m;
    }

    public final String[] m1851e() {
        if (this.f2460l != null) {
            return this.f2460l;
        }
        String[] strArr;
        int i = 0;
        if (this.f2455g == null) {
            strArr = new String[0];
        } else {
            int length = this.f2455g.length;
            String[] strArr2 = new String[length];
            while (i < length) {
                strArr2[i] = this.f2451c.m1884c(this.f2455g[i]);
                i++;
            }
            strArr = strArr2;
        }
        this.f2460l = strArr;
        return strArr;
    }
}
