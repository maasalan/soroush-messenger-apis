package org.msgpack.core;

import java.io.Closeable;
import java.io.Flushable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessagePack.Code;
import org.msgpack.core.MessagePack.PackerConfig;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.value.Value;

public class MessagePacker implements Closeable, Flushable {
    private static final boolean CORRUPTED_CHARSET_ENCODER;
    private static final int UTF_8_MAX_CHAR_SIZE = 6;
    private MessageBuffer buffer;
    private final int bufferFlushThreshold;
    private CharsetEncoder encoder;
    protected MessageBufferOutput out;
    private int position = 0;
    private final int smallStringOptimizationThreshold;
    private final boolean str8FormatSupport;
    private long totalFlushBytes = 0;

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = "android.os.Build$VERSION";	 Catch:{ ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x003b, IllegalAccessException -> 0x0036, InstantiationException -> 0x0031, InvocationTargetException -> 0x002c, NoSuchFieldException -> 0x0027 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x003b, IllegalAccessException -> 0x0036, InstantiationException -> 0x0031, InvocationTargetException -> 0x002c, NoSuchFieldException -> 0x0027 }
        r2 = new java.lang.Class[r0];	 Catch:{ ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x003b, IllegalAccessException -> 0x0036, InstantiationException -> 0x0031, InvocationTargetException -> 0x002c, NoSuchFieldException -> 0x0027 }
        r2 = r1.getConstructor(r2);	 Catch:{ ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x003b, IllegalAccessException -> 0x0036, InstantiationException -> 0x0031, InvocationTargetException -> 0x002c, NoSuchFieldException -> 0x0027 }
        r3 = new java.lang.Object[r0];	 Catch:{ ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x003b, IllegalAccessException -> 0x0036, InstantiationException -> 0x0031, InvocationTargetException -> 0x002c, NoSuchFieldException -> 0x0027 }
        r2 = r2.newInstance(r3);	 Catch:{ ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x003b, IllegalAccessException -> 0x0036, InstantiationException -> 0x0031, InvocationTargetException -> 0x002c, NoSuchFieldException -> 0x0027 }
        r3 = "SDK_INT";	 Catch:{ ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x003b, IllegalAccessException -> 0x0036, InstantiationException -> 0x0031, InvocationTargetException -> 0x002c, NoSuchFieldException -> 0x0027 }
        r1 = r1.getField(r3);	 Catch:{ ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x003b, IllegalAccessException -> 0x0036, InstantiationException -> 0x0031, InvocationTargetException -> 0x002c, NoSuchFieldException -> 0x0027 }
        r1 = r1.getInt(r2);	 Catch:{ ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x003b, IllegalAccessException -> 0x0036, InstantiationException -> 0x0031, InvocationTargetException -> 0x002c, NoSuchFieldException -> 0x0027 }
        r2 = 14;
        if (r1 < r2) goto L_0x003f;
    L_0x0021:
        r2 = 21;
        if (r1 >= r2) goto L_0x003f;
    L_0x0025:
        r0 = 1;
        goto L_0x003f;
    L_0x0027:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x003f;
    L_0x002c:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x003f;
    L_0x0031:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x003f;
    L_0x0036:
        r1 = move-exception;
        r1.printStackTrace();
        goto L_0x003f;
    L_0x003b:
        r1 = move-exception;
        r1.printStackTrace();
    L_0x003f:
        CORRUPTED_CHARSET_ENCODER = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessagePacker.<clinit>():void");
    }

    protected MessagePacker(MessageBufferOutput messageBufferOutput, PackerConfig packerConfig) {
        this.out = (MessageBufferOutput) Preconditions.checkNotNull(messageBufferOutput, "MessageBufferOutput is null");
        this.smallStringOptimizationThreshold = packerConfig.getSmallStringOptimizationThreshold();
        this.bufferFlushThreshold = packerConfig.getBufferFlushThreshold();
        this.str8FormatSupport = packerConfig.isStr8FormatSupport();
    }

    private int encodeStringToBufferAt(int i, String str) {
        prepareEncoder();
        ByteBuffer sliceAsByteBuffer = this.buffer.sliceAsByteBuffer(i, this.buffer.size() - i);
        int position = sliceAsByteBuffer.position();
        CoderResult encode = this.encoder.encode(CharBuffer.wrap(str), sliceAsByteBuffer, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
        return (encode.isUnderflow() && !encode.isOverflow() && this.encoder.flush(sliceAsByteBuffer).isUnderflow()) ? sliceAsByteBuffer.position() - position : -1;
    }

    private void ensureCapacity(int i) {
        if (this.buffer == null) {
            this.buffer = this.out.next(i);
            return;
        }
        if (this.position + i >= this.buffer.size()) {
            flushBuffer();
            this.buffer = this.out.next(i);
        }
    }

    private void flushBuffer() {
        this.out.writeBuffer(this.position);
        this.buffer = null;
        this.totalFlushBytes += (long) this.position;
        this.position = 0;
    }

    private void packStringWithGetBytes(String str) {
        byte[] bytes = str.getBytes(MessagePack.UTF8);
        packRawStringHeader(bytes.length);
        addPayload(bytes);
    }

    private void prepareEncoder() {
        if (this.encoder == null) {
            this.encoder = MessagePack.UTF8.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        }
        this.encoder.reset();
    }

    private void writeByte(byte b) {
        ensureCapacity(1);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
    }

    private void writeByteAndByte(byte b, byte b2) {
        ensureCapacity(2);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
        MessageBuffer messageBuffer2 = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer2.putByte(i2, b2);
    }

    private void writeByteAndDouble(byte b, double d) {
        ensureCapacity(9);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
        this.buffer.putDouble(this.position, d);
        this.position += 8;
    }

    private void writeByteAndFloat(byte b, float f) {
        ensureCapacity(5);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
        this.buffer.putFloat(this.position, f);
        this.position += 4;
    }

    private void writeByteAndInt(byte b, int i) {
        ensureCapacity(5);
        MessageBuffer messageBuffer = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        messageBuffer.putByte(i2, b);
        this.buffer.putInt(this.position, i);
        this.position += 4;
    }

    private void writeByteAndLong(byte b, long j) {
        ensureCapacity(9);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
        this.buffer.putLong(this.position, j);
        this.position += 8;
    }

    private void writeByteAndShort(byte b, short s) {
        ensureCapacity(3);
        MessageBuffer messageBuffer = this.buffer;
        int i = this.position;
        this.position = i + 1;
        messageBuffer.putByte(i, b);
        this.buffer.putShort(this.position, s);
        this.position += 2;
    }

    private void writeInt(int i) {
        ensureCapacity(4);
        this.buffer.putInt(this.position, i);
        this.position += 4;
    }

    private void writeLong(long j) {
        ensureCapacity(8);
        this.buffer.putLong(this.position, j);
        this.position += 8;
    }

    private void writeShort(short s) {
        ensureCapacity(2);
        this.buffer.putShort(this.position, s);
        this.position += 2;
    }

    public MessagePacker addPayload(byte[] bArr) {
        return addPayload(bArr, 0, bArr.length);
    }

    public MessagePacker addPayload(byte[] bArr, int i, int i2) {
        if (this.buffer != null && this.buffer.size() - this.position >= i2) {
            if (i2 <= this.bufferFlushThreshold) {
                this.buffer.putBytes(this.position, bArr, i, i2);
                this.position += i2;
                return this;
            }
        }
        flush();
        this.out.add(bArr, i, i2);
        this.totalFlushBytes += (long) i2;
        return this;
    }

    public void close() {
        try {
            flush();
        } finally {
            this.out.close();
        }
    }

    public void flush() {
        if (this.position > 0) {
            flushBuffer();
        }
        this.out.flush();
    }

    public long getTotalWrittenBytes() {
        return this.totalFlushBytes + ((long) this.position);
    }

    public MessagePacker packArrayHeader(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("array size must be >= 0");
        } else if (i < 16) {
            writeByte((byte) (i | -112));
            return this;
        } else if (i < 65536) {
            writeByteAndShort(Code.ARRAY16, (short) i);
            return this;
        } else {
            writeByteAndInt(Code.ARRAY32, i);
            return this;
        }
    }

    public MessagePacker packBigInteger(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            packLong(bigInteger.longValue());
            return this;
        } else if (bigInteger.bitLength() == 64 && bigInteger.signum() == 1) {
            writeByteAndLong(Code.UINT64, bigInteger.longValue());
            return this;
        } else {
            throw new IllegalArgumentException("MessagePack cannot serialize BigInteger larger than 2^64-1");
        }
    }

    public MessagePacker packBinaryHeader(int i) {
        if (i < 256) {
            writeByteAndByte(Code.BIN8, (byte) i);
            return this;
        } else if (i < 65536) {
            writeByteAndShort(Code.BIN16, (short) i);
            return this;
        } else {
            writeByteAndInt(Code.BIN32, i);
            return this;
        }
    }

    public MessagePacker packBoolean(boolean z) {
        writeByte(z ? Code.TRUE : Code.FALSE);
        return this;
    }

    public MessagePacker packByte(byte b) {
        if (b < Code.NEGFIXINT_PREFIX) {
            writeByteAndByte(Code.INT8, b);
            return this;
        }
        writeByte(b);
        return this;
    }

    public MessagePacker packDouble(double d) {
        writeByteAndDouble(Code.FLOAT64, d);
        return this;
    }

    public org.msgpack.core.MessagePacker packExtensionTypeHeader(byte r3, int r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0049 in {8, 10, 13, 16, 19, 22, 23, 25, 28, 29} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r4 >= r0) goto L_0x0038;
    L_0x0004:
        r0 = -57;
        if (r4 <= 0) goto L_0x0030;
    L_0x0008:
        r1 = r4 + -1;
        r1 = r1 & r4;
        if (r1 != 0) goto L_0x0030;
    L_0x000d:
        r1 = 1;
        if (r4 != r1) goto L_0x0016;
    L_0x0010:
        r4 = -44;
    L_0x0012:
        r2.writeByteAndByte(r4, r3);
        return r2;
    L_0x0016:
        r1 = 2;
        if (r4 != r1) goto L_0x001c;
    L_0x0019:
        r4 = -43;
        goto L_0x0012;
    L_0x001c:
        r1 = 4;
        if (r4 != r1) goto L_0x0022;
    L_0x001f:
        r4 = -42;
        goto L_0x0012;
    L_0x0022:
        r1 = 8;
        if (r4 != r1) goto L_0x0029;
    L_0x0026:
        r4 = -41;
        goto L_0x0012;
    L_0x0029:
        r1 = 16;
        if (r4 != r1) goto L_0x0030;
    L_0x002d:
        r4 = -40;
        goto L_0x0012;
    L_0x0030:
        r4 = (byte) r4;
        r2.writeByteAndByte(r0, r4);
    L_0x0034:
        r2.writeByte(r3);
        return r2;
    L_0x0038:
        r0 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r4 >= r0) goto L_0x0043;
    L_0x003c:
        r0 = -56;
        r4 = (short) r4;
        r2.writeByteAndShort(r0, r4);
        goto L_0x0034;
    L_0x0043:
        r0 = -55;
        r2.writeByteAndInt(r0, r4);
        goto L_0x0034;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessagePacker.packExtensionTypeHeader(byte, int):org.msgpack.core.MessagePacker");
    }

    public MessagePacker packFloat(float f) {
        writeByteAndFloat(Code.FLOAT32, f);
        return this;
    }

    public org.msgpack.core.MessagePacker packInt(int r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x003a in {4, 6, 9, 11, 12, 14, 18, 21, 24, 25} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = -32;
        if (r2 >= r0) goto L_0x0020;
    L_0x0004:
        r0 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        if (r2 >= r0) goto L_0x000e;
    L_0x0008:
        r0 = -46;
    L_0x000a:
        r1.writeByteAndInt(r0, r2);
        return r1;
    L_0x000e:
        r0 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        if (r2 >= r0) goto L_0x0019;
    L_0x0012:
        r0 = -47;
    L_0x0014:
        r2 = (short) r2;
        r1.writeByteAndShort(r0, r2);
        return r1;
    L_0x0019:
        r0 = -48;
    L_0x001b:
        r2 = (byte) r2;
        r1.writeByteAndByte(r0, r2);
        return r1;
    L_0x0020:
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 >= r0) goto L_0x0029;
    L_0x0024:
        r2 = (byte) r2;
        r1.writeByte(r2);
        return r1;
    L_0x0029:
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r2 >= r0) goto L_0x0030;
    L_0x002d:
        r0 = -52;
        goto L_0x001b;
    L_0x0030:
        r0 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r2 >= r0) goto L_0x0037;
    L_0x0034:
        r0 = -51;
        goto L_0x0014;
    L_0x0037:
        r0 = -50;
        goto L_0x000a;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessagePacker.packInt(int):org.msgpack.core.MessagePacker");
    }

    public org.msgpack.core.MessagePacker packLong(long r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x0064 in {6, 8, 9, 11, 14, 16, 17, 19, 23, 28, 29, 32, 33} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r3 = this;
        r0 = -32;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x0036;
    L_0x0006:
        r0 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x0020;
    L_0x000c:
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x0019;
    L_0x0013:
        r0 = -45;
    L_0x0015:
        r3.writeByteAndLong(r0, r4);
        return r3;
    L_0x0019:
        r0 = -46;
    L_0x001b:
        r4 = (int) r4;
        r3.writeByteAndInt(r0, r4);
        return r3;
    L_0x0020:
        r0 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x002e;
    L_0x0026:
        r0 = -47;
    L_0x0028:
        r4 = (int) r4;
        r4 = (short) r4;
        r3.writeByteAndShort(r0, r4);
        return r3;
    L_0x002e:
        r0 = -48;
    L_0x0030:
        r4 = (int) r4;
        r4 = (byte) r4;
        r3.writeByteAndByte(r0, r4);
        return r3;
    L_0x0036:
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x0042;
    L_0x003c:
        r4 = (int) r4;
        r4 = (byte) r4;
        r3.writeByte(r4);
        return r3;
    L_0x0042:
        r0 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x0055;
    L_0x0049:
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x0052;
    L_0x004f:
        r0 = -52;
        goto L_0x0030;
    L_0x0052:
        r0 = -51;
        goto L_0x0028;
    L_0x0055:
        r0 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x0061;
    L_0x005e:
        r0 = -50;
        goto L_0x001b;
    L_0x0061:
        r0 = -49;
        goto L_0x0015;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessagePacker.packLong(long):org.msgpack.core.MessagePacker");
    }

    public MessagePacker packMapHeader(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("map size must be >= 0");
        } else if (i < 16) {
            writeByte((byte) (i | -128));
            return this;
        } else if (i < 65536) {
            writeByteAndShort(Code.MAP16, (short) i);
            return this;
        } else {
            writeByteAndInt(Code.MAP32, i);
            return this;
        }
    }

    public MessagePacker packNil() {
        writeByte(Code.NIL);
        return this;
    }

    public MessagePacker packRawStringHeader(int i) {
        if (i < 32) {
            writeByte((byte) (i | -96));
            return this;
        } else if (this.str8FormatSupport && i < 256) {
            writeByteAndByte(Code.STR8, (byte) i);
            return this;
        } else if (i < 65536) {
            writeByteAndShort(Code.STR16, (short) i);
            return this;
        } else {
            writeByteAndInt(Code.STR32, i);
            return this;
        }
    }

    public org.msgpack.core.MessagePacker packShort(short r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0028 in {4, 6, 7, 9, 13, 16, 17} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = -32;
        if (r2 >= r0) goto L_0x0015;
    L_0x0004:
        r0 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        if (r2 >= r0) goto L_0x000e;
    L_0x0008:
        r0 = -47;
    L_0x000a:
        r1.writeByteAndShort(r0, r2);
        return r1;
    L_0x000e:
        r0 = -48;
    L_0x0010:
        r2 = (byte) r2;
        r1.writeByteAndByte(r0, r2);
        return r1;
    L_0x0015:
        r0 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 >= r0) goto L_0x001e;
    L_0x0019:
        r2 = (byte) r2;
        r1.writeByte(r2);
        return r1;
    L_0x001e:
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        if (r2 >= r0) goto L_0x0025;
    L_0x0022:
        r0 = -52;
        goto L_0x0010;
    L_0x0025:
        r0 = -51;
        goto L_0x000a;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessagePacker.packShort(short):org.msgpack.core.MessagePacker");
    }

    public org.msgpack.core.MessagePacker packString(java.lang.String r8) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:23:0x0091
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.modifyBlocksTree(BlockProcessor.java:248)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r7 = this;
        r0 = r8.length();
        if (r0 > 0) goto L_0x000b;
    L_0x0006:
        r8 = 0;
        r7.packRawStringHeader(r8);
        return r7;
    L_0x000b:
        r0 = CORRUPTED_CHARSET_ENCODER;
        if (r0 != 0) goto L_0x010a;
    L_0x000f:
        r0 = r8.length();
        r1 = r7.smallStringOptimizationThreshold;
        if (r0 >= r1) goto L_0x0019;
    L_0x0017:
        goto L_0x010a;
    L_0x0019:
        r0 = r8.length();
        r1 = -38;
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r3 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r4 = 3;
        r5 = 2;
        if (r0 >= r2) goto L_0x0092;
    L_0x0027:
        r0 = r8.length();
        r0 = r0 * 6;
        r0 = r0 + r5;
        r0 = r0 + 1;
        r7.ensureCapacity(r0);
        r0 = r7.position;
        r0 = r0 + r5;
        r0 = r7.encodeStringToBufferAt(r0, r8);
        if (r0 < 0) goto L_0x0106;
    L_0x003c:
        r8 = r7.str8FormatSupport;
        if (r8 == 0) goto L_0x0061;
    L_0x0040:
        if (r0 >= r2) goto L_0x0061;
    L_0x0042:
        r8 = r7.buffer;
        r1 = r7.position;
        r2 = r1 + 1;
        r7.position = r2;
        r2 = -39;
        r8.putByte(r1, r2);
        r8 = r7.buffer;
        r1 = r7.position;
        r2 = r1 + 1;
        r7.position = r2;
        r2 = (byte) r0;
        r8.putByte(r1, r2);
    L_0x005b:
        r8 = r7.position;
        r8 = r8 + r0;
        r7.position = r8;
        return r7;
    L_0x0061:
        if (r0 < r3) goto L_0x006b;
    L_0x0063:
        r8 = new java.lang.IllegalArgumentException;
        r0 = "Unexpected UTF-8 encoder state";
        r8.<init>(r0);
        throw r8;
    L_0x006b:
        r8 = r7.buffer;
        r2 = r7.position;
        r2 = r2 + r4;
        r3 = r7.buffer;
        r4 = r7.position;
        r4 = r4 + r5;
        r8.putMessageBuffer(r2, r3, r4, r0);
        r8 = r7.buffer;
        r2 = r7.position;
        r3 = r2 + 1;
        r7.position = r3;
        r8.putByte(r2, r1);
        r8 = r7.buffer;
        r1 = r7.position;
        r2 = (short) r0;
        r8.putShort(r1, r2);
        r8 = r7.position;
        r8 = r8 + r5;
        r7.position = r8;
        goto L_0x005b;
        return r7;
    L_0x0092:
        r0 = r8.length();
        if (r0 >= r3) goto L_0x0106;
    L_0x0098:
        r0 = r8.length();
        r0 = r0 * 6;
        r0 = r0 + r4;
        r0 = r0 + r5;
        r7.ensureCapacity(r0);
        r0 = r7.position;
        r0 = r0 + r4;
        r0 = r7.encodeStringToBufferAt(r0, r8);
        if (r0 < 0) goto L_0x0106;
    L_0x00ac:
        if (r0 >= r3) goto L_0x00cc;
    L_0x00ae:
        r8 = r7.buffer;
        r2 = r7.position;
        r3 = r2 + 1;
        r7.position = r3;
        r8.putByte(r2, r1);
        r8 = r7.buffer;
        r1 = r7.position;
        r2 = (short) r0;
        r8.putShort(r1, r2);
        r8 = r7.position;
        r8 = r8 + r5;
    L_0x00c4:
        r7.position = r8;
        r8 = r7.position;
        r8 = r8 + r0;
        r7.position = r8;
        return r7;
    L_0x00cc:
        r1 = (long) r0;
        r5 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r8 < 0) goto L_0x00de;
    L_0x00d6:
        r8 = new java.lang.IllegalArgumentException;
        r0 = "Unexpected UTF-8 encoder state";
        r8.<init>(r0);
        throw r8;
    L_0x00de:
        r8 = r7.buffer;
        r1 = r7.position;
        r1 = r1 + 5;
        r2 = r7.buffer;
        r3 = r7.position;
        r3 = r3 + r4;
        r8.putMessageBuffer(r1, r2, r3, r0);
        r8 = r7.buffer;
        r1 = r7.position;
        r2 = r1 + 1;
        r7.position = r2;
        r2 = -37;
        r8.putByte(r1, r2);
        r8 = r7.buffer;
        r1 = r7.position;
        r8.putInt(r1, r0);
        r8 = r7.position;
        r8 = r8 + 4;
        goto L_0x00c4;
        return r7;
    L_0x0106:
        r7.packStringWithGetBytes(r8);
        return r7;
    L_0x010a:
        r7.packStringWithGetBytes(r8);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessagePacker.packString(java.lang.String):org.msgpack.core.MessagePacker");
    }

    public MessagePacker packValue(Value value) {
        value.writeTo(this);
        return this;
    }

    public MessageBufferOutput reset(MessageBufferOutput messageBufferOutput) {
        messageBufferOutput = (MessageBufferOutput) Preconditions.checkNotNull(messageBufferOutput, "MessageBufferOutput is null");
        flush();
        MessageBufferOutput messageBufferOutput2 = this.out;
        this.out = messageBufferOutput;
        this.totalFlushBytes = 0;
        return messageBufferOutput2;
    }

    public MessagePacker writePayload(byte[] bArr) {
        return writePayload(bArr, 0, bArr.length);
    }

    public MessagePacker writePayload(byte[] bArr, int i, int i2) {
        if (this.buffer != null && this.buffer.size() - this.position >= i2) {
            if (i2 <= this.bufferFlushThreshold) {
                this.buffer.putBytes(this.position, bArr, i, i2);
                this.position += i2;
                return this;
            }
        }
        flush();
        this.out.write(bArr, i, i2);
        this.totalFlushBytes += (long) i2;
        return this;
    }
}
