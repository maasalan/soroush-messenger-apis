package org.msgpack.jackson.dataformat;

import com.d.a.b.a.c;
import com.d.a.b.d.b;
import com.d.a.b.d.d;
import com.d.a.b.h;
import com.d.a.b.j;
import com.d.a.b.j.a;
import com.d.a.b.l;
import com.d.a.b.m;
import com.d.a.b.n;
import com.d.a.b.s;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.InputStreamBufferInput;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.jackson.dataformat.ExtensionTypeCustomDeserializers.Deser;

public class MessagePackParser extends c {
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);
    private static final BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    private static final ThreadLocal<Tuple<Object, MessageUnpacker>> messageUnpackerHolder = new ThreadLocal();
    private BigInteger biValue;
    private byte[] bytesValue;
    private n codec;
    private long currentPosition;
    private double doubleValue;
    private ExtensionTypeCustomDeserializers extTypeCustomDesers;
    private MessagePackExtensionType extensionTypeValue;
    private int intValue;
    private final com.d.a.b.c.c ioContext;
    private boolean isClosed;
    private long longValue;
    private final MessageUnpacker messageUnpacker;
    private d parsingContext;
    private boolean reuseResourceInParser;
    private final LinkedList<StackItem> stack;
    private String stringValue;
    private long tokenPosition;
    private Type type;

    static /* synthetic */ class C78291 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$core$MessageFormat = new int[MessageFormat.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = org.msgpack.jackson.dataformat.MessagePackParser.Type.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$org$msgpack$jackson$dataformat$MessagePackParser$Type = r0;
            r0 = 1;
            r1 = $SwitchMap$org$msgpack$jackson$dataformat$MessagePackParser$Type;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = org.msgpack.jackson.dataformat.MessagePackParser.Type.STRING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = $SwitchMap$org$msgpack$jackson$dataformat$MessagePackParser$Type;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = org.msgpack.jackson.dataformat.MessagePackParser.Type.BYTES;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = $SwitchMap$org$msgpack$jackson$dataformat$MessagePackParser$Type;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = org.msgpack.jackson.dataformat.MessagePackParser.Type.INT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = $SwitchMap$org$msgpack$jackson$dataformat$MessagePackParser$Type;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = org.msgpack.jackson.dataformat.MessagePackParser.Type.LONG;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = $SwitchMap$org$msgpack$jackson$dataformat$MessagePackParser$Type;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = org.msgpack.jackson.dataformat.MessagePackParser.Type.DOUBLE;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = 6;
            r6 = $SwitchMap$org$msgpack$jackson$dataformat$MessagePackParser$Type;	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = org.msgpack.jackson.dataformat.MessagePackParser.Type.BIG_INT;	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r6[r7] = r5;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r6 = 7;
            r7 = $SwitchMap$org$msgpack$jackson$dataformat$MessagePackParser$Type;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r8 = org.msgpack.jackson.dataformat.MessagePackParser.Type.EXT;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r8 = r8.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r7[r8] = r6;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r7 = org.msgpack.value.ValueType.values();
            r7 = r7.length;
            r7 = new int[r7];
            $SwitchMap$org$msgpack$value$ValueType = r7;
            r7 = $SwitchMap$org$msgpack$value$ValueType;	 Catch:{ NoSuchFieldError -> 0x0069 }
            r8 = org.msgpack.value.ValueType.NIL;	 Catch:{ NoSuchFieldError -> 0x0069 }
            r8 = r8.ordinal();	 Catch:{ NoSuchFieldError -> 0x0069 }
            r7[r8] = r0;	 Catch:{ NoSuchFieldError -> 0x0069 }
        L_0x0069:
            r7 = $SwitchMap$org$msgpack$value$ValueType;	 Catch:{ NoSuchFieldError -> 0x0073 }
            r8 = org.msgpack.value.ValueType.BOOLEAN;	 Catch:{ NoSuchFieldError -> 0x0073 }
            r8 = r8.ordinal();	 Catch:{ NoSuchFieldError -> 0x0073 }
            r7[r8] = r1;	 Catch:{ NoSuchFieldError -> 0x0073 }
        L_0x0073:
            r1 = $SwitchMap$org$msgpack$value$ValueType;	 Catch:{ NoSuchFieldError -> 0x007d }
            r7 = org.msgpack.value.ValueType.INTEGER;	 Catch:{ NoSuchFieldError -> 0x007d }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x007d }
            r1[r7] = r2;	 Catch:{ NoSuchFieldError -> 0x007d }
        L_0x007d:
            r1 = $SwitchMap$org$msgpack$value$ValueType;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r2 = org.msgpack.value.ValueType.FLOAT;	 Catch:{ NoSuchFieldError -> 0x0087 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0087 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0087 }
        L_0x0087:
            r1 = $SwitchMap$org$msgpack$value$ValueType;	 Catch:{ NoSuchFieldError -> 0x0091 }
            r2 = org.msgpack.value.ValueType.STRING;	 Catch:{ NoSuchFieldError -> 0x0091 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0091 }
            r1[r2] = r4;	 Catch:{ NoSuchFieldError -> 0x0091 }
        L_0x0091:
            r1 = $SwitchMap$org$msgpack$value$ValueType;	 Catch:{ NoSuchFieldError -> 0x009b }
            r2 = org.msgpack.value.ValueType.BINARY;	 Catch:{ NoSuchFieldError -> 0x009b }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x009b }
            r1[r2] = r5;	 Catch:{ NoSuchFieldError -> 0x009b }
        L_0x009b:
            r1 = $SwitchMap$org$msgpack$value$ValueType;	 Catch:{ NoSuchFieldError -> 0x00a5 }
            r2 = org.msgpack.value.ValueType.ARRAY;	 Catch:{ NoSuchFieldError -> 0x00a5 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a5 }
            r1[r2] = r6;	 Catch:{ NoSuchFieldError -> 0x00a5 }
        L_0x00a5:
            r1 = $SwitchMap$org$msgpack$value$ValueType;	 Catch:{ NoSuchFieldError -> 0x00b1 }
            r2 = org.msgpack.value.ValueType.MAP;	 Catch:{ NoSuchFieldError -> 0x00b1 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b1 }
            r3 = 8;	 Catch:{ NoSuchFieldError -> 0x00b1 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x00b1 }
        L_0x00b1:
            r1 = $SwitchMap$org$msgpack$value$ValueType;	 Catch:{ NoSuchFieldError -> 0x00bd }
            r2 = org.msgpack.value.ValueType.EXTENSION;	 Catch:{ NoSuchFieldError -> 0x00bd }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x00bd }
            r3 = 9;	 Catch:{ NoSuchFieldError -> 0x00bd }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x00bd }
        L_0x00bd:
            r1 = org.msgpack.core.MessageFormat.values();
            r1 = r1.length;
            r1 = new int[r1];
            $SwitchMap$org$msgpack$core$MessageFormat = r1;
            r1 = $SwitchMap$org$msgpack$core$MessageFormat;	 Catch:{ NoSuchFieldError -> 0x00d0 }
            r2 = org.msgpack.core.MessageFormat.UINT64;	 Catch:{ NoSuchFieldError -> 0x00d0 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x00d0 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x00d0 }
        L_0x00d0:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.msgpack.jackson.dataformat.MessagePackParser.1.<clinit>():void");
        }
    }

    private static abstract class StackItem {
        private long numOfElements;

        protected StackItem(long j) {
            this.numOfElements = j;
        }

        public void consume() {
            this.numOfElements--;
        }

        public boolean isEmpty() {
            return this.numOfElements == 0;
        }
    }

    private enum Type {
        INT,
        LONG,
        DOUBLE,
        STRING,
        BYTES,
        BIG_INT,
        EXT
    }

    private static class StackItemForArray extends StackItem {
        StackItemForArray(long j) {
            super(j);
        }
    }

    private static class StackItemForObject extends StackItem {
        StackItemForObject(long j) {
            super(j);
        }
    }

    public MessagePackParser(com.d.a.b.c.c cVar, int i, n nVar, InputStream inputStream) {
        this(cVar, i, nVar, inputStream, true);
    }

    public MessagePackParser(com.d.a.b.c.c cVar, int i, n nVar, InputStream inputStream, boolean z) {
        this(cVar, i, new InputStreamBufferInput(inputStream), nVar, inputStream, z);
    }

    public MessagePackParser(com.d.a.b.c.c cVar, int i, n nVar, byte[] bArr) {
        this(cVar, i, nVar, bArr, true);
    }

    public MessagePackParser(com.d.a.b.c.c cVar, int i, n nVar, byte[] bArr, boolean z) {
        this(cVar, i, new ArrayBufferInput(bArr), nVar, bArr, z);
    }

    private MessagePackParser(com.d.a.b.c.c cVar, int i, MessageBufferInput messageBufferInput, n nVar, Object obj, boolean z) {
        super(i);
        this.stack = new LinkedList();
        this.codec = nVar;
        this.ioContext = cVar;
        this.parsingContext = d.b(a.j.a(i) ? b.a(this) : null);
        this.reuseResourceInParser = z;
        if (z) {
            Object newDefaultUnpacker;
            this.messageUnpacker = null;
            Tuple tuple = (Tuple) messageUnpackerHolder.get();
            if (tuple == null) {
                newDefaultUnpacker = MessagePack.newDefaultUnpacker(messageBufferInput);
            } else {
                if (isEnabled(a.a) || tuple.first() != obj) {
                    ((MessageUnpacker) tuple.second()).reset(messageBufferInput);
                }
                newDefaultUnpacker = (MessageUnpacker) tuple.second();
            }
            messageUnpackerHolder.set(new Tuple(obj, newDefaultUnpacker));
            return;
        }
        this.messageUnpacker = MessagePack.newDefaultUnpacker(messageBufferInput);
    }

    private MessageUnpacker getMessageUnpacker() {
        if (!this.reuseResourceInParser) {
            return this.messageUnpacker;
        }
        Tuple tuple = (Tuple) messageUnpackerHolder.get();
        if (tuple != null) {
            return (MessageUnpacker) tuple.second();
        }
        throw new IllegalStateException("messageUnpacker is null");
    }

    protected void _handleEOF() {
    }

    public void close() {
        try {
            if (isEnabled(a.a)) {
                getMessageUnpacker().close();
            }
            this.isClosed = true;
        } catch (Throwable th) {
            this.isClosed = true;
        }
    }

    public BigInteger getBigIntegerValue() {
        long j;
        switch (this.type) {
            case INT:
                j = (long) this.intValue;
                break;
            case LONG:
                j = this.longValue;
                break;
            case DOUBLE:
                j = (long) this.doubleValue;
                break;
            case BIG_INT:
                return this.biValue;
            default:
                StringBuilder stringBuilder = new StringBuilder("Invalid type=");
                stringBuilder.append(this.type);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return BigInteger.valueOf(j);
    }

    public byte[] getBinaryValue(com.d.a.b.a aVar) {
        switch (this.type) {
            case STRING:
                return this.stringValue.getBytes(MessagePack.UTF8);
            case BYTES:
                return this.bytesValue;
            default:
                StringBuilder stringBuilder = new StringBuilder("Invalid type=");
                stringBuilder.append(this.type);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public n getCodec() {
        return this.codec;
    }

    public h getCurrentLocation() {
        return new h(this.ioContext.a(), this.currentPosition, -1, -1, (int) this.currentPosition);
    }

    public String getCurrentName() {
        d dVar;
        if (this._currToken != m.b) {
            if (this._currToken != m.d) {
                dVar = this.parsingContext;
                return dVar.i();
            }
        }
        dVar = this.parsingContext.j();
        return dVar.i();
    }

    public BigDecimal getDecimalValue() {
        switch (this.type) {
            case INT:
                return BigDecimal.valueOf((long) this.intValue);
            case LONG:
                return BigDecimal.valueOf(this.longValue);
            case DOUBLE:
                return BigDecimal.valueOf(this.doubleValue);
            case BIG_INT:
                return new BigDecimal(this.biValue);
            default:
                StringBuilder stringBuilder = new StringBuilder("Invalid type=");
                stringBuilder.append(this.type);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public double getDoubleValue() {
        switch (this.type) {
            case INT:
                return (double) this.intValue;
            case LONG:
                return (double) this.longValue;
            case DOUBLE:
                return this.doubleValue;
            case BIG_INT:
                return this.biValue.doubleValue();
            default:
                StringBuilder stringBuilder = new StringBuilder("Invalid type=");
                stringBuilder.append(this.type);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public Object getEmbeddedObject() {
        int i = C78291.$SwitchMap$org$msgpack$jackson$dataformat$MessagePackParser$Type[this.type.ordinal()];
        if (i == 2) {
            return this.bytesValue;
        }
        if (i != 7) {
            StringBuilder stringBuilder = new StringBuilder("Invalid type=");
            stringBuilder.append(this.type);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (this.extTypeCustomDesers != null) {
            Deser deser = this.extTypeCustomDesers.getDeser(this.extensionTypeValue.getType());
            if (deser != null) {
                return deser.deserialize(this.extensionTypeValue.getData());
            }
        }
        return this.extensionTypeValue;
    }

    public float getFloatValue() {
        switch (this.type) {
            case INT:
                return (float) this.intValue;
            case LONG:
                return (float) this.longValue;
            case DOUBLE:
                return (float) this.doubleValue;
            case BIG_INT:
                return this.biValue.floatValue();
            default:
                StringBuilder stringBuilder = new StringBuilder("Invalid type=");
                stringBuilder.append(this.type);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public int getIntValue() {
        switch (this.type) {
            case INT:
                return this.intValue;
            case LONG:
                return (int) this.longValue;
            case DOUBLE:
                return (int) this.doubleValue;
            case BIG_INT:
                return this.biValue.intValue();
            default:
                StringBuilder stringBuilder = new StringBuilder("Invalid type=");
                stringBuilder.append(this.type);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public long getLongValue() {
        switch (this.type) {
            case INT:
                return (long) this.intValue;
            case LONG:
                return this.longValue;
            case DOUBLE:
                return (long) this.doubleValue;
            case BIG_INT:
                return this.biValue.longValue();
            default:
                StringBuilder stringBuilder = new StringBuilder("Invalid type=");
                stringBuilder.append(this.type);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public j.b getNumberType() {
        switch (this.type) {
            case INT:
                return j.b.a;
            case LONG:
                return j.b.b;
            case DOUBLE:
                return j.b.e;
            case BIG_INT:
                return j.b.c;
            default:
                StringBuilder stringBuilder = new StringBuilder("Invalid type=");
                stringBuilder.append(this.type);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public Number getNumberValue() {
        switch (this.type) {
            case INT:
                return Integer.valueOf(this.intValue);
            case LONG:
                return Long.valueOf(this.longValue);
            case DOUBLE:
                return Double.valueOf(this.doubleValue);
            case BIG_INT:
                return this.biValue;
            default:
                StringBuilder stringBuilder = new StringBuilder("Invalid type=");
                stringBuilder.append(this.type);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public l getParsingContext() {
        return this.parsingContext;
    }

    public String getText() {
        switch (this.type) {
            case STRING:
                return this.stringValue;
            case BYTES:
                return new String(this.bytesValue, MessagePack.UTF8);
            default:
                StringBuilder stringBuilder = new StringBuilder("Invalid type=");
                stringBuilder.append(this.type);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public char[] getTextCharacters() {
        return getText().toCharArray();
    }

    public int getTextLength() {
        return getText().length();
    }

    public int getTextOffset() {
        return 0;
    }

    public h getTokenLocation() {
        return new h(this.ioContext.a(), this.tokenPosition, -1, -1, (int) this.tokenPosition);
    }

    public boolean hasTextCharacters() {
        return false;
    }

    public boolean isClosed() {
        return this.isClosed;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.d.a.b.m nextToken() {
        /*
        r8 = this;
        r0 = r8.getMessageUnpacker();
        r1 = r0.getTotalReadBytes();
        r8.tokenPosition = r1;
        r1 = r8.parsingContext;
        r1 = r1.d();
        if (r1 != 0) goto L_0x001a;
    L_0x0012:
        r1 = r8.parsingContext;
        r1 = r1.b();
        if (r1 == 0) goto L_0x0047;
    L_0x001a:
        r1 = r8.stack;
        r1 = r1.getFirst();
        r1 = (org.msgpack.jackson.dataformat.MessagePackParser.StackItem) r1;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0047;
    L_0x0028:
        r0 = r8.stack;
        r0.pop();
        r0 = r8.parsingContext;
        r0 = r0.d();
        if (r0 == 0) goto L_0x0038;
    L_0x0035:
        r0 = com.d.a.b.m.c;
        goto L_0x003a;
    L_0x0038:
        r0 = com.d.a.b.m.e;
    L_0x003a:
        r8._currToken = r0;
        r0 = r8.parsingContext;
        r0 = r0.j();
        r8.parsingContext = r0;
        r0 = r8._currToken;
        return r0;
    L_0x0047:
        r1 = r0.hasNext();
        r2 = 0;
        if (r1 != 0) goto L_0x004f;
    L_0x004e:
        return r2;
    L_0x004f:
        r1 = r0.getNextFormat();
        r3 = r0.getNextFormat();
        r3 = r3.getValueType();
        r4 = org.msgpack.jackson.dataformat.MessagePackParser.C78291.$SwitchMap$org$msgpack$value$ValueType;
        r3 = r3.ordinal();
        r3 = r4[r3];
        switch(r3) {
            case 1: goto L_0x01b4;
            case 2: goto L_0x018e;
            case 3: goto L_0x0119;
            case 4: goto L_0x00f0;
            case 5: goto L_0x00cf;
            case 6: goto L_0x00a7;
            case 7: goto L_0x0098;
            case 8: goto L_0x008d;
            case 9: goto L_0x006e;
            default: goto L_0x0066;
        };
    L_0x0066:
        r0 = new java.lang.IllegalStateException;
        r1 = "Shouldn't reach here";
        r0.<init>(r1);
        throw r0;
    L_0x006e:
        r1 = org.msgpack.jackson.dataformat.MessagePackParser.Type.EXT;
        r8.type = r1;
        r1 = r0.unpackExtensionTypeHeader();
        r3 = new org.msgpack.jackson.dataformat.MessagePackExtensionType;
        r4 = r1.getType();
        r1 = r1.getLength();
        r1 = r0.readPayload(r1);
        r3.<init>(r4, r1);
        r8.extensionTypeValue = r3;
    L_0x0089:
        r1 = com.d.a.b.m.g;
        goto L_0x01b9;
    L_0x008d:
        r1 = new org.msgpack.jackson.dataformat.MessagePackParser$StackItemForObject;
        r3 = r0.unpackMapHeader();
        r3 = (long) r3;
        r1.<init>(r3);
        goto L_0x00a2;
    L_0x0098:
        r1 = new org.msgpack.jackson.dataformat.MessagePackParser$StackItemForArray;
        r3 = r0.unpackArrayHeader();
        r3 = (long) r3;
        r1.<init>(r3);
    L_0x00a2:
        r7 = r2;
        r2 = r1;
        r1 = r7;
        goto L_0x01b9;
    L_0x00a7:
        r1 = org.msgpack.jackson.dataformat.MessagePackParser.Type.BYTES;
        r8.type = r1;
        r1 = r0.unpackBinaryHeader();
        r1 = r0.readPayload(r1);
        r8.bytesValue = r1;
        r1 = r8.parsingContext;
        r1 = r1.d();
        if (r1 == 0) goto L_0x0089;
    L_0x00bd:
        r1 = r8._currToken;
        r3 = com.d.a.b.m.f;
        if (r1 == r3) goto L_0x0089;
    L_0x00c3:
        r1 = r8.parsingContext;
        r3 = new java.lang.String;
        r4 = r8.bytesValue;
        r5 = org.msgpack.core.MessagePack.UTF8;
        r3.<init>(r4, r5);
        goto L_0x0110;
    L_0x00cf:
        r1 = org.msgpack.jackson.dataformat.MessagePackParser.Type.STRING;
        r8.type = r1;
        r1 = r0.unpackString();
        r8.stringValue = r1;
        r1 = r8.parsingContext;
        r1 = r1.d();
        if (r1 == 0) goto L_0x00ec;
    L_0x00e1:
        r1 = r8._currToken;
        r3 = com.d.a.b.m.f;
        if (r1 == r3) goto L_0x00ec;
    L_0x00e7:
        r1 = r8.parsingContext;
        r3 = r8.stringValue;
        goto L_0x0110;
    L_0x00ec:
        r1 = com.d.a.b.m.h;
        goto L_0x01b9;
    L_0x00f0:
        r1 = org.msgpack.jackson.dataformat.MessagePackParser.Type.DOUBLE;
        r8.type = r1;
        r3 = r0.unpackDouble();
        r8.doubleValue = r3;
        r1 = r8.parsingContext;
        r1 = r1.d();
        if (r1 == 0) goto L_0x0115;
    L_0x0102:
        r1 = r8._currToken;
        r3 = com.d.a.b.m.f;
        if (r1 == r3) goto L_0x0115;
    L_0x0108:
        r1 = r8.parsingContext;
        r3 = r8.doubleValue;
        r3 = java.lang.String.valueOf(r3);
    L_0x0110:
        r1.a(r3);
        goto L_0x01a9;
    L_0x0115:
        r1 = com.d.a.b.m.j;
        goto L_0x01b9;
    L_0x0119:
        r3 = org.msgpack.jackson.dataformat.MessagePackParser.C78291.$SwitchMap$org$msgpack$core$MessageFormat;
        r1 = r1.ordinal();
        r1 = r3[r1];
        r3 = 1;
        if (r1 == r3) goto L_0x0151;
    L_0x0124:
        r3 = r0.unpackLong();
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r1 > 0) goto L_0x0144;
    L_0x012f:
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 > 0) goto L_0x0144;
    L_0x0136:
        r1 = org.msgpack.jackson.dataformat.MessagePackParser.Type.INT;
        r8.type = r1;
        r1 = (int) r3;
        r8.intValue = r1;
        r1 = r8.intValue;
        r1 = java.lang.Integer.valueOf(r1);
        goto L_0x0176;
    L_0x0144:
        r1 = org.msgpack.jackson.dataformat.MessagePackParser.Type.LONG;
        r8.type = r1;
    L_0x0148:
        r8.longValue = r3;
        r3 = r8.longValue;
        r1 = java.lang.Long.valueOf(r3);
        goto L_0x0176;
    L_0x0151:
        r1 = r0.unpackBigInteger();
        r3 = LONG_MIN;
        r3 = r1.compareTo(r3);
        if (r3 < 0) goto L_0x016e;
    L_0x015d:
        r3 = LONG_MAX;
        r3 = r1.compareTo(r3);
        if (r3 > 0) goto L_0x016e;
    L_0x0165:
        r3 = org.msgpack.jackson.dataformat.MessagePackParser.Type.LONG;
        r8.type = r3;
        r3 = r1.longValue();
        goto L_0x0148;
    L_0x016e:
        r3 = org.msgpack.jackson.dataformat.MessagePackParser.Type.BIG_INT;
        r8.type = r3;
        r8.biValue = r1;
        r1 = r8.biValue;
    L_0x0176:
        r3 = r8.parsingContext;
        r3 = r3.d();
        if (r3 == 0) goto L_0x018b;
    L_0x017e:
        r3 = r8._currToken;
        r4 = com.d.a.b.m.f;
        if (r3 == r4) goto L_0x018b;
    L_0x0184:
        r3 = r8.parsingContext;
        r1 = java.lang.String.valueOf(r1);
        goto L_0x01a6;
    L_0x018b:
        r1 = com.d.a.b.m.i;
        goto L_0x01b9;
    L_0x018e:
        r1 = r0.unpackBoolean();
        r3 = r8.parsingContext;
        r3 = r3.d();
        if (r3 == 0) goto L_0x01ac;
    L_0x019a:
        r3 = r8._currToken;
        r4 = com.d.a.b.m.f;
        if (r3 == r4) goto L_0x01ac;
    L_0x01a0:
        r3 = r8.parsingContext;
        r1 = java.lang.Boolean.toString(r1);
    L_0x01a6:
        r3.a(r1);
    L_0x01a9:
        r1 = com.d.a.b.m.f;
        goto L_0x01b9;
    L_0x01ac:
        if (r1 == 0) goto L_0x01b1;
    L_0x01ae:
        r1 = com.d.a.b.m.k;
        goto L_0x01b9;
    L_0x01b1:
        r1 = com.d.a.b.m.l;
        goto L_0x01b9;
    L_0x01b4:
        r0.unpackNil();
        r1 = com.d.a.b.m.m;
    L_0x01b9:
        r3 = r0.getTotalReadBytes();
        r8.currentPosition = r3;
        r0 = r8.parsingContext;
        r0 = r0.d();
        if (r0 == 0) goto L_0x01cb;
    L_0x01c7:
        r0 = com.d.a.b.m.f;
        if (r1 != r0) goto L_0x01d3;
    L_0x01cb:
        r0 = r8.parsingContext;
        r0 = r0.b();
        if (r0 == 0) goto L_0x01de;
    L_0x01d3:
        r0 = r8.stack;
        r0 = r0.getFirst();
        r0 = (org.msgpack.jackson.dataformat.MessagePackParser.StackItem) r0;
        r0.consume();
    L_0x01de:
        if (r2 == 0) goto L_0x0202;
    L_0x01e0:
        r0 = r8.stack;
        r0.push(r2);
        r0 = r2 instanceof org.msgpack.jackson.dataformat.MessagePackParser.StackItemForArray;
        r3 = -1;
        if (r0 == 0) goto L_0x01f5;
    L_0x01ea:
        r1 = com.d.a.b.m.d;
        r0 = r8.parsingContext;
        r0 = r0.a(r3, r3);
    L_0x01f2:
        r8.parsingContext = r0;
        goto L_0x0202;
    L_0x01f5:
        r0 = r2 instanceof org.msgpack.jackson.dataformat.MessagePackParser.StackItemForObject;
        if (r0 == 0) goto L_0x0202;
    L_0x01f9:
        r1 = com.d.a.b.m.b;
        r0 = r8.parsingContext;
        r0 = r0.b(r3, r3);
        goto L_0x01f2;
    L_0x0202:
        r8._currToken = r1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.jackson.dataformat.MessagePackParser.nextToken():com.d.a.b.m");
    }

    public void overrideCurrentName(String str) {
        try {
            if (this._currToken != m.b) {
                if (this._currToken != m.d) {
                    this.parsingContext.a(str);
                    return;
                }
            }
            this.parsingContext.j().a(str);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void setCodec(n nVar) {
        this.codec = nVar;
    }

    public void setExtensionTypeCustomDeserializers(ExtensionTypeCustomDeserializers extensionTypeCustomDeserializers) {
        this.extTypeCustomDesers = extensionTypeCustomDeserializers;
    }

    public s version() {
        return null;
    }
}
