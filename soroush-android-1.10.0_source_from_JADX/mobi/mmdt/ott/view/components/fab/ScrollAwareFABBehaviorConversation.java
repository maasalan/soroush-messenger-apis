package mobi.mmdt.ott.view.components.fab;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.FloatingActionButton.Behavior;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

public class ScrollAwareFABBehaviorConversation extends Behavior {
    public ScrollAwareFABBehaviorConversation(Context context, AttributeSet attributeSet) {
    }

    public final /* synthetic */ void mo3183a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        view = (FloatingActionButton) view;
        super.mo3183a(coordinatorLayout, view, view2, i, i2, i3, i4);
        if (i2 >= 0 || view.getVisibility() != 0) {
            if (i2 > 0 && view.getVisibility() != 0) {
                view.m8764a(null, true);
            }
            return;
        }
        view.m8766b(null, true);
    }

    public final /* bridge */ /* synthetic */ boolean mo151a(int i) {
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean a_(View view) {
        return view instanceof RecyclerView;
    }
}
