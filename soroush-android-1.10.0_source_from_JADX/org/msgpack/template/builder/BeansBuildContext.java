package org.msgpack.template.builder;

import b.i;
import b.q;
import org.msgpack.MessageTypeException;
import org.msgpack.template.Template;
import org.msgpack.template.builder.JavassistTemplateBuilder.JavassistTemplate;

public class BeansBuildContext extends BuildContext<BeansFieldEntry> {
    protected BeansFieldEntry[] entries;
    protected Class<?> origClass;
    protected String origName;
    protected Template<?>[] templates;

    public BeansBuildContext(JavassistTemplateBuilder javassistTemplateBuilder) {
        super(javassistTemplateBuilder);
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
        buildString("{ ");
        buildString("if(!$3 && $1.trySkipNil()) {");
        buildString("  return null;");
        buildString("}");
        buildString("%s _$$_t;", this.origName);
        buildString("if($2 == null) {");
        buildString("  _$$_t = new %s();", this.origName);
        buildString("} else {");
        buildString("  _$$_t = (%s)$2;", this.origName);
        buildString("}");
        buildString("$1.readArrayBegin();");
        for (BeansFieldEntry beansFieldEntry : this.entries) {
            String str;
            if (beansFieldEntry.isAvailable()) {
                if (beansFieldEntry.isOptional()) {
                    buildString("if($1.trySkipNil()) {");
                    buildString("_$$_t.%s(null);", beansFieldEntry.getSetterName());
                    buildString("} else {");
                }
                if (beansFieldEntry.getType().isPrimitive()) {
                    buildString("_$$_t.%s( $1.%s() );", beansFieldEntry.getSetterName(), primitiveReadName(beansFieldEntry.getType()));
                } else {
                    buildString("_$$_t.%s( (%s)this.templates[%d].read($1, _$$_t.%s()) );", beansFieldEntry.getSetterName(), beansFieldEntry.getJavaTypeName(), Integer.valueOf(r0), beansFieldEntry.getGetterName());
                }
                if (beansFieldEntry.isOptional()) {
                    str = "}";
                } else {
                }
            } else {
                str = "$1.skip();";
            }
            buildString(str);
        }
        buildString("$1.readArrayEnd();");
        buildString("return _$$_t;");
        buildString("}");
        return getBuiltString();
    }

    public Template buildTemplate(Class<?> cls, BeansFieldEntry[] beansFieldEntryArr, Template[] templateArr) {
        this.entries = beansFieldEntryArr;
        this.templates = templateArr;
        this.origClass = cls;
        this.origName = this.origClass.getName();
        return build(this.origName);
    }

    protected String buildWriteMethodBody() {
        resetStringBuilder();
        buildString("{");
        buildString("if($2 == null) {");
        buildString("  if($3) {");
        buildString("    throw new %s(\"Attempted to write null\");", MessageTypeException.class.getName());
        buildString("  }");
        buildString("  $1.writeNil();");
        buildString("  return;");
        buildString("}");
        buildString("%s _$$_t = (%s)$2;", this.origName, this.origName);
        buildString("$1.writeArrayBegin(%d);", Integer.valueOf(this.entries.length));
        for (BeansFieldEntry beansFieldEntry : this.entries) {
            String str;
            if (beansFieldEntry.isAvailable()) {
                if (beansFieldEntry.getType().isPrimitive()) {
                    buildString("$1.%s(_$$_t.%s());", primitiveWriteName(beansFieldEntry.getType()), beansFieldEntry.getGetterName());
                } else {
                    buildString("if(_$$_t.%s() == null) {", beansFieldEntry.getGetterName());
                    if (beansFieldEntry.isNotNullable()) {
                        buildString("throw new %s();", MessageTypeException.class.getName());
                    } else {
                        buildString("$1.writeNil();");
                    }
                    buildString("} else {");
                    buildString("  this.templates[%d].write($1, _$$_t.%s());", Integer.valueOf(r0), beansFieldEntry.getGetterName());
                    str = "}";
                }
            } else {
                str = "$1.writeNil();";
            }
            buildString(str);
        }
        buildString("$1.writeArrayEnd();");
        buildString("}");
        return getBuiltString();
    }

    public Template loadTemplate(Class<?> cls, BeansFieldEntry[] beansFieldEntryArr, Template[] templateArr) {
        return null;
    }

    protected void setSuperClass() {
        this.tmplCtClass.b(this.director.getCtClass(JavassistTemplate.class.getName()));
    }

    public void writeTemplate(Class<?> cls, BeansFieldEntry[] beansFieldEntryArr, Template[] templateArr, String str) {
        throw new UnsupportedOperationException(cls.getName());
    }
}
