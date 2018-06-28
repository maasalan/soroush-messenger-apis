package jp.wasabeef.recyclerview.animators.holder;

import android.support.v4.view.C0580w;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;

public abstract class AnimateViewHolder extends ViewHolder {
    public AnimateViewHolder(View view) {
        super(view);
    }

    public abstract void animateAddImpl(C0580w c0580w);

    public abstract void animateRemoveImpl(C0580w c0580w);

    public void preAnimateAddImpl() {
    }

    public void preAnimateRemoveImpl() {
    }
}
