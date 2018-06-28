package p050b;

import java.io.DataOutputStream;
import p050b.p051a.C0819j;

final class C6432o extends C4989j {
    protected boolean f17591u;

    C6432o(String str, C0848e c0848e) {
        super(str, c0848e);
        this.n = true;
        this.q = new C0819j(str);
        mo923a((mo914c() & -7) | 1);
        this.f17591u = false;
    }

    public final void mo924a(C6430k c6430k) {
        this.f17591u = true;
        super.mo924a(c6430k);
    }

    public final void mo926a(DataOutputStream dataOutputStream) {
        if (!this.f17591u) {
            try {
                C0851i f = mo917f();
                C6430k[] r = f.mo936r();
                int i = 0;
                int i2 = i;
                while (true) {
                    boolean z = true;
                    if (i >= r.length) {
                        break;
                    }
                    C6430k c6430k = r[i];
                    int b = c6430k.mo919b();
                    if (!((b & 2) != 0)) {
                        if ((b & 7) == 0) {
                            String o = m2001o();
                            String o2 = f.m2001o();
                            if (o != null) {
                                z = o.equals(o2);
                            } else if (o2 != null) {
                            }
                        }
                        if (z) {
                            c6430k = C4992q.m10074a(c6430k.h_(), c6430k.m10027f(), this);
                            c6430k.m10020a(b & 7);
                            mo924a(c6430k);
                            i2++;
                        }
                        i++;
                    }
                    z = false;
                    if (z) {
                        c6430k = C4992q.m10074a(c6430k.h_(), c6430k.m10027f(), this);
                        c6430k.m10020a(b & 7);
                        mo924a(c6430k);
                        i2++;
                    }
                    i++;
                }
                if (i2 <= 0) {
                    StringBuilder stringBuilder = new StringBuilder("no inheritable constructor in ");
                    stringBuilder.append(f.m1999m());
                    throw new C0832a(stringBuilder.toString());
                }
                this.f17591u = true;
            } catch (C0858w e) {
                throw new C0832a(e);
            }
        }
        super.mo926a(dataOutputStream);
    }

    protected final void mo927a(StringBuffer stringBuffer) {
        if (this.f17591u) {
            stringBuffer.append("hasConstructor ");
        }
        super.mo927a(stringBuffer);
    }
}
