package mobi.mmdt.ott.logic.p369q;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import mobi.mmdt.componentsutils.C2468a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.provider.p393o.C3011a;
import mobi.mmdt.ott.provider.p393o.C3013f;
import mobi.mmdt.ott.provider.p393o.C6046e;
import mobi.mmdt.ott.provider.p394p.C3014a;
import mobi.mmdt.ott.provider.p394p.C3016f;
import mobi.mmdt.ott.provider.p394p.C6047c;
import mobi.mmdt.ott.provider.p394p.C6049e;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Xml;

public final class C2892e {
    private String f9050a;
    private C2889b f9051b = null;

    public final void m7253a(String str, InputStream inputStream, int i) {
        C2892e c2892e = this;
        int i2 = i;
        try {
            int i3;
            C3014a.m7526a(MyApplication.m12952b(), i2, C3016f.EXTRACTING);
            String i4 = C2791c.m7109a().m7124i(String.valueOf(i));
            File file = new File(i4);
            C2893f.m7254a(inputStream, file);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i4);
            stringBuilder.append(File.separator);
            stringBuilder.append(i2);
            stringBuilder.append("_");
            stringBuilder.append(C2556b.m6997a(MyApplication.m12952b()));
            String stringBuilder2 = stringBuilder.toString();
            C2890c c2890c = null;
            if (file.isDirectory()) {
                C2890c c2890c2 = null;
                for (File file2 : file.listFiles()) {
                    if (file2.isDirectory()) {
                        file2.renameTo(new File(stringBuilder2));
                    } else if (C2468a.m6714k(file2.getPath()).equals(Xml.ELEMENT)) {
                        c2890c2 = C2888a.m7252a(file2);
                    }
                }
                c2890c = c2890c2;
            }
            if (c2890c != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append(File.separator);
                stringBuilder.append(c2890c.f9039i);
                c2892e.f9050a = Uri.fromFile(new File(stringBuilder.toString())).toString();
                Context b = MyApplication.m12952b();
                i3 = c2890c.f9032b;
                int i5 = c2890c.f9031a;
                String str2 = c2890c.f9038h;
                String str3 = c2890c.f9035e;
                String str4 = c2892e.f9050a;
                int i6 = c2890c.f9033c;
                String str5 = c2890c.f9037g;
                String str6 = c2890c.f9036f;
                String str7 = c2890c.f9040j;
                C3016f c3016f = C3016f.READY;
                C6047c c6047c = new C6047c();
                c6047c.m13568a(i5).m13577d(str2).m13569a(str3).m13579e(str4).m13578e(i6).m13575c(str5).m13573b(str6).m13580f(str7).m13571a(false).m13572b(100).m13570a(c3016f);
                C6049e c6049e = new C6049e();
                c6049e.m13586b(i3);
                c6047c.m13566a(b, c6049e);
                Iterator it = c2890c.f9041k.iterator();
                while (it.hasNext()) {
                    C2891d c2891d = (C2891d) it.next();
                    Context b2 = MyApplication.m12952b();
                    i5 = c2891d.f9047f;
                    int i7 = c2891d.f9042a;
                    C6046e c6046e = new C6046e();
                    ((C6046e) c6046e.m13564c(i5).m7368c()).m13563b(i7);
                    c6046e.m7360a(b2);
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder3.append(File.separator);
                    stringBuilder3.append(c2891d.f9049h);
                    String uri = Uri.fromFile(new File(stringBuilder3.toString())).toString();
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(stringBuilder2);
                    stringBuilder3.append(File.separator);
                    stringBuilder3.append(c2891d.f9048g);
                    String uri2 = Uri.fromFile(new File(stringBuilder3.toString())).toString();
                    int i8 = c2890c.f9031a;
                    i5 = c2891d.f9047f;
                    i7 = c2891d.f9042a;
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(i8);
                    stringBuilder4.append("_");
                    stringBuilder4.append(i5);
                    stringBuilder4.append("_");
                    stringBuilder4.append(i7);
                    String stringBuilder5 = stringBuilder4.toString();
                    C3011a.m7520a(MyApplication.m12952b(), c2891d.f9047f, c2891d.f9042a, c2890c.f9031a, stringBuilder5, uri2, uri, c2891d.f9043b, c2891d.f9044c, c2891d.f9045d, c2891d.f9046e, C3013f.f9461e, c2890c.f9034d);
                }
            }
            File file3 = new File(str);
            if (file3.isFile()) {
                file3.delete();
            }
        } catch (Throwable e) {
            C2480b.m6738b(e);
        }
    }
}
