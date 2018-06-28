package org.msgpack.jackson.dataformat;

import com.d.a.b.a.a;
import com.d.a.b.c.j;
import com.d.a.b.g;
import com.d.a.b.n;
import com.d.a.b.p;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.jivesoftware.smack.util.StringUtils;
import org.msgpack.core.MessagePack.PackerConfig;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

public class MessagePackGenerator extends a {
    private static final Charset DEFAULT_CHARSET = Charset.forName(StringUtils.UTF8);
    private static ThreadLocal<OutputStreamBufferOutput> messageBufferOutputHolder = new ThreadLocal();
    private final MessagePacker messagePacker;
    private final OutputStream output;
    private final PackerConfig packerConfig;
    private StackItem rootStackItem;
    private LinkedList<StackItem> stack;

    private static abstract class StackItem {
        protected List<Object> objectKeys;
        protected List<Object> objectValues;

        private StackItem() {
            this.objectKeys = new ArrayList();
            this.objectValues = new ArrayList();
        }

        abstract void addKey(Object obj);

        void addValue(Object obj) {
            this.objectValues.add(obj);
        }

        abstract List<Object> getKeys();

        List<Object> getValues() {
            return this.objectValues;
        }
    }

    private static class StackItemForArray extends StackItem {
        private StackItemForArray() {
            super();
        }

        void addKey(Object obj) {
            throw new IllegalStateException("This method shouldn't be called");
        }

        List<Object> getKeys() {
            throw new IllegalStateException("This method shouldn't be called");
        }
    }

    private static class StackItemForObject extends StackItem {
        private StackItemForObject() {
            super();
        }

        void addKey(Object obj) {
            this.objectKeys.add(obj);
        }

        List<Object> getKeys() {
            return this.objectKeys;
        }
    }

    public MessagePackGenerator(int i, n nVar, OutputStream outputStream, PackerConfig packerConfig, boolean z) {
        MessageBufferOutput messageBufferOutput;
        super(i, nVar);
        this.output = outputStream;
        if (z) {
            messageBufferOutput = (OutputStreamBufferOutput) messageBufferOutputHolder.get();
            if (messageBufferOutput == null) {
                messageBufferOutput = new OutputStreamBufferOutput(outputStream);
                messageBufferOutputHolder.set(messageBufferOutput);
            } else {
                messageBufferOutput.reset(outputStream);
            }
        } else {
            messageBufferOutput = new OutputStreamBufferOutput(outputStream);
        }
        this.messagePacker = packerConfig.newPacker(messageBufferOutput);
        this.packerConfig = packerConfig;
        this.stack = new LinkedList();
    }

    private void addKeyToStackTop(Object obj) {
        getStackTop().addKey(obj);
    }

    private void addValueToStackTop(Object obj) {
        if (this.stack.isEmpty()) {
            pack(obj);
            flushMessagePacker();
            return;
        }
        getStackTop().addValue(obj);
    }

    private void flushMessagePacker() {
        getMessagePacker().flush();
    }

    private MessagePacker getMessagePacker() {
        return this.messagePacker;
    }

    private StackItem getStackTop() {
        if (!this.stack.isEmpty()) {
            return (StackItem) this.stack.getFirst();
        }
        throw new IllegalStateException("The stack is empty");
    }

    private StackItemForArray getStackTopForArray() {
        StackItem stackTop = getStackTop();
        if (stackTop instanceof StackItemForArray) {
            return (StackItemForArray) stackTop;
        }
        StringBuilder stringBuilder = new StringBuilder("The stack top should be Array: ");
        stringBuilder.append(stackTop);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private StackItemForObject getStackTopForObject() {
        StackItem stackTop = getStackTop();
        if (stackTop instanceof StackItemForObject) {
            return (StackItemForObject) stackTop;
        }
        StringBuilder stringBuilder = new StringBuilder("The stack top should be Object: ");
        stringBuilder.append(stackTop);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void pack(Object obj) {
        MessagePacker messagePacker = getMessagePacker();
        if (obj == null) {
            messagePacker.packNil();
        } else if (obj instanceof Integer) {
            messagePacker.packInt(((Integer) obj).intValue());
        } else if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int remaining = byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                messagePacker.packBinaryHeader(remaining);
                messagePacker.writePayload(byteBuffer.array(), byteBuffer.arrayOffset(), remaining);
                return;
            }
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            messagePacker.packBinaryHeader(remaining);
            messagePacker.addPayload(bArr);
        } else if (obj instanceof String) {
            messagePacker.packString((String) obj);
        } else if (obj instanceof Float) {
            messagePacker.packFloat(((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            messagePacker.packLong(((Long) obj).longValue());
        } else if (obj instanceof StackItemForObject) {
            packObject((StackItemForObject) obj);
        } else if (obj instanceof StackItemForArray) {
            packArray((StackItemForArray) obj);
        } else if (obj instanceof Double) {
            messagePacker.packDouble(((Double) obj).doubleValue());
        } else if (obj instanceof BigInteger) {
            messagePacker.packBigInteger((BigInteger) obj);
        } else if (obj instanceof BigDecimal) {
            packBigDecimal((BigDecimal) obj);
        } else if (obj instanceof Boolean) {
            messagePacker.packBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof MessagePackExtensionType) {
            MessagePackExtensionType messagePackExtensionType = (MessagePackExtensionType) obj;
            byte[] data = messagePackExtensionType.getData();
            messagePacker.packExtensionTypeHeader(messagePackExtensionType.getType(), data.length);
            messagePacker.writePayload(data);
        } else {
            messagePacker.flush();
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            getCodec().a(new MessagePackGenerator(getFeatureMask(), getCodec(), byteArrayOutputStream, this.packerConfig, false), obj);
            this.output.write(byteArrayOutputStream.toByteArray());
        }
    }

    private void packArray(StackItemForArray stackItemForArray) {
        List values = stackItemForArray.getValues();
        getMessagePacker().packArrayHeader(values.size());
        for (int i = 0; i < values.size(); i++) {
            pack(values.get(i));
        }
    }

    private void packBigDecimal(java.math.BigDecimal r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r5.getMessagePacker();
        r1 = 1;
        r2 = r6.toBigIntegerExact();	 Catch:{ ArithmeticException -> 0x000d, ArithmeticException -> 0x000d }
        r0.packBigInteger(r2);	 Catch:{ ArithmeticException -> 0x000d, ArithmeticException -> 0x000d }
        r1 = 0;
    L_0x000d:
        if (r1 == 0) goto L_0x0040;
    L_0x000f:
        r1 = r6.doubleValue();
        r3 = r6.stripTrailingZeros();
        r3 = r3.toEngineeringString();
        r4 = java.math.BigDecimal.valueOf(r1);
        r4 = r4.toEngineeringString();
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x003d;
    L_0x0029:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "MessagePack cannot serialize a BigDecimal that can't be represented as double. ";
        r1.<init>(r2);
        r1.append(r6);
        r6 = r1.toString();
        r0.<init>(r6);
        throw r0;
    L_0x003d:
        r0.packDouble(r1);
    L_0x0040:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.jackson.dataformat.MessagePackGenerator.packBigDecimal(java.math.BigDecimal):void");
    }

    private void packObject(StackItemForObject stackItemForObject) {
        List keys = stackItemForObject.getKeys();
        List values = stackItemForObject.getValues();
        getMessagePacker().packMapHeader(keys.size());
        for (int i = 0; i < keys.size(); i++) {
            pack(keys.get(i));
            pack(values.get(i));
        }
    }

    private void popStackAndStoreTheItemAsValue() {
        StackItem stackItem = (StackItem) this.stack.pop();
        if (this.stack.size() > 0) {
            addValueToStackTop(stackItem);
        } else if (this.rootStackItem != null) {
            throw new IllegalStateException("rootStackItem is not null");
        } else {
            this.rootStackItem = stackItem;
        }
    }

    protected void _releaseBuffers() {
    }

    protected void _verifyValueWrite(String str) {
        if (this._writeContext.n() == 5) {
            StringBuilder stringBuilder = new StringBuilder("Can not ");
            stringBuilder.append(str);
            stringBuilder.append(", expecting field name");
            _reportError(stringBuilder.toString());
        }
    }

    public void close() {
        try {
            flush();
        } finally {
            if (isEnabled(g.a.a)) {
                getMessagePacker().close();
            }
        }
    }

    public void flush() {
        if (this.rootStackItem != null) {
            if (this.rootStackItem instanceof StackItemForObject) {
                packObject((StackItemForObject) this.rootStackItem);
            } else if (this.rootStackItem instanceof StackItemForArray) {
                packArray((StackItemForArray) this.rootStackItem);
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unexpected rootStackItem: ");
                stringBuilder.append(this.rootStackItem);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.rootStackItem = null;
            flushMessagePacker();
        }
    }

    public void writeBinary(com.d.a.b.a aVar, byte[] bArr, int i, int i2) {
        addValueToStackTop(ByteBuffer.wrap(bArr, i, i2));
    }

    public void writeBoolean(boolean z) {
        addValueToStackTop(Boolean.valueOf(z));
    }

    public void writeEndArray() {
        if (!this._writeContext.b()) {
            StringBuilder stringBuilder = new StringBuilder("Current context not an array but ");
            stringBuilder.append(this._writeContext.e());
            _reportError(stringBuilder.toString());
        }
        getStackTopForArray();
        this._writeContext = this._writeContext.k();
        popStackAndStoreTheItemAsValue();
    }

    public void writeEndObject() {
        if (!this._writeContext.d()) {
            StringBuilder stringBuilder = new StringBuilder("Current context not an object but ");
            stringBuilder.append(this._writeContext.e());
            _reportError(stringBuilder.toString());
        }
        StackItemForObject stackTopForObject = getStackTopForObject();
        if (stackTopForObject.getKeys().size() != stackTopForObject.getValues().size()) {
            throw new IllegalStateException(String.format("objectKeys.size() and objectValues.size() is not same: depth=%d, key=%d, value=%d", new Object[]{Integer.valueOf(this.stack.size()), Integer.valueOf(stackTopForObject.getKeys().size()), Integer.valueOf(stackTopForObject.getValues().size())}));
        }
        this._writeContext = this._writeContext.k();
        popStackAndStoreTheItemAsValue();
    }

    public void writeExtensionType(MessagePackExtensionType messagePackExtensionType) {
        addValueToStackTop(messagePackExtensionType);
    }

    public void writeFieldName(p pVar) {
        Object rawValue;
        if (pVar instanceof MessagePackSerializedString) {
            rawValue = ((MessagePackSerializedString) pVar).getRawValue();
        } else if (pVar instanceof j) {
            rawValue = pVar.getValue();
        } else {
            System.out.println(pVar.getClass());
            StringBuilder stringBuilder = new StringBuilder("Unsupported key: ");
            stringBuilder.append(pVar);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        addKeyToStackTop(rawValue);
    }

    public void writeFieldName(String str) {
        addKeyToStackTop(str);
    }

    public void writeNull() {
        addValueToStackTop(null);
    }

    public void writeNumber(double d) {
        addValueToStackTop(Double.valueOf(d));
    }

    public void writeNumber(float f) {
        addValueToStackTop(Float.valueOf(f));
    }

    public void writeNumber(int i) {
        addValueToStackTop(Integer.valueOf(i));
    }

    public void writeNumber(long j) {
        addValueToStackTop(Long.valueOf(j));
    }

    public void writeNumber(java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x000c }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ NumberFormatException -> 0x000c }
        r2.addValueToStackTop(r0);	 Catch:{ NumberFormatException -> 0x000c }
        return;
    L_0x000c:
        r0 = java.lang.Double.parseDouble(r3);	 Catch:{ NumberFormatException -> 0x0018 }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0018 }
        r2.addValueToStackTop(r0);	 Catch:{ NumberFormatException -> 0x0018 }
        return;
    L_0x0018:
        r0 = new java.math.BigInteger;	 Catch:{ NumberFormatException -> 0x0021 }
        r0.<init>(r3);	 Catch:{ NumberFormatException -> 0x0021 }
        r2.addValueToStackTop(r0);	 Catch:{ NumberFormatException -> 0x0021 }
        return;
    L_0x0021:
        r0 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x002a }
        r0.<init>(r3);	 Catch:{ NumberFormatException -> 0x002a }
        r2.addValueToStackTop(r0);	 Catch:{ NumberFormatException -> 0x002a }
        return;
    L_0x002a:
        r0 = new java.lang.NumberFormatException;
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.jackson.dataformat.MessagePackGenerator.writeNumber(java.lang.String):void");
    }

    public void writeNumber(BigDecimal bigDecimal) {
        addValueToStackTop(bigDecimal);
    }

    public void writeNumber(BigInteger bigInteger) {
        addValueToStackTop(bigInteger);
    }

    public void writeRaw(char c) {
        addValueToStackTop(String.valueOf(c));
    }

    public void writeRaw(String str) {
        addValueToStackTop(str);
    }

    public void writeRaw(String str, int i, int i2) {
        addValueToStackTop(str.substring(0, i2));
    }

    public void writeRaw(char[] cArr, int i, int i2) {
        addValueToStackTop(new String(cArr, i, i2));
    }

    public void writeRawUTF8String(byte[] bArr, int i, int i2) {
        addValueToStackTop(new String(bArr, i, i2, DEFAULT_CHARSET));
    }

    public void writeStartArray() {
        this._writeContext = this._writeContext.i();
        this.stack.push(new StackItemForArray());
    }

    public void writeStartObject() {
        this._writeContext = this._writeContext.j();
        this.stack.push(new StackItemForObject());
    }

    public void writeString(String str) {
        addValueToStackTop(str);
    }

    public void writeString(char[] cArr, int i, int i2) {
        addValueToStackTop(new String(cArr, i, i2));
    }

    public void writeUTF8String(byte[] bArr, int i, int i2) {
        addValueToStackTop(new String(bArr, i, i2, DEFAULT_CHARSET));
    }
}
