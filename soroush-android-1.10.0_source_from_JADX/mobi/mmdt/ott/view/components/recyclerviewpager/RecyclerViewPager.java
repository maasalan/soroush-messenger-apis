package mobi.mmdt.ott.view.components.recyclerviewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.reflect.Field;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.p235c.C2478a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.C2540d.C2534a;

public class RecyclerViewPager extends RecyclerView {
    public static final boolean f20679a = C2478a.m6728a();
    boolean f20680b;
    int f20681c;
    int f20682d;
    View f20683e;
    int f20684f;
    int f20685g;
    int f20686h;
    int f20687i;
    private C6117a<?> f20688j;
    private float f20689k;
    private float f20690l;
    private float f20691m;
    private List<C3233a> f20692n;
    private int f20693o;
    private int f20694p;
    private boolean f20695q;

    class C32321 implements OnGlobalLayoutListener {
        final /* synthetic */ RecyclerViewPager f9964a;

        C32321(RecyclerViewPager recyclerViewPager) {
            this.f9964a = recyclerViewPager;
        }

        public final void onGlobalLayout() {
            if (VERSION.SDK_INT < 16) {
                this.f9964a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                this.f9964a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (this.f9964a.f20693o >= 0 && this.f9964a.f20693o < this.f9964a.getAdapter().getItemCount() && this.f9964a.f20692n != null) {
                for (C3233a c3233a : this.f9964a.f20692n) {
                    if (c3233a != null) {
                        this.f9964a.f20694p;
                        this.f9964a.getCurrentPosition();
                    }
                }
            }
        }
    }

    public interface C3233a {
    }

    public RecyclerViewPager(Context context) {
        this(context, null);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20689k = 0.1f;
        this.f20690l = 0.001f;
        this.f20693o = -1;
        this.f20694p = -1;
        this.f20684f = Integer.MIN_VALUE;
        this.f20685g = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f20686h = Integer.MIN_VALUE;
        this.f20687i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2534a.RecyclerViewPager, i, 0);
        this.f20690l = obtainStyledAttributes.getFloat(0, 0.001f);
        this.f20689k = obtainStyledAttributes.getFloat(2, 0.1f);
        this.f20695q = obtainStyledAttributes.getBoolean(1, this.f20695q);
        obtainStyledAttributes.recycle();
    }

    private static int m19018a(int i, int i2) {
        return i < 0 ? 0 : i >= i2 ? i2 - 1 : i;
    }

    public boolean fling(int i, int i2) {
        float f = (float) i;
        float f2 = (float) i2;
        boolean fling = super.fling((int) (this.f20690l * f), (int) (this.f20690l * f2));
        if (fling) {
            if (getLayoutManager().canScrollHorizontally()) {
                if (getChildCount() > 0) {
                    i2 = C3234b.m7710b(this);
                    i = (int) ((f * this.f20690l) / ((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())));
                    if (this.f20695q) {
                        i = Math.max(-1, Math.min(1, i));
                    }
                    i = Math.min(Math.max(i + i2, 0), getAdapter().getItemCount() - 1);
                    if (i == i2) {
                        View a = C3234b.m7708a(this);
                        if (a != null) {
                            if (this.f20691m > (((float) a.getWidth()) * this.f20689k) * this.f20689k && i != 0) {
                                i--;
                            } else if (this.f20691m < ((float) a.getWidth()) * (-this.f20689k) && i != getAdapter().getItemCount() - 1) {
                                i++;
                            }
                        }
                    }
                    i = m19018a(i, getAdapter().getItemCount());
                }
            } else if (getChildCount() > 0) {
                i = C3234b.m7713d(this);
                i2 = Math.min(Math.max(((int) ((f2 * this.f20690l) / ((float) ((getHeight() - getPaddingTop()) - getPaddingBottom())))) + i, 0), getAdapter().getItemCount() - 1);
                if (i2 == i) {
                    View c = C3234b.m7712c(this);
                    if (c != null) {
                        if (this.f20691m > ((float) c.getHeight()) * this.f20689k && i2 != 0) {
                            i2--;
                        } else if (this.f20691m < ((float) c.getHeight()) * (-this.f20689k) && i2 != getAdapter().getItemCount() - 1) {
                            i2++;
                        }
                    }
                }
                i = m19018a(i2, getAdapter().getItemCount());
            }
            smoothScrollToPosition(i);
        }
        return fling;
    }

    public Adapter getAdapter() {
        return this.f20688j != null ? this.f20688j.f16423a : null;
    }

    public int getCurrentPosition() {
        return getLayoutManager().canScrollHorizontally() ? C3234b.m7710b(this) : C3234b.m7713d(this);
    }

    public float getFlingFactor() {
        return this.f20690l;
    }

    public float getTriggerOffset() {
        return this.f20689k;
    }

    public C6117a getWrapperAdapter() {
        return this.f20688j;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        try {
            Field declaredField = parcelable.getClass().getDeclaredField("mLayoutState");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(parcelable);
            Field declaredField2 = obj.getClass().getDeclaredField("mAnchorOffset");
            Field declaredField3 = obj.getClass().getDeclaredField("mAnchorPosition");
            declaredField3.setAccessible(true);
            declaredField2.setAccessible(true);
            declaredField3.set(obj, declaredField2.getInt(obj) > 0 ? Integer.valueOf(declaredField3.getInt(obj) - 1) : Integer.valueOf(declaredField3.getInt(obj) + 1));
            declaredField2.setInt(obj, 0);
        } catch (Throwable th) {
            C2480b.m6738b(th);
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(int r5) {
        /*
        r4 = this;
        super.onScrollStateChanged(r5);
        r0 = 0;
        r1 = 1;
        if (r5 != r1) goto L_0x0041;
    L_0x0007:
        r4.f20680b = r1;
        r5 = r4.getLayoutManager();
        r5 = r5.canScrollHorizontally();
        if (r5 == 0) goto L_0x0018;
    L_0x0013:
        r5 = mobi.mmdt.ott.view.components.recyclerviewpager.C3234b.m7708a(r4);
        goto L_0x001c;
    L_0x0018:
        r5 = mobi.mmdt.ott.view.components.recyclerviewpager.C3234b.m7712c(r4);
    L_0x001c:
        r4.f20683e = r5;
        r5 = r4.f20683e;
        if (r5 == 0) goto L_0x003b;
    L_0x0022:
        r5 = r4.f20683e;
        r5 = r4.getChildLayoutPosition(r5);
        r4.f20694p = r5;
        r5 = r4.f20683e;
        r5 = r5.getLeft();
        r4.f20681c = r5;
        r5 = r4.f20683e;
        r5 = r5.getTop();
        r4.f20682d = r5;
        goto L_0x003e;
    L_0x003b:
        r5 = -1;
        r4.f20694p = r5;
    L_0x003e:
        r4.f20691m = r0;
        return;
    L_0x0041:
        r1 = 2;
        r2 = 0;
        if (r5 != r1) goto L_0x0071;
    L_0x0045:
        r5 = 0;
        r4.f20680b = r5;
        r5 = r4.f20683e;
        if (r5 == 0) goto L_0x006c;
    L_0x004c:
        r5 = r4.getLayoutManager();
        r5 = r5.canScrollHorizontally();
        if (r5 == 0) goto L_0x0063;
    L_0x0056:
        r5 = r4.f20683e;
        r5 = r5.getLeft();
        r0 = r4.f20681c;
    L_0x005e:
        r5 = r5 - r0;
        r5 = (float) r5;
        r4.f20691m = r5;
        goto L_0x006e;
    L_0x0063:
        r5 = r4.f20683e;
        r5 = r5.getTop();
        r0 = r4.f20682d;
        goto L_0x005e;
    L_0x006c:
        r4.f20691m = r0;
    L_0x006e:
        r4.f20683e = r2;
        return;
    L_0x0071:
        if (r5 != 0) goto L_0x0158;
    L_0x0073:
        r5 = r4.f20680b;
        if (r5 == 0) goto L_0x012d;
    L_0x0077:
        r5 = r4.getLayoutManager();
        r5 = r5.canScrollHorizontally();
        if (r5 == 0) goto L_0x0086;
    L_0x0081:
        r5 = mobi.mmdt.ott.view.components.recyclerviewpager.C3234b.m7710b(r4);
        goto L_0x008a;
    L_0x0086:
        r5 = mobi.mmdt.ott.view.components.recyclerviewpager.C3234b.m7713d(r4);
    L_0x008a:
        r0 = r4.f20683e;
        if (r0 == 0) goto L_0x011b;
    L_0x008e:
        r5 = r4.f20683e;
        r5 = r4.getChildAdapterPosition(r5);
        r0 = r4.getLayoutManager();
        r0 = r0.canScrollHorizontally();
        if (r0 == 0) goto L_0x00dd;
    L_0x009e:
        r0 = r4.f20683e;
        r0 = r0.getLeft();
        r1 = r4.f20681c;
        r0 = r0 - r1;
        r0 = (float) r0;
        r1 = r4.f20683e;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r3 = r4.f20689k;
        r1 = r1 * r3;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x00c3;
    L_0x00b6:
        r1 = r4.f20683e;
        r1 = r1.getLeft();
        r3 = r4.f20684f;
        if (r1 < r3) goto L_0x00c3;
    L_0x00c0:
        r5 = r5 + -1;
        goto L_0x011b;
    L_0x00c3:
        r1 = r4.f20683e;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r3 = r4.f20689k;
        r3 = -r3;
        r1 = r1 * r3;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x011b;
    L_0x00d2:
        r0 = r4.f20683e;
        r0 = r0.getLeft();
        r1 = r4.f20685g;
        if (r0 > r1) goto L_0x011b;
    L_0x00dc:
        goto L_0x0119;
    L_0x00dd:
        r0 = r4.f20683e;
        r0 = r0.getTop();
        r1 = r4.f20682d;
        r0 = r0 - r1;
        r0 = (float) r0;
        r1 = r4.f20683e;
        r1 = r1.getHeight();
        r1 = (float) r1;
        r3 = r4.f20689k;
        r1 = r1 * r3;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0100;
    L_0x00f5:
        r1 = r4.f20683e;
        r1 = r1.getTop();
        r3 = r4.f20686h;
        if (r1 < r3) goto L_0x0100;
    L_0x00ff:
        goto L_0x00c0;
    L_0x0100:
        r1 = r4.f20683e;
        r1 = r1.getHeight();
        r1 = (float) r1;
        r3 = r4.f20689k;
        r3 = -r3;
        r1 = r1 * r3;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x011b;
    L_0x010f:
        r0 = r4.f20683e;
        r0 = r0.getTop();
        r1 = r4.f20687i;
        if (r0 > r1) goto L_0x011b;
    L_0x0119:
        r5 = r5 + 1;
    L_0x011b:
        r0 = r4.getAdapter();
        r0 = r0.getItemCount();
        r5 = m19018a(r5, r0);
        r4.smoothScrollToPosition(r5);
        r4.f20683e = r2;
        goto L_0x014b;
    L_0x012d:
        r5 = r4.f20693o;
        r0 = r4.f20694p;
        if (r5 == r0) goto L_0x014b;
    L_0x0133:
        r5 = r4.f20692n;
        if (r5 == 0) goto L_0x0147;
    L_0x0137:
        r5 = r4.f20692n;
        r5 = r5.iterator();
    L_0x013d:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0147;
    L_0x0143:
        r5.next();
        goto L_0x013d;
    L_0x0147:
        r5 = r4.f20693o;
        r4.f20694p = r5;
    L_0x014b:
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4.f20684f = r5;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4.f20685g = r0;
        r4.f20686h = r5;
        r4.f20687i = r0;
    L_0x0158:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.recyclerviewpager.RecyclerViewPager.onScrollStateChanged(int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && this.f20683e != null) {
            this.f20684f = Math.max(this.f20683e.getLeft(), this.f20684f);
            this.f20686h = Math.max(this.f20683e.getTop(), this.f20686h);
            this.f20685g = Math.min(this.f20683e.getLeft(), this.f20685g);
            this.f20687i = Math.min(this.f20683e.getTop(), this.f20687i);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void scrollToPosition(int i) {
        this.f20694p = getCurrentPosition();
        this.f20693o = i;
        super.scrollToPosition(i);
        getViewTreeObserver().addOnGlobalLayoutListener(new C32321(this));
    }

    public void setAdapter(Adapter adapter) {
        this.f20688j = adapter instanceof C6117a ? (C6117a) adapter : new C6117a(this, adapter);
        super.setAdapter(this.f20688j);
    }

    public void setFlingFactor(float f) {
        this.f20690l = f;
    }

    public void setSinglePageFling(boolean z) {
        this.f20695q = z;
    }

    public void setTriggerOffset(float f) {
        this.f20689k = f;
    }

    public void smoothScrollToPosition(int i) {
        this.f20693o = i;
        super.smoothScrollToPosition(i);
    }

    public void swapAdapter(Adapter adapter, boolean z) {
        this.f20688j = adapter instanceof C6117a ? (C6117a) adapter : new C6117a(this, adapter);
        super.swapAdapter(this.f20688j, z);
    }
}
