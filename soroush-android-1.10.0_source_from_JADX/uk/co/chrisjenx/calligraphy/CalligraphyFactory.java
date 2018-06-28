package uk.co.chrisjenx.calligraphy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;

class CalligraphyFactory {
    private static final String ACTION_BAR_SUBTITLE = "action_bar_subtitle";
    private static final String ACTION_BAR_TITLE = "action_bar_title";
    private final int[] mAttributeId;

    public CalligraphyFactory(int i) {
        this.mAttributeId = new int[]{i};
    }

    private void applyFontToToolbar(Toolbar toolbar) {
        CharSequence title = toolbar.getTitle();
        CharSequence subtitle = toolbar.getSubtitle();
        toolbar.setTitle(" ");
        toolbar.setSubtitle(" ");
        int childCount = toolbar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            onViewCreated(toolbar.getChildAt(i), toolbar.getContext(), null);
        }
        toolbar.setTitle(title);
        toolbar.setSubtitle(subtitle);
    }

    private Typeface getDefaultTypeface(Context context, String str) {
        Object fontPath;
        if (TextUtils.isEmpty(str)) {
            fontPath = CalligraphyConfig.get().getFontPath();
        }
        return !TextUtils.isEmpty(fontPath) ? TypefaceUtils.load(context.getAssets(), fontPath) : null;
    }

    protected static int[] getStyleForTextView(TextView textView) {
        int[] iArr = new int[]{-1, -1};
        if (isActionBarTitle(textView)) {
            iArr[0] = 16843470;
            iArr[1] = 16843512;
        } else if (isActionBarSubTitle(textView)) {
            iArr[0] = 16843470;
            iArr[1] = 16843513;
        }
        if (iArr[0] == -1) {
            iArr[0] = CalligraphyConfig.get().getClassStyles().containsKey(textView.getClass()) ? ((Integer) CalligraphyConfig.get().getClassStyles().get(textView.getClass())).intValue() : 16842804;
        }
        return iArr;
    }

    @SuppressLint({"NewApi"})
    protected static boolean isActionBarSubTitle(TextView textView) {
        return matchesResourceIdName(textView, ACTION_BAR_SUBTITLE) ? true : parentIsToolbarV7(textView) ? TextUtils.equals(((Toolbar) textView.getParent()).getSubtitle(), textView.getText()) : false;
    }

    @SuppressLint({"NewApi"})
    protected static boolean isActionBarTitle(TextView textView) {
        return matchesResourceIdName(textView, ACTION_BAR_TITLE) ? true : parentIsToolbarV7(textView) ? TextUtils.equals(((Toolbar) textView.getParent()).getTitle(), textView.getText()) : false;
    }

    protected static boolean matchesResourceIdName(View view, String str) {
        return view.getId() == -1 ? false : view.getResources().getResourceEntryName(view.getId()).equalsIgnoreCase(str);
    }

    protected static boolean parentIsToolbarV7(View view) {
        return CalligraphyUtils.canCheckForV7Toolbar() && view.getParent() != null && (view.getParent() instanceof Toolbar);
    }

    private String resolveFontPath(Context context, AttributeSet attributeSet) {
        Object pullFontPathFromView = CalligraphyUtils.pullFontPathFromView(context, attributeSet, this.mAttributeId);
        if (TextUtils.isEmpty(pullFontPathFromView)) {
            pullFontPathFromView = CalligraphyUtils.pullFontPathFromStyle(context, attributeSet, this.mAttributeId);
        }
        return TextUtils.isEmpty(pullFontPathFromView) ? CalligraphyUtils.pullFontPathFromTextAppearance(context, attributeSet, this.mAttributeId) : pullFontPathFromView;
    }

    public View onViewCreated(View view, Context context, AttributeSet attributeSet) {
        if (!(view == null || view.getTag(C7879R.id.calligraphy_tag_id) == Boolean.TRUE)) {
            onViewCreatedInternal(view, context, attributeSet);
            view.setTag(C7879R.id.calligraphy_tag_id, Boolean.TRUE);
        }
        return view;
    }

    void onViewCreatedInternal(View view, Context context, AttributeSet attributeSet) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!TypefaceUtils.isLoaded(textView.getTypeface())) {
                boolean z;
                String resolveFontPath = resolveFontPath(context, attributeSet);
                if (TextUtils.isEmpty(resolveFontPath)) {
                    int[] styleForTextView = getStyleForTextView(textView);
                    resolveFontPath = styleForTextView[1] != -1 ? CalligraphyUtils.pullFontPathFromTheme(context, styleForTextView[0], styleForTextView[1], this.mAttributeId) : CalligraphyUtils.pullFontPathFromTheme(context, styleForTextView[0], this.mAttributeId);
                }
                if (!matchesResourceIdName(view, ACTION_BAR_TITLE)) {
                    if (!matchesResourceIdName(view, ACTION_BAR_SUBTITLE)) {
                        z = false;
                        CalligraphyUtils.applyFontToTextView(context, textView, CalligraphyConfig.get(), resolveFontPath, z);
                    }
                }
                z = true;
                CalligraphyUtils.applyFontToTextView(context, textView, CalligraphyConfig.get(), resolveFontPath, z);
            } else {
                return;
            }
        }
        if (CalligraphyUtils.canCheckForV7Toolbar() && (view instanceof Toolbar)) {
            applyFontToToolbar((Toolbar) view);
        }
        Typeface defaultTypeface;
        if (view instanceof HasTypeface) {
            defaultTypeface = getDefaultTypeface(context, resolveFontPath(context, attributeSet));
            if (defaultTypeface != null) {
                ((HasTypeface) view).setTypeface(defaultTypeface);
            }
            return;
        }
        if (CalligraphyConfig.get().isCustomViewTypefaceSupport() && CalligraphyConfig.get().isCustomViewHasTypeface(view)) {
            Method method = ReflectionUtils.getMethod(view.getClass(), "setTypeface");
            defaultTypeface = getDefaultTypeface(context, resolveFontPath(context, attributeSet));
            if (!(method == null || defaultTypeface == null)) {
                ReflectionUtils.invokeMethod(view, method, defaultTypeface);
            }
        }
    }
}
