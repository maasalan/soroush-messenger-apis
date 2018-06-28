package jp.wasabeef.recyclerview.animators.adapters;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.View;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class ScaleInAnimationAdapter extends AnimationAdapter {
    private static final float DEFAULT_SCALE_FROM = 0.5f;
    private final float mFrom;

    public ScaleInAnimationAdapter(Adapter adapter) {
        this(adapter, DEFAULT_SCALE_FROM);
    }

    public ScaleInAnimationAdapter(Adapter adapter, float f) {
        super(adapter);
        this.mFrom = f;
    }

    protected Animator[] getAnimators(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.mFrom, BallPulseIndicator.SCALE});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.mFrom, BallPulseIndicator.SCALE});
        return new ObjectAnimator[]{ofFloat, ofFloat2};
    }
}
