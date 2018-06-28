package org.msgpack.template.builder.beans;

import org.msgpack.util.TemplatePrecompiler;

public class BeanDescriptor extends FeatureDescriptor {
    private Class<?> beanClass;
    private Class<?> customizerClass;

    public BeanDescriptor(Class<?> cls) {
        this(cls, null);
    }

    public BeanDescriptor(Class<?> cls, Class<?> cls2) {
        if (cls == null) {
            throw new NullPointerException();
        }
        setName(getShortClassName(cls));
        this.beanClass = cls;
        this.customizerClass = cls2;
    }

    private String getShortClassName(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(TemplatePrecompiler.DEFAULT_DEST);
        return lastIndexOf == -1 ? name : name.substring(lastIndexOf + 1);
    }

    public Class<?> getBeanClass() {
        return this.beanClass;
    }

    public Class<?> getCustomizerClass() {
        return this.customizerClass;
    }
}
