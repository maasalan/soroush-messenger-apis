package org.msgpack.unpacker;

import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.msgpack.MessageTypeException;

final class IntAccept extends Accept {
    int value;

    IntAccept() {
        super("integer");
    }

    final void acceptInteger(byte b) {
        this.value = b;
    }

    final void acceptInteger(int i) {
        this.value = i;
    }

    final void acceptInteger(long j) {
        if (j >= -2147483648L) {
            if (j <= 2147483647L) {
                this.value = (int) j;
                return;
            }
        }
        throw new MessageTypeException();
    }

    final void acceptInteger(short s) {
        this.value = s;
    }

    final void acceptUnsignedInteger(byte b) {
        this.value = b & 255;
    }

    final void acceptUnsignedInteger(int i) {
        if (i < 0) {
            throw new MessageTypeException();
        }
        this.value = i;
    }

    final void acceptUnsignedInteger(long j) {
        if (j >= 0) {
            if (j <= 2147483647L) {
                this.value = (int) j;
                return;
            }
        }
        throw new MessageTypeException();
    }

    final void acceptUnsignedInteger(short s) {
        this.value = s & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
    }
}
