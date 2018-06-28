package jp.wasabeef.recyclerview.animators;

import android.support.v4.view.C0571r;
import android.support.v4.view.C0579v;
import android.support.v4.view.C0580w;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.wasabeef.recyclerview.animators.holder.AnimateViewHolder;
import jp.wasabeef.recyclerview.animators.internal.ViewHelper;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public abstract class BaseItemAnimator extends ItemAnimator {
    private static final boolean DEBUG = false;
    protected ArrayList<ViewHolder> mAddAnimations = new ArrayList();
    private ArrayList<ArrayList<ViewHolder>> mAdditionsList = new ArrayList();
    private ArrayList<ViewHolder> mChangeAnimations = new ArrayList();
    private ArrayList<ArrayList<ChangeInfo>> mChangesList = new ArrayList();
    private ArrayList<ViewHolder> mMoveAnimations = new ArrayList();
    private ArrayList<ArrayList<MoveInfo>> mMovesList = new ArrayList();
    private ArrayList<ViewHolder> mPendingAdditions = new ArrayList();
    private ArrayList<ChangeInfo> mPendingChanges = new ArrayList();
    private ArrayList<MoveInfo> mPendingMoves = new ArrayList();
    private ArrayList<ViewHolder> mPendingRemovals = new ArrayList();
    protected ArrayList<ViewHolder> mRemoveAnimations = new ArrayList();

    private static class ChangeInfo {
        public int fromX;
        public int fromY;
        public ViewHolder newHolder;
        public ViewHolder oldHolder;
        public int toX;
        public int toY;

        private ChangeInfo(ViewHolder viewHolder, ViewHolder viewHolder2) {
            this.oldHolder = viewHolder;
            this.newHolder = viewHolder2;
        }

        private ChangeInfo(ViewHolder viewHolder, ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.fromX = i;
            this.fromY = i2;
            this.toX = i3;
            this.toY = i4;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("ChangeInfo{oldHolder=");
            stringBuilder.append(this.oldHolder);
            stringBuilder.append(", newHolder=");
            stringBuilder.append(this.newHolder);
            stringBuilder.append(", fromX=");
            stringBuilder.append(this.fromX);
            stringBuilder.append(", fromY=");
            stringBuilder.append(this.fromY);
            stringBuilder.append(", toX=");
            stringBuilder.append(this.toX);
            stringBuilder.append(", toY=");
            stringBuilder.append(this.toY);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    private static class MoveInfo {
        public int fromX;
        public int fromY;
        public ViewHolder holder;
        public int toX;
        public int toY;

        private MoveInfo(ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.holder = viewHolder;
            this.fromX = i;
            this.fromY = i2;
            this.toX = i3;
            this.toY = i4;
        }
    }

    private static class VpaListenerAdapter implements C0580w {
        private VpaListenerAdapter() {
        }

        public void onAnimationCancel(View view) {
        }

        public void onAnimationEnd(View view) {
        }

        public void onAnimationStart(View view) {
        }
    }

    protected class DefaultAddVpaListener extends VpaListenerAdapter {
        ViewHolder mViewHolder;

        public DefaultAddVpaListener(ViewHolder viewHolder) {
            super();
            this.mViewHolder = viewHolder;
        }

        public void onAnimationCancel(View view) {
            ViewHelper.clear(view);
        }

        public void onAnimationEnd(View view) {
            ViewHelper.clear(view);
            BaseItemAnimator.this.dispatchAddFinished(this.mViewHolder);
            BaseItemAnimator.this.mAddAnimations.remove(this.mViewHolder);
            BaseItemAnimator.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(View view) {
            BaseItemAnimator.this.dispatchAddStarting(this.mViewHolder);
        }
    }

    protected class DefaultRemoveVpaListener extends VpaListenerAdapter {
        ViewHolder mViewHolder;

        public DefaultRemoveVpaListener(ViewHolder viewHolder) {
            super();
            this.mViewHolder = viewHolder;
        }

        public void onAnimationCancel(View view) {
            ViewHelper.clear(view);
        }

        public void onAnimationEnd(View view) {
            ViewHelper.clear(view);
            BaseItemAnimator.this.dispatchRemoveFinished(this.mViewHolder);
            BaseItemAnimator.this.mRemoveAnimations.remove(this.mViewHolder);
            BaseItemAnimator.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(View view) {
            BaseItemAnimator.this.dispatchRemoveStarting(this.mViewHolder);
        }
    }

    private void animateChangeImpl(final ChangeInfo changeInfo) {
        ViewHolder viewHolder = changeInfo.oldHolder;
        View view = null;
        View view2 = viewHolder == null ? null : viewHolder.itemView;
        ViewHolder viewHolder2 = changeInfo.newHolder;
        if (viewHolder2 != null) {
            view = viewHolder2.itemView;
        }
        if (view2 != null) {
            this.mChangeAnimations.add(changeInfo.oldHolder);
            final C0579v a = C0571r.m1380q(view2).m1411a(getChangeDuration());
            a.m1416b((float) (changeInfo.toX - changeInfo.fromX));
            a.m1418c((float) (changeInfo.toY - changeInfo.fromY));
            a.m1410a(0.0f).m1412a(new VpaListenerAdapter() {
                public void onAnimationEnd(View view) {
                    a.m1412a(null);
                    C0571r.m1355c(view, (float) BallPulseIndicator.SCALE);
                    C0571r.m1333a(view, 0.0f);
                    C0571r.m1351b(view, 0.0f);
                    BaseItemAnimator.this.dispatchChangeFinished(changeInfo.oldHolder, true);
                    BaseItemAnimator.this.mChangeAnimations.remove(changeInfo.oldHolder);
                    BaseItemAnimator.this.dispatchFinishedWhenDone();
                }

                public void onAnimationStart(View view) {
                    BaseItemAnimator.this.dispatchChangeStarting(changeInfo.oldHolder, true);
                }
            }).m1417b();
        }
        if (view != null) {
            this.mChangeAnimations.add(changeInfo.newHolder);
            a = C0571r.m1380q(view);
            a.m1416b(0.0f).m1418c(0.0f).m1411a(getChangeDuration()).m1410a((float) BallPulseIndicator.SCALE).m1412a(new VpaListenerAdapter() {
                public void onAnimationEnd(View view) {
                    a.m1412a(null);
                    C0571r.m1355c(view, (float) BallPulseIndicator.SCALE);
                    C0571r.m1333a(view, 0.0f);
                    C0571r.m1351b(view, 0.0f);
                    BaseItemAnimator.this.dispatchChangeFinished(changeInfo.newHolder, false);
                    BaseItemAnimator.this.mChangeAnimations.remove(changeInfo.newHolder);
                    BaseItemAnimator.this.dispatchFinishedWhenDone();
                }

                public void onAnimationStart(View view) {
                    BaseItemAnimator.this.dispatchChangeStarting(changeInfo.newHolder, false);
                }
            }).m1417b();
        }
    }

    private void animateMoveImpl(ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            C0571r.m1380q(view).m1416b(0.0f);
        }
        if (i6 != 0) {
            C0571r.m1380q(view).m1418c(0.0f);
        }
        this.mMoveAnimations.add(viewHolder);
        final C0579v q = C0571r.m1380q(view);
        final ViewHolder viewHolder2 = viewHolder;
        q.m1411a(getMoveDuration()).m1412a(new VpaListenerAdapter() {
            public void onAnimationCancel(View view) {
                if (i5 != 0) {
                    C0571r.m1333a(view, 0.0f);
                }
                if (i6 != 0) {
                    C0571r.m1351b(view, 0.0f);
                }
            }

            public void onAnimationEnd(View view) {
                q.m1412a(null);
                BaseItemAnimator.this.dispatchMoveFinished(viewHolder2);
                BaseItemAnimator.this.mMoveAnimations.remove(viewHolder2);
                BaseItemAnimator.this.dispatchFinishedWhenDone();
            }

            public void onAnimationStart(View view) {
                BaseItemAnimator.this.dispatchMoveStarting(viewHolder2);
            }
        }).m1417b();
    }

    private void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    private void doAnimateAdd(ViewHolder viewHolder) {
        if (viewHolder instanceof AnimateViewHolder) {
            ((AnimateViewHolder) viewHolder).animateAddImpl(new DefaultAddVpaListener(viewHolder));
        } else {
            animateAddImpl(viewHolder);
        }
        this.mAddAnimations.add(viewHolder);
    }

    private void doAnimateRemove(ViewHolder viewHolder) {
        if (viewHolder instanceof AnimateViewHolder) {
            ((AnimateViewHolder) viewHolder).animateRemoveImpl(new DefaultRemoveVpaListener(viewHolder));
        } else {
            animateRemoveImpl(viewHolder);
        }
        this.mRemoveAnimations.add(viewHolder);
    }

    private void endChangeAnimation(List<ChangeInfo> list, ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ChangeInfo changeInfo = (ChangeInfo) list.get(size);
            if (endChangeAnimationIfNecessary(changeInfo, viewHolder) && changeInfo.oldHolder == null && changeInfo.newHolder == null) {
                list.remove(changeInfo);
            }
        }
    }

    private void endChangeAnimationIfNecessary(ChangeInfo changeInfo) {
        if (changeInfo.oldHolder != null) {
            endChangeAnimationIfNecessary(changeInfo, changeInfo.oldHolder);
        }
        if (changeInfo.newHolder != null) {
            endChangeAnimationIfNecessary(changeInfo, changeInfo.newHolder);
        }
    }

    private boolean endChangeAnimationIfNecessary(ChangeInfo changeInfo, ViewHolder viewHolder) {
        boolean z = false;
        if (changeInfo.newHolder == viewHolder) {
            changeInfo.newHolder = null;
        } else if (changeInfo.oldHolder != viewHolder) {
            return false;
        } else {
            changeInfo.oldHolder = null;
            z = true;
        }
        C0571r.m1355c(viewHolder.itemView, (float) BallPulseIndicator.SCALE);
        C0571r.m1333a(viewHolder.itemView, 0.0f);
        C0571r.m1351b(viewHolder.itemView, 0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    private void preAnimateAdd(ViewHolder viewHolder) {
        ViewHelper.clear(viewHolder.itemView);
        if (viewHolder instanceof AnimateViewHolder) {
            ((AnimateViewHolder) viewHolder).preAnimateAddImpl();
        } else {
            preAnimateAddImpl(viewHolder);
        }
    }

    private void preAnimateRemove(ViewHolder viewHolder) {
        ViewHelper.clear(viewHolder.itemView);
        if (viewHolder instanceof AnimateViewHolder) {
            ((AnimateViewHolder) viewHolder).preAnimateRemoveImpl();
        } else {
            preAnimateRemoveImpl(viewHolder);
        }
    }

    public boolean animateAdd(ViewHolder viewHolder) {
        endAnimation(viewHolder);
        preAnimateAdd(viewHolder);
        this.mPendingAdditions.add(viewHolder);
        return true;
    }

    protected abstract void animateAddImpl(ViewHolder viewHolder);

    public boolean animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        ViewHolder viewHolder3 = viewHolder;
        ViewHolder viewHolder4 = viewHolder2;
        float m = C0571r.m1376m(viewHolder3.itemView);
        float n = C0571r.m1377n(viewHolder3.itemView);
        float g = C0571r.m1367g(viewHolder3.itemView);
        endAnimation(viewHolder3);
        int i5 = (int) (((float) (i3 - i)) - m);
        int i6 = (int) (((float) (i4 - i2)) - n);
        C0571r.m1333a(viewHolder3.itemView, m);
        C0571r.m1351b(viewHolder3.itemView, n);
        C0571r.m1355c(viewHolder3.itemView, g);
        if (!(viewHolder4 == null || viewHolder4.itemView == null)) {
            endAnimation(viewHolder4);
            C0571r.m1333a(viewHolder4.itemView, (float) (-i5));
            C0571r.m1351b(viewHolder4.itemView, (float) (-i6));
            C0571r.m1355c(viewHolder4.itemView, 0.0f);
        }
        r0.mPendingChanges.add(new ChangeInfo(viewHolder3, viewHolder4, i, i2, i3, i4));
        return true;
    }

    public boolean animateMove(ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int m = (int) (((float) i) + C0571r.m1376m(viewHolder.itemView));
        int n = (int) (((float) i2) + C0571r.m1377n(viewHolder.itemView));
        endAnimation(viewHolder);
        i = i3 - m;
        i2 = i4 - n;
        if (i == 0 && i2 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i != 0) {
            C0571r.m1333a(view, (float) (-i));
        }
        if (i2 != 0) {
            C0571r.m1351b(view, (float) (-i2));
        }
        this.mPendingMoves.add(new MoveInfo(viewHolder, m, n, i3, i4));
        return true;
    }

    public boolean animateRemove(ViewHolder viewHolder) {
        endAnimation(viewHolder);
        preAnimateRemove(viewHolder);
        this.mPendingRemovals.add(viewHolder);
        return true;
    }

    protected abstract void animateRemoveImpl(ViewHolder viewHolder);

    void cancelAll(List<ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0571r.m1380q(((ViewHolder) list.get(size)).itemView).m1415a();
        }
    }

    public void endAnimation(ViewHolder viewHolder) {
        int size;
        View view = viewHolder.itemView;
        C0571r.m1380q(view).m1415a();
        for (size = this.mPendingMoves.size() - 1; size >= 0; size--) {
            if (((MoveInfo) this.mPendingMoves.get(size)).holder == viewHolder) {
                C0571r.m1351b(view, 0.0f);
                C0571r.m1333a(view, 0.0f);
                dispatchMoveFinished(viewHolder);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, viewHolder);
        if (this.mPendingRemovals.remove(viewHolder)) {
            ViewHelper.clear(viewHolder.itemView);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.mPendingAdditions.remove(viewHolder)) {
            ViewHelper.clear(viewHolder.itemView);
            dispatchAddFinished(viewHolder);
        }
        for (size = this.mChangesList.size() - 1; size >= 0; size--) {
            ArrayList arrayList = (ArrayList) this.mChangesList.get(size);
            endChangeAnimation(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size);
            }
        }
        for (size = this.mMovesList.size() - 1; size >= 0; size--) {
            arrayList = (ArrayList) this.mMovesList.get(size);
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                if (((MoveInfo) arrayList.get(size2)).holder == viewHolder) {
                    C0571r.m1351b(view, 0.0f);
                    C0571r.m1333a(view, 0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList.remove(size2);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(size);
                    }
                } else {
                    size2--;
                }
            }
        }
        for (int size3 = this.mAdditionsList.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.mAdditionsList.get(size3);
            if (arrayList2.remove(viewHolder)) {
                ViewHelper.clear(viewHolder.itemView);
                dispatchAddFinished(viewHolder);
                if (arrayList2.isEmpty()) {
                    this.mAdditionsList.remove(size3);
                }
            }
        }
        this.mRemoveAnimations.remove(viewHolder);
        this.mAddAnimations.remove(viewHolder);
        this.mChangeAnimations.remove(viewHolder);
        this.mMoveAnimations.remove(viewHolder);
        dispatchFinishedWhenDone();
    }

    public void endAnimations() {
        int size;
        for (size = this.mPendingMoves.size() - 1; size >= 0; size--) {
            MoveInfo moveInfo = (MoveInfo) this.mPendingMoves.get(size);
            View view = moveInfo.holder.itemView;
            C0571r.m1351b(view, 0.0f);
            C0571r.m1333a(view, 0.0f);
            dispatchMoveFinished(moveInfo.holder);
            this.mPendingMoves.remove(size);
        }
        for (size = this.mPendingRemovals.size() - 1; size >= 0; size--) {
            dispatchRemoveFinished((ViewHolder) this.mPendingRemovals.get(size));
            this.mPendingRemovals.remove(size);
        }
        for (size = this.mPendingAdditions.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) this.mPendingAdditions.get(size);
            ViewHelper.clear(viewHolder.itemView);
            dispatchAddFinished(viewHolder);
            this.mPendingAdditions.remove(size);
        }
        for (size = this.mPendingChanges.size() - 1; size >= 0; size--) {
            endChangeAnimationIfNecessary((ChangeInfo) this.mPendingChanges.get(size));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            ArrayList arrayList;
            int size2;
            for (size = this.mMovesList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = (ArrayList) this.mMovesList.get(size);
                for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                    MoveInfo moveInfo2 = (MoveInfo) arrayList2.get(size3);
                    View view2 = moveInfo2.holder.itemView;
                    C0571r.m1351b(view2, 0.0f);
                    C0571r.m1333a(view2, 0.0f);
                    dispatchMoveFinished(moveInfo2.holder);
                    arrayList2.remove(size3);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(arrayList2);
                    }
                }
            }
            for (size = this.mAdditionsList.size() - 1; size >= 0; size--) {
                arrayList = (ArrayList) this.mAdditionsList.get(size);
                for (size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ViewHolder viewHolder2 = (ViewHolder) arrayList.get(size2);
                    C0571r.m1355c(viewHolder2.itemView, (float) BallPulseIndicator.SCALE);
                    dispatchAddFinished(viewHolder2);
                    arrayList.remove(size2);
                    if (arrayList.isEmpty()) {
                        this.mAdditionsList.remove(arrayList);
                    }
                }
            }
            for (size = this.mChangesList.size() - 1; size >= 0; size--) {
                arrayList = (ArrayList) this.mChangesList.get(size);
                for (size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    endChangeAnimationIfNecessary((ChangeInfo) arrayList.get(size2));
                    if (arrayList.isEmpty()) {
                        this.mChangesList.remove(arrayList);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    public boolean isRunning() {
        if (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty()) {
            if (this.mChangesList.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    protected void preAnimateAddImpl(ViewHolder viewHolder) {
    }

    protected void preAnimateRemoveImpl(ViewHolder viewHolder) {
    }

    public void runPendingAnimations() {
        int isEmpty = this.mPendingRemovals.isEmpty() ^ 1;
        int isEmpty2 = this.mPendingMoves.isEmpty() ^ 1;
        int isEmpty3 = this.mPendingChanges.isEmpty() ^ 1;
        int isEmpty4 = this.mPendingAdditions.isEmpty() ^ 1;
        if (isEmpty != 0 || isEmpty2 != 0 || isEmpty4 != 0 || isEmpty3 != 0) {
            final ArrayList arrayList;
            Runnable c24021;
            Iterator it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                doAnimateRemove((ViewHolder) it.next());
            }
            this.mPendingRemovals.clear();
            if (isEmpty2 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                c24021 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            MoveInfo moveInfo = (MoveInfo) it.next();
                            BaseItemAnimator.this.animateMoveImpl(moveInfo.holder, moveInfo.fromX, moveInfo.fromY, moveInfo.toX, moveInfo.toY);
                        }
                        arrayList.clear();
                        BaseItemAnimator.this.mMovesList.remove(arrayList);
                    }
                };
                if (isEmpty != 0) {
                    C0571r.m1344a(((MoveInfo) arrayList.get(0)).holder.itemView, c24021, getRemoveDuration());
                } else {
                    c24021.run();
                }
            }
            if (isEmpty3 != 0) {
                arrayList = new ArrayList();
                arrayList.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList);
                this.mPendingChanges.clear();
                c24021 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            BaseItemAnimator.this.animateChangeImpl((ChangeInfo) it.next());
                        }
                        arrayList.clear();
                        BaseItemAnimator.this.mChangesList.remove(arrayList);
                    }
                };
                if (isEmpty != 0) {
                    C0571r.m1344a(((ChangeInfo) arrayList.get(0)).oldHolder.itemView, c24021, getRemoveDuration());
                } else {
                    c24021.run();
                }
            }
            if (isEmpty4 != 0) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList2);
                this.mPendingAdditions.clear();
                Runnable c24043 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            BaseItemAnimator.this.doAnimateAdd((ViewHolder) it.next());
                        }
                        arrayList2.clear();
                        BaseItemAnimator.this.mAdditionsList.remove(arrayList2);
                    }
                };
                if (isEmpty == 0 && isEmpty2 == 0) {
                    if (isEmpty3 == 0) {
                        c24043.run();
                        return;
                    }
                }
                long j = 0;
                long removeDuration = isEmpty != 0 ? getRemoveDuration() : 0;
                long moveDuration = isEmpty2 != 0 ? getMoveDuration() : 0;
                if (isEmpty3 != 0) {
                    j = getChangeDuration();
                }
                C0571r.m1344a(((ViewHolder) arrayList2.get(0)).itemView, c24043, removeDuration + Math.max(moveDuration, j));
            }
        }
    }
}
