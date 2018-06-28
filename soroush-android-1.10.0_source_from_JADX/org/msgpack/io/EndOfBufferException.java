package org.msgpack.io;

import java.io.EOFException;

public class EndOfBufferException extends EOFException {
    public EndOfBufferException(String str) {
        super(str);
    }
}
