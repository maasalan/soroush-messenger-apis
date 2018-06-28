package com.felipecsl.asymmetricgridview.library.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;

@TargetApi(11)
public class C1607f extends LinearLayout {
    private final C1605a f4999a;

    public C1607f(Context context) {
        C1605a c1605a = null;
        super(context, null);
        if (C1605a.f4986a) {
            c1605a = C1605a.m4140a(this);
        }
        this.f4999a = c1605a;
    }

    public float getAlpha() {
        return C1605a.f4986a ? this.f4999a.f4989c : super.getAlpha();
    }

    public float getTranslationX() {
        return C1605a.f4986a ? this.f4999a.f4990d : super.getTranslationX();
    }

    public void setAlpha(float f) {
        if (C1605a.f4986a) {
            C1605a c1605a = this.f4999a;
            if (c1605a.f4989c != f) {
                c1605a.f4989c = f;
                View view = (View) c1605a.f4988b.get();
                if (view != null) {
                    view.invalidate();
                }
            }
            return;
        }
        super.setAlpha(f);
    }

    public void setTranslationX(float f) {
        if (C1605a.f4986a) {
            Animation animation = this.f4999a;
            if (animation.f4990d != f) {
                View view = (View) animation.f4988b.get();
                if (view != null) {
                    animation.m4142a(animation.f4991e, view);
                }
                animation.f4990d = f;
                View view2 = (View) animation.f4988b.get();
                if (view2 != null) {
                    view = (View) view2.getParent();
                    if (view != null) {
                        view2.setAnimation(animation);
                        RectF rectF = animation.f4992f;
                        animation.m4142a(rectF, view2);
                        rectF.union(animation.f4991e);
                        view.invalidate((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                    }
                }
            }
            return;
        }
        super.setTranslationX(f);
    }

    public void setVisibility(int i) {
        if (this.f4999a != null) {
            if (i == 8) {
                clearAnimation();
            } else if (i == 0) {
                setAnimation(this.f4999a);
            }
        }
        super.setVisibility(i);
    }
}
