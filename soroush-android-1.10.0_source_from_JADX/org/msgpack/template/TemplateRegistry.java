package org.msgpack.template;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.msgpack.MessagePackable;
import org.msgpack.MessageTypeException;
import org.msgpack.template.builder.TemplateBuilder;
import org.msgpack.template.builder.TemplateBuilderChain;
import org.msgpack.type.Value;

public class TemplateRegistry {
    Map<Type, Template<Type>> cache;
    private TemplateBuilderChain chain;
    private Map<Type, GenericTemplate> genericCache;
    private TemplateRegistry parent;

    private TemplateRegistry() {
        this.parent = null;
        this.parent = null;
        this.chain = createTemplateBuilderChain();
        this.genericCache = new HashMap();
        this.cache = new HashMap();
        registerTemplates();
        this.cache = Collections.unmodifiableMap(this.cache);
    }

    public TemplateRegistry(TemplateRegistry templateRegistry) {
        this.parent = null;
        if (templateRegistry == null) {
            templateRegistry = new TemplateRegistry();
        }
        this.parent = templateRegistry;
        this.chain = createTemplateBuilderChain();
        this.cache = new HashMap();
        this.genericCache = new HashMap();
        registerTemplatesWhichRefersRegistry();
    }

    private synchronized Template buildAndRegister(TemplateBuilder templateBuilder, Class cls, boolean z, FieldList fieldList) {
        Object obj;
        TemplateReference templateReference;
        Throwable e;
        Template buildTemplate;
        Object obj2 = null;
        try {
            obj = this.cache.containsKey(cls) ? (Template) this.cache.get(cls) : null;
            try {
                templateReference = new TemplateReference(this, cls);
            } catch (Exception e2) {
                e = e2;
                templateReference = null;
                if (obj != null) {
                    this.cache.remove(cls);
                } else {
                    try {
                        this.cache.put(cls, obj);
                    } catch (Throwable th) {
                        e = th;
                        obj2 = templateReference;
                        if (obj2 != null) {
                            this.cache.put(cls, obj2);
                        }
                        throw e;
                    }
                }
                try {
                    if (e instanceof MessageTypeException) {
                        throw new MessageTypeException(e);
                    }
                    throw ((MessageTypeException) e);
                } catch (Throwable th2) {
                    e = th2;
                    if (obj2 != null) {
                        this.cache.put(cls, obj2);
                    }
                    throw e;
                }
            }
            try {
                this.cache.put(cls, templateReference);
                if (templateBuilder == null) {
                    templateBuilder = this.chain.select(cls, z);
                }
                buildTemplate = fieldList != null ? templateBuilder.buildTemplate(cls, fieldList) : templateBuilder.buildTemplate(cls);
                if (buildTemplate != null) {
                    this.cache.put(cls, buildTemplate);
                }
            } catch (Exception e3) {
                e = e3;
                if (obj != null) {
                    this.cache.put(cls, obj);
                } else {
                    this.cache.remove(cls);
                }
                if (e instanceof MessageTypeException) {
                    throw ((MessageTypeException) e);
                }
                throw new MessageTypeException(e);
            }
        } catch (Exception e4) {
            e = e4;
            obj = null;
            templateReference = obj;
            if (obj != null) {
                this.cache.put(cls, obj);
            } else {
                this.cache.remove(cls);
            }
            if (e instanceof MessageTypeException) {
                throw ((MessageTypeException) e);
            }
            throw new MessageTypeException(e);
        }
        return buildTemplate;
    }

    private static boolean isPrimitiveType(String str) {
        if (!(str.equals("byte") || str.equals("short") || str.equals("int") || str.equals("long") || str.equals("float") || str.equals("double") || str.equals("boolean"))) {
            if (!str.equals("char")) {
                return false;
            }
        }
        return true;
    }

    private <T> Template<T> lookupAfterBuilding(Class<T> cls) {
        TemplateBuilder select = this.chain.select(cls, true);
        Template<T> template = null;
        if (select != null) {
            Template loadTemplate = this.chain.getForceBuilder().loadTemplate(cls);
            if (loadTemplate != null) {
                register((Type) cls, loadTemplate);
                return loadTemplate;
            }
            template = buildAndRegister(select, cls, true, null);
        }
        return template;
    }

    private org.msgpack.template.Template<java.lang.reflect.Type> lookupCache(java.lang.reflect.Type r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.cache;
        r0 = r0.get(r3);
        r0 = (org.msgpack.template.Template) r0;
        if (r0 == 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        r1 = r2.parent;	 Catch:{ NullPointerException -> 0x0012 }
        r3 = r1.lookupCache(r3);	 Catch:{ NullPointerException -> 0x0012 }
        return r3;
    L_0x0012:
        r3 = r0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.lookupCache(java.lang.reflect.Type):org.msgpack.template.Template<java.lang.reflect.Type>");
    }

    private org.msgpack.template.Template<java.lang.reflect.Type> lookupGenericArrayType(java.lang.reflect.Type r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r3 instanceof java.lang.reflect.GenericArrayType;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r3 = (java.lang.reflect.GenericArrayType) r3;
        r0 = r2.lookupGenericArrayTypeImpl(r3);
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        return r0;
    L_0x000f:
        r0 = r2.parent;	 Catch:{ NullPointerException -> 0x0018 }
        r3 = r0.lookupGenericArrayTypeImpl(r3);	 Catch:{ NullPointerException -> 0x0018 }
        if (r3 == 0) goto L_0x0018;
    L_0x0017:
        return r3;
    L_0x0018:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.lookupGenericArrayType(java.lang.reflect.Type):org.msgpack.template.Template<java.lang.reflect.Type>");
    }

    private org.msgpack.template.Template lookupGenericArrayTypeImpl(java.lang.reflect.GenericArrayType r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = java.lang.String.valueOf(r8);
        r1 = "\\[";
        r1 = r0.split(r1);
        r2 = 0;
        r3 = 1;
        r1 = r1.length;
        r1 = r1 - r3;
        if (r1 > 0) goto L_0x0020;
    L_0x0010:
        r8 = new org.msgpack.MessageTypeException;
        r1 = "fatal error: type=";
        r3 = new java.lang.Object[r3];
        r3[r2] = r0;
        r0 = java.lang.String.format(r1, r3);
        r8.<init>(r0);
        throw r8;
    L_0x0020:
        if (r1 <= r3) goto L_0x0032;
    L_0x0022:
        r8 = new java.lang.UnsupportedOperationException;
        r1 = "Not implemented template generation of %s";
        r3 = new java.lang.Object[r3];
        r3[r2] = r0;
        r0 = java.lang.String.format(r1, r3);
        r8.<init>(r0);
        throw r8;
    L_0x0032:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r8 = r8.getGenericComponentType();
        r0.append(r8);
        r8 = r0.toString();
        r0 = isPrimitiveType(r8);
        r4 = new java.lang.StringBuffer;
        r4.<init>();
        r5 = r2;
    L_0x004c:
        if (r5 >= r1) goto L_0x0056;
    L_0x004e:
        r6 = 91;
        r4.append(r6);
        r5 = r5 + 1;
        goto L_0x004c;
    L_0x0056:
        if (r0 != 0) goto L_0x006a;
    L_0x0058:
        r0 = 76;
        r4.append(r0);
        r8 = toJvmReferenceTypeName(r8);
        r4.append(r8);
        r8 = 59;
        r4.append(r8);
        goto L_0x0071;
    L_0x006a:
        r8 = toJvmPrimitiveTypeName(r8);
        r4.append(r8);
    L_0x0071:
        r8 = r4.toString();
        r0 = java.lang.Thread.currentThread();	 Catch:{ ClassNotFoundException -> 0x008a }
        r0 = r0.getContextClassLoader();	 Catch:{ ClassNotFoundException -> 0x008a }
        if (r0 == 0) goto L_0x008a;	 Catch:{ ClassNotFoundException -> 0x008a }
    L_0x007f:
        r0 = r0.loadClass(r8);	 Catch:{ ClassNotFoundException -> 0x008a }
        if (r0 == 0) goto L_0x008a;	 Catch:{ ClassNotFoundException -> 0x008a }
    L_0x0085:
        r0 = r7.lookupAfterBuilding(r0);	 Catch:{ ClassNotFoundException -> 0x008a }
        return r0;
    L_0x008a:
        r0 = r7.getClass();	 Catch:{ ClassNotFoundException -> 0x009f }
        r0 = r0.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x009f }
        if (r0 == 0) goto L_0x009f;	 Catch:{ ClassNotFoundException -> 0x009f }
    L_0x0094:
        r0 = r0.loadClass(r8);	 Catch:{ ClassNotFoundException -> 0x009f }
        if (r0 == 0) goto L_0x009f;	 Catch:{ ClassNotFoundException -> 0x009f }
    L_0x009a:
        r0 = r7.lookupAfterBuilding(r0);	 Catch:{ ClassNotFoundException -> 0x009f }
        return r0;
    L_0x009f:
        r0 = java.lang.Class.forName(r8);	 Catch:{ ClassNotFoundException -> 0x00aa }
        if (r0 == 0) goto L_0x00aa;	 Catch:{ ClassNotFoundException -> 0x00aa }
    L_0x00a5:
        r0 = r7.lookupAfterBuilding(r0);	 Catch:{ ClassNotFoundException -> 0x00aa }
        return r0;
    L_0x00aa:
        r0 = new org.msgpack.MessageTypeException;
        r1 = "cannot find template of %s";
        r3 = new java.lang.Object[r3];
        r3[r2] = r8;
        r8 = java.lang.String.format(r1, r3);
        r0.<init>(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.lookupGenericArrayTypeImpl(java.lang.reflect.GenericArrayType):org.msgpack.template.Template");
    }

    private <T> org.msgpack.template.Template<T> lookupGenericInterfaceTypes(java.lang.reflect.ParameterizedType r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r6.getRawType();
        r1 = 0;
        r0 = (java.lang.Class) r0;	 Catch:{ ClassCastException -> 0x001c }
        r0 = r0.getInterfaces();	 Catch:{ ClassCastException -> 0x001c }
        r2 = r0.length;	 Catch:{ ClassCastException -> 0x001c }
        r3 = 0;	 Catch:{ ClassCastException -> 0x001c }
    L_0x000d:
        if (r3 >= r2) goto L_0x001c;	 Catch:{ ClassCastException -> 0x001c }
    L_0x000f:
        r4 = r0[r3];	 Catch:{ ClassCastException -> 0x001c }
        r4 = r5.lookupGenericTypeImpl0(r6, r4);	 Catch:{ ClassCastException -> 0x001c }
        if (r4 == 0) goto L_0x0018;
    L_0x0017:
        return r4;
    L_0x0018:
        r3 = r3 + 1;
        r1 = r4;
        goto L_0x000d;
    L_0x001c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.lookupGenericInterfaceTypes(java.lang.reflect.ParameterizedType):org.msgpack.template.Template<T>");
    }

    private <T> org.msgpack.template.Template<T> lookupGenericSuperclasses(java.lang.reflect.ParameterizedType r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r4.getRawType();
        r1 = 0;
        r0 = (java.lang.Class) r0;	 Catch:{ ClassCastException -> 0x0023 }
        r0 = r0.getSuperclass();	 Catch:{ ClassCastException -> 0x0023 }
        if (r0 != 0) goto L_0x000e;	 Catch:{ ClassCastException -> 0x0023 }
    L_0x000d:
        return r1;	 Catch:{ ClassCastException -> 0x0023 }
    L_0x000e:
        r2 = java.lang.Object.class;	 Catch:{ ClassCastException -> 0x0023 }
        if (r0 == r2) goto L_0x0023;	 Catch:{ ClassCastException -> 0x0023 }
    L_0x0012:
        r2 = r3.lookupGenericTypeImpl0(r4, r0);	 Catch:{ ClassCastException -> 0x0023 }
        if (r2 == 0) goto L_0x001c;
    L_0x0018:
        r3.register(r4, r2);	 Catch:{ ClassCastException -> 0x0022 }
        return r2;	 Catch:{ ClassCastException -> 0x0022 }
    L_0x001c:
        r0 = r0.getSuperclass();	 Catch:{ ClassCastException -> 0x0022 }
        r1 = r2;
        goto L_0x000e;
    L_0x0022:
        r1 = r2;
    L_0x0023:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.lookupGenericSuperclasses(java.lang.reflect.ParameterizedType):org.msgpack.template.Template<T>");
    }

    private org.msgpack.template.Template<java.lang.reflect.Type> lookupGenericType(java.lang.reflect.ParameterizedType r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.lookupGenericTypeImpl(r2);
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return r0;
    L_0x0007:
        r0 = r1.parent;	 Catch:{ NullPointerException -> 0x0010 }
        r0 = r0.lookupGenericTypeImpl(r2);	 Catch:{ NullPointerException -> 0x0010 }
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = r1.lookupGenericInterfaceTypes(r2);
        if (r0 == 0) goto L_0x0017;
    L_0x0016:
        return r0;
    L_0x0017:
        r2 = r1.lookupGenericSuperclasses(r2);
        if (r2 == 0) goto L_0x001e;
    L_0x001d:
        return r2;
    L_0x001e:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.lookupGenericType(java.lang.reflect.ParameterizedType):org.msgpack.template.Template<java.lang.reflect.Type>");
    }

    private Template lookupGenericTypeImpl(ParameterizedType parameterizedType) {
        return lookupGenericTypeImpl0(parameterizedType, parameterizedType.getRawType());
    }

    private Template lookupGenericTypeImpl0(ParameterizedType parameterizedType, Type type) {
        GenericTemplate genericTemplate = (GenericTemplate) this.genericCache.get(type);
        if (genericTemplate == null) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Template[] templateArr = new Template[actualTypeArguments.length];
        for (int i = 0; i < actualTypeArguments.length; i++) {
            templateArr[i] = lookup(actualTypeArguments[i]);
        }
        return genericTemplate.build(templateArr);
    }

    private <T> org.msgpack.template.Template<T> lookupInterfaceTypes(java.lang.Class<T> r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r7.getInterfaces();
        r1 = 0;
        r2 = 0;
        r3 = r0.length;
    L_0x0007:
        if (r2 >= r3) goto L_0x0029;
    L_0x0009:
        r1 = r0[r2];
        r4 = r6.cache;
        r4 = r4.get(r1);
        r4 = (org.msgpack.template.Template) r4;
        if (r4 == 0) goto L_0x0019;
    L_0x0015:
        r6.register(r7, r4);
        return r4;
    L_0x0019:
        r5 = r6.parent;	 Catch:{ NullPointerException -> 0x0025 }
        r1 = r5.lookupCache(r1);	 Catch:{ NullPointerException -> 0x0025 }
        if (r1 == 0) goto L_0x0026;
    L_0x0021:
        r6.register(r7, r1);	 Catch:{ NullPointerException -> 0x0026 }
        return r1;
    L_0x0025:
        r1 = r4;
    L_0x0026:
        r2 = r2 + 1;
        goto L_0x0007;
    L_0x0029:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.lookupInterfaceTypes(java.lang.Class):org.msgpack.template.Template<T>");
    }

    private <T> org.msgpack.template.Template<T> lookupSuperclassInterfaceTypes(java.lang.Class<T> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r4.getSuperclass();
        r1 = 0;
        if (r0 == 0) goto L_0x0027;
    L_0x0007:
        r2 = java.lang.Object.class;
        if (r0 == r2) goto L_0x0027;
    L_0x000b:
        r1 = r3.lookupInterfaceTypes(r0);
        if (r1 == 0) goto L_0x0015;
    L_0x0011:
        r3.register(r4, r1);
        return r1;
    L_0x0015:
        r2 = r3.parent;	 Catch:{ NullPointerException -> 0x0022 }
        r2 = r2.lookupCache(r0);	 Catch:{ NullPointerException -> 0x0022 }
        if (r2 == 0) goto L_0x0021;
    L_0x001d:
        r3.register(r4, r2);	 Catch:{ NullPointerException -> 0x0021 }
        return r2;
    L_0x0021:
        r1 = r2;
    L_0x0022:
        r0 = r0.getSuperclass();
        goto L_0x0007;
    L_0x0027:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.lookupSuperclassInterfaceTypes(java.lang.Class):org.msgpack.template.Template<T>");
    }

    private <T> org.msgpack.template.Template<T> lookupSuperclasses(java.lang.Class<T> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r4.getSuperclass();
        r1 = 0;
        if (r0 == 0) goto L_0x002b;
    L_0x0007:
        r2 = java.lang.Object.class;
        if (r0 == r2) goto L_0x002b;
    L_0x000b:
        r1 = r3.cache;
        r1 = r1.get(r0);
        r1 = (org.msgpack.template.Template) r1;
        if (r1 == 0) goto L_0x0019;
    L_0x0015:
        r3.register(r4, r1);
        return r1;
    L_0x0019:
        r2 = r3.parent;	 Catch:{ NullPointerException -> 0x0026 }
        r2 = r2.lookupCache(r0);	 Catch:{ NullPointerException -> 0x0026 }
        if (r2 == 0) goto L_0x0025;
    L_0x0021:
        r3.register(r4, r2);	 Catch:{ NullPointerException -> 0x0025 }
        return r2;
    L_0x0025:
        r1 = r2;
    L_0x0026:
        r0 = r0.getSuperclass();
        goto L_0x0007;
    L_0x002b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.lookupSuperclasses(java.lang.Class):org.msgpack.template.Template<T>");
    }

    private void registerTemplates() {
        register(Boolean.TYPE, BooleanTemplate.getInstance());
        register((Type) Boolean.class, BooleanTemplate.getInstance());
        register(Byte.TYPE, ByteTemplate.getInstance());
        register((Type) Byte.class, ByteTemplate.getInstance());
        register(Short.TYPE, ShortTemplate.getInstance());
        register((Type) Short.class, ShortTemplate.getInstance());
        register(Integer.TYPE, IntegerTemplate.getInstance());
        register((Type) Integer.class, IntegerTemplate.getInstance());
        register(Long.TYPE, LongTemplate.getInstance());
        register((Type) Long.class, LongTemplate.getInstance());
        register(Float.TYPE, FloatTemplate.getInstance());
        register((Type) Float.class, FloatTemplate.getInstance());
        register(Double.TYPE, DoubleTemplate.getInstance());
        register((Type) Double.class, DoubleTemplate.getInstance());
        register((Type) BigInteger.class, BigIntegerTemplate.getInstance());
        register(Character.TYPE, CharacterTemplate.getInstance());
        register((Type) Character.class, CharacterTemplate.getInstance());
        register((Type) boolean[].class, BooleanArrayTemplate.getInstance());
        register((Type) short[].class, ShortArrayTemplate.getInstance());
        register((Type) int[].class, IntegerArrayTemplate.getInstance());
        register((Type) long[].class, LongArrayTemplate.getInstance());
        register((Type) float[].class, FloatArrayTemplate.getInstance());
        register((Type) double[].class, DoubleArrayTemplate.getInstance());
        register((Type) String.class, StringTemplate.getInstance());
        register((Type) byte[].class, ByteArrayTemplate.getInstance());
        register((Type) ByteBuffer.class, ByteBufferTemplate.getInstance());
        register((Type) Value.class, ValueTemplate.getInstance());
        register((Type) BigDecimal.class, BigDecimalTemplate.getInstance());
        register((Type) Date.class, DateTemplate.getInstance());
        registerTemplatesWhichRefersRegistry();
    }

    private static String toJvmPrimitiveTypeName(String str) {
        if (str.equals("byte")) {
            return "B";
        }
        if (str.equals("short")) {
            return "S";
        }
        if (str.equals("int")) {
            return "I";
        }
        if (str.equals("long")) {
            return "J";
        }
        if (str.equals("float")) {
            return "F";
        }
        if (str.equals("double")) {
            return "D";
        }
        if (str.equals("boolean")) {
            return "Z";
        }
        if (str.equals("char")) {
            return "C";
        }
        throw new MessageTypeException(String.format("fatal error: type=%s", new Object[]{str}));
    }

    private static String toJvmReferenceTypeName(String str) {
        return str.substring(6);
    }

    protected TemplateBuilderChain createTemplateBuilderChain() {
        return new TemplateBuilderChain(this);
    }

    public synchronized Template lookup(Type type) {
        Template lookupGenericType;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            lookupGenericType = lookupGenericType(parameterizedType);
            if (lookupGenericType != null) {
                return lookupGenericType;
            }
            type = parameterizedType.getRawType();
        }
        lookupGenericType = lookupGenericArrayType(type);
        if (lookupGenericType != null) {
            return lookupGenericType;
        }
        lookupGenericType = lookupCache(type);
        if (lookupGenericType != null) {
            return lookupGenericType;
        }
        if (!(type instanceof WildcardType)) {
            if (!(type instanceof TypeVariable)) {
                Type type2 = (Class) type;
                Template messagePackableTemplate;
                if (MessagePackable.class.isAssignableFrom(type2)) {
                    messagePackableTemplate = new MessagePackableTemplate(type2);
                    register(type2, messagePackableTemplate);
                    return messagePackableTemplate;
                } else if (type2.isInterface()) {
                    lookupGenericType = new AnyTemplate(this);
                    register(type, lookupGenericType);
                    return lookupGenericType;
                } else {
                    messagePackableTemplate = lookupAfterBuilding(type2);
                    if (messagePackableTemplate != null) {
                        return messagePackableTemplate;
                    }
                    messagePackableTemplate = lookupInterfaceTypes(type2);
                    if (messagePackableTemplate != null) {
                        return messagePackableTemplate;
                    }
                    messagePackableTemplate = lookupSuperclasses(type2);
                    if (messagePackableTemplate != null) {
                        return messagePackableTemplate;
                    }
                    messagePackableTemplate = lookupSuperclassInterfaceTypes(type2);
                    if (messagePackableTemplate != null) {
                        return messagePackableTemplate;
                    }
                    StringBuilder stringBuilder = new StringBuilder("Cannot find template for ");
                    stringBuilder.append(type2);
                    stringBuilder.append(" class.  Try to add @Message annotation to the class or call MessagePack.register(Type).");
                    throw new MessageTypeException(stringBuilder.toString());
                }
            }
        }
        lookupGenericType = new AnyTemplate(this);
        register(type, lookupGenericType);
        return lookupGenericType;
    }

    public void register(Class<?> cls) {
        buildAndRegister(null, cls, false, null);
    }

    public void register(Class<?> cls, FieldList fieldList) {
        if (fieldList == null) {
            throw new NullPointerException("FieldList object is null");
        }
        buildAndRegister(null, cls, false, fieldList);
    }

    public synchronized void register(Type type, Template template) {
        if (template == null) {
            throw new NullPointerException("Template object is null");
        } else if (type instanceof ParameterizedType) {
            this.cache.put(((ParameterizedType) type).getRawType(), template);
        } else {
            this.cache.put(type, template);
        }
    }

    public synchronized void registerGeneric(Type type, GenericTemplate genericTemplate) {
        if (type instanceof ParameterizedType) {
            this.genericCache.put(((ParameterizedType) type).getRawType(), genericTemplate);
        } else {
            this.genericCache.put(type, genericTemplate);
        }
    }

    protected void registerTemplatesWhichRefersRegistry() {
        Template anyTemplate = new AnyTemplate(this);
        register((Type) List.class, new ListTemplate(anyTemplate));
        register((Type) Set.class, new SetTemplate(anyTemplate));
        register((Type) Collection.class, new CollectionTemplate(anyTemplate));
        register((Type) Map.class, new MapTemplate(anyTemplate, anyTemplate));
        registerGeneric(List.class, new GenericCollectionTemplate(this, ListTemplate.class));
        registerGeneric(Set.class, new GenericCollectionTemplate(this, SetTemplate.class));
        registerGeneric(Collection.class, new GenericCollectionTemplate(this, CollectionTemplate.class));
        registerGeneric(Map.class, new GenericMapTemplate(this, MapTemplate.class));
    }

    public void setClassLoader(ClassLoader classLoader) {
        this.chain = new TemplateBuilderChain(this, classLoader);
    }

    public synchronized void unregister() {
        this.cache.clear();
    }

    public synchronized boolean unregister(Type type) {
        return ((Template) this.cache.remove(type)) != null;
    }
}
