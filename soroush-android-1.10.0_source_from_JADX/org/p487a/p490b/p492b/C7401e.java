package org.p487a.p490b.p492b;

import java.lang.reflect.Modifier;
import org.msgpack.util.TemplatePrecompiler;
import org.p487a.p488a.p489a.C7241c;

final class C7401e extends C7242a implements C7241c {
    Class f21527d;

    C7401e(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i, str, cls, clsArr, strArr, clsArr2);
        this.f21527d = cls2;
    }

    protected final String mo3581a(C4602h c4602h) {
        String modifier;
        Class c;
        Class[] a;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f17236e == -1) {
            this.f17236e = Integer.parseInt(m14731a(0), 16);
        }
        int i = this.f17236e;
        if (c4602h.f12629d) {
            modifier = Modifier.toString(i);
            if (modifier.length() != 0) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(modifier);
                stringBuffer2.append(" ");
                modifier = stringBuffer2.toString();
                stringBuffer.append(modifier);
                if (c4602h.f12627b) {
                    if (this.f21527d == null) {
                        this.f21527d = m14733b(6);
                    }
                    stringBuffer.append(c4602h.m8329a(this.f21527d));
                }
                if (c4602h.f12627b) {
                    stringBuffer.append(" ");
                }
                c = m14735c();
                if (this.f17238g == null) {
                    this.f17238g = m14735c().getName();
                }
                stringBuffer.append(c4602h.m8330a(c, this.f17238g, c4602h.f12630e));
                stringBuffer.append(TemplatePrecompiler.DEFAULT_DEST);
                if (this.f17237f == null) {
                    this.f17237f = m14731a(1);
                }
                stringBuffer.append(this.f17237f);
                a = mo3469a();
                if (a != null) {
                    if (c4602h.f12627b) {
                        modifier = a.length != 0 ? "()" : "(..)";
                    } else {
                        stringBuffer.append("(");
                        c4602h.m8331a(stringBuffer, a);
                        modifier = ")";
                    }
                    stringBuffer.append(modifier);
                }
                a = m19137b();
                if (c4602h.f12628c && a != null) {
                    if (a.length == 0) {
                        stringBuffer.append(" throws ");
                        c4602h.m8331a(stringBuffer, a);
                    }
                }
                return stringBuffer.toString();
            }
        }
        modifier = "";
        stringBuffer.append(modifier);
        if (c4602h.f12627b) {
            if (this.f21527d == null) {
                this.f21527d = m14733b(6);
            }
            stringBuffer.append(c4602h.m8329a(this.f21527d));
        }
        if (c4602h.f12627b) {
            stringBuffer.append(" ");
        }
        c = m14735c();
        if (this.f17238g == null) {
            this.f17238g = m14735c().getName();
        }
        stringBuffer.append(c4602h.m8330a(c, this.f17238g, c4602h.f12630e));
        stringBuffer.append(TemplatePrecompiler.DEFAULT_DEST);
        if (this.f17237f == null) {
            this.f17237f = m14731a(1);
        }
        stringBuffer.append(this.f17237f);
        a = mo3469a();
        if (a != null) {
            if (c4602h.f12627b) {
                stringBuffer.append("(");
                c4602h.m8331a(stringBuffer, a);
                modifier = ")";
            } else if (a.length != 0) {
            }
            stringBuffer.append(modifier);
        }
        a = m19137b();
        if (a.length == 0) {
            stringBuffer.append(" throws ");
            c4602h.m8331a(stringBuffer, a);
        }
        return stringBuffer.toString();
    }
}
