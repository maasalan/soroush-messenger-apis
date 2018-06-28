package org.msgpack.template.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.annotation.Ignore;
import org.msgpack.annotation.Index;
import org.msgpack.annotation.NotNullable;
import org.msgpack.annotation.Optional;
import org.msgpack.packer.Packer;
import org.msgpack.template.FieldOption;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.template.builder.beans.PropertyDescriptor;
import org.msgpack.unpacker.Unpacker;

public class ReflectionBeansTemplateBuilder extends ReflectionTemplateBuilder {
    private static Logger LOG = Logger.getLogger(ReflectionBeansTemplateBuilder.class.getName());

    static class ReflectionBeansFieldTemplate extends ReflectionFieldTemplate {
        ReflectionBeansFieldTemplate(FieldEntry fieldEntry) {
            super(fieldEntry);
        }

        public Object read(Unpacker unpacker, Object obj, boolean z) {
            Object read = unpacker.read(this.entry.getType());
            this.entry.set(obj, read);
            return read;
        }

        public void write(Packer packer, Object obj, boolean z) {
            packer.write(obj);
        }
    }

    public ReflectionBeansTemplateBuilder(TemplateRegistry templateRegistry) {
        super(templateRegistry, null);
    }

    private int getMethodIndex(Method method) {
        Index index = (Index) method.getAnnotation(Index.class);
        return index == null ? -1 : index.value();
    }

    private FieldOption getMethodOption(Method method) {
        return AbstractTemplateBuilder.isAnnotated((AccessibleObject) method, Ignore.class) ? FieldOption.IGNORE : AbstractTemplateBuilder.isAnnotated((AccessibleObject) method, Optional.class) ? FieldOption.OPTIONAL : AbstractTemplateBuilder.isAnnotated((AccessibleObject) method, NotNullable.class) ? FieldOption.NOTNULLABLE : FieldOption.DEFAULT;
    }

    private int getPropertyIndex(PropertyDescriptor propertyDescriptor) {
        int methodIndex = getMethodIndex(propertyDescriptor.getReadMethod());
        return methodIndex >= 0 ? methodIndex : getMethodIndex(propertyDescriptor.getWriteMethod());
    }

    private FieldOption getPropertyOption(BeansFieldEntry beansFieldEntry, FieldOption fieldOption) {
        FieldOption methodOption = getMethodOption(beansFieldEntry.getPropertyDescriptor().getReadMethod());
        if (methodOption != FieldOption.DEFAULT) {
            return methodOption;
        }
        FieldOption methodOption2 = getMethodOption(beansFieldEntry.getPropertyDescriptor().getWriteMethod());
        return methodOption2 != FieldOption.DEFAULT ? methodOption2 : fieldOption;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isIgnoreProperty(org.msgpack.template.builder.beans.PropertyDescriptor r4) {
        /*
        r3 = this;
        r0 = 1;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r4.getReadMethod();
        r4 = r4.getWriteMethod();
        if (r1 == 0) goto L_0x0037;
    L_0x000e:
        if (r4 == 0) goto L_0x0037;
    L_0x0010:
        r2 = r1.getModifiers();
        r2 = java.lang.reflect.Modifier.isPublic(r2);
        if (r2 == 0) goto L_0x0037;
    L_0x001a:
        r2 = r4.getModifiers();
        r2 = java.lang.reflect.Modifier.isPublic(r2);
        if (r2 == 0) goto L_0x0037;
    L_0x0024:
        r2 = org.msgpack.annotation.Ignore.class;
        r1 = org.msgpack.template.builder.AbstractTemplateBuilder.isAnnotated(r1, r2);
        if (r1 != 0) goto L_0x0037;
    L_0x002c:
        r1 = org.msgpack.annotation.Ignore.class;
        r4 = org.msgpack.template.builder.AbstractTemplateBuilder.isAnnotated(r4, r1);
        if (r4 == 0) goto L_0x0035;
    L_0x0034:
        return r0;
    L_0x0035:
        r4 = 0;
        return r4;
    L_0x0037:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.ReflectionBeansTemplateBuilder.isIgnoreProperty(org.msgpack.template.builder.beans.PropertyDescriptor):boolean");
    }

    public boolean matchType(Type type, boolean z) {
        Class cls = (Class) type;
        z = AbstractTemplateBuilder.matchAtBeansClassTemplateBuilder(cls, z);
        if (z && LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            StringBuilder stringBuilder = new StringBuilder("matched type: ");
            stringBuilder.append(cls.getName());
            logger.fine(stringBuilder.toString());
        }
        return z;
    }

    public org.msgpack.template.builder.FieldEntry[] toFieldEntries(java.lang.Class<?> r7, org.msgpack.template.FieldOption r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = org.msgpack.template.builder.beans.Introspector.getBeanInfo(r7);	 Catch:{ IntrospectionException -> 0x009e }
        r7 = r0.getPropertyDescriptors();
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 0;
        r2 = r1;
    L_0x000f:
        r3 = r7.length;
        if (r2 >= r3) goto L_0x0020;
    L_0x0012:
        r3 = r7[r2];
        r4 = r6.isIgnoreProperty(r3);
        if (r4 != 0) goto L_0x001d;
    L_0x001a:
        r0.add(r3);
    L_0x001d:
        r2 = r2 + 1;
        goto L_0x000f;
    L_0x0020:
        r7 = r0.size();
        r7 = new org.msgpack.template.builder.beans.PropertyDescriptor[r7];
        r0.toArray(r7);
        r0 = r7.length;
        r0 = new org.msgpack.template.builder.BeansFieldEntry[r0];
        r2 = r1;
    L_0x002d:
        r3 = r7.length;
        if (r2 >= r3) goto L_0x0074;
    L_0x0030:
        r3 = r7[r2];
        r4 = r6.getPropertyIndex(r3);
        if (r4 < 0) goto L_0x0071;
    L_0x0038:
        r5 = r0[r4];
        if (r5 == 0) goto L_0x0050;
    L_0x003c:
        r7 = new org.msgpack.template.builder.TemplateBuildException;
        r8 = new java.lang.StringBuilder;
        r0 = "duplicated index: ";
        r8.<init>(r0);
        r8.append(r4);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0050:
        r5 = r0.length;
        if (r4 < r5) goto L_0x0067;
    L_0x0053:
        r7 = new org.msgpack.template.builder.TemplateBuildException;
        r8 = new java.lang.StringBuilder;
        r0 = "invalid index: ";
        r8.<init>(r0);
        r8.append(r4);
        r8 = r8.toString();
        r7.<init>(r8);
        throw r7;
    L_0x0067:
        r5 = new org.msgpack.template.builder.BeansFieldEntry;
        r5.<init>(r3);
        r0[r4] = r5;
        r3 = 0;
        r7[r2] = r3;
    L_0x0071:
        r2 = r2 + 1;
        goto L_0x002d;
    L_0x0074:
        r2 = r1;
        r3 = r2;
    L_0x0076:
        r4 = r7.length;
        if (r2 >= r4) goto L_0x008e;
    L_0x0079:
        r4 = r7[r2];
        if (r4 == 0) goto L_0x008b;
    L_0x007d:
        r5 = r0[r3];
        if (r5 == 0) goto L_0x0084;
    L_0x0081:
        r3 = r3 + 1;
        goto L_0x007d;
    L_0x0084:
        r5 = new org.msgpack.template.builder.BeansFieldEntry;
        r5.<init>(r4);
        r0[r3] = r5;
    L_0x008b:
        r2 = r2 + 1;
        goto L_0x0076;
    L_0x008e:
        r7 = r0.length;
        if (r1 >= r7) goto L_0x009d;
    L_0x0091:
        r7 = r0[r1];
        r2 = r6.getPropertyOption(r7, r8);
        r7.setOption(r2);
        r1 = r1 + 1;
        goto L_0x008e;
    L_0x009d:
        return r0;
    L_0x009e:
        r8 = new org.msgpack.template.builder.TemplateBuildException;
        r0 = new java.lang.StringBuilder;
        r1 = "Class must be java beans class:";
        r0.<init>(r1);
        r7 = r7.getName();
        r0.append(r7);
        r7 = r0.toString();
        r8.<init>(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.ReflectionBeansTemplateBuilder.toFieldEntries(java.lang.Class, org.msgpack.template.FieldOption):org.msgpack.template.builder.FieldEntry[]");
    }

    protected ReflectionFieldTemplate[] toTemplates(FieldEntry[] fieldEntryArr) {
        ReflectionFieldTemplate[] reflectionFieldTemplateArr = new ReflectionFieldTemplate[fieldEntryArr.length];
        for (int i = 0; i < fieldEntryArr.length; i++) {
            FieldEntry fieldEntry = fieldEntryArr[i];
            if (fieldEntry.getType().isPrimitive()) {
                reflectionFieldTemplateArr[i] = new ReflectionBeansFieldTemplate(fieldEntry);
            } else {
                reflectionFieldTemplateArr[i] = new FieldTemplateImpl(fieldEntry, this.registry.lookup(fieldEntry.getGenericType()));
            }
        }
        return reflectionFieldTemplateArr;
    }
}
