package org.msgpack.unpacker;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.msgpack.MessagePack;
import org.msgpack.MessageTypeException;
import org.msgpack.io.BufferReferer;
import org.msgpack.io.Input;
import org.msgpack.io.StreamInput;
import org.msgpack.packer.Unconverter;
import org.msgpack.type.ValueType;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class MessagePackUnpacker extends AbstractUnpacker {
    private static final byte REQUIRE_TO_READ_HEAD = (byte) -63;
    private final ArrayAccept arrayAccept;
    private final BigIntegerAccept bigIntegerAccept;
    private final ByteArrayAccept byteArrayAccept;
    private final DoubleAccept doubleAccept;
    private byte headByte;
    protected final Input in;
    private final IntAccept intAccept;
    private final LongAccept longAccept;
    private final MapAccept mapAccept;
    private byte[] raw;
    private int rawFilled;
    private final SkipAccept skipAccept;
    private final UnpackerStack stack;
    private final StringAccept stringAccept;
    private final ValueAccept valueAccept;

    public MessagePackUnpacker(MessagePack messagePack, InputStream inputStream) {
        this(messagePack, new StreamInput(inputStream));
    }

    protected MessagePackUnpacker(MessagePack messagePack, Input input) {
        super(messagePack);
        this.stack = new UnpackerStack();
        this.headByte = (byte) -63;
        this.intAccept = new IntAccept();
        this.longAccept = new LongAccept();
        this.bigIntegerAccept = new BigIntegerAccept();
        this.doubleAccept = new DoubleAccept();
        this.byteArrayAccept = new ByteArrayAccept();
        this.stringAccept = new StringAccept();
        this.arrayAccept = new ArrayAccept();
        this.mapAccept = new MapAccept();
        this.valueAccept = new ValueAccept();
        this.skipAccept = new SkipAccept();
        this.in = input;
    }

    private byte getHeadByte() {
        byte b = this.headByte;
        if (b != (byte) -63) {
            return b;
        }
        b = this.in.readByte();
        this.headByte = b;
        return b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean readOneWithoutStackLarge(org.msgpack.unpacker.Accept r8, int r9) {
        /*
        r7 = this;
        r0 = r9 & 255;
        r1 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r2 = -63;
        r3 = 1;
        if (r0 == r1) goto L_0x0233;
    L_0x0009:
        r1 = 0;
        r4 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r5 = 2;
        r6 = 0;
        switch(r0) {
            case 194: goto L_0x022e;
            case 195: goto L_0x0229;
            case 196: goto L_0x01e5;
            case 197: goto L_0x01a3;
            case 198: goto L_0x015c;
            default: goto L_0x0012;
        };
    L_0x0012:
        switch(r0) {
            case 202: goto L_0x0152;
            case 203: goto L_0x0148;
            case 204: goto L_0x013e;
            case 205: goto L_0x0134;
            case 206: goto L_0x012a;
            case 207: goto L_0x0120;
            case 208: goto L_0x0116;
            case 209: goto L_0x010c;
            case 210: goto L_0x0102;
            case 211: goto L_0x00f1;
            default: goto L_0x0015;
        };
    L_0x0015:
        switch(r0) {
            case 217: goto L_0x01e5;
            case 218: goto L_0x01a3;
            case 219: goto L_0x015c;
            case 220: goto L_0x00ca;
            case 221: goto L_0x0093;
            case 222: goto L_0x006c;
            case 223: goto L_0x002e;
            default: goto L_0x0018;
        };
    L_0x0018:
        r7.headByte = r2;
        r8 = new java.io.IOException;
        r0 = new java.lang.StringBuilder;
        r1 = "Invalid byte: ";
        r0.<init>(r1);
        r0.append(r9);
        r9 = r0.toString();
        r8.<init>(r9);
        throw r8;
    L_0x002e:
        r9 = r7.in;
        r9 = r9.getInt();
        if (r9 < 0) goto L_0x0050;
    L_0x0036:
        r0 = r7.mapSizeLimit;
        if (r9 < r0) goto L_0x003b;
    L_0x003a:
        goto L_0x0050;
    L_0x003b:
        r8.acceptMap(r9);
        r8 = r7.stack;
        r8.reduceCount();
        r8 = r7.stack;
        r8.pushMap(r9);
    L_0x0048:
        r8 = r7.in;
        r8.advance();
        r7.headByte = r2;
        return r6;
    L_0x0050:
        r8 = "Size of map (%d) over limit at %d";
        r0 = new java.lang.Object[r5];
        r9 = java.lang.Integer.valueOf(r9);
        r0[r6] = r9;
        r9 = r7.mapSizeLimit;
        r9 = java.lang.Integer.valueOf(r9);
        r0[r3] = r9;
        r8 = java.lang.String.format(r8, r0);
        r9 = new org.msgpack.unpacker.SizeLimitException;
        r9.<init>(r8);
        throw r9;
    L_0x006c:
        r9 = r7.in;
        r9 = r9.getShort();
        r9 = r9 & r4;
        r0 = r7.mapSizeLimit;
        if (r9 < r0) goto L_0x003b;
    L_0x0077:
        r8 = "Size of map (%d) over limit at %d";
        r0 = new java.lang.Object[r5];
        r9 = java.lang.Integer.valueOf(r9);
        r0[r6] = r9;
        r9 = r7.mapSizeLimit;
        r9 = java.lang.Integer.valueOf(r9);
        r0[r3] = r9;
        r8 = java.lang.String.format(r8, r0);
        r9 = new org.msgpack.unpacker.SizeLimitException;
        r9.<init>(r8);
        throw r9;
    L_0x0093:
        r9 = r7.in;
        r9 = r9.getInt();
        if (r9 < 0) goto L_0x00ae;
    L_0x009b:
        r0 = r7.arraySizeLimit;
        if (r9 < r0) goto L_0x00a0;
    L_0x009f:
        goto L_0x00ae;
    L_0x00a0:
        r8.acceptArray(r9);
        r8 = r7.stack;
        r8.reduceCount();
        r8 = r7.stack;
        r8.pushArray(r9);
        goto L_0x0048;
    L_0x00ae:
        r8 = "Size of array (%d) over limit at %d";
        r0 = new java.lang.Object[r5];
        r9 = java.lang.Integer.valueOf(r9);
        r0[r6] = r9;
        r9 = r7.arraySizeLimit;
        r9 = java.lang.Integer.valueOf(r9);
        r0[r3] = r9;
        r8 = java.lang.String.format(r8, r0);
        r9 = new org.msgpack.unpacker.SizeLimitException;
        r9.<init>(r8);
        throw r9;
    L_0x00ca:
        r9 = r7.in;
        r9 = r9.getShort();
        r9 = r9 & r4;
        r0 = r7.arraySizeLimit;
        if (r9 < r0) goto L_0x00a0;
    L_0x00d5:
        r8 = "Size of array (%d) over limit at %d";
        r0 = new java.lang.Object[r5];
        r9 = java.lang.Integer.valueOf(r9);
        r0[r6] = r9;
        r9 = r7.arraySizeLimit;
        r9 = java.lang.Integer.valueOf(r9);
        r0[r3] = r9;
        r8 = java.lang.String.format(r8, r0);
        r9 = new org.msgpack.unpacker.SizeLimitException;
        r9.<init>(r8);
        throw r9;
    L_0x00f1:
        r9 = r7.in;
        r0 = r9.getLong();
        r8.acceptInteger(r0);
    L_0x00fa:
        r8 = r7.in;
        r8.advance();
    L_0x00ff:
        r7.headByte = r2;
        return r3;
    L_0x0102:
        r9 = r7.in;
        r9 = r9.getInt();
        r8.acceptInteger(r9);
        goto L_0x00fa;
    L_0x010c:
        r9 = r7.in;
        r9 = r9.getShort();
        r8.acceptInteger(r9);
        goto L_0x00fa;
    L_0x0116:
        r9 = r7.in;
        r9 = r9.getByte();
        r8.acceptInteger(r9);
        goto L_0x00fa;
    L_0x0120:
        r9 = r7.in;
        r0 = r9.getLong();
        r8.acceptUnsignedInteger(r0);
        goto L_0x00fa;
    L_0x012a:
        r9 = r7.in;
        r9 = r9.getInt();
        r8.acceptUnsignedInteger(r9);
        goto L_0x00fa;
    L_0x0134:
        r9 = r7.in;
        r9 = r9.getShort();
        r8.acceptUnsignedInteger(r9);
        goto L_0x00fa;
    L_0x013e:
        r9 = r7.in;
        r9 = r9.getByte();
        r8.acceptUnsignedInteger(r9);
        goto L_0x00fa;
    L_0x0148:
        r9 = r7.in;
        r0 = r9.getDouble();
        r8.acceptDouble(r0);
        goto L_0x00fa;
    L_0x0152:
        r9 = r7.in;
        r9 = r9.getFloat();
        r8.acceptFloat(r9);
        goto L_0x00fa;
    L_0x015c:
        r9 = r7.in;
        r9 = r9.getInt();
        if (r9 != 0) goto L_0x0168;
    L_0x0164:
        r8.acceptEmptyRaw();
        goto L_0x00fa;
    L_0x0168:
        if (r9 < 0) goto L_0x0187;
    L_0x016a:
        r0 = r7.rawSizeLimit;
        if (r9 < r0) goto L_0x016f;
    L_0x016e:
        goto L_0x0187;
    L_0x016f:
        r0 = r7.in;
        r0.advance();
        r0 = r7.tryReferRawBody(r8, r9);
        if (r0 != 0) goto L_0x0184;
    L_0x017a:
        r7.readRawBody(r9);
        r9 = r7.raw;
        r8.acceptRaw(r9);
        r7.raw = r1;
    L_0x0184:
        r7.headByte = r2;
        return r3;
    L_0x0187:
        r8 = "Size of raw (%d) over limit at %d";
        r0 = new java.lang.Object[r5];
        r9 = java.lang.Integer.valueOf(r9);
        r0[r6] = r9;
        r9 = r7.rawSizeLimit;
        r9 = java.lang.Integer.valueOf(r9);
        r0[r3] = r9;
        r8 = java.lang.String.format(r8, r0);
        r9 = new org.msgpack.unpacker.SizeLimitException;
        r9.<init>(r8);
        throw r9;
    L_0x01a3:
        r9 = r7.in;
        r9 = r9.getShort();
        r9 = r9 & r4;
        if (r9 != 0) goto L_0x01ad;
    L_0x01ac:
        goto L_0x0164;
    L_0x01ad:
        r0 = r7.rawSizeLimit;
        if (r9 < r0) goto L_0x01cd;
    L_0x01b1:
        r8 = "Size of raw (%d) over limit at %d";
        r0 = new java.lang.Object[r5];
        r9 = java.lang.Integer.valueOf(r9);
        r0[r6] = r9;
        r9 = r7.rawSizeLimit;
        r9 = java.lang.Integer.valueOf(r9);
        r0[r3] = r9;
        r8 = java.lang.String.format(r8, r0);
        r9 = new org.msgpack.unpacker.SizeLimitException;
        r9.<init>(r8);
        throw r9;
    L_0x01cd:
        r0 = r7.in;
        r0.advance();
        r0 = r7.tryReferRawBody(r8, r9);
        if (r0 != 0) goto L_0x01e2;
    L_0x01d8:
        r7.readRawBody(r9);
        r9 = r7.raw;
        r8.acceptRaw(r9);
        r7.raw = r1;
    L_0x01e2:
        r7.headByte = r2;
        return r3;
    L_0x01e5:
        r9 = r7.in;
        r9 = r9.getByte();
        r9 = r9 & 255;
        if (r9 != 0) goto L_0x01f1;
    L_0x01ef:
        goto L_0x0164;
    L_0x01f1:
        r0 = r7.rawSizeLimit;
        if (r9 < r0) goto L_0x0211;
    L_0x01f5:
        r8 = "Size of raw (%d) over limit at %d";
        r0 = new java.lang.Object[r5];
        r9 = java.lang.Integer.valueOf(r9);
        r0[r6] = r9;
        r9 = r7.rawSizeLimit;
        r9 = java.lang.Integer.valueOf(r9);
        r0[r3] = r9;
        r8 = java.lang.String.format(r8, r0);
        r9 = new org.msgpack.unpacker.SizeLimitException;
        r9.<init>(r8);
        throw r9;
    L_0x0211:
        r0 = r7.in;
        r0.advance();
        r0 = r7.tryReferRawBody(r8, r9);
        if (r0 != 0) goto L_0x0226;
    L_0x021c:
        r7.readRawBody(r9);
        r9 = r7.raw;
        r8.acceptRaw(r9);
        r7.raw = r1;
    L_0x0226:
        r7.headByte = r2;
        return r3;
    L_0x0229:
        r8.acceptBoolean(r3);
        goto L_0x00ff;
    L_0x022e:
        r8.acceptBoolean(r6);
        goto L_0x00ff;
    L_0x0233:
        r8.acceptNil();
        goto L_0x00ff;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.unpacker.MessagePackUnpacker.readOneWithoutStackLarge(org.msgpack.unpacker.Accept, int):boolean");
    }

    private void readRawBody(int i) {
        this.raw = new byte[i];
        this.rawFilled = 0;
        readRawBodyCont();
    }

    private void readRawBodyCont() {
        this.rawFilled += this.in.read(this.raw, this.rawFilled, this.raw.length - this.rawFilled);
        if (this.rawFilled < this.raw.length) {
            throw new EOFException();
        }
    }

    private boolean tryReferRawBody(BufferReferer bufferReferer, int i) {
        return this.in.tryRefer(bufferReferer, i);
    }

    public void close() {
        this.in.close();
    }

    public ValueType getNextType() {
        byte headByte = getHeadByte();
        if ((headByte & 128) == 0) {
            return ValueType.INTEGER;
        }
        int i = headByte & 224;
        if (i == 224) {
            return ValueType.INTEGER;
        }
        if (i == 160) {
            return ValueType.RAW;
        }
        i = headByte & 240;
        if (i == IjkMediaMeta.FF_PROFILE_H264_HIGH_444) {
            return ValueType.ARRAY;
        }
        if (i == 128) {
            return ValueType.MAP;
        }
        i = headByte & 255;
        if (i == 192) {
            return ValueType.NIL;
        }
        switch (i) {
            case 194:
            case 195:
                return ValueType.BOOLEAN;
            case 196:
            case 197:
            case 198:
                break;
            default:
                switch (i) {
                    case 202:
                    case 203:
                        return ValueType.FLOAT;
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                        return ValueType.INTEGER;
                    default:
                        switch (i) {
                            case 217:
                            case 218:
                            case 219:
                                break;
                            case 220:
                            case 221:
                                return ValueType.ARRAY;
                            case 222:
                            case 223:
                                return ValueType.MAP;
                            default:
                                StringBuilder stringBuilder = new StringBuilder("Invalid byte: ");
                                stringBuilder.append(headByte);
                                throw new IOException(stringBuilder.toString());
                        }
                }
        }
        return ValueType.RAW;
    }

    public int getReadByteCount() {
        return this.in.getReadByteCount();
    }

    public int readArrayBegin() {
        readOne(this.arrayAccept);
        return this.arrayAccept.size;
    }

    public void readArrayEnd(boolean z) {
        if (this.stack.topIsArray()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (z) {
                    throw new MessageTypeException("readArrayEnd(check=true) is called but the array is not end");
                }
                for (int i = 0; i < topCount; i++) {
                    skip();
                }
            }
            this.stack.pop();
            return;
        }
        throw new MessageTypeException("readArrayEnd() is called but readArrayBegin() is not called");
    }

    public BigInteger readBigInteger() {
        readOne(this.bigIntegerAccept);
        return this.bigIntegerAccept.value;
    }

    public boolean readBoolean() {
        this.stack.checkCount();
        int headByte = getHeadByte() & 255;
        if (headByte == 194) {
            this.stack.reduceCount();
            this.headByte = (byte) -63;
            return false;
        } else if (headByte == 195) {
            this.stack.reduceCount();
            this.headByte = (byte) -63;
            return true;
        } else {
            throw new MessageTypeException("Expected Boolean but got not boolean value");
        }
    }

    public byte readByte() {
        this.stack.checkCount();
        readOneWithoutStack(this.intAccept);
        int i = this.intAccept.value;
        if (i >= -128) {
            if (i <= 127) {
                this.stack.reduceCount();
                return (byte) i;
            }
        }
        throw new MessageTypeException();
    }

    public byte[] readByteArray() {
        readOne(this.byteArrayAccept);
        return this.byteArrayAccept.value;
    }

    public double readDouble() {
        readOne(this.doubleAccept);
        return this.doubleAccept.value;
    }

    public float readFloat() {
        readOne(this.doubleAccept);
        return (float) this.doubleAccept.value;
    }

    public int readInt() {
        readOne(this.intAccept);
        return this.intAccept.value;
    }

    public long readLong() {
        readOne(this.longAccept);
        return this.longAccept.value;
    }

    public int readMapBegin() {
        readOne(this.mapAccept);
        return this.mapAccept.size;
    }

    public void readMapEnd(boolean z) {
        if (this.stack.topIsMap()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (z) {
                    throw new MessageTypeException("readMapEnd(check=true) is called but the map is not end");
                }
                for (int i = 0; i < topCount; i++) {
                    skip();
                }
            }
            this.stack.pop();
            return;
        }
        throw new MessageTypeException("readMapEnd() is called but readMapBegin() is not called");
    }

    public void readNil() {
        this.stack.checkCount();
        if ((getHeadByte() & 255) == 192) {
            this.stack.reduceCount();
            this.headByte = (byte) -63;
            return;
        }
        throw new MessageTypeException("Expected nil but got not nil value");
    }

    final void readOne(Accept accept) {
        this.stack.checkCount();
        if (readOneWithoutStack(accept)) {
            this.stack.reduceCount();
        }
    }

    final boolean readOneWithoutStack(Accept accept) {
        if (this.raw != null) {
            readRawBodyCont();
            accept.acceptRaw(this.raw);
            this.raw = null;
        } else {
            int headByte = getHeadByte();
            if ((headByte & 128) != 0) {
                int i = headByte & 224;
                if (i != 224) {
                    if (i == 160) {
                        headByte &= 31;
                        if (headByte == 0) {
                            accept.acceptEmptyRaw();
                        } else {
                            if (!tryReferRawBody(accept, headByte)) {
                                readRawBody(headByte);
                                accept.acceptRaw(this.raw);
                                this.raw = null;
                            }
                            this.headByte = (byte) -63;
                            return true;
                        }
                    }
                    int i2 = headByte & 240;
                    if (i2 == IjkMediaMeta.FF_PROFILE_H264_HIGH_444) {
                        headByte &= 15;
                        accept.acceptArray(headByte);
                        this.stack.reduceCount();
                        this.stack.pushArray(headByte);
                    } else if (i2 != 128) {
                        return readOneWithoutStackLarge(accept, headByte);
                    } else {
                        headByte &= 15;
                        accept.acceptMap(headByte);
                        this.stack.reduceCount();
                        this.stack.pushMap(headByte);
                    }
                    this.headByte = (byte) -63;
                    return false;
                }
            }
            accept.acceptInteger(headByte);
        }
        this.headByte = (byte) -63;
        return true;
    }

    public short readShort() {
        this.stack.checkCount();
        readOneWithoutStack(this.intAccept);
        int i = this.intAccept.value;
        if (i >= -32768) {
            if (i <= 32767) {
                this.stack.reduceCount();
                return (short) i;
            }
        }
        throw new MessageTypeException();
    }

    public String readString() {
        readOne(this.stringAccept);
        return this.stringAccept.value;
    }

    protected void readValue(Unconverter unconverter) {
        if (unconverter.getResult() != null) {
            unconverter.resetResult();
        }
        this.valueAccept.setUnconverter(unconverter);
        this.stack.checkCount();
        if (readOneWithoutStack(this.valueAccept)) {
            this.stack.reduceCount();
            if (unconverter.getResult() != null) {
                return;
            }
        }
        while (true) {
            if (this.stack.getTopCount() == 0) {
                if (this.stack.topIsArray()) {
                    unconverter.writeArrayEnd(true);
                } else if (this.stack.topIsMap()) {
                    unconverter.writeMapEnd(true);
                } else {
                    throw new RuntimeException("invalid stack");
                }
                this.stack.pop();
                if (unconverter.getResult() != null) {
                    return;
                }
            } else {
                readOne(this.valueAccept);
            }
        }
    }

    public void reset() {
        this.raw = null;
        this.stack.clear();
    }

    public void resetReadByteCount() {
        this.in.resetReadByteCount();
    }

    public void skip() {
        this.stack.checkCount();
        if (readOneWithoutStack(this.skipAccept)) {
            this.stack.reduceCount();
            return;
        }
        int depth = this.stack.getDepth() - 1;
        while (true) {
            if (this.stack.getTopCount() == 0) {
                this.stack.pop();
                if (this.stack.getDepth() <= depth) {
                    return;
                }
            } else {
                readOne(this.skipAccept);
            }
        }
    }

    protected boolean tryReadNil() {
        this.stack.checkCount();
        if ((getHeadByte() & 255) != 192) {
            return false;
        }
        this.stack.reduceCount();
        this.headByte = (byte) -63;
        return true;
    }

    public boolean trySkipNil() {
        if (this.stack.getDepth() > 0 && this.stack.getTopCount() <= 0) {
            return true;
        }
        if ((getHeadByte() & 255) != 192) {
            return false;
        }
        this.stack.reduceCount();
        this.headByte = (byte) -63;
        return true;
    }
}
