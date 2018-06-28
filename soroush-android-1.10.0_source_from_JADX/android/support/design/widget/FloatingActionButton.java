package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0249a.C0241d;
import android.support.design.C0249a.C0247j;
import android.support.design.C0249a.C0248k;
import android.support.design.widget.C0318j.C03153;
import android.support.design.widget.C0318j.C0316c;
import android.support.design.widget.CoordinatorLayout.C0270a;
import android.support.design.widget.CoordinatorLayout.C0271b;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.view.C0571r;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

@C0271b(a = Behavior.class)
public class FloatingActionButton extends C0335z {
    int f13079a;
    boolean f13080b;
    final Rect f13081c;
    private ColorStateList f13082d;
    private Mode f13083e;
    private int f13084f;
    private int f13085g;
    private int f13086h;
    private int f13087i;
    private final Rect f13088j;
    private AppCompatImageHelper f13089k;
    private C0318j f13090l;

    public static abstract class C0276a {
    }

    public static class Behavior extends C0270a<FloatingActionButton> {
        private Rect f13075a;
        private C0276a f13076b;
        private boolean f13077c;

        public Behavior() {
            this.f13077c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.FloatingActionButton_Behavior_Layout);
            this.f13077c = obtainStyledAttributes.getBoolean(C0248k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        private boolean m8748a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m8750a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f13075a == null) {
                this.f13075a = new Rect();
            }
            Rect rect = this.f13075a;
            C0331u.m651a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m8766b(this.f13076b, false);
            } else {
                floatingActionButton.m8764a(this.f13076b, false);
            }
            return true;
        }

        private boolean m8749a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List a = coordinatorLayout.m14910a((View) floatingActionButton);
            int size = a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view = (View) a.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (m8751b(view) && m8752b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m8748a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.m14912a((View) floatingActionButton, i);
            Rect rect = floatingActionButton.f13081c;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0273d c0273d = (C0273d) floatingActionButton.getLayoutParams();
                size = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - c0273d.rightMargin ? rect.right : floatingActionButton.getLeft() <= c0273d.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - c0273d.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= c0273d.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C0571r.m1359d((View) floatingActionButton, i2);
                }
                if (size != 0) {
                    C0571r.m1363e((View) floatingActionButton, size);
                }
            }
            return true;
        }

        private boolean m8750a(View view, FloatingActionButton floatingActionButton) {
            return this.f13077c && ((C0273d) floatingActionButton.getLayoutParams()).f992f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private static boolean m8751b(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof C0273d ? ((C0273d) layoutParams).f987a instanceof BottomSheetBehavior : false;
        }

        private boolean m8752b(View view, FloatingActionButton floatingActionButton) {
            if (!m8750a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0273d) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.m8766b(this.f13076b, false);
            } else {
                floatingActionButton.m8764a(this.f13076b, false);
            }
            return true;
        }

        public final void mo159a(C0273d c0273d) {
            if (c0273d.f994h == 0) {
                c0273d.f994h = 80;
            }
        }

        public final /* synthetic */ boolean mo160a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m8748a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (m8751b(view2)) {
                m8752b(view2, floatingActionButton);
            }
            return false;
        }

        public final /* synthetic */ boolean mo161a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f13081c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    private class C4738b implements C0321o {
        final /* synthetic */ FloatingActionButton f13078a;

        C4738b(FloatingActionButton floatingActionButton) {
            this.f13078a = floatingActionButton;
        }

        public final float mo162a() {
            return ((float) this.f13078a.getSizeDimension()) / 2.0f;
        }

        public final void mo163a(int i, int i2, int i3, int i4) {
            this.f13078a.f13081c.set(i, i2, i3, i4);
            this.f13078a.setPadding(i + this.f13078a.f13079a, i2 + this.f13078a.f13079a, i3 + this.f13078a.f13079a, i4 + this.f13078a.f13079a);
        }

        public final void mo164a(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public final boolean mo165b() {
            return this.f13078a.f13080b;
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13081c = new Rect();
        this.f13088j = new Rect();
        C0330t.m650a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.FloatingActionButton, i, C0247j.Widget_Design_FloatingActionButton);
        this.f13082d = obtainStyledAttributes.getColorStateList(C0248k.FloatingActionButton_backgroundTint);
        this.f13083e = C0333x.m656a(obtainStyledAttributes.getInt(C0248k.FloatingActionButton_backgroundTintMode, -1));
        this.f13085g = obtainStyledAttributes.getColor(C0248k.FloatingActionButton_rippleColor, 0);
        this.f13086h = obtainStyledAttributes.getInt(C0248k.FloatingActionButton_fabSize, -1);
        this.f13084f = obtainStyledAttributes.getDimensionPixelSize(C0248k.FloatingActionButton_borderWidth, 0);
        float dimension = obtainStyledAttributes.getDimension(C0248k.FloatingActionButton_elevation, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C0248k.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f13080b = obtainStyledAttributes.getBoolean(C0248k.FloatingActionButton_useCompatPadding, false);
        obtainStyledAttributes.recycle();
        this.f13089k = new AppCompatImageHelper(this);
        this.f13089k.loadFromAttributes(attributeSet, i);
        this.f13087i = (int) getResources().getDimension(C0241d.design_fab_image_size);
        getImpl().mo192a(this.f13082d, this.f13083e, this.f13085g, this.f13084f);
        getImpl().m618a(dimension);
        C0318j impl = getImpl();
        if (impl.f1243j != dimension2) {
            impl.f1243j = dimension2;
            impl.mo190a(impl.f1242i, dimension2);
        }
    }

    private static int m8761a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            i = Math.min(i, i2);
        } else if (mode != 0) {
            return mode != 1073741824 ? i : i2;
        }
        return i;
    }

    private C0316c m8762a(final C0276a c0276a) {
        return c0276a == null ? null : new C0316c(this) {
            final /* synthetic */ FloatingActionButton f13074b;
        };
    }

    private C0318j getImpl() {
        if (this.f13090l == null) {
            this.f13090l = VERSION.SDK_INT >= 21 ? new C4756k(this, new C4738b(this)) : new C0318j(this, new C4738b(this));
        }
        return this.f13090l;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8764a(android.support.design.widget.FloatingActionButton.C0276a r6, boolean r7) {
        /*
        r5 = this;
        r0 = r5.getImpl();
        r6 = r5.m8762a(r6);
        r1 = r0.f1244o;
        r1 = r1.getVisibility();
        r2 = 2;
        r3 = 0;
        r4 = 1;
        if (r1 == 0) goto L_0x001a;
    L_0x0013:
        r1 = r0.f1235b;
        if (r1 != r2) goto L_0x0018;
    L_0x0017:
        goto L_0x001e;
    L_0x0018:
        r4 = r3;
        goto L_0x001e;
    L_0x001a:
        r1 = r0.f1235b;
        if (r1 == r4) goto L_0x0018;
    L_0x001e:
        if (r4 != 0) goto L_0x0086;
    L_0x0020:
        r1 = r0.f1244o;
        r1 = r1.animate();
        r1.cancel();
        r1 = r0.m632i();
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r1 == 0) goto L_0x0072;
    L_0x0031:
        r0.f1235b = r2;
        r1 = r0.f1244o;
        r1 = r1.getVisibility();
        if (r1 == 0) goto L_0x004b;
    L_0x003b:
        r1 = r0.f1244o;
        r2 = 0;
        r1.setAlpha(r2);
        r1 = r0.f1244o;
        r1.setScaleY(r2);
        r1 = r0.f1244o;
        r1.setScaleX(r2);
    L_0x004b:
        r1 = r0.f1244o;
        r1 = r1.animate();
        r1 = r1.scaleX(r4);
        r1 = r1.scaleY(r4);
        r1 = r1.alpha(r4);
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r1 = r1.setDuration(r2);
        r2 = android.support.design.widget.C0296a.f1126d;
        r1 = r1.setInterpolator(r2);
        r2 = new android.support.design.widget.j$2;
        r2.<init>(r0, r7, r6);
        r1.setListener(r2);
        return;
    L_0x0072:
        r6 = r0.f1244o;
        r6.m660a(r3, r7);
        r6 = r0.f1244o;
        r6.setAlpha(r4);
        r6 = r0.f1244o;
        r6.setScaleY(r4);
        r6 = r0.f1244o;
        r6.setScaleX(r4);
    L_0x0086:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.FloatingActionButton.a(android.support.design.widget.FloatingActionButton$a, boolean):void");
    }

    public final boolean m8765a(Rect rect) {
        if (!C0571r.m1326D(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        rect.left += this.f13081c.left;
        rect.top += this.f13081c.top;
        rect.right -= this.f13081c.right;
        rect.bottom -= this.f13081c.bottom;
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8766b(android.support.design.widget.FloatingActionButton.C0276a r6, boolean r7) {
        /*
        r5 = this;
        r0 = r5.getImpl();
        r6 = r5.m8762a(r6);
        r1 = r0.f1244o;
        r1 = r1.getVisibility();
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x0018;
    L_0x0012:
        r1 = r0.f1235b;
        if (r1 != r3) goto L_0x001e;
    L_0x0016:
        r2 = r3;
        goto L_0x001e;
    L_0x0018:
        r1 = r0.f1235b;
        r4 = 2;
        if (r1 == r4) goto L_0x001e;
    L_0x001d:
        goto L_0x0016;
    L_0x001e:
        if (r2 != 0) goto L_0x0064;
    L_0x0020:
        r1 = r0.f1244o;
        r1 = r1.animate();
        r1.cancel();
        r1 = r0.m632i();
        if (r1 == 0) goto L_0x0059;
    L_0x002f:
        r0.f1235b = r3;
        r1 = r0.f1244o;
        r1 = r1.animate();
        r2 = 0;
        r1 = r1.scaleX(r2);
        r1 = r1.scaleY(r2);
        r1 = r1.alpha(r2);
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r1 = r1.setDuration(r2);
        r2 = android.support.design.widget.C0296a.f1125c;
        r1 = r1.setInterpolator(r2);
        r2 = new android.support.design.widget.j$1;
        r2.<init>(r0, r7, r6);
        r1.setListener(r2);
        return;
    L_0x0059:
        r6 = r0.f1244o;
        if (r7 == 0) goto L_0x0060;
    L_0x005d:
        r0 = 8;
        goto L_0x0061;
    L_0x0060:
        r0 = 4;
    L_0x0061:
        r6.m660a(r0, r7);
    L_0x0064:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.FloatingActionButton.b(android.support.design.widget.FloatingActionButton$a, boolean):void");
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo194a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f13082d;
    }

    public Mode getBackgroundTintMode() {
        return this.f13083e;
    }

    public float getCompatElevation() {
        return getImpl().mo189a();
    }

    public Drawable getContentBackground() {
        return getImpl().f1241h;
    }

    public int getRippleColor() {
        return this.f13085g;
    }

    public int getSize() {
        return this.f13086h;
    }

    int getSizeDimension() {
        Resources resources;
        int i = this.f13086h;
        while (true) {
            resources = getResources();
            if (i != -1) {
                break;
            }
            i = Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? 1 : 0;
        }
        return resources.getDimensionPixelSize(i != 1 ? C0241d.design_fab_size_normal : C0241d.design_fab_size_mini);
    }

    public boolean getUseCompatPadding() {
        return this.f13080b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo195b();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0318j impl = getImpl();
        if (impl.mo198e()) {
            if (impl.f1246q == null) {
                impl.f1246q = new C03153(impl);
            }
            impl.f1244o.getViewTreeObserver().addOnPreDrawListener(impl.f1246q);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0318j impl = getImpl();
        if (impl.f1246q != null) {
            impl.f1244o.getViewTreeObserver().removeOnPreDrawListener(impl.f1246q);
            impl.f1246q = null;
        }
    }

    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f13079a = (sizeDimension - this.f13087i) / 2;
        getImpl().m627d();
        i = Math.min(m8761a(sizeDimension, i), m8761a(sizeDimension, i2));
        setMeasuredDimension((this.f13081c.left + i) + this.f13081c.right, (i + this.f13081c.top) + this.f13081c.bottom);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (m8765a(this.f13088j) && !this.f13088j.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f13082d != colorStateList) {
            this.f13082d = colorStateList;
            C0318j impl = getImpl();
            if (impl.f1238e != null) {
                C0429a.m885a(impl.f1238e, colorStateList);
            }
            if (impl.f1240g != null) {
                impl.f1240g.m578a(colorStateList);
            }
        }
    }

    public void setBackgroundTintMode(Mode mode) {
        if (this.f13083e != mode) {
            this.f13083e = mode;
            C0318j impl = getImpl();
            if (impl.f1238e != null) {
                C0429a.m888a(impl.f1238e, mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m618a(f);
    }

    public void setImageResource(int i) {
        this.f13089k.setImageResource(i);
    }

    public void setRippleColor(int i) {
        if (this.f13085g != i) {
            this.f13085g = i;
            getImpl().mo191a(i);
        }
    }

    public void setSize(int i) {
        if (i != this.f13086h) {
            this.f13086h = i;
            requestLayout();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f13080b != z) {
            this.f13080b = z;
            getImpl().mo197c();
        }
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }
}
