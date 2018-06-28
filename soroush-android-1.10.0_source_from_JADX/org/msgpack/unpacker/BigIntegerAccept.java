package org.msgpack.unpacker;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.math.BigInteger;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class BigIntegerAccept extends Accept {
    BigInteger value;

    BigIntegerAccept() {
        super("integer");
    }

    final void acceptInteger(byte b) {
        this.value = BigInteger.valueOf((long) b);
    }

    final void acceptInteger(int i) {
        this.value = BigInteger.valueOf((long) i);
    }

    final void acceptInteger(long j) {
        this.value = BigInteger.valueOf(j);
    }

    final void acceptInteger(short s) {
        this.value = BigInteger.valueOf((long) s);
    }

    final void acceptUnsignedInteger(byte b) {
        this.value = BigInteger.valueOf((long) (b & 255));
    }

    final void acceptUnsignedInteger(int i) {
        this.value = i < 0 ? BigInteger.valueOf(((long) (i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + IjkMediaMeta.AV_CH_WIDE_LEFT) : BigInteger.valueOf((long) i);
    }

    final void acceptUnsignedInteger(long j) {
        this.value = j < 0 ? BigInteger.valueOf((j + Long.MAX_VALUE) + 1).setBit(63) : BigInteger.valueOf(j);
    }

    final void acceptUnsignedInteger(short s) {
        this.value = BigInteger.valueOf((long) (s & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE));
    }
}
