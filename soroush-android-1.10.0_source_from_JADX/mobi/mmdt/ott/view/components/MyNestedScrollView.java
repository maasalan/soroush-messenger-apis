package mobi.mmdt.ott.view.components;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.C0589b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class MyNestedScrollView extends NestedScrollView {
    private int f20635a;
    private C0589b f20636b = new C60571(this);
    private C3092a f20637c;

    public interface C3092a {
        void mo2378a();

        void mo2379b();
    }

    class C60571 implements C0589b {
        final /* synthetic */ MyNestedScrollView f16210a;

        C60571(MyNestedScrollView myNestedScrollView) {
            this.f16210a = myNestedScrollView;
        }

        public final void mo440a(NestedScrollView nestedScrollView, int i) {
            if (i == 0 && this.f16210a.f20637c != null) {
                this.f16210a.f20637c.mo2378a();
            }
            if (i == nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight() && this.f16210a.f20637c != null) {
                this.f16210a.f20637c.mo2379b();
            }
        }
    }

    public MyNestedScrollView(Context context) {
        super(context);
        m18963a(context);
    }

    public MyNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18963a(context);
    }

    public MyNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18963a(context);
    }

    private void m18963a(Context context) {
        this.f20635a = ViewConfiguration.get(context).getScaledEdgeSlop();
        setOnScrollChangeListener(this.f20636b);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public void setOnScrollChangedListener(C3092a c3092a) {
        this.f20637c = c3092a;
    }
}
