package mobi.mmdt.ott.logic.p261a;

import com.p072b.p073a.p074a.C1063i;
import com.p072b.p073a.p074a.C1071o;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;

public abstract class C5891a extends C1063i {
    protected boolean isCanceled = false;

    protected C5891a(int i) {
        super(new C1071o(i));
        StringBuilder stringBuilder = new StringBuilder("Job name is : ");
        stringBuilder.append(getClass().getName());
        C2480b.m6742f(stringBuilder.toString());
    }

    protected C5891a(int i, String str) {
        C1071o c1071o = new C1071o(i);
        c1071o.f3495b = str;
        super(c1071o);
    }

    public void cancelJob() {
        this.isCanceled = true;
    }

    public boolean isCanceled() {
        return this.isCanceled;
    }
}
