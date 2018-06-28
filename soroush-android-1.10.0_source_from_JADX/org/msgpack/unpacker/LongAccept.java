package org.msgpack.unpacker;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.msgpack.MessageTypeException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class LongAccept extends Accept {
    long value;

    LongAccept() {
        super("integer");
    }

    final void acceptInteger(byte b) {
        this.value = (long) b;
    }

    final void acceptInteger(int i) {
        this.value = (long) i;
    }

    final void acceptInteger(long j) {
        this.value = j;
    }

    final void acceptInteger(short s) {
        this.value = (long) s;
    }

    final void acceptUnsignedInteger(byte b) {
        this.value = (long) (b & 255);
    }

    final void acceptUnsignedInteger(int i) {
        if (i < 0) {
            this.value = ((long) (i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + IjkMediaMeta.AV_CH_WIDE_LEFT;
        } else {
            this.value = (long) i;
        }
    }

    final void acceptUnsignedInteger(long j) {
        if (j < 0) {
            throw new MessageTypeException();
        }
        this.value = j;
    }

    final void acceptUnsignedInteger(short s) {
        this.value = (long) (s & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
    }
}
