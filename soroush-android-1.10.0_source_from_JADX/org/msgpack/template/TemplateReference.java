package org.msgpack.template;

import java.lang.reflect.Type;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class TemplateReference<T> extends AbstractTemplate<T> {
    private Template<T> actualTemplate;
    private TemplateRegistry registry;
    private Type targetType;

    public TemplateReference(TemplateRegistry templateRegistry, Type type) {
        this.registry = templateRegistry;
        this.targetType = type;
    }

    private void validateActualTemplate() {
        if (this.actualTemplate == null) {
            this.actualTemplate = (Template) this.registry.cache.get(this.targetType);
            if (this.actualTemplate == null) {
                throw new MessageTypeException("Actual template have not been created");
            }
        }
    }

    public T read(Unpacker unpacker, T t) {
        validateActualTemplate();
        return this.actualTemplate.read(unpacker, t, false);
    }

    public T read(Unpacker unpacker, T t, boolean z) {
        validateActualTemplate();
        return this.actualTemplate.read(unpacker, t, z);
    }

    public void write(Packer packer, T t) {
        validateActualTemplate();
        this.actualTemplate.write(packer, t, false);
    }

    public void write(Packer packer, T t, boolean z) {
        validateActualTemplate();
        this.actualTemplate.write(packer, t, z);
    }
}
