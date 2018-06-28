package org.msgpack.template.builder.beans;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public class Introspector {
    private static final String DEFAULT_BEANINFO_SEARCHPATH = "sun.beans.infos";
    private static final int DEFAULT_CAPACITY = 128;
    public static final int IGNORE_ALL_BEANINFO = 3;
    public static final int IGNORE_IMMEDIATE_BEANINFO = 2;
    public static final int USE_ALL_BEANINFO = 1;
    private static String[] searchPath = new String[]{DEFAULT_BEANINFO_SEARCHPATH};
    private static Map<Class<?>, StandardBeanInfo> theCache = Collections.synchronizedMap(new WeakHashMap(128));

    private Introspector() {
    }

    public static String decapitalize(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return str;
        }
        if (str.length() > 1 && Character.isUpperCase(str.charAt(1))) {
            return str;
        }
        char[] toCharArray = str.toCharArray();
        toCharArray[0] = Character.toLowerCase(toCharArray[0]);
        return new String(toCharArray);
    }

    public static void flushCaches() {
        theCache.clear();
    }

    public static void flushFromCaches(Class<?> cls) {
        if (cls == null) {
            throw new NullPointerException();
        }
        theCache.remove(cls);
    }

    public static BeanInfo getBeanInfo(Class<?> cls) {
        StandardBeanInfo standardBeanInfo = (StandardBeanInfo) theCache.get(cls);
        if (standardBeanInfo != null) {
            return standardBeanInfo;
        }
        BeanInfo beanInfoImplAndInit = getBeanInfoImplAndInit(cls, null, 1);
        theCache.put(cls, beanInfoImplAndInit);
        return beanInfoImplAndInit;
    }

    public static BeanInfo getBeanInfo(Class<?> cls, int i) {
        return i == 1 ? getBeanInfo(cls) : getBeanInfoImplAndInit(cls, null, i);
    }

    public static BeanInfo getBeanInfo(Class<?> cls, Class<?> cls2) {
        return cls2 == null ? getBeanInfo(cls) : getBeanInfoImplAndInit(cls, cls2, 1);
    }

    private static StandardBeanInfo getBeanInfoImpl(Class<?> cls, Class<?> cls2, int i) {
        StandardBeanInfo standardBeanInfo = new StandardBeanInfo(cls, i == 1 ? getExplicitBeanInfo(cls) : null, cls2);
        if (standardBeanInfo.additionalBeanInfo != null) {
            for (int length = standardBeanInfo.additionalBeanInfo.length - 1; length >= 0; length--) {
                standardBeanInfo.mergeBeanInfo(standardBeanInfo.additionalBeanInfo[length], true);
            }
        }
        cls = cls.getSuperclass();
        if (cls != cls2) {
            if (cls == null) {
                throw new IntrospectionException("Stop class is not super class of bean class");
            }
            if (i == 2) {
                i = 1;
            }
            BeanInfo beanInfoImpl = getBeanInfoImpl(cls, cls2, i);
            if (beanInfoImpl != null) {
                standardBeanInfo.mergeBeanInfo(beanInfoImpl, false);
            }
        }
        return standardBeanInfo;
    }

    private static StandardBeanInfo getBeanInfoImplAndInit(Class<?> cls, Class<?> cls2, int i) {
        StandardBeanInfo beanInfoImpl = getBeanInfoImpl(cls, cls2, i);
        beanInfoImpl.init();
        return beanInfoImpl;
    }

    public static String[] getBeanInfoSearchPath() {
        Object obj = new String[searchPath.length];
        System.arraycopy(searchPath, 0, obj, 0, searchPath.length);
        return obj;
    }

    private static org.msgpack.template.builder.beans.BeanInfo getExplicitBeanInfo(java.lang.Class<?> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r4.getName();
        r0.append(r1);
        r1 = "BeanInfo";
        r0.append(r1);
        r0 = r0.toString();
        r1 = loadBeanInfo(r0, r4);	 Catch:{ Exception -> 0x001a }
        return r1;
    L_0x001a:
        r1 = 46;
        r1 = r0.lastIndexOf(r1);
        if (r1 < 0) goto L_0x0028;
    L_0x0022:
        r1 = r1 + 1;
        r0 = r0.substring(r1);
    L_0x0028:
        r1 = 0;
    L_0x0029:
        r2 = searchPath;
        r2 = r2.length;
        if (r1 >= r2) goto L_0x005a;
    L_0x002e:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = searchPath;
        r3 = r3[r1];
        r2.append(r3);
        r3 = ".";
        r2.append(r3);
        r2.append(r0);
        r2 = r2.toString();
        r2 = loadBeanInfo(r2, r4);	 Catch:{ Exception -> 0x0057 }
        r3 = r2.getBeanDescriptor();
        if (r3 == 0) goto L_0x0057;
    L_0x0050:
        r3 = r3.getBeanClass();
        if (r4 != r3) goto L_0x0057;
    L_0x0056:
        return r2;
    L_0x0057:
        r1 = r1 + 1;
        goto L_0x0029;
    L_0x005a:
        r0 = org.msgpack.template.builder.beans.BeanInfo.class;
        r0 = r0.isAssignableFrom(r4);
        if (r0 == 0) goto L_0x006b;
    L_0x0062:
        r0 = r4.getName();	 Catch:{ Exception -> 0x006b }
        r4 = loadBeanInfo(r0, r4);	 Catch:{ Exception -> 0x006b }
        return r4;
    L_0x006b:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.Introspector.getExplicitBeanInfo(java.lang.Class):org.msgpack.template.builder.beans.BeanInfo");
    }

    private static org.msgpack.template.builder.beans.BeanInfo loadBeanInfo(java.lang.String r2, java.lang.Class<?> r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 1;
        r1 = r3.getClassLoader();	 Catch:{ Exception -> 0x0016 }
        if (r1 == 0) goto L_0x0016;	 Catch:{ Exception -> 0x0016 }
    L_0x0007:
        r3 = r3.getClassLoader();	 Catch:{ Exception -> 0x0016 }
        r3 = java.lang.Class.forName(r2, r0, r3);	 Catch:{ Exception -> 0x0016 }
        r3 = r3.newInstance();	 Catch:{ Exception -> 0x0016 }
        r3 = (org.msgpack.template.builder.beans.BeanInfo) r3;	 Catch:{ Exception -> 0x0016 }
        return r3;
    L_0x0016:
        r3 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ Exception -> 0x0025 }
        r3 = java.lang.Class.forName(r2, r0, r3);	 Catch:{ Exception -> 0x0025 }
        r3 = r3.newInstance();	 Catch:{ Exception -> 0x0025 }
        r3 = (org.msgpack.template.builder.beans.BeanInfo) r3;	 Catch:{ Exception -> 0x0025 }
        return r3;
    L_0x0025:
        r3 = java.lang.Thread.currentThread();
        r3 = r3.getContextClassLoader();
        r2 = java.lang.Class.forName(r2, r0, r3);
        r2 = r2.newInstance();
        r2 = (org.msgpack.template.builder.beans.BeanInfo) r2;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.Introspector.loadBeanInfo(java.lang.String, java.lang.Class):org.msgpack.template.builder.beans.BeanInfo");
    }

    public static void setBeanInfoSearchPath(String[] strArr) {
        if (System.getSecurityManager() != null) {
            System.getSecurityManager().checkPropertiesAccess();
        }
        searchPath = strArr;
    }
}
