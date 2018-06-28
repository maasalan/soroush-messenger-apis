package mobi.mmdt.ott.view.tools.NonSwipeableViewPager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NonSwipeableViewPager extends ViewPager {
    private boolean f17131f = true;

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f17131f && super.onInterceptTouchEvent(motionEvent);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f17131f && super.onTouchEvent(motionEvent);
    }

    public void setPagingEnabled(boolean z) {
        this.f17131f = z;
    }
}
