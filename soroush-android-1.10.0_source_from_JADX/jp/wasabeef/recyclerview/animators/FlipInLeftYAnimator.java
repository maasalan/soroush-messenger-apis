package jp.wasabeef.recyclerview.animators;

import android.support.v4.view.C0571r;
import android.support.v7.widget.RecyclerView.ViewHolder;

public class FlipInLeftYAnimator extends BaseItemAnimator {
    protected void animateAddImpl(ViewHolder viewHolder) {
        C0571r.m1380q(viewHolder.itemView).m1420e(0.0f).m1411a(getAddDuration()).m1412a(new DefaultAddVpaListener(viewHolder)).m1417b();
    }

    protected void animateRemoveImpl(ViewHolder viewHolder) {
        C0571r.m1380q(viewHolder.itemView).m1420e(90.0f).m1411a(getRemoveDuration()).m1412a(new DefaultRemoveVpaListener(viewHolder)).m1417b();
    }

    protected void preAnimateAddImpl(ViewHolder viewHolder) {
        C0571r.m1362e(viewHolder.itemView, 90.0f);
    }
}
