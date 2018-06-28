package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.v7.p041a.C0645a.C0644j;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

class AppCompatTextViewAutoSizeHelper {
    private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
    private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
    private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
    private static final String TAG = "ACTVAutoSizeHelper";
    private static final RectF TEMP_RECTF = new RectF();
    static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1.0f;
    private static final int VERY_WIDE = 1048576;
    private static Hashtable<String, Method> sTextViewMethodByNameCache = new Hashtable();
    private float mAutoSizeMaxTextSizeInPx = UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE;
    private float mAutoSizeMinTextSizeInPx = UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE;
    private float mAutoSizeStepGranularityInPx = UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE;
    private int[] mAutoSizeTextSizesInPx = new int[0];
    private int mAutoSizeTextType = 0;
    private final Context mContext;
    private boolean mHasPresetAutoSizeValues = false;
    private boolean mNeedsAutoSizeText = false;
    private TextPaint mTempTextPaint;
    private final TextView mTextView;

    AppCompatTextViewAutoSizeHelper(TextView textView) {
        this.mTextView = textView;
        this.mContext = this.mTextView.getContext();
    }

    private int[] cleanupAutoSizePresetSizes(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        List arrayList = new ArrayList();
        int i = 0;
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        while (i < size) {
            iArr2[i] = ((Integer) arrayList.get(i)).intValue();
            i++;
        }
        return iArr2;
    }

    private void clearAutoSizeConfiguration() {
        this.mAutoSizeTextType = 0;
        this.mAutoSizeMinTextSizeInPx = UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE;
        this.mAutoSizeMaxTextSizeInPx = UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE;
        this.mAutoSizeStepGranularityInPx = UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE;
        this.mAutoSizeTextSizesInPx = new int[0];
        this.mNeedsAutoSizeText = false;
    }

    @TargetApi(23)
    private StaticLayout createStaticLayoutForMeasuring(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) invokeAndReturnWithDefault(this.mTextView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        Builder hyphenationFrequency = Builder.obtain(charSequence, 0, charSequence.length(), this.mTempTextPaint, i).setAlignment(alignment).setLineSpacing(this.mTextView.getLineSpacingExtra(), this.mTextView.getLineSpacingMultiplier()).setIncludePad(this.mTextView.getIncludeFontPadding()).setBreakStrategy(this.mTextView.getBreakStrategy()).setHyphenationFrequency(this.mTextView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    @TargetApi(14)
    private StaticLayout createStaticLayoutForMeasuringPre23(CharSequence charSequence, Alignment alignment, int i) {
        float lineSpacingMultiplier;
        float lineSpacingExtra;
        boolean includeFontPadding;
        if (VERSION.SDK_INT >= 16) {
            lineSpacingMultiplier = this.mTextView.getLineSpacingMultiplier();
            lineSpacingExtra = this.mTextView.getLineSpacingExtra();
            includeFontPadding = this.mTextView.getIncludeFontPadding();
        } else {
            lineSpacingMultiplier = ((Float) invokeAndReturnWithDefault(this.mTextView, "getLineSpacingMultiplier", Float.valueOf(BallPulseIndicator.SCALE))).floatValue();
            lineSpacingExtra = ((Float) invokeAndReturnWithDefault(this.mTextView, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            includeFontPadding = ((Boolean) invokeAndReturnWithDefault(this.mTextView, "getIncludeFontPadding", Boolean.valueOf(true))).booleanValue();
        }
        return new StaticLayout(charSequence, this.mTempTextPaint, i, alignment, lineSpacingMultiplier, lineSpacingExtra, includeFontPadding);
    }

    private int findLargestTextSizeWhichFits(RectF rectF) {
        int length = this.mAutoSizeTextSizesInPx.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 0;
        int i2 = 1;
        length--;
        while (true) {
            int i3 = i2;
            i2 = i;
            i = i3;
            while (i <= length) {
                i2 = (i + length) / 2;
                if (suggestedSizeFitsInSpace(this.mAutoSizeTextSizesInPx[i2], rectF)) {
                    i2++;
                } else {
                    i2--;
                    length = i2;
                }
            }
            return this.mAutoSizeTextSizesInPx[i2];
        }
    }

    private Method getTextViewMethod(String str) {
        try {
            Method method = (Method) sTextViewMethodByNameCache.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    sTextViewMethodByNameCache.put(str, method);
                }
            }
            return method;
        } catch (Throwable e) {
            String str2 = TAG;
            StringBuilder stringBuilder = new StringBuilder("Failed to retrieve TextView#");
            stringBuilder.append(str);
            stringBuilder.append("() method");
            Log.w(str2, stringBuilder.toString(), e);
            return null;
        }
    }

    private <T> T invokeAndReturnWithDefault(Object obj, String str, T t) {
        try {
            return getTextViewMethod(str).invoke(obj, new Object[0]);
        } catch (Throwable e) {
            String str2 = TAG;
            StringBuilder stringBuilder = new StringBuilder("Failed to invoke TextView#");
            stringBuilder.append(str);
            stringBuilder.append("() method");
            Log.w(str2, stringBuilder.toString(), e);
            return t;
        }
    }

    private void setRawTextSize(float f) {
        if (f != this.mTextView.getPaint().getTextSize()) {
            this.mTextView.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.mTextView.isInLayout() : false;
            if (this.mTextView.getLayout() != null) {
                this.mNeedsAutoSizeText = false;
                try {
                    Method textViewMethod = getTextViewMethod("nullLayouts");
                    if (textViewMethod != null) {
                        textViewMethod.invoke(this.mTextView, new Object[0]);
                    }
                } catch (Throwable e) {
                    Log.w(TAG, "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.mTextView.forceLayout();
                } else {
                    this.mTextView.requestLayout();
                }
                this.mTextView.invalidate();
            }
        }
    }

    private boolean setupAutoSizeText() {
        int i = 0;
        if (supportsAutoSizeText() && this.mAutoSizeTextType == 1) {
            if (!this.mHasPresetAutoSizeValues || this.mAutoSizeTextSizesInPx.length == 0) {
                float round = (float) Math.round(this.mAutoSizeMinTextSizeInPx);
                int i2 = 1;
                while (Math.round(this.mAutoSizeStepGranularityInPx + round) <= Math.round(this.mAutoSizeMaxTextSizeInPx)) {
                    i2++;
                    round += this.mAutoSizeStepGranularityInPx;
                }
                int[] iArr = new int[i2];
                float f = this.mAutoSizeMinTextSizeInPx;
                while (i < i2) {
                    iArr[i] = Math.round(f);
                    f += this.mAutoSizeStepGranularityInPx;
                    i++;
                }
                this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArr);
            }
            this.mNeedsAutoSizeText = true;
        } else {
            this.mNeedsAutoSizeText = false;
        }
        return this.mNeedsAutoSizeText;
    }

    private void setupAutoSizeUniformPresetSizes(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArr);
            setupAutoSizeUniformPresetSizesConfiguration();
        }
    }

    private boolean setupAutoSizeUniformPresetSizesConfiguration() {
        int length = this.mAutoSizeTextSizesInPx.length;
        this.mHasPresetAutoSizeValues = length > 0;
        if (this.mHasPresetAutoSizeValues) {
            this.mAutoSizeTextType = 1;
            this.mAutoSizeMinTextSizeInPx = (float) this.mAutoSizeTextSizesInPx[0];
            this.mAutoSizeMaxTextSizeInPx = (float) this.mAutoSizeTextSizesInPx[length - 1];
            this.mAutoSizeStepGranularityInPx = UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE;
        }
        return this.mHasPresetAutoSizeValues;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean suggestedSizeFitsInSpace(int r6, android.graphics.RectF r7) {
        /*
        r5 = this;
        r0 = r5.mTextView;
        r0 = r0.getText();
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = -1;
        r3 = 16;
        if (r1 < r3) goto L_0x0014;
    L_0x000d:
        r1 = r5.mTextView;
        r1 = r1.getMaxLines();
        goto L_0x0015;
    L_0x0014:
        r1 = r2;
    L_0x0015:
        r3 = r5.mTempTextPaint;
        if (r3 != 0) goto L_0x0021;
    L_0x0019:
        r3 = new android.text.TextPaint;
        r3.<init>();
        r5.mTempTextPaint = r3;
        goto L_0x0026;
    L_0x0021:
        r3 = r5.mTempTextPaint;
        r3.reset();
    L_0x0026:
        r3 = r5.mTempTextPaint;
        r4 = r5.mTextView;
        r4 = r4.getPaint();
        r3.set(r4);
        r3 = r5.mTempTextPaint;
        r6 = (float) r6;
        r3.setTextSize(r6);
        r6 = r5.mTextView;
        r3 = "getLayoutAlignment";
        r4 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r6 = r5.invokeAndReturnWithDefault(r6, r3, r4);
        r6 = (android.text.Layout.Alignment) r6;
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 23;
        if (r3 < r4) goto L_0x0054;
    L_0x0049:
        r3 = r7.right;
        r3 = java.lang.Math.round(r3);
        r6 = r5.createStaticLayoutForMeasuring(r0, r6, r3, r1);
        goto L_0x005e;
    L_0x0054:
        r3 = r7.right;
        r3 = java.lang.Math.round(r3);
        r6 = r5.createStaticLayoutForMeasuringPre23(r0, r6, r3);
    L_0x005e:
        r3 = 0;
        r4 = 1;
        if (r1 == r2) goto L_0x0078;
    L_0x0062:
        r2 = r6.getLineCount();
        if (r2 > r1) goto L_0x0077;
    L_0x0068:
        r1 = r6.getLineCount();
        r1 = r1 - r4;
        r1 = r6.getLineEnd(r1);
        r0 = r0.length();
        if (r1 == r0) goto L_0x0078;
    L_0x0077:
        return r3;
    L_0x0078:
        r6 = r6.getHeight();
        r6 = (float) r6;
        r7 = r7.bottom;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 <= 0) goto L_0x0084;
    L_0x0083:
        return r3;
    L_0x0084:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatTextViewAutoSizeHelper.suggestedSizeFitsInSpace(int, android.graphics.RectF):boolean");
    }

    private boolean supportsAutoSizeText() {
        return !(this.mTextView instanceof AppCompatEditText);
    }

    private void validateAndSetAutoSizeTextTypeUniformConfiguration(float f, float f2, float f3) {
        if (f <= 0.0f) {
            StringBuilder stringBuilder = new StringBuilder("Minimum auto-size text size (");
            stringBuilder.append(f);
            stringBuilder.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (f2 <= f) {
            StringBuilder stringBuilder2 = new StringBuilder("Maximum auto-size text size (");
            stringBuilder2.append(f2);
            stringBuilder2.append("px) is less or equal to minimum auto-size text size (");
            stringBuilder2.append(f);
            stringBuilder2.append("px)");
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (f3 <= 0.0f) {
            StringBuilder stringBuilder3 = new StringBuilder("The auto-size step granularity (");
            stringBuilder3.append(f3);
            stringBuilder3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(stringBuilder3.toString());
        } else {
            this.mAutoSizeTextType = 1;
            this.mAutoSizeMinTextSizeInPx = f;
            this.mAutoSizeMaxTextSizeInPx = f2;
            this.mAutoSizeStepGranularityInPx = f3;
            this.mHasPresetAutoSizeValues = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void autoSizeText() {
        /*
        r5 = this;
        r0 = r5.isAutoSizeEnabled();
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r5.mNeedsAutoSizeText;
        if (r0 == 0) goto L_0x008d;
    L_0x000b:
        r0 = r5.mTextView;
        r0 = r0.getMeasuredHeight();
        if (r0 <= 0) goto L_0x008c;
    L_0x0013:
        r0 = r5.mTextView;
        r0 = r0.getMeasuredWidth();
        if (r0 > 0) goto L_0x001c;
    L_0x001b:
        return;
    L_0x001c:
        r0 = r5.mTextView;
        r1 = "getHorizontallyScrolling";
        r2 = 0;
        r3 = java.lang.Boolean.valueOf(r2);
        r0 = r5.invokeAndReturnWithDefault(r0, r1, r3);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0034;
    L_0x0031:
        r0 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        goto L_0x0048;
    L_0x0034:
        r0 = r5.mTextView;
        r0 = r0.getMeasuredWidth();
        r1 = r5.mTextView;
        r1 = r1.getTotalPaddingLeft();
        r0 = r0 - r1;
        r1 = r5.mTextView;
        r1 = r1.getTotalPaddingRight();
        r0 = r0 - r1;
    L_0x0048:
        r1 = r5.mTextView;
        r1 = r1.getHeight();
        r3 = r5.mTextView;
        r3 = r3.getCompoundPaddingBottom();
        r1 = r1 - r3;
        r3 = r5.mTextView;
        r3 = r3.getCompoundPaddingTop();
        r1 = r1 - r3;
        if (r0 <= 0) goto L_0x008c;
    L_0x005e:
        if (r1 > 0) goto L_0x0061;
    L_0x0060:
        return;
    L_0x0061:
        r3 = TEMP_RECTF;
        monitor-enter(r3);
        r4 = TEMP_RECTF;	 Catch:{ all -> 0x0089 }
        r4.setEmpty();	 Catch:{ all -> 0x0089 }
        r4 = TEMP_RECTF;	 Catch:{ all -> 0x0089 }
        r0 = (float) r0;	 Catch:{ all -> 0x0089 }
        r4.right = r0;	 Catch:{ all -> 0x0089 }
        r0 = TEMP_RECTF;	 Catch:{ all -> 0x0089 }
        r1 = (float) r1;	 Catch:{ all -> 0x0089 }
        r0.bottom = r1;	 Catch:{ all -> 0x0089 }
        r0 = TEMP_RECTF;	 Catch:{ all -> 0x0089 }
        r0 = r5.findLargestTextSizeWhichFits(r0);	 Catch:{ all -> 0x0089 }
        r0 = (float) r0;	 Catch:{ all -> 0x0089 }
        r1 = r5.mTextView;	 Catch:{ all -> 0x0089 }
        r1 = r1.getTextSize();	 Catch:{ all -> 0x0089 }
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 == 0) goto L_0x0087;
    L_0x0084:
        r5.setTextSizeInternal(r2, r0);	 Catch:{ all -> 0x0089 }
    L_0x0087:
        monitor-exit(r3);	 Catch:{ all -> 0x0089 }
        goto L_0x008d;
    L_0x0089:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0089 }
        throw r0;
    L_0x008c:
        return;
    L_0x008d:
        r0 = 1;
        r5.mNeedsAutoSizeText = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatTextViewAutoSizeHelper.autoSizeText():void");
    }

    int getAutoSizeMaxTextSize() {
        return Math.round(this.mAutoSizeMaxTextSizeInPx);
    }

    int getAutoSizeMinTextSize() {
        return Math.round(this.mAutoSizeMinTextSizeInPx);
    }

    int getAutoSizeStepGranularity() {
        return Math.round(this.mAutoSizeStepGranularityInPx);
    }

    int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextSizesInPx;
    }

    int getAutoSizeTextType() {
        return this.mAutoSizeTextType;
    }

    boolean isAutoSizeEnabled() {
        return supportsAutoSizeText() && this.mAutoSizeTextType != 0;
    }

    void loadFromAttributes(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, C0644j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0644j.AppCompatTextView_autoSizeTextType)) {
            this.mAutoSizeTextType = obtainStyledAttributes.getInt(C0644j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0644j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0644j.AppCompatTextView_autoSizeStepGranularity, UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE) : UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE;
        float dimension2 = obtainStyledAttributes.hasValue(C0644j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0644j.AppCompatTextView_autoSizeMinTextSize, UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE) : UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE;
        float dimension3 = obtainStyledAttributes.hasValue(C0644j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0644j.AppCompatTextView_autoSizeMaxTextSize, UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE) : UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE;
        if (obtainStyledAttributes.hasValue(C0644j.AppCompatTextView_autoSizePresetSizes)) {
            int resourceId = obtainStyledAttributes.getResourceId(C0644j.AppCompatTextView_autoSizePresetSizes, 0);
            if (resourceId > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                setupAutoSizeUniformPresetSizes(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (!supportsAutoSizeText()) {
            this.mAutoSizeTextType = 0;
        } else if (this.mAutoSizeTextType == 1) {
            if (!this.mHasPresetAutoSizeValues) {
                DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                if (dimension2 == UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE) {
                    dimension = BallPulseIndicator.SCALE;
                }
                validateAndSetAutoSizeTextTypeUniformConfiguration(dimension2, dimension3, dimension);
            }
            setupAutoSizeText();
        }
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (supportsAutoSizeText()) {
            DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
            validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (setupAutoSizeText()) {
                autoSizeText();
            }
        }
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (supportsAutoSizeText()) {
            int i2 = 0;
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                    while (i2 < length) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    }
                }
                this.mAutoSizeTextSizesInPx = cleanupAutoSizePresetSizes(iArr2);
                if (!setupAutoSizeUniformPresetSizesConfiguration()) {
                    StringBuilder stringBuilder = new StringBuilder("None of the preset sizes is valid: ");
                    stringBuilder.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.mHasPresetAutoSizeValues = false;
            if (setupAutoSizeText()) {
                autoSizeText();
            }
        }
    }

    void setAutoSizeTextTypeWithDefaults(int i) {
        if (supportsAutoSizeText()) {
            switch (i) {
                case 0:
                    clearAutoSizeConfiguration();
                    break;
                case 1:
                    DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
                    validateAndSetAutoSizeTextTypeUniformConfiguration(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), BallPulseIndicator.SCALE);
                    if (setupAutoSizeText()) {
                        autoSizeText();
                        return;
                    }
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unknown auto-size text type: ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    void setTextSizeInternal(int i, float f) {
        setRawTextSize(TypedValue.applyDimension(i, f, (this.mContext == null ? Resources.getSystem() : this.mContext.getResources()).getDisplayMetrics()));
    }
}
