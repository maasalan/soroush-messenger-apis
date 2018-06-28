package org.msgpack.jackson.dataformat;

import com.d.a.b.g;
import com.d.a.c.aa;
import com.d.a.c.o;

public class MessagePackExtensionType$Serializer extends o<MessagePackExtensionType> {
    public void serialize(MessagePackExtensionType messagePackExtensionType, g gVar, aa aaVar) {
        if (gVar instanceof MessagePackGenerator) {
            ((MessagePackGenerator) gVar).writeExtensionType(messagePackExtensionType);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("'gen' is expected to be MessagePackGenerator but it's ");
        stringBuilder.append(gVar.getClass());
        throw new IllegalStateException(stringBuilder.toString());
    }
}
