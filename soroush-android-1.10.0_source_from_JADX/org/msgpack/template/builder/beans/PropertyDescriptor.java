package org.msgpack.template.builder.beans;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.b.a.a.a.a;

public class PropertyDescriptor extends FeatureDescriptor {
    boolean bound;
    boolean constrained;
    private Method getter;
    private Class<?> propertyEditorClass;
    private Method setter;

    public PropertyDescriptor(java.lang.String r2, java.lang.Class<?> r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r1.<init>();
        if (r3 != 0) goto L_0x0011;
    L_0x0005:
        r2 = new org.msgpack.template.builder.beans.IntrospectionException;
        r3 = "custom.beans.03";
        r3 = org.apache.b.a.a.a.a.a(r3);
        r2.<init>(r3);
        throw r2;
    L_0x0011:
        if (r2 == 0) goto L_0x003a;
    L_0x0013:
        r0 = r2.length();
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x003a;
    L_0x001a:
        r1.setName(r2);
        r0 = "is";	 Catch:{ Exception -> 0x0027 }
        r0 = r1.createDefaultMethodName(r2, r0);	 Catch:{ Exception -> 0x0027 }
        r1.setReadMethod(r3, r0);	 Catch:{ Exception -> 0x0027 }
        goto L_0x0030;
    L_0x0027:
        r0 = "get";
        r0 = r1.createDefaultMethodName(r2, r0);
        r1.setReadMethod(r3, r0);
    L_0x0030:
        r0 = "set";
        r2 = r1.createDefaultMethodName(r2, r0);
        r1.setWriteMethod(r3, r2);
        return;
    L_0x003a:
        r2 = new org.msgpack.template.builder.beans.IntrospectionException;
        r3 = "custom.beans.04";
        r3 = org.apache.b.a.a.a.a.a(r3);
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.PropertyDescriptor.<init>(java.lang.String, java.lang.Class):void");
    }

    public PropertyDescriptor(java.lang.String r2, java.lang.Class<?> r3, java.lang.String r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r1.<init>();
        if (r3 != 0) goto L_0x0011;
    L_0x0005:
        r2 = new org.msgpack.template.builder.beans.IntrospectionException;
        r3 = "custom.beans.03";
        r3 = org.apache.b.a.a.a.a.a(r3);
        r2.<init>(r3);
        throw r2;
    L_0x0011:
        if (r2 == 0) goto L_0x004e;
    L_0x0013:
        r0 = r2.length();
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x004e;
    L_0x001a:
        r1.setName(r2);
        if (r4 == 0) goto L_0x003a;
    L_0x001f:
        r0 = r4.length();
        if (r0 != 0) goto L_0x002d;
    L_0x0025:
        r2 = new org.msgpack.template.builder.beans.IntrospectionException;
        r3 = "read or write method cannot be empty.";
        r2.<init>(r3);
        throw r2;
    L_0x002d:
        r1.setReadMethod(r3, r4);	 Catch:{ IntrospectionException -> 0x0031 }
        goto L_0x003a;
    L_0x0031:
        r4 = "get";
        r2 = r1.createDefaultMethodName(r2, r4);
        r1.setReadMethod(r3, r2);
    L_0x003a:
        if (r5 == 0) goto L_0x004d;
    L_0x003c:
        r2 = r5.length();
        if (r2 != 0) goto L_0x004a;
    L_0x0042:
        r2 = new org.msgpack.template.builder.beans.IntrospectionException;
        r3 = "read or write method cannot be empty.";
        r2.<init>(r3);
        throw r2;
    L_0x004a:
        r1.setWriteMethod(r3, r5);
    L_0x004d:
        return;
    L_0x004e:
        r2 = new org.msgpack.template.builder.beans.IntrospectionException;
        r3 = "custom.beans.04";
        r3 = org.apache.b.a.a.a.a.a(r3);
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.PropertyDescriptor.<init>(java.lang.String, java.lang.Class, java.lang.String, java.lang.String):void");
    }

    public PropertyDescriptor(String str, Method method, Method method2) {
        if (str != null) {
            if (str.length() != 0) {
                setName(str);
                setReadMethod(method);
                setWriteMethod(method2);
                return;
            }
        }
        throw new IntrospectionException(a.a("custom.beans.04"));
    }

    String createDefaultMethodName(String str, String str2) {
        if (str == null) {
            return null;
        }
        String a = org.apache.b.a.a.a(str.substring(0, 1));
        str = str.substring(1, str.length());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(a);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public org.msgpack.template.builder.beans.PropertyEditor createPropertyEditor(java.lang.Object r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r5.propertyEditorClass;
        if (r0 != 0) goto L_0x0006;
    L_0x0004:
        r6 = 0;
        return r6;
    L_0x0006:
        r0 = org.msgpack.template.builder.beans.PropertyEditor.class;
        r1 = r5.propertyEditorClass;
        r0 = r0.isAssignableFrom(r1);
        if (r0 != 0) goto L_0x001c;
    L_0x0010:
        r6 = new java.lang.ClassCastException;
        r0 = "custom.beans.48";
        r0 = org.apache.b.a.a.a.a.a(r0);
        r6.<init>(r0);
        throw r6;
    L_0x001c:
        r0 = 0;
        r1 = r5.propertyEditorClass;	 Catch:{ NoSuchMethodException -> 0x0037 }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x0037 }
        r3 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x0037 }
        r4 = java.lang.Object.class;	 Catch:{ NoSuchMethodException -> 0x0037 }
        r3[r0] = r4;	 Catch:{ NoSuchMethodException -> 0x0037 }
        r1 = r1.getConstructor(r3);	 Catch:{ NoSuchMethodException -> 0x0037 }
        r2 = new java.lang.Object[r2];	 Catch:{ NoSuchMethodException -> 0x0037 }
        r2[r0] = r6;	 Catch:{ NoSuchMethodException -> 0x0037 }
        r6 = r1.newInstance(r2);	 Catch:{ NoSuchMethodException -> 0x0037 }
        r6 = (org.msgpack.template.builder.beans.PropertyEditor) r6;	 Catch:{ NoSuchMethodException -> 0x0037 }
        return r6;
    L_0x0035:
        r6 = move-exception;
        goto L_0x0048;
    L_0x0037:
        r6 = r5.propertyEditorClass;	 Catch:{ Exception -> 0x0035 }
        r1 = new java.lang.Class[r0];	 Catch:{ Exception -> 0x0035 }
        r6 = r6.getConstructor(r1);	 Catch:{ Exception -> 0x0035 }
        r0 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x0035 }
        r6 = r6.newInstance(r0);	 Catch:{ Exception -> 0x0035 }
        r6 = (org.msgpack.template.builder.beans.PropertyEditor) r6;	 Catch:{ Exception -> 0x0035 }
        return r6;
    L_0x0048:
        r0 = new java.lang.RuntimeException;
        r1 = "custom.beans.47";
        r1 = org.apache.b.a.a.a.a.a(r1);
        r0.<init>(r1, r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.PropertyDescriptor.createPropertyEditor(java.lang.Object):org.msgpack.template.builder.beans.PropertyEditor");
    }

    public boolean equals(Object obj) {
        boolean z = obj instanceof PropertyDescriptor;
        if (z) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
            Object obj2 = (!(this.getter == null && propertyDescriptor.getReadMethod() == null) && (this.getter == null || !this.getter.equals(propertyDescriptor.getReadMethod()))) ? null : 1;
            Object obj3 = (!(this.setter == null && propertyDescriptor.getWriteMethod() == null) && (this.setter == null || !this.setter.equals(propertyDescriptor.getWriteMethod()))) ? null : 1;
            Object obj4 = getPropertyType() == propertyDescriptor.getPropertyType() ? 1 : null;
            Object obj5 = getPropertyEditorClass() == propertyDescriptor.getPropertyEditorClass() ? 1 : null;
            Object obj6 = isBound() == propertyDescriptor.isBound() ? 1 : null;
            obj = isConstrained() == propertyDescriptor.isConstrained() ? 1 : null;
            if (obj2 != null && obj3 != null && obj4 != null && obj5 != null && obj6 != null && obj != null) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public Class<?> getPropertyEditorClass() {
        return this.propertyEditorClass;
    }

    public Class<?> getPropertyType() {
        return this.getter != null ? this.getter.getReturnType() : this.setter != null ? this.setter.getParameterTypes()[0] : null;
    }

    public Method getReadMethod() {
        return this.getter;
    }

    public Method getWriteMethod() {
        return this.setter;
    }

    public int hashCode() {
        return ((((org.apache.b.a.a.a(this.getter) + org.apache.b.a.a.a(this.setter)) + org.apache.b.a.a.a(getPropertyType())) + org.apache.b.a.a.a(getPropertyEditorClass())) + org.apache.b.a.a.a(isBound())) + org.apache.b.a.a.a(isConstrained());
    }

    public boolean isBound() {
        return this.bound;
    }

    public boolean isConstrained() {
        return this.constrained;
    }

    public void setBound(boolean z) {
        this.bound = z;
    }

    public void setConstrained(boolean z) {
        this.constrained = z;
    }

    public void setPropertyEditorClass(Class<?> cls) {
        this.propertyEditorClass = cls;
    }

    void setReadMethod(Class<?> cls, String str) {
        try {
            setReadMethod(cls.getMethod(str, new Class[0]));
        } catch (Exception e) {
            throw new IntrospectionException(e.getLocalizedMessage());
        }
    }

    public void setReadMethod(Method method) {
        if (method != null) {
            if (!Modifier.isPublic(method.getModifiers())) {
                throw new IntrospectionException(a.a("custom.beans.0A"));
            } else if (method.getParameterTypes().length != 0) {
                throw new IntrospectionException(a.a("custom.beans.08"));
            } else {
                Class returnType = method.getReturnType();
                if (returnType.equals(Void.TYPE)) {
                    throw new IntrospectionException(a.a("custom.beans.33"));
                }
                Class propertyType = getPropertyType();
                if (!(propertyType == null || returnType.equals(propertyType))) {
                    throw new IntrospectionException(a.a("custom.beans.09"));
                }
            }
        }
        this.getter = method;
    }

    void setWriteMethod(Class<?> cls, String str) {
        try {
            Method method;
            if (this.getter != null) {
                method = cls.getMethod(str, new Class[]{this.getter.getReturnType()});
            } else {
                Method method2 = null;
                Class superclass;
                while (superclass != null && method2 == null) {
                    for (Method method3 : superclass.getDeclaredMethods()) {
                        if (str.equals(method3.getName()) && method3.getParameterTypes().length == 1) {
                            method2 = method3;
                            break;
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
                method = method2;
            }
            if (method == null) {
                throw new IntrospectionException(a.a("custom.beans.64", str));
            }
            setWriteMethod(method);
        } catch (Exception e) {
            throw new IntrospectionException(e.getLocalizedMessage());
        }
    }

    public void setWriteMethod(Method method) {
        if (method != null) {
            if (Modifier.isPublic(method.getModifiers())) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new IntrospectionException(a.a("custom.beans.06"));
                }
                Object obj = parameterTypes[0];
                Class propertyType = getPropertyType();
                if (!(propertyType == null || propertyType.equals(obj))) {
                    throw new IntrospectionException(a.a("custom.beans.07"));
                }
            }
            throw new IntrospectionException(a.a("custom.beans.05"));
        }
        this.setter = method;
    }
}
