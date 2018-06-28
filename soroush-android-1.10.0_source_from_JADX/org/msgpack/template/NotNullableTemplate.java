package org.msgpack.template;

import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class NotNullableTemplate<T> extends AbstractTemplate<T> {
    private Template<T> tmpl;

    public NotNullableTemplate(Template<T> template) {
        this.tmpl = template;
    }

    public T read(Unpacker unpacker, T t) {
        return read(unpacker, t, true);
    }

    public T read(Unpacker unpacker, T t, boolean z) {
        return this.tmpl.read(unpacker, t, z);
    }

    public void write(Packer packer, T t) {
        write(packer, t, true);
    }

    public void write(Packer packer, T t, boolean z) {
        this.tmpl.write(packer, t, z);
    }
}
