package org.msgpack.unpacker;

import java.nio.ByteBuffer;
import org.msgpack.MessageTypeException;
import org.msgpack.io.BufferReferer;

abstract class Accept implements BufferReferer {
    private final String expected;

    Accept(String str) {
        this.expected = str;
    }

    void acceptArray(int i) {
        throw new MessageTypeException(String.format("Expected %s, but got array value", new Object[]{this.expected}));
    }

    void acceptBoolean(boolean z) {
        throw new MessageTypeException(String.format("Expected %s, but got boolean", new Object[]{this.expected}));
    }

    void acceptDouble(double d) {
        throw new MessageTypeException(String.format("Expected %s, but got float value", new Object[]{this.expected}));
    }

    void acceptEmptyRaw() {
        throw new MessageTypeException(String.format("Expected %s, but got raw value", new Object[]{this.expected}));
    }

    void acceptFloat(float f) {
        throw new MessageTypeException(String.format("Expected %s, but got float value", new Object[]{this.expected}));
    }

    void acceptInteger(byte b) {
        throw new MessageTypeException(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    void acceptInteger(int i) {
        throw new MessageTypeException(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    void acceptInteger(long j) {
        throw new MessageTypeException(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    void acceptInteger(short s) {
        throw new MessageTypeException(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    void acceptMap(int i) {
        throw new MessageTypeException(String.format("Expected %s, but got map value", new Object[]{this.expected}));
    }

    void acceptNil() {
        throw new MessageTypeException(String.format("Expected %s, but got nil value", new Object[]{this.expected}));
    }

    void acceptRaw(byte[] bArr) {
        throw new MessageTypeException(String.format("Expected %s, but got raw value", new Object[]{this.expected}));
    }

    void acceptUnsignedInteger(byte b) {
        throw new MessageTypeException(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    void acceptUnsignedInteger(int i) {
        throw new MessageTypeException(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    void acceptUnsignedInteger(long j) {
        throw new MessageTypeException(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    void acceptUnsignedInteger(short s) {
        throw new MessageTypeException(String.format("Expected %s, but got integer value", new Object[]{this.expected}));
    }

    public void refer(ByteBuffer byteBuffer, boolean z) {
        throw new MessageTypeException(String.format("Expected %s, but got raw value", new Object[]{this.expected}));
    }
}
