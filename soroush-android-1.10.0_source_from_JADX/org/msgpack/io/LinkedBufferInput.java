package org.msgpack.io;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedBufferInput extends AbstractInput {
    private final int bufferSize;
    LinkedList<ByteBuffer> link = new LinkedList();
    private int nextAdvance;
    private byte[] tmpBuffer = new byte[8];
    private ByteBuffer tmpByteBuffer = ByteBuffer.wrap(this.tmpBuffer);
    int writable = -1;

    public LinkedBufferInput(int i) {
        this.bufferSize = i;
    }

    private boolean removeFirstLink(ByteBuffer byteBuffer) {
        if (this.link.size() != 1) {
            this.link.removeFirst();
            return true;
        } else if (this.writable >= 0) {
            byteBuffer.position(0);
            byteBuffer.limit(0);
            this.writable = byteBuffer.capacity();
            return false;
        } else {
            this.link.removeFirst();
            return false;
        }
    }

    private java.nio.ByteBuffer require(int r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.link;	 Catch:{ NoSuchElementException -> 0x0009 }
        r0 = r0.getFirst();	 Catch:{ NoSuchElementException -> 0x0009 }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ NoSuchElementException -> 0x0009 }
        goto L_0x000a;
    L_0x0009:
        r0 = 0;
    L_0x000a:
        if (r0 != 0) goto L_0x0012;
    L_0x000c:
        r3 = new org.msgpack.io.EndOfBufferException;
        r3.<init>();
        throw r3;
    L_0x0012:
        r1 = r0.remaining();
        if (r3 > r1) goto L_0x001b;
    L_0x0018:
        r2.nextAdvance = r3;
        return r0;
    L_0x001b:
        r2.requireMore(r3);
        r2.nextAdvance = r3;
        r3 = r2.tmpByteBuffer;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.io.LinkedBufferInput.require(int):java.nio.ByteBuffer");
    }

    private void requireMore(int i) {
        Iterator it = this.link.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            if (i <= byteBuffer.remaining()) {
                int position = byteBuffer.position();
                byteBuffer.get(this.tmpBuffer, i2, i);
                byteBuffer.position(position);
                return;
            }
            int remaining = byteBuffer.remaining();
            int position2 = byteBuffer.position();
            byteBuffer.get(this.tmpBuffer, i2, remaining);
            byteBuffer.position(position2);
            i -= remaining;
            i2 += remaining;
        }
        throw new EndOfBufferException();
    }

    public void advance() {
        if (!this.link.isEmpty()) {
            int i = this.nextAdvance;
            ByteBuffer byteBuffer;
            do {
                byteBuffer = (ByteBuffer) this.link.getFirst();
                if (i < byteBuffer.remaining()) {
                    byteBuffer.position(byteBuffer.position() + i);
                    break;
                } else {
                    i -= byteBuffer.remaining();
                    byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
                }
            } while (removeFirstLink(byteBuffer));
            incrReadByteCount(this.nextAdvance);
            this.nextAdvance = 0;
        }
    }

    public void clear() {
        int capacity;
        if (this.writable >= 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.link.getLast();
            this.link.clear();
            byteBuffer.position(0);
            byteBuffer.limit(0);
            this.link.addLast(byteBuffer);
            capacity = byteBuffer.capacity();
        } else {
            this.link.clear();
            capacity = -1;
        }
        this.writable = capacity;
    }

    public void close() {
    }

    public void copyReferencedBuffer() {
        if (!this.link.isEmpty()) {
            Iterator it = this.link.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                i2 += ((ByteBuffer) it.next()).remaining();
            }
            if (i2 != 0) {
                ByteBuffer byteBuffer;
                int remaining;
                if (this.writable >= 0) {
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.link.removeLast();
                    byte[] bArr = new byte[(i2 - byteBuffer2.remaining())];
                    Iterator it2 = this.link.iterator();
                    while (it2.hasNext()) {
                        byteBuffer = (ByteBuffer) it2.next();
                        remaining = byteBuffer.remaining();
                        byteBuffer.get(bArr, i, remaining);
                        i += remaining;
                    }
                    this.link.clear();
                    this.link.add(ByteBuffer.wrap(bArr));
                    this.link.add(byteBuffer2);
                    return;
                }
                byte[] bArr2 = new byte[i2];
                Iterator it3 = this.link.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    byteBuffer = (ByteBuffer) it3.next();
                    remaining = byteBuffer.remaining();
                    byteBuffer.get(bArr2, i3, remaining);
                    i3 += remaining;
                }
                this.link.clear();
                this.link.add(ByteBuffer.wrap(bArr2));
                this.writable = 0;
            }
        }
    }

    public void feed(ByteBuffer byteBuffer) {
        feed(byteBuffer, false);
    }

    public void feed(java.nio.ByteBuffer r6, boolean r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        if (r7 == 0) goto L_0x002b;
    L_0x0002:
        r7 = r5.writable;
        if (r7 <= 0) goto L_0x0022;
    L_0x0006:
        r7 = r5.link;
        r7 = r7.getLast();
        r7 = (java.nio.ByteBuffer) r7;
        r7 = r7.remaining();
        if (r7 != 0) goto L_0x0022;
    L_0x0014:
        r7 = r5.link;
        r0 = r5.link;
        r0 = r0.size();
        r0 = r0 + -1;
        r7.add(r0, r6);
        return;
    L_0x0022:
        r7 = r5.link;
        r7.addLast(r6);
        r6 = -1;
        r5.writable = r6;
        return;
    L_0x002b:
        r7 = r6.remaining();
        r0 = 0;
        r1 = r5.link;	 Catch:{ NoSuchElementException -> 0x0039 }
        r1 = r1.getLast();	 Catch:{ NoSuchElementException -> 0x0039 }
        r1 = (java.nio.ByteBuffer) r1;	 Catch:{ NoSuchElementException -> 0x0039 }
        r0 = r1;
    L_0x0039:
        r1 = r5.writable;
        if (r7 > r1) goto L_0x0062;
    L_0x003d:
        r1 = r0.position();
        r2 = r0.limit();
        r0.position(r2);
        r2 = r0.limit();
        r2 = r2 + r7;
        r0.limit(r2);
        r0.put(r6);
        r0.position(r1);
        r6 = r0.capacity();
        r7 = r0.limit();
        r6 = r6 - r7;
        r5.writable = r6;
        return;
    L_0x0062:
        r1 = r5.writable;
        r2 = 0;
        if (r1 <= 0) goto L_0x0094;
    L_0x0067:
        r1 = r0.position();
        r3 = r0.limit();
        r0.position(r3);
        r3 = r0.limit();
        r4 = r5.writable;
        r3 = r3 + r4;
        r0.limit(r3);
        r3 = r5.writable;
        r6.limit(r3);
        r0.put(r6);
        r0.position(r1);
        r0 = r5.writable;
        r7 = r7 - r0;
        r0 = r6.limit();
        r0 = r0 + r7;
        r6.limit(r0);
        r5.writable = r2;
    L_0x0094:
        r0 = r5.bufferSize;
        r0 = java.lang.Math.max(r7, r0);
        r1 = java.nio.ByteBuffer.allocate(r0);
        r1.put(r6);
        r1.limit(r7);
        r1.position(r2);
        r6 = r5.link;
        r6.addLast(r1);
        r0 = r0 - r7;
        r5.writable = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.io.LinkedBufferInput.feed(java.nio.ByteBuffer, boolean):void");
    }

    public void feed(byte[] bArr) {
        feed(bArr, 0, bArr.length, false);
    }

    public void feed(byte[] bArr, int i, int i2) {
        feed(bArr, i, i2, false);
    }

    public void feed(byte[] r5, int r6, int r7, boolean r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        if (r8 == 0) goto L_0x0033;
    L_0x0002:
        r8 = r4.writable;
        if (r8 <= 0) goto L_0x0026;
    L_0x0006:
        r8 = r4.link;
        r8 = r8.getLast();
        r8 = (java.nio.ByteBuffer) r8;
        r8 = r8.remaining();
        if (r8 != 0) goto L_0x0026;
    L_0x0014:
        r8 = r4.link;
        r0 = r4.link;
        r0 = r0.size();
        r0 = r0 + -1;
        r5 = java.nio.ByteBuffer.wrap(r5, r6, r7);
        r8.add(r0, r5);
        return;
    L_0x0026:
        r8 = r4.link;
        r5 = java.nio.ByteBuffer.wrap(r5, r6, r7);
        r8.addLast(r5);
        r5 = -1;
        r4.writable = r5;
        return;
    L_0x0033:
        r8 = 0;
        r0 = r4.link;	 Catch:{ NoSuchElementException -> 0x003d }
        r0 = r0.getLast();	 Catch:{ NoSuchElementException -> 0x003d }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ NoSuchElementException -> 0x003d }
        r8 = r0;
    L_0x003d:
        r0 = r4.writable;
        if (r7 > r0) goto L_0x0066;
    L_0x0041:
        r0 = r8.position();
        r1 = r8.limit();
        r8.position(r1);
        r1 = r8.limit();
        r1 = r1 + r7;
        r8.limit(r1);
        r8.put(r5, r6, r7);
        r8.position(r0);
        r5 = r8.capacity();
        r6 = r8.limit();
        r5 = r5 - r6;
        r4.writable = r5;
        return;
    L_0x0066:
        r0 = r4.writable;
        r1 = 0;
        if (r0 <= 0) goto L_0x0090;
    L_0x006b:
        r0 = r8.position();
        r2 = r8.limit();
        r8.position(r2);
        r2 = r8.limit();
        r3 = r4.writable;
        r2 = r2 + r3;
        r8.limit(r2);
        r2 = r4.writable;
        r8.put(r5, r6, r2);
        r8.position(r0);
        r8 = r4.writable;
        r6 = r6 + r8;
        r8 = r4.writable;
        r7 = r7 - r8;
        r4.writable = r1;
    L_0x0090:
        r8 = r4.bufferSize;
        r8 = java.lang.Math.max(r7, r8);
        r0 = java.nio.ByteBuffer.allocate(r8);
        r0.put(r5, r6, r7);
        r0.limit(r7);
        r0.position(r1);
        r5 = r4.link;
        r5.addLast(r0);
        r8 = r8 - r7;
        r4.writable = r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.io.LinkedBufferInput.feed(byte[], int, int, boolean):void");
    }

    public void feed(byte[] bArr, boolean z) {
        feed(bArr, 0, bArr.length, z);
    }

    public byte getByte() {
        ByteBuffer require = require(1);
        return require.get(require.position());
    }

    public double getDouble() {
        ByteBuffer require = require(8);
        return require.getDouble(require.position());
    }

    public float getFloat() {
        ByteBuffer require = require(4);
        return require.getFloat(require.position());
    }

    public int getInt() {
        ByteBuffer require = require(4);
        return require.getInt(require.position());
    }

    public long getLong() {
        ByteBuffer require = require(8);
        return require.getLong(require.position());
    }

    public /* bridge */ /* synthetic */ int getReadByteCount() {
        return super.getReadByteCount();
    }

    public short getShort() {
        ByteBuffer require = require(2);
        return require.getShort(require.position());
    }

    public int getSize() {
        Iterator it = this.link.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ByteBuffer) it.next()).remaining();
        }
        return i;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (this.link.isEmpty()) {
            return 0;
        }
        int i3 = i;
        i = i2;
        ByteBuffer byteBuffer;
        do {
            byteBuffer = (ByteBuffer) this.link.getFirst();
            if (i < byteBuffer.remaining()) {
                byteBuffer.get(bArr, i3, i);
                incrReadByteCount(i);
                return i2;
            }
            int remaining = byteBuffer.remaining();
            byteBuffer.get(bArr, i3, remaining);
            incrReadByteCount(remaining);
            i -= remaining;
            i3 += remaining;
        } while (removeFirstLink(byteBuffer));
        return i2 - i;
    }

    public byte readByte() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.link;	 Catch:{ NoSuchElementException -> 0x0009 }
        r0 = r0.getFirst();	 Catch:{ NoSuchElementException -> 0x0009 }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ NoSuchElementException -> 0x0009 }
        goto L_0x000a;
    L_0x0009:
        r0 = 0;
    L_0x000a:
        if (r0 == 0) goto L_0x0024;
    L_0x000c:
        r1 = r0.remaining();
        if (r1 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0024;
    L_0x0013:
        r1 = r0.get();
        r3.incrReadOneByteCount();
        r2 = r0.remaining();
        if (r2 != 0) goto L_0x0023;
    L_0x0020:
        r3.removeFirstLink(r0);
    L_0x0023:
        return r1;
    L_0x0024:
        r0 = new org.msgpack.io.EndOfBufferException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.io.LinkedBufferInput.readByte():byte");
    }

    public /* bridge */ /* synthetic */ void resetReadByteCount() {
        super.resetReadByteCount();
    }

    public boolean tryRefer(org.msgpack.io.BufferReferer r6, int r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r5.link;	 Catch:{ NoSuchElementException -> 0x0009 }
        r0 = r0.getFirst();	 Catch:{ NoSuchElementException -> 0x0009 }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ NoSuchElementException -> 0x0009 }
        goto L_0x000a;
    L_0x0009:
        r0 = 0;
    L_0x000a:
        if (r0 != 0) goto L_0x0012;
    L_0x000c:
        r6 = new org.msgpack.io.EndOfBufferException;
        r6.<init>();
        throw r6;
    L_0x0012:
        r1 = r0.remaining();
        if (r1 >= r7) goto L_0x001a;
    L_0x0018:
        r6 = 0;
        return r6;
    L_0x001a:
        r1 = r0.position();
        r2 = r0.limit();
        r3 = r1 + r7;
        r0.limit(r3);	 Catch:{ all -> 0x003e }
        r4 = 1;	 Catch:{ all -> 0x003e }
        r6.refer(r0, r4);	 Catch:{ all -> 0x003e }
        r5.incrReadByteCount(r7);	 Catch:{ all -> 0x003e }
        r0.limit(r2);
        r0.position(r3);
        r6 = r0.remaining();
        if (r6 != 0) goto L_0x003d;
    L_0x003a:
        r5.removeFirstLink(r0);
    L_0x003d:
        return r4;
    L_0x003e:
        r6 = move-exception;
        r0.limit(r2);
        r0.position(r1);
        r7 = r0.remaining();
        if (r7 != 0) goto L_0x004e;
    L_0x004b:
        r5.removeFirstLink(r0);
    L_0x004e:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.io.LinkedBufferInput.tryRefer(org.msgpack.io.BufferReferer, int):boolean");
    }
}
