package org.msgpack.template.builder;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.template.AbstractTemplate;
import org.msgpack.template.BooleanArrayTemplate;
import org.msgpack.template.ByteArrayTemplate;
import org.msgpack.template.DoubleArrayTemplate;
import org.msgpack.template.FieldList;
import org.msgpack.template.FloatArrayTemplate;
import org.msgpack.template.IntegerArrayTemplate;
import org.msgpack.template.LongArrayTemplate;
import org.msgpack.template.ObjectArrayTemplate;
import org.msgpack.template.ShortArrayTemplate;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.unpacker.Unpacker;

public class ArrayTemplateBuilder extends AbstractTemplateBuilder {
    private static final Logger LOG = Logger.getLogger(ArrayTemplateBuilder.class.getName());

    static class ReflectionMultidimentionalArrayTemplate extends AbstractTemplate {
        private Class componentClass;
        private Template componentTemplate;

        public ReflectionMultidimentionalArrayTemplate(Class cls, Template template) {
            this.componentClass = cls;
            this.componentTemplate = template;
        }

        Class getComponentClass() {
            return this.componentClass;
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

    public ArrayTemplateBuilder(TemplateRegistry templateRegistry) {
        super(templateRegistry);
    }

    private Template toTemplate(Type type, Type type2, Class cls, int i) {
        if (i == 1) {
            return cls == Boolean.TYPE ? BooleanArrayTemplate.getInstance() : cls == Short.TYPE ? ShortArrayTemplate.getInstance() : cls == Integer.TYPE ? IntegerArrayTemplate.getInstance() : cls == Long.TYPE ? LongArrayTemplate.getInstance() : cls == Float.TYPE ? FloatArrayTemplate.getInstance() : cls == Double.TYPE ? DoubleArrayTemplate.getInstance() : cls == Byte.TYPE ? ByteArrayTemplate.getInstance() : new ObjectArrayTemplate(cls, this.registry.lookup(type2));
        } else {
            if (i == 2) {
                return new ReflectionMultidimentionalArrayTemplate(Array.newInstance(cls, 0).getClass(), toTemplate(type, type2, cls, i - 1));
            }
            ReflectionMultidimentionalArrayTemplate reflectionMultidimentionalArrayTemplate = (ReflectionMultidimentionalArrayTemplate) toTemplate(type, type2, cls, i - 1);
            return new ReflectionMultidimentionalArrayTemplate(Array.newInstance(reflectionMultidimentionalArrayTemplate.getComponentClass(), 0).getClass(), reflectionMultidimentionalArrayTemplate);
        }
    }

    public <T> Template<T> buildTemplate(Class<T> cls, FieldList fieldList) {
        throw new UnsupportedOperationException(cls.getName());
    }

    protected <T> Template<T> buildTemplate(Class<T> cls, FieldEntry[] fieldEntryArr) {
        throw new UnsupportedOperationException(cls.getName());
    }

    public <T> Template<T> buildTemplate(Type type) {
        Type genericComponentType;
        Class cls;
        int i = 1;
        if (type instanceof GenericArrayType) {
            genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            while (genericComponentType instanceof GenericArrayType) {
                genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
                i++;
            }
            cls = genericComponentType instanceof ParameterizedType ? (Class) ((ParameterizedType) genericComponentType).getRawType() : (Class) genericComponentType;
        } else {
            genericComponentType = ((Class) type).getComponentType();
            while (genericComponentType.isArray()) {
                genericComponentType = genericComponentType.getComponentType();
                i++;
            }
            cls = genericComponentType;
        }
        return toTemplate(type, genericComponentType, cls, i);
    }

    public <T> Template<T> loadTemplate(Type type) {
        return null;
    }

    public boolean matchType(Type type, boolean z) {
        Class cls = (Class) type;
        z = AbstractTemplateBuilder.matchAtArrayTemplateBuilder(cls, false);
        if (z && LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            StringBuilder stringBuilder = new StringBuilder("matched type: ");
            stringBuilder.append(cls.getName());
            logger.fine(stringBuilder.toString());
        }
        return z;
    }

    public void writeTemplate(Type type, String str) {
        throw new UnsupportedOperationException(type.toString());
    }
}
