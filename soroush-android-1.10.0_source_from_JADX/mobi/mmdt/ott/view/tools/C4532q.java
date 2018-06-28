package mobi.mmdt.ott.view.tools;

import android.content.Context;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2664g;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h;
import mobi.mmdt.ott.provider.p385g.C2978e;

public final class C4532q {

    static /* synthetic */ class C45286 {
        static final /* synthetic */ int[] f12486a = new int[C2665h.m7058a().length];

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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.m7058a();
            r0 = r0.length;
            r0 = new int[r0];
            f12486a = r0;
            r0 = 1;
            r1 = f12486a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8589g;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f12486a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8583a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f12486a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8588f;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f12486a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8584b;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r1 = f12486a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8590h;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r3 = 5;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            r1 = f12486a;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8585c;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r3 = 6;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0039 }
        L_0x0039:
            r1 = f12486a;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8587e;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r3 = 7;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0041 }
        L_0x0041:
            r1 = f12486a;	 Catch:{ NoSuchFieldError -> 0x004a }
            r2 = mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C2665h.f8586d;	 Catch:{ NoSuchFieldError -> 0x004a }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x004a }
            r0 = 8;	 Catch:{ NoSuchFieldError -> 0x004a }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x004a }
        L_0x004a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.6.<clinit>():void");
        }
    }

    public static android.text.SpannableString m8237a(final android.app.Activity r8, java.lang.String r9) {
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
        r0 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x009d }
        r0.<init>(r9);	 Catch:{ Exception -> 0x009d }
        r9 = r0.f8582b;	 Catch:{ Exception -> 0x009d }
        r9 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5929b) r9;	 Catch:{ Exception -> 0x009d }
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x009d }
        r0 = r0.m6928d();	 Catch:{ Exception -> 0x009d }
        r1 = r9.f16082a;	 Catch:{ Exception -> 0x009d }
        r0 = r1.equals(r0);	 Catch:{ Exception -> 0x009d }
        r2 = 0;	 Catch:{ Exception -> 0x009d }
        r3 = 1;	 Catch:{ Exception -> 0x009d }
        if (r0 == 0) goto L_0x0023;	 Catch:{ Exception -> 0x009d }
    L_0x001b:
        r9 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x009d }
        r9 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);	 Catch:{ Exception -> 0x009d }
        goto L_0x005a;	 Catch:{ Exception -> 0x009d }
    L_0x0023:
        r0 = r9.f16083b;	 Catch:{ Exception -> 0x009d }
        if (r0 == 0) goto L_0x0032;	 Catch:{ Exception -> 0x009d }
    L_0x0027:
        r0 = r9.f16083b;	 Catch:{ Exception -> 0x009d }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x009d }
        if (r0 != 0) goto L_0x0032;	 Catch:{ Exception -> 0x009d }
    L_0x002f:
        r9 = r9.f16083b;	 Catch:{ Exception -> 0x009d }
        goto L_0x005a;	 Catch:{ Exception -> 0x009d }
    L_0x0032:
        r9 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r1);	 Catch:{ Exception -> 0x009d }
        if (r9 != 0) goto L_0x0047;	 Catch:{ Exception -> 0x009d }
    L_0x0038:
        r9 = "";	 Catch:{ Exception -> 0x009d }
        r0 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x009d }
        r4 = new java.lang.String[r3];	 Catch:{ Exception -> 0x009d }
        r4[r2] = r1;	 Catch:{ Exception -> 0x009d }
        r0.<init>(r4, r3, r2);	 Catch:{ Exception -> 0x009d }
        mobi.mmdt.ott.logic.C2808d.m7148b(r0);	 Catch:{ Exception -> 0x009d }
        goto L_0x005a;	 Catch:{ Exception -> 0x009d }
    L_0x0047:
        r0 = r9.f9422h;	 Catch:{ Exception -> 0x009d }
        if (r0 == 0) goto L_0x0054;	 Catch:{ Exception -> 0x009d }
    L_0x004b:
        r0 = r9.f9425k;	 Catch:{ Exception -> 0x009d }
        r9 = r9.f9420f;	 Catch:{ Exception -> 0x009d }
        r9 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r0, r9);	 Catch:{ Exception -> 0x009d }
        goto L_0x005a;	 Catch:{ Exception -> 0x009d }
    L_0x0054:
        r9 = r9.f9416b;	 Catch:{ Exception -> 0x009d }
        r9 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r9);	 Catch:{ Exception -> 0x009d }
    L_0x005a:
        r0 = 2131690011; // 0x7f0f021b float:1.9009054E38 double:1.053194802E-314;	 Catch:{ Exception -> 0x009d }
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);	 Catch:{ Exception -> 0x009d }
        r4 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x009d }
        r4[r2] = r9;	 Catch:{ Exception -> 0x009d }
        r0 = java.lang.String.format(r0, r4);	 Catch:{ Exception -> 0x009d }
        r4 = java.util.regex.Pattern.quote(r9);	 Catch:{ Exception -> 0x009d }
        r4 = r0.split(r4);	 Catch:{ Exception -> 0x009d }
        r5 = r4.length;	 Catch:{ Exception -> 0x009d }
        r6 = 2;	 Catch:{ Exception -> 0x009d }
        r7 = 0;	 Catch:{ Exception -> 0x009d }
        if (r5 != r6) goto L_0x007b;	 Catch:{ Exception -> 0x009d }
    L_0x0076:
        r7 = r4[r2];	 Catch:{ Exception -> 0x009d }
        r2 = r4[r3];	 Catch:{ Exception -> 0x009d }
        goto L_0x007c;	 Catch:{ Exception -> 0x009d }
    L_0x007b:
        r2 = r7;	 Catch:{ Exception -> 0x009d }
    L_0x007c:
        r3 = new android.text.SpannableString;	 Catch:{ Exception -> 0x009d }
        r3.<init>(r0);	 Catch:{ Exception -> 0x009d }
        r0 = new mobi.mmdt.ott.view.tools.q$1;	 Catch:{ Exception -> 0x009d }
        r0.<init>(r1, r8);	 Catch:{ Exception -> 0x009d }
        if (r7 == 0) goto L_0x009c;	 Catch:{ Exception -> 0x009d }
    L_0x0088:
        if (r2 == 0) goto L_0x009c;	 Catch:{ Exception -> 0x009d }
    L_0x008a:
        r8 = r7.length();	 Catch:{ Exception -> 0x009d }
        r1 = r7.length();	 Catch:{ Exception -> 0x009d }
        r9 = r9.length();	 Catch:{ Exception -> 0x009d }
        r1 = r1 + r9;	 Catch:{ Exception -> 0x009d }
        r9 = 33;	 Catch:{ Exception -> 0x009d }
        r3.setSpan(r0, r8, r1, r9);	 Catch:{ Exception -> 0x009d }
    L_0x009c:
        return r3;
    L_0x009d:
        r8 = 2131690010; // 0x7f0f021a float:1.9009052E38 double:1.0531948015E-314;
        r8 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        r9 = new android.text.SpannableString;
        r9.<init>(r8);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.a(android.app.Activity, java.lang.String):android.text.SpannableString");
    }

    public static android.text.SpannableString m8238a(final android.app.Activity r11, java.lang.String r12, java.lang.String r13) {
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
        r0 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x0134 }
        r0.<init>(r13);	 Catch:{ Exception -> 0x0134 }
        r13 = r0.f8582b;	 Catch:{ Exception -> 0x0134 }
        r13 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5928a) r13;	 Catch:{ Exception -> 0x0134 }
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x0134 }
        r0 = r0.m6928d();	 Catch:{ Exception -> 0x0134 }
        r1 = r13.f16076a;	 Catch:{ Exception -> 0x0134 }
        r2 = r13.f16078c;	 Catch:{ Exception -> 0x0134 }
        r3 = r13.f16080e;	 Catch:{ Exception -> 0x0134 }
        r4 = r1.equals(r0);	 Catch:{ Exception -> 0x0134 }
        r5 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x0134 }
        r6 = 1;	 Catch:{ Exception -> 0x0134 }
        r7 = 0;	 Catch:{ Exception -> 0x0134 }
        if (r4 == 0) goto L_0x0027;	 Catch:{ Exception -> 0x0134 }
    L_0x0022:
        r4 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r5);	 Catch:{ Exception -> 0x0134 }
        goto L_0x005e;	 Catch:{ Exception -> 0x0134 }
    L_0x0027:
        r4 = r13.f16077b;	 Catch:{ Exception -> 0x0134 }
        if (r4 == 0) goto L_0x0036;	 Catch:{ Exception -> 0x0134 }
    L_0x002b:
        r4 = r13.f16077b;	 Catch:{ Exception -> 0x0134 }
        r4 = r4.isEmpty();	 Catch:{ Exception -> 0x0134 }
        if (r4 != 0) goto L_0x0036;	 Catch:{ Exception -> 0x0134 }
    L_0x0033:
        r4 = r13.f16077b;	 Catch:{ Exception -> 0x0134 }
        goto L_0x005e;	 Catch:{ Exception -> 0x0134 }
    L_0x0036:
        r4 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r1);	 Catch:{ Exception -> 0x0134 }
        if (r4 != 0) goto L_0x004b;	 Catch:{ Exception -> 0x0134 }
    L_0x003c:
        r4 = "";	 Catch:{ Exception -> 0x0134 }
        r8 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x0134 }
        r9 = new java.lang.String[r6];	 Catch:{ Exception -> 0x0134 }
        r9[r7] = r1;	 Catch:{ Exception -> 0x0134 }
        r8.<init>(r9, r6, r7);	 Catch:{ Exception -> 0x0134 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r8);	 Catch:{ Exception -> 0x0134 }
        goto L_0x005e;	 Catch:{ Exception -> 0x0134 }
    L_0x004b:
        r8 = r4.f9422h;	 Catch:{ Exception -> 0x0134 }
        if (r8 == 0) goto L_0x0058;	 Catch:{ Exception -> 0x0134 }
    L_0x004f:
        r8 = r4.f9425k;	 Catch:{ Exception -> 0x0134 }
        r4 = r4.f9420f;	 Catch:{ Exception -> 0x0134 }
        r4 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r8, r4);	 Catch:{ Exception -> 0x0134 }
        goto L_0x005e;	 Catch:{ Exception -> 0x0134 }
    L_0x0058:
        r4 = r4.f9416b;	 Catch:{ Exception -> 0x0134 }
        r4 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r4);	 Catch:{ Exception -> 0x0134 }
    L_0x005e:
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x0134 }
        if (r0 == 0) goto L_0x0069;	 Catch:{ Exception -> 0x0134 }
    L_0x0064:
        r13 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r5);	 Catch:{ Exception -> 0x0134 }
        goto L_0x00a0;	 Catch:{ Exception -> 0x0134 }
    L_0x0069:
        r0 = r13.f16079d;	 Catch:{ Exception -> 0x0134 }
        if (r0 == 0) goto L_0x0078;	 Catch:{ Exception -> 0x0134 }
    L_0x006d:
        r0 = r13.f16079d;	 Catch:{ Exception -> 0x0134 }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x0134 }
        if (r0 != 0) goto L_0x0078;	 Catch:{ Exception -> 0x0134 }
    L_0x0075:
        r13 = r13.f16079d;	 Catch:{ Exception -> 0x0134 }
        goto L_0x00a0;	 Catch:{ Exception -> 0x0134 }
    L_0x0078:
        r13 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);	 Catch:{ Exception -> 0x0134 }
        if (r13 != 0) goto L_0x008d;	 Catch:{ Exception -> 0x0134 }
    L_0x007e:
        r13 = "";	 Catch:{ Exception -> 0x0134 }
        r0 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x0134 }
        r5 = new java.lang.String[r6];	 Catch:{ Exception -> 0x0134 }
        r5[r7] = r2;	 Catch:{ Exception -> 0x0134 }
        r0.<init>(r5, r6, r7);	 Catch:{ Exception -> 0x0134 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r0);	 Catch:{ Exception -> 0x0134 }
        goto L_0x00a0;	 Catch:{ Exception -> 0x0134 }
    L_0x008d:
        r0 = r13.f9422h;	 Catch:{ Exception -> 0x0134 }
        if (r0 == 0) goto L_0x009a;	 Catch:{ Exception -> 0x0134 }
    L_0x0091:
        r0 = r13.f9425k;	 Catch:{ Exception -> 0x0134 }
        r13 = r13.f9420f;	 Catch:{ Exception -> 0x0134 }
        r13 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r0, r13);	 Catch:{ Exception -> 0x0134 }
        goto L_0x00a0;	 Catch:{ Exception -> 0x0134 }
    L_0x009a:
        r13 = r13.f9416b;	 Catch:{ Exception -> 0x0134 }
        r13 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r13);	 Catch:{ Exception -> 0x0134 }
    L_0x00a0:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0134 }
        r0.<init>();	 Catch:{ Exception -> 0x0134 }
        r12 = mobi.mmdt.ott.view.tools.C4532q.m8243a(r12);	 Catch:{ Exception -> 0x0134 }
        r0.append(r12);	 Catch:{ Exception -> 0x0134 }
        r12 = 2131690008; // 0x7f0f0218 float:1.9009047E38 double:1.0531948005E-314;	 Catch:{ Exception -> 0x0134 }
        r12 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r12);	 Catch:{ Exception -> 0x0134 }
        r5 = 3;	 Catch:{ Exception -> 0x0134 }
        r5 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x0134 }
        r5[r7] = r13;	 Catch:{ Exception -> 0x0134 }
        r3 = r3.f9446f;	 Catch:{ Exception -> 0x0134 }
        r3 = r11.getString(r3);	 Catch:{ Exception -> 0x0134 }
        r5[r6] = r3;	 Catch:{ Exception -> 0x0134 }
        r3 = 2;	 Catch:{ Exception -> 0x0134 }
        r5[r3] = r4;	 Catch:{ Exception -> 0x0134 }
        r12 = java.lang.String.format(r12, r5);	 Catch:{ Exception -> 0x0134 }
        r0.append(r12);	 Catch:{ Exception -> 0x0134 }
        r12 = r0.toString();	 Catch:{ Exception -> 0x0134 }
        r0 = java.util.regex.Pattern.quote(r4);	 Catch:{ Exception -> 0x0134 }
        r0 = r12.split(r0);	 Catch:{ Exception -> 0x0134 }
        r5 = r0.length;	 Catch:{ Exception -> 0x0134 }
        r8 = 0;	 Catch:{ Exception -> 0x0134 }
        if (r5 != r3) goto L_0x00df;	 Catch:{ Exception -> 0x0134 }
    L_0x00da:
        r5 = r0[r7];	 Catch:{ Exception -> 0x0134 }
        r0 = r0[r6];	 Catch:{ Exception -> 0x0134 }
        goto L_0x00e1;	 Catch:{ Exception -> 0x0134 }
    L_0x00df:
        r0 = r8;	 Catch:{ Exception -> 0x0134 }
        r5 = r0;	 Catch:{ Exception -> 0x0134 }
    L_0x00e1:
        r9 = java.util.regex.Pattern.quote(r13);	 Catch:{ Exception -> 0x0134 }
        r9 = r12.split(r9);	 Catch:{ Exception -> 0x0134 }
        r10 = r9.length;	 Catch:{ Exception -> 0x0134 }
        if (r10 != r3) goto L_0x00f1;	 Catch:{ Exception -> 0x0134 }
    L_0x00ec:
        r8 = r9[r7];	 Catch:{ Exception -> 0x0134 }
        r3 = r9[r6];	 Catch:{ Exception -> 0x0134 }
        goto L_0x00f2;	 Catch:{ Exception -> 0x0134 }
    L_0x00f1:
        r3 = r8;	 Catch:{ Exception -> 0x0134 }
    L_0x00f2:
        r9 = new android.text.SpannableString;	 Catch:{ Exception -> 0x0134 }
        r9.<init>(r12);	 Catch:{ Exception -> 0x0134 }
        r12 = new mobi.mmdt.ott.view.tools.q$7;	 Catch:{ Exception -> 0x0134 }
        r12.<init>(r1, r11);	 Catch:{ Exception -> 0x0134 }
        r1 = new mobi.mmdt.ott.view.tools.q$8;	 Catch:{ Exception -> 0x0134 }
        r1.<init>(r2, r11);	 Catch:{ Exception -> 0x0134 }
        r11 = 33;	 Catch:{ Exception -> 0x0134 }
        if (r5 == 0) goto L_0x0117;	 Catch:{ Exception -> 0x0134 }
    L_0x0105:
        if (r0 == 0) goto L_0x0117;	 Catch:{ Exception -> 0x0134 }
    L_0x0107:
        r0 = r5.length();	 Catch:{ Exception -> 0x0134 }
        r2 = r5.length();	 Catch:{ Exception -> 0x0134 }
        r4 = r4.length();	 Catch:{ Exception -> 0x0134 }
        r2 = r2 + r4;	 Catch:{ Exception -> 0x0134 }
        r9.setSpan(r12, r0, r2, r11);	 Catch:{ Exception -> 0x0134 }
    L_0x0117:
        if (r8 == 0) goto L_0x012b;	 Catch:{ Exception -> 0x0134 }
    L_0x0119:
        if (r3 == 0) goto L_0x012b;	 Catch:{ Exception -> 0x0134 }
    L_0x011b:
        r12 = r8.length();	 Catch:{ Exception -> 0x0134 }
        r0 = r8.length();	 Catch:{ Exception -> 0x0134 }
        r13 = r13.length();	 Catch:{ Exception -> 0x0134 }
        r0 = r0 + r13;	 Catch:{ Exception -> 0x0134 }
        r9.setSpan(r1, r12, r0, r11);	 Catch:{ Exception -> 0x0134 }
    L_0x012b:
        r12 = new android.text.style.ForegroundColorSpan;	 Catch:{ Exception -> 0x0134 }
        r12.<init>(r7);	 Catch:{ Exception -> 0x0134 }
        r9.setSpan(r12, r7, r6, r11);	 Catch:{ Exception -> 0x0134 }
        return r9;
    L_0x0134:
        r11 = 2131690009; // 0x7f0f0219 float:1.900905E38 double:1.053194801E-314;
        r11 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r11);
        r12 = new android.text.SpannableString;
        r12.<init>(r11);
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.a(android.app.Activity, java.lang.String, java.lang.String):android.text.SpannableString");
    }

    public static android.text.SpannableString m8239a(final android.app.Activity r7, java.lang.String r8, final java.lang.String r9, java.lang.String r10) {
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
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x00ac }
        r0 = r0.m6928d();	 Catch:{ Exception -> 0x00ac }
        r1 = 0;	 Catch:{ Exception -> 0x00ac }
        r2 = 1;	 Catch:{ Exception -> 0x00ac }
        if (r10 == 0) goto L_0x0012;	 Catch:{ Exception -> 0x00ac }
    L_0x000c:
        r3 = r10.isEmpty();	 Catch:{ Exception -> 0x00ac }
        if (r3 == 0) goto L_0x003a;	 Catch:{ Exception -> 0x00ac }
    L_0x0012:
        r10 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r9);	 Catch:{ Exception -> 0x00ac }
        if (r10 != 0) goto L_0x0027;	 Catch:{ Exception -> 0x00ac }
    L_0x0018:
        r10 = "";	 Catch:{ Exception -> 0x00ac }
        r3 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x00ac }
        r4 = new java.lang.String[r2];	 Catch:{ Exception -> 0x00ac }
        r4[r1] = r9;	 Catch:{ Exception -> 0x00ac }
        r3.<init>(r4, r2, r1);	 Catch:{ Exception -> 0x00ac }
        mobi.mmdt.ott.logic.C2808d.m7148b(r3);	 Catch:{ Exception -> 0x00ac }
        goto L_0x003a;	 Catch:{ Exception -> 0x00ac }
    L_0x0027:
        r3 = r10.f9422h;	 Catch:{ Exception -> 0x00ac }
        if (r3 == 0) goto L_0x0034;	 Catch:{ Exception -> 0x00ac }
    L_0x002b:
        r3 = r10.f9425k;	 Catch:{ Exception -> 0x00ac }
        r10 = r10.f9420f;	 Catch:{ Exception -> 0x00ac }
        r10 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r3, r10);	 Catch:{ Exception -> 0x00ac }
        goto L_0x003a;	 Catch:{ Exception -> 0x00ac }
    L_0x0034:
        r10 = r10.f9416b;	 Catch:{ Exception -> 0x00ac }
        r10 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r10);	 Catch:{ Exception -> 0x00ac }
    L_0x003a:
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00ac }
        r3.<init>();	 Catch:{ Exception -> 0x00ac }
        r8 = mobi.mmdt.ott.view.tools.C4532q.m8243a(r8);	 Catch:{ Exception -> 0x00ac }
        r3.append(r8);	 Catch:{ Exception -> 0x00ac }
        r8 = 2131689757; // 0x7f0f011d float:1.9008538E38 double:1.0531946765E-314;	 Catch:{ Exception -> 0x00ac }
        r8 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);	 Catch:{ Exception -> 0x00ac }
        r4 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x00ac }
        r4[r1] = r10;	 Catch:{ Exception -> 0x00ac }
        r8 = java.lang.String.format(r8, r4);	 Catch:{ Exception -> 0x00ac }
        r3.append(r8);	 Catch:{ Exception -> 0x00ac }
        r8 = r3.toString();	 Catch:{ Exception -> 0x00ac }
        r3 = java.util.regex.Pattern.quote(r10);	 Catch:{ Exception -> 0x00ac }
        r3 = r8.split(r3);	 Catch:{ Exception -> 0x00ac }
        r4 = r3.length;	 Catch:{ Exception -> 0x00ac }
        r5 = 2;	 Catch:{ Exception -> 0x00ac }
        r6 = 0;	 Catch:{ Exception -> 0x00ac }
        if (r4 != r5) goto L_0x006e;	 Catch:{ Exception -> 0x00ac }
    L_0x0069:
        r6 = r3[r1];	 Catch:{ Exception -> 0x00ac }
        r3 = r3[r2];	 Catch:{ Exception -> 0x00ac }
        goto L_0x006f;	 Catch:{ Exception -> 0x00ac }
    L_0x006e:
        r3 = r6;	 Catch:{ Exception -> 0x00ac }
    L_0x006f:
        r4 = new android.text.SpannableString;	 Catch:{ Exception -> 0x00ac }
        r4.<init>(r8);	 Catch:{ Exception -> 0x00ac }
        r8 = new mobi.mmdt.ott.view.tools.q$4;	 Catch:{ Exception -> 0x00ac }
        r8.<init>(r9, r7);	 Catch:{ Exception -> 0x00ac }
        r9 = new mobi.mmdt.ott.view.tools.q$5;	 Catch:{ Exception -> 0x00ac }
        r9.<init>(r7, r0);	 Catch:{ Exception -> 0x00ac }
        r7 = 33;	 Catch:{ Exception -> 0x00ac }
        if (r6 == 0) goto L_0x0094;	 Catch:{ Exception -> 0x00ac }
    L_0x0082:
        if (r3 == 0) goto L_0x0094;	 Catch:{ Exception -> 0x00ac }
    L_0x0084:
        r0 = r6.length();	 Catch:{ Exception -> 0x00ac }
        r3 = r6.length();	 Catch:{ Exception -> 0x00ac }
        r10 = r10.length();	 Catch:{ Exception -> 0x00ac }
        r3 = r3 + r10;	 Catch:{ Exception -> 0x00ac }
        r4.setSpan(r8, r0, r3, r7);	 Catch:{ Exception -> 0x00ac }
    L_0x0094:
        r8 = new android.text.style.ForegroundColorSpan;	 Catch:{ Exception -> 0x00ac }
        r8.<init>(r1);	 Catch:{ Exception -> 0x00ac }
        r4.setSpan(r8, r1, r2, r7);	 Catch:{ Exception -> 0x00ac }
        r8 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x00ac }
        r8 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);	 Catch:{ Exception -> 0x00ac }
        r8 = r8.length();	 Catch:{ Exception -> 0x00ac }
        r8 = r8 + r2;	 Catch:{ Exception -> 0x00ac }
        r4.setSpan(r9, r2, r8, r7);	 Catch:{ Exception -> 0x00ac }
        return r4;
    L_0x00ac:
        r7 = 2131690172; // 0x7f0f02bc float:1.900938E38 double:1.0531948816E-314;
        r7 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r7);
        r8 = new android.text.SpannableString;
        r8.<init>(r7);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.a(android.app.Activity, java.lang.String, java.lang.String, java.lang.String):android.text.SpannableString");
    }

    public static java.lang.String m8240a(android.content.Context r6, java.lang.String r7) {
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
        r0 = 2131690010; // 0x7f0f021a float:1.9009052E38 double:1.0531948015E-314;
        r1 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x0070 }
        r1.<init>(r7);	 Catch:{ Exception -> 0x0070 }
        r7 = r1.f8582b;	 Catch:{ Exception -> 0x0070 }
        r7 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5929b) r7;	 Catch:{ Exception -> 0x0070 }
        r1 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x0070 }
        r1 = r1.m6928d();	 Catch:{ Exception -> 0x0070 }
        if (r7 != 0) goto L_0x001b;	 Catch:{ Exception -> 0x0070 }
    L_0x0016:
        r7 = r6.getString(r0);	 Catch:{ Exception -> 0x0070 }
        return r7;	 Catch:{ Exception -> 0x0070 }
    L_0x001b:
        r2 = r7.f16082a;	 Catch:{ Exception -> 0x0070 }
        r1 = r2.equals(r1);	 Catch:{ Exception -> 0x0070 }
        r3 = 0;	 Catch:{ Exception -> 0x0070 }
        r4 = 1;	 Catch:{ Exception -> 0x0070 }
        if (r1 == 0) goto L_0x002d;	 Catch:{ Exception -> 0x0070 }
    L_0x0025:
        r7 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x0070 }
        r7 = r6.getString(r7);	 Catch:{ Exception -> 0x0070 }
        goto L_0x0064;	 Catch:{ Exception -> 0x0070 }
    L_0x002d:
        r1 = r7.f16083b;	 Catch:{ Exception -> 0x0070 }
        if (r1 == 0) goto L_0x003c;	 Catch:{ Exception -> 0x0070 }
    L_0x0031:
        r1 = r7.f16083b;	 Catch:{ Exception -> 0x0070 }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x0070 }
        if (r1 != 0) goto L_0x003c;	 Catch:{ Exception -> 0x0070 }
    L_0x0039:
        r7 = r7.f16083b;	 Catch:{ Exception -> 0x0070 }
        goto L_0x0064;	 Catch:{ Exception -> 0x0070 }
    L_0x003c:
        r7 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);	 Catch:{ Exception -> 0x0070 }
        if (r7 != 0) goto L_0x0051;	 Catch:{ Exception -> 0x0070 }
    L_0x0042:
        r7 = "";	 Catch:{ Exception -> 0x0070 }
        r1 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x0070 }
        r5 = new java.lang.String[r4];	 Catch:{ Exception -> 0x0070 }
        r5[r3] = r2;	 Catch:{ Exception -> 0x0070 }
        r1.<init>(r5, r4, r3);	 Catch:{ Exception -> 0x0070 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r1);	 Catch:{ Exception -> 0x0070 }
        goto L_0x0064;	 Catch:{ Exception -> 0x0070 }
    L_0x0051:
        r1 = r7.f9422h;	 Catch:{ Exception -> 0x0070 }
        if (r1 == 0) goto L_0x005e;	 Catch:{ Exception -> 0x0070 }
    L_0x0055:
        r1 = r7.f9425k;	 Catch:{ Exception -> 0x0070 }
        r7 = r7.f9420f;	 Catch:{ Exception -> 0x0070 }
        r7 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r1, r7);	 Catch:{ Exception -> 0x0070 }
        goto L_0x0064;	 Catch:{ Exception -> 0x0070 }
    L_0x005e:
        r7 = r7.f9416b;	 Catch:{ Exception -> 0x0070 }
        r7 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r7);	 Catch:{ Exception -> 0x0070 }
    L_0x0064:
        r1 = 2131690011; // 0x7f0f021b float:1.9009054E38 double:1.053194802E-314;	 Catch:{ Exception -> 0x0070 }
        r2 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0070 }
        r2[r3] = r7;	 Catch:{ Exception -> 0x0070 }
        r7 = r6.getString(r1, r2);	 Catch:{ Exception -> 0x0070 }
        return r7;
    L_0x0070:
        r6 = r6.getString(r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public static java.lang.String m8241a(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
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
        r1 = 1;
        if (r6 == 0) goto L_0x000a;
    L_0x0004:
        r2 = r6.isEmpty();	 Catch:{ Exception -> 0x003e }
        if (r2 == 0) goto L_0x0032;	 Catch:{ Exception -> 0x003e }
    L_0x000a:
        r6 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r5);	 Catch:{ Exception -> 0x003e }
        if (r6 != 0) goto L_0x001f;	 Catch:{ Exception -> 0x003e }
    L_0x0010:
        r6 = "";	 Catch:{ Exception -> 0x003e }
        r2 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x003e }
        r3 = new java.lang.String[r1];	 Catch:{ Exception -> 0x003e }
        r3[r0] = r5;	 Catch:{ Exception -> 0x003e }
        r2.<init>(r3, r1, r0);	 Catch:{ Exception -> 0x003e }
        mobi.mmdt.ott.logic.C2808d.m7148b(r2);	 Catch:{ Exception -> 0x003e }
        goto L_0x0032;	 Catch:{ Exception -> 0x003e }
    L_0x001f:
        r5 = r6.f9422h;	 Catch:{ Exception -> 0x003e }
        if (r5 == 0) goto L_0x002c;	 Catch:{ Exception -> 0x003e }
    L_0x0023:
        r5 = r6.f9425k;	 Catch:{ Exception -> 0x003e }
        r6 = r6.f9420f;	 Catch:{ Exception -> 0x003e }
        r6 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r5, r6);	 Catch:{ Exception -> 0x003e }
        goto L_0x0032;	 Catch:{ Exception -> 0x003e }
    L_0x002c:
        r5 = r6.f9416b;	 Catch:{ Exception -> 0x003e }
        r6 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r5);	 Catch:{ Exception -> 0x003e }
    L_0x0032:
        r5 = 2131689757; // 0x7f0f011d float:1.9008538E38 double:1.0531946765E-314;	 Catch:{ Exception -> 0x003e }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x003e }
        r1[r0] = r6;	 Catch:{ Exception -> 0x003e }
        r5 = r4.getString(r5, r1);	 Catch:{ Exception -> 0x003e }
        return r5;
    L_0x003e:
        r5 = 2131690586; // 0x7f0f045a float:1.901022E38 double:1.053195086E-314;
        r4 = r4.getString(r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String m8242a(Context context, String str, C2978e c2978e, String str2, String str3) {
        int i = 0;
        if (c2978e != null) {
            if ((c2978e == C2978e.CHANNEL ? 1 : 0) != 0 && str.equals("CHANNEL_MEMBERSHIP_ADD")) {
                i = 1;
            }
        }
        if (i != 0) {
            return C4532q.m8241a(context, str2, str3);
        }
        switch (C45286.f12486a[new C2664g(str).f8581a - 1]) {
            case 1:
                return str;
            case 2:
                return C4532q.m8240a(context, str);
            case 3:
                return C4532q.m8245b(context, str);
            case 4:
                return C4532q.m8247c(context, str);
            case 5:
                return C4532q.m8251e(context, str);
            case 6:
                return C4532q.m8249d(context, str);
            case 7:
                return C4532q.m8253f(context, str);
            case 8:
                return C4532q.m8254g(context, str);
            default:
                return "";
        }
    }

    private static String m8243a(String str) {
        return str.equals("en-us") ? "i" : "ا";
    }

    public static android.text.SpannableString m8244b(final android.app.Activity r9, java.lang.String r10, java.lang.String r11) {
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
        r0 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x00c9 }
        r0.<init>(r11);	 Catch:{ Exception -> 0x00c9 }
        r11 = r0.f8582b;	 Catch:{ Exception -> 0x00c9 }
        r11 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5930c) r11;	 Catch:{ Exception -> 0x00c9 }
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x00c9 }
        r0 = r0.m6928d();	 Catch:{ Exception -> 0x00c9 }
        r1 = r11.f16085a;	 Catch:{ Exception -> 0x00c9 }
        r2 = r1.equals(r0);	 Catch:{ Exception -> 0x00c9 }
        r3 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x00c9 }
        r4 = 0;	 Catch:{ Exception -> 0x00c9 }
        r5 = 1;	 Catch:{ Exception -> 0x00c9 }
        if (r2 == 0) goto L_0x0023;	 Catch:{ Exception -> 0x00c9 }
    L_0x001e:
        r11 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r3);	 Catch:{ Exception -> 0x00c9 }
        goto L_0x005a;	 Catch:{ Exception -> 0x00c9 }
    L_0x0023:
        r2 = r11.f16086b;	 Catch:{ Exception -> 0x00c9 }
        if (r2 == 0) goto L_0x0032;	 Catch:{ Exception -> 0x00c9 }
    L_0x0027:
        r2 = r11.f16086b;	 Catch:{ Exception -> 0x00c9 }
        r2 = r2.isEmpty();	 Catch:{ Exception -> 0x00c9 }
        if (r2 != 0) goto L_0x0032;	 Catch:{ Exception -> 0x00c9 }
    L_0x002f:
        r11 = r11.f16086b;	 Catch:{ Exception -> 0x00c9 }
        goto L_0x005a;	 Catch:{ Exception -> 0x00c9 }
    L_0x0032:
        r11 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r1);	 Catch:{ Exception -> 0x00c9 }
        if (r11 != 0) goto L_0x0047;	 Catch:{ Exception -> 0x00c9 }
    L_0x0038:
        r11 = "";	 Catch:{ Exception -> 0x00c9 }
        r2 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x00c9 }
        r6 = new java.lang.String[r5];	 Catch:{ Exception -> 0x00c9 }
        r6[r4] = r1;	 Catch:{ Exception -> 0x00c9 }
        r2.<init>(r6, r5, r4);	 Catch:{ Exception -> 0x00c9 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r2);	 Catch:{ Exception -> 0x00c9 }
        goto L_0x005a;	 Catch:{ Exception -> 0x00c9 }
    L_0x0047:
        r2 = r11.f9422h;	 Catch:{ Exception -> 0x00c9 }
        if (r2 == 0) goto L_0x0054;	 Catch:{ Exception -> 0x00c9 }
    L_0x004b:
        r2 = r11.f9425k;	 Catch:{ Exception -> 0x00c9 }
        r11 = r11.f9420f;	 Catch:{ Exception -> 0x00c9 }
        r11 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r2, r11);	 Catch:{ Exception -> 0x00c9 }
        goto L_0x005a;	 Catch:{ Exception -> 0x00c9 }
    L_0x0054:
        r11 = r11.f9416b;	 Catch:{ Exception -> 0x00c9 }
        r11 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r11);	 Catch:{ Exception -> 0x00c9 }
    L_0x005a:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c9 }
        r2.<init>();	 Catch:{ Exception -> 0x00c9 }
        r10 = mobi.mmdt.ott.view.tools.C4532q.m8243a(r10);	 Catch:{ Exception -> 0x00c9 }
        r2.append(r10);	 Catch:{ Exception -> 0x00c9 }
        r10 = 2131690012; // 0x7f0f021c float:1.9009056E38 double:1.0531948025E-314;	 Catch:{ Exception -> 0x00c9 }
        r10 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r10);	 Catch:{ Exception -> 0x00c9 }
        r6 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x00c9 }
        r6[r4] = r11;	 Catch:{ Exception -> 0x00c9 }
        r10 = java.lang.String.format(r10, r6);	 Catch:{ Exception -> 0x00c9 }
        r2.append(r10);	 Catch:{ Exception -> 0x00c9 }
        r10 = r2.toString();	 Catch:{ Exception -> 0x00c9 }
        r2 = java.util.regex.Pattern.quote(r11);	 Catch:{ Exception -> 0x00c9 }
        r2 = r10.split(r2);	 Catch:{ Exception -> 0x00c9 }
        r6 = r2.length;	 Catch:{ Exception -> 0x00c9 }
        r7 = 2;	 Catch:{ Exception -> 0x00c9 }
        r8 = 0;	 Catch:{ Exception -> 0x00c9 }
        if (r6 != r7) goto L_0x008e;	 Catch:{ Exception -> 0x00c9 }
    L_0x0089:
        r8 = r2[r4];	 Catch:{ Exception -> 0x00c9 }
        r2 = r2[r5];	 Catch:{ Exception -> 0x00c9 }
        goto L_0x008f;	 Catch:{ Exception -> 0x00c9 }
    L_0x008e:
        r2 = r8;	 Catch:{ Exception -> 0x00c9 }
    L_0x008f:
        r6 = new android.text.SpannableString;	 Catch:{ Exception -> 0x00c9 }
        r6.<init>(r10);	 Catch:{ Exception -> 0x00c9 }
        r10 = new mobi.mmdt.ott.view.tools.q$9;	 Catch:{ Exception -> 0x00c9 }
        r10.<init>(r1, r9);	 Catch:{ Exception -> 0x00c9 }
        r1 = new mobi.mmdt.ott.view.tools.q$10;	 Catch:{ Exception -> 0x00c9 }
        r1.<init>(r9, r0);	 Catch:{ Exception -> 0x00c9 }
        r9 = 33;	 Catch:{ Exception -> 0x00c9 }
        if (r8 == 0) goto L_0x00b4;	 Catch:{ Exception -> 0x00c9 }
    L_0x00a2:
        if (r2 == 0) goto L_0x00b4;	 Catch:{ Exception -> 0x00c9 }
    L_0x00a4:
        r0 = r8.length();	 Catch:{ Exception -> 0x00c9 }
        r2 = r8.length();	 Catch:{ Exception -> 0x00c9 }
        r11 = r11.length();	 Catch:{ Exception -> 0x00c9 }
        r2 = r2 + r11;	 Catch:{ Exception -> 0x00c9 }
        r6.setSpan(r10, r0, r2, r9);	 Catch:{ Exception -> 0x00c9 }
    L_0x00b4:
        r10 = new android.text.style.ForegroundColorSpan;	 Catch:{ Exception -> 0x00c9 }
        r10.<init>(r4);	 Catch:{ Exception -> 0x00c9 }
        r6.setSpan(r10, r4, r5, r9);	 Catch:{ Exception -> 0x00c9 }
        r10 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r3);	 Catch:{ Exception -> 0x00c9 }
        r10 = r10.length();	 Catch:{ Exception -> 0x00c9 }
        r10 = r10 + r5;	 Catch:{ Exception -> 0x00c9 }
        r6.setSpan(r1, r5, r10, r9);	 Catch:{ Exception -> 0x00c9 }
        return r6;
    L_0x00c9:
        r9 = 2131690173; // 0x7f0f02bd float:1.9009382E38 double:1.053194882E-314;
        r9 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);
        r10 = new android.text.SpannableString;
        r10.<init>(r9);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.b(android.app.Activity, java.lang.String, java.lang.String):android.text.SpannableString");
    }

    public static java.lang.String m8245b(android.content.Context r11, java.lang.String r12) {
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
        r0 = 2131690009; // 0x7f0f0219 float:1.900905E38 double:1.053194801E-314;
        r1 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x00c3 }
        r1.<init>(r12);	 Catch:{ Exception -> 0x00c3 }
        r12 = r1.f8582b;	 Catch:{ Exception -> 0x00c3 }
        r12 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5928a) r12;	 Catch:{ Exception -> 0x00c3 }
        r1 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x00c3 }
        r1 = r1.m6928d();	 Catch:{ Exception -> 0x00c3 }
        if (r12 == 0) goto L_0x00be;	 Catch:{ Exception -> 0x00c3 }
    L_0x0016:
        r2 = r12.f16076a;	 Catch:{ Exception -> 0x00c3 }
        r3 = r12.f16078c;	 Catch:{ Exception -> 0x00c3 }
        r4 = r12.f16080e;	 Catch:{ Exception -> 0x00c3 }
        r5 = r2.equals(r1);	 Catch:{ Exception -> 0x00c3 }
        r6 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x00c3 }
        r7 = 0;	 Catch:{ Exception -> 0x00c3 }
        r8 = 1;	 Catch:{ Exception -> 0x00c3 }
        if (r5 == 0) goto L_0x002c;	 Catch:{ Exception -> 0x00c3 }
    L_0x0027:
        r2 = r11.getString(r6);	 Catch:{ Exception -> 0x00c3 }
        goto L_0x0064;	 Catch:{ Exception -> 0x00c3 }
    L_0x002c:
        r5 = r12.f16077b;	 Catch:{ Exception -> 0x00c3 }
        if (r5 == 0) goto L_0x003b;	 Catch:{ Exception -> 0x00c3 }
    L_0x0030:
        r5 = r12.f16077b;	 Catch:{ Exception -> 0x00c3 }
        r5 = r5.isEmpty();	 Catch:{ Exception -> 0x00c3 }
        if (r5 != 0) goto L_0x003b;	 Catch:{ Exception -> 0x00c3 }
    L_0x0038:
        r2 = r12.f16077b;	 Catch:{ Exception -> 0x00c3 }
        goto L_0x0064;	 Catch:{ Exception -> 0x00c3 }
    L_0x003b:
        r5 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);	 Catch:{ Exception -> 0x00c3 }
        if (r5 != 0) goto L_0x0051;	 Catch:{ Exception -> 0x00c3 }
    L_0x0041:
        r5 = "";	 Catch:{ Exception -> 0x00c3 }
        r9 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x00c3 }
        r10 = new java.lang.String[r8];	 Catch:{ Exception -> 0x00c3 }
        r10[r7] = r2;	 Catch:{ Exception -> 0x00c3 }
        r9.<init>(r10, r8, r7);	 Catch:{ Exception -> 0x00c3 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r9);	 Catch:{ Exception -> 0x00c3 }
        r2 = r5;	 Catch:{ Exception -> 0x00c3 }
        goto L_0x0064;	 Catch:{ Exception -> 0x00c3 }
    L_0x0051:
        r2 = r5.f9422h;	 Catch:{ Exception -> 0x00c3 }
        if (r2 == 0) goto L_0x005e;	 Catch:{ Exception -> 0x00c3 }
    L_0x0055:
        r2 = r5.f9425k;	 Catch:{ Exception -> 0x00c3 }
        r5 = r5.f9420f;	 Catch:{ Exception -> 0x00c3 }
        r2 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r2, r5);	 Catch:{ Exception -> 0x00c3 }
        goto L_0x0064;	 Catch:{ Exception -> 0x00c3 }
    L_0x005e:
        r2 = r5.f9416b;	 Catch:{ Exception -> 0x00c3 }
        r2 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r2);	 Catch:{ Exception -> 0x00c3 }
    L_0x0064:
        r1 = r3.equals(r1);	 Catch:{ Exception -> 0x00c3 }
        if (r1 == 0) goto L_0x006f;	 Catch:{ Exception -> 0x00c3 }
    L_0x006a:
        r12 = r11.getString(r6);	 Catch:{ Exception -> 0x00c3 }
        goto L_0x00a6;	 Catch:{ Exception -> 0x00c3 }
    L_0x006f:
        r1 = r12.f16079d;	 Catch:{ Exception -> 0x00c3 }
        if (r1 == 0) goto L_0x007e;	 Catch:{ Exception -> 0x00c3 }
    L_0x0073:
        r1 = r12.f16079d;	 Catch:{ Exception -> 0x00c3 }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x00c3 }
        if (r1 != 0) goto L_0x007e;	 Catch:{ Exception -> 0x00c3 }
    L_0x007b:
        r12 = r12.f16079d;	 Catch:{ Exception -> 0x00c3 }
        goto L_0x00a6;	 Catch:{ Exception -> 0x00c3 }
    L_0x007e:
        r12 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r3);	 Catch:{ Exception -> 0x00c3 }
        if (r12 != 0) goto L_0x0093;	 Catch:{ Exception -> 0x00c3 }
    L_0x0084:
        r12 = "";	 Catch:{ Exception -> 0x00c3 }
        r1 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x00c3 }
        r5 = new java.lang.String[r8];	 Catch:{ Exception -> 0x00c3 }
        r5[r7] = r3;	 Catch:{ Exception -> 0x00c3 }
        r1.<init>(r5, r8, r7);	 Catch:{ Exception -> 0x00c3 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r1);	 Catch:{ Exception -> 0x00c3 }
        goto L_0x00a6;	 Catch:{ Exception -> 0x00c3 }
    L_0x0093:
        r1 = r12.f9422h;	 Catch:{ Exception -> 0x00c3 }
        if (r1 == 0) goto L_0x00a0;	 Catch:{ Exception -> 0x00c3 }
    L_0x0097:
        r1 = r12.f9425k;	 Catch:{ Exception -> 0x00c3 }
        r12 = r12.f9420f;	 Catch:{ Exception -> 0x00c3 }
        r12 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r1, r12);	 Catch:{ Exception -> 0x00c3 }
        goto L_0x00a6;	 Catch:{ Exception -> 0x00c3 }
    L_0x00a0:
        r12 = r12.f9416b;	 Catch:{ Exception -> 0x00c3 }
        r12 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r12);	 Catch:{ Exception -> 0x00c3 }
    L_0x00a6:
        r1 = 2131690008; // 0x7f0f0218 float:1.9009047E38 double:1.0531948005E-314;	 Catch:{ Exception -> 0x00c3 }
        r3 = 3;	 Catch:{ Exception -> 0x00c3 }
        r3 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x00c3 }
        r3[r7] = r12;	 Catch:{ Exception -> 0x00c3 }
        r12 = r4.f9446f;	 Catch:{ Exception -> 0x00c3 }
        r12 = r11.getString(r12);	 Catch:{ Exception -> 0x00c3 }
        r3[r8] = r12;	 Catch:{ Exception -> 0x00c3 }
        r12 = 2;	 Catch:{ Exception -> 0x00c3 }
        r3[r12] = r2;	 Catch:{ Exception -> 0x00c3 }
        r12 = r11.getString(r1, r3);	 Catch:{ Exception -> 0x00c3 }
        return r12;	 Catch:{ Exception -> 0x00c3 }
    L_0x00be:
        r12 = r11.getString(r0);	 Catch:{ Exception -> 0x00c3 }
        return r12;
    L_0x00c3:
        r11 = r11.getString(r0);
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.b(android.content.Context, java.lang.String):java.lang.String");
    }

    public static android.text.SpannableString m8246c(final android.app.Activity r11, java.lang.String r12, java.lang.String r13) {
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
        r0 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x0131 }
        r0.<init>(r13);	 Catch:{ Exception -> 0x0131 }
        r13 = r0.f8582b;	 Catch:{ Exception -> 0x0131 }
        r13 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5932e) r13;	 Catch:{ Exception -> 0x0131 }
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x0131 }
        r0 = r0.m6928d();	 Catch:{ Exception -> 0x0131 }
        r1 = r13.f16091a;	 Catch:{ Exception -> 0x0131 }
        r2 = r13.f16093c;	 Catch:{ Exception -> 0x0131 }
        r3 = r1.equals(r0);	 Catch:{ Exception -> 0x0131 }
        r4 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x0131 }
        r5 = 1;	 Catch:{ Exception -> 0x0131 }
        r6 = 0;	 Catch:{ Exception -> 0x0131 }
        if (r3 == 0) goto L_0x0025;	 Catch:{ Exception -> 0x0131 }
    L_0x0020:
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r4);	 Catch:{ Exception -> 0x0131 }
        goto L_0x005c;	 Catch:{ Exception -> 0x0131 }
    L_0x0025:
        r3 = r13.f16092b;	 Catch:{ Exception -> 0x0131 }
        if (r3 == 0) goto L_0x0034;	 Catch:{ Exception -> 0x0131 }
    L_0x0029:
        r3 = r13.f16092b;	 Catch:{ Exception -> 0x0131 }
        r3 = r3.isEmpty();	 Catch:{ Exception -> 0x0131 }
        if (r3 != 0) goto L_0x0034;	 Catch:{ Exception -> 0x0131 }
    L_0x0031:
        r3 = r13.f16092b;	 Catch:{ Exception -> 0x0131 }
        goto L_0x005c;	 Catch:{ Exception -> 0x0131 }
    L_0x0034:
        r3 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r1);	 Catch:{ Exception -> 0x0131 }
        if (r3 != 0) goto L_0x0049;	 Catch:{ Exception -> 0x0131 }
    L_0x003a:
        r3 = "";	 Catch:{ Exception -> 0x0131 }
        r7 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x0131 }
        r8 = new java.lang.String[r5];	 Catch:{ Exception -> 0x0131 }
        r8[r6] = r1;	 Catch:{ Exception -> 0x0131 }
        r7.<init>(r8, r5, r6);	 Catch:{ Exception -> 0x0131 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r7);	 Catch:{ Exception -> 0x0131 }
        goto L_0x005c;	 Catch:{ Exception -> 0x0131 }
    L_0x0049:
        r7 = r3.f9422h;	 Catch:{ Exception -> 0x0131 }
        if (r7 == 0) goto L_0x0056;	 Catch:{ Exception -> 0x0131 }
    L_0x004d:
        r7 = r3.f9425k;	 Catch:{ Exception -> 0x0131 }
        r3 = r3.f9420f;	 Catch:{ Exception -> 0x0131 }
        r3 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r7, r3);	 Catch:{ Exception -> 0x0131 }
        goto L_0x005c;	 Catch:{ Exception -> 0x0131 }
    L_0x0056:
        r3 = r3.f9416b;	 Catch:{ Exception -> 0x0131 }
        r3 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r3);	 Catch:{ Exception -> 0x0131 }
    L_0x005c:
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x0131 }
        if (r0 == 0) goto L_0x0067;	 Catch:{ Exception -> 0x0131 }
    L_0x0062:
        r13 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r4);	 Catch:{ Exception -> 0x0131 }
        goto L_0x009e;	 Catch:{ Exception -> 0x0131 }
    L_0x0067:
        r0 = r13.f16094d;	 Catch:{ Exception -> 0x0131 }
        if (r0 == 0) goto L_0x0076;	 Catch:{ Exception -> 0x0131 }
    L_0x006b:
        r0 = r13.f16094d;	 Catch:{ Exception -> 0x0131 }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x0131 }
        if (r0 != 0) goto L_0x0076;	 Catch:{ Exception -> 0x0131 }
    L_0x0073:
        r13 = r13.f16094d;	 Catch:{ Exception -> 0x0131 }
        goto L_0x009e;	 Catch:{ Exception -> 0x0131 }
    L_0x0076:
        r13 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);	 Catch:{ Exception -> 0x0131 }
        if (r13 != 0) goto L_0x008b;	 Catch:{ Exception -> 0x0131 }
    L_0x007c:
        r13 = "";	 Catch:{ Exception -> 0x0131 }
        r0 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x0131 }
        r4 = new java.lang.String[r5];	 Catch:{ Exception -> 0x0131 }
        r4[r6] = r2;	 Catch:{ Exception -> 0x0131 }
        r0.<init>(r4, r5, r6);	 Catch:{ Exception -> 0x0131 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r0);	 Catch:{ Exception -> 0x0131 }
        goto L_0x009e;	 Catch:{ Exception -> 0x0131 }
    L_0x008b:
        r0 = r13.f9422h;	 Catch:{ Exception -> 0x0131 }
        if (r0 == 0) goto L_0x0098;	 Catch:{ Exception -> 0x0131 }
    L_0x008f:
        r0 = r13.f9425k;	 Catch:{ Exception -> 0x0131 }
        r13 = r13.f9420f;	 Catch:{ Exception -> 0x0131 }
        r13 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r0, r13);	 Catch:{ Exception -> 0x0131 }
        goto L_0x009e;	 Catch:{ Exception -> 0x0131 }
    L_0x0098:
        r13 = r13.f9416b;	 Catch:{ Exception -> 0x0131 }
        r13 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r13);	 Catch:{ Exception -> 0x0131 }
    L_0x009e:
        if (r3 != 0) goto L_0x00a2;	 Catch:{ Exception -> 0x0131 }
    L_0x00a0:
        r3 = "";	 Catch:{ Exception -> 0x0131 }
    L_0x00a2:
        if (r13 != 0) goto L_0x00a6;	 Catch:{ Exception -> 0x0131 }
    L_0x00a4:
        r13 = "";	 Catch:{ Exception -> 0x0131 }
    L_0x00a6:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0131 }
        r0.<init>();	 Catch:{ Exception -> 0x0131 }
        r12 = mobi.mmdt.ott.view.tools.C4532q.m8243a(r12);	 Catch:{ Exception -> 0x0131 }
        r0.append(r12);	 Catch:{ Exception -> 0x0131 }
        r12 = 2131690013; // 0x7f0f021d float:1.9009058E38 double:1.053194803E-314;	 Catch:{ Exception -> 0x0131 }
        r12 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r12);	 Catch:{ Exception -> 0x0131 }
        r4 = 2;	 Catch:{ Exception -> 0x0131 }
        r7 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0131 }
        r7[r6] = r13;	 Catch:{ Exception -> 0x0131 }
        r7[r5] = r3;	 Catch:{ Exception -> 0x0131 }
        r12 = java.lang.String.format(r12, r7);	 Catch:{ Exception -> 0x0131 }
        r0.append(r12);	 Catch:{ Exception -> 0x0131 }
        r12 = r0.toString();	 Catch:{ Exception -> 0x0131 }
        r0 = java.util.regex.Pattern.quote(r3);	 Catch:{ Exception -> 0x0131 }
        r0 = r12.split(r0);	 Catch:{ Exception -> 0x0131 }
        r7 = r0.length;	 Catch:{ Exception -> 0x0131 }
        r8 = 0;	 Catch:{ Exception -> 0x0131 }
        if (r7 != r4) goto L_0x00dc;	 Catch:{ Exception -> 0x0131 }
    L_0x00d7:
        r7 = r0[r6];	 Catch:{ Exception -> 0x0131 }
        r0 = r0[r5];	 Catch:{ Exception -> 0x0131 }
        goto L_0x00de;	 Catch:{ Exception -> 0x0131 }
    L_0x00dc:
        r0 = r8;	 Catch:{ Exception -> 0x0131 }
        r7 = r0;	 Catch:{ Exception -> 0x0131 }
    L_0x00de:
        r9 = java.util.regex.Pattern.quote(r13);	 Catch:{ Exception -> 0x0131 }
        r9 = r12.split(r9);	 Catch:{ Exception -> 0x0131 }
        r10 = r9.length;	 Catch:{ Exception -> 0x0131 }
        if (r10 != r4) goto L_0x00ee;	 Catch:{ Exception -> 0x0131 }
    L_0x00e9:
        r8 = r9[r6];	 Catch:{ Exception -> 0x0131 }
        r4 = r9[r5];	 Catch:{ Exception -> 0x0131 }
        goto L_0x00ef;	 Catch:{ Exception -> 0x0131 }
    L_0x00ee:
        r4 = r8;	 Catch:{ Exception -> 0x0131 }
    L_0x00ef:
        r9 = new android.text.SpannableString;	 Catch:{ Exception -> 0x0131 }
        r9.<init>(r12);	 Catch:{ Exception -> 0x0131 }
        r12 = new mobi.mmdt.ott.view.tools.q$11;	 Catch:{ Exception -> 0x0131 }
        r12.<init>(r1, r11);	 Catch:{ Exception -> 0x0131 }
        r1 = new mobi.mmdt.ott.view.tools.q$12;	 Catch:{ Exception -> 0x0131 }
        r1.<init>(r2, r11);	 Catch:{ Exception -> 0x0131 }
        r11 = 33;	 Catch:{ Exception -> 0x0131 }
        if (r7 == 0) goto L_0x0114;	 Catch:{ Exception -> 0x0131 }
    L_0x0102:
        if (r0 == 0) goto L_0x0114;	 Catch:{ Exception -> 0x0131 }
    L_0x0104:
        r0 = r7.length();	 Catch:{ Exception -> 0x0131 }
        r2 = r7.length();	 Catch:{ Exception -> 0x0131 }
        r3 = r3.length();	 Catch:{ Exception -> 0x0131 }
        r2 = r2 + r3;	 Catch:{ Exception -> 0x0131 }
        r9.setSpan(r12, r0, r2, r11);	 Catch:{ Exception -> 0x0131 }
    L_0x0114:
        if (r8 == 0) goto L_0x0128;	 Catch:{ Exception -> 0x0131 }
    L_0x0116:
        if (r4 == 0) goto L_0x0128;	 Catch:{ Exception -> 0x0131 }
    L_0x0118:
        r12 = r8.length();	 Catch:{ Exception -> 0x0131 }
        r0 = r8.length();	 Catch:{ Exception -> 0x0131 }
        r13 = r13.length();	 Catch:{ Exception -> 0x0131 }
        r0 = r0 + r13;	 Catch:{ Exception -> 0x0131 }
        r9.setSpan(r1, r12, r0, r11);	 Catch:{ Exception -> 0x0131 }
    L_0x0128:
        r12 = new android.text.style.ForegroundColorSpan;	 Catch:{ Exception -> 0x0131 }
        r12.<init>(r6);	 Catch:{ Exception -> 0x0131 }
        r9.setSpan(r12, r6, r5, r11);	 Catch:{ Exception -> 0x0131 }
        return r9;
    L_0x0131:
        r11 = 2131690173; // 0x7f0f02bd float:1.9009382E38 double:1.053194882E-314;
        r11 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r11);
        r12 = new android.text.SpannableString;
        r12.<init>(r11);
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.c(android.app.Activity, java.lang.String, java.lang.String):android.text.SpannableString");
    }

    public static java.lang.String m8247c(android.content.Context r6, java.lang.String r7) {
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
        r0 = 2131690586; // 0x7f0f045a float:1.901022E38 double:1.053195086E-314;
        r1 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x0070 }
        r1.<init>(r7);	 Catch:{ Exception -> 0x0070 }
        r7 = r1.f8582b;	 Catch:{ Exception -> 0x0070 }
        r7 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5930c) r7;	 Catch:{ Exception -> 0x0070 }
        r1 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x0070 }
        r1 = r1.m6928d();	 Catch:{ Exception -> 0x0070 }
        if (r7 == 0) goto L_0x006b;	 Catch:{ Exception -> 0x0070 }
    L_0x0016:
        r2 = r7.f16085a;	 Catch:{ Exception -> 0x0070 }
        r1 = r2.equals(r1);	 Catch:{ Exception -> 0x0070 }
        r3 = 0;	 Catch:{ Exception -> 0x0070 }
        r4 = 1;	 Catch:{ Exception -> 0x0070 }
        if (r1 == 0) goto L_0x0028;	 Catch:{ Exception -> 0x0070 }
    L_0x0020:
        r7 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x0070 }
        r7 = r6.getString(r7);	 Catch:{ Exception -> 0x0070 }
        goto L_0x005f;	 Catch:{ Exception -> 0x0070 }
    L_0x0028:
        r1 = r7.f16086b;	 Catch:{ Exception -> 0x0070 }
        if (r1 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x0070 }
    L_0x002c:
        r1 = r7.f16086b;	 Catch:{ Exception -> 0x0070 }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x0070 }
        if (r1 != 0) goto L_0x0037;	 Catch:{ Exception -> 0x0070 }
    L_0x0034:
        r7 = r7.f16086b;	 Catch:{ Exception -> 0x0070 }
        goto L_0x005f;	 Catch:{ Exception -> 0x0070 }
    L_0x0037:
        r7 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);	 Catch:{ Exception -> 0x0070 }
        if (r7 != 0) goto L_0x004c;	 Catch:{ Exception -> 0x0070 }
    L_0x003d:
        r7 = "";	 Catch:{ Exception -> 0x0070 }
        r1 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x0070 }
        r5 = new java.lang.String[r4];	 Catch:{ Exception -> 0x0070 }
        r5[r3] = r2;	 Catch:{ Exception -> 0x0070 }
        r1.<init>(r5, r4, r3);	 Catch:{ Exception -> 0x0070 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r1);	 Catch:{ Exception -> 0x0070 }
        goto L_0x005f;	 Catch:{ Exception -> 0x0070 }
    L_0x004c:
        r1 = r7.f9422h;	 Catch:{ Exception -> 0x0070 }
        if (r1 == 0) goto L_0x0059;	 Catch:{ Exception -> 0x0070 }
    L_0x0050:
        r1 = r7.f9425k;	 Catch:{ Exception -> 0x0070 }
        r7 = r7.f9420f;	 Catch:{ Exception -> 0x0070 }
        r7 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r1, r7);	 Catch:{ Exception -> 0x0070 }
        goto L_0x005f;	 Catch:{ Exception -> 0x0070 }
    L_0x0059:
        r7 = r7.f9416b;	 Catch:{ Exception -> 0x0070 }
        r7 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r7);	 Catch:{ Exception -> 0x0070 }
    L_0x005f:
        r1 = 2131690012; // 0x7f0f021c float:1.9009056E38 double:1.0531948025E-314;	 Catch:{ Exception -> 0x0070 }
        r2 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0070 }
        r2[r3] = r7;	 Catch:{ Exception -> 0x0070 }
        r7 = r6.getString(r1, r2);	 Catch:{ Exception -> 0x0070 }
        return r7;	 Catch:{ Exception -> 0x0070 }
    L_0x006b:
        r7 = r6.getString(r0);	 Catch:{ Exception -> 0x0070 }
        return r7;
    L_0x0070:
        r6 = r6.getString(r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.c(android.content.Context, java.lang.String):java.lang.String");
    }

    public static android.text.SpannableString m8248d(final android.app.Activity r7, java.lang.String r8, java.lang.String r9) {
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
        r0 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x00bc }
        r0.<init>(r9);	 Catch:{ Exception -> 0x00bc }
        r9 = r0.f8582b;	 Catch:{ Exception -> 0x00bc }
        r9 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5931d) r9;	 Catch:{ Exception -> 0x00bc }
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x00bc }
        r0 = r0.m6928d();	 Catch:{ Exception -> 0x00bc }
        r1 = r9.f16088a;	 Catch:{ Exception -> 0x00bc }
        r0 = r1.equals(r0);	 Catch:{ Exception -> 0x00bc }
        r2 = 1;	 Catch:{ Exception -> 0x00bc }
        r3 = 0;	 Catch:{ Exception -> 0x00bc }
        if (r0 == 0) goto L_0x0023;	 Catch:{ Exception -> 0x00bc }
    L_0x001b:
        r9 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x00bc }
        r9 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);	 Catch:{ Exception -> 0x00bc }
        goto L_0x005a;	 Catch:{ Exception -> 0x00bc }
    L_0x0023:
        r0 = r9.f16089b;	 Catch:{ Exception -> 0x00bc }
        if (r0 == 0) goto L_0x0032;	 Catch:{ Exception -> 0x00bc }
    L_0x0027:
        r0 = r9.f16089b;	 Catch:{ Exception -> 0x00bc }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x00bc }
        if (r0 != 0) goto L_0x0032;	 Catch:{ Exception -> 0x00bc }
    L_0x002f:
        r9 = r9.f16089b;	 Catch:{ Exception -> 0x00bc }
        goto L_0x005a;	 Catch:{ Exception -> 0x00bc }
    L_0x0032:
        r9 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r1);	 Catch:{ Exception -> 0x00bc }
        if (r9 != 0) goto L_0x0047;	 Catch:{ Exception -> 0x00bc }
    L_0x0038:
        r9 = "";	 Catch:{ Exception -> 0x00bc }
        r0 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x00bc }
        r4 = new java.lang.String[r2];	 Catch:{ Exception -> 0x00bc }
        r4[r3] = r1;	 Catch:{ Exception -> 0x00bc }
        r0.<init>(r4, r2, r3);	 Catch:{ Exception -> 0x00bc }
        mobi.mmdt.ott.logic.C2808d.m7148b(r0);	 Catch:{ Exception -> 0x00bc }
        goto L_0x005a;	 Catch:{ Exception -> 0x00bc }
    L_0x0047:
        r0 = r9.f9422h;	 Catch:{ Exception -> 0x00bc }
        if (r0 == 0) goto L_0x0054;	 Catch:{ Exception -> 0x00bc }
    L_0x004b:
        r0 = r9.f9425k;	 Catch:{ Exception -> 0x00bc }
        r9 = r9.f9420f;	 Catch:{ Exception -> 0x00bc }
        r9 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r0, r9);	 Catch:{ Exception -> 0x00bc }
        goto L_0x005a;	 Catch:{ Exception -> 0x00bc }
    L_0x0054:
        r9 = r9.f9416b;	 Catch:{ Exception -> 0x00bc }
        r9 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r9);	 Catch:{ Exception -> 0x00bc }
    L_0x005a:
        if (r9 != 0) goto L_0x005e;	 Catch:{ Exception -> 0x00bc }
    L_0x005c:
        r9 = "";	 Catch:{ Exception -> 0x00bc }
    L_0x005e:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00bc }
        r0.<init>();	 Catch:{ Exception -> 0x00bc }
        r8 = mobi.mmdt.ott.view.tools.C4532q.m8243a(r8);	 Catch:{ Exception -> 0x00bc }
        r0.append(r8);	 Catch:{ Exception -> 0x00bc }
        r8 = 2131690014; // 0x7f0f021e float:1.900906E38 double:1.0531948035E-314;	 Catch:{ Exception -> 0x00bc }
        r8 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);	 Catch:{ Exception -> 0x00bc }
        r4 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x00bc }
        r4[r3] = r9;	 Catch:{ Exception -> 0x00bc }
        r8 = java.lang.String.format(r8, r4);	 Catch:{ Exception -> 0x00bc }
        r0.append(r8);	 Catch:{ Exception -> 0x00bc }
        r8 = r0.toString();	 Catch:{ Exception -> 0x00bc }
        r0 = java.util.regex.Pattern.quote(r9);	 Catch:{ Exception -> 0x00bc }
        r0 = r8.split(r0);	 Catch:{ Exception -> 0x00bc }
        r4 = r0.length;	 Catch:{ Exception -> 0x00bc }
        r5 = 2;	 Catch:{ Exception -> 0x00bc }
        r6 = 0;	 Catch:{ Exception -> 0x00bc }
        if (r4 != r5) goto L_0x0092;	 Catch:{ Exception -> 0x00bc }
    L_0x008d:
        r6 = r0[r3];	 Catch:{ Exception -> 0x00bc }
        r0 = r0[r2];	 Catch:{ Exception -> 0x00bc }
        goto L_0x0093;	 Catch:{ Exception -> 0x00bc }
    L_0x0092:
        r0 = r6;	 Catch:{ Exception -> 0x00bc }
    L_0x0093:
        r4 = new android.text.SpannableString;	 Catch:{ Exception -> 0x00bc }
        r4.<init>(r8);	 Catch:{ Exception -> 0x00bc }
        r8 = new mobi.mmdt.ott.view.tools.q$13;	 Catch:{ Exception -> 0x00bc }
        r8.<init>(r1, r7);	 Catch:{ Exception -> 0x00bc }
        r7 = 33;	 Catch:{ Exception -> 0x00bc }
        if (r6 == 0) goto L_0x00b3;	 Catch:{ Exception -> 0x00bc }
    L_0x00a1:
        if (r0 == 0) goto L_0x00b3;	 Catch:{ Exception -> 0x00bc }
    L_0x00a3:
        r0 = r6.length();	 Catch:{ Exception -> 0x00bc }
        r1 = r6.length();	 Catch:{ Exception -> 0x00bc }
        r9 = r9.length();	 Catch:{ Exception -> 0x00bc }
        r1 = r1 + r9;	 Catch:{ Exception -> 0x00bc }
        r4.setSpan(r8, r0, r1, r7);	 Catch:{ Exception -> 0x00bc }
    L_0x00b3:
        r8 = new android.text.style.ForegroundColorSpan;	 Catch:{ Exception -> 0x00bc }
        r8.<init>(r3);	 Catch:{ Exception -> 0x00bc }
        r4.setSpan(r8, r3, r2, r7);	 Catch:{ Exception -> 0x00bc }
        return r4;
    L_0x00bc:
        r7 = 2131690173; // 0x7f0f02bd float:1.9009382E38 double:1.053194882E-314;
        r7 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r7);
        r8 = new android.text.SpannableString;
        r8.<init>(r7);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.d(android.app.Activity, java.lang.String, java.lang.String):android.text.SpannableString");
    }

    public static java.lang.String m8249d(android.content.Context r10, java.lang.String r11) {
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
        r0 = 2131690173; // 0x7f0f02bd float:1.9009382E38 double:1.053194882E-314;
        r1 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x00bc }
        r1.<init>(r11);	 Catch:{ Exception -> 0x00bc }
        r11 = r1.f8582b;	 Catch:{ Exception -> 0x00bc }
        r11 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5932e) r11;	 Catch:{ Exception -> 0x00bc }
        r1 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x00bc }
        r1 = r1.m6928d();	 Catch:{ Exception -> 0x00bc }
        if (r11 == 0) goto L_0x00b7;	 Catch:{ Exception -> 0x00bc }
    L_0x0016:
        r2 = r11.f16091a;	 Catch:{ Exception -> 0x00bc }
        r3 = r11.f16093c;	 Catch:{ Exception -> 0x00bc }
        r4 = r2.equals(r1);	 Catch:{ Exception -> 0x00bc }
        r5 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x00bc }
        r6 = 0;	 Catch:{ Exception -> 0x00bc }
        r7 = 1;	 Catch:{ Exception -> 0x00bc }
        if (r4 == 0) goto L_0x002a;	 Catch:{ Exception -> 0x00bc }
    L_0x0025:
        r2 = r10.getString(r5);	 Catch:{ Exception -> 0x00bc }
        goto L_0x0062;	 Catch:{ Exception -> 0x00bc }
    L_0x002a:
        r4 = r11.f16092b;	 Catch:{ Exception -> 0x00bc }
        if (r4 == 0) goto L_0x0039;	 Catch:{ Exception -> 0x00bc }
    L_0x002e:
        r4 = r11.f16092b;	 Catch:{ Exception -> 0x00bc }
        r4 = r4.isEmpty();	 Catch:{ Exception -> 0x00bc }
        if (r4 != 0) goto L_0x0039;	 Catch:{ Exception -> 0x00bc }
    L_0x0036:
        r2 = r11.f16092b;	 Catch:{ Exception -> 0x00bc }
        goto L_0x0062;	 Catch:{ Exception -> 0x00bc }
    L_0x0039:
        r4 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);	 Catch:{ Exception -> 0x00bc }
        if (r4 != 0) goto L_0x004f;	 Catch:{ Exception -> 0x00bc }
    L_0x003f:
        r4 = "";	 Catch:{ Exception -> 0x00bc }
        r8 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x00bc }
        r9 = new java.lang.String[r7];	 Catch:{ Exception -> 0x00bc }
        r9[r6] = r2;	 Catch:{ Exception -> 0x00bc }
        r8.<init>(r9, r7, r6);	 Catch:{ Exception -> 0x00bc }
        mobi.mmdt.ott.logic.C2808d.m7148b(r8);	 Catch:{ Exception -> 0x00bc }
        r2 = r4;	 Catch:{ Exception -> 0x00bc }
        goto L_0x0062;	 Catch:{ Exception -> 0x00bc }
    L_0x004f:
        r2 = r4.f9422h;	 Catch:{ Exception -> 0x00bc }
        if (r2 == 0) goto L_0x005c;	 Catch:{ Exception -> 0x00bc }
    L_0x0053:
        r2 = r4.f9425k;	 Catch:{ Exception -> 0x00bc }
        r4 = r4.f9420f;	 Catch:{ Exception -> 0x00bc }
        r2 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r2, r4);	 Catch:{ Exception -> 0x00bc }
        goto L_0x0062;	 Catch:{ Exception -> 0x00bc }
    L_0x005c:
        r2 = r4.f9416b;	 Catch:{ Exception -> 0x00bc }
        r2 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r2);	 Catch:{ Exception -> 0x00bc }
    L_0x0062:
        r1 = r3.equals(r1);	 Catch:{ Exception -> 0x00bc }
        if (r1 == 0) goto L_0x006d;	 Catch:{ Exception -> 0x00bc }
    L_0x0068:
        r11 = r10.getString(r5);	 Catch:{ Exception -> 0x00bc }
        goto L_0x00a4;	 Catch:{ Exception -> 0x00bc }
    L_0x006d:
        r1 = r11.f16094d;	 Catch:{ Exception -> 0x00bc }
        if (r1 == 0) goto L_0x007c;	 Catch:{ Exception -> 0x00bc }
    L_0x0071:
        r1 = r11.f16094d;	 Catch:{ Exception -> 0x00bc }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x00bc }
        if (r1 != 0) goto L_0x007c;	 Catch:{ Exception -> 0x00bc }
    L_0x0079:
        r11 = r11.f16094d;	 Catch:{ Exception -> 0x00bc }
        goto L_0x00a4;	 Catch:{ Exception -> 0x00bc }
    L_0x007c:
        r11 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r3);	 Catch:{ Exception -> 0x00bc }
        if (r11 != 0) goto L_0x0091;	 Catch:{ Exception -> 0x00bc }
    L_0x0082:
        r11 = "";	 Catch:{ Exception -> 0x00bc }
        r1 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x00bc }
        r4 = new java.lang.String[r7];	 Catch:{ Exception -> 0x00bc }
        r4[r6] = r3;	 Catch:{ Exception -> 0x00bc }
        r1.<init>(r4, r7, r6);	 Catch:{ Exception -> 0x00bc }
        mobi.mmdt.ott.logic.C2808d.m7148b(r1);	 Catch:{ Exception -> 0x00bc }
        goto L_0x00a4;	 Catch:{ Exception -> 0x00bc }
    L_0x0091:
        r1 = r11.f9422h;	 Catch:{ Exception -> 0x00bc }
        if (r1 == 0) goto L_0x009e;	 Catch:{ Exception -> 0x00bc }
    L_0x0095:
        r1 = r11.f9425k;	 Catch:{ Exception -> 0x00bc }
        r11 = r11.f9420f;	 Catch:{ Exception -> 0x00bc }
        r11 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r1, r11);	 Catch:{ Exception -> 0x00bc }
        goto L_0x00a4;	 Catch:{ Exception -> 0x00bc }
    L_0x009e:
        r11 = r11.f9416b;	 Catch:{ Exception -> 0x00bc }
        r11 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r11);	 Catch:{ Exception -> 0x00bc }
    L_0x00a4:
        r1 = 2131690013; // 0x7f0f021d float:1.9009058E38 double:1.053194803E-314;	 Catch:{ Exception -> 0x00bc }
        r1 = r10.getString(r1);	 Catch:{ Exception -> 0x00bc }
        r3 = 2;	 Catch:{ Exception -> 0x00bc }
        r3 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x00bc }
        r3[r6] = r11;	 Catch:{ Exception -> 0x00bc }
        r3[r7] = r2;	 Catch:{ Exception -> 0x00bc }
        r11 = java.lang.String.format(r1, r3);	 Catch:{ Exception -> 0x00bc }
        return r11;	 Catch:{ Exception -> 0x00bc }
    L_0x00b7:
        r11 = r10.getString(r0);	 Catch:{ Exception -> 0x00bc }
        return r11;
    L_0x00bc:
        r10 = r10.getString(r0);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.d(android.content.Context, java.lang.String):java.lang.String");
    }

    public static android.text.SpannableString m8250e(final android.app.Activity r7, java.lang.String r8, java.lang.String r9) {
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
        r0 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x00c3 }
        r0.<init>(r9);	 Catch:{ Exception -> 0x00c3 }
        r9 = r0.f8582b;	 Catch:{ Exception -> 0x00c3 }
        r9 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5933f) r9;	 Catch:{ Exception -> 0x00c3 }
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x00c3 }
        r0 = r0.m6928d();	 Catch:{ Exception -> 0x00c3 }
        r1 = r9.f16096a;	 Catch:{ Exception -> 0x00c3 }
        r0 = r1.equals(r0);	 Catch:{ Exception -> 0x00c3 }
        r2 = 1;	 Catch:{ Exception -> 0x00c3 }
        r3 = 0;	 Catch:{ Exception -> 0x00c3 }
        if (r0 == 0) goto L_0x002a;	 Catch:{ Exception -> 0x00c3 }
    L_0x001b:
        r9 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x00c3 }
        r9 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r9);	 Catch:{ Exception -> 0x00c3 }
        r0 = 2131690588; // 0x7f0f045c float:1.9010224E38 double:1.053195087E-314;	 Catch:{ Exception -> 0x00c3 }
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);	 Catch:{ Exception -> 0x00c3 }
        goto L_0x0068;	 Catch:{ Exception -> 0x00c3 }
    L_0x002a:
        r0 = 2131690016; // 0x7f0f0220 float:1.9009064E38 double:1.0531948045E-314;	 Catch:{ Exception -> 0x00c3 }
        r0 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r0);	 Catch:{ Exception -> 0x00c3 }
        r4 = r9.f16097b;	 Catch:{ Exception -> 0x00c3 }
        if (r4 == 0) goto L_0x0040;	 Catch:{ Exception -> 0x00c3 }
    L_0x0035:
        r4 = r9.f16097b;	 Catch:{ Exception -> 0x00c3 }
        r4 = r4.isEmpty();	 Catch:{ Exception -> 0x00c3 }
        if (r4 != 0) goto L_0x0040;	 Catch:{ Exception -> 0x00c3 }
    L_0x003d:
        r9 = r9.f16097b;	 Catch:{ Exception -> 0x00c3 }
        goto L_0x0068;	 Catch:{ Exception -> 0x00c3 }
    L_0x0040:
        r9 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r1);	 Catch:{ Exception -> 0x00c3 }
        if (r9 != 0) goto L_0x0055;	 Catch:{ Exception -> 0x00c3 }
    L_0x0046:
        r9 = "";	 Catch:{ Exception -> 0x00c3 }
        r4 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x00c3 }
        r5 = new java.lang.String[r2];	 Catch:{ Exception -> 0x00c3 }
        r5[r3] = r1;	 Catch:{ Exception -> 0x00c3 }
        r4.<init>(r5, r2, r3);	 Catch:{ Exception -> 0x00c3 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r4);	 Catch:{ Exception -> 0x00c3 }
        goto L_0x0068;	 Catch:{ Exception -> 0x00c3 }
    L_0x0055:
        r4 = r9.f9422h;	 Catch:{ Exception -> 0x00c3 }
        if (r4 == 0) goto L_0x0062;	 Catch:{ Exception -> 0x00c3 }
    L_0x0059:
        r4 = r9.f9425k;	 Catch:{ Exception -> 0x00c3 }
        r9 = r9.f9420f;	 Catch:{ Exception -> 0x00c3 }
        r9 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r4, r9);	 Catch:{ Exception -> 0x00c3 }
        goto L_0x0068;	 Catch:{ Exception -> 0x00c3 }
    L_0x0062:
        r9 = r9.f9416b;	 Catch:{ Exception -> 0x00c3 }
        r9 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r9);	 Catch:{ Exception -> 0x00c3 }
    L_0x0068:
        if (r9 != 0) goto L_0x006c;	 Catch:{ Exception -> 0x00c3 }
    L_0x006a:
        r9 = "";	 Catch:{ Exception -> 0x00c3 }
    L_0x006c:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c3 }
        r4.<init>();	 Catch:{ Exception -> 0x00c3 }
        r8 = mobi.mmdt.ott.view.tools.C4532q.m8243a(r8);	 Catch:{ Exception -> 0x00c3 }
        r4.append(r8);	 Catch:{ Exception -> 0x00c3 }
        r8 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x00c3 }
        r8[r3] = r9;	 Catch:{ Exception -> 0x00c3 }
        r8 = java.lang.String.format(r0, r8);	 Catch:{ Exception -> 0x00c3 }
        r4.append(r8);	 Catch:{ Exception -> 0x00c3 }
        r8 = r4.toString();	 Catch:{ Exception -> 0x00c3 }
        r0 = java.util.regex.Pattern.quote(r9);	 Catch:{ Exception -> 0x00c3 }
        r0 = r8.split(r0);	 Catch:{ Exception -> 0x00c3 }
        r4 = r0.length;	 Catch:{ Exception -> 0x00c3 }
        r5 = 2;	 Catch:{ Exception -> 0x00c3 }
        r6 = 0;	 Catch:{ Exception -> 0x00c3 }
        if (r4 != r5) goto L_0x0099;	 Catch:{ Exception -> 0x00c3 }
    L_0x0094:
        r6 = r0[r3];	 Catch:{ Exception -> 0x00c3 }
        r0 = r0[r2];	 Catch:{ Exception -> 0x00c3 }
        goto L_0x009a;	 Catch:{ Exception -> 0x00c3 }
    L_0x0099:
        r0 = r6;	 Catch:{ Exception -> 0x00c3 }
    L_0x009a:
        r4 = new android.text.SpannableString;	 Catch:{ Exception -> 0x00c3 }
        r4.<init>(r8);	 Catch:{ Exception -> 0x00c3 }
        r8 = new mobi.mmdt.ott.view.tools.q$14;	 Catch:{ Exception -> 0x00c3 }
        r8.<init>(r1, r7);	 Catch:{ Exception -> 0x00c3 }
        r7 = 33;	 Catch:{ Exception -> 0x00c3 }
        if (r6 == 0) goto L_0x00ba;	 Catch:{ Exception -> 0x00c3 }
    L_0x00a8:
        if (r0 == 0) goto L_0x00ba;	 Catch:{ Exception -> 0x00c3 }
    L_0x00aa:
        r0 = r6.length();	 Catch:{ Exception -> 0x00c3 }
        r1 = r6.length();	 Catch:{ Exception -> 0x00c3 }
        r9 = r9.length();	 Catch:{ Exception -> 0x00c3 }
        r1 = r1 + r9;	 Catch:{ Exception -> 0x00c3 }
        r4.setSpan(r8, r0, r1, r7);	 Catch:{ Exception -> 0x00c3 }
    L_0x00ba:
        r8 = new android.text.style.ForegroundColorSpan;	 Catch:{ Exception -> 0x00c3 }
        r8.<init>(r3);	 Catch:{ Exception -> 0x00c3 }
        r4.setSpan(r8, r3, r2, r7);	 Catch:{ Exception -> 0x00c3 }
        return r4;
    L_0x00c3:
        r7 = 2131690419; // 0x7f0f03b3 float:1.9009881E38 double:1.0531950036E-314;
        r7 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r7);
        r8 = new android.text.SpannableString;
        r8.<init>(r7);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.e(android.app.Activity, java.lang.String, java.lang.String):android.text.SpannableString");
    }

    public static java.lang.String m8251e(android.content.Context r6, java.lang.String r7) {
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
        r0 = 2131690173; // 0x7f0f02bd float:1.9009382E38 double:1.053194882E-314;
        r1 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x0074 }
        r1.<init>(r7);	 Catch:{ Exception -> 0x0074 }
        r7 = r1.f8582b;	 Catch:{ Exception -> 0x0074 }
        r7 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5931d) r7;	 Catch:{ Exception -> 0x0074 }
        r1 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x0074 }
        r1 = r1.m6928d();	 Catch:{ Exception -> 0x0074 }
        if (r7 == 0) goto L_0x006f;	 Catch:{ Exception -> 0x0074 }
    L_0x0016:
        r2 = r7.f16088a;	 Catch:{ Exception -> 0x0074 }
        r1 = r2.equals(r1);	 Catch:{ Exception -> 0x0074 }
        r3 = 0;	 Catch:{ Exception -> 0x0074 }
        r4 = 1;	 Catch:{ Exception -> 0x0074 }
        if (r1 == 0) goto L_0x0028;	 Catch:{ Exception -> 0x0074 }
    L_0x0020:
        r7 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x0074 }
        r7 = r6.getString(r7);	 Catch:{ Exception -> 0x0074 }
        goto L_0x005f;	 Catch:{ Exception -> 0x0074 }
    L_0x0028:
        r1 = r7.f16089b;	 Catch:{ Exception -> 0x0074 }
        if (r1 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x0074 }
    L_0x002c:
        r1 = r7.f16089b;	 Catch:{ Exception -> 0x0074 }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x0074 }
        if (r1 != 0) goto L_0x0037;	 Catch:{ Exception -> 0x0074 }
    L_0x0034:
        r7 = r7.f16089b;	 Catch:{ Exception -> 0x0074 }
        goto L_0x005f;	 Catch:{ Exception -> 0x0074 }
    L_0x0037:
        r7 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);	 Catch:{ Exception -> 0x0074 }
        if (r7 != 0) goto L_0x004c;	 Catch:{ Exception -> 0x0074 }
    L_0x003d:
        r7 = "";	 Catch:{ Exception -> 0x0074 }
        r1 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x0074 }
        r5 = new java.lang.String[r4];	 Catch:{ Exception -> 0x0074 }
        r5[r3] = r2;	 Catch:{ Exception -> 0x0074 }
        r1.<init>(r5, r4, r3);	 Catch:{ Exception -> 0x0074 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r1);	 Catch:{ Exception -> 0x0074 }
        goto L_0x005f;	 Catch:{ Exception -> 0x0074 }
    L_0x004c:
        r1 = r7.f9422h;	 Catch:{ Exception -> 0x0074 }
        if (r1 == 0) goto L_0x0059;	 Catch:{ Exception -> 0x0074 }
    L_0x0050:
        r1 = r7.f9425k;	 Catch:{ Exception -> 0x0074 }
        r7 = r7.f9420f;	 Catch:{ Exception -> 0x0074 }
        r7 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r1, r7);	 Catch:{ Exception -> 0x0074 }
        goto L_0x005f;	 Catch:{ Exception -> 0x0074 }
    L_0x0059:
        r7 = r7.f9416b;	 Catch:{ Exception -> 0x0074 }
        r7 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r7);	 Catch:{ Exception -> 0x0074 }
    L_0x005f:
        r1 = 2131690014; // 0x7f0f021e float:1.900906E38 double:1.0531948035E-314;	 Catch:{ Exception -> 0x0074 }
        r1 = r6.getString(r1);	 Catch:{ Exception -> 0x0074 }
        r2 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0074 }
        r2[r3] = r7;	 Catch:{ Exception -> 0x0074 }
        r7 = java.lang.String.format(r1, r2);	 Catch:{ Exception -> 0x0074 }
        return r7;	 Catch:{ Exception -> 0x0074 }
    L_0x006f:
        r7 = r6.getString(r0);	 Catch:{ Exception -> 0x0074 }
        return r7;
    L_0x0074:
        r6 = r6.getString(r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.e(android.content.Context, java.lang.String):java.lang.String");
    }

    public static android.text.SpannableString m8252f(final android.app.Activity r11, java.lang.String r12, java.lang.String r13) {
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
        r0 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x0147 }
        r0.<init>(r13);	 Catch:{ Exception -> 0x0147 }
        r13 = r0.f8582b;	 Catch:{ Exception -> 0x0147 }
        r13 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5934j) r13;	 Catch:{ Exception -> 0x0147 }
        r0 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x0147 }
        r0 = r0.m6928d();	 Catch:{ Exception -> 0x0147 }
        r1 = r13.f16099a;	 Catch:{ Exception -> 0x0147 }
        r2 = r13.f16100b;	 Catch:{ Exception -> 0x0147 }
        r3 = r1.equals(r0);	 Catch:{ Exception -> 0x0147 }
        r4 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x0147 }
        r5 = 1;	 Catch:{ Exception -> 0x0147 }
        r6 = 0;	 Catch:{ Exception -> 0x0147 }
        if (r3 == 0) goto L_0x0025;	 Catch:{ Exception -> 0x0147 }
    L_0x0020:
        r3 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r4);	 Catch:{ Exception -> 0x0147 }
        goto L_0x005c;	 Catch:{ Exception -> 0x0147 }
    L_0x0025:
        r3 = r13.f16101c;	 Catch:{ Exception -> 0x0147 }
        if (r3 == 0) goto L_0x0034;	 Catch:{ Exception -> 0x0147 }
    L_0x0029:
        r3 = r13.f16101c;	 Catch:{ Exception -> 0x0147 }
        r3 = r3.isEmpty();	 Catch:{ Exception -> 0x0147 }
        if (r3 != 0) goto L_0x0034;	 Catch:{ Exception -> 0x0147 }
    L_0x0031:
        r3 = r13.f16101c;	 Catch:{ Exception -> 0x0147 }
        goto L_0x005c;	 Catch:{ Exception -> 0x0147 }
    L_0x0034:
        r3 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r1);	 Catch:{ Exception -> 0x0147 }
        if (r3 == 0) goto L_0x004e;	 Catch:{ Exception -> 0x0147 }
    L_0x003a:
        r7 = r3.f9422h;	 Catch:{ Exception -> 0x0147 }
        if (r7 == 0) goto L_0x0047;	 Catch:{ Exception -> 0x0147 }
    L_0x003e:
        r7 = r3.f9425k;	 Catch:{ Exception -> 0x0147 }
        r3 = r3.f9420f;	 Catch:{ Exception -> 0x0147 }
        r3 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r7, r3);	 Catch:{ Exception -> 0x0147 }
        goto L_0x005c;	 Catch:{ Exception -> 0x0147 }
    L_0x0047:
        r3 = r3.f9416b;	 Catch:{ Exception -> 0x0147 }
        r3 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r3);	 Catch:{ Exception -> 0x0147 }
        goto L_0x005c;	 Catch:{ Exception -> 0x0147 }
    L_0x004e:
        r3 = "";	 Catch:{ Exception -> 0x0147 }
        r7 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x0147 }
        r8 = new java.lang.String[r5];	 Catch:{ Exception -> 0x0147 }
        r8[r6] = r1;	 Catch:{ Exception -> 0x0147 }
        r7.<init>(r8, r5, r6);	 Catch:{ Exception -> 0x0147 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r7);	 Catch:{ Exception -> 0x0147 }
    L_0x005c:
        r0 = r2.equals(r0);	 Catch:{ Exception -> 0x0147 }
        r7 = 2;	 Catch:{ Exception -> 0x0147 }
        if (r0 == 0) goto L_0x008c;	 Catch:{ Exception -> 0x0147 }
    L_0x0063:
        r13 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r4);	 Catch:{ Exception -> 0x0147 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0147 }
        r0.<init>();	 Catch:{ Exception -> 0x0147 }
        r12 = mobi.mmdt.ott.view.tools.C4532q.m8243a(r12);	 Catch:{ Exception -> 0x0147 }
        r0.append(r12);	 Catch:{ Exception -> 0x0147 }
        r12 = 2131690023; // 0x7f0f0227 float:1.9009078E38 double:1.053194808E-314;	 Catch:{ Exception -> 0x0147 }
        r12 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r12);	 Catch:{ Exception -> 0x0147 }
        r4 = new java.lang.Object[r7];	 Catch:{ Exception -> 0x0147 }
        r4[r6] = r13;	 Catch:{ Exception -> 0x0147 }
        r4[r5] = r3;	 Catch:{ Exception -> 0x0147 }
        r12 = java.lang.String.format(r12, r4);	 Catch:{ Exception -> 0x0147 }
    L_0x0084:
        r0.append(r12);	 Catch:{ Exception -> 0x0147 }
        r12 = r0.toString();	 Catch:{ Exception -> 0x0147 }
        goto L_0x00e1;	 Catch:{ Exception -> 0x0147 }
    L_0x008c:
        r0 = r13.f16102d;	 Catch:{ Exception -> 0x0147 }
        if (r0 == 0) goto L_0x009b;	 Catch:{ Exception -> 0x0147 }
    L_0x0090:
        r0 = r13.f16102d;	 Catch:{ Exception -> 0x0147 }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x0147 }
        if (r0 != 0) goto L_0x009b;	 Catch:{ Exception -> 0x0147 }
    L_0x0098:
        r13 = r13.f16102d;	 Catch:{ Exception -> 0x0147 }
        goto L_0x00c3;	 Catch:{ Exception -> 0x0147 }
    L_0x009b:
        r13 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);	 Catch:{ Exception -> 0x0147 }
        if (r13 != 0) goto L_0x00b0;	 Catch:{ Exception -> 0x0147 }
    L_0x00a1:
        r13 = "";	 Catch:{ Exception -> 0x0147 }
        r0 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x0147 }
        r4 = new java.lang.String[r5];	 Catch:{ Exception -> 0x0147 }
        r4[r6] = r2;	 Catch:{ Exception -> 0x0147 }
        r0.<init>(r4, r5, r6);	 Catch:{ Exception -> 0x0147 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r0);	 Catch:{ Exception -> 0x0147 }
        goto L_0x00c3;	 Catch:{ Exception -> 0x0147 }
    L_0x00b0:
        r0 = r13.f9422h;	 Catch:{ Exception -> 0x0147 }
        if (r0 == 0) goto L_0x00bd;	 Catch:{ Exception -> 0x0147 }
    L_0x00b4:
        r0 = r13.f9425k;	 Catch:{ Exception -> 0x0147 }
        r13 = r13.f9420f;	 Catch:{ Exception -> 0x0147 }
        r13 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r0, r13);	 Catch:{ Exception -> 0x0147 }
        goto L_0x00c3;	 Catch:{ Exception -> 0x0147 }
    L_0x00bd:
        r13 = r13.f9416b;	 Catch:{ Exception -> 0x0147 }
        r13 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r13);	 Catch:{ Exception -> 0x0147 }
    L_0x00c3:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0147 }
        r0.<init>();	 Catch:{ Exception -> 0x0147 }
        r12 = mobi.mmdt.ott.view.tools.C4532q.m8243a(r12);	 Catch:{ Exception -> 0x0147 }
        r0.append(r12);	 Catch:{ Exception -> 0x0147 }
        r12 = 2131690022; // 0x7f0f0226 float:1.9009076E38 double:1.0531948075E-314;	 Catch:{ Exception -> 0x0147 }
        r12 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r12);	 Catch:{ Exception -> 0x0147 }
        r4 = new java.lang.Object[r7];	 Catch:{ Exception -> 0x0147 }
        r4[r6] = r13;	 Catch:{ Exception -> 0x0147 }
        r4[r5] = r3;	 Catch:{ Exception -> 0x0147 }
        r12 = java.lang.String.format(r12, r4);	 Catch:{ Exception -> 0x0147 }
        goto L_0x0084;	 Catch:{ Exception -> 0x0147 }
    L_0x00e1:
        r0 = java.util.regex.Pattern.quote(r3);	 Catch:{ Exception -> 0x0147 }
        r0 = r12.split(r0);	 Catch:{ Exception -> 0x0147 }
        r4 = r0.length;	 Catch:{ Exception -> 0x0147 }
        r8 = 0;	 Catch:{ Exception -> 0x0147 }
        if (r4 != r7) goto L_0x00f2;	 Catch:{ Exception -> 0x0147 }
    L_0x00ed:
        r4 = r0[r6];	 Catch:{ Exception -> 0x0147 }
        r0 = r0[r5];	 Catch:{ Exception -> 0x0147 }
        goto L_0x00f4;	 Catch:{ Exception -> 0x0147 }
    L_0x00f2:
        r0 = r8;	 Catch:{ Exception -> 0x0147 }
        r4 = r0;	 Catch:{ Exception -> 0x0147 }
    L_0x00f4:
        r9 = java.util.regex.Pattern.quote(r13);	 Catch:{ Exception -> 0x0147 }
        r9 = r12.split(r9);	 Catch:{ Exception -> 0x0147 }
        r10 = r9.length;	 Catch:{ Exception -> 0x0147 }
        if (r10 != r7) goto L_0x0104;	 Catch:{ Exception -> 0x0147 }
    L_0x00ff:
        r8 = r9[r6];	 Catch:{ Exception -> 0x0147 }
        r7 = r9[r5];	 Catch:{ Exception -> 0x0147 }
        goto L_0x0105;	 Catch:{ Exception -> 0x0147 }
    L_0x0104:
        r7 = r8;	 Catch:{ Exception -> 0x0147 }
    L_0x0105:
        r9 = new android.text.SpannableString;	 Catch:{ Exception -> 0x0147 }
        r9.<init>(r12);	 Catch:{ Exception -> 0x0147 }
        r12 = new mobi.mmdt.ott.view.tools.q$2;	 Catch:{ Exception -> 0x0147 }
        r12.<init>(r1, r11);	 Catch:{ Exception -> 0x0147 }
        r1 = new mobi.mmdt.ott.view.tools.q$3;	 Catch:{ Exception -> 0x0147 }
        r1.<init>(r2, r11);	 Catch:{ Exception -> 0x0147 }
        r11 = 33;	 Catch:{ Exception -> 0x0147 }
        if (r4 == 0) goto L_0x012a;	 Catch:{ Exception -> 0x0147 }
    L_0x0118:
        if (r0 == 0) goto L_0x012a;	 Catch:{ Exception -> 0x0147 }
    L_0x011a:
        r0 = r4.length();	 Catch:{ Exception -> 0x0147 }
        r2 = r4.length();	 Catch:{ Exception -> 0x0147 }
        r3 = r3.length();	 Catch:{ Exception -> 0x0147 }
        r2 = r2 + r3;	 Catch:{ Exception -> 0x0147 }
        r9.setSpan(r12, r0, r2, r11);	 Catch:{ Exception -> 0x0147 }
    L_0x012a:
        if (r8 == 0) goto L_0x013e;	 Catch:{ Exception -> 0x0147 }
    L_0x012c:
        if (r7 == 0) goto L_0x013e;	 Catch:{ Exception -> 0x0147 }
    L_0x012e:
        r12 = r8.length();	 Catch:{ Exception -> 0x0147 }
        r0 = r8.length();	 Catch:{ Exception -> 0x0147 }
        r13 = r13.length();	 Catch:{ Exception -> 0x0147 }
        r0 = r0 + r13;	 Catch:{ Exception -> 0x0147 }
        r9.setSpan(r1, r12, r0, r11);	 Catch:{ Exception -> 0x0147 }
    L_0x013e:
        r12 = new android.text.style.ForegroundColorSpan;	 Catch:{ Exception -> 0x0147 }
        r12.<init>(r6);	 Catch:{ Exception -> 0x0147 }
        r9.setSpan(r12, r6, r5, r11);	 Catch:{ Exception -> 0x0147 }
        return r9;
    L_0x0147:
        r11 = 2131690420; // 0x7f0f03b4 float:1.9009883E38 double:1.053195004E-314;
        r11 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r11);
        r12 = new android.text.SpannableString;
        r12.<init>(r11);
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.f(android.app.Activity, java.lang.String, java.lang.String):android.text.SpannableString");
    }

    public static java.lang.String m8253f(android.content.Context r6, java.lang.String r7) {
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
        r0 = 2131690419; // 0x7f0f03b3 float:1.9009881E38 double:1.0531950036E-314;
        r1 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x0083 }
        r1.<init>(r7);	 Catch:{ Exception -> 0x0083 }
        r7 = r1.f8582b;	 Catch:{ Exception -> 0x0083 }
        r7 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5933f) r7;	 Catch:{ Exception -> 0x0083 }
        r1 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x0083 }
        r1 = r1.m6928d();	 Catch:{ Exception -> 0x0083 }
        if (r7 == 0) goto L_0x007e;	 Catch:{ Exception -> 0x0083 }
    L_0x0016:
        r2 = r7.f16096a;	 Catch:{ Exception -> 0x0083 }
        r1 = r2.equals(r1);	 Catch:{ Exception -> 0x0083 }
        r3 = 0;	 Catch:{ Exception -> 0x0083 }
        r4 = 1;	 Catch:{ Exception -> 0x0083 }
        if (r1 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x0083 }
    L_0x0020:
        r7 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x0083 }
        r7 = r6.getString(r7);	 Catch:{ Exception -> 0x0083 }
        r1 = 2131690588; // 0x7f0f045c float:1.9010224E38 double:1.053195087E-314;	 Catch:{ Exception -> 0x0083 }
        r1 = r6.getString(r1);	 Catch:{ Exception -> 0x0083 }
        r2 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0083 }
        r2[r3] = r7;	 Catch:{ Exception -> 0x0083 }
        r7 = java.lang.String.format(r1, r2);	 Catch:{ Exception -> 0x0083 }
        return r7;	 Catch:{ Exception -> 0x0083 }
    L_0x0037:
        r1 = r7.f16097b;	 Catch:{ Exception -> 0x0083 }
        if (r1 == 0) goto L_0x0046;	 Catch:{ Exception -> 0x0083 }
    L_0x003b:
        r1 = r7.f16097b;	 Catch:{ Exception -> 0x0083 }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x0083 }
        if (r1 != 0) goto L_0x0046;	 Catch:{ Exception -> 0x0083 }
    L_0x0043:
        r7 = r7.f16097b;	 Catch:{ Exception -> 0x0083 }
        goto L_0x006e;	 Catch:{ Exception -> 0x0083 }
    L_0x0046:
        r7 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);	 Catch:{ Exception -> 0x0083 }
        if (r7 != 0) goto L_0x005b;	 Catch:{ Exception -> 0x0083 }
    L_0x004c:
        r7 = "";	 Catch:{ Exception -> 0x0083 }
        r1 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x0083 }
        r5 = new java.lang.String[r4];	 Catch:{ Exception -> 0x0083 }
        r5[r3] = r2;	 Catch:{ Exception -> 0x0083 }
        r1.<init>(r5, r4, r3);	 Catch:{ Exception -> 0x0083 }
        mobi.mmdt.ott.logic.C2808d.m7148b(r1);	 Catch:{ Exception -> 0x0083 }
        goto L_0x006e;	 Catch:{ Exception -> 0x0083 }
    L_0x005b:
        r1 = r7.f9422h;	 Catch:{ Exception -> 0x0083 }
        if (r1 == 0) goto L_0x0068;	 Catch:{ Exception -> 0x0083 }
    L_0x005f:
        r1 = r7.f9425k;	 Catch:{ Exception -> 0x0083 }
        r7 = r7.f9420f;	 Catch:{ Exception -> 0x0083 }
        r7 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r1, r7);	 Catch:{ Exception -> 0x0083 }
        goto L_0x006e;	 Catch:{ Exception -> 0x0083 }
    L_0x0068:
        r7 = r7.f9416b;	 Catch:{ Exception -> 0x0083 }
        r7 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r7);	 Catch:{ Exception -> 0x0083 }
    L_0x006e:
        r1 = 2131690016; // 0x7f0f0220 float:1.9009064E38 double:1.0531948045E-314;	 Catch:{ Exception -> 0x0083 }
        r1 = r6.getString(r1);	 Catch:{ Exception -> 0x0083 }
        r2 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0083 }
        r2[r3] = r7;	 Catch:{ Exception -> 0x0083 }
        r7 = java.lang.String.format(r1, r2);	 Catch:{ Exception -> 0x0083 }
        return r7;	 Catch:{ Exception -> 0x0083 }
    L_0x007e:
        r7 = r6.getString(r0);	 Catch:{ Exception -> 0x0083 }
        return r7;
    L_0x0083:
        r6 = r6.getString(r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.f(android.content.Context, java.lang.String):java.lang.String");
    }

    public static java.lang.String m8254g(android.content.Context r10, java.lang.String r11) {
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
        r0 = 2131690420; // 0x7f0f03b4 float:1.9009883E38 double:1.053195004E-314;
        r1 = new mobi.mmdt.ott.logic.a.g.a.b.b.g;	 Catch:{ Exception -> 0x00cd }
        r1.<init>(r11);	 Catch:{ Exception -> 0x00cd }
        r11 = r1.f8582b;	 Catch:{ Exception -> 0x00cd }
        r11 = (mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.p292b.C5934j) r11;	 Catch:{ Exception -> 0x00cd }
        r1 = mobi.mmdt.ott.p246d.p248b.C2535a.m6888a();	 Catch:{ Exception -> 0x00cd }
        r1 = r1.m6928d();	 Catch:{ Exception -> 0x00cd }
        if (r11 == 0) goto L_0x00c8;	 Catch:{ Exception -> 0x00cd }
    L_0x0016:
        r2 = r11.f16099a;	 Catch:{ Exception -> 0x00cd }
        r3 = r11.f16100b;	 Catch:{ Exception -> 0x00cd }
        r4 = r2.equals(r1);	 Catch:{ Exception -> 0x00cd }
        r5 = 2131690577; // 0x7f0f0451 float:1.9010202E38 double:1.0531950817E-314;	 Catch:{ Exception -> 0x00cd }
        r6 = 0;	 Catch:{ Exception -> 0x00cd }
        r7 = 1;	 Catch:{ Exception -> 0x00cd }
        if (r4 == 0) goto L_0x002a;	 Catch:{ Exception -> 0x00cd }
    L_0x0025:
        r2 = r10.getString(r5);	 Catch:{ Exception -> 0x00cd }
        goto L_0x0062;	 Catch:{ Exception -> 0x00cd }
    L_0x002a:
        r4 = r11.f16101c;	 Catch:{ Exception -> 0x00cd }
        if (r4 == 0) goto L_0x0039;	 Catch:{ Exception -> 0x00cd }
    L_0x002e:
        r4 = r11.f16101c;	 Catch:{ Exception -> 0x00cd }
        r4 = r4.isEmpty();	 Catch:{ Exception -> 0x00cd }
        if (r4 != 0) goto L_0x0039;	 Catch:{ Exception -> 0x00cd }
    L_0x0036:
        r2 = r11.f16101c;	 Catch:{ Exception -> 0x00cd }
        goto L_0x0062;	 Catch:{ Exception -> 0x00cd }
    L_0x0039:
        r4 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r2);	 Catch:{ Exception -> 0x00cd }
        if (r4 == 0) goto L_0x0053;	 Catch:{ Exception -> 0x00cd }
    L_0x003f:
        r2 = r4.f9422h;	 Catch:{ Exception -> 0x00cd }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x00cd }
    L_0x0043:
        r2 = r4.f9425k;	 Catch:{ Exception -> 0x00cd }
        r4 = r4.f9420f;	 Catch:{ Exception -> 0x00cd }
        r2 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r2, r4);	 Catch:{ Exception -> 0x00cd }
        goto L_0x0062;	 Catch:{ Exception -> 0x00cd }
    L_0x004c:
        r2 = r4.f9416b;	 Catch:{ Exception -> 0x00cd }
        r2 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r2);	 Catch:{ Exception -> 0x00cd }
        goto L_0x0062;	 Catch:{ Exception -> 0x00cd }
    L_0x0053:
        r4 = "";	 Catch:{ Exception -> 0x00cd }
        r8 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x00cd }
        r9 = new java.lang.String[r7];	 Catch:{ Exception -> 0x00cd }
        r9[r6] = r2;	 Catch:{ Exception -> 0x00cd }
        r8.<init>(r9, r7, r6);	 Catch:{ Exception -> 0x00cd }
        mobi.mmdt.ott.logic.C2808d.m7148b(r8);	 Catch:{ Exception -> 0x00cd }
        r2 = r4;	 Catch:{ Exception -> 0x00cd }
    L_0x0062:
        r1 = r3.equals(r1);	 Catch:{ Exception -> 0x00cd }
        r4 = 2;	 Catch:{ Exception -> 0x00cd }
        if (r1 == 0) goto L_0x007f;	 Catch:{ Exception -> 0x00cd }
    L_0x0069:
        r11 = r10.getString(r5);	 Catch:{ Exception -> 0x00cd }
        r1 = 2131690023; // 0x7f0f0227 float:1.9009078E38 double:1.053194808E-314;	 Catch:{ Exception -> 0x00cd }
        r1 = r10.getString(r1);	 Catch:{ Exception -> 0x00cd }
        r3 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x00cd }
        r3[r6] = r11;	 Catch:{ Exception -> 0x00cd }
        r3[r7] = r2;	 Catch:{ Exception -> 0x00cd }
        r11 = java.lang.String.format(r1, r3);	 Catch:{ Exception -> 0x00cd }
        return r11;	 Catch:{ Exception -> 0x00cd }
    L_0x007f:
        r1 = r11.f16102d;	 Catch:{ Exception -> 0x00cd }
        if (r1 == 0) goto L_0x008e;	 Catch:{ Exception -> 0x00cd }
    L_0x0083:
        r1 = r11.f16102d;	 Catch:{ Exception -> 0x00cd }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x00cd }
        if (r1 != 0) goto L_0x008e;	 Catch:{ Exception -> 0x00cd }
    L_0x008b:
        r11 = r11.f16102d;	 Catch:{ Exception -> 0x00cd }
        goto L_0x00b6;	 Catch:{ Exception -> 0x00cd }
    L_0x008e:
        r11 = mobi.mmdt.ott.provider.p389k.C2999a.m7500a(r3);	 Catch:{ Exception -> 0x00cd }
        if (r11 != 0) goto L_0x00a3;	 Catch:{ Exception -> 0x00cd }
    L_0x0094:
        r11 = "";	 Catch:{ Exception -> 0x00cd }
        r1 = new mobi.mmdt.ott.logic.a.aa.b;	 Catch:{ Exception -> 0x00cd }
        r5 = new java.lang.String[r7];	 Catch:{ Exception -> 0x00cd }
        r5[r6] = r3;	 Catch:{ Exception -> 0x00cd }
        r1.<init>(r5, r7, r6);	 Catch:{ Exception -> 0x00cd }
        mobi.mmdt.ott.logic.C2808d.m7148b(r1);	 Catch:{ Exception -> 0x00cd }
        goto L_0x00b6;	 Catch:{ Exception -> 0x00cd }
    L_0x00a3:
        r1 = r11.f9422h;	 Catch:{ Exception -> 0x00cd }
        if (r1 == 0) goto L_0x00b0;	 Catch:{ Exception -> 0x00cd }
    L_0x00a7:
        r1 = r11.f9425k;	 Catch:{ Exception -> 0x00cd }
        r11 = r11.f9420f;	 Catch:{ Exception -> 0x00cd }
        r11 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r1, r11);	 Catch:{ Exception -> 0x00cd }
        goto L_0x00b6;	 Catch:{ Exception -> 0x00cd }
    L_0x00b0:
        r11 = r11.f9416b;	 Catch:{ Exception -> 0x00cd }
        r11 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r11);	 Catch:{ Exception -> 0x00cd }
    L_0x00b6:
        r1 = 2131690022; // 0x7f0f0226 float:1.9009076E38 double:1.0531948075E-314;	 Catch:{ Exception -> 0x00cd }
        r1 = r10.getString(r1);	 Catch:{ Exception -> 0x00cd }
        r3 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x00cd }
        r3[r6] = r11;	 Catch:{ Exception -> 0x00cd }
        r3[r7] = r2;	 Catch:{ Exception -> 0x00cd }
        r11 = java.lang.String.format(r1, r3);	 Catch:{ Exception -> 0x00cd }
        return r11;	 Catch:{ Exception -> 0x00cd }
    L_0x00c8:
        r11 = r10.getString(r0);	 Catch:{ Exception -> 0x00cd }
        return r11;
    L_0x00cd:
        r10 = r10.getString(r0);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.q.g(android.content.Context, java.lang.String):java.lang.String");
    }
}
