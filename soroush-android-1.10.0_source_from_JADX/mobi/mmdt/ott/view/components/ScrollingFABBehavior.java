package mobi.mmdt.ott.view.components;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0270a;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;
import mobi.mmdt.componentsutils.p232b.C2491i;

public class ScrollingFABBehavior extends C0270a<FloatingActionButton> {
    private int f16211a;

    public ScrollingFABBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16211a = C2491i.m6759a(context);
    }

    public final /* synthetic */ boolean mo160a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
        if (view2 instanceof AppBarLayout) {
            int height = floatingActionButton.getHeight() + ((C0273d) floatingActionButton.getLayoutParams()).bottomMargin;
            floatingActionButton.setTranslationY(((float) (-height)) * (view2.getY() / ((float) this.f16211a)));
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean a_(View view) {
        return view instanceof AppBarLayout;
    }
}
