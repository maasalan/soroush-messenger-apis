package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;
import sun.misc.Unsafe;

public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 16;
        r1 = 0;
        r2 = 2;
        r3 = 3;
        r4 = 0;
        r5 = 1;
        r6 = "java.specification.version";	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r7 = "";	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r6 = java.lang.System.getProperty(r6, r7);	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r7 = 46;	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r7 = r6.indexOf(r7);	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r8 = -1;
        if (r7 == r8) goto L_0x0031;
    L_0x0018:
        r8 = r6.substring(r4, r7);	 Catch:{ NumberFormatException -> 0x0035 }
        r8 = java.lang.Integer.parseInt(r8);	 Catch:{ NumberFormatException -> 0x0035 }
        r7 = r7 + r5;	 Catch:{ NumberFormatException -> 0x0035 }
        r6 = r6.substring(r7);	 Catch:{ NumberFormatException -> 0x0035 }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x0035 }
        if (r8 > r5) goto L_0x0033;
    L_0x002b:
        if (r8 != r5) goto L_0x0031;
    L_0x002d:
        r7 = 7;
        if (r6 < r7) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r6 = r4;
        goto L_0x003c;
    L_0x0033:
        r6 = r5;
        goto L_0x003c;
    L_0x0035:
        r6 = move-exception;
        r7 = java.lang.System.err;	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r6.printStackTrace(r7);	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        goto L_0x0031;
    L_0x003c:
        r7 = "sun.misc.Unsafe";	 Catch:{ Exception -> 0x0046, all -> 0x0137 }
        r7 = java.lang.Class.forName(r7);	 Catch:{ Exception -> 0x0046, all -> 0x0137 }
        if (r7 == 0) goto L_0x0046;
    L_0x0044:
        r7 = r5;
        goto L_0x0047;
    L_0x0046:
        r7 = r4;
    L_0x0047:
        r8 = "java.runtime.name";	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r9 = "";	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r8 = java.lang.System.getProperty(r8, r9);	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r8 = r8.toLowerCase();	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r9 = "android";	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r8 = r8.contains(r9);	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r9 = "com.google.appengine.runtime.version";	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r9 = java.lang.System.getProperty(r9);	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        if (r9 == 0) goto L_0x0063;	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
    L_0x0061:
        r9 = r5;	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        goto L_0x0064;	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
    L_0x0063:
        r9 = r4;	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
    L_0x0064:
        r10 = "msgpack.universal-buffer";	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r11 = "false";	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r10 = java.lang.System.getProperty(r10, r11);	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        r10 = java.lang.Boolean.parseBoolean(r10);	 Catch:{ Exception -> 0x013a, all -> 0x0137 }
        if (r10 != 0) goto L_0x007d;
    L_0x0072:
        if (r8 != 0) goto L_0x007d;
    L_0x0074:
        if (r9 != 0) goto L_0x007d;
    L_0x0076:
        if (r6 == 0) goto L_0x007d;
    L_0x0078:
        if (r7 != 0) goto L_0x007b;
    L_0x007a:
        goto L_0x007d;
    L_0x007b:
        r6 = r4;
        goto L_0x007e;
    L_0x007d:
        r6 = r5;
    L_0x007e:
        if (r6 != 0) goto L_0x00e3;
    L_0x0080:
        r7 = sun.misc.Unsafe.class;	 Catch:{ Exception -> 0x00de, all -> 0x00d8 }
        r8 = "theUnsafe";	 Catch:{ Exception -> 0x00de, all -> 0x00d8 }
        r7 = r7.getDeclaredField(r8);	 Catch:{ Exception -> 0x00de, all -> 0x00d8 }
        r7.setAccessible(r5);	 Catch:{ Exception -> 0x00de, all -> 0x00d8 }
        r7 = r7.get(r1);	 Catch:{ Exception -> 0x00de, all -> 0x00d8 }
        r7 = (sun.misc.Unsafe) r7;	 Catch:{ Exception -> 0x00de, all -> 0x00d8 }
        if (r7 != 0) goto L_0x00a9;
    L_0x0093:
        r1 = new java.lang.RuntimeException;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        r8 = "Unsafe is unavailable";	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        r1.<init>(r8);	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        throw r1;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
    L_0x009b:
        r1 = move-exception;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        r12 = r6;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        r6 = r1;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
    L_0x009e:
        r1 = r7;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        r7 = r12;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        goto L_0x0181;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
    L_0x00a2:
        r1 = move-exception;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        r12 = r6;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        r6 = r1;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
    L_0x00a5:
        r1 = r7;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        r7 = r12;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        goto L_0x013c;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
    L_0x00a9:
        r1 = byte[].class;	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        r1 = r7.arrayBaseOffset(r1);	 Catch:{ Exception -> 0x00a2, all -> 0x009b }
        r0 = byte[].class;	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
        r0 = r7.arrayIndexScale(r0);	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
        if (r0 == r5) goto L_0x00cb;	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
    L_0x00b7:
        r8 = new java.lang.IllegalStateException;	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
        r9 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
        r10 = "Byte array index scale must be 1, but is ";	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
        r9.<init>(r10);	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
        r9.append(r0);	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
        r0 = r9.toString();	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
        r8.<init>(r0);	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
        throw r8;	 Catch:{ Exception -> 0x00d3, all -> 0x00ce }
    L_0x00cb:
        r0 = r1;
        r1 = r7;
        goto L_0x00e3;
    L_0x00ce:
        r0 = move-exception;
        r12 = r6;
        r6 = r0;
        r0 = r1;
        goto L_0x009e;
    L_0x00d3:
        r0 = move-exception;
        r12 = r6;
        r6 = r0;
        r0 = r1;
        goto L_0x00a5;
    L_0x00d8:
        r7 = move-exception;
        r12 = r7;
        r7 = r6;
        r6 = r12;
        goto L_0x0181;
    L_0x00de:
        r7 = move-exception;
        r12 = r7;
        r7 = r6;
        r6 = r12;
        goto L_0x013c;
    L_0x00e3:
        unsafe = r1;
        ARRAY_BYTE_BASE_OFFSET = r0;
        isUniversalBuffer = r6;
        if (r6 == 0) goto L_0x00ee;
    L_0x00eb:
        r0 = "org.msgpack.core.buffer.MessageBufferU";
        goto L_0x0100;
    L_0x00ee:
        r0 = java.nio.ByteOrder.nativeOrder();
        r1 = java.nio.ByteOrder.LITTLE_ENDIAN;
        if (r0 != r1) goto L_0x00f8;
    L_0x00f6:
        r0 = r5;
        goto L_0x00f9;
    L_0x00f8:
        r0 = r4;
    L_0x00f9:
        if (r0 == 0) goto L_0x00fe;
    L_0x00fb:
        r0 = "org.msgpack.core.buffer.MessageBuffer";
        goto L_0x0100;
    L_0x00fe:
        r0 = "org.msgpack.core.buffer.MessageBufferBE";
    L_0x0100:
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x012b }
        r1 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x012b }
        r3 = byte[].class;	 Catch:{ Exception -> 0x012b }
        r1[r4] = r3;	 Catch:{ Exception -> 0x012b }
        r3 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x012b }
        r1[r5] = r3;	 Catch:{ Exception -> 0x012b }
        r3 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x012b }
        r1[r2] = r3;	 Catch:{ Exception -> 0x012b }
        r1 = r0.getDeclaredConstructor(r1);	 Catch:{ Exception -> 0x012b }
        r1.setAccessible(r5);	 Catch:{ Exception -> 0x012b }
        mbArrConstructor = r1;	 Catch:{ Exception -> 0x012b }
        r1 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x012b }
        r2 = java.nio.ByteBuffer.class;	 Catch:{ Exception -> 0x012b }
        r1[r4] = r2;	 Catch:{ Exception -> 0x012b }
        r0 = r0.getDeclaredConstructor(r1);	 Catch:{ Exception -> 0x012b }
        r0.setAccessible(r5);	 Catch:{ Exception -> 0x012b }
        mbBBConstructor = r0;	 Catch:{ Exception -> 0x012b }
        return;
    L_0x012b:
        r0 = move-exception;
        r1 = java.lang.System.err;
        r0.printStackTrace(r1);
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0137:
        r6 = move-exception;
        r7 = r4;
        goto L_0x0181;
    L_0x013a:
        r6 = move-exception;
        r7 = r4;
    L_0x013c:
        r8 = java.lang.System.err;	 Catch:{ all -> 0x0180 }
        r6.printStackTrace(r8);	 Catch:{ all -> 0x0180 }
        unsafe = r1;
        ARRAY_BYTE_BASE_OFFSET = r0;
        isUniversalBuffer = r5;
        r0 = "org.msgpack.core.buffer.MessageBufferU";
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0174 }
        r1 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0174 }
        r3 = byte[].class;	 Catch:{ Exception -> 0x0174 }
        r1[r4] = r3;	 Catch:{ Exception -> 0x0174 }
        r3 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0174 }
        r1[r5] = r3;	 Catch:{ Exception -> 0x0174 }
        r3 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0174 }
        r1[r2] = r3;	 Catch:{ Exception -> 0x0174 }
        r1 = r0.getDeclaredConstructor(r1);	 Catch:{ Exception -> 0x0174 }
        r1.setAccessible(r5);	 Catch:{ Exception -> 0x0174 }
        mbArrConstructor = r1;	 Catch:{ Exception -> 0x0174 }
        r1 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x0174 }
        r2 = java.nio.ByteBuffer.class;	 Catch:{ Exception -> 0x0174 }
        r1[r4] = r2;	 Catch:{ Exception -> 0x0174 }
        r0 = r0.getDeclaredConstructor(r1);	 Catch:{ Exception -> 0x0174 }
        r0.setAccessible(r5);	 Catch:{ Exception -> 0x0174 }
        mbBBConstructor = r0;	 Catch:{ Exception -> 0x0174 }
        return;
    L_0x0174:
        r0 = move-exception;
        r1 = java.lang.System.err;
        r0.printStackTrace(r1);
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0180:
        r6 = move-exception;
    L_0x0181:
        unsafe = r1;
        ARRAY_BYTE_BASE_OFFSET = r0;
        isUniversalBuffer = r7;
        if (r7 == 0) goto L_0x018c;
    L_0x0189:
        r0 = "org.msgpack.core.buffer.MessageBufferU";
        goto L_0x019e;
    L_0x018c:
        r0 = java.nio.ByteOrder.nativeOrder();
        r1 = java.nio.ByteOrder.LITTLE_ENDIAN;
        if (r0 != r1) goto L_0x0196;
    L_0x0194:
        r0 = r5;
        goto L_0x0197;
    L_0x0196:
        r0 = r4;
    L_0x0197:
        if (r0 == 0) goto L_0x019c;
    L_0x0199:
        r0 = "org.msgpack.core.buffer.MessageBuffer";
        goto L_0x019e;
    L_0x019c:
        r0 = "org.msgpack.core.buffer.MessageBufferBE";
    L_0x019e:
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x01c9 }
        r1 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x01c9 }
        r3 = byte[].class;	 Catch:{ Exception -> 0x01c9 }
        r1[r4] = r3;	 Catch:{ Exception -> 0x01c9 }
        r3 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x01c9 }
        r1[r5] = r3;	 Catch:{ Exception -> 0x01c9 }
        r3 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x01c9 }
        r1[r2] = r3;	 Catch:{ Exception -> 0x01c9 }
        r1 = r0.getDeclaredConstructor(r1);	 Catch:{ Exception -> 0x01c9 }
        r1.setAccessible(r5);	 Catch:{ Exception -> 0x01c9 }
        mbArrConstructor = r1;	 Catch:{ Exception -> 0x01c9 }
        r1 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x01c9 }
        r2 = java.nio.ByteBuffer.class;	 Catch:{ Exception -> 0x01c9 }
        r1[r4] = r2;	 Catch:{ Exception -> 0x01c9 }
        r0 = r0.getDeclaredConstructor(r1);	 Catch:{ Exception -> 0x01c9 }
        r0.setAccessible(r5);	 Catch:{ Exception -> 0x01c9 }
        mbBBConstructor = r0;	 Catch:{ Exception -> 0x01c9 }
        throw r6;
    L_0x01c9:
        r0 = move-exception;
        r1 = java.lang.System.err;
        r0.printStackTrace(r1);
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.MessageBuffer.<clinit>():void");
    }

    protected MessageBuffer(Object obj, long j, int i) {
        this.base = obj;
        this.address = j;
        this.size = i;
        this.reference = null;
    }

    MessageBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (isUniversalBuffer) {
                throw new UnsupportedOperationException("Cannot create MessageBuffer from a DirectBuffer on this platform");
            }
            this.base = null;
            this.address = DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position());
            this.size = byteBuffer.remaining();
            this.reference = byteBuffer;
        } else if (byteBuffer.hasArray()) {
            this.base = byteBuffer.array();
            this.address = (long) ((ARRAY_BYTE_BASE_OFFSET + byteBuffer.arrayOffset()) + byteBuffer.position());
            this.size = byteBuffer.remaining();
            this.reference = null;
        } else {
            throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
        }
    }

    MessageBuffer(byte[] bArr, int i, int i2) {
        this.base = bArr;
        this.address = (long) (ARRAY_BYTE_BASE_OFFSET + i);
        this.size = i2;
        this.reference = null;
    }

    public static MessageBuffer allocate(int i) {
        if (i >= 0) {
            return wrap(new byte[i]);
        }
        throw new IllegalArgumentException("size must not be negative");
    }

    private static MessageBuffer newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return (MessageBuffer) constructor.newInstance(objArr);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        } catch (Throwable e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            } else if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            } else {
                throw new IllegalStateException(e3.getCause());
            }
        }
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        return newInstance(mbBBConstructor, byteBuffer);
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr, int i, int i2) {
        Preconditions.checkNotNull(bArr);
        return newInstance(mbArrConstructor, bArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (!(isUniversalBuffer || messageBuffer.hasArray())) {
            if (DirectBufferAccess.isDirectByteBufferInstance(messageBuffer.reference)) {
                DirectBufferAccess.clean(messageBuffer.reference);
                return;
            }
            unsafe.freeMemory(messageBuffer.address);
        }
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer);
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr, 0, bArr.length);
    }

    public static MessageBuffer wrap(byte[] bArr, int i, int i2) {
        return newMessageBuffer(bArr, i, i2);
    }

    public byte[] array() {
        return (byte[]) this.base;
    }

    public int arrayOffset() {
        return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
    }

    public void copyTo(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), messageBuffer.base, messageBuffer.address + ((long) i2), (long) i3);
    }

    public boolean getBoolean(int i) {
        return unsafe.getBoolean(this.base, this.address + ((long) i));
    }

    public byte getByte(int i) {
        return unsafe.getByte(this.base, this.address + ((long) i));
    }

    public void getBytes(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < i2) {
            throw new BufferOverflowException();
        }
        byteBuffer.put(sliceAsByteBuffer(i, i2));
    }

    public void getBytes(int i, byte[] bArr, int i2, int i3) {
        unsafe.copyMemory(this.base, this.address + ((long) i), bArr, (long) (ARRAY_BYTE_BASE_OFFSET + i2), (long) i3);
    }

    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    public int getInt(int i) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + ((long) i)));
    }

    public long getLong(int i) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + ((long) i)));
    }

    public short getShort(int i) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + ((long) i)));
    }

    public boolean hasArray() {
        return this.base != null;
    }

    public void putBoolean(int i, boolean z) {
        unsafe.putBoolean(this.base, this.address + ((long) i), z);
    }

    public void putByte(int i, byte b) {
        unsafe.putByte(this.base, this.address + ((long) i), b);
    }

    public void putByteBuffer(int i, ByteBuffer byteBuffer, int i2) {
        MessageBuffer messageBuffer = this;
        int i3 = i;
        ByteBuffer byteBuffer2 = byteBuffer;
        int i4 = i2;
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory(null, DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position()), messageBuffer.base, messageBuffer.address + ((long) i3), (long) i4);
            byteBuffer2.position(byteBuffer.position() + i4);
        } else if (byteBuffer.hasArray()) {
            Object array = byteBuffer.array();
            unsafe.copyMemory(array, (long) (ARRAY_BYTE_BASE_OFFSET + byteBuffer.position()), messageBuffer.base, messageBuffer.address + ((long) i3), (long) i4);
            byteBuffer2.position(byteBuffer.position() + i4);
        } else if (hasArray()) {
            byteBuffer2.get((byte[]) messageBuffer.base, i3, i4);
        } else {
            for (int i5 = 0; i5 < i4; i5++) {
                unsafe.putByte(messageBuffer.base, messageBuffer.address + ((long) i3), byteBuffer.get());
            }
        }
    }

    public void putBytes(int i, byte[] bArr, int i2, int i3) {
        Object obj = bArr;
        unsafe.copyMemory(obj, (long) (ARRAY_BYTE_BASE_OFFSET + i2), this.base, this.address + ((long) i), (long) i3);
    }

    public void putDouble(int i, double d) {
        putLong(i, Double.doubleToRawLongBits(d));
    }

    public void putFloat(int i, float f) {
        putInt(i, Float.floatToRawIntBits(f));
    }

    public void putInt(int i, int i2) {
        unsafe.putInt(this.base, this.address + ((long) i), Integer.reverseBytes(i2));
    }

    public void putLong(int i, long j) {
        unsafe.putLong(this.base, this.address + ((long) i), Long.reverseBytes(j));
    }

    public void putMessageBuffer(int i, MessageBuffer messageBuffer, int i2, int i3) {
        unsafe.copyMemory(messageBuffer.base, messageBuffer.address + ((long) i2), this.base, this.address + ((long) i), (long) i3);
    }

    public void putShort(int i, short s) {
        unsafe.putShort(this.base, this.address + ((long) i), Short.reverseBytes(s));
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        Preconditions.checkArgument(i + i2 <= size());
        return new MessageBuffer(this.base, this.address + ((long) i), i2);
    }

    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, size());
    }

    public ByteBuffer sliceAsByteBuffer(int i, int i2) {
        return hasArray() ? ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ((long) ARRAY_BYTE_BASE_OFFSET)) + ((long) i)), i2) : DirectBufferAccess.newByteBuffer(this.address, i, i2, this.reference);
    }

    public byte[] toByteArray() {
        Object obj = new byte[size()];
        unsafe.copyMemory(this.base, this.address, obj, (long) ARRAY_BYTE_BASE_OFFSET, (long) size());
        return obj;
    }

    public String toHexString(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = i; i3 < i2; i3++) {
            if (i3 != i) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(String.format("%02x", new Object[]{Byte.valueOf(getByte(i3))}));
        }
        return stringBuilder.toString();
    }
}
