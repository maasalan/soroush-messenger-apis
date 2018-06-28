package android.support.p028d;

import android.support.p028d.C0233u.C0232b;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class C4719y extends C0233u {
    boolean f12967i = true;
    private ArrayList<C0233u> f12968j = new ArrayList();
    private int f12969k;
    private boolean f12970l = false;

    static class C6344a extends C4718v {
        C4719y f17337a;

        C6344a(C4719y c4719y) {
            this.f17337a = c4719y;
        }

        public final void mo86a(C0233u c0233u) {
            C4719y.m8687b(this.f17337a);
            if (this.f17337a.f12969k == 0) {
                this.f17337a.f12970l = false;
                this.f17337a.m461d();
            }
            c0233u.mo107b((C0232b) this);
        }

        public final void mo88c() {
            if (!this.f17337a.f12970l) {
                this.f17337a.m458c();
                this.f17337a.f12970l = true;
            }
        }
    }

    static /* synthetic */ int m8687b(C4719y c4719y) {
        int i = c4719y.f12969k - 1;
        c4719y.f12969k = i;
        return i;
    }

    public final /* synthetic */ C0233u mo102a(long j) {
        super.mo102a(j);
        if (this.b >= 0) {
            int size = this.f12968j.size();
            for (int i = 0; i < size; i++) {
                ((C0233u) this.f12968j.get(i)).mo102a(j);
            }
        }
        return this;
    }

    final String mo104a(String str) {
        String a = super.mo104a(str);
        for (int i = 0; i < this.f12968j.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("\n");
            C0233u c0233u = (C0233u) this.f12968j.get(i);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("  ");
            stringBuilder.append(c0233u.mo104a(stringBuilder2.toString()));
            a = stringBuilder.toString();
        }
        return a;
    }

    public final void mo92a(C0237z c0237z) {
        if (m450a(c0237z.f923b)) {
            Iterator it = this.f12968j.iterator();
            while (it.hasNext()) {
                C0233u c0233u = (C0233u) it.next();
                if (c0233u.m450a(c0237z.f923b)) {
                    c0233u.mo92a(c0237z);
                    c0237z.f924c.add(c0233u);
                }
            }
        }
    }

    protected final void mo105a(ViewGroup viewGroup, aa aaVar, aa aaVar2, ArrayList<C0237z> arrayList, ArrayList<C0237z> arrayList2) {
        long j = this.f893a;
        int size = this.f12968j.size();
        int i = 0;
        while (i < size) {
            C0233u c0233u = (C0233u) r0.f12968j.get(i);
            if (j > 0 && (r0.f12967i || i == 0)) {
                long j2 = c0233u.f893a;
                if (j2 > 0) {
                    c0233u.mo106b(j + j2);
                } else {
                    c0233u.mo106b(j);
                }
            }
            c0233u.mo105a(viewGroup, aaVar, aaVar2, arrayList, arrayList2);
            i++;
        }
    }

    public final C4719y m8696b(C0233u c0233u) {
        this.f12968j.add(c0233u);
        c0233u.f897e = this;
        if (this.b >= 0) {
            c0233u.mo102a(this.b);
        }
        return this;
    }

    protected final void mo108b() {
        if (this.f12968j.isEmpty()) {
            m458c();
            m461d();
            return;
        }
        C0232b c6344a = new C6344a(this);
        Iterator it = this.f12968j.iterator();
        while (it.hasNext()) {
            ((C0233u) it.next()).mo103a(c6344a);
        }
        this.f12969k = this.f12968j.size();
        if (this.f12967i) {
            Iterator it2 = this.f12968j.iterator();
            while (it2.hasNext()) {
                ((C0233u) it2.next()).mo108b();
            }
            return;
        }
        for (int i = 1; i < this.f12968j.size(); i++) {
            final C0233u c0233u = (C0233u) this.f12968j.get(i);
            ((C0233u) this.f12968j.get(i - 1)).mo103a(new C4718v(this) {
                final /* synthetic */ C4719y f17336b;

                public final void mo86a(C0233u c0233u) {
                    c0233u.mo108b();
                    c0233u.mo107b((C0232b) this);
                }
            });
        }
        C0233u c0233u2 = (C0233u) this.f12968j.get(0);
        if (c0233u2 != null) {
            c0233u2.mo108b();
        }
    }

    public final void mo95b(C0237z c0237z) {
        if (m450a(c0237z.f923b)) {
            Iterator it = this.f12968j.iterator();
            while (it.hasNext()) {
                C0233u c0233u = (C0233u) it.next();
                if (c0233u.m450a(c0237z.f923b)) {
                    c0233u.mo95b(c0237z);
                    c0237z.f924c.add(c0233u);
                }
            }
        }
    }

    public final void mo109b(View view) {
        super.mo109b(view);
        int size = this.f12968j.size();
        for (int i = 0; i < size; i++) {
            ((C0233u) this.f12968j.get(i)).mo109b(view);
        }
    }

    final void mo110c(C0237z c0237z) {
        super.mo110c(c0237z);
        int size = this.f12968j.size();
        for (int i = 0; i < size; i++) {
            ((C0233u) this.f12968j.get(i)).mo110c(c0237z);
        }
    }

    public final void mo111c(View view) {
        super.mo111c(view);
        int size = this.f12968j.size();
        for (int i = 0; i < size; i++) {
            ((C0233u) this.f12968j.get(i)).mo111c(view);
        }
    }

    public /* synthetic */ Object clone() {
        return mo113e();
    }

    public final C0233u mo113e() {
        C4719y c4719y = (C4719y) super.mo113e();
        c4719y.f12968j = new ArrayList();
        int size = this.f12968j.size();
        for (int i = 0; i < size; i++) {
            c4719y.m8696b(((C0233u) this.f12968j.get(i)).mo113e());
        }
        return c4719y;
    }
}
