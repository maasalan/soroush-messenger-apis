package org.msgpack.jackson.dataformat;

import com.d.a.b.f.b;
import com.d.a.c.t;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExtensionTypeCustomDeserializers {
    private Map<Byte, Deser> deserTable = new ConcurrentHashMap();
    private final t objectMapper = new t(new MessagePackFactory().setReuseResourceInParser(false));

    public interface Deser {
        Object deserialize(byte[] bArr);
    }

    public void addCustomDeser(byte b, final Deser deser) {
        this.deserTable.put(Byte.valueOf(b), new Deser() {
            public Object deserialize(byte[] bArr) {
                return deser.deserialize(bArr);
            }
        });
    }

    public <T> void addTargetClass(byte b, final Class<T> cls) {
        this.deserTable.put(Byte.valueOf(b), new Deser() {
            public Object deserialize(byte[] bArr) {
                return ExtensionTypeCustomDeserializers.this.objectMapper.a(bArr, cls);
            }
        });
    }

    public void addTargetTypeReference(byte b, final b bVar) {
        this.deserTable.put(Byte.valueOf(b), new Deser() {
            public Object deserialize(byte[] bArr) {
                return ExtensionTypeCustomDeserializers.this.objectMapper.a(bArr, bVar);
            }
        });
    }

    public void clearEntries() {
        this.deserTable.clear();
    }

    public Deser getDeser(byte b) {
        return (Deser) this.deserTable.get(Byte.valueOf(b));
    }
}
