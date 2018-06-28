package mobi.mmdt.ott.view.components.imageslider.Indicators;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.p029a.C0346c;
import android.support.v4.view.C0565n;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.ott.C2540d.C2534a;
import mobi.mmdt.ott.view.components.imageslider.Tricks.C6093b;
import mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx;
import mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3178f;

public class PagerIndicator extends LinearLayout implements C3178f {
    public ViewPagerEx f16328a;
    public DataSetObserver f16329b;
    private Context f16330c;
    private ImageView f16331d;
    private int f16332e;
    private int f16333f;
    private int f16334g;
    private Drawable f16335h;
    private Drawable f16336i;
    private int f16337j;
    private C3161a f16338k;
    private GradientDrawable f16339l;
    private GradientDrawable f16340m;
    private LayerDrawable f16341n;
    private LayerDrawable f16342o;
    private float f16343p;
    private float f16344q;
    private float f16345r;
    private float f16346s;
    private float f16347t;
    private float f16348u;
    private float f16349v;
    private float f16350w;
    private ArrayList<ImageView> f16351x;

    class C31601 extends DataSetObserver {
        final /* synthetic */ PagerIndicator f9782a;

        C31601(PagerIndicator pagerIndicator) {
            this.f9782a = pagerIndicator;
        }

        public final void onChanged() {
            C0565n adapter = this.f9782a.f16328a.getAdapter();
            int size = adapter instanceof C6093b ? ((C6093b) adapter).f16353a.f16354a.size() : adapter.mo2270b();
            int i = 0;
            if (size > this.f9782a.f16337j) {
                while (i < size - this.f9782a.f16337j) {
                    View imageView = new ImageView(this.f9782a.f16330c);
                    imageView.setImageDrawable(this.f9782a.f16336i);
                    imageView.setPadding((int) this.f9782a.f16347t, (int) this.f9782a.f16349v, (int) this.f9782a.f16348u, (int) this.f9782a.f16350w);
                    this.f9782a.addView(imageView);
                    this.f9782a.f16351x.add(imageView);
                    i++;
                }
            } else if (size < this.f9782a.f16337j) {
                for (int i2 = 0; i2 < this.f9782a.f16337j - size; i2++) {
                    this.f9782a.removeView((View) this.f9782a.f16351x.get(0));
                    this.f9782a.f16351x.remove(0);
                }
            }
            this.f9782a.f16337j = size;
            this.f9782a.f16328a.setCurrentItem((this.f9782a.f16337j * 20) + this.f9782a.f16328a.getCurrentItem());
        }

        public final void onInvalidated() {
            super.onInvalidated();
            this.f9782a.m13772a();
        }
    }

    public enum C3161a {
        Visible,
        Invisible
    }

    public enum C3162b {
        Oval,
        Rectangle
    }

    public enum C3163c {
        ;
        
        public static final int f9789a = 1;
        public static final int f9790b = 2;

        static {
            f9791c = new int[]{f9789a, f9790b};
        }
    }

    public PagerIndicator(Context context) {
        this(context, null);
    }

    public PagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16337j = 0;
        this.f16338k = C3161a.Visible;
        this.f16351x = new ArrayList();
        this.f16329b = new C31601(this);
        this.f16330c = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2534a.PagerIndicator, 0, 0);
        int i = obtainStyledAttributes.getInt(21, C3161a.Visible.ordinal());
        for (C3161a c3161a : C3161a.values()) {
            if (c3161a.ordinal() == i) {
                this.f16338k = c3161a;
                break;
            }
        }
        i = obtainStyledAttributes.getInt(12, C3162b.Oval.ordinal());
        C3162b c3162b = C3162b.Oval;
        for (C3162b c3162b2 : C3162b.values()) {
            if (c3162b2.ordinal() == i) {
                c3162b = c3162b2;
                break;
            }
        }
        this.f16334g = obtainStyledAttributes.getResourceId(5, 0);
        this.f16333f = obtainStyledAttributes.getResourceId(14, 0);
        i = obtainStyledAttributes.getColor(4, Color.rgb(255, 255, 255));
        int color = obtainStyledAttributes.getColor(13, Color.argb(80, 0, 0, 0));
        float dimension = obtainStyledAttributes.getDimension(11, (float) ((int) m13760a(6.0f)));
        float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(6, (int) m13760a(6.0f));
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(20, (int) m13760a(6.0f));
        float dimensionPixelSize3 = (float) obtainStyledAttributes.getDimensionPixelSize(15, (int) m13760a(6.0f));
        this.f16340m = new GradientDrawable();
        this.f16339l = new GradientDrawable();
        float dimensionPixelSize4 = (float) obtainStyledAttributes.getDimensionPixelSize(2, (int) m13760a(3.0f));
        float dimensionPixelSize5 = (float) obtainStyledAttributes.getDimensionPixelSize(3, (int) m13760a(0.0f));
        float dimensionPixelSize6 = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) m13760a(0.0f));
        int dimensionPixelSize7 = (int) ((float) obtainStyledAttributes.getDimensionPixelSize(1, (int) m13760a(3.0f)));
        this.f16343p = (float) obtainStyledAttributes.getDimensionPixelSize(8, dimensionPixelSize7);
        int i2 = (int) dimensionPixelSize4;
        this.f16344q = (float) obtainStyledAttributes.getDimensionPixelSize(9, i2);
        int i3 = (int) dimensionPixelSize5;
        this.f16345r = (float) obtainStyledAttributes.getDimensionPixelSize(10, i3);
        int i4 = (int) dimensionPixelSize6;
        this.f16346s = (float) obtainStyledAttributes.getDimensionPixelSize(7, i4);
        this.f16347t = (float) obtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize7);
        this.f16348u = (float) obtainStyledAttributes.getDimensionPixelSize(18, i2);
        this.f16349v = (float) obtainStyledAttributes.getDimensionPixelSize(19, i3);
        this.f16350w = (float) obtainStyledAttributes.getDimensionPixelSize(16, i4);
        this.f16341n = new LayerDrawable(new Drawable[]{this.f16340m});
        this.f16342o = new LayerDrawable(new Drawable[]{this.f16339l});
        int i5 = this.f16334g;
        i2 = this.f16333f;
        this.f16334g = i5;
        this.f16333f = i2;
        this.f16335h = i5 == 0 ? this.f16341n : C0346c.m682a(this.f16330c, this.f16334g);
        this.f16336i = i2 == 0 ? this.f16342o : C0346c.m682a(this.f16330c, this.f16333f);
        m13764b();
        setDefaultIndicatorShape(c3162b);
        i5 = C3163c.f9790b;
        if (this.f16334g == 0) {
            if (i5 == C3163c.f9789a) {
                dimension = m13760a(dimension);
                dimensionPixelSize = m13760a(dimensionPixelSize);
            }
            this.f16340m.setSize((int) dimension, (int) dimensionPixelSize);
            m13764b();
        }
        i5 = C3163c.f9790b;
        if (this.f16333f == 0) {
            if (i5 == C3163c.f9789a) {
                dimensionPixelSize2 = m13760a(dimensionPixelSize2);
                dimensionPixelSize3 = m13760a(dimensionPixelSize3);
            }
            this.f16339l.setSize((int) dimensionPixelSize2, (int) dimensionPixelSize3);
            m13764b();
        }
        if (this.f16334g == 0) {
            this.f16340m.setColor(i);
        }
        if (this.f16333f == 0) {
            this.f16339l.setColor(color);
        }
        m13764b();
        setIndicatorVisibility(this.f16338k);
        obtainStyledAttributes.recycle();
    }

    private float m13760a(float f) {
        return f * getContext().getResources().getDisplayMetrics().density;
    }

    private void m13764b() {
        Iterator it = this.f16351x.iterator();
        while (it.hasNext()) {
            ImageView imageView;
            Drawable drawable;
            View view = (View) it.next();
            if (this.f16331d == null || !this.f16331d.equals(view)) {
                imageView = (ImageView) view;
                drawable = this.f16336i;
            } else {
                imageView = (ImageView) view;
                drawable = this.f16335h;
            }
            imageView.setImageDrawable(drawable);
        }
    }

    private int getShouldDrawCount() {
        return this.f16328a.getAdapter() instanceof C6093b ? ((C6093b) this.f16328a.getAdapter()).f16353a.f16354a.size() : this.f16328a.getAdapter().mo2270b();
    }

    private void setItemAsSelected(int i) {
        if (this.f16331d != null) {
            this.f16331d.setImageDrawable(this.f16336i);
            this.f16331d.setPadding((int) this.f16347t, (int) this.f16349v, (int) this.f16348u, (int) this.f16350w);
        }
        ImageView imageView = (ImageView) getChildAt(i + 1);
        if (imageView != null) {
            imageView.setImageDrawable(this.f16335h);
            imageView.setPadding((int) this.f16343p, (int) this.f16345r, (int) this.f16344q, (int) this.f16346s);
            this.f16331d = imageView;
        }
        this.f16332e = i;
    }

    public final void m13772a() {
        this.f16337j = getShouldDrawCount();
        this.f16331d = null;
        Iterator it = this.f16351x.iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
        for (int i = 0; i < this.f16337j; i++) {
            View imageView = new ImageView(this.f16330c);
            imageView.setImageDrawable(this.f16336i);
            imageView.setPadding((int) this.f16347t, (int) this.f16349v, (int) this.f16348u, (int) this.f16350w);
            addView(imageView);
            this.f16351x.add(imageView);
        }
        setItemAsSelected(this.f16332e);
    }

    public final void mo2266a(int i) {
        if (this.f16337j != 0) {
            setItemAsSelected(i - 1);
        }
    }

    public C3161a getIndicatorVisibility() {
        return this.f16338k;
    }

    public int getSelectedIndicatorResId() {
        return this.f16334g;
    }

    public int getUnSelectedIndicatorResId() {
        return this.f16333f;
    }

    public void setDefaultIndicatorShape(C3162b c3162b) {
        if (this.f16334g == 0) {
            if (c3162b == C3162b.Oval) {
                this.f16340m.setShape(1);
            } else {
                this.f16340m.setShape(0);
            }
        }
        if (this.f16333f == 0) {
            if (c3162b == C3162b.Oval) {
                this.f16339l.setShape(1);
            } else {
                this.f16339l.setShape(0);
            }
        }
        m13764b();
    }

    public void setIndicatorVisibility(C3161a c3161a) {
        setVisibility(c3161a == C3161a.Visible ? 0 : 4);
        m13764b();
    }

    public void setViewPager(ViewPagerEx viewPagerEx) {
        if (viewPagerEx.getAdapter() == null) {
            throw new IllegalStateException("Viewpager does not have adapter instance");
        }
        this.f16328a = viewPagerEx;
        this.f16328a.m7683a((C3178f) this);
        ((C6093b) this.f16328a.getAdapter()).f16353a.m1258a(this.f16329b);
    }
}
