package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0571r;
import android.support.v4.widget.C4854e;
import android.support.v7.p041a.C0645a.C0635a;
import android.support.v7.p041a.C0645a.C0638d;
import android.support.v7.p041a.C0645a.C0640f;
import android.support.v7.p041a.C0645a.C0641g;
import android.support.v7.p041a.C0645a.C0642h;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.view.C0706c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class SearchView extends LinearLayoutCompat implements C0706c {
    static final boolean DBG = false;
    static final AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER = new AutoCompleteTextViewReflector();
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    static final String LOG_TAG = "SearchView";
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final OnClickListener mOnClickListener;
    private OnCloseListener mOnCloseListener;
    private final OnEditorActionListener mOnEditorActionListener;
    private final OnItemClickListener mOnItemClickListener;
    private final OnItemSelectedListener mOnItemSelectedListener;
    private OnQueryTextListener mOnQueryChangeListener;
    OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private OnClickListener mOnSearchClickListener;
    private OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap<String, ConstantState> mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    final SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    C4854e mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private UpdatableTouchDelegate mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    class C07671 implements Runnable {
        C07671() {
        }

        public void run() {
            SearchView.this.updateFocusedState();
        }
    }

    class C07682 implements Runnable {
        C07682() {
        }

        public void run() {
            if (SearchView.this.mSuggestionsAdapter != null && (SearchView.this.mSuggestionsAdapter instanceof SuggestionsAdapter)) {
                SearchView.this.mSuggestionsAdapter.changeCursor(null);
            }
        }
    }

    class C07693 implements OnFocusChangeListener {
        C07693() {
        }

        public void onFocusChange(View view, boolean z) {
            if (SearchView.this.mOnQueryTextFocusChangeListener != null) {
                SearchView.this.mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, z);
            }
        }
    }

    class C07704 implements OnLayoutChangeListener {
        C07704() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.adjustDropDownSizeAndPosition();
        }
    }

    class C07715 implements OnClickListener {
        C07715() {
        }

        public void onClick(View view) {
            if (view == SearchView.this.mSearchButton) {
                SearchView.this.onSearchClicked();
            } else if (view == SearchView.this.mCloseButton) {
                SearchView.this.onCloseClicked();
            } else if (view == SearchView.this.mGoButton) {
                SearchView.this.onSubmitQuery();
            } else if (view == SearchView.this.mVoiceButton) {
                SearchView.this.onVoiceClicked();
            } else {
                if (view == SearchView.this.mSearchSrcTextView) {
                    SearchView.this.forceSuggestionQuery();
                }
            }
        }
    }

    class C07726 implements OnKeyListener {
        C07726() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (SearchView.this.mSearchable == null) {
                return false;
            }
            if (SearchView.this.mSearchSrcTextView.isPopupShowing() && SearchView.this.mSearchSrcTextView.getListSelection() != -1) {
                return SearchView.this.onSuggestionsKey(view, i, keyEvent);
            }
            if (SearchView.this.mSearchSrcTextView.isEmpty() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView.this.launchQuerySearch(0, null, SearchView.this.mSearchSrcTextView.getText().toString());
            return true;
        }
    }

    class C07737 implements OnEditorActionListener {
        C07737() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.onSubmitQuery();
            return true;
        }
    }

    class C07748 implements OnItemClickListener {
        C07748() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.onItemClicked(i, 0, null);
        }
    }

    class C07759 implements OnItemSelectedListener {
        C07759() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.onItemSelected(i);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private static class AutoCompleteTextViewReflector {
        private Method doAfterTextChanged;
        private Method doBeforeTextChanged;
        private Method ensureImeVisible;
        private Method showSoftInputUnchecked;

        AutoCompleteTextViewReflector() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r6.<init>();
            r0 = 0;
            r1 = 1;
            r2 = android.widget.AutoCompleteTextView.class;	 Catch:{ NoSuchMethodException -> 0x0016 }
            r3 = "doBeforeTextChanged";	 Catch:{ NoSuchMethodException -> 0x0016 }
            r4 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0016 }
            r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0016 }
            r6.doBeforeTextChanged = r2;	 Catch:{ NoSuchMethodException -> 0x0016 }
            r2 = r6.doBeforeTextChanged;	 Catch:{ NoSuchMethodException -> 0x0016 }
            r2.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0016 }
        L_0x0016:
            r2 = android.widget.AutoCompleteTextView.class;	 Catch:{ NoSuchMethodException -> 0x0027 }
            r3 = "doAfterTextChanged";	 Catch:{ NoSuchMethodException -> 0x0027 }
            r4 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x0027 }
            r2 = r2.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x0027 }
            r6.doAfterTextChanged = r2;	 Catch:{ NoSuchMethodException -> 0x0027 }
            r2 = r6.doAfterTextChanged;	 Catch:{ NoSuchMethodException -> 0x0027 }
            r2.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x0027 }
        L_0x0027:
            r2 = android.widget.AutoCompleteTextView.class;	 Catch:{ NoSuchMethodException -> 0x003c }
            r3 = "ensureImeVisible";	 Catch:{ NoSuchMethodException -> 0x003c }
            r4 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x003c }
            r5 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x003c }
            r4[r0] = r5;	 Catch:{ NoSuchMethodException -> 0x003c }
            r0 = r2.getMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x003c }
            r6.ensureImeVisible = r0;	 Catch:{ NoSuchMethodException -> 0x003c }
            r0 = r6.ensureImeVisible;	 Catch:{ NoSuchMethodException -> 0x003c }
            r0.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x003c }
        L_0x003c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.AutoCompleteTextViewReflector.<init>():void");
        }

        void doAfterTextChanged(android.widget.AutoCompleteTextView r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r0 = r2.doAfterTextChanged;
            if (r0 == 0) goto L_0x000c;
        L_0x0004:
            r0 = r2.doAfterTextChanged;	 Catch:{ Exception -> 0x000c }
            r1 = 0;	 Catch:{ Exception -> 0x000c }
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x000c }
            r0.invoke(r3, r1);	 Catch:{ Exception -> 0x000c }
        L_0x000c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.AutoCompleteTextViewReflector.doAfterTextChanged(android.widget.AutoCompleteTextView):void");
        }

        void doBeforeTextChanged(android.widget.AutoCompleteTextView r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r0 = r2.doBeforeTextChanged;
            if (r0 == 0) goto L_0x000c;
        L_0x0004:
            r0 = r2.doBeforeTextChanged;	 Catch:{ Exception -> 0x000c }
            r1 = 0;	 Catch:{ Exception -> 0x000c }
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x000c }
            r0.invoke(r3, r1);	 Catch:{ Exception -> 0x000c }
        L_0x000c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.AutoCompleteTextViewReflector.doBeforeTextChanged(android.widget.AutoCompleteTextView):void");
        }

        void ensureImeVisible(android.widget.AutoCompleteTextView r4, boolean r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r0 = r3.ensureImeVisible;
            if (r0 == 0) goto L_0x0013;
        L_0x0004:
            r0 = r3.ensureImeVisible;	 Catch:{ Exception -> 0x0013 }
            r1 = 1;	 Catch:{ Exception -> 0x0013 }
            r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0013 }
            r2 = 0;	 Catch:{ Exception -> 0x0013 }
            r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ Exception -> 0x0013 }
            r1[r2] = r5;	 Catch:{ Exception -> 0x0013 }
            r0.invoke(r4, r1);	 Catch:{ Exception -> 0x0013 }
        L_0x0013:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.AutoCompleteTextViewReflector.ensureImeVisible(android.widget.AutoCompleteTextView, boolean):void");
        }
    }

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    private static class UpdatableTouchDelegate extends TouchDelegate {
        private final Rect mActualBounds = new Rect();
        private boolean mDelegateTargeted;
        private final View mDelegateView;
        private final int mSlop;
        private final Rect mSlopBounds = new Rect();
        private final Rect mTargetBounds = new Rect();

        public UpdatableTouchDelegate(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.mSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            setBounds(rect, rect2);
            this.mDelegateView = view;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
            r6 = this;
            r0 = r7.getX();
            r0 = (int) r0;
            r1 = r7.getY();
            r1 = (int) r1;
            r2 = r7.getAction();
            r3 = 1;
            r4 = 0;
            switch(r2) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0019;
                case 2: goto L_0x0019;
                case 3: goto L_0x0014;
                default: goto L_0x0013;
            };
        L_0x0013:
            goto L_0x0033;
        L_0x0014:
            r2 = r6.mDelegateTargeted;
            r6.mDelegateTargeted = r4;
            goto L_0x0034;
        L_0x0019:
            r2 = r6.mDelegateTargeted;
            if (r2 == 0) goto L_0x0034;
        L_0x001d:
            r5 = r6.mSlopBounds;
            r5 = r5.contains(r0, r1);
            if (r5 != 0) goto L_0x0034;
        L_0x0025:
            r3 = r4;
            goto L_0x0034;
        L_0x0027:
            r2 = r6.mTargetBounds;
            r2 = r2.contains(r0, r1);
            if (r2 == 0) goto L_0x0033;
        L_0x002f:
            r6.mDelegateTargeted = r3;
            r2 = r3;
            goto L_0x0034;
        L_0x0033:
            r2 = r4;
        L_0x0034:
            if (r2 == 0) goto L_0x0067;
        L_0x0036:
            if (r3 == 0) goto L_0x0052;
        L_0x0038:
            r2 = r6.mActualBounds;
            r2 = r2.contains(r0, r1);
            if (r2 != 0) goto L_0x0052;
        L_0x0040:
            r0 = r6.mDelegateView;
            r0 = r0.getWidth();
            r0 = r0 / 2;
            r0 = (float) r0;
            r1 = r6.mDelegateView;
            r1 = r1.getHeight();
            r1 = r1 / 2;
            goto L_0x005d;
        L_0x0052:
            r2 = r6.mActualBounds;
            r2 = r2.left;
            r0 = r0 - r2;
            r0 = (float) r0;
            r2 = r6.mActualBounds;
            r2 = r2.top;
            r1 = r1 - r2;
        L_0x005d:
            r1 = (float) r1;
            r7.setLocation(r0, r1);
            r0 = r6.mDelegateView;
            r4 = r0.dispatchTouchEvent(r7);
        L_0x0067:
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.UpdatableTouchDelegate.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void setBounds(Rect rect, Rect rect2) {
            this.mTargetBounds.set(rect);
            this.mSlopBounds.set(rect);
            this.mSlopBounds.inset(-this.mSlop, -this.mSlop);
            this.mActualBounds.set(rect2);
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C07761();
        boolean isIconified;

        static class C07761 implements ClassLoaderCreator<SavedState> {
            C07761() {
            }

            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isIconified = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("SearchView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" isIconified=");
            stringBuilder.append(this.isIconified);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.isIconified));
        }
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        private boolean mHasPendingShowSoftInputRequest;
        final Runnable mRunShowSoftInputIfNecessary;
        private SearchView mSearchView;
        private int mThreshold;

        class C07771 implements Runnable {
            C07771() {
            }

            public void run() {
                SearchAutoComplete.this.showSoftInputIfNecessary();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0635a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.mRunShowSoftInputIfNecessary = new C07771();
            this.mThreshold = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < IjkMediaCodecInfo.RANK_LAST_CHANCE) {
                if (i < 640 || i2 < 480) {
                    return 160;
                }
            }
            return 192;
        }

        private boolean isEmpty() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        private void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.mHasPendingShowSoftInputRequest = false;
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.mHasPendingShowSoftInputRequest = false;
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.mHasPendingShowSoftInputRequest = true;
            }
        }

        private void showSoftInputIfNecessary() {
            if (this.mHasPendingShowSoftInputRequest) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.mHasPendingShowSoftInputRequest = false;
            }
        }

        public boolean enoughToFilter() {
            if (this.mThreshold > 0) {
                if (!super.enoughToFilter()) {
                    return false;
                }
            }
            return true;
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.mHasPendingShowSoftInputRequest) {
                removeCallbacks(this.mRunShowSoftInputIfNecessary);
                post(this.mRunShowSoftInputIfNecessary);
            }
            return onCreateInputConnection;
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.mSearchView.onTextFocusChanged();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.mSearchView.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.mSearchView.hasFocus() && getVisibility() == 0) {
                this.mHasPendingShowSoftInputRequest = true;
                if (SearchView.isLandscapeMode(getContext())) {
                    SearchView.HIDDEN_METHOD_INVOKER.ensureImeVisible(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        protected void replaceText(CharSequence charSequence) {
        }

        void setSearchView(SearchView searchView) {
            this.mSearchView = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.mThreshold = i;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0635a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new C07671();
        this.mReleaseCursorRunnable = new C07682();
        this.mOutsideDrawablesCache = new WeakHashMap();
        this.mOnClickListener = new C07715();
        this.mTextKeyListener = new C07726();
        this.mOnEditorActionListener = new C07737();
        this.mOnItemClickListener = new C07748();
        this.mOnItemSelectedListener = new C07759();
        this.mTextWatcher = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.onTextChanged(charSequence);
            }
        };
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0644j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(C0644j.SearchView_layout, C0641g.abc_search_view), this, true);
        this.mSearchSrcTextView = (SearchAutoComplete) findViewById(C0640f.search_src_text);
        this.mSearchSrcTextView.setSearchView(this);
        this.mSearchEditFrame = findViewById(C0640f.search_edit_frame);
        this.mSearchPlate = findViewById(C0640f.search_plate);
        this.mSubmitArea = findViewById(C0640f.submit_area);
        this.mSearchButton = (ImageView) findViewById(C0640f.search_button);
        this.mGoButton = (ImageView) findViewById(C0640f.search_go_btn);
        this.mCloseButton = (ImageView) findViewById(C0640f.search_close_btn);
        this.mVoiceButton = (ImageView) findViewById(C0640f.search_voice_btn);
        this.mCollapsedIcon = (ImageView) findViewById(C0640f.search_mag_icon);
        C0571r.m1339a(this.mSearchPlate, obtainStyledAttributes.getDrawable(C0644j.SearchView_queryBackground));
        C0571r.m1339a(this.mSubmitArea, obtainStyledAttributes.getDrawable(C0644j.SearchView_submitBackground));
        this.mSearchButton.setImageDrawable(obtainStyledAttributes.getDrawable(C0644j.SearchView_searchIcon));
        this.mGoButton.setImageDrawable(obtainStyledAttributes.getDrawable(C0644j.SearchView_goIcon));
        this.mCloseButton.setImageDrawable(obtainStyledAttributes.getDrawable(C0644j.SearchView_closeIcon));
        this.mVoiceButton.setImageDrawable(obtainStyledAttributes.getDrawable(C0644j.SearchView_voiceIcon));
        this.mCollapsedIcon.setImageDrawable(obtainStyledAttributes.getDrawable(C0644j.SearchView_searchIcon));
        this.mSearchHintIcon = obtainStyledAttributes.getDrawable(C0644j.SearchView_searchHintIcon);
        TooltipCompat.setTooltipText(this.mSearchButton, getResources().getString(C0642h.abc_searchview_description_search));
        this.mSuggestionRowLayout = obtainStyledAttributes.getResourceId(C0644j.SearchView_suggestionRowLayout, C0641g.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = obtainStyledAttributes.getResourceId(C0644j.SearchView_commitIcon, 0);
        this.mSearchButton.setOnClickListener(this.mOnClickListener);
        this.mCloseButton.setOnClickListener(this.mOnClickListener);
        this.mGoButton.setOnClickListener(this.mOnClickListener);
        this.mVoiceButton.setOnClickListener(this.mOnClickListener);
        this.mSearchSrcTextView.setOnClickListener(this.mOnClickListener);
        this.mSearchSrcTextView.addTextChangedListener(this.mTextWatcher);
        this.mSearchSrcTextView.setOnEditorActionListener(this.mOnEditorActionListener);
        this.mSearchSrcTextView.setOnItemClickListener(this.mOnItemClickListener);
        this.mSearchSrcTextView.setOnItemSelectedListener(this.mOnItemSelectedListener);
        this.mSearchSrcTextView.setOnKeyListener(this.mTextKeyListener);
        this.mSearchSrcTextView.setOnFocusChangeListener(new C07693());
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(C0644j.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0644j.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.mDefaultQueryHint = obtainStyledAttributes.getText(C0644j.SearchView_defaultQueryHint);
        this.mQueryHint = obtainStyledAttributes.getText(C0644j.SearchView_queryHint);
        dimensionPixelSize = obtainStyledAttributes.getInt(C0644j.SearchView_android_imeOptions, -1);
        if (dimensionPixelSize != -1) {
            setImeOptions(dimensionPixelSize);
        }
        dimensionPixelSize = obtainStyledAttributes.getInt(C0644j.SearchView_android_inputType, -1);
        if (dimensionPixelSize != -1) {
            setInputType(dimensionPixelSize);
        }
        setFocusable(obtainStyledAttributes.getBoolean(C0644j.SearchView_android_focusable, true));
        obtainStyledAttributes.recycle();
        this.mVoiceWebSearchIntent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent.addFlags(268435456);
        this.mVoiceWebSearchIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.mVoiceAppSearchIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent.addFlags(268435456);
        this.mDropDownAnchor = findViewById(this.mSearchSrcTextView.getDropDownAnchor());
        if (this.mDropDownAnchor != null) {
            this.mDropDownAnchor.addOnLayoutChangeListener(new C07704());
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.mAppSearchData != null) {
            intent.putExtra("app_data", this.mAppSearchData);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    private android.content.Intent createIntentFromSuggestion(android.database.Cursor r9, int r10, java.lang.String r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = 0;
        r1 = "suggest_intent_action";	 Catch:{ RuntimeException -> 0x0061 }
        r1 = android.support.v7.widget.SuggestionsAdapter.getColumnString(r9, r1);	 Catch:{ RuntimeException -> 0x0061 }
        if (r1 != 0) goto L_0x000f;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0009:
        r1 = r8.mSearchable;	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r1.getSuggestIntentAction();	 Catch:{ RuntimeException -> 0x0061 }
    L_0x000f:
        if (r1 != 0) goto L_0x0013;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0011:
        r1 = "android.intent.action.SEARCH";	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0013:
        r2 = r1;	 Catch:{ RuntimeException -> 0x0061 }
        r1 = "suggest_intent_data";	 Catch:{ RuntimeException -> 0x0061 }
        r1 = android.support.v7.widget.SuggestionsAdapter.getColumnString(r9, r1);	 Catch:{ RuntimeException -> 0x0061 }
        if (r1 != 0) goto L_0x0022;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x001c:
        r1 = r8.mSearchable;	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r1.getSuggestIntentData();	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0022:
        if (r1 == 0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0024:
        r3 = "suggest_intent_data_id";	 Catch:{ RuntimeException -> 0x0061 }
        r3 = android.support.v7.widget.SuggestionsAdapter.getColumnString(r9, r3);	 Catch:{ RuntimeException -> 0x0061 }
        if (r3 == 0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x002c:
        r4 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0061 }
        r4.<init>();	 Catch:{ RuntimeException -> 0x0061 }
        r4.append(r1);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = "/";	 Catch:{ RuntimeException -> 0x0061 }
        r4.append(r1);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = android.net.Uri.encode(r3);	 Catch:{ RuntimeException -> 0x0061 }
        r4.append(r1);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r4.toString();	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0044:
        if (r1 != 0) goto L_0x0048;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0046:
        r3 = r0;	 Catch:{ RuntimeException -> 0x0061 }
        goto L_0x004d;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x0048:
        r1 = android.net.Uri.parse(r1);	 Catch:{ RuntimeException -> 0x0061 }
        r3 = r1;	 Catch:{ RuntimeException -> 0x0061 }
    L_0x004d:
        r1 = "suggest_intent_query";	 Catch:{ RuntimeException -> 0x0061 }
        r5 = android.support.v7.widget.SuggestionsAdapter.getColumnString(r9, r1);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = "suggest_intent_extra_data";	 Catch:{ RuntimeException -> 0x0061 }
        r4 = android.support.v7.widget.SuggestionsAdapter.getColumnString(r9, r1);	 Catch:{ RuntimeException -> 0x0061 }
        r1 = r8;	 Catch:{ RuntimeException -> 0x0061 }
        r6 = r10;	 Catch:{ RuntimeException -> 0x0061 }
        r7 = r11;	 Catch:{ RuntimeException -> 0x0061 }
        r10 = r1.createIntent(r2, r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0061 }
        return r10;
    L_0x0061:
        r10 = move-exception;
        r9 = r9.getPosition();	 Catch:{ RuntimeException -> 0x0067 }
        goto L_0x0068;
    L_0x0067:
        r9 = -1;
    L_0x0068:
        r11 = "SearchView";
        r1 = new java.lang.StringBuilder;
        r2 = "Search suggestions cursor at row ";
        r1.<init>(r2);
        r1.append(r9);
        r9 = " returned exception.";
        r1.append(r9);
        r9 = r1.toString();
        android.util.Log.w(r11, r9, r10);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.createIntentFromSuggestion(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        Parcelable activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        if (this.mAppSearchData != null) {
            bundle.putParcelable("app_data", this.mAppSearchData);
        }
        Intent intent3 = new Intent(intent);
        String str = "free_form";
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        String str2 = null;
        String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", string);
        intent3.putExtra("android.speech.extra.LANGUAGE", string2);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        str = "calling_package";
        if (searchActivity != null) {
            str2 = searchActivity.flattenToShortString();
        }
        intent3.putExtra(str, str2);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    private void getChildBoundsWithinSearchView(View view, Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int i = this.mTemp[1] - this.mTemp2[1];
        int i2 = this.mTemp[0] - this.mTemp2[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        if (!this.mIconifiedByDefault || this.mSearchHintIcon == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.mSearchSrcTextView.getTextSize()) * 1.25d);
        this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
        CharSequence spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0638d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0638d.abc_search_view_preferred_width);
    }

    private boolean hasVoiceSearch() {
        if (this.mSearchable != null && this.mSearchable.getVoiceSearchEnabled()) {
            Intent intent = null;
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.mVoiceWebSearchIntent;
            } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
                intent = this.mVoiceAppSearchIntent;
            }
            if (!(intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null)) {
                return true;
            }
        }
        return false;
    }

    static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean isSubmitAreaEnabled() {
        return (this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified();
    }

    private void launchIntent(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (Throwable e) {
                String str = LOG_TAG;
                StringBuilder stringBuilder = new StringBuilder("Failed launch activity: ");
                stringBuilder.append(intent);
                Log.e(str, stringBuilder.toString(), e);
            }
        }
    }

    private boolean launchSuggestion(int i, int i2, String str) {
        Cursor cursor = this.mSuggestionsAdapter.getCursor();
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        launchIntent(createIntentFromSuggestion(cursor, i2, str));
        return true;
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    private void rewriteQueryFromSuggestion(int i) {
        CharSequence text = this.mSearchSrcTextView.getText();
        Cursor cursor = this.mSuggestionsAdapter.getCursor();
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                CharSequence convertToString = this.mSuggestionsAdapter.convertToString(cursor);
                if (convertToString != null) {
                    setQuery(convertToString);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private void updateCloseButton() {
        int i = 1;
        int isEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText()) ^ 1;
        int i2 = 0;
        if (isEmpty == 0) {
            if (!this.mIconifiedByDefault || this.mExpandedInActionView) {
                i = 0;
            }
        }
        ImageView imageView = this.mCloseButton;
        if (i == 0) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            drawable.setState(isEmpty != 0 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void updateQueryHint() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(getDecoratedHint(queryHint));
    }

    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType = (inputType | 65536) | 524288;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        if (this.mSuggestionsAdapter != null) {
            this.mSuggestionsAdapter.changeCursor(null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            this.mSuggestionsAdapter = new SuggestionsAdapter(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSearchSrcTextView.setAdapter(this.mSuggestionsAdapter);
            SuggestionsAdapter suggestionsAdapter = (SuggestionsAdapter) this.mSuggestionsAdapter;
            if (this.mQueryRefinement) {
                i = 2;
            }
            suggestionsAdapter.setQueryRefinement(i);
        }
    }

    private void updateSubmitArea() {
        int i = (isSubmitAreaEnabled() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) ? 0 : 8;
        this.mSubmitArea.setVisibility(i);
    }

    private void updateSubmitButton(boolean z) {
        int i = (this.mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (z || !this.mVoiceButtonEnabled)) ? 0 : 8;
        this.mGoButton.setVisibility(i);
    }

    private void updateViewsVisibility(boolean z) {
        this.mIconified = z;
        int i = 8;
        boolean z2 = false;
        boolean isEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText()) ^ true;
        this.mSearchButton.setVisibility(z ? 0 : 8);
        updateSubmitButton(isEmpty);
        this.mSearchEditFrame.setVisibility(z ? 8 : 0);
        if (this.mCollapsedIcon.getDrawable() != null) {
            if (!this.mIconifiedByDefault) {
                i = 0;
            }
        }
        this.mCollapsedIcon.setVisibility(i);
        updateCloseButton();
        if (!isEmpty) {
            z2 = true;
        }
        updateVoiceButton(z2);
        updateSubmitArea();
    }

    private void updateVoiceButton(boolean z) {
        int i;
        if (this.mVoiceButtonEnabled && !isIconified() && z) {
            i = 0;
            this.mGoButton.setVisibility(8);
        } else {
            i = 8;
        }
        this.mVoiceButton.setVisibility(i);
    }

    void adjustDropDownSizeAndPosition() {
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
            int dimensionPixelSize = this.mIconifiedByDefault ? resources.getDimensionPixelSize(C0638d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0638d.abc_dropdownitem_text_padding_left) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            this.mSearchSrcTextView.setDropDownHorizontalOffset(isLayoutRtl ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mClearingFocus = false;
    }

    void forceSuggestionQuery() {
        HIDDEN_METHOD_INVOKER.doBeforeTextChanged(this.mSearchSrcTextView);
        HIDDEN_METHOD_INVOKER.doAfterTextChanged(this.mSearchSrcTextView);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public CharSequence getQueryHint() {
        return this.mQueryHint != null ? this.mQueryHint : (this.mSearchable == null || this.mSearchable.getHintId() == 0) ? this.mDefaultQueryHint : getContext().getText(this.mSearchable.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public C4854e getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(createIntent("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    public void onActionViewExpanded() {
        if (!this.mExpandedInActionView) {
            this.mExpandedInActionView = true;
            this.mCollapsedImeOptions = this.mSearchSrcTextView.getImeOptions();
            this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions | 33554432);
            this.mSearchSrcTextView.setText("");
            setIconified(false);
        }
    }

    void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.setImeVisibility(true);
        } else if (this.mIconifiedByDefault && (this.mOnCloseListener == null || !this.mOnCloseListener.onClose())) {
            clearFocus();
            updateViewsVisibility(true);
        }
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    boolean onItemClicked(int i, int i2, String str) {
        if (this.mOnSuggestionListener != null) {
            if (this.mOnSuggestionListener.onSuggestionClick(i)) {
                return false;
            }
        }
        launchSuggestion(i, 0, null);
        this.mSearchSrcTextView.setImeVisibility(false);
        dismissSuggestions();
        return true;
    }

    boolean onItemSelected(int i) {
        if (this.mOnSuggestionListener != null) {
            if (this.mOnSuggestionListener.onSuggestionSelect(i)) {
                return false;
            }
        }
        rewriteQueryFromSuggestion(i);
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            this.mSearchSrtTextViewBoundsExpanded.set(this.mSearchSrcTextViewBounds.left, 0, this.mSearchSrcTextViewBounds.right, i4 - i2);
            if (this.mTouchDelegate == null) {
                this.mTouchDelegate = new UpdatableTouchDelegate(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, this.mSearchSrcTextView);
                setTouchDelegate(this.mTouchDelegate);
                return;
            }
            this.mTouchDelegate.setBounds(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i = this.mMaxWidth > 0 ? this.mMaxWidth : getPreferredWidth();
            } else if (mode == 1073741824) {
                if (this.mMaxWidth > 0) {
                }
            }
            mode = MeasureSpec.getMode(i2);
            i2 = MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                i2 = Math.min(getPreferredHeight(), i2);
            } else if (mode != 0) {
                i2 = getPreferredHeight();
            }
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
        } else if (this.mMaxWidth <= 0) {
            mode = getPreferredWidth();
            i = Math.min(mode, i);
            mode = MeasureSpec.getMode(i2);
            i2 = MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                i2 = Math.min(getPreferredHeight(), i2);
            } else if (mode != 0) {
                i2 = getPreferredHeight();
            }
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
        }
        mode = this.mMaxWidth;
        i = Math.min(mode, i);
        mode = MeasureSpec.getMode(i2);
        i2 = MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            i2 = Math.min(getPreferredHeight(), i2);
        } else if (mode != 0) {
            i2 = getPreferredHeight();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
    }

    void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            updateViewsVisibility(savedState.isIconified);
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.isIconified = isIconified();
        return savedState;
    }

    void onSearchClicked() {
        updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        if (this.mOnSearchClickListener != null) {
            this.mOnSearchClickListener.onClick(this);
        }
    }

    void onSubmitQuery() {
        CharSequence text = this.mSearchSrcTextView.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.mOnQueryChangeListener == null || !this.mOnQueryChangeListener.onQueryTextSubmit(text.toString())) {
                if (this.mSearchable != null) {
                    launchQuerySearch(0, null, text.toString());
                }
                this.mSearchSrcTextView.setImeVisibility(false);
                dismissSuggestions();
            }
        }
    }

    boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (!(i == 66 || i == 84)) {
                if (i != 61) {
                    if (i != 21) {
                        if (i != 22) {
                            if (i != 19 || this.mSearchSrcTextView.getListSelection() == 0) {
                                return false;
                            }
                        }
                    }
                    this.mSearchSrcTextView.setSelection(i == 21 ? 0 : this.mSearchSrcTextView.length());
                    this.mSearchSrcTextView.setListSelection(0);
                    this.mSearchSrcTextView.clearListSelection();
                    HIDDEN_METHOD_INVOKER.ensureImeVisible(this.mSearchSrcTextView, true);
                    return true;
                }
            }
            return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
        }
        return false;
    }

    void onTextChanged(CharSequence charSequence) {
        CharSequence text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean z = true;
        boolean isEmpty = TextUtils.isEmpty(text) ^ true;
        updateSubmitButton(isEmpty);
        if (isEmpty) {
            z = false;
        }
        updateVoiceButton(z);
        updateCloseButton();
        updateSubmitArea();
        if (!(this.mOnQueryChangeListener == null || TextUtils.equals(charSequence, this.mOldQueryText))) {
            this.mOnQueryChangeListener.onQueryTextChange(charSequence.toString());
        }
        this.mOldQueryText = charSequence.toString();
    }

    void onTextFocusChanged() {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    void onVoiceClicked() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.mSearchable;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r2.mSearchable;
        r1 = r0.getVoiceSearchLaunchWebSearch();	 Catch:{ ActivityNotFoundException -> 0x002f }
        if (r1 == 0) goto L_0x001b;	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x000d:
        r1 = r2.mVoiceWebSearchIntent;	 Catch:{ ActivityNotFoundException -> 0x002f }
        r0 = r2.createVoiceWebSearchIntent(r1, r0);	 Catch:{ ActivityNotFoundException -> 0x002f }
        r1 = r2.getContext();	 Catch:{ ActivityNotFoundException -> 0x002f }
        r1.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x002f }
        return;	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x001b:
        r1 = r0.getVoiceSearchLaunchRecognizer();	 Catch:{ ActivityNotFoundException -> 0x002f }
        if (r1 == 0) goto L_0x002e;	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x0021:
        r1 = r2.mVoiceAppSearchIntent;	 Catch:{ ActivityNotFoundException -> 0x002f }
        r0 = r2.createVoiceAppSearchIntent(r1, r0);	 Catch:{ ActivityNotFoundException -> 0x002f }
        r1 = r2.getContext();	 Catch:{ ActivityNotFoundException -> 0x002f }
        r1.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x002e:
        return;
    L_0x002f:
        r0 = "SearchView";
        r1 = "Could not find voice search activity";
        android.util.Log.w(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.onVoiceClicked():void");
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        postUpdateFocusedState();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (requestFocus) {
            updateViewsVisibility(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault != z) {
            this.mIconifiedByDefault = z;
            updateViewsVisibility(z);
            updateQueryHint();
        }
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.mOnCloseListener = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.mOnQueryChangeListener = onQueryTextListener;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.mOnSuggestionListener = onSuggestionListener;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            this.mSearchSrcTextView.setSelection(this.mSearchSrcTextView.length());
            this.mUserQuery = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            onSubmitQuery();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        if (this.mSuggestionsAdapter instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) this.mSuggestionsAdapter).setQueryRefinement(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (this.mSearchable != null) {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        this.mVoiceButtonEnabled = hasVoiceSearch();
        if (this.mVoiceButtonEnabled) {
            this.mSearchSrcTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        }
        updateViewsVisibility(isIconified());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        updateViewsVisibility(isIconified());
    }

    public void setSuggestionsAdapter(C4854e c4854e) {
        this.mSuggestionsAdapter = c4854e;
        this.mSearchSrcTextView.setAdapter(this.mSuggestionsAdapter);
    }

    void updateFocusedState() {
        int[] iArr = this.mSearchSrcTextView.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        background = this.mSubmitArea.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        invalidate();
    }
}
