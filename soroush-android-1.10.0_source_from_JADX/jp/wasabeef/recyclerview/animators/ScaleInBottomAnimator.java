package jp.wasabeef.recyclerview.animators;

import android.support.v4.view.C0571r;
import android.support.v7.widget.RecyclerView.ViewHolder;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ScaleInBottomAnimator extends BaseItemAnimator {
    protected void animateAddImpl(ViewHolder viewHolder) {
        C0571r.m1380q(viewHolder.itemView).m1421f(BallPulseIndicator.SCALE).m1422g(BallPulseIndicator.SCALE).m1411a(getAddDuration()).m1412a(new DefaultAddVpaListener(viewHolder)).m1417b();
    }

    protected void animateRemoveImpl(ViewHolder viewHolder) {
        C0571r.m1380q(viewHolder.itemView).m1421f(0.0f).m1422g(0.0f).m1411a(getRemoveDuration()).m1412a(new DefaultRemoveVpaListener(viewHolder)).m1417b();
    }

    protected void preAnimateAddImpl(ViewHolder viewHolder) {
        viewHolder.itemView.setPivotY((float) viewHolder.itemView.getHeight());
        C0571r.m1365f(viewHolder.itemView, 0.0f);
        C0571r.m1368g(viewHolder.itemView, 0.0f);
    }

    protected void preAnimateRemoveImpl(ViewHolder viewHolder) {
        viewHolder.itemView.setPivotY((float) viewHolder.itemView.getHeight());
    }
}
