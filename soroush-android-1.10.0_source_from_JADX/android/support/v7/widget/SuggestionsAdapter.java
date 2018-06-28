package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.widget.C6384k;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0640f;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.WeakHashMap;

class SuggestionsAdapter extends C6384k implements OnClickListener {
    private static final boolean DBG = false;
    static final int INVALID_INDEX = -1;
    private static final String LOG_TAG = "SuggestionsAdapter";
    private static final int QUERY_LIMIT = 50;
    static final int REFINE_ALL = 2;
    static final int REFINE_BY_ENTRY = 1;
    static final int REFINE_NONE = 0;
    private boolean mClosed = false;
    private final int mCommitIconResId;
    private int mFlagsCol = -1;
    private int mIconName1Col = -1;
    private int mIconName2Col = -1;
    private final WeakHashMap<String, ConstantState> mOutsideDrawablesCache;
    private final Context mProviderContext;
    private int mQueryRefinement = 1;
    private final SearchManager mSearchManager = ((SearchManager) this.mContext.getSystemService("search"));
    private final SearchView mSearchView;
    private final SearchableInfo mSearchable;
    private int mText1Col = -1;
    private int mText2Col = -1;
    private int mText2UrlCol = -1;
    private ColorStateList mUrlColor;

    private static final class ChildViewCache {
        public final ImageView mIcon1;
        public final ImageView mIcon2;
        public final ImageView mIconRefine;
        public final TextView mText1;
        public final TextView mText2;

        public ChildViewCache(View view) {
            this.mText1 = (TextView) view.findViewById(16908308);
            this.mText2 = (TextView) view.findViewById(16908309);
            this.mIcon1 = (ImageView) view.findViewById(16908295);
            this.mIcon2 = (ImageView) view.findViewById(16908296);
            this.mIconRefine = (ImageView) view.findViewById(C0640f.edit_query);
        }
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.mSearchView = searchView;
        this.mSearchable = searchableInfo;
        this.mCommitIconResId = searchView.getSuggestionCommitIconResId();
        this.mProviderContext = context;
        this.mOutsideDrawablesCache = weakHashMap;
    }

    private Drawable checkIconCache(String str) {
        ConstantState constantState = (ConstantState) this.mOutsideDrawablesCache.get(str);
        return constantState == null ? null : constantState.newDrawable();
    }

    private CharSequence formatUrl(CharSequence charSequence) {
        if (this.mUrlColor == null) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(C0635a.textColorSearchUrl, typedValue, true);
            this.mUrlColor = this.mContext.getResources().getColorStateList(typedValue.resourceId);
        }
        CharSequence spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.mUrlColor, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable getActivityIcon(ComponentName componentName) {
        PackageManager packageManager = this.mContext.getPackageManager();
        String str;
        String stringBuilder;
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            str = LOG_TAG;
            StringBuilder stringBuilder2 = new StringBuilder("Invalid icon resource ");
            stringBuilder2.append(iconResource);
            stringBuilder2.append(" for ");
            stringBuilder2.append(componentName.flattenToShortString());
            stringBuilder = stringBuilder2.toString();
            Log.w(str, stringBuilder);
            return null;
        } catch (NameNotFoundException e) {
            str = LOG_TAG;
            stringBuilder = e.toString();
        }
    }

    private Drawable getActivityIconWithCache(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Object obj = null;
        if (this.mOutsideDrawablesCache.containsKey(flattenToShortString)) {
            ConstantState constantState = (ConstantState) this.mOutsideDrawablesCache.get(flattenToShortString);
            return constantState == null ? null : constantState.newDrawable(this.mProviderContext.getResources());
        } else {
            Drawable activityIcon = getActivityIcon(componentName);
            if (activityIcon != null) {
                obj = activityIcon.getConstantState();
            }
            this.mOutsideDrawablesCache.put(flattenToShortString, obj);
            return activityIcon;
        }
    }

    public static String getColumnString(Cursor cursor, String str) {
        return getStringOrNull(cursor, cursor.getColumnIndex(str));
    }

    private Drawable getDefaultIcon1(Cursor cursor) {
        Drawable activityIconWithCache = getActivityIconWithCache(this.mSearchable.getSearchActivity());
        return activityIconWithCache != null ? activityIconWithCache : this.mContext.getPackageManager().getDefaultActivityIcon();
    }

    private android.graphics.drawable.Drawable getDrawable(android.net.Uri r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = 0;
        r1 = r7.getScheme();	 Catch:{ FileNotFoundException -> 0x007d }
        r2 = "android.resource";	 Catch:{ FileNotFoundException -> 0x007d }
        r1 = r2.equals(r1);	 Catch:{ FileNotFoundException -> 0x007d }
        if (r1 == 0) goto L_0x0026;
    L_0x000d:
        r1 = r6.getDrawableFromResourceUri(r7);	 Catch:{ NotFoundException -> 0x0012 }
        return r1;
    L_0x0012:
        r1 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x007d }
        r2 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x007d }
        r3 = "Resource does not exist: ";	 Catch:{ FileNotFoundException -> 0x007d }
        r2.<init>(r3);	 Catch:{ FileNotFoundException -> 0x007d }
        r2.append(r7);	 Catch:{ FileNotFoundException -> 0x007d }
        r2 = r2.toString();	 Catch:{ FileNotFoundException -> 0x007d }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x007d }
        throw r1;	 Catch:{ FileNotFoundException -> 0x007d }
    L_0x0026:
        r1 = r6.mProviderContext;	 Catch:{ FileNotFoundException -> 0x007d }
        r1 = r1.getContentResolver();	 Catch:{ FileNotFoundException -> 0x007d }
        r1 = r1.openInputStream(r7);	 Catch:{ FileNotFoundException -> 0x007d }
        if (r1 != 0) goto L_0x0046;	 Catch:{ FileNotFoundException -> 0x007d }
    L_0x0032:
        r1 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x007d }
        r2 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x007d }
        r3 = "Failed to open ";	 Catch:{ FileNotFoundException -> 0x007d }
        r2.<init>(r3);	 Catch:{ FileNotFoundException -> 0x007d }
        r2.append(r7);	 Catch:{ FileNotFoundException -> 0x007d }
        r2 = r2.toString();	 Catch:{ FileNotFoundException -> 0x007d }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x007d }
        throw r1;	 Catch:{ FileNotFoundException -> 0x007d }
    L_0x0046:
        r2 = android.graphics.drawable.Drawable.createFromStream(r1, r0);	 Catch:{ all -> 0x0063 }
        r1.close();	 Catch:{ IOException -> 0x004e }
        return r2;
    L_0x004e:
        r1 = move-exception;
        r3 = "SuggestionsAdapter";	 Catch:{ FileNotFoundException -> 0x007d }
        r4 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x007d }
        r5 = "Error closing icon stream for ";	 Catch:{ FileNotFoundException -> 0x007d }
        r4.<init>(r5);	 Catch:{ FileNotFoundException -> 0x007d }
        r4.append(r7);	 Catch:{ FileNotFoundException -> 0x007d }
        r4 = r4.toString();	 Catch:{ FileNotFoundException -> 0x007d }
        android.util.Log.e(r3, r4, r1);	 Catch:{ FileNotFoundException -> 0x007d }
        return r2;
    L_0x0063:
        r2 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x0068 }
        goto L_0x007c;
    L_0x0068:
        r1 = move-exception;
        r3 = "SuggestionsAdapter";	 Catch:{ FileNotFoundException -> 0x007d }
        r4 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x007d }
        r5 = "Error closing icon stream for ";	 Catch:{ FileNotFoundException -> 0x007d }
        r4.<init>(r5);	 Catch:{ FileNotFoundException -> 0x007d }
        r4.append(r7);	 Catch:{ FileNotFoundException -> 0x007d }
        r4 = r4.toString();	 Catch:{ FileNotFoundException -> 0x007d }
        android.util.Log.e(r3, r4, r1);	 Catch:{ FileNotFoundException -> 0x007d }
    L_0x007c:
        throw r2;	 Catch:{ FileNotFoundException -> 0x007d }
    L_0x007d:
        r1 = move-exception;
        r2 = "SuggestionsAdapter";
        r3 = new java.lang.StringBuilder;
        r4 = "Icon not found: ";
        r3.<init>(r4);
        r3.append(r7);
        r7 = ", ";
        r3.append(r7);
        r7 = r1.getMessage();
        r3.append(r7);
        r7 = r3.toString();
        android.util.Log.w(r2, r7);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SuggestionsAdapter.getDrawable(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private android.graphics.drawable.Drawable getDrawableFromResourceValue(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = 0;
        if (r5 == 0) goto L_0x0069;
    L_0x0003:
        r1 = r5.isEmpty();
        if (r1 != 0) goto L_0x0069;
    L_0x0009:
        r1 = "0";
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0012;
    L_0x0011:
        return r0;
    L_0x0012:
        r1 = java.lang.Integer.parseInt(r5);	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r3 = "android.resource://";	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r2.<init>(r3);	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r3 = r4.mProviderContext;	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r3 = r3.getPackageName();	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r2.append(r3);	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r3 = "/";	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r2.append(r3);	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r2.append(r1);	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r3 = r4.checkIconCache(r2);	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        if (r3 == 0) goto L_0x0039;	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
    L_0x0038:
        return r3;	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
    L_0x0039:
        r3 = r4.mProviderContext;	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r1 = android.support.v4.p029a.C0346c.m682a(r3, r1);	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        r4.storeInIconCache(r2, r1);	 Catch:{ NumberFormatException -> 0x0057, NotFoundException -> 0x0043 }
        return r1;
    L_0x0043:
        r1 = "SuggestionsAdapter";
        r2 = new java.lang.StringBuilder;
        r3 = "Icon resource not found: ";
        r2.<init>(r3);
        r2.append(r5);
        r5 = r2.toString();
        android.util.Log.w(r1, r5);
        return r0;
    L_0x0057:
        r0 = r4.checkIconCache(r5);
        if (r0 == 0) goto L_0x005e;
    L_0x005d:
        return r0;
    L_0x005e:
        r0 = android.net.Uri.parse(r5);
        r0 = r4.getDrawable(r0);
        r4.storeInIconCache(r5, r0);
    L_0x0069:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SuggestionsAdapter.getDrawableFromResourceValue(java.lang.String):android.graphics.drawable.Drawable");
    }

    private Drawable getIcon1(Cursor cursor) {
        if (this.mIconName1Col == -1) {
            return null;
        }
        Drawable drawableFromResourceValue = getDrawableFromResourceValue(cursor.getString(this.mIconName1Col));
        return drawableFromResourceValue != null ? drawableFromResourceValue : getDefaultIcon1(cursor);
    }

    private Drawable getIcon2(Cursor cursor) {
        return this.mIconName2Col == -1 ? null : getDrawableFromResourceValue(cursor.getString(this.mIconName2Col));
    }

    private static String getStringOrNull(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Throwable e) {
            Log.e(LOG_TAG, "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private void setViewDrawable(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void setViewText(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    private void storeInIconCache(String str, Drawable drawable) {
        if (drawable != null) {
            this.mOutsideDrawablesCache.put(str, drawable.getConstantState());
        }
    }

    private void updateSpinnerState(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    public void bindView(View view, Context context, Cursor cursor) {
        ChildViewCache childViewCache = (ChildViewCache) view.getTag();
        int i = this.mFlagsCol != -1 ? cursor.getInt(this.mFlagsCol) : 0;
        if (childViewCache.mText1 != null) {
            setViewText(childViewCache.mText1, getStringOrNull(cursor, this.mText1Col));
        }
        if (childViewCache.mText2 != null) {
            CharSequence stringOrNull = getStringOrNull(cursor, this.mText2UrlCol);
            stringOrNull = stringOrNull != null ? formatUrl(stringOrNull) : getStringOrNull(cursor, this.mText2Col);
            if (TextUtils.isEmpty(stringOrNull)) {
                if (childViewCache.mText1 != null) {
                    childViewCache.mText1.setSingleLine(false);
                    childViewCache.mText1.setMaxLines(2);
                }
            } else if (childViewCache.mText1 != null) {
                childViewCache.mText1.setSingleLine(true);
                childViewCache.mText1.setMaxLines(1);
            }
            setViewText(childViewCache.mText2, stringOrNull);
        }
        if (childViewCache.mIcon1 != null) {
            setViewDrawable(childViewCache.mIcon1, getIcon1(cursor), 4);
        }
        if (childViewCache.mIcon2 != null) {
            setViewDrawable(childViewCache.mIcon2, getIcon2(cursor), 8);
        }
        if (this.mQueryRefinement != 2) {
            if (this.mQueryRefinement != 1 || (i & 1) == 0) {
                childViewCache.mIconRefine.setVisibility(8);
                return;
            }
        }
        childViewCache.mIconRefine.setVisibility(0);
        childViewCache.mIconRefine.setTag(childViewCache.mText1.getText());
        childViewCache.mIconRefine.setOnClickListener(this);
    }

    public void changeCursor(Cursor cursor) {
        if (this.mClosed) {
            Log.w(LOG_TAG, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.mText1Col = cursor.getColumnIndex("suggest_text_1");
                this.mText2Col = cursor.getColumnIndex("suggest_text_2");
                this.mText2UrlCol = cursor.getColumnIndex("suggest_text_2_url");
                this.mIconName1Col = cursor.getColumnIndex("suggest_icon_1");
                this.mIconName2Col = cursor.getColumnIndex("suggest_icon_2");
                this.mFlagsCol = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Throwable e) {
            Log.e(LOG_TAG, "error changing cursor and caching columns", e);
        }
    }

    public void close() {
        changeCursor(null);
        this.mClosed = true;
    }

    public CharSequence convertToString(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        CharSequence columnString = getColumnString(cursor, "suggest_intent_query");
        if (columnString != null) {
            return columnString;
        }
        if (this.mSearchable.shouldRewriteQueryFromData()) {
            columnString = getColumnString(cursor, "suggest_intent_data");
            if (columnString != null) {
                return columnString;
            }
        }
        if (this.mSearchable.shouldRewriteQueryFromText()) {
            CharSequence columnString2 = getColumnString(cursor, "suggest_text_1");
            if (columnString2 != null) {
                return columnString2;
            }
        }
        return null;
    }

    android.graphics.drawable.Drawable getDrawableFromResourceUri(android.net.Uri r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = r8.getAuthority();
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x001e;
    L_0x000a:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r2 = "No authority: ";
        r1.<init>(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x001e:
        r1 = r7.mContext;	 Catch:{ NameNotFoundException -> 0x00ab }
        r1 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00ab }
        r1 = r1.getResourcesForApplication(r0);	 Catch:{ NameNotFoundException -> 0x00ab }
        r2 = r8.getPathSegments();
        if (r2 != 0) goto L_0x0042;
    L_0x002e:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r2 = "No path: ";
        r1.<init>(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x0042:
        r3 = r2.size();
        r4 = 0;
        r5 = 1;
        if (r3 != r5) goto L_0x0069;
    L_0x004a:
        r0 = r2.get(r4);	 Catch:{ NumberFormatException -> 0x0055 }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x0055 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0055 }
        goto L_0x007c;
    L_0x0055:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r2 = "Single path segment is not a resource ID: ";
        r1.<init>(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x0069:
        r6 = 2;
        if (r3 != r6) goto L_0x0097;
    L_0x006c:
        r3 = r2.get(r5);
        r3 = (java.lang.String) r3;
        r2 = r2.get(r4);
        r2 = (java.lang.String) r2;
        r0 = r1.getIdentifier(r3, r2, r0);
    L_0x007c:
        if (r0 != 0) goto L_0x0092;
    L_0x007e:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r2 = "No resource found for: ";
        r1.<init>(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x0092:
        r8 = r1.getDrawable(r0);
        return r8;
    L_0x0097:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r2 = "More than two path segments: ";
        r1.<init>(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00ab:
        r0 = new java.io.FileNotFoundException;
        r1 = new java.lang.StringBuilder;
        r2 = "No package found for authority: ";
        r1.<init>(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SuggestionsAdapter.getDrawableFromResourceUri(android.net.Uri):android.graphics.drawable.Drawable");
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w(LOG_TAG, "Search suggestions cursor threw exception.", e);
            view = newDropDownView(this.mContext, this.mCursor, viewGroup);
            if (view != null) {
                ((ChildViewCache) view.getTag()).mText1.setText(e.toString());
            }
            return view;
        }
    }

    public int getQueryRefinement() {
        return this.mQueryRefinement;
    }

    Cursor getSearchManagerSuggestions(SearchableInfo searchableInfo, String str, int i) {
        String[] strArr = null;
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Builder fragment = new Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.mContext.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w(LOG_TAG, "Search suggestions cursor threw exception.", e);
            view = newView(this.mContext, this.mCursor, viewGroup);
            if (view != null) {
                ((ChildViewCache) view.getTag()).mText1.setText(e.toString());
            }
            return view;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new ChildViewCache(newView));
        ((ImageView) newView.findViewById(C0640f.edit_query)).setImageResource(this.mCommitIconResId);
        return newView;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        updateSpinnerState(getCursor());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        updateSpinnerState(getCursor());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.mSearchView.onQueryRefine((CharSequence) tag);
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.mSearchView.getVisibility() != 0 || this.mSearchView.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor searchManagerSuggestions = getSearchManagerSuggestions(this.mSearchable, charSequence2, 50);
            if (searchManagerSuggestions != null) {
                searchManagerSuggestions.getCount();
                return searchManagerSuggestions;
            }
        } catch (Throwable e) {
            Log.w(LOG_TAG, "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    public void setQueryRefinement(int i) {
        this.mQueryRefinement = i;
    }
}
