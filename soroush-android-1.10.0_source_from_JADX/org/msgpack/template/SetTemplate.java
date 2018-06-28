package org.msgpack.template;

import java.util.HashSet;
import java.util.Set;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class SetTemplate<E> extends AbstractTemplate<Set<E>> {
    private Template<E> elementTemplate;

    public SetTemplate(Template<E> template) {
        this.elementTemplate = template;
    }

    public Set<E> read(Unpacker unpacker, Set<E> set, boolean z) {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readArrayBegin = unpacker.readArrayBegin();
        if (set == null) {
            set = new HashSet(readArrayBegin);
        } else {
            set.clear();
        }
        for (int i = 0; i < readArrayBegin; i++) {
            set.add(this.elementTemplate.read(unpacker, null));
        }
        unpacker.readArrayEnd();
        return set;
    }

    public void write(Packer packer, Set<E> set, boolean z) {
        if (set instanceof Set) {
            packer.writeArrayBegin(set.size());
            for (E write : set) {
                this.elementTemplate.write(packer, write);
            }
            packer.writeArrayEnd();
        } else if (set != null) {
            StringBuilder stringBuilder = new StringBuilder("Target is not a List but ");
            stringBuilder.append(set.getClass());
            throw new MessageTypeException(stringBuilder.toString());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
