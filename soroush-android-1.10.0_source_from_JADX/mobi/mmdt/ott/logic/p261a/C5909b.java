package mobi.mmdt.ott.logic.p261a;

import com.p072b.p073a.p074a.C1063i;
import com.p072b.p073a.p074a.C1071o;
import com.p072b.p073a.p074a.C1073q;
import java.util.Locale;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;

public abstract class C5909b extends C1063i {
    protected int f16070a = 1;
    private Long f16071b = Long.valueOf(2000);

    protected C5909b(int i) {
        super(new C1071o(i));
        StringBuilder stringBuilder = new StringBuilder("Job name is : ");
        stringBuilder.append(getClass().getName());
        C2480b.m6742f(stringBuilder.toString());
    }

    public C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        if (this.f16070a > 3) {
            return C1073q.f3504b;
        }
        this.f16071b = Long.valueOf(this.f16071b.longValue() + this.f16071b.longValue());
        this.f16070a++;
        StringBuilder stringBuilder = new StringBuilder("retry job ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" - ");
        stringBuilder.append(String.format(Locale.US, "Delay:%d TriedNumber:%d", new Object[]{this.f16071b, Integer.valueOf(this.f16070a)}));
        C2480b.m6742f(stringBuilder.toString());
        C1073q c1073q = new C1073q(true);
        c1073q.mo1097a(this.f16071b);
        return c1073q;
    }
}
