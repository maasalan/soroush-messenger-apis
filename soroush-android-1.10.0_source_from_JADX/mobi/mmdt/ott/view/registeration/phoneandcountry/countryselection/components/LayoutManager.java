package mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.SmoothScroller;
import android.support.v7.widget.RecyclerView.State;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.HashMap;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4337e.C4336a;
import org.msgpack.util.TemplatePrecompiler;

public class LayoutManager extends android.support.v7.widget.RecyclerView.LayoutManager {
    private final C4339h f16992a = new C6254f(this);
    private final C4339h f16993b;
    private int f16994c = -1;
    private Rect f16995d = new Rect();
    private int f16996e = 0;
    private HashMap<String, C4339h> f16997f;
    private boolean f16998g = true;

    protected static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C43281();
        public int f12153a;
        public int f12154b;

        static class C43281 implements Creator<SavedState> {
            C43281() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        protected SavedState() {
        }

        protected SavedState(Parcel parcel) {
            this.f12153a = parcel.readInt();
            this.f12154b = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f12153a);
            parcel.writeInt(this.f12154b);
        }
    }

    public enum C4329a {
        ;
        
        public static final int f12155a = 1;
        public static final int f12156b = 2;
        public static final int f12157c = 3;

        static {
            f12158d = new int[]{f12155a, f12156b, f12157c};
        }
    }

    private class C4332c extends RuntimeException {
        final /* synthetic */ LayoutManager f12161a;

        public C4332c(LayoutManager layoutManager, int i) {
            this.f12161a = layoutManager;
            StringBuilder stringBuilder = new StringBuilder("SLM not yet implemented ");
            stringBuilder.append(i);
            stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
            super(stringBuilder.toString());
        }
    }

    private class C4333d extends RuntimeException {
        final /* synthetic */ LayoutManager f12162a;

        public C4333d(LayoutManager layoutManager, String str) {
            this.f12162a = layoutManager;
            StringBuilder stringBuilder = new StringBuilder("No registered layout for id ");
            stringBuilder.append(str);
            stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
            super(stringBuilder.toString());
        }
    }

    public static class C6250b extends LayoutParams {
        public boolean f16983c;
        public int f16984d;
        public int f16985e;
        public int f16986f;
        public boolean f16987g;
        public boolean f16988h;
        String f16989i;
        int f16990j;
        int f16991k;

        private class C4330a extends RuntimeException {
            final /* synthetic */ C6250b f12159a;

            C4330a(C6250b c6250b) {
                this.f12159a = c6250b;
                super("Invalid section first position given.");
            }
        }

        private class C4331b extends RuntimeException {
            final /* synthetic */ C6250b f12160a;

            C4331b(C6250b c6250b) {
                this.f12160a = c6250b;
                super("Missing section first position.");
            }
        }

        public C6250b() {
            super(-2, -2);
            this.f16990j = 1;
            this.f16983c = false;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.annotation.TargetApi(21)
        public C6250b(android.content.Context r7, android.util.AttributeSet r8) {
            /*
            r6 = this;
            r6.<init>(r7, r8);
            r0 = 1;
            r6.f16990j = r0;
            r1 = mobi.mmdt.ott.C2540d.C2534a.superslim_LayoutManager;
            r7 = r7.obtainStyledAttributes(r8, r1);
            r8 = 0;
            r1 = r7.getBoolean(r0, r8);
            r6.f16983c = r1;
            r1 = 17;
            r1 = r7.getInt(r8, r1);
            r6.f16984d = r1;
            r1 = 2;
            r2 = -1;
            r1 = r7.getInt(r1, r2);
            r6.f16991k = r1;
            r1 = android.os.Build.VERSION.SDK_INT;
            r2 = 4;
            r3 = 3;
            r4 = 5;
            r5 = 21;
            if (r1 >= r5) goto L_0x0057;
        L_0x002c:
            r1 = new android.util.TypedValue;
            r1.<init>();
            r7.getValue(r2, r1);
            r2 = r1.type;
            if (r2 != r4) goto L_0x003a;
        L_0x0038:
            r2 = r0;
            goto L_0x003b;
        L_0x003a:
            r2 = r8;
        L_0x003b:
            r6.m14531b(r7, r2);
            r7.getValue(r3, r1);
            r2 = r1.type;
            if (r2 != r4) goto L_0x0047;
        L_0x0045:
            r2 = r0;
            goto L_0x0048;
        L_0x0047:
            r2 = r8;
        L_0x0048:
            r6.m14528a(r7, r2);
            r7.getValue(r4, r1);
            r1 = r1.type;
            if (r1 != r3) goto L_0x0053;
        L_0x0052:
            r8 = r0;
        L_0x0053:
            r6.m14532c(r7, r8);
            goto L_0x0076;
        L_0x0057:
            r1 = r7.getType(r2);
            if (r1 != r4) goto L_0x005f;
        L_0x005d:
            r1 = r0;
            goto L_0x0060;
        L_0x005f:
            r1 = r8;
        L_0x0060:
            r6.m14531b(r7, r1);
            r1 = r7.getType(r3);
            if (r1 != r4) goto L_0x006b;
        L_0x0069:
            r1 = r0;
            goto L_0x006c;
        L_0x006b:
            r1 = r8;
        L_0x006c:
            r6.m14528a(r7, r1);
            r1 = r7.getType(r4);
            if (r1 != r3) goto L_0x0053;
        L_0x0075:
            goto L_0x0052;
        L_0x0076:
            r7.recycle();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.b.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        @Deprecated
        public C6250b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16990j = 1;
            m14529a(layoutParams);
        }

        @Deprecated
        public C6250b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16990j = 1;
            m14529a(marginLayoutParams);
        }

        private void m14528a(TypedArray typedArray, boolean z) {
            if (z) {
                this.f16988h = false;
                this.f16985e = typedArray.getDimensionPixelSize(3, 0);
                return;
            }
            this.f16988h = true;
        }

        private void m14529a(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof C6250b) {
                C6250b c6250b = (C6250b) layoutParams;
                this.f16983c = c6250b.f16983c;
                this.f16984d = c6250b.f16984d;
                this.f16991k = c6250b.f16991k;
                this.f16989i = c6250b.f16989i;
                this.f16990j = c6250b.f16990j;
                this.f16985e = c6250b.f16985e;
                this.f16986f = c6250b.f16986f;
                this.f16988h = c6250b.f16988h;
                this.f16987g = c6250b.f16987g;
                return;
            }
            this.f16983c = false;
            this.f16984d = 17;
            this.f16985e = -1;
            this.f16986f = -1;
            this.f16987g = true;
            this.f16988h = true;
            this.f16990j = 1;
        }

        public static C6250b m14530b(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams != null) {
                return layoutParams instanceof MarginLayoutParams ? new C6250b((MarginLayoutParams) layoutParams) : new C6250b(layoutParams);
            } else {
                Log.w("SuperSLiM", "Null value passed in call to LayoutManager.LayoutParams.from().");
                return new C6250b();
            }
        }

        private void m14531b(TypedArray typedArray, boolean z) {
            if (z) {
                this.f16987g = false;
                this.f16986f = typedArray.getDimensionPixelSize(4, 0);
                return;
            }
            this.f16987g = true;
        }

        private void m14532c(TypedArray typedArray, boolean z) {
            int i;
            if (z) {
                this.f16989i = typedArray.getString(5);
                if (TextUtils.isEmpty(this.f16989i)) {
                    this.f16990j = 1;
                    return;
                }
                i = -1;
            } else {
                i = typedArray.getInt(5, 1);
            }
            this.f16990j = i;
        }

        public final int m14533a() {
            if (this.f16991k != -1) {
                return this.f16991k;
            }
            throw new C4331b(this);
        }

        public final boolean m14534b() {
            return (this.f16984d & 4) != 0;
        }

        public final boolean m14535c() {
            return (this.f16984d & 1) != 0;
        }

        public final boolean m14536d() {
            return (this.f16984d & 8) != 0;
        }

        public final boolean m14537e() {
            return (this.f16984d & 2) != 0;
        }

        public final boolean m14538f() {
            return (this.f16984d & 16) != 0;
        }
    }

    public LayoutManager(Context context) {
        this.f16993b = new C6253d(this, context);
        this.f16997f = new HashMap();
    }

    private float m14539a(boolean z) {
        View childAt = getChildAt(0);
        int position = getPosition(childAt);
        float decoratedTop = (float) getDecoratedTop(childAt);
        if (((float) getDecoratedBottom(childAt)) < 0.0f) {
            decoratedTop = BallPulseIndicator.SCALE;
        } else if (0.0f <= decoratedTop) {
            decoratedTop = 0.0f;
        } else {
            decoratedTop = (-decoratedTop) / ((float) getDecoratedMeasuredHeight(childAt));
        }
        C4338g c4338g = new C4338g(r0, childAt);
        if (c4338g.f12188l.f16983c && c4338g.f12188l.m14535c()) {
            return decoratedTop;
        }
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        int i2 = -1;
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            View childAt2 = getChildAt(i3);
            C6250b c6250b = (C6250b) childAt2.getLayoutParams();
            if (!c4338g.m8096a(c6250b)) {
                break;
            }
            int position2 = getPosition(childAt2);
            if (!z && position2 < position) {
                i++;
            }
            float decoratedTop2 = (float) getDecoratedTop(childAt2);
            if (((float) getDecoratedBottom(childAt2)) < 0.0f) {
                decoratedTop += BallPulseIndicator.SCALE;
            } else {
                if (0.0f > decoratedTop2) {
                    decoratedTop += (-decoratedTop2) / ((float) getDecoratedMeasuredHeight(childAt2));
                }
            }
            if (!c6250b.f16983c) {
                if (i2 == -1) {
                    i2 = position2;
                }
                sparseArray.put(position2, Boolean.valueOf(true));
            }
        }
        decoratedTop -= (float) i;
        m14549a(c4338g);
        return decoratedTop - ((float) C4339h.m8097a(i2, sparseArray));
    }

    private int m14540a(int i, int i2, C4337e c4337e) {
        while (i2 < i) {
            int position = getPosition(m14545a()) + 1;
            if (position >= c4337e.f12174b.getItemCount()) {
                return i2;
            }
            C4336a c = c4337e.m8095c(position);
            C4338g c4338g = new C4338g(this, c.f12171a);
            if (c4338g.f12178b) {
                m14550a(c.f12171a);
                c4338g = new C4338g(this, c.f12171a);
                i2 = m14553b(c.f12171a, i2, c4338g, c4337e);
                position++;
            } else {
                c4337e.m8093a(position, c.f12171a);
            }
            int i3 = i2;
            int i4 = position;
            if (i4 < c4337e.f12174b.getItemCount()) {
                i3 = m14549a(c4338g).mo2418a(i, i3, i4, c4338g, c4337e);
            }
            if (c4338g.f12178b) {
                addView(c.f12171a);
                if (c.f12172b) {
                    c4337e.m8092a(c4338g.f12177a);
                }
                i2 = Math.max(getDecoratedBottom(c.f12171a), i3);
            } else {
                i2 = i3;
            }
        }
        return i2;
    }

    private int m14541a(int i, C4337e c4337e) {
        int b;
        int height;
        int i2;
        View childAt;
        C6250b c6250b;
        int i3;
        int i4;
        View b2;
        C4338g c4338g;
        C4338g c4338g2;
        C4339h a;
        int i5 = i;
        C4337e c4337e2 = c4337e;
        View b3 = m14554b();
        View b4 = m14555b(((C6250b) b3.getLayoutParams()).m14533a(), C4329a.f12155a, c4337e2);
        C4338g c4338g3 = new C4338g(this, b4);
        C4339h a2 = m14549a(c4338g3);
        int position = getPosition(b3);
        if (position != c4338g3.f12177a) {
            if (position - 1 != c4338g3.f12177a || !c4338g3.f12178b) {
                b = a2.mo2425b(i5, b3, c4338g3, c4337e2);
                if (!c4338g3.f12178b) {
                    a2 = m14549a(c4338g3);
                    position = m14552b(c4338g3.f12177a);
                    height = getHeight();
                    i2 = position != -1 ? 0 : position;
                    while (i2 < getChildCount()) {
                        childAt = getChildAt(i2);
                        c6250b = (C6250b) childAt.getLayoutParams();
                        if (c6250b.m14533a() == c4338g3.f12177a) {
                            View a3 = m14547a(c6250b.m14533a(), i2, C4329a.f12155a);
                            height = a3 != null ? getDecoratedTop(childAt) : getDecoratedTop(a3);
                            i2 = height;
                            height = (position == -1 || !c4338g3.f12188l.m14535c() || c4338g3.f12188l.m14536d()) ? b : i2;
                            if (c4338g3.f12188l.m14535c()) {
                                if (c4338g3.f12188l.m14536d()) {
                                }
                                i3 = 0;
                                b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                                m14551a(b4, i5, c4338g3, c4337e2);
                            }
                            b3 = a2.m8105a(c4338g3.f12177a, true);
                            if (b3 != null) {
                                i3 = 0;
                                b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                                m14551a(b4, i5, c4338g3, c4337e2);
                            } else {
                                i3 = a2.mo2420a(getPosition(b3), c4338g3, c4337e2);
                                b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                                m14551a(b4, i5, c4338g3, c4337e2);
                            }
                        } else {
                            i2++;
                        }
                    }
                    i2 = height;
                    if (position == -1) {
                    }
                    if (c4338g3.f12188l.m14535c()) {
                        if (c4338g3.f12188l.m14536d()) {
                        }
                        i3 = 0;
                        b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                        m14551a(b4, i5, c4338g3, c4337e2);
                    }
                    b3 = a2.m8105a(c4338g3.f12177a, true);
                    if (b3 != null) {
                        i3 = a2.mo2420a(getPosition(b3), c4338g3, c4337e2);
                        b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                        m14551a(b4, i5, c4338g3, c4337e2);
                    } else {
                        i3 = 0;
                        b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                        m14551a(b4, i5, c4338g3, c4337e2);
                    }
                }
                if (b > i5) {
                    return b;
                }
                loop1:
                while (true) {
                    i4 = b;
                    while (i4 >= i5) {
                        b3 = m14554b();
                        View a4 = m14547a(((C6250b) b3.getLayoutParams()).f16991k, 0, C4329a.f12155a);
                        height = (a4 == null ? getPosition(a4) : getPosition(b3)) - 1;
                        if (height < 0) {
                            break loop1;
                        }
                        b2 = m14555b(c4337e2.m8095c(height).m8091a().m14533a(), C4329a.f12155a, c4337e2);
                        c4338g = new C4338g(r8, b2);
                        if (c4338g.f12178b) {
                            m14550a(b2);
                            c4338g = new C4338g(r8, b2);
                        }
                        c4338g2 = c4338g;
                        a = m14549a(c4338g2);
                        height = height < 0 ? a.mo2424b(i5, i4, height, c4338g2, c4337e2) : i4;
                        if (c4338g2.f12178b) {
                            i4 = height;
                        } else {
                            if (c4338g2.f12188l.m14535c()) {
                                if (c4338g2.f12188l.m14536d()) {
                                }
                                i3 = 0;
                                b = m14542a(b2, i5, height, i3, i4, c4338g2, c4337e2);
                                m14551a(b2, i5, c4338g2, c4337e2);
                            }
                            b3 = a.m8105a(c4338g2.f12177a, true);
                            if (b3 != null) {
                                i3 = 0;
                                b = m14542a(b2, i5, height, i3, i4, c4338g2, c4337e2);
                                m14551a(b2, i5, c4338g2, c4337e2);
                            } else {
                                i3 = a.mo2420a(getPosition(b3), c4338g2, c4337e2);
                                b = m14542a(b2, i5, height, i3, i4, c4338g2, c4337e2);
                                m14551a(b2, i5, c4338g2, c4337e2);
                            }
                        }
                    }
                    break loop1;
                }
                return i4;
            }
        }
        b = getDecoratedTop(b3);
        if (!c4338g3.f12178b) {
            a2 = m14549a(c4338g3);
            position = m14552b(c4338g3.f12177a);
            height = getHeight();
            if (position != -1) {
            }
            while (i2 < getChildCount()) {
                childAt = getChildAt(i2);
                c6250b = (C6250b) childAt.getLayoutParams();
                if (c6250b.m14533a() == c4338g3.f12177a) {
                    i2++;
                } else {
                    View a32 = m14547a(c6250b.m14533a(), i2, C4329a.f12155a);
                    if (a32 != null) {
                    }
                    i2 = height;
                    if (position == -1) {
                    }
                    if (c4338g3.f12188l.m14535c()) {
                        if (c4338g3.f12188l.m14536d()) {
                        }
                        i3 = 0;
                        b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                        m14551a(b4, i5, c4338g3, c4337e2);
                    }
                    b3 = a2.m8105a(c4338g3.f12177a, true);
                    if (b3 != null) {
                        i3 = 0;
                        b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                        m14551a(b4, i5, c4338g3, c4337e2);
                    } else {
                        i3 = a2.mo2420a(getPosition(b3), c4338g3, c4337e2);
                        b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                        m14551a(b4, i5, c4338g3, c4337e2);
                    }
                }
            }
            i2 = height;
            if (position == -1) {
            }
            if (c4338g3.f12188l.m14535c()) {
                if (c4338g3.f12188l.m14536d()) {
                }
                i3 = 0;
                b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                m14551a(b4, i5, c4338g3, c4337e2);
            }
            b3 = a2.m8105a(c4338g3.f12177a, true);
            if (b3 != null) {
                i3 = a2.mo2420a(getPosition(b3), c4338g3, c4337e2);
                b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                m14551a(b4, i5, c4338g3, c4337e2);
            } else {
                i3 = 0;
                b = m14542a(b4, i5, height, i3, i2, c4338g3, c4337e2);
                m14551a(b4, i5, c4338g3, c4337e2);
            }
        }
        if (b > i5) {
            return b;
        }
        loop1:
        while (true) {
            i4 = b;
            while (i4 >= i5) {
                b3 = m14554b();
                View a42 = m14547a(((C6250b) b3.getLayoutParams()).f16991k, 0, C4329a.f12155a);
                if (a42 == null) {
                }
                height = (a42 == null ? getPosition(a42) : getPosition(b3)) - 1;
                if (height < 0) {
                    break loop1;
                }
                b2 = m14555b(c4337e2.m8095c(height).m8091a().m14533a(), C4329a.f12155a, c4337e2);
                c4338g = new C4338g(r8, b2);
                if (c4338g.f12178b) {
                    m14550a(b2);
                    c4338g = new C4338g(r8, b2);
                }
                c4338g2 = c4338g;
                a = m14549a(c4338g2);
                if (height < 0) {
                }
                if (c4338g2.f12178b) {
                    i4 = height;
                } else {
                    if (c4338g2.f12188l.m14535c()) {
                        if (c4338g2.f12188l.m14536d()) {
                        }
                        i3 = 0;
                        b = m14542a(b2, i5, height, i3, i4, c4338g2, c4337e2);
                        m14551a(b2, i5, c4338g2, c4337e2);
                    }
                    b3 = a.m8105a(c4338g2.f12177a, true);
                    if (b3 != null) {
                        i3 = a.mo2420a(getPosition(b3), c4338g2, c4337e2);
                        b = m14542a(b2, i5, height, i3, i4, c4338g2, c4337e2);
                        m14551a(b2, i5, c4338g2, c4337e2);
                    } else {
                        i3 = 0;
                        b = m14542a(b2, i5, height, i3, i4, c4338g2, c4337e2);
                        m14551a(b2, i5, c4338g2, c4337e2);
                    }
                }
            }
            break loop1;
        }
        return i4;
    }

    private int m14542a(View view, int i, int i2, int i3, int i4, C4338g c4338g, C4337e c4337e) {
        Rect a = m14544a(this.f16995d, c4338g, c4337e);
        if (c4338g.f12188l.m14535c() && !c4338g.f12188l.m14536d()) {
            a.bottom = i2;
        } else if (i3 <= 0) {
            a.top = i3 + i2;
            a.bottom = a.top + c4338g.f12183g;
            if (c4338g.f12188l.m14538f() && a.top < i && c4338g.f12177a != c4337e.f12174b.getTargetScrollPosition()) {
                a.top = i;
                a.bottom = a.top + c4338g.f12183g;
                if (c4338g.f12188l.m14535c() && !c4338g.f12188l.m14536d()) {
                    i2 -= c4338g.f12183g;
                }
            }
            if (a.bottom > i4) {
                a.bottom = i4;
                a.top = a.bottom - c4338g.f12183g;
            }
            layoutDecorated(view, a.left, a.top, a.right, a.bottom);
            return Math.min(a.top, i2);
        } else {
            a.bottom = i;
        }
        a.top = a.bottom - c4338g.f12183g;
        a.top = i;
        a.bottom = a.top + c4338g.f12183g;
        i2 -= c4338g.f12183g;
        if (a.bottom > i4) {
            a.bottom = i4;
            a.top = a.bottom - c4338g.f12183g;
        }
        layoutDecorated(view, a.left, a.top, a.right, a.bottom);
        return Math.min(a.top, i2);
    }

    static /* synthetic */ int m14543a(LayoutManager layoutManager, int i) {
        C4338g c4338g = new C4338g(layoutManager, layoutManager.getChildAt(0));
        return i < layoutManager.getPosition(layoutManager.m14549a(c4338g).m8105a(c4338g.f12177a, true)) ? -1 : 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Rect m14544a(android.graphics.Rect r4, mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4338g r5, mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4337e r6) {
        /*
        r3 = this;
        r0 = r3.getPaddingLeft();
        r1 = r3.getPaddingRight();
        r2 = r5.f12188l;
        r2 = r2.m14534b();
        if (r2 == 0) goto L_0x0048;
    L_0x0010:
        r2 = r5.f12188l;
        r2 = r2.m14536d();
        if (r2 != 0) goto L_0x0035;
    L_0x0018:
        r2 = r5.f12188l;
        r2 = r2.f16988h;
        if (r2 != 0) goto L_0x0035;
    L_0x001e:
        r2 = r5.f12187k;
        if (r2 <= 0) goto L_0x0035;
    L_0x0022:
        r6 = r6.f12176d;
        if (r6 == 0) goto L_0x0031;
    L_0x0026:
        r6 = r3.getWidth();
        r0 = r5.f12187k;
    L_0x002c:
        r6 = r6 - r0;
        r6 = r6 - r1;
        r4.left = r6;
        goto L_0x0077;
    L_0x0031:
        r6 = r5.f12187k;
    L_0x0033:
        r6 = r6 + r0;
        goto L_0x003e;
    L_0x0035:
        r6 = r6.f12176d;
        if (r6 == 0) goto L_0x0075;
    L_0x0039:
        r6 = r3.getWidth();
        r6 = r6 - r1;
    L_0x003e:
        r4.right = r6;
        r6 = r4.right;
        r5 = r5.f12182f;
        r6 = r6 - r5;
        r4.left = r6;
        return r4;
    L_0x0048:
        r2 = r5.f12188l;
        r2 = r2.m14537e();
        if (r2 == 0) goto L_0x0075;
    L_0x0050:
        r2 = r5.f12188l;
        r2 = r2.m14536d();
        if (r2 != 0) goto L_0x0070;
    L_0x0058:
        r2 = r5.f12188l;
        r2 = r2.f16987g;
        if (r2 != 0) goto L_0x0070;
    L_0x005e:
        r2 = r5.f12186j;
        if (r2 <= 0) goto L_0x0070;
    L_0x0062:
        r6 = r6.f12176d;
        if (r6 == 0) goto L_0x0069;
    L_0x0066:
        r6 = r5.f12186j;
        goto L_0x0033;
    L_0x0069:
        r6 = r3.getWidth();
        r0 = r5.f12186j;
        goto L_0x002c;
    L_0x0070:
        r6 = r6.f12176d;
        if (r6 != 0) goto L_0x0075;
    L_0x0074:
        goto L_0x0039;
    L_0x0075:
        r4.left = r0;
    L_0x0077:
        r6 = r4.left;
        r5 = r5.f12182f;
        r6 = r6 + r5;
        r4.right = r6;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.a(android.graphics.Rect, mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.g, mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.e):android.graphics.Rect");
    }

    private View m14545a() {
        if (getChildCount() == 1) {
            return getChildAt(0);
        }
        View childAt = getChildAt(getChildCount() - 1);
        C6250b c6250b = (C6250b) childAt.getLayoutParams();
        if (c6250b.f16983c) {
            View childAt2 = getChildAt(getChildCount() - 2);
            if (((C6250b) childAt2.getLayoutParams()).m14533a() == c6250b.m14533a()) {
                childAt = childAt2;
            }
        }
        return childAt;
    }

    private View m14546a(int i) {
        int childCount = getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            C6250b c6250b = (C6250b) childAt.getLayoutParams();
            if (c6250b.m14533a() != i) {
                break;
            } else if (c6250b.f16983c) {
                return childAt;
            } else {
                childCount--;
            }
        }
        return null;
    }

    private View m14547a(int i, int i2, int i3) {
        i3 = i3 == C4329a.f12155a ? 1 : -1;
        while (i2 >= 0 && i2 < getChildCount()) {
            View childAt = getChildAt(i2);
            if (getPosition(childAt) != i) {
                if (((C6250b) childAt.getLayoutParams()).m14533a() != i) {
                    break;
                }
                i2 += i3;
            } else {
                return childAt;
            }
        }
        return null;
    }

    private C4339h m14548a(C6250b c6250b) {
        if (c6250b.f16990j == -1) {
            return (C4339h) this.f16997f.get(c6250b.f16989i);
        }
        if (c6250b.f16990j == 1) {
            return this.f16992a;
        }
        if (c6250b.f16990j == 2) {
            return this.f16993b;
        }
        throw new C4332c(this, c6250b.f16990j);
    }

    private C4339h m14549a(C4338g c4338g) {
        C4339h c4339h;
        if (c4338g.f12188l.f16990j == -1) {
            c4339h = (C4339h) this.f16997f.get(c4338g.f12180d);
            if (c4339h == null) {
                throw new C4333d(this, c4338g.f12180d);
            }
        } else if (c4338g.f12188l.f16990j == 1) {
            c4339h = this.f16992a;
        } else if (c4338g.f12188l.f16990j == 2) {
            c4339h = this.f16993b;
        } else {
            throw new C4332c(this, c4338g.f12188l.f16990j);
        }
        return c4339h.mo2423a(c4338g);
    }

    private void m14550a(View view) {
        int i;
        C6250b c6250b = (C6250b) view.getLayoutParams();
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        if (!c6250b.m14536d()) {
            if (c6250b.m14537e() && !c6250b.f16987g) {
                i = c6250b.f16986f;
            } else if (c6250b.m14534b() && !c6250b.f16988h) {
                i = c6250b.f16985e;
            }
            i = width - i;
            measureChildWithMargins(view, i, 0);
        }
        i = 0;
        measureChildWithMargins(view, i, 0);
    }

    private void m14551a(View view, int i, C4338g c4338g, C4337e c4337e) {
        if (c4337e.m8094b(c4338g.f12177a) != null && getDecoratedBottom(view) > i) {
            addView(view, m14552b(c4338g.f12177a) + 1);
            c4337e.m8092a(c4338g.f12177a);
        }
    }

    private int m14552b(int i) {
        int childCount = getChildCount() - 1;
        int i2 = 0;
        while (childCount >= i2) {
            int i3 = ((childCount - i2) / 2) + i2;
            C6250b c6250b = (C6250b) getChildAt(i3).getLayoutParams();
            if (c6250b.m14533a() < i) {
                i2 = i3 + 1;
            } else {
                if (c6250b.m14533a() <= i) {
                    if (!c6250b.f16983c) {
                        if (i3 == getChildCount() - 1) {
                            return i3;
                        }
                        i2 = i3 + 1;
                        c6250b = (C6250b) getChildAt(i2).getLayoutParams();
                        if (c6250b.m14533a() != i) {
                            return i3;
                        }
                        if (c6250b.f16983c && (i2 == getChildCount() - 1 || ((C6250b) getChildAt(i3 + 2).getLayoutParams()).m14533a() != i)) {
                            return i3;
                        }
                    }
                }
                childCount = i3 - 1;
            }
        }
        return -1;
    }

    private int m14553b(View view, int i, C4338g c4338g, C4337e c4337e) {
        Rect a = m14544a(this.f16995d, c4338g, c4337e);
        a.top = i;
        a.bottom = a.top + c4338g.f12183g;
        if (c4338g.f12188l.m14535c() && !c4338g.f12188l.m14536d()) {
            i = a.bottom;
        }
        if (c4338g.f12188l.m14538f() && a.top < 0) {
            a.top = 0;
            a.bottom = a.top + c4338g.f12183g;
        }
        layoutDecorated(view, a.left, a.top, a.right, a.bottom);
        return i;
    }

    private View m14554b() {
        View childAt = getChildAt(0);
        C6250b c6250b = (C6250b) childAt.getLayoutParams();
        int a = c6250b.m14533a();
        if (c6250b.f16983c && 1 < getChildCount()) {
            View childAt2 = getChildAt(1);
            if (((C6250b) childAt2.getLayoutParams()).m14533a() == a) {
                return childAt2;
            }
        }
        return childAt;
    }

    private View m14555b(int i, int i2, C4337e c4337e) {
        View a = m14547a(i, i2 == C4329a.f12155a ? 0 : getChildCount() - 1, i2);
        if (a != null) {
            return a;
        }
        C4336a c = c4337e.m8095c(i);
        View view = c.f12171a;
        if (c.m8091a().f16983c) {
            m14550a(c.f12171a);
        }
        c4337e.m8093a(i, view);
        return view;
    }

    private View m14556c() {
        if (getChildCount() == 0) {
            return null;
        }
        View childAt = getChildAt(0);
        int a = ((C6250b) childAt.getLayoutParams()).m14533a();
        View a2 = m14547a(a, 0, C4329a.f12155a);
        if (a2 == null) {
            return childAt;
        }
        C6250b c6250b = (C6250b) a2.getLayoutParams();
        return !c6250b.f16983c ? childAt : (!c6250b.m14535c() || c6250b.m14536d()) ? (getDecoratedTop(childAt) >= getDecoratedTop(a2) && a + 1 == getPosition(childAt)) ? a2 : childAt : getDecoratedBottom(a2) <= getDecoratedTop(childAt) ? a2 : childAt;
    }

    public boolean canScrollVertically() {
        return true;
    }

    public int computeVerticalScrollExtent(State state) {
        LayoutManager layoutManager = this;
        if (getChildCount() != 0) {
            if (state.getItemCount() != 0) {
                if (!layoutManager.f16998g) {
                    return getChildCount();
                }
                float childCount = ((float) getChildCount()) - m14539a(true);
                float height = (float) getHeight();
                View childAt = getChildAt(getChildCount() - 1);
                getPosition(childAt);
                C4338g c4338g = new C4338g(layoutManager, childAt);
                SparseArray sparseArray = new SparseArray();
                int i = -1;
                float f = 0.0f;
                for (int i2 = 1; i2 <= getChildCount(); i2++) {
                    View childAt2 = getChildAt(getChildCount() - i2);
                    C6250b c6250b = (C6250b) childAt2.getLayoutParams();
                    if (!c4338g.m8096a(c6250b)) {
                        break;
                    }
                    int position = getPosition(childAt2);
                    float decoratedBottom = (float) getDecoratedBottom(childAt2);
                    float decoratedTop = (float) getDecoratedTop(childAt2);
                    if (decoratedBottom > height) {
                        if (height < decoratedTop) {
                            f += BallPulseIndicator.SCALE;
                        } else {
                            f += (decoratedBottom - height) / ((float) getDecoratedMeasuredHeight(childAt2));
                        }
                        if (!c6250b.f16983c) {
                            if (i == -1) {
                                i = position;
                            }
                            sparseArray.put(position, Boolean.valueOf(true));
                        }
                    }
                }
                f -= 0.0f;
                m14549a(c4338g);
                return (int) (((childCount - (f - ((float) C4339h.m8098b(i, sparseArray)))) / ((float) state.getItemCount())) * ((float) getHeight()));
            }
        }
        return 0;
    }

    public int computeVerticalScrollOffset(State state) {
        if (getChildCount() == 0 || state.getItemCount() == 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        return !this.f16998g ? getPosition(childAt) : (int) (((((float) getPosition(childAt)) + m14539a(false)) / ((float) state.getItemCount())) * ((float) getHeight()));
    }

    public int computeVerticalScrollRange(State state) {
        return !this.f16998g ? state.getItemCount() : getHeight();
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new C6250b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v7.widget.RecyclerView.LayoutParams generateLayoutParams(android.content.Context r8, android.util.AttributeSet r9) {
        /*
        r7 = this;
        r0 = mobi.mmdt.ott.C2540d.C2534a.superslim_LayoutManager;
        r0 = r8.obtainStyledAttributes(r9, r0);
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 0;
        r3 = 3;
        r4 = 5;
        r5 = 1;
        r6 = 21;
        if (r1 >= r6) goto L_0x001e;
    L_0x0010:
        r1 = new android.util.TypedValue;
        r1.<init>();
        r0.getValue(r4, r1);
        r1 = r1.type;
        if (r1 != r3) goto L_0x0025;
    L_0x001c:
        r2 = r5;
        goto L_0x0025;
    L_0x001e:
        r1 = r0.getType(r4);
        if (r1 != r3) goto L_0x0025;
    L_0x0024:
        goto L_0x001c;
    L_0x0025:
        r1 = 0;
        r3 = -1;
        if (r2 == 0) goto L_0x0037;
    L_0x0029:
        r1 = r0.getString(r4);
        r2 = android.text.TextUtils.isEmpty(r1);
        if (r2 == 0) goto L_0x0035;
    L_0x0033:
        r2 = r5;
        goto L_0x003b;
    L_0x0035:
        r2 = r3;
        goto L_0x003b;
    L_0x0037:
        r2 = r0.getInt(r4, r5);
    L_0x003b:
        r0.recycle();
        if (r2 != r3) goto L_0x0049;
    L_0x0040:
        r0 = r7.f16997f;
        r0 = r0.get(r1);
        r0 = (mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C4339h) r0;
        goto L_0x0053;
    L_0x0049:
        if (r2 != r5) goto L_0x004e;
    L_0x004b:
        r0 = r7.f16992a;
        goto L_0x0053;
    L_0x004e:
        r0 = 2;
        if (r2 != r0) goto L_0x0058;
    L_0x0051:
        r0 = r7.f16993b;
    L_0x0053:
        r8 = r0.mo2421a(r8, r9);
        return r8;
    L_0x0058:
        r8 = new mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager$c;
        r8.<init>(r7, r2);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.generateLayoutParams(android.content.Context, android.util.AttributeSet):android.support.v7.widget.RecyclerView$LayoutParams");
    }

    public /* synthetic */ LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C6250b b = C6250b.m14530b(layoutParams);
        b.width = -1;
        b.height = -1;
        return m14548a(b).mo2422a(b);
    }

    public int getDecoratedBottom(View view) {
        return super.getDecoratedBottom(view) + ((MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public int getDecoratedLeft(View view) {
        return super.getDecoratedLeft(view) - ((MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    public int getDecoratedMeasuredHeight(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return (super.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin;
    }

    public int getDecoratedMeasuredWidth(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return (super.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin;
    }

    public int getDecoratedRight(View view) {
        return super.getDecoratedRight(view) + ((MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    public int getDecoratedTop(View view) {
        return super.getDecoratedTop(view) - ((MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        super.layoutDecorated(view, i + marginLayoutParams.leftMargin, i2 + marginLayoutParams.topMargin, i3 - marginLayoutParams.rightMargin, i4 - marginLayoutParams.bottomMargin);
    }

    public void onAdapterChanged(Adapter adapter, Adapter adapter2) {
        removeAllViews();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        int i;
        View c = m14556c();
        if (c == null) {
            this.f16994c = -1;
            i = 0;
        } else {
            this.f16994c = getPosition(c);
            i = getDecoratedTop(c);
        }
        this.f16996e = i;
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(getChildCount() - 1);
        if (i2 + i > getPosition(childAt) && i <= getPosition(childAt2)) {
            requestLayout();
        }
    }

    public void onLayoutChildren(Recycler recycler, State state) {
        android.support.v7.widget.RecyclerView.LayoutManager layoutManager = this;
        int itemCount = state.getItemCount();
        if (itemCount == 0) {
            detachAndScrapAttachedViews(recycler);
            return;
        }
        int i;
        int i2;
        int b;
        C4338g c4338g;
        C4336a c4336a;
        int i3;
        C4337e c4337e;
        int i4 = 1;
        if (layoutManager.f16994c != -1) {
            itemCount = Math.min(layoutManager.f16994c, itemCount - 1);
            layoutManager.f16994c = -1;
            i = layoutManager.f16996e;
            layoutManager.f16996e = 0;
        } else {
            View c = m14556c();
            itemCount = c == null ? 0 : Math.min(getPosition(c), itemCount - 1);
            i2 = C4329a.f12156b;
            i = c == null ? i2 == C4329a.f12155a ? getPaddingBottom() : getPaddingTop() : i2 == C4329a.f12155a ? getDecoratedBottom(c) : getDecoratedTop(c);
        }
        int i5 = i;
        detachAndScrapAttachedViews(recycler);
        C4337e c4337e2 = new C4337e(layoutManager, recycler, state);
        int height = getHeight();
        C4336a c2 = c4337e2.m8095c(itemCount);
        c4337e2.m8093a(itemCount, c2.f12171a);
        i = c2.m8091a().m14533a();
        C4336a c3 = c4337e2.m8095c(i);
        m14550a(c3.f12171a);
        c4337e2.m8093a(i, c3.f12171a);
        C4338g c4338g2 = new C4338g(layoutManager, c3.f12171a);
        C4339h a = m14549a(c4338g2);
        if (c4338g2.f12178b && itemCount == c4338g2.f12177a) {
            b = m14553b(c3.f12171a, i5, c4338g2, c4337e2);
            i2 = itemCount + 1;
        } else {
            i2 = itemCount;
            b = i5;
        }
        int a2 = a.mo2418a(height, b, i2, c4338g2, c4337e2);
        if (!c4338g2.f12178b || itemCount == c4338g2.f12177a) {
            c4338g = c4338g2;
            c4336a = c3;
            i3 = height;
            c4337e = c4337e2;
            a2 = Math.max(a2, getDecoratedBottom(c4336a.f12171a));
        } else {
            c4338g = c4338g2;
            c4336a = c3;
            i3 = height;
            c4337e = c4337e2;
            m14542a(c3.f12171a, 0, i5, a.mo2420a(i2, c4338g2, c4337e2), a2, c4338g, c4337e2);
        }
        if (c4338g.f12178b && getDecoratedBottom(c4336a.f12171a) > 0) {
            addView(c4336a.f12171a);
            c4337e.m8092a(c4338g.f12177a);
        }
        itemCount = m14540a(i3, a2, c4337e);
        i = c4337e.f12174b.getItemCount();
        if (getChildCount() != 0) {
            View a3;
            C4338g c4338g3 = new C4338g(layoutManager, getChildAt(0));
            View a4 = m14549a(c4338g3).m8105a(c4338g3.f12177a, false);
            int position = getPosition(a4);
            if (position <= c4338g3.f12177a + 1) {
                if (position != c4338g3.f12177a) {
                    a3 = m14547a(c4338g3.f12177a, 0, C4329a.f12155a);
                    if (a3 != null) {
                        if (getDecoratedBottom(a3) > getDecoratedTop(a4)) {
                            C6250b c6250b = (C6250b) a3.getLayoutParams();
                            if ((!c6250b.m14535c() || c6250b.m14536d()) && getDecoratedTop(a3) == getDecoratedTop(a4)) {
                            }
                        }
                        i5 = getPosition(a3) != 0 ? 1 : false;
                        position = getDecoratedTop(a3) <= getPaddingTop() ? 1 : false;
                        i2 = getDecoratedTop(a3) != getPaddingTop() ? 1 : false;
                        if (i5 == 0 && position != 0) {
                            if (i4 != 0) {
                                offsetChildrenVertical((getHeight() - getPaddingBottom()) - itemCount);
                                itemCount = m14541a(0, c4337e);
                                if (itemCount > getPaddingTop()) {
                                    offsetChildrenVertical(getPaddingTop() - itemCount);
                                }
                            }
                        } else if (i5 == 0 || i2 == 0) {
                            c4338g3 = new C4338g(layoutManager, getChildAt(getChildCount() - 1));
                            a3 = m14549a(c4338g3).m8111b(c4338g3.f12177a);
                            i = getPosition(a3) != i - 1 ? 1 : false;
                            i2 = getDecoratedBottom(a3) >= getHeight() - getPaddingBottom() ? 1 : false;
                            if (!(i == 0 || i2 == 0)) {
                                if (i4 != 0) {
                                    offsetChildrenVertical((getHeight() - getPaddingBottom()) - itemCount);
                                    itemCount = m14541a(0, c4337e);
                                    if (itemCount > getPaddingTop()) {
                                        offsetChildrenVertical(getPaddingTop() - itemCount);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            a3 = a4;
            if (getPosition(a3) != 0) {
            }
            if (getDecoratedTop(a3) <= getPaddingTop()) {
            }
            if (getDecoratedTop(a3) != getPaddingTop()) {
            }
            if (i5 == 0) {
            }
            c4338g3 = new C4338g(layoutManager, getChildAt(getChildCount() - 1));
            a3 = m14549a(c4338g3).m8111b(c4338g3.f12177a);
            if (getPosition(a3) != i - 1) {
            }
            if (getDecoratedBottom(a3) >= getHeight() - getPaddingBottom()) {
            }
            if (i4 != 0) {
                offsetChildrenVertical((getHeight() - getPaddingBottom()) - itemCount);
                itemCount = m14541a(0, c4337e);
                if (itemCount > getPaddingTop()) {
                    offsetChildrenVertical(getPaddingTop() - itemCount);
                }
            }
        }
        i4 = 0;
        if (i4 != 0) {
            offsetChildrenVertical((getHeight() - getPaddingBottom()) - itemCount);
            itemCount = m14541a(0, c4337e);
            if (itemCount > getPaddingTop()) {
                offsetChildrenVertical(getPaddingTop() - itemCount);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        this.f16994c = savedState.f12153a;
        this.f16996e = savedState.f12154b;
        requestLayout();
    }

    public android.os.Parcelable onSaveInstanceState() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:6:0x001c in {2, 4, 5} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r3 = this;
        r0 = new mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager$SavedState;
        r0.<init>();
        r1 = r3.m14556c();
        if (r1 != 0) goto L_0x0011;
    L_0x000b:
        r1 = 0;
        r0.f12153a = r1;
    L_0x000e:
        r0.f12154b = r1;
        return r0;
    L_0x0011:
        r2 = r3.getPosition(r1);
        r0.f12153a = r2;
        r1 = r3.getDecoratedTop(r1);
        goto L_0x000e;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.onSaveInstanceState():android.os.Parcelable");
    }

    public void scrollToPosition(int i) {
        if (i >= 0) {
            if (getItemCount() > i) {
                this.f16994c = i;
                requestLayout();
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Ignored scroll to ");
        stringBuilder.append(i);
        stringBuilder.append(" as it is not within the item range 0 - ");
        stringBuilder.append(getItemCount());
        Log.e("SuperSLiM.LayoutManager", stringBuilder.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int scrollVerticallyBy(int r16, android.support.v7.widget.RecyclerView.Recycler r17, android.support.v7.widget.RecyclerView.State r18) {
        /*
        r15 = this;
        r6 = r15;
        r0 = r16;
        r1 = r6.getChildCount();
        r7 = 0;
        if (r1 != 0) goto L_0x000b;
    L_0x000a:
        return r7;
    L_0x000b:
        r8 = new mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.e;
        r1 = r17;
        r2 = r18;
        r8.<init>(r6, r1, r2);
        if (r0 <= 0) goto L_0x0019;
    L_0x0016:
        r1 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12156b;
        goto L_0x001b;
    L_0x0019:
        r1 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12155a;
    L_0x001b:
        r3 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12156b;
        r4 = 1;
        if (r1 != r3) goto L_0x0022;
    L_0x0020:
        r3 = r4;
        goto L_0x0023;
    L_0x0022:
        r3 = r7;
    L_0x0023:
        r5 = r6.getHeight();
        if (r3 == 0) goto L_0x002c;
    L_0x0029:
        r9 = r5 + r0;
        goto L_0x002d;
    L_0x002c:
        r9 = r0;
    L_0x002d:
        if (r3 == 0) goto L_0x0062;
    L_0x002f:
        r10 = r6.m14545a();
        r11 = r10.getLayoutParams();
        r11 = (mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b) r11;
        r12 = r6.m14548a(r11);
        r11 = r11.m14533a();
        r13 = r6.getChildCount();
        r13 = r13 - r4;
        r14 = r6.getDecoratedBottom(r10);
        r11 = r12.mo2417a(r11, r13, r14);
        r12 = r6.getPaddingBottom();
        r12 = r5 - r12;
        if (r11 >= r12) goto L_0x0062;
    L_0x0056:
        r10 = r6.getPosition(r10);
        r2 = r18.getItemCount();
        r2 = r2 - r4;
        if (r10 != r2) goto L_0x0062;
    L_0x0061:
        return r7;
    L_0x0062:
        r2 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12155a;
        r10 = -1;
        if (r1 != r2) goto L_0x006c;
    L_0x0067:
        r1 = r6.m14541a(r9, r8);
        goto L_0x00aa;
    L_0x006c:
        r1 = r6.m14545a();
        r2 = r1.getLayoutParams();
        r2 = (mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b) r2;
        r2 = r2.m14533a();
        r11 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12156b;
        r2 = r6.m14555b(r2, r11, r8);
        r11 = new mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.g;
        r11.<init>(r6, r2);
        r2 = r6.m14549a(r11);
        r1 = r2.mo2419a(r9, r1, r11, r8);
        r2 = r11.f12177a;
        r2 = r6.m14546a(r2);
        if (r2 != 0) goto L_0x0096;
    L_0x0095:
        goto L_0x00a4;
    L_0x0096:
        r6.detachView(r2);
        r6.attachView(r2, r10);
        r2 = r6.getDecoratedBottom(r2);
        r1 = java.lang.Math.max(r1, r2);
    L_0x00a4:
        if (r1 > r9) goto L_0x00aa;
    L_0x00a6:
        r1 = r6.m14540a(r9, r1, r8);
    L_0x00aa:
        if (r3 == 0) goto L_0x00b7;
    L_0x00ac:
        r1 = r1 - r5;
        r2 = r6.getPaddingBottom();
        r1 = r1 + r2;
        if (r1 >= r0) goto L_0x00b5;
    L_0x00b4:
        r0 = r1;
    L_0x00b5:
        r9 = r0;
        goto L_0x00bf;
    L_0x00b7:
        r2 = r6.getPaddingTop();
        r1 = r1 - r2;
        if (r1 <= r0) goto L_0x00b5;
    L_0x00be:
        goto L_0x00b4;
    L_0x00bf:
        if (r9 == 0) goto L_0x01f4;
    L_0x00c1:
        r0 = -r9;
        r6.offsetChildrenVertical(r0);
        if (r3 == 0) goto L_0x00ca;
    L_0x00c7:
        r0 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12155a;
        goto L_0x00cc;
    L_0x00ca:
        r0 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12156b;
    L_0x00cc:
        r1 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12155a;
        if (r0 != r1) goto L_0x01cc;
    L_0x00d0:
        r0 = r7;
    L_0x00d1:
        r1 = r6.getChildCount();
        r2 = 0;
        if (r0 >= r1) goto L_0x00e6;
    L_0x00d8:
        r1 = r6.getChildAt(r0);
        r3 = r6.getDecoratedBottom(r1);
        if (r3 <= 0) goto L_0x00e3;
    L_0x00e2:
        goto L_0x00e8;
    L_0x00e3:
        r0 = r0 + 1;
        goto L_0x00d1;
    L_0x00e6:
        r1 = r2;
        r0 = r7;
    L_0x00e8:
        if (r1 != 0) goto L_0x00f1;
    L_0x00ea:
        r0 = r8.f12173a;
        r6.detachAndScrapAttachedViews(r0);
        goto L_0x01f4;
    L_0x00f1:
        r1 = r1.getLayoutParams();
        r1 = (mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b) r1;
        r3 = r1.f16983c;
        if (r3 == 0) goto L_0x0119;
    L_0x00fb:
        r3 = r0 + -1;
    L_0x00fd:
        if (r3 < 0) goto L_0x0119;
    L_0x00ff:
        r5 = r6.getChildAt(r3);
        r5 = r5.getLayoutParams();
        r5 = (mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b) r5;
        r11 = r5.m14533a();
        r12 = r1.m14533a();
        if (r11 != r12) goto L_0x0116;
    L_0x0113:
        r0 = r3;
        r1 = r5;
        goto L_0x0119;
    L_0x0116:
        r3 = r3 + -1;
        goto L_0x00fd;
    L_0x0119:
        r3 = r7;
    L_0x011a:
        if (r3 >= r0) goto L_0x0124;
    L_0x011c:
        r5 = r8.f12173a;
        r6.removeAndRecycleViewAt(r7, r5);
        r3 = r3 + 1;
        goto L_0x011a;
    L_0x0124:
        r0 = r1.m14533a();
        r1 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12155a;
        r3 = mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C4329a.f12156b;
        if (r1 != r3) goto L_0x0134;
    L_0x012e:
        r0 = r6.m14546a(r0);
        r11 = r0;
        goto L_0x015b;
    L_0x0134:
        r1 = r6.getChildCount();
        r1 = r1 - r4;
        r3 = r7;
    L_0x013a:
        if (r1 >= r3) goto L_0x013e;
    L_0x013c:
        r11 = r2;
        goto L_0x015b;
    L_0x013e:
        r4 = r1 - r3;
        r4 = r4 / 2;
        r4 = r4 + r3;
        r5 = r6.getChildAt(r4);
        r11 = r5.getLayoutParams();
        r11 = (mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b) r11;
        r12 = r11.m14533a();
        if (r12 == r0) goto L_0x0156;
    L_0x0153:
        r1 = r4 + -1;
        goto L_0x013a;
    L_0x0156:
        r3 = r11.f16983c;
        if (r3 == 0) goto L_0x01c8;
    L_0x015a:
        r11 = r5;
    L_0x015b:
        if (r11 == 0) goto L_0x01f4;
    L_0x015d:
        r0 = r6.getDecoratedTop(r11);
        if (r0 >= 0) goto L_0x01bc;
    L_0x0163:
        r0 = new mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.g;
        r0.<init>(r6, r11);
        r1 = r0.f12188l;
        r1 = r1.m14538f();
        if (r1 == 0) goto L_0x01bc;
    L_0x0170:
        r1 = r0.f12177a;
        r1 = r6.m14552b(r1);
        if (r1 == r10) goto L_0x01bc;
    L_0x0178:
        r2 = r6.m14549a(r0);
        r3 = r0.f12177a;
        r4 = r6.getHeight();
        r1 = r2.mo2417a(r3, r1, r4);
        r3 = r0.f12177a;
        r2 = r2.m8099a(r3);
        r3 = r6.getDecoratedMeasuredHeight(r11);
        r4 = r0.f12188l;
        r4 = r4.m14535c();
        if (r4 == 0) goto L_0x01a0;
    L_0x0198:
        r0 = r0.f12188l;
        r0 = r0.m14536d();
        if (r0 == 0) goto L_0x01a4;
    L_0x01a0:
        r0 = r1 - r2;
        if (r0 < r3) goto L_0x01bc;
    L_0x01a4:
        r2 = r6.getDecoratedLeft(r11);
        r4 = r6.getDecoratedRight(r11);
        r0 = r7 + r3;
        if (r0 <= r1) goto L_0x01b5;
    L_0x01b0:
        r0 = r1 - r3;
        r3 = r0;
        r5 = r1;
        goto L_0x01b7;
    L_0x01b5:
        r5 = r0;
        r3 = r7;
    L_0x01b7:
        r0 = r6;
        r1 = r11;
        r0.layoutDecorated(r1, r2, r3, r4, r5);
    L_0x01bc:
        r0 = r6.getDecoratedBottom(r11);
        if (r0 > 0) goto L_0x01f4;
    L_0x01c2:
        r0 = r8.f12173a;
        r6.removeAndRecycleView(r11, r0);
        goto L_0x01f4;
    L_0x01c8:
        r3 = r4 + 1;
        goto L_0x013a;
    L_0x01cc:
        r0 = r6.getHeight();
        r1 = r6.getChildCount();
        r1 = r1 - r4;
    L_0x01d5:
        if (r1 < 0) goto L_0x01f4;
    L_0x01d7:
        r2 = r6.getChildAt(r1);
        r3 = r6.getDecoratedTop(r2);
        if (r3 < r0) goto L_0x01e7;
    L_0x01e1:
        r3 = r8.f12173a;
        r6.removeAndRecycleView(r2, r3);
        goto L_0x01f1;
    L_0x01e7:
        r2 = r2.getLayoutParams();
        r2 = (mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b) r2;
        r2 = r2.f16983c;
        if (r2 == 0) goto L_0x01f4;
    L_0x01f1:
        r1 = r1 + -1;
        goto L_0x01d5;
    L_0x01f4:
        r0 = r8.f12175c;
        r0 = r0.size();
        if (r7 >= r0) goto L_0x020c;
    L_0x01fc:
        r0 = r8.f12173a;
        r1 = r8.f12175c;
        r1 = r1.valueAt(r7);
        r1 = (android.view.View) r1;
        r0.recycleView(r1);
        r7 = r7 + 1;
        goto L_0x01f4;
    L_0x020c:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.scrollVerticallyBy(int, android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State):int");
    }

    public void smoothScrollToPosition(final RecyclerView recyclerView, State state, final int i) {
        if (i >= 0) {
            if (getItemCount() > i) {
                requestLayout();
                recyclerView.getHandler().post(new Runnable(this) {
                    final /* synthetic */ LayoutManager f12152c;

                    public final void run() {
                        SmoothScroller c69461 = new LinearSmoothScroller(this, recyclerView.getContext()) {
                            final /* synthetic */ C43271 f19833a;

                            public final int calculateDyToMakeVisible(View view, int i) {
                                android.support.v7.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
                                int i2 = 0;
                                if (!layoutManager.canScrollVertically()) {
                                    return 0;
                                }
                                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                                int decoratedTop = layoutManager.getDecoratedTop(view) - layoutParams.topMargin;
                                int decoratedBottom = layoutManager.getDecoratedBottom(view) + layoutParams.bottomMargin;
                                if (this.f19833a.f12152c.getPosition(view) == 0) {
                                    i2 = layoutManager.getPaddingTop();
                                }
                                int calculateDtToFit = calculateDtToFit(decoratedTop, decoratedBottom, i2, layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
                                if (calculateDtToFit == 0) {
                                    calculateDtToFit = 1;
                                }
                                return calculateDtToFit;
                            }

                            public final PointF computeScrollVectorForPosition(int i) {
                                return getChildCount() == 0 ? null : new PointF(0.0f, (float) LayoutManager.m14543a(this.f19833a.f12152c, i));
                            }

                            protected final int getVerticalSnapPreference() {
                                return -1;
                            }

                            protected final void onChildAttachedToWindow(View view) {
                                super.onChildAttachedToWindow(view);
                            }

                            protected final void onStop() {
                                super.onStop();
                                this.f19833a.f12152c.requestLayout();
                            }
                        };
                        c69461.setTargetPosition(i);
                        this.f12152c.startSmoothScroll(c69461);
                    }
                });
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Ignored smooth scroll to ");
        stringBuilder.append(i);
        stringBuilder.append(" as it is not within the item range 0 - ");
        stringBuilder.append(getItemCount());
        Log.e("SuperSLiM.LayoutManager", stringBuilder.toString());
    }
}
