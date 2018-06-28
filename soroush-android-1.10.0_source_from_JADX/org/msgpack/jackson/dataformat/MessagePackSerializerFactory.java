package org.msgpack.jackson.dataformat;

import com.d.a.c.b.i;
import com.d.a.c.j;
import com.d.a.c.k.g;
import com.d.a.c.o;
import com.d.a.c.y;

public class MessagePackSerializerFactory extends g {
    public MessagePackSerializerFactory() {
        super(null);
    }

    public MessagePackSerializerFactory(i iVar) {
        super(iVar);
    }

    public o<Object> createKeySerializer(y yVar, j jVar, o<Object> oVar) {
        return new MessagePackKeySerializer();
    }
}
