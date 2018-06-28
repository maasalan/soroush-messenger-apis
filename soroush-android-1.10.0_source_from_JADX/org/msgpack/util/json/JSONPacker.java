package org.msgpack.util.json;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.jivesoftware.smack.util.StringUtils;
import org.msgpack.MessagePack;
import org.msgpack.MessageTypeException;
import org.msgpack.io.Output;
import org.msgpack.io.StreamOutput;
import org.msgpack.packer.AbstractPacker;
import org.msgpack.packer.Packer;
import org.msgpack.packer.PackerStack;

public class JSONPacker extends AbstractPacker {
    private static final byte BACKSLASH = (byte) 92;
    private static final byte COLON = (byte) 58;
    private static final byte COMMA = (byte) 44;
    private static final int[] ESCAPE_TABLE = new int[128];
    private static final byte[] FALSE = new byte[]{(byte) 102, (byte) 97, (byte) 108, (byte) 115, (byte) 101};
    private static final int FLAG_FIRST_ELEMENT = 1;
    private static final int FLAG_MAP_KEY = 2;
    private static final int FLAG_MAP_VALUE = 4;
    private static final byte[] HEX_TABLE;
    private static final byte LEFT_BR = (byte) 91;
    private static final byte LEFT_WN = (byte) 123;
    private static final byte[] NULL = new byte[]{(byte) 110, (byte) 117, (byte) 108, (byte) 108};
    private static final byte QUOTE = (byte) 34;
    private static final byte RIGHT_BR = (byte) 93;
    private static final byte RIGHT_WN = (byte) 125;
    private static final byte[] TRUE = new byte[]{(byte) 116, (byte) 114, (byte) 117, (byte) 101};
    private static final byte ZERO = (byte) 48;
    private CharsetDecoder decoder;
    private int[] flags;
    protected final Output out;
    private PackerStack stack;

    static {
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            ESCAPE_TABLE[i2] = -1;
        }
        ESCAPE_TABLE[34] = 34;
        ESCAPE_TABLE[92] = 92;
        ESCAPE_TABLE[8] = 98;
        ESCAPE_TABLE[9] = 116;
        ESCAPE_TABLE[12] = 102;
        ESCAPE_TABLE[10] = 110;
        ESCAPE_TABLE[13] = 114;
        char[] toCharArray = "0123456789ABCDEF".toCharArray();
        HEX_TABLE = new byte[toCharArray.length];
        while (i < toCharArray.length) {
            HEX_TABLE[i] = (byte) toCharArray[i];
            i++;
        }
    }

    public JSONPacker(OutputStream outputStream) {
        this(new MessagePack(), outputStream);
    }

    public JSONPacker(MessagePack messagePack, OutputStream outputStream) {
        this(messagePack, new StreamOutput(outputStream));
    }

    protected JSONPacker(MessagePack messagePack, Output output) {
        super(messagePack);
        this.stack = new PackerStack();
        this.out = output;
        this.stack = new PackerStack();
        this.flags = new int[128];
        this.decoder = Charset.forName(StringUtils.UTF8).newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
    }

    private void beginElement() {
        if ((this.flags[this.stack.getDepth()] & 2) != 0) {
            throw new IOException("Key of a map must be a string in JSON");
        }
        beginStringElement();
    }

    private void beginStringElement() {
        int i = this.flags[this.stack.getDepth()];
        if ((i & 4) != 0) {
            this.out.writeByte(COLON);
            return;
        }
        if (this.stack.getDepth() > 0 && (i & 1) == 0) {
            this.out.writeByte(COMMA);
        }
    }

    private void endElement() {
        int i = this.flags[this.stack.getDepth()];
        if ((i & 2) != 0) {
            i = (i & -3) | 4;
        } else if ((i & 4) != 0) {
            i = (i & -5) | 2;
        }
        this.flags[this.stack.getDepth()] = i & -2;
        this.stack.reduceCount();
    }

    private static void escape(Output output, String str) {
        byte[] bArr = new byte[]{BACKSLASH, (byte) 117, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        char[] toCharArray = str.toCharArray();
        for (char c : toCharArray) {
            if (c <= '') {
                int i = ESCAPE_TABLE[c];
                if (i == 0) {
                    bArr[2] = (byte) c;
                    output.write(bArr, 2, 1);
                } else if (i > 0) {
                    bArr[2] = BACKSLASH;
                    bArr[3] = (byte) i;
                    output.write(bArr, 2, 2);
                } else {
                    bArr[2] = ZERO;
                    bArr[3] = ZERO;
                    bArr[4] = HEX_TABLE[c >> 4];
                    bArr[5] = HEX_TABLE[c & 15];
                }
            } else if (c <= '߿') {
                bArr[2] = (byte) (192 | (c >> 6));
                bArr[3] = (byte) ((c & 63) | 128);
                output.write(bArr, 2, 2);
            } else if (c < '?' || c > '?') {
                bArr[2] = (byte) (224 | (c >> 12));
                bArr[3] = (byte) (((c >> 6) & 63) | 128);
                bArr[4] = (byte) ((c & 63) | 128);
                output.write(bArr, 2, 3);
            } else {
                bArr[2] = HEX_TABLE[(c >> 12) & 15];
                bArr[3] = HEX_TABLE[(c >> 8) & 15];
                bArr[4] = HEX_TABLE[(c >> 4) & 15];
                bArr[5] = HEX_TABLE[c & 15];
            }
            output.write(bArr, 0, 6);
        }
    }

    private void escape(Output output, ByteBuffer byteBuffer) {
        escape(output, this.decoder.decode(byteBuffer).toString());
    }

    private void escape(Output output, byte[] bArr, int i, int i2) {
        escape(output, ByteBuffer.wrap(bArr, i, i2));
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
        beginElement();
        this.out.writeByte(LEFT_BR);
        endElement();
        this.stack.pushArray(i);
        this.flags[this.stack.getDepth()] = 1;
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
            this.out.writeByte(RIGHT_BR);
            return this;
        }
        throw new MessageTypeException("writeArrayEnd() is called but writeArrayBegin() is not called");
    }

    protected void writeBigInteger(BigInteger bigInteger) {
        beginElement();
        byte[] bytes = bigInteger.toString().getBytes();
        this.out.write(bytes, 0, bytes.length);
        endElement();
    }

    protected void writeBoolean(boolean z) {
        Output output;
        byte[] bArr;
        int length;
        beginElement();
        if (z) {
            output = this.out;
            bArr = TRUE;
            length = TRUE.length;
        } else {
            output = this.out;
            bArr = FALSE;
            length = FALSE.length;
        }
        output.write(bArr, 0, length);
        endElement();
    }

    protected void writeByte(byte b) {
        beginElement();
        byte[] bytes = Byte.toString(b).getBytes();
        this.out.write(bytes, 0, bytes.length);
        endElement();
    }

    protected void writeByteArray(byte[] bArr, int i, int i2) {
        beginStringElement();
        this.out.writeByte(QUOTE);
        escape(this.out, bArr, i, i2);
        this.out.writeByte(QUOTE);
        endElement();
    }

    protected void writeByteBuffer(ByteBuffer byteBuffer) {
        beginStringElement();
        this.out.writeByte(QUOTE);
        int position = byteBuffer.position();
        try {
            escape(this.out, byteBuffer);
            this.out.writeByte(QUOTE);
            endElement();
        } finally {
            byteBuffer.position(position);
        }
    }

    protected void writeDouble(double d) {
        beginElement();
        Double valueOf = Double.valueOf(d);
        if (!valueOf.isInfinite()) {
            if (!valueOf.isNaN()) {
                byte[] bytes = Double.toString(d).getBytes();
                this.out.write(bytes, 0, bytes.length);
                endElement();
                return;
            }
        }
        throw new IOException("JSONPacker doesn't support NaN and infinite float value");
    }

    protected void writeFloat(float f) {
        beginElement();
        Float valueOf = Float.valueOf(f);
        if (!valueOf.isInfinite()) {
            if (!valueOf.isNaN()) {
                byte[] bytes = Float.toString(f).getBytes();
                this.out.write(bytes, 0, bytes.length);
                endElement();
                return;
            }
        }
        throw new IOException("JSONPacker doesn't support NaN and infinite float value");
    }

    protected void writeInt(int i) {
        beginElement();
        byte[] bytes = Integer.toString(i).getBytes();
        this.out.write(bytes, 0, bytes.length);
        endElement();
    }

    protected void writeLong(long j) {
        beginElement();
        byte[] bytes = Long.toString(j).getBytes();
        this.out.write(bytes, 0, bytes.length);
        endElement();
    }

    public Packer writeMapBegin(int i) {
        beginElement();
        this.out.writeByte(LEFT_WN);
        endElement();
        this.stack.pushMap(i);
        this.flags[this.stack.getDepth()] = 3;
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
            this.out.writeByte(RIGHT_WN);
            return this;
        }
        throw new MessageTypeException("writeMapEnd() is called but writeMapBegin() is not called");
    }

    public Packer writeNil() {
        beginElement();
        this.out.write(NULL, 0, NULL.length);
        endElement();
        return this;
    }

    protected void writeShort(short s) {
        beginElement();
        byte[] bytes = Short.toString(s).getBytes();
        this.out.write(bytes, 0, bytes.length);
        endElement();
    }

    protected void writeString(String str) {
        beginStringElement();
        this.out.writeByte(QUOTE);
        escape(this.out, str);
        this.out.writeByte(QUOTE);
        endElement();
    }
}
