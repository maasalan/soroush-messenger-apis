package org.msgpack.template.builder.beans;

import java.lang.reflect.Method;
import org.apache.b.a.a.a.a;

public class IndexedPropertyDescriptor extends PropertyDescriptor {
    private Method indexedGetter;
    private Class<?> indexedPropertyType;
    private Method indexedSetter;

    public IndexedPropertyDescriptor(String str, Class<?> cls) {
        super(str, cls);
        setIndexedByName(cls, "get".concat(initialUpperCase(str)), "set".concat(initialUpperCase(str)));
    }

    public IndexedPropertyDescriptor(String str, Class<?> cls, String str2, String str3, String str4, String str5) {
        super(str, cls, str2, str3);
        setIndexedByName(cls, str4, str5);
    }

    public IndexedPropertyDescriptor(String str, Method method, Method method2, Method method3, Method method4) {
        super(str, method, method2);
        if (method3 != null) {
            internalSetIndexedReadMethod(method3);
            internalSetIndexedWriteMethod(method4, true);
        } else {
            internalSetIndexedWriteMethod(method4, true);
            internalSetIndexedReadMethod(method3);
        }
        if (!isCompatible()) {
            throw new IntrospectionException(a.a("custom.beans.57"));
        }
    }

    private static String initialUpperCase(String str) {
        return Character.isUpperCase(str.charAt(0)) ? str : str.substring(0, 1).toUpperCase().concat(str.substring(1));
    }

    private void internalSetIndexedReadMethod(Method method) {
        if (method == null) {
            if (this.indexedSetter == null) {
                if (getPropertyType() != null) {
                    throw new IntrospectionException(a.a("custom.beans.5A"));
                }
                this.indexedPropertyType = null;
            }
            this.indexedGetter = null;
            return;
        }
        if (method.getParameterTypes().length == 1) {
            if (method.getParameterTypes()[0] == Integer.TYPE) {
                Class returnType = method.getReturnType();
                if (returnType == Void.TYPE) {
                    throw new IntrospectionException(a.a("custom.beans.5B"));
                } else if (this.indexedSetter == null || method.getReturnType() == this.indexedSetter.getParameterTypes()[1]) {
                    if (this.indexedGetter == null) {
                        this.indexedPropertyType = returnType;
                    } else if (this.indexedPropertyType != returnType) {
                        throw new IntrospectionException(a.a("custom.beans.5A"));
                    }
                    this.indexedGetter = method;
                    return;
                } else {
                    throw new IntrospectionException(a.a("custom.beans.5A"));
                }
            }
        }
        throw new IntrospectionException(a.a("custom.beans.5B"));
    }

    private void internalSetIndexedWriteMethod(Method method, boolean z) {
        if (method == null) {
            if (this.indexedGetter == null) {
                if (getPropertyType() != null) {
                    throw new IntrospectionException(a.a("custom.beans.5E"));
                }
                this.indexedPropertyType = null;
            }
            this.indexedSetter = null;
            return;
        }
        Class[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 2) {
            throw new IntrospectionException(a.a("custom.beans.5F"));
        } else if (parameterTypes[0] != Integer.TYPE) {
            throw new IntrospectionException(a.a("custom.beans.60"));
        } else {
            Class cls = parameterTypes[1];
            if (z && this.indexedGetter == null) {
                this.indexedPropertyType = cls;
            } else if (this.indexedPropertyType != cls) {
                throw new IntrospectionException(a.a("custom.beans.61"));
            }
            this.indexedSetter = method;
        }
    }

    private boolean isCompatible() {
        Class propertyType = getPropertyType();
        if (propertyType == null) {
            return true;
        }
        propertyType = propertyType.getComponentType();
        return (propertyType == null || this.indexedPropertyType == null) ? false : propertyType.getName().equals(this.indexedPropertyType.getName());
    }

    private void setIndexedByName(Class<?> cls, String str, String str2) {
        if (str != null) {
            if (str.length() == 0) {
                StringBuilder stringBuilder = new StringBuilder("get");
                stringBuilder.append(this.name);
                str = stringBuilder.toString();
            }
            setIndexedReadMethod(cls, str);
            if (str2 != null) {
                setIndexedWriteMethod(cls, str2, this.indexedPropertyType);
            }
        } else if (str2 != null) {
            setIndexedWriteMethod(cls, str2);
        }
        if (!isCompatible()) {
            throw new IntrospectionException(a.a("custom.beans.57"));
        }
    }

    private void setIndexedReadMethod(java.lang.Class<?> r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 1;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x001c, SecurityException -> 0x0010 }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x001c, SecurityException -> 0x0010 }
        r2 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x001c, SecurityException -> 0x0010 }
        r0[r1] = r2;	 Catch:{ NoSuchMethodException -> 0x001c, SecurityException -> 0x0010 }
        r4 = r4.getMethod(r5, r0);	 Catch:{ NoSuchMethodException -> 0x001c, SecurityException -> 0x0010 }
        r3.internalSetIndexedReadMethod(r4);
        return;
    L_0x0010:
        r4 = new org.msgpack.template.builder.beans.IntrospectionException;
        r5 = "custom.beans.59";
        r5 = org.apache.b.a.a.a.a.a(r5);
        r4.<init>(r5);
        throw r4;
    L_0x001c:
        r4 = new org.msgpack.template.builder.beans.IntrospectionException;
        r5 = "custom.beans.58";
        r5 = org.apache.b.a.a.a.a.a(r5);
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.IndexedPropertyDescriptor.setIndexedReadMethod(java.lang.Class, java.lang.String):void");
    }

    private void setIndexedWriteMethod(java.lang.Class<?> r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 2;
        r0 = new java.lang.Class[r0];	 Catch:{ SecurityException -> 0x0027, NoSuchMethodException -> 0x001b }
        r1 = 0;	 Catch:{ SecurityException -> 0x0027, NoSuchMethodException -> 0x001b }
        r2 = java.lang.Integer.TYPE;	 Catch:{ SecurityException -> 0x0027, NoSuchMethodException -> 0x001b }
        r0[r1] = r2;	 Catch:{ SecurityException -> 0x0027, NoSuchMethodException -> 0x001b }
        r1 = r3.getPropertyType();	 Catch:{ SecurityException -> 0x0027, NoSuchMethodException -> 0x001b }
        r1 = r1.getComponentType();	 Catch:{ SecurityException -> 0x0027, NoSuchMethodException -> 0x001b }
        r2 = 1;	 Catch:{ SecurityException -> 0x0027, NoSuchMethodException -> 0x001b }
        r0[r2] = r1;	 Catch:{ SecurityException -> 0x0027, NoSuchMethodException -> 0x001b }
        r4 = r4.getMethod(r5, r0);	 Catch:{ SecurityException -> 0x0027, NoSuchMethodException -> 0x001b }
        r3.internalSetIndexedWriteMethod(r4, r2);
        return;
    L_0x001b:
        r4 = new org.msgpack.template.builder.beans.IntrospectionException;
        r5 = "custom.beans.5D";
        r5 = org.apache.b.a.a.a.a.a(r5);
        r4.<init>(r5);
        throw r4;
    L_0x0027:
        r4 = new org.msgpack.template.builder.beans.IntrospectionException;
        r5 = "custom.beans.5C";
        r5 = org.apache.b.a.a.a.a.a(r5);
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.IndexedPropertyDescriptor.setIndexedWriteMethod(java.lang.Class, java.lang.String):void");
    }

    private void setIndexedWriteMethod(java.lang.Class<?> r4, java.lang.String r5, java.lang.Class<?> r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 2;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x001f, SecurityException -> 0x0013 }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x001f, SecurityException -> 0x0013 }
        r2 = java.lang.Integer.TYPE;	 Catch:{ NoSuchMethodException -> 0x001f, SecurityException -> 0x0013 }
        r0[r1] = r2;	 Catch:{ NoSuchMethodException -> 0x001f, SecurityException -> 0x0013 }
        r1 = 1;	 Catch:{ NoSuchMethodException -> 0x001f, SecurityException -> 0x0013 }
        r0[r1] = r6;	 Catch:{ NoSuchMethodException -> 0x001f, SecurityException -> 0x0013 }
        r4 = r4.getMethod(r5, r0);	 Catch:{ NoSuchMethodException -> 0x001f, SecurityException -> 0x0013 }
        r3.internalSetIndexedWriteMethod(r4, r1);	 Catch:{ NoSuchMethodException -> 0x001f, SecurityException -> 0x0013 }
        return;
    L_0x0013:
        r4 = new org.msgpack.template.builder.beans.IntrospectionException;
        r5 = "custom.beans.5C";
        r5 = org.apache.b.a.a.a.a.a(r5);
        r4.<init>(r5);
        throw r4;
    L_0x001f:
        r4 = new org.msgpack.template.builder.beans.IntrospectionException;
        r5 = "custom.beans.5D";
        r5 = org.apache.b.a.a.a.a.a(r5);
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.IndexedPropertyDescriptor.setIndexedWriteMethod(java.lang.Class, java.lang.String, java.lang.Class):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        r0 = r4 instanceof org.msgpack.template.builder.beans.IndexedPropertyDescriptor;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r4 = (org.msgpack.template.builder.beans.IndexedPropertyDescriptor) r4;
        r0 = super.equals(r4);
        if (r0 == 0) goto L_0x0049;
    L_0x000e:
        r0 = r3.indexedPropertyType;
        if (r0 != 0) goto L_0x0017;
    L_0x0012:
        r0 = r4.indexedPropertyType;
        if (r0 != 0) goto L_0x0049;
    L_0x0016:
        goto L_0x0021;
    L_0x0017:
        r0 = r3.indexedPropertyType;
        r2 = r4.indexedPropertyType;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0049;
    L_0x0021:
        r0 = r3.indexedGetter;
        if (r0 != 0) goto L_0x002a;
    L_0x0025:
        r0 = r4.indexedGetter;
        if (r0 != 0) goto L_0x0049;
    L_0x0029:
        goto L_0x0034;
    L_0x002a:
        r0 = r3.indexedGetter;
        r2 = r4.indexedGetter;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0049;
    L_0x0034:
        r0 = r3.indexedSetter;
        if (r0 != 0) goto L_0x003d;
    L_0x0038:
        r4 = r4.indexedSetter;
        if (r4 != 0) goto L_0x0049;
    L_0x003c:
        goto L_0x0047;
    L_0x003d:
        r0 = r3.indexedSetter;
        r4 = r4.indexedSetter;
        r4 = r0.equals(r4);
        if (r4 == 0) goto L_0x0049;
    L_0x0047:
        r4 = 1;
        return r4;
    L_0x0049:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.IndexedPropertyDescriptor.equals(java.lang.Object):boolean");
    }

    public Class<?> getIndexedPropertyType() {
        return this.indexedPropertyType;
    }

    public Method getIndexedReadMethod() {
        return this.indexedGetter;
    }

    public Method getIndexedWriteMethod() {
        return this.indexedSetter;
    }

    public int hashCode() {
        return ((super.hashCode() + org.apache.b.a.a.a(this.indexedPropertyType)) + org.apache.b.a.a.a(this.indexedGetter)) + org.apache.b.a.a.a(this.indexedSetter);
    }

    public void setIndexedReadMethod(Method method) {
        internalSetIndexedReadMethod(method);
    }

    public void setIndexedWriteMethod(Method method) {
        internalSetIndexedWriteMethod(method, false);
    }
}
