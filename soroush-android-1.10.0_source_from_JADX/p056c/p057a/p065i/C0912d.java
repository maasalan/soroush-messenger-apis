package p056c.p057a.p065i;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import org.msgpack.util.TemplatePrecompiler;
import p056c.p057a.C0885c;

public final class C0912d implements HostnameVerifier {
    public static final C0912d f2784a = new C0912d();

    private C0912d() {
    }

    public static List<String> m2232a(X509Certificate x509Certificate) {
        Collection a = C0912d.m2233a(x509Certificate, 7);
        Collection a2 = C0912d.m2233a(x509Certificate, 2);
        List<String> arrayList = new ArrayList(a.size() + a2.size());
        arrayList.addAll(a);
        arrayList.addAll(a2);
        return arrayList;
    }

    private static java.util.List<java.lang.String> m2233a(java.security.cert.X509Certificate r4, int r5) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = new java.util.ArrayList;
        r0.<init>();
        r4 = r4.getSubjectAlternativeNames();	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r4 != 0) goto L_0x0010;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x000b:
        r4 = java.util.Collections.emptyList();	 Catch:{ CertificateParsingException -> 0x0046 }
        return r4;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0010:
        r4 = r4.iterator();	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0014:
        r1 = r4.hasNext();	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r1 == 0) goto L_0x0045;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x001a:
        r1 = r4.next();	 Catch:{ CertificateParsingException -> 0x0046 }
        r1 = (java.util.List) r1;	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r1 == 0) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0022:
        r2 = r1.size();	 Catch:{ CertificateParsingException -> 0x0046 }
        r3 = 2;	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r2 < r3) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0029:
        r2 = 0;	 Catch:{ CertificateParsingException -> 0x0046 }
        r2 = r1.get(r2);	 Catch:{ CertificateParsingException -> 0x0046 }
        r2 = (java.lang.Integer) r2;	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r2 == 0) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0032:
        r2 = r2.intValue();	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r2 != r5) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0038:
        r2 = 1;	 Catch:{ CertificateParsingException -> 0x0046 }
        r1 = r1.get(r2);	 Catch:{ CertificateParsingException -> 0x0046 }
        r1 = (java.lang.String) r1;	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r1 == 0) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0041:
        r0.add(r1);	 Catch:{ CertificateParsingException -> 0x0046 }
        goto L_0x0014;
    L_0x0045:
        return r0;
    L_0x0046:
        r4 = java.util.Collections.emptyList();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.i.d.a(java.security.cert.X509Certificate, int):java.util.List<java.lang.String>");
    }

    public static boolean m2234a(String str, X509Certificate x509Certificate) {
        if (C0885c.m2110c(str)) {
            List a = C0912d.m2233a(x509Certificate, 7);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase((String) a.get(i))) {
                    return true;
                }
            }
            return false;
        }
        str = str.toLowerCase(Locale.US);
        for (String str2 : C0912d.m2233a(x509Certificate, 2)) {
            boolean equals;
            if (!(str == null || str.length() == 0 || str.startsWith(TemplatePrecompiler.DEFAULT_DEST))) {
                if (!str.endsWith("..")) {
                    String str22;
                    if (!(str22 == null || str22.length() == 0 || str22.startsWith(TemplatePrecompiler.DEFAULT_DEST))) {
                        if (!str22.endsWith("..")) {
                            String str3;
                            if (str.endsWith(TemplatePrecompiler.DEFAULT_DEST)) {
                                str3 = str;
                            } else {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(str);
                                stringBuilder.append('.');
                                str3 = stringBuilder.toString();
                            }
                            if (!str22.endsWith(TemplatePrecompiler.DEFAULT_DEST)) {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(str22);
                                stringBuilder2.append('.');
                                str22 = stringBuilder2.toString();
                            }
                            str22 = str22.toLowerCase(Locale.US);
                            if (!str22.contains("*")) {
                                equals = str3.equals(str22);
                                continue;
                            } else if (str22.startsWith("*.")) {
                                if (str22.indexOf(42, 1) == -1) {
                                    if (str3.length() >= str22.length()) {
                                        if (!"*.".equals(str22)) {
                                            str22 = str22.substring(1);
                                            if (str3.endsWith(str22)) {
                                                int length = str3.length() - str22.length();
                                                if (length <= 0 || str3.lastIndexOf(46, length - 1) == -1) {
                                                    equals = true;
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (equals) {
                                return true;
                            }
                        }
                    }
                }
            }
            equals = false;
            continue;
            if (equals) {
                return true;
            }
        }
        return false;
    }

    public final boolean verify(java.lang.String r2, javax.net.ssl.SSLSession r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = 0;
        r3 = r3.getPeerCertificates();	 Catch:{ SSLException -> 0x000e }
        r3 = r3[r0];	 Catch:{ SSLException -> 0x000e }
        r3 = (java.security.cert.X509Certificate) r3;	 Catch:{ SSLException -> 0x000e }
        r2 = p056c.p057a.p065i.C0912d.m2234a(r2, r3);	 Catch:{ SSLException -> 0x000e }
        return r2;
    L_0x000e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.i.d.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }
}
