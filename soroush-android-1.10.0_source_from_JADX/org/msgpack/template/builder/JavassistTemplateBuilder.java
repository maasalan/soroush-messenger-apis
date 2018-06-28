package org.msgpack.template.builder;

import b.b;
import b.e;
import b.i;
import b.u;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.template.AbstractTemplate;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;

public class JavassistTemplateBuilder extends AbstractTemplateBuilder {
    private static Logger LOG = Logger.getLogger(JavassistTemplateBuilder.class.getName());
    protected ClassLoader loader;
    protected e pool;
    protected int seqId;

    public static abstract class JavassistTemplate<T> extends AbstractTemplate<T> {
        public Class<T> targetClass;
        public Template<?>[] templates;

        public JavassistTemplate(Class<T> cls, Template<?>[] templateArr) {
            this.targetClass = cls;
            this.templates = templateArr;
        }
    }

    public JavassistTemplateBuilder(TemplateRegistry templateRegistry) {
        this(templateRegistry, null);
    }

    public JavassistTemplateBuilder(TemplateRegistry templateRegistry, ClassLoader classLoader) {
        super(templateRegistry);
        int i = 0;
        this.seqId = 0;
        this.pool = new e();
        this.pool.a(new b(getClass()));
        this.loader = classLoader;
        if (this.loader == null) {
            this.loader = e.c();
        }
        try {
            if (this.loader != null) {
                this.pool.a(new u(this.loader));
                i = 1;
            }
        } catch (Throwable e) {
            if (LOG.isLoggable(Level.WARNING)) {
                LOG.log(Level.WARNING, "Cannot append a search path of classloader", e);
            }
        }
        if (i == 0) {
            this.pool.b();
        }
    }

    private Template<?>[] toTemplate(FieldEntry[] fieldEntryArr) {
        Template<?>[] templateArr = new Template[fieldEntryArr.length];
        for (int i = 0; i < fieldEntryArr.length; i++) {
            FieldEntry fieldEntry = fieldEntryArr[i];
            if (fieldEntry.isAvailable()) {
                templateArr[i] = this.registry.lookup(fieldEntry.getGenericType());
            } else {
                templateArr[i] = null;
            }
        }
        return templateArr;
    }

    private void writeTemplate(Class<?> cls, FieldEntry[] fieldEntryArr, String str) {
        createBuildContext().writeTemplate(cls, fieldEntryArr, toTemplate(fieldEntryArr), str);
    }

    public void addClassLoader(ClassLoader classLoader) {
        this.pool.a(new u(classLoader));
    }

    public <T> Template<T> buildTemplate(Class<T> cls, FieldEntry[] fieldEntryArr) {
        return createBuildContext().buildTemplate(cls, fieldEntryArr, toTemplate(fieldEntryArr));
    }

    protected BuildContext createBuildContext() {
        return new DefaultBuildContext(this);
    }

    protected ClassLoader getClassLoader() {
        return this.loader;
    }

    protected i getCtClass(String str) {
        return this.pool.a(str);
    }

    public <T> org.msgpack.template.Template<T> loadTemplate(java.lang.reflect.Type r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r4 = (java.lang.Class) r4;
        r0 = 0;
        r1 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0036 }
        r1.<init>();	 Catch:{ ClassNotFoundException -> 0x0036 }
        r2 = r4.getName();	 Catch:{ ClassNotFoundException -> 0x0036 }
        r1.append(r2);	 Catch:{ ClassNotFoundException -> 0x0036 }
        r2 = "_$$_Template";	 Catch:{ ClassNotFoundException -> 0x0036 }
        r1.append(r2);	 Catch:{ ClassNotFoundException -> 0x0036 }
        r1 = r1.toString();	 Catch:{ ClassNotFoundException -> 0x0036 }
        r2 = r4.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x0036 }
        if (r2 == 0) goto L_0x0036;	 Catch:{ ClassNotFoundException -> 0x0036 }
    L_0x001e:
        r2.loadClass(r1);	 Catch:{ ClassNotFoundException -> 0x0036 }
        r0 = r3.getFieldOption(r4);
        r0 = r3.toFieldEntries(r4, r0);
        r1 = r3.toTemplate(r0);
        r2 = r3.createBuildContext();
        r4 = r2.loadTemplate(r4, r0, r1);
        return r4;
    L_0x0036:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.JavassistTemplateBuilder.loadTemplate(java.lang.reflect.Type):org.msgpack.template.Template<T>");
    }

    protected i makeCtClass(String str) {
        return this.pool.c(str);
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

    protected int nextSeqId() {
        int i = this.seqId;
        this.seqId = i + 1;
        return i;
    }

    public void writeTemplate(Type type, String str) {
        Class cls = (Class) type;
        checkClassValidation(cls);
        writeTemplate(cls, toFieldEntries(cls, getFieldOption(cls)), str);
    }
}
