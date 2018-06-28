package mobi.mmdt.ott.logic.p369q;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import org.jivesoftware.smackx.xdata.FormField;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public final class C2888a {
    public static synchronized C2890c m7252a(File file) {
        C2890c c2890c;
        synchronized (C2888a.class) {
            Document parse;
            String replaceAll;
            String attribute;
            String attribute2;
            String attribute3;
            String attribute4;
            String attribute5;
            String attribute6;
            String attribute7;
            String attribute8;
            int i;
            try {
                parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
                parse.getDocumentElement().normalize();
                Element documentElement = parse.getDocumentElement();
                replaceAll = documentElement.getAttribute("version").replaceAll("[^0-9]", "");
                attribute = documentElement.getAttribute("package_number");
                attribute2 = documentElement.getAttribute("sticker_count");
                attribute3 = documentElement.getAttribute("price");
                attribute4 = documentElement.getAttribute("designer");
                attribute5 = documentElement.getAttribute(FormField.ELEMENT);
                attribute6 = documentElement.getAttribute("name");
                attribute7 = documentElement.getAttribute("thumbnail");
                attribute8 = documentElement.getAttribute("description");
                short s = (short) 1;
                if (documentElement.hasAttribute("view_multiplier")) {
                    int parseInt = Integer.parseInt(documentElement.getAttribute("view_multiplier"));
                } else {
                    i = 1;
                }
            } catch (int e) {
                Throwable th;
                C2480b.m6735a(th);
                c2890c = null;
                return c2890c;
            } finally {
                th = 
/*
Method generation error in method: mobi.mmdt.ott.logic.q.a.a(java.io.File):mobi.mmdt.ott.logic.q.c
jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0124: MERGE  (r2_3 'th' java.lang.Throwable) = (r0_2 'e' int), (r4_6 'parseInt' int) in method: mobi.mmdt.ott.logic.q.a.a(java.io.File):mobi.mmdt.ott.logic.q.c
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:203)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:297)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:227)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
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
Caused by: jadx.core.utils.exceptions.CodegenException: MERGE can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 28 more

*/
            }
