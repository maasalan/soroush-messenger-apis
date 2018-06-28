package jp.wasabeef.recyclerview.animators.adapters;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.View;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class AlphaInAnimationAdapter extends AnimationAdapter {
    private static final float DEFAULT_ALPHA_FROM = 0.0f;
    private final float mFrom;

    public AlphaInAnimationAdapter(Adapter adapter) {
        this(adapter, 0.0f);
    }

    public AlphaInAnimationAdapter(Adapter adapter, float f) {
        super(adapter);
        this.mFrom = f;
    }

    protected Animator[] getAnimators(View view) {
        Animator[] animatorArr = new Animator[1];
        animatorArr[0] = ObjectAnimator.ofFloat(view, "alpha", new float[]{this.mFrom, BallPulseIndicator.SCALE});
        return animatorArr;
    }
}
