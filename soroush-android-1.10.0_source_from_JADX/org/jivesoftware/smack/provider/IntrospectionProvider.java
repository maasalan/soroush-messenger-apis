package org.jivesoftware.smack.provider;

import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.util.ParserUtils;
import org.xmlpull.v1.XmlPullParser;

public class IntrospectionProvider {

    public static abstract class IQIntrospectionProvider<I extends IQ> extends IQProvider<I> {
        private final Class<I> elementClass;

        protected IQIntrospectionProvider(Class<I> cls) {
            this.elementClass = cls;
        }

        public I parse(XmlPullParser xmlPullParser, int i) {
            try {
                return (IQ) IntrospectionProvider.parseWithIntrospection(this.elementClass, xmlPullParser, i);
            } catch (Throwable e) {
                throw new SmackException(e);
            }
        }
    }

    public static abstract class PacketExtensionIntrospectionProvider<PE extends ExtensionElement> extends ExtensionElementProvider<PE> {
        private final Class<PE> elementClass;

        protected PacketExtensionIntrospectionProvider(Class<PE> cls) {
            this.elementClass = cls;
        }

        public PE parse(XmlPullParser xmlPullParser, int i) {
            try {
                return (ExtensionElement) IntrospectionProvider.parseWithIntrospection(this.elementClass, xmlPullParser, i);
            } catch (Throwable e) {
                throw new SmackException(e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object decode(java.lang.Class<?> r1, java.lang.String r2) {
        /*
        r1 = r1.getName();
        r0 = r1.hashCode();
        switch(r0) {
            case -1325958191: goto L_0x005d;
            case -530663260: goto L_0x0052;
            case 104431: goto L_0x0048;
            case 3039496: goto L_0x003e;
            case 3327612: goto L_0x0034;
            case 64711720: goto L_0x002a;
            case 97526364: goto L_0x0020;
            case 109413500: goto L_0x0016;
            case 1195259493: goto L_0x000c;
            default: goto L_0x000b;
        };
    L_0x000b:
        goto L_0x0067;
    L_0x000c:
        r0 = "java.lang.String";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0067;
    L_0x0014:
        r1 = 0;
        goto L_0x0068;
    L_0x0016:
        r0 = "short";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0067;
    L_0x001e:
        r1 = 6;
        goto L_0x0068;
    L_0x0020:
        r0 = "float";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0067;
    L_0x0028:
        r1 = 4;
        goto L_0x0068;
    L_0x002a:
        r0 = "boolean";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0067;
    L_0x0032:
        r1 = 1;
        goto L_0x0068;
    L_0x0034:
        r0 = "long";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0067;
    L_0x003c:
        r1 = 3;
        goto L_0x0068;
    L_0x003e:
        r0 = "byte";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0067;
    L_0x0046:
        r1 = 7;
        goto L_0x0068;
    L_0x0048:
        r0 = "int";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0067;
    L_0x0050:
        r1 = 2;
        goto L_0x0068;
    L_0x0052:
        r0 = "java.lang.Class";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0067;
    L_0x005a:
        r1 = 8;
        goto L_0x0068;
    L_0x005d:
        r0 = "double";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0067;
    L_0x0065:
        r1 = 5;
        goto L_0x0068;
    L_0x0067:
        r1 = -1;
    L_0x0068:
        switch(r1) {
            case 0: goto L_0x0095;
            case 1: goto L_0x0090;
            case 2: goto L_0x008b;
            case 3: goto L_0x0086;
            case 4: goto L_0x0081;
            case 5: goto L_0x007c;
            case 6: goto L_0x0077;
            case 7: goto L_0x0072;
            case 8: goto L_0x006d;
            default: goto L_0x006b;
        };
    L_0x006b:
        r1 = 0;
        return r1;
    L_0x006d:
        r1 = java.lang.Class.forName(r2);
        return r1;
    L_0x0072:
        r1 = java.lang.Byte.valueOf(r2);
        return r1;
    L_0x0077:
        r1 = java.lang.Short.valueOf(r2);
        return r1;
    L_0x007c:
        r1 = java.lang.Double.valueOf(r2);
        return r1;
    L_0x0081:
        r1 = java.lang.Float.valueOf(r2);
        return r1;
    L_0x0086:
        r1 = java.lang.Long.valueOf(r2);
        return r1;
    L_0x008b:
        r1 = java.lang.Integer.valueOf(r2);
        return r1;
    L_0x0090:
        r1 = java.lang.Boolean.valueOf(r2);
        return r1;
    L_0x0095:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.provider.IntrospectionProvider.decode(java.lang.Class, java.lang.String):java.lang.Object");
    }

    public static Object parseWithIntrospection(Class<?> cls, XmlPullParser xmlPullParser, int i) {
        ParserUtils.assertAtStartTag(xmlPullParser);
        Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    String nextText = xmlPullParser.nextText();
                    Class cls2 = newInstance.getClass();
                    StringBuilder stringBuilder = new StringBuilder("get");
                    stringBuilder.append(Character.toUpperCase(name.charAt(0)));
                    stringBuilder.append(name.substring(1));
                    Object decode = decode(cls2.getMethod(stringBuilder.toString(), new Class[0]).getReturnType(), nextText);
                    Class cls3 = newInstance.getClass();
                    StringBuilder stringBuilder2 = new StringBuilder("set");
                    stringBuilder2.append(Character.toUpperCase(name.charAt(0)));
                    stringBuilder2.append(name.substring(1));
                    cls3.getMethod(stringBuilder2.toString(), new Class[]{cls2}).invoke(newInstance, new Object[]{decode});
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    ParserUtils.assertAtEndTag(xmlPullParser);
                    return newInstance;
                default:
                    break;
            }
        }
    }
}
