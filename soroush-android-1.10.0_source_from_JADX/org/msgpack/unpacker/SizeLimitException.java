package org.msgpack.unpacker;

import java.io.IOException;

public class SizeLimitException extends IOException {
    public SizeLimitException(String str) {
        super(str);
    }

    public SizeLimitException(String str, Throwable th) {
        super(str, th);
    }

    public SizeLimitException(Throwable th) {
        super(th);
    }
}
