package android.support.p023b.p024a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.p029a.p030a.C0344c;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.p038g.C4813a;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public final class C6334c extends C4697h implements C0141b {
    final Callback f17305a;
    private C0143a f17306c;
    private Context f17307d;
    private ArgbEvaluator f17308e;
    private AnimatorListener f17309f;
    private ArrayList<Object> f17310g;

    class C01421 implements Callback {
        final /* synthetic */ C6334c f427a;

        C01421(C6334c c6334c) {
            this.f427a = c6334c;
        }

        public final void invalidateDrawable(Drawable drawable) {
            this.f427a.invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.f427a.scheduleSelf(runnable, j);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f427a.unscheduleSelf(runnable);
        }
    }

    private static class C0143a extends ConstantState {
        int f428a;
        C6335i f429b;
        AnimatorSet f430c;
        ArrayList<Animator> f431d;
        C4813a<Animator, String> f432e;

        public final int getChangingConfigurations() {
            return this.f428a;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class C0144b extends ConstantState {
        private final ConstantState f433a;

        public C0144b(ConstantState constantState) {
            this.f433a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f433a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f433a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            Drawable c6334c = new C6334c();
            c6334c.b = this.f433a.newDrawable();
            c6334c.b.setCallback(c6334c.f17305a);
            return c6334c;
        }

        public final Drawable newDrawable(Resources resources) {
            Drawable c6334c = new C6334c();
            c6334c.b = this.f433a.newDrawable(resources);
            c6334c.b.setCallback(c6334c.f17305a);
            return c6334c;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c6334c = new C6334c();
            c6334c.b = this.f433a.newDrawable(resources, theme);
            c6334c.b.setCallback(c6334c.f17305a);
            return c6334c;
        }
    }

    C6334c() {
        this(null, (byte) 0);
    }

    private C6334c(Context context) {
        this(context, (byte) 0);
    }

    private C6334c(Context context, byte b) {
        this.f17308e = null;
        this.f17309f = null;
        this.f17310g = null;
        this.f17305a = new C01421(this);
        this.f17307d = context;
        this.f17306c = new C0143a();
    }

    public static C6334c m14847a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C6334c c6334c = new C6334c(context);
        c6334c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c6334c;
    }

    private void m14848a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m14848a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f17308e == null) {
                    this.f17308e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f17308e);
            }
        }
    }

    public final void applyTheme(Theme theme) {
        if (this.b != null) {
            C0429a.m886a(this.b, theme);
        }
    }

    public final boolean canApplyTheme() {
        return this.b != null ? C0429a.m893d(this.b) : false;
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        this.f17306c.f429b.draw(canvas);
        if (this.f17306c.f430c.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.b != null ? C0429a.m892c(this.b) : this.f17306c.f429b.getAlpha();
    }

    public final int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.f17306c.f428a;
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final ConstantState getConstantState() {
        return (this.b == null || VERSION.SDK_INT < 24) ? null : new C0144b(this.b.getConstantState());
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : this.f17306c.f429b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : this.f17306c.f429b.getIntrinsicWidth();
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.b != null ? this.b.getOpacity() : this.f17306c.f429b.getOpacity();
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            C0429a.m887a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                TypedArray a;
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    a = C0344c.m675a(resources, theme, attributeSet, C0140a.f419e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C6335i a2 = C6335i.m14851a(resources, resourceId, theme);
                        a2.f17313d = false;
                        a2.setCallback(this.f17305a);
                        if (this.f17306c.f429b != null) {
                            this.f17306c.f429b.setCallback(null);
                        }
                        this.f17306c.f429b = a2;
                    }
                } else if ("target".equals(name)) {
                    a = resources.obtainAttributes(attributeSet, C0140a.f420f);
                    String string = a.getString(0);
                    int resourceId2 = a.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f17307d != null) {
                            Context context = this.f17307d;
                            Animator loadAnimator = VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, resourceId2) : C0147e.m216a(context, context.getResources(), context.getTheme(), resourceId2);
                            loadAnimator.setTarget(this.f17306c.f429b.f17312c.f471b.f462h.get(string));
                            if (VERSION.SDK_INT < 21) {
                                m14848a(loadAnimator);
                            }
                            if (this.f17306c.f431d == null) {
                                this.f17306c.f431d = new ArrayList();
                                this.f17306c.f432e = new C4813a();
                            }
                            this.f17306c.f431d.add(loadAnimator);
                            this.f17306c.f432e.put(loadAnimator, string);
                        } else {
                            a.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                a.recycle();
            }
            eventType = xmlPullParser.next();
        }
        C0143a c0143a = this.f17306c;
        if (c0143a.f430c == null) {
            c0143a.f430c = new AnimatorSet();
        }
        c0143a.f430c.playTogether(c0143a.f431d);
    }

    public final boolean isAutoMirrored() {
        return this.b != null ? C0429a.m890b(this.b) : this.f17306c.f429b.isAutoMirrored();
    }

    public final boolean isRunning() {
        return this.b != null ? ((AnimatedVectorDrawable) this.b).isRunning() : this.f17306c.f430c.isRunning();
    }

    public final boolean isStateful() {
        return this.b != null ? this.b.isStateful() : this.f17306c.f429b.isStateful();
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        }
        return this;
    }

    protected final void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            this.f17306c.f429b.setBounds(rect);
        }
    }

    protected final boolean onLevelChange(int i) {
        return this.b != null ? this.b.setLevel(i) : this.f17306c.f429b.setLevel(i);
    }

    protected final boolean onStateChange(int[] iArr) {
        return this.b != null ? this.b.setState(iArr) : this.f17306c.f429b.setState(iArr);
    }

    public final void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else {
            this.f17306c.f429b.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.b != null) {
            C0429a.m889a(this.b, z);
        } else {
            this.f17306c.f429b.setAutoMirrored(z);
        }
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.f17306c.f429b.setColorFilter(colorFilter);
        }
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final void setTint(int i) {
        if (this.b != null) {
            C0429a.m883a(this.b, i);
        } else {
            this.f17306c.f429b.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0429a.m885a(this.b, colorStateList);
        } else {
            this.f17306c.f429b.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.b != null) {
            C0429a.m888a(this.b, mode);
        } else {
            this.f17306c.f429b.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        this.f17306c.f429b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).start();
        } else if (!this.f17306c.f430c.isStarted()) {
            this.f17306c.f430c.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).stop();
        } else {
            this.f17306c.f430c.end();
        }
    }
}
