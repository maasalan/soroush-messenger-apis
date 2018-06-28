package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p023b.p024a.C6334c;
import android.support.p023b.p024a.C6335i;
import android.support.v4.p029a.C0346c;
import android.support.v4.p031b.C0433a;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.p038g.C0468f;
import android.support.v4.p038g.C0469g;
import android.support.v4.p038g.C0483n;
import android.support.v4.p038g.C4813a;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0637c;
import android.support.v7.p041a.C0645a.C0639e;
import android.support.v7.p043c.p044a.C0683b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class AppCompatDrawableManager {
    private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = new int[]{C0639e.abc_popup_background_mtrl_mult, C0639e.abc_cab_background_internal_bg, C0639e.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = new int[]{C0639e.abc_textfield_activated_mtrl_alpha, C0639e.abc_textfield_search_activated_mtrl_alpha, C0639e.abc_cab_background_top_mtrl_alpha, C0639e.abc_text_cursor_material, C0639e.abc_text_select_handle_left_mtrl_dark, C0639e.abc_text_select_handle_middle_mtrl_dark, C0639e.abc_text_select_handle_right_mtrl_dark, C0639e.abc_text_select_handle_left_mtrl_light, C0639e.abc_text_select_handle_middle_mtrl_light, C0639e.abc_text_select_handle_right_mtrl_light};
    private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = new int[]{C0639e.abc_textfield_search_default_mtrl_alpha, C0639e.abc_textfield_default_mtrl_alpha, C0639e.abc_ab_share_pack_mtrl_alpha};
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final boolean DEBUG = false;
    private static final Mode DEFAULT_MODE = Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "AppCompatDrawableManager";
    private static final int[] TINT_CHECKABLE_BUTTON_LIST = new int[]{C0639e.abc_btn_check_material, C0639e.abc_btn_radio_material};
    private static final int[] TINT_COLOR_CONTROL_NORMAL = new int[]{C0639e.abc_ic_commit_search_api_mtrl_alpha, C0639e.abc_seekbar_tick_mark_material, C0639e.abc_ic_menu_share_mtrl_alpha, C0639e.abc_ic_menu_copy_mtrl_am_alpha, C0639e.abc_ic_menu_cut_mtrl_alpha, C0639e.abc_ic_menu_selectall_mtrl_alpha, C0639e.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST = new int[]{C0639e.abc_tab_indicator_material, C0639e.abc_textfield_search_material};
    private C4813a<String, InflateDelegate> mDelegates;
    private final Object mDrawableCacheLock = new Object();
    private final WeakHashMap<Context, C0468f<WeakReference<ConstantState>>> mDrawableCaches = new WeakHashMap(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private C0483n<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, C0483n<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;

    private interface InflateDelegate {
        Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    private static class AvdcInflateDelegate implements InflateDelegate {
        AvdcInflateDelegate() {
        }

        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C6334c.m14847a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Throwable e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    private static class ColorFilterLruCache extends C0469g<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i) {
            super(i);
        }

        private static int generateCacheKey(int i, Mode mode) {
            return (31 * (i + 31)) + mode.hashCode();
        }

        PorterDuffColorFilter get(int i, Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        PorterDuffColorFilter put(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }
    }

    private static class VdcInflateDelegate implements InflateDelegate {
        VdcInflateDelegate() {
        }

        public Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C6335i.m14852a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Throwable e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private void addDelegate(String str, InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new C4813a();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    private boolean addDrawableToCache(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.mDrawableCacheLock) {
            C0468f c0468f = (C0468f) this.mDrawableCaches.get(context);
            if (c0468f == null) {
                c0468f = new C0468f();
                this.mDrawableCaches.put(context, c0468f);
            }
            c0468f.m986a(j, new WeakReference(constantState));
        }
        return true;
    }

    private void addTintListToCache(Context context, int i, ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap();
        }
        C0483n c0483n = (C0483n) this.mTintLists.get(context);
        if (c0483n == null) {
            c0483n = new C0483n();
            this.mTintLists.put(context, c0483n);
        }
        c0483n.m1029b(i, colorStateList);
    }

    private static boolean arrayContains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void checkVectorDrawableSetup(Context context) {
        if (!this.mHasCheckedVectorDrawableSetup) {
            this.mHasCheckedVectorDrawableSetup = true;
            Drawable drawable = getDrawable(context, C0639e.abc_vector_test);
            if (drawable != null) {
                if (isVectorDrawable(drawable)) {
                    return;
                }
            }
            this.mHasCheckedVectorDrawableSetup = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private ColorStateList createBorderlessButtonColorStateList(Context context) {
        return createButtonColorStateList(context, 0);
    }

    private ColorStateList createButtonColorStateList(Context context, int i) {
        r1 = new int[4][];
        r0 = new int[4];
        int themeAttrColor = ThemeUtils.getThemeAttrColor(context, C0635a.colorControlHighlight);
        int disabledThemeAttrColor = ThemeUtils.getDisabledThemeAttrColor(context, C0635a.colorButtonNormal);
        r1[0] = ThemeUtils.DISABLED_STATE_SET;
        r0[0] = disabledThemeAttrColor;
        r1[1] = ThemeUtils.PRESSED_STATE_SET;
        r0[1] = C0433a.m903a(themeAttrColor, i);
        r1[2] = ThemeUtils.FOCUSED_STATE_SET;
        r0[2] = C0433a.m903a(themeAttrColor, i);
        r1[3] = ThemeUtils.EMPTY_STATE_SET;
        r0[3] = i;
        return new ColorStateList(r1, r0);
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private ColorStateList createColoredButtonColorStateList(Context context) {
        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, C0635a.colorAccent));
    }

    private ColorStateList createDefaultButtonColorStateList(Context context) {
        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, C0635a.colorButtonNormal));
    }

    private Drawable createDrawableIfNeeded(Context context, int i) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (i == C0639e.abc_cab_background_top_material) {
            cachedDrawable = new LayerDrawable(new Drawable[]{getDrawable(context, C0639e.abc_cab_background_internal_bg), getDrawable(context, C0639e.abc_cab_background_top_mtrl_alpha)});
        }
        if (cachedDrawable != null) {
            cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, cachedDrawable);
        }
        return cachedDrawable;
    }

    private ColorStateList createSwitchThumbColorStateList(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, C0635a.colorSwitchThumbNormal);
        if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, C0635a.colorSwitchThumbNormal);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, C0635a.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = ThemeUtils.getThemeAttrColor(context, C0635a.colorSwitchThumbNormal);
        } else {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = themeAttrColorStateList.getColorForState(iArr[0], 0);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, C0635a.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = themeAttrColorStateList.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList != null) {
            if (mode != null) {
                return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
            }
        }
        return null;
    }

    public static AppCompatDrawableManager get() {
        if (INSTANCE == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            INSTANCE = appCompatDrawableManager;
            installDefaultInflateDelegates(appCompatDrawableManager);
        }
        return INSTANCE;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable getCachedDrawable(android.content.Context r5, long r6) {
        /*
        r4 = this;
        r0 = r4.mDrawableCacheLock;
        monitor-enter(r0);
        r1 = r4.mDrawableCaches;	 Catch:{ all -> 0x0047 }
        r1 = r1.get(r5);	 Catch:{ all -> 0x0047 }
        r1 = (android.support.v4.p038g.C0468f) r1;	 Catch:{ all -> 0x0047 }
        r2 = 0;
        if (r1 != 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        return r2;
    L_0x0010:
        r3 = r1.m984a(r6);	 Catch:{ all -> 0x0047 }
        r3 = (java.lang.ref.WeakReference) r3;	 Catch:{ all -> 0x0047 }
        if (r3 == 0) goto L_0x0045;
    L_0x0018:
        r3 = r3.get();	 Catch:{ all -> 0x0047 }
        r3 = (android.graphics.drawable.Drawable.ConstantState) r3;	 Catch:{ all -> 0x0047 }
        if (r3 == 0) goto L_0x002a;
    L_0x0020:
        r5 = r5.getResources();	 Catch:{ all -> 0x0047 }
        r5 = r3.newDrawable(r5);	 Catch:{ all -> 0x0047 }
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        return r5;
    L_0x002a:
        r5 = r1.f1620c;	 Catch:{ all -> 0x0047 }
        r3 = r1.f1622e;	 Catch:{ all -> 0x0047 }
        r5 = android.support.v4.p038g.C0465c.m976a(r5, r3, r6);	 Catch:{ all -> 0x0047 }
        if (r5 < 0) goto L_0x0045;
    L_0x0034:
        r6 = r1.f1621d;	 Catch:{ all -> 0x0047 }
        r6 = r6[r5];	 Catch:{ all -> 0x0047 }
        r7 = android.support.v4.p038g.C0468f.f1618a;	 Catch:{ all -> 0x0047 }
        if (r6 == r7) goto L_0x0045;
    L_0x003c:
        r6 = r1.f1621d;	 Catch:{ all -> 0x0047 }
        r7 = android.support.v4.p038g.C0468f.f1618a;	 Catch:{ all -> 0x0047 }
        r6[r5] = r7;	 Catch:{ all -> 0x0047 }
        r5 = 1;
        r1.f1619b = r5;	 Catch:{ all -> 0x0047 }
    L_0x0045:
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        return r2;
    L_0x0047:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0047 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AppCompatDrawableManager.getCachedDrawable(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter = COLOR_FILTER_CACHE.get(i, mode);
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        COLOR_FILTER_CACHE.put(i, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    private ColorStateList getTintListFromCache(Context context, int i) {
        if (this.mTintLists != null) {
            C0483n c0483n = (C0483n) this.mTintLists.get(context);
            if (c0483n != null) {
                return (ColorStateList) c0483n.m1025a(i);
            }
        }
        return null;
    }

    static Mode getTintMode(int i) {
        return i == C0639e.abc_switch_thumb_material ? Mode.MULTIPLY : null;
    }

    private static void installDefaultInflateDelegates(AppCompatDrawableManager appCompatDrawableManager) {
        if (VERSION.SDK_INT < 24) {
            appCompatDrawableManager.addDelegate("vector", new VdcInflateDelegate());
            if (VERSION.SDK_INT >= 11) {
                appCompatDrawableManager.addDelegate("animated-vector", new AvdcInflateDelegate());
            }
        }
    }

    private static boolean isVectorDrawable(Drawable drawable) {
        if (!(drawable instanceof C6335i)) {
            if (!PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName())) {
                return false;
            }
        }
        return true;
    }

    private Drawable loadDrawableFromDelegates(Context context, int i) {
        if (this.mDelegates == null || this.mDelegates.isEmpty()) {
            return null;
        }
        if (this.mKnownDrawableIdTags != null) {
            String str = (String) this.mKnownDrawableIdTags.m1025a(i);
            if (SKIP_DRAWABLE_TAG.equals(str) || (str != null && this.mDelegates.get(str) == null)) {
                return null;
            }
        }
        this.mKnownDrawableIdTags = new C0483n();
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                int next;
                XmlPullParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.mKnownDrawableIdTags.m1029b(i, name);
                InflateDelegate inflateDelegate = (InflateDelegate) this.mDelegates.get(name);
                if (inflateDelegate != null) {
                    cachedDrawable = inflateDelegate.createFromXmlInner(context, xml, asAttributeSet, context.getTheme());
                }
                if (cachedDrawable != null) {
                    cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
                    addDrawableToCache(context, createCacheKey, cachedDrawable);
                }
            } catch (Throwable e) {
                Log.e(TAG, "Exception while inflating drawable", e);
            }
        }
        if (cachedDrawable == null) {
            this.mKnownDrawableIdTags.m1029b(i, SKIP_DRAWABLE_TAG);
        }
        return cachedDrawable;
    }

    private void removeDelegate(String str, InflateDelegate inflateDelegate) {
        if (this.mDelegates != null && this.mDelegates.get(str) == inflateDelegate) {
            this.mDelegates.remove(str);
        }
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i, Mode mode) {
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = DEFAULT_MODE;
        }
        drawable.setColorFilter(getPorterDuffColorFilter(i, mode));
    }

    private Drawable tintDrawable(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList tintList = getTintList(context, i);
        if (tintList != null) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = C0429a.m896g(drawable);
            C0429a.m885a(drawable, tintList);
            Mode tintMode = getTintMode(i);
            if (tintMode != null) {
                C0429a.m888a(drawable, tintMode);
                return drawable;
            }
        }
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        if (i == C0639e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908288), ThemeUtils.getThemeAttrColor(context, C0635a.colorControlNormal), DEFAULT_MODE);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0635a.colorControlNormal;
        } else {
            if (!(i == C0639e.abc_ratingbar_material || i == C0639e.abc_ratingbar_indicator_material)) {
                if (i != C0639e.abc_ratingbar_small_material) {
                    if (!tintDrawableUsingColorFilter(context, i, drawable) && z) {
                        return null;
                    }
                }
            }
            layerDrawable = (LayerDrawable) drawable;
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908288), ThemeUtils.getDisabledThemeAttrColor(context, C0635a.colorControlNormal), DEFAULT_MODE);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0635a.colorControlActivated;
        }
        setPorterDuffColorFilter(findDrawableByLayerId, ThemeUtils.getThemeAttrColor(context, i2), DEFAULT_MODE);
        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, C0635a.colorControlActivated), DEFAULT_MODE);
        return drawable;
        return drawable;
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        if (!DrawableUtils.canSafelyMutateDrawable(drawable) || drawable.mutate() == drawable) {
            if (!tintInfo.mHasTintList) {
                if (!tintInfo.mHasTintMode) {
                    drawable.clearColorFilter();
                    if (VERSION.SDK_INT <= 23) {
                        drawable.invalidateSelf();
                    }
                    return;
                }
            }
            drawable.setColorFilter(createTintFilter(tintInfo.mHasTintList ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d(TAG, "Mutated drawable is not the same instance as the input.");
    }

    static boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable) {
        int round;
        boolean z;
        Mode mode = DEFAULT_MODE;
        int i2 = 16842801;
        if (arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i)) {
            i2 = C0635a.colorControlNormal;
        } else if (arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i)) {
            i2 = C0635a.colorControlActivated;
        } else if (arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i)) {
            mode = Mode.MULTIPLY;
        } else if (i == C0639e.abc_list_divider_mtrl_alpha) {
            i2 = 16842800;
            round = Math.round(40.8f);
            z = true;
            if (z) {
                return false;
            }
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i2), mode));
            if (round != -1) {
                drawable.setAlpha(round);
            }
            return true;
        } else if (i != C0639e.abc_dialog_material_background) {
            round = -1;
            z = false;
            i2 = z;
            if (z) {
                return false;
            }
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i2), mode));
            if (round != -1) {
                drawable.setAlpha(round);
            }
            return true;
        }
        round = -1;
        z = true;
        if (z) {
            return false;
        }
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i2), mode));
        if (round != -1) {
            drawable.setAlpha(round);
        }
        return true;
    }

    public final Drawable getDrawable(Context context, int i) {
        return getDrawable(context, i, false);
    }

    final Drawable getDrawable(Context context, int i, boolean z) {
        checkVectorDrawableSetup(context);
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = C0346c.m682a(context, i);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i, z, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }

    final ColorStateList getTintList(Context context, int i) {
        ColorStateList tintListFromCache = getTintListFromCache(context, i);
        if (tintListFromCache == null) {
            int i2;
            if (i == C0639e.abc_edit_text_material) {
                i2 = C0637c.abc_tint_edittext;
            } else if (i == C0639e.abc_switch_track_mtrl_alpha) {
                i2 = C0637c.abc_tint_switch_track;
            } else {
                if (i == C0639e.abc_switch_thumb_material) {
                    tintListFromCache = createSwitchThumbColorStateList(context);
                } else if (i == C0639e.abc_btn_default_mtrl_shape) {
                    tintListFromCache = createDefaultButtonColorStateList(context);
                } else if (i == C0639e.abc_btn_borderless_material) {
                    tintListFromCache = createBorderlessButtonColorStateList(context);
                } else if (i == C0639e.abc_btn_colored_material) {
                    tintListFromCache = createColoredButtonColorStateList(context);
                } else {
                    if (i != C0639e.abc_spinner_mtrl_am_alpha) {
                        if (i != C0639e.abc_spinner_textfield_background_material) {
                            if (arrayContains(TINT_COLOR_CONTROL_NORMAL, i)) {
                                tintListFromCache = ThemeUtils.getThemeAttrColorStateList(context, C0635a.colorControlNormal);
                            } else if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i)) {
                                i2 = C0637c.abc_tint_default;
                            } else if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, i)) {
                                i2 = C0637c.abc_tint_btn_checkable;
                            } else if (i == C0639e.abc_seekbar_thumb_material) {
                                i2 = C0637c.abc_tint_seek_thumb;
                            }
                        }
                    }
                    i2 = C0637c.abc_tint_spinner;
                }
                if (tintListFromCache != null) {
                    addTintListToCache(context, i, tintListFromCache);
                }
            }
            tintListFromCache = C0683b.m1655a(context, i2);
            if (tintListFromCache != null) {
                addTintListToCache(context, i, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    public final void onConfigurationChanged(Context context) {
        synchronized (this.mDrawableCacheLock) {
            C0468f c0468f = (C0468f) this.mDrawableCaches.get(context);
            if (c0468f != null) {
                c0468f.m989c();
            }
        }
    }

    final Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = vectorEnabledTintResources.superGetDrawable(i);
        }
        return loadDrawableFromDelegates != null ? tintDrawable(context, i, false, loadDrawableFromDelegates) : null;
    }
}
