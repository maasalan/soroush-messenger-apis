package jp.wasabeef.recyclerview.animators.adapters;

import android.animation.Animator;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import jp.wasabeef.recyclerview.animators.internal.ViewHelper;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public abstract class AnimationAdapter extends Adapter<ViewHolder> {
    private boolean isFirstOnly = true;
    private Adapter<ViewHolder> mAdapter;
    private int mDuration = IjkMediaCodecInfo.RANK_SECURE;
    private Interpolator mInterpolator = new LinearInterpolator();
    private int mLastPosition = -1;

    public AnimationAdapter(Adapter<ViewHolder> adapter) {
        this.mAdapter = adapter;
    }

    protected abstract Animator[] getAnimators(View view);

    public int getItemCount() {
        return this.mAdapter.getItemCount();
    }

    public int getItemViewType(int i) {
        return this.mAdapter.getItemViewType(i);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        this.mAdapter.onBindViewHolder(viewHolder, i);
        if (this.isFirstOnly) {
            if (i <= this.mLastPosition) {
                ViewHelper.clear(viewHolder.itemView);
                return;
            }
        }
        for (Animator animator : getAnimators(viewHolder.itemView)) {
            animator.setDuration((long) this.mDuration).start();
            animator.setInterpolator(this.mInterpolator);
        }
        this.mLastPosition = i;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.mAdapter.onCreateViewHolder(viewGroup, i);
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    public void setFirstOnly(boolean z) {
        this.isFirstOnly = z;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public void setStartPosition(int i) {
        this.mLastPosition = i;
    }
}
