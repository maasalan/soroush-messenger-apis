package org.msgpack.template.builder;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.msgpack.annotation.Beans;
import org.msgpack.annotation.Ignore;
import org.msgpack.annotation.Index;
import org.msgpack.annotation.Message;
import org.msgpack.annotation.MessagePackBeans;
import org.msgpack.annotation.MessagePackMessage;
import org.msgpack.annotation.MessagePackOrdinalEnum;
import org.msgpack.annotation.NotNullable;
import org.msgpack.annotation.Optional;
import org.msgpack.annotation.OrdinalEnum;
import org.msgpack.template.FieldList;
import org.msgpack.template.FieldList.Entry;
import org.msgpack.template.FieldOption;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;

public abstract class AbstractTemplateBuilder implements TemplateBuilder {
    protected TemplateRegistry registry;

    protected AbstractTemplateBuilder(TemplateRegistry templateRegistry) {
        this.registry = templateRegistry;
    }

    private int getFieldIndex(Field field, int i) {
        Index index = (Index) field.getAnnotation(Index.class);
        return index == null ? i + 1 : index.value();
    }

    private FieldOption getFieldOption(Field field, FieldOption fieldOption) {
        int modifiers = field.getModifiers();
        if (!(Modifier.isStatic(modifiers) || Modifier.isFinal(modifiers))) {
            if (!Modifier.isTransient(modifiers)) {
                return isAnnotated((AccessibleObject) field, Ignore.class) ? FieldOption.IGNORE : isAnnotated((AccessibleObject) field, Optional.class) ? FieldOption.OPTIONAL : isAnnotated((AccessibleObject) field, NotNullable.class) ? FieldOption.NOTNULLABLE : fieldOption != FieldOption.DEFAULT ? fieldOption : field.getType().isPrimitive() ? FieldOption.NOTNULLABLE : FieldOption.OPTIONAL;
            }
        }
        return FieldOption.IGNORE;
    }

    private Field[] getFields(Class<?> cls) {
        List arrayList = new ArrayList();
        int i = 0;
        Class superclass;
        while (superclass != Object.class) {
            Object declaredFields = superclass.getDeclaredFields();
            i += declaredFields.length;
            arrayList.add(declaredFields);
            superclass = superclass.getSuperclass();
        }
        Object obj = new Field[i];
        int i2 = 0;
        for (i = arrayList.size() - 1; i >= 0; i--) {
            Field[] fieldArr = (Field[]) arrayList.get(i);
            System.arraycopy(fieldArr, 0, obj, i2, fieldArr.length);
            i2 += fieldArr.length;
        }
        return obj;
    }

    public static boolean isAnnotated(Class<?> cls, Class<? extends Annotation> cls2) {
        return cls.getAnnotation(cls2) != null;
    }

    public static boolean isAnnotated(AccessibleObject accessibleObject, Class<? extends Annotation> cls) {
        return accessibleObject.getAnnotation(cls) != null;
    }

    public static boolean matchAtArrayTemplateBuilder(Class<?> cls, boolean z) {
        return cls instanceof GenericArrayType ? true : cls.isArray();
    }

    public static boolean matchAtBeansClassTemplateBuilder(Type type, boolean z) {
        Class cls = (Class) type;
        return z ? isAnnotated(cls, Beans.class) || isAnnotated(cls, MessagePackBeans.class) : (cls.isEnum() && cls.isInterface()) ? false : true;
    }

    public static boolean matchAtClassTemplateBuilder(Class<?> cls, boolean z) {
        return z ? isAnnotated((Class) cls, Message.class) || isAnnotated((Class) cls, MessagePackMessage.class) : (cls.isEnum() || cls.isInterface()) ? false : true;
    }

    public static boolean matchAtOrdinalEnumTemplateBuilder(Class<?> cls, boolean z) {
        if (!z) {
            return cls.isEnum();
        }
        if (!isAnnotated((Class) cls, OrdinalEnum.class)) {
            if (!isAnnotated((Class) cls, MessagePackOrdinalEnum.class)) {
                return false;
            }
        }
        return true;
    }

    private FieldEntry[] toFieldEntries(Class<?> cls, FieldList fieldList) {
        List list = fieldList.getList();
        FieldEntry[] fieldEntryArr = new FieldEntry[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Entry entry = (Entry) list.get(i);
            if (entry.isAvailable()) {
                try {
                    fieldEntryArr[i] = new DefaultFieldEntry(cls.getDeclaredField(entry.getName()), entry.getOption());
                } catch (Throwable e) {
                    throw new TemplateBuildException(e);
                } catch (Throwable e2) {
                    throw new TemplateBuildException(e2);
                }
            }
            fieldEntryArr[i] = new DefaultFieldEntry();
        }
        return fieldEntryArr;
    }

    public <T> Template<T> buildTemplate(Class<T> cls, FieldList fieldList) {
        checkClassValidation(cls);
        return buildTemplate((Class) cls, toFieldEntries((Class) cls, fieldList));
    }

    protected abstract <T> Template<T> buildTemplate(Class<T> cls, FieldEntry[] fieldEntryArr);

    public <T> Template<T> buildTemplate(Type type) {
        Class cls = (Class) type;
        checkClassValidation(cls);
        return buildTemplate(cls, toFieldEntries(cls, getFieldOption(cls)));
    }

    protected void checkClassValidation(Class<?> cls) {
        StringBuilder stringBuilder;
        if (cls.isInterface()) {
            stringBuilder = new StringBuilder("Cannot build template for interface: ");
            stringBuilder.append(cls.getName());
            throw new TemplateBuildException(stringBuilder.toString());
        } else if (Modifier.isAbstract(cls.getModifiers())) {
            stringBuilder = new StringBuilder("Cannot build template for abstract class: ");
            stringBuilder.append(cls.getName());
            throw new TemplateBuildException(stringBuilder.toString());
        } else if (cls.isArray()) {
            stringBuilder = new StringBuilder("Cannot build template for array class: ");
            stringBuilder.append(cls.getName());
            throw new TemplateBuildException(stringBuilder.toString());
        } else if (cls.isPrimitive()) {
            stringBuilder = new StringBuilder("Cannot build template of primitive type: ");
            stringBuilder.append(cls.getName());
            throw new TemplateBuildException(stringBuilder.toString());
        }
    }

    protected FieldOption getFieldOption(Class<?> cls) {
        Message message = (Message) cls.getAnnotation(Message.class);
        return message == null ? FieldOption.DEFAULT : ((MessagePackMessage) cls.getAnnotation(MessagePackMessage.class)) == null ? FieldOption.DEFAULT : message.value();
    }

    public <T> Template<T> loadTemplate(Type type) {
        return null;
    }

    protected FieldEntry[] toFieldEntries(Class<?> cls, FieldOption fieldOption) {
        Field[] fields = getFields(cls);
        List arrayList = new ArrayList();
        int i = 0;
        int i2 = -1;
        for (Field field : fields) {
            FieldOption fieldOption2 = getFieldOption(field, fieldOption);
            if (fieldOption2 != FieldOption.IGNORE) {
                int fieldIndex = getFieldIndex(field, i2);
                StringBuilder stringBuilder;
                if (arrayList.size() > fieldIndex && arrayList.get(fieldIndex) != null) {
                    stringBuilder = new StringBuilder("duplicated index: ");
                    stringBuilder.append(fieldIndex);
                    throw new TemplateBuildException(stringBuilder.toString());
                } else if (fieldIndex < 0) {
                    stringBuilder = new StringBuilder("invalid index: ");
                    stringBuilder.append(fieldIndex);
                    throw new TemplateBuildException(stringBuilder.toString());
                } else {
                    while (arrayList.size() <= fieldIndex) {
                        arrayList.add(null);
                    }
                    arrayList.set(fieldIndex, new DefaultFieldEntry(field, fieldOption2));
                    if (i2 < fieldIndex) {
                        i2 = fieldIndex;
                    }
                }
            }
        }
        FieldEntry[] fieldEntryArr = new FieldEntry[(i2 + 1)];
        while (i < arrayList.size()) {
            FieldEntry fieldEntry = (FieldEntry) arrayList.get(i);
            if (fieldEntry == null) {
                fieldEntryArr[i] = new DefaultFieldEntry();
            } else {
                fieldEntryArr[i] = fieldEntry;
            }
            i++;
        }
        return fieldEntryArr;
    }

    public void writeTemplate(Type type, String str) {
        throw new UnsupportedOperationException(type.toString());
    }
}
