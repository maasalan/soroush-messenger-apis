package org.msgpack.template.builder;

import java.lang.reflect.Type;
import org.msgpack.template.FieldOption;

public abstract class FieldEntry {
    protected FieldOption option;

    public FieldEntry() {
        this(FieldOption.IGNORE);
    }

    public FieldEntry(FieldOption fieldOption) {
        this.option = fieldOption;
    }

    public String arrayTypeToString(Class<?> cls) {
        Class componentType = cls.getComponentType();
        int i = 1;
        while (componentType.isArray()) {
            componentType = componentType.getComponentType();
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(componentType.getName());
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append("[]");
        }
        return stringBuilder.toString();
    }

    public abstract Object get(Object obj);

    public abstract Type getGenericType();

    public String getJavaTypeName() {
        Class type = getType();
        return type.isArray() ? arrayTypeToString(type) : type.getName();
    }

    public abstract String getName();

    public FieldOption getOption() {
        return this.option;
    }

    public abstract Class<?> getType();

    public boolean isAvailable() {
        return this.option != FieldOption.IGNORE;
    }

    public boolean isNotNullable() {
        return this.option == FieldOption.NOTNULLABLE;
    }

    public boolean isOptional() {
        return this.option == FieldOption.OPTIONAL;
    }

    public abstract void set(Object obj, Object obj2);

    public void setOption(FieldOption fieldOption) {
        this.option = fieldOption;
    }
}
