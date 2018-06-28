package org.msgpack.jackson.dataformat;

import com.d.a.b.g;
import com.d.a.c.aa;
import com.d.a.c.k.b.al;

public class MessagePackKeySerializer extends al<Object> {
    public MessagePackKeySerializer() {
        super(Object.class);
    }

    public void serialize(Object obj, g gVar, aa aaVar) {
        gVar.writeFieldName(new MessagePackSerializedString(obj));
    }
}
