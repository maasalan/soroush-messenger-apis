package org.jivesoftware.smack.util;

import java.io.IOException;
import java.net.URI;
import java.util.Date;
import java.util.Locale;
import org.b.a.a.d;
import org.b.a.e;
import org.b.a.f;
import org.b.a.g;
import org.b.a.i;
import org.b.c.a;
import org.jivesoftware.smack.SmackException;
import org.xmlpull.v1.XmlPullParser;

public class ParserUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String JID = "jid";

    public static void assertAtEndTag(XmlPullParser xmlPullParser) {
    }

    public static void assertAtStartTag(XmlPullParser xmlPullParser) {
    }

    public static void assertAtStartTag(XmlPullParser xmlPullParser, String str) {
        assertAtStartTag(xmlPullParser);
    }

    public static void forwardToEndTagOfDepth(XmlPullParser xmlPullParser, int i) {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3) {
                if (xmlPullParser.getDepth() == i) {
                    return;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public static e getBareJidAttribute(XmlPullParser xmlPullParser) {
        return getBareJidAttribute(xmlPullParser, JID);
    }

    public static e getBareJidAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        return attributeValue == null ? null : d.c(attributeValue);
    }

    public static Boolean getBooleanAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        if (attributeValue == null) {
            return null;
        }
        boolean z;
        attributeValue = attributeValue.toLowerCase(Locale.US);
        if (!attributeValue.equals("true")) {
            if (!attributeValue.equals("0")) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }

    public static boolean getBooleanAttribute(XmlPullParser xmlPullParser, String str, boolean z) {
        Boolean booleanAttribute = getBooleanAttribute(xmlPullParser, str);
        return booleanAttribute == null ? z : booleanAttribute.booleanValue();
    }

    public static Date getDateFromNextText(XmlPullParser xmlPullParser) {
        return a.b(xmlPullParser.nextText());
    }

    public static double getDoubleAttribute(XmlPullParser xmlPullParser, String str, long j) {
        Double doubleAttribute = getDoubleAttribute(xmlPullParser, str);
        return doubleAttribute == null ? (double) j : doubleAttribute.doubleValue();
    }

    public static Double getDoubleAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        return attributeValue == null ? null : Double.valueOf(attributeValue);
    }

    public static double getDoubleFromNextText(XmlPullParser xmlPullParser) {
        return Double.valueOf(xmlPullParser.nextText()).doubleValue();
    }

    public static g getEntityJidAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        if (attributeValue == null) {
            return null;
        }
        i a = d.a(attributeValue);
        if (!a.l()) {
            return null;
        }
        g p = a.p();
        return p != null ? p : a.n();
    }

    public static f getFullJidAttribute(XmlPullParser xmlPullParser) {
        return getFullJidAttribute(xmlPullParser, JID);
    }

    public static f getFullJidAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        return attributeValue == null ? null : d.d(attributeValue);
    }

    public static int getIntegerAttribute(XmlPullParser xmlPullParser, String str, int i) {
        Integer integerAttribute = getIntegerAttribute(xmlPullParser, str);
        return integerAttribute == null ? i : integerAttribute.intValue();
    }

    public static Integer getIntegerAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        return attributeValue == null ? null : Integer.valueOf(attributeValue);
    }

    public static int getIntegerAttributeOrThrow(XmlPullParser xmlPullParser, String str, String str2) {
        Integer integerAttribute = getIntegerAttribute(xmlPullParser, str);
        if (integerAttribute != null) {
            return integerAttribute.intValue();
        }
        throw new SmackException(str2);
    }

    public static int getIntegerFromNextText(XmlPullParser xmlPullParser) {
        return Integer.valueOf(xmlPullParser.nextText()).intValue();
    }

    public static i getJidAttribute(XmlPullParser xmlPullParser) {
        return getJidAttribute(xmlPullParser, JID);
    }

    public static i getJidAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        return attributeValue == null ? null : d.a(attributeValue);
    }

    public static long getLongAttribute(XmlPullParser xmlPullParser, String str, long j) {
        Long longAttribute = getLongAttribute(xmlPullParser, str);
        return longAttribute == null ? j : longAttribute.longValue();
    }

    public static Long getLongAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        return attributeValue == null ? null : Long.valueOf(attributeValue);
    }

    public static String getRequiredAttribute(XmlPullParser xmlPullParser, String str) {
        CharSequence attributeValue = xmlPullParser.getAttributeValue("", str);
        if (!StringUtils.isNullOrEmpty(attributeValue)) {
            return attributeValue;
        }
        StringBuilder stringBuilder = new StringBuilder("Attribute ");
        stringBuilder.append(str);
        stringBuilder.append(" is null or empty (");
        stringBuilder.append(attributeValue);
        stringBuilder.append(')');
        throw new IOException(stringBuilder.toString());
    }

    public static String getRequiredNextText(XmlPullParser xmlPullParser) {
        CharSequence nextText = xmlPullParser.nextText();
        if (!StringUtils.isNullOrEmpty(nextText)) {
            return nextText;
        }
        StringBuilder stringBuilder = new StringBuilder("Next text is null or empty (");
        stringBuilder.append(nextText);
        stringBuilder.append(')');
        throw new IOException(stringBuilder.toString());
    }

    public static org.b.a.b.d getResourcepartAttribute(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("", str);
        return attributeValue == null ? null : org.b.a.b.d.a(attributeValue);
    }

    public static URI getUriFromNextText(XmlPullParser xmlPullParser) {
        return new URI(xmlPullParser.nextText());
    }
}
