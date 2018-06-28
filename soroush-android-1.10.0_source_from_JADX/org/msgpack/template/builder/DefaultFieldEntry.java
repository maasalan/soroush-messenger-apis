package org.msgpack.template.builder;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import org.msgpack.MessageTypeException;
import org.msgpack.template.FieldOption;

public class DefaultFieldEntry extends FieldEntry {
    protected Field field;

    public DefaultFieldEntry() {
        this(null, FieldOption.IGNORE);
    }

    public DefaultFieldEntry(Field field, FieldOption fieldOption) {
        super(fieldOption);
        this.field = field;
    }

    public DefaultFieldEntry(DefaultFieldEntry defaultFieldEntry) {
        this(defaultFieldEntry.field, defaultFieldEntry.option);
    }

    public Object get(Object obj) {
        try {
            return getField().get(obj);
        } catch (Throwable e) {
            throw new MessageTypeException(e);
        } catch (Throwable e2) {
            throw new MessageTypeException(e2);
        }
    }

    public Field getField() {
        return this.field;
    }

    public Type getGenericType() {
        return this.field.getGenericType();
    }

    public String getName() {
        return this.field.getName();
    }

    public Class<?> getType() {
        return this.field.getType();
    }

    public void set(Object obj, Object obj2) {
        try {
            this.field.set(obj, obj2);
        } catch (Throwable e) {
            throw new MessageTypeException(e);
        } catch (Throwable e2) {
            throw new MessageTypeException(e2);
        }
    }

    public void setField(Field field) {
        this.field = field;
    }
}
