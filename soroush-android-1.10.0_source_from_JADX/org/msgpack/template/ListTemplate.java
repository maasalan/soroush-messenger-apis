package org.msgpack.template;

import java.util.ArrayList;
import java.util.List;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ListTemplate<E> extends AbstractTemplate<List<E>> {
    private Template<E> elementTemplate;

    public ListTemplate(Template<E> template) {
        this.elementTemplate = template;
    }

    public List<E> read(Unpacker unpacker, List<E> list, boolean z) {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readArrayBegin = unpacker.readArrayBegin();
        if (list == null) {
            list = new ArrayList(readArrayBegin);
        } else {
            list.clear();
        }
        for (int i = 0; i < readArrayBegin; i++) {
            list.add(this.elementTemplate.read(unpacker, null));
        }
        unpacker.readArrayEnd();
        return list;
    }

    public void write(Packer packer, List<E> list, boolean z) {
        if (list instanceof List) {
            packer.writeArrayBegin(list.size());
            for (E write : list) {
                this.elementTemplate.write(packer, write);
            }
            packer.writeArrayEnd();
        } else if (list != null) {
            StringBuilder stringBuilder = new StringBuilder("Target is not a List but ");
            stringBuilder.append(list.getClass());
            throw new MessageTypeException(stringBuilder.toString());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
