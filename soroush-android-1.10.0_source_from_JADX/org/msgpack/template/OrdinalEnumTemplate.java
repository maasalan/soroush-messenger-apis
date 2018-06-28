package org.msgpack.template;

import java.util.HashMap;
import org.msgpack.MessageTypeException;
import org.msgpack.annotation.OrdinalEnum;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class OrdinalEnumTemplate<T> extends AbstractTemplate<T> {
    protected T[] entries;
    protected HashMap<T, Integer> reverse = new HashMap();
    protected boolean strict;

    public OrdinalEnumTemplate(Class<T> cls) {
        this.entries = cls.getEnumConstants();
        boolean z = false;
        for (int i = 0; i < this.entries.length; i++) {
            this.reverse.put(this.entries[i], Integer.valueOf(i));
        }
        if (!cls.isAnnotationPresent(OrdinalEnum.class) || ((OrdinalEnum) cls.getAnnotation(OrdinalEnum.class)).strict()) {
            z = true;
        }
        this.strict = z;
    }

    public T read(Unpacker unpacker, T t, boolean z) {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readInt = unpacker.readInt();
        if (readInt < this.entries.length) {
            return this.entries[readInt];
        }
        if (!this.strict) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("ordinal: ");
        stringBuilder.append(readInt);
        throw new MessageTypeException(new IllegalArgumentException(stringBuilder.toString()));
    }

    public void write(Packer packer, T t, boolean z) {
        if (t != null) {
            Integer num = (Integer) this.reverse.get(t);
            if (num == null) {
                StringBuilder stringBuilder = new StringBuilder("ordinal: ");
                stringBuilder.append(num);
                throw new MessageTypeException(new IllegalArgumentException(stringBuilder.toString()));
            }
            packer.write(num.intValue());
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
