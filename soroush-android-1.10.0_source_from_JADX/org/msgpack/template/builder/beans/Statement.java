package org.msgpack.template.builder.beans;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.b.a.a;
import org.msgpack.util.TemplatePrecompiler;

public class Statement {
    private static WeakHashMap<Class<?>, Method[]> classMethodsCache = new WeakHashMap();
    private static final String[][] pdConstructorSignatures;
    private Object[] arguments;
    private String methodName;
    private Object target;

    class C78311 implements PrivilegedAction<Object> {
        final /* synthetic */ Iterator val$iterator;
        final /* synthetic */ Method val$method;

        C78311(Method method, Iterator it) {
            this.val$method = method;
            this.val$iterator = it;
        }

        public java.lang.Object run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r0 = r3.val$method;	 Catch:{ Exception -> 0x0012 }
            r1 = 1;	 Catch:{ Exception -> 0x0012 }
            r0.setAccessible(r1);	 Catch:{ Exception -> 0x0012 }
            r0 = r3.val$method;	 Catch:{ Exception -> 0x0012 }
            r1 = r3.val$iterator;	 Catch:{ Exception -> 0x0012 }
            r2 = 0;	 Catch:{ Exception -> 0x0012 }
            r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0012 }
            r0 = r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0012 }
            return r0;
        L_0x0012:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.Statement.1.run():java.lang.Object");
        }
    }

    static class MethodComparator implements Comparator<Method> {
        static int INFINITY = Integer.MAX_VALUE;
        private final Map<Method, Integer> cache = new HashMap();
        private Class<?>[] referenceMethodArgumentTypes;
        private String referenceMethodName;

        public MethodComparator(String str, Class<?>[] clsArr) {
            this.referenceMethodName = str;
            this.referenceMethodArgumentTypes = clsArr;
        }

        private static int getDistance(Class<?> cls, Class<?> cls2) {
            int i = INFINITY;
            if (!cls2.isAssignableFrom(cls)) {
                return INFINITY;
            }
            int i2 = 0;
            if (cls.getName().equals(cls2.getName())) {
                return 0;
            }
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                i = getDistance(superclass, cls2);
            }
            if (!cls2.isInterface()) {
                return i != INFINITY ? i + 2 : INFINITY;
            } else {
                Class[] interfaces = cls.getInterfaces();
                int i3 = INFINITY;
                int length = interfaces.length;
                while (i2 < length) {
                    int distance = getDistance(interfaces[i2], cls2);
                    if (distance < i3) {
                        i3 = distance;
                    }
                    i2++;
                }
                if (i >= i3) {
                    i = i3;
                }
                return i != INFINITY ? i + 1 : INFINITY;
            }
        }

        private int getNorm(Method method) {
            String name = method.getName();
            Class[] parameterTypes = method.getParameterTypes();
            if (this.referenceMethodName.equals(name)) {
                if (this.referenceMethodArgumentTypes.length == parameterTypes.length) {
                    int i = 0;
                    int i2 = 0;
                    while (i < this.referenceMethodArgumentTypes.length) {
                        if (this.referenceMethodArgumentTypes[i] != null) {
                            if (this.referenceMethodArgumentTypes[i].isPrimitive()) {
                                this.referenceMethodArgumentTypes[i] = Statement.getPrimitiveWrapper(this.referenceMethodArgumentTypes[i]);
                            }
                            if (parameterTypes[i].isPrimitive()) {
                                parameterTypes[i] = Statement.getPrimitiveWrapper(parameterTypes[i]);
                            }
                            i2 += getDistance(this.referenceMethodArgumentTypes[i], parameterTypes[i]);
                        }
                        i++;
                    }
                    return i2;
                }
            }
            return INFINITY;
        }

        public int compare(Method method, Method method2) {
            Integer num = (Integer) this.cache.get(method);
            Integer num2 = (Integer) this.cache.get(method2);
            if (num == null) {
                num = Integer.valueOf(getNorm(method));
                this.cache.put(method, num);
            }
            if (num2 == null) {
                num2 = Integer.valueOf(getNorm(method2));
                this.cache.put(method2, num2);
            }
            return num.intValue() - num2.intValue();
        }
    }

    static {
        r0 = new String[13][];
        r0[0] = new String[]{"java.lang.Class", "new", "java.lang.Boolean", "", "", ""};
        r0[1] = new String[]{"java.lang.Class", "new", "java.lang.Byte", "", "", ""};
        r0[2] = new String[]{"java.lang.Class", "new", "java.lang.Character", "", "", ""};
        r0[3] = new String[]{"java.lang.Class", "new", "java.lang.Double", "", "", ""};
        r0[4] = new String[]{"java.lang.Class", "new", "java.lang.Float", "", "", ""};
        r0[5] = new String[]{"java.lang.Class", "new", "java.lang.Integer", "", "", ""};
        r0[6] = new String[]{"java.lang.Class", "new", "java.lang.Long", "", "", ""};
        r0[7] = new String[]{"java.lang.Class", "new", "java.lang.Short", "", "", ""};
        r0[8] = new String[]{"java.lang.Class", "new", "java.lang.String", "", "", ""};
        r0[9] = new String[]{"java.lang.Class", "forName", "java.lang.String", "", "", ""};
        r0[10] = new String[]{"java.lang.Class", "newInstance", "java.lang.Class", "java.lang.Integer", "", ""};
        r0[11] = new String[]{"java.lang.reflect.Field", "get", "null", "", "", ""};
        r0[12] = new String[]{"java.lang.Class", "forName", "java.lang.String", "", "", ""};
        pdConstructorSignatures = r0;
    }

    public Statement(Object obj, String str, Object[] objArr) {
        this.target = obj;
        this.methodName = str;
        if (objArr == null) {
            objArr = a.a;
        }
        this.arguments = objArr;
    }

    private void arrayCopy(Class<?> cls, Object[] objArr, Object obj, int i) {
        int i2 = 0;
        if (cls == Boolean.TYPE) {
            boolean[] zArr = (boolean[]) obj;
            while (i2 < i) {
                zArr[i2] = ((Boolean) objArr[i2]).booleanValue();
                i2++;
            }
        } else if (cls == Short.TYPE) {
            short[] sArr = (short[]) obj;
            while (i2 < i) {
                sArr[i2] = ((Short) objArr[i2]).shortValue();
                i2++;
            }
        } else if (cls == Byte.TYPE) {
            byte[] bArr = (byte[]) obj;
            while (i2 < i) {
                bArr[i2] = ((Byte) objArr[i2]).byteValue();
                i2++;
            }
        } else if (cls == Character.TYPE) {
            char[] cArr = (char[]) obj;
            while (i2 < i) {
                cArr[i2] = ((Character) objArr[i2]).charValue();
                i2++;
            }
        } else if (cls == Integer.TYPE) {
            int[] iArr = (int[]) obj;
            while (i2 < i) {
                iArr[i2] = ((Integer) objArr[i2]).intValue();
                i2++;
            }
        } else if (cls == Long.TYPE) {
            long[] jArr = (long[]) obj;
            while (i2 < i) {
                jArr[i2] = ((Long) objArr[i2]).longValue();
                i2++;
            }
        } else if (cls == Float.TYPE) {
            float[] fArr = (float[]) obj;
            while (i2 < i) {
                fArr[i2] = ((Float) objArr[i2]).floatValue();
                i2++;
            }
        } else {
            if (cls == Double.TYPE) {
                double[] dArr = (double[]) obj;
                while (i2 < i) {
                    dArr[i2] = ((Double) objArr[i2]).doubleValue();
                    i2++;
                }
            }
        }
    }

    private Method findArrayMethod(String str, Object[] objArr) {
        boolean equals = "get".equals(str);
        boolean equals2 = "set".equals(str);
        if (!equals && !equals2) {
            throw new NoSuchMethodException(org.apache.b.a.a.a.a.a("custom.beans.3C"));
        } else if (objArr.length > 0 && objArr[0].getClass() != Integer.class) {
            throw new ClassCastException(org.apache.b.a.a.a.a.a("custom.beans.3D"));
        } else if (equals && objArr.length != 1) {
            throw new ArrayIndexOutOfBoundsException(org.apache.b.a.a.a.a.a("custom.beans.3E"));
        } else if (!equals2 || objArr.length == 2) {
            return Array.class.getMethod(str, equals ? new Class[]{Object.class, Integer.TYPE} : new Class[]{Object.class, Integer.TYPE, Object.class});
        } else {
            throw new ArrayIndexOutOfBoundsException(org.apache.b.a.a.a.a.a("custom.beans.3F"));
        }
    }

    private Constructor<?> findConstructor(Class<?> cls, Object[] objArr) {
        Class[] types = getTypes(objArr);
        Constructor<?> constructor = null;
        for (Constructor<?> constructor2 : cls.getConstructors()) {
            Class[] parameterTypes = constructor2.getParameterTypes();
            if (match(types, parameterTypes)) {
                if (constructor != null) {
                    Class[] parameterTypes2 = constructor.getParameterTypes();
                    int i = 1;
                    for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                        if (types[i2] != null) {
                            i &= parameterTypes2[i2].isAssignableFrom(parameterTypes[i2]);
                            if (i == 0) {
                                break;
                            }
                        }
                        if (types[i2] == null) {
                            i &= parameterTypes[i2].isAssignableFrom(parameterTypes2[i2]);
                            if (i == 0) {
                                break;
                            }
                        }
                    }
                    if (i == 0) {
                    }
                }
                constructor = constructor2;
            }
        }
        if (constructor != null) {
            return constructor;
        }
        throw new NoSuchMethodException(org.apache.b.a.a.a.a.a("custom.beans.40", cls.getName()));
    }

    static Method findMethod(Class<?> cls, String str, Object[] objArr, boolean z) {
        Method[] methodArr;
        Class[] types = getTypes(objArr);
        if (classMethodsCache.containsKey(cls)) {
            methodArr = (Method[]) classMethodsCache.get(cls);
        } else {
            Object methods = cls.getMethods();
            classMethodsCache.put(cls, methods);
            methodArr = methods;
        }
        ArrayList arrayList = new ArrayList();
        for (Method method : r6) {
            if (str.equals(method.getName()) && ((!z || Modifier.isStatic(method.getModifiers())) && match(types, method.getParameterTypes()))) {
                arrayList.add(method);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            throw new NoSuchMethodException(org.apache.b.a.a.a.a.a("custom.beans.41", str));
        }
        int i = 1;
        if (size == 1) {
            return (Method) arrayList.get(0);
        }
        MethodComparator methodComparator = new MethodComparator(str, types);
        methodArr = (Method[]) arrayList.toArray(new Method[size]);
        Method method2 = methodArr[0];
        while (i < methodArr.length) {
            int compare = methodComparator.compare(method2, methodArr[i]);
            if (compare == 0) {
                Class returnType = method2.getReturnType();
                Class returnType2 = methodArr[i].getReturnType();
                if (returnType == returnType2) {
                    throw new NoSuchMethodException(org.apache.b.a.a.a.a.a("custom.beans.62", str));
                } else if (returnType.isAssignableFrom(returnType2)) {
                    method2 = methodArr[i];
                }
            }
            if (compare > 0) {
                method2 = methodArr[i];
            }
            i++;
        }
        return method2;
    }

    private static Class<?> getPrimitiveWrapper(Class<?> cls) {
        return cls == Boolean.TYPE ? Boolean.class : cls == Byte.TYPE ? Byte.class : cls == Character.TYPE ? Character.class : cls == Short.TYPE ? Short.class : cls == Integer.TYPE ? Integer.class : cls == Long.TYPE ? Long.class : cls == Float.TYPE ? Float.class : cls == Double.TYPE ? Double.class : null;
    }

    private static Class<?>[] getTypes(Object[] objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i] == null ? null : objArr[i].getClass();
        }
        return clsArr;
    }

    static boolean isPDConstructor(Statement statement) {
        Object target = statement.getTarget();
        String methodName = statement.getMethodName();
        Object[] arguments = statement.getArguments();
        String[] strArr = new String[pdConstructorSignatures[0].length];
        if (target == null || methodName == null || arguments == null || arguments.length == 0) {
            return false;
        }
        strArr[0] = target.getClass().getName();
        strArr[1] = methodName;
        for (int i = 2; i < strArr.length; i++) {
            int i2 = i - 2;
            if (arguments.length > i2) {
                strArr[i] = arguments[i2] != null ? arguments[i2].getClass().getName() : "null";
            } else {
                strArr[i] = "";
            }
        }
        for (Object[] equals : pdConstructorSignatures) {
            if (Arrays.equals(strArr, equals)) {
                return true;
            }
        }
        return false;
    }

    static boolean isStaticMethodCall(org.msgpack.template.builder.beans.Statement r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r4.getTarget();
        r1 = r4.getMethodName();
        r2 = r0 instanceof java.lang.Class;
        r3 = 0;
        if (r2 != 0) goto L_0x000e;
    L_0x000d:
        return r3;
    L_0x000e:
        r0 = (java.lang.Class) r0;	 Catch:{ NoSuchMethodException -> 0x0019 }
        r4 = r4.getArguments();	 Catch:{ NoSuchMethodException -> 0x0019 }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x0019 }
        findMethod(r0, r1, r4, r2);	 Catch:{ NoSuchMethodException -> 0x0019 }
        return r2;
    L_0x0019:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.Statement.isStaticMethodCall(org.msgpack.template.builder.beans.Statement):boolean");
    }

    private static boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr2.length != clsArr.length) {
            return false;
        }
        int i = 0;
        while (i < clsArr2.length) {
            if (clsArr[i] != null && !clsArr2[i].isAssignableFrom(clsArr[i]) && !a.a(clsArr[i], clsArr2[i])) {
                return false;
            }
            i++;
        }
        return true;
    }

    public void execute() {
        invokeMethod();
    }

    public Object[] getArguments() {
        return this.arguments;
    }

    public String getMethodName() {
        return this.methodName;
    }

    public Object getTarget() {
        return this.target;
    }

    java.lang.Object invokeMethod() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:84:0x013d in {4, 10, 15, 23, 24, 31, 32, 36, 38, 47, 48, 59, 62, 63, 65, 67, 72, 73, 77, 81, 83, 90, 91} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r9 = this;
        r0 = r9.getTarget();	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = r9.getMethodName();	 Catch:{ InvocationTargetException -> 0x013e }
        r2 = r9.getArguments();	 Catch:{ InvocationTargetException -> 0x013e }
        r3 = r0.getClass();	 Catch:{ InvocationTargetException -> 0x013e }
        r4 = r3.isArray();	 Catch:{ InvocationTargetException -> 0x013e }
        r5 = 0;	 Catch:{ InvocationTargetException -> 0x013e }
        r6 = 1;	 Catch:{ InvocationTargetException -> 0x013e }
        r7 = 0;	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 == 0) goto L_0x002c;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0019:
        r1 = r9.findArrayMethod(r1, r2);	 Catch:{ InvocationTargetException -> 0x013e }
        r3 = r2.length;	 Catch:{ InvocationTargetException -> 0x013e }
        r3 = r3 + r6;	 Catch:{ InvocationTargetException -> 0x013e }
        r3 = new java.lang.Object[r3];	 Catch:{ InvocationTargetException -> 0x013e }
        r3[r7] = r0;	 Catch:{ InvocationTargetException -> 0x013e }
        r0 = r2.length;	 Catch:{ InvocationTargetException -> 0x013e }
        java.lang.System.arraycopy(r2, r7, r3, r6, r0);	 Catch:{ InvocationTargetException -> 0x013e }
        r0 = r1.invoke(r5, r3);	 Catch:{ InvocationTargetException -> 0x013e }
        return r0;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x002c:
        r4 = "newInstance";	 Catch:{ InvocationTargetException -> 0x013e }
        r4 = r4.equals(r1);	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 == 0) goto L_0x0049;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0034:
        r4 = java.lang.reflect.Array.class;	 Catch:{ InvocationTargetException -> 0x013e }
        if (r0 != r4) goto L_0x0049;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0038:
        r0 = r2[r7];	 Catch:{ InvocationTargetException -> 0x013e }
        r0 = (java.lang.Class) r0;	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = r2[r6];	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = (java.lang.Integer) r1;	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = r1.intValue();	 Catch:{ InvocationTargetException -> 0x013e }
        r0 = java.lang.reflect.Array.newInstance(r0, r1);	 Catch:{ InvocationTargetException -> 0x013e }
        return r0;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0049:
        r4 = "new";	 Catch:{ InvocationTargetException -> 0x013e }
        r4 = r4.equals(r1);	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 != 0) goto L_0x0117;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0051:
        r4 = "newInstance";	 Catch:{ InvocationTargetException -> 0x013e }
        r4 = r4.equals(r1);	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 == 0) goto L_0x005b;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0059:
        goto L_0x0117;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x005b:
        r4 = "newArray";	 Catch:{ InvocationTargetException -> 0x013e }
        r4 = r1.equals(r4);	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 == 0) goto L_0x00a7;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0063:
        r0 = (java.lang.Class) r0;	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = r7;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0066:
        r3 = r2.length;	 Catch:{ InvocationTargetException -> 0x013e }
        if (r1 >= r3) goto L_0x0092;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0069:
        r3 = r2[r1];	 Catch:{ InvocationTargetException -> 0x013e }
        if (r3 != 0) goto L_0x006f;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x006d:
        r3 = r5;	 Catch:{ InvocationTargetException -> 0x013e }
        goto L_0x0075;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x006f:
        r3 = r2[r1];	 Catch:{ InvocationTargetException -> 0x013e }
        r3 = r3.getClass();	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0075:
        if (r3 == 0) goto L_0x008f;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0077:
        r4 = r0.isAssignableFrom(r3);	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 != 0) goto L_0x008f;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x007d:
        r3 = org.apache.b.a.a.a(r3, r0);	 Catch:{ InvocationTargetException -> 0x013e }
        if (r3 != 0) goto L_0x008f;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0083:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = "custom.beans.63";	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = org.apache.b.a.a.a.a.a(r1);	 Catch:{ InvocationTargetException -> 0x013e }
        r0.<init>(r1);	 Catch:{ InvocationTargetException -> 0x013e }
        throw r0;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x008f:
        r1 = r1 + 1;	 Catch:{ InvocationTargetException -> 0x013e }
        goto L_0x0066;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0092:
        r1 = r2.length;	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = java.lang.reflect.Array.newInstance(r0, r1);	 Catch:{ InvocationTargetException -> 0x013e }
        r3 = r0.isPrimitive();	 Catch:{ InvocationTargetException -> 0x013e }
        if (r3 == 0) goto L_0x00a2;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x009d:
        r3 = r2.length;	 Catch:{ InvocationTargetException -> 0x013e }
        r9.arrayCopy(r0, r2, r1, r3);	 Catch:{ InvocationTargetException -> 0x013e }
        return r1;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x00a2:
        r0 = r2.length;	 Catch:{ InvocationTargetException -> 0x013e }
        java.lang.System.arraycopy(r2, r7, r1, r7, r0);	 Catch:{ InvocationTargetException -> 0x013e }
        return r1;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x00a7:
        r4 = r0 instanceof java.lang.Class;	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 == 0) goto L_0x00f5;
    L_0x00ab:
        r4 = java.lang.Class.class;	 Catch:{ NoSuchMethodException -> 0x00bc }
        if (r0 == r4) goto L_0x00bc;	 Catch:{ NoSuchMethodException -> 0x00bc }
    L_0x00af:
        r4 = r0;	 Catch:{ NoSuchMethodException -> 0x00bc }
        r4 = (java.lang.Class) r4;	 Catch:{ NoSuchMethodException -> 0x00bc }
        r4 = findMethod(r4, r1, r2, r6);	 Catch:{ NoSuchMethodException -> 0x00bc }
        r8 = r4.invoke(r5, r2);	 Catch:{ NoSuchMethodException -> 0x00bd }
        r5 = r8;
        goto L_0x00bd;
    L_0x00bc:
        r4 = r5;
    L_0x00bd:
        if (r4 != 0) goto L_0x00f3;
    L_0x00bf:
        r4 = "forName";	 Catch:{ InvocationTargetException -> 0x013e }
        r4 = r4.equals(r1);	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 == 0) goto L_0x00ea;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x00c7:
        r4 = r2.length;	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 != r6) goto L_0x00ea;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x00ca:
        r4 = r2[r7];	 Catch:{ InvocationTargetException -> 0x013e }
        r4 = r4 instanceof java.lang.String;	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 == 0) goto L_0x00ea;
    L_0x00d0:
        r0 = r2[r7];	 Catch:{ ClassNotFoundException -> 0x00d9 }
        r0 = (java.lang.String) r0;	 Catch:{ ClassNotFoundException -> 0x00d9 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x00d9 }
        return r0;
    L_0x00d9:
        r0 = r2[r7];	 Catch:{ InvocationTargetException -> 0x013e }
        r0 = (java.lang.String) r0;	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = java.lang.Thread.currentThread();	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = r1.getContextClassLoader();	 Catch:{ InvocationTargetException -> 0x013e }
        r0 = java.lang.Class.forName(r0, r6, r1);	 Catch:{ InvocationTargetException -> 0x013e }
        return r0;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x00ea:
        r1 = findMethod(r3, r1, r2, r7);	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x00ee:
        r0 = r1.invoke(r0, r2);	 Catch:{ InvocationTargetException -> 0x013e }
        return r0;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x00f3:
        r0 = r5;	 Catch:{ InvocationTargetException -> 0x013e }
        return r0;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x00f5:
        r4 = r0 instanceof java.util.Iterator;	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 == 0) goto L_0x010f;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x00f9:
        r0 = (java.util.Iterator) r0;	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = findMethod(r3, r1, r2, r7);	 Catch:{ InvocationTargetException -> 0x013e }
        r2 = r0.hasNext();	 Catch:{ InvocationTargetException -> 0x013e }
        if (r2 == 0) goto L_0x00f3;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0105:
        r2 = new org.msgpack.template.builder.beans.Statement$1;	 Catch:{ InvocationTargetException -> 0x013e }
        r2.<init>(r1, r0);	 Catch:{ InvocationTargetException -> 0x013e }
        r5 = r2.run();	 Catch:{ InvocationTargetException -> 0x013e }
        goto L_0x00f3;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x010f:
        r1 = findMethod(r3, r1, r2, r7);	 Catch:{ InvocationTargetException -> 0x013e }
        r1.setAccessible(r6);	 Catch:{ InvocationTargetException -> 0x013e }
        goto L_0x00ee;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0117:
        r4 = r0 instanceof java.lang.Class;	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 == 0) goto L_0x0126;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x011b:
        r0 = (java.lang.Class) r0;	 Catch:{ InvocationTargetException -> 0x013e }
        r0 = r9.findConstructor(r0, r2);	 Catch:{ InvocationTargetException -> 0x013e }
        r0 = r0.newInstance(r2);	 Catch:{ InvocationTargetException -> 0x013e }
        return r0;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0126:
        r4 = "new";	 Catch:{ InvocationTargetException -> 0x013e }
        r4 = r4.equals(r1);	 Catch:{ InvocationTargetException -> 0x013e }
        if (r4 == 0) goto L_0x0138;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x012e:
        r0 = new java.lang.NoSuchMethodException;	 Catch:{ InvocationTargetException -> 0x013e }
        r1 = r9.toString();	 Catch:{ InvocationTargetException -> 0x013e }
        r0.<init>(r1);	 Catch:{ InvocationTargetException -> 0x013e }
        throw r0;	 Catch:{ InvocationTargetException -> 0x013e }
    L_0x0138:
        r1 = findMethod(r3, r1, r2, r7);	 Catch:{ InvocationTargetException -> 0x013e }
        goto L_0x00ee;
        return r0;
    L_0x013e:
        r0 = move-exception;
        r1 = r0.getCause();
        if (r1 == 0) goto L_0x014c;
    L_0x0145:
        r2 = r1 instanceof java.lang.Exception;
        if (r2 == 0) goto L_0x014c;
    L_0x0149:
        r0 = r1;
        r0 = (java.lang.Exception) r0;
    L_0x014c:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.Statement.invokeMethod():java.lang.Object");
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        if (this.target == null) {
            str = "null";
        } else {
            Class cls = this.target.getClass();
            str = cls == String.class ? "\"\"" : a.a(cls);
        }
        stringBuilder.append(str);
        StringBuilder stringBuilder2 = new StringBuilder(TemplatePrecompiler.DEFAULT_DEST);
        stringBuilder2.append(this.methodName);
        stringBuilder2.append('(');
        stringBuilder.append(stringBuilder2.toString());
        if (this.arguments != null) {
            for (int i = 0; i < this.arguments.length; i++) {
                String str2;
                if (i > 0) {
                    stringBuilder.append(", ");
                }
                if (this.arguments[i] == null) {
                    str2 = "null";
                } else {
                    Class cls2 = this.arguments[i].getClass();
                    if (cls2 == String.class) {
                        StringBuilder stringBuilder3 = new StringBuilder("\"");
                        stringBuilder3.append((String) this.arguments[i]);
                        stringBuilder3.append('\"');
                        str2 = stringBuilder3.toString();
                    } else {
                        str2 = a.a(cls2);
                    }
                }
                stringBuilder.append(str2);
            }
        }
        stringBuilder.append(')');
        stringBuilder.append(';');
        return stringBuilder.toString();
    }
}
