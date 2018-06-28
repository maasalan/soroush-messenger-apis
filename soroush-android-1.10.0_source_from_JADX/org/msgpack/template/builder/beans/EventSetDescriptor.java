package org.msgpack.template.builder.beans;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TooManyListenersException;
import org.apache.b.a.a.a.a;

public class EventSetDescriptor extends FeatureDescriptor {
    private Method addListenerMethod;
    private Method getListenerMethod;
    private boolean inDefaultEventSet;
    private ArrayList<MethodDescriptor> listenerMethodDescriptors;
    private Method[] listenerMethods;
    private Class<?> listenerType;
    private Method removeListenerMethod;
    private boolean unicast;

    public EventSetDescriptor(Class<?> cls, String str, Class<?> cls2, String str2) {
        this.inDefaultEventSet = true;
        checkNotNull(cls, str, cls2, str2);
        setName(str);
        this.listenerType = cls2;
        Method findListenerMethodByName = findListenerMethodByName(str2);
        checkEventType(str, findListenerMethodByName);
        this.listenerMethodDescriptors = new ArrayList();
        this.listenerMethodDescriptors.add(new MethodDescriptor(findListenerMethodByName));
        this.addListenerMethod = findMethodByPrefix(cls, "add", "");
        this.removeListenerMethod = findMethodByPrefix(cls, "remove", "");
        if (this.addListenerMethod != null) {
            if (this.removeListenerMethod != null) {
                this.getListenerMethod = findMethodByPrefix(cls, "get", "s");
                this.unicast = isUnicastByDefault(this.addListenerMethod);
                return;
            }
        }
        throw new IntrospectionException(a.a("custom.beans.38"));
    }

    public EventSetDescriptor(Class<?> cls, String str, Class<?> cls2, String[] strArr, String str2, String str3) {
        this(cls, str, cls2, strArr, str2, str3, null);
    }

    public EventSetDescriptor(Class<?> cls, String str, Class<?> cls2, String[] strArr, String str2, String str3, String str4) {
        this.inDefaultEventSet = true;
        checkNotNull(cls, str, cls2, strArr);
        setName(str);
        this.listenerType = cls2;
        this.listenerMethodDescriptors = new ArrayList();
        for (String findListenerMethodByName : strArr) {
            this.listenerMethodDescriptors.add(new MethodDescriptor(findListenerMethodByName(findListenerMethodByName)));
        }
        if (str2 != null) {
            this.addListenerMethod = findAddRemoveListenerMethod(cls, str2);
        }
        if (str3 != null) {
            this.removeListenerMethod = findAddRemoveListenerMethod(cls, str3);
        }
        if (str4 != null) {
            this.getListenerMethod = findGetListenerMethod(cls, str4);
        }
        this.unicast = isUnicastByDefault(this.addListenerMethod);
    }

    public EventSetDescriptor(String str, Class<?> cls, Method[] methodArr, Method method, Method method2) {
        this(str, (Class) cls, methodArr, method, method2, null);
    }

    public EventSetDescriptor(String str, Class<?> cls, Method[] methodArr, Method method, Method method2, Method method3) {
        this.inDefaultEventSet = true;
        setName(str);
        this.listenerType = cls;
        this.listenerMethods = methodArr;
        if (methodArr != null) {
            this.listenerMethodDescriptors = new ArrayList();
            for (Method methodDescriptor : methodArr) {
                this.listenerMethodDescriptors.add(new MethodDescriptor(methodDescriptor));
            }
        }
        this.addListenerMethod = method;
        this.removeListenerMethod = method2;
        this.getListenerMethod = method3;
        this.unicast = isUnicastByDefault(method);
    }

    public EventSetDescriptor(String str, Class<?> cls, MethodDescriptor[] methodDescriptorArr, Method method, Method method2) {
        this(str, (Class) cls, null, method, method2, null);
        if (methodDescriptorArr != null) {
            this.listenerMethodDescriptors = new ArrayList();
            for (Object add : methodDescriptorArr) {
                this.listenerMethodDescriptors.add(add);
            }
        }
    }

    private static void checkEventType(String str, Method method) {
        Class[] parameterTypes = method.getParameterTypes();
        str = prepareEventTypeName(str);
        String extractShortClassName = parameterTypes.length > 0 ? extractShortClassName(parameterTypes[0].getName()) : null;
        if (extractShortClassName != null) {
            if (extractShortClassName.equals(str)) {
                return;
            }
        }
        throw new IntrospectionException(a.a("custom.beans.51", method.getName(), str));
    }

    private void checkNotNull(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj == null) {
            throw new NullPointerException(a.a("custom.beans.0C"));
        } else if (obj2 == null) {
            throw new NullPointerException(a.a("custom.beans.53"));
        } else if (obj3 == null) {
            throw new NullPointerException(a.a("custom.beans.54"));
        } else if (obj4 == null) {
            throw new NullPointerException(a.a("custom.beans.52"));
        }
    }

    private static String extractShortClassName(String str) {
        int lastIndexOf = str.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = str.lastIndexOf(46);
        }
        return str.substring(lastIndexOf + 1);
    }

    private java.lang.reflect.Method findAddRemoveListenerMethod(java.lang.Class<?> r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 1;
        r0 = new java.lang.Class[r0];	 Catch:{ NoSuchMethodException -> 0x001f, Exception -> 0x000d }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x001f, Exception -> 0x000d }
        r2 = r3.listenerType;	 Catch:{ NoSuchMethodException -> 0x001f, Exception -> 0x000d }
        r0[r1] = r2;	 Catch:{ NoSuchMethodException -> 0x001f, Exception -> 0x000d }
        r0 = r4.getMethod(r5, r0);	 Catch:{ NoSuchMethodException -> 0x001f, Exception -> 0x000d }
        return r0;
    L_0x000d:
        r4 = new org.msgpack.template.builder.beans.IntrospectionException;
        r0 = "custom.beans.31";
        r1 = r3.listenerType;
        r1 = r1.getName();
        r5 = org.apache.b.a.a.a.a.a(r0, r5, r1);
        r4.<init>(r5);
        throw r4;
    L_0x001f:
        r4 = r3.findAddRemoveListnerMethodWithLessCheck(r4, r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.EventSetDescriptor.findAddRemoveListenerMethod(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    private Method findAddRemoveListnerMethodWithLessCheck(Class<?> cls, String str) {
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str) && method.getParameterTypes().length == 1) {
                break;
            }
        }
        Method method2 = null;
        if (method2 != null) {
            return method2;
        }
        throw new IntrospectionException(a.a("custom.beans.31", str, this.listenerType.getName()));
    }

    private java.lang.reflect.Method findGetListenerMethod(java.lang.Class<?> r2, java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = 0;
        r0 = new java.lang.Class[r0];	 Catch:{ Exception -> 0x0008 }
        r2 = r2.getMethod(r3, r0);	 Catch:{ Exception -> 0x0008 }
        return r2;
    L_0x0008:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.EventSetDescriptor.findGetListenerMethod(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    private Method findListenerMethodByName(String str) {
        for (Method method : this.listenerType.getMethods()) {
            if (str.equals(method.getName())) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].getName().endsWith("Event")) {
                    break;
                }
            }
        }
        Method method2 = null;
        if (method2 != null) {
            return method2;
        }
        throw new IntrospectionException(a.a("custom.beans.31", str, this.listenerType.getName()));
    }

    private java.lang.reflect.Method findMethodByPrefix(java.lang.Class<?> r4, java.lang.String r5, java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.listenerType;
        r0 = r0.getName();
        r1 = r3.listenerType;
        r1 = r1.getPackage();
        r2 = 1;
        if (r1 == 0) goto L_0x0022;
    L_0x000f:
        r1 = r3.listenerType;
        r1 = r1.getPackage();
        r1 = r1.getName();
        r1 = r1.length();
        r1 = r1 + r2;
        r0 = r0.substring(r1);
    L_0x0022:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r5);
        r1.append(r0);
        r1.append(r6);
        r6 = r1.toString();
        r0 = 0;
        r1 = "get";	 Catch:{ NoSuchMethodException -> 0x0067 }
        r5 = r1.equals(r5);	 Catch:{ NoSuchMethodException -> 0x0067 }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x0067 }
        if (r5 == 0) goto L_0x0045;	 Catch:{ NoSuchMethodException -> 0x0067 }
    L_0x003e:
        r5 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0067 }
        r4 = r4.getMethod(r6, r5);	 Catch:{ NoSuchMethodException -> 0x0067 }
        return r4;
    L_0x0045:
        r4 = r4.getMethods();
    L_0x0049:
        r5 = r4.length;
        if (r1 >= r5) goto L_0x0067;
    L_0x004c:
        r5 = r4[r1];
        r5 = r5.getName();
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0064;
    L_0x0058:
        r5 = r4[r1];
        r5 = r5.getParameterTypes();
        r5 = r5.length;
        if (r5 != r2) goto L_0x0064;
    L_0x0061:
        r4 = r4[r1];
        return r4;
    L_0x0064:
        r1 = r1 + 1;
        goto L_0x0049;
    L_0x0067:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.EventSetDescriptor.findMethodByPrefix(java.lang.Class, java.lang.String, java.lang.String):java.lang.reflect.Method");
    }

    private static boolean isUnicastByDefault(Method method) {
        if (method != null) {
            for (Object equals : method.getExceptionTypes()) {
                if (equals.equals(TooManyListenersException.class)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String prepareEventTypeName(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str != null && str.length() > 0) {
            stringBuilder.append(Character.toUpperCase(str.charAt(0)));
            if (str.length() > 1) {
                stringBuilder.append(str.substring(1));
            }
        }
        stringBuilder.append("Event");
        return stringBuilder.toString();
    }

    public Method getAddListenerMethod() {
        return this.addListenerMethod;
    }

    public Method getGetListenerMethod() {
        return this.getListenerMethod;
    }

    public MethodDescriptor[] getListenerMethodDescriptors() {
        return this.listenerMethodDescriptors == null ? null : (MethodDescriptor[]) this.listenerMethodDescriptors.toArray(new MethodDescriptor[0]);
    }

    public Method[] getListenerMethods() {
        if (this.listenerMethods != null) {
            return this.listenerMethods;
        }
        if (this.listenerMethodDescriptors == null) {
            return null;
        }
        this.listenerMethods = new Method[this.listenerMethodDescriptors.size()];
        int i = 0;
        Iterator it = this.listenerMethodDescriptors.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            this.listenerMethods[i] = ((MethodDescriptor) it.next()).getMethod();
            i = i2;
        }
        return this.listenerMethods;
    }

    public Class<?> getListenerType() {
        return this.listenerType;
    }

    public Method getRemoveListenerMethod() {
        return this.removeListenerMethod;
    }

    public boolean isInDefaultEventSet() {
        return this.inDefaultEventSet;
    }

    public boolean isUnicast() {
        return this.unicast;
    }

    void merge(EventSetDescriptor eventSetDescriptor) {
        super.merge(eventSetDescriptor);
        if (this.addListenerMethod == null) {
            this.addListenerMethod = eventSetDescriptor.addListenerMethod;
        }
        if (this.getListenerMethod == null) {
            this.getListenerMethod = eventSetDescriptor.getListenerMethod;
        }
        if (this.listenerMethodDescriptors == null) {
            this.listenerMethodDescriptors = eventSetDescriptor.listenerMethodDescriptors;
        }
        if (this.listenerMethods == null) {
            this.listenerMethods = eventSetDescriptor.listenerMethods;
        }
        if (this.listenerType == null) {
            this.listenerType = eventSetDescriptor.listenerType;
        }
        if (this.removeListenerMethod == null) {
            this.removeListenerMethod = eventSetDescriptor.removeListenerMethod;
        }
        this.inDefaultEventSet = eventSetDescriptor.inDefaultEventSet & this.inDefaultEventSet;
    }

    public void setInDefaultEventSet(boolean z) {
        this.inDefaultEventSet = z;
    }

    public void setUnicast(boolean z) {
        this.unicast = z;
    }
}
