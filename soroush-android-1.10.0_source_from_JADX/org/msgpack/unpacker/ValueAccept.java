package org.msgpack.unpacker;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.msgpack.packer.Unconverter;
import org.msgpack.type.ValueFactory;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class ValueAccept extends Accept {
    private Unconverter uc = null;

    ValueAccept() {
        super(null);
    }

    final void acceptArray(int i) {
        this.uc.writeArrayBegin(i);
    }

    final void acceptBoolean(boolean z) {
        this.uc.write(ValueFactory.createBooleanValue(z));
    }

    final void acceptDouble(double d) {
        this.uc.write(ValueFactory.createFloatValue(d));
    }

    final void acceptEmptyRaw() {
        this.uc.write(ValueFactory.createRawValue());
    }

    final void acceptFloat(float f) {
        this.uc.write(ValueFactory.createFloatValue(f));
    }

    final void acceptInteger(byte b) {
        this.uc.write(ValueFactory.createIntegerValue(b));
    }

    final void acceptInteger(int i) {
        this.uc.write(ValueFactory.createIntegerValue(i));
    }

    final void acceptInteger(long j) {
        this.uc.write(ValueFactory.createIntegerValue(j));
    }

    final void acceptInteger(short s) {
        this.uc.write(ValueFactory.createIntegerValue(s));
    }

    final void acceptMap(int i) {
        this.uc.writeMapBegin(i);
    }

    final void acceptNil() {
        this.uc.write(ValueFactory.createNilValue());
    }

    final void acceptRaw(byte[] bArr) {
        this.uc.write(ValueFactory.createRawValue(bArr));
    }

    final void acceptUnsignedInteger(byte b) {
        this.uc.write(ValueFactory.createIntegerValue(b & 255));
    }

    final void acceptUnsignedInteger(int i) {
        if (i < 0) {
            this.uc.write(ValueFactory.createIntegerValue(((long) (i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + IjkMediaMeta.AV_CH_WIDE_LEFT));
            return;
        }
        this.uc.write(ValueFactory.createIntegerValue(i));
    }

    final void acceptUnsignedInteger(long j) {
        if (j < 0) {
            this.uc.write(ValueFactory.createIntegerValue(BigInteger.valueOf((j + Long.MAX_VALUE) + 1).setBit(63)));
            return;
        }
        this.uc.write(ValueFactory.createIntegerValue(j));
    }

    final void acceptUnsignedInteger(short s) {
        this.uc.write(ValueFactory.createIntegerValue(s & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE));
    }

    public final void refer(ByteBuffer byteBuffer, boolean z) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        this.uc.write(ValueFactory.createRawValue(bArr, true));
    }

    final void setUnconverter(Unconverter unconverter) {
        this.uc = unconverter;
    }
}
