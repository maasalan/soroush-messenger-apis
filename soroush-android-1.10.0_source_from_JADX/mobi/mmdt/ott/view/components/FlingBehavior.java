package mobi.mmdt.ott.view.components;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.Behavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

public final class FlingBehavior extends Behavior {
    private boolean f21090b;

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final /* synthetic */ boolean mo3571a(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        if ((f2 > 0.0f && !this.f21090b) || (f2 < 0.0f && this.f21090b)) {
            f2 *= -1.0f;
        }
        float f3 = f2;
        if ((view2 instanceof RecyclerView) && f3 < 0.0f) {
            RecyclerView recyclerView = (RecyclerView) view2;
            z = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0)) > 3;
        }
        return super.mo3571a(coordinatorLayout, (View) appBarLayout, view2, f, f3, z);
    }
}
