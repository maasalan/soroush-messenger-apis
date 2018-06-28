package org.msgpack.template;

import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class AnyTemplate<T> extends AbstractTemplate<T> {
    private TemplateRegistry registry;

    public AnyTemplate(TemplateRegistry templateRegistry) {
        this.registry = templateRegistry;
    }

    public T read(Unpacker unpacker, T t, boolean z) {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        if (t == null) {
            throw new MessageTypeException("convert into unknown type is invalid");
        }
        T read = unpacker.read((Object) t);
        if (!z || read != null) {
            return read;
        }
        throw new MessageTypeException("Unexpected nil value");
    }

    public void write(Packer packer, T t, boolean z) {
        if (t != null) {
            this.registry.lookup(t.getClass()).write(packer, t);
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
