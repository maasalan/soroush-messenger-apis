package android.support.v7.widget;

import android.support.v4.p038g.C0468f;
import android.support.v4.p038g.C0480k.C0479a;
import android.support.v4.p038g.C0480k.C4816b;
import android.support.v4.p038g.C4813a;
import android.support.v7.widget.RecyclerView.ItemAnimator.ItemHolderInfo;
import android.support.v7.widget.RecyclerView.ViewHolder;

class ViewInfoStore {
    private static final boolean DEBUG = false;
    final C4813a<ViewHolder, InfoRecord> mLayoutHolderMap = new C4813a();
    final C0468f<ViewHolder> mOldChangedHolders = new C0468f();

    static class InfoRecord {
        static final int FLAG_APPEAR = 2;
        static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        static final int FLAG_APPEAR_PRE_AND_POST = 14;
        static final int FLAG_DISAPPEARED = 1;
        static final int FLAG_POST = 8;
        static final int FLAG_PRE = 4;
        static final int FLAG_PRE_AND_POST = 12;
        static C0479a<InfoRecord> sPool = new C4816b(20);
        int flags;
        ItemHolderInfo postInfo;
        ItemHolderInfo preInfo;

        private InfoRecord() {
        }

        static void drainCache() {
            do {
            } while (sPool.mo308a() != null);
        }

        static InfoRecord obtain() {
            InfoRecord infoRecord = (InfoRecord) sPool.mo308a();
            return infoRecord == null ? new InfoRecord() : infoRecord;
        }

        static void recycle(InfoRecord infoRecord) {
            infoRecord.flags = 0;
            infoRecord.preInfo = null;
            infoRecord.postInfo = null;
            sPool.mo309a(infoRecord);
        }
    }

    interface ProcessCallback {
        void processAppeared(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        void processDisappeared(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        void processPersistent(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        void unused(ViewHolder viewHolder);
    }

    ViewInfoStore() {
    }

    private ItemHolderInfo popFromLayoutStep(ViewHolder viewHolder, int i) {
        int a = this.mLayoutHolderMap.m1015a((Object) viewHolder);
        if (a < 0) {
            return null;
        }
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.m1020c(a);
        if (infoRecord == null || (infoRecord.flags & i) == 0) {
            return null;
        }
        ItemHolderInfo itemHolderInfo;
        infoRecord.flags &= i ^ -1;
        if (i == 4) {
            itemHolderInfo = infoRecord.preInfo;
        } else if (i == 8) {
            itemHolderInfo = infoRecord.postInfo;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((infoRecord.flags & 12) == 0) {
            this.mLayoutHolderMap.m1021d(a);
            InfoRecord.recycle(infoRecord);
        }
        return itemHolderInfo;
    }

    void addToAppearedInPreLayoutHolders(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.flags |= 2;
        infoRecord.preInfo = itemHolderInfo;
    }

    void addToDisappearedInLayout(ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        r0.flags |= 1;
    }

    void addToOldChangeHolders(long j, ViewHolder viewHolder) {
        this.mOldChangedHolders.m986a(j, viewHolder);
    }

    void addToPostLayout(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.postInfo = itemHolderInfo;
        infoRecord.flags |= 8;
    }

    void addToPreLayout(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.preInfo = itemHolderInfo;
        infoRecord.flags |= 4;
    }

    void clear() {
        this.mLayoutHolderMap.clear();
        this.mOldChangedHolders.m989c();
    }

    ViewHolder getFromOldChangeHolders(long j) {
        return (ViewHolder) this.mOldChangedHolders.m984a(j);
    }

    boolean isDisappearing(ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 1) == 0) ? false : true;
    }

    boolean isInPreLayout(ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 4) == 0) ? false : true;
    }

    void onDetach() {
        InfoRecord.drainCache();
    }

    public void onViewDetached(ViewHolder viewHolder) {
        removeFromDisappearedInLayout(viewHolder);
    }

    ItemHolderInfo popFromPostLayout(ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 8);
    }

    ItemHolderInfo popFromPreLayout(ViewHolder viewHolder) {
        return popFromLayoutStep(viewHolder, 4);
    }

    void process(ProcessCallback processCallback) {
        for (int size = this.mLayoutHolderMap.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) this.mLayoutHolderMap.m1019b(size);
            InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.m1021d(size);
            if ((infoRecord.flags & 3) != 3) {
                ItemHolderInfo itemHolderInfo;
                ItemHolderInfo itemHolderInfo2;
                if ((infoRecord.flags & 1) == 0) {
                    if ((infoRecord.flags & 14) != 14) {
                        if ((infoRecord.flags & 12) == 12) {
                            processCallback.processPersistent(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
                        } else if ((infoRecord.flags & 4) != 0) {
                            itemHolderInfo = infoRecord.preInfo;
                            itemHolderInfo2 = null;
                        } else if ((infoRecord.flags & 8) == 0) {
                            int i = infoRecord.flags;
                        }
                        InfoRecord.recycle(infoRecord);
                    }
                    processCallback.processAppeared(viewHolder, infoRecord.preInfo, infoRecord.postInfo);
                    InfoRecord.recycle(infoRecord);
                } else if (infoRecord.preInfo != null) {
                    itemHolderInfo = infoRecord.preInfo;
                    itemHolderInfo2 = infoRecord.postInfo;
                }
                processCallback.processDisappeared(viewHolder, itemHolderInfo, itemHolderInfo2);
                InfoRecord.recycle(infoRecord);
            }
            processCallback.unused(viewHolder);
            InfoRecord.recycle(infoRecord);
        }
    }

    void removeFromDisappearedInLayout(ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord != null) {
            infoRecord.flags &= -2;
        }
    }

    void removeViewHolder(ViewHolder viewHolder) {
        InfoRecord infoRecord;
        for (int b = this.mOldChangedHolders.m987b() - 1; b >= 0; b--) {
            if (viewHolder == this.mOldChangedHolders.m988b(b)) {
                C0468f c0468f = this.mOldChangedHolders;
                if (c0468f.f1621d[b] != C0468f.f1618a) {
                    c0468f.f1621d[b] = C0468f.f1618a;
                    c0468f.f1619b = true;
                }
                infoRecord = (InfoRecord) this.mLayoutHolderMap.remove(viewHolder);
                if (infoRecord != null) {
                    InfoRecord.recycle(infoRecord);
                }
            }
        }
        infoRecord = (InfoRecord) this.mLayoutHolderMap.remove(viewHolder);
        if (infoRecord != null) {
            InfoRecord.recycle(infoRecord);
        }
    }
}
