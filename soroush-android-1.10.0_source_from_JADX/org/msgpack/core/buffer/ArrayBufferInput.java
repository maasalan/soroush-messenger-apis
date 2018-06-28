package org.msgpack.core.buffer;

import org.msgpack.core.Preconditions;

public class ArrayBufferInput implements MessageBufferInput {
    private MessageBuffer buffer;
    private boolean isEmpty;

    public ArrayBufferInput(MessageBuffer messageBuffer) {
        this.buffer = messageBuffer;
        this.isEmpty = messageBuffer == null;
    }

    public ArrayBufferInput(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ArrayBufferInput(byte[] bArr, int i, int i2) {
        this(MessageBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr, "input array is null"), i, i2));
    }

    public void close() {
        this.buffer = null;
        this.isEmpty = true;
    }

    public MessageBuffer next() {
        if (this.isEmpty) {
            return null;
        }
        this.isEmpty = true;
        return this.buffer;
    }

    public org.msgpack.core.buffer.MessageBuffer reset(org.msgpack.core.buffer.MessageBuffer r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:6:0x000c in {2, 4, 5} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = r1.buffer;
        r1.buffer = r2;
        if (r2 != 0) goto L_0x000a;
    L_0x0006:
        r2 = 1;
    L_0x0007:
        r1.isEmpty = r2;
        return r0;
    L_0x000a:
        r2 = 0;
        goto L_0x0007;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.ArrayBufferInput.reset(org.msgpack.core.buffer.MessageBuffer):org.msgpack.core.buffer.MessageBuffer");
    }

    public void reset(byte[] bArr) {
        reset(MessageBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr, "input array is null")));
    }

    public void reset(byte[] bArr, int i, int i2) {
        reset(MessageBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr, "input array is null"), i, i2));
    }
}
