package org.msgpack.util.json;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.p613a.p614a.C7810b;
import org.msgpack.MessagePack;
import org.msgpack.type.Value;
import org.msgpack.type.ValueFactory;
import org.msgpack.unpacker.Converter;

public class JSONUnpacker extends Converter {
    protected Reader in;
    private C7810b parser;

    public JSONUnpacker(InputStream inputStream) {
        this(new MessagePack(), inputStream);
    }

    public JSONUnpacker(MessagePack messagePack, InputStream inputStream) {
        this(messagePack, new InputStreamReader(inputStream));
    }

    public JSONUnpacker(MessagePack messagePack, InputStream inputStream, Charset charset) {
        this(messagePack, new InputStreamReader(inputStream, charset));
    }

    JSONUnpacker(MessagePack messagePack, Reader reader) {
        super(messagePack, null);
        this.in = reader;
        this.parser = new C7810b();
    }

    private Value listToValue(List list) {
        Value[] valueArr = new Value[list.size()];
        for (int i = 0; i < valueArr.length; i++) {
            valueArr[i] = objectToValue(list.get(i));
        }
        return ValueFactory.createArrayValue(valueArr, true);
    }

    private Value mapToValue(Map map) {
        Value[] valueArr = new Value[(map.size() * 2)];
        Iterator it = map.entrySet().iterator();
        for (int i = 0; i < valueArr.length; i += 2) {
            Entry entry = (Entry) it.next();
            valueArr[i] = objectToValue(entry.getKey());
            valueArr[i + 1] = objectToValue(entry.getValue());
        }
        return ValueFactory.createMapValue(valueArr, true);
    }

    private Value objectToValue(Object obj) {
        return obj instanceof String ? ValueFactory.createRawValue((String) obj) : obj instanceof Integer ? ValueFactory.createIntegerValue(((Integer) obj).intValue()) : obj instanceof Long ? ValueFactory.createIntegerValue(((Long) obj).longValue()) : obj instanceof Map ? mapToValue((Map) obj) : obj instanceof List ? listToValue((List) obj) : obj instanceof Boolean ? ValueFactory.createBooleanValue(((Boolean) obj).booleanValue()) : obj instanceof Double ? ValueFactory.createFloatValue(((Double) obj).doubleValue()) : ValueFactory.createNilValue();
    }

    public void close() {
        this.in.close();
        super.close();
    }

    public int getReadByteCount() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    protected Value nextValue() {
        try {
            return objectToValue(this.parser.m22086a(this.in));
        } catch (Throwable e) {
            throw new IOException(e);
        } catch (Throwable e2) {
            throw new IOException(e2);
        }
    }

    public void resetReadByteCount() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
