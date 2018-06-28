package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.p031b.p032a.C0429a;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

final class C4756k extends C0318j {
    private InsetDrawable f13132r;

    static class C0319a extends GradientDrawable {
        C0319a() {
        }

        public final boolean isStateful() {
            return true;
        }
    }

    C4756k(C0335z c0335z, C0321o c0321o) {
        super(c0335z, c0321o);
    }

    public final float mo189a() {
        return this.o.getElevation();
    }

    final void mo190a(float f, float f2) {
        if (VERSION.SDK_INT == 21) {
            if (this.o.isEnabled()) {
                this.o.setElevation(f);
                if (this.o.isFocused() || this.o.isPressed()) {
                    this.o.setTranslationZ(f2);
                }
            } else {
                this.o.setElevation(0.0f);
            }
            this.o.setTranslationZ(0.0f);
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            Animator animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.o, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(k, animatorSet);
            animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.o, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(l, animatorSet);
            Animator animatorSet2 = new AnimatorSet();
            List arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.o, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, new float[]{this.o.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet2.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            animatorSet2.setInterpolator(a);
            stateListAnimator.addState(m, animatorSet2);
            Animator animatorSet3 = new AnimatorSet();
            animatorSet3.play(ObjectAnimator.ofFloat(this.o, "elevation", new float[]{0.0f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.o, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(0));
            animatorSet3.setInterpolator(a);
            stateListAnimator.addState(n, animatorSet3);
            this.o.setStateListAnimator(stateListAnimator);
        }
        if (this.p.mo165b()) {
            m627d();
        }
    }

    final void mo191a(int i) {
        if (this.f instanceof RippleDrawable) {
            ((RippleDrawable) this.f).setColor(ColorStateList.valueOf(i));
        } else {
            super.mo191a(i);
        }
    }

    final void mo192a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        Drawable layerDrawable;
        this.e = C0429a.m896g(m630g());
        C0429a.m885a(this.e, colorStateList);
        if (mode != null) {
            C0429a.m888a(this.e, mode);
        }
        if (i2 > 0) {
            this.g = m617a(i2, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{this.g, this.e});
        } else {
            this.g = null;
            layerDrawable = this.e;
        }
        this.f = new RippleDrawable(ColorStateList.valueOf(i), layerDrawable, null);
        this.h = this.f;
        this.p.mo164a(this.f);
    }

    final void mo193a(Rect rect) {
        if (this.p.mo165b()) {
            float a = this.p.mo162a();
            float elevation = this.o.getElevation() + this.j;
            int ceil = (int) Math.ceil((double) C4757n.m8818b(elevation, a, false));
            int ceil2 = (int) Math.ceil((double) C4757n.m8817a(elevation, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    final void mo194a(int[] iArr) {
    }

    final void mo195b() {
    }

    final void mo196b(Rect rect) {
        C0321o c0321o;
        Drawable drawable;
        if (this.p.mo165b()) {
            this.f13132r = new InsetDrawable(this.f, rect.left, rect.top, rect.right, rect.bottom);
            c0321o = this.p;
            drawable = this.f13132r;
        } else {
            c0321o = this.p;
            drawable = this.f;
        }
        c0321o.mo164a(drawable);
    }

    final void mo197c() {
        m627d();
    }

    final boolean mo198e() {
        return false;
    }

    final C0309e mo199f() {
        return new C4752f();
    }

    final GradientDrawable mo200h() {
        return new C0319a();
    }
}
