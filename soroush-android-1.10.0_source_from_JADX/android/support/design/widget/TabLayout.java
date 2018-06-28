package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.C0249a.C0241d;
import android.support.design.C0249a.C0245h;
import android.support.design.C0249a.C0247j;
import android.support.design.C0249a.C0248k;
import android.support.v4.p038g.C0480k.C0479a;
import android.support.v4.p038g.C0480k.C4816b;
import android.support.v4.p038g.C0480k.C6367c;
import android.support.v4.view.C0565n;
import android.support.v4.view.C0566o;
import android.support.v4.view.C0571r;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0519a;
import android.support.v4.view.ViewPager.C0522e;
import android.support.v4.view.ViewPager.C0523f;
import android.support.v4.widget.C0628m;
import android.support.v7.app.C0662a.C0661b;
import android.support.v7.p041a.C0645a.C0644j;
import android.support.v7.p043c.p044a.C0683b;
import android.support.v7.widget.TooltipCompat;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

@C0519a
public class TabLayout extends HorizontalScrollView {
    private static final C0479a<C0288e> f1045n = new C6367c(16);
    private DataSetObserver f1046A;
    private C4742f f1047B;
    private C4741a f1048C;
    private boolean f1049D;
    private final C0479a<C0289g> f1050E;
    int f1051a;
    int f1052b;
    int f1053c;
    int f1054d;
    int f1055e;
    ColorStateList f1056f;
    float f1057g;
    float f1058h;
    final int f1059i;
    int f1060j;
    int f1061k;
    int f1062l;
    ViewPager f1063m;
    private final ArrayList<C0288e> f1064o;
    private C0288e f1065p;
    private final C0287d f1066q;
    private final int f1067r;
    private final int f1068s;
    private final int f1069t;
    private int f1070u;
    private C0283b f1071v;
    private final ArrayList<C0283b> f1072w;
    private C0283b f1073x;
    private ValueAnimator f1074y;
    private C0565n f1075z;

    class C02821 implements AnimatorUpdateListener {
        final /* synthetic */ TabLayout f1011a;

        C02821(TabLayout tabLayout) {
            this.f1011a = tabLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1011a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public interface C0283b {
        void mo176a();

        void mo177a(C0288e c0288e);

        void mo178b(C0288e c0288e);
    }

    private class C0284c extends DataSetObserver {
        final /* synthetic */ TabLayout f1012a;

        C0284c(TabLayout tabLayout) {
            this.f1012a = tabLayout;
        }

        public final void onChanged() {
            this.f1012a.m540a();
        }

        public final void onInvalidated() {
            this.f1012a.m540a();
        }
    }

    private class C0287d extends LinearLayout {
        int f1020a = -1;
        float f1021b;
        ValueAnimator f1022c;
        final /* synthetic */ TabLayout f1023d;
        private int f1024e;
        private final Paint f1025f;
        private int f1026g = -1;
        private int f1027h = -1;
        private int f1028i = -1;

        C0287d(TabLayout tabLayout, Context context) {
            this.f1023d = tabLayout;
            super(context);
            setWillNotDraw(false);
            this.f1025f = new Paint();
        }

        final void m515a() {
            int i;
            int i2;
            View childAt = getChildAt(this.f1020a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f1021b > 0.0f && this.f1020a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f1020a + 1);
                    i = (int) ((this.f1021b * ((float) childAt2.getLeft())) + ((BallPulseIndicator.SCALE - this.f1021b) * ((float) i)));
                    i2 = (int) ((this.f1021b * ((float) childAt2.getRight())) + ((BallPulseIndicator.SCALE - this.f1021b) * ((float) i2)));
                }
            }
            m517a(i, i2);
        }

        final void m516a(int i) {
            if (this.f1025f.getColor() != i) {
                this.f1025f.setColor(i);
                C0571r.m1361e(this);
            }
        }

        final void m517a(int i, int i2) {
            if (i != this.f1027h || i2 != this.f1028i) {
                this.f1027h = i;
                this.f1028i = i2;
                C0571r.m1361e(this);
            }
        }

        final void m518b(int i) {
            if (this.f1024e != i) {
                this.f1024e = i;
                C0571r.m1361e(this);
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        final void m519b(final int r10, int r11) {
            /*
            r9 = this;
            r0 = r9.f1022c;
            if (r0 == 0) goto L_0x0011;
        L_0x0004:
            r0 = r9.f1022c;
            r0 = r0.isRunning();
            if (r0 == 0) goto L_0x0011;
        L_0x000c:
            r0 = r9.f1022c;
            r0.cancel();
        L_0x0011:
            r0 = android.support.v4.view.C0571r.m1369h(r9);
            r1 = 1;
            if (r0 != r1) goto L_0x001a;
        L_0x0018:
            r0 = r1;
            goto L_0x001b;
        L_0x001a:
            r0 = 0;
        L_0x001b:
            r2 = r9.getChildAt(r10);
            if (r2 != 0) goto L_0x0025;
        L_0x0021:
            r9.m515a();
            return;
        L_0x0025:
            r6 = r2.getLeft();
            r8 = r2.getRight();
            r2 = r9.f1020a;
            r2 = r10 - r2;
            r2 = java.lang.Math.abs(r2);
            if (r2 > r1) goto L_0x003e;
        L_0x0037:
            r0 = r9.f1027h;
            r1 = r9.f1028i;
            r5 = r0;
            r7 = r1;
            goto L_0x0057;
        L_0x003e:
            r1 = r9.f1023d;
            r2 = 24;
            r1 = r1.m548b(r2);
            r2 = r9.f1020a;
            if (r10 >= r2) goto L_0x0050;
        L_0x004a:
            if (r0 != 0) goto L_0x0053;
        L_0x004c:
            r1 = r1 + r8;
            r5 = r1;
        L_0x004e:
            r7 = r5;
            goto L_0x0057;
        L_0x0050:
            if (r0 == 0) goto L_0x0053;
        L_0x0052:
            goto L_0x004c;
        L_0x0053:
            r0 = r6 - r1;
            r5 = r0;
            goto L_0x004e;
        L_0x0057:
            if (r5 != r6) goto L_0x005b;
        L_0x0059:
            if (r7 == r8) goto L_0x0089;
        L_0x005b:
            r0 = new android.animation.ValueAnimator;
            r0.<init>();
            r9.f1022c = r0;
            r1 = android.support.design.widget.C0296a.f1124b;
            r0.setInterpolator(r1);
            r1 = (long) r11;
            r0.setDuration(r1);
            r11 = 2;
            r11 = new float[r11];
            r11 = {0, 1065353216};
            r0.setFloatValues(r11);
            r11 = new android.support.design.widget.TabLayout$d$1;
            r3 = r11;
            r4 = r9;
            r3.<init>(r4, r5, r6, r7, r8);
            r0.addUpdateListener(r11);
            r11 = new android.support.design.widget.TabLayout$d$2;
            r11.<init>(r9, r10);
            r0.addListener(r11);
            r0.start();
        L_0x0089:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.d.b(int, int):void");
        }

        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f1027h >= 0 && this.f1028i > this.f1027h) {
                canvas.drawRect((float) this.f1027h, (float) (getHeight() - this.f1024e), (float) this.f1028i, (float) getHeight(), this.f1025f);
            }
        }

        protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f1022c == null || !this.f1022c.isRunning()) {
                m515a();
                return;
            }
            this.f1022c.cancel();
            m519b(this.f1020a, Math.round((BallPulseIndicator.SCALE - this.f1022c.getAnimatedFraction()) * ((float) this.f1022c.getDuration())));
        }

        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                int i3 = 1;
                if (this.f1023d.f1062l == 1 && this.f1023d.f1061k == 1) {
                    int childCount = getChildCount();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = i5;
                    while (i5 < childCount) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            i6 = Math.max(i6, childAt.getMeasuredWidth());
                        }
                        i5++;
                    }
                    if (i6 > 0) {
                        if (i6 * childCount <= getMeasuredWidth() - (this.f1023d.m548b(16) * 2)) {
                            i5 = 0;
                            while (i4 < childCount) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
                                if (layoutParams.width != i6 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i6;
                                    layoutParams.weight = 0.0f;
                                    i5 = 1;
                                }
                                i4++;
                            }
                            i3 = i5;
                        } else {
                            this.f1023d.f1061k = 0;
                            this.f1023d.m547a(false);
                        }
                        if (i3 != 0) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f1026g != i) {
                requestLayout();
                this.f1026g = i;
            }
        }
    }

    public static final class C0288e {
        Object f1029a;
        Drawable f1030b;
        CharSequence f1031c;
        CharSequence f1032d;
        public int f1033e = -1;
        View f1034f;
        TabLayout f1035g;
        C0289g f1036h;

        C0288e() {
        }

        public final C0288e m520a(View view) {
            this.f1034f = view;
            m523b();
            return this;
        }

        public final C0288e m521a(CharSequence charSequence) {
            this.f1031c = charSequence;
            m523b();
            return this;
        }

        public final void m522a() {
            if (this.f1035g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            this.f1035g.m544a(this);
        }

        final void m523b() {
            if (this.f1036h != null) {
                this.f1036h.m525a();
            }
        }
    }

    class C0289g extends LinearLayout {
        final /* synthetic */ TabLayout f1037a;
        private C0288e f1038b;
        private TextView f1039c;
        private ImageView f1040d;
        private View f1041e;
        private TextView f1042f;
        private ImageView f1043g;
        private int f1044h = 2;

        public C0289g(TabLayout tabLayout, Context context) {
            this.f1037a = tabLayout;
            super(context);
            if (tabLayout.f1059i != 0) {
                C0571r.m1339a((View) this, C0683b.m1656b(context, tabLayout.f1059i));
            }
            C0571r.m1353b(this, tabLayout.f1051a, tabLayout.f1052b, tabLayout.f1053c, tabLayout.f1054d);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0571r.m1342a((View) this, C0566o.m1271a(getContext()));
        }

        private void m524a(TextView textView, ImageView imageView) {
            CharSequence charSequence = null;
            Drawable drawable = this.f1038b != null ? this.f1038b.f1030b : null;
            CharSequence charSequence2 = this.f1038b != null ? this.f1038b.f1031c : null;
            CharSequence charSequence3 = this.f1038b != null ? this.f1038b.f1032d : null;
            int i = 0;
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(charSequence3);
            }
            int isEmpty = TextUtils.isEmpty(charSequence2) ^ 1;
            if (textView != null) {
                if (isEmpty != 0) {
                    textView.setText(charSequence2);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
                textView.setContentDescription(charSequence3);
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                if (isEmpty != 0 && imageView.getVisibility() == 0) {
                    i = this.f1037a.m548b(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (isEmpty == 0) {
                charSequence = charSequence3;
            }
            TooltipCompat.setTooltipText(this, charSequence);
        }

        final void m525a() {
            TextView textView;
            ImageView imageView;
            boolean z;
            C0288e c0288e = this.f1038b;
            ImageView imageView2 = null;
            View view = c0288e != null ? c0288e.f1034f : null;
            if (view != null) {
                C0289g parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(view);
                    }
                    addView(view);
                }
                this.f1041e = view;
                if (this.f1039c != null) {
                    this.f1039c.setVisibility(8);
                }
                if (this.f1040d != null) {
                    this.f1040d.setVisibility(8);
                    this.f1040d.setImageDrawable(null);
                }
                this.f1042f = (TextView) view.findViewById(16908308);
                if (this.f1042f != null) {
                    this.f1044h = C0628m.m1528a(this.f1042f);
                }
                imageView2 = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f1041e != null) {
                    removeView(this.f1041e);
                    this.f1041e = null;
                }
                this.f1042f = null;
            }
            this.f1043g = imageView2;
            if (this.f1041e == null) {
                if (this.f1040d == null) {
                    imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(C0245h.design_layout_tab_icon, this, false);
                    addView(imageView2, 0);
                    this.f1040d = imageView2;
                }
                if (this.f1039c == null) {
                    textView = (TextView) LayoutInflater.from(getContext()).inflate(C0245h.design_layout_tab_text, this, false);
                    addView(textView);
                    this.f1039c = textView;
                    this.f1044h = C0628m.m1528a(this.f1039c);
                }
                C0628m.m1529a(this.f1039c, this.f1037a.f1055e);
                if (this.f1037a.f1056f != null) {
                    this.f1039c.setTextColor(this.f1037a.f1056f);
                }
                textView = this.f1039c;
                imageView = this.f1040d;
            } else {
                if (!(this.f1042f == null && this.f1043g == null)) {
                    textView = this.f1042f;
                    imageView = this.f1043g;
                }
                z = true;
                if (c0288e != null) {
                    if (c0288e.f1035g != null) {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                    if (c0288e.f1035g.getSelectedTabPosition() != c0288e.f1033e) {
                        setSelected(z);
                    }
                }
                z = false;
                setSelected(z);
            }
            m524a(textView, imageView);
            z = true;
            if (c0288e != null) {
                if (c0288e.f1035g != null) {
                    if (c0288e.f1035g.getSelectedTabPosition() != c0288e.f1033e) {
                    }
                    if (c0288e.f1035g.getSelectedTabPosition() != c0288e.f1033e) {
                        setSelected(z);
                    }
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            z = false;
            setSelected(z);
        }

        final void m526a(C0288e c0288e) {
            if (c0288e != this.f1038b) {
                this.f1038b = c0288e;
                m525a();
            }
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0661b.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0661b.class.getName());
        }

        public final void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = this.f1037a.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(this.f1037a.f1060j, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f1039c != null) {
                getResources();
                float f = this.f1037a.f1057g;
                mode = this.f1044h;
                int i3 = 1;
                if (this.f1040d != null && this.f1040d.getVisibility() == 0) {
                    mode = 1;
                } else if (this.f1039c != null && this.f1039c.getLineCount() > 1) {
                    f = this.f1037a.f1058h;
                }
                float textSize = this.f1039c.getTextSize();
                int lineCount = this.f1039c.getLineCount();
                int a = C0628m.m1528a(this.f1039c);
                if (f != textSize || (a >= 0 && mode != a)) {
                    if (this.f1037a.f1062l == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f1039c.getLayout();
                        if (layout == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            i3 = 0;
                        }
                    }
                    if (i3 != 0) {
                        this.f1039c.setTextSize(0, f);
                        this.f1039c.setMaxLines(mode);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f1038b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f1038b.m522a();
            return true;
        }

        public final void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f1039c != null) {
                this.f1039c.setSelected(z);
            }
            if (this.f1040d != null) {
                this.f1040d.setSelected(z);
            }
            if (this.f1041e != null) {
                this.f1041e.setSelected(z);
            }
        }
    }

    private class C4741a implements C0522e {
        boolean f13113a;
        final /* synthetic */ TabLayout f13114b;

        C4741a(TabLayout tabLayout) {
            this.f13114b = tabLayout;
        }

        public final void mo172a(ViewPager viewPager, C0565n c0565n) {
            if (this.f13114b.f1063m == viewPager) {
                this.f13114b.m546a(c0565n, this.f13113a);
            }
        }
    }

    public static class C4742f implements C0523f {
        int f13115a;
        int f13116b;
        private final WeakReference<TabLayout> f13117c;

        public C4742f(TabLayout tabLayout) {
            this.f13117c = new WeakReference(tabLayout);
        }

        public final void mo173a(int i) {
            this.f13115a = this.f13116b;
            this.f13116b = i;
        }

        public final void mo174a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f13117c.get();
            if (tabLayout != null) {
                boolean z;
                boolean z2 = false;
                if (this.f13116b == 2) {
                    if (this.f13115a != 1) {
                        z = false;
                        if (!(this.f13116b == 2 && this.f13115a == 0)) {
                            z2 = true;
                        }
                        tabLayout.m541a(i, f, z, z2);
                    }
                }
                z = true;
                z2 = true;
                tabLayout.m541a(i, f, z, z2);
            }
        }

        public final void mo175b(int i) {
            TabLayout tabLayout = (TabLayout) this.f13117c.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                boolean z;
                if (this.f13116b != 0) {
                    if (this.f13116b != 2 || this.f13115a != 0) {
                        z = false;
                        tabLayout.m545a(tabLayout.m539a(i), z);
                    }
                }
                z = true;
                tabLayout.m545a(tabLayout.m539a(i), z);
            }
        }
    }

    public static class C4743h implements C0283b {
        private final ViewPager f13118a;

        public C4743h(ViewPager viewPager) {
            this.f13118a = viewPager;
        }

        public final void mo176a() {
        }

        public final void mo177a(C0288e c0288e) {
            this.f13118a.setCurrentItem(c0288e.f1033e);
        }

        public final void mo178b(C0288e c0288e) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1064o = new ArrayList();
        this.f1060j = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f1072w = new ArrayList();
        this.f1050E = new C4816b(12);
        C0330t.m650a(context);
        setHorizontalScrollBarEnabled(false);
        this.f1066q = new C0287d(this, context);
        super.addView(this.f1066q, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.TabLayout, i, C0247j.Widget_Design_TabLayout);
        this.f1066q.m518b(obtainStyledAttributes.getDimensionPixelSize(C0248k.TabLayout_tabIndicatorHeight, 0));
        this.f1066q.m516a(obtainStyledAttributes.getColor(C0248k.TabLayout_tabIndicatorColor, 0));
        i = obtainStyledAttributes.getDimensionPixelSize(C0248k.TabLayout_tabPadding, 0);
        this.f1054d = i;
        this.f1053c = i;
        this.f1052b = i;
        this.f1051a = i;
        this.f1051a = obtainStyledAttributes.getDimensionPixelSize(C0248k.TabLayout_tabPaddingStart, this.f1051a);
        this.f1052b = obtainStyledAttributes.getDimensionPixelSize(C0248k.TabLayout_tabPaddingTop, this.f1052b);
        this.f1053c = obtainStyledAttributes.getDimensionPixelSize(C0248k.TabLayout_tabPaddingEnd, this.f1053c);
        this.f1054d = obtainStyledAttributes.getDimensionPixelSize(C0248k.TabLayout_tabPaddingBottom, this.f1054d);
        this.f1055e = obtainStyledAttributes.getResourceId(C0248k.TabLayout_tabTextAppearance, C0247j.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f1055e, C0644j.TextAppearance);
        try {
            this.f1057g = (float) obtainStyledAttributes2.getDimensionPixelSize(C0644j.TextAppearance_android_textSize, 0);
            this.f1056f = obtainStyledAttributes2.getColorStateList(C0644j.TextAppearance_android_textColor);
            if (obtainStyledAttributes.hasValue(C0248k.TabLayout_tabTextColor)) {
                this.f1056f = obtainStyledAttributes.getColorStateList(C0248k.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(C0248k.TabLayout_tabSelectedTextColor)) {
                this.f1056f = m532b(this.f1056f.getDefaultColor(), obtainStyledAttributes.getColor(C0248k.TabLayout_tabSelectedTextColor, 0));
            }
            this.f1067r = obtainStyledAttributes.getDimensionPixelSize(C0248k.TabLayout_tabMinWidth, -1);
            this.f1068s = obtainStyledAttributes.getDimensionPixelSize(C0248k.TabLayout_tabMaxWidth, -1);
            this.f1059i = obtainStyledAttributes.getResourceId(C0248k.TabLayout_tabBackground, 0);
            this.f1070u = obtainStyledAttributes.getDimensionPixelSize(C0248k.TabLayout_tabContentStart, 0);
            this.f1062l = obtainStyledAttributes.getInt(C0248k.TabLayout_tabMode, 1);
            this.f1061k = obtainStyledAttributes.getInt(C0248k.TabLayout_tabGravity, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f1058h = (float) resources.getDimensionPixelSize(C0241d.design_tab_text_size_2line);
            this.f1069t = resources.getDimensionPixelSize(C0241d.design_tab_scrollable_min_width);
            m538d();
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    private int m527a(int i, float f) {
        int i2 = 0;
        if (this.f1062l != 0) {
            return 0;
        }
        View childAt = this.f1066q.getChildAt(i);
        i++;
        View childAt2 = i < this.f1066q.getChildCount() ? this.f1066q.getChildAt(i) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i2 = childAt2.getWidth();
        }
        i = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i3 = (int) ((((float) (width + i2)) * 0.5f) * f);
        return C0571r.m1369h(this) == 0 ? i + i3 : i - i3;
    }

    private void m528a(C0288e c0288e, int i) {
        c0288e.f1033e = i;
        this.f1064o.add(i, c0288e);
        int size = this.f1064o.size();
        while (true) {
            i++;
            if (i < size) {
                ((C0288e) this.f1064o.get(i)).f1033e = i;
            } else {
                return;
            }
        }
    }

    private void m529a(ViewPager viewPager, boolean z) {
        if (this.f1063m != null) {
            if (this.f1047B != null) {
                this.f1063m.m1157b(this.f1047B);
            }
            if (this.f1048C != null) {
                ViewPager viewPager2 = this.f1063m;
                C4741a c4741a = this.f1048C;
                if (viewPager2.f1777e != null) {
                    viewPager2.f1777e.remove(c4741a);
                }
            }
        }
        if (this.f1073x != null) {
            m534b(this.f1073x);
            this.f1073x = null;
        }
        if (viewPager != null) {
            this.f1063m = viewPager;
            if (this.f1047B == null) {
                this.f1047B = new C4742f(this);
            }
            C4742f c4742f = this.f1047B;
            c4742f.f13116b = 0;
            c4742f.f13115a = 0;
            viewPager.m1155a(this.f1047B);
            this.f1073x = new C4743h(viewPager);
            m543a(this.f1073x);
            C0565n adapter = viewPager.getAdapter();
            if (adapter != null) {
                m546a(adapter, true);
            }
            if (this.f1048C == null) {
                this.f1048C = new C4741a(this);
            }
            this.f1048C.f13113a = true;
            C4741a c4741a2 = this.f1048C;
            if (viewPager.f1777e == null) {
                viewPager.f1777e = new ArrayList();
            }
            viewPager.f1777e.add(c4741a2);
            setScrollPosition$4867b5c2(viewPager.getCurrentItem());
        } else {
            this.f1063m = null;
            m546a(null, false);
        }
        this.f1049D = z;
    }

    private void m530a(View view) {
        if (view instanceof C0329r) {
            C0329r c0329r = (C0329r) view;
            C0288e b = m533b();
            if (c0329r.f1268a != null) {
                b.m521a(c0329r.f1268a);
            }
            if (c0329r.f1269b != null) {
                b.f1030b = c0329r.f1269b;
                b.m523b();
            }
            if (c0329r.f1270c != 0) {
                b.m520a(LayoutInflater.from(b.f1036h.getContext()).inflate(c0329r.f1270c, b.f1036h, false));
            }
            if (!TextUtils.isEmpty(c0329r.getContentDescription())) {
                b.f1032d = c0329r.getContentDescription();
                b.m523b();
            }
            m535b(b, this.f1064o.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void m531a(LayoutParams layoutParams) {
        float f;
        if (this.f1062l == 1 && this.f1061k == 0) {
            layoutParams.width = 0;
            f = BallPulseIndicator.SCALE;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    private static ColorStateList m532b(int i, int i2) {
        r1 = new int[2][];
        int[] iArr = new int[]{SELECTED_STATE_SET, i2};
        r1[1] = EMPTY_STATE_SET;
        iArr[1] = i;
        return new ColorStateList(r1, iArr);
    }

    private C0288e m533b() {
        C0288e c0288e = (C0288e) f1045n.mo308a();
        if (c0288e == null) {
            c0288e = new C0288e();
        }
        c0288e.f1035g = this;
        C0289g c0289g = this.f1050E != null ? (C0289g) this.f1050E.mo308a() : null;
        if (c0289g == null) {
            c0289g = new C0289g(this, getContext());
        }
        c0289g.m526a(c0288e);
        c0289g.setFocusable(true);
        c0289g.setMinimumWidth(getTabMinWidth());
        c0288e.f1036h = c0289g;
        return c0288e;
    }

    private void m534b(C0283b c0283b) {
        this.f1072w.remove(c0283b);
    }

    private void m535b(C0288e c0288e, boolean z) {
        int size = this.f1064o.size();
        if (c0288e.f1035g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        m528a(c0288e, size);
        View view = c0288e.f1036h;
        C0287d c0287d = this.f1066q;
        int i = c0288e.f1033e;
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m531a(layoutParams);
        c0287d.addView(view, i, layoutParams);
        if (z) {
            c0288e.m522a();
        }
    }

    private void m536c() {
        if (this.f1074y == null) {
            this.f1074y = new ValueAnimator();
            this.f1074y.setInterpolator(C0296a.f1124b);
            this.f1074y.setDuration(300);
            this.f1074y.addUpdateListener(new C02821(this));
        }
    }

    private void m537c(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C0571r.m1326D(this)) {
                int i2;
                C0287d c0287d = this.f1066q;
                int childCount = c0287d.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (c0287d.getChildAt(i3).getWidth() <= 0) {
                        i2 = 1;
                        break;
                    }
                }
                i2 = 0;
                if (i2 == 0) {
                    if (getScrollX() != m527a(i, 0.0f)) {
                        m536c();
                        this.f1074y.setIntValues(new int[]{i2, childCount});
                        this.f1074y.start();
                    }
                    this.f1066q.m519b(i, IjkMediaCodecInfo.RANK_SECURE);
                    return;
                }
            }
            setScrollPosition$4867b5c2(i);
        }
    }

    private void m538d() {
        C0571r.m1353b(this.f1066q, this.f1062l == 0 ? Math.max(0, this.f1070u - this.f1051a) : 0, 0, 0, 0);
        switch (this.f1062l) {
            case 0:
                this.f1066q.setGravity(8388611);
                break;
            case 1:
                this.f1066q.setGravity(1);
                break;
            default:
                break;
        }
        m547a(true);
    }

    private int getDefaultHeight() {
        int size = this.f1064o.size();
        Object obj = null;
        for (int i = 0; i < size; i++) {
            C0288e c0288e = (C0288e) this.f1064o.get(i);
            if (c0288e != null && c0288e.f1030b != null && !TextUtils.isEmpty(c0288e.f1031c)) {
                obj = 1;
                break;
            }
        }
        return obj != null ? 72 : 48;
    }

    private float getScrollPosition() {
        C0287d c0287d = this.f1066q;
        return ((float) c0287d.f1020a) + c0287d.f1021b;
    }

    private int getTabMinWidth() {
        return this.f1067r != -1 ? this.f1067r : this.f1062l == 0 ? this.f1069t : 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f1066q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setScrollPosition$4867b5c2(int i) {
        m541a(i, 0.0f, true, true);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f1066q.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                this.f1066q.getChildAt(i2).setSelected(i2 == i);
                i2++;
            }
        }
    }

    public final C0288e m539a(int i) {
        if (i >= 0) {
            if (i < getTabCount()) {
                return (C0288e) this.f1064o.get(i);
            }
        }
        return null;
    }

    final void m540a() {
        int childCount;
        for (childCount = this.f1066q.getChildCount() - 1; childCount >= 0; childCount--) {
            C0289g c0289g = (C0289g) this.f1066q.getChildAt(childCount);
            this.f1066q.removeViewAt(childCount);
            if (c0289g != null) {
                c0289g.m526a(null);
                c0289g.setSelected(false);
                this.f1050E.mo309a(c0289g);
            }
            requestLayout();
        }
        Iterator it = this.f1064o.iterator();
        while (it.hasNext()) {
            C0288e c0288e = (C0288e) it.next();
            it.remove();
            c0288e.f1035g = null;
            c0288e.f1036h = null;
            c0288e.f1029a = null;
            c0288e.f1030b = null;
            c0288e.f1031c = null;
            c0288e.f1032d = null;
            c0288e.f1033e = -1;
            c0288e.f1034f = null;
            f1045n.mo309a(c0288e);
        }
        this.f1065p = null;
        if (this.f1075z != null) {
            childCount = this.f1075z.mo2270b();
            for (int i = 0; i < childCount; i++) {
                m535b(m533b().m521a(this.f1075z.mo2364b(i)), false);
            }
            if (this.f1063m != null && childCount > 0) {
                childCount = this.f1063m.getCurrentItem();
                if (childCount != getSelectedTabPosition() && childCount < getTabCount()) {
                    m545a(m539a(childCount), true);
                }
            }
        }
    }

    final void m541a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f1066q.getChildCount()) {
            if (z2) {
                C0287d c0287d = this.f1066q;
                if (c0287d.f1022c != null && c0287d.f1022c.isRunning()) {
                    c0287d.f1022c.cancel();
                }
                c0287d.f1020a = i;
                c0287d.f1021b = f;
                c0287d.m515a();
            }
            if (this.f1074y != null && this.f1074y.isRunning()) {
                this.f1074y.cancel();
            }
            scrollTo(m527a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public final void m542a(int i, int i2) {
        setTabTextColors(m532b(i, i2));
    }

    public final void m543a(C0283b c0283b) {
        if (!this.f1072w.contains(c0283b)) {
            this.f1072w.add(c0283b);
        }
    }

    final void m544a(C0288e c0288e) {
        m545a(c0288e, true);
    }

    final void m545a(C0288e c0288e, boolean z) {
        C0288e c0288e2 = this.f1065p;
        int size;
        if (c0288e2 != c0288e) {
            int i = c0288e != null ? c0288e.f1033e : -1;
            if (z) {
                if ((c0288e2 == null || c0288e2.f1033e == -1) && i != -1) {
                    setScrollPosition$4867b5c2(i);
                } else {
                    m537c(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (c0288e2 != null) {
                for (size = this.f1072w.size() - 1; size >= 0; size--) {
                    ((C0283b) this.f1072w.get(size)).mo176a();
                }
            }
            this.f1065p = c0288e;
            if (c0288e != null) {
                for (size = this.f1072w.size() - 1; size >= 0; size--) {
                    ((C0283b) this.f1072w.get(size)).mo177a(c0288e);
                }
            }
        } else if (c0288e2 != null) {
            for (size = this.f1072w.size() - 1; size >= 0; size--) {
                ((C0283b) this.f1072w.get(size)).mo178b(c0288e);
            }
            m537c(c0288e.f1033e);
        }
    }

    final void m546a(C0565n c0565n, boolean z) {
        if (!(this.f1075z == null || this.f1046A == null)) {
            this.f1075z.m1266b(this.f1046A);
        }
        this.f1075z = c0565n;
        if (z && c0565n != null) {
            if (this.f1046A == null) {
                this.f1046A = new C0284c(this);
            }
            c0565n.m1258a(this.f1046A);
        }
        m540a();
    }

    final void m547a(boolean z) {
        for (int i = 0; i < this.f1066q.getChildCount(); i++) {
            View childAt = this.f1066q.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m531a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        m530a(view);
    }

    public void addView(View view, int i) {
        m530a(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m530a(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m530a(view);
    }

    final int m548b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        return this.f1065p != null ? this.f1065p.f1033e : -1;
    }

    public int getTabCount() {
        return this.f1064o.size();
    }

    public int getTabGravity() {
        return this.f1061k;
    }

    int getTabMaxWidth() {
        return this.f1060j;
    }

    public int getTabMode() {
        return this.f1062l;
    }

    public ColorStateList getTabTextColors() {
        return this.f1056f;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1063m == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m529a((ViewPager) parent, true);
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1049D) {
            setupWithViewPager(null);
            this.f1049D = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r0 = r5.getDefaultHeight();
        r0 = r5.m548b(r0);
        r1 = r5.getPaddingTop();
        r0 = r0 + r1;
        r1 = r5.getPaddingBottom();
        r0 = r0 + r1;
        r1 = android.view.View.MeasureSpec.getMode(r7);
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r1 == r2) goto L_0x0024;
    L_0x001c:
        if (r1 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0030;
    L_0x001f:
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3);
        goto L_0x0030;
    L_0x0024:
        r7 = android.view.View.MeasureSpec.getSize(r7);
        r7 = java.lang.Math.min(r0, r7);
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3);
    L_0x0030:
        r0 = android.view.View.MeasureSpec.getSize(r6);
        r1 = android.view.View.MeasureSpec.getMode(r6);
        if (r1 == 0) goto L_0x004a;
    L_0x003a:
        r1 = r5.f1068s;
        if (r1 <= 0) goto L_0x0041;
    L_0x003e:
        r0 = r5.f1068s;
        goto L_0x0048;
    L_0x0041:
        r1 = 56;
        r1 = r5.m548b(r1);
        r0 = r0 - r1;
    L_0x0048:
        r5.f1060j = r0;
    L_0x004a:
        super.onMeasure(r6, r7);
        r6 = r5.getChildCount();
        r0 = 1;
        if (r6 != r0) goto L_0x0096;
    L_0x0054:
        r6 = 0;
        r1 = r5.getChildAt(r6);
        r2 = r5.f1062l;
        switch(r2) {
            case 0: goto L_0x006b;
            case 1: goto L_0x005f;
            default: goto L_0x005e;
        };
    L_0x005e:
        goto L_0x0076;
    L_0x005f:
        r2 = r1.getMeasuredWidth();
        r4 = r5.getMeasuredWidth();
        if (r2 == r4) goto L_0x0076;
    L_0x0069:
        r6 = r0;
        goto L_0x0076;
    L_0x006b:
        r2 = r1.getMeasuredWidth();
        r4 = r5.getMeasuredWidth();
        if (r2 >= r4) goto L_0x0076;
    L_0x0075:
        goto L_0x0069;
    L_0x0076:
        if (r6 == 0) goto L_0x0096;
    L_0x0078:
        r6 = r5.getPaddingTop();
        r0 = r5.getPaddingBottom();
        r6 = r6 + r0;
        r0 = r1.getLayoutParams();
        r0 = r0.height;
        r6 = getChildMeasureSpec(r7, r6, r0);
        r7 = r5.getMeasuredWidth();
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3);
        r1.measure(r7, r6);
    L_0x0096:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.onMeasure(int, int):void");
    }

    @Deprecated
    public void setOnTabSelectedListener(C0283b c0283b) {
        if (this.f1071v != null) {
            m534b(this.f1071v);
        }
        this.f1071v = c0283b;
        if (c0283b != null) {
            m543a(c0283b);
        }
    }

    void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m536c();
        this.f1074y.addListener(animatorListener);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f1066q.m516a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f1066q.m518b(i);
    }

    public void setTabGravity(int i) {
        if (this.f1061k != i) {
            this.f1061k = i;
            m538d();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f1062l) {
            this.f1062l = i;
            m538d();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f1056f != colorStateList) {
            this.f1056f = colorStateList;
            int size = this.f1064o.size();
            for (int i = 0; i < size; i++) {
                ((C0288e) this.f1064o.get(i)).m523b();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C0565n c0565n) {
        m546a(c0565n, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m529a(viewPager, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
