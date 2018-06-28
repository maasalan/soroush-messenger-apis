package org.msgpack.template.builder;

import java.lang.reflect.Type;
import org.msgpack.MessageTypeException;
import org.msgpack.template.FieldOption;
import org.msgpack.template.builder.beans.PropertyDescriptor;

public class BeansFieldEntry extends FieldEntry {
    protected PropertyDescriptor desc;

    public BeansFieldEntry(BeansFieldEntry beansFieldEntry) {
        super(beansFieldEntry.option);
        this.desc = beansFieldEntry.getPropertyDescriptor();
    }

    public BeansFieldEntry(PropertyDescriptor propertyDescriptor) {
        this(propertyDescriptor, FieldOption.DEFAULT);
    }

    public BeansFieldEntry(PropertyDescriptor propertyDescriptor, FieldOption fieldOption) {
        super(fieldOption);
        this.desc = propertyDescriptor;
    }

    public Object get(Object obj) {
        try {
            return getPropertyDescriptor().getReadMethod().invoke(obj, new Object[0]);
        } catch (Throwable e) {
            throw new MessageTypeException(e);
        } catch (Throwable e2) {
            throw new MessageTypeException(e2);
        } catch (Throwable e22) {
            throw new MessageTypeException(e22);
        }
    }

    public Type getGenericType() {
        return getPropertyDescriptor().getReadMethod().getGenericReturnType();
    }

    public String getGetterName() {
        return getPropertyDescriptor().getReadMethod().getName();
    }

    public String getName() {
        return getPropertyDescriptor().getDisplayName();
    }

    public PropertyDescriptor getPropertyDescriptor() {
        return this.desc;
    }

    public String getSetterName() {
        return getPropertyDescriptor().getWriteMethod().getName();
    }

    public Class<?> getType() {
        return getPropertyDescriptor().getPropertyType();
    }

    public void set(Object obj, Object obj2) {
        try {
            getPropertyDescriptor().getWriteMethod().invoke(obj, new Object[]{obj2});
        } catch (Throwable e) {
            throw new MessageTypeException(e);
        } catch (Throwable e2) {
            throw new MessageTypeException(e2);
        } catch (Throwable e22) {
            throw new MessageTypeException(e22);
        }
    }
}
