package mobi.mmdt.ott.view.vas.weather.p536b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.State;
import android.view.View;
import mobi.mmdt.ott.R;

public final class C6292a extends ItemDecoration {
    private Drawable f17206a;

    public C6292a(Context context) {
        this.f17206a = context.getResources().getDrawable(R.drawable.weather_city_line_divider);
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, State state) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f17206a.setBounds(paddingLeft, bottom, width, this.f17206a.getIntrinsicHeight() + bottom);
            this.f17206a.draw(canvas);
        }
    }
}
