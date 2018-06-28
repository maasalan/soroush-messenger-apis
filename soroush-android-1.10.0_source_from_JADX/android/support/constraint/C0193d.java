package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.C0192c.C0191a;
import android.support.constraint.C0198g.C0197b;
import android.support.constraint.ConstraintLayout.C0165a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C0193d extends ViewGroup {
    C0192c f807a;

    public static class C4708a extends C0165a {
        public float an;
        public boolean ao;
        public float ap;
        public float aq;
        public float ar;
        public float as;
        public float at;
        public float au;
        public float av;
        public float aw;
        public float ax;
        public float ay;
        public float az;

        public C4708a() {
            this.an = BallPulseIndicator.SCALE;
            this.ao = false;
            this.ap = 0.0f;
            this.aq = 0.0f;
            this.ar = 0.0f;
            this.as = 0.0f;
            this.at = BallPulseIndicator.SCALE;
            this.au = BallPulseIndicator.SCALE;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            this.ay = 0.0f;
            this.az = 0.0f;
        }

        public C4708a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.an = BallPulseIndicator.SCALE;
            int i = 0;
            this.ao = false;
            this.ap = 0.0f;
            this.aq = 0.0f;
            this.ar = 0.0f;
            this.as = 0.0f;
            this.at = BallPulseIndicator.SCALE;
            this.au = BallPulseIndicator.SCALE;
            this.av = 0.0f;
            this.aw = 0.0f;
            this.ax = 0.0f;
            this.ay = 0.0f;
            this.az = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0197b.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            while (i < indexCount) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0197b.ConstraintSet_android_alpha) {
                    this.an = obtainStyledAttributes.getFloat(index, this.an);
                } else if (index == C0197b.ConstraintSet_android_elevation) {
                    this.ap = obtainStyledAttributes.getFloat(index, this.ap);
                    this.ao = true;
                } else if (index == C0197b.ConstraintSet_android_rotationX) {
                    this.ar = obtainStyledAttributes.getFloat(index, this.ar);
                } else if (index == C0197b.ConstraintSet_android_rotationY) {
                    this.as = obtainStyledAttributes.getFloat(index, this.as);
                } else if (index == C0197b.ConstraintSet_android_rotation) {
                    this.aq = obtainStyledAttributes.getFloat(index, this.aq);
                } else if (index == C0197b.ConstraintSet_android_scaleX) {
                    this.at = obtainStyledAttributes.getFloat(index, this.at);
                } else if (index == C0197b.ConstraintSet_android_scaleY) {
                    this.au = obtainStyledAttributes.getFloat(index, this.au);
                } else if (index == C0197b.ConstraintSet_android_transformPivotX) {
                    this.av = obtainStyledAttributes.getFloat(index, this.av);
                } else if (index == C0197b.ConstraintSet_android_transformPivotY) {
                    this.aw = obtainStyledAttributes.getFloat(index, this.aw);
                } else {
                    float f;
                    if (index == C0197b.ConstraintSet_android_translationX) {
                        f = this.ax;
                    } else if (index == C0197b.ConstraintSet_android_translationY) {
                        this.ay = obtainStyledAttributes.getFloat(index, this.ay);
                    } else if (index == C0197b.ConstraintSet_android_translationZ) {
                        f = this.az;
                    }
                    this.ax = obtainStyledAttributes.getFloat(index, f);
                }
                i++;
            }
        }
    }

    protected final /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C4708a();
    }

    public final /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4708a(getContext(), attributeSet);
    }

    protected final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0165a(layoutParams);
    }

    public final C0192c getConstraintSet() {
        if (this.f807a == null) {
            this.f807a = new C0192c();
        }
        C0192c c0192c = this.f807a;
        int childCount = getChildCount();
        c0192c.f806a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C4708a c4708a = (C4708a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!c0192c.f806a.containsKey(Integer.valueOf(id))) {
                c0192c.f806a.put(Integer.valueOf(id), new C0191a());
            }
            C0191a c0191a = (C0191a) c0192c.f806a.get(Integer.valueOf(id));
            if (childAt instanceof C0190b) {
                C0190b c0190b = (C0190b) childAt;
                c0191a.m384a(id, c4708a);
                if (c0190b instanceof C4707a) {
                    c0191a.as = 1;
                    C4707a c4707a = (C4707a) c0190b;
                    c0191a.ar = c4707a.getType();
                    c0191a.at = c4707a.getReferencedIds();
                }
            }
            c0191a.m384a(id, c4708a);
        }
        return this.f807a;
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
