package org.msgpack.template.builder;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.template.AbstractTemplate;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.unpacker.Unpacker;

public class ReflectionTemplateBuilder extends AbstractTemplateBuilder {
    private static Logger LOG = Logger.getLogger(ReflectionBeansTemplateBuilder.class.getName());

    protected static class ReflectionClassTemplate<T> extends AbstractTemplate<T> {
        protected Class<T> targetClass;
        protected ReflectionFieldTemplate[] templates;

        protected ReflectionClassTemplate(Class<T> cls, ReflectionFieldTemplate[] reflectionFieldTemplateArr) {
            this.targetClass = cls;
            this.templates = reflectionFieldTemplateArr;
        }

        public T read(Unpacker unpacker, T t, boolean z) {
            if (!z && unpacker.trySkipNil()) {
                return null;
            }
            if (t == null) {
                try {
                    t = this.targetClass.newInstance();
                } catch (IOException e) {
                    throw e;
                } catch (Throwable e2) {
                    throw new MessageTypeException(e2);
                }
            }
            unpacker.readArrayBegin();
            for (ReflectionFieldTemplate reflectionFieldTemplate : this.templates) {
                if (!reflectionFieldTemplate.entry.isAvailable()) {
                    unpacker.skip();
                } else if (!reflectionFieldTemplate.entry.isOptional() || !unpacker.trySkipNil()) {
                    reflectionFieldTemplate.read(unpacker, t, false);
                }
            }
            unpacker.readArrayEnd();
            return t;
        }

        public void write(Packer packer, T t, boolean z) {
            if (t != null) {
                try {
                    packer.writeArrayBegin(this.templates.length);
                    for (ReflectionFieldTemplate reflectionFieldTemplate : this.templates) {
                        if (reflectionFieldTemplate.entry.isAvailable()) {
                            Object obj = reflectionFieldTemplate.entry.get(t);
                            if (obj != null) {
                                reflectionFieldTemplate.write(packer, obj, true);
                            } else if (reflectionFieldTemplate.entry.isNotNullable()) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(reflectionFieldTemplate.entry.getName());
                                stringBuilder.append(" cannot be null by @NotNullable");
                                throw new MessageTypeException(stringBuilder.toString());
                            }
                        }
                        packer.writeNil();
                    }
                    packer.writeArrayEnd();
                } catch (IOException e) {
                    throw e;
                } catch (Throwable e2) {
                    throw new MessageTypeException(e2);
                }
            } else if (z) {
                throw new MessageTypeException("attempted to write null");
            } else {
                packer.writeNil();
            }
        }
    }

    protected static abstract class ReflectionFieldTemplate extends AbstractTemplate<Object> {
        protected FieldEntry entry;

        ReflectionFieldTemplate(FieldEntry fieldEntry) {
            this.entry = fieldEntry;
        }

        void setNil(Object obj) {
            this.entry.set(obj, null);
        }
    }

    static final class FieldTemplateImpl extends ReflectionFieldTemplate {
        private Template template;

        public FieldTemplateImpl(FieldEntry fieldEntry, Template template) {
            super(fieldEntry);
            this.template = template;
        }

        public final Object read(Unpacker unpacker, Object obj, boolean z) {
            Object obj2 = this.entry.get(obj);
            Object read = this.template.read(unpacker, obj2, z);
            if (read != obj2) {
                this.entry.set(obj, read);
            }
            return read;
        }

        public final void write(Packer packer, Object obj, boolean z) {
            this.template.write(packer, obj, z);
        }
    }

    public ReflectionTemplateBuilder(TemplateRegistry templateRegistry) {
        this(templateRegistry, null);
    }

    public ReflectionTemplateBuilder(TemplateRegistry templateRegistry, ClassLoader classLoader) {
        super(templateRegistry);
    }

    public <T> Template<T> buildTemplate(Class<T> cls, FieldEntry[] fieldEntryArr) {
        if (fieldEntryArr != null) {
            return new ReflectionClassTemplate(cls, toTemplates(fieldEntryArr));
        }
        StringBuilder stringBuilder = new StringBuilder("entries is null: ");
        stringBuilder.append(cls);
        throw new NullPointerException(stringBuilder.toString());
    }

    public boolean matchType(Type type, boolean z) {
        Class cls = (Class) type;
        z = AbstractTemplateBuilder.matchAtClassTemplateBuilder(cls, z);
        if (z && LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            StringBuilder stringBuilder = new StringBuilder("matched type: ");
            stringBuilder.append(cls.getName());
            logger.fine(stringBuilder.toString());
        }
        return z;
    }

    protected ReflectionFieldTemplate[] toTemplates(FieldEntry[] fieldEntryArr) {
        int i = 0;
        for (FieldEntry fieldEntry : fieldEntryArr) {
            Field field = ((DefaultFieldEntry) fieldEntry).getField();
            if (!Modifier.isPublic(field.getModifiers())) {
                field.setAccessible(true);
            }
        }
        ReflectionFieldTemplate[] reflectionFieldTemplateArr = new ReflectionFieldTemplate[fieldEntryArr.length];
        while (i < fieldEntryArr.length) {
            FieldEntry fieldEntry2 = fieldEntryArr[i];
            reflectionFieldTemplateArr[i] = new FieldTemplateImpl(fieldEntry2, this.registry.lookup(fieldEntry2.getGenericType()));
            i++;
        }
        return reflectionFieldTemplateArr;
    }
}
