package org.msgpack.unpacker;

final class DoubleAccept extends Accept {
    double value;

    DoubleAccept() {
        super("float");
    }

    final void acceptDouble(double d) {
        this.value = d;
    }

    final void acceptFloat(float f) {
        this.value = (double) f;
    }
}
