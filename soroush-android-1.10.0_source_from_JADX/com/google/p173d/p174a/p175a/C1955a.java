package com.google.p173d.p174a.p175a;

import com.google.p173d.C5615f;
import com.google.p173d.p174a.C5599a;
import com.google.p173d.p177b.C1966b;
import com.google.p173d.p177b.C1969e;
import com.google.p173d.p177b.C1970g;
import com.google.p173d.p177b.p179b.C1962a;
import com.google.p173d.p177b.p179b.C1964c;
import java.util.Arrays;
import org.jivesoftware.smack.sm.packet.StreamManagement.AckRequest;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.msgpack.util.TemplatePrecompiler;

public final class C1955a {
    private static final String[] f6513a = new String[]{"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] f6514b = new String[]{"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", XHTMLText.f24839H, "i", "j", "k", "l", "m", "n", "o", XHTMLText.f24840P, XHTMLText.f24841Q, AckRequest.ELEMENT, "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] f6515c = new String[]{"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] f6516d = new String[]{"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", TemplatePrecompiler.DEFAULT_DEST, "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] f6517e = new String[]{"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", TemplatePrecompiler.DEFAULT_DEST, "CTRL_UL", "CTRL_US"};
    private C5599a f6518f;

    static /* synthetic */ class C19531 {
        static final /* synthetic */ int[] f6505a = new int[C1954a.m5370a().length];

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
            r0 = com.google.p173d.p174a.p175a.C1955a.C1954a.m5370a();
            r0 = r0.length;
            r0 = new int[r0];
            f6505a = r0;
            r0 = 1;
            r1 = f6505a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = com.google.p173d.p174a.p175a.C1955a.C1954a.f6506a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f6505a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = com.google.p173d.p174a.p175a.C1955a.C1954a.f6507b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f6505a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = com.google.p173d.p174a.p175a.C1955a.C1954a.f6508c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f6505a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = com.google.p173d.p174a.p175a.C1955a.C1954a.f6510e;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r1 = f6505a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = com.google.p173d.p174a.p175a.C1955a.C1954a.f6509d;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.d.a.a.a.1.<clinit>():void");
        }
    }

    private enum C1954a {
        ;
        
        public static final int f6506a = 1;
        public static final int f6507b = 2;
        public static final int f6508c = 3;
        public static final int f6509d = 4;
        public static final int f6510e = 5;
        public static final int f6511f = 6;

        static {
            f6512g = new int[]{f6506a, f6507b, f6508c, f6509d, f6510e, f6511f};
        }

        public static int[] m5370a() {
            return (int[]) f6512g.clone();
        }
    }

    private static int m5371a(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private boolean[] m5372a(boolean[] zArr) {
        C1962a c1962a;
        int i = 8;
        if (this.f6518f.f15456c <= 2) {
            i = 6;
            c1962a = C1962a.f6557c;
        } else if (this.f6518f.f15456c <= 8) {
            c1962a = C1962a.f6561g;
        } else if (this.f6518f.f15456c <= 22) {
            i = 10;
            c1962a = C1962a.f6556b;
        } else {
            i = 12;
            c1962a = C1962a.f6555a;
        }
        int i2 = this.f6518f.f15455b;
        int length = zArr.length / i;
        if (length < i2) {
            throw C5615f.m12347a();
        }
        int[] iArr = new int[length];
        int length2 = zArr.length % i;
        int i3 = 0;
        while (i3 < length) {
            iArr[i3] = C1955a.m5371a(zArr, length2, i);
            i3++;
            length2 += i;
        }
        try {
            new C1964c(c1962a).m5413a(iArr, length - i2);
            int i4 = (1 << i) - 1;
            length = 0;
            i3 = length;
            while (length < i2) {
                length2 = iArr[length];
                if (length2 != 0) {
                    if (length2 != i4) {
                        if (length2 == 1 || length2 == i4 - 1) {
                            i3++;
                        }
                        length++;
                    }
                }
                throw C5615f.m12347a();
            }
            boolean[] zArr2 = new boolean[((i2 * i) - i3)];
            i3 = 0;
            length2 = i3;
            while (i3 < i2) {
                int i5 = iArr[i3];
                if (i5 != 1) {
                    if (i5 != i4 - 1) {
                        int i6 = i - 1;
                        while (i6 >= 0) {
                            int i7 = length2 + 1;
                            zArr2[length2] = ((1 << i6) & i5) != 0;
                            i6--;
                            length2 = i7;
                        }
                        i3++;
                    }
                }
                Arrays.fill(zArr2, length2, (length2 + i) - 1, i5 > 1);
                length2 += i - 1;
                i3++;
            }
            return zArr2;
        } catch (Throwable e) {
            throw C5615f.m12348a(e);
        }
    }

    public final C1969e m5373a(C5599a c5599a) {
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        C1969e c1969e;
        C1970g c1970g = c5599a;
        this.f6518f = c1970g;
        C1966b c1966b = c1970g.f6622d;
        boolean z = this.f6518f.f15454a;
        int i5 = this.f6518f.f15456c;
        int i6 = (z ? 11 : 14) + (i5 << 2);
        int[] iArr = new int[i6];
        boolean[] zArr = new boolean[(((z ? 88 : 112) + (i5 << 4)) * i5)];
        int i7 = 2;
        if (z) {
            for (i = 0; i < iArr.length; i++) {
                iArr[i] = i;
            }
        } else {
            i2 = i6 / 2;
            i = ((i6 + 1) + (((i2 - 1) / 15) * 2)) / 2;
            for (i3 = 0; i3 < i2; i3++) {
                int i8 = (i3 / 15) + i3;
                iArr[(i2 - i3) - 1] = (i - i8) - 1;
                iArr[i2 + i3] = (i8 + i) + 1;
            }
        }
        i = 0;
        i2 = 0;
        while (i < i5) {
            i8 = ((i5 - i) << i7) + (z ? 9 : 12);
            int i9 = i << 1;
            int i10 = (i6 - 1) - i9;
            int i11 = 0;
            while (i11 < i8) {
                boolean z2;
                int i12 = i11 << 1;
                i4 = 0;
                for (i7 = 
/*
Method generation error in method: com.google.d.a.a.a.a(com.google.d.a.a):com.google.d.b.e
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r8_3 'i7' int) = (r8_2 'i7' int), (r8_13 'i7' int) binds: {(r8_13 'i7' int)=B:28:0x00c6, (r8_2 'i7' int)=B:23:0x0068} in method: com.google.d.a.a.a.a(com.google.d.a.a):com.google.d.b.e
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:217)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:217)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:328)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:265)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:228)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:83)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 25 more

*/
            }
