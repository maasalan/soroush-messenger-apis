package org.msgpack.template.builder.beans;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EventListener;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TooManyListenersException;

class StandardBeanInfo extends SimpleBeanInfo {
    private static final String PREFIX_ADD = "add";
    private static final String PREFIX_GET = "get";
    private static final String PREFIX_IS = "is";
    private static final String PREFIX_REMOVE = "remove";
    private static final String PREFIX_SET = "set";
    private static final String STR_GETTERS = "getters";
    private static final String STR_INDEXED = "indexed";
    private static final String STR_INVALID = "invalid";
    private static final String STR_IS_CONSTRAINED = "isConstrained";
    private static final String STR_NORMAL = "normal";
    private static final String STR_PROPERTY_TYPE = "PropertyType";
    private static final String STR_SETTERS = "setters";
    private static final String STR_VALID = "valid";
    private static final String SUFFIX_LISTEN = "Listener";
    private static PropertyComparator comparator = new PropertyComparator();
    BeanInfo[] additionalBeanInfo = null;
    private Class<?> beanClass;
    private BeanDescriptor beanDescriptor = null;
    private boolean canAddPropertyChangeListener;
    private boolean canRemovePropertyChangeListener;
    private int defaultEventIndex = -1;
    private int defaultPropertyIndex = -1;
    private EventSetDescriptor[] events = null;
    private BeanInfo explicitBeanInfo = null;
    private boolean explicitEvents = false;
    private boolean explicitMethods = false;
    private boolean explicitProperties = false;
    private MethodDescriptor[] methods = null;
    private PropertyDescriptor[] properties = null;

    private static class PropertyComparator implements Comparator<PropertyDescriptor> {
        private PropertyComparator() {
        }

        public int compare(PropertyDescriptor propertyDescriptor, PropertyDescriptor propertyDescriptor2) {
            return propertyDescriptor.getName().compareTo(propertyDescriptor2.getName());
        }
    }

    StandardBeanInfo(Class<?> cls, BeanInfo beanInfo, Class<?> cls2) {
        this.beanClass = cls;
        if (beanInfo != null) {
            this.explicitBeanInfo = beanInfo;
            this.events = beanInfo.getEventSetDescriptors();
            this.methods = beanInfo.getMethodDescriptors();
            this.properties = beanInfo.getPropertyDescriptors();
            this.defaultEventIndex = beanInfo.getDefaultEventIndex();
            if (this.defaultEventIndex < 0 || this.defaultEventIndex >= this.events.length) {
                this.defaultEventIndex = -1;
            }
            this.defaultPropertyIndex = beanInfo.getDefaultPropertyIndex();
            if (this.defaultPropertyIndex < 0 || this.defaultPropertyIndex >= this.properties.length) {
                this.defaultPropertyIndex = -1;
            }
            this.additionalBeanInfo = beanInfo.getAdditionalBeanInfo();
            if (this.events != null) {
                this.explicitEvents = true;
            }
            if (this.methods != null) {
                this.explicitMethods = true;
            }
            if (this.properties != null) {
                this.explicitProperties = true;
            }
        }
        if (this.methods == null) {
            this.methods = introspectMethods();
        }
        if (this.properties == null) {
            this.properties = introspectProperties(cls2);
        }
        if (this.events == null) {
            this.events = introspectEvents();
        }
    }

    private String capitalize(String str) {
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
        toCharArray[0] = Character.toUpperCase(toCharArray[0]);
        return new String(toCharArray);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void fixGetSet(java.util.HashMap<java.lang.String, java.util.HashMap> r14) {
        /*
        r13 = this;
        if (r14 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r14 = r14.entrySet();
        r14 = r14.iterator();
    L_0x000b:
        r0 = r14.hasNext();
        if (r0 == 0) goto L_0x02ac;
    L_0x0011:
        r0 = r14.next();
        r0 = (java.util.Map.Entry) r0;
        r0 = r0.getValue();
        r0 = (java.util.HashMap) r0;
        r1 = "getters";
        r1 = r0.get(r1);
        r1 = (java.util.ArrayList) r1;
        r2 = "setters";
        r2 = r0.get(r2);
        r2 = (java.util.ArrayList) r2;
        if (r1 != 0) goto L_0x0034;
    L_0x002f:
        r1 = new java.util.ArrayList;
        r1.<init>();
    L_0x0034:
        if (r2 != 0) goto L_0x003b;
    L_0x0036:
        r2 = new java.util.ArrayList;
        r2.<init>();
    L_0x003b:
        r1 = r1.iterator();
        r3 = 0;
        r4 = r3;
        r5 = r4;
    L_0x0042:
        r6 = r1.hasNext();
        r7 = 0;
        r8 = 1;
        if (r6 == 0) goto L_0x0093;
    L_0x004a:
        r6 = r1.next();
        r6 = (java.lang.reflect.Method) r6;
        r9 = r6.getParameterTypes();
        r10 = r6.getName();
        if (r9 == 0) goto L_0x005d;
    L_0x005a:
        r11 = r9.length;
        if (r11 != 0) goto L_0x0068;
    L_0x005d:
        if (r4 == 0) goto L_0x0067;
    L_0x005f:
        r11 = "is";
        r11 = r10.startsWith(r11);
        if (r11 == 0) goto L_0x0068;
    L_0x0067:
        r4 = r6;
    L_0x0068:
        if (r9 == 0) goto L_0x0042;
    L_0x006a:
        r11 = r9.length;
        if (r11 != r8) goto L_0x0042;
    L_0x006d:
        r7 = r9[r7];
        r8 = java.lang.Integer.TYPE;
        if (r7 != r8) goto L_0x0042;
    L_0x0073:
        if (r5 == 0) goto L_0x0091;
    L_0x0075:
        r7 = "get";
        r7 = r10.startsWith(r7);
        if (r7 != 0) goto L_0x0091;
    L_0x007d:
        r7 = "is";
        r7 = r10.startsWith(r7);
        if (r7 == 0) goto L_0x0042;
    L_0x0085:
        r7 = r5.getName();
        r8 = "get";
        r7 = r7.startsWith(r8);
        if (r7 != 0) goto L_0x0042;
    L_0x0091:
        r5 = r6;
        goto L_0x0042;
    L_0x0093:
        if (r4 == 0) goto L_0x00c0;
    L_0x0095:
        r1 = r4.getReturnType();
        r6 = r2.iterator();
    L_0x009d:
        r9 = r6.hasNext();
        if (r9 == 0) goto L_0x00be;
    L_0x00a3:
        r9 = r6.next();
        r9 = (java.lang.reflect.Method) r9;
        r10 = r9.getParameterTypes();
        r10 = r10.length;
        if (r10 != r8) goto L_0x009d;
    L_0x00b0:
        r10 = r9.getParameterTypes();
        r10 = r10[r7];
        r10 = r1.equals(r10);
        if (r10 == 0) goto L_0x009d;
    L_0x00bc:
        r6 = r9;
        goto L_0x00da;
    L_0x00be:
        r6 = r3;
        goto L_0x00da;
    L_0x00c0:
        r1 = r2.iterator();
        r6 = r3;
    L_0x00c5:
        r9 = r1.hasNext();
        if (r9 == 0) goto L_0x00da;
    L_0x00cb:
        r9 = r1.next();
        r9 = (java.lang.reflect.Method) r9;
        r10 = r9.getParameterTypes();
        r10 = r10.length;
        if (r10 != r8) goto L_0x00c5;
    L_0x00d8:
        r6 = r9;
        goto L_0x00c5;
    L_0x00da:
        r1 = 2;
        if (r5 == 0) goto L_0x0112;
    L_0x00dd:
        r9 = r5.getReturnType();
        r2 = r2.iterator();
    L_0x00e5:
        r10 = r2.hasNext();
        if (r10 == 0) goto L_0x0110;
    L_0x00eb:
        r10 = r2.next();
        r10 = (java.lang.reflect.Method) r10;
        r11 = r10.getParameterTypes();
        r11 = r11.length;
        if (r11 != r1) goto L_0x00e5;
    L_0x00f8:
        r11 = r10.getParameterTypes();
        r11 = r11[r7];
        r12 = java.lang.Integer.TYPE;
        if (r11 != r12) goto L_0x00e5;
    L_0x0102:
        r11 = r10.getParameterTypes();
        r11 = r11[r8];
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x00e5;
    L_0x010e:
        r9 = r10;
        goto L_0x0136;
    L_0x0110:
        r9 = r3;
        goto L_0x0136;
    L_0x0112:
        r2 = r2.iterator();
        r9 = r3;
    L_0x0117:
        r10 = r2.hasNext();
        if (r10 == 0) goto L_0x0136;
    L_0x011d:
        r10 = r2.next();
        r10 = (java.lang.reflect.Method) r10;
        r11 = r10.getParameterTypes();
        r11 = r11.length;
        if (r11 != r1) goto L_0x0117;
    L_0x012a:
        r11 = r10.getParameterTypes();
        r11 = r11[r7];
        r12 = java.lang.Integer.TYPE;
        if (r11 != r12) goto L_0x0117;
    L_0x0134:
        r9 = r10;
        goto L_0x0117;
    L_0x0136:
        if (r4 == 0) goto L_0x013d;
    L_0x0138:
        r1 = r4.getReturnType();
        goto L_0x0147;
    L_0x013d:
        if (r6 == 0) goto L_0x0146;
    L_0x013f:
        r1 = r6.getParameterTypes();
        r1 = r1[r7];
        goto L_0x0147;
    L_0x0146:
        r1 = r3;
    L_0x0147:
        if (r5 == 0) goto L_0x014e;
    L_0x0149:
        r3 = r5.getReturnType();
        goto L_0x0156;
    L_0x014e:
        if (r9 == 0) goto L_0x0156;
    L_0x0150:
        r2 = r9.getParameterTypes();
        r3 = r2[r8];
    L_0x0156:
        if (r4 == 0) goto L_0x015f;
    L_0x0158:
        r2 = r4.getReturnType();
        r2.isArray();
    L_0x015f:
        if (r4 == 0) goto L_0x017f;
    L_0x0161:
        if (r6 == 0) goto L_0x017f;
    L_0x0163:
        if (r5 == 0) goto L_0x0167;
    L_0x0165:
        if (r9 != 0) goto L_0x017f;
    L_0x0167:
        r2 = "normal";
        r3 = "valid";
        r0.put(r2, r3);
        r2 = "normalget";
        r0.put(r2, r4);
        r2 = "normalset";
        r0.put(r2, r6);
        r2 = "normalPropertyType";
        r0.put(r2, r1);
        goto L_0x000b;
    L_0x017f:
        if (r4 != 0) goto L_0x0183;
    L_0x0181:
        if (r6 == 0) goto L_0x0188;
    L_0x0183:
        if (r5 != 0) goto L_0x0188;
    L_0x0185:
        if (r9 != 0) goto L_0x0188;
    L_0x0187:
        goto L_0x0167;
    L_0x0188:
        if (r4 != 0) goto L_0x018c;
    L_0x018a:
        if (r6 == 0) goto L_0x025b;
    L_0x018c:
        if (r5 != 0) goto L_0x0190;
    L_0x018e:
        if (r9 == 0) goto L_0x025b;
    L_0x0190:
        if (r4 == 0) goto L_0x01ce;
    L_0x0192:
        if (r6 == 0) goto L_0x01ce;
    L_0x0194:
        if (r5 == 0) goto L_0x01ce;
    L_0x0196:
        if (r9 == 0) goto L_0x01ce;
    L_0x0198:
        r2 = r5.getName();
        r7 = "get";
        r2 = r2.startsWith(r7);
        if (r2 == 0) goto L_0x01bc;
    L_0x01a4:
        r2 = "normal";
        r7 = "valid";
        r0.put(r2, r7);
        r2 = "normalget";
        r0.put(r2, r4);
        r2 = "normalset";
        r0.put(r2, r6);
        r2 = "normalPropertyType";
        r0.put(r2, r1);
        goto L_0x027b;
    L_0x01bc:
        r2 = java.lang.Boolean.TYPE;
        if (r1 == r2) goto L_0x0167;
    L_0x01c0:
        r2 = r4.getName();
        r5 = "is";
        r2 = r2.startsWith(r5);
        if (r2 == 0) goto L_0x0167;
    L_0x01cc:
        goto L_0x0273;
    L_0x01ce:
        if (r4 == 0) goto L_0x0201;
    L_0x01d0:
        if (r6 != 0) goto L_0x0201;
    L_0x01d2:
        if (r5 == 0) goto L_0x0201;
    L_0x01d4:
        if (r9 == 0) goto L_0x0201;
    L_0x01d6:
        r2 = "normal";
        r7 = "valid";
        r0.put(r2, r7);
        r2 = "normalget";
        r0.put(r2, r4);
        r2 = "normalset";
        r0.put(r2, r6);
        r2 = "normalPropertyType";
        r0.put(r2, r1);
        r1 = "indexed";
        r2 = "valid";
        r0.put(r1, r2);
        r1 = r5.getName();
        r2 = "get";
        r1 = r1.startsWith(r2);
        if (r1 == 0) goto L_0x0287;
    L_0x01ff:
        goto L_0x0282;
    L_0x0201:
        if (r4 != 0) goto L_0x021d;
    L_0x0203:
        if (r6 == 0) goto L_0x021d;
    L_0x0205:
        if (r5 == 0) goto L_0x021d;
    L_0x0207:
        if (r9 == 0) goto L_0x021d;
    L_0x0209:
        r1 = "indexed";
        r2 = "valid";
        r0.put(r1, r2);
        r1 = r5.getName();
        r2 = "get";
        r1 = r1.startsWith(r2);
        if (r1 == 0) goto L_0x0287;
    L_0x021c:
        goto L_0x01ff;
    L_0x021d:
        if (r4 == 0) goto L_0x0233;
    L_0x021f:
        if (r6 != 0) goto L_0x0233;
    L_0x0221:
        if (r5 == 0) goto L_0x0233;
    L_0x0223:
        if (r9 != 0) goto L_0x0233;
    L_0x0225:
        r2 = r5.getName();
        r7 = "get";
        r2 = r2.startsWith(r7);
        if (r2 == 0) goto L_0x0167;
    L_0x0231:
        goto L_0x01a4;
    L_0x0233:
        if (r4 != 0) goto L_0x0249;
    L_0x0235:
        if (r6 == 0) goto L_0x0249;
    L_0x0237:
        if (r5 == 0) goto L_0x0249;
    L_0x0239:
        if (r9 != 0) goto L_0x0249;
    L_0x023b:
        r2 = r5.getName();
        r7 = "get";
        r2 = r2.startsWith(r7);
        if (r2 == 0) goto L_0x0167;
    L_0x0247:
        goto L_0x01a4;
    L_0x0249:
        if (r4 == 0) goto L_0x0252;
    L_0x024b:
        if (r6 != 0) goto L_0x0252;
    L_0x024d:
        if (r5 != 0) goto L_0x0252;
    L_0x024f:
        if (r9 == 0) goto L_0x0252;
    L_0x0251:
        goto L_0x027b;
    L_0x0252:
        if (r4 != 0) goto L_0x025b;
    L_0x0254:
        if (r6 == 0) goto L_0x025b;
    L_0x0256:
        if (r5 != 0) goto L_0x025b;
    L_0x0258:
        if (r9 == 0) goto L_0x025b;
    L_0x025a:
        goto L_0x027b;
    L_0x025b:
        if (r6 != 0) goto L_0x0293;
    L_0x025d:
        if (r4 != 0) goto L_0x0293;
    L_0x025f:
        if (r5 != 0) goto L_0x0263;
    L_0x0261:
        if (r9 == 0) goto L_0x0293;
    L_0x0263:
        if (r5 == 0) goto L_0x027b;
    L_0x0265:
        r1 = r5.getName();
        r2 = "is";
        r1 = r1.startsWith(r2);
        if (r1 == 0) goto L_0x027b;
    L_0x0271:
        if (r9 == 0) goto L_0x000b;
    L_0x0273:
        r1 = "indexed";
        r2 = "valid";
        r0.put(r1, r2);
        goto L_0x0287;
    L_0x027b:
        r1 = "indexed";
        r2 = "valid";
        r0.put(r1, r2);
    L_0x0282:
        r1 = "indexedget";
        r0.put(r1, r5);
    L_0x0287:
        r1 = "indexedset";
        r0.put(r1, r9);
        r1 = "indexedPropertyType";
        r0.put(r1, r3);
        goto L_0x000b;
    L_0x0293:
        if (r6 != 0) goto L_0x0297;
    L_0x0295:
        if (r4 == 0) goto L_0x029c;
    L_0x0297:
        if (r5 == 0) goto L_0x029c;
    L_0x0299:
        if (r9 == 0) goto L_0x029c;
    L_0x029b:
        goto L_0x027b;
    L_0x029c:
        r1 = "normal";
        r2 = "invalid";
        r0.put(r1, r2);
        r1 = "indexed";
        r2 = "invalid";
        r0.put(r1, r2);
        goto L_0x000b;
    L_0x02ac:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.StandardBeanInfo.fixGetSet(java.util.HashMap):void");
    }

    private static String getQualifiedName(Method method) {
        String name = method.getName();
        Class[] parameterTypes = method.getParameterTypes();
        if (parameterTypes != null) {
            for (Class name2 : parameterTypes) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(name);
                stringBuilder.append("_");
                stringBuilder.append(name2.getName());
                name = stringBuilder.toString();
            }
        }
        return name;
    }

    private static HashMap<String, EventSetDescriptor> internalAsMap(EventSetDescriptor[] eventSetDescriptorArr) {
        HashMap<String, EventSetDescriptor> hashMap = new HashMap();
        for (int i = 0; i < eventSetDescriptorArr.length; i++) {
            hashMap.put(eventSetDescriptorArr[i].getName(), eventSetDescriptorArr[i]);
        }
        return hashMap;
    }

    private static HashMap<String, MethodDescriptor> internalAsMap(MethodDescriptor[] methodDescriptorArr) {
        HashMap<String, MethodDescriptor> hashMap = new HashMap();
        for (int i = 0; i < methodDescriptorArr.length; i++) {
            hashMap.put(getQualifiedName(methodDescriptorArr[i].getMethod()), methodDescriptorArr[i]);
        }
        return hashMap;
    }

    private static HashMap<String, PropertyDescriptor> internalAsMap(PropertyDescriptor[] propertyDescriptorArr) {
        HashMap<String, PropertyDescriptor> hashMap = new HashMap();
        for (int i = 0; i < propertyDescriptorArr.length; i++) {
            hashMap.put(propertyDescriptorArr[i].getName(), propertyDescriptorArr[i]);
        }
        return hashMap;
    }

    private EventSetDescriptor[] introspectEvents() {
        MethodDescriptor[] introspectMethods = introspectMethods();
        if (introspectMethods == null) {
            return null;
        }
        HashMap hashMap = new HashMap(introspectMethods.length);
        for (int i = 0; i < introspectMethods.length; i++) {
            introspectListenerMethods(PREFIX_ADD, introspectMethods[i].getMethod(), hashMap);
            introspectListenerMethods("remove", introspectMethods[i].getMethod(), hashMap);
            introspectGetListenerMethods(introspectMethods[i].getMethod(), hashMap);
        }
        ArrayList arrayList = new ArrayList();
        for (Entry entry : hashMap.entrySet()) {
            HashMap hashMap2 = (HashMap) entry.getValue();
            Method method = (Method) hashMap2.get(PREFIX_ADD);
            Method method2 = (Method) hashMap2.get("remove");
            if (!(method == null || method2 == null)) {
                EventSetDescriptor eventSetDescriptor = new EventSetDescriptor(Introspector.decapitalize((String) entry.getKey()), (Class) hashMap2.get("listenerType"), (Method[]) hashMap2.get("listenerMethods"), method, method2, (Method) hashMap2.get(PREFIX_GET));
                eventSetDescriptor.setUnicast(hashMap2.get("isUnicast") != null);
                arrayList.add(eventSetDescriptor);
            }
        }
        EventSetDescriptor[] eventSetDescriptorArr = new EventSetDescriptor[arrayList.size()];
        arrayList.toArray(eventSetDescriptorArr);
        return eventSetDescriptorArr;
    }

    private static void introspectGet(Method method, HashMap<String, HashMap> hashMap) {
        String name = method.getName();
        if (name != null) {
            int i = name.startsWith(PREFIX_GET) ? 3 : 0;
            if (name.startsWith(PREFIX_IS)) {
                i = 2;
            }
            if (i != 0) {
                name = Introspector.decapitalize(name.substring(i));
                if (isValidProperty(name)) {
                    Class returnType = method.getReturnType();
                    if (returnType != null && returnType != Void.TYPE) {
                        if (i != 2 || returnType == Boolean.TYPE) {
                            Class[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length <= 1 && (parameterTypes.length != 1 || parameterTypes[0] == Integer.TYPE)) {
                                HashMap hashMap2 = (HashMap) hashMap.get(name);
                                if (hashMap2 == null) {
                                    hashMap2 = new HashMap();
                                    hashMap.put(name, hashMap2);
                                }
                                ArrayList arrayList = (ArrayList) hashMap2.get(STR_GETTERS);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    hashMap2.put(STR_GETTERS, arrayList);
                                }
                                arrayList.add(method);
                            }
                        }
                    }
                }
            }
        }
    }

    private static void introspectGetListenerMethods(Method method, HashMap<String, HashMap> hashMap) {
        String str = PREFIX_GET;
        String name = method.getName();
        if (name != null && name.startsWith(str) && name.endsWith("Listeners")) {
            name = name.substring(str.length(), name.length() - 1);
            String substring = name.substring(0, name.lastIndexOf(SUFFIX_LISTEN));
            if (substring != null && substring.length() != 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes != null && parameterTypes.length == 0) {
                    Class returnType = method.getReturnType();
                    if (returnType.getComponentType() != null && returnType.getComponentType().getName().endsWith(name)) {
                        HashMap hashMap2 = (HashMap) hashMap.get(substring);
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap();
                        }
                        hashMap2.put(str, method);
                        hashMap.put(substring, hashMap2);
                    }
                }
            }
        }
    }

    private static void introspectListenerMethods(String str, Method method, HashMap<String, HashMap> hashMap) {
        String name = method.getName();
        if (name != null && name.startsWith(str) && name.endsWith(SUFFIX_LISTEN)) {
            name = name.substring(str.length());
            int i = 0;
            String substring = name.substring(0, name.lastIndexOf(SUFFIX_LISTEN));
            if (substring != null && substring.length() != 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes != null && parameterTypes.length == 1) {
                    Class cls = parameterTypes[0];
                    if (EventListener.class.isAssignableFrom(cls) && cls.getName().endsWith(name)) {
                        HashMap hashMap2 = (HashMap) hashMap.get(substring);
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap();
                        }
                        if (hashMap2.get("listenerType") == null) {
                            hashMap2.put("listenerType", cls);
                            hashMap2.put("listenerMethods", introspectListenerMethods(cls));
                        }
                        hashMap2.put(str, method);
                        if (str.equals(PREFIX_ADD)) {
                            Class[] exceptionTypes = method.getExceptionTypes();
                            if (exceptionTypes != null) {
                                while (i < exceptionTypes.length) {
                                    if (exceptionTypes[i].getName().equals(TooManyListenersException.class.getName())) {
                                        hashMap2.put("isUnicast", "true");
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                        hashMap.put(substring, hashMap2);
                    }
                }
            }
        }
    }

    private static Method[] introspectListenerMethods(Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < declaredMethods.length; i++) {
            Class[] parameterTypes = declaredMethods[i].getParameterTypes();
            if (parameterTypes.length == 1 && EventObject.class.isAssignableFrom(parameterTypes[0])) {
                arrayList.add(declaredMethods[i]);
            }
        }
        declaredMethods = new Method[arrayList.size()];
        arrayList.toArray(declaredMethods);
        return declaredMethods;
    }

    private MethodDescriptor[] introspectMethods() {
        return introspectMethods(false, this.beanClass);
    }

    private MethodDescriptor[] introspectMethods(boolean z) {
        return introspectMethods(z, this.beanClass);
    }

    private MethodDescriptor[] introspectMethods(boolean z, Class<?> cls) {
        Method[] methods = z ? cls.getMethods() : cls.getDeclaredMethods();
        MethodDescriptor[] methodDescriptorArr = null;
        if (methods != null) {
            if (methods.length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(methods.length);
            for (int i = 0; i < methods.length; i++) {
                if (Modifier.isPublic(methods[i].getModifiers())) {
                    arrayList.add(new MethodDescriptor(methods[i]));
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                methodDescriptorArr = (MethodDescriptor[]) arrayList.toArray(new MethodDescriptor[size]);
            }
        }
        return methodDescriptorArr;
    }

    private org.msgpack.template.builder.beans.PropertyDescriptor[] introspectProperties(java.lang.Class<?> r15) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r14 = this;
        r0 = r14.introspectMethods();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = 0;
        r4 = r3;
    L_0x000f:
        r5 = r0.length;
        if (r4 >= r5) goto L_0x002a;
    L_0x0012:
        r5 = r0[r4];
        r5 = r5.getMethod();
        r5 = r5.getModifiers();
        r5 = java.lang.reflect.Modifier.isStatic(r5);
        if (r5 != 0) goto L_0x0027;
    L_0x0022:
        r5 = r0[r4];
        r2.add(r5);
    L_0x0027:
        r4 = r4 + 1;
        goto L_0x000f;
    L_0x002a:
        r0 = r2.size();
        if (r0 <= 0) goto L_0x0039;
    L_0x0030:
        r0 = new org.msgpack.template.builder.beans.MethodDescriptor[r0];
        r0 = r2.toArray(r0);
        r0 = (org.msgpack.template.builder.beans.MethodDescriptor[]) r0;
        goto L_0x003a;
    L_0x0039:
        r0 = r1;
    L_0x003a:
        if (r0 != 0) goto L_0x003d;
    L_0x003c:
        return r1;
    L_0x003d:
        r1 = new java.util.HashMap;
        r2 = r0.length;
        r1.<init>(r2);
        r2 = r3;
    L_0x0044:
        r4 = r0.length;
        if (r2 >= r4) goto L_0x005c;
    L_0x0047:
        r4 = r0[r2];
        r4 = r4.getMethod();
        introspectGet(r4, r1);
        r4 = r0[r2];
        r4 = r4.getMethod();
        introspectSet(r4, r1);
        r2 = r2 + 1;
        goto L_0x0044;
    L_0x005c:
        r14.fixGetSet(r1);
        r0 = 1;
        r2 = r14.introspectMethods(r0);
        if (r15 == 0) goto L_0x008c;
    L_0x0066:
        r15 = r14.introspectMethods(r0, r15);
        if (r15 == 0) goto L_0x008c;
    L_0x006c:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = r2.length;
        r6 = r3;
    L_0x0073:
        if (r6 >= r5) goto L_0x0083;
    L_0x0075:
        r7 = r2[r6];
        r8 = r14.isInSuper(r7, r15);
        if (r8 != 0) goto L_0x0080;
    L_0x007d:
        r4.add(r7);
    L_0x0080:
        r6 = r6 + 1;
        goto L_0x0073;
    L_0x0083:
        r15 = new org.msgpack.template.builder.beans.MethodDescriptor[r3];
        r15 = r4.toArray(r15);
        r2 = r15;
        r2 = (org.msgpack.template.builder.beans.MethodDescriptor[]) r2;
    L_0x008c:
        r15 = r3;
    L_0x008d:
        r4 = r2.length;
        if (r15 >= r4) goto L_0x009c;
    L_0x0090:
        r4 = r2[r15];
        r4 = r4.getMethod();
        r14.introspectPropertyListener(r4);
        r15 = r15 + 1;
        goto L_0x008d;
    L_0x009c:
        r15 = new java.util.ArrayList;
        r15.<init>();
        r1 = r1.entrySet();
        r1 = r1.iterator();
    L_0x00a9:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x013a;
    L_0x00af:
        r2 = r1.next();
        r2 = (java.util.Map.Entry) r2;
        r4 = r2.getKey();
        r4 = (java.lang.String) r4;
        r2 = r2.getValue();
        r2 = (java.util.HashMap) r2;
        if (r2 == 0) goto L_0x00a9;
    L_0x00c3:
        r5 = "normal";
        r5 = r2.get(r5);
        r5 = (java.lang.String) r5;
        r6 = "indexed";
        r6 = r2.get(r6);
        r6 = (java.lang.String) r6;
        if (r5 != 0) goto L_0x00d7;
    L_0x00d5:
        if (r6 == 0) goto L_0x00a9;
    L_0x00d7:
        r5 = "normalget";
        r5 = r2.get(r5);
        r7 = r5;
        r7 = (java.lang.reflect.Method) r7;
        r5 = "normalset";
        r5 = r2.get(r5);
        r8 = r5;
        r8 = (java.lang.reflect.Method) r8;
        r5 = "indexedget";
        r5 = r2.get(r5);
        r11 = r5;
        r11 = (java.lang.reflect.Method) r11;
        r5 = "indexedset";
        r5 = r2.get(r5);
        r12 = r5;
        r12 = (java.lang.reflect.Method) r12;
        if (r6 != 0) goto L_0x0104;
    L_0x00fd:
        r5 = new org.msgpack.template.builder.beans.PropertyDescriptor;
        r5.<init>(r4, r7, r8);
        r13 = r5;
        goto L_0x0119;
    L_0x0104:
        r13 = new org.msgpack.template.builder.beans.IndexedPropertyDescriptor;	 Catch:{ IntrospectionException -> 0x010e }
        r5 = r13;	 Catch:{ IntrospectionException -> 0x010e }
        r6 = r4;	 Catch:{ IntrospectionException -> 0x010e }
        r9 = r11;	 Catch:{ IntrospectionException -> 0x010e }
        r10 = r12;	 Catch:{ IntrospectionException -> 0x010e }
        r5.<init>(r6, r7, r8, r9, r10);	 Catch:{ IntrospectionException -> 0x010e }
        goto L_0x0119;
    L_0x010e:
        r13 = new org.msgpack.template.builder.beans.IndexedPropertyDescriptor;
        r7 = 0;
        r8 = 0;
        r5 = r13;
        r6 = r4;
        r9 = r11;
        r10 = r12;
        r5.<init>(r6, r7, r8, r9, r10);
    L_0x0119:
        r4 = r14.canAddPropertyChangeListener;
        if (r4 == 0) goto L_0x0125;
    L_0x011d:
        r4 = r14.canRemovePropertyChangeListener;
        if (r4 == 0) goto L_0x0125;
    L_0x0121:
        r13.setBound(r0);
        goto L_0x0128;
    L_0x0125:
        r13.setBound(r3);
    L_0x0128:
        r4 = "isConstrained";
        r2 = r2.get(r4);
        r4 = java.lang.Boolean.TRUE;
        if (r2 != r4) goto L_0x0135;
    L_0x0132:
        r13.setConstrained(r0);
    L_0x0135:
        r15.add(r13);
        goto L_0x00a9;
    L_0x013a:
        r0 = r15.size();
        r0 = new org.msgpack.template.builder.beans.PropertyDescriptor[r0];
        r15.toArray(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.StandardBeanInfo.introspectProperties(java.lang.Class):org.msgpack.template.builder.beans.PropertyDescriptor[]");
    }

    private void introspectPropertyListener(Method method) {
        String name = method.getName();
        Class[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 1) {
            if (name.equals("addPropertyChangeListener") && parameterTypes[0].equals(PropertyChangeListener.class)) {
                this.canAddPropertyChangeListener = true;
            }
            if (name.equals("removePropertyChangeListener") && parameterTypes[0].equals(PropertyChangeListener.class)) {
                this.canRemovePropertyChangeListener = true;
            }
        }
    }

    private static void introspectSet(Method method, HashMap<String, HashMap> hashMap) {
        String name = method.getName();
        if (name != null && method.getReturnType() == Void.TYPE && name != null && name.startsWith("set")) {
            name = Introspector.decapitalize(name.substring(3));
            if (isValidProperty(name)) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 0 && parameterTypes.length <= 2) {
                    int i = 0;
                    if (parameterTypes.length != 2 || parameterTypes[0] == Integer.TYPE) {
                        HashMap hashMap2 = (HashMap) hashMap.get(name);
                        if (hashMap2 == null) {
                            hashMap2 = new HashMap();
                            hashMap.put(name, hashMap2);
                        }
                        ArrayList arrayList = (ArrayList) hashMap2.get(STR_SETTERS);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            hashMap2.put(STR_SETTERS, arrayList);
                        }
                        Class[] exceptionTypes = method.getExceptionTypes();
                        int length = exceptionTypes.length;
                        while (i < length) {
                            if (exceptionTypes[i].equals(PropertyVetoException.class)) {
                                hashMap2.put(STR_IS_CONSTRAINED, Boolean.TRUE);
                            }
                            i++;
                        }
                        arrayList.add(method);
                    }
                }
            }
        }
    }

    private boolean isInSuper(MethodDescriptor methodDescriptor, MethodDescriptor[] methodDescriptorArr) {
        for (MethodDescriptor method : methodDescriptorArr) {
            if (methodDescriptor.getMethod().equals(method.getMethod())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidProperty(String str) {
        return (str == null || str.length() == 0) ? false : true;
    }

    private static void mergeAttributes(PropertyDescriptor propertyDescriptor, PropertyDescriptor propertyDescriptor2) {
        propertyDescriptor.hidden |= propertyDescriptor2.hidden;
        propertyDescriptor.expert |= propertyDescriptor2.expert;
        propertyDescriptor.preferred |= propertyDescriptor2.preferred;
        propertyDescriptor.bound |= propertyDescriptor2.bound;
        propertyDescriptor.constrained |= propertyDescriptor2.constrained;
        propertyDescriptor.name = propertyDescriptor2.name;
        if (propertyDescriptor.shortDescription == null && propertyDescriptor2.shortDescription != null) {
            propertyDescriptor.shortDescription = propertyDescriptor2.shortDescription;
        }
        if (propertyDescriptor.displayName == null && propertyDescriptor2.displayName != null) {
            propertyDescriptor.displayName = propertyDescriptor2.displayName;
        }
    }

    private EventSetDescriptor[] mergeEvents(EventSetDescriptor[] eventSetDescriptorArr, int i) {
        EventSetDescriptor eventSetDescriptor;
        String str;
        int i2;
        String name;
        EventSetDescriptor eventSetDescriptor2;
        HashMap internalAsMap = internalAsMap(this.events);
        if (this.defaultEventIndex >= 0 && this.defaultEventIndex < this.events.length) {
            eventSetDescriptor = this.events[this.defaultEventIndex];
        } else if (i < 0 || i >= eventSetDescriptorArr.length) {
            str = null;
            i2 = 0;
            for (EventSetDescriptor eventSetDescriptor3 : eventSetDescriptorArr) {
                name = eventSetDescriptor3.getName();
                eventSetDescriptor2 = (EventSetDescriptor) internalAsMap.get(name);
                if (eventSetDescriptor2 != null) {
                    internalAsMap.put(name, eventSetDescriptor3);
                } else {
                    eventSetDescriptor2.merge(eventSetDescriptor3);
                }
            }
            eventSetDescriptorArr = new EventSetDescriptor[internalAsMap.size()];
            internalAsMap.values().toArray(eventSetDescriptorArr);
            if (!(str == null || this.explicitEvents)) {
                while (i2 < eventSetDescriptorArr.length) {
                    if (str.equals(eventSetDescriptorArr[i2].getName())) {
                        i2++;
                    } else {
                        this.defaultEventIndex = i2;
                        return eventSetDescriptorArr;
                    }
                }
            }
            return eventSetDescriptorArr;
        } else {
            eventSetDescriptor = eventSetDescriptorArr[i];
        }
        str = eventSetDescriptor.getName();
        i2 = 0;
        for (EventSetDescriptor eventSetDescriptor32 : eventSetDescriptorArr) {
            name = eventSetDescriptor32.getName();
            eventSetDescriptor2 = (EventSetDescriptor) internalAsMap.get(name);
            if (eventSetDescriptor2 != null) {
                eventSetDescriptor2.merge(eventSetDescriptor32);
            } else {
                internalAsMap.put(name, eventSetDescriptor32);
            }
        }
        eventSetDescriptorArr = new EventSetDescriptor[internalAsMap.size()];
        internalAsMap.values().toArray(eventSetDescriptorArr);
        while (i2 < eventSetDescriptorArr.length) {
            if (str.equals(eventSetDescriptorArr[i2].getName())) {
                i2++;
            } else {
                this.defaultEventIndex = i2;
                return eventSetDescriptorArr;
            }
        }
        return eventSetDescriptorArr;
    }

    private MethodDescriptor[] mergeMethods(MethodDescriptor[] methodDescriptorArr) {
        HashMap internalAsMap = internalAsMap(this.methods);
        for (MethodDescriptor methodDescriptor : methodDescriptorArr) {
            String qualifiedName = getQualifiedName(methodDescriptor.getMethod());
            MethodDescriptor methodDescriptor2 = (MethodDescriptor) internalAsMap.get(qualifiedName);
            if (methodDescriptor2 == null) {
                internalAsMap.put(qualifiedName, methodDescriptor);
            } else {
                methodDescriptor2.merge(methodDescriptor);
            }
        }
        methodDescriptorArr = new MethodDescriptor[internalAsMap.size()];
        internalAsMap.values().toArray(methodDescriptorArr);
        return methodDescriptorArr;
    }

    private org.msgpack.template.builder.beans.PropertyDescriptor[] mergeProps(org.msgpack.template.builder.beans.PropertyDescriptor[] r18, int r19) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r0.properties;
        r3 = internalAsMap(r3);
        r4 = r0.defaultPropertyIndex;
        if (r4 < 0) goto L_0x0022;
    L_0x0010:
        r4 = r0.defaultPropertyIndex;
        r6 = r0.properties;
        r6 = r6.length;
        if (r4 >= r6) goto L_0x0022;
    L_0x0017:
        r2 = r0.properties;
        r4 = r0.defaultPropertyIndex;
        r2 = r2[r4];
    L_0x001d:
        r2 = r2.getName();
        goto L_0x002b;
    L_0x0022:
        if (r2 < 0) goto L_0x002a;
    L_0x0024:
        r4 = r1.length;
        if (r2 >= r4) goto L_0x002a;
    L_0x0027:
        r2 = r1[r2];
        goto L_0x001d;
    L_0x002a:
        r2 = 0;
    L_0x002b:
        r6 = 0;
    L_0x002c:
        r7 = r1.length;
        if (r6 >= r7) goto L_0x0279;
    L_0x002f:
        r7 = r1[r6];
        r8 = r7.getName();
        r9 = r3.containsKey(r8);
        if (r9 != 0) goto L_0x0043;
    L_0x003b:
        r3.put(r8, r7);
        r16 = r2;
        r15 = 0;
        goto L_0x0271;
    L_0x0043:
        r9 = r3.get(r8);
        r10 = r9;
        r10 = (org.msgpack.template.builder.beans.PropertyDescriptor) r10;
        r11 = r10.getReadMethod();
        r12 = r10.getWriteMethod();
        r13 = r7.getReadMethod();
        r14 = r7.getWriteMethod();
        r15 = r7.getPropertyType();
        r5 = r10.getPropertyType();
        r4 = r9 instanceof org.msgpack.template.builder.beans.IndexedPropertyDescriptor;
        if (r4 == 0) goto L_0x006e;
    L_0x0066:
        r4 = r9;
        r4 = (org.msgpack.template.builder.beans.IndexedPropertyDescriptor) r4;
        r4 = r4.getIndexedPropertyType();
        goto L_0x006f;
    L_0x006e:
        r4 = 0;
    L_0x006f:
        r1 = r7 instanceof org.msgpack.template.builder.beans.IndexedPropertyDescriptor;
        if (r1 == 0) goto L_0x007d;
    L_0x0073:
        r1 = r7;
        r1 = (org.msgpack.template.builder.beans.IndexedPropertyDescriptor) r1;
        r1 = r1.getIndexedPropertyType();
        r16 = r2;
        goto L_0x0080;
    L_0x007d:
        r16 = r2;
        r1 = 0;
    L_0x0080:
        r2 = 1;
        if (r1 != 0) goto L_0x016f;
    L_0x0083:
        if (r4 != 0) goto L_0x010f;
    L_0x0085:
        if (r5 == 0) goto L_0x00d0;
    L_0x0087:
        if (r15 == 0) goto L_0x00d0;
    L_0x0089:
        r1 = r5.getName();
        if (r1 == 0) goto L_0x00d0;
    L_0x008f:
        r1 = r5.getName();
        r2 = r15.getName();
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00d0;
    L_0x009d:
        if (r13 == 0) goto L_0x00aa;
    L_0x009f:
        if (r11 == 0) goto L_0x00a7;
    L_0x00a1:
        r1 = r13.equals(r11);
        if (r1 == 0) goto L_0x00aa;
    L_0x00a7:
        r10.setReadMethod(r13);
    L_0x00aa:
        if (r14 == 0) goto L_0x00b7;
    L_0x00ac:
        if (r12 == 0) goto L_0x00b4;
    L_0x00ae:
        r1 = r14.equals(r12);
        if (r1 == 0) goto L_0x00b7;
    L_0x00b4:
        r10.setWriteMethod(r14);
    L_0x00b7:
        r1 = java.lang.Boolean.TYPE;
        if (r5 != r1) goto L_0x0168;
    L_0x00bb:
        if (r11 == 0) goto L_0x0168;
    L_0x00bd:
        if (r13 == 0) goto L_0x0168;
    L_0x00bf:
        r1 = r13.getName();
        r2 = "is";
        r1 = r1.startsWith(r2);
        if (r1 == 0) goto L_0x0168;
    L_0x00cb:
        r10.setReadMethod(r13);
        goto L_0x0168;
    L_0x00d0:
        if (r11 == 0) goto L_0x00d4;
    L_0x00d2:
        if (r12 != 0) goto L_0x0168;
    L_0x00d4:
        if (r13 == 0) goto L_0x0168;
    L_0x00d6:
        r1 = new org.msgpack.template.builder.beans.PropertyDescriptor;
        r1.<init>(r8, r13, r14);
        if (r11 == 0) goto L_0x0169;
    L_0x00dd:
        r2 = r11.getName();
        r4 = r17.introspectMethods();
        r5 = r4.length;
        r9 = 0;
    L_0x00e7:
        if (r9 >= r5) goto L_0x0169;
    L_0x00e9:
        r12 = r4[r9];
        r12 = r12.getMethod();
        if (r12 == r11) goto L_0x010c;
    L_0x00f1:
        r13 = r12.getName();
        r13 = r2.equals(r13);
        if (r13 == 0) goto L_0x010c;
    L_0x00fb:
        r13 = r12.getParameterTypes();
        r13 = r13.length;
        if (r13 != 0) goto L_0x010c;
    L_0x0102:
        r13 = r12.getReturnType();
        if (r13 != r15) goto L_0x010c;
    L_0x0108:
        r1.setReadMethod(r12);
        goto L_0x0169;
    L_0x010c:
        r9 = r9 + 1;
        goto L_0x00e7;
    L_0x010f:
        if (r15 == 0) goto L_0x0137;
    L_0x0111:
        r1 = r15.isArray();
        if (r1 == 0) goto L_0x0137;
    L_0x0117:
        r1 = r15.getComponentType();
        r1 = r1.getName();
        r5 = r4.getName();
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0137;
    L_0x0129:
        if (r11 != 0) goto L_0x0130;
    L_0x012b:
        if (r13 == 0) goto L_0x0130;
    L_0x012d:
        r10.setReadMethod(r13);
    L_0x0130:
        if (r12 != 0) goto L_0x0137;
    L_0x0132:
        if (r14 == 0) goto L_0x0137;
    L_0x0134:
        r10.setWriteMethod(r14);
    L_0x0137:
        r1 = java.lang.Boolean.TYPE;
        if (r4 != r1) goto L_0x0168;
    L_0x013b:
        r1 = java.lang.Boolean.TYPE;
        if (r15 != r1) goto L_0x0168;
    L_0x013f:
        r1 = r10;
        r1 = (org.msgpack.template.builder.beans.IndexedPropertyDescriptor) r1;
        r1 = r1.getIndexedWriteMethod();
        if (r11 != 0) goto L_0x0168;
    L_0x0148:
        if (r12 != 0) goto L_0x0168;
    L_0x014a:
        if (r1 == 0) goto L_0x0168;
    L_0x014c:
        if (r13 == 0) goto L_0x0168;
    L_0x014e:
        r4 = r0.beanClass;	 Catch:{ Exception -> 0x0160 }
        r1 = r1.getName();	 Catch:{ Exception -> 0x0160 }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0160 }
        r5 = java.lang.Boolean.TYPE;	 Catch:{ Exception -> 0x0160 }
        r9 = 0;	 Catch:{ Exception -> 0x0160 }
        r2[r9] = r5;	 Catch:{ Exception -> 0x0160 }
        r1 = r4.getDeclaredMethod(r1, r2);	 Catch:{ Exception -> 0x0160 }
        r12 = r1;
    L_0x0160:
        if (r12 == 0) goto L_0x0168;
    L_0x0162:
        r1 = new org.msgpack.template.builder.beans.PropertyDescriptor;
        r1.<init>(r8, r13, r12);
        goto L_0x0169;
    L_0x0168:
        r1 = r10;
    L_0x0169:
        r3.put(r8, r1);
    L_0x016c:
        r15 = 0;
        goto L_0x026e;
    L_0x016f:
        if (r4 != 0) goto L_0x0223;
    L_0x0171:
        if (r5 == 0) goto L_0x0199;
    L_0x0173:
        r4 = r5.isArray();
        if (r4 == 0) goto L_0x0199;
    L_0x0179:
        r4 = r5.getComponentType();
        r4 = r4.getName();
        r1 = r1.getName();
        r1 = r4.equals(r1);
        if (r1 == 0) goto L_0x0199;
    L_0x018b:
        if (r11 == 0) goto L_0x0190;
    L_0x018d:
        r7.setReadMethod(r11);
    L_0x0190:
        if (r12 == 0) goto L_0x0195;
    L_0x0192:
        r7.setWriteMethod(r12);
    L_0x0195:
        r3.put(r8, r7);
        goto L_0x016c;
    L_0x0199:
        if (r11 == 0) goto L_0x01a1;
    L_0x019b:
        if (r12 != 0) goto L_0x019e;
    L_0x019d:
        goto L_0x01a1;
    L_0x019e:
        r15 = 0;
        goto L_0x021f;
    L_0x01a1:
        r1 = r0.beanClass;
        r1 = r1.getSuperclass();
        r4 = r0.capitalize(r8);
        if (r11 != 0) goto L_0x01ee;
    L_0x01ad:
        r2 = java.lang.Boolean.TYPE;
        if (r5 != r2) goto L_0x01c7;
    L_0x01b1:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01d7 }
        r9 = "is";	 Catch:{ Exception -> 0x01d7 }
        r2.<init>(r9);	 Catch:{ Exception -> 0x01d7 }
        r2.append(r4);	 Catch:{ Exception -> 0x01d7 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x01d7 }
        r4 = 0;	 Catch:{ Exception -> 0x01d7 }
    L_0x01c0:
        r9 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x01d7 }
        r1 = r1.getDeclaredMethod(r2, r9);	 Catch:{ Exception -> 0x01d7 }
        goto L_0x01d8;	 Catch:{ Exception -> 0x01d7 }
    L_0x01c7:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01d7 }
        r9 = "get";	 Catch:{ Exception -> 0x01d7 }
        r2.<init>(r9);	 Catch:{ Exception -> 0x01d7 }
        r2.append(r4);	 Catch:{ Exception -> 0x01d7 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x01d7 }
        r4 = 0;
        goto L_0x01c0;
    L_0x01d7:
        r1 = 0;
    L_0x01d8:
        if (r1 == 0) goto L_0x019e;
    L_0x01da:
        r2 = r1.getModifiers();
        r2 = java.lang.reflect.Modifier.isStatic(r2);
        if (r2 != 0) goto L_0x019e;
    L_0x01e4:
        r2 = r1.getReturnType();
        if (r2 != r5) goto L_0x019e;
    L_0x01ea:
        r10.setReadMethod(r1);
        goto L_0x019e;
    L_0x01ee:
        r9 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0206 }
        r11 = "set";	 Catch:{ Exception -> 0x0206 }
        r9.<init>(r11);	 Catch:{ Exception -> 0x0206 }
        r9.append(r4);	 Catch:{ Exception -> 0x0206 }
        r4 = r9.toString();	 Catch:{ Exception -> 0x0206 }
        r2 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0206 }
        r15 = 0;
        r2[r15] = r5;	 Catch:{ Exception -> 0x0207 }
        r5 = r1.getDeclaredMethod(r4, r2);	 Catch:{ Exception -> 0x0207 }
        goto L_0x0208;
    L_0x0206:
        r15 = 0;
    L_0x0207:
        r5 = 0;
    L_0x0208:
        if (r5 == 0) goto L_0x021f;
    L_0x020a:
        r1 = r5.getModifiers();
        r1 = java.lang.reflect.Modifier.isStatic(r1);
        if (r1 != 0) goto L_0x021f;
    L_0x0214:
        r1 = r5.getReturnType();
        r2 = java.lang.Void.TYPE;
        if (r1 != r2) goto L_0x021f;
    L_0x021c:
        r10.setWriteMethod(r5);
    L_0x021f:
        r3.put(r8, r10);
        goto L_0x026e;
    L_0x0223:
        r15 = 0;
        r2 = r4.getName();
        r1 = r1.getName();
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x026e;
    L_0x0232:
        r9 = (org.msgpack.template.builder.beans.IndexedPropertyDescriptor) r9;
        if (r11 != 0) goto L_0x023b;
    L_0x0236:
        if (r13 == 0) goto L_0x023b;
    L_0x0238:
        r9.setReadMethod(r13);
    L_0x023b:
        if (r12 != 0) goto L_0x0242;
    L_0x023d:
        if (r14 == 0) goto L_0x0242;
    L_0x023f:
        r9.setWriteMethod(r14);
    L_0x0242:
        r1 = r7;
        r1 = (org.msgpack.template.builder.beans.IndexedPropertyDescriptor) r1;
        r2 = r9.getIndexedReadMethod();
        if (r2 != 0) goto L_0x0258;
    L_0x024b:
        r2 = r1.getIndexedReadMethod();
        if (r2 == 0) goto L_0x0258;
    L_0x0251:
        r2 = r1.getIndexedReadMethod();
        r9.setIndexedReadMethod(r2);
    L_0x0258:
        r2 = r9.getIndexedWriteMethod();
        if (r2 != 0) goto L_0x026b;
    L_0x025e:
        r2 = r1.getIndexedWriteMethod();
        if (r2 == 0) goto L_0x026b;
    L_0x0264:
        r1 = r1.getIndexedWriteMethod();
        r9.setIndexedWriteMethod(r1);
    L_0x026b:
        r3.put(r8, r9);
    L_0x026e:
        mergeAttributes(r10, r7);
    L_0x0271:
        r6 = r6 + 1;
        r2 = r16;
        r1 = r18;
        goto L_0x002c;
    L_0x0279:
        r16 = r2;
        r15 = 0;
        r1 = r3.size();
        r1 = new org.msgpack.template.builder.beans.PropertyDescriptor[r1];
        r2 = r3.values();
        r2.toArray(r1);
        if (r16 == 0) goto L_0x02a8;
    L_0x028b:
        r2 = r0.explicitProperties;
        if (r2 != 0) goto L_0x02a8;
    L_0x028f:
        r2 = r1.length;
        if (r15 >= r2) goto L_0x02a8;
    L_0x0292:
        r2 = r1[r15];
        r2 = r2.getName();
        r5 = r16;
        r2 = r5.equals(r2);
        if (r2 == 0) goto L_0x02a3;
    L_0x02a0:
        r0.defaultPropertyIndex = r15;
        return r1;
    L_0x02a3:
        r15 = r15 + 1;
        r16 = r5;
        goto L_0x028f;
    L_0x02a8:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.StandardBeanInfo.mergeProps(org.msgpack.template.builder.beans.PropertyDescriptor[], int):org.msgpack.template.builder.beans.PropertyDescriptor[]");
    }

    public BeanInfo[] getAdditionalBeanInfo() {
        return null;
    }

    public BeanDescriptor getBeanDescriptor() {
        if (this.beanDescriptor == null) {
            if (this.explicitBeanInfo != null) {
                this.beanDescriptor = this.explicitBeanInfo.getBeanDescriptor();
            }
            if (this.beanDescriptor == null) {
                this.beanDescriptor = new BeanDescriptor(this.beanClass);
            }
        }
        return this.beanDescriptor;
    }

    public int getDefaultEventIndex() {
        return this.defaultEventIndex;
    }

    public int getDefaultPropertyIndex() {
        return this.defaultPropertyIndex;
    }

    public EventSetDescriptor[] getEventSetDescriptors() {
        return this.events;
    }

    public MethodDescriptor[] getMethodDescriptors() {
        return this.methods;
    }

    public PropertyDescriptor[] getPropertyDescriptors() {
        return this.properties;
    }

    void init() {
        int i = 0;
        if (this.events == null) {
            this.events = new EventSetDescriptor[0];
        }
        if (this.properties == null) {
            this.properties = new PropertyDescriptor[0];
        }
        if (this.properties != null) {
            String name = this.defaultPropertyIndex != -1 ? this.properties[this.defaultPropertyIndex].getName() : null;
            Arrays.sort(this.properties, comparator);
            if (name != null) {
                while (i < this.properties.length) {
                    if (name.equals(this.properties[i].getName())) {
                        this.defaultPropertyIndex = i;
                        return;
                    }
                    i++;
                }
            }
        }
    }

    void mergeBeanInfo(BeanInfo beanInfo, boolean z) {
        if (z || !this.explicitProperties) {
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            if (propertyDescriptors != null) {
                if (getPropertyDescriptors() != null) {
                    this.properties = mergeProps(propertyDescriptors, beanInfo.getDefaultPropertyIndex());
                } else {
                    this.properties = propertyDescriptors;
                    this.defaultPropertyIndex = beanInfo.getDefaultPropertyIndex();
                }
            }
        }
        if (z || !this.explicitMethods) {
            MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
            if (methodDescriptors != null) {
                if (this.methods != null) {
                    methodDescriptors = mergeMethods(methodDescriptors);
                }
                this.methods = methodDescriptors;
            }
        }
        if (z || !this.explicitEvents) {
            EventSetDescriptor[] eventSetDescriptors = beanInfo.getEventSetDescriptors();
            if (eventSetDescriptors != null) {
                if (this.events != null) {
                    this.events = mergeEvents(eventSetDescriptors, beanInfo.getDefaultEventIndex());
                } else {
                    this.events = eventSetDescriptors;
                    this.defaultEventIndex = beanInfo.getDefaultEventIndex();
                }
            }
        }
    }
}
