package org.msgpack.template.builder;

import b.i;
import b.q;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.template.Template;
import org.msgpack.template.builder.JavassistTemplateBuilder.JavassistTemplate;
import org.msgpack.unpacker.Unpacker;

public class DefaultBuildContext extends BuildContext<FieldEntry> {
    protected FieldEntry[] entries;
    protected Class<?> origClass;
    protected String origName;
    protected Template<?>[] templates;

    public DefaultBuildContext(JavassistTemplateBuilder javassistTemplateBuilder) {
        super(javassistTemplateBuilder);
    }

    public static Object readPrivateField(Object obj, Class cls, String str) {
        Throwable e;
        Field field = null;
        try {
            Field declaredField = cls.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
                obj = declaredField.get(obj);
                if (declaredField != null) {
                    declaredField.setAccessible(false);
                }
                return obj;
            } catch (Exception e2) {
                e = e2;
                field = declaredField;
                try {
                    throw new MessageTypeException(e);
                } catch (Throwable th) {
                    e = th;
                    if (field != null) {
                        field.setAccessible(false);
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                field = declaredField;
                if (field != null) {
                    field.setAccessible(false);
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            throw new MessageTypeException(e);
        }
    }

    public static void readPrivateField(Unpacker unpacker, Object obj, Class cls, String str, Template template) {
        Throwable e;
        Field field = null;
        try {
            Field declaredField = cls.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                Object read = template.read(unpacker, obj2);
                if (read != obj2) {
                    declaredField.set(obj, read);
                }
                if (declaredField != null) {
                    declaredField.setAccessible(false);
                }
            } catch (Exception e2) {
                e = e2;
                field = declaredField;
                try {
                    throw new MessageTypeException(e);
                } catch (Throwable th) {
                    e = th;
                    declaredField = field;
                    if (declaredField != null) {
                        declaredField.setAccessible(false);
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                if (declaredField != null) {
                    declaredField.setAccessible(false);
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            throw new MessageTypeException(e);
        }
    }

    public static void writePrivateField(Packer packer, Object obj, Class cls, String str, Template template) {
        Throwable e;
        Field field = null;
        try {
            Field declaredField = cls.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
                template.write(packer, declaredField.get(obj));
                if (declaredField != null) {
                    declaredField.setAccessible(false);
                }
            } catch (Exception e2) {
                e = e2;
                field = declaredField;
                try {
                    throw new MessageTypeException(e);
                } catch (Throwable th) {
                    e = th;
                    if (field != null) {
                        field.setAccessible(false);
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                field = declaredField;
                if (field != null) {
                    field.setAccessible(false);
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
            throw new MessageTypeException(e);
        }
    }

    protected void buildConstructor() {
        i[] iVarArr = new i[2];
        iVarArr[0] = this.director.getCtClass(Class.class.getName());
        JavassistTemplateBuilder javassistTemplateBuilder = this.director;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Template.class.getName());
        stringBuilder.append("[]");
        iVarArr[1] = javassistTemplateBuilder.getCtClass(stringBuilder.toString());
        this.tmplCtClass.a(q.a(iVarArr, new i[0], this.tmplCtClass));
    }

    protected Template buildInstance(Class<?> cls) {
        return (Template) cls.getConstructor(new Class[]{Class.class, Template[].class}).newInstance(new Object[]{this.origClass, this.templates});
    }

    protected void buildMethodInit() {
    }

    protected String buildReadMethodBody() {
        resetStringBuilder();
        buildString("\n{\n");
        buildString("  if (!$3 && $1.trySkipNil()) {\n");
        buildString("    return null;\n");
        buildString("  }\n");
        buildString("  %s _$$_t;\n", this.origName);
        buildString("  if ($2 == null) {\n");
        buildString("    _$$_t = new %s();\n", this.origName);
        buildString("  } else {\n");
        buildString("    _$$_t = (%s) $2;\n", this.origName);
        buildString("  }\n");
        buildString("  $1.readArrayBegin();\n");
        for (FieldEntry fieldEntry : this.entries) {
            String str;
            if (fieldEntry.isAvailable()) {
                String str2;
                Object[] objArr;
                if (fieldEntry.isOptional()) {
                    buildString("  if ($1.trySkipNil()) {");
                    buildString("  } else {\n");
                }
                DefaultFieldEntry defaultFieldEntry = (DefaultFieldEntry) fieldEntry;
                boolean isPrivate = Modifier.isPrivate(defaultFieldEntry.getField().getModifiers());
                if (defaultFieldEntry.getType().isPrimitive()) {
                    if (isPrivate) {
                        str2 = "    %s.readPrivateField($1, _$$_t, %s.class, \"%s\", templates[%d]);\n";
                        objArr = new Object[]{DefaultBuildContext.class.getName(), defaultFieldEntry.getField().getDeclaringClass().getName(), defaultFieldEntry.getName(), Integer.valueOf(r0)};
                    } else {
                        buildString("    _$$_t.%s = $1.%s();\n", defaultFieldEntry.getName(), primitiveReadName(r5));
                        if (defaultFieldEntry.isOptional()) {
                        } else {
                            str = "  }\n";
                        }
                    }
                } else if (isPrivate) {
                    str2 = "    %s.readPrivateField($1, _$$_t, %s.class, \"%s\", templates[%d]);\n";
                    objArr = new Object[]{DefaultBuildContext.class.getName(), defaultFieldEntry.getField().getDeclaringClass().getName(), defaultFieldEntry.getName(), Integer.valueOf(r0)};
                } else {
                    str2 = "    _$$_t.%s = (%s) this.templates[%d].read($1, _$$_t.%s);\n";
                    objArr = new Object[]{defaultFieldEntry.getName(), defaultFieldEntry.getJavaTypeName(), Integer.valueOf(r0), defaultFieldEntry.getName()};
                }
                buildString(str2, objArr);
                if (defaultFieldEntry.isOptional()) {
                } else {
                    str = "  }\n";
                }
            } else {
                str = "  $1.skip();\n";
            }
            buildString(str);
        }
        buildString("  $1.readArrayEnd();\n");
        buildString("  return _$$_t;\n");
        buildString("}\n");
        return getBuiltString();
    }

    public Template buildTemplate(Class cls, FieldEntry[] fieldEntryArr, Template[] templateArr) {
        this.entries = fieldEntryArr;
        this.templates = templateArr;
        this.origClass = cls;
        this.origName = this.origClass.getName();
        return build(this.origName);
    }

    protected String buildWriteMethodBody() {
        resetStringBuilder();
        buildString("\n{\n");
        buildString("  if ($2 == null) {\n");
        buildString("    if ($3) {\n");
        buildString("      throw new %s(\"Attempted to write null\");\n", MessageTypeException.class.getName());
        buildString("    }\n");
        buildString("    $1.writeNil();\n");
        buildString("    return;\n");
        buildString("  }\n");
        buildString("  %s _$$_t = (%s) $2;\n", this.origName, this.origName);
        buildString("  $1.writeArrayBegin(%d);\n", Integer.valueOf(this.entries.length));
        for (FieldEntry fieldEntry : this.entries) {
            String str;
            if (fieldEntry.isAvailable()) {
                DefaultFieldEntry defaultFieldEntry = (DefaultFieldEntry) fieldEntry;
                boolean isPrivate = Modifier.isPrivate(defaultFieldEntry.getField().getModifiers());
                if (defaultFieldEntry.getType().isPrimitive()) {
                    if (isPrivate) {
                        buildString("  %s.writePrivateField($1, _$$_t, %s.class, \"%s\", templates[%d]);\n", DefaultBuildContext.class.getName(), defaultFieldEntry.getField().getDeclaringClass().getName(), defaultFieldEntry.getName(), Integer.valueOf(r0));
                    } else {
                        buildString("  $1.%s(_$$_t.%s);\n", primitiveWriteName(r6), defaultFieldEntry.getName());
                    }
                } else {
                    String str2;
                    Object[] objArr;
                    String str3;
                    Object[] objArr2;
                    if (isPrivate) {
                        str2 = "  if (%s.readPrivateField(_$$_t, %s.class, \"%s\") == null) {\n";
                        objArr = new Object[]{DefaultBuildContext.class.getName(), defaultFieldEntry.getField().getDeclaringClass().getName(), defaultFieldEntry.getName()};
                    } else {
                        str2 = "  if (_$$_t.%s == null) {\n";
                        objArr = new Object[]{defaultFieldEntry.getName()};
                    }
                    buildString(str2, objArr);
                    if (defaultFieldEntry.isNotNullable()) {
                        buildString("    throw new %s(\"%s cannot be null by @NotNullable\");\n", MessageTypeException.class.getName(), defaultFieldEntry.getName());
                    } else {
                        buildString("    $1.writeNil();\n");
                    }
                    buildString("  } else {\n");
                    if (isPrivate) {
                        str3 = "    %s.writePrivateField($1, _$$_t, %s.class, \"%s\", templates[%d]);\n";
                        objArr2 = new Object[]{DefaultBuildContext.class.getName(), defaultFieldEntry.getField().getDeclaringClass().getName(), defaultFieldEntry.getName(), Integer.valueOf(r0)};
                    } else {
                        str3 = "    templates[%d].write($1, _$$_t.%s);\n";
                        objArr2 = new Object[]{Integer.valueOf(r0), defaultFieldEntry.getName()};
                    }
                    buildString(str3, objArr2);
                    str = "  }\n";
                }
            } else {
                str = "  $1.writeNil();\n";
            }
            buildString(str);
        }
        buildString("  $1.writeArrayEnd();\n");
        buildString("}\n");
        return getBuiltString();
    }

    public Template loadTemplate(Class<?> cls, FieldEntry[] fieldEntryArr, Template[] templateArr) {
        this.entries = fieldEntryArr;
        this.templates = templateArr;
        this.origClass = cls;
        this.origName = this.origClass.getName();
        return load(this.origName);
    }

    protected void setSuperClass() {
        this.tmplCtClass.b(this.director.getCtClass(JavassistTemplate.class.getName()));
    }

    public void writeTemplate(Class<?> cls, FieldEntry[] fieldEntryArr, Template[] templateArr, String str) {
        this.entries = fieldEntryArr;
        this.templates = templateArr;
        this.origClass = cls;
        this.origName = this.origClass.getName();
        write(this.origName, str);
    }
}
