package org.msgpack.unpacker;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.msgpack.packer.Unconverter;
import org.msgpack.type.Value;

public class UnpackerIterator implements Iterator<Value> {
    private IOException exception;
    private final AbstractUnpacker f24874u;
    private final Unconverter uc;

    public UnpackerIterator(AbstractUnpacker abstractUnpacker) {
        this.f24874u = abstractUnpacker;
        this.uc = new Unconverter(abstractUnpacker.msgpack);
    }

    public IOException getException() {
        return this.exception;
    }

    public boolean hasNext() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.uc;
        r0 = r0.getResult();
        r1 = 1;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return r1;
    L_0x000a:
        r0 = 0;
        r2 = r4.f24874u;	 Catch:{ EOFException -> 0x001f, IOException -> 0x001c }
        r3 = r4.uc;	 Catch:{ EOFException -> 0x001f, IOException -> 0x001c }
        r2.readValue(r3);	 Catch:{ EOFException -> 0x001f, IOException -> 0x001c }
        r2 = r4.uc;
        r2 = r2.getResult();
        if (r2 == 0) goto L_0x001b;
    L_0x001a:
        return r1;
    L_0x001b:
        return r0;
    L_0x001c:
        r1 = move-exception;
        r4.exception = r1;
    L_0x001f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.unpacker.UnpackerIterator.hasNext():boolean");
    }

    public Value next() {
        if (hasNext()) {
            Value result = this.uc.getResult();
            this.uc.resetResult();
            return result;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
