package org.msgpack.template.builder.beans;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import javax.xml.parsers.SAXParserFactory;
import org.apache.b.a.a.a.a;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import org.xml.sax.Attributes;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLDecoder {
    private ClassLoader defaultClassLoader;
    private InputStream inputStream;
    private ExceptionListener listener;
    private Object owner;
    private int readObjIndex;
    private Stack<Elem> readObjs;
    private SAXHandler saxHandler;

    private static class Elem {
        Attributes attributes;
        boolean fromField;
        boolean fromIndex;
        boolean fromOwner;
        boolean fromProperty;
        String id;
        String idref;
        boolean isBasicType;
        boolean isClosed;
        boolean isExecuted;
        boolean isExpression;
        String methodName;
        Object result;
        Object target;

        private Elem() {
        }
    }

    private class SAXHandler extends DefaultHandler {
        HashMap<String, Object> idObjMap;
        boolean inJavaElem;

        private SAXHandler() {
            this.inJavaElem = false;
            this.idObjMap = new HashMap();
        }

        private String capitalize(String str) {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.setCharAt(0, Character.toUpperCase(stringBuilder.charAt(0)));
            return stringBuilder.toString();
        }

        private Class<?> classForName(String str) {
            if ("boolean".equals(str)) {
                return Boolean.TYPE;
            }
            if ("byte".equals(str)) {
                return Byte.TYPE;
            }
            if ("char".equals(str)) {
                return Character.TYPE;
            }
            if ("double".equals(str)) {
                return Double.TYPE;
            }
            if ("float".equals(str)) {
                return Float.TYPE;
            }
            if ("int".equals(str)) {
                return Integer.TYPE;
            }
            if ("long".equals(str)) {
                return Long.TYPE;
            }
            if ("short".equals(str)) {
                return Short.TYPE;
            }
            return Class.forName(str, true, XMLDecoder.this.defaultClassLoader == null ? Thread.currentThread().getContextClassLoader() : XMLDecoder.this.defaultClassLoader);
        }

        private Object execute(Elem elem) {
            if (elem.isExecuted) {
                return elem.result;
            }
            try {
                Object executeBasic = elem.idref != null ? this.idObjMap.get(elem.idref) : elem.isBasicType ? executeBasic(elem) : executeCommon(elem);
                elem.result = executeBasic;
            } catch (Exception e) {
                XMLDecoder.this.listener.exceptionThrown(e);
            }
            if (elem.id != null) {
                this.idObjMap.put(elem.id, elem.result);
            }
            elem.isExecuted = true;
            return elem.result;
        }

        private Object executeBasic(Elem elem) {
            String str = (String) elem.target;
            String str2 = elem.methodName;
            if ("null".equals(str)) {
                return null;
            }
            if ("string".equals(str)) {
                return str2 == null ? "" : str2;
            } else {
                if ("class".equals(str)) {
                    return classForName(str2);
                }
                if ("boolean".equals(str)) {
                    return Boolean.valueOf(str2);
                }
                if ("byte".equals(str)) {
                    return Byte.valueOf(str2);
                }
                if ("char".equals(str)) {
                    if (str2 == null && elem.attributes != null) {
                        str = elem.attributes.getValue(XHTMLText.CODE);
                        if (str != null) {
                            Character ch = new Character((char) Integer.valueOf(str.substring(1), 16).intValue());
                            elem.methodName = ch.toString();
                            return ch;
                        }
                    }
                    return Character.valueOf(str2.charAt(0));
                } else if ("double".equals(str)) {
                    return Double.valueOf(str2);
                } else {
                    if ("float".equals(str)) {
                        return Float.valueOf(str2);
                    }
                    if ("int".equals(str)) {
                        return Integer.valueOf(str2);
                    }
                    if ("long".equals(str)) {
                        return Long.valueOf(str2);
                    }
                    if ("short".equals(str)) {
                        return Short.valueOf(str2);
                    }
                    throw new Exception(a.a("custom.beans.71", str));
                }
            }
        }

        private java.lang.Object executeCommon(org.msgpack.template.builder.beans.XMLDecoder.Elem r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r0 = new java.util.ArrayList;
            r1 = 5;
            r0.<init>(r1);
        L_0x0006:
            r1 = org.msgpack.template.builder.beans.XMLDecoder.this;
            r1 = r1.readObjs;
            r1 = r1.peek();
            r2 = 0;
            if (r1 == r7) goto L_0x0025;
        L_0x0013:
            r1 = org.msgpack.template.builder.beans.XMLDecoder.this;
            r1 = r1.readObjs;
            r1 = r1.pop();
            r1 = (org.msgpack.template.builder.beans.XMLDecoder.Elem) r1;
            r1 = r1.result;
            r0.add(r2, r1);
            goto L_0x0006;
        L_0x0025:
            r1 = r7.methodName;
            r3 = r7.fromProperty;
            if (r3 == 0) goto L_0x0049;
        L_0x002b:
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = r0.size();
            if (r4 != 0) goto L_0x0039;
        L_0x0036:
            r4 = "get";
            goto L_0x003b;
        L_0x0039:
            r4 = "set";
        L_0x003b:
            r3.append(r4);
            r1 = r6.capitalize(r1);
            r3.append(r1);
            r1 = r3.toString();
        L_0x0049:
            r3 = r7.fromIndex;
            r4 = 1;
            if (r3 == 0) goto L_0x0060;
        L_0x004e:
            r1 = java.lang.Integer.valueOf(r1);
            r0.add(r2, r1);
            r1 = r0.size();
            if (r1 != r4) goto L_0x005e;
        L_0x005b:
            r1 = "get";
            goto L_0x0060;
        L_0x005e:
            r1 = "set";
        L_0x0060:
            r3 = r7.fromField;
            r5 = 0;
            if (r3 == 0) goto L_0x007d;
        L_0x0065:
            r7 = r7.target;
            r7 = (java.lang.Class) r7;
            r7 = r7.getField(r1);
            r0 = new org.msgpack.template.builder.beans.Expression;
            r1 = "get";
            r3 = new java.lang.Object[r4];
            r3[r2] = r5;
            r0.<init>(r7, r1, r3);
            r7 = r0.getValue();
            return r7;
        L_0x007d:
            r3 = r7.fromOwner;
            if (r3 == 0) goto L_0x0088;
        L_0x0081:
            r7 = org.msgpack.template.builder.beans.XMLDecoder.this;
            r7 = r7.owner;
            return r7;
        L_0x0088:
            r3 = r7.target;
            r4 = org.msgpack.template.builder.beans.XMLDecoder.this;
            r4 = r4.owner;
            if (r3 != r4) goto L_0x010b;
        L_0x0092:
            r7 = "getOwner";
            r7 = r7.equals(r1);
            if (r7 == 0) goto L_0x00a1;
        L_0x009a:
            r7 = org.msgpack.template.builder.beans.XMLDecoder.this;
            r7 = r7.owner;
            return r7;
        L_0x00a1:
            r7 = r0.size();
            r7 = new java.lang.Class[r7];
        L_0x00a7:
            r3 = r0.size();
            if (r2 >= r3) goto L_0x00be;
        L_0x00ad:
            r3 = r0.get(r2);
            if (r3 != 0) goto L_0x00b5;
        L_0x00b3:
            r3 = r5;
            goto L_0x00b9;
        L_0x00b5:
            r3 = r3.getClass();
        L_0x00b9:
            r7[r2] = r3;
            r2 = r2 + 1;
            goto L_0x00a7;
        L_0x00be:
            r2 = org.msgpack.template.builder.beans.XMLDecoder.this;	 Catch:{ NoSuchMethodException -> 0x00db }
            r2 = r2.owner;	 Catch:{ NoSuchMethodException -> 0x00db }
            r2 = r2.getClass();	 Catch:{ NoSuchMethodException -> 0x00db }
            r2 = r2.getMethod(r1, r7);	 Catch:{ NoSuchMethodException -> 0x00db }
            r3 = org.msgpack.template.builder.beans.XMLDecoder.this;	 Catch:{ NoSuchMethodException -> 0x00db }
            r3 = r3.owner;	 Catch:{ NoSuchMethodException -> 0x00db }
            r4 = r0.toArray();	 Catch:{ NoSuchMethodException -> 0x00db }
            r2 = r2.invoke(r3, r4);	 Catch:{ NoSuchMethodException -> 0x00db }
            return r2;
        L_0x00db:
            r2 = org.msgpack.template.builder.beans.XMLDecoder.this;
            r2 = r2.owner;
            r2 = r2 instanceof java.lang.Class;
            if (r2 == 0) goto L_0x00ee;
        L_0x00e5:
            r2 = org.msgpack.template.builder.beans.XMLDecoder.this;
            r2 = r2.owner;
            r2 = (java.lang.Class) r2;
            goto L_0x00f8;
        L_0x00ee:
            r2 = org.msgpack.template.builder.beans.XMLDecoder.this;
            r2 = r2.owner;
            r2 = r2.getClass();
        L_0x00f8:
            r7 = r6.findMethod(r2, r1, r7);
            r1 = org.msgpack.template.builder.beans.XMLDecoder.this;
            r1 = r1.owner;
            r0 = r0.toArray();
            r7 = r7.invoke(r1, r0);
            return r7;
        L_0x010b:
            r2 = new org.msgpack.template.builder.beans.Expression;
            r7 = r7.target;
            r0 = r0.toArray();
            r2.<init>(r7, r1, r0);
            r7 = r2.getValue();
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.beans.XMLDecoder.SAXHandler.executeCommon(org.msgpack.template.builder.beans.XMLDecoder$Elem):java.lang.Object");
        }

        private Method findMethod(Class<?> cls, String str, Class<?>[] clsArr) {
            int compare;
            SAXHandler sAXHandler;
            String str2 = str;
            Class<?>[] clsArr2 = clsArr;
            Method[] methods = cls.getMethods();
            ArrayList arrayList = new ArrayList();
            for (Method method : methods) {
                if (str2.equals(method.getName())) {
                    Class[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == clsArr2.length) {
                        Object obj = 1;
                        for (int i = 0; i < parameterTypes.length; i++) {
                            Object obj2 = clsArr2[i] == null ? 1 : null;
                            boolean isPrimitiveWrapper = isPrimitiveWrapper(clsArr2[i], parameterTypes[i]);
                            boolean isAssignableFrom = obj2 != null ? false : parameterTypes[i].isAssignableFrom(clsArr2[i]);
                            if (!(obj2 != null || isPrimitiveWrapper || isAssignableFrom)) {
                                obj = null;
                            }
                        }
                        sAXHandler = this;
                        if (obj != null) {
                            arrayList.add(method);
                        }
                    }
                }
                sAXHandler = this;
            }
            sAXHandler = this;
            int size = arrayList.size();
            if (size == 1) {
                return (Method) arrayList.get(0);
            }
            if (size == 0) {
                throw new NoSuchMethodException(a.a("custom.beans.41", str2));
            }
            MethodComparator methodComparator = new MethodComparator(str2, clsArr2);
            Method method2 = (Method) arrayList.get(0);
            arrayList.remove(0);
            Iterator it = arrayList.iterator();
            loop2:
            while (true) {
                int i2 = 1;
                while (it.hasNext()) {
                    Method method3 = (Method) it.next();
                    compare = methodComparator.compare(method2, method3);
                    if (compare > 0) {
                        method2 = method3;
                    } else if (compare == 0) {
                        i2++;
                    }
                }
                break loop2;
            }
            if (i2 <= 1) {
                return method2;
            }
            throw new NoSuchMethodException(a.a("custom.beans.62", str2));
        }

        private boolean isPrimitiveWrapper(Class<?> cls, Class<?> cls2) {
            return (cls2 == Boolean.TYPE && cls == Boolean.class) || ((cls2 == Byte.TYPE && cls == Byte.class) || ((cls2 == Character.TYPE && cls == Character.class) || ((cls2 == Short.TYPE && cls == Short.class) || ((cls2 == Integer.TYPE && cls == Integer.class) || ((cls2 == Long.TYPE && cls == Long.class) || ((cls2 == Float.TYPE && cls == Float.class) || (cls2 == Double.TYPE && cls == Double.class)))))));
        }

        private Elem latestUnclosedElem() {
            for (int size = XMLDecoder.this.readObjs.size() - 1; size >= 0; size--) {
                Elem elem = (Elem) XMLDecoder.this.readObjs.get(size);
                if (!elem.isClosed) {
                    return elem;
                }
            }
            return null;
        }

        private void obtainMethod(Elem elem, Attributes attributes) {
            elem.methodName = attributes.getValue("method");
            if (elem.methodName == null) {
                elem.methodName = attributes.getValue("property");
                if (elem.methodName != null) {
                    elem.fromProperty = true;
                    return;
                }
                elem.methodName = attributes.getValue("index");
                if (elem.methodName != null) {
                    elem.fromIndex = true;
                    return;
                }
                elem.methodName = attributes.getValue(FormField.ELEMENT);
                if (elem.methodName != null) {
                    elem.fromField = true;
                    return;
                }
                elem.methodName = attributes.getValue("owner");
                if (elem.methodName != null) {
                    elem.fromOwner = true;
                } else {
                    elem.methodName = "new";
                }
            }
        }

        private void obtainTarget(Elem elem, Attributes attributes) {
            String value = attributes.getValue("class");
            if (value != null) {
                try {
                    elem.target = classForName(value);
                    return;
                } catch (Exception e) {
                    XMLDecoder.this.listener.exceptionThrown(e);
                    return;
                }
            }
            Elem latestUnclosedElem = latestUnclosedElem();
            if (latestUnclosedElem == null) {
                elem.target = XMLDecoder.this.owner;
            } else {
                elem.target = execute(latestUnclosedElem);
            }
        }

        private void startArrayElem(Attributes attributes) {
            Elem elem = new Elem();
            elem.isExpression = true;
            elem.id = attributes.getValue(MessageCorrectExtension.ID_TAG);
            elem.attributes = attributes;
            try {
                Class classForName = classForName(attributes.getValue("class"));
                if (attributes.getValue("length") != null) {
                    elem.result = Array.newInstance(classForName, Integer.parseInt(attributes.getValue("length")));
                    elem.isExecuted = true;
                } else {
                    elem.target = classForName;
                    elem.methodName = "newArray";
                    elem.isExecuted = false;
                }
            } catch (Exception e) {
                XMLDecoder.this.listener.exceptionThrown(e);
            }
            XMLDecoder.this.readObjs.push(elem);
        }

        private void startBasicElem(String str, Attributes attributes) {
            Elem elem = new Elem();
            elem.isBasicType = true;
            elem.isExpression = true;
            elem.id = attributes.getValue(MessageCorrectExtension.ID_TAG);
            elem.idref = attributes.getValue("idref");
            elem.attributes = attributes;
            elem.target = str;
            XMLDecoder.this.readObjs.push(elem);
        }

        private void startObjectElem(Attributes attributes) {
            Elem elem = new Elem();
            elem.isExpression = true;
            elem.id = attributes.getValue(MessageCorrectExtension.ID_TAG);
            elem.idref = attributes.getValue("idref");
            elem.attributes = attributes;
            if (elem.idref == null) {
                obtainTarget(elem, attributes);
                obtainMethod(elem, attributes);
            }
            XMLDecoder.this.readObjs.push(elem);
        }

        private void startVoidElem(Attributes attributes) {
            Elem elem = new Elem();
            elem.id = attributes.getValue(MessageCorrectExtension.ID_TAG);
            elem.attributes = attributes;
            obtainTarget(elem, attributes);
            obtainMethod(elem, attributes);
            XMLDecoder.this.readObjs.push(elem);
        }

        public void characters(char[] cArr, int i, int i2) {
            if (this.inJavaElem && XMLDecoder.this.readObjs.size() > 0) {
                Elem elem = (Elem) XMLDecoder.this.readObjs.peek();
                if (elem.isBasicType) {
                    String str = new String(cArr, i, i2);
                    if (elem.methodName != null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(elem.methodName);
                        stringBuilder.append(str);
                        str = stringBuilder.toString();
                    }
                    elem.methodName = str;
                }
            }
        }

        public void endElement(String str, String str2, String str3) {
            if (!this.inJavaElem) {
                return;
            }
            if ("java".equals(str3)) {
                this.inJavaElem = false;
                return;
            }
            Elem latestUnclosedElem = latestUnclosedElem();
            if ("string".equals(latestUnclosedElem.target)) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int size = XMLDecoder.this.readObjs.size() - 1; size >= 0; size--) {
                    Elem elem = (Elem) XMLDecoder.this.readObjs.get(size);
                    if (latestUnclosedElem == elem) {
                        break;
                    }
                    if ("char".equals(elem.target)) {
                        stringBuilder.insert(0, elem.methodName);
                    }
                }
                if (latestUnclosedElem.methodName != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(latestUnclosedElem.methodName);
                    stringBuilder2.append(stringBuilder.toString());
                    str2 = stringBuilder2.toString();
                } else {
                    str2 = stringBuilder.toString();
                }
                latestUnclosedElem.methodName = str2;
            }
            execute(latestUnclosedElem);
            latestUnclosedElem.isClosed = true;
            do {
            } while (XMLDecoder.this.readObjs.pop() != latestUnclosedElem);
            if (latestUnclosedElem.isExpression) {
                XMLDecoder.this.readObjs.push(latestUnclosedElem);
            }
        }

        public void error(SAXParseException sAXParseException) {
            XMLDecoder.this.listener.exceptionThrown(sAXParseException);
        }

        public void fatalError(SAXParseException sAXParseException) {
            XMLDecoder.this.listener.exceptionThrown(sAXParseException);
        }

        public void startElement(String str, String str2, String str3, Attributes attributes) {
            if (this.inJavaElem) {
                if ("object".equals(str3)) {
                    startObjectElem(attributes);
                } else if ("array".equals(str3)) {
                    startArrayElem(attributes);
                } else if ("void".equals(str3)) {
                    startVoidElem(attributes);
                } else {
                    if ("boolean".equals(str3) || "byte".equals(str3) || "char".equals(str3) || "class".equals(str3) || "double".equals(str3) || "float".equals(str3) || "int".equals(str3) || "long".equals(str3) || "short".equals(str3) || "string".equals(str3) || "null".equals(str3)) {
                        startBasicElem(str3, attributes);
                    }
                }
            } else if ("java".equals(str3)) {
                this.inJavaElem = true;
            } else {
                XMLDecoder.this.listener.exceptionThrown(new Exception(a.a("custom.beans.72", str3)));
            }
        }

        public void warning(SAXParseException sAXParseException) {
            XMLDecoder.this.listener.exceptionThrown(sAXParseException);
        }
    }

    private static class DefaultExceptionListener implements ExceptionListener {
        private DefaultExceptionListener() {
        }

        public void exceptionThrown(Exception exception) {
            System.err.println(exception.getMessage());
            System.err.println("Continue...");
        }
    }

    public XMLDecoder(InputStream inputStream) {
        this(inputStream, null, null, null);
    }

    public XMLDecoder(InputStream inputStream, Object obj) {
        this(inputStream, obj, null, null);
    }

    public XMLDecoder(InputStream inputStream, Object obj, ExceptionListener exceptionListener) {
        this(inputStream, obj, exceptionListener, null);
    }

    public XMLDecoder(InputStream inputStream, Object obj, ExceptionListener exceptionListener, ClassLoader classLoader) {
        this.defaultClassLoader = null;
        this.readObjs = new Stack();
        this.readObjIndex = 0;
        this.saxHandler = null;
        this.inputStream = inputStream;
        this.owner = obj;
        if (exceptionListener == null) {
            exceptionListener = new DefaultExceptionListener();
        }
        this.listener = exceptionListener;
        this.defaultClassLoader = classLoader;
    }

    public void close() {
        if (this.inputStream != null) {
            try {
                this.inputStream.close();
            } catch (Exception e) {
                this.listener.exceptionThrown(e);
            }
        }
    }

    public ExceptionListener getExceptionListener() {
        return this.listener;
    }

    public Object getOwner() {
        return this.owner;
    }

    public Object readObject() {
        if (this.inputStream == null) {
            return null;
        }
        if (this.saxHandler == null) {
            this.saxHandler = new SAXHandler();
            try {
                SAXParserFactory.newInstance().newSAXParser().parse(this.inputStream, this.saxHandler);
            } catch (Exception e) {
                this.listener.exceptionThrown(e);
            }
        }
        if (this.readObjIndex >= this.readObjs.size()) {
            throw new ArrayIndexOutOfBoundsException(a.a("custom.beans.70"));
        }
        Elem elem = (Elem) this.readObjs.get(this.readObjIndex);
        if (elem.isClosed) {
            this.readObjIndex++;
            return elem.result;
        }
        throw new ArrayIndexOutOfBoundsException(a.a("custom.beans.70"));
    }

    public void setExceptionListener(ExceptionListener exceptionListener) {
        if (exceptionListener != null) {
            this.listener = exceptionListener;
        }
    }

    public void setOwner(Object obj) {
        this.owner = obj;
    }
}
