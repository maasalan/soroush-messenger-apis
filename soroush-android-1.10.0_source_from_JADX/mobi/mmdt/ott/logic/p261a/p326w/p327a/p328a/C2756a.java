package mobi.mmdt.ott.logic.p261a.p326w.p327a.p328a;

import com.google.p154a.p155a.C1624g.C1623a;
import com.google.p154a.p157c.C1640a;
import java.net.URL;
import java.util.regex.Pattern;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;

public final class C2756a {

    public static class C2755a {
        public final URL f8710a;
        public final String f8711b;

        private C2755a(URL url, String str) {
            this.f8710a = url;
            this.f8711b = str;
        }

        public static C2755a m7081a(String str) {
            URL url = new URL(str);
            String host = url.getHost();
            String toLowerCase = host.toLowerCase();
            if (!toLowerCase.equals(host)) {
                str = Pattern.compile(host, 16).matcher(str).replaceFirst(toLowerCase);
                url = new URL(str);
            }
            int i = 0;
            if (!C2756a.m7083a(toLowerCase.charAt(0))) {
                if (C1640a.m4210a(toLowerCase).f5100a > 0) {
                    i = 1;
                }
                if (i == 0) {
                    return null;
                }
            } else if (!C2757b.m7085a(toLowerCase)) {
                return null;
            }
            return new C2755a(url, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2755a c2755a = (C2755a) obj;
            if (this.f8710a == null) {
                if (c2755a.f8710a != null) {
                    return false;
                }
            } else if (!this.f8710a.equals(c2755a.f8710a)) {
                return false;
            }
            if (this.f8711b == null) {
                if (c2755a.f8711b != null) {
                    return false;
                }
            } else if (!this.f8711b.equals(c2755a.f8711b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            int hashCode = 31 * ((this.f8710a == null ? 0 : this.f8710a.hashCode()) + 31);
            if (this.f8711b != null) {
                i = this.f8711b.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return new C1623a(getClass().getSimpleName()).m4179a(OnNativeInvokeListener.ARG_URL, this.f8710a).m4179a("urlString", this.f8711b).toString();
        }
    }

    public static mobi.mmdt.ott.logic.p261a.p326w.p327a.p328a.C2756a.C2755a m7082a(java.lang.String r4) {
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
        r0 = 0;
        r1 = r4.charAt(r0);
        r2 = java.lang.Character.toLowerCase(r1);
        r3 = 97;
        if (r2 < r3) goto L_0x0012;
    L_0x000d:
        r3 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r2 > r3) goto L_0x0012;
    L_0x0011:
        r0 = 1;
    L_0x0012:
        r2 = 0;
        if (r0 != 0) goto L_0x001c;
    L_0x0015:
        r0 = mobi.mmdt.ott.logic.p261a.p326w.p327a.p328a.C2756a.m7083a(r1);
        if (r0 != 0) goto L_0x001c;
    L_0x001b:
        return r2;
    L_0x001c:
        r0 = 32;
        r0 = r4.indexOf(r0);
        r1 = -1;
        if (r0 == r1) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        r0 = 46;
        r0 = r4.indexOf(r0);
        if (r0 != r1) goto L_0x002f;
    L_0x002e:
        return r2;
    L_0x002f:
        r0 = mobi.mmdt.ott.logic.p261a.p326w.p327a.p328a.C2756a.C2755a.m7081a(r4);	 Catch:{ MalformedURLException -> 0x0034 }
        return r0;
    L_0x0034:
        r0 = new java.lang.StringBuilder;
        r1 = "http://";
        r0.<init>(r1);
        r0.append(r4);
        r4 = r0.toString();
        r4 = mobi.mmdt.ott.logic.p261a.p326w.p327a.p328a.C2756a.C2755a.m7081a(r4);	 Catch:{ MalformedURLException -> 0x0047 }
        return r4;
    L_0x0047:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.a.w.a.a.a.a(java.lang.String):mobi.mmdt.ott.logic.a.w.a.a.a$a");
    }

    static boolean m7083a(char c) {
        return c >= '0' && c <= '9';
    }
}
