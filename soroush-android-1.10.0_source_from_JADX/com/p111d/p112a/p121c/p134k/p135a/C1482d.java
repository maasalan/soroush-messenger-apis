package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p129g.C5346d;
import com.p111d.p112a.p121c.p134k.C7119d;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.io.Serializable;

public abstract class C1482d {

    private static final class C7281a extends C7119d implements Serializable {
        protected final C7119d f21023w;
        protected final Class<?>[] f21024x;

        protected C7281a(C7119d c7119d, Class<?>[] clsArr) {
            super(c7119d);
            this.f21023w = c7119d;
            this.f21024x = clsArr;
        }

        public final /* synthetic */ C7119d mo3535a(C1534n c1534n) {
            return new C7281a(this.f21023w.mo3535a(c1534n), this.f21024x);
        }

        public final void mo1351a(C5346d c5346d, aa aaVar) {
            Class e = aaVar.m11060e();
            if (e != null) {
                int i = 0;
                int length = this.f21024x.length;
                while (i < length && !this.f21024x[i].isAssignableFrom(e)) {
                    i++;
                }
                if (i == length) {
                    return;
                }
            }
            super.mo1351a(c5346d, aaVar);
        }

        public final void mo3536a(C1545o<Object> c1545o) {
            this.f21023w.mo3536a((C1545o) c1545o);
        }

        public final void mo3376a(Object obj, C5301g c5301g, aa aaVar) {
            Class e = aaVar.m11060e();
            if (e != null) {
                int i = 0;
                int length = this.f21024x.length;
                while (i < length && !this.f21024x[i].isAssignableFrom(e)) {
                    i++;
                }
                if (i == length) {
                    this.f21023w.m18622a(c5301g);
                    return;
                }
            }
            this.f21023w.mo3376a(obj, c5301g, aaVar);
        }

        public final void mo3537b(C1545o<Object> c1545o) {
            this.f21023w.mo3537b(c1545o);
        }

        public final void mo3538b(Object obj, C5301g c5301g, aa aaVar) {
            Class e = aaVar.m11060e();
            if (e != null) {
                int i = 0;
                int length = this.f21024x.length;
                while (i < length && !this.f21024x[i].isAssignableFrom(e)) {
                    i++;
                }
                if (i == length) {
                    this.f21023w.m18623a(c5301g, aaVar);
                    return;
                }
            }
            this.f21023w.mo3538b(obj, c5301g, aaVar);
        }
    }

    private static final class C7282b extends C7119d implements Serializable {
        protected final C7119d f21025w;
        protected final Class<?> f21026x;

        protected C7282b(C7119d c7119d, Class<?> cls) {
            super(c7119d);
            this.f21025w = c7119d;
            this.f21026x = cls;
        }

        public final /* synthetic */ C7119d mo3535a(C1534n c1534n) {
            return new C7282b(this.f21025w.mo3535a(c1534n), this.f21026x);
        }

        public final void mo1351a(C5346d c5346d, aa aaVar) {
            Class e = aaVar.m11060e();
            if (e == null || this.f21026x.isAssignableFrom(e)) {
                super.mo1351a(c5346d, aaVar);
            }
        }

        public final void mo3536a(C1545o<Object> c1545o) {
            this.f21025w.mo3536a((C1545o) c1545o);
        }

        public final void mo3376a(Object obj, C5301g c5301g, aa aaVar) {
            Class e = aaVar.m11060e();
            if (e != null) {
                if (!this.f21026x.isAssignableFrom(e)) {
                    this.f21025w.m18622a(c5301g);
                    return;
                }
            }
            this.f21025w.mo3376a(obj, c5301g, aaVar);
        }

        public final void mo3537b(C1545o<Object> c1545o) {
            this.f21025w.mo3537b(c1545o);
        }

        public final void mo3538b(Object obj, C5301g c5301g, aa aaVar) {
            Class e = aaVar.m11060e();
            if (e != null) {
                if (!this.f21026x.isAssignableFrom(e)) {
                    this.f21025w.m18623a(c5301g, aaVar);
                    return;
                }
            }
            this.f21025w.mo3538b(obj, c5301g, aaVar);
        }
    }

    public static C7119d m3820a(C7119d c7119d, Class<?>[] clsArr) {
        return clsArr.length == 1 ? new C7282b(c7119d, clsArr[0]) : new C7281a(c7119d, clsArr);
    }
}
