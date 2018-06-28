package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.C0198g.C0197b;
import android.support.constraint.ConstraintLayout.C0165a;
import android.support.constraint.p026a.p027a.C4701g;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.Arrays;

public abstract class C0190b extends View {
    protected int[] f746a = new int[32];
    protected int f747b = 0;
    protected Context f748c;
    protected C4701g f749d = null;
    protected boolean f750e = false;
    private String f751f;

    public C0190b(Context context) {
        super(context);
        this.f748c = context;
        mo71a(null);
    }

    private void m380a(java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r5 = this;
        if (r6 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r5.f748c;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return;
    L_0x0008:
        r6 = r6.trim();
        r0 = 0;
        r1 = 0;
        r2 = android.support.constraint.C0198g.C0196a.class;	 Catch:{ Exception -> 0x0019 }
        r2 = r2.getField(r6);	 Catch:{ Exception -> 0x0019 }
        r2 = r2.getInt(r1);	 Catch:{ Exception -> 0x0019 }
        r0 = r2;
    L_0x0019:
        if (r0 != 0) goto L_0x002d;
    L_0x001b:
        r0 = r5.f748c;
        r0 = r0.getResources();
        r2 = "id";
        r3 = r5.f748c;
        r3 = r3.getPackageName();
        r0 = r0.getIdentifier(r6, r2, r3);
    L_0x002d:
        if (r0 != 0) goto L_0x006a;
    L_0x002f:
        r2 = r5.isInEditMode();
        if (r2 == 0) goto L_0x006a;
    L_0x0035:
        r2 = r5.getParent();
        r2 = r2 instanceof android.support.constraint.ConstraintLayout;
        if (r2 == 0) goto L_0x006a;
    L_0x003d:
        r2 = r5.getParent();
        r2 = (android.support.constraint.ConstraintLayout) r2;
        r3 = r6 instanceof java.lang.String;
        if (r3 == 0) goto L_0x005d;
    L_0x0047:
        r3 = r6;
        r3 = (java.lang.String) r3;
        r4 = r2.f544c;
        if (r4 == 0) goto L_0x005d;
    L_0x004e:
        r4 = r2.f544c;
        r4 = r4.containsKey(r3);
        if (r4 == 0) goto L_0x005d;
    L_0x0056:
        r2 = r2.f544c;
        r2 = r2.get(r3);
        goto L_0x005e;
    L_0x005d:
        r2 = r1;
    L_0x005e:
        if (r2 == 0) goto L_0x006a;
    L_0x0060:
        r3 = r2 instanceof java.lang.Integer;
        if (r3 == 0) goto L_0x006a;
    L_0x0064:
        r2 = (java.lang.Integer) r2;
        r0 = r2.intValue();
    L_0x006a:
        if (r0 == 0) goto L_0x0070;
    L_0x006c:
        r5.setTag(r0, r1);
        return;
    L_0x0070:
        r0 = "ConstraintHelper";
        r1 = new java.lang.StringBuilder;
        r2 = "Could not find id of \"";
        r1.<init>(r2);
        r1.append(r6);
        r6 = "\"";
        r1.append(r6);
        r6 = r1.toString();
        android.util.Log.w(r0, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.b.a(java.lang.String):void");
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m380a(str.substring(i));
                    return;
                } else {
                    m380a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public final void m381a() {
        if (this.f749d != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0165a) {
                ((C0165a) layoutParams).al = this.f749d;
            }
        }
    }

    public final void m382a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f751f);
        }
        if (this.f749d != null) {
            this.f749d.m8594A();
            for (int i = 0; i < this.f747b; i++) {
                View findViewById = constraintLayout.findViewById(this.f746a[i]);
                if (findViewById != null) {
                    this.f749d.m8595a(constraintLayout.m270a(findViewById));
                }
            }
        }
    }

    protected void mo71a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0197b.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0197b.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f751f = obtainStyledAttributes.getString(index);
                    setIds(this.f751f);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f746a, this.f747b);
    }

    public void onDraw(Canvas canvas) {
    }

    protected void onMeasure(int i, int i2) {
        if (this.f750e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        int i = 0;
        this.f747b = 0;
        while (i < iArr.length) {
            setTag(iArr[i], null);
            i++;
        }
    }

    public void setTag(int i, Object obj) {
        if (this.f747b + 1 > this.f746a.length) {
            this.f746a = Arrays.copyOf(this.f746a, this.f746a.length * 2);
        }
        this.f746a[this.f747b] = i;
        this.f747b++;
    }
}
