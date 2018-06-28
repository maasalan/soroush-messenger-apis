package org.msgpack.core;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.io.Closeable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.msgpack.core.MessagePack.Code;
import org.msgpack.core.MessagePack.UnpackerConfig;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueFactory;
import org.msgpack.value.Variable;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class MessageUnpacker implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final MessageBuffer EMPTY_BUFFER = MessageBuffer.wrap(new byte[0]);
    private static final String EMPTY_STRING = "";
    private final CodingErrorAction actionOnMalformedString;
    private final CodingErrorAction actionOnUnmappableString;
    private final boolean allowReadingBinaryAsString;
    private final boolean allowReadingStringAsBinary;
    private MessageBuffer buffer = EMPTY_BUFFER;
    private CharBuffer decodeBuffer;
    private StringBuilder decodeStringBuffer;
    private CharsetDecoder decoder;
    private MessageBufferInput in;
    private int nextReadPosition;
    private final MessageBuffer numberBuffer = MessageBuffer.allocate(8);
    private int position;
    private final int stringDecoderBufferSize;
    private final int stringSizeLimit;
    private long totalReadBytes;

    protected MessageUnpacker(MessageBufferInput messageBufferInput, UnpackerConfig unpackerConfig) {
        this.in = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        this.allowReadingStringAsBinary = unpackerConfig.getAllowReadingStringAsBinary();
        this.allowReadingBinaryAsString = unpackerConfig.getAllowReadingBinaryAsString();
        this.actionOnMalformedString = unpackerConfig.getActionOnMalformedString();
        this.actionOnUnmappableString = unpackerConfig.getActionOnUnmappableString();
        this.stringSizeLimit = unpackerConfig.getStringSizeLimit();
        this.stringDecoderBufferSize = unpackerConfig.getStringDecoderBufferSize();
    }

    private String decodeStringFastPath(int i) {
        if (this.actionOnMalformedString == CodingErrorAction.REPLACE && this.actionOnUnmappableString == CodingErrorAction.REPLACE && this.buffer.hasArray()) {
            String str = new String(this.buffer.array(), this.buffer.arrayOffset() + this.position, i, MessagePack.UTF8);
            this.position += i;
            return str;
        }
        try {
            CharBuffer decode = this.decoder.decode(this.buffer.sliceAsByteBuffer(this.position, i));
            this.position += i;
            return decode.toString();
        } catch (CharacterCodingException e) {
            throw new MessageStringCodingException(e);
        }
    }

    private boolean ensureBuffer() {
        while (this.buffer.size() <= this.position) {
            MessageBuffer next = this.in.next();
            if (next == null) {
                return false;
            }
            this.totalReadBytes += (long) this.buffer.size();
            this.buffer = next;
            this.position = 0;
        }
        return true;
    }

    private MessageBuffer getNextBuffer() {
        MessageBuffer next = this.in.next();
        if (next == null) {
            throw new MessageInsufficientBufferException();
        }
        this.totalReadBytes += (long) this.buffer.size();
        return next;
    }

    private void handleCoderError(CoderResult coderResult) {
        if ((coderResult.isMalformed() && this.actionOnMalformedString == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.actionOnUnmappableString == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }

    private void nextBuffer() {
        this.buffer = getNextBuffer();
        this.position = 0;
    }

    private static MessageIntegerOverflowException overflowI16(short s) {
        return new MessageIntegerOverflowException(BigInteger.valueOf((long) s));
    }

    private static MessageIntegerOverflowException overflowI32(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf((long) i));
    }

    private static MessageIntegerOverflowException overflowI64(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j));
    }

    private static MessageIntegerOverflowException overflowU16(short s) {
        return new MessageIntegerOverflowException(BigInteger.valueOf((long) (s & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE)));
    }

    private static MessageIntegerOverflowException overflowU32(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(((long) (i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + IjkMediaMeta.AV_CH_WIDE_LEFT));
    }

    private static MessageSizeException overflowU32Size(int i) {
        return new MessageSizeException(((long) (i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + IjkMediaMeta.AV_CH_WIDE_LEFT);
    }

    private static MessageIntegerOverflowException overflowU64(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf((j + Long.MAX_VALUE) + 1).setBit(63));
    }

    private static MessageIntegerOverflowException overflowU8(byte b) {
        return new MessageIntegerOverflowException(BigInteger.valueOf((long) (b & 255)));
    }

    private MessageBuffer prepareNumberBuffer(int i) {
        int size = this.buffer.size() - this.position;
        if (size >= i) {
            this.nextReadPosition = this.position;
            this.position += i;
            return this.buffer;
        }
        if (size > 0) {
            this.numberBuffer.putMessageBuffer(0, this.buffer, this.position, size);
            i -= size;
            size += 0;
        } else {
            size = 0;
        }
        while (true) {
            nextBuffer();
            int size2 = this.buffer.size();
            if (size2 >= i) {
                this.numberBuffer.putMessageBuffer(size, this.buffer, 0, i);
                this.position = i;
                this.nextReadPosition = 0;
                return this.numberBuffer;
            }
            this.numberBuffer.putMessageBuffer(size, this.buffer, 0, size2);
            i -= size2;
            size += size2;
        }
    }

    private byte readByte() {
        byte b;
        while (this.buffer.size() <= this.position) {
            nextBuffer();
            if (this.buffer.size() > 0) {
                b = this.buffer.getByte(0);
                this.position = 1;
                return b;
            }
        }
        b = this.buffer.getByte(this.position);
        this.position++;
        return b;
    }

    private double readDouble() {
        return prepareNumberBuffer(8).getDouble(this.nextReadPosition);
    }

    private float readFloat() {
        return prepareNumberBuffer(4).getFloat(this.nextReadPosition);
    }

    private int readInt() {
        return prepareNumberBuffer(4).getInt(this.nextReadPosition);
    }

    private long readLong() {
        return prepareNumberBuffer(8).getLong(this.nextReadPosition);
    }

    private int readNextLength16() {
        return readShort() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
    }

    private int readNextLength32() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw overflowU32Size(readInt);
    }

    private int readNextLength8() {
        return readByte() & 255;
    }

    private short readShort() {
        return prepareNumberBuffer(2).getShort(this.nextReadPosition);
    }

    private void resetDecoder() {
        if (this.decoder == null) {
            this.decodeBuffer = CharBuffer.allocate(this.stringDecoderBufferSize);
            this.decoder = MessagePack.UTF8.newDecoder().onMalformedInput(this.actionOnMalformedString).onUnmappableCharacter(this.actionOnUnmappableString);
        } else {
            this.decoder.reset();
        }
        if (this.decodeStringBuffer == null) {
            this.decodeStringBuffer = new StringBuilder();
        } else {
            this.decodeStringBuffer.setLength(0);
        }
    }

    private void skipPayload(int i) {
        while (true) {
            int size = this.buffer.size() - this.position;
            if (size >= i) {
                this.position += i;
                return;
            }
            this.position += size;
            i -= size;
            nextBuffer();
        }
    }

    private int tryReadBinaryHeader(byte b) {
        switch (b) {
            case (byte) -60:
                return readNextLength8();
            case (byte) -59:
                return readNextLength16();
            case (byte) -58:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private int tryReadStringHeader(byte b) {
        switch (b) {
            case (byte) -39:
                return readNextLength8();
            case (byte) -38:
                return readNextLength16();
            case (byte) -37:
                return readNextLength32();
            default:
                return -1;
        }
    }

    private static MessagePackException unexpected(String str, byte b) {
        MessageFormat valueOf = MessageFormat.valueOf(b);
        if (valueOf == MessageFormat.NEVER_USED) {
            return new MessageNeverUsedFormatException(String.format("Expected %s, but encountered 0xC1 \"NEVER_USED\" byte", new Object[]{str}));
        }
        String name = valueOf.getValueType().name();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name.substring(0, 1));
        stringBuilder.append(name.substring(1).toLowerCase());
        name = stringBuilder.toString();
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", new Object[]{str, name, Byte.valueOf(b)}));
    }

    private static int utf8MultibyteCharacterSize(byte b) {
        return Integer.numberOfLeadingZeros(((b & 255) ^ -1) << 24);
    }

    public void close() {
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.in.close();
    }

    public MessageFormat getNextFormat() {
        if (ensureBuffer()) {
            return MessageFormat.valueOf(this.buffer.getByte(this.position));
        }
        throw new MessageInsufficientBufferException();
    }

    public long getTotalReadBytes() {
        return this.totalReadBytes + ((long) this.position);
    }

    public boolean hasNext() {
        return ensureBuffer();
    }

    public void readPayload(ByteBuffer byteBuffer) {
        while (true) {
            int remaining = byteBuffer.remaining();
            int size = this.buffer.size() - this.position;
            if (size >= remaining) {
                this.buffer.getBytes(this.position, remaining, byteBuffer);
                this.position += remaining;
                return;
            }
            this.buffer.getBytes(this.position, size, byteBuffer);
            this.position += size;
            nextBuffer();
        }
    }

    public void readPayload(byte[] bArr) {
        readPayload(bArr, 0, bArr.length);
    }

    public void readPayload(byte[] bArr, int i, int i2) {
        readPayload(ByteBuffer.wrap(bArr, i, i2));
    }

    public byte[] readPayload(int i) {
        byte[] bArr = new byte[i];
        readPayload(bArr);
        return bArr;
    }

    public MessageBuffer readPayloadAsReference(int i) {
        if (this.buffer.size() - this.position >= i) {
            MessageBuffer slice = this.buffer.slice(this.position, i);
            this.position += i;
            return slice;
        }
        MessageBuffer allocate = MessageBuffer.allocate(i);
        readPayload(allocate.sliceAsByteBuffer());
        return allocate;
    }

    public MessageBufferInput reset(MessageBufferInput messageBufferInput) {
        messageBufferInput = (MessageBufferInput) Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        MessageBufferInput messageBufferInput2 = this.in;
        this.in = messageBufferInput;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.totalReadBytes = 0;
        return messageBufferInput2;
    }

    public void skipValue() {
        skipValue(1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void skipValue(int r5) {
        /*
        r4 = this;
    L_0x0000:
        if (r5 <= 0) goto L_0x007b;
    L_0x0002:
        r0 = r4.readByte();
        r1 = org.msgpack.core.MessageFormat.valueOf(r0);
        r2 = org.msgpack.core.MessageUnpacker.C78261.$SwitchMap$org$msgpack$core$MessageFormat;
        r1 = r1.ordinal();
        r1 = r2[r1];
        r2 = 1;
        r3 = 2;
        switch(r1) {
            case 1: goto L_0x0078;
            case 2: goto L_0x0078;
            case 3: goto L_0x0078;
            case 4: goto L_0x0078;
            case 5: goto L_0x0074;
            case 6: goto L_0x0071;
            case 7: goto L_0x006b;
            case 8: goto L_0x0067;
            case 9: goto L_0x0067;
            case 10: goto L_0x0063;
            case 11: goto L_0x0063;
            case 12: goto L_0x0061;
            case 13: goto L_0x0061;
            case 14: goto L_0x0061;
            case 15: goto L_0x005e;
            case 16: goto L_0x005e;
            case 17: goto L_0x005e;
            case 18: goto L_0x0059;
            case 19: goto L_0x0059;
            case 20: goto L_0x0054;
            case 21: goto L_0x0054;
            case 22: goto L_0x004f;
            case 23: goto L_0x004f;
            case 24: goto L_0x0063;
            case 25: goto L_0x004d;
            case 26: goto L_0x004b;
            case 27: goto L_0x0048;
            case 28: goto L_0x0045;
            case 29: goto L_0x003f;
            case 30: goto L_0x003a;
            case 31: goto L_0x0035;
            case 32: goto L_0x0030;
            case 33: goto L_0x002b;
            case 34: goto L_0x0026;
            case 35: goto L_0x0021;
            case 36: goto L_0x0019;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x0078;
    L_0x0019:
        r5 = new org.msgpack.core.MessageNeverUsedFormatException;
        r0 = "Encountered 0xC1 \"NEVER_USED\" byte";
        r5.<init>(r0);
        throw r5;
    L_0x0021:
        r0 = r4.readNextLength32();
        goto L_0x0076;
    L_0x0026:
        r0 = r4.readNextLength16();
        goto L_0x0076;
    L_0x002b:
        r0 = r4.readNextLength32();
        goto L_0x0077;
    L_0x0030:
        r0 = r4.readNextLength16();
        goto L_0x0077;
    L_0x0035:
        r0 = r4.readNextLength32();
        goto L_0x0043;
    L_0x003a:
        r0 = r4.readNextLength16();
        goto L_0x0043;
    L_0x003f:
        r0 = r4.readNextLength8();
    L_0x0043:
        r0 = r0 + r2;
        goto L_0x006d;
    L_0x0045:
        r0 = 17;
        goto L_0x006d;
    L_0x0048:
        r0 = 9;
        goto L_0x006d;
    L_0x004b:
        r0 = 5;
        goto L_0x006d;
    L_0x004d:
        r0 = 3;
        goto L_0x006d;
    L_0x004f:
        r0 = r4.readNextLength32();
        goto L_0x006d;
    L_0x0054:
        r0 = r4.readNextLength16();
        goto L_0x006d;
    L_0x0059:
        r0 = r4.readNextLength8();
        goto L_0x006d;
    L_0x005e:
        r0 = 8;
        goto L_0x006d;
    L_0x0061:
        r0 = 4;
        goto L_0x006d;
    L_0x0063:
        r4.skipPayload(r3);
        goto L_0x0078;
    L_0x0067:
        r4.skipPayload(r2);
        goto L_0x0078;
    L_0x006b:
        r0 = r0 & 31;
    L_0x006d:
        r4.skipPayload(r0);
        goto L_0x0078;
    L_0x0071:
        r0 = r0 & 15;
        goto L_0x0077;
    L_0x0074:
        r0 = r0 & 15;
    L_0x0076:
        r0 = r0 * r3;
    L_0x0077:
        r5 = r5 + r0;
    L_0x0078:
        r5 = r5 + -1;
        goto L_0x0000;
    L_0x007b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.MessageUnpacker.skipValue(int):void");
    }

    public int unpackArrayHeader() {
        byte readByte = readByte();
        if (Code.isFixedArray(readByte)) {
            return readByte & 15;
        }
        switch (readByte) {
            case (byte) -36:
                return readNextLength16();
            case (byte) -35:
                return readNextLength32();
            default:
                throw unexpected("Array", readByte);
        }
    }

    public BigInteger unpackBigInteger() {
        byte readByte = readByte();
        if (Code.isFixInt(readByte)) {
            return BigInteger.valueOf((long) readByte);
        }
        switch (readByte) {
            case (byte) -52:
                return BigInteger.valueOf((long) (readByte() & 255));
            case (byte) -51:
                return BigInteger.valueOf((long) (readShort() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE));
            case (byte) -50:
                int readInt = readInt();
                return readInt < 0 ? BigInteger.valueOf(((long) (readInt & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + IjkMediaMeta.AV_CH_WIDE_LEFT) : BigInteger.valueOf((long) readInt);
            case (byte) -49:
                long readLong = readLong();
                return readLong < 0 ? BigInteger.valueOf((readLong + Long.MAX_VALUE) + 1).setBit(63) : BigInteger.valueOf(readLong);
            case (byte) -48:
                return BigInteger.valueOf((long) readByte());
            case (byte) -47:
                return BigInteger.valueOf((long) readShort());
            case (byte) -46:
                return BigInteger.valueOf((long) readInt());
            case (byte) -45:
                return BigInteger.valueOf(readLong());
            default:
                throw unexpected("Integer", readByte);
        }
    }

    public int unpackBinaryHeader() {
        byte readByte = readByte();
        if (Code.isFixedRaw(readByte)) {
            return readByte & 31;
        }
        int tryReadBinaryHeader = tryReadBinaryHeader(readByte);
        if (tryReadBinaryHeader >= 0) {
            return tryReadBinaryHeader;
        }
        if (this.allowReadingStringAsBinary) {
            tryReadBinaryHeader = tryReadStringHeader(readByte);
            if (tryReadBinaryHeader >= 0) {
                return tryReadBinaryHeader;
            }
        }
        throw unexpected("Binary", readByte);
    }

    public boolean unpackBoolean() {
        byte readByte = readByte();
        if (readByte == Code.FALSE) {
            return false;
        }
        if (readByte == Code.TRUE) {
            return true;
        }
        throw unexpected("boolean", readByte);
    }

    public byte unpackByte() {
        byte readByte = readByte();
        if (Code.isFixInt(readByte)) {
            return readByte;
        }
        long readLong;
        short readShort;
        int readInt;
        switch (readByte) {
            case (byte) -52:
                readByte = readByte();
                if (readByte >= (byte) 0) {
                    return readByte;
                }
                throw overflowU8(readByte);
            case (byte) -51:
                readShort = readShort();
                if (readShort >= (short) 0) {
                    if (readShort <= (short) 127) {
                        return (byte) readShort;
                    }
                }
                throw overflowU16(readShort);
            case (byte) -50:
                readInt = readInt();
                if (readInt >= 0) {
                    if (readInt <= 127) {
                        return (byte) readInt;
                    }
                }
                throw overflowU32(readInt);
            case (byte) -49:
                readLong = readLong();
                if (readLong < 0 || readLong > 127) {
                    throw overflowU64(readLong);
                }
            case (byte) -48:
                return readByte();
            case (byte) -47:
                readShort = readShort();
                if (readShort >= (short) -128) {
                    if (readShort <= (short) 127) {
                        return (byte) readShort;
                    }
                }
                throw overflowI16(readShort);
            case (byte) -46:
                readInt = readInt();
                if (readInt >= -128) {
                    if (readInt <= 127) {
                        return (byte) readInt;
                    }
                }
                throw overflowI32(readInt);
            case (byte) -45:
                readLong = readLong();
                if (readLong >= -128) {
                    if (readLong > 127) {
                    }
                }
                throw overflowI64(readLong);
            default:
                throw unexpected("Integer", readByte);
        }
        return (byte) ((int) readLong);
    }

    public double unpackDouble() {
        byte readByte = readByte();
        switch (readByte) {
            case (byte) -54:
                return (double) readFloat();
            case (byte) -53:
                return readDouble();
            default:
                throw unexpected("Float", readByte);
        }
    }

    public ExtensionTypeHeader unpackExtensionTypeHeader() {
        byte readByte = readByte();
        MessageBuffer prepareNumberBuffer;
        switch (readByte) {
            case (byte) -57:
                prepareNumberBuffer = prepareNumberBuffer(2);
                return new ExtensionTypeHeader(prepareNumberBuffer.getByte(this.nextReadPosition + 1), prepareNumberBuffer.getByte(this.nextReadPosition) & 255);
            case (byte) -56:
                prepareNumberBuffer = prepareNumberBuffer(3);
                return new ExtensionTypeHeader(prepareNumberBuffer.getByte(this.nextReadPosition + 2), prepareNumberBuffer.getShort(this.nextReadPosition) & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
            case (byte) -55:
                prepareNumberBuffer = prepareNumberBuffer(5);
                int i = prepareNumberBuffer.getInt(this.nextReadPosition);
                if (i >= 0) {
                    return new ExtensionTypeHeader(prepareNumberBuffer.getByte(this.nextReadPosition + 4), i);
                }
                throw overflowU32Size(i);
            default:
                switch (readByte) {
                    case (byte) -44:
                        return new ExtensionTypeHeader(readByte(), 1);
                    case (byte) -43:
                        return new ExtensionTypeHeader(readByte(), 2);
                    case (byte) -42:
                        return new ExtensionTypeHeader(readByte(), 4);
                    case (byte) -41:
                        return new ExtensionTypeHeader(readByte(), 8);
                    case (byte) -40:
                        return new ExtensionTypeHeader(readByte(), 16);
                    default:
                        throw unexpected("Ext", readByte);
                }
        }
    }

    public float unpackFloat() {
        byte readByte = readByte();
        switch (readByte) {
            case (byte) -54:
                return readFloat();
            case (byte) -53:
                return (float) readDouble();
            default:
                throw unexpected("Float", readByte);
        }
    }

    public int unpackInt() {
        byte readByte = readByte();
        if (Code.isFixInt(readByte)) {
            return readByte;
        }
        long readLong;
        switch (readByte) {
            case (byte) -52:
                return readByte() & 255;
            case (byte) -51:
                return readShort() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
            case (byte) -50:
                int readInt = readInt();
                if (readInt >= 0) {
                    return readInt;
                }
                throw overflowU32(readInt);
            case (byte) -49:
                readLong = readLong();
                if (readLong >= 0) {
                    if (readLong <= 2147483647L) {
                        return (int) readLong;
                    }
                }
                throw overflowU64(readLong);
            case (byte) -48:
                return readByte();
            case (byte) -47:
                return readShort();
            case (byte) -46:
                return readInt();
            case (byte) -45:
                readLong = readLong();
                if (readLong >= -2147483648L) {
                    if (readLong <= 2147483647L) {
                        return (int) readLong;
                    }
                }
                throw overflowI64(readLong);
            default:
                throw unexpected("Integer", readByte);
        }
    }

    public long unpackLong() {
        byte readByte = readByte();
        if (Code.isFixInt(readByte)) {
            return (long) readByte;
        }
        int readByte2;
        switch (readByte) {
            case (byte) -52:
                readByte2 = readByte() & 255;
                break;
            case (byte) -51:
                readByte2 = readShort() & InBandBytestreamManager.MAXIMUM_BLOCK_SIZE;
                break;
            case (byte) -50:
                readByte2 = readInt();
                return readByte2 < 0 ? ((long) (readByte2 & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED)) + IjkMediaMeta.AV_CH_WIDE_LEFT : (long) readByte2;
            case (byte) -49:
                long readLong = readLong();
                if (readLong >= 0) {
                    return readLong;
                }
                throw overflowU64(readLong);
            case (byte) -48:
                readByte2 = readByte();
                break;
            case (byte) -47:
                readByte2 = readShort();
                break;
            case (byte) -46:
                readByte2 = readInt();
                break;
            case (byte) -45:
                return readLong();
            default:
                throw unexpected("Integer", readByte);
        }
        return (long) readByte2;
    }

    public int unpackMapHeader() {
        byte readByte = readByte();
        if (Code.isFixedMap(readByte)) {
            return readByte & 15;
        }
        switch (readByte) {
            case (byte) -34:
                return readNextLength16();
            case (byte) -33:
                return readNextLength32();
            default:
                throw unexpected("Map", readByte);
        }
    }

    public void unpackNil() {
        byte readByte = readByte();
        if (readByte != Code.NIL) {
            throw unexpected("Nil", readByte);
        }
    }

    public int unpackRawStringHeader() {
        byte readByte = readByte();
        if (Code.isFixedRaw(readByte)) {
            return readByte & 31;
        }
        int tryReadStringHeader = tryReadStringHeader(readByte);
        if (tryReadStringHeader >= 0) {
            return tryReadStringHeader;
        }
        if (this.allowReadingBinaryAsString) {
            tryReadStringHeader = tryReadBinaryHeader(readByte);
            if (tryReadStringHeader >= 0) {
                return tryReadStringHeader;
            }
        }
        throw unexpected("String", readByte);
    }

    public short unpackShort() {
        byte readByte = readByte();
        if (Code.isFixInt(readByte)) {
            return (short) readByte;
        }
        int readByte2;
        long readLong;
        switch (readByte) {
            case (byte) -52:
                readByte2 = readByte() & 255;
                break;
            case (byte) -51:
                short readShort = readShort();
                if (readShort >= (short) 0) {
                    return readShort;
                }
                throw overflowU16(readShort);
            case (byte) -50:
                readByte2 = readInt();
                if (readByte2 >= 0) {
                    if (readByte2 <= 32767) {
                        return (short) readByte2;
                    }
                }
                throw overflowU32(readByte2);
            case (byte) -49:
                readLong = readLong();
                if (readLong < 0 || readLong > 32767) {
                    throw overflowU64(readLong);
                }
            case (byte) -48:
                readByte2 = readByte();
                break;
            case (byte) -47:
                return readShort();
            case (byte) -46:
                readByte2 = readInt();
                if (readByte2 >= -32768) {
                    if (readByte2 <= 32767) {
                        return (short) readByte2;
                    }
                }
                throw overflowI32(readByte2);
            case (byte) -45:
                readLong = readLong();
                if (readLong >= -32768) {
                    if (readLong > 32767) {
                    }
                }
                throw overflowI64(readLong);
            default:
                throw unexpected("Integer", readByte);
        }
        readByte2 = (int) readLong;
        return (short) readByte2;
    }

    public String unpackString() {
        int unpackRawStringHeader = unpackRawStringHeader();
        if (unpackRawStringHeader == 0) {
            return "";
        }
        if (unpackRawStringHeader > this.stringSizeLimit) {
            throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", new Object[]{Integer.valueOf(this.stringSizeLimit), Integer.valueOf(unpackRawStringHeader)}), (long) unpackRawStringHeader);
        }
        resetDecoder();
        if (this.buffer.size() - this.position >= unpackRawStringHeader) {
            return decodeStringFastPath(unpackRawStringHeader);
        }
        while (unpackRawStringHeader > 0) {
            try {
                int size = this.buffer.size() - this.position;
                if (size >= unpackRawStringHeader) {
                    this.decodeStringBuffer.append(decodeStringFastPath(unpackRawStringHeader));
                    break;
                } else if (size == 0) {
                    nextBuffer();
                } else {
                    ByteBuffer sliceAsByteBuffer = this.buffer.sliceAsByteBuffer(this.position, size);
                    int position = sliceAsByteBuffer.position();
                    this.decodeBuffer.clear();
                    CoderResult decode = this.decoder.decode(sliceAsByteBuffer, this.decodeBuffer, false);
                    int position2 = sliceAsByteBuffer.position() - position;
                    this.position += position2;
                    unpackRawStringHeader -= position2;
                    this.decodeStringBuffer.append(this.decodeBuffer.flip());
                    if (decode.isError()) {
                        handleCoderError(decode);
                    }
                    if (decode.isUnderflow() && position2 < size) {
                        ByteBuffer allocate = ByteBuffer.allocate(utf8MultibyteCharacterSize(this.buffer.getByte(this.position)));
                        this.buffer.getBytes(this.position, this.buffer.size() - this.position, allocate);
                        while (true) {
                            nextBuffer();
                            position2 = allocate.remaining();
                            if (this.buffer.size() >= position2) {
                                break;
                            }
                            this.buffer.getBytes(0, this.buffer.size(), allocate);
                            this.position = this.buffer.size();
                        }
                        this.buffer.getBytes(0, position2, allocate);
                        this.position = position2;
                        allocate.position(0);
                        this.decodeBuffer.clear();
                        CoderResult decode2 = this.decoder.decode(allocate, this.decodeBuffer, false);
                        if (decode2.isError()) {
                            handleCoderError(decode2);
                        }
                        if (!decode2.isOverflow()) {
                            if (!decode2.isUnderflow() || allocate.position() >= allocate.limit()) {
                                unpackRawStringHeader -= allocate.limit();
                                this.decodeStringBuffer.append(this.decodeBuffer.flip());
                            }
                        }
                        decode2.throwException();
                        throw new MessageFormatException("Unexpected UTF-8 multibyte sequence");
                    }
                }
            } catch (Throwable e) {
                throw new MessageFormatException("Unexpected UTF-8 multibyte sequence", e);
            } catch (CharacterCodingException e2) {
                throw new MessageStringCodingException(e2);
            }
        }
        return this.decodeStringBuffer.toString();
    }

    public ImmutableValue unpackValue() {
        MessageFormat nextFormat = getNextFormat();
        int i = 0;
        int unpackArrayHeader;
        Value[] valueArr;
        switch (nextFormat.getValueType()) {
            case NIL:
                readByte();
                return ValueFactory.newNil();
            case BOOLEAN:
                return ValueFactory.newBoolean(unpackBoolean());
            case INTEGER:
                return C78261.$SwitchMap$org$msgpack$core$MessageFormat[nextFormat.ordinal()] != 16 ? ValueFactory.newInteger(unpackLong()) : ValueFactory.newInteger(unpackBigInteger());
            case FLOAT:
                return ValueFactory.newFloat(unpackDouble());
            case STRING:
                return ValueFactory.newString(readPayload(unpackRawStringHeader()), true);
            case BINARY:
                return ValueFactory.newBinary(readPayload(unpackBinaryHeader()), true);
            case ARRAY:
                unpackArrayHeader = unpackArrayHeader();
                valueArr = new Value[unpackArrayHeader];
                while (i < unpackArrayHeader) {
                    valueArr[i] = unpackValue();
                    i++;
                }
                return ValueFactory.newArray(valueArr, true);
            case MAP:
                unpackArrayHeader = unpackMapHeader() * 2;
                valueArr = new Value[unpackArrayHeader];
                while (i < unpackArrayHeader) {
                    valueArr[i] = unpackValue();
                    i++;
                    valueArr[i] = unpackValue();
                    i++;
                }
                return ValueFactory.newMap(valueArr, true);
            case EXTENSION:
                ExtensionTypeHeader unpackExtensionTypeHeader = unpackExtensionTypeHeader();
                return ValueFactory.newExtension(unpackExtensionTypeHeader.getType(), readPayload(unpackExtensionTypeHeader.getLength()));
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }

    public Variable unpackValue(Variable variable) {
        MessageFormat nextFormat = getNextFormat();
        int i = 0;
        int unpackArrayHeader;
        switch (nextFormat.getValueType()) {
            case NIL:
                readByte();
                variable.setNilValue();
                return variable;
            case BOOLEAN:
                variable.setBooleanValue(unpackBoolean());
                return variable;
            case INTEGER:
                if (C78261.$SwitchMap$org$msgpack$core$MessageFormat[nextFormat.ordinal()] != 16) {
                    variable.setIntegerValue(unpackLong());
                    return variable;
                }
                variable.setIntegerValue(unpackBigInteger());
                return variable;
            case FLOAT:
                variable.setFloatValue(unpackDouble());
                return variable;
            case STRING:
                variable.setStringValue(readPayload(unpackRawStringHeader()));
                return variable;
            case BINARY:
                variable.setBinaryValue(readPayload(unpackBinaryHeader()));
                return variable;
            case ARRAY:
                unpackArrayHeader = unpackArrayHeader();
                List arrayList = new ArrayList(unpackArrayHeader);
                while (i < unpackArrayHeader) {
                    arrayList.add(unpackValue());
                    i++;
                }
                variable.setArrayValue(arrayList);
                return variable;
            case MAP:
                unpackArrayHeader = unpackMapHeader();
                Map hashMap = new HashMap();
                while (i < unpackArrayHeader) {
                    hashMap.put(unpackValue(), unpackValue());
                    i++;
                }
                variable.setMapValue(hashMap);
                return variable;
            case EXTENSION:
                ExtensionTypeHeader unpackExtensionTypeHeader = unpackExtensionTypeHeader();
                variable.setExtensionValue(unpackExtensionTypeHeader.getType(), readPayload(unpackExtensionTypeHeader.getLength()));
                return variable;
            default:
                throw new MessageFormatException("Unknown value type");
        }
    }
}
