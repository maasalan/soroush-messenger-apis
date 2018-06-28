package android.support.v7.widget;

import java.util.List;

class OpReorderer {
    final Callback mCallback;

    interface Callback {
        UpdateOp obtainUpdateOp(int i, int i2, int i3, Object obj);

        void recycleUpdateOp(UpdateOp updateOp);
    }

    OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private int getLastMoveOutOfOrder(List<UpdateOp> list) {
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((UpdateOp) list.get(size)).cmd != 8) {
                i = 1;
            } else if (i != 0) {
                return size;
            }
        }
        return -1;
    }

    private void swapMoveAdd(List<UpdateOp> list, int i, UpdateOp updateOp, int i2, UpdateOp updateOp2) {
        int i3 = updateOp.itemCount < updateOp2.positionStart ? -1 : 0;
        if (updateOp.positionStart < updateOp2.positionStart) {
            i3++;
        }
        if (updateOp2.positionStart <= updateOp.positionStart) {
            updateOp.positionStart += updateOp2.itemCount;
        }
        if (updateOp2.positionStart <= updateOp.itemCount) {
            updateOp.itemCount += updateOp2.itemCount;
        }
        updateOp2.positionStart += i3;
        list.set(i, updateOp2);
        list.set(i2, updateOp);
    }

    private void swapMoveOp(List<UpdateOp> list, int i, int i2) {
        UpdateOp updateOp = (UpdateOp) list.get(i);
        UpdateOp updateOp2 = (UpdateOp) list.get(i2);
        int i3 = updateOp2.cmd;
        if (i3 != 4) {
            switch (i3) {
                case 1:
                    swapMoveAdd(list, i, updateOp, i2, updateOp2);
                    return;
                case 2:
                    swapMoveRemove(list, i, updateOp, i2, updateOp2);
                    return;
                default:
                    return;
            }
        }
        swapMoveUpdate(list, i, updateOp, i2, updateOp2);
    }

    void reorderOps(List<UpdateOp> list) {
        while (true) {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder != -1) {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void swapMoveRemove(java.util.List<android.support.v7.widget.AdapterHelper.UpdateOp> r9, int r10, android.support.v7.widget.AdapterHelper.UpdateOp r11, int r12, android.support.v7.widget.AdapterHelper.UpdateOp r13) {
        /*
        r8 = this;
        r0 = r11.positionStart;
        r1 = r11.itemCount;
        r2 = 0;
        r3 = 1;
        if (r0 >= r1) goto L_0x001c;
    L_0x0008:
        r0 = r13.positionStart;
        r1 = r11.positionStart;
        if (r0 != r1) goto L_0x001a;
    L_0x000e:
        r0 = r13.itemCount;
        r1 = r11.itemCount;
        r4 = r11.positionStart;
        r1 = r1 - r4;
        if (r0 != r1) goto L_0x001a;
    L_0x0017:
        r0 = r2;
        r2 = r3;
        goto L_0x0030;
    L_0x001a:
        r0 = r2;
        goto L_0x0030;
    L_0x001c:
        r0 = r13.positionStart;
        r1 = r11.itemCount;
        r1 = r1 + r3;
        if (r0 != r1) goto L_0x002f;
    L_0x0023:
        r0 = r13.itemCount;
        r1 = r11.positionStart;
        r4 = r11.itemCount;
        r1 = r1 - r4;
        if (r0 != r1) goto L_0x002f;
    L_0x002c:
        r0 = r3;
        r2 = r0;
        goto L_0x0030;
    L_0x002f:
        r0 = r3;
    L_0x0030:
        r1 = r11.itemCount;
        r4 = r13.positionStart;
        r5 = 2;
        if (r1 >= r4) goto L_0x003d;
    L_0x0037:
        r1 = r13.positionStart;
        r1 = r1 - r3;
        r13.positionStart = r1;
        goto L_0x005c;
    L_0x003d:
        r1 = r11.itemCount;
        r4 = r13.positionStart;
        r6 = r13.itemCount;
        r4 = r4 + r6;
        if (r1 >= r4) goto L_0x005c;
    L_0x0046:
        r10 = r13.itemCount;
        r10 = r10 - r3;
        r13.itemCount = r10;
        r11.cmd = r5;
        r11.itemCount = r3;
        r10 = r13.itemCount;
        if (r10 != 0) goto L_0x005b;
    L_0x0053:
        r9.remove(r12);
        r9 = r8.mCallback;
        r9.recycleUpdateOp(r13);
    L_0x005b:
        return;
    L_0x005c:
        r1 = r11.positionStart;
        r4 = r13.positionStart;
        r6 = 0;
        if (r1 > r4) goto L_0x0069;
    L_0x0063:
        r1 = r13.positionStart;
        r1 = r1 + r3;
        r13.positionStart = r1;
        goto L_0x008a;
    L_0x0069:
        r1 = r11.positionStart;
        r4 = r13.positionStart;
        r7 = r13.itemCount;
        r4 = r4 + r7;
        if (r1 >= r4) goto L_0x008a;
    L_0x0072:
        r1 = r13.positionStart;
        r4 = r13.itemCount;
        r1 = r1 + r4;
        r4 = r11.positionStart;
        r1 = r1 - r4;
        r4 = r8.mCallback;
        r7 = r11.positionStart;
        r7 = r7 + r3;
        r6 = r4.obtainUpdateOp(r5, r7, r1, r6);
        r1 = r11.positionStart;
        r3 = r13.positionStart;
        r1 = r1 - r3;
        r13.itemCount = r1;
    L_0x008a:
        if (r2 == 0) goto L_0x0098;
    L_0x008c:
        r9.set(r10, r13);
        r9.remove(r12);
        r9 = r8.mCallback;
        r9.recycleUpdateOp(r11);
        return;
    L_0x0098:
        if (r0 == 0) goto L_0x00d1;
    L_0x009a:
        if (r6 == 0) goto L_0x00b6;
    L_0x009c:
        r0 = r11.positionStart;
        r1 = r6.positionStart;
        if (r0 <= r1) goto L_0x00a9;
    L_0x00a2:
        r0 = r11.positionStart;
        r1 = r6.itemCount;
        r0 = r0 - r1;
        r11.positionStart = r0;
    L_0x00a9:
        r0 = r11.itemCount;
        r1 = r6.positionStart;
        if (r0 <= r1) goto L_0x00b6;
    L_0x00af:
        r0 = r11.itemCount;
        r1 = r6.itemCount;
        r0 = r0 - r1;
        r11.itemCount = r0;
    L_0x00b6:
        r0 = r11.positionStart;
        r1 = r13.positionStart;
        if (r0 <= r1) goto L_0x00c3;
    L_0x00bc:
        r0 = r11.positionStart;
        r1 = r13.itemCount;
        r0 = r0 - r1;
        r11.positionStart = r0;
    L_0x00c3:
        r0 = r11.itemCount;
        r1 = r13.positionStart;
        if (r0 <= r1) goto L_0x0101;
    L_0x00c9:
        r0 = r11.itemCount;
        r1 = r13.itemCount;
        r0 = r0 - r1;
        r11.itemCount = r0;
        goto L_0x0101;
    L_0x00d1:
        if (r6 == 0) goto L_0x00ed;
    L_0x00d3:
        r0 = r11.positionStart;
        r1 = r6.positionStart;
        if (r0 < r1) goto L_0x00e0;
    L_0x00d9:
        r0 = r11.positionStart;
        r1 = r6.itemCount;
        r0 = r0 - r1;
        r11.positionStart = r0;
    L_0x00e0:
        r0 = r11.itemCount;
        r1 = r6.positionStart;
        if (r0 < r1) goto L_0x00ed;
    L_0x00e6:
        r0 = r11.itemCount;
        r1 = r6.itemCount;
        r0 = r0 - r1;
        r11.itemCount = r0;
    L_0x00ed:
        r0 = r11.positionStart;
        r1 = r13.positionStart;
        if (r0 < r1) goto L_0x00fa;
    L_0x00f3:
        r0 = r11.positionStart;
        r1 = r13.itemCount;
        r0 = r0 - r1;
        r11.positionStart = r0;
    L_0x00fa:
        r0 = r11.itemCount;
        r1 = r13.positionStart;
        if (r0 < r1) goto L_0x0101;
    L_0x0100:
        goto L_0x00c9;
    L_0x0101:
        r9.set(r10, r13);
        r13 = r11.positionStart;
        r0 = r11.itemCount;
        if (r13 == r0) goto L_0x010e;
    L_0x010a:
        r9.set(r12, r11);
        goto L_0x0111;
    L_0x010e:
        r9.remove(r12);
    L_0x0111:
        if (r6 == 0) goto L_0x0116;
    L_0x0113:
        r9.add(r10, r6);
    L_0x0116:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.OpReorderer.swapMoveRemove(java.util.List, int, android.support.v7.widget.AdapterHelper$UpdateOp, int, android.support.v7.widget.AdapterHelper$UpdateOp):void");
    }

    void swapMoveUpdate(List<UpdateOp> list, int i, UpdateOp updateOp, int i2, UpdateOp updateOp2) {
        Object obtainUpdateOp;
        Object obj = null;
        if (updateOp.itemCount < updateOp2.positionStart) {
            updateOp2.positionStart--;
        } else if (updateOp.itemCount < updateOp2.positionStart + updateOp2.itemCount) {
            updateOp2.itemCount--;
            obtainUpdateOp = this.mCallback.obtainUpdateOp(4, updateOp.positionStart, 1, updateOp2.payload);
            if (updateOp.positionStart <= updateOp2.positionStart) {
                updateOp2.positionStart++;
            } else if (updateOp.positionStart < updateOp2.positionStart + updateOp2.itemCount) {
                int i3 = (updateOp2.positionStart + updateOp2.itemCount) - updateOp.positionStart;
                obj = this.mCallback.obtainUpdateOp(4, updateOp.positionStart + 1, i3, updateOp2.payload);
                updateOp2.itemCount -= i3;
            }
            list.set(i2, updateOp);
            if (updateOp2.itemCount <= 0) {
                list.set(i, updateOp2);
            } else {
                list.remove(i);
                this.mCallback.recycleUpdateOp(updateOp2);
            }
            if (obtainUpdateOp != null) {
                list.add(i, obtainUpdateOp);
            }
            if (obj != null) {
                list.add(i, obj);
            }
        }
        obtainUpdateOp = null;
        if (updateOp.positionStart <= updateOp2.positionStart) {
            updateOp2.positionStart++;
        } else if (updateOp.positionStart < updateOp2.positionStart + updateOp2.itemCount) {
            int i32 = (updateOp2.positionStart + updateOp2.itemCount) - updateOp.positionStart;
            obj = this.mCallback.obtainUpdateOp(4, updateOp.positionStart + 1, i32, updateOp2.payload);
            updateOp2.itemCount -= i32;
        }
        list.set(i2, updateOp);
        if (updateOp2.itemCount <= 0) {
            list.remove(i);
            this.mCallback.recycleUpdateOp(updateOp2);
        } else {
            list.set(i, updateOp2);
        }
        if (obtainUpdateOp != null) {
            list.add(i, obtainUpdateOp);
        }
        if (obj != null) {
            list.add(i, obj);
        }
    }
}
