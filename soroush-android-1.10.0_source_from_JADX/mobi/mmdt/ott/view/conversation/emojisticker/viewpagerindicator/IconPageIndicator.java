package mobi.mmdt.ott.view.conversation.emojisticker.viewpagerindicator;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.C0523f;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p085c.p086a.C1212c;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;

public class IconPageIndicator extends HorizontalScrollView implements C6212e {
    private final LinearLayout f19678a;
    private ViewPager f19679b;
    private C0523f f19680c;
    private Runnable f19681d;
    private int f19682e;
    private int f19683f;
    private C4045a f19684g;
    private LayoutInflater f19685h;

    public interface C4045a {
    }

    public IconPageIndicator(Context context) {
        this(context, null);
    }

    public IconPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        this.f19685h = LayoutInflater.from(getContext());
        this.f19678a = new LinearLayout(context);
        addView(this.f19678a, new LayoutParams(-1, -1, 3));
        int i = context.getResources().getConfiguration().orientation;
        this.f19683f = C2489g.m6754a().m6755a(0.125f);
    }

    public final void mo3233a() {
        this.f19678a.removeAllViews();
        C4047d c4047d = (C4047d) this.f19679b.getAdapter();
        int b = c4047d.mo2270b();
        for (int i = 0; i < b; i++) {
            final C4046a a = c4047d.mo2363a(i);
            View inflate = this.f19685h.inflate(R.layout.stickers_indicator_item, null, false);
            View findViewById = inflate.findViewById(R.id.indicator_line);
            C2491i.m6796a(findViewById, UIThemeManager.getmInstance().getAccent_color());
            ImageView imageView = (ImageButton) inflate.findViewById(R.id.imageButton1);
            findViewById.getLayoutParams().width = this.f19683f;
            imageView.getLayoutParams().width = this.f19683f;
            if (a.f11608a == 1) {
                imageView.setImageResource(((C6210b) a).f16800c);
            } else {
                C1212c.m2875b(getContext()).m10950a(((C6211c) a).f16802c).m3033a().m3031a(imageView);
            }
            imageView.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ IconPageIndicator f11605b;

                public final void onClick(View view) {
                    this.f11605b.setCurrentItem(a.f11609b);
                }
            });
            imageView.setOnLongClickListener(new OnLongClickListener(this) {
                final /* synthetic */ IconPageIndicator f11607b;

                public final boolean onLongClick(View view) {
                    return false;
                }
            });
            this.f19678a.addView(inflate);
        }
        if (this.f19682e > b) {
            this.f19682e = b - 1;
        }
        setCurrentItem(this.f19682e);
        requestLayout();
    }

    public final void mo173a(int i) {
        if (this.f19680c != null) {
            this.f19680c.mo173a(i);
        }
    }

    public final void mo174a(int i, float f, int i2) {
        if (this.f19680c != null) {
            this.f19680c.mo174a(i, f, i2);
        }
    }

    public final void mo175b(int i) {
        setCurrentItem(i);
        if (this.f19680c != null) {
            this.f19680c.mo175b(i);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19681d != null) {
            post(this.f19681d);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f19681d != null) {
            removeCallbacks(this.f19681d);
        }
    }

    public void setCurrentItem(int i) {
        if (this.f19679b == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f19682e = i;
        this.f19679b.setCurrentItem(i);
        int childCount = this.f19678a.getChildCount();
        C4047d c4047d = (C4047d) this.f19679b.getAdapter();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f19678a.getChildAt(i2);
            C4046a a = c4047d.mo2363a(i2);
            View findViewById = childAt.findViewById(R.id.indicator_line);
            ImageView imageView = (ImageButton) childAt.findViewById(R.id.imageButton1);
            int i3 = 1;
            if (i2 == i) {
                findViewById.setVisibility(0);
                if (a.f11608a == 1) {
                    imageView.setImageResource(((C6210b) a).f16801d);
                    C2491i.m6801a(imageView, UIThemeManager.getmInstance().getAccent_color());
                } else {
                    C1212c.m2875b(getContext()).m10950a(((C6211c) a).f16803d).m3033a().m3031a(imageView);
                }
            } else {
                findViewById.setVisibility(8);
                if (a.f11608a == 1) {
                    imageView.setImageResource(((C6210b) a).f16800c);
                    C2491i.m6801a(imageView, (int) UIThemeManager.disable_color);
                } else {
                    C1212c.m2875b(getContext()).m10950a(((C6211c) a).f16802c).m3033a().m3031a(imageView);
                }
                i3 = 0;
            }
            if (i3 != 0) {
                childAt = this.f19678a.getChildAt(i);
                if (this.f19681d != null) {
                    removeCallbacks(this.f19681d);
                }
                this.f19681d = new Runnable(this) {
                    final /* synthetic */ IconPageIndicator f11603b;

                    public final void run() {
                        this.f11603b.smoothScrollTo(childAt.getLeft() - ((this.f11603b.getWidth() - childAt.getWidth()) / 2), 0);
                        this.f11603b.f19681d = null;
                    }
                };
                post(this.f19681d);
            }
        }
    }

    public void setIconPageIndicatorListener(C4045a c4045a) {
        this.f19684g = c4045a;
    }

    public void setOnPageChangeListener(C0523f c0523f) {
        this.f19680c = c0523f;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f19679b != viewPager) {
            if (this.f19679b != null) {
                this.f19679b.m1155a((C0523f) this);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f19679b = viewPager;
            viewPager.m1155a((C0523f) this);
            mo3233a();
        }
    }
}
