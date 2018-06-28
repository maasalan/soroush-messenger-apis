package org.msgpack.packer;

import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.jivesoftware.smack.util.StringUtils;
import org.msgpack.MessagePack;
import org.msgpack.MessageTypeException;
import org.msgpack.core.MessagePack.Code;
import org.msgpack.io.Output;
import org.msgpack.io.StreamOutput;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class MessagePackPacker extends AbstractPacker {
    protected final Output out;
    private PackerStack stack;

    public MessagePackPacker(MessagePack messagePack, OutputStream outputStream) {
        this(messagePack, new StreamOutput(outputStream));
    }

    protected MessagePackPacker(MessagePack messagePack, Output output) {
        super(messagePack);
        this.stack = new PackerStack();
        this.out = output;
    }

    public void close() {
        this.out.close();
    }

    public void flush() {
        this.out.flush();
    }

    public void reset() {
        this.stack.clear();
    }

    public Packer writeArrayBegin(int i) {
        if (i < 16) {
            this.out.writeByte((byte) (IjkMediaMeta.FF_PROFILE_H264_HIGH_444 | i));
        } else if (i < 65536) {
            this.out.writeByteAndShort(Code.ARRAY16, (short) i);
        } else {
            this.out.writeByteAndInt(Code.ARRAY32, i);
        }
        this.stack.reduceCount();
        this.stack.pushArray(i);
        return this;
    }

    public Packer writeArrayEnd(boolean z) {
        if (this.stack.topIsArray()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (z) {
                    StringBuilder stringBuilder = new StringBuilder("writeArrayEnd(check=true) is called but the array is not end: ");
                    stringBuilder.append(topCount);
                    throw new MessageTypeException(stringBuilder.toString());
                }
                for (int i = 0; i < topCount; i++) {
                    writeNil();
                }
            }
            this.stack.pop();
            return this;
        }
        throw new MessageTypeException("writeArrayEnd() is called but writeArrayBegin() is not called");
    }

    protected void writeBigInteger(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            writeLong(bigInteger.longValue());
        } else if (bigInteger.bitLength() == 64 && bigInteger.signum() == 1) {
            this.out.writeByteAndLong(Code.UINT64, bigInteger.longValue());
        } else {
            throw new MessageTypeException("MessagePack can't serialize BigInteger larger than (2^64)-1");
        }
        this.stack.reduceCount();
    }

    protected void writeBoolean(boolean z) {
        Output output;
        byte b;
        if (z) {
            output = this.out;
            b = Code.TRUE;
        } else {
            output = this.out;
            b = Code.FALSE;
        }
        output.writeByte(b);
        this.stack.reduceCount();
    }

    protected void writeByte(byte b) {
        if (b < Code.NEGFIXINT_PREFIX) {
            this.out.writeByteAndByte(Code.INT8, b);
        } else {
            this.out.writeByte(b);
        }
        this.stack.reduceCount();
    }

    protected void writeByteArray(byte[] bArr, int i, int i2) {
        if (i2 < 32) {
            this.out.writeByte((byte) (160 | i2));
        } else if (i2 < 65536) {
            this.out.writeByteAndShort(Code.STR16, (short) i2);
        } else {
            this.out.writeByteAndInt(Code.STR32, i2);
        }
        this.out.write(bArr, i, i2);
        this.stack.reduceCount();
    }

    protected void writeByteBuffer(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < 32) {
            this.out.writeByte((byte) (remaining | 160));
        } else if (remaining < 65536) {
            this.out.writeByteAndShort(Code.STR16, (short) remaining);
        } else {
            this.out.writeByteAndInt(Code.STR32, remaining);
        }
        remaining = byteBuffer.position();
        try {
            this.out.write(byteBuffer);
            this.stack.reduceCount();
        } finally {
            byteBuffer.position(remaining);
        }
    }

    protected void writeDouble(double d) {
        this.out.writeByteAndDouble(Code.FLOAT64, d);
        this.stack.reduceCount();
    }

    protected void writeFloat(float f) {
        this.out.writeByteAndFloat(Code.FLOAT32, f);
        this.stack.reduceCount();
    }

    protected void writeInt(int i) {
        Output output;
        byte b;
        if (i < -32) {
            if (i < -32768) {
                output = this.out;
                b = Code.INT32;
            } else if (i < -128) {
                output = this.out;
                b = Code.INT16;
                output.writeByteAndShort(b, (short) i);
                this.stack.reduceCount();
            } else {
                output = this.out;
                b = Code.INT8;
                output.writeByteAndByte(b, (byte) i);
                this.stack.reduceCount();
            }
        } else if (i < 128) {
            this.out.writeByte((byte) i);
            this.stack.reduceCount();
        } else if (i < 256) {
            output = this.out;
            b = Code.UINT8;
            output.writeByteAndByte(b, (byte) i);
            this.stack.reduceCount();
        } else if (i < 65536) {
            output = this.out;
            b = Code.UINT16;
            output.writeByteAndShort(b, (short) i);
            this.stack.reduceCount();
        } else {
            output = this.out;
            b = Code.UINT32;
        }
        output.writeByteAndInt(b, i);
        this.stack.reduceCount();
    }

    protected void writeLong(long j) {
        Output output;
        byte b;
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    output = this.out;
                    b = Code.INT64;
                } else {
                    output = this.out;
                    b = Code.INT32;
                    output.writeByteAndInt(b, (int) j);
                    this.stack.reduceCount();
                }
            } else if (j < -128) {
                output = this.out;
                b = Code.INT16;
                output.writeByteAndShort(b, (short) ((int) j));
                this.stack.reduceCount();
            } else {
                output = this.out;
                b = Code.INT8;
                output.writeByteAndByte(b, (byte) ((int) j));
                this.stack.reduceCount();
            }
        } else if (j < 128) {
            this.out.writeByte((byte) ((int) j));
            this.stack.reduceCount();
        } else if (j < IjkMediaMeta.AV_CH_TOP_BACK_CENTER) {
            if (j < 256) {
                output = this.out;
                b = Code.UINT8;
                output.writeByteAndByte(b, (byte) ((int) j));
                this.stack.reduceCount();
            }
            output = this.out;
            b = Code.UINT16;
            output.writeByteAndShort(b, (short) ((int) j));
            this.stack.reduceCount();
        } else if (j < IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            output = this.out;
            b = Code.UINT32;
            output.writeByteAndInt(b, (int) j);
            this.stack.reduceCount();
        } else {
            output = this.out;
            b = Code.UINT64;
        }
        output.writeByteAndLong(b, j);
        this.stack.reduceCount();
    }

    public Packer writeMapBegin(int i) {
        if (i < 16) {
            this.out.writeByte((byte) (128 | i));
        } else if (i < 65536) {
            this.out.writeByteAndShort(Code.MAP16, (short) i);
        } else {
            this.out.writeByteAndInt(Code.MAP32, i);
        }
        this.stack.reduceCount();
        this.stack.pushMap(i);
        return this;
    }

    public Packer writeMapEnd(boolean z) {
        if (this.stack.topIsMap()) {
            int topCount = this.stack.getTopCount();
            if (topCount > 0) {
                if (z) {
                    StringBuilder stringBuilder = new StringBuilder("writeMapEnd(check=true) is called but the map is not end: ");
                    stringBuilder.append(topCount);
                    throw new MessageTypeException(stringBuilder.toString());
                }
                for (int i = 0; i < topCount; i++) {
                    writeNil();
                }
            }
            this.stack.pop();
            return this;
        }
        throw new MessageTypeException("writeMapEnd() is called but writeMapBegin() is not called");
    }

    public Packer writeNil() {
        this.out.writeByte(Code.NIL);
        this.stack.reduceCount();
        return this;
    }

    protected void writeShort(short s) {
        Output output;
        byte b;
        if (s < (short) -32) {
            if (s < (short) -128) {
                output = this.out;
                b = Code.INT16;
            } else {
                output = this.out;
                b = Code.INT8;
                output.writeByteAndByte(b, (byte) s);
                this.stack.reduceCount();
            }
        } else if (s < (short) 128) {
            this.out.writeByte((byte) s);
            this.stack.reduceCount();
        } else if (s < (short) 256) {
            output = this.out;
            b = Code.UINT8;
            output.writeByteAndByte(b, (byte) s);
            this.stack.reduceCount();
        } else {
            output = this.out;
            b = Code.UINT16;
        }
        output.writeByteAndShort(b, s);
        this.stack.reduceCount();
    }

    protected void writeString(String str) {
        try {
            byte[] bytes = str.getBytes(StringUtils.UTF8);
            writeByteArray(bytes, 0, bytes.length);
            this.stack.reduceCount();
        } catch (Throwable e) {
            throw new MessageTypeException(e);
        }
    }
}
