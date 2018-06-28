package org.msgpack.template;

import java.lang.reflect.Array;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class ObjectArrayTemplate extends AbstractTemplate {
    protected Class componentClass;
    protected Template componentTemplate;

    public ObjectArrayTemplate(Class cls, Template template) {
        this.componentClass = cls;
        this.componentTemplate = template;
    }

    public Object read(Unpacker unpacker, Object obj, boolean z) {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        int readArrayBegin = unpacker.readArrayBegin();
        Object[] objArr = (Object[]) Array.newInstance(this.componentClass, readArrayBegin);
        for (int i = 0; i < readArrayBegin; i++) {
            objArr[i] = this.componentTemplate.read(unpacker, null, z);
        }
        unpacker.readArrayEnd();
        return objArr;
    }

    public void write(Packer packer, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                if (this.componentClass.isAssignableFrom(obj.getClass().getComponentType())) {
                    packer.writeArrayBegin(r0);
                    for (Object write : (Object[]) obj) {
                        this.componentTemplate.write(packer, write, z);
                    }
                    packer.writeArrayEnd();
                    return;
                }
            }
            throw new MessageTypeException();
        } else if (z) {
            throw new MessageTypeException("Attempted to write null");
        } else {
            packer.writeNil();
        }
    }
}
