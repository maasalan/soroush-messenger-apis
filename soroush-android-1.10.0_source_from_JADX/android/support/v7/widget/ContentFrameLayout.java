package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.C0571r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
    private OnAttachListener mAttachListener;
    private final Rect mDecorPadding;
    private TypedValue mFixedHeightMajor;
    private TypedValue mFixedHeightMinor;
    private TypedValue mFixedWidthMajor;
    private TypedValue mFixedWidthMinor;
    private TypedValue mMinWidthMajor;
    private TypedValue mMinWidthMinor;

    public interface OnAttachListener {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDecorPadding = new Rect();
    }

    public void dispatchFitSystemWindows(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.mFixedHeightMajor == null) {
            this.mFixedHeightMajor = new TypedValue();
        }
        return this.mFixedHeightMajor;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.mFixedHeightMinor == null) {
            this.mFixedHeightMinor = new TypedValue();
        }
        return this.mFixedHeightMinor;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.mFixedWidthMajor == null) {
            this.mFixedWidthMajor = new TypedValue();
        }
        return this.mFixedWidthMajor;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.mFixedWidthMinor == null) {
            this.mFixedWidthMinor = new TypedValue();
        }
        return this.mFixedWidthMinor;
    }

    public TypedValue getMinWidthMajor() {
        if (this.mMinWidthMajor == null) {
            this.mMinWidthMajor = new TypedValue();
        }
        return this.mMinWidthMajor;
    }

    public TypedValue getMinWidthMinor() {
        if (this.mMinWidthMinor == null) {
            this.mMinWidthMinor = new TypedValue();
        }
        return this.mMinWidthMinor;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mAttachListener != null) {
            this.mAttachListener.onAttachedFromWindow();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mAttachListener != null) {
            this.mAttachListener.onDetachedFromWindow();
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        Object obj;
        TypedValue typedValue;
        float dimension;
        TypedValue typedValue2;
        float dimension2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Object obj2 = 1;
        Object obj3 = displayMetrics.widthPixels < displayMetrics.heightPixels ? 1 : null;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue3 = obj3 != null ? this.mFixedWidthMinor : this.mFixedWidthMajor;
            if (!(typedValue3 == null || typedValue3.type == 0)) {
                float dimension3;
                if (typedValue3.type == 5) {
                    dimension3 = typedValue3.getDimension(displayMetrics);
                } else if (typedValue3.type == 6) {
                    dimension3 = typedValue3.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                } else {
                    i3 = 0;
                    if (i3 > 0) {
                        i3 = MeasureSpec.makeMeasureSpec(Math.min(i3 - (this.mDecorPadding.left + this.mDecorPadding.right), MeasureSpec.getSize(i)), 1073741824);
                        obj = 1;
                        if (mode2 == Integer.MIN_VALUE) {
                            typedValue = obj3 != null ? this.mFixedHeightMajor : this.mFixedHeightMinor;
                            if (!(typedValue == null || typedValue.type == 0)) {
                                if (typedValue.type != 5) {
                                    dimension = typedValue.getDimension(displayMetrics);
                                } else if (typedValue.type == 6) {
                                    dimension = typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels);
                                } else {
                                    mode2 = 0;
                                    if (mode2 > 0) {
                                        i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.mDecorPadding.top + this.mDecorPadding.bottom), MeasureSpec.getSize(i2)), 1073741824);
                                    }
                                }
                                mode2 = (int) dimension;
                                if (mode2 > 0) {
                                    i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.mDecorPadding.top + this.mDecorPadding.bottom), MeasureSpec.getSize(i2)), 1073741824);
                                }
                            }
                        }
                        super.onMeasure(i3, i2);
                        mode2 = getMeasuredWidth();
                        i3 = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
                        if (obj == null && mode == Integer.MIN_VALUE) {
                            typedValue2 = obj3 != null ? this.mMinWidthMinor : this.mMinWidthMajor;
                            if (!(typedValue2 == null || typedValue2.type == 0)) {
                                if (typedValue2.type != 5) {
                                    dimension2 = typedValue2.getDimension(displayMetrics);
                                } else if (typedValue2.type == 6) {
                                    dimension2 = typedValue2.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                                } else {
                                    i = 0;
                                    if (i > 0) {
                                        i -= this.mDecorPadding.left + this.mDecorPadding.right;
                                    }
                                    if (mode2 < i) {
                                        i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
                                        if (obj2 == null) {
                                            super.onMeasure(i3, i2);
                                        }
                                    }
                                }
                                i = (int) dimension2;
                                if (i > 0) {
                                    i -= this.mDecorPadding.left + this.mDecorPadding.right;
                                }
                                if (mode2 < i) {
                                    i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
                                    if (obj2 == null) {
                                        super.onMeasure(i3, i2);
                                    }
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 == null) {
                            super.onMeasure(i3, i2);
                        }
                    }
                }
                i3 = (int) dimension3;
                if (i3 > 0) {
                    i3 = MeasureSpec.makeMeasureSpec(Math.min(i3 - (this.mDecorPadding.left + this.mDecorPadding.right), MeasureSpec.getSize(i)), 1073741824);
                    obj = 1;
                    if (mode2 == Integer.MIN_VALUE) {
                        if (obj3 != null) {
                        }
                        if (typedValue.type != 5) {
                            dimension = typedValue.getDimension(displayMetrics);
                        } else if (typedValue.type == 6) {
                            mode2 = 0;
                            if (mode2 > 0) {
                                i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.mDecorPadding.top + this.mDecorPadding.bottom), MeasureSpec.getSize(i2)), 1073741824);
                            }
                        } else {
                            dimension = typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels);
                        }
                        mode2 = (int) dimension;
                        if (mode2 > 0) {
                            i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.mDecorPadding.top + this.mDecorPadding.bottom), MeasureSpec.getSize(i2)), 1073741824);
                        }
                    }
                    super.onMeasure(i3, i2);
                    mode2 = getMeasuredWidth();
                    i3 = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
                    if (obj3 != null) {
                    }
                    if (typedValue2.type != 5) {
                        dimension2 = typedValue2.getDimension(displayMetrics);
                    } else if (typedValue2.type == 6) {
                        i = 0;
                        if (i > 0) {
                            i -= this.mDecorPadding.left + this.mDecorPadding.right;
                        }
                        if (mode2 < i) {
                            i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
                            if (obj2 == null) {
                                super.onMeasure(i3, i2);
                            }
                        }
                        obj2 = null;
                        if (obj2 == null) {
                            super.onMeasure(i3, i2);
                        }
                    } else {
                        dimension2 = typedValue2.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
                    }
                    i = (int) dimension2;
                    if (i > 0) {
                        i -= this.mDecorPadding.left + this.mDecorPadding.right;
                    }
                    if (mode2 < i) {
                        i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
                        if (obj2 == null) {
                            super.onMeasure(i3, i2);
                        }
                    }
                    obj2 = null;
                    if (obj2 == null) {
                        super.onMeasure(i3, i2);
                    }
                }
            }
        }
        i3 = i;
        obj = null;
        if (mode2 == Integer.MIN_VALUE) {
            if (obj3 != null) {
            }
            if (typedValue.type != 5) {
                dimension = typedValue.getDimension(displayMetrics);
            } else if (typedValue.type == 6) {
                dimension = typedValue.getFraction((float) displayMetrics.heightPixels, (float) displayMetrics.heightPixels);
            } else {
                mode2 = 0;
                if (mode2 > 0) {
                    i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.mDecorPadding.top + this.mDecorPadding.bottom), MeasureSpec.getSize(i2)), 1073741824);
                }
            }
            mode2 = (int) dimension;
            if (mode2 > 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(mode2 - (this.mDecorPadding.top + this.mDecorPadding.bottom), MeasureSpec.getSize(i2)), 1073741824);
            }
        }
        super.onMeasure(i3, i2);
        mode2 = getMeasuredWidth();
        i3 = MeasureSpec.makeMeasureSpec(mode2, 1073741824);
        if (obj3 != null) {
        }
        if (typedValue2.type != 5) {
            dimension2 = typedValue2.getDimension(displayMetrics);
        } else if (typedValue2.type == 6) {
            dimension2 = typedValue2.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
        } else {
            i = 0;
            if (i > 0) {
                i -= this.mDecorPadding.left + this.mDecorPadding.right;
            }
            if (mode2 < i) {
                i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
                if (obj2 == null) {
                    super.onMeasure(i3, i2);
                }
            }
            obj2 = null;
            if (obj2 == null) {
                super.onMeasure(i3, i2);
            }
        }
        i = (int) dimension2;
        if (i > 0) {
            i -= this.mDecorPadding.left + this.mDecorPadding.right;
        }
        if (mode2 < i) {
            i3 = MeasureSpec.makeMeasureSpec(i, 1073741824);
            if (obj2 == null) {
                super.onMeasure(i3, i2);
            }
        }
        obj2 = null;
        if (obj2 == null) {
            super.onMeasure(i3, i2);
        }
    }

    public void setAttachListener(OnAttachListener onAttachListener) {
        this.mAttachListener = onAttachListener;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.mDecorPadding.set(i, i2, i3, i4);
        if (C0571r.m1326D(this)) {
            requestLayout();
        }
    }
}
