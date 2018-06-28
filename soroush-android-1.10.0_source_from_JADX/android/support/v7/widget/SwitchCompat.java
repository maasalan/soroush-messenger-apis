package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.view.C0571r;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.p043c.p044a.C0683b;
import android.support.v7.p048f.C0700a;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class SwitchCompat extends CompoundButton {
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int[] CHECKED_STATE_SET = new int[]{16842912};
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final Property<SwitchCompat, Float> THUMB_POS = new Property<SwitchCompat, Float>(Float.class, "thumbPos") {
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.mThumbPosition);
        }

        public final void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    };
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private CharSequence mTextOff;
    private CharSequence mTextOn;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    private float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0635a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mTempRect = new Rect();
        this.mTextPaint = new TextPaint(1);
        Resources resources = getResources();
        this.mTextPaint.density = resources.getDisplayMetrics().density;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0644j.SwitchCompat, i, 0);
        this.mThumbDrawable = obtainStyledAttributes.getDrawable(C0644j.SwitchCompat_android_thumb);
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.setCallback(this);
        }
        this.mTrackDrawable = obtainStyledAttributes.getDrawable(C0644j.SwitchCompat_track);
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.setCallback(this);
        }
        this.mTextOn = obtainStyledAttributes.getText(C0644j.SwitchCompat_android_textOn);
        this.mTextOff = obtainStyledAttributes.getText(C0644j.SwitchCompat_android_textOff);
        this.mShowText = obtainStyledAttributes.getBoolean(C0644j.SwitchCompat_showText, true);
        this.mThumbTextPadding = obtainStyledAttributes.getDimensionPixelSize(C0644j.SwitchCompat_thumbTextPadding, 0);
        this.mSwitchMinWidth = obtainStyledAttributes.getDimensionPixelSize(C0644j.SwitchCompat_switchMinWidth, 0);
        this.mSwitchPadding = obtainStyledAttributes.getDimensionPixelSize(C0644j.SwitchCompat_switchPadding, 0);
        this.mSplitTrack = obtainStyledAttributes.getBoolean(C0644j.SwitchCompat_splitTrack, false);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C0644j.SwitchCompat_thumbTint);
        if (colorStateList != null) {
            this.mThumbTintList = colorStateList;
            this.mHasThumbTint = true;
        }
        Mode parseTintMode = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(C0644j.SwitchCompat_thumbTintMode, -1), null);
        if (this.mThumbTintMode != parseTintMode) {
            this.mThumbTintMode = parseTintMode;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            applyThumbTint();
        }
        colorStateList = obtainStyledAttributes.getColorStateList(C0644j.SwitchCompat_trackTint);
        if (colorStateList != null) {
            this.mTrackTintList = colorStateList;
            this.mHasTrackTint = true;
        }
        parseTintMode = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(C0644j.SwitchCompat_trackTintMode, -1), null);
        if (this.mTrackTintMode != parseTintMode) {
            this.mTrackTintMode = parseTintMode;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            applyTrackTint();
        }
        i = obtainStyledAttributes.getResourceId(C0644j.SwitchCompat_switchTextAppearance, 0);
        if (i != 0) {
            setSwitchTextAppearance(context, i);
        }
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void animateThumbToCheckedState(boolean z) {
        float f = z ? BallPulseIndicator.SCALE : 0.0f;
        this.mPositionAnimator = ObjectAnimator.ofFloat(this, THUMB_POS, new float[]{f});
        this.mPositionAnimator.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.mPositionAnimator.setAutoCancel(true);
        }
        this.mPositionAnimator.start();
    }

    private void applyThumbTint() {
        if (this.mThumbDrawable == null) {
            return;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            this.mThumbDrawable = this.mThumbDrawable.mutate();
            if (this.mHasThumbTint) {
                C0429a.m885a(this.mThumbDrawable, this.mThumbTintList);
            }
            if (this.mHasThumbTintMode) {
                C0429a.m888a(this.mThumbDrawable, this.mThumbTintMode);
            }
            if (this.mThumbDrawable.isStateful()) {
                this.mThumbDrawable.setState(getDrawableState());
            }
        }
    }

    private void applyTrackTint() {
        if (this.mTrackDrawable == null) {
            return;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            this.mTrackDrawable = this.mTrackDrawable.mutate();
            if (this.mHasTrackTint) {
                C0429a.m885a(this.mTrackDrawable, this.mTrackTintList);
            }
            if (this.mHasTrackTintMode) {
                C0429a.m888a(this.mTrackDrawable, this.mTrackTintMode);
            }
            if (this.mTrackDrawable.isStateful()) {
                this.mTrackDrawable.setState(getDrawableState());
            }
        }
    }

    private void cancelPositionAnimator() {
        if (this.mPositionAnimator != null) {
            this.mPositionAnimator.cancel();
        }
    }

    private void cancelSuperTouch(MotionEvent motionEvent) {
        motionEvent = MotionEvent.obtain(motionEvent);
        motionEvent.setAction(3);
        super.onTouchEvent(motionEvent);
        motionEvent.recycle();
    }

    private static float constrain(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((ViewUtils.isLayoutRtl(this) ? BallPulseIndicator.SCALE - this.mThumbPosition : this.mThumbPosition) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        if (this.mTrackDrawable == null) {
            return 0;
        }
        Rect rect = this.mTempRect;
        this.mTrackDrawable.getPadding(rect);
        Rect opticalBounds = this.mThumbDrawable != null ? DrawableUtils.getOpticalBounds(this.mThumbDrawable) : DrawableUtils.INSETS_NONE;
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - opticalBounds.left) - opticalBounds.right;
    }

    private boolean hitThumb(float f, float f2) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i = (this.mSwitchLeft + thumbOffset) - this.mTouchSlop;
        return f > ((float) i) && f < ((float) ((((this.mThumbWidth + i) + this.mTempRect.left) + this.mTempRect.right) + this.mTouchSlop)) && f2 > ((float) (this.mSwitchTop - this.mTouchSlop)) && f2 < ((float) (this.mSwitchBottom + this.mTouchSlop));
    }

    private Layout makeLayout(CharSequence charSequence) {
        if (this.mSwitchTransformationMethod != null) {
            charSequence = this.mSwitchTransformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.mTextPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, this.mTextPaint)) : 0, Alignment.ALIGN_NORMAL, BallPulseIndicator.SCALE, 0.0f, true);
    }

    private void setSwitchTypefaceByIndex(int i, int i2) {
        Typeface typeface;
        switch (i) {
            case 1:
                typeface = Typeface.SANS_SERIF;
                break;
            case 2:
                typeface = Typeface.SERIF;
                break;
            case 3:
                typeface = Typeface.MONOSPACE;
                break;
            default:
                typeface = null;
                break;
        }
        setSwitchTypeface(typeface, i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void stopDrag(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r0 = 0;
        r6.mTouchMode = r0;
        r1 = r7.getAction();
        r2 = 1;
        if (r1 != r2) goto L_0x0012;
    L_0x000a:
        r1 = r6.isEnabled();
        if (r1 == 0) goto L_0x0012;
    L_0x0010:
        r1 = r2;
        goto L_0x0013;
    L_0x0012:
        r1 = r0;
    L_0x0013:
        r3 = r6.isChecked();
        if (r1 == 0) goto L_0x004a;
    L_0x0019:
        r1 = r6.mVelocityTracker;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1.computeCurrentVelocity(r4);
        r1 = r6.mVelocityTracker;
        r1 = r1.getXVelocity();
        r4 = java.lang.Math.abs(r1);
        r5 = r6.mMinFlingVelocity;
        r5 = (float) r5;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 <= 0) goto L_0x0045;
    L_0x0031:
        r4 = android.support.v7.widget.ViewUtils.isLayoutRtl(r6);
        r5 = 0;
        if (r4 == 0) goto L_0x003f;
    L_0x0038:
        r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r1 >= 0) goto L_0x003d;
    L_0x003c:
        goto L_0x0043;
    L_0x003d:
        r2 = r0;
        goto L_0x0043;
    L_0x003f:
        r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r1 <= 0) goto L_0x003d;
    L_0x0043:
        r1 = r2;
        goto L_0x004b;
    L_0x0045:
        r1 = r6.getTargetCheckedState();
        goto L_0x004b;
    L_0x004a:
        r1 = r3;
    L_0x004b:
        if (r1 == r3) goto L_0x0050;
    L_0x004d:
        r6.playSoundEffect(r0);
    L_0x0050:
        r6.setChecked(r1);
        r6.cancelSuperTouch(r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.stopDrag(android.view.MotionEvent):void");
    }

    public void draw(Canvas canvas) {
        Rect rect = this.mTempRect;
        int i = this.mSwitchLeft;
        int i2 = this.mSwitchTop;
        int i3 = this.mSwitchRight;
        int i4 = this.mSwitchBottom;
        int thumbOffset = getThumbOffset() + i;
        Rect opticalBounds = this.mThumbDrawable != null ? DrawableUtils.getOpticalBounds(this.mThumbDrawable) : DrawableUtils.INSETS_NONE;
        if (this.mTrackDrawable != null) {
            int i5;
            int i6;
            this.mTrackDrawable.getPadding(rect);
            thumbOffset += rect.left;
            if (opticalBounds != null) {
                if (opticalBounds.left > rect.left) {
                    i += opticalBounds.left - rect.left;
                }
                i5 = opticalBounds.top > rect.top ? (opticalBounds.top - rect.top) + i2 : i2;
                if (opticalBounds.right > rect.right) {
                    i3 -= opticalBounds.right - rect.right;
                }
                if (opticalBounds.bottom > rect.bottom) {
                    i6 = i4 - (opticalBounds.bottom - rect.bottom);
                    this.mTrackDrawable.setBounds(i, i5, i3, i6);
                }
            } else {
                i5 = i2;
            }
            i6 = i4;
            this.mTrackDrawable.setBounds(i, i5, i3, i6);
        }
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.getPadding(rect);
            i = thumbOffset - rect.left;
            thumbOffset = (thumbOffset + this.mThumbWidth) + rect.right;
            this.mThumbDrawable.setBounds(i, i2, thumbOffset, i4);
            Drawable background = getBackground();
            if (background != null) {
                C0429a.m884a(background, i, i2, thumbOffset, i4);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.mThumbDrawable != null) {
            C0429a.m882a(this.mThumbDrawable, f, f2);
        }
        if (this.mTrackDrawable != null) {
            C0429a.m882a(this.mTrackDrawable, f, f2);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        drawable = this.mTrackDrawable;
        if (drawable != null && drawable.isStateful()) {
            i |= drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.mSwitchPadding;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.mSwitchPadding;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    public void jumpDrawablesToCurrentState() {
        if (VERSION.SDK_INT >= 14) {
            super.jumpDrawablesToCurrentState();
            if (this.mThumbDrawable != null) {
                this.mThumbDrawable.jumpToCurrentState();
            }
            if (this.mTrackDrawable != null) {
                this.mTrackDrawable.jumpToCurrentState();
            }
            if (this.mPositionAnimator != null && this.mPositionAnimator.isStarted()) {
                this.mPositionAnimator.end();
                this.mPositionAnimator = null;
            }
        }
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.mSwitchTop + rect.top;
        int i2 = this.mSwitchBottom - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (!this.mSplitTrack || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable2);
                drawable2.copyBounds(rect);
                rect.left += opticalBounds.left;
                rect.right -= opticalBounds.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.mTextColors != null) {
                this.mTextPaint.setColor(this.mTextColors.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                save = bounds.left + bounds.right;
            } else {
                save = getWidth();
            }
            canvas.translate((float) ((save / 2) - (layout.getWidth() / 2)), (float) (((i + i2) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                CharSequence stringBuilder = new StringBuilder();
                stringBuilder.append(text);
                stringBuilder.append(' ');
                stringBuilder.append(charSequence);
                accessibilityNodeInfo.setText(stringBuilder);
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        super.onLayout(z, i, i2, i3, i4);
        i = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            if (this.mTrackDrawable != null) {
                this.mTrackDrawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect opticalBounds = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
            i3 = Math.max(0, opticalBounds.left - rect.left);
            max = Math.max(0, opticalBounds.right - rect.right);
            i = i3;
        } else {
            max = 0;
        }
        if (ViewUtils.isLayoutRtl(this)) {
            i2 = getPaddingLeft() + i;
            i3 = ((this.mSwitchWidth + i2) - i) - max;
        } else {
            i3 = (getWidth() - getPaddingRight()) - max;
            i2 = ((i3 - this.mSwitchWidth) + i) + max;
        }
        max = getGravity() & 112;
        if (max == 16) {
            max = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.mSwitchHeight / 2);
        } else if (max != 80) {
            max = getPaddingTop();
        } else {
            i = getHeight() - getPaddingBottom();
            max = i - this.mSwitchHeight;
            this.mSwitchLeft = i2;
            this.mSwitchTop = max;
            this.mSwitchBottom = i;
            this.mSwitchRight = i3;
        }
        i = this.mSwitchHeight + max;
        this.mSwitchLeft = i2;
        this.mSwitchTop = max;
        this.mSwitchBottom = i;
        this.mSwitchRight = i3;
    }

    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = makeLayout(this.mTextOn);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = makeLayout(this.mTextOff);
            }
        }
        Rect rect = this.mTempRect;
        int i3 = 0;
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.getPadding(rect);
            intrinsicWidth = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = intrinsicWidth;
        }
        this.mThumbWidth = Math.max(this.mShowText ? Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + (this.mThumbTextPadding * 2) : 0, intrinsicWidth);
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.getPadding(rect);
            i3 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        intrinsicWidth = rect.left;
        int i4 = rect.right;
        if (this.mThumbDrawable != null) {
            Rect opticalBounds = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
            intrinsicWidth = Math.max(intrinsicWidth, opticalBounds.left);
            i4 = Math.max(i4, opticalBounds.right);
        }
        i4 = Math.max(this.mSwitchMinWidth, ((2 * this.mThumbWidth) + intrinsicWidth) + i4);
        intrinsicWidth = Math.max(i3, intrinsicHeight);
        this.mSwitchWidth = i4;
        this.mSwitchHeight = intrinsicWidth;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < intrinsicWidth) {
            setMeasuredDimension(getMeasuredWidthAndState(), intrinsicWidth);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        Object obj = isChecked() ? this.mTextOn : this.mTextOff;
        if (obj != null) {
            accessibilityEvent.getText().add(obj);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mVelocityTracker.addMovement(motionEvent);
        float x;
        float y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                if (isEnabled() && hitThumb(x, y)) {
                    this.mTouchMode = 1;
                    this.mTouchX = x;
                    this.mTouchY = y;
                    break;
                }
            case 1:
            case 3:
                if (this.mTouchMode != 2) {
                    this.mTouchMode = 0;
                    this.mVelocityTracker.clear();
                    break;
                }
                stopDrag(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            case 2:
                switch (this.mTouchMode) {
                    case 0:
                        break;
                    case 1:
                        x = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x - this.mTouchX) > ((float) this.mTouchSlop) || Math.abs(y2 - this.mTouchY) > ((float) this.mTouchSlop)) {
                            this.mTouchMode = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.mTouchX = x;
                            this.mTouchY = y2;
                            return true;
                        }
                    case 2:
                        float x2 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        y = x2 - this.mTouchX;
                        x = thumbScrollRange != 0 ? y / ((float) thumbScrollRange) : y > 0.0f ? BallPulseIndicator.SCALE : -1.0f;
                        if (ViewUtils.isLayoutRtl(this)) {
                            x = -x;
                        }
                        x = constrain(this.mThumbPosition + x, 0.0f, BallPulseIndicator.SCALE);
                        if (x != this.mThumbPosition) {
                            this.mTouchX = x2;
                            setThumbPosition(x);
                        }
                        return true;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        z = isChecked();
        if (getWindowToken() == null || !C0571r.m1326D(this)) {
            cancelPositionAnimator();
            setThumbPosition(z ? BallPulseIndicator.SCALE : 0.0f);
            return;
        }
        animateThumbToCheckedState(z);
    }

    public void setShowText(boolean z) {
        if (this.mShowText != z) {
            this.mShowText = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.mSplitTrack = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.mSwitchMinWidth = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.mSwitchPadding = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, C0644j.TextAppearance);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C0644j.TextAppearance_android_textColor);
        if (colorStateList == null) {
            colorStateList = getTextColors();
        }
        this.mTextColors = colorStateList;
        i = obtainStyledAttributes.getDimensionPixelSize(C0644j.TextAppearance_android_textSize, 0);
        if (i != 0) {
            float f = (float) i;
            if (f != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f);
                requestLayout();
            }
        }
        setSwitchTypefaceByIndex(obtainStyledAttributes.getInt(C0644j.TextAppearance_android_typeface, -1), obtainStyledAttributes.getInt(C0644j.TextAppearance_android_textStyle, -1));
        this.mSwitchTransformationMethod = obtainStyledAttributes.getBoolean(C0644j.TextAppearance_textAllCaps, false) ? new C0700a(getContext()) : null;
        obtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() != null && !this.mTextPaint.getTypeface().equals(typeface)) || (this.mTextPaint.getTypeface() == null && typeface != null)) {
            this.mTextPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            typeface = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(typeface);
            int style = ((typeface != null ? typeface.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.mTextPaint;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            textPaint = this.mTextPaint;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint.setTextSkewX(f);
            return;
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        this.mTextOff = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.mTextOn = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        if (this.mThumbDrawable != null) {
            this.mThumbDrawable.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0683b.m1656b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.mThumbTextPadding = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        applyThumbTint();
    }

    public void setThumbTintMode(Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        applyThumbTint();
    }

    public void setTrackDrawable(Drawable drawable) {
        if (this.mTrackDrawable != null) {
            this.mTrackDrawable.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0683b.m1656b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        applyTrackTint();
    }

    public void setTrackTintMode(Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        applyTrackTint();
    }

    public void toggle() {
        setChecked(isChecked() ^ 1);
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!(super.verifyDrawable(drawable) || drawable == this.mThumbDrawable)) {
            if (drawable != this.mTrackDrawable) {
                return false;
            }
        }
        return true;
    }
}
