package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0249a.C0245h;
import android.support.design.C0249a.C0246i;
import android.support.design.C0249a.C0247j;
import android.support.design.C0249a.C0248k;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0547a;
import android.support.v4.view.C0571r;
import android.support.v4.view.p039a.C0536b;
import android.support.v4.widget.C0628m;
import android.support.v4.widget.Space;
import android.support.v7.p043c.p044a.C0683b;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.TintTypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class TextInputLayout extends LinearLayout {
    private CharSequence f1082A;
    private CheckableImageButton f1083B;
    private boolean f1084C;
    private Drawable f1085D;
    private Drawable f1086E;
    private ColorStateList f1087F;
    private boolean f1088G;
    private Mode f1089H;
    private boolean f1090I;
    private boolean f1091J;
    private boolean f1092K;
    private ValueAnimator f1093L;
    private boolean f1094M;
    private boolean f1095N;
    private boolean f1096O;
    EditText f1097a;
    public boolean f1098b;
    TextView f1099c;
    boolean f1100d;
    public ColorStateList f1101e;
    public ColorStateList f1102f;
    final C0310g f1103g;
    private final FrameLayout f1104h;
    private CharSequence f1105i;
    private boolean f1106j;
    private CharSequence f1107k;
    private Paint f1108l;
    private final Rect f1109m;
    private LinearLayout f1110n;
    private int f1111o;
    private Typeface f1112p;
    private int f1113q;
    private boolean f1114r;
    private CharSequence f1115s;
    private TextView f1116t;
    private int f1117u;
    private int f1118v;
    private int f1119w;
    private boolean f1120x;
    private boolean f1121y;
    private Drawable f1122z;

    class C02901 implements TextWatcher {
        final /* synthetic */ TextInputLayout f1076a;

        C02901(TextInputLayout textInputLayout) {
            this.f1076a = textInputLayout;
        }

        public final void afterTextChanged(Editable editable) {
            this.f1076a.m563a(this.f1076a.f1096O ^ 1, false);
            if (this.f1076a.f1100d) {
                this.f1076a.m562a(editable.length());
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class C02912 extends AnimatorListenerAdapter {
        final /* synthetic */ TextInputLayout f1077a;

        C02912(TextInputLayout textInputLayout) {
            this.f1077a = textInputLayout;
        }

        public final void onAnimationStart(Animator animator) {
            this.f1077a.f1099c.setVisibility(0);
        }
    }

    class C02934 implements OnClickListener {
        final /* synthetic */ TextInputLayout f1080a;

        C02934(TextInputLayout textInputLayout) {
            this.f1080a = textInputLayout;
        }

        public final void onClick(View view) {
            this.f1080a.m554a(false);
        }
    }

    class C02945 implements AnimatorUpdateListener {
        final /* synthetic */ TextInputLayout f1081a;

        C02945(TextInputLayout textInputLayout) {
            this.f1081a = textInputLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1081a.f1103g.m593a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C02951();
        CharSequence f13119a;
        boolean f13120b;

        static class C02951 implements ClassLoaderCreator<SavedState> {
            C02951() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13119a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f13120b = z;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("TextInputLayout.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" error=");
            stringBuilder.append(this.f13119a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f13119a, parcel, i);
            parcel.writeInt(this.f13120b);
        }
    }

    private class C4744a extends C0547a {
        final /* synthetic */ TextInputLayout f13121a;

        C4744a(TextInputLayout textInputLayout) {
            this.f13121a = textInputLayout;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0536b c0536b) {
            super.onInitializeAccessibilityNodeInfo(view, c0536b);
            c0536b.m1195a(TextInputLayout.class.getSimpleName());
            CharSequence charSequence = this.f13121a.f1103g.f1196i;
            if (!TextUtils.isEmpty(charSequence)) {
                c0536b.f1836b.setText(charSequence);
            }
            if (this.f13121a.f1097a != null) {
                C0536b.f1835a.mo2552a(c0536b.f1836b, this.f13121a.f1097a);
            }
            charSequence = this.f13121a.f1099c != null ? this.f13121a.f1099c.getText() : null;
            if (!TextUtils.isEmpty(charSequence)) {
                C0536b.f1835a.mo3498d(c0536b.f1836b);
                C0536b.f1835a.mo3583a(c0536b.f1836b, charSequence);
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            CharSequence charSequence = this.f13121a.f1103g.f1196i;
            if (!TextUtils.isEmpty(charSequence)) {
                accessibilityEvent.getText().add(charSequence);
            }
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f1109m = new Rect();
        this.f1103g = new C0310g(this);
        C0330t.m650a(context);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f1104h = new FrameLayout(context);
        this.f1104h.setAddStatesFromChildren(true);
        addView(this.f1104h);
        this.f1103g.m599a(C0296a.f1124b);
        C0310g c0310g = this.f1103g;
        c0310g.f1197j = new AccelerateInterpolator();
        c0310g.m602b();
        this.f1103g.m603b(8388659);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0248k.TextInputLayout, i, C0247j.Widget_Design_TextInputLayout);
        this.f1106j = obtainStyledAttributes.getBoolean(C0248k.TextInputLayout_hintEnabled, true);
        setHint(obtainStyledAttributes.getText(C0248k.TextInputLayout_android_hint));
        this.f1092K = obtainStyledAttributes.getBoolean(C0248k.TextInputLayout_hintAnimationEnabled, true);
        if (obtainStyledAttributes.hasValue(C0248k.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C0248k.TextInputLayout_android_textColorHint);
            this.f1102f = colorStateList;
            this.f1101e = colorStateList;
        }
        if (obtainStyledAttributes.getResourceId(C0248k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(C0248k.TextInputLayout_hintTextAppearance, 0));
        }
        this.f1113q = obtainStyledAttributes.getResourceId(C0248k.TextInputLayout_errorTextAppearance, 0);
        boolean z = obtainStyledAttributes.getBoolean(C0248k.TextInputLayout_errorEnabled, false);
        boolean z2 = obtainStyledAttributes.getBoolean(C0248k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(C0248k.TextInputLayout_counterMaxLength, -1));
        this.f1118v = obtainStyledAttributes.getResourceId(C0248k.TextInputLayout_counterTextAppearance, 0);
        this.f1119w = obtainStyledAttributes.getResourceId(C0248k.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f1121y = obtainStyledAttributes.getBoolean(C0248k.TextInputLayout_passwordToggleEnabled, false);
        this.f1122z = obtainStyledAttributes.getDrawable(C0248k.TextInputLayout_passwordToggleDrawable);
        this.f1082A = obtainStyledAttributes.getText(C0248k.TextInputLayout_passwordToggleContentDescription);
        if (obtainStyledAttributes.hasValue(C0248k.TextInputLayout_passwordToggleTint)) {
            this.f1088G = true;
            this.f1087F = obtainStyledAttributes.getColorStateList(C0248k.TextInputLayout_passwordToggleTint);
        }
        if (obtainStyledAttributes.hasValue(C0248k.TextInputLayout_passwordToggleTintMode)) {
            this.f1090I = true;
            this.f1089H = C0333x.m656a(obtainStyledAttributes.getInt(C0248k.TextInputLayout_passwordToggleTintMode, -1));
        }
        obtainStyledAttributes.recycle();
        setErrorEnabled(z);
        setCounterEnabled(z2);
        m561f();
        if (C0571r.m1364f(this) == 0) {
            C0571r.m1352b((View) this, 1);
        }
        C0571r.m1340a((View) this, new C4744a(this));
    }

    private void m549a() {
        int i;
        LayoutParams layoutParams = (LayoutParams) this.f1104h.getLayoutParams();
        if (this.f1106j) {
            if (this.f1108l == null) {
                this.f1108l = new Paint();
            }
            this.f1108l.setTypeface(this.f1103g.m592a());
            this.f1108l.setTextSize(this.f1103g.f1192e);
            i = (int) (-this.f1108l.ascent());
        } else {
            i = 0;
        }
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.f1104h.requestLayout();
        }
    }

    private void m550a(float f) {
        if (this.f1103g.f1188a != f) {
            if (this.f1093L == null) {
                this.f1093L = new ValueAnimator();
                this.f1093L.setInterpolator(C0296a.f1123a);
                this.f1093L.setDuration(200);
                this.f1093L.addUpdateListener(new C02945(this));
            }
            this.f1093L.setFloatValues(new float[]{this.f1103g.f1188a, f});
            this.f1093L.start();
        }
    }

    private static void m551a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m551a((ViewGroup) childAt, z);
            }
        }
    }

    private void m552a(TextView textView) {
        if (this.f1110n != null) {
            this.f1110n.removeView(textView);
            int i = this.f1111o - 1;
            this.f1111o = i;
            if (i == 0) {
                this.f1110n.setVisibility(8);
            }
        }
    }

    private void m553a(TextView textView, int i) {
        if (this.f1110n == null) {
            this.f1110n = new LinearLayout(getContext());
            this.f1110n.setOrientation(0);
            addView(this.f1110n, -1, -2);
            this.f1110n.addView(new Space(getContext()), new LayoutParams(0, 0, BallPulseIndicator.SCALE));
            if (this.f1097a != null) {
                m556b();
            }
        }
        this.f1110n.setVisibility(0);
        this.f1110n.addView(textView, i);
        this.f1111o++;
    }

    private void m554a(boolean z) {
        if (this.f1121y) {
            boolean z2;
            int selectionEnd = this.f1097a.getSelectionEnd();
            if (m560e()) {
                this.f1097a.setTransformationMethod(null);
                z2 = true;
            } else {
                this.f1097a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                z2 = false;
            }
            this.f1084C = z2;
            this.f1083B.setChecked(this.f1084C);
            if (z) {
                this.f1083B.jumpDrawablesToCurrentState();
            }
            this.f1097a.setSelection(selectionEnd);
        }
    }

    private void m556b() {
        C0571r.m1353b(this.f1110n, C0571r.m1374k(this.f1097a), 0, C0571r.m1375l(this.f1097a), this.f1097a.getPaddingBottom());
    }

    private void m558c() {
        if (this.f1097a != null) {
            Drawable background = this.f1097a.getBackground();
            if (background != null) {
                int i = VERSION.SDK_INT;
                if (i == 21 || i == 22) {
                    Drawable background2 = this.f1097a.getBackground();
                    if (!(background2 == null || this.f1094M)) {
                        Drawable newDrawable = background2.getConstantState().newDrawable();
                        if (background2 instanceof DrawableContainer) {
                            this.f1094M = C0312i.m612a((DrawableContainer) background2, newDrawable.getConstantState());
                        }
                        if (!this.f1094M) {
                            C0571r.m1339a(this.f1097a, newDrawable);
                            this.f1094M = true;
                        }
                    }
                }
                if (DrawableUtils.canSafelyMutateDrawable(background)) {
                    background = background.mutate();
                }
                if (this.f1114r && this.f1099c != null) {
                    background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.f1099c.getCurrentTextColor(), Mode.SRC_IN));
                } else if (!this.f1120x || this.f1116t == null) {
                    C0429a.m895f(background);
                    this.f1097a.refreshDrawableState();
                } else {
                    background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.f1116t.getCurrentTextColor(), Mode.SRC_IN));
                }
            }
        }
    }

    private void m559d() {
        if (this.f1097a != null) {
            int i = (this.f1121y && (m560e() || this.f1084C)) ? 1 : false;
            Drawable[] b;
            if (i != 0) {
                if (this.f1083B == null) {
                    this.f1083B = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0245h.design_text_input_password_icon, this.f1104h, false);
                    this.f1083B.setImageDrawable(this.f1122z);
                    this.f1083B.setContentDescription(this.f1082A);
                    this.f1104h.addView(this.f1083B);
                    this.f1083B.setOnClickListener(new C02934(this));
                }
                if (this.f1097a != null && C0571r.m1379p(this.f1097a) <= 0) {
                    this.f1097a.setMinimumHeight(C0571r.m1379p(this.f1083B));
                }
                this.f1083B.setVisibility(0);
                this.f1083B.setChecked(this.f1084C);
                if (this.f1085D == null) {
                    this.f1085D = new ColorDrawable();
                }
                this.f1085D.setBounds(0, 0, this.f1083B.getMeasuredWidth(), 1);
                b = C0628m.m1531b(this.f1097a);
                if (b[2] != this.f1085D) {
                    this.f1086E = b[2];
                }
                C0628m.m1530a(this.f1097a, b[0], b[1], this.f1085D, b[3]);
                this.f1083B.setPadding(this.f1097a.getPaddingLeft(), this.f1097a.getPaddingTop(), this.f1097a.getPaddingRight(), this.f1097a.getPaddingBottom());
                return;
            }
            if (this.f1083B != null && this.f1083B.getVisibility() == 0) {
                this.f1083B.setVisibility(8);
            }
            if (this.f1085D != null) {
                b = C0628m.m1531b(this.f1097a);
                if (b[2] == this.f1085D) {
                    C0628m.m1530a(this.f1097a, b[0], b[1], this.f1086E, b[3]);
                    this.f1085D = null;
                }
            }
        }
    }

    private boolean m560e() {
        return this.f1097a != null && (this.f1097a.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private void m561f() {
        if (this.f1122z == null) {
            return;
        }
        if (this.f1088G || this.f1090I) {
            this.f1122z = C0429a.m896g(this.f1122z).mutate();
            if (this.f1088G) {
                C0429a.m885a(this.f1122z, this.f1087F);
            }
            if (this.f1090I) {
                C0429a.m888a(this.f1122z, this.f1089H);
            }
            if (this.f1083B != null && this.f1083B.getDrawable() != this.f1122z) {
                this.f1083B.setImageDrawable(this.f1122z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1097a != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (!(editText instanceof C6354s)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f1097a = editText;
        if (!m560e()) {
            this.f1103g.m598a(this.f1097a.getTypeface());
        }
        C0310g c0310g = this.f1103g;
        float textSize = this.f1097a.getTextSize();
        if (c0310g.f1191d != textSize) {
            c0310g.f1191d = textSize;
            c0310g.m602b();
        }
        int gravity = this.f1097a.getGravity();
        this.f1103g.m603b(48 | (gravity & -113));
        this.f1103g.m594a(gravity);
        this.f1097a.addTextChangedListener(new C02901(this));
        if (this.f1101e == null) {
            this.f1101e = this.f1097a.getHintTextColors();
        }
        if (this.f1106j && TextUtils.isEmpty(this.f1107k)) {
            this.f1105i = this.f1097a.getHint();
            setHint(this.f1105i);
            this.f1097a.setHint(null);
        }
        if (this.f1116t != null) {
            m562a(this.f1097a.getText().length());
        }
        if (this.f1110n != null) {
            m556b();
        }
        m559d();
        m563a(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        this.f1107k = charSequence;
        this.f1103g.m600a(charSequence);
    }

    final void m562a(int i) {
        boolean z = this.f1120x;
        if (this.f1117u == -1) {
            this.f1116t.setText(String.valueOf(i));
            this.f1120x = false;
        } else {
            this.f1120x = i > this.f1117u;
            if (z != this.f1120x) {
                C0628m.m1529a(this.f1116t, this.f1120x ? this.f1119w : this.f1118v);
            }
            this.f1116t.setText(getContext().getString(C0246i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f1117u)}));
        }
        if (this.f1097a != null && z != this.f1120x) {
            m563a(false, false);
            m558c();
        }
    }

    final void m563a(boolean z, boolean z2) {
        boolean z3;
        C0310g c0310g;
        ColorStateList textColors;
        boolean isEnabled = isEnabled();
        boolean z4 = (this.f1097a == null || TextUtils.isEmpty(this.f1097a.getText())) ? false : true;
        for (int i : getDrawableState()) {
            if (i == 16842908) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        int isEmpty = TextUtils.isEmpty(getError()) ^ 1;
        if (this.f1101e != null) {
            this.f1103g.m605b(this.f1101e);
        }
        if (isEnabled && this.f1120x && this.f1116t != null) {
            c0310g = this.f1103g;
            textColors = this.f1116t.getTextColors();
        } else if (isEnabled && z3 && this.f1102f != null) {
            c0310g = this.f1103g;
            textColors = this.f1102f;
        } else {
            if (this.f1101e != null) {
                c0310g = this.f1103g;
                textColors = this.f1101e;
            }
            if (!z4) {
                if (isEnabled()) {
                    if (!z3) {
                        if (isEmpty != 0) {
                        }
                    }
                }
                if (z2 || !this.f1091J) {
                    if (this.f1093L != null && this.f1093L.isRunning()) {
                        this.f1093L.cancel();
                    }
                    if (z || !this.f1092K) {
                        this.f1103g.m593a(0.0f);
                    } else {
                        m550a(0.0f);
                    }
                    this.f1091J = true;
                    return;
                }
                return;
            }
            if (!z2) {
                if (this.f1091J) {
                }
                return;
            }
            if (this.f1093L != null && this.f1093L.isRunning()) {
                this.f1093L.cancel();
            }
            if (z || !this.f1092K) {
                this.f1103g.m593a((float) BallPulseIndicator.SCALE);
            } else {
                m550a((float) BallPulseIndicator.SCALE);
            }
            this.f1091J = false;
        }
        c0310g.m596a(textColors);
        if (z4) {
            if (isEnabled()) {
                if (z3) {
                    if (isEmpty != 0) {
                    }
                }
            }
            this.f1093L.cancel();
            if (z) {
            }
            this.f1103g.m593a(0.0f);
            this.f1091J = true;
            return;
        }
        if (z2) {
            if (this.f1091J) {
            }
            return;
        }
        this.f1093L.cancel();
        if (z) {
        }
        this.f1103g.m593a((float) BallPulseIndicator.SCALE);
        this.f1091J = false;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 16 | (layoutParams2.gravity & -113);
            this.f1104h.addView(view, layoutParams2);
            this.f1104h.setLayoutParams(layoutParams);
            m549a();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f1105i != null) {
            if (this.f1097a != null) {
                CharSequence hint = this.f1097a.getHint();
                this.f1097a.setHint(this.f1105i);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i);
                    return;
                } finally {
                    this.f1097a.setHint(hint);
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f1096O = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1096O = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1106j) {
            this.f1103g.m597a(canvas);
        }
    }

    protected void drawableStateChanged() {
        if (!this.f1095N) {
            boolean z = true;
            this.f1095N = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!C0571r.m1326D(this) || !isEnabled()) {
                z = false;
            }
            m563a(z, false);
            m558c();
            if ((this.f1103g != null ? this.f1103g.m601a(drawableState) | 0 : 0) != 0) {
                invalidate();
            }
            this.f1095N = false;
        }
    }

    public int getCounterMaxLength() {
        return this.f1117u;
    }

    public EditText getEditText() {
        return this.f1097a;
    }

    public CharSequence getError() {
        return this.f1098b ? this.f1115s : null;
    }

    public CharSequence getHint() {
        return this.f1106j ? this.f1107k : null;
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1082A;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1122z;
    }

    public Typeface getTypeface() {
        return this.f1112p;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1106j && this.f1097a != null) {
            Rect rect = this.f1109m;
            C0331u.m651a((ViewGroup) this, this.f1097a, rect);
            i = rect.left + this.f1097a.getCompoundPaddingLeft();
            i3 = rect.right - this.f1097a.getCompoundPaddingRight();
            this.f1103g.m595a(i, rect.top + this.f1097a.getCompoundPaddingTop(), i3, rect.bottom - this.f1097a.getCompoundPaddingBottom());
            this.f1103g.m604b(i, getPaddingTop(), i3, (i4 - i2) - getPaddingBottom());
            this.f1103g.m602b();
        }
    }

    protected void onMeasure(int i, int i2) {
        m559d();
        super.onMeasure(i, i2);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setError(savedState.f13119a);
            if (savedState.f13120b) {
                m554a(true);
            }
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (this.f1114r) {
            savedState.f13119a = getError();
        }
        savedState.f13120b = this.f1084C;
        return savedState;
    }

    public void setCounterEnabled(boolean r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r3 = this;
        r0 = r3.f1100d;
        if (r0 == r4) goto L_0x006b;
    L_0x0004:
        if (r4 == 0) goto L_0x0061;
    L_0x0006:
        r0 = new android.support.v7.widget.AppCompatTextView;
        r1 = r3.getContext();
        r0.<init>(r1);
        r3.f1116t = r0;
        r0 = r3.f1116t;
        r1 = android.support.design.C0249a.C0243f.textinput_counter;
        r0.setId(r1);
        r0 = r3.f1112p;
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r0 = r3.f1116t;
        r1 = r3.f1112p;
        r0.setTypeface(r1);
    L_0x0023:
        r0 = r3.f1116t;
        r1 = 1;
        r0.setMaxLines(r1);
        r0 = r3.f1116t;	 Catch:{ Exception -> 0x0031 }
        r1 = r3.f1118v;	 Catch:{ Exception -> 0x0031 }
        android.support.v4.widget.C0628m.m1529a(r0, r1);	 Catch:{ Exception -> 0x0031 }
        goto L_0x0047;
    L_0x0031:
        r0 = r3.f1116t;
        r1 = android.support.v7.p041a.C0645a.C0643i.TextAppearance_AppCompat_Caption;
        android.support.v4.widget.C0628m.m1529a(r0, r1);
        r0 = r3.f1116t;
        r1 = r3.getContext();
        r2 = android.support.v7.p041a.C0645a.C0637c.error_color_material;
        r1 = android.support.v4.p029a.C0346c.m687c(r1, r2);
        r0.setTextColor(r1);
    L_0x0047:
        r0 = r3.f1116t;
        r1 = -1;
        r3.m553a(r0, r1);
        r0 = r3.f1097a;
        if (r0 != 0) goto L_0x0056;
    L_0x0051:
        r0 = 0;
    L_0x0052:
        r3.m562a(r0);
        goto L_0x0069;
    L_0x0056:
        r0 = r3.f1097a;
        r0 = r0.getText();
        r0 = r0.length();
        goto L_0x0052;
    L_0x0061:
        r0 = r3.f1116t;
        r3.m552a(r0);
        r0 = 0;
        r3.f1116t = r0;
    L_0x0069:
        r3.f1100d = r4;
    L_0x006b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setCounterEnabled(boolean):void");
    }

    public void setCounterMaxLength(int i) {
        if (this.f1117u != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f1117u = i;
            if (this.f1100d) {
                m562a(this.f1097a == null ? 0 : this.f1097a.getText().length());
            }
        }
    }

    public void setEnabled(boolean z) {
        m551a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public void setError(final CharSequence charSequence) {
        ViewPropertyAnimator listener;
        boolean z = C0571r.m1326D(this) && isEnabled() && (this.f1099c == null || !TextUtils.equals(this.f1099c.getText(), charSequence));
        this.f1115s = charSequence;
        if (!this.f1098b) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        this.f1114r = true ^ TextUtils.isEmpty(charSequence);
        this.f1099c.animate().cancel();
        if (this.f1114r) {
            this.f1099c.setText(charSequence);
            this.f1099c.setVisibility(0);
            if (z) {
                if (this.f1099c.getAlpha() == BallPulseIndicator.SCALE) {
                    this.f1099c.setAlpha(0.0f);
                }
                listener = this.f1099c.animate().alpha(BallPulseIndicator.SCALE).setDuration(200).setInterpolator(C0296a.f1126d).setListener(new C02912(this));
            } else {
                this.f1099c.setAlpha(BallPulseIndicator.SCALE);
                m558c();
                m563a(z, false);
            }
        }
        if (this.f1099c.getVisibility() == 0) {
            if (z) {
                listener = this.f1099c.animate().alpha(0.0f).setDuration(200).setInterpolator(C0296a.f1125c).setListener(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ TextInputLayout f1079b;

                    public final void onAnimationEnd(Animator animator) {
                        this.f1079b.f1099c.setText(charSequence);
                        this.f1079b.f1099c.setVisibility(4);
                    }
                });
            } else {
                this.f1099c.setText(charSequence);
                this.f1099c.setVisibility(4);
            }
        }
        m558c();
        m563a(z, false);
        listener.start();
        m558c();
        m563a(z, false);
    }

    public void setErrorEnabled(boolean r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r0 = r4.f1098b;
        if (r0 == r5) goto L_0x0088;
    L_0x0004:
        r0 = r4.f1099c;
        if (r0 == 0) goto L_0x0011;
    L_0x0008:
        r0 = r4.f1099c;
        r0 = r0.animate();
        r0.cancel();
    L_0x0011:
        r0 = 0;
        if (r5 == 0) goto L_0x0079;
    L_0x0014:
        r1 = new android.support.v7.widget.AppCompatTextView;
        r2 = r4.getContext();
        r1.<init>(r2);
        r4.f1099c = r1;
        r1 = r4.f1099c;
        r2 = android.support.design.C0249a.C0243f.textinput_error;
        r1.setId(r2);
        r1 = r4.f1112p;
        if (r1 == 0) goto L_0x0031;
    L_0x002a:
        r1 = r4.f1099c;
        r2 = r4.f1112p;
        r1.setTypeface(r2);
    L_0x0031:
        r1 = 1;
        r2 = r4.f1099c;	 Catch:{ Exception -> 0x0050 }
        r3 = r4.f1113q;	 Catch:{ Exception -> 0x0050 }
        android.support.v4.widget.C0628m.m1529a(r2, r3);	 Catch:{ Exception -> 0x0050 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0050 }
        r3 = 23;	 Catch:{ Exception -> 0x0050 }
        if (r2 < r3) goto L_0x004f;	 Catch:{ Exception -> 0x0050 }
    L_0x003f:
        r2 = r4.f1099c;	 Catch:{ Exception -> 0x0050 }
        r2 = r2.getTextColors();	 Catch:{ Exception -> 0x0050 }
        r2 = r2.getDefaultColor();	 Catch:{ Exception -> 0x0050 }
        r3 = -65281; // 0xffffffffffff00ff float:NaN double:NaN;
        if (r2 != r3) goto L_0x004f;
    L_0x004e:
        goto L_0x0050;
    L_0x004f:
        r1 = r0;
    L_0x0050:
        if (r1 == 0) goto L_0x0068;
    L_0x0052:
        r1 = r4.f1099c;
        r2 = android.support.v7.p041a.C0645a.C0643i.TextAppearance_AppCompat_Caption;
        android.support.v4.widget.C0628m.m1529a(r1, r2);
        r1 = r4.f1099c;
        r2 = r4.getContext();
        r3 = android.support.v7.p041a.C0645a.C0637c.error_color_material;
        r2 = android.support.v4.p029a.C0346c.m687c(r2, r3);
        r1.setTextColor(r2);
    L_0x0068:
        r1 = r4.f1099c;
        r2 = 4;
        r1.setVisibility(r2);
        r1 = r4.f1099c;
        android.support.v4.view.C0571r.m1373j(r1);
        r1 = r4.f1099c;
        r4.m553a(r1, r0);
        goto L_0x0086;
    L_0x0079:
        r4.f1114r = r0;
        r4.m558c();
        r0 = r4.f1099c;
        r4.m552a(r0);
        r0 = 0;
        r4.f1099c = r0;
    L_0x0086:
        r4.f1098b = r5;
    L_0x0088:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setErrorEnabled(boolean):void");
    }

    public void setErrorTextAppearance(int i) {
        this.f1113q = i;
        if (this.f1099c != null) {
            C0628m.m1529a(this.f1099c, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1106j) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f1092K = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f1106j) {
            this.f1106j = z;
            CharSequence hint = this.f1097a.getHint();
            if (!this.f1106j) {
                if (!TextUtils.isEmpty(this.f1107k) && TextUtils.isEmpty(hint)) {
                    this.f1097a.setHint(this.f1107k);
                }
                setHintInternal(null);
            } else if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.f1107k)) {
                    setHint(hint);
                }
                this.f1097a.setHint(null);
            }
            if (this.f1097a != null) {
                m549a();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f1103g.m606c(i);
        this.f1102f = this.f1103g.f1193f;
        if (this.f1097a != null) {
            m563a(false, false);
            m549a();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1082A = charSequence;
        if (this.f1083B != null) {
            this.f1083B.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0683b.m1656b(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1122z = drawable;
        if (this.f1083B != null) {
            this.f1083B.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.f1121y != z) {
            this.f1121y = z;
            if (!(z || !this.f1084C || this.f1097a == null)) {
                this.f1097a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f1084C = false;
            m559d();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f1087F = colorStateList;
        this.f1088G = true;
        m561f();
    }

    public void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f1089H = mode;
        this.f1090I = true;
        m561f();
    }

    public void setTypeface(Typeface typeface) {
        if ((this.f1112p != null && !this.f1112p.equals(typeface)) || (this.f1112p == null && typeface != null)) {
            this.f1112p = typeface;
            this.f1103g.m598a(typeface);
            if (this.f1116t != null) {
                this.f1116t.setTypeface(typeface);
            }
            if (this.f1099c != null) {
                this.f1099c.setTypeface(typeface);
            }
        }
    }
}
