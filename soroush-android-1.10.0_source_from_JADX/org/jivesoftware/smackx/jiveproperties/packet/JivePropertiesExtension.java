package org.jivesoftware.smackx.jiveproperties.packet;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Logger;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.Message;

public class JivePropertiesExtension implements ExtensionElement {
    public static final String ELEMENT = "properties";
    private static final Logger LOGGER = Logger.getLogger(JivePropertiesExtension.class.getName());
    public static final String NAMESPACE = "http://www.jivesoftware.com/xmlns/xmpp/properties";
    private final Map<String, Object> properties;

    public JivePropertiesExtension() {
        this.properties = new HashMap();
    }

    public JivePropertiesExtension(Map<String, Object> map) {
        this.properties = map;
    }

    public static JivePropertiesExtension from(Message message) {
        return (JivePropertiesExtension) message.getExtension(ELEMENT, NAMESPACE);
    }

    public synchronized void deleteProperty(String str) {
        if (this.properties != null) {
            this.properties.remove(str);
        }
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public synchronized Map<String, Object> getProperties() {
        if (this.properties == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new HashMap(this.properties));
    }

    public synchronized Object getProperty(String str) {
        if (this.properties == null) {
            return null;
        }
        return this.properties.get(str);
    }

    public synchronized Collection<String> getPropertyNames() {
        if (this.properties == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.properties.keySet()));
    }

    public synchronized void setProperty(String str, Object obj) {
        if (obj instanceof Serializable) {
            this.properties.put(str, obj);
        } else {
            throw new IllegalArgumentException("Value must be serialiazble");
        }
    }

    public java.lang.CharSequence toXML() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r0 = new org.jivesoftware.smack.util.XmlStringBuilder;
        r0.<init>(r9);
        r0.rightAngleBracket();
        r1 = r9.getPropertyNames();
        r1 = r1.iterator();
    L_0x0010:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x010e;
    L_0x0016:
        r2 = r1.next();
        r2 = (java.lang.String) r2;
        r3 = r9.getProperty(r2);
        r4 = "property";
        r0.openElement(r4);
        r4 = "name";
        r0.element(r4, r2);
        r2 = "value";
        r0.halfOpenElement(r2);
        r2 = r3 instanceof java.lang.Integer;
        if (r2 == 0) goto L_0x0041;
    L_0x0033:
        r2 = "integer";
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r3 = java.lang.Integer.toString(r3);
        goto L_0x00eb;
    L_0x0041:
        r2 = r3 instanceof java.lang.Long;
        if (r2 == 0) goto L_0x0053;
    L_0x0045:
        r2 = "long";
        r3 = (java.lang.Long) r3;
        r3 = r3.longValue();
        r3 = java.lang.Long.toString(r3);
        goto L_0x00eb;
    L_0x0053:
        r2 = r3 instanceof java.lang.Float;
        if (r2 == 0) goto L_0x0065;
    L_0x0057:
        r2 = "float";
        r3 = (java.lang.Float) r3;
        r3 = r3.floatValue();
        r3 = java.lang.Float.toString(r3);
        goto L_0x00eb;
    L_0x0065:
        r2 = r3 instanceof java.lang.Double;
        if (r2 == 0) goto L_0x0077;
    L_0x0069:
        r2 = "double";
        r3 = (java.lang.Double) r3;
        r3 = r3.doubleValue();
        r3 = java.lang.Double.toString(r3);
        goto L_0x00eb;
    L_0x0077:
        r2 = r3 instanceof java.lang.Boolean;
        if (r2 == 0) goto L_0x0089;
    L_0x007b:
        r2 = "boolean";
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        r3 = java.lang.Boolean.toString(r3);
        goto L_0x00eb;
    L_0x0089:
        r2 = r3 instanceof java.lang.String;
        if (r2 == 0) goto L_0x0092;
    L_0x008d:
        r2 = "string";
        r3 = (java.lang.String) r3;
        goto L_0x00eb;
    L_0x0092:
        r2 = 0;
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ Exception -> 0x00bd, all -> 0x00b9 }
        r4.<init>();	 Catch:{ Exception -> 0x00bd, all -> 0x00b9 }
        r5 = new java.io.ObjectOutputStream;	 Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
        r5.<init>(r4);	 Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
        r5.writeObject(r3);	 Catch:{ Exception -> 0x00b1 }
        r2 = "java-object";	 Catch:{ Exception -> 0x00b1 }
        r3 = r4.toByteArray();	 Catch:{ Exception -> 0x00b1 }
        r3 = org.jivesoftware.smack.util.stringencoder.Base64.encodeToString(r3);	 Catch:{ Exception -> 0x00b1 }
        r5.close();	 Catch:{ Exception -> 0x00ad }
    L_0x00ad:
        r4.close();	 Catch:{ Exception -> 0x00eb }
        goto L_0x00eb;
    L_0x00b1:
        r2 = move-exception;
        goto L_0x00c1;
    L_0x00b3:
        r0 = move-exception;
        r5 = r2;
        goto L_0x0103;
    L_0x00b6:
        r3 = move-exception;
        r5 = r2;
        goto L_0x00c0;
    L_0x00b9:
        r0 = move-exception;
        r4 = r2;
        r5 = r4;
        goto L_0x0103;
    L_0x00bd:
        r3 = move-exception;
        r4 = r2;
        r5 = r4;
    L_0x00c0:
        r2 = r3;
    L_0x00c1:
        r3 = LOGGER;	 Catch:{ all -> 0x0102 }
        r6 = java.util.logging.Level.SEVERE;	 Catch:{ all -> 0x0102 }
        r7 = "Error encoding java object";	 Catch:{ all -> 0x0102 }
        r3.log(r6, r7, r2);	 Catch:{ all -> 0x0102 }
        r3 = "java-object";	 Catch:{ all -> 0x0102 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0102 }
        r7 = "Serializing error: ";	 Catch:{ all -> 0x0102 }
        r6.<init>(r7);	 Catch:{ all -> 0x0102 }
        r2 = r2.getMessage();	 Catch:{ all -> 0x0102 }
        r6.append(r2);	 Catch:{ all -> 0x0102 }
        r2 = r6.toString();	 Catch:{ all -> 0x0102 }
        if (r5 == 0) goto L_0x00e3;
    L_0x00e0:
        r5.close();	 Catch:{ Exception -> 0x00e3 }
    L_0x00e3:
        if (r4 == 0) goto L_0x00e8;
    L_0x00e5:
        r4.close();	 Catch:{ Exception -> 0x00e8 }
    L_0x00e8:
        r8 = r3;
        r3 = r2;
        r2 = r8;
    L_0x00eb:
        r4 = "type";
        r0.attribute(r4, r2);
        r0.rightAngleBracket();
        r0.escape(r3);
        r2 = "value";
        r0.closeElement(r2);
        r2 = "property";
        r0.closeElement(r2);
        goto L_0x0010;
    L_0x0102:
        r0 = move-exception;
    L_0x0103:
        if (r5 == 0) goto L_0x0108;
    L_0x0105:
        r5.close();	 Catch:{ Exception -> 0x0108 }
    L_0x0108:
        if (r4 == 0) goto L_0x010d;
    L_0x010a:
        r4.close();	 Catch:{ Exception -> 0x010d }
    L_0x010d:
        throw r0;
    L_0x010e:
        r0.closeElement(r9);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension.toXML():java.lang.CharSequence");
    }
}
