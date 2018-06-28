package lecho.lib.hellocharts.view;

import android.content.Context;
import android.util.AttributeSet;
import lecho.lib.hellocharts.model.C2434d;
import lecho.lib.hellocharts.model.C2435e;
import lecho.lib.hellocharts.model.C2438h;
import lecho.lib.hellocharts.model.C6633f;
import lecho.lib.hellocharts.p222e.C2423c;
import lecho.lib.hellocharts.p222e.C5747a;
import lecho.lib.hellocharts.p223f.C2425a;
import lecho.lib.hellocharts.p224g.C6632d;

public class LineChartView extends C5751a implements C2425a {
    protected C6633f f18905j;
    protected C2423c f18906k;

    public LineChartView(Context context) {
        this(context, null, 0);
    }

    public LineChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LineChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18906k = new C5747a();
        setChartRenderer(new C6632d(context, this, this));
        setLineChartData(C6633f.m17132l());
    }

    public final void mo3164c() {
        C2438h g = this.d.mo2106g();
        if (g.m6665b()) {
            ((C2435e) this.f18905j.f18903k.get(g.f8097a)).f8085q.get(g.f8098b);
        }
    }

    public C2434d getChartData() {
        return this.f18905j;
    }

    public C6633f getLineChartData() {
        return this.f18905j;
    }

    public C2423c getOnValueTouchListener() {
        return this.f18906k;
    }

    public void setLineChartData(C6633f c6633f) {
        if (c6633f == null) {
            c6633f = C6633f.m17132l();
        }
        this.f18905j = c6633f;
        super.m12892b();
    }

    public void setOnValueTouchListener(C2423c c2423c) {
        if (c2423c != null) {
            this.f18906k = c2423c;
        }
    }
}
