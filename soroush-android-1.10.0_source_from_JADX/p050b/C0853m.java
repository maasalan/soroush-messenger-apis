package p050b;

import java.lang.reflect.Modifier;

public abstract class C0853m {
    C0853m f2547b = null;
    protected C0851i f2548c;

    static class C4991a extends C0853m {
        C0853m f13893a = this;
        C0853m f13894d = this;
        C0853m f13895e = this;

        C4991a(C4989j c4989j) {
            super(c4989j);
        }

        final void m10068a(C0853m c0853m) {
            c0853m.f2547b = this.f13893a.f2547b;
            this.f13893a.f2547b = c0853m;
            if (this.f13893a == this.f13894d) {
                this.f13894d = c0853m;
                if (this.f13893a == this.f13895e) {
                    this.f13895e = c0853m;
                }
            }
            this.f13893a = c0853m;
        }

        protected final void mo918a(StringBuffer stringBuffer) {
        }

        public final int mo919b() {
            return 0;
        }

        final void m10071b(C0853m c0853m) {
            c0853m.f2547b = this.f13894d.f2547b;
            this.f13894d.f2547b = c0853m;
            if (this.f13894d == this.f13895e) {
                this.f13895e = c0853m;
            }
            this.f13894d = c0853m;
        }

        public final String mo920e() {
            return null;
        }

        public final String mo941i() {
            return null;
        }
    }

    protected C0853m(C0851i c0851i) {
        this.f2548c = c0851i;
    }

    protected abstract void mo918a(StringBuffer stringBuffer);

    public abstract int mo919b();

    public C0851i mo940c() {
        return this.f2548c;
    }

    public abstract String mo920e();

    public abstract String mo941i();

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(Integer.toHexString(hashCode()));
        stringBuffer.append("[");
        stringBuffer.append(Modifier.toString(mo919b()));
        mo918a(stringBuffer);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
