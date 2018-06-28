package org.msgpack.template.builder;

import b.e;
import b.i;
import b.p;
import java.io.IOException;
import java.security.ProtectionDomain;
import java.util.logging.Logger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.template.Template;
import org.msgpack.unpacker.Unpacker;

public abstract class BuildContext<T extends FieldEntry> {
    private static Logger LOG = Logger.getLogger(BuildContext.class.getName());
    protected JavassistTemplateBuilder director;
    protected StringBuilder stringBuilder = null;
    protected i tmplCtClass;
    protected String tmplName;

    public BuildContext(JavassistTemplateBuilder javassistTemplateBuilder) {
        this.director = javassistTemplateBuilder;
    }

    protected Template build(String str) {
        try {
            reset(str, false);
            LOG.fine(String.format("started generating template class %s for original class %s", new Object[]{this.tmplCtClass.m(), str}));
            buildClass();
            buildConstructor();
            buildMethodInit();
            buildWriteMethod();
            buildReadMethod();
            LOG.fine(String.format("finished generating template class %s for original class %s", new Object[]{this.tmplCtClass.m(), str}));
            return buildInstance(createClass());
        } catch (Throwable e) {
            String builtString = getBuiltString();
            if (builtString != null) {
                Logger logger = LOG;
                StringBuilder stringBuilder = new StringBuilder("builder: ");
                stringBuilder.append(builtString);
                logger.severe(stringBuilder.toString());
                stringBuilder = new StringBuilder("Cannot compile: ");
                stringBuilder.append(builtString);
                throw new TemplateBuildException(stringBuilder.toString(), e);
            }
            throw new TemplateBuildException(e);
        }
    }

    protected void buildClass() {
        setSuperClass();
        this.tmplCtClass.c(this.director.getCtClass(Template.class.getName()));
    }

    protected abstract void buildConstructor();

    protected abstract Template buildInstance(Class<?> cls);

    protected void buildMethodInit() {
    }

    protected void buildReadMethod() {
        LOG.fine(String.format("started generating read method in template class %s", new Object[]{this.tmplCtClass.m()}));
        String buildReadMethodBody = buildReadMethodBody();
        i[] iVarArr = new i[]{this.director.getCtClass(Unpacker.class.getName()), this.director.getCtClass(Object.class.getName()), i.d};
        i[] iVarArr2 = new i[]{this.director.getCtClass(MessageTypeException.class.getName())};
        LOG.fine(String.format("compiling read method body: %s", new Object[]{buildReadMethodBody}));
        this.tmplCtClass.a(p.a(this.director.getCtClass(Object.class.getName()), "read", iVarArr, iVarArr2, buildReadMethodBody, this.tmplCtClass));
        LOG.fine(String.format("finished generating read method in template class %s", new Object[]{this.tmplCtClass.m()}));
    }

    protected abstract String buildReadMethodBody();

    protected void buildString(String str) {
        this.stringBuilder.append(str);
    }

    protected void buildString(String str, Object... objArr) {
        this.stringBuilder.append(String.format(str, objArr));
    }

    protected abstract Template buildTemplate(Class<?> cls, T[] tArr, Template[] templateArr);

    protected void buildWriteMethod() {
        LOG.fine(String.format("started generating write method in template class %s", new Object[]{this.tmplCtClass.m()}));
        String buildWriteMethodBody = buildWriteMethodBody();
        i[] iVarArr = new i[]{this.director.getCtClass(Packer.class.getName()), this.director.getCtClass(Object.class.getName()), i.d};
        i[] iVarArr2 = new i[]{this.director.getCtClass(IOException.class.getName())};
        LOG.fine(String.format("compiling write method body: %s", new Object[]{buildWriteMethodBody}));
        this.tmplCtClass.a(p.a(i.l, "write", iVarArr, iVarArr2, buildWriteMethodBody, this.tmplCtClass));
        LOG.fine(String.format("finished generating write method in template class %s", new Object[]{this.tmplCtClass.m()}));
    }

    protected abstract String buildWriteMethodBody();

    protected Class<?> createClass() {
        i iVar = this.tmplCtClass;
        ClassLoader classLoader = this.director.getClassLoader();
        ProtectionDomain protectionDomain = getClass().getProtectionDomain();
        if (classLoader == null) {
            classLoader = e.c();
        }
        return e.a(iVar, classLoader, protectionDomain);
    }

    protected String getBuiltString() {
        return this.stringBuilder == null ? null : this.stringBuilder.toString();
    }

    protected org.msgpack.template.Template load(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r5);
        r5 = "_$$_Template";
        r0.append(r5);
        r5 = r0.toString();
        r0 = r4.getClass();	 Catch:{ ClassNotFoundException -> 0x0056, Exception -> 0x0022 }
        r0 = r0.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0056, Exception -> 0x0022 }
        r5 = r0.loadClass(r5);	 Catch:{ ClassNotFoundException -> 0x0056, Exception -> 0x0022 }
        r5 = r4.buildInstance(r5);	 Catch:{ ClassNotFoundException -> 0x0056, Exception -> 0x0022 }
        return r5;
    L_0x0022:
        r5 = move-exception;
        r0 = r4.getBuiltString();
        if (r0 == 0) goto L_0x0050;
    L_0x0029:
        r1 = LOG;
        r2 = new java.lang.StringBuilder;
        r3 = "builder: ";
        r2.<init>(r3);
        r2.append(r0);
        r2 = r2.toString();
        r1.severe(r2);
        r1 = new org.msgpack.template.builder.TemplateBuildException;
        r2 = new java.lang.StringBuilder;
        r3 = "Cannot compile: ";
        r2.<init>(r3);
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0, r5);
        throw r1;
    L_0x0050:
        r0 = new org.msgpack.template.builder.TemplateBuildException;
        r0.<init>(r5);
        throw r0;
    L_0x0056:
        r5 = 0;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.BuildContext.load(java.lang.String):org.msgpack.template.Template");
    }

    protected abstract Template loadTemplate(Class<?> cls, T[] tArr, Template[] templateArr);

    protected String primitiveReadName(Class<?> cls) {
        return cls == Boolean.TYPE ? "readBoolean" : cls == Byte.TYPE ? "readByte" : cls == Short.TYPE ? "readShort" : cls == Integer.TYPE ? "readInt" : cls == Long.TYPE ? "readLong" : cls == Float.TYPE ? "readFloat" : cls == Double.TYPE ? "readDouble" : cls == Character.TYPE ? "readInt" : null;
    }

    protected String primitiveWriteName(Class<?> cls) {
        return "write";
    }

    protected void reset(String str, boolean z) {
        StringBuilder stringBuilder;
        if (z) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("_$$_Template");
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("_$$_Template_");
            stringBuilder.append(this.director.hashCode());
            stringBuilder.append("_");
            stringBuilder.append(this.director.nextSeqId());
        }
        this.tmplCtClass = this.director.makeCtClass(stringBuilder.toString());
    }

    protected void resetStringBuilder() {
        this.stringBuilder = new StringBuilder();
    }

    protected void saveClass(String str) {
        this.tmplCtClass.b(str);
    }

    protected abstract void setSuperClass();

    protected void write(String str, String str2) {
        try {
            reset(str, true);
            buildClass();
            buildConstructor();
            buildMethodInit();
            buildWriteMethod();
            buildReadMethod();
            saveClass(str2);
        } catch (Throwable e) {
            str2 = getBuiltString();
            if (str2 != null) {
                Logger logger = LOG;
                StringBuilder stringBuilder = new StringBuilder("builder: ");
                stringBuilder.append(str2);
                logger.severe(stringBuilder.toString());
                stringBuilder = new StringBuilder("Cannot compile: ");
                stringBuilder.append(str2);
                throw new TemplateBuildException(stringBuilder.toString(), e);
            }
            throw new TemplateBuildException(e);
        }
    }

    protected abstract void writeTemplate(Class<?> cls, T[] tArr, Template[] templateArr, String str);
}
