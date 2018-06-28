package org.msgpack.core;

public class MessageInsufficientBufferException extends MessagePackException {
    public MessageInsufficientBufferException(String str) {
        super(str);
    }

    public MessageInsufficientBufferException(String str, Throwable th) {
        super(str, th);
    }

    public MessageInsufficientBufferException(Throwable th) {
        super(th);
    }
}
