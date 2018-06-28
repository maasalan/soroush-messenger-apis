package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.C0198g.C0197b;
import android.support.constraint.p026a.p027a.C6336a;
import android.util.AttributeSet;

public final class C4707a extends C0190b {
    private int f12936f = 0;
    private int f12937g = 0;
    private C6336a f12938h;

    public C4707a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    protected final void mo71a(AttributeSet attributeSet) {
        super.mo71a(attributeSet);
        this.f12938h = new C6336a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0197b.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0197b.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0197b.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f12938h.f17322b = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.d = this.f12938h;
        m381a();
    }

    public final int getType() {
        return this.f12936f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setType(int r6) {
        /*
        r5 = this;
        r5.f12936f = r6;
        r5.f12937g = r6;
        r6 = android.os.Build.VERSION.SDK_INT;
        r0 = 6;
        r1 = 5;
        r2 = 0;
        r3 = 1;
        r4 = 17;
        if (r6 >= r4) goto L_0x001c;
    L_0x000e:
        r6 = r5.f12936f;
        if (r6 != r1) goto L_0x0015;
    L_0x0012:
        r5.f12937g = r2;
        goto L_0x0043;
    L_0x0015:
        r6 = r5.f12936f;
        if (r6 != r0) goto L_0x0043;
    L_0x0019:
        r5.f12937g = r3;
        goto L_0x0043;
    L_0x001c:
        r6 = r5.getResources();
        r6 = r6.getConfiguration();
        r6 = r6.getLayoutDirection();
        if (r3 != r6) goto L_0x002c;
    L_0x002a:
        r6 = r3;
        goto L_0x002d;
    L_0x002c:
        r6 = r2;
    L_0x002d:
        if (r6 == 0) goto L_0x0039;
    L_0x002f:
        r6 = r5.f12936f;
        if (r6 != r1) goto L_0x0034;
    L_0x0033:
        goto L_0x0019;
    L_0x0034:
        r6 = r5.f12936f;
        if (r6 != r0) goto L_0x0043;
    L_0x0038:
        goto L_0x0012;
    L_0x0039:
        r6 = r5.f12936f;
        if (r6 != r1) goto L_0x003e;
    L_0x003d:
        goto L_0x0012;
    L_0x003e:
        r6 = r5.f12936f;
        if (r6 != r0) goto L_0x0043;
    L_0x0042:
        goto L_0x0019;
    L_0x0043:
        r6 = r5.f12938h;
        r0 = r5.f12937g;
        r6.f17321a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.setType(int):void");
    }
}
