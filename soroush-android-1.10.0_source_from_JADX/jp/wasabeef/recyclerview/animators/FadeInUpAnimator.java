package jp.wasabeef.recyclerview.animators;

import android.support.v4.view.C0571r;
import android.support.v7.widget.RecyclerView.ViewHolder;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class FadeInUpAnimator extends BaseItemAnimator {
    protected void animateAddImpl(ViewHolder viewHolder) {
        C0571r.m1380q(viewHolder.itemView).m1418c(0.0f).m1410a((float) BallPulseIndicator.SCALE).m1411a(getAddDuration()).m1412a(new DefaultAddVpaListener(viewHolder)).m1417b();
    }

    protected void animateRemoveImpl(ViewHolder viewHolder) {
        C0571r.m1380q(viewHolder.itemView).m1418c(((float) viewHolder.itemView.getHeight()) * 0.25f).m1410a(0.0f).m1411a(getRemoveDuration()).m1412a(new DefaultRemoveVpaListener(viewHolder)).m1417b();
    }

    protected void preAnimateAddImpl(ViewHolder viewHolder) {
        C0571r.m1351b(viewHolder.itemView, ((float) viewHolder.itemView.getHeight()) * 0.25f);
        C0571r.m1355c(viewHolder.itemView, 0.0f);
    }
}
